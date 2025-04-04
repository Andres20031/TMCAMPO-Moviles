package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formprogramacampo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formprogramacampo");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.formprogramacampo.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public String _rdclink = "";
public anywheresoftware.b4a.objects.PanelWrapper _panel7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label9 = null;
public String _miconsecutivo = "";
public String _fechainicio = "";
public String _fechafin = "";
public String _area = "";
public String _observacion = "";
public anywheresoftware.b4a.objects.PanelWrapper _panel8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label11 = null;
public ADR.stringdemo.stringfunctions _sf = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.formprogramacampo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="End Sub";
return null;
}
public String  _setconsecutivo(b4a.example.ef.formprogramacampo __ref,String _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "setconsecutivo", false))
	 {return ((String) Debug.delegate(ba, "setconsecutivo", new Object[] {_valor}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="MiConsecutivo = Valor";
__ref._miconsecutivo /*String*/  = _valor;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="If Label8.IsInitialized Then";
if (__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="Label8.Text = MiConsecutivo";
__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._miconsecutivo /*String*/ ));
 };
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formprogramacampo __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="Label9.Text = formattedDate";
__ref._label9 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=3473422;
 //BA.debugLineNum = 3473422;BA.debugLine="Panel7.Visible = False";
__ref._panel7 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="fechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=3473428;
 //BA.debugLineNum = 3473428;BA.debugLine="Log(fechaInicio)";
__c.LogImpl("43473428",__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=3473429;
 //BA.debugLineNum = 3473429;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formprogramacampo __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="Label11.Text = formattedDate";
__ref._label11 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=3604494;
 //BA.debugLineNum = 3604494;BA.debugLine="Panel8.Visible = False";
__ref._panel8 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3604497;
 //BA.debugLineNum = 3604497;BA.debugLine="fechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=3604500;
 //BA.debugLineNum = 3604500;BA.debugLine="Log(fechaFin)";
__c.LogImpl("43604500",__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=3604501;
 //BA.debugLineNum = 3604501;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.formprogramacampo __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Root.LoadLayout(\"FormLaboresCampo\") ' Carga el di";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FormLaboresCampo",ba);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="End Sub";
return "";
}
public void  _button1_click(b4a.example.ef.formprogramacampo __ref) throws Exception{
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {Debug.delegate(ba, "button1_click", null); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formprogramacampo parent,b4a.example.ef.formprogramacampo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formprogramacampo __ref;
b4a.example.ef.formprogramacampo parent;
String _horasistema = "";
long _fecha = 0L;
String _fechaactual = "";
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formprogramacampo";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
_horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim fecha As Long = DateTime.Now";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Dim fechaActual As String = DateTime.Date(fecha)";
_fechaactual = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="Log (\"FECHA DE INICIO: \"&fechaInicio)";
parent.__c.LogImpl("43342343","FECHA DE INICIO: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="Log (\"FECHA DE FIN: \"&fechaFin)";
parent.__c.LogImpl("43342344","FECHA DE FIN: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="Log (\"AREA: \"&area)";
parent.__c.LogImpl("43342345","AREA: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="Log (\"OBSERVACION: \"&Observacion)";
parent.__c.LogImpl("43342346","OBSERVACION: "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("43342347","fechaActual: "+_fechaactual,0);
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("43342348","horaSistema: "+_horasistema,0);
RDebugUtils.currentLine=3342350;
 //BA.debugLineNum = 3342350;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=3342351;
 //BA.debugLineNum = 3342351;BA.debugLine="If (sf.Trim(fechaInicio) = \"\" Or sf.Trim(fechaFin";
if (true) break;

case 1:
//if
this.state = 22;
if (((__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(__ref._fechainicio /*String*/ )).equals("") || (__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(__ref._fechafin /*String*/ )).equals("") || (__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(__ref._area /*String*/ )).equals(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 22;
RDebugUtils.currentLine=3342352;
 //BA.debugLineNum = 3342352;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Tienes algun campo vacio"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3342354;
 //BA.debugLineNum = 3342354;BA.debugLine="If (sf.Trim(Observacion) = \"\") Then";
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
RDebugUtils.currentLine=3342355;
 //BA.debugLineNum = 3342355;BA.debugLine="Observacion = \"N/A\"";
__ref._observacion /*String*/  = "N/A";
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=3342358;
 //BA.debugLineNum = 3342358;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=3342359;
 //BA.debugLineNum = 3342359;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=3342362;
 //BA.debugLineNum = 3342362;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"programa_labores_Update",new Object[]{(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._area /*String*/ ),(Object)(__ref._observacion /*String*/ ),(Object)(_fechaactual),(Object)(_horasistema),(Object)("Terminada"),(Object)(__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText())});
RDebugUtils.currentLine=3342364;
 //BA.debugLineNum = 3342364;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=3342365;
 //BA.debugLineNum = 3342365;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprogramacampo", "button1_click"), (Object)(_j));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=3342367;
 //BA.debugLineNum = 3342367;BA.debugLine="Try";
if (true) break;

case 10:
//try
this.state = 21;
this.catchState = 20;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 20;
RDebugUtils.currentLine=3342368;
 //BA.debugLineNum = 3342368;BA.debugLine="If j.Success Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_j._success /*boolean*/ ) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=3342369;
 //BA.debugLineNum = 3342369;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=3342371;
 //BA.debugLineNum = 3342371;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
parent.__c.LogImpl("43342371","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
RDebugUtils.currentLine=3342374;
 //BA.debugLineNum = 3342374;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
parent.__c.LogImpl("43342374","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=3342378;
 //BA.debugLineNum = 3342378;BA.debugLine="End Sub";
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
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formprogramacampo __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.formprogramacampo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Private Panel7 As Panel";
_panel7 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="Private Label9 As Label";
_label9 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Private MiConsecutivo As String";
_miconsecutivo = "";
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="Dim fechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="Dim fechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="Dim area As String";
_area = "";
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="Dim Observacion As String";
_observacion = "";
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="Private Panel8 As Panel";
_panel8 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="End Sub";
return "";
}
public String  _edittextarea_textchanged(b4a.example.ef.formprogramacampo __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "edittextarea_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextarea_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub EditTextArea_TextChanged (Old As Strin";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="area = New";
__ref._area /*String*/  = _new;
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Log(\"El area es:\" & area)";
__c.LogImpl("43735554","El area es:"+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="End Sub";
return "";
}
public String  _edittextobservacion_textchanged(b4a.example.ef.formprogramacampo __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "edittextobservacion_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextobservacion_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub EditTextObservacion_TextChanged (Old A";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Observacion = New";
__ref._observacion /*String*/  = _new;
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Log(\"La observacion es: \" & Observacion)";
__c.LogImpl("43801091","La observacion es: "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.example.ef.formprogramacampo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public String  _label11_click(b4a.example.ef.formprogramacampo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "label11_click", false))
	 {return ((String) Debug.delegate(ba, "label11_click", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub Label11_Click";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Panel8.Visible = True";
__ref._panel8 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public String  _label9_click(b4a.example.ef.formprogramacampo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "label9_click", false))
	 {return ((String) Debug.delegate(ba, "label9_click", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub Label9_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Panel7.Visible=True";
__ref._panel7 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
}