package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formprogramacampo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.formprogramacampo");
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
public String  _as_datepicker1_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 87;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
 //BA.debugLineNum = 89;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 92;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 95;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 98;BA.debugLine="Label9.Text = formattedDate";
_label9.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 101;BA.debugLine="Panel7.Visible = False";
_panel7.setVisible(__c.False);
 //BA.debugLineNum = 104;BA.debugLine="fechaInicio = formattedDate";
_fechainicio = _formatteddate;
 //BA.debugLineNum = 107;BA.debugLine="Log(fechaInicio)";
__c.LogImpl("63211284",_fechainicio,0);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 114;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
 //BA.debugLineNum = 116;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 119;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 122;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 125;BA.debugLine="Label11.Text = formattedDate";
_label11.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 128;BA.debugLine="Panel8.Visible = False";
_panel8.setVisible(__c.False);
 //BA.debugLineNum = 131;BA.debugLine="fechaFin = formattedDate";
_fechafin = _formatteddate;
 //BA.debugLineNum = 134;BA.debugLine="Log(fechaFin)";
__c.LogImpl("63342356",_fechafin,0);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 32;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 33;BA.debugLine="Root.LoadLayout(\"FormLaboresCampo\") ' Carga el di";
_root.LoadLayout("FormLaboresCampo",ba);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public void  _button1_click() throws Exception{
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formprogramacampo parent) {
this.parent = parent;
}
b4a.example.ef.formprogramacampo parent;
String _horasistema = "";
long _fecha = 0L;
String _fechaactual = "";
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
 //BA.debugLineNum = 40;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
_horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 41;BA.debugLine="Dim fecha As Long = DateTime.Now";
_fecha = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 42;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
 //BA.debugLineNum = 43;BA.debugLine="Dim fechaActual As String = DateTime.Date(fecha)";
_fechaactual = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 45;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
 //BA.debugLineNum = 46;BA.debugLine="Log (\"FECHA DE INICIO: \"&fechaInicio)";
parent.__c.LogImpl("63080199","FECHA DE INICIO: "+parent._fechainicio,0);
 //BA.debugLineNum = 47;BA.debugLine="Log (\"FECHA DE FIN: \"&fechaFin)";
parent.__c.LogImpl("63080200","FECHA DE FIN: "+parent._fechafin,0);
 //BA.debugLineNum = 48;BA.debugLine="Log (\"AREA: \"&area)";
parent.__c.LogImpl("63080201","AREA: "+parent._area,0);
 //BA.debugLineNum = 49;BA.debugLine="Log (\"OBSERVACION: \"&Observacion)";
parent.__c.LogImpl("63080202","OBSERVACION: "+parent._observacion,0);
 //BA.debugLineNum = 50;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("63080203","fechaActual: "+_fechaactual,0);
 //BA.debugLineNum = 51;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("63080204","horaSistema: "+_horasistema,0);
 //BA.debugLineNum = 53;BA.debugLine="sf.Initialize";
parent._sf._vvv1(ba);
 //BA.debugLineNum = 54;BA.debugLine="If (sf.Trim(fechaInicio) = \"\" Or sf.Trim(fechaFin";
if (true) break;

case 1:
//if
this.state = 22;
if (((parent._sf._vvvvv7(parent._fechainicio)).equals("") || (parent._sf._vvvvv7(parent._fechafin)).equals("") || (parent._sf._vvvvv7(parent._area)).equals(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 22;
 //BA.debugLineNum = 55;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Tienes algun campo vacio"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 57;BA.debugLine="If (sf.Trim(Observacion) = \"\") Then";
if (true) break;

case 6:
//if
this.state = 9;
if (((parent._sf._vvvvv7(parent._observacion)).equals(""))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 58;BA.debugLine="Observacion = \"N/A\"";
parent._observacion = "N/A";
 if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 61;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 62;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 65;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
_cmd = parent._createcommand("programa_labores_Update",new Object[]{(Object)(parent._fechainicio),(Object)(parent._fechafin),(Object)(parent._area),(Object)(parent._observacion),(Object)(_fechaactual),(Object)(_horasistema),(Object)("Terminada"),(Object)(parent._label8.getText())});
 //BA.debugLineNum = 67;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 68;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 70;BA.debugLine="Try";
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
 //BA.debugLineNum = 71;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 72;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 74;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
parent.__c.LogImpl("63080227","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 77;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
parent.__c.LogImpl("63080230","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
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
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 6;BA.debugLine="Private Panel7 As Panel";
_panel7 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private Label9 As Label";
_label9 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private MiConsecutivo As String";
_miconsecutivo = "";
 //BA.debugLineNum = 9;BA.debugLine="Dim fechaInicio As String";
_fechainicio = "";
 //BA.debugLineNum = 10;BA.debugLine="Dim fechaFin As String";
_fechafin = "";
 //BA.debugLineNum = 11;BA.debugLine="Dim area As String";
_area = "";
 //BA.debugLineNum = 12;BA.debugLine="Dim Observacion As String";
_observacion = "";
 //BA.debugLineNum = 13;BA.debugLine="Private Panel8 As Panel";
_panel8 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 152;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 153;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 154;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 155;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 156;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 157;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public String  _edittextarea_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Private Sub EditTextArea_TextChanged (Old As Strin";
 //BA.debugLineNum = 142;BA.debugLine="area = New";
_area = _new;
 //BA.debugLineNum = 143;BA.debugLine="Log(\"El area es:\" & area)";
__c.LogImpl("63473410","El area es:"+_area,0);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _edittextobservacion_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Private Sub EditTextObservacion_TextChanged (Old A";
 //BA.debugLineNum = 147;BA.debugLine="Observacion = New";
_observacion = _new;
 //BA.debugLineNum = 149;BA.debugLine="Log(\"La observacion es: \" & Observacion)";
__c.LogImpl("63538947","La observacion es: "+_observacion,0);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _label1_click() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Private Sub Label1_Click";
 //BA.debugLineNum = 84;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _label11_click() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Private Sub Label11_Click";
 //BA.debugLineNum = 138;BA.debugLine="Panel8.Visible = True";
_panel8.setVisible(__c.True);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _label9_click() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Private Sub Label9_Click";
 //BA.debugLineNum = 111;BA.debugLine="Panel7.Visible=True";
_panel7.setVisible(__c.True);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _setconsecutivo(String _valor) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
 //BA.debugLineNum = 24;BA.debugLine="MiConsecutivo = Valor";
_miconsecutivo = _valor;
 //BA.debugLineNum = 25;BA.debugLine="If Label8.IsInitialized Then";
if (_label8.IsInitialized()) { 
 //BA.debugLineNum = 26;BA.debugLine="Label8.Text = MiConsecutivo";
_label8.setText(BA.ObjectToCharSequence(_miconsecutivo));
 };
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
