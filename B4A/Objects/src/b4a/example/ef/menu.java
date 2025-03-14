package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class menu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.menu");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public Object  _initialize(b4a.example.ef.menu __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=51314688;
 //BA.debugLineNum = 51314688;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=51314689;
 //BA.debugLineNum = 51314689;BA.debugLine="If Main.pNit = \"890307964\" Then";
if ((_main._pnit /*String*/ ).equals("890307964")) { 
 };
RDebugUtils.currentLine=51314692;
 //BA.debugLineNum = 51314692;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=51314693;
 //BA.debugLineNum = 51314693;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.menu __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=51380224;
 //BA.debugLineNum = 51380224;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=51380226;
 //BA.debugLineNum = 51380226;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=51380228;
 //BA.debugLineNum = 51380228;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=51380230;
 //BA.debugLineNum = 51380230;BA.debugLine="utilClass.SetStatusBarColor(Colors.White, 0xB4008";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=51380232;
 //BA.debugLineNum = 51380232;BA.debugLine="Root.LoadLayout(\"menu\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("menu",ba);
RDebugUtils.currentLine=51380234;
 //BA.debugLineNum = 51380234;BA.debugLine="Panel1Precipitacion2.Enabled = True";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=51380235;
 //BA.debugLineNum = 51380235;BA.debugLine="pnlPrograma_de_labores.Enabled = True";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=51380236;
 //BA.debugLineNum = 51380236;BA.debugLine="pnlPrecipitacion.Enabled = True";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=51380237;
 //BA.debugLineNum = 51380237;BA.debugLine="pnlCosecha.Enabled = True";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=51380238;
 //BA.debugLineNum = 51380238;BA.debugLine="pnlTaller.Enabled = True";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=51380239;
 //BA.debugLineNum = 51380239;BA.debugLine="PnlMaquinaria.Enabled = True";
__ref._pnlmaquinaria /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=51380241;
 //BA.debugLineNum = 51380241;BA.debugLine="If Main.pNit = \"890307964\" Then";
if ((_main._pnit /*String*/ ).equals("890307964")) { 
RDebugUtils.currentLine=51380242;
 //BA.debugLineNum = 51380242;BA.debugLine="Panel1Precipitacion2.Enabled = False";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=51380243;
 //BA.debugLineNum = 51380243;BA.debugLine="pnlPrograma_de_labores.Enabled = False";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=51380244;
 //BA.debugLineNum = 51380244;BA.debugLine="pnlPrecipitacion.Enabled = False";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=51380245;
 //BA.debugLineNum = 51380245;BA.debugLine="pnlCosecha.Enabled = False";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=51380246;
 //BA.debugLineNum = 51380246;BA.debugLine="pnlTaller.Enabled = False";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=51380247;
 //BA.debugLineNum = 51380247;BA.debugLine="Panel1Precipitacion2.Visible = False";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=51380248;
 //BA.debugLineNum = 51380248;BA.debugLine="pnlPrograma_de_labores.Visible = False";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=51380249;
 //BA.debugLineNum = 51380249;BA.debugLine="pnlPrecipitacion.Visible = False";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=51380250;
 //BA.debugLineNum = 51380250;BA.debugLine="pnlCosecha.Visible = False";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=51380251;
 //BA.debugLineNum = 51380251;BA.debugLine="pnlTaller.Visible = False";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=51380254;
 //BA.debugLineNum = 51380254;BA.debugLine="PnlMaquinaria.Enabled = True";
__ref._pnlmaquinaria /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=51380257;
 //BA.debugLineNum = 51380257;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
RDebugUtils.currentLine=51249152;
 //BA.debugLineNum = 51249152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=51249153;
 //BA.debugLineNum = 51249153;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=51249154;
 //BA.debugLineNum = 51249154;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=51249155;
 //BA.debugLineNum = 51249155;BA.debugLine="Private Panel1Precipitacion2 As B4XView";
_panel1precipitacion2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=51249156;
 //BA.debugLineNum = 51249156;BA.debugLine="Private pnlPrograma_de_labores As B4XView";
_pnlprograma_de_labores = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=51249157;
 //BA.debugLineNum = 51249157;BA.debugLine="Private pnlPrecipitacion As B4XView";
_pnlprecipitacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=51249158;
 //BA.debugLineNum = 51249158;BA.debugLine="Private pnlCosecha As B4XView";
_pnlcosecha = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=51249159;
 //BA.debugLineNum = 51249159;BA.debugLine="Private pnlTaller As B4XView";
_pnltaller = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=51249160;
 //BA.debugLineNum = 51249160;BA.debugLine="Private pnlPersonal As B4XView";
_pnlpersonal = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=51249161;
 //BA.debugLineNum = 51249161;BA.debugLine="Private PnlMaquinaria As B4XView";
_pnlmaquinaria = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=51249162;
 //BA.debugLineNum = 51249162;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=51249166;
 //BA.debugLineNum = 51249166;BA.debugLine="End Sub";
return "";
}
public String  _panel3_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "panel3_click", false))
	 {return ((String) Debug.delegate(ba, "panel3_click", null));}
RDebugUtils.currentLine=51838976;
 //BA.debugLineNum = 51838976;BA.debugLine="Private Sub Panel3_Click";
RDebugUtils.currentLine=51838977;
 //BA.debugLineNum = 51838977;BA.debugLine="B4XPages.ShowPage(\"ListLabores\")";
_b4xpages._showpage /*String*/ (ba,"ListLabores");
RDebugUtils.currentLine=51838978;
 //BA.debugLineNum = 51838978;BA.debugLine="End Sub";
return "";
}
public String  _pnlcosecha_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlcosecha_click", false))
	 {return ((String) Debug.delegate(ba, "pnlcosecha_click", null));}
RDebugUtils.currentLine=51642368;
 //BA.debugLineNum = 51642368;BA.debugLine="Private Sub pnlCosecha_Click";
RDebugUtils.currentLine=51642370;
 //BA.debugLineNum = 51642370;BA.debugLine="End Sub";
return "";
}
public String  _pnlmaquinaria_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlmaquinaria_click", false))
	 {return ((String) Debug.delegate(ba, "pnlmaquinaria_click", null));}
RDebugUtils.currentLine=51445760;
 //BA.debugLineNum = 51445760;BA.debugLine="Private Sub PnlMaquinaria_Click";
RDebugUtils.currentLine=51445762;
 //BA.debugLineNum = 51445762;BA.debugLine="B4XPages.ShowPage(\"FormLabores\")";
_b4xpages._showpage /*String*/ (ba,"FormLabores");
RDebugUtils.currentLine=51445763;
 //BA.debugLineNum = 51445763;BA.debugLine="End Sub";
return "";
}
public String  _pnlpersonal_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlpersonal_click", false))
	 {return ((String) Debug.delegate(ba, "pnlpersonal_click", null));}
RDebugUtils.currentLine=51511296;
 //BA.debugLineNum = 51511296;BA.debugLine="Private Sub pnlPersonal_Click";
RDebugUtils.currentLine=51511298;
 //BA.debugLineNum = 51511298;BA.debugLine="B4XPages.ShowPage(\"ListPerson\")";
_b4xpages._showpage /*String*/ (ba,"ListPerson");
RDebugUtils.currentLine=51511300;
 //BA.debugLineNum = 51511300;BA.debugLine="End Sub";
return "";
}
public String  _pnlprecipitacion_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlprecipitacion_click", false))
	 {return ((String) Debug.delegate(ba, "pnlprecipitacion_click", null));}
RDebugUtils.currentLine=51707904;
 //BA.debugLineNum = 51707904;BA.debugLine="Private Sub pnlPrecipitacion_Click";
RDebugUtils.currentLine=51707905;
 //BA.debugLineNum = 51707905;BA.debugLine="B4XPages.ShowPage(\"FormPrecipitacion\")";
_b4xpages._showpage /*String*/ (ba,"FormPrecipitacion");
RDebugUtils.currentLine=51707906;
 //BA.debugLineNum = 51707906;BA.debugLine="End Sub";
return "";
}
public String  _pnlprograma_de_labores_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlprograma_de_labores_click", false))
	 {return ((String) Debug.delegate(ba, "pnlprograma_de_labores_click", null));}
RDebugUtils.currentLine=51773440;
 //BA.debugLineNum = 51773440;BA.debugLine="Private Sub pnlPrograma_de_labores_Click";
RDebugUtils.currentLine=51773441;
 //BA.debugLineNum = 51773441;BA.debugLine="B4XPages.ShowPage(\"listDados\")";
_b4xpages._showpage /*String*/ (ba,"listDados");
RDebugUtils.currentLine=51773443;
 //BA.debugLineNum = 51773443;BA.debugLine="End Sub";
return "";
}
public String  _pnltaller_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnltaller_click", false))
	 {return ((String) Debug.delegate(ba, "pnltaller_click", null));}
RDebugUtils.currentLine=51576832;
 //BA.debugLineNum = 51576832;BA.debugLine="Private Sub pnlTaller_Click";
RDebugUtils.currentLine=51576833;
 //BA.debugLineNum = 51576833;BA.debugLine="B4XPages.ShowPage(\"FormMaquinaria\")";
_b4xpages._showpage /*String*/ (ba,"FormMaquinaria");
RDebugUtils.currentLine=51576834;
 //BA.debugLineNum = 51576834;BA.debugLine="End Sub";
return "";
}
}