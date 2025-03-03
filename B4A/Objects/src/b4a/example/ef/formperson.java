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
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_datechanged(b4a.example.ef.formperson __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_datechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_datechanged", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub AS_DatePicker1_DateChanged(Year As Int, Month";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub AS_DatePicker1_SelectedDateChanged(Date As Lon";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Label12Hinicio.Text = formattedDate";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="FechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="Log(\"Fecha seleccionada: \" & FechaInicio)";
__c.LogImpl("52555916","Fecha seleccionada: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_datechanged(b4a.example.ef.formperson __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker2_datechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_datechanged", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub AS_DatePicker2_DateChanged(Year As Int, Month";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub AS_DatePicker2_SelectedDateChanged(Date As Lon";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Label13Hfim.Text = formattedDate";
__ref._label13hfim /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="FechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="Log(\"Fecha de fin\" & FechaFin )";
__c.LogImpl("52752521","Fecha de fin"+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Panel13.Visible = False";
__ref._panel13 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="Log(\"Fecha seleccionada: \" & formattedDate)";
__c.LogImpl("52752526","Fecha seleccionada: "+_formatteddate,0);
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="SearchTemplateNit.Initialize";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Dim ItemsNit As List";
_itemsnit = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="ItemsNit.Initialize";
_itemsnit.Initialize();
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="SearchTemplateHacienda.Initialize";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="SearchTemplateLote.Initialize";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="SearchTemplateLabor.Initialize";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="Dim ItemsLabor As List";
_itemslabor = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="ItemsLabor.Initialize";
_itemslabor.Initialize();
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="SearchTemplateConcepto.Initialize";
__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="Dim ItemsConcepto As List";
_itemsconcepto = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2424852;
 //BA.debugLineNum = 2424852;BA.debugLine="ItemsConcepto.Initialize";
_itemsconcepto.Initialize();
RDebugUtils.currentLine=2424854;
 //BA.debugLineNum = 2424854;BA.debugLine="SearchTemplateTurno.Initialize";
__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2424855;
 //BA.debugLineNum = 2424855;BA.debugLine="Dim ItemsTurno As List";
_itemsturno = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2424856;
 //BA.debugLineNum = 2424856;BA.debugLine="ItemsTurno.Initialize";
_itemsturno.Initialize();
RDebugUtils.currentLine=2424861;
 //BA.debugLineNum = 2424861;BA.debugLine="Label3Name.Text = B4XPages.GetPage(\"DetailsPerson";
__ref._label3name /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ));
RDebugUtils.currentLine=2424864;
 //BA.debugLineNum = 2424864;BA.debugLine="SD_xComboBoxNitPerson.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxnitperson /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=2424865;
 //BA.debugLineNum = 2424865;BA.debugLine="ItemsNit.Add(\"Seleccionar:\")";
_itemsnit.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=2424867;
 //BA.debugLineNum = 2424867;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=2424868;
 //BA.debugLineNum = 2424868;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=2424869;
 //BA.debugLineNum = 2424869;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=2424872;
 //BA.debugLineNum = 2424872;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 41;
return;
case 41:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=2424875;
 //BA.debugLineNum = 2424875;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=2424877;
 //BA.debugLineNum = 2424877;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=2424878;
 //BA.debugLineNum = 2424878;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 42;
return;
case 42:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=2424881;
 //BA.debugLineNum = 2424881;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=2424882;
 //BA.debugLineNum = 2424882;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=2424883;
 //BA.debugLineNum = 2424883;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=2424885;
 //BA.debugLineNum = 2424885;BA.debugLine="SD_xComboBoxNitPerson.Add(razonSocial & \" - \" &";
__ref._sd_xcomboboxnitperson /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_razonsocial+" - "+_nit,(Object)(_nit));
RDebugUtils.currentLine=2424886;
 //BA.debugLineNum = 2424886;BA.debugLine="ItemsNit.Add(nit&\":\"&razonSocial )";
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
RDebugUtils.currentLine=2424891;
 //BA.debugLineNum = 2424891;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("52424891","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=2424893;
 //BA.debugLineNum = 2424893;BA.debugLine="SearchTemplateNit.SetItems(ItemsNit)";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsnit);
RDebugUtils.currentLine=2424895;
 //BA.debugLineNum = 2424895;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=2424899;
 //BA.debugLineNum = 2424899;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=2424900;
 //BA.debugLineNum = 2424900;BA.debugLine="ItemsLabor.Add(\"Seleccionar:\")";
_itemslabor.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=2424901;
 //BA.debugLineNum = 2424901;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"select";
_cmdlabor = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=2424902;
 //BA.debugLineNum = 2424902;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 45;
return;
case 45:
//C
this.state = 11;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=2424903;
 //BA.debugLineNum = 2424903;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=2424904;
 //BA.debugLineNum = 2424904;BA.debugLine="Req.HandleJobAsync(j2, \"req_labor\")";
_req._handlejobasync /*void*/ (null,_j2,"req_labor");
RDebugUtils.currentLine=2424905;
 //BA.debugLineNum = 2424905;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DBRe";
parent.__c.WaitFor("req_labor_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 46;
return;
case 46:
//C
this.state = 14;
_reslabor = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=2424906;
 //BA.debugLineNum = 2424906;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
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
RDebugUtils.currentLine=2424907;
 //BA.debugLineNum = 2424907;BA.debugLine="Dim codigoDestino As String = rowLabor(0) ' Cdg";
_codigodestino = BA.ObjectToString(_rowlabor[(int) (0)]);
RDebugUtils.currentLine=2424908;
 //BA.debugLineNum = 2424908;BA.debugLine="Dim descripcionDestino As String = rowLabor(1)";
_descripciondestino = BA.ObjectToString(_rowlabor[(int) (1)]);
RDebugUtils.currentLine=2424909;
 //BA.debugLineNum = 2424909;BA.debugLine="SD_xComboBoxLabor.Add(descripcionDestino, codig";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripciondestino,(Object)(_codigodestino));
RDebugUtils.currentLine=2424910;
 //BA.debugLineNum = 2424910;BA.debugLine="ItemsLabor.Add(codigoDestino&\":\"&descripcionDes";
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
RDebugUtils.currentLine=2424913;
 //BA.debugLineNum = 2424913;BA.debugLine="Log(\"Error en la consulta de destinos: \" & j2.Er";
parent.__c.LogImpl("52424913","Error en la consulta de destinos: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=2424915;
 //BA.debugLineNum = 2424915;BA.debugLine="SearchTemplateLabor.SetItems(ItemsLabor)";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslabor);
RDebugUtils.currentLine=2424916;
 //BA.debugLineNum = 2424916;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=2424921;
 //BA.debugLineNum = 2424921;BA.debugLine="SD_xComboBoxConcepto.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxconcepto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=2424922;
 //BA.debugLineNum = 2424922;BA.debugLine="ItemsConcepto.Add(\"Seleccionar:\")";
_itemsconcepto.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=2424925;
 //BA.debugLineNum = 2424925;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
_cmdconcepto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_concepto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=2424928;
 //BA.debugLineNum = 2424928;BA.debugLine="ConceptoDataMap.Initialize";
__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=2424930;
 //BA.debugLineNum = 2424930;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdconcepto,(int) (0),parent.__c.Null)));
this.state = 49;
return;
case 49:
//C
this.state = 21;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=2424933;
 //BA.debugLineNum = 2424933;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=2424935;
 //BA.debugLineNum = 2424935;BA.debugLine="Req.HandleJobAsync(j3, \"req_concept\")";
_req._handlejobasync /*void*/ (null,_j3,"req_concept");
RDebugUtils.currentLine=2424936;
 //BA.debugLineNum = 2424936;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
parent.__c.WaitFor("req_concept_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 50;
return;
case 50:
//C
this.state = 24;
_resconc = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=2424939;
 //BA.debugLineNum = 2424939;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
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
RDebugUtils.currentLine=2424940;
 //BA.debugLineNum = 2424940;BA.debugLine="Dim Cod_Concept As String = rowConcep(0) ' Códi";
_cod_concept = BA.ObjectToString(_rowconcep[(int) (0)]);
RDebugUtils.currentLine=2424941;
 //BA.debugLineNum = 2424941;BA.debugLine="Dim Des_Concept As String = rowConcep(1) ' Desc";
_des_concept = BA.ObjectToString(_rowconcep[(int) (1)]);
RDebugUtils.currentLine=2424942;
 //BA.debugLineNum = 2424942;BA.debugLine="Dim dstjo_Cncpto As String = rowConcep(2)";
_dstjo_cncpto = BA.ObjectToString(_rowconcep[(int) (2)]);
RDebugUtils.currentLine=2424945;
 //BA.debugLineNum = 2424945;BA.debugLine="SD_xComboBoxConcepto.Add(Des_Concept, Cod_Conce";
__ref._sd_xcomboboxconcepto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_des_concept,(Object)(_cod_concept));
RDebugUtils.currentLine=2424946;
 //BA.debugLineNum = 2424946;BA.debugLine="ItemsConcepto.Add(Cod_Concept&\":\"&Des_Concept)";
_itemsconcepto.Add((Object)(_cod_concept+":"+_des_concept));
RDebugUtils.currentLine=2424948;
 //BA.debugLineNum = 2424948;BA.debugLine="ConceptoDataMap.Put(Cod_Concept, dstjo_Cncpto)";
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
RDebugUtils.currentLine=2424952;
 //BA.debugLineNum = 2424952;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j3.E";
parent.__c.LogImpl("52424952","Error en la consulta de conceptos: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=2424954;
 //BA.debugLineNum = 2424954;BA.debugLine="SearchTemplateConcepto.SetItems(ItemsConcepto)";
__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsconcepto);
RDebugUtils.currentLine=2424957;
 //BA.debugLineNum = 2424957;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=2424960;
 //BA.debugLineNum = 2424960;BA.debugLine="SD_xComboBoxTurno.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxturno /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=2424961;
 //BA.debugLineNum = 2424961;BA.debugLine="ItemsTurno.Add(\"Seleccionar:\")";
_itemsturno.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=2424963;
 //BA.debugLineNum = 2424963;BA.debugLine="Dim cmdTurno As DBCommand = CreateCommand(\"select";
_cmdturno = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_turnos",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=2424966;
 //BA.debugLineNum = 2424966;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTurno, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdturno,(int) (0),parent.__c.Null)));
this.state = 53;
return;
case 53:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=2424969;
 //BA.debugLineNum = 2424969;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=2424971;
 //BA.debugLineNum = 2424971;BA.debugLine="Req.HandleJobAsync(j4, \"req_turno\")";
_req._handlejobasync /*void*/ (null,_j4,"req_turno");
RDebugUtils.currentLine=2424972;
 //BA.debugLineNum = 2424972;BA.debugLine="Wait For (Req) req_turno_Result(resTurno As DBRe";
parent.__c.WaitFor("req_turno_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 54;
return;
case 54:
//C
this.state = 34;
_resturno = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=2424975;
 //BA.debugLineNum = 2424975;BA.debugLine="For Each rowTurno() As Object In resTurno.Rows";
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
RDebugUtils.currentLine=2424976;
 //BA.debugLineNum = 2424976;BA.debugLine="Dim Turno As String = rowConcep(0) ' Código del";
_turno = BA.ObjectToString(_rowconcep[(int) (0)]);
RDebugUtils.currentLine=2424977;
 //BA.debugLineNum = 2424977;BA.debugLine="Dim Des_Turno As String = rowConcep(1) ' Descri";
_des_turno = BA.ObjectToString(_rowconcep[(int) (1)]);
RDebugUtils.currentLine=2424979;
 //BA.debugLineNum = 2424979;BA.debugLine="SD_xComboBoxTurno.Add(Turno , Des_Turno)";
__ref._sd_xcomboboxturno /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_turno,(Object)(_des_turno));
RDebugUtils.currentLine=2424980;
 //BA.debugLineNum = 2424980;BA.debugLine="ItemsTurno.Add(Des_Turno&\":\"&Turno)";
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
RDebugUtils.currentLine=2424984;
 //BA.debugLineNum = 2424984;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j4.E";
parent.__c.LogImpl("52424984","Error en la consulta de conceptos: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = -1;
;
RDebugUtils.currentLine=2424986;
 //BA.debugLineNum = 2424986;BA.debugLine="SearchTemplateTurno.SetItems(ItemsTurno)";
__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsturno);
RDebugUtils.currentLine=2424988;
 //BA.debugLineNum = 2424988;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=2424990;
 //BA.debugLineNum = 2424990;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Root.LoadLayout(\"FomrPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FomrPerson",ba);
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="ScrollView1.Panel.Height=1100dip";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__c.DipToCurrent((int) (1100)));
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ScrollUIPerson\")";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().LoadLayout("ScrollUIPerson",ba);
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="EditText3cantidat.Color=Colors.Transparent'.";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="EditText1percentage.Color=Colors.Transparent'.";
__ref._edittext1percentage /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="EditText4obsv.Color=Colors.Transparent'.";
__ref._edittext4obsv /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="EditText2horas.Color=Colors.Transparent'.";
__ref._edittext2horas /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=2359313;
 //BA.debugLineNum = 2359313;BA.debugLine="For Each v As View In Root.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group11 = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group11.Get(index11)));
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="If v Is Spinner Then";
if (_v.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
RDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="Dim newsp As Spinner=v";
_newsp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_newsp = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_v.getObject()));
RDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="For i=1 To 16";
{
final int step14 = 1;
final int limit14 = (int) (16);
_i = (int) (1) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="newsp.AddAll(Array As String(v.Tag&\" \"&i))";
_newsp.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.ObjectToString(_v.getTag())+" "+BA.NumberToString(_i)}));
 }
};
 };
 }
};
RDebugUtils.currentLine=2359335;
 //BA.debugLineNum = 2359335;BA.debugLine="Base = Root";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=2359336;
 //BA.debugLineNum = 2359336;BA.debugLine="Dialog.Initialize (Base)";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=2359337;
 //BA.debugLineNum = 2359337;BA.debugLine="Dialog.Title = \"Buscador\"";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._title /*Object*/  = (Object)("Buscador");
RDebugUtils.currentLine=2359338;
 //BA.debugLineNum = 2359338;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="id = B4XPages.GetPage(\"DetailsPerson\").As(Details";
_id = ((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ;
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"\\#(.+)\",";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = parent.__c.Regex.Matcher("\\#(.+)",_id);
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="If matcher.Find() Then";
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
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="id = matcher.Group(1) ' Obtiene la parte después";
_id = _matcher.Group((int) (1));
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="Log(\"ID: \" & id) ' Aquí puedes usar id según tus";
parent.__c.LogImpl("55111819","ID: "+_id,0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=5111821;
 //BA.debugLineNum = 5111821;BA.debugLine="Log(\"No se encontró el carácter # en la cadena.\"";
parent.__c.LogImpl("55111821","No se encontró el carácter # en la cadena.",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=5111825;
 //BA.debugLineNum = 5111825;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_sear";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_searchPerson",new Object[]{(Object)(_id)});
RDebugUtils.currentLine=5111829;
 //BA.debugLineNum = 5111829;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=5111830;
 //BA.debugLineNum = 5111830;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=5111833;
 //BA.debugLineNum = 5111833;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 31;
return;
case 31:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=5111835;
 //BA.debugLineNum = 5111835;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=5111838;
 //BA.debugLineNum = 5111838;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=5111839;
 //BA.debugLineNum = 5111839;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_req));
this.state = 32;
return;
case 32:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=5111841;
 //BA.debugLineNum = 5111841;BA.debugLine="If res.Rows.Size > 0 Then";
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
RDebugUtils.currentLine=5111843;
 //BA.debugLineNum = 5111843;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=5111844;
 //BA.debugLineNum = 5111844;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=5111845;
 //BA.debugLineNum = 5111845;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Trab_Propios",new Object[]{(Object)(_id),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._laborcbx /*String*/ ),(Object)(0),(Object)(__ref._conceptocbx /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._horastext /*String*/ ),(Object)(__ref._cantidadtext /*String*/ ),(Object)(__ref._obsvtext /*String*/ ),(Object)(__ref._turnocbx /*String*/ ),(Object)(__ref._porcentagetext /*String*/ )});
RDebugUtils.currentLine=5111846;
 //BA.debugLineNum = 5111846;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=5111847;
 //BA.debugLineNum = 5111847;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_j));
this.state = 33;
return;
case 33:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=5111849;
 //BA.debugLineNum = 5111849;BA.debugLine="Try";
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
RDebugUtils.currentLine=5111850;
 //BA.debugLineNum = 5111850;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
RDebugUtils.currentLine=5111851;
 //BA.debugLineNum = 5111851;BA.debugLine="Log(\"Se han recuperado datos: propios \" & res.";
parent.__c.LogImpl("55111851","Se han recuperado datos: propios "+BA.NumberToString(_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=5111854;
 //BA.debugLineNum = 5111854;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("55111854","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=5111858;
 //BA.debugLineNum = 5111858;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=5111859;
 //BA.debugLineNum = 5111859;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=5111860;
 //BA.debugLineNum = 5111860;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Trab_Tmprles",new Object[]{(Object)(_id),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._laborcbx /*String*/ ),(Object)(0),(Object)(__ref._conceptocbx /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._horastext /*String*/ ),(Object)(__ref._cantidadtext /*String*/ ),(Object)(__ref._obsvtext /*String*/ ),(Object)(__ref._turnocbx /*String*/ ),(Object)(__ref._porcentagetext /*String*/ )});
RDebugUtils.currentLine=5111861;
 //BA.debugLineNum = 5111861;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=5111862;
 //BA.debugLineNum = 5111862;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_j));
this.state = 34;
return;
case 34:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=5111864;
 //BA.debugLineNum = 5111864;BA.debugLine="Try";
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
RDebugUtils.currentLine=5111865;
 //BA.debugLineNum = 5111865;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
RDebugUtils.currentLine=5111866;
 //BA.debugLineNum = 5111866;BA.debugLine="Log(\"No se encontraron datos para el ID: \" & i";
parent.__c.LogImpl("55111866","No se encontraron datos para el ID: "+_id,0);
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
RDebugUtils.currentLine=5111869;
 //BA.debugLineNum = 5111869;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("55111869","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=5111874;
 //BA.debugLineNum = 5111874;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.ErrorM";
parent.__c.LogImpl("55111874","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=5111876;
 //BA.debugLineNum = 5111876;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub can_OnCancelDate ()";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Private SelectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="Private DateDialog As DateDialog";
_datedialog = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="Private Spinner1 As Spinner";
_spinner1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=2162708;
 //BA.debugLineNum = 2162708;BA.debugLine="Private Spinner2 As Spinner";
_spinner2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=2162709;
 //BA.debugLineNum = 2162709;BA.debugLine="Private Spinner3 As Spinner";
_spinner3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=2162710;
 //BA.debugLineNum = 2162710;BA.debugLine="Private Spinner4 As Spinner";
_spinner4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=2162716;
 //BA.debugLineNum = 2162716;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2162717;
 //BA.debugLineNum = 2162717;BA.debugLine="Private Label13Hfim As Label";
_label13hfim = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2162718;
 //BA.debugLineNum = 2162718;BA.debugLine="Private Label12Hinicio As Label";
_label12hinicio = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2162719;
 //BA.debugLineNum = 2162719;BA.debugLine="Private EditText1percentage As EditText";
_edittext1percentage = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2162720;
 //BA.debugLineNum = 2162720;BA.debugLine="Private EditText2horas As EditText";
_edittext2horas = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2162721;
 //BA.debugLineNum = 2162721;BA.debugLine="Private EditText3cantidat As EditText";
_edittext3cantidat = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2162722;
 //BA.debugLineNum = 2162722;BA.debugLine="Private EditText4obsv As EditText";
_edittext4obsv = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2162723;
 //BA.debugLineNum = 2162723;BA.debugLine="Private Label3Name As Label";
_label3name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2162725;
 //BA.debugLineNum = 2162725;BA.debugLine="Private SD_xComboBoxNitPerson As SD_xComboBox";
_sd_xcomboboxnitperson = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=2162726;
 //BA.debugLineNum = 2162726;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=2162728;
 //BA.debugLineNum = 2162728;BA.debugLine="Dim FechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=2162729;
 //BA.debugLineNum = 2162729;BA.debugLine="Dim FechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=2162730;
 //BA.debugLineNum = 2162730;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=2162731;
 //BA.debugLineNum = 2162731;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=2162732;
 //BA.debugLineNum = 2162732;BA.debugLine="Dim LoteCBX As String";
_lotecbx = "";
RDebugUtils.currentLine=2162733;
 //BA.debugLineNum = 2162733;BA.debugLine="Dim LaborCBX As String";
_laborcbx = "";
RDebugUtils.currentLine=2162734;
 //BA.debugLineNum = 2162734;BA.debugLine="Dim ConceptoCBX As String";
_conceptocbx = "";
RDebugUtils.currentLine=2162735;
 //BA.debugLineNum = 2162735;BA.debugLine="Dim TurnoCBX As String";
_turnocbx = "";
RDebugUtils.currentLine=2162736;
 //BA.debugLineNum = 2162736;BA.debugLine="Dim HorasText As String";
_horastext = "";
RDebugUtils.currentLine=2162737;
 //BA.debugLineNum = 2162737;BA.debugLine="Dim PorcentageText As String";
_porcentagetext = "";
RDebugUtils.currentLine=2162738;
 //BA.debugLineNum = 2162738;BA.debugLine="Dim CantidadText As String";
_cantidadtext = "";
RDebugUtils.currentLine=2162739;
 //BA.debugLineNum = 2162739;BA.debugLine="Dim ObsvText As String";
_obsvtext = "";
RDebugUtils.currentLine=2162740;
 //BA.debugLineNum = 2162740;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=2162741;
 //BA.debugLineNum = 2162741;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=2162742;
 //BA.debugLineNum = 2162742;BA.debugLine="Private SD_xComboBoxConcepto As SD_xComboBox";
_sd_xcomboboxconcepto = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=2162743;
 //BA.debugLineNum = 2162743;BA.debugLine="Private SD_xComboBoxTurno As SD_xComboBox";
_sd_xcomboboxturno = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=2162744;
 //BA.debugLineNum = 2162744;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=2162745;
 //BA.debugLineNum = 2162745;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162746;
 //BA.debugLineNum = 2162746;BA.debugLine="Private AS_DatePicker2 As AS_DatePicker";
_as_datepicker2 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=2162747;
 //BA.debugLineNum = 2162747;BA.debugLine="Private Panel13 As Panel";
_panel13 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162748;
 //BA.debugLineNum = 2162748;BA.debugLine="Public idPerson As String";
_idperson = "";
RDebugUtils.currentLine=2162749;
 //BA.debugLineNum = 2162749;BA.debugLine="Dim ConceptoDataMap As Map";
_conceptodatamap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2162752;
 //BA.debugLineNum = 2162752;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=2162753;
 //BA.debugLineNum = 2162753;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2162754;
 //BA.debugLineNum = 2162754;BA.debugLine="Private SwiftButtonNit As SwiftButton";
_swiftbuttonnit = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=2162755;
 //BA.debugLineNum = 2162755;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
_searchtemplatenit = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=2162756;
 //BA.debugLineNum = 2162756;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
_swiftbuttonhacienda = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=2162757;
 //BA.debugLineNum = 2162757;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
_searchtemplatehacienda = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=2162758;
 //BA.debugLineNum = 2162758;BA.debugLine="Private SwiftButtonLote As SwiftButton";
_swiftbuttonlote = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=2162759;
 //BA.debugLineNum = 2162759;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
_searchtemplatelote = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=2162760;
 //BA.debugLineNum = 2162760;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
_swiftbuttonlabor = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=2162761;
 //BA.debugLineNum = 2162761;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
_searchtemplatelabor = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=2162762;
 //BA.debugLineNum = 2162762;BA.debugLine="Private SwiftButtonConcepto As SwiftButton";
_swiftbuttonconcepto = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=2162763;
 //BA.debugLineNum = 2162763;BA.debugLine="Private SearchTemplateConcepto As B4XSearchTempla";
_searchtemplateconcepto = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=2162764;
 //BA.debugLineNum = 2162764;BA.debugLine="Private SwiftButtonTurno As SwiftButton";
_swiftbuttonturno = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=2162765;
 //BA.debugLineNum = 2162765;BA.debugLine="Private SearchTemplateTurno As B4XSearchTemplate";
_searchtemplateturno = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=2162769;
 //BA.debugLineNum = 2162769;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.dbrequestmanager  _createrequest(b4a.example.ef.formperson __ref,String _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((b4a.example.ef.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_db}));}
b4a.example.ef.dbrequestmanager _req = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
_req._initialize /*String*/ (null,ba,this,__ref._rdclink /*String*/ +"?DBName="+_db);
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Return Req";
if (true) return _req;
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(b4a.example.ef.formperson __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "date_ondateset", false))
	 {return ((String) Debug.delegate(ba, "date_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Label10.TextColor=Colors.Black";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(b4a.example.ef.formperson __ref,String _nombre) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "deleterecord", false))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_nombre}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub DeleteRecord (Nombre As String)";
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="End Sub";
return "";
}
public String  _edittext1percentage_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext1percentage_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext1percentage_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub EditText1percentage_TextChanged (Old A";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Log(PorcentageText)";
__c.LogImpl("54915201",__ref._porcentagetext /*String*/ ,0);
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return "";
}
public String  _edittext2horas_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext2horas_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext2horas_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub EditText2horas_TextChanged (Old As Str";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="HorasText = New";
__ref._horastext /*String*/  = _new;
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Log(HorasText)";
__c.LogImpl("54849668",__ref._horastext /*String*/ ,0);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="End Sub";
return "";
}
public String  _edittext3cantidat_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext3cantidat_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext3cantidat_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub EditText3cantidat_TextChanged (Old As";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="CantidadText = New";
__ref._cantidadtext /*String*/  = _new;
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Log(CantidadText)";
__c.LogImpl("54980739",__ref._cantidadtext /*String*/ ,0);
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="End Sub";
return "";
}
public String  _edittext4obsv_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext4obsv_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext4obsv_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub EditText4obsv_TextChanged (Old As Stri";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="ObsvText =New";
__ref._obsvtext /*String*/  = _new;
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Log(ObsvText)";
__c.LogImpl("55046275",__ref._obsvtext /*String*/ ,0);
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_clie";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_clientes",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordclientes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordclientes"), (Object)(_req));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="req.PrintTable(res)";
_req._printtable /*String*/ (null,_res);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("53735562","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordhaciendas"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordhaciendas"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=3670033;
 //BA.debugLineNum = 3670033;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=3670034;
 //BA.debugLineNum = 3670034;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=3670037;
 //BA.debugLineNum = 3670037;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=3670039;
 //BA.debugLineNum = 3670039;BA.debugLine="Spinner2.Add(cadena)";
__ref._spinner2 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
RDebugUtils.currentLine=3670040;
 //BA.debugLineNum = 3670040;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=3670044;
 //BA.debugLineNum = 3670044;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("53670044","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=3670046;
 //BA.debugLineNum = 3670046;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=3670047;
 //BA.debugLineNum = 3670047;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlabores"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlabores"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=4063253;
 //BA.debugLineNum = 4063253;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=4063254;
 //BA.debugLineNum = 4063254;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=4063255;
 //BA.debugLineNum = 4063255;BA.debugLine="Spinner4.Add(cadena)";
__ref._spinner4 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=4063260;
 //BA.debugLineNum = 4063260;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("54063260","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=4063262;
 //BA.debugLineNum = 4063262;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=4063263;
 //BA.debugLineNum = 4063263;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(_nit),(Object)(_hda)});
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlotes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlotes"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=3997710;
 //BA.debugLineNum = 3997710;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=3997711;
 //BA.debugLineNum = 3997711;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=3997712;
 //BA.debugLineNum = 3997712;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=3997713;
 //BA.debugLineNum = 3997713;BA.debugLine="Spinner3.Add(cadena)";
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
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("53997720","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=3997722;
 //BA.debugLineNum = 3997722;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=3997723;
 //BA.debugLineNum = 3997723;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Globals";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Private Panel10Horainicio As Panel ' Tu input o p";
_panel10horainicio = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Private LabelFecha As Label ' Un label para mostr";
_labelfecha = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public String  _hinicio_ondateset(b4a.example.ef.formperson __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "hinicio_ondateset", false))
	 {return ((String) Debug.delegate(ba, "hinicio_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub Hinicio_OnDateSet(year As Int ,monthOfYear As";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Label12Hinicio.Text=year&\"/\"&(NumberFormat(monthO";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Label12Hinicio.TextColor=Colors.Black";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return "";
}
public String  _insertrecord(b4a.example.ef.formperson __ref,String _nombre,int _salario) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "insertrecord", false))
	 {return ((String) Debug.delegate(ba, "insertrecord", new Object[] {_nombre,_salario}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub InsertRecord (Nombre As String, Salario As Int";
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="End Sub";
return "";
}
public String  _label10_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label10_click", false))
	 {return ((String) Debug.delegate(ba, "label10_click", null));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub Label10_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Panel9_Click";
__ref._panel9_click /*String*/ (null);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel9_click", false))
	 {return ((String) Debug.delegate(ba, "panel9_click", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub Panel9_Click";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Datepicker.Initialize(\"Date\",2022 ,DateTime.GetMo";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,"Date",(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="End Sub";
return "";
}
public String  _label12hinicio_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label12hinicio_click", false))
	 {return ((String) Debug.delegate(ba, "label12hinicio_click", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub Label12Hinicio_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Panel12.Visible= True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public String  _label13hfim_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label13hfim_click", false))
	 {return ((String) Debug.delegate(ba, "label13hfim_click", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub Label13Hfim_Click";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Panel13.Visible= True";
__ref._panel13 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label2save_click", false))
	 {return ((String) Debug.delegate(ba, "label2save_click", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub Label2Save_Click";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="MsgboxAsync(\"Saved.\", \"\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Saved."),BA.ObjectToCharSequence(""),ba);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel10horainicio_click", false))
	 {return ((String) Debug.delegate(ba, "panel10horainicio_click", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub Panel10Horainicio_Click";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel11horafim_click", false))
	 {return ((String) Debug.delegate(ba, "panel11horafim_click", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub Panel11horaFim_Click";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel2time_click", false))
	 {return ((String) Debug.delegate(ba, "panel2time_click", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub Panel2Time_Click";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxconcepto_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxconcepto_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxconcepto_itemclick", new Object[] {_position,_value}));}
String _dstjo_cncpto = "";
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub SD_xComboBoxConcepto_ItemClick (Positi";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="ConceptoCBX = Value";
__ref._conceptocbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="ConceptoCBX = Null";
__ref._conceptocbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="ConceptoCBX = Value";
__ref._conceptocbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Dim dstjo_Cncpto As String = ConceptoDataMap.Get(";
_dstjo_cncpto = BA.ObjectToString(__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_value));
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Log(\"Valor seleccionado: \" & ConceptoCBX)";
__c.LogImpl("54784139","Valor seleccionado: "+__ref._conceptocbx /*String*/ ,0);
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="Log(\"Dato dstjo_Cncpto: \" & dstjo_Cncpto)";
__c.LogImpl("54784140","Dato dstjo_Cncpto: "+_dstjo_cncpto,0);
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="If dstjo_Cncpto = \"N\" Then ' Ajusta la condición";
if ((_dstjo_cncpto).equals("N")) { 
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="EditText3cantidat.Enabled = False";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="EditText3cantidat.Enabled = True";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=4784150;
 //BA.debugLineNum = 4784150;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="If Value = \"\" Then";
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
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="haciendaCBX = Null";
__ref._haciendacbx /*String*/  = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="haciendaCBX = Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("54587526",__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=4587535;
 //BA.debugLineNum = 4587535;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=4587538;
 //BA.debugLineNum = 4587538;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=4587540;
 //BA.debugLineNum = 4587540;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=4587541;
 //BA.debugLineNum = 4587541;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=4587545;
 //BA.debugLineNum = 4587545;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=4587546;
 //BA.debugLineNum = 4587546;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=4587549;
 //BA.debugLineNum = 4587549;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
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
RDebugUtils.currentLine=4587554;
 //BA.debugLineNum = 4587554;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("54587554","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=4587558;
 //BA.debugLineNum = 4587558;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=4587560;
 //BA.debugLineNum = 4587560;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="LaborCBX = Value";
__ref._laborcbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="LaborCBX = Null";
__ref._laborcbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="LaborCBX = Value";
__ref._laborcbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="Log(LaborCBX)";
__c.LogImpl("54718600",__ref._laborcbx /*String*/ ,0);
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="LoteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="LoteCBX = Null";
__ref._lotecbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="LoteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Log(LoteCBX)";
__c.LogImpl("54653065",__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="SD_xComboBoxHacienda.Clear";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="If Value = \"\" Then";
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
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="nitEmpresaCBX = Null";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="nitEmpresaCBX = Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="Log(\"Valor seleccionado: \" & nitEmpresaCBX)";
parent.__c.LogImpl("54521994","Valor seleccionado: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="Log(\"Posicion: \"&Position&\" VALUE: \"&Value)";
parent.__c.LogImpl("54521996","Posicion: "+BA.NumberToString(_position)+" VALUE: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="SD_xComboBoxHacienda.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=4522014;
 //BA.debugLineNum = 4522014;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=4522015;
 //BA.debugLineNum = 4522015;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=4522016;
 //BA.debugLineNum = 4522016;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=4522019;
 //BA.debugLineNum = 4522019;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
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
RDebugUtils.currentLine=4522024;
 //BA.debugLineNum = 4522024;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("54522024","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=4522027;
 //BA.debugLineNum = 4522027;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("54522027",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=4522029;
 //BA.debugLineNum = 4522029;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=4522031;
 //BA.debugLineNum = 4522031;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub SD_xComboBoxTurno_ItemClick (Position";
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="If Value = Null Or Value = \"\" Then";
if (_value== null || (_value).equals((Object)(""))) { 
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="TurnoCBX = Null ' Si el valor está vacío, asigna";
__ref._turnocbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="TurnoCBX = Value ' Si no está vacío, asignar el";
__ref._turnocbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="End Sub";
return "";
}
public String  _spinner1_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
public String  _spinner10_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner10_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner10_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub Spinner10_ItemClick (Position As Int,";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return "";
}
public String  _spinner2_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner2_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner2_itemclick", new Object[] {_position,_value}));}
String _nit = "";
String _hacienda = "";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim nit As String";
_nit = "";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim hacienda As String";
_hacienda = "";
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Spinner3.Clear";
__ref._spinner3 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("53932166",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="nit= \"890307964\"";
_nit = "890307964";
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="hacienda = Value";
_hacienda = BA.ObjectToString(_value);
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
_hacienda = _hacienda.substring((int) (0),(int) (3));
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="GetRecordLotes (\"BDPichucho\",nit, hacienda)";
__ref._getrecordlotes /*void*/ (null,"BDPichucho",_nit,_hacienda);
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="End Sub";
return "";
}
public String  _spinner3_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner3_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner3_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub Spinner3_ItemClick (Position As Int, V";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return "";
}
public String  _spinner4_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner4_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner4_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub Spinner4_ItemClick (Position As Int, V";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner7_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner7_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner8_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner8_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
return "";
}
public String  _swiftbutton1prueba_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "swiftbutton1prueba_click", false))
	 {return ((String) Debug.delegate(ba, "swiftbutton1prueba_click", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub SwiftButton1Prueba_Click";
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateConce";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonconcepto_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="SwiftButtonConcepto.xLBL.Text = SearchTemplateCo";
__ref._swiftbuttonconcepto /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="Dim CONCEPTOCOMPLETO As String = SearchTemplateC";
_conceptocompleto = __ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", CONCEP";
_partes = parent.__c.Regex.Split(":",_conceptocompleto);
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="ConceptoCBX = Partes(0)";
__ref._conceptocbx /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim ItemsLote As List";
_itemslote = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="ItemsLote.Initialize";
_itemslote.Initialize();
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonhacienda_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
_haciendacompleto = __ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
_partes = parent.__c.Regex.Split(":",_haciendacompleto);
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="haciendaCBX = Partes(0)";
__ref._haciendacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="ItemsLote.Clear";
_itemslote.Clear();
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
_itemslote.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5373967;
 //BA.debugLineNum = 5373967;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=5373972;
 //BA.debugLineNum = 5373972;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonhacienda_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=5373975;
 //BA.debugLineNum = 5373975;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=5373977;
 //BA.debugLineNum = 5373977;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=5373978;
 //BA.debugLineNum = 5373978;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonhacienda_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=5373982;
 //BA.debugLineNum = 5373982;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=5373983;
 //BA.debugLineNum = 5373983;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=5373986;
 //BA.debugLineNum = 5373986;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacie";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_codg_hacienda,(Object)(_codg_hacienda));
RDebugUtils.currentLine=5373987;
 //BA.debugLineNum = 5373987;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
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
RDebugUtils.currentLine=5373992;
 //BA.debugLineNum = 5373992;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("55373992","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=5373994;
 //BA.debugLineNum = 5373994;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslote);
RDebugUtils.currentLine=5373995;
 //BA.debugLineNum = 5373995;BA.debugLine="SwiftButtonLote.Enabled = True";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=5373997;
 //BA.debugLineNum = 5373997;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=5374000;
 //BA.debugLineNum = 5374000;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonlabor_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
__ref._swiftbuttonlabor /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="Dim LABORCOMPLETO As String = SearchTemplateLabo";
_laborcompleto = __ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", LABORC";
_partes = parent.__c.Regex.Split(":",_laborcompleto);
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="LaborCBX = Partes(0)";
__ref._laborcbx /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonlote_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.Se";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="LoteCBX = SearchTemplateNit.SelectedItem";
__ref._lotecbx /*String*/  = __ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Dim ItemsHacienda As List";
_itemshacienda = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="ItemsHacienda.Initialize";
_itemshacienda.Initialize();
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonnit_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
__ref._swiftbuttonnit /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
_nitcompleto = __ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
_partes = parent.__c.Regex.Split(":",_nitcompleto);
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="nitEmpresaCBX = Partes(0)";
__ref._nitempresacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="ItemsHacienda.Clear";
_itemshacienda.Clear();
RDebugUtils.currentLine=5308429;
 //BA.debugLineNum = 5308429;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
_itemshacienda.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=5308430;
 //BA.debugLineNum = 5308430;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5308433;
 //BA.debugLineNum = 5308433;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=5308434;
 //BA.debugLineNum = 5308434;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=5308435;
 //BA.debugLineNum = 5308435;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)(__ref._nitempresacbx /*String*/ )});
RDebugUtils.currentLine=5308438;
 //BA.debugLineNum = 5308438;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonnit_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=5308441;
 //BA.debugLineNum = 5308441;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=5308443;
 //BA.debugLineNum = 5308443;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=5308444;
 //BA.debugLineNum = 5308444;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonnit_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=5308448;
 //BA.debugLineNum = 5308448;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=5308449;
 //BA.debugLineNum = 5308449;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=5308450;
 //BA.debugLineNum = 5308450;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=5308453;
 //BA.debugLineNum = 5308453;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombrehacienda,(Object)(_codg_hacienda));
RDebugUtils.currentLine=5308455;
 //BA.debugLineNum = 5308455;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
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
RDebugUtils.currentLine=5308460;
 //BA.debugLineNum = 5308460;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("55308460","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=5308462;
 //BA.debugLineNum = 5308462;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemshacienda);
RDebugUtils.currentLine=5308463;
 //BA.debugLineNum = 5308463;BA.debugLine="SwiftButtonHacienda.Enabled = True";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=5308464;
 //BA.debugLineNum = 5308464;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("55308464",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=5308466;
 //BA.debugLineNum = 5308466;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=5308472;
 //BA.debugLineNum = 5308472;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTurno";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonturno_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="SwiftButtonTurno.xLBL.Text = SearchTemplateTurno";
__ref._swiftbuttonturno /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}