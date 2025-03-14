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
RDebugUtils.currentLine=69402624;
 //BA.debugLineNum = 69402624;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=69402625;
 //BA.debugLineNum = 69402625;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=69402626;
 //BA.debugLineNum = 69402626;BA.debugLine="End Sub";
return null;
}
public String  _setconsecutivo(b4a.example.ef.formprogramacampoaplazar __ref,String _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "setconsecutivo", false))
	 {return ((String) Debug.delegate(ba, "setconsecutivo", new Object[] {_valor}));}
RDebugUtils.currentLine=69468160;
 //BA.debugLineNum = 69468160;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
RDebugUtils.currentLine=69468161;
 //BA.debugLineNum = 69468161;BA.debugLine="MiConsecutivo = Valor";
__ref._miconsecutivo /*String*/  = _valor;
RDebugUtils.currentLine=69468162;
 //BA.debugLineNum = 69468162;BA.debugLine="If Label8.IsInitialized Then";
if (__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=69468163;
 //BA.debugLineNum = 69468163;BA.debugLine="Label8.Text = MiConsecutivo";
__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._miconsecutivo /*String*/ ));
 };
RDebugUtils.currentLine=69468165;
 //BA.debugLineNum = 69468165;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formprogramacampoaplazar __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=69730304;
 //BA.debugLineNum = 69730304;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=69730306;
 //BA.debugLineNum = 69730306;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=69730309;
 //BA.debugLineNum = 69730309;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=69730312;
 //BA.debugLineNum = 69730312;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=69730315;
 //BA.debugLineNum = 69730315;BA.debugLine="Label11.Text = formattedDate";
__ref._label11 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=69730318;
 //BA.debugLineNum = 69730318;BA.debugLine="Panel20.Visible = False";
__ref._panel20 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=69730321;
 //BA.debugLineNum = 69730321;BA.debugLine="fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=69730324;
 //BA.debugLineNum = 69730324;BA.debugLine="Log(fecha)";
__c.LogImpl("069730324",__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=69730325;
 //BA.debugLineNum = 69730325;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.formprogramacampoaplazar __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=69533696;
 //BA.debugLineNum = 69533696;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=69533697;
 //BA.debugLineNum = 69533697;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=69533699;
 //BA.debugLineNum = 69533699;BA.debugLine="Root.LoadLayout(\"FormLaboresCampoA\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FormLaboresCampoA",ba);
RDebugUtils.currentLine=69533703;
 //BA.debugLineNum = 69533703;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=69926913;
 //BA.debugLineNum = 69926913;BA.debugLine="Log(\"El consecutivo: \"&Label8.Text)";
parent.__c.LogImpl("069926913","El consecutivo: "+__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=69926915;
 //BA.debugLineNum = 69926915;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=69926916;
 //BA.debugLineNum = 69926916;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=69926951;
 //BA.debugLineNum = 69926951;BA.debugLine="Log(\"Fecha_Programa_LaborAntes: \" & Fecha_Program";
parent.__c.LogImpl("069926951","Fecha_Programa_LaborAntes: "+__ref._fecha_programa_laborantes /*String*/ ,0);
RDebugUtils.currentLine=69926952;
 //BA.debugLineNum = 69926952;BA.debugLine="Log(\"Area_Programa_LaborAntes: \" & Area_Programa_";
parent.__c.LogImpl("069926952","Area_Programa_LaborAntes: "+__ref._area_programa_laborantes /*String*/ ,0);
RDebugUtils.currentLine=69926953;
 //BA.debugLineNum = 69926953;BA.debugLine="Log(\"ObservacionAntes: \"& ObservacionAntes)";
parent.__c.LogImpl("069926953","ObservacionAntes: "+__ref._observacionantes /*String*/ ,0);
RDebugUtils.currentLine=69926954;
 //BA.debugLineNum = 69926954;BA.debugLine="Log(\"FECHA: \"&fecha)";
parent.__c.LogImpl("069926954","FECHA: "+__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=69926955;
 //BA.debugLineNum = 69926955;BA.debugLine="Log(\"AREA: \"&area)";
parent.__c.LogImpl("069926955","AREA: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=69926956;
 //BA.debugLineNum = 69926956;BA.debugLine="Log(\"OBSERVACION: \"&Observacion)";
parent.__c.LogImpl("069926956","OBSERVACION: "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=69926958;
 //BA.debugLineNum = 69926958;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=69926959;
 //BA.debugLineNum = 69926959;BA.debugLine="If (sf.Trim(fecha) = \"\" Or sf.Trim(area) = \"\" ) T";
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
RDebugUtils.currentLine=69926960;
 //BA.debugLineNum = 69926960;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Tienes algun campo vacio"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=69926962;
 //BA.debugLineNum = 69926962;BA.debugLine="If (sf.Trim(Observacion) = \"\") Then";
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
RDebugUtils.currentLine=69926963;
 //BA.debugLineNum = 69926963;BA.debugLine="Observacion = \"N/A\"";
__ref._observacion /*String*/  = "N/A";
 if (true) break;
;
RDebugUtils.currentLine=69926965;
 //BA.debugLineNum = 69926965;BA.debugLine="If (sf.Trim(ObservacionAntes) = \"\") Then";

case 9:
//if
this.state = 12;
if (((__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(__ref._observacionantes /*String*/ )).equals(""))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=69926966;
 //BA.debugLineNum = 69926966;BA.debugLine="ObservacionAntes = \"N/A\"";
__ref._observacionantes /*String*/  = "N/A";
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=69926970;
 //BA.debugLineNum = 69926970;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"programa_labores_aplazar",new Object[]{(Object)(__ref._fecha_programa_laborantes /*String*/ ),(Object)(__ref._area_programa_laborantes /*String*/ ),(Object)(__ref._observacionantes /*String*/ ),(Object)(__ref._fecha /*String*/ ),(Object)(__ref._area /*String*/ ),(Object)(__ref._observacion /*String*/ ),(Object)("Aplazada"),(Object)(123456)});
RDebugUtils.currentLine=69926972;
 //BA.debugLineNum = 69926972;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=69926973;
 //BA.debugLineNum = 69926973;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprogramacampoaplazar", "button1_click"), (Object)(_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=69926975;
 //BA.debugLineNum = 69926975;BA.debugLine="Try";
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
RDebugUtils.currentLine=69926976;
 //BA.debugLineNum = 69926976;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=69926977;
 //BA.debugLineNum = 69926977;BA.debugLine="MsgboxAsync(\"Se ha aplazado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha aplazado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=69926979;
 //BA.debugLineNum = 69926979;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
parent.__c.LogImpl("069926979","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=69926982;
 //BA.debugLineNum = 69926982;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
parent.__c.LogImpl("069926982","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
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
RDebugUtils.currentLine=69926987;
 //BA.debugLineNum = 69926987;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=70057984;
 //BA.debugLineNum = 70057984;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=70057985;
 //BA.debugLineNum = 70057985;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=70057986;
 //BA.debugLineNum = 70057986;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=70057987;
 //BA.debugLineNum = 70057987;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=70057988;
 //BA.debugLineNum = 70057988;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=70057989;
 //BA.debugLineNum = 70057989;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=70057990;
 //BA.debugLineNum = 70057990;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
RDebugUtils.currentLine=69337088;
 //BA.debugLineNum = 69337088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=69337089;
 //BA.debugLineNum = 69337089;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=69337090;
 //BA.debugLineNum = 69337090;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=69337091;
 //BA.debugLineNum = 69337091;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=69337092;
 //BA.debugLineNum = 69337092;BA.debugLine="Private MiConsecutivo As String";
_miconsecutivo = "";
RDebugUtils.currentLine=69337093;
 //BA.debugLineNum = 69337093;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=69337094;
 //BA.debugLineNum = 69337094;BA.debugLine="Dim Observacion As String";
_observacion = "";
RDebugUtils.currentLine=69337095;
 //BA.debugLineNum = 69337095;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=69337096;
 //BA.debugLineNum = 69337096;BA.debugLine="Dim fecha As String";
_fecha = "";
RDebugUtils.currentLine=69337097;
 //BA.debugLineNum = 69337097;BA.debugLine="Dim area As String";
_area = "";
RDebugUtils.currentLine=69337099;
 //BA.debugLineNum = 69337099;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=69337100;
 //BA.debugLineNum = 69337100;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=69337101;
 //BA.debugLineNum = 69337101;BA.debugLine="Private Panel20 As Panel";
_panel20 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=69337104;
 //BA.debugLineNum = 69337104;BA.debugLine="Dim Fecha_Programa_LaborAntes As String";
_fecha_programa_laborantes = "";
RDebugUtils.currentLine=69337106;
 //BA.debugLineNum = 69337106;BA.debugLine="Dim Area_Programa_LaborAntes As String";
_area_programa_laborantes = "";
RDebugUtils.currentLine=69337107;
 //BA.debugLineNum = 69337107;BA.debugLine="Dim ObservacionAntes As String";
_observacionantes = "";
RDebugUtils.currentLine=69337108;
 //BA.debugLineNum = 69337108;BA.debugLine="End Sub";
return "";
}
public String  _edittext1_textchanged(b4a.example.ef.formprogramacampoaplazar __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "edittext1_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=69795840;
 //BA.debugLineNum = 69795840;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
RDebugUtils.currentLine=69795841;
 //BA.debugLineNum = 69795841;BA.debugLine="area = New";
__ref._area /*String*/  = _new;
RDebugUtils.currentLine=69795843;
 //BA.debugLineNum = 69795843;BA.debugLine="Log(\"EL area nueva es: \"& area)";
__c.LogImpl("069795843","EL area nueva es: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=69795844;
 //BA.debugLineNum = 69795844;BA.debugLine="End Sub";
return "";
}
public String  _edittext3_textchanged(b4a.example.ef.formprogramacampoaplazar __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "edittext3_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=69861376;
 //BA.debugLineNum = 69861376;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
RDebugUtils.currentLine=69861377;
 //BA.debugLineNum = 69861377;BA.debugLine="Observacion = New";
__ref._observacion /*String*/  = _new;
RDebugUtils.currentLine=69861379;
 //BA.debugLineNum = 69861379;BA.debugLine="Log(\"la observacion es \" & Observacion)";
__c.LogImpl("069861379","la observacion es "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=69861380;
 //BA.debugLineNum = 69861380;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=69599232;
 //BA.debugLineNum = 69599232;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=69599233;
 //BA.debugLineNum = 69599233;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=69599234;
 //BA.debugLineNum = 69599234;BA.debugLine="End Sub";
return "";
}
public String  _label11_click(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "label11_click", false))
	 {return ((String) Debug.delegate(ba, "label11_click", null));}
RDebugUtils.currentLine=69664768;
 //BA.debugLineNum = 69664768;BA.debugLine="Private Sub Label11_Click";
RDebugUtils.currentLine=69664769;
 //BA.debugLineNum = 69664769;BA.debugLine="Panel20.Visible = True";
__ref._panel20 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=69664770;
 //BA.debugLineNum = 69664770;BA.debugLine="End Sub";
return "";
}
public String  _panel20_click(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "panel20_click", false))
	 {return ((String) Debug.delegate(ba, "panel20_click", null));}
RDebugUtils.currentLine=69992448;
 //BA.debugLineNum = 69992448;BA.debugLine="Private Sub Panel20_Click";
RDebugUtils.currentLine=69992450;
 //BA.debugLineNum = 69992450;BA.debugLine="End Sub";
return "";
}
}