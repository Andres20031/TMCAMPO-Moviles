package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formprecipitacion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formprecipitacion");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.formprecipitacion.class).invoke(this, new Object[] {null});
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
public String _rdclink = "";
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public b4a.example3.customlistview _customlistview1geral = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1geral = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13time = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxpluviometro = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthorafin = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public b4a.example.ef.as_datepicker _as_datepicker1 = null;
public String _fecha = "";
public String _selectedcdgo_plvmtro = "";
public String _selectednombre_plvmtro = "";
public String _selectednit_plvmtro = "";
public String _selectedhda_pvlmtro = "";
public String _textocapturado = "";
public anywheresoftware.b4a.objects.collections.Map _pluviometromap = null;
public b4a.example.ef.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public b4a.example.ef.swiftbutton _swiftbuttonpluvimetro = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatepluvimetro = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.formprecipitacion __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formprecipitacion __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=20447237;
 //BA.debugLineNum = 20447237;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=20447243;
 //BA.debugLineNum = 20447243;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=20447246;
 //BA.debugLineNum = 20447246;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=20447249;
 //BA.debugLineNum = 20447249;BA.debugLine="fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=20447252;
 //BA.debugLineNum = 20447252;BA.debugLine="Log(fecha)";
__c.LogImpl("420447252",__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=20447253;
 //BA.debugLineNum = 20447253;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear(b4a.example.ef.formprecipitacion __ref) throws Exception{
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formprecipitacion parent,b4a.example.ef.formprecipitacion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formprecipitacion __ref;
b4a.example.ef.formprecipitacion parent;
b4a.example.ef.dbrequestmanager _req = null;
anywheresoftware.b4a.objects.collections.List _itemspuvlimetro = null;
b4a.example.ef.main._dbcommand _cmdpluviometro = null;
b4a.example.ef.httpjob _j2 = null;
b4a.example.ef.main._dbresult _respluviometro = null;
Object[] _rowpluviometro = null;
String _cdgo_plvmtro = "";
String _nombre_plvmtro = "";
String _nit_plvmtro = "";
String _hda_pvlmtro = "";
anywheresoftware.b4a.objects.collections.Map _detailsmap = null;
anywheresoftware.b4a.BA.IterableList group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formprecipitacion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="pluviometroMap.Initialize";
__ref._pluviometromap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"formPreci\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("formPreci"));
RDebugUtils.currentLine=19988492;
 //BA.debugLineNum = 19988492;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=19988493;
 //BA.debugLineNum = 19988493;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=19988497;
 //BA.debugLineNum = 19988497;BA.debugLine="SearchTemplatePluvimetro.Initialize";
__ref._searchtemplatepluvimetro /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=19988499;
 //BA.debugLineNum = 19988499;BA.debugLine="Dim itemsPuvlimetro As List";
_itemspuvlimetro = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19988500;
 //BA.debugLineNum = 19988500;BA.debugLine="itemsPuvlimetro.Initialize";
_itemspuvlimetro.Initialize();
RDebugUtils.currentLine=19988501;
 //BA.debugLineNum = 19988501;BA.debugLine="itemsPuvlimetro.Add(\"Seleccionar:\")";
_itemspuvlimetro.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=19988504;
 //BA.debugLineNum = 19988504;BA.debugLine="Dim cmdPluviometro As DBCommand = CreateCommand(\"";
_cmdpluviometro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maquina_pluviometros",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=19988505;
 //BA.debugLineNum = 19988505;BA.debugLine="Wait For (Req.ExecuteQuery(cmdPluviometro, 0, Nul";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprecipitacion", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdpluviometro,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=19988506;
 //BA.debugLineNum = 19988506;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=19988507;
 //BA.debugLineNum = 19988507;BA.debugLine="Req.HandleJobAsync(j2, \"req_pluviometro\")";
_req._handlejobasync /*void*/ (null,_j2,"req_pluviometro");
RDebugUtils.currentLine=19988508;
 //BA.debugLineNum = 19988508;BA.debugLine="Wait For (Req) req_pluviometro_Result(resPluviom";
parent.__c.WaitFor("req_pluviometro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprecipitacion", "b4xpage_appear"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_respluviometro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=19988509;
 //BA.debugLineNum = 19988509;BA.debugLine="For Each rowPluviometro() As Object In resPluvio";
if (true) break;

case 4:
//for
this.state = 7;
group19 = _respluviometro.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index19 = 0;
groupLen19 = group19.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index19 < groupLen19) {
this.state = 6;
_rowpluviometro = (Object[])(group19.Get(index19));}
if (true) break;

case 14:
//C
this.state = 13;
index19++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=19988510;
 //BA.debugLineNum = 19988510;BA.debugLine="Dim cdgo_Plvmtro As String = rowPluviometro(0)";
_cdgo_plvmtro = BA.ObjectToString(_rowpluviometro[(int) (0)]);
RDebugUtils.currentLine=19988511;
 //BA.debugLineNum = 19988511;BA.debugLine="Dim Nombre_Plvmtro As String = rowPluviometro(1";
_nombre_plvmtro = BA.ObjectToString(_rowpluviometro[(int) (1)]);
RDebugUtils.currentLine=19988512;
 //BA.debugLineNum = 19988512;BA.debugLine="Dim Nit_Plvmtro As String = rowPluviometro(2)";
_nit_plvmtro = BA.ObjectToString(_rowpluviometro[(int) (2)]);
RDebugUtils.currentLine=19988513;
 //BA.debugLineNum = 19988513;BA.debugLine="Dim Hda_Pvlmtro As String = rowPluviometro(3)";
_hda_pvlmtro = BA.ObjectToString(_rowpluviometro[(int) (3)]);
RDebugUtils.currentLine=19988516;
 //BA.debugLineNum = 19988516;BA.debugLine="Dim detailsMap As Map";
_detailsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=19988517;
 //BA.debugLineNum = 19988517;BA.debugLine="detailsMap.Initialize";
_detailsmap.Initialize();
RDebugUtils.currentLine=19988518;
 //BA.debugLineNum = 19988518;BA.debugLine="detailsMap.Put(\"Nombre\", Nombre_Plvmtro)";
_detailsmap.Put((Object)("Nombre"),(Object)(_nombre_plvmtro));
RDebugUtils.currentLine=19988519;
 //BA.debugLineNum = 19988519;BA.debugLine="detailsMap.Put(\"Nit\", Nit_Plvmtro)";
_detailsmap.Put((Object)("Nit"),(Object)(_nit_plvmtro));
RDebugUtils.currentLine=19988520;
 //BA.debugLineNum = 19988520;BA.debugLine="detailsMap.Put(\"Hda\", Hda_Pvlmtro)";
_detailsmap.Put((Object)("Hda"),(Object)(_hda_pvlmtro));
RDebugUtils.currentLine=19988522;
 //BA.debugLineNum = 19988522;BA.debugLine="pluviometroMap.Put(cdgo_Plvmtro, detailsMap)";
__ref._pluviometromap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_cdgo_plvmtro),(Object)(_detailsmap.getObject()));
RDebugUtils.currentLine=19988525;
 //BA.debugLineNum = 19988525;BA.debugLine="SD_xComboBoxPluviometro.Add(Nombre_Plvmtro, cdg";
__ref._sd_xcomboboxpluviometro /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombre_plvmtro,(Object)(_cdgo_plvmtro));
RDebugUtils.currentLine=19988526;
 //BA.debugLineNum = 19988526;BA.debugLine="itemsPuvlimetro.Add(cdgo_Plvmtro&\":\"&Nombre_Plv";
_itemspuvlimetro.Add((Object)(_cdgo_plvmtro+":"+_nombre_plvmtro));
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
RDebugUtils.currentLine=19988529;
 //BA.debugLineNum = 19988529;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
parent.__c.LogImpl("419988529","Error en la consulta de Maquina: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=19988531;
 //BA.debugLineNum = 19988531;BA.debugLine="SearchTemplatePluvimetro.SetItems(itemsPuvlimetro";
__ref._searchtemplatepluvimetro /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemspuvlimetro);
RDebugUtils.currentLine=19988532;
 //BA.debugLineNum = 19988532;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=19988534;
 //BA.debugLineNum = 19988534;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.formprecipitacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 92%Y)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (92),ba));
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="panel.LoadLayout(\"addPrecipitacionUI\")";
_panel.LoadLayout("addPrecipitacionUI",ba);
RDebugUtils.currentLine=20054022;
 //BA.debugLineNum = 20054022;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=20054024;
 //BA.debugLineNum = 20054024;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=20054025;
 //BA.debugLineNum = 20054025;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formprecipitacion __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formprecipitacion __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="Base = Root";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="Dialog.Initialize (Base)";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="Dialog.Title = \"Buscador\"";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._title /*Object*/  = (Object)("Buscador");
RDebugUtils.currentLine=19922951;
 //BA.debugLineNum = 19922951;BA.debugLine="End Sub";
return "";
}
public void  _button1_click(b4a.example.ef.formprecipitacion __ref) throws Exception{
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {Debug.delegate(ba, "button1_click", null); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formprecipitacion parent,b4a.example.ef.formprecipitacion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formprecipitacion __ref;
b4a.example.ef.formprecipitacion parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formprecipitacion";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert.pluv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert.pluviometro",new Object[]{(Object)(__ref._selectedcdgo_plvmtro /*String*/ ),(Object)(__ref._fecha /*String*/ ),(Object)(__ref._textocapturado /*String*/ ),(Object)(__ref._selectednit_plvmtro /*String*/ ),(Object)(__ref._selectedhda_pvlmtro /*String*/ )});
RDebugUtils.currentLine=20578312;
 //BA.debugLineNum = 20578312;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=20578313;
 //BA.debugLineNum = 20578313;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprecipitacion", "button1_click"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=20578316;
 //BA.debugLineNum = 20578316;BA.debugLine="Try";
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
RDebugUtils.currentLine=20578317;
 //BA.debugLineNum = 20578317;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=20578318;
 //BA.debugLineNum = 20578318;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=20578320;
 //BA.debugLineNum = 20578320;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("420578320","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=20578323;
 //BA.debugLineNum = 20578323;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("420578323","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=20578325;
 //BA.debugLineNum = 20578325;BA.debugLine="End Sub";
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
public String  _class_globals(b4a.example.ef.formprecipitacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19791881;
 //BA.debugLineNum = 19791881;BA.debugLine="Private SD_xComboBoxPluviometro As SD_xComboBox";
_sd_xcomboboxpluviometro = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=19791882;
 //BA.debugLineNum = 19791882;BA.debugLine="Private EditTextHoraFin As EditText";
_edittexthorafin = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=19791883;
 //BA.debugLineNum = 19791883;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=19791884;
 //BA.debugLineNum = 19791884;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=19791885;
 //BA.debugLineNum = 19791885;BA.debugLine="Dim fecha As String";
_fecha = "";
RDebugUtils.currentLine=19791887;
 //BA.debugLineNum = 19791887;BA.debugLine="Dim selectedCdgo_Plvmtro As String";
_selectedcdgo_plvmtro = "";
RDebugUtils.currentLine=19791888;
 //BA.debugLineNum = 19791888;BA.debugLine="Dim selectedNombre_Plvmtro As String";
_selectednombre_plvmtro = "";
RDebugUtils.currentLine=19791889;
 //BA.debugLineNum = 19791889;BA.debugLine="Dim selectedNit_Plvmtro As String";
_selectednit_plvmtro = "";
RDebugUtils.currentLine=19791890;
 //BA.debugLineNum = 19791890;BA.debugLine="Dim selectedHda_Pvlmtro As String";
_selectedhda_pvlmtro = "";
RDebugUtils.currentLine=19791891;
 //BA.debugLineNum = 19791891;BA.debugLine="Dim textoCapturado As String";
_textocapturado = "";
RDebugUtils.currentLine=19791892;
 //BA.debugLineNum = 19791892;BA.debugLine="Dim pluviometroMap As Map";
_pluviometromap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=19791894;
 //BA.debugLineNum = 19791894;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=19791895;
 //BA.debugLineNum = 19791895;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19791897;
 //BA.debugLineNum = 19791897;BA.debugLine="Private SwiftButtonPluvimetro As SwiftButton";
_swiftbuttonpluvimetro = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=19791898;
 //BA.debugLineNum = 19791898;BA.debugLine="Private SearchTemplatePluvimetro As B4XSearchTemp";
_searchtemplatepluvimetro = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=19791899;
 //BA.debugLineNum = 19791899;BA.debugLine="End Sub";
return "";
}
public String  _edittexthorafin_textchanged(b4a.example.ef.formprecipitacion __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "edittexthorafin_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittexthorafin_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Private Sub EditTextHoraFin_TextChanged (Old As St";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Log(\"Texto anterior: \" & Old)";
__c.LogImpl("420512769","Texto anterior: "+_old,0);
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="Log(\"Texto nuevo: \" & New)";
__c.LogImpl("420512770","Texto nuevo: "+_new,0);
RDebugUtils.currentLine=20512776;
 //BA.debugLineNum = 20512776;BA.debugLine="textoCapturado = New";
__ref._textocapturado /*String*/  = _new;
RDebugUtils.currentLine=20512777;
 //BA.debugLineNum = 20512777;BA.debugLine="Log(\"El texto es mayor de 5 caracteres: \" & texto";
__c.LogImpl("420512777","El texto es mayor de 5 caracteres: "+__ref._textocapturado /*String*/ ,0);
RDebugUtils.currentLine=20512779;
 //BA.debugLineNum = 20512779;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formprecipitacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formprecipitacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click(b4a.example.ef.formprecipitacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "label2save_click", false))
	 {return ((String) Debug.delegate(ba, "label2save_click", null));}
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Private Sub Label2Save_Click";
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxpluviometro_itemclick(b4a.example.ef.formprecipitacion __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "sd_xcomboboxpluviometro_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxpluviometro_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.Map _detailsmap = null;
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Private Sub SD_xComboBoxPluviometro_ItemClick (Pos";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Log(\"VALOR COMBOBOX: \" & Value)";
__c.LogImpl("420381697","VALOR COMBOBOX: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="If pluviometroMap.ContainsKey(Value) Then";
if (__ref._pluviometromap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_value)) { 
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="Dim detailsMap As Map = pluviometroMap.Get(Value";
_detailsmap = new anywheresoftware.b4a.objects.collections.Map();
_detailsmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._pluviometromap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_value)));
RDebugUtils.currentLine=20381702;
 //BA.debugLineNum = 20381702;BA.debugLine="selectedCdgo_Plvmtro = Value";
__ref._selectedcdgo_plvmtro /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=20381703;
 //BA.debugLineNum = 20381703;BA.debugLine="selectedNombre_Plvmtro = detailsMap.Get(\"Nombre\"";
__ref._selectednombre_plvmtro /*String*/  = BA.ObjectToString(_detailsmap.Get((Object)("Nombre")));
RDebugUtils.currentLine=20381704;
 //BA.debugLineNum = 20381704;BA.debugLine="selectedNit_Plvmtro = detailsMap.Get(\"Nit\")";
__ref._selectednit_plvmtro /*String*/  = BA.ObjectToString(_detailsmap.Get((Object)("Nit")));
RDebugUtils.currentLine=20381705;
 //BA.debugLineNum = 20381705;BA.debugLine="selectedHda_Pvlmtro = detailsMap.Get(\"Hda\")";
__ref._selectedhda_pvlmtro /*String*/  = BA.ObjectToString(_detailsmap.Get((Object)("Hda")));
RDebugUtils.currentLine=20381708;
 //BA.debugLineNum = 20381708;BA.debugLine="Log(\"Código: \" & selectedCdgo_Plvmtro)";
__c.LogImpl("420381708","Código: "+__ref._selectedcdgo_plvmtro /*String*/ ,0);
RDebugUtils.currentLine=20381709;
 //BA.debugLineNum = 20381709;BA.debugLine="Log(\"Nombre: \" & selectedNombre_Plvmtro)";
__c.LogImpl("420381709","Nombre: "+__ref._selectednombre_plvmtro /*String*/ ,0);
RDebugUtils.currentLine=20381710;
 //BA.debugLineNum = 20381710;BA.debugLine="Log(\"NIT: \" & selectedNit_Plvmtro)";
__c.LogImpl("420381710","NIT: "+__ref._selectednit_plvmtro /*String*/ ,0);
RDebugUtils.currentLine=20381711;
 //BA.debugLineNum = 20381711;BA.debugLine="Log(\"Hacienda: \" & selectedHda_Pvlmtro)";
__c.LogImpl("420381711","Hacienda: "+__ref._selectedhda_pvlmtro /*String*/ ,0);
 }else {
RDebugUtils.currentLine=20381713;
 //BA.debugLineNum = 20381713;BA.debugLine="Log(\"Error: No se encontraron detalles para el c";
__c.LogImpl("420381713","Error: No se encontraron detalles para el código seleccionado.",0);
 };
RDebugUtils.currentLine=20381715;
 //BA.debugLineNum = 20381715;BA.debugLine="End Sub";
return "";
}
public void  _swiftbuttonpluvimetro_click(b4a.example.ef.formprecipitacion __ref) throws Exception{
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "swiftbuttonpluvimetro_click", false))
	 {Debug.delegate(ba, "swiftbuttonpluvimetro_click", null); return;}
ResumableSub_SwiftButtonPluvimetro_Click rsub = new ResumableSub_SwiftButtonPluvimetro_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonPluvimetro_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonPluvimetro_Click(b4a.example.ef.formprecipitacion parent,b4a.example.ef.formprecipitacion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formprecipitacion __ref;
b4a.example.ef.formprecipitacion parent;
int _result = 0;
String[] _partes = null;
anywheresoftware.b4a.objects.collections.Map _details = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formprecipitacion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplatePluvi";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprecipitacion", "swiftbuttonpluvimetro_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatepluvimetro /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=20643843;
 //BA.debugLineNum = 20643843;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="SwiftButtonPluvimetro.xLBL.Text = SearchTemplate";
__ref._swiftbuttonpluvimetro /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatepluvimetro /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=20643845;
 //BA.debugLineNum = 20643845;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",__ref._searchtemplatepluvimetro /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ );
RDebugUtils.currentLine=20643846;
 //BA.debugLineNum = 20643846;BA.debugLine="selectedCdgo_Plvmtro = Partes(0) ' Código del Pl";
__ref._selectedcdgo_plvmtro /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=20643849;
 //BA.debugLineNum = 20643849;BA.debugLine="If pluviometroMap.ContainsKey(selectedCdgo_Plvmt";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._pluviometromap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._selectedcdgo_plvmtro /*String*/ ))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=20643850;
 //BA.debugLineNum = 20643850;BA.debugLine="Dim details As Map = pluviometroMap.Get(selecte";
_details = new anywheresoftware.b4a.objects.collections.Map();
_details = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._pluviometromap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._selectedcdgo_plvmtro /*String*/ ))));
RDebugUtils.currentLine=20643851;
 //BA.debugLineNum = 20643851;BA.debugLine="selectedNombre_Plvmtro = details.Get(\"Nombre\")";
__ref._selectednombre_plvmtro /*String*/  = BA.ObjectToString(_details.Get((Object)("Nombre")));
RDebugUtils.currentLine=20643852;
 //BA.debugLineNum = 20643852;BA.debugLine="selectedNit_Plvmtro = details.Get(\"Nit\")";
__ref._selectednit_plvmtro /*String*/  = BA.ObjectToString(_details.Get((Object)("Nit")));
RDebugUtils.currentLine=20643853;
 //BA.debugLineNum = 20643853;BA.debugLine="selectedHda_Pvlmtro = details.Get(\"Hda\")";
__ref._selectedhda_pvlmtro /*String*/  = BA.ObjectToString(_details.Get((Object)("Hda")));
RDebugUtils.currentLine=20643856;
 //BA.debugLineNum = 20643856;BA.debugLine="Log(\"Código: \" & selectedCdgo_Plvmtro)";
parent.__c.LogImpl("420643856","Código: "+__ref._selectedcdgo_plvmtro /*String*/ ,0);
RDebugUtils.currentLine=20643857;
 //BA.debugLineNum = 20643857;BA.debugLine="Log(\"Nombre: \" & selectedNombre_Plvmtro)";
parent.__c.LogImpl("420643857","Nombre: "+__ref._selectednombre_plvmtro /*String*/ ,0);
RDebugUtils.currentLine=20643858;
 //BA.debugLineNum = 20643858;BA.debugLine="Log(\"NIT: \" & selectedNit_Plvmtro)";
parent.__c.LogImpl("420643858","NIT: "+__ref._selectednit_plvmtro /*String*/ ,0);
RDebugUtils.currentLine=20643859;
 //BA.debugLineNum = 20643859;BA.debugLine="Log(\"Hacienda: \" & selectedHda_Pvlmtro)";
parent.__c.LogImpl("420643859","Hacienda: "+__ref._selectedhda_pvlmtro /*String*/ ,0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=20643861;
 //BA.debugLineNum = 20643861;BA.debugLine="Log(\"No se encontraron detalles para el código";
parent.__c.LogImpl("420643861","No se encontraron detalles para el código seleccionado.",0);
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
RDebugUtils.currentLine=20643864;
 //BA.debugLineNum = 20643864;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}