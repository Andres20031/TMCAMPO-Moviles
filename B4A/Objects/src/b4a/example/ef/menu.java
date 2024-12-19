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
public Object  _initialize(b4a.example.ef.menu __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="If Main.pNit = \"890307964\" Then";
if ((_main._pnit /*String*/ ).equals("890307964")) { 
 };
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.menu __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="utilClass.SetStatusBarColor(Colors.White, 0xB4008";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="Root.LoadLayout(\"menu\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("menu",ba);
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="Panel1Precipitacion2.Enabled = True";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="pnlPrograma_de_labores.Enabled = True";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="pnlPrecipitacion.Enabled = True";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="pnlCosecha.Enabled = True";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=5636110;
 //BA.debugLineNum = 5636110;BA.debugLine="pnlTaller.Enabled = True";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=5636111;
 //BA.debugLineNum = 5636111;BA.debugLine="PnlMaquinaria.Enabled = True";
__ref._pnlmaquinaria /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=5636113;
 //BA.debugLineNum = 5636113;BA.debugLine="If Main.pNit = \"890307964\" Then";
if ((_main._pnit /*String*/ ).equals("890307964")) { 
RDebugUtils.currentLine=5636114;
 //BA.debugLineNum = 5636114;BA.debugLine="Panel1Precipitacion2.Enabled = False";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=5636115;
 //BA.debugLineNum = 5636115;BA.debugLine="pnlPrograma_de_labores.Enabled = False";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=5636116;
 //BA.debugLineNum = 5636116;BA.debugLine="pnlPrecipitacion.Enabled = False";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=5636117;
 //BA.debugLineNum = 5636117;BA.debugLine="pnlCosecha.Enabled = False";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=5636118;
 //BA.debugLineNum = 5636118;BA.debugLine="pnlTaller.Enabled = False";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=5636119;
 //BA.debugLineNum = 5636119;BA.debugLine="Panel1Precipitacion2.Visible = False";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5636120;
 //BA.debugLineNum = 5636120;BA.debugLine="pnlPrograma_de_labores.Visible = False";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5636121;
 //BA.debugLineNum = 5636121;BA.debugLine="pnlPrecipitacion.Visible = False";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5636122;
 //BA.debugLineNum = 5636122;BA.debugLine="pnlCosecha.Visible = False";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5636123;
 //BA.debugLineNum = 5636123;BA.debugLine="pnlTaller.Visible = False";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5636126;
 //BA.debugLineNum = 5636126;BA.debugLine="PnlMaquinaria.Enabled = True";
__ref._pnlmaquinaria /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=5636129;
 //BA.debugLineNum = 5636129;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Private Panel1Precipitacion2 As B4XView";
_panel1precipitacion2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="Private pnlPrograma_de_labores As B4XView";
_pnlprograma_de_labores = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="Private pnlPrecipitacion As B4XView";
_pnlprecipitacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Private pnlCosecha As B4XView";
_pnlcosecha = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="Private pnlTaller As B4XView";
_pnltaller = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Private pnlPersonal As B4XView";
_pnlpersonal = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="Private PnlMaquinaria As B4XView";
_pnlmaquinaria = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="End Sub";
return "";
}
public String  _panel1precipitacion2_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "panel1precipitacion2_click", false))
	 {return ((String) Debug.delegate(ba, "panel1precipitacion2_click", null));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub Panel1Precipitacion2_Click";
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return "";
}
public String  _pnlcosecha_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlcosecha_click", false))
	 {return ((String) Debug.delegate(ba, "pnlcosecha_click", null));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub pnlCosecha_Click";
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="End Sub";
return "";
}
public String  _pnlmaquinaria_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlmaquinaria_click", false))
	 {return ((String) Debug.delegate(ba, "pnlmaquinaria_click", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub PnlMaquinaria_Click";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="B4XPages.ShowPage(\"FormLabores\")";
_b4xpages._showpage /*String*/ (ba,"FormLabores");
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="End Sub";
return "";
}
public String  _pnlpersonal_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlpersonal_click", false))
	 {return ((String) Debug.delegate(ba, "pnlpersonal_click", null));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub pnlPersonal_Click";
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="B4XPages.ShowPage(\"ListPerson\")";
_b4xpages._showpage /*String*/ (ba,"ListPerson");
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="End Sub";
return "";
}
public String  _pnlprecipitacion_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlprecipitacion_click", false))
	 {return ((String) Debug.delegate(ba, "pnlprecipitacion_click", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub pnlPrecipitacion_Click";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="B4XPages.ShowPage(\"FormPrecipitacion\")";
_b4xpages._showpage /*String*/ (ba,"FormPrecipitacion");
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
return "";
}
public String  _pnlprograma_de_labores_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlprograma_de_labores_click", false))
	 {return ((String) Debug.delegate(ba, "pnlprograma_de_labores_click", null));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub pnlPrograma_de_labores_Click";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="B4XPages.ShowPage(\"listDados\")";
_b4xpages._showpage /*String*/ (ba,"listDados");
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="End Sub";
return "";
}
public String  _pnltaller_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnltaller_click", false))
	 {return ((String) Debug.delegate(ba, "pnltaller_click", null));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub pnlTaller_Click";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="B4XPages.ShowPage(\"FormMaquinaria\")";
_b4xpages._showpage /*String*/ (ba,"FormMaquinaria");
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
}