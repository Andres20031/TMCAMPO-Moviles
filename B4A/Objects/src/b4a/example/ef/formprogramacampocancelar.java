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
RDebugUtils.currentLine=53411840;
 //BA.debugLineNum = 53411840;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=53411841;
 //BA.debugLineNum = 53411841;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=53411842;
 //BA.debugLineNum = 53411842;BA.debugLine="End Sub";
return null;
}
public String  _setconsecutivo(b4a.example.ef.formprogramacampocancelar __ref,String _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "setconsecutivo", false))
	 {return ((String) Debug.delegate(ba, "setconsecutivo", new Object[] {_valor}));}
RDebugUtils.currentLine=53477376;
 //BA.debugLineNum = 53477376;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
RDebugUtils.currentLine=53477377;
 //BA.debugLineNum = 53477377;BA.debugLine="MiConsecutivo = Valor";
__ref._miconsecutivo /*String*/  = _valor;
RDebugUtils.currentLine=53477378;
 //BA.debugLineNum = 53477378;BA.debugLine="If Label8.IsInitialized Then";
if (__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=53477379;
 //BA.debugLineNum = 53477379;BA.debugLine="Label8.Text = MiConsecutivo";
__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._miconsecutivo /*String*/ ));
 };
RDebugUtils.currentLine=53477381;
 //BA.debugLineNum = 53477381;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.formprogramacampocancelar __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=53542912;
 //BA.debugLineNum = 53542912;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=53542913;
 //BA.debugLineNum = 53542913;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=53542915;
 //BA.debugLineNum = 53542915;BA.debugLine="Root.LoadLayout(\"FormLaboresCampoCancelar\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FormLaboresCampoCancelar",ba);
RDebugUtils.currentLine=53542916;
 //BA.debugLineNum = 53542916;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=53805058;
 //BA.debugLineNum = 53805058;BA.debugLine="Dim consecutivoInt As Int = MiConsecutivo";
_consecutivoint = (int)(Double.parseDouble(__ref._miconsecutivo /*String*/ ));
RDebugUtils.currentLine=53805059;
 //BA.debugLineNum = 53805059;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
_horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=53805060;
 //BA.debugLineNum = 53805060;BA.debugLine="Dim fecha As Long = DateTime.Now";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=53805061;
 //BA.debugLineNum = 53805061;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=53805062;
 //BA.debugLineNum = 53805062;BA.debugLine="Dim fechaActual As String = DateTime.Date(fecha)";
_fechaactual = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=53805065;
 //BA.debugLineNum = 53805065;BA.debugLine="Log(\"Fecha actual: \" & fechaActual)  ' Muestra la";
parent.__c.LogImpl("053805065","Fecha actual: "+_fechaactual,0);
RDebugUtils.currentLine=53805066;
 //BA.debugLineNum = 53805066;BA.debugLine="Log(\"Hora actual: \" & horaSistema)  ' Muestra la";
parent.__c.LogImpl("053805066","Hora actual: "+_horasistema,0);
RDebugUtils.currentLine=53805067;
 //BA.debugLineNum = 53805067;BA.debugLine="Log(\"Observacion: \" & observacion)";
parent.__c.LogImpl("053805067","Observacion: "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=53805068;
 //BA.debugLineNum = 53805068;BA.debugLine="Log(\"Cancelada\")";
parent.__c.LogImpl("053805068","Cancelada",0);
RDebugUtils.currentLine=53805069;
 //BA.debugLineNum = 53805069;BA.debugLine="Log(\"ID\" & consecutivoInt)";
parent.__c.LogImpl("053805069","ID"+BA.NumberToString(_consecutivoint),0);
RDebugUtils.currentLine=53805071;
 //BA.debugLineNum = 53805071;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=53805072;
 //BA.debugLineNum = 53805072;BA.debugLine="If (sf.Trim(observacion) = \"\" ) Then";
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
RDebugUtils.currentLine=53805073;
 //BA.debugLineNum = 53805073;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Tienes algun campo vacio"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=53805075;
 //BA.debugLineNum = 53805075;BA.debugLine="If (sf.Trim(observacion) = \"\") Then";
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
RDebugUtils.currentLine=53805076;
 //BA.debugLineNum = 53805076;BA.debugLine="observacion = \"N/A\"";
__ref._observacion /*String*/  = "N/A";
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=53805079;
 //BA.debugLineNum = 53805079;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=53805080;
 //BA.debugLineNum = 53805080;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=53805083;
 //BA.debugLineNum = 53805083;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"programa_labores_Cancelar",new Object[]{(Object)(_fechaactual),(Object)(_horasistema),(Object)(__ref._observacion /*String*/ ),(Object)("Cancelada"),(Object)(__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText())});
RDebugUtils.currentLine=53805086;
 //BA.debugLineNum = 53805086;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=53805087;
 //BA.debugLineNum = 53805087;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprogramacampocancelar", "button1_click"), (Object)(_j));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=53805090;
 //BA.debugLineNum = 53805090;BA.debugLine="Try";
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
RDebugUtils.currentLine=53805091;
 //BA.debugLineNum = 53805091;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=53805092;
 //BA.debugLineNum = 53805092;BA.debugLine="MsgboxAsync(\"Se ha cancelado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha cancelado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=53805094;
 //BA.debugLineNum = 53805094;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
parent.__c.LogImpl("053805094","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=53805097;
 //BA.debugLineNum = 53805097;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
parent.__c.LogImpl("053805097","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
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
RDebugUtils.currentLine=53805103;
 //BA.debugLineNum = 53805103;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=53739520;
 //BA.debugLineNum = 53739520;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=53739521;
 //BA.debugLineNum = 53739521;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=53739522;
 //BA.debugLineNum = 53739522;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=53739523;
 //BA.debugLineNum = 53739523;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=53739524;
 //BA.debugLineNum = 53739524;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=53739525;
 //BA.debugLineNum = 53739525;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=53739526;
 //BA.debugLineNum = 53739526;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.formprogramacampocancelar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
RDebugUtils.currentLine=53346304;
 //BA.debugLineNum = 53346304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=53346305;
 //BA.debugLineNum = 53346305;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=53346306;
 //BA.debugLineNum = 53346306;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=53346307;
 //BA.debugLineNum = 53346307;BA.debugLine="Private MiConsecutivo As String";
_miconsecutivo = "";
RDebugUtils.currentLine=53346308;
 //BA.debugLineNum = 53346308;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=53346309;
 //BA.debugLineNum = 53346309;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=53346310;
 //BA.debugLineNum = 53346310;BA.debugLine="Dim observacion As String";
_observacion = "";
RDebugUtils.currentLine=53346311;
 //BA.debugLineNum = 53346311;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=53346312;
 //BA.debugLineNum = 53346312;BA.debugLine="End Sub";
return "";
}
public String  _edittext3_textchanged(b4a.example.ef.formprogramacampocancelar __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "edittext3_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=53673984;
 //BA.debugLineNum = 53673984;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
RDebugUtils.currentLine=53673986;
 //BA.debugLineNum = 53673986;BA.debugLine="observacion = New";
__ref._observacion /*String*/  = _new;
RDebugUtils.currentLine=53673988;
 //BA.debugLineNum = 53673988;BA.debugLine="Log(observacion)";
__c.LogImpl("053673988",__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=53673989;
 //BA.debugLineNum = 53673989;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.example.ef.formprogramacampocancelar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampocancelar";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=53608448;
 //BA.debugLineNum = 53608448;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=53608449;
 //BA.debugLineNum = 53608449;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=53608450;
 //BA.debugLineNum = 53608450;BA.debugLine="End Sub";
return "";
}
}