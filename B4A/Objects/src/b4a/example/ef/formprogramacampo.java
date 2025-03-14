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
public anywheresoftware.b4a.objects.PanelWrapper _panel7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label9 = null;
public String _miconsecutivo = "";
public String _fechainicio = "";
public String _fechafin = "";
public String _area = "";
public String _observacion = "";
public anywheresoftware.b4a.objects.PanelWrapper _panel8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label11 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _as_datepicker1_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 46;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
 //BA.debugLineNum = 48;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 51;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 54;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 57;BA.debugLine="Label9.Text = formattedDate";
_label9.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 60;BA.debugLine="Panel7.Visible = False";
_panel7.setVisible(__c.False);
 //BA.debugLineNum = 63;BA.debugLine="fechaInicio = formattedDate";
_fechainicio = _formatteddate;
 //BA.debugLineNum = 66;BA.debugLine="Log(fechaInicio)";
__c.LogImpl("786638612",_fechainicio,0);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 73;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
 //BA.debugLineNum = 75;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 78;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 81;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 84;BA.debugLine="Label11.Text = formattedDate";
_label11.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 87;BA.debugLine="Panel8.Visible = False";
_panel8.setVisible(__c.False);
 //BA.debugLineNum = 90;BA.debugLine="fechaFin = formattedDate";
_fechafin = _formatteddate;
 //BA.debugLineNum = 93;BA.debugLine="Log(fechaFin)";
__c.LogImpl("786769684",_fechafin,0);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 31;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 32;BA.debugLine="Root.LoadLayout(\"FormLaboresCampo\") ' Carga el di";
_root.LoadLayout("FormLaboresCampo",ba);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
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
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _edittextarea_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Private Sub EditTextArea_TextChanged (Old As Strin";
 //BA.debugLineNum = 101;BA.debugLine="area = New";
_area = _new;
 //BA.debugLineNum = 102;BA.debugLine="Log(\"El area es:\" & area)";
__c.LogImpl("786900738","El area es:"+_area,0);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _edittextobservacion_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Private Sub EditTextObservacion_TextChanged (Old A";
 //BA.debugLineNum = 106;BA.debugLine="Observacion = New";
_observacion = _new;
 //BA.debugLineNum = 108;BA.debugLine="Log(\"La observacion es: \" & Observacion)";
__c.LogImpl("786966275","La observacion es: "+_observacion,0);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 42;BA.debugLine="Private Sub Label1_Click";
 //BA.debugLineNum = 43;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _label11_click() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Private Sub Label11_Click";
 //BA.debugLineNum = 97;BA.debugLine="Panel8.Visible = True";
_panel8.setVisible(__c.True);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _label9_click() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Private Sub Label9_Click";
 //BA.debugLineNum = 70;BA.debugLine="Panel7.Visible=True";
_panel7.setVisible(__c.True);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
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
