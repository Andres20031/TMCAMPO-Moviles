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
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formlabores __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
String[] _dateparts = null;
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
RDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
RDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
RDebugUtils.currentLine=10354706;
 //BA.debugLineNum = 10354706;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=10354709;
 //BA.debugLineNum = 10354709;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=10354712;
 //BA.debugLineNum = 10354712;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=10354715;
 //BA.debugLineNum = 10354715;BA.debugLine="fechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=10354718;
 //BA.debugLineNum = 10354718;BA.debugLine="Log(\"Fecha inicio: \" & fechaInicio)";
__c.LogImpl("710354718","Fecha inicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=10354719;
 //BA.debugLineNum = 10354719;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formlabores __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
String[] _dateparts = null;
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
RDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
RDebugUtils.currentLine=10420242;
 //BA.debugLineNum = 10420242;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=10420245;
 //BA.debugLineNum = 10420245;BA.debugLine="Label14Time.Text = formattedDate";
__ref._label14time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=10420248;
 //BA.debugLineNum = 10420248;BA.debugLine="Panel3.Visible = False";
__ref._panel3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=10420251;
 //BA.debugLineNum = 10420251;BA.debugLine="fechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=10420254;
 //BA.debugLineNum = 10420254;BA.debugLine="Log(\"Fecha fin: \" & fechaFin)";
__c.LogImpl("710420254","Fecha fin: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=10420255;
 //BA.debugLineNum = 10420255;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9895952;
 //BA.debugLineNum = 9895952;BA.debugLine="SearchTemplateNit.Initialize";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9895954;
 //BA.debugLineNum = 9895954;BA.debugLine="Dim ItemsNit As List";
_itemsnit = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9895955;
 //BA.debugLineNum = 9895955;BA.debugLine="ItemsNit.Initialize";
_itemsnit.Initialize();
RDebugUtils.currentLine=9895956;
 //BA.debugLineNum = 9895956;BA.debugLine="ItemsNit.Add(\"Seleccionar:\")";
_itemsnit.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=9895959;
 //BA.debugLineNum = 9895959;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9895960;
 //BA.debugLineNum = 9895960;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 51;
return;
case 51:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9895961;
 //BA.debugLineNum = 9895961;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9895962;
 //BA.debugLineNum = 9895962;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=9895963;
 //BA.debugLineNum = 9895963;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 52;
return;
case 52:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9895964;
 //BA.debugLineNum = 9895964;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=9895965;
 //BA.debugLineNum = 9895965;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=9895966;
 //BA.debugLineNum = 9895966;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=9895967;
 //BA.debugLineNum = 9895967;BA.debugLine="ItemsNit.Add(nit&\":\"&razonSocial )";
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
RDebugUtils.currentLine=9895970;
 //BA.debugLineNum = 9895970;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("79895970","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=9895972;
 //BA.debugLineNum = 9895972;BA.debugLine="SearchTemplateNit.SetItems(ItemsNit)";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsnit);
RDebugUtils.currentLine=9895973;
 //BA.debugLineNum = 9895973;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=9895976;
 //BA.debugLineNum = 9895976;BA.debugLine="SearchTemplateHacienda.Initialize";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9895978;
 //BA.debugLineNum = 9895978;BA.debugLine="SearchTemplateLote.Initialize";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9895983;
 //BA.debugLineNum = 9895983;BA.debugLine="SearchTemplateLabor.Initialize";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9895985;
 //BA.debugLineNum = 9895985;BA.debugLine="Dim ItemsLabor As List";
_itemslabor = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9895986;
 //BA.debugLineNum = 9895986;BA.debugLine="ItemsLabor.Initialize";
_itemslabor.Initialize();
RDebugUtils.currentLine=9895987;
 //BA.debugLineNum = 9895987;BA.debugLine="ItemsLabor.Add(\"Seleccionar:\")";
_itemslabor.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=9895990;
 //BA.debugLineNum = 9895990;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor_maq",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9895991;
 //BA.debugLineNum = 9895991;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 55;
return;
case 55:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9895992;
 //BA.debugLineNum = 9895992;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=9895993;
 //BA.debugLineNum = 9895993;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (null,_j3,"req_labormaquina");
RDebugUtils.currentLine=9895994;
 //BA.debugLineNum = 9895994;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 56;
return;
case 56:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9895995;
 //BA.debugLineNum = 9895995;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
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
RDebugUtils.currentLine=9895996;
 //BA.debugLineNum = 9895996;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
RDebugUtils.currentLine=9895997;
 //BA.debugLineNum = 9895997;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
RDebugUtils.currentLine=9895998;
 //BA.debugLineNum = 9895998;BA.debugLine="ItemsLabor.Add(codigoLaborMaquina&\":\"&descripci";
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
RDebugUtils.currentLine=9896001;
 //BA.debugLineNum = 9896001;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("79896001","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=9896003;
 //BA.debugLineNum = 9896003;BA.debugLine="SearchTemplateLabor.SetItems(ItemsLabor)";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslabor);
RDebugUtils.currentLine=9896004;
 //BA.debugLineNum = 9896004;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=9896008;
 //BA.debugLineNum = 9896008;BA.debugLine="SearchTemplateElemento.Initialize";
__ref._searchtemplateelemento /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9896010;
 //BA.debugLineNum = 9896010;BA.debugLine="Dim ItemsElemento As List";
_itemselemento = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9896011;
 //BA.debugLineNum = 9896011;BA.debugLine="ItemsElemento.Initialize";
_itemselemento.Initialize();
RDebugUtils.currentLine=9896012;
 //BA.debugLineNum = 9896012;BA.debugLine="ItemsElemento.Add(\"Seleccionar:\")";
_itemselemento.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=9896016;
 //BA.debugLineNum = 9896016;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
_cmdelementogasto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_elementoGasto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9896017;
 //BA.debugLineNum = 9896017;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdelementogasto,(int) (0),parent.__c.Null)));
this.state = 59;
return;
case 59:
//C
this.state = 21;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9896018;
 //BA.debugLineNum = 9896018;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=9896019;
 //BA.debugLineNum = 9896019;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
_req._handlejobasync /*void*/ (null,_j4,"req_elementoGasto");
RDebugUtils.currentLine=9896020;
 //BA.debugLineNum = 9896020;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
parent.__c.WaitFor("req_elementogasto_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 60;
return;
case 60:
//C
this.state = 24;
_reselementogasto = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9896021;
 //BA.debugLineNum = 9896021;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
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
RDebugUtils.currentLine=9896022;
 //BA.debugLineNum = 9896022;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
_codigoelementogasto = BA.ObjectToString(_rowelementogasto[(int) (0)]);
RDebugUtils.currentLine=9896023;
 //BA.debugLineNum = 9896023;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto[(int) (1)]);
RDebugUtils.currentLine=9896025;
 //BA.debugLineNum = 9896025;BA.debugLine="ItemsElemento.Add(codigoElementoGasto&\":\"&descr";
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
RDebugUtils.currentLine=9896028;
 //BA.debugLineNum = 9896028;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("79896028","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=9896030;
 //BA.debugLineNum = 9896030;BA.debugLine="SearchTemplateElemento.SetItems(ItemsElemento)";
__ref._searchtemplateelemento /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemselemento);
RDebugUtils.currentLine=9896031;
 //BA.debugLineNum = 9896031;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=9896037;
 //BA.debugLineNum = 9896037;BA.debugLine="SearchTemplateTypeForm.Initialize";
__ref._searchtemplatetypeform /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9896039;
 //BA.debugLineNum = 9896039;BA.debugLine="Dim ItemsTypeForm As List";
_itemstypeform = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9896040;
 //BA.debugLineNum = 9896040;BA.debugLine="ItemsTypeForm.Initialize";
_itemstypeform.Initialize();
RDebugUtils.currentLine=9896041;
 //BA.debugLineNum = 9896041;BA.debugLine="ItemsTypeForm.Add(\"0\"&\":\"&\"Insumo\")";
_itemstypeform.Add((Object)("0"+":"+"Insumo"));
RDebugUtils.currentLine=9896042;
 //BA.debugLineNum = 9896042;BA.debugLine="ItemsTypeForm.Add(\"1\"&\":\"&\"Siembra\")";
_itemstypeform.Add((Object)("1"+":"+"Siembra"));
RDebugUtils.currentLine=9896043;
 //BA.debugLineNum = 9896043;BA.debugLine="ItemsTypeForm.Add(\"2\"&\":\"&\"Riego\")";
_itemstypeform.Add((Object)("2"+":"+"Riego"));
RDebugUtils.currentLine=9896044;
 //BA.debugLineNum = 9896044;BA.debugLine="SearchTemplateTypeForm.SetItems(ItemsTypeForm)";
__ref._searchtemplatetypeform /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemstypeform);
RDebugUtils.currentLine=9896048;
 //BA.debugLineNum = 9896048;BA.debugLine="data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9896051;
 //BA.debugLineNum = 9896051;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdLabor",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9896052;
 //BA.debugLineNum = 9896052;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 63;
return;
case 63:
//C
this.state = 31;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9896054;
 //BA.debugLineNum = 9896054;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=9896055;
 //BA.debugLineNum = 9896055;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=9896056;
 //BA.debugLineNum = 9896056;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 64;
return;
case 64:
//C
this.state = 34;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9896058;
 //BA.debugLineNum = 9896058;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
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
RDebugUtils.currentLine=9896059;
 //BA.debugLineNum = 9896059;BA.debugLine="Dim ultimoRegistro As Int = rowRegistro(0) ' Nu";
_ultimoregistro = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=9896060;
 //BA.debugLineNum = 9896060;BA.debugLine="Log(\"Último Registro obtenido: \" & ultimoRegist";
parent.__c.LogImpl("79896060","Último Registro obtenido: "+BA.NumberToString(_ultimoregistro),0);
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
RDebugUtils.currentLine=9896064;
 //BA.debugLineNum = 9896064;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("79896064","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=9896067;
 //BA.debugLineNum = 9896067;BA.debugLine="consecutivo = ultimoRegistro + 1";
__ref._consecutivo /*int*/  = (int) (_ultimoregistro+1);
RDebugUtils.currentLine=9896069;
 //BA.debugLineNum = 9896069;BA.debugLine="Log(consecutivo)";
parent.__c.LogImpl("79896069",BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=9896071;
 //BA.debugLineNum = 9896071;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdSiembra",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9896072;
 //BA.debugLineNum = 9896072;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 67;
return;
case 67:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9896074;
 //BA.debugLineNum = 9896074;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=9896075;
 //BA.debugLineNum = 9896075;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=9896076;
 //BA.debugLineNum = 9896076;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 68;
return;
case 68:
//C
this.state = 44;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9896078;
 //BA.debugLineNum = 9896078;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
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
RDebugUtils.currentLine=9896079;
 //BA.debugLineNum = 9896079;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=9896080;
 //BA.debugLineNum = 9896080;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("79896080","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
RDebugUtils.currentLine=9896084;
 //BA.debugLineNum = 9896084;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("79896084","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = -1;
;
RDebugUtils.currentLine=9896087;
 //BA.debugLineNum = 9896087;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
__ref._consecutivosiembra /*int*/  = (int) (_ultimoregistrosiembra+1);
RDebugUtils.currentLine=9896089;
 //BA.debugLineNum = 9896089;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("79896089",BA.NumberToString(__ref._consecutivosiembra /*int*/ ),0);
RDebugUtils.currentLine=9896091;
 //BA.debugLineNum = 9896091;BA.debugLine="SearchTemplateInsumo.Initialize";
__ref._searchtemplateinsumo /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9896093;
 //BA.debugLineNum = 9896093;BA.debugLine="SearchTemplateRiego.Initialize";
__ref._searchtemplateriego /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9896095;
 //BA.debugLineNum = 9896095;BA.debugLine="SearchTemplateTipoLabranza.Initialize";
__ref._searchtemplatetipolabranza /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9896097;
 //BA.debugLineNum = 9896097;BA.debugLine="SearchTemplateVariedad.Initialize";
__ref._searchtemplatevariedad /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9896098;
 //BA.debugLineNum = 9896098;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
_panel.LoadLayout("addLaboresUI",ba);
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formlabores __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formlabores __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Base = Root";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="Dialog.Initialize (Base)";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="Dialog.Title = \"Buscador\"";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._title /*Object*/  = (Object)("Buscador");
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Log(\"COLUM ID\"&ColumnId)";
__c.LogImpl("712517377","COLUM ID"+_columnid,0);
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="Log(\"ROW ID\"&RowId)";
__c.LogImpl("712517378","ROW ID"+BA.NumberToString(_rowid),0);
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="PanelTittleInsumo.Visible = True";
__ref._paneltittleinsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=12517381;
 //BA.debugLineNum = 12517381;BA.debugLine="Dim ID As String  = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="Dim nombreInsu As String = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="Dim cantidadInsu As Int = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
RDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="LabelInsumoSelect.Text = \"- \"&nombreInsu&\" / \"&\"C";
__ref._labelinsumoselect /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- "+_nombreinsu+" / "+"Cantidad: "+BA.NumberToString(_cantidadinsu)));
RDebugUtils.currentLine=12517385;
 //BA.debugLineNum = 12517385;BA.debugLine="PanelInsumoSelect.Visible = True";
__ref._panelinsumoselect /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=12517386;
 //BA.debugLineNum = 12517386;BA.debugLine="ButtonDeleteInsumo.Visible = True";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=12517388;
 //BA.debugLineNum = 12517388;BA.debugLine="idEliminarTabla = rowData.Get(\"#\")";
__ref._ideliminartabla /*int*/  = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("#"))));
RDebugUtils.currentLine=12517389;
 //BA.debugLineNum = 12517389;BA.debugLine="Log(idEliminarTabla)";
__c.LogImpl("712517389",BA.NumberToString(__ref._ideliminartabla /*int*/ ),0);
RDebugUtils.currentLine=12517390;
 //BA.debugLineNum = 12517390;BA.debugLine="End Sub";
return "";
}
public String  _buttonaddinsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttonaddinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "buttonaddinsumo_click", null));}
int _numberinsumo = 0;
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Private Sub ButtonAddInsumo_Click";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
if ((__ref._nameinsumo /*String*/ ).equals("") && (__ref._idinsumo /*String*/ ).equals("") && (__ref._cantinsumo /*String*/ ).equals("")) { 
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
__c.MsgboxAsync(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo"),BA.ObjectToCharSequence("Error"),ba);
 }else {
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
__ref._cantidadinsumos /*int*/  = (int) (__ref._cantidadinsumos /*int*/ +1);
RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="Dim numberInsumo As Int = cantidadInsumos";
_numberinsumo = __ref._cantidadinsumos /*int*/ ;
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="data.Add(Array As Object(numberInsumo,IDINSUMO,N";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new Object[]{(Object)(_numberinsumo),(Object)(__ref._idinsumo /*String*/ ),(Object)(__ref._nameinsumo /*String*/ ),(Object)(__ref._cantinsumo /*String*/ )}));
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="B4XTable1.SetData(data)";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=12386312;
 //BA.debugLineNum = 12386312;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
__ref._edittextcantidadinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=12386315;
 //BA.debugLineNum = 12386315;BA.debugLine="End Sub";
return "";
}
public String  _buttondeleteinsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttondeleteinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "buttondeleteinsumo_click", null));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="RemoveInsumoFromData(idEliminarTabla)";
__ref._removeinsumofromdata /*String*/ (null,__ref._ideliminartabla /*int*/ );
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="ButtonDeleteInsumo.Visible = False";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
__ref._cantidadinsumos /*int*/  = (int) (__ref._cantidadinsumos /*int*/ -1);
RDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="PanelTittleInsumo.Visible = False";
__ref._paneltittleinsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=12451848;
 //BA.debugLineNum = 12451848;BA.debugLine="PanelInsumoSelect.Visible = False";
__ref._panelinsumoselect /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="ButtonDeleteInsumo.Visible = False";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=12451850;
 //BA.debugLineNum = 12451850;BA.debugLine="End Sub";
return "";
}
public String  _removeinsumofromdata(b4a.example.ef.formlabores __ref,int _insumoid) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeinsumofromdata", false))
	 {return ((String) Debug.delegate(ba, "removeinsumofromdata", new Object[] {_insumoid}));}
int _i = 0;
Object[] _arrayelement = null;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub RemoveInsumoFromData(insumoID As Int)";
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="For i = data.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="Dim arrayElement() As Object = data.Get(i)";
_arrayelement = (Object[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="If arrayElement(0) = insumoID Then";
if ((_arrayelement[(int) (0)]).equals((Object)(_insumoid))) { 
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="data.RemoveAt(i)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="B4XTable1.SetData(data)";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ );
 };
 }
};
RDebugUtils.currentLine=12582926;
 //BA.debugLineNum = 12582926;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="For i = 0 To B4XTable1.VisibleRowIds.Size - 1";
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
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="Dim RowId As Long = B4XTable1.VisibleRowIds.Get(";
_rowid = BA.ObjectToLongNumber(__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=12713993;
 //BA.debugLineNum = 12713993;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=12713996;
 //BA.debugLineNum = 12713996;BA.debugLine="Dim ID As String";
_id = "";
RDebugUtils.currentLine=12713997;
 //BA.debugLineNum = 12713997;BA.debugLine="If rowData.ContainsKey(\"ID\") And rowData.Get(\"ID";
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
RDebugUtils.currentLine=12713998;
 //BA.debugLineNum = 12713998;BA.debugLine="ID = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=12714000;
 //BA.debugLineNum = 12714000;BA.debugLine="ID = \"No ID\" ' Valor predeterminado si no se en";
_id = "No ID";
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=12714004;
 //BA.debugLineNum = 12714004;BA.debugLine="Dim nombreInsu As String";
_nombreinsu = "";
RDebugUtils.currentLine=12714005;
 //BA.debugLineNum = 12714005;BA.debugLine="If rowData.ContainsKey(\"NOMBRE\") And rowData.Get";
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
RDebugUtils.currentLine=12714006;
 //BA.debugLineNum = 12714006;BA.debugLine="nombreInsu = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=12714008;
 //BA.debugLineNum = 12714008;BA.debugLine="nombreInsu = \"Desconocido\"";
_nombreinsu = "Desconocido";
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=12714012;
 //BA.debugLineNum = 12714012;BA.debugLine="Dim cantidadInsu As Int";
_cantidadinsu = 0;
RDebugUtils.currentLine=12714013;
 //BA.debugLineNum = 12714013;BA.debugLine="If rowData.ContainsKey(\"CANTIDAD\") And rowData.G";
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
RDebugUtils.currentLine=12714014;
 //BA.debugLineNum = 12714014;BA.debugLine="Try";
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
RDebugUtils.currentLine=12714015;
 //BA.debugLineNum = 12714015;BA.debugLine="cantidadInsu = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
RDebugUtils.currentLine=12714017;
 //BA.debugLineNum = 12714017;BA.debugLine="Log(\"Fila \" & (i + 1) & \":\")";
parent.__c.LogImpl("712714017","Fila "+BA.NumberToString((_i+1))+":",0);
RDebugUtils.currentLine=12714018;
 //BA.debugLineNum = 12714018;BA.debugLine="Log(\" - ID: \" & ID)";
parent.__c.LogImpl("712714018"," - ID: "+_id,0);
RDebugUtils.currentLine=12714019;
 //BA.debugLineNum = 12714019;BA.debugLine="Log(\" - NOMBRE: \" & nombreInsu)";
parent.__c.LogImpl("712714019"," - NOMBRE: "+_nombreinsu,0);
RDebugUtils.currentLine=12714020;
 //BA.debugLineNum = 12714020;BA.debugLine="Log(\" - CANTIDAD: \" & cantidadInsu)";
parent.__c.LogImpl("712714020"," - CANTIDAD: "+BA.NumberToString(_cantidadinsu),0);
RDebugUtils.currentLine=12714023;
 //BA.debugLineNum = 12714023;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12714024;
 //BA.debugLineNum = 12714024;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12714027;
 //BA.debugLineNum = 12714027;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborInsumo",new Object[]{(Object)(__ref._consecutivo /*int*/ ),(Object)(_id),(Object)(_cantidadinsu)});
RDebugUtils.currentLine=12714029;
 //BA.debugLineNum = 12714029;BA.debugLine="Log(\"Comando SQL: insert_laborInsumo\")";
parent.__c.LogImpl("712714029","Comando SQL: insert_laborInsumo",0);
RDebugUtils.currentLine=12714030;
 //BA.debugLineNum = 12714030;BA.debugLine="Log(\"Parámetro 1 - consecutivo: \" & consecutiv";
parent.__c.LogImpl("712714030","Parámetro 1 - consecutivo: "+BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=12714031;
 //BA.debugLineNum = 12714031;BA.debugLine="Log(\"Parámetro 2 - ID: \" & ID)";
parent.__c.LogImpl("712714031","Parámetro 2 - ID: "+_id,0);
RDebugUtils.currentLine=12714032;
 //BA.debugLineNum = 12714032;BA.debugLine="Log(\"Parámetro 3 - cantidadInsu: \" & cantidadI";
parent.__c.LogImpl("712714032","Parámetro 3 - cantidadInsu: "+BA.NumberToString(_cantidadinsu),0);
RDebugUtils.currentLine=12714034;
 //BA.debugLineNum = 12714034;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Nul";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12714035;
 //BA.debugLineNum = 12714035;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttoninsumo_click"), (Object)(_j));
this.state = 49;
return;
case 49:
//C
this.state = 22;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12714038;
 //BA.debugLineNum = 12714038;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12714040;
 //BA.debugLineNum = 12714040;BA.debugLine="Log(\"Inserción insumo exitosa para ID: \" & ID";
parent.__c.LogImpl("712714040","Inserción insumo exitosa para ID: "+_id,0);
RDebugUtils.currentLine=12714041;
 //BA.debugLineNum = 12714041;BA.debugLine="ToastMessageShow(\"Inserción exitosa para Insu";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Inserción exitosa para Insumo : "+_id),parent.__c.True);
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=12714044;
 //BA.debugLineNum = 12714044;BA.debugLine="Log(\"Error en la inserción insumo para ID: \"";
parent.__c.LogImpl("712714044","Error en la inserción insumo para ID: "+_id+". Error: "+_j._errormessage /*String*/ ,0);
RDebugUtils.currentLine=12714045;
 //BA.debugLineNum = 12714045;BA.debugLine="ToastMessageShow(\"Error en la inserción para";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error en la inserción para ID: "+_id),parent.__c.False);
 if (true) break;

case 27:
//C
this.state = 30;
;
RDebugUtils.currentLine=12714049;
 //BA.debugLineNum = 12714049;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=12714052;
 //BA.debugLineNum = 12714052;BA.debugLine="consecutivo = consecutivo + 1";
__ref._consecutivo /*int*/  = (int) (__ref._consecutivo /*int*/ +1);
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
RDebugUtils.currentLine=12714055;
 //BA.debugLineNum = 12714055;BA.debugLine="cantidadInsu = 0 ' Valor predeterminado si no";
_cantidadinsu = (int) (0);
RDebugUtils.currentLine=12714056;
 //BA.debugLineNum = 12714056;BA.debugLine="Log(\"Error al procesar insumo la cantidad para";
parent.__c.LogImpl("712714056","Error al procesar insumo la cantidad para ID: "+_id,0);
RDebugUtils.currentLine=12714057;
 //BA.debugLineNum = 12714057;BA.debugLine="ToastMessageShow(\"Error al procesar la cantida";
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
RDebugUtils.currentLine=12714060;
 //BA.debugLineNum = 12714060;BA.debugLine="cantidadInsu = 0";
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
RDebugUtils.currentLine=12714064;
 //BA.debugLineNum = 12714064;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=12714065;
 //BA.debugLineNum = 12714065;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=12714066;
 //BA.debugLineNum = 12714066;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=12714067;
 //BA.debugLineNum = 12714067;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=12714068;
 //BA.debugLineNum = 12714068;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=12714069;
 //BA.debugLineNum = 12714069;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12714071;
 //BA.debugLineNum = 12714071;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12714073;
 //BA.debugLineNum = 12714073;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12714074;
 //BA.debugLineNum = 12714074;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12714077;
 //BA.debugLineNum = 12714077;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)("0000-"),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=12714081;
 //BA.debugLineNum = 12714081;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("712714081","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=12714082;
 //BA.debugLineNum = 12714082;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("712714082","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=12714083;
 //BA.debugLineNum = 12714083;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
parent.__c.LogImpl("712714083","loteCBX: "+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=12714084;
 //BA.debugLineNum = 12714084;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
parent.__c.LogImpl("712714084","fechafmrto: "+__ref._fechafmrto /*String*/ ,0);
RDebugUtils.currentLine=12714085;
 //BA.debugLineNum = 12714085;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
parent.__c.LogImpl("712714085","tipoLabor: "+__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=12714086;
 //BA.debugLineNum = 12714086;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
parent.__c.LogImpl("712714086","fechaInicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=12714087;
 //BA.debugLineNum = 12714087;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
parent.__c.LogImpl("712714087","fechaFin: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=12714088;
 //BA.debugLineNum = 12714088;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
parent.__c.LogImpl("712714088","elementoGasto: "+__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=12714089;
 //BA.debugLineNum = 12714089;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
parent.__c.LogImpl("712714089","areaLabor: "+BA.NumberToString(__ref._arealabor /*int*/ ),0);
RDebugUtils.currentLine=12714090;
 //BA.debugLineNum = 12714090;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
parent.__c.LogImpl("712714090","consecutivo: "+BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=12714091;
 //BA.debugLineNum = 12714091;BA.debugLine="Log(\"areaLote: \" & areaLote)";
parent.__c.LogImpl("712714091","areaLote: "+BA.NumberToString(__ref._arealote /*int*/ ),0);
RDebugUtils.currentLine=12714092;
 //BA.debugLineNum = 12714092;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("712714092","fechaActual: "+__ref._fechaactual /*String*/ ,0);
RDebugUtils.currentLine=12714093;
 //BA.debugLineNum = 12714093;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("712714093","horaSistema: "+__ref._horasistema /*String*/ ,0);
RDebugUtils.currentLine=12714094;
 //BA.debugLineNum = 12714094;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("712714094","user: "+__ref._user /*String*/ ,0);
RDebugUtils.currentLine=12714095;
 //BA.debugLineNum = 12714095;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("712714095","DeviceName: "+__ref._devicename /*String*/ ,0);
RDebugUtils.currentLine=12714097;
 //BA.debugLineNum = 12714097;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12714098;
 //BA.debugLineNum = 12714098;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttoninsumo_click"), (Object)(_j));
this.state = 50;
return;
case 50:
//C
this.state = 35;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12714101;
 //BA.debugLineNum = 12714101;BA.debugLine="Try";
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
RDebugUtils.currentLine=12714102;
 //BA.debugLineNum = 12714102;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12714104;
 //BA.debugLineNum = 12714104;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente la labor."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=12714107;
 //BA.debugLineNum = 12714107;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
parent.__c.LogImpl("712714107","Error al ejecutar la consulta labor: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=12714111;
 //BA.debugLineNum = 12714111;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("712714111","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 46:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12714116;
 //BA.debugLineNum = 12714116;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub GetDeviceName As String";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborRiego",new Object[]{(Object)(__ref._consecutivo /*int*/ ),(Object)(__ref._tiporiego /*String*/ ),(Object)(__ref._procedenciariego /*String*/ ),(Object)(__ref._caudalriego /*String*/ ),(Object)(__ref._cantidadriego /*String*/ )});
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="Log(\"Comando SQL: insert_laborRiego\")";
parent.__c.LogImpl("712779529","Comando SQL: insert_laborRiego",0);
RDebugUtils.currentLine=12779530;
 //BA.debugLineNum = 12779530;BA.debugLine="Log(\"Parámetro 1 - consecutivo: \" & consecutivo)";
parent.__c.LogImpl("712779530","Parámetro 1 - consecutivo: "+BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=12779531;
 //BA.debugLineNum = 12779531;BA.debugLine="Log(\"Parámetro 2 - tipoRiego: \" & tipoRiego)";
parent.__c.LogImpl("712779531","Parámetro 2 - tipoRiego: "+__ref._tiporiego /*String*/ ,0);
RDebugUtils.currentLine=12779532;
 //BA.debugLineNum = 12779532;BA.debugLine="Log(\"Parámetro 3 - procedenciaRiego: \" & proceden";
parent.__c.LogImpl("712779532","Parámetro 3 - procedenciaRiego: "+__ref._procedenciariego /*String*/ ,0);
RDebugUtils.currentLine=12779533;
 //BA.debugLineNum = 12779533;BA.debugLine="Log(\"Parámetro 4 - caudalRiego: \" & caudalRiego)";
parent.__c.LogImpl("712779533","Parámetro 4 - caudalRiego: "+__ref._caudalriego /*String*/ ,0);
RDebugUtils.currentLine=12779534;
 //BA.debugLineNum = 12779534;BA.debugLine="Log(\"Parámetro 5 - cantidadRiego: \" & cantidadRie";
parent.__c.LogImpl("712779534","Parámetro 5 - cantidadRiego: "+__ref._cantidadriego /*String*/ ,0);
RDebugUtils.currentLine=12779536;
 //BA.debugLineNum = 12779536;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12779537;
 //BA.debugLineNum = 12779537;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonriego_click"), (Object)(_j));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12779540;
 //BA.debugLineNum = 12779540;BA.debugLine="Try";
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
RDebugUtils.currentLine=12779541;
 //BA.debugLineNum = 12779541;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12779542;
 //BA.debugLineNum = 12779542;BA.debugLine="ToastMessageShow(\"Se ha insertado correctamente";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Se ha insertado correctamente Insumo"),parent.__c.False);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=12779544;
 //BA.debugLineNum = 12779544;BA.debugLine="ToastMessageShow(\"Error al insertar Insumo\", Tr";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error al insertar Insumo"),parent.__c.True);
RDebugUtils.currentLine=12779545;
 //BA.debugLineNum = 12779545;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("712779545","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=12779548;
 //BA.debugLineNum = 12779548;BA.debugLine="ToastMessageShow(\"Error inesperado al insertar I";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error inesperado al insertar Insumo"),parent.__c.True);
RDebugUtils.currentLine=12779549;
 //BA.debugLineNum = 12779549;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("712779549","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
RDebugUtils.currentLine=12779552;
 //BA.debugLineNum = 12779552;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=12779553;
 //BA.debugLineNum = 12779553;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=12779554;
 //BA.debugLineNum = 12779554;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=12779555;
 //BA.debugLineNum = 12779555;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=12779556;
 //BA.debugLineNum = 12779556;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=12779557;
 //BA.debugLineNum = 12779557;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12779559;
 //BA.debugLineNum = 12779559;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12779561;
 //BA.debugLineNum = 12779561;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12779562;
 //BA.debugLineNum = 12779562;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12779565;
 //BA.debugLineNum = 12779565;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)("0000-"),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=12779569;
 //BA.debugLineNum = 12779569;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("712779569","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=12779570;
 //BA.debugLineNum = 12779570;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("712779570","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=12779571;
 //BA.debugLineNum = 12779571;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
parent.__c.LogImpl("712779571","loteCBX: "+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=12779572;
 //BA.debugLineNum = 12779572;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
parent.__c.LogImpl("712779572","fechafmrto: "+__ref._fechafmrto /*String*/ ,0);
RDebugUtils.currentLine=12779573;
 //BA.debugLineNum = 12779573;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
parent.__c.LogImpl("712779573","tipoLabor: "+__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=12779574;
 //BA.debugLineNum = 12779574;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
parent.__c.LogImpl("712779574","fechaInicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=12779575;
 //BA.debugLineNum = 12779575;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
parent.__c.LogImpl("712779575","fechaFin: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=12779576;
 //BA.debugLineNum = 12779576;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
parent.__c.LogImpl("712779576","elementoGasto: "+__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=12779577;
 //BA.debugLineNum = 12779577;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
parent.__c.LogImpl("712779577","areaLabor: "+BA.NumberToString(__ref._arealabor /*int*/ ),0);
RDebugUtils.currentLine=12779578;
 //BA.debugLineNum = 12779578;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
parent.__c.LogImpl("712779578","consecutivo: "+BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=12779579;
 //BA.debugLineNum = 12779579;BA.debugLine="Log(\"areaLote: \" & areaLote)";
parent.__c.LogImpl("712779579","areaLote: "+BA.NumberToString(__ref._arealote /*int*/ ),0);
RDebugUtils.currentLine=12779580;
 //BA.debugLineNum = 12779580;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("712779580","fechaActual: "+__ref._fechaactual /*String*/ ,0);
RDebugUtils.currentLine=12779581;
 //BA.debugLineNum = 12779581;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("712779581","horaSistema: "+__ref._horasistema /*String*/ ,0);
RDebugUtils.currentLine=12779582;
 //BA.debugLineNum = 12779582;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("712779582","user: "+__ref._user /*String*/ ,0);
RDebugUtils.currentLine=12779583;
 //BA.debugLineNum = 12779583;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("712779583","DeviceName: "+__ref._devicename /*String*/ ,0);
RDebugUtils.currentLine=12779585;
 //BA.debugLineNum = 12779585;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12779586;
 //BA.debugLineNum = 12779586;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonriego_click"), (Object)(_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12779589;
 //BA.debugLineNum = 12779589;BA.debugLine="Try";
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
RDebugUtils.currentLine=12779590;
 //BA.debugLineNum = 12779590;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12779592;
 //BA.debugLineNum = 12779592;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente la labor."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=12779595;
 //BA.debugLineNum = 12779595;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
parent.__c.LogImpl("712779595","Error al ejecutar la consulta labor: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=12779599;
 //BA.debugLineNum = 12779599;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("712779599","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12779602;
 //BA.debugLineNum = 12779602;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdSiembra",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_req));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
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
RDebugUtils.currentLine=12845069;
 //BA.debugLineNum = 12845069;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=12845070;
 //BA.debugLineNum = 12845070;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("712845070","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
RDebugUtils.currentLine=12845074;
 //BA.debugLineNum = 12845074;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("712845074","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=12845077;
 //BA.debugLineNum = 12845077;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
__ref._consecutivosiembra /*int*/  = (int) (_ultimoregistrosiembra+1);
RDebugUtils.currentLine=12845079;
 //BA.debugLineNum = 12845079;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("712845079",BA.NumberToString(__ref._consecutivosiembra /*int*/ ),0);
RDebugUtils.currentLine=12845082;
 //BA.debugLineNum = 12845082;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborSiembra",new Object[]{(Object)(__ref._consecutivosiembra /*int*/ ),(Object)(__ref._codigosiembra /*String*/ ),(Object)(__ref._distanciasiembra /*int*/ ),(Object)(__ref._toneladasemillasiembra /*int*/ ),(Object)(__ref._numeropaquetessiembra /*int*/ ),(Object)(__ref._procedenciasiembra /*String*/ ),(Object)(__ref._tipolabranzasiembra /*String*/ ),(Object)(__ref._bandereosiembra /*int*/ ),(Object)(__ref._numeromacollosiembra /*int*/ )});
RDebugUtils.currentLine=12845085;
 //BA.debugLineNum = 12845085;BA.debugLine="Log(\"Comando SQL: insert_laborSiembra\")";
parent.__c.LogImpl("712845085","Comando SQL: insert_laborSiembra",0);
RDebugUtils.currentLine=12845086;
 //BA.debugLineNum = 12845086;BA.debugLine="Log(\"Parámetro 1 - consecutivoSiembra: \" & consec";
parent.__c.LogImpl("712845086","Parámetro 1 - consecutivoSiembra: "+BA.NumberToString(__ref._consecutivosiembra /*int*/ ),0);
RDebugUtils.currentLine=12845087;
 //BA.debugLineNum = 12845087;BA.debugLine="Log(\"Parámetro 2 - codigoSiembra: \" & codigoSiemb";
parent.__c.LogImpl("712845087","Parámetro 2 - codigoSiembra: "+__ref._codigosiembra /*String*/ ,0);
RDebugUtils.currentLine=12845088;
 //BA.debugLineNum = 12845088;BA.debugLine="Log(\"Parámetro 3 - distanciaSiembra: \" & distanci";
parent.__c.LogImpl("712845088","Parámetro 3 - distanciaSiembra: "+BA.NumberToString(__ref._distanciasiembra /*int*/ ),0);
RDebugUtils.currentLine=12845089;
 //BA.debugLineNum = 12845089;BA.debugLine="Log(\"Parámetro 4 - toneladaSemillaSiembra: \" & to";
parent.__c.LogImpl("712845089","Parámetro 4 - toneladaSemillaSiembra: "+BA.NumberToString(__ref._toneladasemillasiembra /*int*/ ),0);
RDebugUtils.currentLine=12845090;
 //BA.debugLineNum = 12845090;BA.debugLine="Log(\"Parámetro 5 - numeroPaquetesSiembra: \" & num";
parent.__c.LogImpl("712845090","Parámetro 5 - numeroPaquetesSiembra: "+BA.NumberToString(__ref._numeropaquetessiembra /*int*/ ),0);
RDebugUtils.currentLine=12845091;
 //BA.debugLineNum = 12845091;BA.debugLine="Log(\"Parámetro 6 - procedenciaSiembra: \" & proced";
parent.__c.LogImpl("712845091","Parámetro 6 - procedenciaSiembra: "+__ref._procedenciasiembra /*String*/ ,0);
RDebugUtils.currentLine=12845092;
 //BA.debugLineNum = 12845092;BA.debugLine="Log(\"Parámetro 7 - tipoLabranzaSiembra: \" & tipoL";
parent.__c.LogImpl("712845092","Parámetro 7 - tipoLabranzaSiembra: "+__ref._tipolabranzasiembra /*String*/ ,0);
RDebugUtils.currentLine=12845093;
 //BA.debugLineNum = 12845093;BA.debugLine="Log(\"Parámetro 8 - bandereoSiembra: \" & bandereoS";
parent.__c.LogImpl("712845093","Parámetro 8 - bandereoSiembra: "+BA.NumberToString(__ref._bandereosiembra /*int*/ ),0);
RDebugUtils.currentLine=12845094;
 //BA.debugLineNum = 12845094;BA.debugLine="Log(\"Parámetro 9 - numeroMacolloSiembra: \" & nume";
parent.__c.LogImpl("712845094","Parámetro 9 - numeroMacolloSiembra: "+BA.NumberToString(__ref._numeromacollosiembra /*int*/ ),0);
RDebugUtils.currentLine=12845097;
 //BA.debugLineNum = 12845097;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12845098;
 //BA.debugLineNum = 12845098;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_j));
this.state = 39;
return;
case 39:
//C
this.state = 11;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12845101;
 //BA.debugLineNum = 12845101;BA.debugLine="Try";
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
RDebugUtils.currentLine=12845102;
 //BA.debugLineNum = 12845102;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12845103;
 //BA.debugLineNum = 12845103;BA.debugLine="Log(\"Datos insertados correctamente en insert_l";
parent.__c.LogImpl("712845103","Datos insertados correctamente en insert_laborInsumo",0);
RDebugUtils.currentLine=12845104;
 //BA.debugLineNum = 12845104;BA.debugLine="ToastMessageShow(\"Datos de Insumo guardados con";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Datos de Insumo guardados con éxito"),parent.__c.False);
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=12845106;
 //BA.debugLineNum = 12845106;BA.debugLine="ToastMessageShow(\"Error al guardar los datos de";
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
RDebugUtils.currentLine=12845109;
 //BA.debugLineNum = 12845109;BA.debugLine="Log(\"Excepción capturada en insert_laborInsumo";
parent.__c.LogImpl("712845109","Excepción capturada en insert_laborInsumo: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=12845110;
 //BA.debugLineNum = 12845110;BA.debugLine="ToastMessageShow(\"Se produjo un error inesperado";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Se produjo un error inesperado"),parent.__c.True);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
RDebugUtils.currentLine=12845114;
 //BA.debugLineNum = 12845114;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=12845115;
 //BA.debugLineNum = 12845115;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=12845116;
 //BA.debugLineNum = 12845116;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=12845117;
 //BA.debugLineNum = 12845117;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=12845118;
 //BA.debugLineNum = 12845118;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=12845119;
 //BA.debugLineNum = 12845119;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12845121;
 //BA.debugLineNum = 12845121;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12845123;
 //BA.debugLineNum = 12845123;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12845124;
 //BA.debugLineNum = 12845124;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12845127;
 //BA.debugLineNum = 12845127;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)("0000-"),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=12845131;
 //BA.debugLineNum = 12845131;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("712845131","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=12845132;
 //BA.debugLineNum = 12845132;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("712845132","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=12845133;
 //BA.debugLineNum = 12845133;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
parent.__c.LogImpl("712845133","loteCBX: "+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=12845134;
 //BA.debugLineNum = 12845134;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
parent.__c.LogImpl("712845134","fechafmrto: "+__ref._fechafmrto /*String*/ ,0);
RDebugUtils.currentLine=12845135;
 //BA.debugLineNum = 12845135;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
parent.__c.LogImpl("712845135","tipoLabor: "+__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=12845136;
 //BA.debugLineNum = 12845136;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
parent.__c.LogImpl("712845136","fechaInicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=12845137;
 //BA.debugLineNum = 12845137;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
parent.__c.LogImpl("712845137","fechaFin: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=12845138;
 //BA.debugLineNum = 12845138;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
parent.__c.LogImpl("712845138","elementoGasto: "+__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=12845139;
 //BA.debugLineNum = 12845139;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
parent.__c.LogImpl("712845139","areaLabor: "+BA.NumberToString(__ref._arealabor /*int*/ ),0);
RDebugUtils.currentLine=12845140;
 //BA.debugLineNum = 12845140;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
parent.__c.LogImpl("712845140","consecutivo: "+BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=12845141;
 //BA.debugLineNum = 12845141;BA.debugLine="Log(\"areaLote: \" & areaLote)";
parent.__c.LogImpl("712845141","areaLote: "+BA.NumberToString(__ref._arealote /*int*/ ),0);
RDebugUtils.currentLine=12845142;
 //BA.debugLineNum = 12845142;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("712845142","fechaActual: "+__ref._fechaactual /*String*/ ,0);
RDebugUtils.currentLine=12845143;
 //BA.debugLineNum = 12845143;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("712845143","horaSistema: "+__ref._horasistema /*String*/ ,0);
RDebugUtils.currentLine=12845144;
 //BA.debugLineNum = 12845144;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("712845144","user: "+__ref._user /*String*/ ,0);
RDebugUtils.currentLine=12845145;
 //BA.debugLineNum = 12845145;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("712845145","DeviceName: "+__ref._devicename /*String*/ ,0);
RDebugUtils.currentLine=12845147;
 //BA.debugLineNum = 12845147;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12845148;
 //BA.debugLineNum = 12845148;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_j));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12845151;
 //BA.debugLineNum = 12845151;BA.debugLine="Try";
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
RDebugUtils.currentLine=12845152;
 //BA.debugLineNum = 12845152;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12845154;
 //BA.debugLineNum = 12845154;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente la labor."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=12845157;
 //BA.debugLineNum = 12845157;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
parent.__c.LogImpl("712845157","Error al ejecutar la consulta labor: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=12845161;
 //BA.debugLineNum = 12845161;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("712845161","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12845164;
 //BA.debugLineNum = 12845164;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="Private Label14Time As Label";
_label14time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="Dim fechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="Dim fechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="Dim fechafmrto As String";
_fechafmrto = "";
RDebugUtils.currentLine=9633806;
 //BA.debugLineNum = 9633806;BA.debugLine="Dim horaSistema As String";
_horasistema = "";
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="Private loteCBX As String";
_lotecbx = "";
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="Private elementoLabor As String";
_elementolabor = "";
RDebugUtils.currentLine=9633810;
 //BA.debugLineNum = 9633810;BA.debugLine="Private elementoGasto As String";
_elementogasto = "";
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="Private areaLabor As Int";
_arealabor = 0;
RDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="Private areaLote As Int";
_arealote = 0;
RDebugUtils.currentLine=9633813;
 //BA.debugLineNum = 9633813;BA.debugLine="Dim consecutivo As Int";
_consecutivo = 0;
RDebugUtils.currentLine=9633814;
 //BA.debugLineNum = 9633814;BA.debugLine="Private tipoLabor As String";
_tipolabor = "";
RDebugUtils.currentLine=9633816;
 //BA.debugLineNum = 9633816;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=9633817;
 //BA.debugLineNum = 9633817;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=9633819;
 //BA.debugLineNum = 9633819;BA.debugLine="Private Panel2geral As Panel";
_panel2geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9633820;
 //BA.debugLineNum = 9633820;BA.debugLine="Private SD_xComboBoxTipoRiego As SD_xComboBox";
_sd_xcomboboxtiporiego = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9633822;
 //BA.debugLineNum = 9633822;BA.debugLine="Private Panel3geral As Panel";
_panel3geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9633823;
 //BA.debugLineNum = 9633823;BA.debugLine="Private SD_xComboBoxCodigoVariedad As SD_xComboBo";
_sd_xcomboboxcodigovariedad = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9633824;
 //BA.debugLineNum = 9633824;BA.debugLine="Private SD_xComboBoxTipoLabranza As SD_xComboBox";
_sd_xcomboboxtipolabranza = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9633826;
 //BA.debugLineNum = 9633826;BA.debugLine="Private cantidadInsumos As Int";
_cantidadinsumos = 0;
RDebugUtils.currentLine=9633828;
 //BA.debugLineNum = 9633828;BA.debugLine="Private SD_xComboBoxInsumo As SD_xComboBox";
_sd_xcomboboxinsumo = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9633829;
 //BA.debugLineNum = 9633829;BA.debugLine="Private EditTextCantidadInsumo As EditText";
_edittextcantidadinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=9633830;
 //BA.debugLineNum = 9633830;BA.debugLine="Private ButtonAddInsumo As Button";
_buttonaddinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=9633831;
 //BA.debugLineNum = 9633831;BA.debugLine="Private ButtonDeleteInsumo As Button";
_buttondeleteinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=9633832;
 //BA.debugLineNum = 9633832;BA.debugLine="Private Panel0geral As Panel";
_panel0geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9633834;
 //BA.debugLineNum = 9633834;BA.debugLine="Private IDINSUMO As String";
_idinsumo = "";
RDebugUtils.currentLine=9633835;
 //BA.debugLineNum = 9633835;BA.debugLine="Private NAMEINSUMO As String";
_nameinsumo = "";
RDebugUtils.currentLine=9633836;
 //BA.debugLineNum = 9633836;BA.debugLine="Private CANTINSUMO As String";
_cantinsumo = "";
RDebugUtils.currentLine=9633838;
 //BA.debugLineNum = 9633838;BA.debugLine="Private LabelCantidadInsumos As Label";
_labelcantidadinsumos = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9633839;
 //BA.debugLineNum = 9633839;BA.debugLine="Private B4XTable1 As B4XTable";
_b4xtable1 = new b4a.example.ef.b4xtable();
RDebugUtils.currentLine=9633840;
 //BA.debugLineNum = 9633840;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9633842;
 //BA.debugLineNum = 9633842;BA.debugLine="Private PanelInsumoSelect As Panel";
_panelinsumoselect = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9633843;
 //BA.debugLineNum = 9633843;BA.debugLine="Private PanelTittleInsumo As Panel";
_paneltittleinsumo = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9633844;
 //BA.debugLineNum = 9633844;BA.debugLine="Private LabelInsumoSelect As Label";
_labelinsumoselect = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9633846;
 //BA.debugLineNum = 9633846;BA.debugLine="Dim idEliminarTabla As Int";
_ideliminartabla = 0;
RDebugUtils.currentLine=9633848;
 //BA.debugLineNum = 9633848;BA.debugLine="Dim tipoRiego As String";
_tiporiego = "";
RDebugUtils.currentLine=9633849;
 //BA.debugLineNum = 9633849;BA.debugLine="Dim procedenciaRiego As String";
_procedenciariego = "";
RDebugUtils.currentLine=9633850;
 //BA.debugLineNum = 9633850;BA.debugLine="Dim caudalRiego As String";
_caudalriego = "";
RDebugUtils.currentLine=9633851;
 //BA.debugLineNum = 9633851;BA.debugLine="Dim cantidadRiego As String";
_cantidadriego = "";
RDebugUtils.currentLine=9633853;
 //BA.debugLineNum = 9633853;BA.debugLine="Dim codigoSiembra As String";
_codigosiembra = "";
RDebugUtils.currentLine=9633854;
 //BA.debugLineNum = 9633854;BA.debugLine="Dim distanciaSiembra As Int";
_distanciasiembra = 0;
RDebugUtils.currentLine=9633855;
 //BA.debugLineNum = 9633855;BA.debugLine="Dim bandereoSiembra As Int";
_bandereosiembra = 0;
RDebugUtils.currentLine=9633856;
 //BA.debugLineNum = 9633856;BA.debugLine="Dim toneladaSemillaSiembra As Int";
_toneladasemillasiembra = 0;
RDebugUtils.currentLine=9633857;
 //BA.debugLineNum = 9633857;BA.debugLine="Dim procedenciaSiembra As String";
_procedenciasiembra = "";
RDebugUtils.currentLine=9633858;
 //BA.debugLineNum = 9633858;BA.debugLine="Dim tipoLabranzaSiembra As String";
_tipolabranzasiembra = "";
RDebugUtils.currentLine=9633859;
 //BA.debugLineNum = 9633859;BA.debugLine="Dim numeroPaquetesSiembra As Int";
_numeropaquetessiembra = 0;
RDebugUtils.currentLine=9633860;
 //BA.debugLineNum = 9633860;BA.debugLine="Dim numeroMacolloSiembra As Int";
_numeromacollosiembra = 0;
RDebugUtils.currentLine=9633862;
 //BA.debugLineNum = 9633862;BA.debugLine="Dim DeviceName As String";
_devicename = "";
RDebugUtils.currentLine=9633863;
 //BA.debugLineNum = 9633863;BA.debugLine="Dim user As String";
_user = "";
RDebugUtils.currentLine=9633865;
 //BA.debugLineNum = 9633865;BA.debugLine="Dim fechaActual As String";
_fechaactual = "";
RDebugUtils.currentLine=9633866;
 //BA.debugLineNum = 9633866;BA.debugLine="Dim consecutivoSiembra As Int";
_consecutivosiembra = 0;
RDebugUtils.currentLine=9633869;
 //BA.debugLineNum = 9633869;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=9633870;
 //BA.debugLineNum = 9633870;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9633871;
 //BA.debugLineNum = 9633871;BA.debugLine="Private SwiftButtonNit As SwiftButton";
_swiftbuttonnit = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=9633872;
 //BA.debugLineNum = 9633872;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
_searchtemplatenit = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=9633873;
 //BA.debugLineNum = 9633873;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
_swiftbuttonhacienda = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=9633874;
 //BA.debugLineNum = 9633874;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
_searchtemplatehacienda = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=9633875;
 //BA.debugLineNum = 9633875;BA.debugLine="Private SwiftButtonLote As SwiftButton";
_swiftbuttonlote = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=9633876;
 //BA.debugLineNum = 9633876;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
_searchtemplatelote = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=9633877;
 //BA.debugLineNum = 9633877;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
_swiftbuttonlabor = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=9633878;
 //BA.debugLineNum = 9633878;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
_searchtemplatelabor = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=9633879;
 //BA.debugLineNum = 9633879;BA.debugLine="Private SwiftButtonElemento As SwiftButton";
_swiftbuttonelemento = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=9633880;
 //BA.debugLineNum = 9633880;BA.debugLine="Private SearchTemplateElemento As B4XSearchTempla";
_searchtemplateelemento = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=9633881;
 //BA.debugLineNum = 9633881;BA.debugLine="Private SwiftButtonTypeForm As SwiftButton";
_swiftbuttontypeform = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=9633882;
 //BA.debugLineNum = 9633882;BA.debugLine="Private SearchTemplateTypeForm As B4XSearchTempla";
_searchtemplatetypeform = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=9633883;
 //BA.debugLineNum = 9633883;BA.debugLine="Private SwiftButtonInsumo As SwiftButton";
_swiftbuttoninsumo = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=9633884;
 //BA.debugLineNum = 9633884;BA.debugLine="Private SearchTemplateInsumo As B4XSearchTemplate";
_searchtemplateinsumo = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=9633885;
 //BA.debugLineNum = 9633885;BA.debugLine="Private SwiftButtonRiego As SwiftButton";
_swiftbuttonriego = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=9633886;
 //BA.debugLineNum = 9633886;BA.debugLine="Private SearchTemplateRiego As B4XSearchTemplate";
_searchtemplateriego = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=9633887;
 //BA.debugLineNum = 9633887;BA.debugLine="Private SwiftButtonTipoLabranza As SwiftButton";
_swiftbuttontipolabranza = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=9633888;
 //BA.debugLineNum = 9633888;BA.debugLine="Private SearchTemplateTipoLabranza As B4XSearchTe";
_searchtemplatetipolabranza = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=9633889;
 //BA.debugLineNum = 9633889;BA.debugLine="Private SwiftButtonVariedad As SwiftButton";
_swiftbuttonvariedad = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=9633890;
 //BA.debugLineNum = 9633890;BA.debugLine="Private SearchTemplateVariedad As B4XSearchTempla";
_searchtemplatevariedad = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=9633891;
 //BA.debugLineNum = 9633891;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumo(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createiteminsumo", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createiteminsumo", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub CreateItemInsumo As Panel";
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
_panel.LoadLayout("FormInsumo",ba);
RDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="panel.Height=Panel0geral.Height";
_panel.setHeight(__ref._panel0geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=10158090;
 //BA.debugLineNum = 10158090;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=10158091;
 //BA.debugLineNum = 10158091;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemriego(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitemriego", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemriego", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub CreateItemRiego As Panel";
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
_panel.LoadLayout("FormRiego",ba);
RDebugUtils.currentLine=10027016;
 //BA.debugLineNum = 10027016;BA.debugLine="panel.Height=Panel2geral.Height";
_panel.setHeight(__ref._panel2geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=10027018;
 //BA.debugLineNum = 10027018;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=10027019;
 //BA.debugLineNum = 10027019;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemsiembra(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitemsiembra", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemsiembra", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub CreateItemSiembra As Panel";
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
_panel.LoadLayout("FormSiembra",ba);
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="panel.Height=Panel3geral.Height";
_panel.setHeight(__ref._panel3geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=10092554;
 //BA.debugLineNum = 10092554;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=10092555;
 //BA.debugLineNum = 10092555;BA.debugLine="End Sub";
return null;
}
public String  _edittextarealabor_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextarealabor_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextarealabor_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub EditTextAreaLabor_TextChanged (Old As";
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="areaLabor = New";
__ref._arealabor /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Log(\"Area Labor \" & areaLabor)";
__c.LogImpl("710878980","Area Labor "+BA.NumberToString(__ref._arealabor /*int*/ ),0);
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="End Sub";
return "";
}
public String  _edittextarealote_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextarealote_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextarealote_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub EditTextAreaLote_TextChanged (Old As S";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="areaLote = New";
__ref._arealote /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="Log(\"Area lote \" & areaLote )";
__c.LogImpl("710944516","Area lote "+BA.NumberToString(__ref._arealote /*int*/ ),0);
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="End Sub";
return "";
}
public String  _edittextbandereo_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextbandereo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextbandereo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="bandereoSiembra = New";
__ref._bandereosiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Log(\"bandereo \" & bandereoSiembra)";
__c.LogImpl("711665412","bandereo "+BA.NumberToString(__ref._bandereosiembra /*int*/ ),0);
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadagua_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcantidadagua_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcantidadagua_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="cantidadRiego = New";
__ref._cantidadriego /*String*/  = _new;
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="Log(\"cantidad\" & cantidadRiego)";
__c.LogImpl("711206659","cantidad"+__ref._cantidadriego /*String*/ ,0);
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadinsumo_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcantidadinsumo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcantidadinsumo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="ButtonAddInsumo.Enabled = True";
__ref._buttonaddinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="CANTINSUMO = New";
__ref._cantinsumo /*String*/  = _new;
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="End Sub";
return "";
}
public String  _edittextcaudalaplicado_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcaudalaplicado_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcaudalaplicado_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="caudalRiego = New";
__ref._caudalriego /*String*/  = _new;
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Log(\"caudal\" & caudalRiego)";
__c.LogImpl("711141123","caudal"+__ref._caudalriego /*String*/ ,0);
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="End Sub";
return "";
}
public String  _edittextdistanciasiembra_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextdistanciasiembra_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextdistanciasiembra_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="distanciaSiembra = New";
__ref._distanciasiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="Log(\"Distancia de siembra \" & distanciaSiembra)";
__c.LogImpl("711599875","Distancia de siembra "+BA.NumberToString(__ref._distanciasiembra /*int*/ ),0);
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeromacollos_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextnumeromacollos_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextnumeromacollos_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="numeroMacolloSiembra = New";
__ref._numeromacollosiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="Log(\"numero de macollos \" & numeroMacolloSiembra";
__c.LogImpl("711993091","numero de macollos "+BA.NumberToString(__ref._numeromacollosiembra /*int*/ ),0);
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeropaquetes_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextnumeropaquetes_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextnumeropaquetes_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="numeroPaquetesSiembra = New";
__ref._numeropaquetessiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="Log(\"numero de paquetes \" & numeroPaquetesSiembra";
__c.LogImpl("711927556","numero de paquetes "+BA.NumberToString(__ref._numeropaquetessiembra /*int*/ ),0);
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedencia_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextprocedencia_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextprocedencia_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="procedenciaRiego = New";
__ref._procedenciariego /*String*/  = _new;
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="Log(\"procedencia\" & procedenciaRiego)";
__c.LogImpl("711075588","procedencia"+__ref._procedenciariego /*String*/ ,0);
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedenciadestino_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextprocedenciadestino_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextprocedenciadestino_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="procedenciaSiembra = New";
__ref._procedenciasiembra /*String*/  = _new;
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="Log(\"procedencia \"& procedenciaSiembra)";
__c.LogImpl("711796483","procedencia "+__ref._procedenciasiembra /*String*/ ,0);
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="End Sub";
return "";
}
public String  _edittexttoneladasemilla_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittexttoneladasemilla_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittexttoneladasemilla_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="toneladaSemillaSiembra = New";
__ref._toneladasemillasiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Log(\"tonelada Semilla \"& toneladaSemillaSiembra)";
__c.LogImpl("711730948","tonelada Semilla "+BA.NumberToString(__ref._toneladasemillasiembra /*int*/ ),0);
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="End Sub";
return "";
}
public String  _label14time_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label14time_click", false))
	 {return ((String) Debug.delegate(ba, "label14time_click", null));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub Label14Time_Click";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Panel3.Visible = True";
__ref._panel3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Dim ItemsInsumo As List";
_itemsinsumo = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="ItemsInsumo.Initialize";
_itemsinsumo.Initialize();
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="ItemsInsumo.Add(\"Seleccionar:\")";
_itemsinsumo.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_insumosSort",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12189706;
 //BA.debugLineNum = 12189706;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxinsumo"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12189709;
 //BA.debugLineNum = 12189709;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxinsumo"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12189710;
 //BA.debugLineNum = 12189710;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=12189711;
 //BA.debugLineNum = 12189711;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
_cdgo_producto = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=12189712;
 //BA.debugLineNum = 12189712;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
_dscrpcion_producto = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=12189713;
 //BA.debugLineNum = 12189713;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto, Dscr";
__ref._sd_xcomboboxinsumo /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_producto,(Object)(_dscrpcion_producto+" - "+_cdgo_producto));
RDebugUtils.currentLine=12189714;
 //BA.debugLineNum = 12189714;BA.debugLine="ItemsInsumo.Add(Cdgo_Producto&\":\"&Dscrpcion_Pro";
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
RDebugUtils.currentLine=12189717;
 //BA.debugLineNum = 12189717;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("712189717","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=12189719;
 //BA.debugLineNum = 12189719;BA.debugLine="SearchTemplateInsumo.SetItems(ItemsInsumo)";
__ref._searchtemplateinsumo /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsinsumo);
RDebugUtils.currentLine=12189720;
 //BA.debugLineNum = 12189720;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=12189722;
 //BA.debugLineNum = 12189722;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Dim ItemsRiego As List";
_itemsriego = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="ItemsRiego.Initialize";
_itemsriego.Initialize();
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="ItemsRiego.Add(\"Seleccionar:\")";
_itemsriego.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_tipoRiego",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxriego"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12058635;
 //BA.debugLineNum = 12058635;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxriego"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=12058639;
 //BA.debugLineNum = 12058639;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
_cdgo_tipo_riego = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=12058640;
 //BA.debugLineNum = 12058640;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
_dscrpcion_tipo_riego = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=12058641;
 //BA.debugLineNum = 12058641;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego,";
__ref._sd_xcomboboxtiporiego /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_tipo_riego,(Object)(_cdgo_tipo_riego));
RDebugUtils.currentLine=12058642;
 //BA.debugLineNum = 12058642;BA.debugLine="ItemsRiego.Add(Cdgo_Tipo_Riego&\":\"&Dscrpcion_Ti";
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
RDebugUtils.currentLine=12058645;
 //BA.debugLineNum = 12058645;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("712058645","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=12058647;
 //BA.debugLineNum = 12058647;BA.debugLine="SearchTemplateRiego.SetItems(ItemsRiego)";
__ref._searchtemplateriego /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsriego);
RDebugUtils.currentLine=12058648;
 //BA.debugLineNum = 12058648;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=12058650;
 //BA.debugLineNum = 12058650;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Dim ItemsLabranza As List";
_itemslabranza = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="ItemsLabranza.Initialize";
_itemslabranza.Initialize();
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="ItemsLabranza.Add(\"Seleccionar:\")";
_itemslabranza.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="Dim ItemsVariedad As List";
_itemsvariedad = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="ItemsVariedad.Initialize";
_itemsvariedad.Initialize();
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="ItemsVariedad.Add(\"Seleccionar:\")";
_itemsvariedad.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12124174;
 //BA.debugLineNum = 12124174;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_codVariedad",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12124175;
 //BA.debugLineNum = 12124175;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12124176;
 //BA.debugLineNum = 12124176;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12124177;
 //BA.debugLineNum = 12124177;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12124178;
 //BA.debugLineNum = 12124178;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12124179;
 //BA.debugLineNum = 12124179;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=12124180;
 //BA.debugLineNum = 12124180;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
_cdgo_variedad = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=12124181;
 //BA.debugLineNum = 12124181;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
__ref._sd_xcomboboxcodigovariedad /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cdgo_variedad,(Object)(_cdgo_variedad));
RDebugUtils.currentLine=12124182;
 //BA.debugLineNum = 12124182;BA.debugLine="ItemsVariedad.Add(Cdgo_Variedad)";
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
RDebugUtils.currentLine=12124185;
 //BA.debugLineNum = 12124185;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("712124185","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=12124187;
 //BA.debugLineNum = 12124187;BA.debugLine="SearchTemplateVariedad.SetItems(ItemsVariedad)";
__ref._searchtemplatevariedad /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsvariedad);
RDebugUtils.currentLine=12124188;
 //BA.debugLineNum = 12124188;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=12124192;
 //BA.debugLineNum = 12124192;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
_cmdtipolabranza = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_tipoLabranza",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12124193;
 //BA.debugLineNum = 12124193;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdtipolabranza,(int) (0),parent.__c.Null)));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12124194;
 //BA.debugLineNum = 12124194;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=12124195;
 //BA.debugLineNum = 12124195;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
_req._handlejobasync /*void*/ (null,_j4,"req_TipoLabranza");
RDebugUtils.currentLine=12124196;
 //BA.debugLineNum = 12124196;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
parent.__c.WaitFor("req_tipolabranza_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12124197;
 //BA.debugLineNum = 12124197;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
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
RDebugUtils.currentLine=12124198;
 //BA.debugLineNum = 12124198;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (0)]);
RDebugUtils.currentLine=12124199;
 //BA.debugLineNum = 12124199;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (1)]);
RDebugUtils.currentLine=12124200;
 //BA.debugLineNum = 12124200;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
__ref._sd_xcomboboxtipolabranza /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_tipo_labranza,(Object)(_cdgo_tipo_labranza));
RDebugUtils.currentLine=12124201;
 //BA.debugLineNum = 12124201;BA.debugLine="ItemsLabranza.Add(Cdgo_Variedad&\":\"&Dscrpcion_T";
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
RDebugUtils.currentLine=12124204;
 //BA.debugLineNum = 12124204;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
parent.__c.LogImpl("712124204","Error en la consulta de Tipo_Labranza: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=12124206;
 //BA.debugLineNum = 12124206;BA.debugLine="SearchTemplateTipoLabranza.SetItems(ItemsLabranza";
__ref._searchtemplatetipolabranza /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslabranza);
RDebugUtils.currentLine=12124207;
 //BA.debugLineNum = 12124207;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=12124209;
 //BA.debugLineNum = 12124209;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Private Sub RemoveForm0IfExists";
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form0"))) { 
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="End Sub";
return "";
}
public String  _removeform2ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform2ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform2ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Private Sub RemoveForm2IfExists";
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form2"))) { 
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="End Sub";
return "";
}
public String  _removeform3ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform3ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform3ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Private Sub RemoveForm3IfExists";
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form3"))) { 
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxcodigovariedad_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxcodigovariedad_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxcodigovariedad_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="codigoSiembra = Value";
__ref._codigosiembra /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Log(\"codigo \" & codigoSiembra)";
__c.LogImpl("711534339","codigo "+__ref._codigosiembra /*String*/ ,0);
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxelemento_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxelemento_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxelemento_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="elementoGasto = Value";
__ref._elementogasto /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="If elementoGasto.Length > 0 Then";
if (__ref._elementogasto /*String*/ .length()>0) { 
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, Min(";
__ref._elementogasto /*String*/  = __ref._elementogasto /*String*/ .substring((int) (0),(int) (__c.Min(2,__ref._elementogasto /*String*/ .length())));
 }else {
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="elementoGasto = \"\" ' Si está vacío, asignar cade";
__ref._elementogasto /*String*/  = "";
 };
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="Log(\"Las dos primeras letras (o menos si no hay s";
__c.LogImpl("710813453","Las dos primeras letras (o menos si no hay suficientes): "+__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=10813455;
 //BA.debugLineNum = 10813455;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="haciendaCBX=Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10616843;
 //BA.debugLineNum = 10616843;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=10616846;
 //BA.debugLineNum = 10616846;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=10616850;
 //BA.debugLineNum = 10616850;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=10616851;
 //BA.debugLineNum = 10616851;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
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
RDebugUtils.currentLine=10616859;
 //BA.debugLineNum = 10616859;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("710616859","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=10616863;
 //BA.debugLineNum = 10616863;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=10616866;
 //BA.debugLineNum = 10616866;BA.debugLine="Log(\"Hacienda\" & haciendaCBX)";
parent.__c.LogImpl("710616866","Hacienda"+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=10616867;
 //BA.debugLineNum = 10616867;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
_partes = __c.Regex.Split(" - ",BA.ObjectToString(_value));
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="NAMEINSUMO = partes(0)";
__ref._nameinsumo /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="IDINSUMO = partes(1)";
__ref._idinsumo /*String*/  = _partes[(int) (1)];
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="elementoLabor = Value";
__ref._elementolabor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="Log(\"Elemento labor\" & elementoLabor)";
__c.LogImpl("710747908","Elemento labor"+__ref._elementolabor /*String*/ ,0);
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="loteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Log(\"Lotecbx\" & loteCBX)";
__c.LogImpl("710682371","Lotecbx"+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10551309;
 //BA.debugLineNum = 10551309;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=10551310;
 //BA.debugLineNum = 10551310;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=10551314;
 //BA.debugLineNum = 10551314;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=10551315;
 //BA.debugLineNum = 10551315;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=10551316;
 //BA.debugLineNum = 10551316;BA.debugLine="Dim NombreHacienda As String = row(1)";
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
RDebugUtils.currentLine=10551324;
 //BA.debugLineNum = 10551324;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("710551324","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=10551327;
 //BA.debugLineNum = 10551327;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=10551330;
 //BA.debugLineNum = 10551330;BA.debugLine="Log(\"Nit seleccionado\" &  nitEmpresaCBX)";
parent.__c.LogImpl("710551330","Nit seleccionado"+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=10551331;
 //BA.debugLineNum = 10551331;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="tipoLabranzaSiembra = Value";
__ref._tipolabranzasiembra /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="Log(\"tipo labranza \"&tipoLabranzaSiembra)";
__c.LogImpl("711862020","tipo labranza "+__ref._tipolabranzasiembra /*String*/ ,0);
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtiporiego_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtiporiego_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtiporiego_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="tipoRiego = Value";
__ref._tiporiego /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="Log(\"tipo riego\" & tipoRiego)";
__c.LogImpl("711272195","tipo riego"+__ref._tiporiego /*String*/ ,0);
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtypeform_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtypeform_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtypeform_itemclick", new Object[] {_position,_value}));}
b4a.example.ef.b4xtable._b4xtablecolumn _insumocolum = null;
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="tipoLabor = Value";
__ref._tipolabor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="If IsNumber(Value) Then";
if (__c.IsNumber(BA.ObjectToString(_value))) { 
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="Select Case Value";
switch (BA.switchObjectToInt(_value,(Object)(0),(Object)(1),(Object)(2))) {
case 0: {
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="RemoveForm2IfExists";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=11010056;
 //BA.debugLineNum = 11010056;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createiteminsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form0"));
RDebugUtils.currentLine=11010058;
 //BA.debugLineNum = 11010058;BA.debugLine="LlenarComboBoxInsumo";
__ref._llenarcomboboxinsumo /*void*/ (null);
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.";
_insumocolum = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"#",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_numbers /*int*/ );
RDebugUtils.currentLine=11010060;
 //BA.debugLineNum = 11010060;BA.debugLine="INSUMOCOLUM.Width = 50dip";
_insumocolum.Width /*int*/  = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=11010061;
 //BA.debugLineNum = 11010061;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYP";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"ID",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=11010062;
 //BA.debugLineNum = 11010062;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"NOMBRE",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLU";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"CANTIDAD",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=11010065;
 //BA.debugLineNum = 11010065;BA.debugLine="cantidadInsumos = 0";
__ref._cantidadinsumos /*int*/  = (int) (0);
RDebugUtils.currentLine=11010066;
 //BA.debugLineNum = 11010066;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=11010067;
 //BA.debugLineNum = 11010067;BA.debugLine="CANTINSUMO = \"\"";
__ref._cantinsumo /*String*/  = "";
 break; }
case 1: {
RDebugUtils.currentLine=11010069;
 //BA.debugLineNum = 11010069;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=11010070;
 //BA.debugLineNum = 11010070;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=11010071;
 //BA.debugLineNum = 11010071;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemsiembra /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form3"));
RDebugUtils.currentLine=11010072;
 //BA.debugLineNum = 11010072;BA.debugLine="LlenarComboBoxSiembra";
__ref._llenarcomboboxsiembra /*void*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=11010074;
 //BA.debugLineNum = 11010074;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=11010075;
 //BA.debugLineNum = 11010075;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=11010076;
 //BA.debugLineNum = 11010076;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemriego /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form2"));
RDebugUtils.currentLine=11010077;
 //BA.debugLineNum = 11010077;BA.debugLine="LlenarComboBoxRiego";
__ref._llenarcomboboxriego /*void*/ (null);
 break; }
default: {
RDebugUtils.currentLine=11010080;
 //BA.debugLineNum = 11010080;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
__c.LogImpl("711010080","Valor no reconocido: "+BA.ObjectToString(_value),0);
 break; }
}
;
 }else {
RDebugUtils.currentLine=11010083;
 //BA.debugLineNum = 11010083;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
__c.LogImpl("711010083","Error: Value no es un número válido.",0);
 };
RDebugUtils.currentLine=11010086;
 //BA.debugLineNum = 11010086;BA.debugLine="Log(\"Tipo labor \" & tipoLabor)";
__c.LogImpl("711010086","Tipo labor "+__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=11010087;
 //BA.debugLineNum = 11010087;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateEleme";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonelemento_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateelemento /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="SwiftButtonElemento.xLBL.Text = SearchTemplateEl";
__ref._swiftbuttonelemento /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateelemento /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplateelemento /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="elementoGasto = Partes(0) ' Asignar solo la prim";
__ref._elementogasto /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="If elementoGasto.Length >= 2 Then";
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
RDebugUtils.currentLine=13172746;
 //BA.debugLineNum = 13172746;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, 2)";
__ref._elementogasto /*String*/  = __ref._elementogasto /*String*/ .substring((int) (0),(int) (2));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="elementoGasto = elementoGasto";
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
RDebugUtils.currentLine=13172752;
 //BA.debugLineNum = 13172752;BA.debugLine="Log(elementoGasto)";
parent.__c.LogImpl("713172752",__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=13172753;
 //BA.debugLineNum = 13172753;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Dim ItemsLote As List";
_itemslote = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="ItemsLote.Initialize";
_itemslote.Initialize();
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonhacienda_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
_haciendacompleto = __ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
_partes = parent.__c.Regex.Split(":",_haciendacompleto);
RDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="haciendaCBX = Partes(0)";
__ref._haciendacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=12976138;
 //BA.debugLineNum = 12976138;BA.debugLine="ItemsLote.Clear";
_itemslote.Clear();
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
_itemslote.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=12976142;
 //BA.debugLineNum = 12976142;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12976143;
 //BA.debugLineNum = 12976143;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12976144;
 //BA.debugLineNum = 12976144;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=12976147;
 //BA.debugLineNum = 12976147;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonhacienda_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12976150;
 //BA.debugLineNum = 12976150;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12976152;
 //BA.debugLineNum = 12976152;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonhacienda_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12976157;
 //BA.debugLineNum = 12976157;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=12976158;
 //BA.debugLineNum = 12976158;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=12976162;
 //BA.debugLineNum = 12976162;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
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
RDebugUtils.currentLine=12976167;
 //BA.debugLineNum = 12976167;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("712976167","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=12976169;
 //BA.debugLineNum = 12976169;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslote);
RDebugUtils.currentLine=12976170;
 //BA.debugLineNum = 12976170;BA.debugLine="SwiftButtonLote.Enabled = True";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=12976171;
 //BA.debugLineNum = 12976171;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("712976171",__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=12976173;
 //BA.debugLineNum = 12976173;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=12976176;
 //BA.debugLineNum = 12976176;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateInsum";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttoninsumo_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateinsumo /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="SwiftButtonInsumo.xLBL.Text = SearchTemplateInsu";
__ref._swiftbuttoninsumo /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateinsumo /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="Dim INSUMOCOMPLETO As String = SearchTemplateIns";
_insumocompleto = __ref._searchtemplateinsumo /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="Dim partes() As String = Regex.Split(\":\", INSUMO";
_partes = parent.__c.Regex.Split(":",_insumocompleto);
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="NAMEINSUMO = partes(1)";
__ref._nameinsumo /*String*/  = _partes[(int) (1)];
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="IDINSUMO = partes(0)";
__ref._idinsumo /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="Log(IDINSUMO)";
parent.__c.LogImpl("713303817",__ref._idinsumo /*String*/ ,0);
RDebugUtils.currentLine=13303818;
 //BA.debugLineNum = 13303818;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonlabor_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
__ref._swiftbuttonlabor /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="elementoLabor = Partes(0) ' Asignar solo la prim";
__ref._elementolabor /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13107208;
 //BA.debugLineNum = 13107208;BA.debugLine="Log(elementoLabor)";
parent.__c.LogImpl("713107208",__ref._elementolabor /*String*/ ,0);
RDebugUtils.currentLine=13107209;
 //BA.debugLineNum = 13107209;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonlote_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.S";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="loteCBX = Partes(0) ' Asignar solo la primera pa";
__ref._lotecbx /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="Log(loteCBX)";
parent.__c.LogImpl("713041673",__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim ItemsHacienda As List";
_itemshacienda = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="ItemsHacienda.Initialize";
_itemshacienda.Initialize();
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonnit_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
__ref._swiftbuttonnit /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
_nitcompleto = __ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
_partes = parent.__c.Regex.Split(":",_nitcompleto);
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="nitEmpresaCBX = Partes(0)";
__ref._nitempresacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=12910601;
 //BA.debugLineNum = 12910601;BA.debugLine="ItemsHacienda.Clear";
_itemshacienda.Clear();
RDebugUtils.currentLine=12910602;
 //BA.debugLineNum = 12910602;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
_itemshacienda.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=12910603;
 //BA.debugLineNum = 12910603;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=12910605;
 //BA.debugLineNum = 12910605;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12910606;
 //BA.debugLineNum = 12910606;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12910607;
 //BA.debugLineNum = 12910607;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)(__ref._nitempresacbx /*String*/ )});
RDebugUtils.currentLine=12910610;
 //BA.debugLineNum = 12910610;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonnit_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12910613;
 //BA.debugLineNum = 12910613;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12910615;
 //BA.debugLineNum = 12910615;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12910616;
 //BA.debugLineNum = 12910616;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonnit_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12910620;
 //BA.debugLineNum = 12910620;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=12910621;
 //BA.debugLineNum = 12910621;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=12910622;
 //BA.debugLineNum = 12910622;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=12910627;
 //BA.debugLineNum = 12910627;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
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
RDebugUtils.currentLine=12910632;
 //BA.debugLineNum = 12910632;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("712910632","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=12910634;
 //BA.debugLineNum = 12910634;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemshacienda);
RDebugUtils.currentLine=12910635;
 //BA.debugLineNum = 12910635;BA.debugLine="SwiftButtonHacienda.Enabled = True";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=12910636;
 //BA.debugLineNum = 12910636;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("712910636",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=12910638;
 //BA.debugLineNum = 12910638;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=12910641;
 //BA.debugLineNum = 12910641;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateRiego";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonriego_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateriego /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="SwiftButtonRiego.xLBL.Text = SearchTemplateRiego";
__ref._swiftbuttonriego /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateriego /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplateriego /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="tipoRiego = Partes(0) ' Asignar solo la primera";
__ref._tiporiego /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="Log(tipoRiego)";
parent.__c.LogImpl("713369352",__ref._tiporiego /*String*/ ,0);
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTipoL";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttontipolabranza_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatetipolabranza /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="SwiftButtonTipoLabranza.xLBL.Text = SearchTempla";
__ref._swiftbuttontipolabranza /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatetipolabranza /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatetipolabranza /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="tipoLabranzaSiembra = Partes(0)";
__ref._tipolabranzasiembra /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="If tipoLabranzaSiembra.Length >= 2 Then";
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
RDebugUtils.currentLine=13434890;
 //BA.debugLineNum = 13434890;BA.debugLine="tipoLabranzaSiembra = tipoLabranzaSiembra.SubSt";
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
RDebugUtils.currentLine=13434894;
 //BA.debugLineNum = 13434894;BA.debugLine="Log(tipoLabranzaSiembra)";
parent.__c.LogImpl("713434894",__ref._tipolabranzasiembra /*String*/ ,0);
RDebugUtils.currentLine=13434895;
 //BA.debugLineNum = 13434895;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTypeF";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttontypeform_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatetypeform /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="SwiftButtonTypeForm.xLBL.Text = SearchTemplateTy";
__ref._swiftbuttontypeform /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatetypeform /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="Dim TYPEFORMCOMPLETO As String = SearchTemplateT";
_typeformcompleto = __ref._searchtemplatetypeform /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", TYPEFO";
_partes = parent.__c.Regex.Split(":",_typeformcompleto);
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="tipoLabor = Partes(0)";
__ref._tipolabor /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="Log(tipoLabor)";
parent.__c.LogImpl("713238279",__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=13238280;
 //BA.debugLineNum = 13238280;BA.debugLine="Dim tipoForm As String = Partes(0)";
_tipoform = _partes[(int) (0)];
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="Select Case tipoForm";
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
RDebugUtils.currentLine=13238284;
 //BA.debugLineNum = 13238284;BA.debugLine="RemoveForm2IfExists";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=13238285;
 //BA.debugLineNum = 13238285;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=13238286;
 //BA.debugLineNum = 13238286;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"form";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createiteminsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form0"));
RDebugUtils.currentLine=13238287;
 //BA.debugLineNum = 13238287;BA.debugLine="LlenarComboBoxInsumo";
__ref._llenarcomboboxinsumo /*void*/ (null);
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.A";
_insumocolum = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"#",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_numbers /*int*/ );
RDebugUtils.currentLine=13238289;
 //BA.debugLineNum = 13238289;BA.debugLine="INSUMOCOLUM.Width = 50dip";
_insumocolum.Width /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=13238290;
 //BA.debugLineNum = 13238290;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYPE";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"ID",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=13238291;
 //BA.debugLineNum = 13238291;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN_";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"NOMBRE",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=13238292;
 //BA.debugLineNum = 13238292;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLUM";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"CANTIDAD",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=13238294;
 //BA.debugLineNum = 13238294;BA.debugLine="cantidadInsumos = 0";
__ref._cantidadinsumos /*int*/  = (int) (0);
RDebugUtils.currentLine=13238295;
 //BA.debugLineNum = 13238295;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=13238296;
 //BA.debugLineNum = 13238296;BA.debugLine="CANTINSUMO = \"\"";
__ref._cantinsumo /*String*/  = "";
 if (true) break;

case 8:
//C
this.state = 13;
RDebugUtils.currentLine=13238298;
 //BA.debugLineNum = 13238298;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=13238299;
 //BA.debugLineNum = 13238299;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exist";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=13238300;
 //BA.debugLineNum = 13238300;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemsiembra /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form3"));
RDebugUtils.currentLine=13238301;
 //BA.debugLineNum = 13238301;BA.debugLine="LlenarComboBoxSiembra";
__ref._llenarcomboboxsiembra /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=13238303;
 //BA.debugLineNum = 13238303;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=13238304;
 //BA.debugLineNum = 13238304;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=13238305;
 //BA.debugLineNum = 13238305;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"form";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemriego /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form2"));
RDebugUtils.currentLine=13238306;
 //BA.debugLineNum = 13238306;BA.debugLine="LlenarComboBoxRiego";
__ref._llenarcomboboxriego /*void*/ (null);
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=13238309;
 //BA.debugLineNum = 13238309;BA.debugLine="Log(\"Valor no reconocido: \" & tipoForm)";
parent.__c.LogImpl("713238309","Valor no reconocido: "+_tipoform,0);
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
RDebugUtils.currentLine=13238313;
 //BA.debugLineNum = 13238313;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateVarie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "swiftbuttonvariedad_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatevariedad /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="SwiftButtonVariedad.xLBL.Text = SearchTemplateVa";
__ref._swiftbuttonvariedad /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatevariedad /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatevariedad /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=13500422;
 //BA.debugLineNum = 13500422;BA.debugLine="codigoSiembra = Partes(0)";
__ref._codigosiembra /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13500424;
 //BA.debugLineNum = 13500424;BA.debugLine="Log(codigoSiembra)";
parent.__c.LogImpl("713500424",__ref._codigosiembra /*String*/ ,0);
RDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}