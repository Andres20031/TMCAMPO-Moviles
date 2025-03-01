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
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub B4XPage_Appear";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub B4XPage_Created(Root1 As B4XView)";
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Root.LoadLayout(\"login\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("login",ba);
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="utilClass.SetStatusBarColor(0xB4008000,0xB4008000";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,((int)0xb4008000),((int)0xb4008000));
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="EditText1Mail.Color = Colors.Transparent";
__ref._edittext1mail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="EditText2Pass.Color = Colors.Transparent";
__ref._edittext2pass /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="menu_C.Initialize";
__ref._menu_c /*b4a.example.ef.menu*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="ListPerson_C.Initialize";
__ref._listperson_c /*b4a.example.ef.listperson*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="DetailsPerson_C.Initialize";
__ref._detailsperson_c /*b4a.example.ef.detailsperson*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="FormPerson_C.Initialize";
__ref._formperson_c /*b4a.example.ef.formperson*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="Form_C.Initialize";
__ref._form_c /*b4a.example.ef.form*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="listDados_C.Initialize";
__ref._listdados_c /*b4a.example.ef.listdados*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="FormMaquinaria_C.Initialize";
__ref._formmaquinaria_c /*b4a.example.ef.formmaquinaria*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="FormPrecipitacion_C.Initialize";
__ref._formprecipitacion_c /*b4a.example.ef.formprecipitacion*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="FormLabores_C.Initialize";
__ref._formlabores_c /*b4a.example.ef.formlabores*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458782;
 //BA.debugLineNum = 458782;BA.debugLine="B4XPages.AddPageAndCreate(\"menu\", menu_C)";
_b4xpages._addpageandcreate /*String*/ (ba,"menu",(Object)(__ref._menu_c /*b4a.example.ef.menu*/ ));
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="B4XPages.AddPageAndCreate(\"ListPerson\", ListPerso";
_b4xpages._addpageandcreate /*String*/ (ba,"ListPerson",(Object)(__ref._listperson_c /*b4a.example.ef.listperson*/ ));
RDebugUtils.currentLine=458786;
 //BA.debugLineNum = 458786;BA.debugLine="B4XPages.AddPageAndCreate(\"DetailsPerson\", Detail";
_b4xpages._addpageandcreate /*String*/ (ba,"DetailsPerson",(Object)(__ref._detailsperson_c /*b4a.example.ef.detailsperson*/ ));
RDebugUtils.currentLine=458788;
 //BA.debugLineNum = 458788;BA.debugLine="B4XPages.AddPageAndCreate(\"FormPerson\", FormPerso";
_b4xpages._addpageandcreate /*String*/ (ba,"FormPerson",(Object)(__ref._formperson_c /*b4a.example.ef.formperson*/ ));
RDebugUtils.currentLine=458790;
 //BA.debugLineNum = 458790;BA.debugLine="B4XPages.AddPage(\"Form\", Form_C)";
_b4xpages._addpage /*String*/ (ba,"Form",(Object)(__ref._form_c /*b4a.example.ef.form*/ ));
RDebugUtils.currentLine=458792;
 //BA.debugLineNum = 458792;BA.debugLine="B4XPages.AddPageAndCreate(\"listDados\", listDados_";
_b4xpages._addpageandcreate /*String*/ (ba,"listDados",(Object)(__ref._listdados_c /*b4a.example.ef.listdados*/ ));
RDebugUtils.currentLine=458794;
 //BA.debugLineNum = 458794;BA.debugLine="B4XPages.AddPageAndCreate(\"FormMaquinaria\", FormM";
_b4xpages._addpageandcreate /*String*/ (ba,"FormMaquinaria",(Object)(__ref._formmaquinaria_c /*b4a.example.ef.formmaquinaria*/ ));
RDebugUtils.currentLine=458796;
 //BA.debugLineNum = 458796;BA.debugLine="B4XPages.AddPageAndCreate(\"FormPrecipitacion\", Fo";
_b4xpages._addpageandcreate /*String*/ (ba,"FormPrecipitacion",(Object)(__ref._formprecipitacion_c /*b4a.example.ef.formprecipitacion*/ ));
RDebugUtils.currentLine=458798;
 //BA.debugLineNum = 458798;BA.debugLine="B4XPages.AddPageAndCreate(\"FormLabores\", FormLabo";
_b4xpages._addpageandcreate /*String*/ (ba,"FormLabores",(Object)(__ref._formlabores_c /*b4a.example.ef.formlabores*/ ));
RDebugUtils.currentLine=458801;
 //BA.debugLineNum = 458801;BA.debugLine="End Sub";
return "";
}
public String  _button1login_click(b4a.example.ef.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1login_click", false))
	 {return ((String) Debug.delegate(ba, "button1login_click", null));}
String _usuario = "";
String _contraseña = "";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub Button1LOGIN_Click";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Dim usuario As String";
_usuario = "";
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Dim contraseña As String";
_contraseña = "";
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="usuario = EditText1Mail.text";
_usuario = __ref._edittext1mail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="contraseña = EditText2Pass.text";
_contraseña = __ref._edittext2pass /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="If usuario = \"\" Or contraseña = \"\" Then";
if ((_usuario).equals("") || (_contraseña).equals("")) { 
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="MsgboxAsync(\"Usuario o contraseña invalido\", \"TM";
__c.MsgboxAsync(BA.ObjectToCharSequence("Usuario o contraseña invalido"),BA.ObjectToCharSequence("TM App"),ba);
 }else {
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="GetRecordUser(Main.pDBNameSeguridad,usuario)";
__ref._getrecorduser /*void*/ (null,_main._pdbnameseguridad /*String*/ ,_usuario);
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="If Main.pNit = \"890307964\" Or Main.pNit = Null T";
if ((_main._pnit /*String*/ ).equals("890307964") || _main._pnit /*String*/ == null) { 
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="Panel1Precipitacion2.Enabled = False";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="pnlPrograma_de_labores.Enabled = False";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="pnlPrecipitacion.Enabled = False";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="pnlCosecha.Enabled = False";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="pnlTaller.Enabled = False";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="PnlMaquinaria.Enabled = True";
__ref._pnlmaquinaria /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
 };
 };
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedbuser);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_usua";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_usuarioApp",new Object[]{(Object)(_usuario)});
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="Dim parts() As String";
_parts = new String[(int) (0)];
java.util.Arrays.fill(_parts,"");
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "getrecorduser"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="Msgbox(\"¿Está seguro que desea iniciar sesión?\",";
parent.__c.Msgbox(BA.ObjectToCharSequence("¿Está seguro que desea iniciar sesión?"),BA.ObjectToCharSequence("Confirmación"),ba);
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "getrecorduser"), (Object)(_req));
this.state = 27;
return;
case 27:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="If res.Rows.Size > 0 Then";
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
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="Main.pUser = sf.Trim(usuario)";
parent._main._puser /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_usuario);
RDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="B4XPages.ShowPage(\"menu\")";
parent._b4xpages._showpage /*String*/ (ba,"menu");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="MsgboxAsync(\"Usuario o contraseña inválidos\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Usuario o contraseña inválidos"),BA.ObjectToCharSequence("TM App"),ba);
 if (true) break;
;
RDebugUtils.currentLine=655388;
 //BA.debugLineNum = 655388;BA.debugLine="For Each row() As Object In res.Rows";

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
RDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=655390;
 //BA.debugLineNum = 655390;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=655391;
 //BA.debugLineNum = 655391;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=655393;
 //BA.debugLineNum = 655393;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=655395;
 //BA.debugLineNum = 655395;BA.debugLine="parts = Regex.Split(\"-\", cadena)";
_parts = parent.__c.Regex.Split("-",_cadena);
RDebugUtils.currentLine=655396;
 //BA.debugLineNum = 655396;BA.debugLine="Main.pUser = sf.Trim(usuario)";
parent._main._puser /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_usuario);
RDebugUtils.currentLine=655397;
 //BA.debugLineNum = 655397;BA.debugLine="Main.puserActivo = sf.Trim(parts(0))";
parent._main._puseractivo /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (0)]);
RDebugUtils.currentLine=655398;
 //BA.debugLineNum = 655398;BA.debugLine="Main.pDBName  = sf.Trim(parts(1))";
parent._main._pdbname /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (1)]);
RDebugUtils.currentLine=655399;
 //BA.debugLineNum = 655399;BA.debugLine="Main.pNit = sf.Trim(parts(2))";
parent._main._pnit /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (2)]);
RDebugUtils.currentLine=655401;
 //BA.debugLineNum = 655401;BA.debugLine="Main.pUserOpcionLabores = sf.Trim(parts(3))";
parent._main._puseropcionlabores /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (3)]);
RDebugUtils.currentLine=655402;
 //BA.debugLineNum = 655402;BA.debugLine="Main.pUserOpcionAgenda = sf.Trim(parts(4))";
parent._main._puseropcionagenda /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (4)]);
RDebugUtils.currentLine=655403;
 //BA.debugLineNum = 655403;BA.debugLine="Main.pUserOpcionMaquinaria = sf.Trim(parts(5))";
parent._main._puseropcionmaquinaria /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (5)]);
RDebugUtils.currentLine=655404;
 //BA.debugLineNum = 655404;BA.debugLine="Main.pUserOpcionPluviometros = sf.Trim(parts(6)";
parent._main._puseropcionpluviometros /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (6)]);
RDebugUtils.currentLine=655405;
 //BA.debugLineNum = 655405;BA.debugLine="Main.pUserOpcionMonotoreo = sf.Trim(parts(7))";
parent._main._puseropcionmonotoreo /*String*/  = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(_parts[(int) (7)]);
RDebugUtils.currentLine=655407;
 //BA.debugLineNum = 655407;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=655408;
 //BA.debugLineNum = 655408;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=655409;
 //BA.debugLineNum = 655409;BA.debugLine="If parametrosUsuario = cadena Then";
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
RDebugUtils.currentLine=655410;
 //BA.debugLineNum = 655410;BA.debugLine="Log(\"Usuario: \"&parametrosUsuario)";
parent.__c.LogImpl("8655410","Usuario: "+__ref._parametrosusuario /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=655412;
 //BA.debugLineNum = 655412;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=655417;
 //BA.debugLineNum = 655417;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("8655417","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=655419;
 //BA.debugLineNum = 655419;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=655420;
 //BA.debugLineNum = 655420;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Private EditText2Pass As EditText";
_edittext2pass = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Private EditText1Mail As EditText";
_edittext1mail = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="Private menu_C As Menu";
_menu_c = new b4a.example.ef.menu();
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="Private ListPerson_C As ListPerson";
_listperson_c = new b4a.example.ef.listperson();
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="Private DetailsPerson_C As DetailsPerson";
_detailsperson_c = new b4a.example.ef.detailsperson();
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="Private FormPerson_C As FormPerson";
_formperson_c = new b4a.example.ef.formperson();
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="Private Form_C As Form";
_form_c = new b4a.example.ef.form();
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="Private listDados_C As ListDados";
_listdados_c = new b4a.example.ef.listdados();
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="Private FormMaquinaria_C As FormMaquinaria";
_formmaquinaria_c = new b4a.example.ef.formmaquinaria();
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="Private FormPrecipitacion_C As FormPrecipitacion";
_formprecipitacion_c = new b4a.example.ef.formprecipitacion();
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="Private FormLabores_C As FormLabores";
_formlabores_c = new b4a.example.ef.formlabores();
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="Dim parametrosUsuario As String=\"\"";
_parametrosusuario = "";
RDebugUtils.currentLine=327701;
 //BA.debugLineNum = 327701;BA.debugLine="Dim sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="Private Panel1Precipitacion2 As B4XView";
_panel1precipitacion2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="Private pnlPrograma_de_labores As B4XView";
_pnlprograma_de_labores = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="Private pnlPrecipitacion As B4XView";
_pnlprecipitacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="Private pnlCosecha As B4XView";
_pnlcosecha = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327708;
 //BA.debugLineNum = 327708;BA.debugLine="Private pnlTaller As B4XView";
_pnltaller = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327709;
 //BA.debugLineNum = 327709;BA.debugLine="Private pnlPersonal As B4XView";
_pnlpersonal = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="Private PnlMaquinaria As B4XView";
_pnlmaquinaria = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.b4xmainpage __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.dbrequestmanager  _createrequest(b4a.example.ef.b4xmainpage __ref,String _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((b4a.example.ef.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_db}));}
b4a.example.ef.dbrequestmanager _req = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" &  Main.p";
_req._initialize /*String*/ (null,ba,this,__ref._rdclink /*String*/ +"?DBName="+_main._pdbnameseguridad /*String*/ );
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Return Req";
if (true) return _req;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="B4XPages.GetManager.LogEvents = True";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (ba)._logevents /*boolean*/  = __c.True;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
}