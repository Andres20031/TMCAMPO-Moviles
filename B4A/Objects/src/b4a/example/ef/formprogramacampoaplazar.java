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
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return null;
}
public String  _setconsecutivo(b4a.example.ef.formprogramacampoaplazar __ref,String _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "setconsecutivo", false))
	 {return ((String) Debug.delegate(ba, "setconsecutivo", new Object[] {_valor}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="MiConsecutivo = Valor";
__ref._miconsecutivo /*String*/  = _valor;
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="If Label8.IsInitialized Then";
if (__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="Label8.Text = MiConsecutivo";
__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._miconsecutivo /*String*/ ));
 };
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formprogramacampoaplazar __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Label11.Text = formattedDate";
__ref._label11 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="Panel20.Visible = False";
__ref._panel20 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="Log(fecha)";
__c.LogImpl("44849684",__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=4849685;
 //BA.debugLineNum = 4849685;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.formprogramacampoaplazar __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Root.LoadLayout(\"FormLaboresCampoA\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FormLaboresCampoA",ba);
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Log(\"El consecutivo: \"&Label8.Text)";
parent.__c.LogImpl("45046273","El consecutivo: "+__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=5046311;
 //BA.debugLineNum = 5046311;BA.debugLine="Log(\"Fecha_Programa_LaborAntes: \" & Fecha_Program";
parent.__c.LogImpl("45046311","Fecha_Programa_LaborAntes: "+__ref._fecha_programa_laborantes /*String*/ ,0);
RDebugUtils.currentLine=5046312;
 //BA.debugLineNum = 5046312;BA.debugLine="Log(\"Area_Programa_LaborAntes: \" & Area_Programa_";
parent.__c.LogImpl("45046312","Area_Programa_LaborAntes: "+__ref._area_programa_laborantes /*String*/ ,0);
RDebugUtils.currentLine=5046313;
 //BA.debugLineNum = 5046313;BA.debugLine="Log(\"ObservacionAntes: \"& ObservacionAntes)";
parent.__c.LogImpl("45046313","ObservacionAntes: "+__ref._observacionantes /*String*/ ,0);
RDebugUtils.currentLine=5046314;
 //BA.debugLineNum = 5046314;BA.debugLine="Log(\"FECHA: \"&fecha)";
parent.__c.LogImpl("45046314","FECHA: "+__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=5046315;
 //BA.debugLineNum = 5046315;BA.debugLine="Log(\"AREA: \"&area)";
parent.__c.LogImpl("45046315","AREA: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=5046316;
 //BA.debugLineNum = 5046316;BA.debugLine="Log(\"OBSERVACION: \"&Observacion)";
parent.__c.LogImpl("45046316","OBSERVACION: "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=5046318;
 //BA.debugLineNum = 5046318;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=5046319;
 //BA.debugLineNum = 5046319;BA.debugLine="If (sf.Trim(fecha) = \"\" Or sf.Trim(area) = \"\" ) T";
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
RDebugUtils.currentLine=5046320;
 //BA.debugLineNum = 5046320;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Tienes algun campo vacio"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=5046322;
 //BA.debugLineNum = 5046322;BA.debugLine="If (sf.Trim(Observacion) = \"\") Then";
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
RDebugUtils.currentLine=5046323;
 //BA.debugLineNum = 5046323;BA.debugLine="Observacion = \"N/A\"";
__ref._observacion /*String*/  = "N/A";
 if (true) break;
;
RDebugUtils.currentLine=5046325;
 //BA.debugLineNum = 5046325;BA.debugLine="If (sf.Trim(ObservacionAntes) = \"\") Then";

case 9:
//if
this.state = 12;
if (((__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(__ref._observacionantes /*String*/ )).equals(""))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=5046326;
 //BA.debugLineNum = 5046326;BA.debugLine="ObservacionAntes = \"N/A\"";
__ref._observacionantes /*String*/  = "N/A";
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=5046330;
 //BA.debugLineNum = 5046330;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"programa_labores_aplazar",new Object[]{(Object)(__ref._fecha_programa_laborantes /*String*/ ),(Object)(__ref._area_programa_laborantes /*String*/ ),(Object)(__ref._observacionantes /*String*/ ),(Object)(__ref._fecha /*String*/ ),(Object)(__ref._area /*String*/ ),(Object)(__ref._observacion /*String*/ ),(Object)("Aplazada"),(Object)(__ref._label8 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText())});
RDebugUtils.currentLine=5046332;
 //BA.debugLineNum = 5046332;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=5046333;
 //BA.debugLineNum = 5046333;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprogramacampoaplazar", "button1_click"), (Object)(_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=5046335;
 //BA.debugLineNum = 5046335;BA.debugLine="Try";
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
RDebugUtils.currentLine=5046336;
 //BA.debugLineNum = 5046336;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=5046337;
 //BA.debugLineNum = 5046337;BA.debugLine="MsgboxAsync(\"Se ha aplazado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha aplazado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=5046339;
 //BA.debugLineNum = 5046339;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
parent.__c.LogImpl("45046339","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=5046342;
 //BA.debugLineNum = 5046342;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
parent.__c.LogImpl("45046342","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
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
RDebugUtils.currentLine=5046347;
 //BA.debugLineNum = 5046347;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Private MiConsecutivo As String";
_miconsecutivo = "";
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="Dim Observacion As String";
_observacion = "";
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="Dim fecha As String";
_fecha = "";
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="Dim area As String";
_area = "";
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=4456460;
 //BA.debugLineNum = 4456460;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="Private Panel20 As Panel";
_panel20 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4456464;
 //BA.debugLineNum = 4456464;BA.debugLine="Dim Fecha_Programa_LaborAntes As String";
_fecha_programa_laborantes = "";
RDebugUtils.currentLine=4456466;
 //BA.debugLineNum = 4456466;BA.debugLine="Dim Area_Programa_LaborAntes As String";
_area_programa_laborantes = "";
RDebugUtils.currentLine=4456467;
 //BA.debugLineNum = 4456467;BA.debugLine="Dim ObservacionAntes As String";
_observacionantes = "";
RDebugUtils.currentLine=4456468;
 //BA.debugLineNum = 4456468;BA.debugLine="End Sub";
return "";
}
public String  _edittext1_textchanged(b4a.example.ef.formprogramacampoaplazar __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "edittext1_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="area = New";
__ref._area /*String*/  = _new;
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Log(\"EL area nueva es: \"& area)";
__c.LogImpl("44915203","EL area nueva es: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="End Sub";
return "";
}
public String  _edittext3_textchanged(b4a.example.ef.formprogramacampoaplazar __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "edittext3_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Observacion = New";
__ref._observacion /*String*/  = _new;
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Log(\"la observacion es \" & Observacion)";
__c.LogImpl("44980739","la observacion es "+__ref._observacion /*String*/ ,0);
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return "";
}
public String  _label11_click(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "label11_click", false))
	 {return ((String) Debug.delegate(ba, "label11_click", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub Label11_Click";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Panel20.Visible = True";
__ref._panel20 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return "";
}
public String  _panel20_click(b4a.example.ef.formprogramacampoaplazar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprogramacampoaplazar";
if (Debug.shouldDelegate(ba, "panel20_click", false))
	 {return ((String) Debug.delegate(ba, "panel20_click", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub Panel20_Click";
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
}