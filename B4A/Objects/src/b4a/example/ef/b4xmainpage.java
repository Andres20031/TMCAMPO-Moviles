package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xmainpage");
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
public String  _b4xpage_appear(b4a.example.ef.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=50266112;
 //BA.debugLineNum = 50266112;BA.debugLine="Sub B4XPage_Appear";
RDebugUtils.currentLine=50266114;
 //BA.debugLineNum = 50266114;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=50200576;
 //BA.debugLineNum = 50200576;BA.debugLine="Private Sub B4XPage_Created(Root1 As B4XView)";
RDebugUtils.currentLine=50200580;
 //BA.debugLineNum = 50200580;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=50200582;
 //BA.debugLineNum = 50200582;BA.debugLine="Root.LoadLayout(\"login\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("login",ba);
RDebugUtils.currentLine=50200585;
 //BA.debugLineNum = 50200585;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=50200588;
 //BA.debugLineNum = 50200588;BA.debugLine="utilClass.SetStatusBarColor(0xB4008000,0xB4008000";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,((int)0xb4008000),((int)0xb4008000));
RDebugUtils.currentLine=50200591;
 //BA.debugLineNum = 50200591;BA.debugLine="EditText1Mail.Color = Colors.Transparent";
__ref._edittext1mail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=50200592;
 //BA.debugLineNum = 50200592;BA.debugLine="EditText2Pass.Color = Colors.Transparent";
__ref._edittext2pass /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=50200595;
 //BA.debugLineNum = 50200595;BA.debugLine="menu_C.Initialize";
__ref._menu_c /*b4a.example.ef.menu*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200596;
 //BA.debugLineNum = 50200596;BA.debugLine="ListPerson_C.Initialize";
__ref._listperson_c /*b4a.example.ef.listperson*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200597;
 //BA.debugLineNum = 50200597;BA.debugLine="DetailsPerson_C.Initialize";
__ref._detailsperson_c /*b4a.example.ef.detailsperson*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200598;
 //BA.debugLineNum = 50200598;BA.debugLine="FormPerson_C.Initialize";
__ref._formperson_c /*b4a.example.ef.formperson*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200599;
 //BA.debugLineNum = 50200599;BA.debugLine="Form_C.Initialize";
__ref._form_c /*b4a.example.ef.form*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200600;
 //BA.debugLineNum = 50200600;BA.debugLine="listDados_C.Initialize";
__ref._listdados_c /*b4a.example.ef.listdados*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200601;
 //BA.debugLineNum = 50200601;BA.debugLine="FormMaquinaria_C.Initialize";
__ref._formmaquinaria_c /*b4a.example.ef.formmaquinaria*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200602;
 //BA.debugLineNum = 50200602;BA.debugLine="FormPrecipitacion_C.Initialize";
__ref._formprecipitacion_c /*b4a.example.ef.formprecipitacion*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200603;
 //BA.debugLineNum = 50200603;BA.debugLine="FormLabores_C.Initialize";
__ref._formlabores_c /*b4a.example.ef.formlabores*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200604;
 //BA.debugLineNum = 50200604;BA.debugLine="ListLabores_C.Initialize";
__ref._listlabores_c /*b4a.example.ef.listlabores*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200605;
 //BA.debugLineNum = 50200605;BA.debugLine="FormProgramaCampo_C.Initialize";
__ref._formprogramacampo_c /*b4a.example.ef.formprogramacampo*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200606;
 //BA.debugLineNum = 50200606;BA.debugLine="FormProgramaCampoCancelar_C.Initialize";
__ref._formprogramacampocancelar_c /*b4a.example.ef.formprogramacampocancelar*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200607;
 //BA.debugLineNum = 50200607;BA.debugLine="FormProgramaCampoAplazar_C.Initialize";
__ref._formprogramacampoaplazar_c /*b4a.example.ef.formprogramacampoaplazar*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=50200610;
 //BA.debugLineNum = 50200610;BA.debugLine="B4XPages.AddPageAndCreate(\"menu\", menu_C)";
_b4xpages._addpageandcreate /*String*/ (ba,"menu",(Object)(__ref._menu_c /*b4a.example.ef.menu*/ ));
RDebugUtils.currentLine=50200612;
 //BA.debugLineNum = 50200612;BA.debugLine="B4XPages.AddPageAndCreate(\"ListPerson\", ListPerso";
_b4xpages._addpageandcreate /*String*/ (ba,"ListPerson",(Object)(__ref._listperson_c /*b4a.example.ef.listperson*/ ));
RDebugUtils.currentLine=50200614;
 //BA.debugLineNum = 50200614;BA.debugLine="B4XPages.AddPageAndCreate(\"DetailsPerson\", Detail";
_b4xpages._addpageandcreate /*String*/ (ba,"DetailsPerson",(Object)(__ref._detailsperson_c /*b4a.example.ef.detailsperson*/ ));
RDebugUtils.currentLine=50200616;
 //BA.debugLineNum = 50200616;BA.debugLine="B4XPages.AddPageAndCreate(\"FormPerson\", FormPerso";
_b4xpages._addpageandcreate /*String*/ (ba,"FormPerson",(Object)(__ref._formperson_c /*b4a.example.ef.formperson*/ ));
RDebugUtils.currentLine=50200618;
 //BA.debugLineNum = 50200618;BA.debugLine="B4XPages.AddPage(\"Form\", Form_C)";
_b4xpages._addpage /*String*/ (ba,"Form",(Object)(__ref._form_c /*b4a.example.ef.form*/ ));
RDebugUtils.currentLine=50200620;
 //BA.debugLineNum = 50200620;BA.debugLine="B4XPages.AddPageAndCreate(\"listDados\", listDados_";
_b4xpages._addpageandcreate /*String*/ (ba,"listDados",(Object)(__ref._listdados_c /*b4a.example.ef.listdados*/ ));
RDebugUtils.currentLine=50200622;
 //BA.debugLineNum = 50200622;BA.debugLine="B4XPages.AddPageAndCreate(\"FormMaquinaria\", FormM";
_b4xpages._addpageandcreate /*String*/ (ba,"FormMaquinaria",(Object)(__ref._formmaquinaria_c /*b4a.example.ef.formmaquinaria*/ ));
RDebugUtils.currentLine=50200624;
 //BA.debugLineNum = 50200624;BA.debugLine="B4XPages.AddPageAndCreate(\"FormPrecipitacion\", Fo";
_b4xpages._addpageandcreate /*String*/ (ba,"FormPrecipitacion",(Object)(__ref._formprecipitacion_c /*b4a.example.ef.formprecipitacion*/ ));
RDebugUtils.currentLine=50200626;
 //BA.debugLineNum = 50200626;BA.debugLine="B4XPages.AddPageAndCreate(\"FormLabores\", FormLabo";
_b4xpages._addpageandcreate /*String*/ (ba,"FormLabores",(Object)(__ref._formlabores_c /*b4a.example.ef.formlabores*/ ));
RDebugUtils.currentLine=50200628;
 //BA.debugLineNum = 50200628;BA.debugLine="B4XPages.AddPageAndCreate(\"ListLabores\", ListLabo";
_b4xpages._addpageandcreate /*String*/ (ba,"ListLabores",(Object)(__ref._listlabores_c /*b4a.example.ef.listlabores*/ ));
RDebugUtils.currentLine=50200630;
 //BA.debugLineNum = 50200630;BA.debugLine="B4XPages.AddPageAndCreate(\"FormProgramaCampo\", Fo";
_b4xpages._addpageandcreate /*String*/ (ba,"FormProgramaCampo",(Object)(__ref._formprogramacampo_c /*b4a.example.ef.formprogramacampo*/ ));
RDebugUtils.currentLine=50200632;
 //BA.debugLineNum = 50200632;BA.debugLine="B4XPages.AddPageAndCreate(\"FormProgramaCampoCance";
_b4xpages._addpageandcreate /*String*/ (ba,"FormProgramaCampoCancelar",(Object)(__ref._formprogramacampocancelar_c /*b4a.example.ef.formprogramacampocancelar*/ ));
RDebugUtils.currentLine=50200634;
 //BA.debugLineNum = 50200634;BA.debugLine="B4XPages.AddPageAndCreate(\"FormProgramaCampoAplaz";
_b4xpages._addpageandcreate /*String*/ (ba,"FormProgramaCampoAplazar",(Object)(__ref._formprogramacampoaplazar_c /*b4a.example.ef.formprogramacampoaplazar*/ ));
RDebugUtils.currentLine=50200638;
 //BA.debugLineNum = 50200638;BA.debugLine="End Sub";
return "";
}
public String  _button1login_click(b4a.example.ef.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1login_click", false))
	 {return ((String) Debug.delegate(ba, "button1login_click", null));}
String _usuario = "";
String _contraseña = "";
RDebugUtils.currentLine=50331648;
 //BA.debugLineNum = 50331648;BA.debugLine="Private Sub Button1LOGIN_Click";
RDebugUtils.currentLine=50331650;
 //BA.debugLineNum = 50331650;BA.debugLine="Dim usuario As String";
_usuario = "";
RDebugUtils.currentLine=50331651;
 //BA.debugLineNum = 50331651;BA.debugLine="Dim contraseña As String";
_contraseña = "";
RDebugUtils.currentLine=50331654;
 //BA.debugLineNum = 50331654;BA.debugLine="usuario = EditText1Mail.text";
_usuario = __ref._edittext1mail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=50331655;
 //BA.debugLineNum = 50331655;BA.debugLine="contraseña = EditText2Pass.text";
_contraseña = __ref._edittext2pass /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=50331658;
 //BA.debugLineNum = 50331658;BA.debugLine="If usuario = \"\" Or contraseña = \"\" Then";
if ((_usuario).equals("") || (_contraseña).equals("")) { 
RDebugUtils.currentLine=50331659;
 //BA.debugLineNum = 50331659;BA.debugLine="MsgboxAsync(\"Usuario o contraseña invalido\", \"TM";
__c.MsgboxAsync(BA.ObjectToCharSequence("Usuario o contraseña invalido"),BA.ObjectToCharSequence("TM App"),ba);
 }else {
RDebugUtils.currentLine=50331662;
 //BA.debugLineNum = 50331662;BA.debugLine="GetRecordUser(Main.pDBNameSeguridad,usuario)";
__ref._getrecorduser /*void*/ (null,_main._pdbnameseguridad /*String*/ ,_usuario);
RDebugUtils.currentLine=50331664;
 //BA.debugLineNum = 50331664;BA.debugLine="If Main.pNit = \"890307964\" Or Main.pNit = Null T";
if ((_main._pnit /*String*/ ).equals("890307964") || _main._pnit /*String*/ == null) { 
RDebugUtils.currentLine=50331665;
 //BA.debugLineNum = 50331665;BA.debugLine="Panel1Precipitacion2.Enabled = False";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=50331666;
 //BA.debugLineNum = 50331666;BA.debugLine="pnlPrograma_de_labores.Enabled = False";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=50331667;
 //BA.debugLineNum = 50331667;BA.debugLine="pnlPrecipitacion.Enabled = False";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=50331668;
 //BA.debugLineNum = 50331668;BA.debugLine="pnlCosecha.Enabled = False";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=50331669;
 //BA.debugLineNum = 50331669;BA.debugLine="pnlTaller.Enabled = False";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=50331670;
 //BA.debugLineNum = 50331670;BA.debugLine="PnlMaquinaria.Enabled = True";
__ref._pnlmaquinaria /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
 };
 };
RDebugUtils.currentLine=50331678;
 //BA.debugLineNum = 50331678;BA.debugLine="End Sub";
return "";
}
public void  _getrecorduser(b4a.example.ef.b4xmainpage __ref,String _usedbuser,String _usuario) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getrecorduser", false))
	 {Debug.delegate(ba, "getrecorduser", new Object[] {_usedbuser,_usuario}); return;}
ResumableSub_GetRecordUser rsub = new ResumableSub_GetRecordUser(this,__ref,_usedbuser,_usuario);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordUser extends BA.ResumableSub {
public ResumableSub_GetRecordUser(b4a.example.ef.b4xmainpage parent,b4a.example.ef.b4xmainpage __ref,String _usedbuser,String _usuario) {
this.parent = parent;
this.__ref = __ref;
this._usedbuser = _usedbuser;
this._usuario = _usuario;
this.__ref = parent;
}
b4a.example.ef.b4xmainpage __ref;
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
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=50397186;
 //BA.debugLineNum = 50397186;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedbuser);
RDebugUtils.currentLine=50397187;
 //BA.debugLineNum = 50397187;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_usua";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_usuarioApp",new Object[]{(Object)(_usuario)});
RDebugUtils.currentLine=50397189;
 //BA.debugLineNum = 50397189;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=50397190;
 //BA.debugLineNum = 50397190;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=50397191;
 //BA.debugLineNum = 50397191;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=50397193;
 //BA.debugLineNum = 50397193;BA.debugLine="Dim parts() As String";
_parts = new String[(int) (0)];
java.util.Arrays.fill(_parts,"");
RDebugUtils.currentLine=50397195;
 //BA.debugLineNum = 50397195;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "getrecorduser"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=50397196;
 //BA.debugLineNum = 50397196;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=50397197;
 //BA.debugLineNum = 50397197;BA.debugLine="Msgbox(\"¿Está seguro que desea iniciar sesión?\",";
parent.__c.Msgbox(BA.ObjectToCharSequence("¿Está seguro que desea iniciar sesión?"),BA.ObjectToCharSequence("Confirmación"),ba);
RDebugUtils.currentLine=50397199;
 //BA.debugLineNum = 50397199;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=50397200;
 //BA.debugLineNum = 50397200;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "getrecorduser"), (Object)(_req));
this.state = 27;
return;
case 27:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=50397203;
 //BA.debugLineNum = 50397203;BA.debugLine="If res.Rows.Size > 0 Then";
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
RDebugUtils.currentLine=50397205;
 //BA.debugLineNum = 50397205;BA.debugLine="Main.pUser = sf.Trim(usuario)";
parent._main._puser /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_usuario);
RDebugUtils.currentLine=50397207;
 //BA.debugLineNum = 50397207;BA.debugLine="B4XPages.ShowPage(\"menu\")";
parent._b4xpages._showpage /*String*/ (ba,"menu");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=50397210;
 //BA.debugLineNum = 50397210;BA.debugLine="MsgboxAsync(\"Usuario o contraseña inválidos\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Usuario o contraseña inválidos"),BA.ObjectToCharSequence("TM App"),ba);
 if (true) break;
;
RDebugUtils.currentLine=50397212;
 //BA.debugLineNum = 50397212;BA.debugLine="For Each row() As Object In res.Rows";

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
RDebugUtils.currentLine=50397213;
 //BA.debugLineNum = 50397213;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=50397214;
 //BA.debugLineNum = 50397214;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=50397215;
 //BA.debugLineNum = 50397215;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=50397217;
 //BA.debugLineNum = 50397217;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=50397219;
 //BA.debugLineNum = 50397219;BA.debugLine="parts = Regex.Split(\"-\", cadena)";
_parts = parent.__c.Regex.Split("-",_cadena);
RDebugUtils.currentLine=50397220;
 //BA.debugLineNum = 50397220;BA.debugLine="Main.pUser = sf.Trim(usuario)";
parent._main._puser /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_usuario);
RDebugUtils.currentLine=50397221;
 //BA.debugLineNum = 50397221;BA.debugLine="Main.puserActivo = sf.Trim(parts(0))";
parent._main._puseractivo /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (0)]);
RDebugUtils.currentLine=50397222;
 //BA.debugLineNum = 50397222;BA.debugLine="Main.pDBName  = sf.Trim(parts(1))";
parent._main._pdbname /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (1)]);
RDebugUtils.currentLine=50397223;
 //BA.debugLineNum = 50397223;BA.debugLine="Main.pNit = sf.Trim(parts(2))";
parent._main._pnit /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (2)]);
RDebugUtils.currentLine=50397225;
 //BA.debugLineNum = 50397225;BA.debugLine="Main.pUserOpcionLabores = sf.Trim(parts(3))";
parent._main._puseropcionlabores /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (3)]);
RDebugUtils.currentLine=50397226;
 //BA.debugLineNum = 50397226;BA.debugLine="Main.pUserOpcionAgenda = sf.Trim(parts(4))";
parent._main._puseropcionagenda /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (4)]);
RDebugUtils.currentLine=50397227;
 //BA.debugLineNum = 50397227;BA.debugLine="Main.pUserOpcionMaquinaria = sf.Trim(parts(5))";
parent._main._puseropcionmaquinaria /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (5)]);
RDebugUtils.currentLine=50397228;
 //BA.debugLineNum = 50397228;BA.debugLine="Main.pUserOpcionPluviometros = sf.Trim(parts(6)";
parent._main._puseropcionpluviometros /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (6)]);
RDebugUtils.currentLine=50397229;
 //BA.debugLineNum = 50397229;BA.debugLine="Main.pUserOpcionMonotoreo = sf.Trim(parts(7))";
parent._main._puseropcionmonotoreo /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (7)]);
RDebugUtils.currentLine=50397231;
 //BA.debugLineNum = 50397231;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=50397232;
 //BA.debugLineNum = 50397232;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=50397233;
 //BA.debugLineNum = 50397233;BA.debugLine="If parametrosUsuario = cadena Then";
if (true) break;

case 16:
//if
this.state = 21;
if ((__ref._parametrosusuario /*String*/ ).equals(_cadena)) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=50397234;
 //BA.debugLineNum = 50397234;BA.debugLine="Log(\"Usuario: \"&parametrosUsuario)";
parent.__c.LogImpl("050397234","Usuario: "+__ref._parametrosusuario /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=50397236;
 //BA.debugLineNum = 50397236;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=50397241;
 //BA.debugLineNum = 50397241;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("050397241","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=50397243;
 //BA.debugLineNum = 50397243;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=50397244;
 //BA.debugLineNum = 50397244;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=50069504;
 //BA.debugLineNum = 50069504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=50069505;
 //BA.debugLineNum = 50069505;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50069506;
 //BA.debugLineNum = 50069506;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=50069507;
 //BA.debugLineNum = 50069507;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=50069508;
 //BA.debugLineNum = 50069508;BA.debugLine="Private EditText2Pass As EditText";
_edittext2pass = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=50069509;
 //BA.debugLineNum = 50069509;BA.debugLine="Private EditText1Mail As EditText";
_edittext1mail = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=50069512;
 //BA.debugLineNum = 50069512;BA.debugLine="Private menu_C As Menu";
_menu_c = new b4a.example.ef.menu();
RDebugUtils.currentLine=50069513;
 //BA.debugLineNum = 50069513;BA.debugLine="Private ListPerson_C As ListPerson";
_listperson_c = new b4a.example.ef.listperson();
RDebugUtils.currentLine=50069514;
 //BA.debugLineNum = 50069514;BA.debugLine="Private DetailsPerson_C As DetailsPerson";
_detailsperson_c = new b4a.example.ef.detailsperson();
RDebugUtils.currentLine=50069515;
 //BA.debugLineNum = 50069515;BA.debugLine="Private FormPerson_C As FormPerson";
_formperson_c = new b4a.example.ef.formperson();
RDebugUtils.currentLine=50069516;
 //BA.debugLineNum = 50069516;BA.debugLine="Private Form_C As Form";
_form_c = new b4a.example.ef.form();
RDebugUtils.currentLine=50069517;
 //BA.debugLineNum = 50069517;BA.debugLine="Private listDados_C As ListDados";
_listdados_c = new b4a.example.ef.listdados();
RDebugUtils.currentLine=50069518;
 //BA.debugLineNum = 50069518;BA.debugLine="Private FormMaquinaria_C As FormMaquinaria";
_formmaquinaria_c = new b4a.example.ef.formmaquinaria();
RDebugUtils.currentLine=50069519;
 //BA.debugLineNum = 50069519;BA.debugLine="Private FormPrecipitacion_C As FormPrecipitacion";
_formprecipitacion_c = new b4a.example.ef.formprecipitacion();
RDebugUtils.currentLine=50069520;
 //BA.debugLineNum = 50069520;BA.debugLine="Private FormLabores_C As FormLabores";
_formlabores_c = new b4a.example.ef.formlabores();
RDebugUtils.currentLine=50069521;
 //BA.debugLineNum = 50069521;BA.debugLine="Private ListLabores_C As ListLabores";
_listlabores_c = new b4a.example.ef.listlabores();
RDebugUtils.currentLine=50069522;
 //BA.debugLineNum = 50069522;BA.debugLine="Private FormProgramaCampo_C As FormProgramaCampo";
_formprogramacampo_c = new b4a.example.ef.formprogramacampo();
RDebugUtils.currentLine=50069523;
 //BA.debugLineNum = 50069523;BA.debugLine="Private FormProgramaCampoCancelar_C As FormProgra";
_formprogramacampocancelar_c = new b4a.example.ef.formprogramacampocancelar();
RDebugUtils.currentLine=50069524;
 //BA.debugLineNum = 50069524;BA.debugLine="Private FormProgramaCampoAplazar_C As FormProg";
_formprogramacampoaplazar_c = new b4a.example.ef.formprogramacampoaplazar();
RDebugUtils.currentLine=50069526;
 //BA.debugLineNum = 50069526;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=50069527;
 //BA.debugLineNum = 50069527;BA.debugLine="Dim parametrosUsuario As String=\"\"";
_parametrosusuario = "";
RDebugUtils.currentLine=50069529;
 //BA.debugLineNum = 50069529;BA.debugLine="Dim sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=50069530;
 //BA.debugLineNum = 50069530;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=50069532;
 //BA.debugLineNum = 50069532;BA.debugLine="Private Panel1Precipitacion2 As B4XView";
_panel1precipitacion2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50069533;
 //BA.debugLineNum = 50069533;BA.debugLine="Private pnlPrograma_de_labores As B4XView";
_pnlprograma_de_labores = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50069534;
 //BA.debugLineNum = 50069534;BA.debugLine="Private pnlPrecipitacion As B4XView";
_pnlprecipitacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50069535;
 //BA.debugLineNum = 50069535;BA.debugLine="Private pnlCosecha As B4XView";
_pnlcosecha = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50069536;
 //BA.debugLineNum = 50069536;BA.debugLine="Private pnlTaller As B4XView";
_pnltaller = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50069537;
 //BA.debugLineNum = 50069537;BA.debugLine="Private pnlPersonal As B4XView";
_pnlpersonal = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50069538;
 //BA.debugLineNum = 50069538;BA.debugLine="Private PnlMaquinaria As B4XView";
_pnlmaquinaria = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50069539;
 //BA.debugLineNum = 50069539;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=50069542;
 //BA.debugLineNum = 50069542;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.b4xmainpage __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=50528256;
 //BA.debugLineNum = 50528256;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=50528257;
 //BA.debugLineNum = 50528257;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=50528258;
 //BA.debugLineNum = 50528258;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=50528259;
 //BA.debugLineNum = 50528259;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=50528260;
 //BA.debugLineNum = 50528260;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=50528261;
 //BA.debugLineNum = 50528261;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=50528262;
 //BA.debugLineNum = 50528262;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.dbrequestmanager  _createrequest(b4a.example.ef.b4xmainpage __ref,String _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((b4a.example.ef.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_db}));}
b4a.example.ef.dbrequestmanager _req = null;
RDebugUtils.currentLine=50462720;
 //BA.debugLineNum = 50462720;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=50462721;
 //BA.debugLineNum = 50462721;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=50462722;
 //BA.debugLineNum = 50462722;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" &  Main.p";
_req._initialize /*String*/ (null,ba,this,__ref._rdclink /*String*/ +"?DBName="+_main._pdbnameseguridad /*String*/ );
RDebugUtils.currentLine=50462723;
 //BA.debugLineNum = 50462723;BA.debugLine="Return Req";
if (true) return _req;
RDebugUtils.currentLine=50462724;
 //BA.debugLineNum = 50462724;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=50135040;
 //BA.debugLineNum = 50135040;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=50135041;
 //BA.debugLineNum = 50135041;BA.debugLine="B4XPages.GetManager.LogEvents = True";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (ba)._logevents /*boolean*/  = __c.True;
RDebugUtils.currentLine=50135042;
 //BA.debugLineNum = 50135042;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
RDebugUtils.currentLine=50135044;
 //BA.debugLineNum = 50135044;BA.debugLine="End Sub";
return "";
}
}