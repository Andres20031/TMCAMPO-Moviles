package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formprogramacampoaplazar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.formprogramacampoaplazar");
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
public String  _as_datepicker1_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 62;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
 //BA.debugLineNum = 64;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 67;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 70;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 73;BA.debugLine="Label11.Text = formattedDate";
_label11.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 76;BA.debugLine="Panel20.Visible = False";
_panel20.setVisible(__c.False);
 //BA.debugLineNum = 79;BA.debugLine="fecha = formattedDate";
_fecha = _formatteddate;
 //BA.debugLineNum = 82;BA.debugLine="Log(fecha)";
__c.LogImpl("64587540",_fecha,0);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 38;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 40;BA.debugLine="Root.LoadLayout(\"FormLaboresCampoA\")";
_root.LoadLayout("FormLaboresCampoA",ba);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public void  _button1_click() throws Exception{
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formprogramacampoaplazar parent) {
this.parent = parent;
}
b4a.example.ef.formprogramacampoaplazar parent;
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
 //BA.debugLineNum = 100;BA.debugLine="Log(\"El consecutivo: \"&Label8.Text)";
parent.__c.LogImpl("64784129","El consecutivo: "+parent._label8.getText(),0);
 //BA.debugLineNum = 102;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 103;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 138;BA.debugLine="Log(\"Fecha_Programa_LaborAntes: \" & Fecha_Program";
parent.__c.LogImpl("64784167","Fecha_Programa_LaborAntes: "+parent._fecha_programa_laborantes,0);
 //BA.debugLineNum = 139;BA.debugLine="Log(\"Area_Programa_LaborAntes: \" & Area_Programa_";
parent.__c.LogImpl("64784168","Area_Programa_LaborAntes: "+parent._area_programa_laborantes,0);
 //BA.debugLineNum = 140;BA.debugLine="Log(\"ObservacionAntes: \"& ObservacionAntes)";
parent.__c.LogImpl("64784169","ObservacionAntes: "+parent._observacionantes,0);
 //BA.debugLineNum = 141;BA.debugLine="Log(\"FECHA: \"&fecha)";
parent.__c.LogImpl("64784170","FECHA: "+parent._fecha,0);
 //BA.debugLineNum = 142;BA.debugLine="Log(\"AREA: \"&area)";
parent.__c.LogImpl("64784171","AREA: "+parent._area,0);
 //BA.debugLineNum = 143;BA.debugLine="Log(\"OBSERVACION: \"&Observacion)";
parent.__c.LogImpl("64784172","OBSERVACION: "+parent._observacion,0);
 //BA.debugLineNum = 145;BA.debugLine="sf.Initialize";
parent._sf._vvv1(ba);
 //BA.debugLineNum = 146;BA.debugLine="If (sf.Trim(fecha) = \"\" Or sf.Trim(area) = \"\" ) T";
if (true) break;

case 1:
//if
this.state = 25;
if (((parent._sf._vvvvv7(parent._fecha)).equals("") || (parent._sf._vvvvv7(parent._area)).equals(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 25;
 //BA.debugLineNum = 147;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Tienes algun campo vacio"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 149;BA.debugLine="If (sf.Trim(Observacion) = \"\") Then";
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
 //BA.debugLineNum = 150;BA.debugLine="Observacion = \"N/A\"";
parent._observacion = "N/A";
 if (true) break;
;
 //BA.debugLineNum = 152;BA.debugLine="If (sf.Trim(ObservacionAntes) = \"\") Then";

case 9:
//if
this.state = 12;
if (((parent._sf._vvvvv7(parent._observacionantes)).equals(""))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 153;BA.debugLine="ObservacionAntes = \"N/A\"";
parent._observacionantes = "N/A";
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 157;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
_cmd = parent._createcommand("programa_labores_aplazar",new Object[]{(Object)(parent._fecha_programa_laborantes),(Object)(parent._area_programa_laborantes),(Object)(parent._observacionantes),(Object)(parent._fecha),(Object)(parent._area),(Object)(parent._observacion),(Object)("Aplazada"),(Object)(parent._label8.getText())});
 //BA.debugLineNum = 159;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 160;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 162;BA.debugLine="Try";
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
 //BA.debugLineNum = 163;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 164;BA.debugLine="MsgboxAsync(\"Se ha aplazado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha aplazado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 166;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
parent.__c.LogImpl("64784195","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 169;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
parent.__c.LogImpl("64784198","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
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
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 5;BA.debugLine="Private MiConsecutivo As String";
_miconsecutivo = "";
 //BA.debugLineNum = 6;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim Observacion As String";
_observacion = "";
 //BA.debugLineNum = 8;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim fecha As String";
_fecha = "";
 //BA.debugLineNum = 10;BA.debugLine="Dim area As String";
_area = "";
 //BA.debugLineNum = 12;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
 //BA.debugLineNum = 13;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private Panel20 As Panel";
_panel20 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim Fecha_Programa_LaborAntes As String";
_fecha_programa_laborantes = "";
 //BA.debugLineNum = 19;BA.debugLine="Dim Area_Programa_LaborAntes As String";
_area_programa_laborantes = "";
 //BA.debugLineNum = 20;BA.debugLine="Dim ObservacionAntes As String";
_observacionantes = "";
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 180;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 181;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 182;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 183;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 184;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 185;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public String  _edittext1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
 //BA.debugLineNum = 87;BA.debugLine="area = New";
_area = _new;
 //BA.debugLineNum = 89;BA.debugLine="Log(\"EL area nueva es: \"& area)";
__c.LogImpl("64653059","EL area nueva es: "+_area,0);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _edittext3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
 //BA.debugLineNum = 93;BA.debugLine="Observacion = New";
_observacion = _new;
 //BA.debugLineNum = 95;BA.debugLine="Log(\"la observacion es \" & Observacion)";
__c.LogImpl("64718595","la observacion es "+_observacion,0);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public String  _label1_click() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Private Sub Label1_Click";
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _label11_click() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Private Sub Label11_Click";
 //BA.debugLineNum = 56;BA.debugLine="Panel20.Visible = True";
_panel20.setVisible(__c.True);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _panel20_click() throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Private Sub Panel20_Click";
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _setconsecutivo(String _valor) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
 //BA.debugLineNum = 29;BA.debugLine="MiConsecutivo = Valor";
_miconsecutivo = _valor;
 //BA.debugLineNum = 30;BA.debugLine="If Label8.IsInitialized Then";
if (_label8.IsInitialized()) { 
 //BA.debugLineNum = 31;BA.debugLine="Label8.Text = MiConsecutivo";
_label8.setText(BA.ObjectToCharSequence(_miconsecutivo));
 };
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
