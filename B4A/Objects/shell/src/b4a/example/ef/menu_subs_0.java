package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class menu_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (menu) ","menu",3,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "menu","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Root = Root1";
Debug.ShouldStop(67108864);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 29;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 31;BA.debugLine="utilClass.SetStatusBarColor(Colors.White, 0xB4008";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(menu.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, ((int)0xb4008000))));
 BA.debugLineNum = 33;BA.debugLine="Root.LoadLayout(\"menu\")";
Debug.ShouldStop(1);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("menu")),__ref.getField(false, "ba"));
 BA.debugLineNum = 35;BA.debugLine="Panel1Precipitacion2.Enabled = True";
Debug.ShouldStop(4);
__ref.getField(false,"_panel1precipitacion2" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"True"));
 BA.debugLineNum = 36;BA.debugLine="pnlPrograma_de_labores.Enabled = True";
Debug.ShouldStop(8);
__ref.getField(false,"_pnlprograma_de_labores" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"True"));
 BA.debugLineNum = 37;BA.debugLine="pnlPrecipitacion.Enabled = True";
Debug.ShouldStop(16);
__ref.getField(false,"_pnlprecipitacion" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"True"));
 BA.debugLineNum = 38;BA.debugLine="pnlCosecha.Enabled = True";
Debug.ShouldStop(32);
__ref.getField(false,"_pnlcosecha" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="pnlTaller.Enabled = True";
Debug.ShouldStop(64);
__ref.getField(false,"_pnltaller" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="PnlMaquinaria.Enabled = True";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlmaquinaria" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"True"));
 BA.debugLineNum = 42;BA.debugLine="If Main.pNit = \"890307964\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",menu._main._pnit /*RemoteObject*/ ,BA.ObjectToString("890307964"))) { 
 BA.debugLineNum = 43;BA.debugLine="Panel1Precipitacion2.Enabled = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_panel1precipitacion2" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"False"));
 BA.debugLineNum = 44;BA.debugLine="pnlPrograma_de_labores.Enabled = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlprograma_de_labores" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="pnlPrecipitacion.Enabled = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlprecipitacion" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"False"));
 BA.debugLineNum = 46;BA.debugLine="pnlCosecha.Enabled = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnlcosecha" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"False"));
 BA.debugLineNum = 47;BA.debugLine="pnlTaller.Enabled = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnltaller" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="Panel1Precipitacion2.Visible = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_panel1precipitacion2" /*RemoteObject*/ ).runMethod(true,"setVisible",menu.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="pnlPrograma_de_labores.Visible = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlprograma_de_labores" /*RemoteObject*/ ).runMethod(true,"setVisible",menu.__c.getField(true,"False"));
 BA.debugLineNum = 50;BA.debugLine="pnlPrecipitacion.Visible = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlprecipitacion" /*RemoteObject*/ ).runMethod(true,"setVisible",menu.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="pnlCosecha.Visible = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlcosecha" /*RemoteObject*/ ).runMethod(true,"setVisible",menu.__c.getField(true,"False"));
 BA.debugLineNum = 52;BA.debugLine="pnlTaller.Visible = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnltaller" /*RemoteObject*/ ).runMethod(true,"setVisible",menu.__c.getField(true,"False"));
 BA.debugLineNum = 55;BA.debugLine="PnlMaquinaria.Enabled = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlmaquinaria" /*RemoteObject*/ ).runMethod(true,"setEnabled",menu.__c.getField(true,"True"));
 };
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
menu._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",menu._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
menu._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",menu._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private Panel1Precipitacion2 As B4XView";
menu._panel1precipitacion2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_panel1precipitacion2",menu._panel1precipitacion2);
 //BA.debugLineNum = 5;BA.debugLine="Private pnlPrograma_de_labores As B4XView";
menu._pnlprograma_de_labores = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlprograma_de_labores",menu._pnlprograma_de_labores);
 //BA.debugLineNum = 6;BA.debugLine="Private pnlPrecipitacion As B4XView";
menu._pnlprecipitacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlprecipitacion",menu._pnlprecipitacion);
 //BA.debugLineNum = 7;BA.debugLine="Private pnlCosecha As B4XView";
menu._pnlcosecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlcosecha",menu._pnlcosecha);
 //BA.debugLineNum = 8;BA.debugLine="Private pnlTaller As B4XView";
menu._pnltaller = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnltaller",menu._pnltaller);
 //BA.debugLineNum = 9;BA.debugLine="Private pnlPersonal As B4XView";
menu._pnlpersonal = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlpersonal",menu._pnlpersonal);
 //BA.debugLineNum = 10;BA.debugLine="Private PnlMaquinaria As B4XView";
menu._pnlmaquinaria = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlmaquinaria",menu._pnlmaquinaria);
 //BA.debugLineNum = 11;BA.debugLine="Private utilClass As util";
menu._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",menu._utilclass);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (menu) ","menu",3,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "menu","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="If Main.pNit = \"890307964\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",menu._main._pnit /*RemoteObject*/ ,BA.ObjectToString("890307964"))) { 
 };
 BA.debugLineNum = 22;BA.debugLine="Return Me";
Debug.ShouldStop(2097152);
if (true) return __ref;
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel3_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel3_Click (menu) ","menu",3,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("panel3_click")) { return __ref.runUserSub(false, "menu","panel3_click", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Private Sub Panel3_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="B4XPages.ShowPage(\"ListLabores\")";
Debug.ShouldStop(-2147483648);
menu._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ListLabores")));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlcosecha_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlCosecha_Click (menu) ","menu",3,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("pnlcosecha_click")) { return __ref.runUserSub(false, "menu","pnlcosecha_click", __ref);}
 BA.debugLineNum = 80;BA.debugLine="Private Sub pnlCosecha_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlmaquinaria_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PnlMaquinaria_Click (menu) ","menu",3,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("pnlmaquinaria_click")) { return __ref.runUserSub(false, "menu","pnlmaquinaria_click", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Private Sub PnlMaquinaria_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="B4XPages.ShowPage(\"FormLabores\")";
Debug.ShouldStop(1);
menu._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("FormLabores")));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlpersonal_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlPersonal_Click (menu) ","menu",3,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("pnlpersonal_click")) { return __ref.runUserSub(false, "menu","pnlpersonal_click", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Private Sub pnlPersonal_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="B4XPages.ShowPage(\"ListPerson\")";
Debug.ShouldStop(32);
menu._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ListPerson")));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlprecipitacion_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlPrecipitacion_Click (menu) ","menu",3,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("pnlprecipitacion_click")) { return __ref.runUserSub(false, "menu","pnlprecipitacion_click", __ref);}
 BA.debugLineNum = 84;BA.debugLine="Private Sub pnlPrecipitacion_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="B4XPages.ShowPage(\"FormPrecipitacion\")";
Debug.ShouldStop(1048576);
menu._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("FormPrecipitacion")));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlprograma_de_labores_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlPrograma_de_labores_Click (menu) ","menu",3,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("pnlprograma_de_labores_click")) { return __ref.runUserSub(false, "menu","pnlprograma_de_labores_click", __ref);}
 BA.debugLineNum = 88;BA.debugLine="Private Sub pnlPrograma_de_labores_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="B4XPages.ShowPage(\"listDados\")";
Debug.ShouldStop(16777216);
menu._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("listDados")));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnltaller_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlTaller_Click (menu) ","menu",3,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("pnltaller_click")) { return __ref.runUserSub(false, "menu","pnltaller_click", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Private Sub pnlTaller_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="B4XPages.ShowPage(\"FormMaquinaria\")";
Debug.ShouldStop(4096);
menu._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("FormMaquinaria")));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}