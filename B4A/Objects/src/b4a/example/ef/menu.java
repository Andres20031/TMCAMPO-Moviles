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
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If Main.pNit = \"890307964\" Then";
if ((_main._pnit /*String*/ ).equals("890307964")) { 
 };
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.menu __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="utilClass.SetStatusBarColor(Colors.White, 0xB4008";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="Root.LoadLayout(\"menu\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("menu",ba);
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="Panel1Precipitacion2.Enabled = True";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="pnlPrograma_de_labores.Enabled = True";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="pnlPrecipitacion.Enabled = True";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="pnlCosecha.Enabled = True";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="pnlTaller.Enabled = True";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="PnlMaquinaria.Enabled = True";
__ref._pnlmaquinaria /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="If Main.pNit = \"890307964\" Then";
if ((_main._pnit /*String*/ ).equals("890307964")) { 
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="Panel1Precipitacion2.Enabled = False";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="pnlPrograma_de_labores.Enabled = False";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="pnlPrecipitacion.Enabled = False";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="pnlCosecha.Enabled = False";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=1638422;
 //BA.debugLineNum = 1638422;BA.debugLine="pnlTaller.Enabled = False";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=1638423;
 //BA.debugLineNum = 1638423;BA.debugLine="Panel1Precipitacion2.Visible = False";
__ref._panel1precipitacion2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1638424;
 //BA.debugLineNum = 1638424;BA.debugLine="pnlPrograma_de_labores.Visible = False";
__ref._pnlprograma_de_labores /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1638425;
 //BA.debugLineNum = 1638425;BA.debugLine="pnlPrecipitacion.Visible = False";
__ref._pnlprecipitacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1638426;
 //BA.debugLineNum = 1638426;BA.debugLine="pnlCosecha.Visible = False";
__ref._pnlcosecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1638427;
 //BA.debugLineNum = 1638427;BA.debugLine="pnlTaller.Visible = False";
__ref._pnltaller /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1638430;
 //BA.debugLineNum = 1638430;BA.debugLine="PnlMaquinaria.Enabled = True";
__ref._pnlmaquinaria /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=1638433;
 //BA.debugLineNum = 1638433;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Private Panel1Precipitacion2 As B4XView";
_panel1precipitacion2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Private pnlPrograma_de_labores As B4XView";
_pnlprograma_de_labores = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Private pnlPrecipitacion As B4XView";
_pnlprecipitacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Private pnlCosecha As B4XView";
_pnlcosecha = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Private pnlTaller As B4XView";
_pnltaller = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Private pnlPersonal As B4XView";
_pnlpersonal = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="Private PnlMaquinaria As B4XView";
_pnlmaquinaria = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="End Sub";
return "";
}
public String  _panel1precipitacion2_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "panel1precipitacion2_click", false))
	 {return ((String) Debug.delegate(ba, "panel1precipitacion2_click", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub Panel1Precipitacion2_Click";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public String  _pnlcosecha_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlcosecha_click", false))
	 {return ((String) Debug.delegate(ba, "pnlcosecha_click", null));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub pnlCosecha_Click";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public String  _pnlmaquinaria_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlmaquinaria_click", false))
	 {return ((String) Debug.delegate(ba, "pnlmaquinaria_click", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub PnlMaquinaria_Click";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="B4XPages.ShowPage(\"FormLabores\")";
_b4xpages._showpage /*String*/ (ba,"FormLabores");
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
public String  _pnlpersonal_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlpersonal_click", false))
	 {return ((String) Debug.delegate(ba, "pnlpersonal_click", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub pnlPersonal_Click";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="B4XPages.ShowPage(\"ListPerson\")";
_b4xpages._showpage /*String*/ (ba,"ListPerson");
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="End Sub";
return "";
}
public String  _pnlprecipitacion_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlprecipitacion_click", false))
	 {return ((String) Debug.delegate(ba, "pnlprecipitacion_click", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub pnlPrecipitacion_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="B4XPages.ShowPage(\"FormPrecipitacion\")";
_b4xpages._showpage /*String*/ (ba,"FormPrecipitacion");
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public String  _pnlprograma_de_labores_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnlprograma_de_labores_click", false))
	 {return ((String) Debug.delegate(ba, "pnlprograma_de_labores_click", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub pnlPrograma_de_labores_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="B4XPages.ShowPage(\"listDados\")";
_b4xpages._showpage /*String*/ (ba,"listDados");
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="End Sub";
return "";
}
public String  _pnltaller_click(b4a.example.ef.menu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menu";
if (Debug.shouldDelegate(ba, "pnltaller_click", false))
	 {return ((String) Debug.delegate(ba, "pnltaller_click", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub pnlTaller_Click";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="B4XPages.ShowPage(\"FormMaquinaria\")";
_b4xpages._showpage /*String*/ (ba,"FormMaquinaria");
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
}