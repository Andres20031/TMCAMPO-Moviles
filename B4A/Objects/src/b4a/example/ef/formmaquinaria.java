package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formmaquinaria extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formmaquinaria");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public Object  _initialize(b4a.example.ef.formmaquinaria __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formmaquinaria __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=15400971;
 //BA.debugLineNum = 15400971;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=15400974;
 //BA.debugLineNum = 15400974;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=15400977;
 //BA.debugLineNum = 15400977;BA.debugLine="fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=15400981;
 //BA.debugLineNum = 15400981;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
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
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=15073289;
 //BA.debugLineNum = 15073289;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="SearchTemplateMaquina.Initialize";
__ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073294;
 //BA.debugLineNum = 15073294;BA.debugLine="Dim itemsMaquina As List";
_itemsmaquina = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="itemsMaquina.Initialize";
_itemsmaquina.Initialize();
RDebugUtils.currentLine=15073296;
 //BA.debugLineNum = 15073296;BA.debugLine="itemsMaquina.Add(\"Seleccionar:\")";
_itemsmaquina.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="Dim cmdMaquina As DBCommand = CreateCommand(\"sele";
_cmdmaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maquina",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="Wait For (Req.ExecuteQuery(cmdMaquina, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdmaquina,(int) (0),parent.__c.Null)));
this.state = 61;
return;
case 61:
//C
this.state = 1;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=15073301;
 //BA.debugLineNum = 15073301;BA.debugLine="Req.HandleJobAsync(j2, \"req_maquina\")";
_req._handlejobasync /*void*/ (null,_j2,"req_maquina");
RDebugUtils.currentLine=15073302;
 //BA.debugLineNum = 15073302;BA.debugLine="Wait For (Req) req_maquina_Result(resMaquina As";
parent.__c.WaitFor("req_maquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 62;
return;
case 62:
//C
this.state = 4;
_resmaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15073303;
 //BA.debugLineNum = 15073303;BA.debugLine="For Each rowMaquina() As Object In resMaquina.Ro";
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
RDebugUtils.currentLine=15073304;
 //BA.debugLineNum = 15073304;BA.debugLine="Dim codigoMaquina As String = rowMaquina(0) ' C";
_codigomaquina = BA.ObjectToString(_rowmaquina[(int) (0)]);
RDebugUtils.currentLine=15073305;
 //BA.debugLineNum = 15073305;BA.debugLine="Dim descripcionMaquina As String = rowMaquina(1";
_descripcionmaquina = BA.ObjectToString(_rowmaquina[(int) (1)]);
RDebugUtils.currentLine=15073306;
 //BA.debugLineNum = 15073306;BA.debugLine="SD_xComboBoxMaquina.Add(descripcionMaquina, cod";
__ref._sd_xcomboboxmaquina /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionmaquina,(Object)(_codigomaquina));
RDebugUtils.currentLine=15073307;
 //BA.debugLineNum = 15073307;BA.debugLine="itemsMaquina.Add(codigoMaquina&\":\"&descripcionM";
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
RDebugUtils.currentLine=15073310;
 //BA.debugLineNum = 15073310;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
parent.__c.LogImpl("515073310","Error en la consulta de Maquina: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=15073312;
 //BA.debugLineNum = 15073312;BA.debugLine="SearchTemplateMaquina.SetItems(itemsMaquina)";
__ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsmaquina);
RDebugUtils.currentLine=15073313;
 //BA.debugLineNum = 15073313;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=15073319;
 //BA.debugLineNum = 15073319;BA.debugLine="SearchTemplateLabor.Initialize";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073321;
 //BA.debugLineNum = 15073321;BA.debugLine="Dim itemsLaborMaquina As List";
_itemslabormaquina = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15073322;
 //BA.debugLineNum = 15073322;BA.debugLine="itemsLaborMaquina.Initialize";
_itemslabormaquina.Initialize();
RDebugUtils.currentLine=15073323;
 //BA.debugLineNum = 15073323;BA.debugLine="itemsLaborMaquina.Add(\"Seleccionar:\")";
_itemslabormaquina.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=15073325;
 //BA.debugLineNum = 15073325;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor_maq",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15073326;
 //BA.debugLineNum = 15073326;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 65;
return;
case 65:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15073327;
 //BA.debugLineNum = 15073327;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=15073328;
 //BA.debugLineNum = 15073328;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (null,_j3,"req_labormaquina");
RDebugUtils.currentLine=15073329;
 //BA.debugLineNum = 15073329;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 66;
return;
case 66:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15073330;
 //BA.debugLineNum = 15073330;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
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
RDebugUtils.currentLine=15073331;
 //BA.debugLineNum = 15073331;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
RDebugUtils.currentLine=15073332;
 //BA.debugLineNum = 15073332;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
RDebugUtils.currentLine=15073333;
 //BA.debugLineNum = 15073333;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina,";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionlabormaquina,(Object)(_codigolabormaquina));
RDebugUtils.currentLine=15073334;
 //BA.debugLineNum = 15073334;BA.debugLine="itemsLaborMaquina.Add(codigoLaborMaquina&\":\"&de";
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
RDebugUtils.currentLine=15073337;
 //BA.debugLineNum = 15073337;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("515073337","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=15073339;
 //BA.debugLineNum = 15073339;BA.debugLine="SearchTemplateLabor.SetItems(itemsLaborMaquina)";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslabormaquina);
RDebugUtils.currentLine=15073340;
 //BA.debugLineNum = 15073340;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=15073344;
 //BA.debugLineNum = 15073344;BA.debugLine="SearchTemplateNit.Initialize";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073346;
 //BA.debugLineNum = 15073346;BA.debugLine="Dim itemsNit As List";
_itemsnit = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15073347;
 //BA.debugLineNum = 15073347;BA.debugLine="itemsNit.Initialize";
_itemsnit.Initialize();
RDebugUtils.currentLine=15073348;
 //BA.debugLineNum = 15073348;BA.debugLine="itemsNit.Add(\"Seleccionar:\")";
_itemsnit.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=15073350;
 //BA.debugLineNum = 15073350;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15073351;
 //BA.debugLineNum = 15073351;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 69;
return;
case 69:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15073352;
 //BA.debugLineNum = 15073352;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=15073353;
 //BA.debugLineNum = 15073353;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=15073354;
 //BA.debugLineNum = 15073354;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 70;
return;
case 70:
//C
this.state = 24;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15073355;
 //BA.debugLineNum = 15073355;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=15073356;
 //BA.debugLineNum = 15073356;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=15073357;
 //BA.debugLineNum = 15073357;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=15073358;
 //BA.debugLineNum = 15073358;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_razonsocial+" - "+_nit,(Object)(_nit));
RDebugUtils.currentLine=15073359;
 //BA.debugLineNum = 15073359;BA.debugLine="itemsNit.Add(nit&\":\"&razonSocial)";
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
RDebugUtils.currentLine=15073362;
 //BA.debugLineNum = 15073362;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("515073362","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=15073364;
 //BA.debugLineNum = 15073364;BA.debugLine="SearchTemplateNit.SetItems(itemsNit)";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsnit);
RDebugUtils.currentLine=15073365;
 //BA.debugLineNum = 15073365;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=15073369;
 //BA.debugLineNum = 15073369;BA.debugLine="SearchTemplateImplemento.Initialize";
__ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073370;
 //BA.debugLineNum = 15073370;BA.debugLine="SearchTemplateImplemento2.Initialize";
__ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073372;
 //BA.debugLineNum = 15073372;BA.debugLine="Dim itemsImplemento As List";
_itemsimplemento = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15073373;
 //BA.debugLineNum = 15073373;BA.debugLine="itemsImplemento.Initialize";
_itemsimplemento.Initialize();
RDebugUtils.currentLine=15073374;
 //BA.debugLineNum = 15073374;BA.debugLine="itemsImplemento.Add(\"Seleccionar:\")";
_itemsimplemento.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=15073376;
 //BA.debugLineNum = 15073376;BA.debugLine="Dim cmdImple As DBCommand = CreateCommand(\"select";
_cmdimple = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_implemento",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15073377;
 //BA.debugLineNum = 15073377;BA.debugLine="Wait For (Req.ExecuteQuery(cmdImple, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdimple,(int) (0),parent.__c.Null)));
this.state = 73;
return;
case 73:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15073378;
 //BA.debugLineNum = 15073378;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=15073379;
 //BA.debugLineNum = 15073379;BA.debugLine="Req.HandleJobAsync(j4, \"req_imple\")";
_req._handlejobasync /*void*/ (null,_j4,"req_imple");
RDebugUtils.currentLine=15073380;
 //BA.debugLineNum = 15073380;BA.debugLine="Wait For (Req) req_imple_Result(resImple As DBRe";
parent.__c.WaitFor("req_imple_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 74;
return;
case 74:
//C
this.state = 34;
_resimple = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15073381;
 //BA.debugLineNum = 15073381;BA.debugLine="For Each rowImple() As Object In resImple.Rows";
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
RDebugUtils.currentLine=15073382;
 //BA.debugLineNum = 15073382;BA.debugLine="Dim codigoImple As String = rowImple(0) ' Cdgo_";
_codigoimple = BA.ObjectToString(_rowimple[(int) (0)]);
RDebugUtils.currentLine=15073383;
 //BA.debugLineNum = 15073383;BA.debugLine="Dim descripcionImple As String = rowImple(1) '";
_descripcionimple = BA.ObjectToString(_rowimple[(int) (1)]);
RDebugUtils.currentLine=15073384;
 //BA.debugLineNum = 15073384;BA.debugLine="SD_xComboBoxImplemento.Add(descripcionImple, co";
__ref._sd_xcomboboximplemento /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionimple,(Object)(_codigoimple));
RDebugUtils.currentLine=15073385;
 //BA.debugLineNum = 15073385;BA.debugLine="SD_xComboBoxImplemento2.Add(descripcionImple, c";
__ref._sd_xcomboboximplemento2 /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionimple,(Object)(_codigoimple));
RDebugUtils.currentLine=15073386;
 //BA.debugLineNum = 15073386;BA.debugLine="itemsImplemento.Add(codigoImple&\":\"&descripcion";
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
RDebugUtils.currentLine=15073389;
 //BA.debugLineNum = 15073389;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("515073389","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=15073391;
 //BA.debugLineNum = 15073391;BA.debugLine="SearchTemplateImplemento.SetItems(itemsImplemento";
__ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsimplemento);
RDebugUtils.currentLine=15073392;
 //BA.debugLineNum = 15073392;BA.debugLine="SearchTemplateImplemento2.SetItems(itemsImplement";
__ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsimplemento);
RDebugUtils.currentLine=15073393;
 //BA.debugLineNum = 15073393;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=15073397;
 //BA.debugLineNum = 15073397;BA.debugLine="SearchTemplateOperario.Initialize";
__ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073399;
 //BA.debugLineNum = 15073399;BA.debugLine="Dim itemsOperario As List";
_itemsoperario = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15073400;
 //BA.debugLineNum = 15073400;BA.debugLine="itemsOperario.Initialize";
_itemsoperario.Initialize();
RDebugUtils.currentLine=15073401;
 //BA.debugLineNum = 15073401;BA.debugLine="itemsOperario.Add(\"Seleccionar:\")";
_itemsoperario.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=15073403;
 //BA.debugLineNum = 15073403;BA.debugLine="Dim cmdOper As DBCommand = CreateCommand(\"select_";
_cmdoper = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_operario",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15073404;
 //BA.debugLineNum = 15073404;BA.debugLine="Wait For (Req.ExecuteQuery(cmdOper, 0, Null)) Job";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdoper,(int) (0),parent.__c.Null)));
this.state = 77;
return;
case 77:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15073405;
 //BA.debugLineNum = 15073405;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=15073406;
 //BA.debugLineNum = 15073406;BA.debugLine="Req.HandleJobAsync(j5, \"req_oper\")";
_req._handlejobasync /*void*/ (null,_j5,"req_oper");
RDebugUtils.currentLine=15073407;
 //BA.debugLineNum = 15073407;BA.debugLine="Wait For (Req) req_oper_Result(resOper As DBResu";
parent.__c.WaitFor("req_oper_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 78;
return;
case 78:
//C
this.state = 44;
_resoper = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15073408;
 //BA.debugLineNum = 15073408;BA.debugLine="For Each rowOper() As Object In resOper.Rows";
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
RDebugUtils.currentLine=15073409;
 //BA.debugLineNum = 15073409;BA.debugLine="Dim codigoOper As String = rowOper(0)";
_codigooper = BA.ObjectToString(_rowoper[(int) (0)]);
RDebugUtils.currentLine=15073410;
 //BA.debugLineNum = 15073410;BA.debugLine="Dim apellido1 As String = rowOper(1)";
_apellido1 = BA.ObjectToString(_rowoper[(int) (1)]);
RDebugUtils.currentLine=15073411;
 //BA.debugLineNum = 15073411;BA.debugLine="Dim apellido2 As String = rowOper(2)";
_apellido2 = BA.ObjectToString(_rowoper[(int) (2)]);
RDebugUtils.currentLine=15073412;
 //BA.debugLineNum = 15073412;BA.debugLine="Dim nombre As String = rowOper(3)";
_nombre = BA.ObjectToString(_rowoper[(int) (3)]);
RDebugUtils.currentLine=15073413;
 //BA.debugLineNum = 15073413;BA.debugLine="SD_xComboBoxOperario.Add(apellido1&\" \"&apellido";
__ref._sd_xcomboboxoperario /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_apellido1+" "+_apellido2+" "+_nombre,(Object)(_codigooper));
RDebugUtils.currentLine=15073414;
 //BA.debugLineNum = 15073414;BA.debugLine="itemsOperario.Add(codigoOper&\":\"&apellido1&\" \"&";
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
RDebugUtils.currentLine=15073417;
 //BA.debugLineNum = 15073417;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j5.Err";
parent.__c.LogImpl("515073417","Error en la consulta de Maquina: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=15073419;
 //BA.debugLineNum = 15073419;BA.debugLine="SearchTemplateOperario.SetItems(itemsOperario)";
__ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsoperario);
RDebugUtils.currentLine=15073420;
 //BA.debugLineNum = 15073420;BA.debugLine="j5.Release";
_j5._release /*String*/ (null);
RDebugUtils.currentLine=15073424;
 //BA.debugLineNum = 15073424;BA.debugLine="SearchTemplateObservaciones.Initialize";
__ref._searchtemplateobservaciones /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073426;
 //BA.debugLineNum = 15073426;BA.debugLine="Dim itemsObservaciones As List";
_itemsobservaciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15073427;
 //BA.debugLineNum = 15073427;BA.debugLine="itemsObservaciones.Initialize";
_itemsobservaciones.Initialize();
RDebugUtils.currentLine=15073428;
 //BA.debugLineNum = 15073428;BA.debugLine="itemsObservaciones.Add(\"Seleccionar:\")";
_itemsobservaciones.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=15073429;
 //BA.debugLineNum = 15073429;BA.debugLine="Dim cmdObser As DBCommand = CreateCommand(\"select";
_cmdobser = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_observaciones",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15073430;
 //BA.debugLineNum = 15073430;BA.debugLine="Wait For (Req.ExecuteQuery(cmdObser, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdobser,(int) (0),parent.__c.Null)));
this.state = 81;
return;
case 81:
//C
this.state = 51;
_j6 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15073431;
 //BA.debugLineNum = 15073431;BA.debugLine="If j6.Success Then";
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
RDebugUtils.currentLine=15073432;
 //BA.debugLineNum = 15073432;BA.debugLine="Req.HandleJobAsync(j6, \"req_obser\")";
_req._handlejobasync /*void*/ (null,_j6,"req_obser");
RDebugUtils.currentLine=15073433;
 //BA.debugLineNum = 15073433;BA.debugLine="Wait For (Req) req_obser_Result(resObser As DBRe";
parent.__c.WaitFor("req_obser_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 82;
return;
case 82:
//C
this.state = 54;
_resobser = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15073434;
 //BA.debugLineNum = 15073434;BA.debugLine="For Each rowObser() As Object In resObser.Rows";
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
RDebugUtils.currentLine=15073435;
 //BA.debugLineNum = 15073435;BA.debugLine="Dim codigoObser As String = rowObser(0)";
_codigoobser = BA.ObjectToString(_rowobser[(int) (0)]);
RDebugUtils.currentLine=15073436;
 //BA.debugLineNum = 15073436;BA.debugLine="Dim desObser As String = rowObser(1)";
_desobser = BA.ObjectToString(_rowobser[(int) (1)]);
RDebugUtils.currentLine=15073437;
 //BA.debugLineNum = 15073437;BA.debugLine="SD_xComboBoxObservaciones.Add(desObser ,codigoO";
__ref._sd_xcomboboxobservaciones /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_desobser,(Object)(_codigoobser));
RDebugUtils.currentLine=15073438;
 //BA.debugLineNum = 15073438;BA.debugLine="itemsObservaciones.Add(codigoObser&\":\"&desObser";
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
RDebugUtils.currentLine=15073441;
 //BA.debugLineNum = 15073441;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j6.Err";
parent.__c.LogImpl("515073441","Error en la consulta de Maquina: "+_j6._errormessage /*String*/ ,0);
 if (true) break;

case 60:
//C
this.state = -1;
;
RDebugUtils.currentLine=15073443;
 //BA.debugLineNum = 15073443;BA.debugLine="SearchTemplateObservaciones.SetItems(itemsObserva";
__ref._searchtemplateobservaciones /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsobservaciones);
RDebugUtils.currentLine=15073444;
 //BA.debugLineNum = 15073444;BA.debugLine="j6.Release";
_j6._release /*String*/ (null);
RDebugUtils.currentLine=15073447;
 //BA.debugLineNum = 15073447;BA.debugLine="SearchTemplateHacienda.Initialize";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073449;
 //BA.debugLineNum = 15073449;BA.debugLine="SearchTemplateLote.Initialize";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073452;
 //BA.debugLineNum = 15073452;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="panel.LoadLayout(\"addMaquinariaUI\")";
_panel.LoadLayout("addMaquinariaUI",ba);
RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=15269898;
 //BA.debugLineNum = 15269898;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=15269899;
 //BA.debugLineNum = 15269899;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formmaquinaria __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formmaquinaria __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="Base = Root";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="Dialog.Initialize (Base)";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="Dialog.Title = \"Buscador\"";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._title /*Object*/  = (Object)("Buscador");
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="End Sub";
return "";
}
public void  _button1_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {Debug.delegate(ba, "button1_click", null); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="Ascdo_Maq_Mvto_Maq = \"CP\"";
__ref._ascdo_maq_mvto_maq /*String*/  = "CP";
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="horainicio = EditText1HoraInicio.Text";
__ref._horainicio /*String*/  = __ref._edittext1horainicio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15990789;
 //BA.debugLineNum = 15990789;BA.debugLine="horafin = EditText2HoraFim.Text";
__ref._horafin /*String*/  = __ref._edittext2horafim /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="combustible = EditText1.Text";
__ref._combustible /*String*/  = __ref._edittext1 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="area = EditText2.Text";
__ref._area /*String*/  = __ref._edittext2 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15990792;
 //BA.debugLineNum = 15990792;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=15990794;
 //BA.debugLineNum = 15990794;BA.debugLine="fechaHoy = DateTime.Date(DateTime.Now) ' Esto te";
__ref._fechahoy /*String*/  = parent.__c.DateTime.Date(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=15990795;
 //BA.debugLineNum = 15990795;BA.debugLine="fechaHoy = fechaHoy.Replace(\"/\", \"-\") ' Reemplaza";
__ref._fechahoy /*String*/  = __ref._fechahoy /*String*/ .replace("/","-");
RDebugUtils.currentLine=15990796;
 //BA.debugLineNum = 15990796;BA.debugLine="fechaHoy = fechaHoy & \" 00:00:00\" ' Agregar la";
__ref._fechahoy /*String*/  = __ref._fechahoy /*String*/ +" 00:00:00";
RDebugUtils.currentLine=15990798;
 //BA.debugLineNum = 15990798;BA.debugLine="horaActual = DateTime.Time(DateTime.Now)";
__ref._horaactual /*String*/  = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=15990799;
 //BA.debugLineNum = 15990799;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=15990801;
 //BA.debugLineNum = 15990801;BA.debugLine="Log(\"Ascdo_Maq_Mvto_Maq: \" & Ascdo_Maq_Mvto_Maq)";
parent.__c.LogImpl("515990801","Ascdo_Maq_Mvto_Maq: "+__ref._ascdo_maq_mvto_maq /*String*/ ,0);
RDebugUtils.currentLine=15990802;
 //BA.debugLineNum = 15990802;BA.debugLine="Log(\"maquina: \" & maquina)";
parent.__c.LogImpl("515990802","maquina: "+__ref._maquina /*String*/ ,0);
RDebugUtils.currentLine=15990803;
 //BA.debugLineNum = 15990803;BA.debugLine="Log(\"fecha: \" & fecha)";
parent.__c.LogImpl("515990803","fecha: "+__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=15990804;
 //BA.debugLineNum = 15990804;BA.debugLine="Log(\"labor: \" & labor)";
parent.__c.LogImpl("515990804","labor: "+__ref._labor /*String*/ ,0);
RDebugUtils.currentLine=15990805;
 //BA.debugLineNum = 15990805;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("515990805","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=15990806;
 //BA.debugLineNum = 15990806;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("515990806","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=15990807;
 //BA.debugLineNum = 15990807;BA.debugLine="Log(\"Lote: \" & Lote)";
parent.__c.LogImpl("515990807","Lote: "+__ref._lote /*String*/ ,0);
RDebugUtils.currentLine=15990808;
 //BA.debugLineNum = 15990808;BA.debugLine="Log(\"implemento: \" & implemento)";
parent.__c.LogImpl("515990808","implemento: "+__ref._implemento /*String*/ ,0);
RDebugUtils.currentLine=15990809;
 //BA.debugLineNum = 15990809;BA.debugLine="Log(\"horainicio: \" & horainicio)";
parent.__c.LogImpl("515990809","horainicio: "+__ref._horainicio /*String*/ ,0);
RDebugUtils.currentLine=15990810;
 //BA.debugLineNum = 15990810;BA.debugLine="Log(\"horafin: \" & horafin)";
parent.__c.LogImpl("515990810","horafin: "+__ref._horafin /*String*/ ,0);
RDebugUtils.currentLine=15990811;
 //BA.debugLineNum = 15990811;BA.debugLine="Log(\"combustible: \" & combustible)";
parent.__c.LogImpl("515990811","combustible: "+__ref._combustible /*String*/ ,0);
RDebugUtils.currentLine=15990812;
 //BA.debugLineNum = 15990812;BA.debugLine="Log(\"observaciones: \" & observaciones)";
parent.__c.LogImpl("515990812","observaciones: "+__ref._observaciones /*String*/ ,0);
RDebugUtils.currentLine=15990813;
 //BA.debugLineNum = 15990813;BA.debugLine="Log(\"operario: \" & operario)";
parent.__c.LogImpl("515990813","operario: "+__ref._operario /*String*/ ,0);
RDebugUtils.currentLine=15990814;
 //BA.debugLineNum = 15990814;BA.debugLine="Log(\"implemento2: \" & implemento2)";
parent.__c.LogImpl("515990814","implemento2: "+__ref._implemento2 /*String*/ ,0);
RDebugUtils.currentLine=15990815;
 //BA.debugLineNum = 15990815;BA.debugLine="Log(\"area: \" & area)";
parent.__c.LogImpl("515990815","area: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=15990816;
 //BA.debugLineNum = 15990816;BA.debugLine="Log(\"fechaHoy: \" & fechaHoy)";
parent.__c.LogImpl("515990816","fechaHoy: "+__ref._fechahoy /*String*/ ,0);
RDebugUtils.currentLine=15990817;
 //BA.debugLineNum = 15990817;BA.debugLine="Log(\"horaActual: \" & horaActual)";
parent.__c.LogImpl("515990817","horaActual: "+__ref._horaactual /*String*/ ,0);
RDebugUtils.currentLine=15990818;
 //BA.debugLineNum = 15990818;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("515990818","user: "+__ref._user /*String*/ ,0);
RDebugUtils.currentLine=15990819;
 //BA.debugLineNum = 15990819;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("515990819","DeviceName: "+__ref._devicename /*String*/ ,0);
RDebugUtils.currentLine=15990822;
 //BA.debugLineNum = 15990822;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=15990823;
 //BA.debugLineNum = 15990823;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=15990826;
 //BA.debugLineNum = 15990826;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mvto";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Maq",new Object[]{(Object)(__ref._ascdo_maq_mvto_maq /*String*/ ),(Object)(__ref._maquina /*String*/ ),(Object)(__ref._fecha /*String*/ ),(Object)(__ref._labor /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lote /*String*/ ),(Object)(__ref._implemento /*String*/ ),(Object)(__ref._horainicio /*String*/ ),(Object)(__ref._horafin /*String*/ ),(Object)(__ref._combustible /*String*/ ),(Object)(__ref._observaciones /*String*/ ),(Object)(__ref._operario /*String*/ ),(Object)(__ref._implemento2 /*String*/ ),(Object)(__ref._area /*String*/ ),(Object)(__ref._fechahoy /*String*/ ),(Object)(__ref._horaactual /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=15990829;
 //BA.debugLineNum = 15990829;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=15990830;
 //BA.debugLineNum = 15990830;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "button1_click"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15990833;
 //BA.debugLineNum = 15990833;BA.debugLine="Try";
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
RDebugUtils.currentLine=15990834;
 //BA.debugLineNum = 15990834;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=15990835;
 //BA.debugLineNum = 15990835;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15990837;
 //BA.debugLineNum = 15990837;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("515990837","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=15990840;
 //BA.debugLineNum = 15990840;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("515990840","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=15990842;
 //BA.debugLineNum = 15990842;BA.debugLine="End Sub";
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
public String  _getdevicename(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "getdevicename", false))
	 {return ((String) Debug.delegate(ba, "getdevicename", null));}
anywheresoftware.b4a.phone.Phone _p = null;
String _manufacturer = "";
String _model = "";
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub GetDeviceName As String";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="Private Label1Back As Label";
_label1back = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="Private Label2Save As Label";
_label2save = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="Private SD_xComboBoxMaquina As SD_xComboBox";
_sd_xcomboboxmaquina = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="Private SD_xComboBoxImplemento As SD_xComboBox";
_sd_xcomboboximplemento = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=14811151;
 //BA.debugLineNum = 14811151;BA.debugLine="Private SD_xComboBoxImplemento2 As SD_xComboBox";
_sd_xcomboboximplemento2 = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=14811152;
 //BA.debugLineNum = 14811152;BA.debugLine="Private SD_xComboBoxOperario As SD_xComboBox";
_sd_xcomboboxoperario = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=14811153;
 //BA.debugLineNum = 14811153;BA.debugLine="Private SD_xComboBoxObservaciones As SD_xComboBox";
_sd_xcomboboxobservaciones = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=14811156;
 //BA.debugLineNum = 14811156;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=14811158;
 //BA.debugLineNum = 14811158;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=14811161;
 //BA.debugLineNum = 14811161;BA.debugLine="Private Panel2Time As Panel";
_panel2time = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14811162;
 //BA.debugLineNum = 14811162;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14811164;
 //BA.debugLineNum = 14811164;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14811167;
 //BA.debugLineNum = 14811167;BA.debugLine="Dim fecha As String";
_fecha = "";
RDebugUtils.currentLine=14811168;
 //BA.debugLineNum = 14811168;BA.debugLine="Dim maquina As String";
_maquina = "";
RDebugUtils.currentLine=14811169;
 //BA.debugLineNum = 14811169;BA.debugLine="Dim labor As String";
_labor = "";
RDebugUtils.currentLine=14811170;
 //BA.debugLineNum = 14811170;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=14811171;
 //BA.debugLineNum = 14811171;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=14811172;
 //BA.debugLineNum = 14811172;BA.debugLine="Dim Lote As String";
_lote = "";
RDebugUtils.currentLine=14811173;
 //BA.debugLineNum = 14811173;BA.debugLine="Dim implemento As String";
_implemento = "";
RDebugUtils.currentLine=14811174;
 //BA.debugLineNum = 14811174;BA.debugLine="Dim implemento2 As String";
_implemento2 = "";
RDebugUtils.currentLine=14811175;
 //BA.debugLineNum = 14811175;BA.debugLine="Dim operario As String";
_operario = "";
RDebugUtils.currentLine=14811176;
 //BA.debugLineNum = 14811176;BA.debugLine="Dim observaciones As String";
_observaciones = "";
RDebugUtils.currentLine=14811177;
 //BA.debugLineNum = 14811177;BA.debugLine="Dim horafin As String";
_horafin = "";
RDebugUtils.currentLine=14811178;
 //BA.debugLineNum = 14811178;BA.debugLine="Dim horainicio As String";
_horainicio = "";
RDebugUtils.currentLine=14811179;
 //BA.debugLineNum = 14811179;BA.debugLine="Dim combustible As String";
_combustible = "";
RDebugUtils.currentLine=14811180;
 //BA.debugLineNum = 14811180;BA.debugLine="Dim area As String";
_area = "";
RDebugUtils.currentLine=14811181;
 //BA.debugLineNum = 14811181;BA.debugLine="Dim horaActual As String";
_horaactual = "";
RDebugUtils.currentLine=14811182;
 //BA.debugLineNum = 14811182;BA.debugLine="Dim user As String";
_user = "";
RDebugUtils.currentLine=14811183;
 //BA.debugLineNum = 14811183;BA.debugLine="Dim DeviceName As String";
_devicename = "";
RDebugUtils.currentLine=14811184;
 //BA.debugLineNum = 14811184;BA.debugLine="Dim Ascdo_Maq_Mvto_Maq As String";
_ascdo_maq_mvto_maq = "";
RDebugUtils.currentLine=14811185;
 //BA.debugLineNum = 14811185;BA.debugLine="Private EditText1HoraInicio As EditText";
_edittext1horainicio = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14811186;
 //BA.debugLineNum = 14811186;BA.debugLine="Private EditText2HoraFim As EditText";
_edittext2horafim = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14811187;
 //BA.debugLineNum = 14811187;BA.debugLine="Private EditText1 As EditText";
_edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14811188;
 //BA.debugLineNum = 14811188;BA.debugLine="Private EditText2 As EditText";
_edittext2 = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14811189;
 //BA.debugLineNum = 14811189;BA.debugLine="Dim fechaHoy As String";
_fechahoy = "";
RDebugUtils.currentLine=14811191;
 //BA.debugLineNum = 14811191;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=14811192;
 //BA.debugLineNum = 14811192;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14811193;
 //BA.debugLineNum = 14811193;BA.debugLine="Private SwiftButtonMaquina As SwiftButton";
_swiftbuttonmaquina = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=14811194;
 //BA.debugLineNum = 14811194;BA.debugLine="Private SearchTemplateMaquina As B4XSearchTemplat";
_searchtemplatemaquina = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=14811196;
 //BA.debugLineNum = 14811196;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
_swiftbuttonlabor = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=14811197;
 //BA.debugLineNum = 14811197;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
_searchtemplatelabor = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=14811199;
 //BA.debugLineNum = 14811199;BA.debugLine="Private SwiftButtonNit As SwiftButton";
_swiftbuttonnit = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=14811200;
 //BA.debugLineNum = 14811200;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
_searchtemplatenit = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=14811202;
 //BA.debugLineNum = 14811202;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
_swiftbuttonhacienda = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=14811203;
 //BA.debugLineNum = 14811203;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
_searchtemplatehacienda = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=14811205;
 //BA.debugLineNum = 14811205;BA.debugLine="Private SwiftButtonLote As SwiftButton";
_swiftbuttonlote = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=14811206;
 //BA.debugLineNum = 14811206;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
_searchtemplatelote = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=14811208;
 //BA.debugLineNum = 14811208;BA.debugLine="Private SwiftButtonImplemento As SwiftButton";
_swiftbuttonimplemento = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=14811209;
 //BA.debugLineNum = 14811209;BA.debugLine="Private SearchTemplateImplemento As B4XSearchTemp";
_searchtemplateimplemento = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=14811211;
 //BA.debugLineNum = 14811211;BA.debugLine="Private SwiftButtonImplemento2 As SwiftButton";
_swiftbuttonimplemento2 = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=14811212;
 //BA.debugLineNum = 14811212;BA.debugLine="Private SearchTemplateImplemento2 As B4XSearchTem";
_searchtemplateimplemento2 = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=14811214;
 //BA.debugLineNum = 14811214;BA.debugLine="Private SwiftButtonOperario As SwiftButton";
_swiftbuttonoperario = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=14811215;
 //BA.debugLineNum = 14811215;BA.debugLine="Private SearchTemplateOperario As B4XSearchTempla";
_searchtemplateoperario = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=14811217;
 //BA.debugLineNum = 14811217;BA.debugLine="Private SwiftButtonObservaciones As SwiftButton";
_swiftbuttonobservaciones = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=14811218;
 //BA.debugLineNum = 14811218;BA.debugLine="Private SearchTemplateObservaciones As B4XSearchT";
_searchtemplateobservaciones = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=14811219;
 //BA.debugLineNum = 14811219;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxhacienda_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxhacienda_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxhacienda_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
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
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="haciendaCBX=Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=15204367;
 //BA.debugLineNum = 15204367;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15204371;
 //BA.debugLineNum = 15204371;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=15204372;
 //BA.debugLineNum = 15204372;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=15204375;
 //BA.debugLineNum = 15204375;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_codg_hacienda,(Object)(_codg_hacienda));
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
RDebugUtils.currentLine=15204380;
 //BA.debugLineNum = 15204380;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("515204380","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=15204384;
 //BA.debugLineNum = 15204384;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=15204386;
 //BA.debugLineNum = 15204386;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboximplemento_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboximplemento_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboximplemento_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub SD_xComboBoxImplemento_ItemClick (Posi";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="implemento = Value";
__ref._implemento /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboximplemento2_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboximplemento2_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboximplemento2_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub SD_xComboBoxImplemento2_ItemClick (Pos";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="implemento2 = Value";
__ref._implemento2 /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="labor = Value";
__ref._labor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Lote = Value";
__ref._lote /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="Log(Lote)";
__c.LogImpl("515663106",__ref._lote /*String*/ ,0);
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxmaquina_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxmaquina_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxmaquina_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub SD_xComboBoxMaquina_ItemClick (Positio";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="maquina =Value";
__ref._maquina /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxnit_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxnit_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxnit_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxNit_ItemClick rsub = new ResumableSub_SD_xComboBoxNit_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxNit_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNit_ItemClick(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
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
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="SD_xComboBoxHacienda.Clear";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=15138829;
 //BA.debugLineNum = 15138829;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15138834;
 //BA.debugLineNum = 15138834;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=15138836;
 //BA.debugLineNum = 15138836;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=15138839;
 //BA.debugLineNum = 15138839;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombrehacienda,(Object)(_codg_hacienda));
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
RDebugUtils.currentLine=15138844;
 //BA.debugLineNum = 15138844;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("515138844","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=15138847;
 //BA.debugLineNum = 15138847;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=15138849;
 //BA.debugLineNum = 15138849;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxobservaciones_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxobservaciones_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxobservaciones_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Private Sub SD_xComboBoxObservaciones_ItemClick (P";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="observaciones = Value";
__ref._observaciones /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxoperario_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxoperario_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxoperario_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Private Sub SD_xComboBoxOperario_ItemClick (Positi";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="operario =Value";
__ref._operario /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="End Sub";
return "";
}
public void  _swiftbuttonhacienda_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "swiftbuttonhacienda_click", false))
	 {Debug.delegate(ba, "swiftbuttonhacienda_click", null); return;}
ResumableSub_SwiftButtonHacienda_Click rsub = new ResumableSub_SwiftButtonHacienda_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonHacienda_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonHacienda_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
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
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=83165185;
 //BA.debugLineNum = 83165185;BA.debugLine="Dim ItemsLote As List";
_itemslote = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=83165186;
 //BA.debugLineNum = 83165186;BA.debugLine="ItemsLote.Initialize";
_itemslote.Initialize();
RDebugUtils.currentLine=83165188;
 //BA.debugLineNum = 83165188;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonhacienda_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=83165189;
 //BA.debugLineNum = 83165189;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=83165190;
 //BA.debugLineNum = 83165190;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=83165191;
 //BA.debugLineNum = 83165191;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
_haciendacompleto = __ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=83165192;
 //BA.debugLineNum = 83165192;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
_partes = parent.__c.Regex.Split(":",_haciendacompleto);
RDebugUtils.currentLine=83165193;
 //BA.debugLineNum = 83165193;BA.debugLine="haciendaCBX = Partes(0)";
__ref._haciendacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=83165194;
 //BA.debugLineNum = 83165194;BA.debugLine="ItemsLote.Clear";
_itemslote.Clear();
RDebugUtils.currentLine=83165195;
 //BA.debugLineNum = 83165195;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
_itemslote.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=83165196;
 //BA.debugLineNum = 83165196;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=83165198;
 //BA.debugLineNum = 83165198;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=83165199;
 //BA.debugLineNum = 83165199;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=83165200;
 //BA.debugLineNum = 83165200;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=83165203;
 //BA.debugLineNum = 83165203;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonhacienda_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=83165206;
 //BA.debugLineNum = 83165206;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=83165208;
 //BA.debugLineNum = 83165208;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=83165209;
 //BA.debugLineNum = 83165209;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonhacienda_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=83165213;
 //BA.debugLineNum = 83165213;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=83165214;
 //BA.debugLineNum = 83165214;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=83165218;
 //BA.debugLineNum = 83165218;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
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
RDebugUtils.currentLine=83165223;
 //BA.debugLineNum = 83165223;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("583165223","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=83165225;
 //BA.debugLineNum = 83165225;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslote);
RDebugUtils.currentLine=83165226;
 //BA.debugLineNum = 83165226;BA.debugLine="SwiftButtonLote.Enabled = True";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=83165228;
 //BA.debugLineNum = 83165228;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=83165231;
 //BA.debugLineNum = 83165231;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonimplemento_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "swiftbuttonimplemento_click", false))
	 {Debug.delegate(ba, "swiftbuttonimplemento_click", null); return;}
ResumableSub_SwiftButtonImplemento_Click rsub = new ResumableSub_SwiftButtonImplemento_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonImplemento_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonImplemento_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=83296257;
 //BA.debugLineNum = 83296257;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateImple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonimplemento_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=83296258;
 //BA.debugLineNum = 83296258;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=83296259;
 //BA.debugLineNum = 83296259;BA.debugLine="SwiftButtonImplemento.xLBL.Text = SearchTemplate";
__ref._swiftbuttonimplemento /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=83296261;
 //BA.debugLineNum = 83296261;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonimplemento2_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "swiftbuttonimplemento2_click", false))
	 {Debug.delegate(ba, "swiftbuttonimplemento2_click", null); return;}
ResumableSub_SwiftButtonImplemento2_Click rsub = new ResumableSub_SwiftButtonImplemento2_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonImplemento2_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonImplemento2_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=83361793;
 //BA.debugLineNum = 83361793;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateImple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonimplemento2_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=83361794;
 //BA.debugLineNum = 83361794;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=83361795;
 //BA.debugLineNum = 83361795;BA.debugLine="SwiftButtonImplemento2.xLBL.Text = SearchTemplat";
__ref._swiftbuttonimplemento2 /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=83361797;
 //BA.debugLineNum = 83361797;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonlabor_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "swiftbuttonlabor_click", false))
	 {Debug.delegate(ba, "swiftbuttonlabor_click", null); return;}
ResumableSub_SwiftButtonLabor_Click rsub = new ResumableSub_SwiftButtonLabor_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonLabor_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLabor_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
int _result = 0;
String _laborcompleto = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=83034113;
 //BA.debugLineNum = 83034113;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonlabor_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=83034114;
 //BA.debugLineNum = 83034114;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=83034115;
 //BA.debugLineNum = 83034115;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
__ref._swiftbuttonlabor /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=83034116;
 //BA.debugLineNum = 83034116;BA.debugLine="Dim LABORCOMPLETO As String = SearchTemplateLabo";
_laborcompleto = __ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=83034118;
 //BA.debugLineNum = 83034118;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonlote_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "swiftbuttonlote_click", false))
	 {Debug.delegate(ba, "swiftbuttonlote_click", null); return;}
ResumableSub_SwiftButtonLote_Click rsub = new ResumableSub_SwiftButtonLote_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonLote_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLote_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=83230721;
 //BA.debugLineNum = 83230721;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonlote_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=83230722;
 //BA.debugLineNum = 83230722;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=83230723;
 //BA.debugLineNum = 83230723;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.S";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=83230725;
 //BA.debugLineNum = 83230725;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonmaquina_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "swiftbuttonmaquina_click", false))
	 {Debug.delegate(ba, "swiftbuttonmaquina_click", null); return;}
ResumableSub_SwiftButtonMaquina_Click rsub = new ResumableSub_SwiftButtonMaquina_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonMaquina_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonMaquina_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
int _result = 0;
String _maquinacompleto = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=82968577;
 //BA.debugLineNum = 82968577;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateMaqui";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonmaquina_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=82968578;
 //BA.debugLineNum = 82968578;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=82968579;
 //BA.debugLineNum = 82968579;BA.debugLine="SwiftButtonMaquina.xLBL.Text = SearchTemplateMaq";
__ref._swiftbuttonmaquina /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=82968580;
 //BA.debugLineNum = 82968580;BA.debugLine="Dim MAQUINACOMPLETO As String = SearchTemplateMa";
_maquinacompleto = __ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=82968582;
 //BA.debugLineNum = 82968582;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonnit_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "swiftbuttonnit_click", false))
	 {Debug.delegate(ba, "swiftbuttonnit_click", null); return;}
ResumableSub_SwiftButtonNit_Click rsub = new ResumableSub_SwiftButtonNit_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonNit_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonNit_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
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
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=83099649;
 //BA.debugLineNum = 83099649;BA.debugLine="Dim ItemsHacienda As List";
_itemshacienda = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=83099650;
 //BA.debugLineNum = 83099650;BA.debugLine="ItemsHacienda.Initialize";
_itemshacienda.Initialize();
RDebugUtils.currentLine=83099651;
 //BA.debugLineNum = 83099651;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonnit_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=83099652;
 //BA.debugLineNum = 83099652;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=83099653;
 //BA.debugLineNum = 83099653;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
__ref._swiftbuttonnit /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=83099654;
 //BA.debugLineNum = 83099654;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
_nitcompleto = __ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=83099655;
 //BA.debugLineNum = 83099655;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
_partes = parent.__c.Regex.Split(":",_nitcompleto);
RDebugUtils.currentLine=83099656;
 //BA.debugLineNum = 83099656;BA.debugLine="nitEmpresaCBX = Partes(0)";
__ref._nitempresacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=83099657;
 //BA.debugLineNum = 83099657;BA.debugLine="ItemsHacienda.Clear";
_itemshacienda.Clear();
RDebugUtils.currentLine=83099658;
 //BA.debugLineNum = 83099658;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
_itemshacienda.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=83099659;
 //BA.debugLineNum = 83099659;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=83099661;
 //BA.debugLineNum = 83099661;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=83099662;
 //BA.debugLineNum = 83099662;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=83099663;
 //BA.debugLineNum = 83099663;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)(__ref._nitempresacbx /*String*/ )});
RDebugUtils.currentLine=83099666;
 //BA.debugLineNum = 83099666;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonnit_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=83099669;
 //BA.debugLineNum = 83099669;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=83099671;
 //BA.debugLineNum = 83099671;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=83099672;
 //BA.debugLineNum = 83099672;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonnit_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=83099676;
 //BA.debugLineNum = 83099676;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=83099677;
 //BA.debugLineNum = 83099677;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=83099678;
 //BA.debugLineNum = 83099678;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=83099683;
 //BA.debugLineNum = 83099683;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
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
RDebugUtils.currentLine=83099688;
 //BA.debugLineNum = 83099688;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("583099688","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=83099690;
 //BA.debugLineNum = 83099690;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemshacienda);
RDebugUtils.currentLine=83099691;
 //BA.debugLineNum = 83099691;BA.debugLine="SwiftButtonHacienda.Enabled = True";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=83099692;
 //BA.debugLineNum = 83099692;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("583099692",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=83099694;
 //BA.debugLineNum = 83099694;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=83099697;
 //BA.debugLineNum = 83099697;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonobservaciones_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "swiftbuttonobservaciones_click", false))
	 {Debug.delegate(ba, "swiftbuttonobservaciones_click", null); return;}
ResumableSub_SwiftButtonObservaciones_Click rsub = new ResumableSub_SwiftButtonObservaciones_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonObservaciones_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonObservaciones_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=83492865;
 //BA.debugLineNum = 83492865;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateObser";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonobservaciones_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateobservaciones /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=83492866;
 //BA.debugLineNum = 83492866;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=83492867;
 //BA.debugLineNum = 83492867;BA.debugLine="SwiftButtonObservaciones.xLBL.Text = SearchTempl";
__ref._swiftbuttonobservaciones /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateobservaciones /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=83492869;
 //BA.debugLineNum = 83492869;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonoperario_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "swiftbuttonoperario_click", false))
	 {Debug.delegate(ba, "swiftbuttonoperario_click", null); return;}
ResumableSub_SwiftButtonOperario_Click rsub = new ResumableSub_SwiftButtonOperario_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonOperario_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonOperario_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=83427329;
 //BA.debugLineNum = 83427329;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateOpera";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonoperario_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=83427330;
 //BA.debugLineNum = 83427330;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=83427331;
 //BA.debugLineNum = 83427331;BA.debugLine="SwiftButtonOperario.xLBL.Text = SearchTemplateOp";
__ref._swiftbuttonoperario /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=83427333;
 //BA.debugLineNum = 83427333;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}