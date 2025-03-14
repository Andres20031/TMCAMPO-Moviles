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
public anywheresoftware.b4a.objects.LabelWrapper _label11 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel20 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _as_datepicker1_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 53;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
 //BA.debugLineNum = 55;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 58;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 61;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 64;BA.debugLine="Label11.Text = formattedDate";
_label11.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 67;BA.debugLine="Panel20.Visible = False";
_panel20.setVisible(__c.False);
 //BA.debugLineNum = 70;BA.debugLine="fecha = formattedDate";
_fecha = _formatteddate;
 //BA.debugLineNum = 73;BA.debugLine="Log(fecha)";
__c.LogImpl("785655572",_fecha,0);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 32;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 34;BA.debugLine="Root.LoadLayout(\"FormLaboresCampoA\")";
_root.LoadLayout("FormLaboresCampoA",ba);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
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
 //BA.debugLineNum = 13;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private Panel20 As Panel";
_panel20 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 98;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 99;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 100;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 101;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 102;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 103;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public String  _edittext1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
 //BA.debugLineNum = 78;BA.debugLine="area = New";
_area = _new;
 //BA.debugLineNum = 80;BA.debugLine="Log(\"EL area nueva es: \"& area)";
__c.LogImpl("785721091","EL area nueva es: "+_area,0);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _edittext3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
 //BA.debugLineNum = 84;BA.debugLine="Observacion = New";
_observacion = _new;
 //BA.debugLineNum = 86;BA.debugLine="Log(\"la observacion es \" & Observacion)";
__c.LogImpl("753149699","la observacion es "+_observacion,0);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _label1_click() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Private Sub Label1_Click";
 //BA.debugLineNum = 40;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _label11_click() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Private Sub Label11_Click";
 //BA.debugLineNum = 47;BA.debugLine="Panel20.Visible = True";
_panel20.setVisible(__c.True);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _panel20_click() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Private Sub Panel20_Click";
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _setconsecutivo(String _valor) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
 //BA.debugLineNum = 23;BA.debugLine="MiConsecutivo = Valor";
_miconsecutivo = _valor;
 //BA.debugLineNum = 24;BA.debugLine="If Label8.IsInitialized Then";
if (_label8.IsInitialized()) { 
 //BA.debugLineNum = 25;BA.debugLine="Label8.Text = MiConsecutivo";
_label8.setText(BA.ObjectToCharSequence(_miconsecutivo));
 };
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
