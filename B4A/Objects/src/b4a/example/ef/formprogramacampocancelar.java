package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formprogramacampocancelar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.formprogramacampocancelar");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _miconsecutivo = "";
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public String _rdclink = "";
public String _observacion = "";
public String _fechaactual = "";
public String _horaactual = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 27;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 29;BA.debugLine="Root.LoadLayout(\"FormLaboresCampoCancelar\")";
_root.LoadLayout("FormLaboresCampoCancelar",ba);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public void  _button1_click() throws Exception{
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formprogramacampocancelar parent) {
this.parent = parent;
}
b4a.example.ef.formprogramacampocancelar parent;
int _consecutivoint = 0;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 57;BA.debugLine="Dim consecutivoInt As Int = MiConsecutivo";
_consecutivoint = (int)(Double.parseDouble(parent._miconsecutivo));
 //BA.debugLineNum = 58;BA.debugLine="fechaActual = DateTime.Date(DateTime.Now)";
parent._fechaactual = parent.__c.DateTime.Date(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 59;BA.debugLine="horaActual = DateTime.Time(DateTime.Now)";
parent._horaactual = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 62;BA.debugLine="Log(\"Fecha actual: \" & fechaActual)  ' Muestra la";
parent.__c.LogImpl("753673991","Fecha actual: "+parent._fechaactual,0);
 //BA.debugLineNum = 63;BA.debugLine="Log(\"Hora actual: \" & horaActual)  ' Muestra la h";
parent.__c.LogImpl("753673992","Hora actual: "+parent._horaactual,0);
 //BA.debugLineNum = 64;BA.debugLine="Log(\"Observacion: \" & observacion)";
parent.__c.LogImpl("753673993","Observacion: "+parent._observacion,0);
 //BA.debugLineNum = 65;BA.debugLine="Log(\"Cancelada\")";
parent.__c.LogImpl("753673994","Cancelada",0);
 //BA.debugLineNum = 66;BA.debugLine="Log(\"ID\" & consecutivoInt)";
parent.__c.LogImpl("753673995","ID"+BA.NumberToString(_consecutivoint),0);
 //BA.debugLineNum = 67;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 68;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 71;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_la";
_cmd = parent._createcommand("programa_labores_Cancelar",new Object[]{(Object)(parent._fechaactual),(Object)(parent._horaactual),(Object)(parent._observacion),(Object)("Cancelada"),(Object)(_consecutivoint)});
 //BA.debugLineNum = 74;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 75;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 78;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 //BA.debugLineNum = 79;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 80;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 82;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("753674011","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 85;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("753674014","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
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
public void  _jobdone(b4a.example.ef.httpjob _j) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private MiConsecutivo As String";
_miconsecutivo = "";
 //BA.debugLineNum = 5;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 7;BA.debugLine="Dim observacion As String";
_observacion = "";
 //BA.debugLineNum = 8;BA.debugLine="Dim fechaActual As String";
_fechaactual = "";
 //BA.debugLineNum = 9;BA.debugLine="Dim horaActual As String";
_horaactual = "";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 47;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 48;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 49;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 50;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 51;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 52;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _edittext3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
 //BA.debugLineNum = 42;BA.debugLine="observacion = New";
_observacion = _new;
 //BA.debugLineNum = 44;BA.debugLine="Log(observacion)";
__c.LogImpl("753542916",_observacion,0);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public String  _label1_click() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Private Sub Label1_Click";
 //BA.debugLineNum = 35;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _setconsecutivo(String _valor) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
 //BA.debugLineNum = 18;BA.debugLine="MiConsecutivo = Valor";
_miconsecutivo = _valor;
 //BA.debugLineNum = 19;BA.debugLine="If Label8.IsInitialized Then";
if (_label8.IsInitialized()) { 
 //BA.debugLineNum = 20;BA.debugLine="Label8.Text = MiConsecutivo";
_label8.setText(BA.ObjectToCharSequence(_miconsecutivo));
 };
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
