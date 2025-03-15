package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.ef.util _utilclass = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2pass = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1mail = null;
public b4a.example.ef.menu _menu_c = null;
public b4a.example.ef.listperson _listperson_c = null;
public b4a.example.ef.detailsperson _detailsperson_c = null;
public b4a.example.ef.formperson _formperson_c = null;
public b4a.example.ef.form _form_c = null;
public b4a.example.ef.listdados _listdados_c = null;
public b4a.example.ef.formmaquinaria _formmaquinaria_c = null;
public b4a.example.ef.formprecipitacion _formprecipitacion_c = null;
public b4a.example.ef.formlabores _formlabores_c = null;
public b4a.example.ef.listlabores _listlabores_c = null;
public b4a.example.ef.formprogramacampo _formprogramacampo_c = null;
public b4a.example.ef.formprogramacampocancelar _formprogramacampocancelar_c = null;
public b4a.example.ef.formprogramacampoaplazar _formprogramacampoaplazar_c = null;
public String _rdclink = "";
public String _parametrosusuario = "";
public ADR.stringdemo.stringfunctions _sf = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel1precipitacion2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlprograma_de_labores = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlprecipitacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlcosecha = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnltaller = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlpersonal = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlmaquinaria = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Private Sub B4XPage_Created(Root1 As B4XView)";
 //BA.debugLineNum = 58;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 60;BA.debugLine="Root.LoadLayout(\"login\")";
_root.LoadLayout("login",ba);
 //BA.debugLineNum = 63;BA.debugLine="utilClass.Initialize";
_utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 66;BA.debugLine="utilClass.SetStatusBarColor(0xB4008000,0xB4008000";
_utilclass._setstatusbarcolor /*String*/ (((int)0xb4008000),((int)0xb4008000));
 //BA.debugLineNum = 69;BA.debugLine="EditText1Mail.Color = Colors.Transparent";
_edittext1mail.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 70;BA.debugLine="EditText2Pass.Color = Colors.Transparent";
_edittext2pass.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 73;BA.debugLine="menu_C.Initialize";
_menu_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 74;BA.debugLine="ListPerson_C.Initialize";
_listperson_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 75;BA.debugLine="DetailsPerson_C.Initialize";
_detailsperson_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 76;BA.debugLine="FormPerson_C.Initialize";
_formperson_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 77;BA.debugLine="Form_C.Initialize";
_form_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 78;BA.debugLine="listDados_C.Initialize";
_listdados_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 79;BA.debugLine="FormMaquinaria_C.Initialize";
_formmaquinaria_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 80;BA.debugLine="FormPrecipitacion_C.Initialize";
_formprecipitacion_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 81;BA.debugLine="FormLabores_C.Initialize";
_formlabores_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 82;BA.debugLine="ListLabores_C.Initialize";
_listlabores_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 83;BA.debugLine="FormProgramaCampo_C.Initialize";
_formprogramacampo_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 84;BA.debugLine="FormProgramaCampoCancelar_C.Initialize";
_formprogramacampocancelar_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 85;BA.debugLine="FormProgramaCampoAplazar_C.Initialize";
_formprogramacampoaplazar_c._initialize /*Object*/ (ba);
 //BA.debugLineNum = 88;BA.debugLine="B4XPages.AddPageAndCreate(\"menu\", menu_C)";
_b4xpages._addpageandcreate /*String*/ (ba,"menu",(Object)(_menu_c));
 //BA.debugLineNum = 90;BA.debugLine="B4XPages.AddPageAndCreate(\"ListPerson\", ListPerso";
_b4xpages._addpageandcreate /*String*/ (ba,"ListPerson",(Object)(_listperson_c));
 //BA.debugLineNum = 92;BA.debugLine="B4XPages.AddPageAndCreate(\"DetailsPerson\", Detail";
_b4xpages._addpageandcreate /*String*/ (ba,"DetailsPerson",(Object)(_detailsperson_c));
 //BA.debugLineNum = 94;BA.debugLine="B4XPages.AddPageAndCreate(\"FormPerson\", FormPerso";
_b4xpages._addpageandcreate /*String*/ (ba,"FormPerson",(Object)(_formperson_c));
 //BA.debugLineNum = 96;BA.debugLine="B4XPages.AddPage(\"Form\", Form_C)";
_b4xpages._addpage /*String*/ (ba,"Form",(Object)(_form_c));
 //BA.debugLineNum = 98;BA.debugLine="B4XPages.AddPageAndCreate(\"listDados\", listDados_";
_b4xpages._addpageandcreate /*String*/ (ba,"listDados",(Object)(_listdados_c));
 //BA.debugLineNum = 100;BA.debugLine="B4XPages.AddPageAndCreate(\"FormMaquinaria\", FormM";
_b4xpages._addpageandcreate /*String*/ (ba,"FormMaquinaria",(Object)(_formmaquinaria_c));
 //BA.debugLineNum = 102;BA.debugLine="B4XPages.AddPageAndCreate(\"FormPrecipitacion\", Fo";
_b4xpages._addpageandcreate /*String*/ (ba,"FormPrecipitacion",(Object)(_formprecipitacion_c));
 //BA.debugLineNum = 104;BA.debugLine="B4XPages.AddPageAndCreate(\"FormLabores\", FormLabo";
_b4xpages._addpageandcreate /*String*/ (ba,"FormLabores",(Object)(_formlabores_c));
 //BA.debugLineNum = 106;BA.debugLine="B4XPages.AddPageAndCreate(\"ListLabores\", ListLabo";
_b4xpages._addpageandcreate /*String*/ (ba,"ListLabores",(Object)(_listlabores_c));
 //BA.debugLineNum = 108;BA.debugLine="B4XPages.AddPageAndCreate(\"FormProgramaCampo\", Fo";
_b4xpages._addpageandcreate /*String*/ (ba,"FormProgramaCampo",(Object)(_formprogramacampo_c));
 //BA.debugLineNum = 110;BA.debugLine="B4XPages.AddPageAndCreate(\"FormProgramaCampoCance";
_b4xpages._addpageandcreate /*String*/ (ba,"FormProgramaCampoCancelar",(Object)(_formprogramacampocancelar_c));
 //BA.debugLineNum = 112;BA.debugLine="B4XPages.AddPageAndCreate(\"FormProgramaCampoAplaz";
_b4xpages._addpageandcreate /*String*/ (ba,"FormProgramaCampoAplazar",(Object)(_formprogramacampoaplazar_c));
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _button1login_click() throws Exception{
String _usuario = "";
String _contraseña = "";
 //BA.debugLineNum = 122;BA.debugLine="Private Sub Button1LOGIN_Click";
 //BA.debugLineNum = 124;BA.debugLine="Dim usuario As String";
_usuario = "";
 //BA.debugLineNum = 125;BA.debugLine="Dim contraseña As String";
_contraseña = "";
 //BA.debugLineNum = 128;BA.debugLine="usuario = EditText1Mail.text";
_usuario = _edittext1mail.getText();
 //BA.debugLineNum = 129;BA.debugLine="contraseña = EditText2Pass.text";
_contraseña = _edittext2pass.getText();
 //BA.debugLineNum = 132;BA.debugLine="If usuario = \"\" Or contraseña = \"\" Then";
if ((_usuario).equals("") || (_contraseña).equals("")) { 
 //BA.debugLineNum = 133;BA.debugLine="MsgboxAsync(\"Usuario o contraseña invalido\", \"TM";
__c.MsgboxAsync(BA.ObjectToCharSequence("Usuario o contraseña invalido"),BA.ObjectToCharSequence("TM App"),ba);
 }else {
 //BA.debugLineNum = 136;BA.debugLine="GetRecordUser(Main.pDBNameSeguridad,usuario)";
_getrecorduser(_main._pdbnameseguridad /*String*/ ,_usuario);
 //BA.debugLineNum = 138;BA.debugLine="If Main.pNit = \"890307964\" Or Main.pNit = Null T";
if ((_main._pnit /*String*/ ).equals("890307964") || _main._pnit /*String*/ == null) { 
 //BA.debugLineNum = 139;BA.debugLine="Panel1Precipitacion2.Enabled = False";
_panel1precipitacion2.setEnabled(__c.False);
 //BA.debugLineNum = 140;BA.debugLine="pnlPrograma_de_labores.Enabled = False";
_pnlprograma_de_labores.setEnabled(__c.False);
 //BA.debugLineNum = 141;BA.debugLine="pnlPrecipitacion.Enabled = False";
_pnlprecipitacion.setEnabled(__c.False);
 //BA.debugLineNum = 142;BA.debugLine="pnlCosecha.Enabled = False";
_pnlcosecha.setEnabled(__c.False);
 //BA.debugLineNum = 143;BA.debugLine="pnlTaller.Enabled = False";
_pnltaller.setEnabled(__c.False);
 //BA.debugLineNum = 144;BA.debugLine="PnlMaquinaria.Enabled = True";
_pnlmaquinaria.setEnabled(__c.True);
 };
 };
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
 //BA.debugLineNum = 12;BA.debugLine="Private EditText2Pass As EditText";
_edittext2pass = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private EditText1Mail As EditText";
_edittext1mail = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private menu_C As Menu";
_menu_c = new b4a.example.ef.menu();
 //BA.debugLineNum = 17;BA.debugLine="Private ListPerson_C As ListPerson";
_listperson_c = new b4a.example.ef.listperson();
 //BA.debugLineNum = 18;BA.debugLine="Private DetailsPerson_C As DetailsPerson";
_detailsperson_c = new b4a.example.ef.detailsperson();
 //BA.debugLineNum = 19;BA.debugLine="Private FormPerson_C As FormPerson";
_formperson_c = new b4a.example.ef.formperson();
 //BA.debugLineNum = 20;BA.debugLine="Private Form_C As Form";
_form_c = new b4a.example.ef.form();
 //BA.debugLineNum = 21;BA.debugLine="Private listDados_C As ListDados";
_listdados_c = new b4a.example.ef.listdados();
 //BA.debugLineNum = 22;BA.debugLine="Private FormMaquinaria_C As FormMaquinaria";
_formmaquinaria_c = new b4a.example.ef.formmaquinaria();
 //BA.debugLineNum = 23;BA.debugLine="Private FormPrecipitacion_C As FormPrecipitacion";
_formprecipitacion_c = new b4a.example.ef.formprecipitacion();
 //BA.debugLineNum = 24;BA.debugLine="Private FormLabores_C As FormLabores";
_formlabores_c = new b4a.example.ef.formlabores();
 //BA.debugLineNum = 25;BA.debugLine="Private ListLabores_C As ListLabores";
_listlabores_c = new b4a.example.ef.listlabores();
 //BA.debugLineNum = 26;BA.debugLine="Private FormProgramaCampo_C As FormProgramaCampo";
_formprogramacampo_c = new b4a.example.ef.formprogramacampo();
 //BA.debugLineNum = 27;BA.debugLine="Private FormProgramaCampoCancelar_C As FormProgra";
_formprogramacampocancelar_c = new b4a.example.ef.formprogramacampocancelar();
 //BA.debugLineNum = 28;BA.debugLine="Private FormProgramaCampoAplazar_C As FormProg";
_formprogramacampoaplazar_c = new b4a.example.ef.formprogramacampoaplazar();
 //BA.debugLineNum = 30;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 31;BA.debugLine="Dim parametrosUsuario As String=\"\"";
_parametrosusuario = "";
 //BA.debugLineNum = 33;BA.debugLine="Dim sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
 //BA.debugLineNum = 34;BA.debugLine="sf.Initialize";
_sf._vvv1(ba);
 //BA.debugLineNum = 36;BA.debugLine="Private Panel1Precipitacion2 As B4XView";
_panel1precipitacion2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private pnlPrograma_de_labores As B4XView";
_pnlprograma_de_labores = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private pnlPrecipitacion As B4XView";
_pnlprecipitacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private pnlCosecha As B4XView";
_pnlcosecha = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private pnlTaller As B4XView";
_pnltaller = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private pnlPersonal As B4XView";
_pnlpersonal = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private PnlMaquinaria As B4XView";
_pnlmaquinaria = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 222;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 223;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 224;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 225;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 226;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 227;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.dbrequestmanager  _createrequest(String _db) throws Exception{
b4a.example.ef.dbrequestmanager _req = null;
 //BA.debugLineNum = 216;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
 //BA.debugLineNum = 217;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 218;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" &  Main.p";
_req._initialize /*String*/ (ba,this,_rdclink+"?DBName="+_main._pdbnameseguridad /*String*/ );
 //BA.debugLineNum = 219;BA.debugLine="Return Req";
if (true) return _req;
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public void  _getrecorduser(String _usedbuser,String _usuario) throws Exception{
ResumableSub_GetRecordUser rsub = new ResumableSub_GetRecordUser(this,_usedbuser,_usuario);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordUser extends BA.ResumableSub {
public ResumableSub_GetRecordUser(b4a.example.ef.b4xmainpage parent,String _usedbuser,String _usuario) {
this.parent = parent;
this._usedbuser = _usedbuser;
this._usuario = _usuario;
}
b4a.example.ef.b4xmainpage parent;
String _usedbuser;
String _usuario;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _cadena = "";
String _separador = "";
int _longitud = 0;
String[] _parts = null;
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
Object _record = null;
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;
Object[] group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 156;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedbuser);
 //BA.debugLineNum = 157;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_usua";
_cmd = parent._createcommand("select_usuarioApp",new Object[]{(Object)(_usuario)});
 //BA.debugLineNum = 159;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 160;BA.debugLine="Dim separador As String";
_separador = "";
 //BA.debugLineNum = 161;BA.debugLine="Dim longitud As Int";
_longitud = 0;
 //BA.debugLineNum = 163;BA.debugLine="Dim parts() As String";
_parts = new String[(int) (0)];
java.util.Arrays.fill(_parts,"");
 //BA.debugLineNum = 165;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 166;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 25;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 24;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 167;BA.debugLine="Msgbox(\"¿Está seguro que desea iniciar sesión?\",";
parent.__c.Msgbox(BA.ObjectToCharSequence("¿Está seguro que desea iniciar sesión?"),BA.ObjectToCharSequence("Confirmación"),ba);
 //BA.debugLineNum = 169;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 170;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 27;
return;
case 27:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 173;BA.debugLine="If res.Rows.Size > 0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 175;BA.debugLine="Main.pUser = sf.Trim(usuario)";
parent._main._puser /*String*/  = parent._sf._vvvvv7(_usuario);
 //BA.debugLineNum = 177;BA.debugLine="B4XPages.ShowPage(\"menu\")";
parent._b4xpages._showpage /*String*/ (ba,"menu");
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 180;BA.debugLine="MsgboxAsync(\"Usuario o contraseña inválidos\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Usuario o contraseña inválidos"),BA.ObjectToCharSequence("TM App"),ba);
 if (true) break;
;
 //BA.debugLineNum = 182;BA.debugLine="For Each row() As Object In res.Rows";

case 9:
//for
this.state = 22;
group18 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 28;
if (true) break;

case 28:
//C
this.state = 22;
if (index18 < groupLen18) {
this.state = 11;
_row = (Object[])(group18.Get(index18));}
if (true) break;

case 29:
//C
this.state = 28;
index18++;
if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 183;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 184;BA.debugLine="separador=\" - \"";
_separador = " - ";
 //BA.debugLineNum = 185;BA.debugLine="For Each record As Object In row";
if (true) break;

case 12:
//for
this.state = 15;
group21 = _row;
index21 = 0;
groupLen21 = group21.length;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 15;
if (index21 < groupLen21) {
this.state = 14;
_record = group21[index21];}
if (true) break;

case 31:
//C
this.state = 30;
index21++;
if (true) break;

case 14:
//C
this.state = 31;
 //BA.debugLineNum = 187;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 189;BA.debugLine="parts = Regex.Split(\"-\", cadena)";
_parts = parent.__c.Regex.Split("-",_cadena);
 //BA.debugLineNum = 190;BA.debugLine="Main.pUser = sf.Trim(usuario)";
parent._main._puser /*String*/  = parent._sf._vvvvv7(_usuario);
 //BA.debugLineNum = 191;BA.debugLine="Main.puserActivo = sf.Trim(parts(0))";
parent._main._puseractivo /*String*/  = parent._sf._vvvvv7(_parts[(int) (0)]);
 //BA.debugLineNum = 192;BA.debugLine="Main.pDBName  = sf.Trim(parts(1))";
parent._main._pdbname /*String*/  = parent._sf._vvvvv7(_parts[(int) (1)]);
 //BA.debugLineNum = 193;BA.debugLine="Main.pNit = sf.Trim(parts(2))";
parent._main._pnit /*String*/  = parent._sf._vvvvv7(_parts[(int) (2)]);
 //BA.debugLineNum = 195;BA.debugLine="Main.pUserOpcionLabores = sf.Trim(parts(3))";
parent._main._puseropcionlabores /*String*/  = parent._sf._vvvvv7(_parts[(int) (3)]);
 //BA.debugLineNum = 196;BA.debugLine="Main.pUserOpcionAgenda = sf.Trim(parts(4))";
parent._main._puseropcionagenda /*String*/  = parent._sf._vvvvv7(_parts[(int) (4)]);
 //BA.debugLineNum = 197;BA.debugLine="Main.pUserOpcionMaquinaria = sf.Trim(parts(5))";
parent._main._puseropcionmaquinaria /*String*/  = parent._sf._vvvvv7(_parts[(int) (5)]);
 //BA.debugLineNum = 198;BA.debugLine="Main.pUserOpcionPluviometros = sf.Trim(parts(6)";
parent._main._puseropcionpluviometros /*String*/  = parent._sf._vvvvv7(_parts[(int) (6)]);
 //BA.debugLineNum = 199;BA.debugLine="Main.pUserOpcionMonotoreo = sf.Trim(parts(7))";
parent._main._puseropcionmonotoreo /*String*/  = parent._sf._vvvvv7(_parts[(int) (7)]);
 //BA.debugLineNum = 201;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
 //BA.debugLineNum = 202;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
 //BA.debugLineNum = 203;BA.debugLine="If parametrosUsuario = cadena Then";
if (true) break;

case 16:
//if
this.state = 21;
if ((parent._parametrosusuario).equals(_cadena)) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 //BA.debugLineNum = 204;BA.debugLine="Log(\"Usuario: \"&parametrosUsuario)";
parent.__c.LogImpl("6655410","Usuario: "+parent._parametrosusuario,0);
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 206;BA.debugLine="cadena=\"\"";
_cadena = "";
 if (true) break;

case 21:
//C
this.state = 29;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 211;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("6655417","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 25:
//C
this.state = -1;
;
 //BA.debugLineNum = 213;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.ef.httpjob _j) throws Exception{
}
public void  _req_result(b4a.example.ef.main._dbresult _res) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 48;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.GetManager.LogEvents = True";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (ba)._logevents /*boolean*/  = __c.True;
 //BA.debugLineNum = 50;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
