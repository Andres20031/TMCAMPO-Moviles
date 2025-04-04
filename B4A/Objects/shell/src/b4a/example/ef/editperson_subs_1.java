package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class editperson_subs_1 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (editperson) ","editperson",21,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "editperson","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
RemoteObject _dateparts = null;
Debug.locals.put("Date", _date);
 BA.debugLineNum = 62;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
Debug.ShouldStop(-2147483648);
editperson.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 65;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(1);
_formatteddate = editperson.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 68;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(8);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 71;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
Debug.ShouldStop(64);
_dateparts = editperson.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("-")),(Object)(_formatteddate));Debug.locals.put("dateParts", _dateparts);Debug.locals.put("dateParts", _dateparts);
 BA.debugLineNum = 74;BA.debugLine="If dateParts.Length = 3 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_dateparts.getField(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 76;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
Debug.ShouldStop(2048);
_formatteddate = RemoteObject.concat(_dateparts.getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("formattedDate", _formatteddate);
 };
 BA.debugLineNum = 80;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(32768);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 83;BA.debugLine="Label12Fecha.Text = formattedDate";
Debug.ShouldStop(262144);
__ref.getField(false,"_label12fecha" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 86;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",editperson.__c.getField(true,"False"));
 BA.debugLineNum = 89;BA.debugLine="Fecha = formattedDate";
Debug.ShouldStop(16777216);
__ref.setField ("_fecha" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 92;BA.debugLine="Log(\"Fecha: \" & Fecha)";
Debug.ShouldStop(134217728);
editperson.__c.runVoidMethod ("LogImpl","486769694",RemoteObject.concat(RemoteObject.createImmutable("Fecha: "),__ref.getField(true,"_fecha" /*RemoteObject*/ )),0);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (editperson) ","editperson",21,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "editperson","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 25;BA.debugLine="Root = Root1";
Debug.ShouldStop(16777216);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
Debug.ShouldStop(67108864);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(editperson.__c.getField(false,"Colors").getField(true,"White")),(Object)(editperson.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"EditPersons\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("EditPersons")),__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
Debug.ShouldStop(268435456);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, ((int)0xff25253d)));
 BA.debugLineNum = 30;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
Debug.ShouldStop(536870912);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextcolor",editperson.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 31;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"EditPersons1";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.editperson.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("EditPersons1"))));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonbuscar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonBuscar_Click (editperson) ","editperson",21,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("buttonbuscar_click")) { return __ref.runUserSub(false, "editperson","buttonbuscar_click", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Private Sub ButtonBuscar_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
editperson._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",editperson._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
editperson._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",editperson._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
editperson._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",editperson._utilclass);
 //BA.debugLineNum = 5;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
editperson._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",editperson._rdclink);
 //BA.debugLineNum = 6;BA.debugLine="Private CLV_Editar As CustomListView";
editperson._clv_editar = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clv_editar",editperson._clv_editar);
 //BA.debugLineNum = 7;BA.debugLine="Dim Fecha As String";
editperson._fecha = RemoteObject.createImmutable("");__ref.setField("_fecha",editperson._fecha);
 //BA.debugLineNum = 8;BA.debugLine="Private Label12Fecha As Label";
editperson._label12fecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label12fecha",editperson._label12fecha);
 //BA.debugLineNum = 9;BA.debugLine="Private ButtonBuscar As Button";
editperson._buttonbuscar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttonbuscar",editperson._buttonbuscar);
 //BA.debugLineNum = 10;BA.debugLine="Private Panel12 As Panel";
editperson._panel12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel12",editperson._panel12);
 //BA.debugLineNum = 11;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
editperson._as_datepicker1 = RemoteObject.createNew ("b4a.example.ef.as_datepicker");__ref.setField("_as_datepicker1",editperson._as_datepicker1);
 //BA.debugLineNum = 12;BA.debugLine="Private PanelEdit As Panel";
editperson._paneledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_paneledit",editperson._paneledit);
 //BA.debugLineNum = 13;BA.debugLine="Private CustomListView1Geral As CustomListView";
editperson._customlistview1geral = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_customlistview1geral",editperson._customlistview1geral);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (editperson) ","editperson",21,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "editperson","createitem", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 36;BA.debugLine="Private Sub CreateItem As Panel";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(32);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 39;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(64);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(editperson.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(editperson.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 42;BA.debugLine="panel.LoadLayout(\"CardInputEditPerson\")";
Debug.ShouldStop(512);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("CardInputEditPerson")),__ref.getField(false, "ba"));
 BA.debugLineNum = 44;BA.debugLine="panel.Height=PanelEdit.Height";
Debug.ShouldStop(2048);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_paneledit" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 46;BA.debugLine="Return panel";
Debug.ShouldStop(8192);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (editperson) ","editperson",21,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "editperson","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Return Me";
Debug.ShouldStop(131072);
if (true) return __ref;
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label12fecha_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label12Fecha_Click (editperson) ","editperson",21,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("label12fecha_click")) { return __ref.runUserSub(false, "editperson","label12fecha_click", __ref);}
 BA.debugLineNum = 54;BA.debugLine="Private Sub Label12Fecha_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Panel12.Visible = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",editperson.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelatras_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LabelAtras_Click (editperson) ","editperson",21,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("labelatras_click")) { return __ref.runUserSub(false, "editperson","labelatras_click", __ref);}
 BA.debugLineNum = 49;BA.debugLine="Private Sub LabelAtras_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(131072);
editperson._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}