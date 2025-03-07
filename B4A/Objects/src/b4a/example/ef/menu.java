package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class menu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.menu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.menu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel1precipitacion2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlprograma_de_labores = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlprecipitacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlcosecha = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnltaller = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlpersonal = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlmaquinaria = null;
public b4a.example.ef.util _utilclass = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 27;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 29;BA.debugLine="utilClass.Initialize";
_utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 31;BA.debugLine="utilClass.SetStatusBarColor(Colors.White, 0xB4008";
_utilclass._setstatusbarcolor /*String*/ (__c.Colors.White,((int)0xb4008000));
 //BA.debugLineNum = 33;BA.debugLine="Root.LoadLayout(\"menu\")";
_root.LoadLayout("menu",ba);
 //BA.debugLineNum = 35;BA.debugLine="Panel1Precipitacion2.Enabled = True";
_panel1precipitacion2.setEnabled(__c.True);
 //BA.debugLineNum = 36;BA.debugLine="pnlPrograma_de_labores.Enabled = True";
_pnlprograma_de_labores.setEnabled(__c.True);
 //BA.debugLineNum = 37;BA.debugLine="pnlPrecipitacion.Enabled = True";
_pnlprecipitacion.setEnabled(__c.True);
 //BA.debugLineNum = 38;BA.debugLine="pnlCosecha.Enabled = True";
_pnlcosecha.setEnabled(__c.True);
 //BA.debugLineNum = 39;BA.debugLine="pnlTaller.Enabled = True";
_pnltaller.setEnabled(__c.True);
 //BA.debugLineNum = 40;BA.debugLine="PnlMaquinaria.Enabled = True";
_pnlmaquinaria.setEnabled(__c.True);
 //BA.debugLineNum = 42;BA.debugLine="If Main.pNit = \"890307964\" Then";
if ((_main._pnit /*String*/ ).equals("890307964")) { 
 //BA.debugLineNum = 43;BA.debugLine="Panel1Precipitacion2.Enabled = False";
_panel1precipitacion2.setEnabled(__c.False);
 //BA.debugLineNum = 44;BA.debugLine="pnlPrograma_de_labores.Enabled = False";
_pnlprograma_de_labores.setEnabled(__c.False);
 //BA.debugLineNum = 45;BA.debugLine="pnlPrecipitacion.Enabled = False";
_pnlprecipitacion.setEnabled(__c.False);
 //BA.debugLineNum = 46;BA.debugLine="pnlCosecha.Enabled = False";
_pnlcosecha.setEnabled(__c.False);
 //BA.debugLineNum = 47;BA.debugLine="pnlTaller.Enabled = False";
_pnltaller.setEnabled(__c.False);
 //BA.debugLineNum = 48;BA.debugLine="Panel1Precipitacion2.Visible = False";
_panel1precipitacion2.setVisible(__c.False);
 //BA.debugLineNum = 49;BA.debugLine="pnlPrograma_de_labores.Visible = False";
_pnlprograma_de_labores.setVisible(__c.False);
 //BA.debugLineNum = 50;BA.debugLine="pnlPrecipitacion.Visible = False";
_pnlprecipitacion.setVisible(__c.False);
 //BA.debugLineNum = 51;BA.debugLine="pnlCosecha.Visible = False";
_pnlcosecha.setVisible(__c.False);
 //BA.debugLineNum = 52;BA.debugLine="pnlTaller.Visible = False";
_pnltaller.setVisible(__c.False);
 //BA.debugLineNum = 55;BA.debugLine="PnlMaquinaria.Enabled = True";
_pnlmaquinaria.setEnabled(__c.True);
 };
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private Panel1Precipitacion2 As B4XView";
_panel1precipitacion2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private pnlPrograma_de_labores As B4XView";
_pnlprograma_de_labores = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private pnlPrecipitacion As B4XView";
_pnlprecipitacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private pnlCosecha As B4XView";
_pnlcosecha = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private pnlTaller As B4XView";
_pnltaller = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private pnlPersonal As B4XView";
_pnlpersonal = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private PnlMaquinaria As B4XView";
_pnlmaquinaria = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 19;BA.debugLine="If Main.pNit = \"890307964\" Then";
if ((_main._pnit /*String*/ ).equals("890307964")) { 
 };
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _panel3_click() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Private Sub Panel3_Click";
 //BA.debugLineNum = 96;BA.debugLine="B4XPages.ShowPage(\"programa_labores\")";
_b4xpages._showpage /*String*/ (ba,"programa_labores");
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _pnlcosecha_click() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Private Sub pnlCosecha_Click";
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _pnlmaquinaria_click() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Private Sub PnlMaquinaria_Click";
 //BA.debugLineNum = 65;BA.debugLine="B4XPages.ShowPage(\"FormLabores\")";
_b4xpages._showpage /*String*/ (ba,"FormLabores");
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _pnlpersonal_click() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Private Sub pnlPersonal_Click";
 //BA.debugLineNum = 70;BA.debugLine="B4XPages.ShowPage(\"ListPerson\")";
_b4xpages._showpage /*String*/ (ba,"ListPerson");
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _pnlprecipitacion_click() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Private Sub pnlPrecipitacion_Click";
 //BA.debugLineNum = 85;BA.debugLine="B4XPages.ShowPage(\"FormPrecipitacion\")";
_b4xpages._showpage /*String*/ (ba,"FormPrecipitacion");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _pnlprograma_de_labores_click() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Private Sub pnlPrograma_de_labores_Click";
 //BA.debugLineNum = 89;BA.debugLine="B4XPages.ShowPage(\"listDados\")";
_b4xpages._showpage /*String*/ (ba,"listDados");
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _pnltaller_click() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Private Sub pnlTaller_Click";
 //BA.debugLineNum = 77;BA.debugLine="B4XPages.ShowPage(\"FormMaquinaria\")";
_b4xpages._showpage /*String*/ (ba,"FormMaquinaria");
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
