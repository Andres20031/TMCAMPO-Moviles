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
RDebugUtils.currentLine=52559872;
 //BA.debugLineNum = 52559872;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=52559873;
 //BA.debugLineNum = 52559873;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=52559874;
 //BA.debugLineNum = 52559874;BA.debugLine="End Sub";
return null;
}
public String  _setconsecutivo(b4a.example.ef.formprogramacampo __ref,String _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "setconsecutivo", false))
	 {return ((String) Debug.delegate(ba, "setconsecutivo", new Object[] {_valor}));}
RDebugUtils.currentLine=52625408;
 //BA.debugLineNum = 52625408;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
RDebugUtils.currentLine=52625409;
 //BA.debugLineNum = 52625409;BA.debugLine="MiConsecutivo = Valor";
__ref._miconsecutivo /*String*/  = _valor;
RDebugUtils.currentLine=52625410;
 //BA.debugLineNum = 52625410;BA.debugLine="If Label8.IsInitialized Then";
if (__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=52625411;
 //BA.debugLineNum = 52625411;BA.debugLine="Label8.Text = MiConsecutivo";
__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._miconsecutivo /*String*/ ));
 };
RDebugUtils.currentLine=52625413;
 //BA.debugLineNum = 52625413;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formprogramacampo __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=52887552;
 //BA.debugLineNum = 52887552;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=52887554;
 //BA.debugLineNum = 52887554;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=52887557;
 //BA.debugLineNum = 52887557;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=52887560;
 //BA.debugLineNum = 52887560;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=52887563;
 //BA.debugLineNum = 52887563;BA.debugLine="Label9.Text = formattedDate";
__ref._label9 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=52887566;
 //BA.debugLineNum = 52887566;BA.debugLine="Panel7.Visible = False";
__ref._panel7 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=52887569;
 //BA.debugLineNum = 52887569;BA.debugLine="fechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=52887572;
 //BA.debugLineNum = 52887572;BA.debugLine="Log(fechaInicio)";
__c.LogImpl("052887572",__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=52887573;
 //BA.debugLineNum = 52887573;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formprogramacampo __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=53018624;
 //BA.debugLineNum = 53018624;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
RDebugUtils.currentLine=53018626;
 //BA.debugLineNum = 53018626;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=53018629;
 //BA.debugLineNum = 53018629;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=53018632;
 //BA.debugLineNum = 53018632;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=53018635;
 //BA.debugLineNum = 53018635;BA.debugLine="Label11.Text = formattedDate";
__ref._label11 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=53018638;
 //BA.debugLineNum = 53018638;BA.debugLine="Panel8.Visible = False";
__ref._panel8 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=53018641;
 //BA.debugLineNum = 53018641;BA.debugLine="fechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=53018644;
 //BA.debugLineNum = 53018644;BA.debugLine="Log(fechaFin)";
__c.LogImpl("053018644",__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=53018645;
 //BA.debugLineNum = 53018645;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.formprogramacampo __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=52690944;
 //BA.debugLineNum = 52690944;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=52690945;
 //BA.debugLineNum = 52690945;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=52690946;
 //BA.debugLineNum = 52690946;BA.debugLine="Root.LoadLayout(\"FormLaboresCampo\") ' Carga el di";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FormLaboresCampo",ba);
RDebugUtils.currentLine=52690948;
 //BA.debugLineNum = 52690948;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=52756481;
 //BA.debugLineNum = 52756481;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
_horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=52756482;
 //BA.debugLineNum = 52756482;BA.debugLine="Dim fecha As Long = DateTime.Now";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=52756483;
 //BA.debugLineNum = 52756483;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=52756484;
 //BA.debugLineNum = 52756484;BA.debugLine="Dim fechaActual As String = DateTime.Date(fecha)";
_fechaactual = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=52756486;
 //BA.debugLineNum = 52756486;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=52756487;
 //BA.debugLineNum = 52756487;BA.debugLine="Log (\"FECHA DE INICIO: \"&fechaInicio)";
parent.__c.LogImpl("052756487","FECHA DE INICIO: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=52756488;
 //BA.debugLineNum = 52756488;BA.debugLine="Log (\"FECHA DE FIN: \"&fechaFin)";
parent.__c.LogImpl("052756488","FECHA DE FIN: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=52756489;
 //BA.debugLineNum = 52756489;BA.debugLine="Log (\"AREA: \"&area)";
parent.__c.LogImpl("052756489","AREA: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=52756490;
 //BA.debugLineNum = 52756490;BA.debugLine="Log (\"OBSERVACION: \"&Observacion)";
parent.__c.LogImpl("052756490","OBSERVACION: "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=52756491;
 //BA.debugLineNum = 52756491;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("052756491","fechaActual: "+_fechaactual,0);
RDebugUtils.currentLine=52756492;
 //BA.debugLineNum = 52756492;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("052756492","horaSistema: "+_horasistema,0);
RDebugUtils.currentLine=52756494;
 //BA.debugLineNum = 52756494;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=52756495;
 //BA.debugLineNum = 52756495;BA.debugLine="If (sf.Trim(fechaInicio) = \"\" Or sf.Trim(fechaFin";
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
RDebugUtils.currentLine=52756496;
 //BA.debugLineNum = 52756496;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Tienes algun campo vacio"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=52756498;
 //BA.debugLineNum = 52756498;BA.debugLine="If (sf.Trim(Observacion) = \"\") Then";
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
RDebugUtils.currentLine=52756499;
 //BA.debugLineNum = 52756499;BA.debugLine="Observacion = \"N/A\"";
__ref._observacion /*String*/  = "N/A";
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=52756502;
 //BA.debugLineNum = 52756502;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=52756503;
 //BA.debugLineNum = 52756503;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=52756506;
 //BA.debugLineNum = 52756506;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"programa_labores_Update",new Object[]{(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._area /*String*/ ),(Object)(__ref._observacion /*String*/ ),(Object)(_fechaactual),(Object)(_horasistema),(Object)("Terminada"),(Object)(__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText())});
RDebugUtils.currentLine=52756508;
 //BA.debugLineNum = 52756508;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=52756509;
 //BA.debugLineNum = 52756509;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprogramacampo", "button1_click"), (Object)(_j));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=52756511;
 //BA.debugLineNum = 52756511;BA.debugLine="Try";
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
RDebugUtils.currentLine=52756512;
 //BA.debugLineNum = 52756512;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=52756513;
 //BA.debugLineNum = 52756513;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=52756515;
 //BA.debugLineNum = 52756515;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
parent.__c.LogImpl("052756515","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=52756518;
 //BA.debugLineNum = 52756518;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
parent.__c.LogImpl("052756518","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
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
RDebugUtils.currentLine=52756522;
 //BA.debugLineNum = 52756522;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=53280768;
 //BA.debugLineNum = 53280768;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=53280769;
 //BA.debugLineNum = 53280769;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=53280770;
 //BA.debugLineNum = 53280770;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=53280771;
 //BA.debugLineNum = 53280771;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=53280772;
 //BA.debugLineNum = 53280772;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=53280773;
 //BA.debugLineNum = 53280773;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=53280774;
 //BA.debugLineNum = 53280774;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.formprogramacampo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
RDebugUtils.currentLine=52494336;
 //BA.debugLineNum = 52494336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=52494337;
 //BA.debugLineNum = 52494337;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=52494338;
 //BA.debugLineNum = 52494338;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=52494339;
 //BA.debugLineNum = 52494339;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=52494340;
 //BA.debugLineNum = 52494340;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=52494341;
 //BA.debugLineNum = 52494341;BA.debugLine="Private Panel7 As Panel";
_panel7 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=52494342;
 //BA.debugLineNum = 52494342;BA.debugLine="Private Label9 As Label";
_label9 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=52494343;
 //BA.debugLineNum = 52494343;BA.debugLine="Private MiConsecutivo As String";
_miconsecutivo = "";
RDebugUtils.currentLine=52494344;
 //BA.debugLineNum = 52494344;BA.debugLine="Dim fechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=52494345;
 //BA.debugLineNum = 52494345;BA.debugLine="Dim fechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=52494346;
 //BA.debugLineNum = 52494346;BA.debugLine="Dim area As String";
_area = "";
RDebugUtils.currentLine=52494347;
 //BA.debugLineNum = 52494347;BA.debugLine="Dim Observacion As String";
_observacion = "";
RDebugUtils.currentLine=52494348;
 //BA.debugLineNum = 52494348;BA.debugLine="Private Panel8 As Panel";
_panel8 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=52494349;
 //BA.debugLineNum = 52494349;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=52494350;
 //BA.debugLineNum = 52494350;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=52494351;
 //BA.debugLineNum = 52494351;BA.debugLine="End Sub";
return "";
}
public String  _edittextarea_textchanged(b4a.example.ef.formprogramacampo __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "edittextarea_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextarea_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=53149696;
 //BA.debugLineNum = 53149696;BA.debugLine="Private Sub EditTextArea_TextChanged (Old As Strin";
RDebugUtils.currentLine=53149697;
 //BA.debugLineNum = 53149697;BA.debugLine="area = New";
__ref._area /*String*/  = _new;
RDebugUtils.currentLine=53149698;
 //BA.debugLineNum = 53149698;BA.debugLine="Log(\"El area es:\" & area)";
__c.LogImpl("053149698","El area es:"+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=53149699;
 //BA.debugLineNum = 53149699;BA.debugLine="End Sub";
return "";
}
public String  _edittextobservacion_textchanged(b4a.example.ef.formprogramacampo __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "edittextobservacion_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextobservacion_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=53215232;
 //BA.debugLineNum = 53215232;BA.debugLine="Private Sub EditTextObservacion_TextChanged (Old A";
RDebugUtils.currentLine=53215233;
 //BA.debugLineNum = 53215233;BA.debugLine="Observacion = New";
__ref._observacion /*String*/  = _new;
RDebugUtils.currentLine=53215235;
 //BA.debugLineNum = 53215235;BA.debugLine="Log(\"La observacion es: \" & Observacion)";
__c.LogImpl("053215235","La observacion es: "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=53215236;
 //BA.debugLineNum = 53215236;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.example.ef.formprogramacampo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=52822016;
 //BA.debugLineNum = 52822016;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=52822017;
 //BA.debugLineNum = 52822017;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=52822018;
 //BA.debugLineNum = 52822018;BA.debugLine="End Sub";
return "";
}
public String  _label11_click(b4a.example.ef.formprogramacampo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "label11_click", false))
	 {return ((String) Debug.delegate(ba, "label11_click", null));}
RDebugUtils.currentLine=53084160;
 //BA.debugLineNum = 53084160;BA.debugLine="Private Sub Label11_Click";
RDebugUtils.currentLine=53084161;
 //BA.debugLineNum = 53084161;BA.debugLine="Panel8.Visible = True";
__ref._panel8 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=53084162;
 //BA.debugLineNum = 53084162;BA.debugLine="End Sub";
return "";
}
public String  _label9_click(b4a.example.ef.formprogramacampo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampo";
if (Debug.shouldDelegate(ba, "label9_click", false))
	 {return ((String) Debug.delegate(ba, "label9_click", null));}
RDebugUtils.currentLine=52953088;
 //BA.debugLineNum = 52953088;BA.debugLine="Private Sub Label9_Click";
RDebugUtils.currentLine=52953089;
 //BA.debugLineNum = 52953089;BA.debugLine="Panel7.Visible=True";
__ref._panel7 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=52953090;
 //BA.debugLineNum = 52953090;BA.debugLine="End Sub";
return "";
}
}