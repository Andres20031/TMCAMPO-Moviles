package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class editperson extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.editperson");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.editperson.class).invoke(this, new Object[] {null});
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
public b4a.example.ef.util _utilclass = null;
public String _rdclink = "";
public b4a.example3.customlistview _clv_editar = null;
public String _fecha = "";
public anywheresoftware.b4a.objects.LabelWrapper _label12fecha = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonbuscar = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public b4a.example.ef.as_datepicker _as_datepicker1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneledit = null;
public b4a.example3.customlistview _customlistview1geral = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.editperson __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=86573056;
 //BA.debugLineNum = 86573056;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=86573057;
 //BA.debugLineNum = 86573057;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=86573058;
 //BA.debugLineNum = 86573058;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.editperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
String[] _dateparts = null;
RDebugUtils.currentLine=86769664;
 //BA.debugLineNum = 86769664;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=86769666;
 //BA.debugLineNum = 86769666;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=86769667;
 //BA.debugLineNum = 86769667;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=86769670;
 //BA.debugLineNum = 86769670;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=86769673;
 //BA.debugLineNum = 86769673;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
RDebugUtils.currentLine=86769676;
 //BA.debugLineNum = 86769676;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
RDebugUtils.currentLine=86769678;
 //BA.debugLineNum = 86769678;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
RDebugUtils.currentLine=86769682;
 //BA.debugLineNum = 86769682;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=86769685;
 //BA.debugLineNum = 86769685;BA.debugLine="Label12Fecha.Text = formattedDate";
__ref._label12fecha /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=86769688;
 //BA.debugLineNum = 86769688;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=86769691;
 //BA.debugLineNum = 86769691;BA.debugLine="Fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=86769694;
 //BA.debugLineNum = 86769694;BA.debugLine="Log(\"Fecha: \" & Fecha)";
__c.LogImpl("486769694","Fecha: "+__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=86769695;
 //BA.debugLineNum = 86769695;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.editperson __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=86638592;
 //BA.debugLineNum = 86638592;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=86638593;
 //BA.debugLineNum = 86638593;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=86638595;
 //BA.debugLineNum = 86638595;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=86638596;
 //BA.debugLineNum = 86638596;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=86638597;
 //BA.debugLineNum = 86638597;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=86638598;
 //BA.debugLineNum = 86638598;BA.debugLine="Root.LoadLayout(\"EditPersons\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("EditPersons",ba);
RDebugUtils.currentLine=86638599;
 //BA.debugLineNum = 86638599;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=86638600;
 //BA.debugLineNum = 86638600;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = __c.Colors.White;
RDebugUtils.currentLine=86638601;
 //BA.debugLineNum = 86638601;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"EditPersons1";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("EditPersons1"));
RDebugUtils.currentLine=86638603;
 //BA.debugLineNum = 86638603;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=87031808;
 //BA.debugLineNum = 87031808;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=87031810;
 //BA.debugLineNum = 87031810;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=87031811;
 //BA.debugLineNum = 87031811;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=87031814;
 //BA.debugLineNum = 87031814;BA.debugLine="panel.LoadLayout(\"CardInputEditPerson\")";
_panel.LoadLayout("CardInputEditPerson",ba);
RDebugUtils.currentLine=87031816;
 //BA.debugLineNum = 87031816;BA.debugLine="panel.Height=PanelEdit.Height";
_panel.setHeight(__ref._paneledit /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=87031818;
 //BA.debugLineNum = 87031818;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=87031819;
 //BA.debugLineNum = 87031819;BA.debugLine="End Sub";
return null;
}
public String  _buttonbuscar_click(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "buttonbuscar_click", false))
	 {return ((String) Debug.delegate(ba, "buttonbuscar_click", null));}
RDebugUtils.currentLine=86835200;
 //BA.debugLineNum = 86835200;BA.debugLine="Private Sub ButtonBuscar_Click";
RDebugUtils.currentLine=86835202;
 //BA.debugLineNum = 86835202;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
RDebugUtils.currentLine=86507520;
 //BA.debugLineNum = 86507520;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=86507521;
 //BA.debugLineNum = 86507521;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=86507522;
 //BA.debugLineNum = 86507522;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=86507523;
 //BA.debugLineNum = 86507523;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=86507524;
 //BA.debugLineNum = 86507524;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=86507525;
 //BA.debugLineNum = 86507525;BA.debugLine="Private CLV_Editar As CustomListView";
_clv_editar = new b4a.example3.customlistview();
RDebugUtils.currentLine=86507526;
 //BA.debugLineNum = 86507526;BA.debugLine="Dim Fecha As String";
_fecha = "";
RDebugUtils.currentLine=86507527;
 //BA.debugLineNum = 86507527;BA.debugLine="Private Label12Fecha As Label";
_label12fecha = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=86507528;
 //BA.debugLineNum = 86507528;BA.debugLine="Private ButtonBuscar As Button";
_buttonbuscar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=86507529;
 //BA.debugLineNum = 86507529;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=86507530;
 //BA.debugLineNum = 86507530;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=86507531;
 //BA.debugLineNum = 86507531;BA.debugLine="Private PanelEdit As Panel";
_paneledit = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=86507532;
 //BA.debugLineNum = 86507532;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=86507533;
 //BA.debugLineNum = 86507533;BA.debugLine="End Sub";
return "";
}
public String  _label12fecha_click(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "label12fecha_click", false))
	 {return ((String) Debug.delegate(ba, "label12fecha_click", null));}
RDebugUtils.currentLine=86900736;
 //BA.debugLineNum = 86900736;BA.debugLine="Private Sub Label12Fecha_Click";
RDebugUtils.currentLine=86900737;
 //BA.debugLineNum = 86900737;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=86900738;
 //BA.debugLineNum = 86900738;BA.debugLine="End Sub";
return "";
}
public String  _labelatras_click(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "labelatras_click", false))
	 {return ((String) Debug.delegate(ba, "labelatras_click", null));}
RDebugUtils.currentLine=86704128;
 //BA.debugLineNum = 86704128;BA.debugLine="Private Sub LabelAtras_Click";
RDebugUtils.currentLine=86704129;
 //BA.debugLineNum = 86704129;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=86704130;
 //BA.debugLineNum = 86704130;BA.debugLine="End Sub";
return "";
}
}