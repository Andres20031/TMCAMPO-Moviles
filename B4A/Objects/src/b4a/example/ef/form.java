package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class form extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.form");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.form.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _nitupdate = "";
public String _haciendaupdate = "";
public int _idmaquina = 0;
public String _tipo = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public lib.intellvold.datepicker.DatePicker _datepicker = null;
public lib.intellvold.datepicker.clander _mycalendar = null;
public lib.intellvold.datepicker.TimePicker _timepicker = null;
public lib.intellvold.datepicker.DatePicker _datepicker2 = null;
public lib.intellvold.datepicker.clander _mycalendar2 = null;
public b4a.example.ef.util _utilclass = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnernit = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2area = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1cmb = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13time = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2horafim = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1horainicio = null;
public String _nit = "";
public String _hacienda = "";
public String _lote = "";
public String _rdclink = "";
public b4a.example3.customlistview _customlistview1geral = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1geral = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14add = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1addisumo = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1removeinsumo = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1empty = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2insumoname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2qntinsumo = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner1nameinsumo = null;
public int _intcontadorinsumos = 0;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxnit = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxhda = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlote = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlabor = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxelegasto = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.form parent) {
this.parent = parent;
}
b4a.example.ef.form parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
String _estado = "";
int step14;
int limit14;

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
 //BA.debugLineNum = 90;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
 //BA.debugLineNum = 91;BA.debugLine="nitUpdate=\"\"";
parent._nitupdate = "";
 //BA.debugLineNum = 92;BA.debugLine="haciendaUpdate=\"\"";
parent._haciendaupdate = "";
 //BA.debugLineNum = 93;BA.debugLine="utilClass.Initialize";
parent._utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 94;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB4008";
parent._utilclass._setstatusbarcolor /*String*/ (parent.__c.Colors.White,((int)0xb4008000));
 //BA.debugLineNum = 95;BA.debugLine="Root.LoadLayout(\"form\")";
parent._root.LoadLayout("form",ba);
 //BA.debugLineNum = 96;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=";
parent._customlistview1geral._defaulttextbackgroundcolor = ((int)0xff25253d);
 //BA.debugLineNum = 97;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whi";
parent._customlistview1geral._defaulttextcolor = parent.__c.Colors.White;
 //BA.debugLineNum = 98;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
parent._customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createitem().getObject())),(Object)("form1"));
 //BA.debugLineNum = 99;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,this,(int) (20));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
 //BA.debugLineNum = 100;BA.debugLine="If tipo=\"update\" Then";
if (true) break;

case 4:
//if
this.state = 13;
if ((parent._tipo).equals("update")) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 101;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 102;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina where id="+BA.NumberToString(parent._idmaquina))));
 //BA.debugLineNum = 103;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 7:
//for
this.state = 10;
step14 = 1;
limit14 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 9;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 9:
//C
this.state = 19;
 //BA.debugLineNum = 104;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
 //BA.debugLineNum = 111;BA.debugLine="Label10.text=Cursor.GetString(\"fechaInicio\")";
parent._label10.setText(BA.ObjectToCharSequence(_cursor.GetString("fechaInicio")));
 //BA.debugLineNum = 112;BA.debugLine="Label13Time.text=Cursor.GetString(\"fechaFim\")";
parent._label13time.setText(BA.ObjectToCharSequence(_cursor.GetString("fechaFim")));
 //BA.debugLineNum = 113;BA.debugLine="Label13Time.text=Cursor.GetString(\"fechaFim\")";
parent._label13time.setText(BA.ObjectToCharSequence(_cursor.GetString("fechaFim")));
 //BA.debugLineNum = 114;BA.debugLine="EditText1HoraInicio.text=Cursor.GetString(\"are";
parent._edittext1horainicio.setText(BA.ObjectToCharSequence(_cursor.GetString("arealabor")));
 //BA.debugLineNum = 115;BA.debugLine="nitUpdate=Cursor.GetString(\"Nit\")";
parent._nitupdate = _cursor.GetString("Nit");
 //BA.debugLineNum = 116;BA.debugLine="haciendaUpdate=Cursor.GetString(\"hacienda\")";
parent._haciendaupdate = _cursor.GetString("hacienda");
 //BA.debugLineNum = 118;BA.debugLine="Log(\"NIT: \"&nitUpdate)";
parent.__c.LogImpl("657081885","NIT: "+parent._nitupdate,0);
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
 //BA.debugLineNum = 121;BA.debugLine="Log(\"NIT: \"&nit)";
parent.__c.LogImpl("657081888","NIT: "+parent._nit,0);
 if (true) break;

case 13:
//C
this.state = 16;
;
 //BA.debugLineNum = 124;BA.debugLine="Dim estado As String";
_estado = "";
 //BA.debugLineNum = 127;BA.debugLine="estado = \"N\"";
_estado = "N";
 //BA.debugLineNum = 128;BA.debugLine="GetRecordNits(Main.pDBName,estado)";
parent._getrecordnits(parent._main._pdbname /*String*/ ,_estado);
 //BA.debugLineNum = 129;BA.debugLine="GetRecordHaciendas(Main.pDBName,estado)";
parent._getrecordhaciendas(parent._main._pdbname /*String*/ ,_estado);
 //BA.debugLineNum = 130;BA.debugLine="GetRecordLabores(Main.pDBName)";
parent._getrecordlabores(parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 131;BA.debugLine="GetRecordElegasto(Main.pDBName)";
parent._getrecordelegasto(parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 132;BA.debugLine="intContadorInsumos=0";
parent._intcontadorinsumos = (int) (0);
 //BA.debugLineNum = 133;BA.debugLine="listInsumos";
parent._listinsumos();
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 //BA.debugLineNum = 135;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("657081902",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
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
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 71;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _button1addisumo_click() throws Exception{
 //BA.debugLineNum = 932;BA.debugLine="Private Sub Button1AddIsumo_Click";
 //BA.debugLineNum = 933;BA.debugLine="Try";
try { //BA.debugLineNum = 935;BA.debugLine="Button1AddIsumo=Sender";
_button1addisumo = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 936;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"INSERT INTO insumo V";
_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO insumo VALUES (?, ?, ?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__c.Null,(Object)("NO NAME"),(Object)("0"),(Object)(_idmaquina)}));
 //BA.debugLineNum = 937;BA.debugLine="intContadorInsumos=	intContadorInsumos + 1";
_intcontadorinsumos = (int) (_intcontadorinsumos+1);
 //BA.debugLineNum = 938;BA.debugLine="listInsumos";
_listinsumos();
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 940;BA.debugLine="Log(LastException)";
__c.LogImpl("659506696",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 943;BA.debugLine="End Sub";
return "";
}
public String  _can_oncanceldate() throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub can_OnCancelDate ()";
 //BA.debugLineNum = 358;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim nitUpdate As String=\"\"";
_nitupdate = "";
 //BA.debugLineNum = 3;BA.debugLine="Dim haciendaUpdate As String";
_haciendaupdate = "";
 //BA.debugLineNum = 5;BA.debugLine="Dim idMaquina As Int";
_idmaquina = 0;
 //BA.debugLineNum = 6;BA.debugLine="Dim tipo As String=\"\"";
_tipo = "";
 //BA.debugLineNum = 7;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
 //BA.debugLineNum = 11;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
 //BA.debugLineNum = 12;BA.debugLine="Dim Timepicker As Intellvold_TimePicker";
_timepicker = new lib.intellvold.datepicker.TimePicker();
 //BA.debugLineNum = 14;BA.debugLine="Dim Datepicker2 As Intellvold_DatePicker";
_datepicker2 = new lib.intellvold.datepicker.DatePicker();
 //BA.debugLineNum = 15;BA.debugLine="Dim Mycalendar2 As Intellvold_Calendar";
_mycalendar2 = new lib.intellvold.datepicker.clander();
 //BA.debugLineNum = 17;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
 //BA.debugLineNum = 18;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 20;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 22;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private SpinnerNit As Spinner";
_spinnernit = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private EditText2area As EditText";
_edittext2area = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private EditText1cmb As EditText";
_edittext1cmb = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private EditText2HoraFim As EditText";
_edittext2horafim = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private EditText1HoraInicio As EditText";
_edittext1horainicio = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private nit As String";
_nit = "";
 //BA.debugLineNum = 32;BA.debugLine="Private hacienda As String";
_hacienda = "";
 //BA.debugLineNum = 33;BA.debugLine="Private lote As String";
_lote = "";
 //BA.debugLineNum = 41;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 43;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
 //BA.debugLineNum = 44;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private Label14Add As Label";
_label14add = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private Button1AddIsumo As Button";
_button1addisumo = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private Label1RemoveInsumo As Label";
_label1removeinsumo = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private Label1Empty As Label";
_label1empty = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private Label2InsumoName As Label";
_label2insumoname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private EditText2QntInsumo As EditText";
_edittext2qntinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private Spinner1NameInsumo As Spinner";
_spinner1nameinsumo = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private intContadorInsumos As Int";
_intcontadorinsumos = 0;
 //BA.debugLineNum = 56;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 57;BA.debugLine="Private SD_xComboBoxHda As SD_xComboBox";
_sd_xcomboboxhda = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 58;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 59;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 60;BA.debugLine="Private SD_xComboBoxEleGasto As SD_xComboBox";
_sd_xcomboboxelegasto = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _configtime(String _tag) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub configTime(tag As String)";
 //BA.debugLineNum = 401;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
_datepicker.Initialize(ba,_tag,(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 402;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
_mycalendar.Initialize(ba,"dd.mm.yyyy",_mycalendar.PRC,"2.02.1990");
 //BA.debugLineNum = 403;BA.debugLine="Datepicker.SetThemeDark";
_datepicker.SetThemeDark();
 //BA.debugLineNum = 404;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
_datepicker.SetMinDate((java.util.Calendar)(_mycalendar.getObject()));
 //BA.debugLineNum = 405;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
_mycalendar.Initialize(ba,"dd.mm.yyyy",_mycalendar.PRC,"2.02.2030");
 //BA.debugLineNum = 406;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
_datepicker.SetMaxDate((java.util.Calendar)(_mycalendar.getObject()));
 //BA.debugLineNum = 407;BA.debugLine="Datepicker.CancelColor = Colors.White";
_datepicker.setCancelColor(__c.Colors.White);
 //BA.debugLineNum = 408;BA.debugLine="Datepicker.OkColor = Colors.White";
_datepicker.setOkColor(__c.Colors.White);
 //BA.debugLineNum = 409;BA.debugLine="Datepicker.Title = \"Selecione\"";
_datepicker.setTitle("Selecione");
 //BA.debugLineNum = 410;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
_datepicker.setCancelText("Cancelar");
 //BA.debugLineNum = 411;BA.debugLine="Datepicker.OkText = \"Ok\"";
_datepicker.setOkText("Ok");
 //BA.debugLineNum = 412;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
_datepicker.SetOnCancel("Cancel");
 //BA.debugLineNum = 413;BA.debugLine="Datepicker.show2(\"iki\")";
_datepicker.show2("iki");
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 578;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 579;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 580;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 581;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 582;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 583;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 315;BA.debugLine="Private Sub CreateItem As Panel";
 //BA.debugLineNum = 317;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 318;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 321;BA.debugLine="panel.LoadLayout(\"scroolUI\")";
_panel.LoadLayout("scroolUI",ba);
 //BA.debugLineNum = 323;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(_panel1geral.getHeight());
 //BA.debugLineNum = 347;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumos(int _i,int _id,String _name,String _qnt) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 203;BA.debugLine="Private Sub CreateItemInsumos(i As Int,id As Int,";
 //BA.debugLineNum = 205;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 206;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 450dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (450)));
 //BA.debugLineNum = 208;BA.debugLine="panel.LoadLayout(\"Cardisumo\")";
_panel.LoadLayout("Cardisumo",ba);
 //BA.debugLineNum = 211;BA.debugLine="EditText2QntInsumo.Color=Colors.Transparent";
_edittext2qntinsumo.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 212;BA.debugLine="Label2InsumoName.Text=\"Insumo #\"&i";
_label2insumoname.setText(BA.ObjectToCharSequence("Insumo #"+BA.NumberToString(_i)));
 //BA.debugLineNum = 213;BA.debugLine="Label1RemoveInsumo.Tag=id";
_label1removeinsumo.setTag((Object)(_id));
 //BA.debugLineNum = 214;BA.debugLine="Spinner1NameInsumo.Tag=id";
_spinner1nameinsumo.setTag((Object)(_id));
 //BA.debugLineNum = 215;BA.debugLine="EditText2QntInsumo.Tag=id";
_edittext2qntinsumo.setTag((Object)(_id));
 //BA.debugLineNum = 216;BA.debugLine="EditText2QntInsumo.text=qnt";
_edittext2qntinsumo.setText(BA.ObjectToCharSequence(_qnt));
 //BA.debugLineNum = 217;BA.debugLine="Spinner1NameInsumo.Prompt=name";
_spinner1nameinsumo.setPrompt(BA.ObjectToCharSequence(_name));
 //BA.debugLineNum = 218;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(_panel1geral.getHeight());
 //BA.debugLineNum = 220;BA.debugLine="FillSpinner(name)";
_fillspinner(_name);
 //BA.debugLineNum = 235;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.dbrequestmanager  _createrequest(String _db) throws Exception{
b4a.example.ef.dbrequestmanager _req = null;
 //BA.debugLineNum = 572;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
 //BA.debugLineNum = 573;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 574;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" &  Main.p";
_req._initialize /*String*/ (ba,this,_rdclink+"?DBName="+_main._pdbname /*String*/ );
 //BA.debugLineNum = 575;BA.debugLine="Return Req";
if (true) return _req;
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
 //BA.debugLineNum = 353;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
_label10.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
 //BA.debugLineNum = 354;BA.debugLine="Label10.TextColor=Colors.Black";
_label10.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(String _nombre) throws Exception{
 //BA.debugLineNum = 507;BA.debugLine="Sub DeleteRecord (Nombre As String)";
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return "";
}
public String  _edittext2qntinsumo_textchanged(String _old,String _new) throws Exception{
int _id = 0;
 //BA.debugLineNum = 968;BA.debugLine="Private Sub EditText2QntInsumo_TextChanged (Old As";
 //BA.debugLineNum = 969;BA.debugLine="Try";
try { //BA.debugLineNum = 970;BA.debugLine="EditText2QntInsumo=Sender";
_edittext2qntinsumo = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)));
 //BA.debugLineNum = 972;BA.debugLine="Dim id As Int=EditText2QntInsumo.Tag";
_id = (int)(BA.ObjectToNumber(_edittext2qntinsumo.getTag()));
 //BA.debugLineNum = 973;BA.debugLine="Starter.updateInsumo(\"\",EditText2QntInsumo.text,";
_starter._updateinsumo /*String*/ ("",_edittext2qntinsumo.getText(),_id,BA.NumberToString(_idmaquina));
 //BA.debugLineNum = 974;BA.debugLine="selectSQl(id)";
_selectsql(_id);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 977;BA.debugLine="Log(LastException)";
__c.LogImpl("659637769",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 979;BA.debugLine="End Sub";
return "";
}
public void  _fillspinner(String _name) throws Exception{
ResumableSub_FillSpinner rsub = new ResumableSub_FillSpinner(this,_name);
rsub.resume(ba, null);
}
public static class ResumableSub_FillSpinner extends BA.ResumableSub {
public ResumableSub_FillSpinner(b4a.example.ef.form parent,String _name) {
this.parent = parent;
this._name = _name;
}
b4a.example.ef.form parent;
String _name;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
int step5;
int limit5;
int step15;
int limit15;

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
 //BA.debugLineNum = 240;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 17;
this.catchState = 16;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 16;
 //BA.debugLineNum = 241;BA.debugLine="Spinner1NameInsumo.Clear";
parent._spinner1nameinsumo.Clear();
 //BA.debugLineNum = 243;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 245;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM n";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM namesinsumo where name='"+_name+"'")));
 //BA.debugLineNum = 247;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 4:
//for
this.state = 7;
step5 = 1;
limit5 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 7;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 6;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step5)) ;
if (true) break;

case 6:
//C
this.state = 19;
 //BA.debugLineNum = 248;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
 //BA.debugLineNum = 249;BA.debugLine="Log(Cursor.GetString(\"name\"))";
parent.__c.LogImpl("657344010",_cursor.GetString("name"),0);
 //BA.debugLineNum = 250;BA.debugLine="Spinner1NameInsumo.Add(Cursor.GetString(\"name\")";
parent._spinner1nameinsumo.Add(_cursor.GetString("name"));
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 253;BA.debugLine="If name=\"NO NAME\" Then";

case 7:
//if
this.state = 10;
if ((_name).equals("NO NAME")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 254;BA.debugLine="Spinner1NameInsumo.Add(\"\")";
parent._spinner1nameinsumo.Add("");
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 256;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 259;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM n";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM namesinsumo")));
 //BA.debugLineNum = 260;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 11:
//for
this.state = 14;
step15 = 1;
limit15 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 14;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 13;
if (true) break;

case 21:
//C
this.state = 20;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 13:
//C
this.state = 21;
 //BA.debugLineNum = 261;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
 //BA.debugLineNum = 263;BA.debugLine="Spinner1NameInsumo.Add(Cursor.GetString(\"name\")";
parent._spinner1nameinsumo.Add(_cursor.GetString("name"));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
 //BA.debugLineNum = 266;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("657344027",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 17:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 268;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,this,(int) (20));
this.state = 22;
return;
case 22:
//C
this.state = -1;
;
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
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
public void  _getrecordelegasto(String _usedb) throws Exception{
ResumableSub_GetRecordElegasto rsub = new ResumableSub_GetRecordElegasto(this,_usedb);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordElegasto extends BA.ResumableSub {
public ResumableSub_GetRecordElegasto(b4a.example.ef.form parent,String _usedb) {
this.parent = parent;
this._usedb = _usedb;
}
b4a.example.ef.form parent;
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
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;
Object[] group14;
int index14;
int groupLen14;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 852;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 853;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_eleg";
_cmd = parent._createcommand("select_elegasto",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 855;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 856;BA.debugLine="Dim separador As String";
_separador = "";
 //BA.debugLineNum = 857;BA.debugLine="Dim longitud As Int";
_longitud = 0;
 //BA.debugLineNum = 859;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 860;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 861;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 862;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 865;BA.debugLine="SD_xComboBoxEleGasto.Add(\"----Select----\",1)";
parent._sd_xcomboboxelegasto._add /*String*/ ("----Select----",(Object)(1));
 //BA.debugLineNum = 866;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 11;
group11 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index11 < groupLen11) {
this.state = 6;
_row = (Object[])(group11.Get(index11));}
if (true) break;

case 18:
//C
this.state = 17;
index11++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 867;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 868;BA.debugLine="separador=\" - \"";
_separador = " - ";
 //BA.debugLineNum = 869;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group14 = _row;
index14 = 0;
groupLen14 = group14.length;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index14 < groupLen14) {
this.state = 9;
_record = group14[index14];}
if (true) break;

case 20:
//C
this.state = 19;
index14++;
if (true) break;

case 9:
//C
this.state = 20;
 //BA.debugLineNum = 870;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
 //BA.debugLineNum = 872;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
 //BA.debugLineNum = 873;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
 //BA.debugLineNum = 874;BA.debugLine="SD_xComboBoxEleGasto.Add(cadena,1)";
parent._sd_xcomboboxelegasto._add /*String*/ (_cadena,(Object)(1));
 //BA.debugLineNum = 875;BA.debugLine="cadena=\"\"";
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
 //BA.debugLineNum = 879;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("659113500","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 881;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 882;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.ef.httpjob _j) throws Exception{
}
public void  _req_result(b4a.example.ef.main._dbresult _res) throws Exception{
}
public void  _getrecordhaciendas(String _usedb,String _estado) throws Exception{
ResumableSub_GetRecordHaciendas rsub = new ResumableSub_GetRecordHaciendas(this,_usedb,_estado);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordHaciendas extends BA.ResumableSub {
public ResumableSub_GetRecordHaciendas(b4a.example.ef.form parent,String _usedb,String _estado) {
this.parent = parent;
this._usedb = _usedb;
this._estado = _estado;
}
b4a.example.ef.form parent;
String _usedb;
String _estado;
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
anywheresoftware.b4a.BA.IterableList group12;
int index12;
int groupLen12;
Object[] group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 679;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 680;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = parent._createcommand("select_haciendas",new Object[]{(Object)(_estado)});
 //BA.debugLineNum = 682;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 683;BA.debugLine="Dim separador As String";
_separador = "";
 //BA.debugLineNum = 684;BA.debugLine="Dim longitud As Int";
_longitud = 0;
 //BA.debugLineNum = 686;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 687;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 688;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 689;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 693;BA.debugLine="SD_xComboBoxHda.Add(\"----Select----\",1)";
parent._sd_xcomboboxhda._add /*String*/ ("----Select----",(Object)(1));
 //BA.debugLineNum = 694;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\",1)";
parent._sd_xcomboboxlote._add /*String*/ ("----Select----",(Object)(1));
 //BA.debugLineNum = 695;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 17;
group12 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index12 = 0;
groupLen12 = group12.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 17;
if (index12 < groupLen12) {
this.state = 6;
_row = (Object[])(group12.Get(index12));}
if (true) break;

case 24:
//C
this.state = 23;
index12++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 696;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 697;BA.debugLine="separador=\" - \"";
_separador = " - ";
 //BA.debugLineNum = 698;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group15 = _row;
index15 = 0;
groupLen15 = group15.length;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 10;
if (index15 < groupLen15) {
this.state = 9;
_record = group15[index15];}
if (true) break;

case 26:
//C
this.state = 25;
index15++;
if (true) break;

case 9:
//C
this.state = 26;
 //BA.debugLineNum = 699;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 704;BA.debugLine="Log(\"cadena: \"&cadena)";
parent.__c.LogImpl("658720282","cadena: "+_cadena,0);
 //BA.debugLineNum = 705;BA.debugLine="Log(\"hacienda: \"&haciendaUpdate)";
parent.__c.LogImpl("658720283","hacienda: "+parent._haciendaupdate,0);
 //BA.debugLineNum = 706;BA.debugLine="If cadena.Contains(haciendaUpdate) Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_cadena.contains(parent._haciendaupdate)) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 //BA.debugLineNum = 707;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
 //BA.debugLineNum = 708;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
 //BA.debugLineNum = 709;BA.debugLine="SD_xComboBoxHda.Add(cadena,1)";
parent._sd_xcomboboxhda._add /*String*/ (_cadena,(Object)(1));
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 711;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
 //BA.debugLineNum = 712;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
 //BA.debugLineNum = 713;BA.debugLine="SD_xComboBoxHda.Add(cadena,1)";
parent._sd_xcomboboxhda._add /*String*/ (_cadena,(Object)(1));
 if (true) break;

case 16:
//C
this.state = 24;
;
 //BA.debugLineNum = 716;BA.debugLine="cadena=\"\"";
_cadena = "";
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
 //BA.debugLineNum = 720;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("658720298","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 722;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 723;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordlabores(String _usedb) throws Exception{
ResumableSub_GetRecordLabores rsub = new ResumableSub_GetRecordLabores(this,_usedb);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordLabores extends BA.ResumableSub {
public ResumableSub_GetRecordLabores(b4a.example.ef.form parent,String _usedb) {
this.parent = parent;
this._usedb = _usedb;
}
b4a.example.ef.form parent;
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
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;
Object[] group14;
int index14;
int groupLen14;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 818;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 819;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = parent._createcommand("select_labores",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 821;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 822;BA.debugLine="Dim separador As String";
_separador = "";
 //BA.debugLineNum = 823;BA.debugLine="Dim longitud As Int";
_longitud = 0;
 //BA.debugLineNum = 825;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 826;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 827;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 828;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 831;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\",1)";
parent._sd_xcomboboxlabor._add /*String*/ ("----Select----",(Object)(1));
 //BA.debugLineNum = 833;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 11;
group11 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index11 < groupLen11) {
this.state = 6;
_row = (Object[])(group11.Get(index11));}
if (true) break;

case 18:
//C
this.state = 17;
index11++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 834;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 835;BA.debugLine="separador=\" - \"";
_separador = " - ";
 //BA.debugLineNum = 836;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group14 = _row;
index14 = 0;
groupLen14 = group14.length;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index14 < groupLen14) {
this.state = 9;
_record = group14[index14];}
if (true) break;

case 20:
//C
this.state = 19;
index14++;
if (true) break;

case 9:
//C
this.state = 20;
 //BA.debugLineNum = 837;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
 //BA.debugLineNum = 839;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
 //BA.debugLineNum = 840;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
 //BA.debugLineNum = 841;BA.debugLine="SD_xComboBoxLabor.Add(cadena,1)";
parent._sd_xcomboboxlabor._add /*String*/ (_cadena,(Object)(1));
 //BA.debugLineNum = 842;BA.debugLine="cadena=\"\"";
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
 //BA.debugLineNum = 846;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("659047965","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 848;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 849;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordlotes(String _usedb,String _nitlote,String _hda) throws Exception{
ResumableSub_GetRecordLotes rsub = new ResumableSub_GetRecordLotes(this,_usedb,_nitlote,_hda);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordLotes extends BA.ResumableSub {
public ResumableSub_GetRecordLotes(b4a.example.ef.form parent,String _usedb,String _nitlote,String _hda) {
this.parent = parent;
this._usedb = _usedb;
this._nitlote = _nitlote;
this._hda = _hda;
}
b4a.example.ef.form parent;
String _usedb;
String _nitlote;
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 742;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 743;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(_nitlote),(Object)(_hda)});
 //BA.debugLineNum = 745;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 746;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 747;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 748;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 749;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 753;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 754;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 755;BA.debugLine="For Each record As Object In row";
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
 //BA.debugLineNum = 756;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
 //BA.debugLineNum = 757;BA.debugLine="SD_xComboBoxLote.Add(cadena,1)";
parent._sd_xcomboboxlote._add /*String*/ (_cadena,(Object)(1));
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
 //BA.debugLineNum = 764;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("658851351","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 766;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 767;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordlotesarea(String _usedb,String _nitlote,String _hda,String _lotearea) throws Exception{
ResumableSub_GetRecordLotesArea rsub = new ResumableSub_GetRecordLotesArea(this,_usedb,_nitlote,_hda,_lotearea);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordLotesArea extends BA.ResumableSub {
public ResumableSub_GetRecordLotesArea(b4a.example.ef.form parent,String _usedb,String _nitlote,String _hda,String _lotearea) {
this.parent = parent;
this._usedb = _usedb;
this._nitlote = _nitlote;
this._hda = _hda;
this._lotearea = _lotearea;
}
b4a.example.ef.form parent;
String _usedb;
String _nitlote;
String _hda;
String _lotearea;
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 785;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 786;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_Area";
_cmd = parent._createcommand("select_AreaSuertes",new Object[]{(Object)(_nitlote),(Object)(_hda),(Object)(_lotearea)});
 //BA.debugLineNum = 788;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 790;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 791;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 792;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 793;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 797;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 798;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 799;BA.debugLine="For Each record As Object In row";
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
 //BA.debugLineNum = 800;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
 //BA.debugLineNum = 802;BA.debugLine="EditText2HoraFim.Text=cadena";
parent._edittext2horafim.setText(BA.ObjectToCharSequence(_cadena));
 //BA.debugLineNum = 803;BA.debugLine="EditText2HoraFim.Enabled =False";
parent._edittext2horafim.setEnabled(parent.__c.False);
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
 //BA.debugLineNum = 811;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("658982427","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 813;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 814;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordnits(String _usedb,String _estado) throws Exception{
ResumableSub_GetRecordNits rsub = new ResumableSub_GetRecordNits(this,_usedb,_estado);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordNits extends BA.ResumableSub {
public ResumableSub_GetRecordNits(b4a.example.ef.form parent,String _usedb,String _estado) {
this.parent = parent;
this._usedb = _usedb;
this._estado = _estado;
}
b4a.example.ef.form parent;
String _usedb;
String _estado;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _cadena = "";
String _separador = "";
int _longitud = 0;
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
int _intregistros = 0;
Object[] _row = null;
Object _record = null;
anywheresoftware.b4a.BA.IterableList group13;
int index13;
int groupLen13;
Object[] group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 631;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 632;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = parent._createcommand("select_nit",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 634;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 635;BA.debugLine="Dim separador As String";
_separador = "";
 //BA.debugLineNum = 636;BA.debugLine="Dim longitud As Int";
_longitud = 0;
 //BA.debugLineNum = 638;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 639;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 641;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 642;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 645;BA.debugLine="SD_xComboBoxNit.Add(\"----Select----\",\"1\")";
parent._sd_xcomboboxnit._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 646;BA.debugLine="Dim INTRegistros As Int";
_intregistros = 0;
 //BA.debugLineNum = 648;BA.debugLine="INTRegistros=0";
_intregistros = (int) (0);
 //BA.debugLineNum = 649;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 17;
group13 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index13 = 0;
groupLen13 = group13.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 17;
if (index13 < groupLen13) {
this.state = 6;
_row = (Object[])(group13.Get(index13));}
if (true) break;

case 24:
//C
this.state = 23;
index13++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 650;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 651;BA.debugLine="separador=\" - \"";
_separador = " - ";
 //BA.debugLineNum = 652;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group16 = _row;
index16 = 0;
groupLen16 = group16.length;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 10;
if (index16 < groupLen16) {
this.state = 9;
_record = group16[index16];}
if (true) break;

case 26:
//C
this.state = 25;
index16++;
if (true) break;

case 9:
//C
this.state = 26;
 //BA.debugLineNum = 654;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 656;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
 //BA.debugLineNum = 657;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
 //BA.debugLineNum = 658;BA.debugLine="INTRegistros=INTRegistros+1";
_intregistros = (int) (_intregistros+1);
 //BA.debugLineNum = 659;BA.debugLine="If nitUpdate=cadena Then";
if (true) break;

case 11:
//if
this.state = 16;
if ((parent._nitupdate).equals(_cadena)) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 //BA.debugLineNum = 660;BA.debugLine="Log(\"NIT: \"&nitUpdate)";
parent.__c.LogImpl("658654750","NIT: "+parent._nitupdate,0);
 //BA.debugLineNum = 663;BA.debugLine="SD_xComboBoxNit.Add(nitUpdate,INTRegistros)";
parent._sd_xcomboboxnit._add /*String*/ (parent._nitupdate,(Object)(_intregistros));
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 665;BA.debugLine="SD_xComboBoxNit.Add(cadena,INTRegistros)";
parent._sd_xcomboboxnit._add /*String*/ (_cadena,(Object)(_intregistros));
 //BA.debugLineNum = 666;BA.debugLine="cadena=\"\"";
_cadena = "";
 if (true) break;

case 16:
//C
this.state = 24;
;
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
 //BA.debugLineNum = 672;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("658654762","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 674;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 675;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getvaluesintheedittexts() throws Exception{
ResumableSub_getValuesINTheEdittexts rsub = new ResumableSub_getValuesINTheEdittexts(this);
rsub.resume(ba, null);
}
public static class ResumableSub_getValuesINTheEdittexts extends BA.ResumableSub {
public ResumableSub_getValuesINTheEdittexts(b4a.example.ef.form parent) {
this.parent = parent;
}
b4a.example.ef.form parent;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
int step6;
int limit6;
int step16;
int limit16;

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
 //BA.debugLineNum = 422;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 423;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 424;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
 //BA.debugLineNum = 425;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 426;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM i";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where idmaquina ="+BA.NumberToString(parent._idmaquina))));
 //BA.debugLineNum = 427;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 6:
//C
this.state = 16;
 //BA.debugLineNum = 428;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
 //BA.debugLineNum = 429;BA.debugLine="Log(\"=====ITEM #\"&i&\"=====\")";
parent.__c.LogImpl("657999368","=====ITEM #"+BA.NumberToString(_i)+"=====",0);
 //BA.debugLineNum = 430;BA.debugLine="Log(Cursor.GetString(\"idmaquina\"))";
parent.__c.LogImpl("657999369",_cursor.GetString("idmaquina"),0);
 //BA.debugLineNum = 431;BA.debugLine="Log(Cursor.GetString(\"name\")&\"--\"&Cursor.GetStri";
parent.__c.LogImpl("657999370",_cursor.GetString("name")+"--"+_cursor.GetString("qnt"),0);
 //BA.debugLineNum = 432;BA.debugLine="sb.Append(Cursor.GetString(\"name\")&\"--\"&Cursor.G";
_sb.Append(_cursor.GetString("name")+"--"+_cursor.GetString("qnt")).Append(parent.__c.CRLF);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 435;BA.debugLine="Log(sb.ToString)";
parent.__c.LogImpl("657999374",_sb.ToString(),0);
 //BA.debugLineNum = 437;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 438;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM m";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina")));
 //BA.debugLineNum = 439;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 8:
//for
this.state = 11;
step16 = 1;
limit16 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 10;
if (true) break;

case 18:
//C
this.state = 17;
_i = ((int)(0 + _i + step16)) ;
if (true) break;

case 10:
//C
this.state = 18;
 //BA.debugLineNum = 440;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
 //BA.debugLineNum = 441;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
parent.__c.LogImpl("657999380","=====Maquinas #"+BA.NumberToString(_i)+"=====",0);
 //BA.debugLineNum = 442;BA.debugLine="Log(Cursor.GetString(\"id\"))'&\"--\"&Cursor.GetStr";
parent.__c.LogImpl("657999381",_cursor.GetString("id"),0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
 //BA.debugLineNum = 445;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"ListDad";
parent._b4xpages._showpageandremovepreviouspages /*String*/ (ba,"ListDados");
 //BA.debugLineNum = 446;BA.debugLine="B4XPages.ClosePage(Me)";
parent._b4xpages._closepage /*String*/ (ba,parent);
 //BA.debugLineNum = 447;BA.debugLine="B4XPage_Created(Root)";
parent._b4xpage_created(parent._root);
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 //BA.debugLineNum = 449;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("657999388",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 451;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,this,(int) (20));
this.state = 19;
return;
case 19:
//C
this.state = -1;
;
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
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
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 65;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public void  _insertrecord(String _usedb,String _nombre,int _salario) throws Exception{
ResumableSub_InsertRecord rsub = new ResumableSub_InsertRecord(this,_usedb,_nombre,_salario);
rsub.resume(ba, null);
}
public static class ResumableSub_InsertRecord extends BA.ResumableSub {
public ResumableSub_InsertRecord(b4a.example.ef.form parent,String _usedb,String _nombre,int _salario) {
this.parent = parent;
this._usedb = _usedb;
this._nombre = _nombre;
this._salario = _salario;
}
b4a.example.ef.form parent;
String _usedb;
String _nombre;
int _salario;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 495;BA.debugLine="Dim req As DBRequestManager = CreateRequest(Us";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 496;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_tipo";
_cmd = parent._createcommand("insert_tipoReparacion",new Object[]{(Object)(_nombre),(Object)(_salario)});
 //BA.debugLineNum = 498;BA.debugLine="Dim j As HttpJob = req.ExecuteCommand(cmd, Nul";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 499;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 500;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 501;BA.debugLine="Log(\"Inserted successfully!\")";
parent.__c.LogImpl("658195975","Inserted successfully!",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 503;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _label10_click() throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Private Sub Label10_Click";
 //BA.debugLineNum = 378;BA.debugLine="Panel9_Click";
_panel9_click();
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click() throws Exception{
 //BA.debugLineNum = 541;BA.debugLine="Private Sub Label13Time_Click";
 //BA.debugLineNum = 542;BA.debugLine="configTime(\"Label13Time\")";
_configtime("Label13Time");
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return "";
}
public String  _label13time_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
 //BA.debugLineNum = 545;BA.debugLine="Sub Label13Time_OnDateSet(year As Int ,monthOfYear";
 //BA.debugLineNum = 546;BA.debugLine="Label13Time.Text=year&\"/\"&(NumberFormat(monthOfYe";
_label13time.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
 //BA.debugLineNum = 547;BA.debugLine="Label13Time.TextColor=Colors.Black";
_label13time.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 548;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click() throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="Private Sub Label1Back_Click";
 //BA.debugLineNum = 419;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return "";
}
public String  _label1removeinsumo_click() throws Exception{
int _id = 0;
 //BA.debugLineNum = 945;BA.debugLine="Private Sub Label1RemoveInsumo_Click";
 //BA.debugLineNum = 946;BA.debugLine="Label1RemoveInsumo=Sender";
_label1removeinsumo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 947;BA.debugLine="Log(Label1RemoveInsumo.Tag)";
__c.LogImpl("659572226",BA.ObjectToString(_label1removeinsumo.getTag()),0);
 //BA.debugLineNum = 948;BA.debugLine="Dim id As Int=Label1RemoveInsumo.Tag";
_id = (int)(BA.ObjectToNumber(_label1removeinsumo.getTag()));
 //BA.debugLineNum = 949;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from insumo wh";
_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE from insumo where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
 //BA.debugLineNum = 950;BA.debugLine="listInsumos";
_listinsumos();
 //BA.debugLineNum = 951;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click() throws Exception{
String _salario = "";
 //BA.debugLineNum = 467;BA.debugLine="Private Sub Label2Save_Click";
 //BA.debugLineNum = 469;BA.debugLine="Try";
try { //BA.debugLineNum = 470;BA.debugLine="Dim salario As String";
_salario = "";
 //BA.debugLineNum = 471;BA.debugLine="salario=\"10\"";
_salario = "10";
 //BA.debugLineNum = 472;BA.debugLine="InsertRecord(Main.pDBName ,\"99\",salario)";
_insertrecord(_main._pdbname /*String*/ ,"99",(int)(Double.parseDouble(_salario)));
 //BA.debugLineNum = 475;BA.debugLine="Log(Label10.text&\"----\"&Label13Time.text)";
__c.LogImpl("658130440",_label10.getText()+"----"+_label13time.getText(),0);
 //BA.debugLineNum = 476;BA.debugLine="Log(\"HACIENDA: \"&haciendaUpdate)";
__c.LogImpl("658130441","HACIENDA: "+_haciendaupdate,0);
 //BA.debugLineNum = 477;BA.debugLine="If tipo=\"new\" Then";
if ((_tipo).equals("new")) { 
 }else {
 //BA.debugLineNum = 484;BA.debugLine="Log(\"update\")";
__c.LogImpl("658130449","update",0);
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 488;BA.debugLine="Log(LastException)";
__c.LogImpl("658130453",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
return "";
}
public String  _listinsumos() throws Exception{
int _numberofmatches = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
int _id = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 143;BA.debugLine="Sub listInsumos";
 //BA.debugLineNum = 144;BA.debugLine="removeAllExcelpFist";
_removeallexcelpfist();
 //BA.debugLineNum = 147;BA.debugLine="Dim NumberOfMatches As Int";
_numberofmatches = 0;
 //BA.debugLineNum = 148;BA.debugLine="NumberOfMatches = Starter.SQL1.ExecQuerySingleRes";
_numberofmatches = (int)(Double.parseDouble(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM insumo where idmaquina ="+BA.NumberToString(_idmaquina))));
 //BA.debugLineNum = 149;BA.debugLine="CustomListView1Geral.DesignerLabel.Height=8dip";
_customlistview1geral._designerlabel.setHeight(__c.DipToCurrent((int) (8)));
 //BA.debugLineNum = 150;BA.debugLine="CustomListView1Geral.AddTextItem(\"Insumos(\"&Numbe";
_customlistview1geral._addtextitem((Object)("Insumos("+BA.NumberToString(_numberofmatches)+")"),(Object)("title"));
 //BA.debugLineNum = 151;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 152;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM in";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where idmaquina ="+BA.NumberToString(_idmaquina))));
 //BA.debugLineNum = 153;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step8 = 1;
final int limit8 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 154;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
 //BA.debugLineNum = 155;BA.debugLine="Dim	id As Int=Cursor.GetString(\"id\")";
_id = (int)(Double.parseDouble(_cursor.GetString("id")));
 //BA.debugLineNum = 156;BA.debugLine="Log(Cursor.GetString(\"id\"))";
__c.LogImpl("657147405",_cursor.GetString("id"),0);
 //BA.debugLineNum = 157;BA.debugLine="Log(Cursor.GetString(\"name\"))";
__c.LogImpl("657147406",_cursor.GetString("name"),0);
 //BA.debugLineNum = 158;BA.debugLine="Log(Cursor.GetString(\"qnt\"))";
__c.LogImpl("657147407",_cursor.GetString("qnt"),0);
 //BA.debugLineNum = 159;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumos(i+1,i";
_customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createiteminsumos((int) (_i+1),_id,_cursor.GetString("name"),_cursor.GetString("qnt")).getObject())),(Object)("insumo"));
 }
};
 //BA.debugLineNum = 163;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 164;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 166;BA.debugLine="panel.LoadLayout(\"emptyInsumos\")";
_panel.LoadLayout("emptyInsumos",ba);
 //BA.debugLineNum = 167;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(_panel1geral.getHeight());
 //BA.debugLineNum = 168;BA.debugLine="If i=0 Then";
if (_i==0) { 
 //BA.debugLineNum = 169;BA.debugLine="Label1Empty.Visible=True";
_label1empty.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 171;BA.debugLine="Label1Empty.Visible=False";
_label1empty.setVisible(__c.False);
 //BA.debugLineNum = 172;BA.debugLine="Button1AddIsumo.Top=Label1Empty.top";
_button1addisumo.setTop(_label1empty.getTop());
 //BA.debugLineNum = 173;BA.debugLine="panel.Height=Button1AddIsumo.Height";
_panel.setHeight(_button1addisumo.getHeight());
 };
 //BA.debugLineNum = 178;BA.debugLine="CustomListView1Geral.Add(panel,0)";
_customlistview1geral._add(_panel,(Object)(0));
 //BA.debugLineNum = 179;BA.debugLine="CustomListView1Geral.ScrollToItem(CustomListView1";
_customlistview1geral._scrolltoitem((int) (_customlistview1geral._getsize()-1));
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click() throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Private Sub Panel10Horainicio_Click";
 //BA.debugLineNum = 386;BA.debugLine="configTime(\"TimeInicio\")";
_configtime("TimeInicio");
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click() throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Private Sub Panel11horaFim_Click";
 //BA.debugLineNum = 382;BA.debugLine="configTime(\"TimeFim\")";
_configtime("TimeFim");
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click() throws Exception{
 //BA.debugLineNum = 521;BA.debugLine="Private Sub Panel2Time_Click";
 //BA.debugLineNum = 522;BA.debugLine="configTime(\"Label13Time\")";
_configtime("Label13Time");
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click() throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Private Sub Panel9_Click";
 //BA.debugLineNum = 362;BA.debugLine="Datepicker.Initialize(\"Date\",2023 ,DateTime.GetMo";
_datepicker.Initialize(ba,"Date",(int) (2023),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 363;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
_mycalendar.Initialize(ba,"dd.mm.yyyy",_mycalendar.PRC,"2.02.2023");
 //BA.debugLineNum = 364;BA.debugLine="Datepicker.SetThemeDark";
_datepicker.SetThemeDark();
 //BA.debugLineNum = 365;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
_datepicker.SetMinDate((java.util.Calendar)(_mycalendar.getObject()));
 //BA.debugLineNum = 366;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
_mycalendar.Initialize(ba,"dd.mm.yyyy",_mycalendar.PRC,"2.12.2025");
 //BA.debugLineNum = 367;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
_datepicker.SetMaxDate((java.util.Calendar)(_mycalendar.getObject()));
 //BA.debugLineNum = 368;BA.debugLine="Datepicker.CancelColor = Colors.White";
_datepicker.setCancelColor(__c.Colors.White);
 //BA.debugLineNum = 369;BA.debugLine="Datepicker.OkColor = Colors.White";
_datepicker.setOkColor(__c.Colors.White);
 //BA.debugLineNum = 370;BA.debugLine="Datepicker.Title = \"Selecione\"";
_datepicker.setTitle("Selecione");
 //BA.debugLineNum = 371;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
_datepicker.setCancelText("Cancelar");
 //BA.debugLineNum = 372;BA.debugLine="Datepicker.OkText = \"Ok\"";
_datepicker.setOkText("Ok");
 //BA.debugLineNum = 373;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
_datepicker.SetOnCancel("Cancel");
 //BA.debugLineNum = 374;BA.debugLine="Datepicker.show2(\"iki\")";
_datepicker.show2("iki");
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return "";
}
public String  _removeallexcelpfist() throws Exception{
int _iw = 0;
 //BA.debugLineNum = 186;BA.debugLine="Sub removeAllExcelpFist";
 //BA.debugLineNum = 187;BA.debugLine="For iw= CustomListView1Geral.Size-1 To  1 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_iw = (int) (_customlistview1geral._getsize()-1) ;
for (;_iw >= limit1 ;_iw = _iw + step1 ) {
 //BA.debugLineNum = 189;BA.debugLine="If CustomListView1Geral.GetValue(iw)<>\"form1\" Th";
if ((_customlistview1geral._getvalue(_iw)).equals((Object)("form1")) == false) { 
 //BA.debugLineNum = 190;BA.debugLine="Try";
try { //BA.debugLineNum = 192;BA.debugLine="LogColor(\"REMOVE: \"&iw,Colors.Red)";
__c.LogImpl("657212934","REMOVE: "+BA.NumberToString(_iw),__c.Colors.Red);
 //BA.debugLineNum = 193;BA.debugLine="CustomListView1Geral.RemoveAt(iw)";
_customlistview1geral._removeat(_iw);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 196;BA.debugLine="Log(LastException)";
__c.LogImpl("657212938",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
 }
};
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxhda_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 725;BA.debugLine="Sub SD_xComboBoxHda_ItemClick (Position As Int, Va";
 //BA.debugLineNum = 728;BA.debugLine="Log(Value)";
__c.LogImpl("658785795",BA.ObjectToString(_value),0);
 //BA.debugLineNum = 730;BA.debugLine="SD_xComboBoxLote.Clear";
_sd_xcomboboxlote._clear /*String*/ ();
 //BA.debugLineNum = 733;BA.debugLine="nit = \"800246222\"";
_nit = "800246222";
 //BA.debugLineNum = 734;BA.debugLine="haciendaUpdate = Value";
_haciendaupdate = BA.ObjectToString(_value);
 //BA.debugLineNum = 735;BA.debugLine="hacienda = SD_xComboBoxHda.GetItem(Position)";
_hacienda = _sd_xcomboboxhda._getitem /*String*/ (_position);
 //BA.debugLineNum = 736;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
_hacienda = _hacienda.substring((int) (0),(int) (3));
 //BA.debugLineNum = 737;BA.debugLine="Log(hacienda)";
__c.LogImpl("658785804",_hacienda,0);
 //BA.debugLineNum = 738;BA.debugLine="GetRecordLotes (Main.pDBName,Main.pNit, hacienda)";
_getrecordlotes(_main._pdbname /*String*/ ,_main._pnit /*String*/ ,_hacienda);
 //BA.debugLineNum = 739;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 893;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
 //BA.debugLineNum = 895;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 770;BA.debugLine="Sub SD_xComboBoxLote_ItemClick (Position As Int, V";
 //BA.debugLineNum = 776;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("658916870",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
 //BA.debugLineNum = 778;BA.debugLine="lote = Value";
_lote = BA.ObjectToString(_value);
 //BA.debugLineNum = 780;BA.debugLine="Log(hacienda)";
__c.LogImpl("658916874",_hacienda,0);
 //BA.debugLineNum = 781;BA.debugLine="GetRecordLotesArea (Main.pDBName,nit, hacienda,lo";
_getrecordlotesarea(_main._pdbname /*String*/ ,_nit,_hacienda,_lote);
 //BA.debugLineNum = 782;BA.debugLine="End Sub";
return "";
}
public void  _selectsql(int _id) throws Exception{
ResumableSub_selectSQl rsub = new ResumableSub_selectSQl(this,_id);
rsub.resume(ba, null);
}
public static class ResumableSub_selectSQl extends BA.ResumableSub {
public ResumableSub_selectSQl(b4a.example.ef.form parent,int _id) {
this.parent = parent;
this._id = _id;
}
b4a.example.ef.form parent;
int _id;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
int step4;
int limit4;

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
 //BA.debugLineNum = 983;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 //BA.debugLineNum = 984;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 985;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM in";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where id="+BA.NumberToString(_id))));
 //BA.debugLineNum = 986;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 4:
//for
this.state = 7;
step4 = 1;
limit4 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 7;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 6;
if (true) break;

case 12:
//C
this.state = 11;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 6:
//C
this.state = 12;
 //BA.debugLineNum = 987;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
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
this.catchState = 0;
 //BA.debugLineNum = 995;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("659703309",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 997;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,this,(int) (20));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
 //BA.debugLineNum = 999;BA.debugLine="End Sub";
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
public String  _spinner1nameinsumo_itemclick(int _position,Object _value) throws Exception{
int _id = 0;
 //BA.debugLineNum = 1001;BA.debugLine="Private Sub Spinner1NameInsumo_ItemClick (Position";
 //BA.debugLineNum = 1002;BA.debugLine="Spinner1NameInsumo=Sender";
_spinner1nameinsumo = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(__c.Sender(ba)));
 //BA.debugLineNum = 1003;BA.debugLine="Log(Spinner1NameInsumo.Tag)";
__c.LogImpl("659768834",BA.ObjectToString(_spinner1nameinsumo.getTag()),0);
 //BA.debugLineNum = 1004;BA.debugLine="Log(Spinner1NameInsumo.SelectedItem)";
__c.LogImpl("659768835",_spinner1nameinsumo.getSelectedItem(),0);
 //BA.debugLineNum = 1005;BA.debugLine="Dim id As Int=Spinner1NameInsumo.Tag";
_id = (int)(BA.ObjectToNumber(_spinner1nameinsumo.getTag()));
 //BA.debugLineNum = 1006;BA.debugLine="Starter.updateInsumo(Spinner1NameInsumo.SelectedI";
_starter._updateinsumo /*String*/ (_spinner1nameinsumo.getSelectedItem(),"",_id,BA.NumberToString(_idmaquina));
 //BA.debugLineNum = 1007;BA.debugLine="selectSQl(id)";
_selectsql(_id);
 //BA.debugLineNum = 1008;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 897;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
 //BA.debugLineNum = 899;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 901;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
 //BA.debugLineNum = 903;BA.debugLine="End Sub";
return "";
}
public String  _spinnernit_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 888;BA.debugLine="Private Sub SpinnerNit_ItemClick (Position As Int,";
 //BA.debugLineNum = 889;BA.debugLine="Log(Value)";
__c.LogImpl("659179009",BA.ObjectToString(_value),0);
 //BA.debugLineNum = 890;BA.debugLine="End Sub";
return "";
}
public String  _spinnernit0_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 905;BA.debugLine="Private Sub SpinnerNit0_ItemClick (Position As Int";
 //BA.debugLineNum = 907;BA.debugLine="End Sub";
return "";
}
public void  _validation(anywheresoftware.b4a.objects.EditTextWrapper _edt) throws Exception{
ResumableSub_validation rsub = new ResumableSub_validation(this,_edt);
rsub.resume(ba, null);
}
public static class ResumableSub_validation extends BA.ResumableSub {
public ResumableSub_validation(b4a.example.ef.form parent,anywheresoftware.b4a.objects.EditTextWrapper _edt) {
this.parent = parent;
this._edt = _edt;
}
b4a.example.ef.form parent;
anywheresoftware.b4a.objects.EditTextWrapper _edt;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 457;BA.debugLine="If edt.Text=\"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_edt.getText()).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 459;BA.debugLine="edt.HintColor=Colors.Red";
_edt.setHintColor(parent.__c.Colors.Red);
 //BA.debugLineNum = 460;BA.debugLine="Sleep(350)";
parent.__c.Sleep(ba,this,(int) (350));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 //BA.debugLineNum = 461;BA.debugLine="edt.HintColor=Colors.Gray'.";
_edt.setHintColor(parent.__c.Colors.Gray);
 if (true) break;

case 5:
//C
this.state = 6;
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
