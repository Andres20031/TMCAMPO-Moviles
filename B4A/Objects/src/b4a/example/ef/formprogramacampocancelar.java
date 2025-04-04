package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formprogramacampocancelar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formprogramacampocancelar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.formprogramacampocancelar.class).invoke(this, new Object[] {null});
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
public String _miconsecutivo = "";
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public String _rdclink = "";
public String _observacion = "";
public ADR.stringdemo.stringfunctions _sf = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.formprogramacampocancelar __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return null;
}
public String  _setconsecutivo(b4a.example.ef.formprogramacampocancelar __ref,String _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "setconsecutivo", false))
	 {return ((String) Debug.delegate(ba, "setconsecutivo", new Object[] {_valor}));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="MiConsecutivo = Valor";
__ref._miconsecutivo /*String*/  = _valor;
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="If Label8.IsInitialized Then";
if (__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Label8.Text = MiConsecutivo";
__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._miconsecutivo /*String*/ ));
 };
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.formprogramacampocancelar __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Root.LoadLayout(\"FormLaboresCampoCancelar\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FormLaboresCampoCancelar",ba);
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="End Sub";
return "";
}
public void  _button1_click(b4a.example.ef.formprogramacampocancelar __ref) throws Exception{
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {Debug.delegate(ba, "button1_click", null); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formprogramacampocancelar parent,b4a.example.ef.formprogramacampocancelar __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formprogramacampocancelar __ref;
b4a.example.ef.formprogramacampocancelar parent;
int _consecutivoint = 0;
String _horasistema = "";
long _fecha = 0L;
String _fechaactual = "";
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formprogramacampocancelar";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim consecutivoInt As Int = MiConsecutivo";
_consecutivoint = (int)(Double.parseDouble(__ref._miconsecutivo /*String*/ ));
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
_horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Dim fecha As Long = DateTime.Now";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Dim fechaActual As String = DateTime.Date(fecha)";
_fechaactual = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="Log(\"Fecha actual: \" & fechaActual)  ' Muestra la";
parent.__c.LogImpl("44390921","Fecha actual: "+_fechaactual,0);
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="Log(\"Hora actual: \" & horaSistema)  ' Muestra la";
parent.__c.LogImpl("44390922","Hora actual: "+_horasistema,0);
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="Log(\"Observacion: \" & observacion)";
parent.__c.LogImpl("44390923","Observacion: "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="Log(\"Cancelada\")";
parent.__c.LogImpl("44390924","Cancelada",0);
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="Log(\"ID\" & consecutivoInt)";
parent.__c.LogImpl("44390925","ID"+BA.NumberToString(_consecutivoint),0);
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="If (sf.Trim(observacion) = \"\" ) Then";
if (true) break;

case 1:
//if
this.state = 22;
if (((__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(__ref._observacion /*String*/ )).equals(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 22;
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Tienes algun campo vacio"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=4390931;
 //BA.debugLineNum = 4390931;BA.debugLine="If (sf.Trim(observacion) = \"\") Then";
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
RDebugUtils.currentLine=4390932;
 //BA.debugLineNum = 4390932;BA.debugLine="observacion = \"N/A\"";
__ref._observacion /*String*/  = "N/A";
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=4390935;
 //BA.debugLineNum = 4390935;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=4390936;
 //BA.debugLineNum = 4390936;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=4390939;
 //BA.debugLineNum = 4390939;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"programa_labores_Cancelar",new Object[]{(Object)(_fechaactual),(Object)(_horasistema),(Object)(__ref._observacion /*String*/ ),(Object)("Cancelada"),(Object)(__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText())});
RDebugUtils.currentLine=4390942;
 //BA.debugLineNum = 4390942;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=4390943;
 //BA.debugLineNum = 4390943;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprogramacampocancelar", "button1_click"), (Object)(_j));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=4390946;
 //BA.debugLineNum = 4390946;BA.debugLine="Try";
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
RDebugUtils.currentLine=4390947;
 //BA.debugLineNum = 4390947;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=4390948;
 //BA.debugLineNum = 4390948;BA.debugLine="MsgboxAsync(\"Se ha cancelado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha cancelado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=4390950;
 //BA.debugLineNum = 4390950;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
parent.__c.LogImpl("44390950","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=4390953;
 //BA.debugLineNum = 4390953;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
parent.__c.LogImpl("44390953","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
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
RDebugUtils.currentLine=4390959;
 //BA.debugLineNum = 4390959;BA.debugLine="End Sub";
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
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formprogramacampocancelar __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.formprogramacampocancelar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Private MiConsecutivo As String";
_miconsecutivo = "";
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="Dim observacion As String";
_observacion = "";
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="End Sub";
return "";
}
public String  _edittext3_textchanged(b4a.example.ef.formprogramacampocancelar __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "edittext3_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="observacion = New";
__ref._observacion /*String*/  = _new;
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="Log(observacion)";
__c.LogImpl("44259844",__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.example.ef.formprogramacampocancelar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return "";
}
}