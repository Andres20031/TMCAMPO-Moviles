package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formprecipitacion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.formprecipitacion");
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
public String  _as_datepicker1_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 156;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
 //BA.debugLineNum = 158;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 161;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 164;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 167;BA.debugLine="Label13Time.Text = formattedDate";
_label13time.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 170;BA.debugLine="Panel12.Visible = False";
_panel12.setVisible(__c.False);
 //BA.debugLineNum = 173;BA.debugLine="fecha = formattedDate";
_fecha = _formatteddate;
 //BA.debugLineNum = 176;BA.debugLine="Log(fecha)";
__c.LogImpl("74390932",_fecha,0);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formprecipitacion parent) {
this.parent = parent;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 46;BA.debugLine="utilClass.Initialize";
parent._utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 47;BA.debugLine="pluviometroMap.Initialize";
parent._pluviometromap.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
parent._utilclass._setstatusbarcolor /*String*/ (parent.__c.Colors.White,((int)0xb4008000));
 //BA.debugLineNum = 49;BA.debugLine="Root.LoadLayout(\"form\")";
parent._root.LoadLayout("form",ba);
 //BA.debugLineNum = 50;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
parent._customlistview1geral._defaulttextbackgroundcolor = ((int)0xff25253d);
 //BA.debugLineNum = 51;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
parent._customlistview1geral._defaulttextcolor = parent.__c.Colors.White;
 //BA.debugLineNum = 52;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"formPreci\")";
parent._customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createitem().getObject())),(Object)("formPreci"));
 //BA.debugLineNum = 57;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 58;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 62;BA.debugLine="SearchTemplatePluvimetro.Initialize";
parent._searchtemplatepluvimetro._initialize /*String*/ (ba);
 //BA.debugLineNum = 64;BA.debugLine="Dim itemsPuvlimetro As List";
_itemspuvlimetro = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 65;BA.debugLine="itemsPuvlimetro.Initialize";
_itemspuvlimetro.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="itemsPuvlimetro.Add(\"Seleccionar:\")";
_itemspuvlimetro.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 69;BA.debugLine="Dim cmdPluviometro As DBCommand = CreateCommand(\"";
_cmdpluviometro = parent._createcommand("select_maquina_pluviometros",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 70;BA.debugLine="Wait For (Req.ExecuteQuery(cmdPluviometro, 0, Nul";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdpluviometro,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j2 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 71;BA.debugLine="If j2.Success Then";
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
 //BA.debugLineNum = 72;BA.debugLine="Req.HandleJobAsync(j2, \"req_pluviometro\")";
_req._handlejobasync /*void*/ (_j2,"req_pluviometro");
 //BA.debugLineNum = 73;BA.debugLine="Wait For (Req) req_pluviometro_Result(resPluviom";
parent.__c.WaitFor("req_pluviometro_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_respluviometro = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 74;BA.debugLine="For Each rowPluviometro() As Object In resPluvio";
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
 //BA.debugLineNum = 75;BA.debugLine="Dim cdgo_Plvmtro As String = rowPluviometro(0)";
_cdgo_plvmtro = BA.ObjectToString(_rowpluviometro[(int) (0)]);
 //BA.debugLineNum = 76;BA.debugLine="Dim Nombre_Plvmtro As String = rowPluviometro(1";
_nombre_plvmtro = BA.ObjectToString(_rowpluviometro[(int) (1)]);
 //BA.debugLineNum = 77;BA.debugLine="Dim Nit_Plvmtro As String = rowPluviometro(2)";
_nit_plvmtro = BA.ObjectToString(_rowpluviometro[(int) (2)]);
 //BA.debugLineNum = 78;BA.debugLine="Dim Hda_Pvlmtro As String = rowPluviometro(3)";
_hda_pvlmtro = BA.ObjectToString(_rowpluviometro[(int) (3)]);
 //BA.debugLineNum = 81;BA.debugLine="Dim detailsMap As Map";
_detailsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 82;BA.debugLine="detailsMap.Initialize";
_detailsmap.Initialize();
 //BA.debugLineNum = 83;BA.debugLine="detailsMap.Put(\"Nombre\", Nombre_Plvmtro)";
_detailsmap.Put((Object)("Nombre"),(Object)(_nombre_plvmtro));
 //BA.debugLineNum = 84;BA.debugLine="detailsMap.Put(\"Nit\", Nit_Plvmtro)";
_detailsmap.Put((Object)("Nit"),(Object)(_nit_plvmtro));
 //BA.debugLineNum = 85;BA.debugLine="detailsMap.Put(\"Hda\", Hda_Pvlmtro)";
_detailsmap.Put((Object)("Hda"),(Object)(_hda_pvlmtro));
 //BA.debugLineNum = 87;BA.debugLine="pluviometroMap.Put(cdgo_Plvmtro, detailsMap)";
parent._pluviometromap.Put((Object)(_cdgo_plvmtro),(Object)(_detailsmap.getObject()));
 //BA.debugLineNum = 90;BA.debugLine="SD_xComboBoxPluviometro.Add(Nombre_Plvmtro, cdg";
parent._sd_xcomboboxpluviometro._add /*String*/ (_nombre_plvmtro,(Object)(_cdgo_plvmtro));
 //BA.debugLineNum = 91;BA.debugLine="itemsPuvlimetro.Add(cdgo_Plvmtro&\":\"&Nombre_Plv";
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
 //BA.debugLineNum = 94;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
parent.__c.LogImpl("73932209","Error en la consulta de Maquina: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 96;BA.debugLine="SearchTemplatePluvimetro.SetItems(itemsPuvlimetro";
parent._searchtemplatepluvimetro._setitems /*Object*/ (_itemspuvlimetro);
 //BA.debugLineNum = 97;BA.debugLine="j2.Release";
_j2._release /*String*/ ();
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.ef.httpjob _j2) throws Exception{
}
public void  _req_pluviometro_result(b4a.example.ef.main._dbresult _respluviometro) throws Exception{
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 37;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 40;BA.debugLine="Base = Root";
_base = _root;
 //BA.debugLineNum = 41;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (ba,_base);
 //BA.debugLineNum = 42;BA.debugLine="Dialog.Title = \"Buscador\"";
_dialog._title /*Object*/  = (Object)("Buscador");
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public void  _button1_click() throws Exception{
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formprecipitacion parent) {
this.parent = parent;
}
b4a.example.ef.formprecipitacion parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 193;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 194;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 197;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert.pluv";
_cmd = parent._createcommand("insert.pluviometro",new Object[]{(Object)(parent._selectedcdgo_plvmtro),(Object)(parent._fecha),(Object)(parent._textocapturado),(Object)(parent._selectednit_plvmtro),(Object)(parent._selectedhda_pvlmtro)});
 //BA.debugLineNum = 200;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 201;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 204;BA.debugLine="Try";
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
 //BA.debugLineNum = 205;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 206;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 208;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("74522000","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 211;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("74522003","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
 //BA.debugLineNum = 5;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 6;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
 //BA.debugLineNum = 8;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private SD_xComboBoxPluviometro As SD_xComboBox";
_sd_xcomboboxpluviometro = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 11;BA.debugLine="Private EditTextHoraFin As EditText";
_edittexthorafin = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
 //BA.debugLineNum = 14;BA.debugLine="Dim fecha As String";
_fecha = "";
 //BA.debugLineNum = 16;BA.debugLine="Dim selectedCdgo_Plvmtro As String";
_selectedcdgo_plvmtro = "";
 //BA.debugLineNum = 17;BA.debugLine="Dim selectedNombre_Plvmtro As String";
_selectednombre_plvmtro = "";
 //BA.debugLineNum = 18;BA.debugLine="Dim selectedNit_Plvmtro As String";
_selectednit_plvmtro = "";
 //BA.debugLineNum = 19;BA.debugLine="Dim selectedHda_Pvlmtro As String";
_selectedhda_pvlmtro = "";
 //BA.debugLineNum = 20;BA.debugLine="Dim textoCapturado As String";
_textocapturado = "";
 //BA.debugLineNum = 21;BA.debugLine="Dim pluviometroMap As Map";
_pluviometromap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 23;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
 //BA.debugLineNum = 24;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private SwiftButtonPluvimetro As SwiftButton";
_swiftbuttonpluvimetro = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 27;BA.debugLine="Private SearchTemplatePluvimetro As B4XSearchTemp";
_searchtemplatepluvimetro = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 113;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 114;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 115;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 116;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 117;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 118;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 102;BA.debugLine="Private Sub CreateItem As Panel";
 //BA.debugLineNum = 104;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 105;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 92%Y)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (92),ba));
 //BA.debugLineNum = 107;BA.debugLine="panel.LoadLayout(\"addPrecipitacionUI\")";
_panel.LoadLayout("addPrecipitacionUI",ba);
 //BA.debugLineNum = 108;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(_panel1geral.getHeight());
 //BA.debugLineNum = 110;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public String  _edittexthorafin_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Private Sub EditTextHoraFin_TextChanged (Old As St";
 //BA.debugLineNum = 180;BA.debugLine="Log(\"Texto anterior: \" & Old)";
__c.LogImpl("74456449","Texto anterior: "+_old,0);
 //BA.debugLineNum = 181;BA.debugLine="Log(\"Texto nuevo: \" & New)";
__c.LogImpl("74456450","Texto nuevo: "+_new,0);
 //BA.debugLineNum = 187;BA.debugLine="textoCapturado = New";
_textocapturado = _new;
 //BA.debugLineNum = 188;BA.debugLine="Log(\"El texto es mayor de 5 caracteres: \" & texto";
__c.LogImpl("74456457","El texto es mayor de 5 caracteres: "+_textocapturado,0);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public String  _label13time_click() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Private Sub Label13Time_Click";
 //BA.debugLineNum = 131;BA.debugLine="Panel12.Visible = True";
_panel12.setVisible(__c.True);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click() throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Private Sub Label1Back_Click";
 //BA.debugLineNum = 123;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click() throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Private Sub Label2Save_Click";
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxpluviometro_itemclick(int _position,Object _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _detailsmap = null;
 //BA.debugLineNum = 134;BA.debugLine="Private Sub SD_xComboBoxPluviometro_ItemClick (Pos";
 //BA.debugLineNum = 135;BA.debugLine="Log(\"VALOR COMBOBOX: \" & Value)";
__c.LogImpl("74325377","VALOR COMBOBOX: "+BA.ObjectToString(_value),0);
 //BA.debugLineNum = 137;BA.debugLine="If pluviometroMap.ContainsKey(Value) Then";
if (_pluviometromap.ContainsKey(_value)) { 
 //BA.debugLineNum = 138;BA.debugLine="Dim detailsMap As Map = pluviometroMap.Get(Value";
_detailsmap = new anywheresoftware.b4a.objects.collections.Map();
_detailsmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_pluviometromap.Get(_value)));
 //BA.debugLineNum = 140;BA.debugLine="selectedCdgo_Plvmtro = Value";
_selectedcdgo_plvmtro = BA.ObjectToString(_value);
 //BA.debugLineNum = 141;BA.debugLine="selectedNombre_Plvmtro = detailsMap.Get(\"Nombre\"";
_selectednombre_plvmtro = BA.ObjectToString(_detailsmap.Get((Object)("Nombre")));
 //BA.debugLineNum = 142;BA.debugLine="selectedNit_Plvmtro = detailsMap.Get(\"Nit\")";
_selectednit_plvmtro = BA.ObjectToString(_detailsmap.Get((Object)("Nit")));
 //BA.debugLineNum = 143;BA.debugLine="selectedHda_Pvlmtro = detailsMap.Get(\"Hda\")";
_selectedhda_pvlmtro = BA.ObjectToString(_detailsmap.Get((Object)("Hda")));
 //BA.debugLineNum = 146;BA.debugLine="Log(\"Código: \" & selectedCdgo_Plvmtro)";
__c.LogImpl("74325388","Código: "+_selectedcdgo_plvmtro,0);
 //BA.debugLineNum = 147;BA.debugLine="Log(\"Nombre: \" & selectedNombre_Plvmtro)";
__c.LogImpl("74325389","Nombre: "+_selectednombre_plvmtro,0);
 //BA.debugLineNum = 148;BA.debugLine="Log(\"NIT: \" & selectedNit_Plvmtro)";
__c.LogImpl("74325390","NIT: "+_selectednit_plvmtro,0);
 //BA.debugLineNum = 149;BA.debugLine="Log(\"Hacienda: \" & selectedHda_Pvlmtro)";
__c.LogImpl("74325391","Hacienda: "+_selectedhda_pvlmtro,0);
 }else {
 //BA.debugLineNum = 151;BA.debugLine="Log(\"Error: No se encontraron detalles para el c";
__c.LogImpl("74325393","Error: No se encontraron detalles para el código seleccionado.",0);
 };
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public void  _swiftbuttonpluvimetro_click() throws Exception{
ResumableSub_SwiftButtonPluvimetro_Click rsub = new ResumableSub_SwiftButtonPluvimetro_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonPluvimetro_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonPluvimetro_Click(b4a.example.ef.formprecipitacion parent) {
this.parent = parent;
}
b4a.example.ef.formprecipitacion parent;
int _result = 0;
String[] _partes = null;
anywheresoftware.b4a.objects.collections.Map _details = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 216;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplatePluvi";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatepluvimetro),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 218;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 219;BA.debugLine="SwiftButtonPluvimetro.xLBL.Text = SearchTemplate";
parent._swiftbuttonpluvimetro._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatepluvimetro._selecteditem /*String*/ ));
 //BA.debugLineNum = 220;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",parent._searchtemplatepluvimetro._selecteditem /*String*/ );
 //BA.debugLineNum = 221;BA.debugLine="selectedCdgo_Plvmtro = Partes(0) ' Código del Pl";
parent._selectedcdgo_plvmtro = _partes[(int) (0)];
 //BA.debugLineNum = 224;BA.debugLine="If pluviometroMap.ContainsKey(selectedCdgo_Plvmt";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._pluviometromap.ContainsKey((Object)(parent._selectedcdgo_plvmtro))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 225;BA.debugLine="Dim details As Map = pluviometroMap.Get(selecte";
_details = new anywheresoftware.b4a.objects.collections.Map();
_details = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent._pluviometromap.Get((Object)(parent._selectedcdgo_plvmtro))));
 //BA.debugLineNum = 226;BA.debugLine="selectedNombre_Plvmtro = details.Get(\"Nombre\")";
parent._selectednombre_plvmtro = BA.ObjectToString(_details.Get((Object)("Nombre")));
 //BA.debugLineNum = 227;BA.debugLine="selectedNit_Plvmtro = details.Get(\"Nit\")";
parent._selectednit_plvmtro = BA.ObjectToString(_details.Get((Object)("Nit")));
 //BA.debugLineNum = 228;BA.debugLine="selectedHda_Pvlmtro = details.Get(\"Hda\")";
parent._selectedhda_pvlmtro = BA.ObjectToString(_details.Get((Object)("Hda")));
 //BA.debugLineNum = 231;BA.debugLine="Log(\"Código: \" & selectedCdgo_Plvmtro)";
parent.__c.LogImpl("74587536","Código: "+parent._selectedcdgo_plvmtro,0);
 //BA.debugLineNum = 232;BA.debugLine="Log(\"Nombre: \" & selectedNombre_Plvmtro)";
parent.__c.LogImpl("74587537","Nombre: "+parent._selectednombre_plvmtro,0);
 //BA.debugLineNum = 233;BA.debugLine="Log(\"NIT: \" & selectedNit_Plvmtro)";
parent.__c.LogImpl("74587538","NIT: "+parent._selectednit_plvmtro,0);
 //BA.debugLineNum = 234;BA.debugLine="Log(\"Hacienda: \" & selectedHda_Pvlmtro)";
parent.__c.LogImpl("74587539","Hacienda: "+parent._selectedhda_pvlmtro,0);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 236;BA.debugLine="Log(\"No se encontraron detalles para el código";
parent.__c.LogImpl("74587541","No se encontraron detalles para el código seleccionado.",0);
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
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
