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
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formmaquinaria __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=18481160;
 //BA.debugLineNum = 18481160;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=18481163;
 //BA.debugLineNum = 18481163;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=18481166;
 //BA.debugLineNum = 18481166;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=18481169;
 //BA.debugLineNum = 18481169;BA.debugLine="fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=18481173;
 //BA.debugLineNum = 18481173;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=18153481;
 //BA.debugLineNum = 18153481;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=18153484;
 //BA.debugLineNum = 18153484;BA.debugLine="SearchTemplateMaquina.Initialize";
__ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18153486;
 //BA.debugLineNum = 18153486;BA.debugLine="Dim itemsMaquina As List";
_itemsmaquina = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18153487;
 //BA.debugLineNum = 18153487;BA.debugLine="itemsMaquina.Initialize";
_itemsmaquina.Initialize();
RDebugUtils.currentLine=18153488;
 //BA.debugLineNum = 18153488;BA.debugLine="itemsMaquina.Add(\"Seleccionar:\")";
_itemsmaquina.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=18153490;
 //BA.debugLineNum = 18153490;BA.debugLine="Dim cmdMaquina As DBCommand = CreateCommand(\"sele";
_cmdmaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maquina",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=18153491;
 //BA.debugLineNum = 18153491;BA.debugLine="Wait For (Req.ExecuteQuery(cmdMaquina, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdmaquina,(int) (0),parent.__c.Null)));
this.state = 61;
return;
case 61:
//C
this.state = 1;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18153492;
 //BA.debugLineNum = 18153492;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=18153493;
 //BA.debugLineNum = 18153493;BA.debugLine="Req.HandleJobAsync(j2, \"req_maquina\")";
_req._handlejobasync /*void*/ (null,_j2,"req_maquina");
RDebugUtils.currentLine=18153494;
 //BA.debugLineNum = 18153494;BA.debugLine="Wait For (Req) req_maquina_Result(resMaquina As";
parent.__c.WaitFor("req_maquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 62;
return;
case 62:
//C
this.state = 4;
_resmaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18153495;
 //BA.debugLineNum = 18153495;BA.debugLine="For Each rowMaquina() As Object In resMaquina.Ro";
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
RDebugUtils.currentLine=18153496;
 //BA.debugLineNum = 18153496;BA.debugLine="Dim codigoMaquina As String = rowMaquina(0) ' C";
_codigomaquina = BA.ObjectToString(_rowmaquina[(int) (0)]);
RDebugUtils.currentLine=18153497;
 //BA.debugLineNum = 18153497;BA.debugLine="Dim descripcionMaquina As String = rowMaquina(1";
_descripcionmaquina = BA.ObjectToString(_rowmaquina[(int) (1)]);
RDebugUtils.currentLine=18153498;
 //BA.debugLineNum = 18153498;BA.debugLine="SD_xComboBoxMaquina.Add(descripcionMaquina, cod";
__ref._sd_xcomboboxmaquina /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionmaquina,(Object)(_codigomaquina));
RDebugUtils.currentLine=18153499;
 //BA.debugLineNum = 18153499;BA.debugLine="itemsMaquina.Add(codigoMaquina&\":\"&descripcionM";
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
RDebugUtils.currentLine=18153502;
 //BA.debugLineNum = 18153502;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
parent.__c.LogImpl("418153502","Error en la consulta de Maquina: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=18153504;
 //BA.debugLineNum = 18153504;BA.debugLine="SearchTemplateMaquina.SetItems(itemsMaquina)";
__ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsmaquina);
RDebugUtils.currentLine=18153505;
 //BA.debugLineNum = 18153505;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=18153511;
 //BA.debugLineNum = 18153511;BA.debugLine="SearchTemplateLabor.Initialize";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18153513;
 //BA.debugLineNum = 18153513;BA.debugLine="Dim itemsLaborMaquina As List";
_itemslabormaquina = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18153514;
 //BA.debugLineNum = 18153514;BA.debugLine="itemsLaborMaquina.Initialize";
_itemslabormaquina.Initialize();
RDebugUtils.currentLine=18153515;
 //BA.debugLineNum = 18153515;BA.debugLine="itemsLaborMaquina.Add(\"Seleccionar:\")";
_itemslabormaquina.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=18153517;
 //BA.debugLineNum = 18153517;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor_maq",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=18153518;
 //BA.debugLineNum = 18153518;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 65;
return;
case 65:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18153519;
 //BA.debugLineNum = 18153519;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=18153520;
 //BA.debugLineNum = 18153520;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (null,_j3,"req_labormaquina");
RDebugUtils.currentLine=18153521;
 //BA.debugLineNum = 18153521;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 66;
return;
case 66:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18153522;
 //BA.debugLineNum = 18153522;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
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
RDebugUtils.currentLine=18153523;
 //BA.debugLineNum = 18153523;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
RDebugUtils.currentLine=18153524;
 //BA.debugLineNum = 18153524;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
RDebugUtils.currentLine=18153525;
 //BA.debugLineNum = 18153525;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina,";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionlabormaquina,(Object)(_codigolabormaquina));
RDebugUtils.currentLine=18153526;
 //BA.debugLineNum = 18153526;BA.debugLine="itemsLaborMaquina.Add(codigoLaborMaquina&\":\"&de";
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
RDebugUtils.currentLine=18153529;
 //BA.debugLineNum = 18153529;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("418153529","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=18153531;
 //BA.debugLineNum = 18153531;BA.debugLine="SearchTemplateLabor.SetItems(itemsLaborMaquina)";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslabormaquina);
RDebugUtils.currentLine=18153532;
 //BA.debugLineNum = 18153532;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=18153536;
 //BA.debugLineNum = 18153536;BA.debugLine="SearchTemplateNit.Initialize";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18153538;
 //BA.debugLineNum = 18153538;BA.debugLine="Dim itemsNit As List";
_itemsnit = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18153539;
 //BA.debugLineNum = 18153539;BA.debugLine="itemsNit.Initialize";
_itemsnit.Initialize();
RDebugUtils.currentLine=18153540;
 //BA.debugLineNum = 18153540;BA.debugLine="itemsNit.Add(\"Seleccionar:\")";
_itemsnit.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=18153542;
 //BA.debugLineNum = 18153542;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=18153543;
 //BA.debugLineNum = 18153543;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 69;
return;
case 69:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18153544;
 //BA.debugLineNum = 18153544;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=18153545;
 //BA.debugLineNum = 18153545;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=18153546;
 //BA.debugLineNum = 18153546;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 70;
return;
case 70:
//C
this.state = 24;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18153547;
 //BA.debugLineNum = 18153547;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=18153548;
 //BA.debugLineNum = 18153548;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=18153549;
 //BA.debugLineNum = 18153549;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=18153550;
 //BA.debugLineNum = 18153550;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_razonsocial+" - "+_nit,(Object)(_nit));
RDebugUtils.currentLine=18153551;
 //BA.debugLineNum = 18153551;BA.debugLine="itemsNit.Add(nit&\":\"&razonSocial)";
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
RDebugUtils.currentLine=18153554;
 //BA.debugLineNum = 18153554;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("418153554","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=18153556;
 //BA.debugLineNum = 18153556;BA.debugLine="SearchTemplateNit.SetItems(itemsNit)";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsnit);
RDebugUtils.currentLine=18153557;
 //BA.debugLineNum = 18153557;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=18153561;
 //BA.debugLineNum = 18153561;BA.debugLine="SearchTemplateImplemento.Initialize";
__ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18153562;
 //BA.debugLineNum = 18153562;BA.debugLine="SearchTemplateImplemento2.Initialize";
__ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18153564;
 //BA.debugLineNum = 18153564;BA.debugLine="Dim itemsImplemento As List";
_itemsimplemento = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18153565;
 //BA.debugLineNum = 18153565;BA.debugLine="itemsImplemento.Initialize";
_itemsimplemento.Initialize();
RDebugUtils.currentLine=18153566;
 //BA.debugLineNum = 18153566;BA.debugLine="itemsImplemento.Add(\"Seleccionar:\")";
_itemsimplemento.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=18153568;
 //BA.debugLineNum = 18153568;BA.debugLine="Dim cmdImple As DBCommand = CreateCommand(\"select";
_cmdimple = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_implemento",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=18153569;
 //BA.debugLineNum = 18153569;BA.debugLine="Wait For (Req.ExecuteQuery(cmdImple, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdimple,(int) (0),parent.__c.Null)));
this.state = 73;
return;
case 73:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18153570;
 //BA.debugLineNum = 18153570;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=18153571;
 //BA.debugLineNum = 18153571;BA.debugLine="Req.HandleJobAsync(j4, \"req_imple\")";
_req._handlejobasync /*void*/ (null,_j4,"req_imple");
RDebugUtils.currentLine=18153572;
 //BA.debugLineNum = 18153572;BA.debugLine="Wait For (Req) req_imple_Result(resImple As DBRe";
parent.__c.WaitFor("req_imple_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 74;
return;
case 74:
//C
this.state = 34;
_resimple = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18153573;
 //BA.debugLineNum = 18153573;BA.debugLine="For Each rowImple() As Object In resImple.Rows";
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
RDebugUtils.currentLine=18153574;
 //BA.debugLineNum = 18153574;BA.debugLine="Dim codigoImple As String = rowImple(0) ' Cdgo_";
_codigoimple = BA.ObjectToString(_rowimple[(int) (0)]);
RDebugUtils.currentLine=18153575;
 //BA.debugLineNum = 18153575;BA.debugLine="Dim descripcionImple As String = rowImple(1) '";
_descripcionimple = BA.ObjectToString(_rowimple[(int) (1)]);
RDebugUtils.currentLine=18153576;
 //BA.debugLineNum = 18153576;BA.debugLine="SD_xComboBoxImplemento.Add(descripcionImple, co";
__ref._sd_xcomboboximplemento /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionimple,(Object)(_codigoimple));
RDebugUtils.currentLine=18153577;
 //BA.debugLineNum = 18153577;BA.debugLine="SD_xComboBoxImplemento2.Add(descripcionImple, c";
__ref._sd_xcomboboximplemento2 /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionimple,(Object)(_codigoimple));
RDebugUtils.currentLine=18153578;
 //BA.debugLineNum = 18153578;BA.debugLine="itemsImplemento.Add(codigoImple&\":\"&descripcion";
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
RDebugUtils.currentLine=18153581;
 //BA.debugLineNum = 18153581;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("418153581","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=18153583;
 //BA.debugLineNum = 18153583;BA.debugLine="SearchTemplateImplemento.SetItems(itemsImplemento";
__ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsimplemento);
RDebugUtils.currentLine=18153584;
 //BA.debugLineNum = 18153584;BA.debugLine="SearchTemplateImplemento2.SetItems(itemsImplement";
__ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsimplemento);
RDebugUtils.currentLine=18153585;
 //BA.debugLineNum = 18153585;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=18153589;
 //BA.debugLineNum = 18153589;BA.debugLine="SearchTemplateOperario.Initialize";
__ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18153591;
 //BA.debugLineNum = 18153591;BA.debugLine="Dim itemsOperario As List";
_itemsoperario = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18153592;
 //BA.debugLineNum = 18153592;BA.debugLine="itemsOperario.Initialize";
_itemsoperario.Initialize();
RDebugUtils.currentLine=18153593;
 //BA.debugLineNum = 18153593;BA.debugLine="itemsOperario.Add(\"Seleccionar:\")";
_itemsoperario.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=18153595;
 //BA.debugLineNum = 18153595;BA.debugLine="Dim cmdOper As DBCommand = CreateCommand(\"select_";
_cmdoper = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_operario",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=18153596;
 //BA.debugLineNum = 18153596;BA.debugLine="Wait For (Req.ExecuteQuery(cmdOper, 0, Null)) Job";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdoper,(int) (0),parent.__c.Null)));
this.state = 77;
return;
case 77:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18153597;
 //BA.debugLineNum = 18153597;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=18153598;
 //BA.debugLineNum = 18153598;BA.debugLine="Req.HandleJobAsync(j5, \"req_oper\")";
_req._handlejobasync /*void*/ (null,_j5,"req_oper");
RDebugUtils.currentLine=18153599;
 //BA.debugLineNum = 18153599;BA.debugLine="Wait For (Req) req_oper_Result(resOper As DBResu";
parent.__c.WaitFor("req_oper_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 78;
return;
case 78:
//C
this.state = 44;
_resoper = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18153600;
 //BA.debugLineNum = 18153600;BA.debugLine="For Each rowOper() As Object In resOper.Rows";
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
RDebugUtils.currentLine=18153601;
 //BA.debugLineNum = 18153601;BA.debugLine="Dim codigoOper As String = rowOper(0)";
_codigooper = BA.ObjectToString(_rowoper[(int) (0)]);
RDebugUtils.currentLine=18153602;
 //BA.debugLineNum = 18153602;BA.debugLine="Dim apellido1 As String = rowOper(1)";
_apellido1 = BA.ObjectToString(_rowoper[(int) (1)]);
RDebugUtils.currentLine=18153603;
 //BA.debugLineNum = 18153603;BA.debugLine="Dim apellido2 As String = rowOper(2)";
_apellido2 = BA.ObjectToString(_rowoper[(int) (2)]);
RDebugUtils.currentLine=18153604;
 //BA.debugLineNum = 18153604;BA.debugLine="Dim nombre As String = rowOper(3)";
_nombre = BA.ObjectToString(_rowoper[(int) (3)]);
RDebugUtils.currentLine=18153605;
 //BA.debugLineNum = 18153605;BA.debugLine="SD_xComboBoxOperario.Add(apellido1&\" \"&apellido";
__ref._sd_xcomboboxoperario /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_apellido1+" "+_apellido2+" "+_nombre,(Object)(_codigooper));
RDebugUtils.currentLine=18153606;
 //BA.debugLineNum = 18153606;BA.debugLine="itemsOperario.Add(codigoOper&\":\"&apellido1&\" \"&";
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
RDebugUtils.currentLine=18153609;
 //BA.debugLineNum = 18153609;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j5.Err";
parent.__c.LogImpl("418153609","Error en la consulta de Maquina: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=18153611;
 //BA.debugLineNum = 18153611;BA.debugLine="SearchTemplateOperario.SetItems(itemsOperario)";
__ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsoperario);
RDebugUtils.currentLine=18153612;
 //BA.debugLineNum = 18153612;BA.debugLine="j5.Release";
_j5._release /*String*/ (null);
RDebugUtils.currentLine=18153616;
 //BA.debugLineNum = 18153616;BA.debugLine="SearchTemplateObservaciones.Initialize";
__ref._searchtemplateobservaciones /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18153618;
 //BA.debugLineNum = 18153618;BA.debugLine="Dim itemsObservaciones As List";
_itemsobservaciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18153619;
 //BA.debugLineNum = 18153619;BA.debugLine="itemsObservaciones.Initialize";
_itemsobservaciones.Initialize();
RDebugUtils.currentLine=18153620;
 //BA.debugLineNum = 18153620;BA.debugLine="itemsObservaciones.Add(\"Seleccionar:\")";
_itemsobservaciones.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=18153621;
 //BA.debugLineNum = 18153621;BA.debugLine="Dim cmdObser As DBCommand = CreateCommand(\"select";
_cmdobser = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_observaciones",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=18153622;
 //BA.debugLineNum = 18153622;BA.debugLine="Wait For (Req.ExecuteQuery(cmdObser, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdobser,(int) (0),parent.__c.Null)));
this.state = 81;
return;
case 81:
//C
this.state = 51;
_j6 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18153623;
 //BA.debugLineNum = 18153623;BA.debugLine="If j6.Success Then";
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
RDebugUtils.currentLine=18153624;
 //BA.debugLineNum = 18153624;BA.debugLine="Req.HandleJobAsync(j6, \"req_obser\")";
_req._handlejobasync /*void*/ (null,_j6,"req_obser");
RDebugUtils.currentLine=18153625;
 //BA.debugLineNum = 18153625;BA.debugLine="Wait For (Req) req_obser_Result(resObser As DBRe";
parent.__c.WaitFor("req_obser_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 82;
return;
case 82:
//C
this.state = 54;
_resobser = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18153626;
 //BA.debugLineNum = 18153626;BA.debugLine="For Each rowObser() As Object In resObser.Rows";
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
RDebugUtils.currentLine=18153627;
 //BA.debugLineNum = 18153627;BA.debugLine="Dim codigoObser As String = rowObser(0)";
_codigoobser = BA.ObjectToString(_rowobser[(int) (0)]);
RDebugUtils.currentLine=18153628;
 //BA.debugLineNum = 18153628;BA.debugLine="Dim desObser As String = rowObser(1)";
_desobser = BA.ObjectToString(_rowobser[(int) (1)]);
RDebugUtils.currentLine=18153629;
 //BA.debugLineNum = 18153629;BA.debugLine="SD_xComboBoxObservaciones.Add(desObser ,codigoO";
__ref._sd_xcomboboxobservaciones /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_desobser,(Object)(_codigoobser));
RDebugUtils.currentLine=18153630;
 //BA.debugLineNum = 18153630;BA.debugLine="itemsObservaciones.Add(codigoObser&\":\"&desObser";
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
RDebugUtils.currentLine=18153633;
 //BA.debugLineNum = 18153633;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j6.Err";
parent.__c.LogImpl("418153633","Error en la consulta de Maquina: "+_j6._errormessage /*String*/ ,0);
 if (true) break;

case 60:
//C
this.state = -1;
;
RDebugUtils.currentLine=18153635;
 //BA.debugLineNum = 18153635;BA.debugLine="SearchTemplateObservaciones.SetItems(itemsObserva";
__ref._searchtemplateobservaciones /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsobservaciones);
RDebugUtils.currentLine=18153636;
 //BA.debugLineNum = 18153636;BA.debugLine="j6.Release";
_j6._release /*String*/ (null);
RDebugUtils.currentLine=18153639;
 //BA.debugLineNum = 18153639;BA.debugLine="SearchTemplateHacienda.Initialize";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18153641;
 //BA.debugLineNum = 18153641;BA.debugLine="SearchTemplateLote.Initialize";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18153644;
 //BA.debugLineNum = 18153644;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="panel.LoadLayout(\"addMaquinariaUI\")";
_panel.LoadLayout("addMaquinariaUI",ba);
RDebugUtils.currentLine=18350088;
 //BA.debugLineNum = 18350088;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=18350090;
 //BA.debugLineNum = 18350090;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=18350091;
 //BA.debugLineNum = 18350091;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formmaquinaria __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=18546693;
 //BA.debugLineNum = 18546693;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=18546694;
 //BA.debugLineNum = 18546694;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formmaquinaria __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="Base = Root";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="Dialog.Initialize (Base)";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="Dialog.Title = \"Buscador\"";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._title /*Object*/  = (Object)("Buscador");
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="Ascdo_Maq_Mvto_Maq = \"CP\"";
__ref._ascdo_maq_mvto_maq /*String*/  = "CP";
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="horainicio = EditText1HoraInicio.Text";
__ref._horainicio /*String*/  = __ref._edittext1horainicio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=19070981;
 //BA.debugLineNum = 19070981;BA.debugLine="horafin = EditText2HoraFim.Text";
__ref._horafin /*String*/  = __ref._edittext2horafim /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=19070982;
 //BA.debugLineNum = 19070982;BA.debugLine="combustible = EditText1.Text";
__ref._combustible /*String*/  = __ref._edittext1 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=19070983;
 //BA.debugLineNum = 19070983;BA.debugLine="area = EditText2.Text";
__ref._area /*String*/  = __ref._edittext2 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=19070984;
 //BA.debugLineNum = 19070984;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=19070986;
 //BA.debugLineNum = 19070986;BA.debugLine="fechaHoy = DateTime.Date(DateTime.Now) ' Esto te";
__ref._fechahoy /*String*/  = parent.__c.DateTime.Date(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=19070987;
 //BA.debugLineNum = 19070987;BA.debugLine="fechaHoy = fechaHoy.Replace(\"/\", \"-\") ' Reemplaza";
__ref._fechahoy /*String*/  = __ref._fechahoy /*String*/ .replace("/","-");
RDebugUtils.currentLine=19070988;
 //BA.debugLineNum = 19070988;BA.debugLine="fechaHoy = fechaHoy & \" 00:00:00\" ' Agregar la";
__ref._fechahoy /*String*/  = __ref._fechahoy /*String*/ +" 00:00:00";
RDebugUtils.currentLine=19070990;
 //BA.debugLineNum = 19070990;BA.debugLine="horaActual = DateTime.Time(DateTime.Now)";
__ref._horaactual /*String*/  = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=19070991;
 //BA.debugLineNum = 19070991;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=19070993;
 //BA.debugLineNum = 19070993;BA.debugLine="Log(\"Ascdo_Maq_Mvto_Maq: \" & Ascdo_Maq_Mvto_Maq)";
parent.__c.LogImpl("419070993","Ascdo_Maq_Mvto_Maq: "+__ref._ascdo_maq_mvto_maq /*String*/ ,0);
RDebugUtils.currentLine=19070994;
 //BA.debugLineNum = 19070994;BA.debugLine="Log(\"maquina: \" & maquina)";
parent.__c.LogImpl("419070994","maquina: "+__ref._maquina /*String*/ ,0);
RDebugUtils.currentLine=19070995;
 //BA.debugLineNum = 19070995;BA.debugLine="Log(\"fecha: \" & fecha)";
parent.__c.LogImpl("419070995","fecha: "+__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=19070996;
 //BA.debugLineNum = 19070996;BA.debugLine="Log(\"labor: \" & labor)";
parent.__c.LogImpl("419070996","labor: "+__ref._labor /*String*/ ,0);
RDebugUtils.currentLine=19070997;
 //BA.debugLineNum = 19070997;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("419070997","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=19070998;
 //BA.debugLineNum = 19070998;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("419070998","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=19070999;
 //BA.debugLineNum = 19070999;BA.debugLine="Log(\"Lote: \" & Lote)";
parent.__c.LogImpl("419070999","Lote: "+__ref._lote /*String*/ ,0);
RDebugUtils.currentLine=19071000;
 //BA.debugLineNum = 19071000;BA.debugLine="Log(\"implemento: \" & implemento)";
parent.__c.LogImpl("419071000","implemento: "+__ref._implemento /*String*/ ,0);
RDebugUtils.currentLine=19071001;
 //BA.debugLineNum = 19071001;BA.debugLine="Log(\"horainicio: \" & horainicio)";
parent.__c.LogImpl("419071001","horainicio: "+__ref._horainicio /*String*/ ,0);
RDebugUtils.currentLine=19071002;
 //BA.debugLineNum = 19071002;BA.debugLine="Log(\"horafin: \" & horafin)";
parent.__c.LogImpl("419071002","horafin: "+__ref._horafin /*String*/ ,0);
RDebugUtils.currentLine=19071003;
 //BA.debugLineNum = 19071003;BA.debugLine="Log(\"combustible: \" & combustible)";
parent.__c.LogImpl("419071003","combustible: "+__ref._combustible /*String*/ ,0);
RDebugUtils.currentLine=19071004;
 //BA.debugLineNum = 19071004;BA.debugLine="Log(\"observaciones: \" & observaciones)";
parent.__c.LogImpl("419071004","observaciones: "+__ref._observaciones /*String*/ ,0);
RDebugUtils.currentLine=19071005;
 //BA.debugLineNum = 19071005;BA.debugLine="Log(\"operario: \" & operario)";
parent.__c.LogImpl("419071005","operario: "+__ref._operario /*String*/ ,0);
RDebugUtils.currentLine=19071006;
 //BA.debugLineNum = 19071006;BA.debugLine="Log(\"implemento2: \" & implemento2)";
parent.__c.LogImpl("419071006","implemento2: "+__ref._implemento2 /*String*/ ,0);
RDebugUtils.currentLine=19071007;
 //BA.debugLineNum = 19071007;BA.debugLine="Log(\"area: \" & area)";
parent.__c.LogImpl("419071007","area: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=19071008;
 //BA.debugLineNum = 19071008;BA.debugLine="Log(\"fechaHoy: \" & fechaHoy)";
parent.__c.LogImpl("419071008","fechaHoy: "+__ref._fechahoy /*String*/ ,0);
RDebugUtils.currentLine=19071009;
 //BA.debugLineNum = 19071009;BA.debugLine="Log(\"horaActual: \" & horaActual)";
parent.__c.LogImpl("419071009","horaActual: "+__ref._horaactual /*String*/ ,0);
RDebugUtils.currentLine=19071010;
 //BA.debugLineNum = 19071010;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("419071010","user: "+__ref._user /*String*/ ,0);
RDebugUtils.currentLine=19071011;
 //BA.debugLineNum = 19071011;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("419071011","DeviceName: "+__ref._devicename /*String*/ ,0);
RDebugUtils.currentLine=19071014;
 //BA.debugLineNum = 19071014;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=19071015;
 //BA.debugLineNum = 19071015;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=19071018;
 //BA.debugLineNum = 19071018;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mvto";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Maq",new Object[]{(Object)(__ref._ascdo_maq_mvto_maq /*String*/ ),(Object)(__ref._maquina /*String*/ ),(Object)(__ref._fecha /*String*/ ),(Object)(__ref._labor /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lote /*String*/ ),(Object)(__ref._implemento /*String*/ ),(Object)(__ref._horainicio /*String*/ ),(Object)(__ref._horafin /*String*/ ),(Object)(__ref._combustible /*String*/ ),(Object)(__ref._observaciones /*String*/ ),(Object)(__ref._operario /*String*/ ),(Object)(__ref._implemento2 /*String*/ ),(Object)(__ref._area /*String*/ ),(Object)(__ref._fechahoy /*String*/ ),(Object)(__ref._horaactual /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=19071021;
 //BA.debugLineNum = 19071021;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=19071022;
 //BA.debugLineNum = 19071022;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "button1_click"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=19071025;
 //BA.debugLineNum = 19071025;BA.debugLine="Try";
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
RDebugUtils.currentLine=19071026;
 //BA.debugLineNum = 19071026;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=19071027;
 //BA.debugLineNum = 19071027;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=19071029;
 //BA.debugLineNum = 19071029;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("419071029","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=19071032;
 //BA.debugLineNum = 19071032;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("419071032","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=19071034;
 //BA.debugLineNum = 19071034;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Sub GetDeviceName As String";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="Private Label1Back As Label";
_label1back = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="Private Label2Save As Label";
_label2save = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17891337;
 //BA.debugLineNum = 17891337;BA.debugLine="Private SD_xComboBoxMaquina As SD_xComboBox";
_sd_xcomboboxmaquina = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=17891339;
 //BA.debugLineNum = 17891339;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=17891340;
 //BA.debugLineNum = 17891340;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=17891341;
 //BA.debugLineNum = 17891341;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=17891342;
 //BA.debugLineNum = 17891342;BA.debugLine="Private SD_xComboBoxImplemento As SD_xComboBox";
_sd_xcomboboximplemento = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=17891343;
 //BA.debugLineNum = 17891343;BA.debugLine="Private SD_xComboBoxImplemento2 As SD_xComboBox";
_sd_xcomboboximplemento2 = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=17891344;
 //BA.debugLineNum = 17891344;BA.debugLine="Private SD_xComboBoxOperario As SD_xComboBox";
_sd_xcomboboxoperario = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=17891345;
 //BA.debugLineNum = 17891345;BA.debugLine="Private SD_xComboBoxObservaciones As SD_xComboBox";
_sd_xcomboboxobservaciones = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=17891348;
 //BA.debugLineNum = 17891348;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=17891350;
 //BA.debugLineNum = 17891350;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=17891353;
 //BA.debugLineNum = 17891353;BA.debugLine="Private Panel2Time As Panel";
_panel2time = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=17891354;
 //BA.debugLineNum = 17891354;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17891356;
 //BA.debugLineNum = 17891356;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=17891359;
 //BA.debugLineNum = 17891359;BA.debugLine="Dim fecha As String";
_fecha = "";
RDebugUtils.currentLine=17891360;
 //BA.debugLineNum = 17891360;BA.debugLine="Dim maquina As String";
_maquina = "";
RDebugUtils.currentLine=17891361;
 //BA.debugLineNum = 17891361;BA.debugLine="Dim labor As String";
_labor = "";
RDebugUtils.currentLine=17891362;
 //BA.debugLineNum = 17891362;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=17891363;
 //BA.debugLineNum = 17891363;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=17891364;
 //BA.debugLineNum = 17891364;BA.debugLine="Dim Lote As String";
_lote = "";
RDebugUtils.currentLine=17891365;
 //BA.debugLineNum = 17891365;BA.debugLine="Dim implemento As String";
_implemento = "";
RDebugUtils.currentLine=17891366;
 //BA.debugLineNum = 17891366;BA.debugLine="Dim implemento2 As String";
_implemento2 = "";
RDebugUtils.currentLine=17891367;
 //BA.debugLineNum = 17891367;BA.debugLine="Dim operario As String";
_operario = "";
RDebugUtils.currentLine=17891368;
 //BA.debugLineNum = 17891368;BA.debugLine="Dim observaciones As String";
_observaciones = "";
RDebugUtils.currentLine=17891369;
 //BA.debugLineNum = 17891369;BA.debugLine="Dim horafin As String";
_horafin = "";
RDebugUtils.currentLine=17891370;
 //BA.debugLineNum = 17891370;BA.debugLine="Dim horainicio As String";
_horainicio = "";
RDebugUtils.currentLine=17891371;
 //BA.debugLineNum = 17891371;BA.debugLine="Dim combustible As String";
_combustible = "";
RDebugUtils.currentLine=17891372;
 //BA.debugLineNum = 17891372;BA.debugLine="Dim area As String";
_area = "";
RDebugUtils.currentLine=17891373;
 //BA.debugLineNum = 17891373;BA.debugLine="Dim horaActual As String";
_horaactual = "";
RDebugUtils.currentLine=17891374;
 //BA.debugLineNum = 17891374;BA.debugLine="Dim user As String";
_user = "";
RDebugUtils.currentLine=17891375;
 //BA.debugLineNum = 17891375;BA.debugLine="Dim DeviceName As String";
_devicename = "";
RDebugUtils.currentLine=17891376;
 //BA.debugLineNum = 17891376;BA.debugLine="Dim Ascdo_Maq_Mvto_Maq As String";
_ascdo_maq_mvto_maq = "";
RDebugUtils.currentLine=17891377;
 //BA.debugLineNum = 17891377;BA.debugLine="Private EditText1HoraInicio As EditText";
_edittext1horainicio = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=17891378;
 //BA.debugLineNum = 17891378;BA.debugLine="Private EditText2HoraFim As EditText";
_edittext2horafim = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=17891379;
 //BA.debugLineNum = 17891379;BA.debugLine="Private EditText1 As EditText";
_edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=17891380;
 //BA.debugLineNum = 17891380;BA.debugLine="Private EditText2 As EditText";
_edittext2 = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=17891381;
 //BA.debugLineNum = 17891381;BA.debugLine="Dim fechaHoy As String";
_fechahoy = "";
RDebugUtils.currentLine=17891383;
 //BA.debugLineNum = 17891383;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=17891384;
 //BA.debugLineNum = 17891384;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17891385;
 //BA.debugLineNum = 17891385;BA.debugLine="Private SwiftButtonMaquina As SwiftButton";
_swiftbuttonmaquina = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=17891386;
 //BA.debugLineNum = 17891386;BA.debugLine="Private SearchTemplateMaquina As B4XSearchTemplat";
_searchtemplatemaquina = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=17891388;
 //BA.debugLineNum = 17891388;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
_swiftbuttonlabor = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=17891389;
 //BA.debugLineNum = 17891389;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
_searchtemplatelabor = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=17891391;
 //BA.debugLineNum = 17891391;BA.debugLine="Private SwiftButtonNit As SwiftButton";
_swiftbuttonnit = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=17891392;
 //BA.debugLineNum = 17891392;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
_searchtemplatenit = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=17891394;
 //BA.debugLineNum = 17891394;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
_swiftbuttonhacienda = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=17891395;
 //BA.debugLineNum = 17891395;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
_searchtemplatehacienda = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=17891397;
 //BA.debugLineNum = 17891397;BA.debugLine="Private SwiftButtonLote As SwiftButton";
_swiftbuttonlote = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=17891398;
 //BA.debugLineNum = 17891398;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
_searchtemplatelote = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=17891400;
 //BA.debugLineNum = 17891400;BA.debugLine="Private SwiftButtonImplemento As SwiftButton";
_swiftbuttonimplemento = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=17891401;
 //BA.debugLineNum = 17891401;BA.debugLine="Private SearchTemplateImplemento As B4XSearchTemp";
_searchtemplateimplemento = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=17891403;
 //BA.debugLineNum = 17891403;BA.debugLine="Private SwiftButtonImplemento2 As SwiftButton";
_swiftbuttonimplemento2 = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=17891404;
 //BA.debugLineNum = 17891404;BA.debugLine="Private SearchTemplateImplemento2 As B4XSearchTem";
_searchtemplateimplemento2 = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=17891406;
 //BA.debugLineNum = 17891406;BA.debugLine="Private SwiftButtonOperario As SwiftButton";
_swiftbuttonoperario = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=17891407;
 //BA.debugLineNum = 17891407;BA.debugLine="Private SearchTemplateOperario As B4XSearchTempla";
_searchtemplateoperario = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=17891409;
 //BA.debugLineNum = 17891409;BA.debugLine="Private SwiftButtonObservaciones As SwiftButton";
_swiftbuttonobservaciones = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=17891410;
 //BA.debugLineNum = 17891410;BA.debugLine="Private SearchTemplateObservaciones As B4XSearchT";
_searchtemplateobservaciones = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=17891411;
 //BA.debugLineNum = 17891411;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="haciendaCBX=Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=18284549;
 //BA.debugLineNum = 18284549;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=18284550;
 //BA.debugLineNum = 18284550;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=18284553;
 //BA.debugLineNum = 18284553;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18284556;
 //BA.debugLineNum = 18284556;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=18284558;
 //BA.debugLineNum = 18284558;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=18284559;
 //BA.debugLineNum = 18284559;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18284563;
 //BA.debugLineNum = 18284563;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=18284564;
 //BA.debugLineNum = 18284564;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=18284567;
 //BA.debugLineNum = 18284567;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
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
RDebugUtils.currentLine=18284572;
 //BA.debugLineNum = 18284572;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("418284572","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=18284576;
 //BA.debugLineNum = 18284576;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=18284578;
 //BA.debugLineNum = 18284578;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Private Sub SD_xComboBoxImplemento_ItemClick (Posi";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="implemento = Value";
__ref._implemento /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboximplemento2_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboximplemento2_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboximplemento2_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Private Sub SD_xComboBoxImplemento2_ItemClick (Pos";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="implemento2 = Value";
__ref._implemento2 /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="labor = Value";
__ref._labor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Lote = Value";
__ref._lote /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="Log(Lote)";
__c.LogImpl("418743298",__ref._lote /*String*/ ,0);
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxmaquina_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxmaquina_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxmaquina_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Private Sub SD_xComboBoxMaquina_ItemClick (Positio";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="maquina =Value";
__ref._maquina /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="SD_xComboBoxHacienda.Clear";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=18219013;
 //BA.debugLineNum = 18219013;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=18219016;
 //BA.debugLineNum = 18219016;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18219019;
 //BA.debugLineNum = 18219019;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=18219021;
 //BA.debugLineNum = 18219021;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=18219022;
 //BA.debugLineNum = 18219022;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18219026;
 //BA.debugLineNum = 18219026;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=18219027;
 //BA.debugLineNum = 18219027;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=18219028;
 //BA.debugLineNum = 18219028;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=18219031;
 //BA.debugLineNum = 18219031;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
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
RDebugUtils.currentLine=18219036;
 //BA.debugLineNum = 18219036;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("418219036","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=18219039;
 //BA.debugLineNum = 18219039;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=18219041;
 //BA.debugLineNum = 18219041;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Private Sub SD_xComboBoxObservaciones_ItemClick (P";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="observaciones = Value";
__ref._observaciones /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxoperario_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxoperario_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxoperario_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Private Sub SD_xComboBoxOperario_ItemClick (Positi";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="operario =Value";
__ref._operario /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Dim ItemsLote As List";
_itemslote = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="ItemsLote.Initialize";
_itemslote.Initialize();
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonhacienda_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=19398662;
 //BA.debugLineNum = 19398662;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=19398663;
 //BA.debugLineNum = 19398663;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
_haciendacompleto = __ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
_partes = parent.__c.Regex.Split(":",_haciendacompleto);
RDebugUtils.currentLine=19398665;
 //BA.debugLineNum = 19398665;BA.debugLine="haciendaCBX = Partes(0)";
__ref._haciendacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=19398666;
 //BA.debugLineNum = 19398666;BA.debugLine="ItemsLote.Clear";
_itemslote.Clear();
RDebugUtils.currentLine=19398667;
 //BA.debugLineNum = 19398667;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
_itemslote.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=19398668;
 //BA.debugLineNum = 19398668;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=19398670;
 //BA.debugLineNum = 19398670;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=19398671;
 //BA.debugLineNum = 19398671;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=19398672;
 //BA.debugLineNum = 19398672;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=19398675;
 //BA.debugLineNum = 19398675;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonhacienda_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=19398678;
 //BA.debugLineNum = 19398678;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=19398680;
 //BA.debugLineNum = 19398680;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=19398681;
 //BA.debugLineNum = 19398681;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonhacienda_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=19398685;
 //BA.debugLineNum = 19398685;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=19398686;
 //BA.debugLineNum = 19398686;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=19398690;
 //BA.debugLineNum = 19398690;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
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
RDebugUtils.currentLine=19398695;
 //BA.debugLineNum = 19398695;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("419398695","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=19398697;
 //BA.debugLineNum = 19398697;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslote);
RDebugUtils.currentLine=19398698;
 //BA.debugLineNum = 19398698;BA.debugLine="SwiftButtonLote.Enabled = True";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=19398700;
 //BA.debugLineNum = 19398700;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("419398700",__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=19398701;
 //BA.debugLineNum = 19398701;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=19398704;
 //BA.debugLineNum = 19398704;BA.debugLine="End Sub";
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
String[] _partes = null;

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
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateImple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonimplemento_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="SwiftButtonImplemento.xLBL.Text = SearchTemplate";
__ref._swiftbuttonimplemento /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="If SearchTemplateImplemento.SelectedItem.Contain";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ .contains(":")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="implemento = Partes(0) ' Asignar solo la primer";
__ref._implemento /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="Log(\"Implemento seleccionado: \" & implemento)";
parent.__c.LogImpl("419529740","Implemento seleccionado: "+__ref._implemento /*String*/ ,0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=19529742;
 //BA.debugLineNum = 19529742;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
parent.__c.LogImpl("419529742","El texto no contiene ':' por lo que no se pudo dividir.",0);
RDebugUtils.currentLine=19529743;
 //BA.debugLineNum = 19529743;BA.debugLine="implemento = SearchTemplateImplemento.SelectedI";
__ref._implemento /*String*/  = __ref._searchtemplateimplemento /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
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
RDebugUtils.currentLine=19529746;
 //BA.debugLineNum = 19529746;BA.debugLine="End Sub";
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
String[] _partes = null;

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
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateImple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonimplemento2_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="SwiftButtonImplemento2.xLBL.Text = SearchTemplat";
__ref._swiftbuttonimplemento2 /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=19595271;
 //BA.debugLineNum = 19595271;BA.debugLine="If SearchTemplateImplemento2.SelectedItem.Contai";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ .contains(":")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=19595272;
 //BA.debugLineNum = 19595272;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=19595273;
 //BA.debugLineNum = 19595273;BA.debugLine="implemento2 = Partes(0) ' Asignar solo la prime";
__ref._implemento2 /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=19595275;
 //BA.debugLineNum = 19595275;BA.debugLine="Log(\"Implemento2 seleccionado: \" & implemento2)";
parent.__c.LogImpl("419595275","Implemento2 seleccionado: "+__ref._implemento2 /*String*/ ,0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=19595277;
 //BA.debugLineNum = 19595277;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
parent.__c.LogImpl("419595277","El texto no contiene ':' por lo que no se pudo dividir.",0);
RDebugUtils.currentLine=19595278;
 //BA.debugLineNum = 19595278;BA.debugLine="implemento2 = SearchTemplateImplemento2.Selecte";
__ref._implemento2 /*String*/  = __ref._searchtemplateimplemento2 /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
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
RDebugUtils.currentLine=19595281;
 //BA.debugLineNum = 19595281;BA.debugLine="End Sub";
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
String[] _partes = null;

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
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonlabor_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
__ref._swiftbuttonlabor /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=19267591;
 //BA.debugLineNum = 19267591;BA.debugLine="If SearchTemplateLabor.SelectedItem.Contains(\":\"";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ .contains(":")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=19267592;
 //BA.debugLineNum = 19267592;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=19267593;
 //BA.debugLineNum = 19267593;BA.debugLine="labor = Partes(0) ' Asignar solo la primera par";
__ref._labor /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=19267596;
 //BA.debugLineNum = 19267596;BA.debugLine="Log(\"Texto completo: \" & SearchTemplateLabor.Se";
parent.__c.LogImpl("419267596","Texto completo: "+__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ,0);
RDebugUtils.currentLine=19267597;
 //BA.debugLineNum = 19267597;BA.debugLine="Log(\"Labor seleccionada: \" & labor)";
parent.__c.LogImpl("419267597","Labor seleccionada: "+__ref._labor /*String*/ ,0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=19267599;
 //BA.debugLineNum = 19267599;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
parent.__c.LogImpl("419267599","El texto no contiene ':' por lo que no se pudo dividir.",0);
RDebugUtils.currentLine=19267600;
 //BA.debugLineNum = 19267600;BA.debugLine="labor = SearchTemplateLabor.SelectedItem ' Asig";
__ref._labor /*String*/  = __ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
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
RDebugUtils.currentLine=19267603;
 //BA.debugLineNum = 19267603;BA.debugLine="Log(labor)";
parent.__c.LogImpl("419267603",__ref._labor /*String*/ ,0);
RDebugUtils.currentLine=19267604;
 //BA.debugLineNum = 19267604;BA.debugLine="End Sub";
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
String[] _partes = null;

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
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonlote_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.S";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=19464198;
 //BA.debugLineNum = 19464198;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=19464199;
 //BA.debugLineNum = 19464199;BA.debugLine="Lote= Partes(0) ' Asignar solo la primera parte";
__ref._lote /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=19464201;
 //BA.debugLineNum = 19464201;BA.debugLine="Log(Lote)";
parent.__c.LogImpl("419464201",__ref._lote /*String*/ ,0);
RDebugUtils.currentLine=19464202;
 //BA.debugLineNum = 19464202;BA.debugLine="End Sub";
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
String[] _partes = null;

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
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateMaqui";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonmaquina_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="SwiftButtonMaquina.xLBL.Text = SearchTemplateMaq";
__ref._swiftbuttonmaquina /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=19202055;
 //BA.debugLineNum = 19202055;BA.debugLine="If SearchTemplateMaquina.SelectedItem.Contains(\"";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ .contains(":")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=19202056;
 //BA.debugLineNum = 19202056;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=19202057;
 //BA.debugLineNum = 19202057;BA.debugLine="maquina = Partes(0) ' Asignar solo la primera p";
__ref._maquina /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=19202059;
 //BA.debugLineNum = 19202059;BA.debugLine="Log(\"Máquina seleccionada: \" & maquina)";
parent.__c.LogImpl("419202059","Máquina seleccionada: "+__ref._maquina /*String*/ ,0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=19202061;
 //BA.debugLineNum = 19202061;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
parent.__c.LogImpl("419202061","El texto no contiene ':' por lo que no se pudo dividir.",0);
RDebugUtils.currentLine=19202062;
 //BA.debugLineNum = 19202062;BA.debugLine="maquina = SearchTemplateMaquina.SelectedItem '";
__ref._maquina /*String*/  = __ref._searchtemplatemaquina /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
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
RDebugUtils.currentLine=19202065;
 //BA.debugLineNum = 19202065;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Dim ItemsHacienda As List";
_itemshacienda = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="ItemsHacienda.Initialize";
_itemshacienda.Initialize();
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonnit_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=19333125;
 //BA.debugLineNum = 19333125;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
__ref._swiftbuttonnit /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=19333126;
 //BA.debugLineNum = 19333126;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
_nitcompleto = __ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
_partes = parent.__c.Regex.Split(":",_nitcompleto);
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="nitEmpresaCBX = Partes(0)";
__ref._nitempresacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=19333129;
 //BA.debugLineNum = 19333129;BA.debugLine="ItemsHacienda.Clear";
_itemshacienda.Clear();
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
_itemshacienda.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=19333131;
 //BA.debugLineNum = 19333131;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=19333133;
 //BA.debugLineNum = 19333133;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=19333134;
 //BA.debugLineNum = 19333134;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=19333135;
 //BA.debugLineNum = 19333135;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)(__ref._nitempresacbx /*String*/ )});
RDebugUtils.currentLine=19333138;
 //BA.debugLineNum = 19333138;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonnit_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=19333141;
 //BA.debugLineNum = 19333141;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=19333143;
 //BA.debugLineNum = 19333143;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=19333144;
 //BA.debugLineNum = 19333144;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonnit_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=19333148;
 //BA.debugLineNum = 19333148;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=19333149;
 //BA.debugLineNum = 19333149;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=19333150;
 //BA.debugLineNum = 19333150;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=19333155;
 //BA.debugLineNum = 19333155;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
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
RDebugUtils.currentLine=19333160;
 //BA.debugLineNum = 19333160;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("419333160","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=19333162;
 //BA.debugLineNum = 19333162;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemshacienda);
RDebugUtils.currentLine=19333163;
 //BA.debugLineNum = 19333163;BA.debugLine="SwiftButtonHacienda.Enabled = True";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=19333164;
 //BA.debugLineNum = 19333164;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("419333164",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=19333166;
 //BA.debugLineNum = 19333166;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=19333169;
 //BA.debugLineNum = 19333169;BA.debugLine="End Sub";
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
String[] _partes = null;

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
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateObser";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonobservaciones_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateobservaciones /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="SwiftButtonObservaciones.xLBL.Text = SearchTempl";
__ref._swiftbuttonobservaciones /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateobservaciones /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplateobservaciones /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=19726344;
 //BA.debugLineNum = 19726344;BA.debugLine="Dim observaciones As String = Partes(0) ' Guarda";
parent._observaciones = _partes[(int) (0)];
RDebugUtils.currentLine=19726348;
 //BA.debugLineNum = 19726348;BA.debugLine="Log(\"Primera parte (observacionCBX): \" & observa";
parent.__c.LogImpl("419726348","Primera parte (observacionCBX): "+__ref._observaciones /*String*/ ,0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=19726350;
 //BA.debugLineNum = 19726350;BA.debugLine="Log(\"Operación cancelada por el usuario.\")";
parent.__c.LogImpl("419726350","Operación cancelada por el usuario.",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=19726352;
 //BA.debugLineNum = 19726352;BA.debugLine="End Sub";
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
String[] _partes = null;

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
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateOpera";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "swiftbuttonoperario_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="SwiftButtonOperario.xLBL.Text = SearchTemplateOp";
__ref._swiftbuttonoperario /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="If SearchTemplateOperario.SelectedItem.Contains(";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ .contains(":")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="operario = Partes(0) ' Asignar solo la primera";
__ref._operario /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=19660812;
 //BA.debugLineNum = 19660812;BA.debugLine="Log(\"Operario seleccionado: \" & operario)";
parent.__c.LogImpl("419660812","Operario seleccionado: "+__ref._operario /*String*/ ,0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=19660814;
 //BA.debugLineNum = 19660814;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
parent.__c.LogImpl("419660814","El texto no contiene ':' por lo que no se pudo dividir.",0);
RDebugUtils.currentLine=19660815;
 //BA.debugLineNum = 19660815;BA.debugLine="operario = SearchTemplateOperario.SelectedItem";
__ref._operario /*String*/  = __ref._searchtemplateoperario /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
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
RDebugUtils.currentLine=19660818;
 //BA.debugLineNum = 19660818;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}