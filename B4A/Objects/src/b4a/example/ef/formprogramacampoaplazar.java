package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formprogramacampoaplazar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formprogramacampoaplazar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.formprogramacampoaplazar.class).invoke(this, new Object[] {null});
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
public String _rdclink = "";
public String _miconsecutivo = "";
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public String _observacion = "";
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public String _fecha = "";
public String _area = "";
public ADR.stringdemo.stringfunctions _sf = null;
public anywheresoftware.b4a.objects.LabelWrapper _label11 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel20 = null;
public String _fecha_programa_laborantes = "";
public String _area_programa_laborantes = "";
public String _observacionantes = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.formprogramacampoaplazar __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formprogramacampoaplazar __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=20250632;
 //BA.debugLineNum = 20250632;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=20250635;
 //BA.debugLineNum = 20250635;BA.debugLine="Label11.Text = formattedDate";
__ref._label11 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=20250638;
 //BA.debugLineNum = 20250638;BA.debugLine="Panel20.Visible = False";
__ref._panel20 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=20250641;
 //BA.debugLineNum = 20250641;BA.debugLine="fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=20250644;
 //BA.debugLineNum = 20250644;BA.debugLine="Log(fecha)";
__c.LogImpl("320250644",__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=20250645;
 //BA.debugLineNum = 20250645;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.formprogramacampoaplazar __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="Root.LoadLayout(\"FormLaboresCampoA\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FormLaboresCampoA",ba);
RDebugUtils.currentLine=20054023;
 //BA.debugLineNum = 20054023;BA.debugLine="End Sub";
return "";
}
public void  _button1_click(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {Debug.delegate(ba, "button1_click", null); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formprogramacampoaplazar parent,b4a.example.ef.formprogramacampoaplazar __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formprogramacampoaplazar __ref;
b4a.example.ef.formprogramacampoaplazar parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formprogramacampoaplazar";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="Log(\"El consecutivo: \"&Label8.Text)";
parent.__c.LogImpl("320447233","El consecutivo: "+__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=20447271;
 //BA.debugLineNum = 20447271;BA.debugLine="Log(\"Fecha_Programa_LaborAntes: \" & Fecha_Program";
parent.__c.LogImpl("320447271","Fecha_Programa_LaborAntes: "+__ref._fecha_programa_laborantes /*String*/ ,0);
RDebugUtils.currentLine=20447272;
 //BA.debugLineNum = 20447272;BA.debugLine="Log(\"Area_Programa_LaborAntes: \" & Area_Programa_";
parent.__c.LogImpl("320447272","Area_Programa_LaborAntes: "+__ref._area_programa_laborantes /*String*/ ,0);
RDebugUtils.currentLine=20447273;
 //BA.debugLineNum = 20447273;BA.debugLine="Log(\"ObservacionAntes: \"& ObservacionAntes)";
parent.__c.LogImpl("320447273","ObservacionAntes: "+__ref._observacionantes /*String*/ ,0);
RDebugUtils.currentLine=20447274;
 //BA.debugLineNum = 20447274;BA.debugLine="Log(\"FECHA: \"&fecha)";
parent.__c.LogImpl("320447274","FECHA: "+__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=20447275;
 //BA.debugLineNum = 20447275;BA.debugLine="Log(\"AREA: \"&area)";
parent.__c.LogImpl("320447275","AREA: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=20447276;
 //BA.debugLineNum = 20447276;BA.debugLine="Log(\"OBSERVACION: \"&Observacion)";
parent.__c.LogImpl("320447276","OBSERVACION: "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=20447278;
 //BA.debugLineNum = 20447278;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=20447279;
 //BA.debugLineNum = 20447279;BA.debugLine="If (sf.Trim(fecha) = \"\" Or sf.Trim(area) = \"\" ) T";
if (true) break;

case 1:
//if
this.state = 25;
if (((__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(__ref._fecha /*String*/ )).equals("") || (__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(__ref._area /*String*/ )).equals(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 25;
RDebugUtils.currentLine=20447280;
 //BA.debugLineNum = 20447280;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Tienes algun campo vacio"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=20447282;
 //BA.debugLineNum = 20447282;BA.debugLine="If (sf.Trim(Observacion) = \"\") Then";
if (true) break;

case 6:
//if
this.state = 9;
if (((__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(__ref._observacion /*String*/ )).equals(""))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=20447283;
 //BA.debugLineNum = 20447283;BA.debugLine="Observacion = \"N/A\"";
__ref._observacion /*String*/  = "N/A";
 if (true) break;
;
RDebugUtils.currentLine=20447285;
 //BA.debugLineNum = 20447285;BA.debugLine="If (sf.Trim(ObservacionAntes) = \"\") Then";

case 9:
//if
this.state = 12;
if (((__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(__ref._observacionantes /*String*/ )).equals(""))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=20447286;
 //BA.debugLineNum = 20447286;BA.debugLine="ObservacionAntes = \"N/A\"";
__ref._observacionantes /*String*/  = "N/A";
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=20447290;
 //BA.debugLineNum = 20447290;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"programa_labores_aplazar",new Object[]{(Object)(__ref._fecha_programa_laborantes /*String*/ ),(Object)(__ref._area_programa_laborantes /*String*/ ),(Object)(__ref._observacionantes /*String*/ ),(Object)(__ref._fecha /*String*/ ),(Object)(__ref._area /*String*/ ),(Object)(__ref._observacion /*String*/ ),(Object)("Aplazada"),(Object)(__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText())});
RDebugUtils.currentLine=20447292;
 //BA.debugLineNum = 20447292;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=20447293;
 //BA.debugLineNum = 20447293;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprogramacampoaplazar", "button1_click"), (Object)(_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=20447295;
 //BA.debugLineNum = 20447295;BA.debugLine="Try";
if (true) break;

case 13:
//try
this.state = 24;
this.catchState = 23;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 23;
RDebugUtils.currentLine=20447296;
 //BA.debugLineNum = 20447296;BA.debugLine="If j.Success Then";
if (true) break;

case 16:
//if
this.state = 21;
if (_j._success /*boolean*/ ) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=20447297;
 //BA.debugLineNum = 20447297;BA.debugLine="MsgboxAsync(\"Se ha aplazado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha aplazado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=20447299;
 //BA.debugLineNum = 20447299;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
parent.__c.LogImpl("320447299","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=20447302;
 //BA.debugLineNum = 20447302;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
parent.__c.LogImpl("320447302","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=20447307;
 //BA.debugLineNum = 20447307;BA.debugLine="End Sub";
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
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formprogramacampoaplazar __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=20578310;
 //BA.debugLineNum = 20578310;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="Private MiConsecutivo As String";
_miconsecutivo = "";
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19857414;
 //BA.debugLineNum = 19857414;BA.debugLine="Dim Observacion As String";
_observacion = "";
RDebugUtils.currentLine=19857415;
 //BA.debugLineNum = 19857415;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=19857416;
 //BA.debugLineNum = 19857416;BA.debugLine="Dim fecha As String";
_fecha = "";
RDebugUtils.currentLine=19857417;
 //BA.debugLineNum = 19857417;BA.debugLine="Dim area As String";
_area = "";
RDebugUtils.currentLine=19857419;
 //BA.debugLineNum = 19857419;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=19857420;
 //BA.debugLineNum = 19857420;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19857421;
 //BA.debugLineNum = 19857421;BA.debugLine="Private Panel20 As Panel";
_panel20 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=19857424;
 //BA.debugLineNum = 19857424;BA.debugLine="Dim Fecha_Programa_LaborAntes As String";
_fecha_programa_laborantes = "";
RDebugUtils.currentLine=19857426;
 //BA.debugLineNum = 19857426;BA.debugLine="Dim Area_Programa_LaborAntes As String";
_area_programa_laborantes = "";
RDebugUtils.currentLine=19857427;
 //BA.debugLineNum = 19857427;BA.debugLine="Dim ObservacionAntes As String";
_observacionantes = "";
RDebugUtils.currentLine=19857428;
 //BA.debugLineNum = 19857428;BA.debugLine="End Sub";
return "";
}
public String  _edittext1_textchanged(b4a.example.ef.formprogramacampoaplazar __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "edittext1_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="area = New";
__ref._area /*String*/  = _new;
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="Log(\"EL area nueva es: \"& area)";
__c.LogImpl("320316163","EL area nueva es: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="End Sub";
return "";
}
public String  _edittext3_textchanged(b4a.example.ef.formprogramacampoaplazar __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "edittext3_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Observacion = New";
__ref._observacion /*String*/  = _new;
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="Log(\"la observacion es \" & Observacion)";
__c.LogImpl("320381699","la observacion es "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="End Sub";
return "";
}
public String  _label11_click(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "label11_click", false))
	 {return ((String) Debug.delegate(ba, "label11_click", null));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Private Sub Label11_Click";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="Panel20.Visible = True";
__ref._panel20 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="End Sub";
return "";
}
public String  _panel20_click(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "panel20_click", false))
	 {return ((String) Debug.delegate(ba, "panel20_click", null));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Private Sub Panel20_Click";
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="End Sub";
return "";
}
public String  _setconsecutivo(b4a.example.ef.formprogramacampoaplazar __ref,String _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "setconsecutivo", false))
	 {return ((String) Debug.delegate(ba, "setconsecutivo", new Object[] {_valor}));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="MiConsecutivo = Valor";
__ref._miconsecutivo /*String*/  = _valor;
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="If Label8.IsInitialized Then";
if (__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="Label8.Text = MiConsecutivo";
__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._miconsecutivo /*String*/ ));
 };
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="End Sub";
return "";
}
}