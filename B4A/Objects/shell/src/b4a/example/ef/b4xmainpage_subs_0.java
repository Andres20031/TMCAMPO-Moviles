package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_appear", __ref);}
 BA.debugLineNum = 118;BA.debugLine="Sub B4XPage_Appear";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 54;BA.debugLine="Private Sub B4XPage_Created(Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 58;BA.debugLine="Root = Root1";
Debug.ShouldStop(33554432);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 60;BA.debugLine="Root.LoadLayout(\"login\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("login")),__ref.getField(false, "ba"));
 BA.debugLineNum = 63;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 66;BA.debugLine="utilClass.SetStatusBarColor(0xB4008000,0xB4008000";
Debug.ShouldStop(2);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xb4008000))),(Object)(BA.numberCast(int.class, ((int)0xb4008000))));
 BA.debugLineNum = 69;BA.debugLine="EditText1Mail.Color = Colors.Transparent";
Debug.ShouldStop(16);
__ref.getField(false,"_edittext1mail" /*RemoteObject*/ ).runVoidMethod ("setColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 70;BA.debugLine="EditText2Pass.Color = Colors.Transparent";
Debug.ShouldStop(32);
__ref.getField(false,"_edittext2pass" /*RemoteObject*/ ).runVoidMethod ("setColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 73;BA.debugLine="menu_C.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_menu_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.menu.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 74;BA.debugLine="ListPerson_C.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_listperson_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.listperson.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 75;BA.debugLine="DetailsPerson_C.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_detailsperson_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.detailsperson.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 76;BA.debugLine="FormPerson_C.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_formperson_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.formperson.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 77;BA.debugLine="Form_C.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_form_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.form.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 78;BA.debugLine="listDados_C.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_listdados_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.listdados.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 79;BA.debugLine="FormMaquinaria_C.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_formmaquinaria_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.formmaquinaria.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 80;BA.debugLine="FormPrecipitacion_C.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_formprecipitacion_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.formprecipitacion.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 81;BA.debugLine="FormLabores_C.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_formlabores_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.formlabores.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 82;BA.debugLine="ListLabores_C.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_listlabores_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.listlabores.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 83;BA.debugLine="FormProgramaCampo_C.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_formprogramacampo_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.formprogramacampo.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 84;BA.debugLine="FormProgramaCampoCancelar_C.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_formprogramacampocancelar_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.formprogramacampocancelar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 85;BA.debugLine="FormProgramaCampoAplazar_C.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_formprogramacampoaplazar_c" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.formprogramacampoaplazar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 88;BA.debugLine="B4XPages.AddPageAndCreate(\"menu\", menu_C)";
Debug.ShouldStop(8388608);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("menu")),(Object)((__ref.getField(false,"_menu_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 90;BA.debugLine="B4XPages.AddPageAndCreate(\"ListPerson\", ListPerso";
Debug.ShouldStop(33554432);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ListPerson")),(Object)((__ref.getField(false,"_listperson_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 92;BA.debugLine="B4XPages.AddPageAndCreate(\"DetailsPerson\", Detail";
Debug.ShouldStop(134217728);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("DetailsPerson")),(Object)((__ref.getField(false,"_detailsperson_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 94;BA.debugLine="B4XPages.AddPageAndCreate(\"FormPerson\", FormPerso";
Debug.ShouldStop(536870912);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("FormPerson")),(Object)((__ref.getField(false,"_formperson_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 96;BA.debugLine="B4XPages.AddPage(\"Form\", Form_C)";
Debug.ShouldStop(-2147483648);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Form")),(Object)((__ref.getField(false,"_form_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 98;BA.debugLine="B4XPages.AddPageAndCreate(\"listDados\", listDados_";
Debug.ShouldStop(2);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("listDados")),(Object)((__ref.getField(false,"_listdados_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 100;BA.debugLine="B4XPages.AddPageAndCreate(\"FormMaquinaria\", FormM";
Debug.ShouldStop(8);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("FormMaquinaria")),(Object)((__ref.getField(false,"_formmaquinaria_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 102;BA.debugLine="B4XPages.AddPageAndCreate(\"FormPrecipitacion\", Fo";
Debug.ShouldStop(32);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("FormPrecipitacion")),(Object)((__ref.getField(false,"_formprecipitacion_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 104;BA.debugLine="B4XPages.AddPageAndCreate(\"FormLabores\", FormLabo";
Debug.ShouldStop(128);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("FormLabores")),(Object)((__ref.getField(false,"_formlabores_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 106;BA.debugLine="B4XPages.AddPageAndCreate(\"ListLabores\", ListLabo";
Debug.ShouldStop(512);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ListLabores")),(Object)((__ref.getField(false,"_listlabores_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 108;BA.debugLine="B4XPages.AddPageAndCreate(\"FormProgramaCampo\", Fo";
Debug.ShouldStop(2048);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("FormProgramaCampo")),(Object)((__ref.getField(false,"_formprogramacampo_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 110;BA.debugLine="B4XPages.AddPageAndCreate(\"FormProgramaCampoCance";
Debug.ShouldStop(8192);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("FormProgramaCampoCancelar")),(Object)((__ref.getField(false,"_formprogramacampocancelar_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 112;BA.debugLine="B4XPages.AddPageAndCreate(\"FormProgramaCampoAplaz";
Debug.ShouldStop(32768);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("FormProgramaCampoAplazar")),(Object)((__ref.getField(false,"_formprogramacampoaplazar_c" /*RemoteObject*/ ))));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1login_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1LOGIN_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("button1login_click")) { return __ref.runUserSub(false, "b4xmainpage","button1login_click", __ref);}
RemoteObject _usuario = RemoteObject.createImmutable("");
RemoteObject _contraseña = RemoteObject.createImmutable("");
 BA.debugLineNum = 122;BA.debugLine="Private Sub Button1LOGIN_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="Dim usuario As String";
Debug.ShouldStop(134217728);
_usuario = RemoteObject.createImmutable("");Debug.locals.put("usuario", _usuario);
 BA.debugLineNum = 125;BA.debugLine="Dim contraseña As String";
Debug.ShouldStop(268435456);
_contraseña = RemoteObject.createImmutable("");Debug.locals.put("contraseña", _contraseña);
 BA.debugLineNum = 128;BA.debugLine="usuario = EditText1Mail.text";
Debug.ShouldStop(-2147483648);
_usuario = __ref.getField(false,"_edittext1mail" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("usuario", _usuario);
 BA.debugLineNum = 129;BA.debugLine="contraseña = EditText2Pass.text";
Debug.ShouldStop(1);
_contraseña = __ref.getField(false,"_edittext2pass" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("contraseña", _contraseña);
 BA.debugLineNum = 132;BA.debugLine="If usuario = \"\" Or contraseña = \"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_usuario,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_contraseña,BA.ObjectToString(""))) { 
 BA.debugLineNum = 133;BA.debugLine="MsgboxAsync(\"Usuario o contraseña invalido\", \"TM";
Debug.ShouldStop(16);
b4xmainpage.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Usuario o contraseña invalido")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("TM App"))),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 136;BA.debugLine="GetRecordUser(Main.pDBNameSeguridad,usuario)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.ef.b4xmainpage.class, "_getrecorduser" /*void*/ ,(Object)(b4xmainpage._main._pdbnameseguridad /*RemoteObject*/ ),(Object)(_usuario));
 BA.debugLineNum = 138;BA.debugLine="If Main.pNit = \"890307964\" Or Main.pNit = Null T";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",b4xmainpage._main._pnit /*RemoteObject*/ ,BA.ObjectToString("890307964")) || RemoteObject.solveBoolean("n",b4xmainpage._main._pnit /*RemoteObject*/ )) { 
 BA.debugLineNum = 139;BA.debugLine="Panel1Precipitacion2.Enabled = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_panel1precipitacion2" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 140;BA.debugLine="pnlPrograma_de_labores.Enabled = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlprograma_de_labores" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 141;BA.debugLine="pnlPrecipitacion.Enabled = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlprecipitacion" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 142;BA.debugLine="pnlCosecha.Enabled = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnlcosecha" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 143;BA.debugLine="pnlTaller.Enabled = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnltaller" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 144;BA.debugLine="PnlMaquinaria.Enabled = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_pnlmaquinaria" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 };
 };
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private utilClass As util";
b4xmainpage._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",b4xmainpage._utilclass);
 //BA.debugLineNum = 12;BA.debugLine="Private EditText2Pass As EditText";
b4xmainpage._edittext2pass = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext2pass",b4xmainpage._edittext2pass);
 //BA.debugLineNum = 13;BA.debugLine="Private EditText1Mail As EditText";
b4xmainpage._edittext1mail = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1mail",b4xmainpage._edittext1mail);
 //BA.debugLineNum = 16;BA.debugLine="Private menu_C As Menu";
b4xmainpage._menu_c = RemoteObject.createNew ("b4a.example.ef.menu");__ref.setField("_menu_c",b4xmainpage._menu_c);
 //BA.debugLineNum = 17;BA.debugLine="Private ListPerson_C As ListPerson";
b4xmainpage._listperson_c = RemoteObject.createNew ("b4a.example.ef.listperson");__ref.setField("_listperson_c",b4xmainpage._listperson_c);
 //BA.debugLineNum = 18;BA.debugLine="Private DetailsPerson_C As DetailsPerson";
b4xmainpage._detailsperson_c = RemoteObject.createNew ("b4a.example.ef.detailsperson");__ref.setField("_detailsperson_c",b4xmainpage._detailsperson_c);
 //BA.debugLineNum = 19;BA.debugLine="Private FormPerson_C As FormPerson";
b4xmainpage._formperson_c = RemoteObject.createNew ("b4a.example.ef.formperson");__ref.setField("_formperson_c",b4xmainpage._formperson_c);
 //BA.debugLineNum = 20;BA.debugLine="Private Form_C As Form";
b4xmainpage._form_c = RemoteObject.createNew ("b4a.example.ef.form");__ref.setField("_form_c",b4xmainpage._form_c);
 //BA.debugLineNum = 21;BA.debugLine="Private listDados_C As ListDados";
b4xmainpage._listdados_c = RemoteObject.createNew ("b4a.example.ef.listdados");__ref.setField("_listdados_c",b4xmainpage._listdados_c);
 //BA.debugLineNum = 22;BA.debugLine="Private FormMaquinaria_C As FormMaquinaria";
b4xmainpage._formmaquinaria_c = RemoteObject.createNew ("b4a.example.ef.formmaquinaria");__ref.setField("_formmaquinaria_c",b4xmainpage._formmaquinaria_c);
 //BA.debugLineNum = 23;BA.debugLine="Private FormPrecipitacion_C As FormPrecipitacion";
b4xmainpage._formprecipitacion_c = RemoteObject.createNew ("b4a.example.ef.formprecipitacion");__ref.setField("_formprecipitacion_c",b4xmainpage._formprecipitacion_c);
 //BA.debugLineNum = 24;BA.debugLine="Private FormLabores_C As FormLabores";
b4xmainpage._formlabores_c = RemoteObject.createNew ("b4a.example.ef.formlabores");__ref.setField("_formlabores_c",b4xmainpage._formlabores_c);
 //BA.debugLineNum = 25;BA.debugLine="Private ListLabores_C As ListLabores";
b4xmainpage._listlabores_c = RemoteObject.createNew ("b4a.example.ef.listlabores");__ref.setField("_listlabores_c",b4xmainpage._listlabores_c);
 //BA.debugLineNum = 26;BA.debugLine="Private FormProgramaCampo_C As FormProgramaCampo";
b4xmainpage._formprogramacampo_c = RemoteObject.createNew ("b4a.example.ef.formprogramacampo");__ref.setField("_formprogramacampo_c",b4xmainpage._formprogramacampo_c);
 //BA.debugLineNum = 27;BA.debugLine="Private FormProgramaCampoCancelar_C As FormProgra";
b4xmainpage._formprogramacampocancelar_c = RemoteObject.createNew ("b4a.example.ef.formprogramacampocancelar");__ref.setField("_formprogramacampocancelar_c",b4xmainpage._formprogramacampocancelar_c);
 //BA.debugLineNum = 28;BA.debugLine="Private FormProgramaCampoAplazar_C As FormProg";
b4xmainpage._formprogramacampoaplazar_c = RemoteObject.createNew ("b4a.example.ef.formprogramacampoaplazar");__ref.setField("_formprogramacampoaplazar_c",b4xmainpage._formprogramacampoaplazar_c);
 //BA.debugLineNum = 30;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
b4xmainpage._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",b4xmainpage._rdclink);
 //BA.debugLineNum = 31;BA.debugLine="Dim parametrosUsuario As String=\"\"";
b4xmainpage._parametrosusuario = BA.ObjectToString("");__ref.setField("_parametrosusuario",b4xmainpage._parametrosusuario);
 //BA.debugLineNum = 33;BA.debugLine="Dim sf As StringFunctions";
b4xmainpage._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");__ref.setField("_sf",b4xmainpage._sf);
 //BA.debugLineNum = 34;BA.debugLine="sf.Initialize";
__ref.getField(false,"_sf" /*RemoteObject*/ ).runVoidMethod ("_vvv1",__ref.getField(false, "ba"));
 //BA.debugLineNum = 36;BA.debugLine="Private Panel1Precipitacion2 As B4XView";
b4xmainpage._panel1precipitacion2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_panel1precipitacion2",b4xmainpage._panel1precipitacion2);
 //BA.debugLineNum = 37;BA.debugLine="Private pnlPrograma_de_labores As B4XView";
b4xmainpage._pnlprograma_de_labores = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlprograma_de_labores",b4xmainpage._pnlprograma_de_labores);
 //BA.debugLineNum = 38;BA.debugLine="Private pnlPrecipitacion As B4XView";
b4xmainpage._pnlprecipitacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlprecipitacion",b4xmainpage._pnlprecipitacion);
 //BA.debugLineNum = 39;BA.debugLine="Private pnlCosecha As B4XView";
b4xmainpage._pnlcosecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlcosecha",b4xmainpage._pnlcosecha);
 //BA.debugLineNum = 40;BA.debugLine="Private pnlTaller As B4XView";
b4xmainpage._pnltaller = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnltaller",b4xmainpage._pnltaller);
 //BA.debugLineNum = 41;BA.debugLine="Private pnlPersonal As B4XView";
b4xmainpage._pnlpersonal = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlpersonal",b4xmainpage._pnlpersonal);
 //BA.debugLineNum = 42;BA.debugLine="Private PnlMaquinaria As B4XView";
b4xmainpage._pnlmaquinaria = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlmaquinaria",b4xmainpage._pnlmaquinaria);
 //BA.debugLineNum = 43;BA.debugLine="Private utilClass As util";
b4xmainpage._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",b4xmainpage._utilclass);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "b4xmainpage","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 222;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(1073741824);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 224;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(-2147483648);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 225;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(1);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 226;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 227;BA.debugLine="Return cmd";
Debug.ShouldStop(4);
if (true) return _cmd;
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject __ref,RemoteObject _db) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("createrequest")) { return __ref.runUserSub(false, "b4xmainpage","createrequest", __ref, _db);}
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
Debug.locals.put("Db", _db);
 BA.debugLineNum = 216;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16777216);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 218;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" &  Main.p";
Debug.ShouldStop(33554432);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),b4xmainpage._main._pdbnameseguridad /*RemoteObject*/ )));
 BA.debugLineNum = 219;BA.debugLine="Return Req";
Debug.ShouldStop(67108864);
if (true) return _req;
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getrecorduser(RemoteObject __ref,RemoteObject _usedbuser,RemoteObject _usuario) throws Exception{
try {
		Debug.PushSubsStack("GetRecordUser (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("getrecorduser")) { __ref.runUserSub(false, "b4xmainpage","getrecorduser", __ref, _usedbuser, _usuario); return;}
ResumableSub_GetRecordUser rsub = new ResumableSub_GetRecordUser(null,__ref,_usedbuser,_usuario);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordUser extends BA.ResumableSub {
public ResumableSub_GetRecordUser(b4a.example.ef.b4xmainpage parent,RemoteObject __ref,RemoteObject _usedbuser,RemoteObject _usuario) {
this.parent = parent;
this.__ref = __ref;
this._usedbuser = _usedbuser;
this._usuario = _usuario;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.b4xmainpage parent;
RemoteObject _usedbuser;
RemoteObject _usuario;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _separador = RemoteObject.createImmutable("");
RemoteObject _longitud = RemoteObject.createImmutable(0);
RemoteObject _parts = null;
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
RemoteObject group18;
int index18;
int groupLen18;
RemoteObject group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordUser (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,154);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDbUser", _usedbuser);
Debug.locals.put("usuario", _usuario);
 BA.debugLineNum = 156;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(134217728);
_req = __ref.runClassMethod (b4a.example.ef.b4xmainpage.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedbuser));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 157;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_usua";
Debug.ShouldStop(268435456);
_cmd = __ref.runClassMethod (b4a.example.ef.b4xmainpage.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_usuarioApp")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_usuario)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 159;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(1073741824);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 160;BA.debugLine="Dim separador As String";
Debug.ShouldStop(-2147483648);
_separador = RemoteObject.createImmutable("");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 161;BA.debugLine="Dim longitud As Int";
Debug.ShouldStop(1);
_longitud = RemoteObject.createImmutable(0);Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 163;BA.debugLine="Dim parts() As String";
Debug.ShouldStop(4);
_parts = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("parts", _parts);
 BA.debugLineNum = 165;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "getrecorduser"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 166;BA.debugLine="If j.Success Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 25;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 24;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 167;BA.debugLine="Msgbox(\"¿Está seguro que desea iniciar sesión?\",";
Debug.ShouldStop(64);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("¿Está seguro que desea iniciar sesión?")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Confirmación"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 169;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(256);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 170;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "getrecorduser"), (_req));
this.state = 27;
return;
case 27:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 173;BA.debugLine="If res.Rows.Size > 0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 175;BA.debugLine="Main.pUser = sf.Trim(usuario)";
Debug.ShouldStop(16384);
parent._main._puser /*RemoteObject*/  = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(_usuario));
 BA.debugLineNum = 177;BA.debugLine="B4XPages.ShowPage(\"menu\")";
Debug.ShouldStop(65536);
parent._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("menu")));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 180;BA.debugLine="MsgboxAsync(\"Usuario o contraseña inválidos\", \"";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Usuario o contraseña inválidos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("TM App"))),__ref.getField(false, "ba"));
 if (true) break;
;
 BA.debugLineNum = 182;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(2097152);

case 9:
//for
this.state = 22;
group18 = _res.getField(false,"Rows" /*RemoteObject*/ );
index18 = 0;
groupLen18 = group18.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 28;
if (true) break;

case 28:
//C
this.state = 22;
if (index18 < groupLen18) {
this.state = 11;
_row = (group18.runMethod(false,"Get",index18));Debug.locals.put("row", _row);}
if (true) break;

case 29:
//C
this.state = 28;
index18++;
Debug.locals.put("row", _row);
if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 183;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(4194304);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 184;BA.debugLine="separador=\" - \"";
Debug.ShouldStop(8388608);
_separador = BA.ObjectToString(" - ");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 185;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(16777216);
if (true) break;

case 12:
//for
this.state = 15;
group21 = _row;
index21 = 0;
groupLen21 = group21.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 30;
if (true) break;

case 30:
//C
this.state = 15;
if (index21 < groupLen21) {
this.state = 14;
_record = group21.getArrayElement(false,RemoteObject.createImmutable(index21));Debug.locals.put("record", _record);}
if (true) break;

case 31:
//C
this.state = 30;
index21++;
Debug.locals.put("record", _record);
if (true) break;

case 14:
//C
this.state = 31;
 BA.debugLineNum = 187;BA.debugLine="cadena=cadena & record & separador";
Debug.ShouldStop(67108864);
_cadena = RemoteObject.concat(_cadena,_record,_separador);Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
Debug.locals.put("record", _record);
;
 BA.debugLineNum = 189;BA.debugLine="parts = Regex.Split(\"-\", cadena)";
Debug.ShouldStop(268435456);
_parts = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("-")),(Object)(_cadena));Debug.locals.put("parts", _parts);
 BA.debugLineNum = 190;BA.debugLine="Main.pUser = sf.Trim(usuario)";
Debug.ShouldStop(536870912);
parent._main._puser /*RemoteObject*/  = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(_usuario));
 BA.debugLineNum = 191;BA.debugLine="Main.puserActivo = sf.Trim(parts(0))";
Debug.ShouldStop(1073741824);
parent._main._puseractivo /*RemoteObject*/  = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(_parts.getArrayElement(true,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 192;BA.debugLine="Main.pDBName  = sf.Trim(parts(1))";
Debug.ShouldStop(-2147483648);
parent._main._pdbname /*RemoteObject*/  = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(_parts.getArrayElement(true,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 193;BA.debugLine="Main.pNit = sf.Trim(parts(2))";
Debug.ShouldStop(1);
parent._main._pnit /*RemoteObject*/  = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(_parts.getArrayElement(true,BA.numberCast(int.class, 2))));
 BA.debugLineNum = 195;BA.debugLine="Main.pUserOpcionLabores = sf.Trim(parts(3))";
Debug.ShouldStop(4);
parent._main._puseropcionlabores /*RemoteObject*/  = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(_parts.getArrayElement(true,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 196;BA.debugLine="Main.pUserOpcionAgenda = sf.Trim(parts(4))";
Debug.ShouldStop(8);
parent._main._puseropcionagenda /*RemoteObject*/  = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(_parts.getArrayElement(true,BA.numberCast(int.class, 4))));
 BA.debugLineNum = 197;BA.debugLine="Main.pUserOpcionMaquinaria = sf.Trim(parts(5))";
Debug.ShouldStop(16);
parent._main._puseropcionmaquinaria /*RemoteObject*/  = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(_parts.getArrayElement(true,BA.numberCast(int.class, 5))));
 BA.debugLineNum = 198;BA.debugLine="Main.pUserOpcionPluviometros = sf.Trim(parts(6)";
Debug.ShouldStop(32);
parent._main._puseropcionpluviometros /*RemoteObject*/  = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(_parts.getArrayElement(true,BA.numberCast(int.class, 6))));
 BA.debugLineNum = 199;BA.debugLine="Main.pUserOpcionMonotoreo = sf.Trim(parts(7))";
Debug.ShouldStop(64);
parent._main._puseropcionmonotoreo /*RemoteObject*/  = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(_parts.getArrayElement(true,BA.numberCast(int.class, 7))));
 BA.debugLineNum = 201;BA.debugLine="longitud = cadena.Length";
Debug.ShouldStop(256);
_longitud = _cadena.runMethod(true,"length");Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 202;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
Debug.ShouldStop(512);
_cadena = _cadena.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_longitud,RemoteObject.createImmutable(3)}, "-",1, 1)));Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 203;BA.debugLine="If parametrosUsuario = cadena Then";
Debug.ShouldStop(1024);
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_parametrosusuario" /*RemoteObject*/ ),_cadena)) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 204;BA.debugLine="Log(\"Usuario: \"&parametrosUsuario)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","050397234",RemoteObject.concat(RemoteObject.createImmutable("Usuario: "),__ref.getField(true,"_parametrosusuario" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 206;BA.debugLine="cadena=\"\"";
Debug.ShouldStop(8192);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
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
Debug.locals.put("row", _row);
;
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 211;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","050397241",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 213;BA.debugLine="j.Release";
Debug.ShouldStop(1048576);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 48;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="B4XPages.GetManager.LogEvents = True";
Debug.ShouldStop(65536);
b4xmainpage._b4xpages.runMethod(false,"_getmanager" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_logevents" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 50;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
Debug.ShouldStop(131072);
b4xmainpage._b4xpages.runMethod(false,"_getmanager" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_transitionanimationduration" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}