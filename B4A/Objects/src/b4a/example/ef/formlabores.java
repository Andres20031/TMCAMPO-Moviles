package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formlabores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formlabores");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.formlabores.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _label13time = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14time = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public String _rdclink = "";
public String _fechainicio = "";
public String _fechafin = "";
public String _fechafmrto = "";
public String _horasistema = "";
public String _lotecbx = "";
public String _elementolabor = "";
public String _elementogasto = "";
public int _arealabor = 0;
public int _arealote = 0;
public int _consecutivo = 0;
public String _tipolabor = "";
public String _haciendacbx = "";
public String _nitempresacbx = "";
public anywheresoftware.b4a.objects.PanelWrapper _panel2geral = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxtiporiego = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3geral = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxcodigovariedad = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxtipolabranza = null;
public int _cantidadinsumos = 0;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxinsumo = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextcantidadinsumo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonaddinsumo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondeleteinsumo = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel0geral = null;
public String _idinsumo = "";
public String _nameinsumo = "";
public String _cantinsumo = "";
public anywheresoftware.b4a.objects.LabelWrapper _labelcantidadinsumos = null;
public b4a.example.ef.b4xtable _b4xtable1 = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelinsumoselect = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltittleinsumo = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelinsumoselect = null;
public int _ideliminartabla = 0;
public String _tiporiego = "";
public String _procedenciariego = "";
public String _caudalriego = "";
public String _cantidadriego = "";
public String _codigosiembra = "";
public int _distanciasiembra = 0;
public int _bandereosiembra = 0;
public int _toneladasemillasiembra = 0;
public String _procedenciasiembra = "";
public String _tipolabranzasiembra = "";
public int _numeropaquetessiembra = 0;
public int _numeromacollosiembra = 0;
public String _devicename = "";
public String _user = "";
public String _fechaactual = "";
public int _consecutivosiembra = 0;
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
public b4a.example.ef.swiftbutton _swiftbuttonelemento = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateelemento = null;
public b4a.example.ef.swiftbutton _swiftbuttontypeform = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatetypeform = null;
public b4a.example.ef.swiftbutton _swiftbuttoninsumo = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateinsumo = null;
public b4a.example.ef.swiftbutton _swiftbuttonriego = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateriego = null;
public b4a.example.ef.swiftbutton _swiftbuttontipolabranza = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatetipolabranza = null;
public b4a.example.ef.swiftbutton _swiftbuttonvariedad = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatevariedad = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.formlabores __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formlabores __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
String[] _dateparts = null;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
RDebugUtils.currentLine=14680076;
 //BA.debugLineNum = 14680076;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
RDebugUtils.currentLine=14680078;
 //BA.debugLineNum = 14680078;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
RDebugUtils.currentLine=14680082;
 //BA.debugLineNum = 14680082;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=14680085;
 //BA.debugLineNum = 14680085;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=14680088;
 //BA.debugLineNum = 14680088;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=14680091;
 //BA.debugLineNum = 14680091;BA.debugLine="fechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=14680094;
 //BA.debugLineNum = 14680094;BA.debugLine="Log(\"Fecha inicio: \" & fechaInicio)";
__c.LogImpl("414680094","Fecha inicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=14680095;
 //BA.debugLineNum = 14680095;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formlabores __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
String[] _dateparts = null;
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
RDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
RDebugUtils.currentLine=14745614;
 //BA.debugLineNum = 14745614;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
RDebugUtils.currentLine=14745618;
 //BA.debugLineNum = 14745618;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=14745621;
 //BA.debugLineNum = 14745621;BA.debugLine="Label14Time.Text = formattedDate";
__ref._label14time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=14745624;
 //BA.debugLineNum = 14745624;BA.debugLine="Panel3.Visible = False";
__ref._panel3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=14745627;
 //BA.debugLineNum = 14745627;BA.debugLine="fechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=14745630;
 //BA.debugLineNum = 14745630;BA.debugLine="Log(\"Fecha fin: \" & fechaFin)";
__c.LogImpl("414745630","Fecha fin: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=14745631;
 //BA.debugLineNum = 14745631;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
anywheresoftware.b4a.objects.collections.List _itemsnit = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _razonsocial = "";
String _nit = "";
anywheresoftware.b4a.objects.collections.List _itemslabor = null;
b4a.example.ef.main._dbcommand _cmdlabormaquina = null;
b4a.example.ef.httpjob _j3 = null;
b4a.example.ef.main._dbresult _reslabormaquina = null;
Object[] _rowlabormaquina = null;
String _codigolabormaquina = "";
String _descripcionlabormaquina = "";
anywheresoftware.b4a.objects.collections.List _itemselemento = null;
b4a.example.ef.main._dbcommand _cmdelementogasto = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _reselementogasto = null;
Object[] _rowelementogasto = null;
String _codigoelementogasto = "";
String _descripcionelementogasto = "";
anywheresoftware.b4a.objects.collections.List _itemstypeform = null;
b4a.example.ef.main._dbcommand _cmdultimoregistro = null;
b4a.example.ef.httpjob _j5 = null;
b4a.example.ef.main._dbresult _resultimoregistro = null;
Object[] _rowregistro = null;
int _ultimoregistro = 0;
int _ultimoregistrosiembra = 0;
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;
anywheresoftware.b4a.BA.IterableList group39;
int index39;
int groupLen39;
anywheresoftware.b4a.BA.IterableList group58;
int index58;
int groupLen58;
anywheresoftware.b4a.BA.IterableList group81;
int index81;
int groupLen81;
anywheresoftware.b4a.BA.IterableList group95;
int index95;
int groupLen95;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=14221320;
 //BA.debugLineNum = 14221320;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=14221321;
 //BA.debugLineNum = 14221321;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=14221328;
 //BA.debugLineNum = 14221328;BA.debugLine="SearchTemplateNit.Initialize";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221330;
 //BA.debugLineNum = 14221330;BA.debugLine="Dim ItemsNit As List";
_itemsnit = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14221331;
 //BA.debugLineNum = 14221331;BA.debugLine="ItemsNit.Initialize";
_itemsnit.Initialize();
RDebugUtils.currentLine=14221332;
 //BA.debugLineNum = 14221332;BA.debugLine="ItemsNit.Add(\"Seleccionar:\")";
_itemsnit.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=14221335;
 //BA.debugLineNum = 14221335;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=14221336;
 //BA.debugLineNum = 14221336;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 51;
return;
case 51:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=14221337;
 //BA.debugLineNum = 14221337;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=14221338;
 //BA.debugLineNum = 14221338;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=14221339;
 //BA.debugLineNum = 14221339;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 52;
return;
case 52:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=14221340;
 //BA.debugLineNum = 14221340;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group18 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 53;
if (true) break;

case 53:
//C
this.state = 7;
if (index18 < groupLen18) {
this.state = 6;
_row = (Object[])(group18.Get(index18));}
if (true) break;

case 54:
//C
this.state = 53;
index18++;
if (true) break;

case 6:
//C
this.state = 54;
RDebugUtils.currentLine=14221341;
 //BA.debugLineNum = 14221341;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=14221342;
 //BA.debugLineNum = 14221342;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=14221343;
 //BA.debugLineNum = 14221343;BA.debugLine="ItemsNit.Add(nit&\":\"&razonSocial )";
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
RDebugUtils.currentLine=14221346;
 //BA.debugLineNum = 14221346;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("414221346","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=14221348;
 //BA.debugLineNum = 14221348;BA.debugLine="SearchTemplateNit.SetItems(ItemsNit)";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsnit);
RDebugUtils.currentLine=14221349;
 //BA.debugLineNum = 14221349;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=14221352;
 //BA.debugLineNum = 14221352;BA.debugLine="SearchTemplateHacienda.Initialize";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221354;
 //BA.debugLineNum = 14221354;BA.debugLine="SearchTemplateLote.Initialize";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221359;
 //BA.debugLineNum = 14221359;BA.debugLine="SearchTemplateLabor.Initialize";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221361;
 //BA.debugLineNum = 14221361;BA.debugLine="Dim ItemsLabor As List";
_itemslabor = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14221362;
 //BA.debugLineNum = 14221362;BA.debugLine="ItemsLabor.Initialize";
_itemslabor.Initialize();
RDebugUtils.currentLine=14221363;
 //BA.debugLineNum = 14221363;BA.debugLine="ItemsLabor.Add(\"Seleccionar:\")";
_itemslabor.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=14221366;
 //BA.debugLineNum = 14221366;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor_maq",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=14221367;
 //BA.debugLineNum = 14221367;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 55;
return;
case 55:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=14221368;
 //BA.debugLineNum = 14221368;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=14221369;
 //BA.debugLineNum = 14221369;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (null,_j3,"req_labormaquina");
RDebugUtils.currentLine=14221370;
 //BA.debugLineNum = 14221370;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 56;
return;
case 56:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=14221371;
 //BA.debugLineNum = 14221371;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
if (true) break;

case 14:
//for
this.state = 17;
group39 = _reslabormaquina.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index39 = 0;
groupLen39 = group39.getSize();
this.state = 57;
if (true) break;

case 57:
//C
this.state = 17;
if (index39 < groupLen39) {
this.state = 16;
_rowlabormaquina = (Object[])(group39.Get(index39));}
if (true) break;

case 58:
//C
this.state = 57;
index39++;
if (true) break;

case 16:
//C
this.state = 58;
RDebugUtils.currentLine=14221372;
 //BA.debugLineNum = 14221372;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
RDebugUtils.currentLine=14221373;
 //BA.debugLineNum = 14221373;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
RDebugUtils.currentLine=14221374;
 //BA.debugLineNum = 14221374;BA.debugLine="ItemsLabor.Add(codigoLaborMaquina&\":\"&descripci";
_itemslabor.Add((Object)(_codigolabormaquina+":"+_descripcionlabormaquina));
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
RDebugUtils.currentLine=14221377;
 //BA.debugLineNum = 14221377;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("414221377","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=14221379;
 //BA.debugLineNum = 14221379;BA.debugLine="SearchTemplateLabor.SetItems(ItemsLabor)";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslabor);
RDebugUtils.currentLine=14221380;
 //BA.debugLineNum = 14221380;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=14221384;
 //BA.debugLineNum = 14221384;BA.debugLine="SearchTemplateElemento.Initialize";
__ref._searchtemplateelemento /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221386;
 //BA.debugLineNum = 14221386;BA.debugLine="Dim ItemsElemento As List";
_itemselemento = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14221387;
 //BA.debugLineNum = 14221387;BA.debugLine="ItemsElemento.Initialize";
_itemselemento.Initialize();
RDebugUtils.currentLine=14221388;
 //BA.debugLineNum = 14221388;BA.debugLine="ItemsElemento.Add(\"Seleccionar:\")";
_itemselemento.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=14221392;
 //BA.debugLineNum = 14221392;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
_cmdelementogasto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_elementoGasto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=14221393;
 //BA.debugLineNum = 14221393;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdelementogasto,(int) (0),parent.__c.Null)));
this.state = 59;
return;
case 59:
//C
this.state = 21;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=14221394;
 //BA.debugLineNum = 14221394;BA.debugLine="If j4.Success Then";
if (true) break;

case 21:
//if
this.state = 30;
if (_j4._success /*boolean*/ ) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=14221395;
 //BA.debugLineNum = 14221395;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
_req._handlejobasync /*void*/ (null,_j4,"req_elementoGasto");
RDebugUtils.currentLine=14221396;
 //BA.debugLineNum = 14221396;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
parent.__c.WaitFor("req_elementogasto_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 60;
return;
case 60:
//C
this.state = 24;
_reselementogasto = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=14221397;
 //BA.debugLineNum = 14221397;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
if (true) break;

case 24:
//for
this.state = 27;
group58 = _reselementogasto.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index58 = 0;
groupLen58 = group58.getSize();
this.state = 61;
if (true) break;

case 61:
//C
this.state = 27;
if (index58 < groupLen58) {
this.state = 26;
_rowelementogasto = (Object[])(group58.Get(index58));}
if (true) break;

case 62:
//C
this.state = 61;
index58++;
if (true) break;

case 26:
//C
this.state = 62;
RDebugUtils.currentLine=14221398;
 //BA.debugLineNum = 14221398;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
_codigoelementogasto = BA.ObjectToString(_rowelementogasto[(int) (0)]);
RDebugUtils.currentLine=14221399;
 //BA.debugLineNum = 14221399;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto[(int) (1)]);
RDebugUtils.currentLine=14221401;
 //BA.debugLineNum = 14221401;BA.debugLine="ItemsElemento.Add(codigoElementoGasto&\":\"&descr";
_itemselemento.Add((Object)(_codigoelementogasto+":"+_descripcionelementogasto));
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
RDebugUtils.currentLine=14221404;
 //BA.debugLineNum = 14221404;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("414221404","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=14221406;
 //BA.debugLineNum = 14221406;BA.debugLine="SearchTemplateElemento.SetItems(ItemsElemento)";
__ref._searchtemplateelemento /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemselemento);
RDebugUtils.currentLine=14221407;
 //BA.debugLineNum = 14221407;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=14221413;
 //BA.debugLineNum = 14221413;BA.debugLine="SearchTemplateTypeForm.Initialize";
__ref._searchtemplatetypeform /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221415;
 //BA.debugLineNum = 14221415;BA.debugLine="Dim ItemsTypeForm As List";
_itemstypeform = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14221416;
 //BA.debugLineNum = 14221416;BA.debugLine="ItemsTypeForm.Initialize";
_itemstypeform.Initialize();
RDebugUtils.currentLine=14221417;
 //BA.debugLineNum = 14221417;BA.debugLine="ItemsTypeForm.Add(\"0\"&\":\"&\"Insumo\")";
_itemstypeform.Add((Object)("0"+":"+"Insumo"));
RDebugUtils.currentLine=14221418;
 //BA.debugLineNum = 14221418;BA.debugLine="ItemsTypeForm.Add(\"1\"&\":\"&\"Siembra\")";
_itemstypeform.Add((Object)("1"+":"+"Siembra"));
RDebugUtils.currentLine=14221419;
 //BA.debugLineNum = 14221419;BA.debugLine="ItemsTypeForm.Add(\"2\"&\":\"&\"Riego\")";
_itemstypeform.Add((Object)("2"+":"+"Riego"));
RDebugUtils.currentLine=14221420;
 //BA.debugLineNum = 14221420;BA.debugLine="SearchTemplateTypeForm.SetItems(ItemsTypeForm)";
__ref._searchtemplatetypeform /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemstypeform);
RDebugUtils.currentLine=14221424;
 //BA.debugLineNum = 14221424;BA.debugLine="data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=14221427;
 //BA.debugLineNum = 14221427;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdLabor",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=14221428;
 //BA.debugLineNum = 14221428;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 63;
return;
case 63:
//C
this.state = 31;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=14221430;
 //BA.debugLineNum = 14221430;BA.debugLine="If j5.Success Then";
if (true) break;

case 31:
//if
this.state = 40;
if (_j5._success /*boolean*/ ) { 
this.state = 33;
}else {
this.state = 39;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=14221431;
 //BA.debugLineNum = 14221431;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=14221432;
 //BA.debugLineNum = 14221432;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 64;
return;
case 64:
//C
this.state = 34;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=14221434;
 //BA.debugLineNum = 14221434;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
if (true) break;

case 34:
//for
this.state = 37;
group81 = _resultimoregistro.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index81 = 0;
groupLen81 = group81.getSize();
this.state = 65;
if (true) break;

case 65:
//C
this.state = 37;
if (index81 < groupLen81) {
this.state = 36;
_rowregistro = (Object[])(group81.Get(index81));}
if (true) break;

case 66:
//C
this.state = 65;
index81++;
if (true) break;

case 36:
//C
this.state = 66;
RDebugUtils.currentLine=14221435;
 //BA.debugLineNum = 14221435;BA.debugLine="Dim ultimoRegistro As Int = rowRegistro(0) ' Nu";
_ultimoregistro = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=14221436;
 //BA.debugLineNum = 14221436;BA.debugLine="Log(\"Último Registro obtenido: \" & ultimoRegist";
parent.__c.LogImpl("414221436","Último Registro obtenido: "+BA.NumberToString(_ultimoregistro),0);
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
RDebugUtils.currentLine=14221440;
 //BA.debugLineNum = 14221440;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("414221440","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=14221443;
 //BA.debugLineNum = 14221443;BA.debugLine="consecutivo = ultimoRegistro + 1";
__ref._consecutivo /*int*/  = (int) (_ultimoregistro+1);
RDebugUtils.currentLine=14221445;
 //BA.debugLineNum = 14221445;BA.debugLine="Log(consecutivo)";
parent.__c.LogImpl("414221445",BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=14221447;
 //BA.debugLineNum = 14221447;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdSiembra",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=14221448;
 //BA.debugLineNum = 14221448;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 67;
return;
case 67:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=14221450;
 //BA.debugLineNum = 14221450;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=14221451;
 //BA.debugLineNum = 14221451;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=14221452;
 //BA.debugLineNum = 14221452;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 68;
return;
case 68:
//C
this.state = 44;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=14221454;
 //BA.debugLineNum = 14221454;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
if (true) break;

case 44:
//for
this.state = 47;
group95 = _resultimoregistro.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index95 = 0;
groupLen95 = group95.getSize();
this.state = 69;
if (true) break;

case 69:
//C
this.state = 47;
if (index95 < groupLen95) {
this.state = 46;
_rowregistro = (Object[])(group95.Get(index95));}
if (true) break;

case 70:
//C
this.state = 69;
index95++;
if (true) break;

case 46:
//C
this.state = 70;
RDebugUtils.currentLine=14221455;
 //BA.debugLineNum = 14221455;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=14221456;
 //BA.debugLineNum = 14221456;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("414221456","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
RDebugUtils.currentLine=14221460;
 //BA.debugLineNum = 14221460;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("414221460","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = -1;
;
RDebugUtils.currentLine=14221463;
 //BA.debugLineNum = 14221463;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
__ref._consecutivosiembra /*int*/  = (int) (_ultimoregistrosiembra+1);
RDebugUtils.currentLine=14221465;
 //BA.debugLineNum = 14221465;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("414221465",BA.NumberToString(__ref._consecutivosiembra /*int*/ ),0);
RDebugUtils.currentLine=14221467;
 //BA.debugLineNum = 14221467;BA.debugLine="SearchTemplateInsumo.Initialize";
__ref._searchtemplateinsumo /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221469;
 //BA.debugLineNum = 14221469;BA.debugLine="SearchTemplateRiego.Initialize";
__ref._searchtemplateriego /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221471;
 //BA.debugLineNum = 14221471;BA.debugLine="SearchTemplateTipoLabranza.Initialize";
__ref._searchtemplatetipolabranza /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221473;
 //BA.debugLineNum = 14221473;BA.debugLine="SearchTemplateVariedad.Initialize";
__ref._searchtemplatevariedad /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14221474;
 //BA.debugLineNum = 14221474;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
_panel.LoadLayout("addLaboresUI",ba);
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=14286858;
 //BA.debugLineNum = 14286858;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=14286859;
 //BA.debugLineNum = 14286859;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formlabores __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formlabores __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="Base = Root";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="Dialog.Initialize (Base)";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=14090246;
 //BA.debugLineNum = 14090246;BA.debugLine="Dialog.Title = \"Buscador\"";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._title /*Object*/  = (Object)("Buscador");
RDebugUtils.currentLine=14090247;
 //BA.debugLineNum = 14090247;BA.debugLine="End Sub";
return "";
}
public String  _b4xtable1_cellclicked(b4a.example.ef.formlabores __ref,String _columnid,long _rowid) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "b4xtable1_cellclicked", false))
	 {return ((String) Debug.delegate(ba, "b4xtable1_cellclicked", new Object[] {_columnid,_rowid}));}
anywheresoftware.b4a.objects.collections.Map _rowdata = null;
String _id = "";
String _nombreinsu = "";
int _cantidadinsu = 0;
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Log(\"COLUM ID\"&ColumnId)";
__c.LogImpl("416842753","COLUM ID"+_columnid,0);
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="Log(\"ROW ID\"&RowId)";
__c.LogImpl("416842754","ROW ID"+BA.NumberToString(_rowid),0);
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="PanelTittleInsumo.Visible = True";
__ref._paneltittleinsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="Dim ID As String  = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
RDebugUtils.currentLine=16842758;
 //BA.debugLineNum = 16842758;BA.debugLine="Dim nombreInsu As String = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
RDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="Dim cantidadInsu As Int = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
RDebugUtils.currentLine=16842760;
 //BA.debugLineNum = 16842760;BA.debugLine="LabelInsumoSelect.Text = \"- \"&nombreInsu&\" / \"&\"C";
__ref._labelinsumoselect /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- "+_nombreinsu+" / "+"Cantidad: "+BA.NumberToString(_cantidadinsu)));
RDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="PanelInsumoSelect.Visible = True";
__ref._panelinsumoselect /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=16842762;
 //BA.debugLineNum = 16842762;BA.debugLine="ButtonDeleteInsumo.Visible = True";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=16842764;
 //BA.debugLineNum = 16842764;BA.debugLine="idEliminarTabla = rowData.Get(\"#\")";
__ref._ideliminartabla /*int*/  = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("#"))));
RDebugUtils.currentLine=16842765;
 //BA.debugLineNum = 16842765;BA.debugLine="Log(idEliminarTabla)";
__c.LogImpl("416842765",BA.NumberToString(__ref._ideliminartabla /*int*/ ),0);
RDebugUtils.currentLine=16842766;
 //BA.debugLineNum = 16842766;BA.debugLine="End Sub";
return "";
}
public String  _buttonaddinsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttonaddinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "buttonaddinsumo_click", null));}
int _numberinsumo = 0;
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Private Sub ButtonAddInsumo_Click";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
if ((__ref._nameinsumo /*String*/ ).equals("") && (__ref._idinsumo /*String*/ ).equals("") && (__ref._cantinsumo /*String*/ ).equals("")) { 
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
__c.MsgboxAsync(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo"),BA.ObjectToCharSequence("Error"),ba);
 }else {
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
__ref._cantidadinsumos /*int*/  = (int) (__ref._cantidadinsumos /*int*/ +1);
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="Dim numberInsumo As Int = cantidadInsumos";
_numberinsumo = __ref._cantidadinsumos /*int*/ ;
RDebugUtils.currentLine=16711686;
 //BA.debugLineNum = 16711686;BA.debugLine="data.Add(Array As Object(numberInsumo,IDINSUMO,N";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new Object[]{(Object)(_numberinsumo),(Object)(__ref._idinsumo /*String*/ ),(Object)(__ref._nameinsumo /*String*/ ),(Object)(__ref._cantinsumo /*String*/ )}));
RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="B4XTable1.SetData(data)";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
__ref._edittextcantidadinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="End Sub";
return "";
}
public String  _buttondeleteinsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttondeleteinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "buttondeleteinsumo_click", null));}
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="RemoveInsumoFromData(idEliminarTabla)";
__ref._removeinsumofromdata /*String*/ (null,__ref._ideliminartabla /*int*/ );
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="ButtonDeleteInsumo.Visible = False";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=16777221;
 //BA.debugLineNum = 16777221;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
__ref._cantidadinsumos /*int*/  = (int) (__ref._cantidadinsumos /*int*/ -1);
RDebugUtils.currentLine=16777222;
 //BA.debugLineNum = 16777222;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=16777223;
 //BA.debugLineNum = 16777223;BA.debugLine="PanelTittleInsumo.Visible = False";
__ref._paneltittleinsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=16777224;
 //BA.debugLineNum = 16777224;BA.debugLine="PanelInsumoSelect.Visible = False";
__ref._panelinsumoselect /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=16777225;
 //BA.debugLineNum = 16777225;BA.debugLine="ButtonDeleteInsumo.Visible = False";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=16777226;
 //BA.debugLineNum = 16777226;BA.debugLine="End Sub";
return "";
}
public String  _removeinsumofromdata(b4a.example.ef.formlabores __ref,int _insumoid) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeinsumofromdata", false))
	 {return ((String) Debug.delegate(ba, "removeinsumofromdata", new Object[] {_insumoid}));}
int _i = 0;
Object[] _arrayelement = null;
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Sub RemoveInsumoFromData(insumoID As Int)";
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="For i = data.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="Dim arrayElement() As Object = data.Get(i)";
_arrayelement = (Object[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=16908295;
 //BA.debugLineNum = 16908295;BA.debugLine="If arrayElement(0) = insumoID Then";
if ((_arrayelement[(int) (0)]).equals((Object)(_insumoid))) { 
RDebugUtils.currentLine=16908297;
 //BA.debugLineNum = 16908297;BA.debugLine="data.RemoveAt(i)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=16908298;
 //BA.debugLineNum = 16908298;BA.debugLine="B4XTable1.SetData(data)";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ );
 };
 }
};
RDebugUtils.currentLine=16908302;
 //BA.debugLineNum = 16908302;BA.debugLine="End Sub";
return "";
}
public void  _buttoninsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttoninsumo_click", false))
	 {Debug.delegate(ba, "buttoninsumo_click", null); return;}
ResumableSub_ButtonInsumo_Click rsub = new ResumableSub_ButtonInsumo_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonInsumo_Click extends BA.ResumableSub {
public ResumableSub_ButtonInsumo_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _i = 0;
long _rowid = 0L;
anywheresoftware.b4a.objects.collections.Map _rowdata = null;
String _id = "";
String _nombreinsu = "";
int _cantidadinsu = 0;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
long _fecha = 0L;
int step1;
int limit1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="For i = 0 To B4XTable1.VisibleRowIds.Size - 1";
if (true) break;

case 1:
//for
this.state = 34;
step1 = 1;
limit1 = (int) (__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 34;
if ((step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1)) this.state = 3;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step1)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="Dim RowId As Long = B4XTable1.VisibleRowIds.Get(";
_rowid = BA.ObjectToLongNumber(__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=17039369;
 //BA.debugLineNum = 17039369;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=17039372;
 //BA.debugLineNum = 17039372;BA.debugLine="Dim ID As String";
_id = "";
RDebugUtils.currentLine=17039373;
 //BA.debugLineNum = 17039373;BA.debugLine="If rowData.ContainsKey(\"ID\") And rowData.Get(\"ID";
if (true) break;

case 4:
//if
this.state = 9;
if (_rowdata.ContainsKey((Object)("ID")) && _rowdata.Get((Object)("ID"))!= null) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=17039374;
 //BA.debugLineNum = 17039374;BA.debugLine="ID = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=17039376;
 //BA.debugLineNum = 17039376;BA.debugLine="ID = \"No ID\" ' Valor predeterminado si no se en";
_id = "No ID";
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=17039380;
 //BA.debugLineNum = 17039380;BA.debugLine="Dim nombreInsu As String";
_nombreinsu = "";
RDebugUtils.currentLine=17039381;
 //BA.debugLineNum = 17039381;BA.debugLine="If rowData.ContainsKey(\"NOMBRE\") And rowData.Get";
if (true) break;

case 10:
//if
this.state = 15;
if (_rowdata.ContainsKey((Object)("NOMBRE")) && _rowdata.Get((Object)("NOMBRE"))!= null) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=17039382;
 //BA.debugLineNum = 17039382;BA.debugLine="nombreInsu = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=17039384;
 //BA.debugLineNum = 17039384;BA.debugLine="nombreInsu = \"Desconocido\"";
_nombreinsu = "Desconocido";
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=17039388;
 //BA.debugLineNum = 17039388;BA.debugLine="Dim cantidadInsu As Int";
_cantidadinsu = 0;
RDebugUtils.currentLine=17039389;
 //BA.debugLineNum = 17039389;BA.debugLine="If rowData.ContainsKey(\"CANTIDAD\") And rowData.G";
if (true) break;

case 16:
//if
this.state = 33;
if (_rowdata.ContainsKey((Object)("CANTIDAD")) && _rowdata.Get((Object)("CANTIDAD"))!= null) { 
this.state = 18;
}else {
this.state = 32;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=17039390;
 //BA.debugLineNum = 17039390;BA.debugLine="Try";
if (true) break;

case 19:
//try
this.state = 30;
this.catchState = 29;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 29;
RDebugUtils.currentLine=17039391;
 //BA.debugLineNum = 17039391;BA.debugLine="cantidadInsu = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
RDebugUtils.currentLine=17039393;
 //BA.debugLineNum = 17039393;BA.debugLine="Log(\"Fila \" & (i + 1) & \":\")";
parent.__c.LogImpl("417039393","Fila "+BA.NumberToString((_i+1))+":",0);
RDebugUtils.currentLine=17039394;
 //BA.debugLineNum = 17039394;BA.debugLine="Log(\" - ID: \" & ID)";
parent.__c.LogImpl("417039394"," - ID: "+_id,0);
RDebugUtils.currentLine=17039395;
 //BA.debugLineNum = 17039395;BA.debugLine="Log(\" - NOMBRE: \" & nombreInsu)";
parent.__c.LogImpl("417039395"," - NOMBRE: "+_nombreinsu,0);
RDebugUtils.currentLine=17039396;
 //BA.debugLineNum = 17039396;BA.debugLine="Log(\" - CANTIDAD: \" & cantidadInsu)";
parent.__c.LogImpl("417039396"," - CANTIDAD: "+BA.NumberToString(_cantidadinsu),0);
RDebugUtils.currentLine=17039399;
 //BA.debugLineNum = 17039399;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=17039400;
 //BA.debugLineNum = 17039400;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=17039403;
 //BA.debugLineNum = 17039403;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborInsumo",new Object[]{(Object)(__ref._consecutivo /*int*/ ),(Object)(_id),(Object)(_cantidadinsu)});
RDebugUtils.currentLine=17039405;
 //BA.debugLineNum = 17039405;BA.debugLine="Log(\"Comando SQL: insert_laborInsumo\")";
parent.__c.LogImpl("417039405","Comando SQL: insert_laborInsumo",0);
RDebugUtils.currentLine=17039406;
 //BA.debugLineNum = 17039406;BA.debugLine="Log(\"Parámetro 1 - consecutivo: \" & consecutiv";
parent.__c.LogImpl("417039406","Parámetro 1 - consecutivo: "+BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=17039407;
 //BA.debugLineNum = 17039407;BA.debugLine="Log(\"Parámetro 2 - ID: \" & ID)";
parent.__c.LogImpl("417039407","Parámetro 2 - ID: "+_id,0);
RDebugUtils.currentLine=17039408;
 //BA.debugLineNum = 17039408;BA.debugLine="Log(\"Parámetro 3 - cantidadInsu: \" & cantidadI";
parent.__c.LogImpl("417039408","Parámetro 3 - cantidadInsu: "+BA.NumberToString(_cantidadinsu),0);
RDebugUtils.currentLine=17039410;
 //BA.debugLineNum = 17039410;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Nul";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=17039411;
 //BA.debugLineNum = 17039411;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttoninsumo_click"), (Object)(_j));
this.state = 49;
return;
case 49:
//C
this.state = 22;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17039414;
 //BA.debugLineNum = 17039414;BA.debugLine="If j.Success Then";
if (true) break;

case 22:
//if
this.state = 27;
if (_j._success /*boolean*/ ) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=17039416;
 //BA.debugLineNum = 17039416;BA.debugLine="Log(\"Inserción insumo exitosa para ID: \" & ID";
parent.__c.LogImpl("417039416","Inserción insumo exitosa para ID: "+_id,0);
RDebugUtils.currentLine=17039417;
 //BA.debugLineNum = 17039417;BA.debugLine="ToastMessageShow(\"Inserción exitosa para Insu";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Inserción exitosa para Insumo : "+_id),parent.__c.True);
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=17039420;
 //BA.debugLineNum = 17039420;BA.debugLine="Log(\"Error en la inserción insumo para ID: \"";
parent.__c.LogImpl("417039420","Error en la inserción insumo para ID: "+_id+". Error: "+_j._errormessage /*String*/ ,0);
RDebugUtils.currentLine=17039421;
 //BA.debugLineNum = 17039421;BA.debugLine="ToastMessageShow(\"Error en la inserción para";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error en la inserción para ID: "+_id),parent.__c.False);
 if (true) break;

case 27:
//C
this.state = 30;
;
RDebugUtils.currentLine=17039425;
 //BA.debugLineNum = 17039425;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=17039428;
 //BA.debugLineNum = 17039428;BA.debugLine="consecutivo = consecutivo + 1";
__ref._consecutivo /*int*/  = (int) (__ref._consecutivo /*int*/ +1);
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
RDebugUtils.currentLine=17039431;
 //BA.debugLineNum = 17039431;BA.debugLine="cantidadInsu = 0 ' Valor predeterminado si no";
_cantidadinsu = (int) (0);
RDebugUtils.currentLine=17039432;
 //BA.debugLineNum = 17039432;BA.debugLine="Log(\"Error al procesar insumo la cantidad para";
parent.__c.LogImpl("417039432","Error al procesar insumo la cantidad para ID: "+_id,0);
RDebugUtils.currentLine=17039433;
 //BA.debugLineNum = 17039433;BA.debugLine="ToastMessageShow(\"Error al procesar la cantida";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error al procesar la cantidad para ID: "+_id),parent.__c.False);
 if (true) break;
if (true) break;

case 30:
//C
this.state = 33;
this.catchState = 0;
;
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=17039436;
 //BA.debugLineNum = 17039436;BA.debugLine="cantidadInsu = 0";
_cantidadinsu = (int) (0);
 if (true) break;

case 33:
//C
this.state = 48;
;
 if (true) break;
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=17039440;
 //BA.debugLineNum = 17039440;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=17039441;
 //BA.debugLineNum = 17039441;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=17039442;
 //BA.debugLineNum = 17039442;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=17039443;
 //BA.debugLineNum = 17039443;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=17039444;
 //BA.debugLineNum = 17039444;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=17039445;
 //BA.debugLineNum = 17039445;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=17039447;
 //BA.debugLineNum = 17039447;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=17039449;
 //BA.debugLineNum = 17039449;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=17039450;
 //BA.debugLineNum = 17039450;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=17039453;
 //BA.debugLineNum = 17039453;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)("0000-"),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=17039457;
 //BA.debugLineNum = 17039457;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("417039457","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=17039458;
 //BA.debugLineNum = 17039458;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("417039458","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=17039459;
 //BA.debugLineNum = 17039459;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
parent.__c.LogImpl("417039459","loteCBX: "+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=17039460;
 //BA.debugLineNum = 17039460;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
parent.__c.LogImpl("417039460","fechafmrto: "+__ref._fechafmrto /*String*/ ,0);
RDebugUtils.currentLine=17039461;
 //BA.debugLineNum = 17039461;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
parent.__c.LogImpl("417039461","tipoLabor: "+__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=17039462;
 //BA.debugLineNum = 17039462;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
parent.__c.LogImpl("417039462","fechaInicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=17039463;
 //BA.debugLineNum = 17039463;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
parent.__c.LogImpl("417039463","fechaFin: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=17039464;
 //BA.debugLineNum = 17039464;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
parent.__c.LogImpl("417039464","elementoGasto: "+__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=17039465;
 //BA.debugLineNum = 17039465;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
parent.__c.LogImpl("417039465","areaLabor: "+BA.NumberToString(__ref._arealabor /*int*/ ),0);
RDebugUtils.currentLine=17039466;
 //BA.debugLineNum = 17039466;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
parent.__c.LogImpl("417039466","consecutivo: "+BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=17039467;
 //BA.debugLineNum = 17039467;BA.debugLine="Log(\"areaLote: \" & areaLote)";
parent.__c.LogImpl("417039467","areaLote: "+BA.NumberToString(__ref._arealote /*int*/ ),0);
RDebugUtils.currentLine=17039468;
 //BA.debugLineNum = 17039468;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("417039468","fechaActual: "+__ref._fechaactual /*String*/ ,0);
RDebugUtils.currentLine=17039469;
 //BA.debugLineNum = 17039469;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("417039469","horaSistema: "+__ref._horasistema /*String*/ ,0);
RDebugUtils.currentLine=17039470;
 //BA.debugLineNum = 17039470;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("417039470","user: "+__ref._user /*String*/ ,0);
RDebugUtils.currentLine=17039471;
 //BA.debugLineNum = 17039471;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("417039471","DeviceName: "+__ref._devicename /*String*/ ,0);
RDebugUtils.currentLine=17039473;
 //BA.debugLineNum = 17039473;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=17039474;
 //BA.debugLineNum = 17039474;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttoninsumo_click"), (Object)(_j));
this.state = 50;
return;
case 50:
//C
this.state = 35;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17039477;
 //BA.debugLineNum = 17039477;BA.debugLine="Try";
if (true) break;

case 35:
//try
this.state = 46;
this.catchState = 45;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 45;
RDebugUtils.currentLine=17039478;
 //BA.debugLineNum = 17039478;BA.debugLine="If j.Success Then";
if (true) break;

case 38:
//if
this.state = 43;
if (_j._success /*boolean*/ ) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
RDebugUtils.currentLine=17039480;
 //BA.debugLineNum = 17039480;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente la labor."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=17039483;
 //BA.debugLineNum = 17039483;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
parent.__c.LogImpl("417039483","Error al ejecutar la consulta labor: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 43:
//C
this.state = 46;
;
 if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
RDebugUtils.currentLine=17039487;
 //BA.debugLineNum = 17039487;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("417039487","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 46:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=17039492;
 //BA.debugLineNum = 17039492;BA.debugLine="End Sub";
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
public String  _getdevicename(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "getdevicename", false))
	 {return ((String) Debug.delegate(ba, "getdevicename", null));}
anywheresoftware.b4a.phone.Phone _p = null;
String _manufacturer = "";
String _model = "";
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub GetDeviceName As String";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="End Sub";
return "";
}
public void  _buttonriego_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttonriego_click", false))
	 {Debug.delegate(ba, "buttonriego_click", null); return;}
ResumableSub_ButtonRiego_Click rsub = new ResumableSub_ButtonRiego_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonRiego_Click extends BA.ResumableSub {
public ResumableSub_ButtonRiego_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
long _fecha = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=17104902;
 //BA.debugLineNum = 17104902;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborRiego",new Object[]{(Object)(__ref._consecutivo /*int*/ ),(Object)(__ref._tiporiego /*String*/ ),(Object)(__ref._procedenciariego /*String*/ ),(Object)(__ref._caudalriego /*String*/ ),(Object)(__ref._cantidadriego /*String*/ )});
RDebugUtils.currentLine=17104905;
 //BA.debugLineNum = 17104905;BA.debugLine="Log(\"Comando SQL: insert_laborRiego\")";
parent.__c.LogImpl("417104905","Comando SQL: insert_laborRiego",0);
RDebugUtils.currentLine=17104906;
 //BA.debugLineNum = 17104906;BA.debugLine="Log(\"Parámetro 1 - consecutivo: \" & consecutivo)";
parent.__c.LogImpl("417104906","Parámetro 1 - consecutivo: "+BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=17104907;
 //BA.debugLineNum = 17104907;BA.debugLine="Log(\"Parámetro 2 - tipoRiego: \" & tipoRiego)";
parent.__c.LogImpl("417104907","Parámetro 2 - tipoRiego: "+__ref._tiporiego /*String*/ ,0);
RDebugUtils.currentLine=17104908;
 //BA.debugLineNum = 17104908;BA.debugLine="Log(\"Parámetro 3 - procedenciaRiego: \" & proceden";
parent.__c.LogImpl("417104908","Parámetro 3 - procedenciaRiego: "+__ref._procedenciariego /*String*/ ,0);
RDebugUtils.currentLine=17104909;
 //BA.debugLineNum = 17104909;BA.debugLine="Log(\"Parámetro 4 - caudalRiego: \" & caudalRiego)";
parent.__c.LogImpl("417104909","Parámetro 4 - caudalRiego: "+__ref._caudalriego /*String*/ ,0);
RDebugUtils.currentLine=17104910;
 //BA.debugLineNum = 17104910;BA.debugLine="Log(\"Parámetro 5 - cantidadRiego: \" & cantidadRie";
parent.__c.LogImpl("417104910","Parámetro 5 - cantidadRiego: "+__ref._cantidadriego /*String*/ ,0);
RDebugUtils.currentLine=17104912;
 //BA.debugLineNum = 17104912;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=17104913;
 //BA.debugLineNum = 17104913;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonriego_click"), (Object)(_j));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17104916;
 //BA.debugLineNum = 17104916;BA.debugLine="Try";
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
RDebugUtils.currentLine=17104917;
 //BA.debugLineNum = 17104917;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=17104918;
 //BA.debugLineNum = 17104918;BA.debugLine="ToastMessageShow(\"Se ha insertado correctamente";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Se ha insertado correctamente Insumo"),parent.__c.False);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=17104920;
 //BA.debugLineNum = 17104920;BA.debugLine="ToastMessageShow(\"Error al insertar Insumo\", Tr";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error al insertar Insumo"),parent.__c.True);
RDebugUtils.currentLine=17104921;
 //BA.debugLineNum = 17104921;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("417104921","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=17104924;
 //BA.debugLineNum = 17104924;BA.debugLine="ToastMessageShow(\"Error inesperado al insertar I";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error inesperado al insertar Insumo"),parent.__c.True);
RDebugUtils.currentLine=17104925;
 //BA.debugLineNum = 17104925;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("417104925","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
RDebugUtils.currentLine=17104928;
 //BA.debugLineNum = 17104928;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=17104929;
 //BA.debugLineNum = 17104929;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=17104930;
 //BA.debugLineNum = 17104930;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=17104931;
 //BA.debugLineNum = 17104931;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=17104932;
 //BA.debugLineNum = 17104932;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=17104933;
 //BA.debugLineNum = 17104933;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=17104935;
 //BA.debugLineNum = 17104935;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=17104937;
 //BA.debugLineNum = 17104937;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=17104938;
 //BA.debugLineNum = 17104938;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=17104941;
 //BA.debugLineNum = 17104941;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)("0000-"),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=17104945;
 //BA.debugLineNum = 17104945;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("417104945","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=17104946;
 //BA.debugLineNum = 17104946;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("417104946","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=17104947;
 //BA.debugLineNum = 17104947;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
parent.__c.LogImpl("417104947","loteCBX: "+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=17104948;
 //BA.debugLineNum = 17104948;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
parent.__c.LogImpl("417104948","fechafmrto: "+__ref._fechafmrto /*String*/ ,0);
RDebugUtils.currentLine=17104949;
 //BA.debugLineNum = 17104949;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
parent.__c.LogImpl("417104949","tipoLabor: "+__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=17104950;
 //BA.debugLineNum = 17104950;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
parent.__c.LogImpl("417104950","fechaInicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=17104951;
 //BA.debugLineNum = 17104951;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
parent.__c.LogImpl("417104951","fechaFin: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=17104952;
 //BA.debugLineNum = 17104952;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
parent.__c.LogImpl("417104952","elementoGasto: "+__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=17104953;
 //BA.debugLineNum = 17104953;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
parent.__c.LogImpl("417104953","areaLabor: "+BA.NumberToString(__ref._arealabor /*int*/ ),0);
RDebugUtils.currentLine=17104954;
 //BA.debugLineNum = 17104954;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
parent.__c.LogImpl("417104954","consecutivo: "+BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=17104955;
 //BA.debugLineNum = 17104955;BA.debugLine="Log(\"areaLote: \" & areaLote)";
parent.__c.LogImpl("417104955","areaLote: "+BA.NumberToString(__ref._arealote /*int*/ ),0);
RDebugUtils.currentLine=17104956;
 //BA.debugLineNum = 17104956;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("417104956","fechaActual: "+__ref._fechaactual /*String*/ ,0);
RDebugUtils.currentLine=17104957;
 //BA.debugLineNum = 17104957;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("417104957","horaSistema: "+__ref._horasistema /*String*/ ,0);
RDebugUtils.currentLine=17104958;
 //BA.debugLineNum = 17104958;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("417104958","user: "+__ref._user /*String*/ ,0);
RDebugUtils.currentLine=17104959;
 //BA.debugLineNum = 17104959;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("417104959","DeviceName: "+__ref._devicename /*String*/ ,0);
RDebugUtils.currentLine=17104961;
 //BA.debugLineNum = 17104961;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=17104962;
 //BA.debugLineNum = 17104962;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonriego_click"), (Object)(_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17104965;
 //BA.debugLineNum = 17104965;BA.debugLine="Try";
if (true) break;

case 13:
//try
this.state = 24;
this.catchState = 23;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 23;
RDebugUtils.currentLine=17104966;
 //BA.debugLineNum = 17104966;BA.debugLine="If j.Success Then";
if (true) break;

case 16:
//if
this.state = 21;
if (_j._success /*boolean*/ ) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=17104968;
 //BA.debugLineNum = 17104968;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente la labor."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=17104971;
 //BA.debugLineNum = 17104971;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
parent.__c.LogImpl("417104971","Error al ejecutar la consulta labor: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=17104975;
 //BA.debugLineNum = 17104975;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("417104975","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=17104978;
 //BA.debugLineNum = 17104978;BA.debugLine="End Sub";
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
public void  _buttonsimbra_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttonsimbra_click", false))
	 {Debug.delegate(ba, "buttonsimbra_click", null); return;}
ResumableSub_ButtonSimbra_Click rsub = new ResumableSub_ButtonSimbra_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonSimbra_Click extends BA.ResumableSub {
public ResumableSub_ButtonSimbra_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmdultimoregistro = null;
b4a.example.ef.httpjob _j5 = null;
b4a.example.ef.main._dbresult _resultimoregistro = null;
Object[] _rowregistro = null;
int _ultimoregistrosiembra = 0;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
long _fecha = 0L;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdSiembra",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17170440;
 //BA.debugLineNum = 17170440;BA.debugLine="If j5.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j5._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17170441;
 //BA.debugLineNum = 17170441;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=17170442;
 //BA.debugLineNum = 17170442;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_req));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=17170444;
 //BA.debugLineNum = 17170444;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
if (true) break;

case 4:
//for
this.state = 7;
group8 = _resultimoregistro.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_rowregistro = (Object[])(group8.Get(index8));}
if (true) break;

case 38:
//C
this.state = 37;
index8++;
if (true) break;

case 6:
//C
this.state = 38;
RDebugUtils.currentLine=17170445;
 //BA.debugLineNum = 17170445;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=17170446;
 //BA.debugLineNum = 17170446;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("417170446","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
RDebugUtils.currentLine=17170450;
 //BA.debugLineNum = 17170450;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("417170450","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=17170453;
 //BA.debugLineNum = 17170453;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
__ref._consecutivosiembra /*int*/  = (int) (_ultimoregistrosiembra+1);
RDebugUtils.currentLine=17170455;
 //BA.debugLineNum = 17170455;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("417170455",BA.NumberToString(__ref._consecutivosiembra /*int*/ ),0);
RDebugUtils.currentLine=17170458;
 //BA.debugLineNum = 17170458;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborSiembra",new Object[]{(Object)(__ref._consecutivosiembra /*int*/ ),(Object)(__ref._codigosiembra /*String*/ ),(Object)(__ref._distanciasiembra /*int*/ ),(Object)(__ref._toneladasemillasiembra /*int*/ ),(Object)(__ref._numeropaquetessiembra /*int*/ ),(Object)(__ref._procedenciasiembra /*String*/ ),(Object)(__ref._tipolabranzasiembra /*String*/ ),(Object)(__ref._bandereosiembra /*int*/ ),(Object)(__ref._numeromacollosiembra /*int*/ )});
RDebugUtils.currentLine=17170461;
 //BA.debugLineNum = 17170461;BA.debugLine="Log(\"Comando SQL: insert_laborSiembra\")";
parent.__c.LogImpl("417170461","Comando SQL: insert_laborSiembra",0);
RDebugUtils.currentLine=17170462;
 //BA.debugLineNum = 17170462;BA.debugLine="Log(\"Parámetro 1 - consecutivoSiembra: \" & consec";
parent.__c.LogImpl("417170462","Parámetro 1 - consecutivoSiembra: "+BA.NumberToString(__ref._consecutivosiembra /*int*/ ),0);
RDebugUtils.currentLine=17170463;
 //BA.debugLineNum = 17170463;BA.debugLine="Log(\"Parámetro 2 - codigoSiembra: \" & codigoSiemb";
parent.__c.LogImpl("417170463","Parámetro 2 - codigoSiembra: "+__ref._codigosiembra /*String*/ ,0);
RDebugUtils.currentLine=17170464;
 //BA.debugLineNum = 17170464;BA.debugLine="Log(\"Parámetro 3 - distanciaSiembra: \" & distanci";
parent.__c.LogImpl("417170464","Parámetro 3 - distanciaSiembra: "+BA.NumberToString(__ref._distanciasiembra /*int*/ ),0);
RDebugUtils.currentLine=17170465;
 //BA.debugLineNum = 17170465;BA.debugLine="Log(\"Parámetro 4 - toneladaSemillaSiembra: \" & to";
parent.__c.LogImpl("417170465","Parámetro 4 - toneladaSemillaSiembra: "+BA.NumberToString(__ref._toneladasemillasiembra /*int*/ ),0);
RDebugUtils.currentLine=17170466;
 //BA.debugLineNum = 17170466;BA.debugLine="Log(\"Parámetro 5 - numeroPaquetesSiembra: \" & num";
parent.__c.LogImpl("417170466","Parámetro 5 - numeroPaquetesSiembra: "+BA.NumberToString(__ref._numeropaquetessiembra /*int*/ ),0);
RDebugUtils.currentLine=17170467;
 //BA.debugLineNum = 17170467;BA.debugLine="Log(\"Parámetro 6 - procedenciaSiembra: \" & proced";
parent.__c.LogImpl("417170467","Parámetro 6 - procedenciaSiembra: "+__ref._procedenciasiembra /*String*/ ,0);
RDebugUtils.currentLine=17170468;
 //BA.debugLineNum = 17170468;BA.debugLine="Log(\"Parámetro 7 - tipoLabranzaSiembra: \" & tipoL";
parent.__c.LogImpl("417170468","Parámetro 7 - tipoLabranzaSiembra: "+__ref._tipolabranzasiembra /*String*/ ,0);
RDebugUtils.currentLine=17170469;
 //BA.debugLineNum = 17170469;BA.debugLine="Log(\"Parámetro 8 - bandereoSiembra: \" & bandereoS";
parent.__c.LogImpl("417170469","Parámetro 8 - bandereoSiembra: "+BA.NumberToString(__ref._bandereosiembra /*int*/ ),0);
RDebugUtils.currentLine=17170470;
 //BA.debugLineNum = 17170470;BA.debugLine="Log(\"Parámetro 9 - numeroMacolloSiembra: \" & nume";
parent.__c.LogImpl("417170470","Parámetro 9 - numeroMacolloSiembra: "+BA.NumberToString(__ref._numeromacollosiembra /*int*/ ),0);
RDebugUtils.currentLine=17170473;
 //BA.debugLineNum = 17170473;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=17170474;
 //BA.debugLineNum = 17170474;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_j));
this.state = 39;
return;
case 39:
//C
this.state = 11;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17170477;
 //BA.debugLineNum = 17170477;BA.debugLine="Try";
if (true) break;

case 11:
//try
this.state = 22;
this.catchState = 21;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 21;
RDebugUtils.currentLine=17170478;
 //BA.debugLineNum = 17170478;BA.debugLine="If j.Success Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_j._success /*boolean*/ ) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=17170479;
 //BA.debugLineNum = 17170479;BA.debugLine="Log(\"Datos insertados correctamente en insert_l";
parent.__c.LogImpl("417170479","Datos insertados correctamente en insert_laborInsumo",0);
RDebugUtils.currentLine=17170480;
 //BA.debugLineNum = 17170480;BA.debugLine="ToastMessageShow(\"Datos de Insumo guardados con";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Datos de Insumo guardados con éxito"),parent.__c.False);
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=17170482;
 //BA.debugLineNum = 17170482;BA.debugLine="ToastMessageShow(\"Error al guardar los datos de";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error al guardar los datos de Insumo"),parent.__c.True);
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
RDebugUtils.currentLine=17170485;
 //BA.debugLineNum = 17170485;BA.debugLine="Log(\"Excepción capturada en insert_laborInsumo";
parent.__c.LogImpl("417170485","Excepción capturada en insert_laborInsumo: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=17170486;
 //BA.debugLineNum = 17170486;BA.debugLine="ToastMessageShow(\"Se produjo un error inesperado";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Se produjo un error inesperado"),parent.__c.True);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
RDebugUtils.currentLine=17170490;
 //BA.debugLineNum = 17170490;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=17170491;
 //BA.debugLineNum = 17170491;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=17170492;
 //BA.debugLineNum = 17170492;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=17170493;
 //BA.debugLineNum = 17170493;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=17170494;
 //BA.debugLineNum = 17170494;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=17170495;
 //BA.debugLineNum = 17170495;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=17170497;
 //BA.debugLineNum = 17170497;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=17170499;
 //BA.debugLineNum = 17170499;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=17170500;
 //BA.debugLineNum = 17170500;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=17170503;
 //BA.debugLineNum = 17170503;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)("0000-"),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=17170507;
 //BA.debugLineNum = 17170507;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("417170507","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=17170508;
 //BA.debugLineNum = 17170508;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("417170508","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=17170509;
 //BA.debugLineNum = 17170509;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
parent.__c.LogImpl("417170509","loteCBX: "+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=17170510;
 //BA.debugLineNum = 17170510;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
parent.__c.LogImpl("417170510","fechafmrto: "+__ref._fechafmrto /*String*/ ,0);
RDebugUtils.currentLine=17170511;
 //BA.debugLineNum = 17170511;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
parent.__c.LogImpl("417170511","tipoLabor: "+__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=17170512;
 //BA.debugLineNum = 17170512;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
parent.__c.LogImpl("417170512","fechaInicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=17170513;
 //BA.debugLineNum = 17170513;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
parent.__c.LogImpl("417170513","fechaFin: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=17170514;
 //BA.debugLineNum = 17170514;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
parent.__c.LogImpl("417170514","elementoGasto: "+__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=17170515;
 //BA.debugLineNum = 17170515;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
parent.__c.LogImpl("417170515","areaLabor: "+BA.NumberToString(__ref._arealabor /*int*/ ),0);
RDebugUtils.currentLine=17170516;
 //BA.debugLineNum = 17170516;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
parent.__c.LogImpl("417170516","consecutivo: "+BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=17170517;
 //BA.debugLineNum = 17170517;BA.debugLine="Log(\"areaLote: \" & areaLote)";
parent.__c.LogImpl("417170517","areaLote: "+BA.NumberToString(__ref._arealote /*int*/ ),0);
RDebugUtils.currentLine=17170518;
 //BA.debugLineNum = 17170518;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("417170518","fechaActual: "+__ref._fechaactual /*String*/ ,0);
RDebugUtils.currentLine=17170519;
 //BA.debugLineNum = 17170519;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("417170519","horaSistema: "+__ref._horasistema /*String*/ ,0);
RDebugUtils.currentLine=17170520;
 //BA.debugLineNum = 17170520;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("417170520","user: "+__ref._user /*String*/ ,0);
RDebugUtils.currentLine=17170521;
 //BA.debugLineNum = 17170521;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("417170521","DeviceName: "+__ref._devicename /*String*/ ,0);
RDebugUtils.currentLine=17170523;
 //BA.debugLineNum = 17170523;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=17170524;
 //BA.debugLineNum = 17170524;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_j));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17170527;
 //BA.debugLineNum = 17170527;BA.debugLine="Try";
if (true) break;

case 23:
//try
this.state = 34;
this.catchState = 33;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 33;
RDebugUtils.currentLine=17170528;
 //BA.debugLineNum = 17170528;BA.debugLine="If j.Success Then";
if (true) break;

case 26:
//if
this.state = 31;
if (_j._success /*boolean*/ ) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=17170530;
 //BA.debugLineNum = 17170530;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente la labor."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=17170533;
 //BA.debugLineNum = 17170533;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
parent.__c.LogImpl("417170533","Error al ejecutar la consulta labor: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
RDebugUtils.currentLine=17170537;
 //BA.debugLineNum = 17170537;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("417170537","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=17170540;
 //BA.debugLineNum = 17170540;BA.debugLine="End Sub";
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
public String  _class_globals(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=13959173;
 //BA.debugLineNum = 13959173;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13959174;
 //BA.debugLineNum = 13959174;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="Private Label14Time As Label";
_label14time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13959176;
 //BA.debugLineNum = 13959176;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13959177;
 //BA.debugLineNum = 13959177;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13959178;
 //BA.debugLineNum = 13959178;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=13959179;
 //BA.debugLineNum = 13959179;BA.debugLine="Dim fechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=13959180;
 //BA.debugLineNum = 13959180;BA.debugLine="Dim fechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=13959181;
 //BA.debugLineNum = 13959181;BA.debugLine="Dim fechafmrto As String";
_fechafmrto = "";
RDebugUtils.currentLine=13959182;
 //BA.debugLineNum = 13959182;BA.debugLine="Dim horaSistema As String";
_horasistema = "";
RDebugUtils.currentLine=13959184;
 //BA.debugLineNum = 13959184;BA.debugLine="Private loteCBX As String";
_lotecbx = "";
RDebugUtils.currentLine=13959185;
 //BA.debugLineNum = 13959185;BA.debugLine="Private elementoLabor As String";
_elementolabor = "";
RDebugUtils.currentLine=13959186;
 //BA.debugLineNum = 13959186;BA.debugLine="Private elementoGasto As String";
_elementogasto = "";
RDebugUtils.currentLine=13959187;
 //BA.debugLineNum = 13959187;BA.debugLine="Private areaLabor As Int";
_arealabor = 0;
RDebugUtils.currentLine=13959188;
 //BA.debugLineNum = 13959188;BA.debugLine="Private areaLote As Int";
_arealote = 0;
RDebugUtils.currentLine=13959189;
 //BA.debugLineNum = 13959189;BA.debugLine="Dim consecutivo As Int";
_consecutivo = 0;
RDebugUtils.currentLine=13959190;
 //BA.debugLineNum = 13959190;BA.debugLine="Private tipoLabor As String";
_tipolabor = "";
RDebugUtils.currentLine=13959192;
 //BA.debugLineNum = 13959192;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=13959193;
 //BA.debugLineNum = 13959193;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=13959195;
 //BA.debugLineNum = 13959195;BA.debugLine="Private Panel2geral As Panel";
_panel2geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13959196;
 //BA.debugLineNum = 13959196;BA.debugLine="Private SD_xComboBoxTipoRiego As SD_xComboBox";
_sd_xcomboboxtiporiego = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=13959198;
 //BA.debugLineNum = 13959198;BA.debugLine="Private Panel3geral As Panel";
_panel3geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13959199;
 //BA.debugLineNum = 13959199;BA.debugLine="Private SD_xComboBoxCodigoVariedad As SD_xComboBo";
_sd_xcomboboxcodigovariedad = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=13959200;
 //BA.debugLineNum = 13959200;BA.debugLine="Private SD_xComboBoxTipoLabranza As SD_xComboBox";
_sd_xcomboboxtipolabranza = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=13959202;
 //BA.debugLineNum = 13959202;BA.debugLine="Private cantidadInsumos As Int";
_cantidadinsumos = 0;
RDebugUtils.currentLine=13959204;
 //BA.debugLineNum = 13959204;BA.debugLine="Private SD_xComboBoxInsumo As SD_xComboBox";
_sd_xcomboboxinsumo = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=13959205;
 //BA.debugLineNum = 13959205;BA.debugLine="Private EditTextCantidadInsumo As EditText";
_edittextcantidadinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13959206;
 //BA.debugLineNum = 13959206;BA.debugLine="Private ButtonAddInsumo As Button";
_buttonaddinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=13959207;
 //BA.debugLineNum = 13959207;BA.debugLine="Private ButtonDeleteInsumo As Button";
_buttondeleteinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=13959208;
 //BA.debugLineNum = 13959208;BA.debugLine="Private Panel0geral As Panel";
_panel0geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13959210;
 //BA.debugLineNum = 13959210;BA.debugLine="Private IDINSUMO As String";
_idinsumo = "";
RDebugUtils.currentLine=13959211;
 //BA.debugLineNum = 13959211;BA.debugLine="Private NAMEINSUMO As String";
_nameinsumo = "";
RDebugUtils.currentLine=13959212;
 //BA.debugLineNum = 13959212;BA.debugLine="Private CANTINSUMO As String";
_cantinsumo = "";
RDebugUtils.currentLine=13959214;
 //BA.debugLineNum = 13959214;BA.debugLine="Private LabelCantidadInsumos As Label";
_labelcantidadinsumos = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13959215;
 //BA.debugLineNum = 13959215;BA.debugLine="Private B4XTable1 As B4XTable";
_b4xtable1 = new b4a.example.ef.b4xtable();
RDebugUtils.currentLine=13959216;
 //BA.debugLineNum = 13959216;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13959218;
 //BA.debugLineNum = 13959218;BA.debugLine="Private PanelInsumoSelect As Panel";
_panelinsumoselect = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13959219;
 //BA.debugLineNum = 13959219;BA.debugLine="Private PanelTittleInsumo As Panel";
_paneltittleinsumo = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13959220;
 //BA.debugLineNum = 13959220;BA.debugLine="Private LabelInsumoSelect As Label";
_labelinsumoselect = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13959222;
 //BA.debugLineNum = 13959222;BA.debugLine="Dim idEliminarTabla As Int";
_ideliminartabla = 0;
RDebugUtils.currentLine=13959224;
 //BA.debugLineNum = 13959224;BA.debugLine="Dim tipoRiego As String";
_tiporiego = "";
RDebugUtils.currentLine=13959225;
 //BA.debugLineNum = 13959225;BA.debugLine="Dim procedenciaRiego As String";
_procedenciariego = "";
RDebugUtils.currentLine=13959226;
 //BA.debugLineNum = 13959226;BA.debugLine="Dim caudalRiego As String";
_caudalriego = "";
RDebugUtils.currentLine=13959227;
 //BA.debugLineNum = 13959227;BA.debugLine="Dim cantidadRiego As String";
_cantidadriego = "";
RDebugUtils.currentLine=13959229;
 //BA.debugLineNum = 13959229;BA.debugLine="Dim codigoSiembra As String";
_codigosiembra = "";
RDebugUtils.currentLine=13959230;
 //BA.debugLineNum = 13959230;BA.debugLine="Dim distanciaSiembra As Int";
_distanciasiembra = 0;
RDebugUtils.currentLine=13959231;
 //BA.debugLineNum = 13959231;BA.debugLine="Dim bandereoSiembra As Int";
_bandereosiembra = 0;
RDebugUtils.currentLine=13959232;
 //BA.debugLineNum = 13959232;BA.debugLine="Dim toneladaSemillaSiembra As Int";
_toneladasemillasiembra = 0;
RDebugUtils.currentLine=13959233;
 //BA.debugLineNum = 13959233;BA.debugLine="Dim procedenciaSiembra As String";
_procedenciasiembra = "";
RDebugUtils.currentLine=13959234;
 //BA.debugLineNum = 13959234;BA.debugLine="Dim tipoLabranzaSiembra As String";
_tipolabranzasiembra = "";
RDebugUtils.currentLine=13959235;
 //BA.debugLineNum = 13959235;BA.debugLine="Dim numeroPaquetesSiembra As Int";
_numeropaquetessiembra = 0;
RDebugUtils.currentLine=13959236;
 //BA.debugLineNum = 13959236;BA.debugLine="Dim numeroMacolloSiembra As Int";
_numeromacollosiembra = 0;
RDebugUtils.currentLine=13959238;
 //BA.debugLineNum = 13959238;BA.debugLine="Dim DeviceName As String";
_devicename = "";
RDebugUtils.currentLine=13959239;
 //BA.debugLineNum = 13959239;BA.debugLine="Dim user As String";
_user = "";
RDebugUtils.currentLine=13959241;
 //BA.debugLineNum = 13959241;BA.debugLine="Dim fechaActual As String";
_fechaactual = "";
RDebugUtils.currentLine=13959242;
 //BA.debugLineNum = 13959242;BA.debugLine="Dim consecutivoSiembra As Int";
_consecutivosiembra = 0;
RDebugUtils.currentLine=13959245;
 //BA.debugLineNum = 13959245;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=13959246;
 //BA.debugLineNum = 13959246;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13959247;
 //BA.debugLineNum = 13959247;BA.debugLine="Private SwiftButtonNit As SwiftButton";
_swiftbuttonnit = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=13959248;
 //BA.debugLineNum = 13959248;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
_searchtemplatenit = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=13959249;
 //BA.debugLineNum = 13959249;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
_swiftbuttonhacienda = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=13959250;
 //BA.debugLineNum = 13959250;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
_searchtemplatehacienda = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=13959251;
 //BA.debugLineNum = 13959251;BA.debugLine="Private SwiftButtonLote As SwiftButton";
_swiftbuttonlote = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=13959252;
 //BA.debugLineNum = 13959252;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
_searchtemplatelote = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=13959253;
 //BA.debugLineNum = 13959253;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
_swiftbuttonlabor = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=13959254;
 //BA.debugLineNum = 13959254;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
_searchtemplatelabor = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=13959255;
 //BA.debugLineNum = 13959255;BA.debugLine="Private SwiftButtonElemento As SwiftButton";
_swiftbuttonelemento = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=13959256;
 //BA.debugLineNum = 13959256;BA.debugLine="Private SearchTemplateElemento As B4XSearchTempla";
_searchtemplateelemento = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=13959257;
 //BA.debugLineNum = 13959257;BA.debugLine="Private SwiftButtonTypeForm As SwiftButton";
_swiftbuttontypeform = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=13959258;
 //BA.debugLineNum = 13959258;BA.debugLine="Private SearchTemplateTypeForm As B4XSearchTempla";
_searchtemplatetypeform = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=13959259;
 //BA.debugLineNum = 13959259;BA.debugLine="Private SwiftButtonInsumo As SwiftButton";
_swiftbuttoninsumo = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=13959260;
 //BA.debugLineNum = 13959260;BA.debugLine="Private SearchTemplateInsumo As B4XSearchTemplate";
_searchtemplateinsumo = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=13959261;
 //BA.debugLineNum = 13959261;BA.debugLine="Private SwiftButtonRiego As SwiftButton";
_swiftbuttonriego = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=13959262;
 //BA.debugLineNum = 13959262;BA.debugLine="Private SearchTemplateRiego As B4XSearchTemplate";
_searchtemplateriego = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=13959263;
 //BA.debugLineNum = 13959263;BA.debugLine="Private SwiftButtonTipoLabranza As SwiftButton";
_swiftbuttontipolabranza = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=13959264;
 //BA.debugLineNum = 13959264;BA.debugLine="Private SearchTemplateTipoLabranza As B4XSearchTe";
_searchtemplatetipolabranza = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=13959265;
 //BA.debugLineNum = 13959265;BA.debugLine="Private SwiftButtonVariedad As SwiftButton";
_swiftbuttonvariedad = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=13959266;
 //BA.debugLineNum = 13959266;BA.debugLine="Private SearchTemplateVariedad As B4XSearchTempla";
_searchtemplatevariedad = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=13959267;
 //BA.debugLineNum = 13959267;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumo(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createiteminsumo", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createiteminsumo", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub CreateItemInsumo As Panel";
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
_panel.LoadLayout("FormInsumo",ba);
RDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="panel.Height=Panel0geral.Height";
_panel.setHeight(__ref._panel0geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=14483467;
 //BA.debugLineNum = 14483467;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemriego(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitemriego", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemriego", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Private Sub CreateItemRiego As Panel";
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
_panel.LoadLayout("FormRiego",ba);
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="panel.Height=Panel2geral.Height";
_panel.setHeight(__ref._panel2geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=14352394;
 //BA.debugLineNum = 14352394;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=14352395;
 //BA.debugLineNum = 14352395;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemsiembra(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitemsiembra", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemsiembra", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Private Sub CreateItemSiembra As Panel";
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
_panel.LoadLayout("FormSiembra",ba);
RDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="panel.Height=Panel3geral.Height";
_panel.setHeight(__ref._panel3geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=14417930;
 //BA.debugLineNum = 14417930;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=14417931;
 //BA.debugLineNum = 14417931;BA.debugLine="End Sub";
return null;
}
public String  _edittextarealabor_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextarealabor_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextarealabor_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub EditTextAreaLabor_TextChanged (Old As";
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="areaLabor = New";
__ref._arealabor /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="Log(\"Area Labor \" & areaLabor)";
__c.LogImpl("415204356","Area Labor "+BA.NumberToString(__ref._arealabor /*int*/ ),0);
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="End Sub";
return "";
}
public String  _edittextarealote_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextarealote_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextarealote_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub EditTextAreaLote_TextChanged (Old As S";
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="areaLote = New";
__ref._arealote /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="Log(\"Area lote \" & areaLote )";
__c.LogImpl("415269892","Area lote "+BA.NumberToString(__ref._arealote /*int*/ ),0);
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="End Sub";
return "";
}
public String  _edittextbandereo_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextbandereo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextbandereo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="bandereoSiembra = New";
__ref._bandereosiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="Log(\"bandereo \" & bandereoSiembra)";
__c.LogImpl("415990788","bandereo "+BA.NumberToString(__ref._bandereosiembra /*int*/ ),0);
RDebugUtils.currentLine=15990789;
 //BA.debugLineNum = 15990789;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadagua_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcantidadagua_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcantidadagua_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="cantidadRiego = New";
__ref._cantidadriego /*String*/  = _new;
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Log(\"cantidad\" & cantidadRiego)";
__c.LogImpl("415532035","cantidad"+__ref._cantidadriego /*String*/ ,0);
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadinsumo_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcantidadinsumo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcantidadinsumo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="ButtonAddInsumo.Enabled = True";
__ref._buttonaddinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="CANTINSUMO = New";
__ref._cantinsumo /*String*/  = _new;
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="End Sub";
return "";
}
public String  _edittextcaudalaplicado_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcaudalaplicado_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcaudalaplicado_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="caudalRiego = New";
__ref._caudalriego /*String*/  = _new;
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="Log(\"caudal\" & caudalRiego)";
__c.LogImpl("415466499","caudal"+__ref._caudalriego /*String*/ ,0);
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="End Sub";
return "";
}
public String  _edittextdistanciasiembra_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextdistanciasiembra_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextdistanciasiembra_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="distanciaSiembra = New";
__ref._distanciasiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="Log(\"Distancia de siembra \" & distanciaSiembra)";
__c.LogImpl("415925251","Distancia de siembra "+BA.NumberToString(__ref._distanciasiembra /*int*/ ),0);
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeromacollos_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextnumeromacollos_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextnumeromacollos_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="numeroMacolloSiembra = New";
__ref._numeromacollosiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="Log(\"numero de macollos \" & numeroMacolloSiembra";
__c.LogImpl("416318467","numero de macollos "+BA.NumberToString(__ref._numeromacollosiembra /*int*/ ),0);
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeropaquetes_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextnumeropaquetes_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextnumeropaquetes_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="numeroPaquetesSiembra = New";
__ref._numeropaquetessiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="Log(\"numero de paquetes \" & numeroPaquetesSiembra";
__c.LogImpl("416252932","numero de paquetes "+BA.NumberToString(__ref._numeropaquetessiembra /*int*/ ),0);
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedencia_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextprocedencia_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextprocedencia_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="procedenciaRiego = New";
__ref._procedenciariego /*String*/  = _new;
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="Log(\"procedencia\" & procedenciaRiego)";
__c.LogImpl("415400964","procedencia"+__ref._procedenciariego /*String*/ ,0);
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedenciadestino_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextprocedenciadestino_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextprocedenciadestino_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="procedenciaSiembra = New";
__ref._procedenciasiembra /*String*/  = _new;
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="Log(\"procedencia \"& procedenciaSiembra)";
__c.LogImpl("416121859","procedencia "+__ref._procedenciasiembra /*String*/ ,0);
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="End Sub";
return "";
}
public String  _edittexttoneladasemilla_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittexttoneladasemilla_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittexttoneladasemilla_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="toneladaSemillaSiembra = New";
__ref._toneladasemillasiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="Log(\"tonelada Semilla \"& toneladaSemillaSiembra)";
__c.LogImpl("416056324","tonelada Semilla "+BA.NumberToString(__ref._toneladasemillasiembra /*int*/ ),0);
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="End Sub";
return "";
}
public String  _label14time_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label14time_click", false))
	 {return ((String) Debug.delegate(ba, "label14time_click", null));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Private Sub Label14Time_Click";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Panel3.Visible = True";
__ref._panel3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="End Sub";
return "";
}
public void  _llenarcomboboxinsumo(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "llenarcomboboxinsumo", false))
	 {Debug.delegate(ba, "llenarcomboboxinsumo", null); return;}
ResumableSub_LlenarComboBoxInsumo rsub = new ResumableSub_LlenarComboBoxInsumo(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxInsumo extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxInsumo(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
anywheresoftware.b4a.objects.collections.List _itemsinsumo = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_producto = "";
String _dscrpcion_producto = "";
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Dim ItemsInsumo As List";
_itemsinsumo = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="ItemsInsumo.Initialize";
_itemsinsumo.Initialize();
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="ItemsInsumo.Add(\"Seleccionar:\")";
_itemsinsumo.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=16515081;
 //BA.debugLineNum = 16515081;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_insumosSort",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=16515082;
 //BA.debugLineNum = 16515082;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxinsumo"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16515083;
 //BA.debugLineNum = 16515083;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=16515084;
 //BA.debugLineNum = 16515084;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=16515085;
 //BA.debugLineNum = 16515085;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxinsumo"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=16515086;
 //BA.debugLineNum = 16515086;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group11 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index11 < groupLen11) {
this.state = 6;
_row = (Object[])(group11.Get(index11));}
if (true) break;

case 14:
//C
this.state = 13;
index11++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=16515087;
 //BA.debugLineNum = 16515087;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
_cdgo_producto = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=16515088;
 //BA.debugLineNum = 16515088;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
_dscrpcion_producto = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=16515089;
 //BA.debugLineNum = 16515089;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto, Dscr";
__ref._sd_xcomboboxinsumo /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_producto,(Object)(_dscrpcion_producto+" - "+_cdgo_producto));
RDebugUtils.currentLine=16515090;
 //BA.debugLineNum = 16515090;BA.debugLine="ItemsInsumo.Add(Cdgo_Producto&\":\"&Dscrpcion_Pro";
_itemsinsumo.Add((Object)(_cdgo_producto+":"+_dscrpcion_producto));
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
RDebugUtils.currentLine=16515093;
 //BA.debugLineNum = 16515093;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("416515093","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=16515095;
 //BA.debugLineNum = 16515095;BA.debugLine="SearchTemplateInsumo.SetItems(ItemsInsumo)";
__ref._searchtemplateinsumo /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsinsumo);
RDebugUtils.currentLine=16515096;
 //BA.debugLineNum = 16515096;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=16515098;
 //BA.debugLineNum = 16515098;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _llenarcomboboxriego(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "llenarcomboboxriego", false))
	 {Debug.delegate(ba, "llenarcomboboxriego", null); return;}
ResumableSub_LlenarComboBoxRiego rsub = new ResumableSub_LlenarComboBoxRiego(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxRiego extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxRiego(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
anywheresoftware.b4a.objects.collections.List _itemsriego = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_tipo_riego = "";
String _dscrpcion_tipo_riego = "";
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Dim ItemsRiego As List";
_itemsriego = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="ItemsRiego.Initialize";
_itemsriego.Initialize();
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="ItemsRiego.Add(\"Seleccionar:\")";
_itemsriego.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_tipoRiego",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxriego"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16384011;
 //BA.debugLineNum = 16384011;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=16384012;
 //BA.debugLineNum = 16384012;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=16384013;
 //BA.debugLineNum = 16384013;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxriego"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=16384014;
 //BA.debugLineNum = 16384014;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group11 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index11 < groupLen11) {
this.state = 6;
_row = (Object[])(group11.Get(index11));}
if (true) break;

case 14:
//C
this.state = 13;
index11++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=16384015;
 //BA.debugLineNum = 16384015;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
_cdgo_tipo_riego = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=16384016;
 //BA.debugLineNum = 16384016;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
_dscrpcion_tipo_riego = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=16384017;
 //BA.debugLineNum = 16384017;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego,";
__ref._sd_xcomboboxtiporiego /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_tipo_riego,(Object)(_cdgo_tipo_riego));
RDebugUtils.currentLine=16384018;
 //BA.debugLineNum = 16384018;BA.debugLine="ItemsRiego.Add(Cdgo_Tipo_Riego&\":\"&Dscrpcion_Ti";
_itemsriego.Add((Object)(_cdgo_tipo_riego+":"+_dscrpcion_tipo_riego));
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
RDebugUtils.currentLine=16384021;
 //BA.debugLineNum = 16384021;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("416384021","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=16384023;
 //BA.debugLineNum = 16384023;BA.debugLine="SearchTemplateRiego.SetItems(ItemsRiego)";
__ref._searchtemplateriego /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsriego);
RDebugUtils.currentLine=16384024;
 //BA.debugLineNum = 16384024;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=16384026;
 //BA.debugLineNum = 16384026;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _llenarcomboboxsiembra(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "llenarcomboboxsiembra", false))
	 {Debug.delegate(ba, "llenarcomboboxsiembra", null); return;}
ResumableSub_LlenarComboBoxSiembra rsub = new ResumableSub_LlenarComboBoxSiembra(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxSiembra extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxSiembra(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
anywheresoftware.b4a.objects.collections.List _itemslabranza = null;
anywheresoftware.b4a.objects.collections.List _itemsvariedad = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_variedad = "";
b4a.example.ef.main._dbcommand _cmdtipolabranza = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _restipolabranza = null;
Object[] _rowtipolabranza = null;
String _cdgo_tipo_labranza = "";
String _dscrpcion_tipo_labranza = "";
anywheresoftware.b4a.BA.IterableList group14;
int index14;
int groupLen14;
anywheresoftware.b4a.BA.IterableList group29;
int index29;
int groupLen29;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="Dim ItemsLabranza As List";
_itemslabranza = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="ItemsLabranza.Initialize";
_itemslabranza.Initialize();
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="ItemsLabranza.Add(\"Seleccionar:\")";
_itemslabranza.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="Dim ItemsVariedad As List";
_itemsvariedad = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="ItemsVariedad.Initialize";
_itemsvariedad.Initialize();
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="ItemsVariedad.Add(\"Seleccionar:\")";
_itemsvariedad.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=16449546;
 //BA.debugLineNum = 16449546;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16449547;
 //BA.debugLineNum = 16449547;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=16449550;
 //BA.debugLineNum = 16449550;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_codVariedad",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=16449551;
 //BA.debugLineNum = 16449551;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16449552;
 //BA.debugLineNum = 16449552;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=16449553;
 //BA.debugLineNum = 16449553;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=16449554;
 //BA.debugLineNum = 16449554;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=16449555;
 //BA.debugLineNum = 16449555;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group14 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index14 = 0;
groupLen14 = group14.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 7;
if (index14 < groupLen14) {
this.state = 6;
_row = (Object[])(group14.Get(index14));}
if (true) break;

case 24:
//C
this.state = 23;
index14++;
if (true) break;

case 6:
//C
this.state = 24;
RDebugUtils.currentLine=16449556;
 //BA.debugLineNum = 16449556;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
_cdgo_variedad = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=16449557;
 //BA.debugLineNum = 16449557;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
__ref._sd_xcomboboxcodigovariedad /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cdgo_variedad,(Object)(_cdgo_variedad));
RDebugUtils.currentLine=16449558;
 //BA.debugLineNum = 16449558;BA.debugLine="ItemsVariedad.Add(Cdgo_Variedad)";
_itemsvariedad.Add((Object)(_cdgo_variedad));
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
RDebugUtils.currentLine=16449561;
 //BA.debugLineNum = 16449561;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("416449561","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=16449563;
 //BA.debugLineNum = 16449563;BA.debugLine="SearchTemplateVariedad.SetItems(ItemsVariedad)";
__ref._searchtemplatevariedad /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsvariedad);
RDebugUtils.currentLine=16449564;
 //BA.debugLineNum = 16449564;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=16449568;
 //BA.debugLineNum = 16449568;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
_cmdtipolabranza = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_tipoLabranza",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=16449569;
 //BA.debugLineNum = 16449569;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdtipolabranza,(int) (0),parent.__c.Null)));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16449570;
 //BA.debugLineNum = 16449570;BA.debugLine="If j4.Success Then";
if (true) break;

case 11:
//if
this.state = 20;
if (_j4._success /*boolean*/ ) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=16449571;
 //BA.debugLineNum = 16449571;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
_req._handlejobasync /*void*/ (null,_j4,"req_TipoLabranza");
RDebugUtils.currentLine=16449572;
 //BA.debugLineNum = 16449572;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
parent.__c.WaitFor("req_tipolabranza_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=16449573;
 //BA.debugLineNum = 16449573;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
if (true) break;

case 14:
//for
this.state = 17;
group29 = _restipolabranza.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index29 = 0;
groupLen29 = group29.getSize();
this.state = 27;
if (true) break;

case 27:
//C
this.state = 17;
if (index29 < groupLen29) {
this.state = 16;
_rowtipolabranza = (Object[])(group29.Get(index29));}
if (true) break;

case 28:
//C
this.state = 27;
index29++;
if (true) break;

case 16:
//C
this.state = 28;
RDebugUtils.currentLine=16449574;
 //BA.debugLineNum = 16449574;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (0)]);
RDebugUtils.currentLine=16449575;
 //BA.debugLineNum = 16449575;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (1)]);
RDebugUtils.currentLine=16449576;
 //BA.debugLineNum = 16449576;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
__ref._sd_xcomboboxtipolabranza /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_tipo_labranza,(Object)(_cdgo_tipo_labranza));
RDebugUtils.currentLine=16449577;
 //BA.debugLineNum = 16449577;BA.debugLine="ItemsLabranza.Add(Cdgo_Variedad&\":\"&Dscrpcion_T";
_itemslabranza.Add((Object)(_cdgo_variedad+":"+_dscrpcion_tipo_labranza));
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
RDebugUtils.currentLine=16449580;
 //BA.debugLineNum = 16449580;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
parent.__c.LogImpl("416449580","Error en la consulta de Tipo_Labranza: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=16449582;
 //BA.debugLineNum = 16449582;BA.debugLine="SearchTemplateTipoLabranza.SetItems(ItemsLabranza";
__ref._searchtemplatetipolabranza /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslabranza);
RDebugUtils.currentLine=16449583;
 //BA.debugLineNum = 16449583;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=16449585;
 //BA.debugLineNum = 16449585;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _removeform0ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform0ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform0ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub RemoveForm0IfExists";
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form0"))) { 
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=15663112;
 //BA.debugLineNum = 15663112;BA.debugLine="End Sub";
return "";
}
public String  _removeform2ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform2ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform2ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub RemoveForm2IfExists";
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form2"))) { 
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=15728648;
 //BA.debugLineNum = 15728648;BA.debugLine="End Sub";
return "";
}
public String  _removeform3ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform3ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform3ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub RemoveForm3IfExists";
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form3"))) { 
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=15794184;
 //BA.debugLineNum = 15794184;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxcodigovariedad_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxcodigovariedad_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxcodigovariedad_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="codigoSiembra = Value";
__ref._codigosiembra /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="Log(\"codigo \" & codigoSiembra)";
__c.LogImpl("415859715","codigo "+__ref._codigosiembra /*String*/ ,0);
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxelemento_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxelemento_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxelemento_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="elementoGasto = Value";
__ref._elementogasto /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="If elementoGasto.Length > 0 Then";
if (__ref._elementogasto /*String*/ .length()>0) { 
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, Min(";
__ref._elementogasto /*String*/  = __ref._elementogasto /*String*/ .substring((int) (0),(int) (__c.Min(2,__ref._elementogasto /*String*/ .length())));
 }else {
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="elementoGasto = \"\" ' Si está vacío, asignar cade";
__ref._elementogasto /*String*/  = "";
 };
RDebugUtils.currentLine=15138829;
 //BA.debugLineNum = 15138829;BA.debugLine="Log(\"Las dos primeras letras (o menos si no hay s";
__c.LogImpl("415138829","Las dos primeras letras (o menos si no hay suficientes): "+__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=15138831;
 //BA.debugLineNum = 15138831;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxhacienda_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxhacienda_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxhacienda_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _position;
Object _value;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codg_hacienda = "";
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="haciendaCBX=Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=14942216;
 //BA.debugLineNum = 14942216;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=14942219;
 //BA.debugLineNum = 14942219;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=14942221;
 //BA.debugLineNum = 14942221;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=14942222;
 //BA.debugLineNum = 14942222;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=14942226;
 //BA.debugLineNum = 14942226;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group9 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index9 < groupLen9) {
this.state = 6;
_row = (Object[])(group9.Get(index9));}
if (true) break;

case 14:
//C
this.state = 13;
index9++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=14942227;
 //BA.debugLineNum = 14942227;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
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
RDebugUtils.currentLine=14942235;
 //BA.debugLineNum = 14942235;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("414942235","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=14942239;
 //BA.debugLineNum = 14942239;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=14942242;
 //BA.debugLineNum = 14942242;BA.debugLine="Log(\"Hacienda\" & haciendaCBX)";
parent.__c.LogImpl("414942242","Hacienda"+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=14942243;
 //BA.debugLineNum = 14942243;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxinsumo_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxinsumo_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxinsumo_itemclick", new Object[] {_position,_value}));}
String[] _partes = null;
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
_partes = __c.Regex.Split(" - ",BA.ObjectToString(_value));
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="NAMEINSUMO = partes(0)";
__ref._nameinsumo /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="IDINSUMO = partes(1)";
__ref._idinsumo /*String*/  = _partes[(int) (1)];
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="elementoLabor = Value";
__ref._elementolabor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Log(\"Elemento labor\" & elementoLabor)";
__c.LogImpl("415073284","Elemento labor"+__ref._elementolabor /*String*/ ,0);
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="loteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="Log(\"Lotecbx\" & loteCBX)";
__c.LogImpl("415007747","Lotecbx"+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxnit_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxnit_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxnit_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxNit_ItemClick rsub = new ResumableSub_SD_xComboBoxNit_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxNit_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNit_ItemClick(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _position;
Object _value;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codg_hacienda = "";
String _nombrehacienda = "";
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=14876685;
 //BA.debugLineNum = 14876685;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=14876690;
 //BA.debugLineNum = 14876690;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group9 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index9 < groupLen9) {
this.state = 6;
_row = (Object[])(group9.Get(index9));}
if (true) break;

case 14:
//C
this.state = 13;
index9++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=14876691;
 //BA.debugLineNum = 14876691;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=14876692;
 //BA.debugLineNum = 14876692;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
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
RDebugUtils.currentLine=14876700;
 //BA.debugLineNum = 14876700;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("414876700","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=14876703;
 //BA.debugLineNum = 14876703;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=14876706;
 //BA.debugLineNum = 14876706;BA.debugLine="Log(\"Nit seleccionado\" &  nitEmpresaCBX)";
parent.__c.LogImpl("414876706","Nit seleccionado"+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=14876707;
 //BA.debugLineNum = 14876707;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxtipolabranza_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtipolabranza_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtipolabranza_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="tipoLabranzaSiembra = Value";
__ref._tipolabranzasiembra /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="Log(\"tipo labranza \"&tipoLabranzaSiembra)";
__c.LogImpl("416187396","tipo labranza "+__ref._tipolabranzasiembra /*String*/ ,0);
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtiporiego_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtiporiego_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtiporiego_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="tipoRiego = Value";
__ref._tiporiego /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="Log(\"tipo riego\" & tipoRiego)";
__c.LogImpl("415597571","tipo riego"+__ref._tiporiego /*String*/ ,0);
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtypeform_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtypeform_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtypeform_itemclick", new Object[] {_position,_value}));}
b4a.example.ef.b4xtable._b4xtablecolumn _insumocolum = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="tipoLabor = Value";
__ref._tipolabor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="If IsNumber(Value) Then";
if (__c.IsNumber(BA.ObjectToString(_value))) { 
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="Select Case Value";
switch (BA.switchObjectToInt(_value,(Object)(0),(Object)(1),(Object)(2))) {
case 0: {
RDebugUtils.currentLine=15335431;
 //BA.debugLineNum = 15335431;BA.debugLine="RemoveForm2IfExists";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=15335433;
 //BA.debugLineNum = 15335433;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createiteminsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form0"));
RDebugUtils.currentLine=15335434;
 //BA.debugLineNum = 15335434;BA.debugLine="LlenarComboBoxInsumo";
__ref._llenarcomboboxinsumo /*void*/ (null);
RDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.";
_insumocolum = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"#",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_numbers /*int*/ );
RDebugUtils.currentLine=15335436;
 //BA.debugLineNum = 15335436;BA.debugLine="INSUMOCOLUM.Width = 50dip";
_insumocolum.Width /*int*/  = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=15335437;
 //BA.debugLineNum = 15335437;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYP";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"ID",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=15335438;
 //BA.debugLineNum = 15335438;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"NOMBRE",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=15335439;
 //BA.debugLineNum = 15335439;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLU";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"CANTIDAD",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=15335441;
 //BA.debugLineNum = 15335441;BA.debugLine="cantidadInsumos = 0";
__ref._cantidadinsumos /*int*/  = (int) (0);
RDebugUtils.currentLine=15335442;
 //BA.debugLineNum = 15335442;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=15335443;
 //BA.debugLineNum = 15335443;BA.debugLine="CANTINSUMO = \"\"";
__ref._cantinsumo /*String*/  = "";
 break; }
case 1: {
RDebugUtils.currentLine=15335445;
 //BA.debugLineNum = 15335445;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=15335446;
 //BA.debugLineNum = 15335446;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=15335447;
 //BA.debugLineNum = 15335447;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemsiembra /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form3"));
RDebugUtils.currentLine=15335448;
 //BA.debugLineNum = 15335448;BA.debugLine="LlenarComboBoxSiembra";
__ref._llenarcomboboxsiembra /*void*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=15335450;
 //BA.debugLineNum = 15335450;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=15335451;
 //BA.debugLineNum = 15335451;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=15335452;
 //BA.debugLineNum = 15335452;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemriego /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form2"));
RDebugUtils.currentLine=15335453;
 //BA.debugLineNum = 15335453;BA.debugLine="LlenarComboBoxRiego";
__ref._llenarcomboboxriego /*void*/ (null);
 break; }
default: {
RDebugUtils.currentLine=15335456;
 //BA.debugLineNum = 15335456;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
__c.LogImpl("415335456","Valor no reconocido: "+BA.ObjectToString(_value),0);
 break; }
}
;
 }else {
RDebugUtils.currentLine=15335459;
 //BA.debugLineNum = 15335459;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
__c.LogImpl("415335459","Error: Value no es un número válido.",0);
 };
RDebugUtils.currentLine=15335462;
 //BA.debugLineNum = 15335462;BA.debugLine="Log(\"Tipo labor \" & tipoLabor)";
__c.LogImpl("415335462","Tipo labor "+__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=15335463;
 //BA.debugLineNum = 15335463;BA.debugLine="End Sub";
return "";
}
public void  _swiftbuttonelemento_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "swiftbuttonelemento_click", false))
	 {Debug.delegate(ba, "swiftbuttonelemento_click", null); return;}
ResumableSub_SwiftButtonElemento_Click rsub = new ResumableSub_SwiftButtonElemento_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonElemento_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonElemento_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateEleme";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonelemento_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateelemento /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="SwiftButtonElemento.xLBL.Text = SearchTemplateEl";
__ref._swiftbuttonelemento /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateelemento /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=17498117;
 //BA.debugLineNum = 17498117;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplateelemento /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=17498118;
 //BA.debugLineNum = 17498118;BA.debugLine="elementoGasto = Partes(0) ' Asignar solo la prim";
__ref._elementogasto /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=17498121;
 //BA.debugLineNum = 17498121;BA.debugLine="If elementoGasto.Length >= 2 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._elementogasto /*String*/ .length()>=2) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=17498122;
 //BA.debugLineNum = 17498122;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, 2)";
__ref._elementogasto /*String*/  = __ref._elementogasto /*String*/ .substring((int) (0),(int) (2));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=17498125;
 //BA.debugLineNum = 17498125;BA.debugLine="elementoGasto = elementoGasto";
__ref._elementogasto /*String*/  = __ref._elementogasto /*String*/ ;
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
RDebugUtils.currentLine=17498128;
 //BA.debugLineNum = 17498128;BA.debugLine="Log(elementoGasto)";
parent.__c.LogImpl("417498128",__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=17498129;
 //BA.debugLineNum = 17498129;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonhacienda_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "swiftbuttonhacienda_click", false))
	 {Debug.delegate(ba, "swiftbuttonhacienda_click", null); return;}
ResumableSub_SwiftButtonHacienda_Click rsub = new ResumableSub_SwiftButtonHacienda_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonHacienda_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonHacienda_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
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
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Dim ItemsLote As List";
_itemslote = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="ItemsLote.Initialize";
_itemslote.Initialize();
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonhacienda_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17301509;
 //BA.debugLineNum = 17301509;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=17301510;
 //BA.debugLineNum = 17301510;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=17301511;
 //BA.debugLineNum = 17301511;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
_haciendacompleto = __ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=17301512;
 //BA.debugLineNum = 17301512;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
_partes = parent.__c.Regex.Split(":",_haciendacompleto);
RDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="haciendaCBX = Partes(0)";
__ref._haciendacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=17301514;
 //BA.debugLineNum = 17301514;BA.debugLine="ItemsLote.Clear";
_itemslote.Clear();
RDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
_itemslote.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=17301516;
 //BA.debugLineNum = 17301516;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=17301518;
 //BA.debugLineNum = 17301518;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=17301519;
 //BA.debugLineNum = 17301519;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=17301520;
 //BA.debugLineNum = 17301520;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=17301523;
 //BA.debugLineNum = 17301523;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonhacienda_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17301526;
 //BA.debugLineNum = 17301526;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=17301528;
 //BA.debugLineNum = 17301528;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=17301529;
 //BA.debugLineNum = 17301529;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonhacienda_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=17301533;
 //BA.debugLineNum = 17301533;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=17301534;
 //BA.debugLineNum = 17301534;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=17301538;
 //BA.debugLineNum = 17301538;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
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
RDebugUtils.currentLine=17301543;
 //BA.debugLineNum = 17301543;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("417301543","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=17301545;
 //BA.debugLineNum = 17301545;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslote);
RDebugUtils.currentLine=17301546;
 //BA.debugLineNum = 17301546;BA.debugLine="SwiftButtonLote.Enabled = True";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=17301547;
 //BA.debugLineNum = 17301547;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("417301547",__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=17301549;
 //BA.debugLineNum = 17301549;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=17301552;
 //BA.debugLineNum = 17301552;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttoninsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "swiftbuttoninsumo_click", false))
	 {Debug.delegate(ba, "swiftbuttoninsumo_click", null); return;}
ResumableSub_SwiftButtonInsumo_Click rsub = new ResumableSub_SwiftButtonInsumo_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonInsumo_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonInsumo_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _result = 0;
String _insumocompleto = "";
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateInsum";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttoninsumo_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateinsumo /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="SwiftButtonInsumo.xLBL.Text = SearchTemplateInsu";
__ref._swiftbuttoninsumo /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateinsumo /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="Dim INSUMOCOMPLETO As String = SearchTemplateIns";
_insumocompleto = __ref._searchtemplateinsumo /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=17629189;
 //BA.debugLineNum = 17629189;BA.debugLine="Dim partes() As String = Regex.Split(\":\", INSUMO";
_partes = parent.__c.Regex.Split(":",_insumocompleto);
RDebugUtils.currentLine=17629190;
 //BA.debugLineNum = 17629190;BA.debugLine="NAMEINSUMO = partes(1)";
__ref._nameinsumo /*String*/  = _partes[(int) (1)];
RDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="IDINSUMO = partes(0)";
__ref._idinsumo /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17629193;
 //BA.debugLineNum = 17629193;BA.debugLine="Log(IDINSUMO)";
parent.__c.LogImpl("417629193",__ref._idinsumo /*String*/ ,0);
RDebugUtils.currentLine=17629194;
 //BA.debugLineNum = 17629194;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonlabor_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "swiftbuttonlabor_click", false))
	 {Debug.delegate(ba, "swiftbuttonlabor_click", null); return;}
ResumableSub_SwiftButtonLabor_Click rsub = new ResumableSub_SwiftButtonLabor_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonLabor_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLabor_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonlabor_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
__ref._swiftbuttonlabor /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="elementoLabor = Partes(0) ' Asignar solo la prim";
__ref._elementolabor /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17432584;
 //BA.debugLineNum = 17432584;BA.debugLine="Log(elementoLabor)";
parent.__c.LogImpl("417432584",__ref._elementolabor /*String*/ ,0);
RDebugUtils.currentLine=17432585;
 //BA.debugLineNum = 17432585;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonlote_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "swiftbuttonlote_click", false))
	 {Debug.delegate(ba, "swiftbuttonlote_click", null); return;}
ResumableSub_SwiftButtonLote_Click rsub = new ResumableSub_SwiftButtonLote_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonLote_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLote_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonlote_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.S";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="loteCBX = Partes(0) ' Asignar solo la primera pa";
__ref._lotecbx /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="Log(loteCBX)";
parent.__c.LogImpl("417367049",__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=17367050;
 //BA.debugLineNum = 17367050;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonnit_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "swiftbuttonnit_click", false))
	 {Debug.delegate(ba, "swiftbuttonnit_click", null); return;}
ResumableSub_SwiftButtonNit_Click rsub = new ResumableSub_SwiftButtonNit_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonNit_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonNit_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
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
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="Dim ItemsHacienda As List";
_itemshacienda = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="ItemsHacienda.Initialize";
_itemshacienda.Initialize();
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonnit_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=17235973;
 //BA.debugLineNum = 17235973;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
__ref._swiftbuttonnit /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=17235974;
 //BA.debugLineNum = 17235974;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
_nitcompleto = __ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=17235975;
 //BA.debugLineNum = 17235975;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
_partes = parent.__c.Regex.Split(":",_nitcompleto);
RDebugUtils.currentLine=17235976;
 //BA.debugLineNum = 17235976;BA.debugLine="nitEmpresaCBX = Partes(0)";
__ref._nitempresacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=17235977;
 //BA.debugLineNum = 17235977;BA.debugLine="ItemsHacienda.Clear";
_itemshacienda.Clear();
RDebugUtils.currentLine=17235978;
 //BA.debugLineNum = 17235978;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
_itemshacienda.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=17235979;
 //BA.debugLineNum = 17235979;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=17235981;
 //BA.debugLineNum = 17235981;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=17235982;
 //BA.debugLineNum = 17235982;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=17235983;
 //BA.debugLineNum = 17235983;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)(__ref._nitempresacbx /*String*/ )});
RDebugUtils.currentLine=17235986;
 //BA.debugLineNum = 17235986;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonnit_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17235989;
 //BA.debugLineNum = 17235989;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=17235991;
 //BA.debugLineNum = 17235991;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=17235992;
 //BA.debugLineNum = 17235992;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonnit_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=17235996;
 //BA.debugLineNum = 17235996;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=17235997;
 //BA.debugLineNum = 17235997;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=17235998;
 //BA.debugLineNum = 17235998;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=17236003;
 //BA.debugLineNum = 17236003;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
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
RDebugUtils.currentLine=17236008;
 //BA.debugLineNum = 17236008;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("417236008","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=17236010;
 //BA.debugLineNum = 17236010;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemshacienda);
RDebugUtils.currentLine=17236011;
 //BA.debugLineNum = 17236011;BA.debugLine="SwiftButtonHacienda.Enabled = True";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=17236012;
 //BA.debugLineNum = 17236012;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("417236012",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=17236014;
 //BA.debugLineNum = 17236014;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=17236017;
 //BA.debugLineNum = 17236017;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonriego_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "swiftbuttonriego_click", false))
	 {Debug.delegate(ba, "swiftbuttonriego_click", null); return;}
ResumableSub_SwiftButtonRiego_Click rsub = new ResumableSub_SwiftButtonRiego_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonRiego_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonRiego_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateRiego";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonriego_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateriego /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="SwiftButtonRiego.xLBL.Text = SearchTemplateRiego";
__ref._swiftbuttonriego /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateriego /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplateriego /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="tipoRiego = Partes(0) ' Asignar solo la primera";
__ref._tiporiego /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="Log(tipoRiego)";
parent.__c.LogImpl("417694728",__ref._tiporiego /*String*/ ,0);
RDebugUtils.currentLine=17694729;
 //BA.debugLineNum = 17694729;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttontipolabranza_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "swiftbuttontipolabranza_click", false))
	 {Debug.delegate(ba, "swiftbuttontipolabranza_click", null); return;}
ResumableSub_SwiftButtonTipoLabranza_Click rsub = new ResumableSub_SwiftButtonTipoLabranza_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonTipoLabranza_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonTipoLabranza_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTipoL";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttontipolabranza_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatetipolabranza /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="SwiftButtonTipoLabranza.xLBL.Text = SearchTempla";
__ref._swiftbuttontipolabranza /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatetipolabranza /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=17760261;
 //BA.debugLineNum = 17760261;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatetipolabranza /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=17760264;
 //BA.debugLineNum = 17760264;BA.debugLine="tipoLabranzaSiembra = Partes(0)";
__ref._tipolabranzasiembra /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=17760265;
 //BA.debugLineNum = 17760265;BA.debugLine="If tipoLabranzaSiembra.Length >= 2 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (__ref._tipolabranzasiembra /*String*/ .length()>=2) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17760266;
 //BA.debugLineNum = 17760266;BA.debugLine="tipoLabranzaSiembra = tipoLabranzaSiembra.SubSt";
__ref._tipolabranzasiembra /*String*/  = __ref._tipolabranzasiembra /*String*/ .substring((int) (__ref._tipolabranzasiembra /*String*/ .length()-2));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=17760270;
 //BA.debugLineNum = 17760270;BA.debugLine="Log(tipoLabranzaSiembra)";
parent.__c.LogImpl("417760270",__ref._tipolabranzasiembra /*String*/ ,0);
RDebugUtils.currentLine=17760271;
 //BA.debugLineNum = 17760271;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttontypeform_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "swiftbuttontypeform_click", false))
	 {Debug.delegate(ba, "swiftbuttontypeform_click", null); return;}
ResumableSub_SwiftButtonTypeForm_Click rsub = new ResumableSub_SwiftButtonTypeForm_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonTypeForm_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonTypeForm_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _result = 0;
String _typeformcompleto = "";
String[] _partes = null;
String _tipoform = "";
b4a.example.ef.b4xtable._b4xtablecolumn _insumocolum = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTypeF";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttontypeform_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatetypeform /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="SwiftButtonTypeForm.xLBL.Text = SearchTemplateTy";
__ref._swiftbuttontypeform /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatetypeform /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="Dim TYPEFORMCOMPLETO As String = SearchTemplateT";
_typeformcompleto = __ref._searchtemplatetypeform /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", TYPEFO";
_partes = parent.__c.Regex.Split(":",_typeformcompleto);
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="tipoLabor = Partes(0)";
__ref._tipolabor /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="Log(tipoLabor)";
parent.__c.LogImpl("417563655",__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="Dim tipoForm As String = Partes(0)";
_tipoform = _partes[(int) (0)];
RDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="Select Case tipoForm";
if (true) break;

case 4:
//select
this.state = 13;
switch (BA.switchObjectToInt(_tipoform,"0","1","2")) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 8;
if (true) break;
}
case 2: {
this.state = 10;
if (true) break;
}
default: {
this.state = 12;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=17563660;
 //BA.debugLineNum = 17563660;BA.debugLine="RemoveForm2IfExists";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=17563661;
 //BA.debugLineNum = 17563661;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"form";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createiteminsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form0"));
RDebugUtils.currentLine=17563663;
 //BA.debugLineNum = 17563663;BA.debugLine="LlenarComboBoxInsumo";
__ref._llenarcomboboxinsumo /*void*/ (null);
RDebugUtils.currentLine=17563664;
 //BA.debugLineNum = 17563664;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.A";
_insumocolum = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"#",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_numbers /*int*/ );
RDebugUtils.currentLine=17563665;
 //BA.debugLineNum = 17563665;BA.debugLine="INSUMOCOLUM.Width = 50dip";
_insumocolum.Width /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=17563666;
 //BA.debugLineNum = 17563666;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYPE";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"ID",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=17563667;
 //BA.debugLineNum = 17563667;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN_";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"NOMBRE",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=17563668;
 //BA.debugLineNum = 17563668;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLUM";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"CANTIDAD",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=17563670;
 //BA.debugLineNum = 17563670;BA.debugLine="cantidadInsumos = 0";
__ref._cantidadinsumos /*int*/  = (int) (0);
RDebugUtils.currentLine=17563671;
 //BA.debugLineNum = 17563671;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=17563672;
 //BA.debugLineNum = 17563672;BA.debugLine="CANTINSUMO = \"\"";
__ref._cantinsumo /*String*/  = "";
 if (true) break;

case 8:
//C
this.state = 13;
RDebugUtils.currentLine=17563674;
 //BA.debugLineNum = 17563674;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=17563675;
 //BA.debugLineNum = 17563675;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exist";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=17563676;
 //BA.debugLineNum = 17563676;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemsiembra /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form3"));
RDebugUtils.currentLine=17563677;
 //BA.debugLineNum = 17563677;BA.debugLine="LlenarComboBoxSiembra";
__ref._llenarcomboboxsiembra /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=17563679;
 //BA.debugLineNum = 17563679;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=17563680;
 //BA.debugLineNum = 17563680;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=17563681;
 //BA.debugLineNum = 17563681;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"form";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemriego /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form2"));
RDebugUtils.currentLine=17563682;
 //BA.debugLineNum = 17563682;BA.debugLine="LlenarComboBoxRiego";
__ref._llenarcomboboxriego /*void*/ (null);
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=17563685;
 //BA.debugLineNum = 17563685;BA.debugLine="Log(\"Valor no reconocido: \" & tipoForm)";
parent.__c.LogImpl("417563685","Valor no reconocido: "+_tipoform,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=17563689;
 //BA.debugLineNum = 17563689;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonvariedad_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "swiftbuttonvariedad_click", false))
	 {Debug.delegate(ba, "swiftbuttonvariedad_click", null); return;}
ResumableSub_SwiftButtonVariedad_Click rsub = new ResumableSub_SwiftButtonVariedad_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonVariedad_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonVariedad_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateVarie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonvariedad_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatevariedad /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="SwiftButtonVariedad.xLBL.Text = SearchTemplateVa";
__ref._swiftbuttonvariedad /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatevariedad /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatevariedad /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=17825798;
 //BA.debugLineNum = 17825798;BA.debugLine="codigoSiembra = Partes(0)";
__ref._codigosiembra /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17825800;
 //BA.debugLineNum = 17825800;BA.debugLine="Log(codigoSiembra)";
parent.__c.LogImpl("417825800",__ref._codigosiembra /*String*/ ,0);
RDebugUtils.currentLine=17825801;
 //BA.debugLineNum = 17825801;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}