package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class form_subs_0 {


public static void  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (form) ","form",12,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("b4xpage_appear")) { __ref.runUserSub(false, "form","b4xpage_appear", __ref); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.form parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _estado = RemoteObject.createImmutable("");
int step14;
int limit14;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (form) ","form",12,__ref.getField(false, "ba"),__ref,89);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 90;BA.debugLine="Try";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
 BA.debugLineNum = 91;BA.debugLine="nitUpdate=\"\"";
Debug.ShouldStop(67108864);
__ref.setField ("_nitupdate" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 92;BA.debugLine="haciendaUpdate=\"\"";
Debug.ShouldStop(134217728);
__ref.setField ("_haciendaupdate" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 93;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 94;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB4008";
Debug.ShouldStop(536870912);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, ((int)0xb4008000))));
 BA.debugLineNum = 95;BA.debugLine="Root.LoadLayout(\"form\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("form")),__ref.getField(false, "ba"));
 BA.debugLineNum = 96;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, ((int)0xff25253d)));
 BA.debugLineNum = 97;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whi";
Debug.ShouldStop(1);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextcolor",parent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 98;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
Debug.ShouldStop(2);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.form.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form1"))));
 BA.debugLineNum = 99;BA.debugLine="Sleep(20)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "b4xpage_appear"),BA.numberCast(int.class, 20));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
 BA.debugLineNum = 100;BA.debugLine="If tipo=\"update\" Then";
Debug.ShouldStop(8);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_tipo" /*RemoteObject*/ ),BA.ObjectToString("update"))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 101;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(16);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 102;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM";
Debug.ShouldStop(32);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM maquina where id="),__ref.getField(true,"_idmaquina" /*RemoteObject*/ )))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 103;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(64);
if (true) break;

case 7:
//for
this.state = 10;
step14 = 1;
limit14 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 9;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step14)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 19;
 BA.debugLineNum = 104;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(128);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 111;BA.debugLine="Label10.text=Cursor.GetString(\"fechaInicio\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_label10" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fechaInicio")))));
 BA.debugLineNum = 112;BA.debugLine="Label13Time.text=Cursor.GetString(\"fechaFim\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fechaFim")))));
 BA.debugLineNum = 113;BA.debugLine="Label13Time.text=Cursor.GetString(\"fechaFim\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fechaFim")))));
 BA.debugLineNum = 114;BA.debugLine="EditText1HoraInicio.text=Cursor.GetString(\"are";
Debug.ShouldStop(131072);
__ref.getField(false,"_edittext1horainicio" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("arealabor")))));
 BA.debugLineNum = 115;BA.debugLine="nitUpdate=Cursor.GetString(\"Nit\")";
Debug.ShouldStop(262144);
__ref.setField ("_nitupdate" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Nit"))));
 BA.debugLineNum = 116;BA.debugLine="haciendaUpdate=Cursor.GetString(\"hacienda\")";
Debug.ShouldStop(524288);
__ref.setField ("_haciendaupdate" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("hacienda"))));
 BA.debugLineNum = 118;BA.debugLine="Log(\"NIT: \"&nitUpdate)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","411206685",RemoteObject.concat(RemoteObject.createImmutable("NIT: "),__ref.getField(true,"_nitupdate" /*RemoteObject*/ )),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("i", _i);
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 121;BA.debugLine="Log(\"NIT: \"&nit)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","411206688",RemoteObject.concat(RemoteObject.createImmutable("NIT: "),__ref.getField(true,"_nit" /*RemoteObject*/ )),0);
 if (true) break;

case 13:
//C
this.state = 16;
;
 BA.debugLineNum = 124;BA.debugLine="Dim estado As String";
Debug.ShouldStop(134217728);
_estado = RemoteObject.createImmutable("");Debug.locals.put("estado", _estado);
 BA.debugLineNum = 127;BA.debugLine="estado = \"N\"";
Debug.ShouldStop(1073741824);
_estado = BA.ObjectToString("N");Debug.locals.put("estado", _estado);
 BA.debugLineNum = 128;BA.debugLine="GetRecordNits(Main.pDBName,estado)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.ef.form.class, "_getrecordnits" /*void*/ ,(Object)(parent._main._pdbname /*RemoteObject*/ ),(Object)(_estado));
 BA.debugLineNum = 129;BA.debugLine="GetRecordHaciendas(Main.pDBName,estado)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.ef.form.class, "_getrecordhaciendas" /*void*/ ,(Object)(parent._main._pdbname /*RemoteObject*/ ),(Object)(_estado));
 BA.debugLineNum = 130;BA.debugLine="GetRecordLabores(Main.pDBName)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.ef.form.class, "_getrecordlabores" /*void*/ ,(Object)(parent._main._pdbname /*RemoteObject*/ ));
 BA.debugLineNum = 131;BA.debugLine="GetRecordElegasto(Main.pDBName)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.ef.form.class, "_getrecordelegasto" /*void*/ ,(Object)(parent._main._pdbname /*RemoteObject*/ ));
 BA.debugLineNum = 132;BA.debugLine="intContadorInsumos=0";
Debug.ShouldStop(8);
__ref.setField ("_intcontadorinsumos" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 133;BA.debugLine="listInsumos";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.form.class, "_listinsumos" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 BA.debugLineNum = 135;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","411206702",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (form) ","form",12,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "form","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 70;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Root = Root1";
Debug.ShouldStop(64);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1addisumo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1AddIsumo_Click (form) ","form",12,__ref.getField(false, "ba"),__ref,932);
if (RapidSub.canDelegate("button1addisumo_click")) { return __ref.runUserSub(false, "form","button1addisumo_click", __ref);}
 BA.debugLineNum = 932;BA.debugLine="Private Sub Button1AddIsumo_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 933;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 935;BA.debugLine="Button1AddIsumo=Sender";
Debug.ShouldStop(64);
__ref.getField(false,"_button1addisumo" /*RemoteObject*/ ).setObject (form.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 936;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"INSERT INTO insumo V";
Debug.ShouldStop(128);
form._starter._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO insumo VALUES (?, ?, ?,?)")),(Object)(form.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {form.__c.getField(false,"Null"),RemoteObject.createImmutable(("NO NAME")),RemoteObject.createImmutable(("0")),(__ref.getField(true,"_idmaquina" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 937;BA.debugLine="intContadorInsumos=	intContadorInsumos + 1";
Debug.ShouldStop(256);
__ref.setField ("_intcontadorinsumos" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intcontadorinsumos" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 938;BA.debugLine="listInsumos";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.ef.form.class, "_listinsumos" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 940;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
form.__c.runVoidMethod ("LogImpl","413631496",BA.ObjectToString(form.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 943;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _can_oncanceldate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("can_OnCancelDate (form) ","form",12,__ref.getField(false, "ba"),__ref,357);
if (RapidSub.canDelegate("can_oncanceldate")) { return __ref.runUserSub(false, "form","can_oncanceldate", __ref);}
 BA.debugLineNum = 357;BA.debugLine="Sub can_OnCancelDate ()";
Debug.ShouldStop(16);
 BA.debugLineNum = 358;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
Debug.ShouldStop(32);
form.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("cancel")),(Object)(form.__c.getField(true,"False")));
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 2;BA.debugLine="Dim nitUpdate As String=\"\"";
form._nitupdate = BA.ObjectToString("");__ref.setField("_nitupdate",form._nitupdate);
 //BA.debugLineNum = 3;BA.debugLine="Dim haciendaUpdate As String";
form._haciendaupdate = RemoteObject.createImmutable("");__ref.setField("_haciendaupdate",form._haciendaupdate);
 //BA.debugLineNum = 5;BA.debugLine="Dim idMaquina As Int";
form._idmaquina = RemoteObject.createImmutable(0);__ref.setField("_idmaquina",form._idmaquina);
 //BA.debugLineNum = 6;BA.debugLine="Dim tipo As String=\"\"";
form._tipo = BA.ObjectToString("");__ref.setField("_tipo",form._tipo);
 //BA.debugLineNum = 7;BA.debugLine="Private Root As B4XView 'ignore";
form._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",form._root);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
form._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",form._xui);
 //BA.debugLineNum = 10;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
form._datepicker = RemoteObject.createNew ("lib.intellvold.datepicker.DatePicker");__ref.setField("_datepicker",form._datepicker);
 //BA.debugLineNum = 11;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
form._mycalendar = RemoteObject.createNew ("lib.intellvold.datepicker.clander");__ref.setField("_mycalendar",form._mycalendar);
 //BA.debugLineNum = 12;BA.debugLine="Dim Timepicker As Intellvold_TimePicker";
form._timepicker = RemoteObject.createNew ("lib.intellvold.datepicker.TimePicker");__ref.setField("_timepicker",form._timepicker);
 //BA.debugLineNum = 14;BA.debugLine="Dim Datepicker2 As Intellvold_DatePicker";
form._datepicker2 = RemoteObject.createNew ("lib.intellvold.datepicker.DatePicker");__ref.setField("_datepicker2",form._datepicker2);
 //BA.debugLineNum = 15;BA.debugLine="Dim Mycalendar2 As Intellvold_Calendar";
form._mycalendar2 = RemoteObject.createNew ("lib.intellvold.datepicker.clander");__ref.setField("_mycalendar2",form._mycalendar2);
 //BA.debugLineNum = 17;BA.debugLine="Private utilClass As util";
form._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",form._utilclass);
 //BA.debugLineNum = 18;BA.debugLine="Private ScrollView1 As ScrollView";
form._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollview1",form._scrollview1);
 //BA.debugLineNum = 19;BA.debugLine="Dim xui As XUI";
form._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",form._xui);
 //BA.debugLineNum = 20;BA.debugLine="Private Panel3 As Panel";
form._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel3",form._panel3);
 //BA.debugLineNum = 21;BA.debugLine="Private xui As XUI";
form._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",form._xui);
 //BA.debugLineNum = 22;BA.debugLine="Private Panel1 As Panel";
form._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",form._panel1);
 //BA.debugLineNum = 23;BA.debugLine="Private Label10 As Label";
form._label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label10",form._label10);
 //BA.debugLineNum = 24;BA.debugLine="Private SpinnerNit As Spinner";
form._spinnernit = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_spinnernit",form._spinnernit);
 //BA.debugLineNum = 25;BA.debugLine="Private EditText2area As EditText";
form._edittext2area = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext2area",form._edittext2area);
 //BA.debugLineNum = 26;BA.debugLine="Private EditText1cmb As EditText";
form._edittext1cmb = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1cmb",form._edittext1cmb);
 //BA.debugLineNum = 27;BA.debugLine="Private Label13Time As Label";
form._label13time = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label13time",form._label13time);
 //BA.debugLineNum = 28;BA.debugLine="Private EditText2HoraFim As EditText";
form._edittext2horafim = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext2horafim",form._edittext2horafim);
 //BA.debugLineNum = 29;BA.debugLine="Private EditText1HoraInicio As EditText";
form._edittext1horainicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1horainicio",form._edittext1horainicio);
 //BA.debugLineNum = 31;BA.debugLine="Private nit As String";
form._nit = RemoteObject.createImmutable("");__ref.setField("_nit",form._nit);
 //BA.debugLineNum = 32;BA.debugLine="Private hacienda As String";
form._hacienda = RemoteObject.createImmutable("");__ref.setField("_hacienda",form._hacienda);
 //BA.debugLineNum = 33;BA.debugLine="Private lote As String";
form._lote = RemoteObject.createImmutable("");__ref.setField("_lote",form._lote);
 //BA.debugLineNum = 41;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
form._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",form._rdclink);
 //BA.debugLineNum = 43;BA.debugLine="Private CustomListView1Geral As CustomListView";
form._customlistview1geral = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_customlistview1geral",form._customlistview1geral);
 //BA.debugLineNum = 44;BA.debugLine="Private Panel1geral As Panel";
form._panel1geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1geral",form._panel1geral);
 //BA.debugLineNum = 45;BA.debugLine="Private Label14Add As Label";
form._label14add = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label14add",form._label14add);
 //BA.debugLineNum = 46;BA.debugLine="Private Button1AddIsumo As Button";
form._button1addisumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1addisumo",form._button1addisumo);
 //BA.debugLineNum = 47;BA.debugLine="Private Label1RemoveInsumo As Label";
form._label1removeinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1removeinsumo",form._label1removeinsumo);
 //BA.debugLineNum = 48;BA.debugLine="Private Label1Empty As Label";
form._label1empty = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1empty",form._label1empty);
 //BA.debugLineNum = 49;BA.debugLine="Private Label2InsumoName As Label";
form._label2insumoname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2insumoname",form._label2insumoname);
 //BA.debugLineNum = 51;BA.debugLine="Private EditText2QntInsumo As EditText";
form._edittext2qntinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext2qntinsumo",form._edittext2qntinsumo);
 //BA.debugLineNum = 52;BA.debugLine="Private Spinner1NameInsumo As Spinner";
form._spinner1nameinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_spinner1nameinsumo",form._spinner1nameinsumo);
 //BA.debugLineNum = 54;BA.debugLine="Private intContadorInsumos As Int";
form._intcontadorinsumos = RemoteObject.createImmutable(0);__ref.setField("_intcontadorinsumos",form._intcontadorinsumos);
 //BA.debugLineNum = 56;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
form._sd_xcomboboxnit = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxnit",form._sd_xcomboboxnit);
 //BA.debugLineNum = 57;BA.debugLine="Private SD_xComboBoxHda As SD_xComboBox";
form._sd_xcomboboxhda = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxhda",form._sd_xcomboboxhda);
 //BA.debugLineNum = 58;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
form._sd_xcomboboxlote = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlote",form._sd_xcomboboxlote);
 //BA.debugLineNum = 59;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
form._sd_xcomboboxlabor = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlabor",form._sd_xcomboboxlabor);
 //BA.debugLineNum = 60;BA.debugLine="Private SD_xComboBoxEleGasto As SD_xComboBox";
form._sd_xcomboboxelegasto = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxelegasto",form._sd_xcomboboxelegasto);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _configtime(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("configTime (form) ","form",12,__ref.getField(false, "ba"),__ref,390);
if (RapidSub.canDelegate("configtime")) { return __ref.runUserSub(false, "form","configtime", __ref, _tag);}
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 390;BA.debugLine="Sub configTime(tag As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 401;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
Debug.ShouldStop(65536);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_tag),(Object)(BA.numberCast(int.class, 2022)),(Object)(form.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(form.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(form.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(form.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 402;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
Debug.ShouldStop(131072);
__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dd.mm.yyyy")),(Object)(__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getField(false,"PRC")),(Object)(RemoteObject.createImmutable("2.02.1990")));
 BA.debugLineNum = 403;BA.debugLine="Datepicker.SetThemeDark";
Debug.ShouldStop(262144);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetThemeDark");
 BA.debugLineNum = 404;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
Debug.ShouldStop(524288);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetMinDate",(Object)((__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 405;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dd.mm.yyyy")),(Object)(__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getField(false,"PRC")),(Object)(RemoteObject.createImmutable("2.02.2030")));
 BA.debugLineNum = 406;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetMaxDate",(Object)((__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 407;BA.debugLine="Datepicker.CancelColor = Colors.White";
Debug.ShouldStop(4194304);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setCancelColor",form.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 408;BA.debugLine="Datepicker.OkColor = Colors.White";
Debug.ShouldStop(8388608);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setOkColor",form.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 409;BA.debugLine="Datepicker.Title = \"Selecione\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setTitle",BA.ObjectToString("Selecione"));
 BA.debugLineNum = 410;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setCancelText",BA.ObjectToString("Cancelar"));
 BA.debugLineNum = 411;BA.debugLine="Datepicker.OkText = \"Ok\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setOkText",BA.ObjectToString("Ok"));
 BA.debugLineNum = 412;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetOnCancel",(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 413;BA.debugLine="Datepicker.show2(\"iki\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("show2",(Object)(RemoteObject.createImmutable("iki")));
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (form) ","form",12,__ref.getField(false, "ba"),__ref,578);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "form","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 578;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(2);
 BA.debugLineNum = 579;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(4);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 580;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(8);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 581;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(16);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 582;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 583;BA.debugLine="Return cmd";
Debug.ShouldStop(64);
if (true) return _cmd;
 BA.debugLineNum = 584;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (form) ","form",12,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "form","createitem", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 315;BA.debugLine="Private Sub CreateItem As Panel";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 317;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(268435456);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 318;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(536870912);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(form.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(form.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 321;BA.debugLine="panel.LoadLayout(\"scroolUI\")";
Debug.ShouldStop(1);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scroolUI")),__ref.getField(false, "ba"));
 BA.debugLineNum = 323;BA.debugLine="panel.Height=Panel1geral.Height";
Debug.ShouldStop(4);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel1geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 347;BA.debugLine="Return panel";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createiteminsumos(RemoteObject __ref,RemoteObject _i,RemoteObject _id,RemoteObject _name,RemoteObject _qnt) throws Exception{
try {
		Debug.PushSubsStack("CreateItemInsumos (form) ","form",12,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("createiteminsumos")) { return __ref.runUserSub(false, "form","createiteminsumos", __ref, _i, _id, _name, _qnt);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("i", _i);
Debug.locals.put("id", _id);
Debug.locals.put("name", _name);
Debug.locals.put("qnt", _qnt);
 BA.debugLineNum = 203;BA.debugLine="Private Sub CreateItemInsumos(i As Int,id As Int,";
Debug.ShouldStop(1024);
 BA.debugLineNum = 205;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4096);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 206;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 450dip)";
Debug.ShouldStop(8192);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(form.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(form.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 450)))));
 BA.debugLineNum = 208;BA.debugLine="panel.LoadLayout(\"Cardisumo\")";
Debug.ShouldStop(32768);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Cardisumo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 211;BA.debugLine="EditText2QntInsumo.Color=Colors.Transparent";
Debug.ShouldStop(262144);
__ref.getField(false,"_edittext2qntinsumo" /*RemoteObject*/ ).runVoidMethod ("setColor",form.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 212;BA.debugLine="Label2InsumoName.Text=\"Insumo #\"&i";
Debug.ShouldStop(524288);
__ref.getField(false,"_label2insumoname" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Insumo #"),_i)));
 BA.debugLineNum = 213;BA.debugLine="Label1RemoveInsumo.Tag=id";
Debug.ShouldStop(1048576);
__ref.getField(false,"_label1removeinsumo" /*RemoteObject*/ ).runMethod(false,"setTag",(_id));
 BA.debugLineNum = 214;BA.debugLine="Spinner1NameInsumo.Tag=id";
Debug.ShouldStop(2097152);
__ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).runMethod(false,"setTag",(_id));
 BA.debugLineNum = 215;BA.debugLine="EditText2QntInsumo.Tag=id";
Debug.ShouldStop(4194304);
__ref.getField(false,"_edittext2qntinsumo" /*RemoteObject*/ ).runMethod(false,"setTag",(_id));
 BA.debugLineNum = 216;BA.debugLine="EditText2QntInsumo.text=qnt";
Debug.ShouldStop(8388608);
__ref.getField(false,"_edittext2qntinsumo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_qnt));
 BA.debugLineNum = 217;BA.debugLine="Spinner1NameInsumo.Prompt=name";
Debug.ShouldStop(16777216);
__ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).runMethod(true,"setPrompt",BA.ObjectToCharSequence(_name));
 BA.debugLineNum = 218;BA.debugLine="panel.Height=Panel1geral.Height";
Debug.ShouldStop(33554432);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel1geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 220;BA.debugLine="FillSpinner(name)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.ef.form.class, "_fillspinner" /*void*/ ,(Object)(_name));
 BA.debugLineNum = 235;BA.debugLine="Return panel";
Debug.ShouldStop(1024);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject __ref,RemoteObject _db) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (form) ","form",12,__ref.getField(false, "ba"),__ref,572);
if (RapidSub.canDelegate("createrequest")) { return __ref.runUserSub(false, "form","createrequest", __ref, _db);}
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
Debug.locals.put("Db", _db);
 BA.debugLineNum = 572;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 573;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(268435456);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 574;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" &  Main.p";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),form._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 575;BA.debugLine="Return Req";
Debug.ShouldStop(1073741824);
if (true) return _req;
 BA.debugLineNum = 576;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _date_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("Date_OnDateSet (form) ","form",12,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("date_ondateset")) { return __ref.runUserSub(false, "form","date_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 352;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
Debug.ShouldStop(1);
__ref.getField(false,"_label10" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),(form.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _monthofyear)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable("/"),form.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _dayofmonth)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 354;BA.debugLine="Label10.TextColor=Colors.Black";
Debug.ShouldStop(2);
__ref.getField(false,"_label10" /*RemoteObject*/ ).runMethod(true,"setTextColor",form.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleterecord(RemoteObject __ref,RemoteObject _nombre) throws Exception{
try {
		Debug.PushSubsStack("DeleteRecord (form) ","form",12,__ref.getField(false, "ba"),__ref,507);
if (RapidSub.canDelegate("deleterecord")) { return __ref.runUserSub(false, "form","deleterecord", __ref, _nombre);}
Debug.locals.put("Nombre", _nombre);
 BA.debugLineNum = 507;BA.debugLine="Sub DeleteRecord (Nombre As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 515;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext2qntinsumo_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText2QntInsumo_TextChanged (form) ","form",12,__ref.getField(false, "ba"),__ref,968);
if (RapidSub.canDelegate("edittext2qntinsumo_textchanged")) { return __ref.runUserSub(false, "form","edittext2qntinsumo_textchanged", __ref, _old, _new);}
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 968;BA.debugLine="Private Sub EditText2QntInsumo_TextChanged (Old As";
Debug.ShouldStop(128);
 BA.debugLineNum = 969;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 970;BA.debugLine="EditText2QntInsumo=Sender";
Debug.ShouldStop(512);
__ref.getField(false,"_edittext2qntinsumo" /*RemoteObject*/ ).setObject (form.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 972;BA.debugLine="Dim id As Int=EditText2QntInsumo.Tag";
Debug.ShouldStop(2048);
_id = BA.numberCast(int.class, __ref.getField(false,"_edittext2qntinsumo" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 973;BA.debugLine="Starter.updateInsumo(\"\",EditText2QntInsumo.text,";
Debug.ShouldStop(4096);
form._starter.runVoidMethod ("_updateinsumo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_edittext2qntinsumo" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_id),(Object)(BA.NumberToString(__ref.getField(true,"_idmaquina" /*RemoteObject*/ ))));
 BA.debugLineNum = 974;BA.debugLine="selectSQl(id)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.ef.form.class, "_selectsql" /*void*/ ,(Object)(_id));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 977;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
form.__c.runVoidMethod ("LogImpl","413762569",BA.ObjectToString(form.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 979;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _fillspinner(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("FillSpinner (form) ","form",12,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("fillspinner")) { __ref.runUserSub(false, "form","fillspinner", __ref, _name); return;}
ResumableSub_FillSpinner rsub = new ResumableSub_FillSpinner(null,__ref,_name);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FillSpinner extends BA.ResumableSub {
public ResumableSub_FillSpinner(b4a.example.ef.form parent,RemoteObject __ref,RemoteObject _name) {
this.parent = parent;
this.__ref = __ref;
this._name = _name;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _name;
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
int step5;
int limit5;
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FillSpinner (form) ","form",12,__ref.getField(false, "ba"),__ref,239);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("name", _name);
 BA.debugLineNum = 240;BA.debugLine="Try";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//try
this.state = 17;
this.catchState = 16;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 16;
 BA.debugLineNum = 241;BA.debugLine="Spinner1NameInsumo.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 243;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(262144);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 245;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM n";
Debug.ShouldStop(1048576);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM namesinsumo where name='"),_name,RemoteObject.createImmutable("'")))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 247;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//for
this.state = 7;
step5 = 1;
limit5 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 7;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 6;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step5)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 19;
 BA.debugLineNum = 248;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(8388608);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 249;BA.debugLine="Log(Cursor.GetString(\"name\"))";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","411468810",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name"))),0);
 BA.debugLineNum = 250;BA.debugLine="Spinner1NameInsumo.Add(Cursor.GetString(\"name\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 253;BA.debugLine="If name=\"NO NAME\" Then";
Debug.ShouldStop(268435456);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_name,BA.ObjectToString("NO NAME"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 254;BA.debugLine="Spinner1NameInsumo.Add(\"\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 256;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(-2147483648);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 259;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM n";
Debug.ShouldStop(4);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM namesinsumo"))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 260;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(8);
if (true) break;

case 11:
//for
this.state = 14;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 20;
if (true) break;

case 20:
//C
this.state = 14;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 13;
if (true) break;

case 21:
//C
this.state = 20;
_i = ((int)(0 + _i + step15)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 21;
 BA.debugLineNum = 261;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(16);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 263;BA.debugLine="Spinner1NameInsumo.Add(Cursor.GetString(\"name\")";
Debug.ShouldStop(64);
__ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
 BA.debugLineNum = 266;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","411468827",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 17:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 268;BA.debugLine="Sleep(20)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "fillspinner"),BA.numberCast(int.class, 20));
this.state = 22;
return;
case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _getrecordelegasto(RemoteObject __ref,RemoteObject _usedb) throws Exception{
try {
		Debug.PushSubsStack("GetRecordElegasto (form) ","form",12,__ref.getField(false, "ba"),__ref,851);
if (RapidSub.canDelegate("getrecordelegasto")) { __ref.runUserSub(false, "form","getrecordelegasto", __ref, _usedb); return;}
ResumableSub_GetRecordElegasto rsub = new ResumableSub_GetRecordElegasto(null,__ref,_usedb);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordElegasto extends BA.ResumableSub {
public ResumableSub_GetRecordElegasto(b4a.example.ef.form parent,RemoteObject __ref,RemoteObject _usedb) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _usedb;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _separador = RemoteObject.createImmutable("");
RemoteObject _longitud = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
RemoteObject group11;
int index11;
int groupLen11;
RemoteObject group14;
int index14;
int groupLen14;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordElegasto (form) ","form",12,__ref.getField(false, "ba"),__ref,851);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
 BA.debugLineNum = 852;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(524288);
_req = __ref.runClassMethod (b4a.example.ef.form.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 853;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_eleg";
Debug.ShouldStop(1048576);
_cmd = __ref.runClassMethod (b4a.example.ef.form.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_elegasto")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 855;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(4194304);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 856;BA.debugLine="Dim separador As String";
Debug.ShouldStop(8388608);
_separador = RemoteObject.createImmutable("");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 857;BA.debugLine="Dim longitud As Int";
Debug.ShouldStop(16777216);
_longitud = RemoteObject.createImmutable(0);Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 859;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordelegasto"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 860;BA.debugLine="If j.Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 14;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 861;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(268435456);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 862;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordelegasto"), (_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 865;BA.debugLine="SD_xComboBoxEleGasto.Add(\"----Select----\",1)";
Debug.ShouldStop(1);
__ref.getField(false,"_sd_xcomboboxelegasto" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 866;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(2);
if (true) break;

case 4:
//for
this.state = 11;
group11 = _res.getField(false,"Rows" /*RemoteObject*/ );
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index11 < groupLen11) {
this.state = 6;
_row = (group11.runMethod(false,"Get",index11));Debug.locals.put("row", _row);}
if (true) break;

case 18:
//C
this.state = 17;
index11++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 867;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(4);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 868;BA.debugLine="separador=\" - \"";
Debug.ShouldStop(8);
_separador = BA.ObjectToString(" - ");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 869;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(16);
if (true) break;

case 7:
//for
this.state = 10;
group14 = _row;
index14 = 0;
groupLen14 = group14.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index14 < groupLen14) {
this.state = 9;
_record = group14.getArrayElement(false,RemoteObject.createImmutable(index14));Debug.locals.put("record", _record);}
if (true) break;

case 20:
//C
this.state = 19;
index14++;
Debug.locals.put("record", _record);
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 870;BA.debugLine="cadena=cadena & record & separador";
Debug.ShouldStop(32);
_cadena = RemoteObject.concat(_cadena,_record,_separador);Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
Debug.locals.put("record", _record);
;
 BA.debugLineNum = 872;BA.debugLine="longitud = cadena.Length";
Debug.ShouldStop(128);
_longitud = _cadena.runMethod(true,"length");Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 873;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
Debug.ShouldStop(256);
_cadena = _cadena.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_longitud,RemoteObject.createImmutable(3)}, "-",1, 1)));Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 874;BA.debugLine="SD_xComboBoxEleGasto.Add(cadena,1)";
Debug.ShouldStop(512);
__ref.getField(false,"_sd_xcomboboxelegasto" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_cadena),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 875;BA.debugLine="cadena=\"\"";
Debug.ShouldStop(1024);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("row", _row);
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 879;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","413238300",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 881;BA.debugLine="j.Release";
Debug.ShouldStop(65536);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 882;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static void  _getrecordhaciendas(RemoteObject __ref,RemoteObject _usedb,RemoteObject _estado) throws Exception{
try {
		Debug.PushSubsStack("GetRecordHaciendas (form) ","form",12,__ref.getField(false, "ba"),__ref,678);
if (RapidSub.canDelegate("getrecordhaciendas")) { __ref.runUserSub(false, "form","getrecordhaciendas", __ref, _usedb, _estado); return;}
ResumableSub_GetRecordHaciendas rsub = new ResumableSub_GetRecordHaciendas(null,__ref,_usedb,_estado);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordHaciendas extends BA.ResumableSub {
public ResumableSub_GetRecordHaciendas(b4a.example.ef.form parent,RemoteObject __ref,RemoteObject _usedb,RemoteObject _estado) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._estado = _estado;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _usedb;
RemoteObject _estado;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _separador = RemoteObject.createImmutable("");
RemoteObject _longitud = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
RemoteObject group12;
int index12;
int groupLen12;
RemoteObject group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordHaciendas (form) ","form",12,__ref.getField(false, "ba"),__ref,678);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
Debug.locals.put("estado", _estado);
 BA.debugLineNum = 679;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(64);
_req = __ref.runClassMethod (b4a.example.ef.form.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 680;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
Debug.ShouldStop(128);
_cmd = __ref.runClassMethod (b4a.example.ef.form.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_estado)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 682;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(512);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 683;BA.debugLine="Dim separador As String";
Debug.ShouldStop(1024);
_separador = RemoteObject.createImmutable("");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 684;BA.debugLine="Dim longitud As Int";
Debug.ShouldStop(2048);
_longitud = RemoteObject.createImmutable(0);Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 686;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordhaciendas"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 687;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 20;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 688;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(32768);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 689;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordhaciendas"), (_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 693;BA.debugLine="SD_xComboBoxHda.Add(\"----Select----\",1)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sd_xcomboboxhda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 694;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\",1)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 695;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//for
this.state = 17;
group12 = _res.getField(false,"Rows" /*RemoteObject*/ );
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 17;
if (index12 < groupLen12) {
this.state = 6;
_row = (group12.runMethod(false,"Get",index12));Debug.locals.put("row", _row);}
if (true) break;

case 24:
//C
this.state = 23;
index12++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 696;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(8388608);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 697;BA.debugLine="separador=\" - \"";
Debug.ShouldStop(16777216);
_separador = BA.ObjectToString(" - ");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 698;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//for
this.state = 10;
group15 = _row;
index15 = 0;
groupLen15 = group15.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 10;
if (index15 < groupLen15) {
this.state = 9;
_record = group15.getArrayElement(false,RemoteObject.createImmutable(index15));Debug.locals.put("record", _record);}
if (true) break;

case 26:
//C
this.state = 25;
index15++;
Debug.locals.put("record", _record);
if (true) break;

case 9:
//C
this.state = 26;
 BA.debugLineNum = 699;BA.debugLine="cadena=cadena & record & separador";
Debug.ShouldStop(67108864);
_cadena = RemoteObject.concat(_cadena,_record,_separador);Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("record", _record);
;
 BA.debugLineNum = 704;BA.debugLine="Log(\"cadena: \"&cadena)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","412845082",RemoteObject.concat(RemoteObject.createImmutable("cadena: "),_cadena),0);
 BA.debugLineNum = 705;BA.debugLine="Log(\"hacienda: \"&haciendaUpdate)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","412845083",RemoteObject.concat(RemoteObject.createImmutable("hacienda: "),__ref.getField(true,"_haciendaupdate" /*RemoteObject*/ )),0);
 BA.debugLineNum = 706;BA.debugLine="If cadena.Contains(haciendaUpdate) Then";
Debug.ShouldStop(2);
if (true) break;

case 11:
//if
this.state = 16;
if (_cadena.runMethod(true,"contains",(Object)(__ref.getField(true,"_haciendaupdate" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 707;BA.debugLine="longitud = cadena.Length";
Debug.ShouldStop(4);
_longitud = _cadena.runMethod(true,"length");Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 708;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
Debug.ShouldStop(8);
_cadena = _cadena.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_longitud,RemoteObject.createImmutable(3)}, "-",1, 1)));Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 709;BA.debugLine="SD_xComboBoxHda.Add(cadena,1)";
Debug.ShouldStop(16);
__ref.getField(false,"_sd_xcomboboxhda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_cadena),(Object)(RemoteObject.createImmutable((1))));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 711;BA.debugLine="longitud = cadena.Length";
Debug.ShouldStop(64);
_longitud = _cadena.runMethod(true,"length");Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 712;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
Debug.ShouldStop(128);
_cadena = _cadena.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_longitud,RemoteObject.createImmutable(3)}, "-",1, 1)));Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 713;BA.debugLine="SD_xComboBoxHda.Add(cadena,1)";
Debug.ShouldStop(256);
__ref.getField(false,"_sd_xcomboboxhda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_cadena),(Object)(RemoteObject.createImmutable((1))));
 if (true) break;

case 16:
//C
this.state = 24;
;
 BA.debugLineNum = 716;BA.debugLine="cadena=\"\"";
Debug.ShouldStop(2048);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
Debug.locals.put("row", _row);
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 720;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","412845098",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 722;BA.debugLine="j.Release";
Debug.ShouldStop(131072);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 723;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _getrecordlabores(RemoteObject __ref,RemoteObject _usedb) throws Exception{
try {
		Debug.PushSubsStack("GetRecordLabores (form) ","form",12,__ref.getField(false, "ba"),__ref,817);
if (RapidSub.canDelegate("getrecordlabores")) { __ref.runUserSub(false, "form","getrecordlabores", __ref, _usedb); return;}
ResumableSub_GetRecordLabores rsub = new ResumableSub_GetRecordLabores(null,__ref,_usedb);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordLabores extends BA.ResumableSub {
public ResumableSub_GetRecordLabores(b4a.example.ef.form parent,RemoteObject __ref,RemoteObject _usedb) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _usedb;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _separador = RemoteObject.createImmutable("");
RemoteObject _longitud = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
RemoteObject group11;
int index11;
int groupLen11;
RemoteObject group14;
int index14;
int groupLen14;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordLabores (form) ","form",12,__ref.getField(false, "ba"),__ref,817);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
 BA.debugLineNum = 818;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(131072);
_req = __ref.runClassMethod (b4a.example.ef.form.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 819;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
Debug.ShouldStop(262144);
_cmd = __ref.runClassMethod (b4a.example.ef.form.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labores")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 821;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(1048576);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 822;BA.debugLine="Dim separador As String";
Debug.ShouldStop(2097152);
_separador = RemoteObject.createImmutable("");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 823;BA.debugLine="Dim longitud As Int";
Debug.ShouldStop(4194304);
_longitud = RemoteObject.createImmutable(0);Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 825;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordlabores"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 826;BA.debugLine="If j.Success Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 14;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 827;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(67108864);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 828;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordlabores"), (_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 831;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\",1)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sd_xcomboboxlabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 833;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(1);
if (true) break;

case 4:
//for
this.state = 11;
group11 = _res.getField(false,"Rows" /*RemoteObject*/ );
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index11 < groupLen11) {
this.state = 6;
_row = (group11.runMethod(false,"Get",index11));Debug.locals.put("row", _row);}
if (true) break;

case 18:
//C
this.state = 17;
index11++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 834;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(2);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 835;BA.debugLine="separador=\" - \"";
Debug.ShouldStop(4);
_separador = BA.ObjectToString(" - ");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 836;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(8);
if (true) break;

case 7:
//for
this.state = 10;
group14 = _row;
index14 = 0;
groupLen14 = group14.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index14 < groupLen14) {
this.state = 9;
_record = group14.getArrayElement(false,RemoteObject.createImmutable(index14));Debug.locals.put("record", _record);}
if (true) break;

case 20:
//C
this.state = 19;
index14++;
Debug.locals.put("record", _record);
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 837;BA.debugLine="cadena=cadena & record & separador";
Debug.ShouldStop(16);
_cadena = RemoteObject.concat(_cadena,_record,_separador);Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
Debug.locals.put("record", _record);
;
 BA.debugLineNum = 839;BA.debugLine="longitud = cadena.Length";
Debug.ShouldStop(64);
_longitud = _cadena.runMethod(true,"length");Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 840;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
Debug.ShouldStop(128);
_cadena = _cadena.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_longitud,RemoteObject.createImmutable(3)}, "-",1, 1)));Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 841;BA.debugLine="SD_xComboBoxLabor.Add(cadena,1)";
Debug.ShouldStop(256);
__ref.getField(false,"_sd_xcomboboxlabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_cadena),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 842;BA.debugLine="cadena=\"\"";
Debug.ShouldStop(512);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("row", _row);
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 846;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","413172765",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 848;BA.debugLine="j.Release";
Debug.ShouldStop(32768);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 849;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _getrecordlotes(RemoteObject __ref,RemoteObject _usedb,RemoteObject _nitlote,RemoteObject _hda) throws Exception{
try {
		Debug.PushSubsStack("GetRecordLotes (form) ","form",12,__ref.getField(false, "ba"),__ref,741);
if (RapidSub.canDelegate("getrecordlotes")) { __ref.runUserSub(false, "form","getrecordlotes", __ref, _usedb, _nitlote, _hda); return;}
ResumableSub_GetRecordLotes rsub = new ResumableSub_GetRecordLotes(null,__ref,_usedb,_nitlote,_hda);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordLotes extends BA.ResumableSub {
public ResumableSub_GetRecordLotes(b4a.example.ef.form parent,RemoteObject __ref,RemoteObject _usedb,RemoteObject _nitlote,RemoteObject _hda) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._nitlote = _nitlote;
this._hda = _hda;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _usedb;
RemoteObject _nitlote;
RemoteObject _hda;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
RemoteObject group8;
int index8;
int groupLen8;
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordLotes (form) ","form",12,__ref.getField(false, "ba"),__ref,741);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
Debug.locals.put("nitLote", _nitlote);
Debug.locals.put("hda", _hda);
 BA.debugLineNum = 742;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(32);
_req = __ref.runClassMethod (b4a.example.ef.form.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 743;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
Debug.ShouldStop(64);
_cmd = __ref.runClassMethod (b4a.example.ef.form.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_nitlote),(_hda)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 745;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(256);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 746;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordlotes"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 747;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 14;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 748;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 749;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordlotes"), (_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 753;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//for
this.state = 11;
group8 = _res.getField(false,"Rows" /*RemoteObject*/ );
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index8 < groupLen8) {
this.state = 6;
_row = (group8.runMethod(false,"Get",index8));Debug.locals.put("row", _row);}
if (true) break;

case 18:
//C
this.state = 17;
index8++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 754;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(131072);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 755;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//for
this.state = 10;
group10 = _row;
index10 = 0;
groupLen10 = group10.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index10 < groupLen10) {
this.state = 9;
_record = group10.getArrayElement(false,RemoteObject.createImmutable(index10));Debug.locals.put("record", _record);}
if (true) break;

case 20:
//C
this.state = 19;
index10++;
Debug.locals.put("record", _record);
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 756;BA.debugLine="cadena=record";
Debug.ShouldStop(524288);
_cadena = BA.ObjectToString(_record);Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 757;BA.debugLine="SD_xComboBoxLote.Add(cadena,1)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_cadena),(Object)(RemoteObject.createImmutable((1))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
Debug.locals.put("record", _record);
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("row", _row);
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 764;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","412976151",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 766;BA.debugLine="j.Release";
Debug.ShouldStop(536870912);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 767;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _getrecordlotesarea(RemoteObject __ref,RemoteObject _usedb,RemoteObject _nitlote,RemoteObject _hda,RemoteObject _lotearea) throws Exception{
try {
		Debug.PushSubsStack("GetRecordLotesArea (form) ","form",12,__ref.getField(false, "ba"),__ref,784);
if (RapidSub.canDelegate("getrecordlotesarea")) { __ref.runUserSub(false, "form","getrecordlotesarea", __ref, _usedb, _nitlote, _hda, _lotearea); return;}
ResumableSub_GetRecordLotesArea rsub = new ResumableSub_GetRecordLotesArea(null,__ref,_usedb,_nitlote,_hda,_lotearea);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordLotesArea extends BA.ResumableSub {
public ResumableSub_GetRecordLotesArea(b4a.example.ef.form parent,RemoteObject __ref,RemoteObject _usedb,RemoteObject _nitlote,RemoteObject _hda,RemoteObject _lotearea) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._nitlote = _nitlote;
this._hda = _hda;
this._lotearea = _lotearea;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _usedb;
RemoteObject _nitlote;
RemoteObject _hda;
RemoteObject _lotearea;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
RemoteObject group8;
int index8;
int groupLen8;
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordLotesArea (form) ","form",12,__ref.getField(false, "ba"),__ref,784);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
Debug.locals.put("nitlote", _nitlote);
Debug.locals.put("hda", _hda);
Debug.locals.put("loteArea", _lotearea);
 BA.debugLineNum = 785;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(65536);
_req = __ref.runClassMethod (b4a.example.ef.form.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 786;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_Area";
Debug.ShouldStop(131072);
_cmd = __ref.runClassMethod (b4a.example.ef.form.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_AreaSuertes")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_nitlote),(_hda),(_lotearea)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 788;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(524288);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 790;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordlotesarea"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 791;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 14;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 792;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(8388608);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 793;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordlotesarea"), (_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 797;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(268435456);
if (true) break;

case 4:
//for
this.state = 11;
group8 = _res.getField(false,"Rows" /*RemoteObject*/ );
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index8 < groupLen8) {
this.state = 6;
_row = (group8.runMethod(false,"Get",index8));Debug.locals.put("row", _row);}
if (true) break;

case 18:
//C
this.state = 17;
index8++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 798;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(536870912);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 799;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(1073741824);
if (true) break;

case 7:
//for
this.state = 10;
group10 = _row;
index10 = 0;
groupLen10 = group10.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index10 < groupLen10) {
this.state = 9;
_record = group10.getArrayElement(false,RemoteObject.createImmutable(index10));Debug.locals.put("record", _record);}
if (true) break;

case 20:
//C
this.state = 19;
index10++;
Debug.locals.put("record", _record);
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 800;BA.debugLine="cadena=record";
Debug.ShouldStop(-2147483648);
_cadena = BA.ObjectToString(_record);Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 802;BA.debugLine="EditText2HoraFim.Text=cadena";
Debug.ShouldStop(2);
__ref.getField(false,"_edittext2horafim" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cadena));
 BA.debugLineNum = 803;BA.debugLine="EditText2HoraFim.Enabled =False";
Debug.ShouldStop(4);
__ref.getField(false,"_edittext2horafim" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
Debug.locals.put("record", _record);
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("row", _row);
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 811;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","413107227",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 813;BA.debugLine="j.Release";
Debug.ShouldStop(4096);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 814;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _getrecordnits(RemoteObject __ref,RemoteObject _usedb,RemoteObject _estado) throws Exception{
try {
		Debug.PushSubsStack("GetRecordNits (form) ","form",12,__ref.getField(false, "ba"),__ref,630);
if (RapidSub.canDelegate("getrecordnits")) { __ref.runUserSub(false, "form","getrecordnits", __ref, _usedb, _estado); return;}
ResumableSub_GetRecordNits rsub = new ResumableSub_GetRecordNits(null,__ref,_usedb,_estado);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordNits extends BA.ResumableSub {
public ResumableSub_GetRecordNits(b4a.example.ef.form parent,RemoteObject __ref,RemoteObject _usedb,RemoteObject _estado) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._estado = _estado;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _usedb;
RemoteObject _estado;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _separador = RemoteObject.createImmutable("");
RemoteObject _longitud = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _intregistros = RemoteObject.createImmutable(0);
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
RemoteObject group13;
int index13;
int groupLen13;
RemoteObject group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordNits (form) ","form",12,__ref.getField(false, "ba"),__ref,630);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
Debug.locals.put("estado", _estado);
 BA.debugLineNum = 631;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(4194304);
_req = __ref.runClassMethod (b4a.example.ef.form.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 632;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
Debug.ShouldStop(8388608);
_cmd = __ref.runClassMethod (b4a.example.ef.form.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_nit")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 634;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(33554432);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 635;BA.debugLine="Dim separador As String";
Debug.ShouldStop(67108864);
_separador = RemoteObject.createImmutable("");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 636;BA.debugLine="Dim longitud As Int";
Debug.ShouldStop(134217728);
_longitud = RemoteObject.createImmutable(0);Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 638;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordnits"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 639;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 20;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 641;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 642;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getrecordnits"), (_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 645;BA.debugLine="SD_xComboBoxNit.Add(\"----Select----\",\"1\")";
Debug.ShouldStop(16);
__ref.getField(false,"_sd_xcomboboxnit" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 646;BA.debugLine="Dim INTRegistros As Int";
Debug.ShouldStop(32);
_intregistros = RemoteObject.createImmutable(0);Debug.locals.put("INTRegistros", _intregistros);
 BA.debugLineNum = 648;BA.debugLine="INTRegistros=0";
Debug.ShouldStop(128);
_intregistros = BA.numberCast(int.class, 0);Debug.locals.put("INTRegistros", _intregistros);
 BA.debugLineNum = 649;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(256);
if (true) break;

case 4:
//for
this.state = 17;
group13 = _res.getField(false,"Rows" /*RemoteObject*/ );
index13 = 0;
groupLen13 = group13.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 17;
if (index13 < groupLen13) {
this.state = 6;
_row = (group13.runMethod(false,"Get",index13));Debug.locals.put("row", _row);}
if (true) break;

case 24:
//C
this.state = 23;
index13++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 650;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(512);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 651;BA.debugLine="separador=\" - \"";
Debug.ShouldStop(1024);
_separador = BA.ObjectToString(" - ");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 652;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(2048);
if (true) break;

case 7:
//for
this.state = 10;
group16 = _row;
index16 = 0;
groupLen16 = group16.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 10;
if (index16 < groupLen16) {
this.state = 9;
_record = group16.getArrayElement(false,RemoteObject.createImmutable(index16));Debug.locals.put("record", _record);}
if (true) break;

case 26:
//C
this.state = 25;
index16++;
Debug.locals.put("record", _record);
if (true) break;

case 9:
//C
this.state = 26;
 BA.debugLineNum = 654;BA.debugLine="cadena=cadena & record & separador";
Debug.ShouldStop(8192);
_cadena = RemoteObject.concat(_cadena,_record,_separador);Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("record", _record);
;
 BA.debugLineNum = 656;BA.debugLine="longitud = cadena.Length";
Debug.ShouldStop(32768);
_longitud = _cadena.runMethod(true,"length");Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 657;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
Debug.ShouldStop(65536);
_cadena = _cadena.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_longitud,RemoteObject.createImmutable(3)}, "-",1, 1)));Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 658;BA.debugLine="INTRegistros=INTRegistros+1";
Debug.ShouldStop(131072);
_intregistros = RemoteObject.solve(new RemoteObject[] {_intregistros,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("INTRegistros", _intregistros);
 BA.debugLineNum = 659;BA.debugLine="If nitUpdate=cadena Then";
Debug.ShouldStop(262144);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_nitupdate" /*RemoteObject*/ ),_cadena)) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 660;BA.debugLine="Log(\"NIT: \"&nitUpdate)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","412779550",RemoteObject.concat(RemoteObject.createImmutable("NIT: "),__ref.getField(true,"_nitupdate" /*RemoteObject*/ )),0);
 BA.debugLineNum = 663;BA.debugLine="SD_xComboBoxNit.Add(nitUpdate,INTRegistros)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sd_xcomboboxnit" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_nitupdate" /*RemoteObject*/ )),(Object)((_intregistros)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 665;BA.debugLine="SD_xComboBoxNit.Add(cadena,INTRegistros)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sd_xcomboboxnit" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_cadena),(Object)((_intregistros)));
 BA.debugLineNum = 666;BA.debugLine="cadena=\"\"";
Debug.ShouldStop(33554432);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 if (true) break;

case 16:
//C
this.state = 24;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
Debug.locals.put("row", _row);
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 672;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","412779562",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 674;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 675;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _getvaluesintheedittexts(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValuesINTheEdittexts (form) ","form",12,__ref.getField(false, "ba"),__ref,421);
if (RapidSub.canDelegate("getvaluesintheedittexts")) { __ref.runUserSub(false, "form","getvaluesintheedittexts", __ref); return;}
ResumableSub_getValuesINTheEdittexts rsub = new ResumableSub_getValuesINTheEdittexts(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getValuesINTheEdittexts extends BA.ResumableSub {
public ResumableSub_getValuesINTheEdittexts(b4a.example.ef.form parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
int step6;
int limit6;
int step16;
int limit16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getValuesINTheEdittexts (form) ","form",12,__ref.getField(false, "ba"),__ref,421);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 422;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 423;BA.debugLine="sb.Initialize";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 424;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
 BA.debugLineNum = 425;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(256);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 426;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM i";
Debug.ShouldStop(512);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM insumo where idmaquina ="),__ref.getField(true,"_idmaquina" /*RemoteObject*/ )))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 427;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step6)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 16;
 BA.debugLineNum = 428;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(2048);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 429;BA.debugLine="Log(\"=====ITEM #\"&i&\"=====\")";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","412124168",RemoteObject.concat(RemoteObject.createImmutable("=====ITEM #"),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("=====")),0);
 BA.debugLineNum = 430;BA.debugLine="Log(Cursor.GetString(\"idmaquina\"))";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","412124169",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("idmaquina"))),0);
 BA.debugLineNum = 431;BA.debugLine="Log(Cursor.GetString(\"name\")&\"--\"&Cursor.GetStri";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","412124170",RemoteObject.concat(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name"))),RemoteObject.createImmutable("--"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("qnt")))),0);
 BA.debugLineNum = 432;BA.debugLine="sb.Append(Cursor.GetString(\"name\")&\"--\"&Cursor.G";
Debug.ShouldStop(32768);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name"))),RemoteObject.createImmutable("--"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("qnt")))))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 435;BA.debugLine="Log(sb.ToString)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","412124174",_sb.runMethod(true,"ToString"),0);
 BA.debugLineNum = 437;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(1048576);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 438;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM m";
Debug.ShouldStop(2097152);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM maquina"))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 439;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(4194304);
if (true) break;

case 8:
//for
this.state = 11;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 10;
if (true) break;

case 18:
//C
this.state = 17;
_i = ((int)(0 + _i + step16)) ;
Debug.locals.put("i", _i);
if (true) break;

case 10:
//C
this.state = 18;
 BA.debugLineNum = 440;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(8388608);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 441;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","412124180",RemoteObject.concat(RemoteObject.createImmutable("=====Maquinas #"),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("=====")),0);
 BA.debugLineNum = 442;BA.debugLine="Log(Cursor.GetString(\"id\"))'&\"--\"&Cursor.GetStr";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","412124181",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))),0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 445;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"ListDad";
Debug.ShouldStop(268435456);
parent._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ListDados")));
 BA.debugLineNum = 446;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(536870912);
parent._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 447;BA.debugLine="B4XPage_Created(Root)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.ef.form.class, "_b4xpage_created" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 449;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","412124188",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 451;BA.debugLine="Sleep(20)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "getvaluesintheedittexts"),BA.numberCast(int.class, 20));
this.state = 19;
return;
case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (form) ","form",12,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "form","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 65;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Return Me";
Debug.ShouldStop(2);
if (true) return __ref;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _insertrecord(RemoteObject __ref,RemoteObject _usedb,RemoteObject _nombre,RemoteObject _salario) throws Exception{
try {
		Debug.PushSubsStack("InsertRecord (form) ","form",12,__ref.getField(false, "ba"),__ref,494);
if (RapidSub.canDelegate("insertrecord")) { __ref.runUserSub(false, "form","insertrecord", __ref, _usedb, _nombre, _salario); return;}
ResumableSub_InsertRecord rsub = new ResumableSub_InsertRecord(null,__ref,_usedb,_nombre,_salario);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InsertRecord extends BA.ResumableSub {
public ResumableSub_InsertRecord(b4a.example.ef.form parent,RemoteObject __ref,RemoteObject _usedb,RemoteObject _nombre,RemoteObject _salario) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._nombre = _nombre;
this._salario = _salario;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _usedb;
RemoteObject _nombre;
RemoteObject _salario;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertRecord (form) ","form",12,__ref.getField(false, "ba"),__ref,494);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("Salario", _salario);
 BA.debugLineNum = 495;BA.debugLine="Dim req As DBRequestManager = CreateRequest(Us";
Debug.ShouldStop(16384);
_req = __ref.runClassMethod (b4a.example.ef.form.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 496;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_tipo";
Debug.ShouldStop(32768);
_cmd = __ref.runClassMethod (b4a.example.ef.form.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_tipoReparacion")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_nombre),(_salario)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 498;BA.debugLine="Dim j As HttpJob = req.ExecuteCommand(cmd, Nul";
Debug.ShouldStop(131072);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 499;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "insertrecord"), (_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 500;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 501;BA.debugLine="Log(\"Inserted successfully!\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","412320775",RemoteObject.createImmutable("Inserted successfully!"),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 503;BA.debugLine="j.Release";
Debug.ShouldStop(4194304);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _label10_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label10_Click (form) ","form",12,__ref.getField(false, "ba"),__ref,377);
if (RapidSub.canDelegate("label10_click")) { return __ref.runUserSub(false, "form","label10_click", __ref);}
 BA.debugLineNum = 377;BA.debugLine="Private Sub Label10_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 378;BA.debugLine="Panel9_Click";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.ef.form.class, "_panel9_click" /*RemoteObject*/ );
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label13time_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label13Time_Click (form) ","form",12,__ref.getField(false, "ba"),__ref,541);
if (RapidSub.canDelegate("label13time_click")) { return __ref.runUserSub(false, "form","label13time_click", __ref);}
 BA.debugLineNum = 541;BA.debugLine="Private Sub Label13Time_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 542;BA.debugLine="configTime(\"Label13Time\")";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.form.class, "_configtime" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Label13Time")));
 BA.debugLineNum = 543;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label13time_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("Label13Time_OnDateSet (form) ","form",12,__ref.getField(false, "ba"),__ref,545);
if (RapidSub.canDelegate("label13time_ondateset")) { return __ref.runUserSub(false, "form","label13time_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 545;BA.debugLine="Sub Label13Time_OnDateSet(year As Int ,monthOfYear";
Debug.ShouldStop(1);
 BA.debugLineNum = 546;BA.debugLine="Label13Time.Text=year&\"/\"&(NumberFormat(monthOfYe";
Debug.ShouldStop(2);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),(form.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _monthofyear)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable("/"),form.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _dayofmonth)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 547;BA.debugLine="Label13Time.TextColor=Colors.Black";
Debug.ShouldStop(4);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setTextColor",form.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 548;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1back_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label1Back_Click (form) ","form",12,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("label1back_click")) { return __ref.runUserSub(false, "form","label1back_click", __ref);}
 BA.debugLineNum = 418;BA.debugLine="Private Sub Label1Back_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 419;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(4);
form._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1removeinsumo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label1RemoveInsumo_Click (form) ","form",12,__ref.getField(false, "ba"),__ref,945);
if (RapidSub.canDelegate("label1removeinsumo_click")) { return __ref.runUserSub(false, "form","label1removeinsumo_click", __ref);}
RemoteObject _id = RemoteObject.createImmutable(0);
 BA.debugLineNum = 945;BA.debugLine="Private Sub Label1RemoveInsumo_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 946;BA.debugLine="Label1RemoveInsumo=Sender";
Debug.ShouldStop(131072);
__ref.getField(false,"_label1removeinsumo" /*RemoteObject*/ ).setObject (form.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 947;BA.debugLine="Log(Label1RemoveInsumo.Tag)";
Debug.ShouldStop(262144);
form.__c.runVoidMethod ("LogImpl","413697026",BA.ObjectToString(__ref.getField(false,"_label1removeinsumo" /*RemoteObject*/ ).runMethod(false,"getTag")),0);
 BA.debugLineNum = 948;BA.debugLine="Dim id As Int=Label1RemoveInsumo.Tag";
Debug.ShouldStop(524288);
_id = BA.numberCast(int.class, __ref.getField(false,"_label1removeinsumo" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 949;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from insumo wh";
Debug.ShouldStop(1048576);
form._starter._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE from insumo where id=?")),(Object)(form.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id)})))));
 BA.debugLineNum = 950;BA.debugLine="listInsumos";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.ef.form.class, "_listinsumos" /*RemoteObject*/ );
 BA.debugLineNum = 951;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2save_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label2Save_Click (form) ","form",12,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("label2save_click")) { return __ref.runUserSub(false, "form","label2save_click", __ref);}
RemoteObject _salario = RemoteObject.createImmutable("");
 BA.debugLineNum = 467;BA.debugLine="Private Sub Label2Save_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 469;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 470;BA.debugLine="Dim salario As String";
Debug.ShouldStop(2097152);
_salario = RemoteObject.createImmutable("");Debug.locals.put("salario", _salario);
 BA.debugLineNum = 471;BA.debugLine="salario=\"10\"";
Debug.ShouldStop(4194304);
_salario = BA.ObjectToString("10");Debug.locals.put("salario", _salario);
 BA.debugLineNum = 472;BA.debugLine="InsertRecord(Main.pDBName ,\"99\",salario)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.ef.form.class, "_insertrecord" /*void*/ ,(Object)(form._main._pdbname /*RemoteObject*/ ),(Object)(BA.ObjectToString("99")),(Object)(BA.numberCast(int.class, _salario)));
 BA.debugLineNum = 475;BA.debugLine="Log(Label10.text&\"----\"&Label13Time.text)";
Debug.ShouldStop(67108864);
form.__c.runVoidMethod ("LogImpl","412255240",RemoteObject.concat(__ref.getField(false,"_label10" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("----"),__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"getText")),0);
 BA.debugLineNum = 476;BA.debugLine="Log(\"HACIENDA: \"&haciendaUpdate)";
Debug.ShouldStop(134217728);
form.__c.runVoidMethod ("LogImpl","412255241",RemoteObject.concat(RemoteObject.createImmutable("HACIENDA: "),__ref.getField(true,"_haciendaupdate" /*RemoteObject*/ )),0);
 BA.debugLineNum = 477;BA.debugLine="If tipo=\"new\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_tipo" /*RemoteObject*/ ),BA.ObjectToString("new"))) { 
 }else {
 BA.debugLineNum = 484;BA.debugLine="Log(\"update\")";
Debug.ShouldStop(8);
form.__c.runVoidMethod ("LogImpl","412255249",RemoteObject.createImmutable("update"),0);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 488;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
form.__c.runVoidMethod ("LogImpl","412255253",BA.ObjectToString(form.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 491;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listinsumos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listInsumos (form) ","form",12,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("listinsumos")) { return __ref.runUserSub(false, "form","listinsumos", __ref);}
RemoteObject _numberofmatches = RemoteObject.createImmutable(0);
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 143;BA.debugLine="Sub listInsumos";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="removeAllExcelpFist";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.ef.form.class, "_removeallexcelpfist" /*RemoteObject*/ );
 BA.debugLineNum = 147;BA.debugLine="Dim NumberOfMatches As Int";
Debug.ShouldStop(262144);
_numberofmatches = RemoteObject.createImmutable(0);Debug.locals.put("NumberOfMatches", _numberofmatches);
 BA.debugLineNum = 148;BA.debugLine="NumberOfMatches = Starter.SQL1.ExecQuerySingleRes";
Debug.ShouldStop(524288);
_numberofmatches = BA.numberCast(int.class, form._starter._sql1 /*RemoteObject*/ .runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT count(*) FROM insumo where idmaquina ="),__ref.getField(true,"_idmaquina" /*RemoteObject*/ )))));Debug.locals.put("NumberOfMatches", _numberofmatches);
 BA.debugLineNum = 149;BA.debugLine="CustomListView1Geral.DesignerLabel.Height=8dip";
Debug.ShouldStop(1048576);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).getField(false,"_designerlabel").runMethod(true,"setHeight",form.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))));
 BA.debugLineNum = 150;BA.debugLine="CustomListView1Geral.AddTextItem(\"Insumos(\"&Numbe";
Debug.ShouldStop(2097152);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Insumos("),_numberofmatches,RemoteObject.createImmutable(")")))),(Object)((RemoteObject.createImmutable("title"))));
 BA.debugLineNum = 151;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(4194304);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 152;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM in";
Debug.ShouldStop(8388608);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), form._starter._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM insumo where idmaquina ="),__ref.getField(true,"_idmaquina" /*RemoteObject*/ )))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 153;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(16777216);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 154;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(33554432);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 155;BA.debugLine="Dim	id As Int=Cursor.GetString(\"id\")";
Debug.ShouldStop(67108864);
_id = BA.numberCast(int.class, _cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 156;BA.debugLine="Log(Cursor.GetString(\"id\"))";
Debug.ShouldStop(134217728);
form.__c.runVoidMethod ("LogImpl","411272205",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))),0);
 BA.debugLineNum = 157;BA.debugLine="Log(Cursor.GetString(\"name\"))";
Debug.ShouldStop(268435456);
form.__c.runVoidMethod ("LogImpl","411272206",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name"))),0);
 BA.debugLineNum = 158;BA.debugLine="Log(Cursor.GetString(\"qnt\"))";
Debug.ShouldStop(536870912);
form.__c.runVoidMethod ("LogImpl","411272207",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("qnt"))),0);
 BA.debugLineNum = 159;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumos(i+1,i";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.form.class, "_createiteminsumos" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_id),(Object)(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))),(Object)(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("qnt"))))).getObject()),(Object)((RemoteObject.createImmutable("insumo"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 163;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 164;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(8);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(form.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(form.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 166;BA.debugLine="panel.LoadLayout(\"emptyInsumos\")";
Debug.ShouldStop(32);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("emptyInsumos")),__ref.getField(false, "ba"));
 BA.debugLineNum = 167;BA.debugLine="panel.Height=Panel1geral.Height";
Debug.ShouldStop(64);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel1geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 168;BA.debugLine="If i=0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 169;BA.debugLine="Label1Empty.Visible=True";
Debug.ShouldStop(256);
__ref.getField(false,"_label1empty" /*RemoteObject*/ ).runMethod(true,"setVisible",form.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 171;BA.debugLine="Label1Empty.Visible=False";
Debug.ShouldStop(1024);
__ref.getField(false,"_label1empty" /*RemoteObject*/ ).runMethod(true,"setVisible",form.__c.getField(true,"False"));
 BA.debugLineNum = 172;BA.debugLine="Button1AddIsumo.Top=Label1Empty.top";
Debug.ShouldStop(2048);
__ref.getField(false,"_button1addisumo" /*RemoteObject*/ ).runMethod(true,"setTop",__ref.getField(false,"_label1empty" /*RemoteObject*/ ).runMethod(true,"getTop"));
 BA.debugLineNum = 173;BA.debugLine="panel.Height=Button1AddIsumo.Height";
Debug.ShouldStop(4096);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_button1addisumo" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 178;BA.debugLine="CustomListView1Geral.Add(panel,0)";
Debug.ShouldStop(131072);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_panel),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 179;BA.debugLine="CustomListView1Geral.ScrollToItem(CustomListView1";
Debug.ShouldStop(262144);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel10horainicio_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel10Horainicio_Click (form) ","form",12,__ref.getField(false, "ba"),__ref,385);
if (RapidSub.canDelegate("panel10horainicio_click")) { return __ref.runUserSub(false, "form","panel10horainicio_click", __ref);}
 BA.debugLineNum = 385;BA.debugLine="Private Sub Panel10Horainicio_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 386;BA.debugLine="configTime(\"TimeInicio\")";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.ef.form.class, "_configtime" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("TimeInicio")));
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel11horafim_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel11horaFim_Click (form) ","form",12,__ref.getField(false, "ba"),__ref,381);
if (RapidSub.canDelegate("panel11horafim_click")) { return __ref.runUserSub(false, "form","panel11horafim_click", __ref);}
 BA.debugLineNum = 381;BA.debugLine="Private Sub Panel11horaFim_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 382;BA.debugLine="configTime(\"TimeFim\")";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.form.class, "_configtime" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("TimeFim")));
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel2time_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel2Time_Click (form) ","form",12,__ref.getField(false, "ba"),__ref,521);
if (RapidSub.canDelegate("panel2time_click")) { return __ref.runUserSub(false, "form","panel2time_click", __ref);}
 BA.debugLineNum = 521;BA.debugLine="Private Sub Panel2Time_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 522;BA.debugLine="configTime(\"Label13Time\")";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.ef.form.class, "_configtime" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Label13Time")));
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel9_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel9_Click (form) ","form",12,__ref.getField(false, "ba"),__ref,361);
if (RapidSub.canDelegate("panel9_click")) { return __ref.runUserSub(false, "form","panel9_click", __ref);}
 BA.debugLineNum = 361;BA.debugLine="Private Sub Panel9_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 362;BA.debugLine="Datepicker.Initialize(\"Date\",2023 ,DateTime.GetMo";
Debug.ShouldStop(512);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Date")),(Object)(BA.numberCast(int.class, 2023)),(Object)(form.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(form.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(form.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(form.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 363;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
Debug.ShouldStop(1024);
__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dd.mm.yyyy")),(Object)(__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getField(false,"PRC")),(Object)(RemoteObject.createImmutable("2.02.2023")));
 BA.debugLineNum = 364;BA.debugLine="Datepicker.SetThemeDark";
Debug.ShouldStop(2048);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetThemeDark");
 BA.debugLineNum = 365;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
Debug.ShouldStop(4096);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetMinDate",(Object)((__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 366;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
Debug.ShouldStop(8192);
__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dd.mm.yyyy")),(Object)(__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getField(false,"PRC")),(Object)(RemoteObject.createImmutable("2.12.2025")));
 BA.debugLineNum = 367;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
Debug.ShouldStop(16384);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetMaxDate",(Object)((__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 368;BA.debugLine="Datepicker.CancelColor = Colors.White";
Debug.ShouldStop(32768);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setCancelColor",form.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 369;BA.debugLine="Datepicker.OkColor = Colors.White";
Debug.ShouldStop(65536);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setOkColor",form.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 370;BA.debugLine="Datepicker.Title = \"Selecione\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setTitle",BA.ObjectToString("Selecione"));
 BA.debugLineNum = 371;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setCancelText",BA.ObjectToString("Cancelar"));
 BA.debugLineNum = 372;BA.debugLine="Datepicker.OkText = \"Ok\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setOkText",BA.ObjectToString("Ok"));
 BA.debugLineNum = 373;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetOnCancel",(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 374;BA.debugLine="Datepicker.show2(\"iki\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("show2",(Object)(RemoteObject.createImmutable("iki")));
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeallexcelpfist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("removeAllExcelpFist (form) ","form",12,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("removeallexcelpfist")) { return __ref.runUserSub(false, "form","removeallexcelpfist", __ref);}
int _iw = 0;
 BA.debugLineNum = 186;BA.debugLine="Sub removeAllExcelpFist";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="For iw= CustomListView1Geral.Size-1 To  1 Step -1";
Debug.ShouldStop(67108864);
{
final int step1 = -1;
final int limit1 = 1;
_iw = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _iw <= limit1) || (step1 < 0 && _iw >= limit1) ;_iw = ((int)(0 + _iw + step1))  ) {
Debug.locals.put("iw", _iw);
 BA.debugLineNum = 189;BA.debugLine="If CustomListView1Geral.GetValue(iw)<>\"form1\" Th";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _iw))),RemoteObject.createImmutable(("form1")))) { 
 BA.debugLineNum = 190;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 192;BA.debugLine="LogColor(\"REMOVE: \"&iw,Colors.Red)";
Debug.ShouldStop(-2147483648);
form.__c.runVoidMethod ("LogImpl","411337734",RemoteObject.concat(RemoteObject.createImmutable("REMOVE: "),RemoteObject.createImmutable(_iw)),form.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 193;BA.debugLine="CustomListView1Geral.RemoveAt(iw)";
Debug.ShouldStop(1);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _iw)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 196;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
form.__c.runVoidMethod ("LogImpl","411337738",BA.ObjectToString(form.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 };
 }
}Debug.locals.put("iw", _iw);
;
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxhda_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxHda_ItemClick (form) ","form",12,__ref.getField(false, "ba"),__ref,725);
if (RapidSub.canDelegate("sd_xcomboboxhda_itemclick")) { return __ref.runUserSub(false, "form","sd_xcomboboxhda_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 725;BA.debugLine="Sub SD_xComboBoxHda_ItemClick (Position As Int, Va";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 728;BA.debugLine="Log(Value)";
Debug.ShouldStop(8388608);
form.__c.runVoidMethod ("LogImpl","412910595",BA.ObjectToString(_value),0);
 BA.debugLineNum = 730;BA.debugLine="SD_xComboBoxLote.Clear";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 733;BA.debugLine="nit = \"800246222\"";
Debug.ShouldStop(268435456);
__ref.setField ("_nit" /*RemoteObject*/ ,BA.ObjectToString("800246222"));
 BA.debugLineNum = 734;BA.debugLine="haciendaUpdate = Value";
Debug.ShouldStop(536870912);
__ref.setField ("_haciendaupdate" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 735;BA.debugLine="hacienda = SD_xComboBoxHda.GetItem(Position)";
Debug.ShouldStop(1073741824);
__ref.setField ("_hacienda" /*RemoteObject*/ ,__ref.getField(false,"_sd_xcomboboxhda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(_position)));
 BA.debugLineNum = 736;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
Debug.ShouldStop(-2147483648);
__ref.setField ("_hacienda" /*RemoteObject*/ ,__ref.getField(true,"_hacienda" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 737;BA.debugLine="Log(hacienda)";
Debug.ShouldStop(1);
form.__c.runVoidMethod ("LogImpl","412910604",__ref.getField(true,"_hacienda" /*RemoteObject*/ ),0);
 BA.debugLineNum = 738;BA.debugLine="GetRecordLotes (Main.pDBName,Main.pNit, hacienda)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.ef.form.class, "_getrecordlotes" /*void*/ ,(Object)(form._main._pdbname /*RemoteObject*/ ),(Object)(form._main._pnit /*RemoteObject*/ ),(Object)(__ref.getField(true,"_hacienda" /*RemoteObject*/ )));
 BA.debugLineNum = 739;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxlabor_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxLabor_ItemClick (form) ","form",12,__ref.getField(false, "ba"),__ref,893);
if (RapidSub.canDelegate("sd_xcomboboxlabor_itemclick")) { return __ref.runUserSub(false, "form","sd_xcomboboxlabor_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 893;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 895;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxlote_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxLote_ItemClick (form) ","form",12,__ref.getField(false, "ba"),__ref,770);
if (RapidSub.canDelegate("sd_xcomboboxlote_itemclick")) { return __ref.runUserSub(false, "form","sd_xcomboboxlote_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 770;BA.debugLine="Sub SD_xComboBoxLote_ItemClick (Position As Int, V";
Debug.ShouldStop(2);
 BA.debugLineNum = 776;BA.debugLine="Log(Position & \" - \" & Value)";
Debug.ShouldStop(128);
form.__c.runVoidMethod ("LogImpl","413041670",RemoteObject.concat(_position,RemoteObject.createImmutable(" - "),_value),0);
 BA.debugLineNum = 778;BA.debugLine="lote = Value";
Debug.ShouldStop(512);
__ref.setField ("_lote" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 780;BA.debugLine="Log(hacienda)";
Debug.ShouldStop(2048);
form.__c.runVoidMethod ("LogImpl","413041674",__ref.getField(true,"_hacienda" /*RemoteObject*/ ),0);
 BA.debugLineNum = 781;BA.debugLine="GetRecordLotesArea (Main.pDBName,nit, hacienda,lo";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.form.class, "_getrecordlotesarea" /*void*/ ,(Object)(form._main._pdbname /*RemoteObject*/ ),(Object)(__ref.getField(true,"_nit" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_hacienda" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_lote" /*RemoteObject*/ )));
 BA.debugLineNum = 782;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _selectsql(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("selectSQl (form) ","form",12,__ref.getField(false, "ba"),__ref,982);
if (RapidSub.canDelegate("selectsql")) { __ref.runUserSub(false, "form","selectsql", __ref, _id); return;}
ResumableSub_selectSQl rsub = new ResumableSub_selectSQl(null,__ref,_id);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_selectSQl extends BA.ResumableSub {
public ResumableSub_selectSQl(b4a.example.ef.form parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _id;
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
int step4;
int limit4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("selectSQl (form) ","form",12,__ref.getField(false, "ba"),__ref,982);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 983;BA.debugLine="Try";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 BA.debugLineNum = 984;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(8388608);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 985;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM in";
Debug.ShouldStop(16777216);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM insumo where id="),_id))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 986;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//for
this.state = 7;
step4 = 1;
limit4 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 11;
if (true) break;

case 11:
//C
this.state = 7;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 6;
if (true) break;

case 12:
//C
this.state = 11;
_i = ((int)(0 + _i + step4)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 12;
 BA.debugLineNum = 987;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(67108864);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 BA.debugLineNum = 995;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","413828109",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 997;BA.debugLine="Sleep(20)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "selectsql"),BA.numberCast(int.class, 20));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 999;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _spinner1nameinsumo_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner1NameInsumo_ItemClick (form) ","form",12,__ref.getField(false, "ba"),__ref,1001);
if (RapidSub.canDelegate("spinner1nameinsumo_itemclick")) { return __ref.runUserSub(false, "form","spinner1nameinsumo_itemclick", __ref, _position, _value);}
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1001;BA.debugLine="Private Sub Spinner1NameInsumo_ItemClick (Position";
Debug.ShouldStop(256);
 BA.debugLineNum = 1002;BA.debugLine="Spinner1NameInsumo=Sender";
Debug.ShouldStop(512);
__ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).setObject (form.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 1003;BA.debugLine="Log(Spinner1NameInsumo.Tag)";
Debug.ShouldStop(1024);
form.__c.runVoidMethod ("LogImpl","413893634",BA.ObjectToString(__ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).runMethod(false,"getTag")),0);
 BA.debugLineNum = 1004;BA.debugLine="Log(Spinner1NameInsumo.SelectedItem)";
Debug.ShouldStop(2048);
form.__c.runVoidMethod ("LogImpl","413893635",__ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).runMethod(true,"getSelectedItem"),0);
 BA.debugLineNum = 1005;BA.debugLine="Dim id As Int=Spinner1NameInsumo.Tag";
Debug.ShouldStop(4096);
_id = BA.numberCast(int.class, __ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1006;BA.debugLine="Starter.updateInsumo(Spinner1NameInsumo.SelectedI";
Debug.ShouldStop(8192);
form._starter.runVoidMethod ("_updateinsumo" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_spinner1nameinsumo" /*RemoteObject*/ ).runMethod(true,"getSelectedItem")),(Object)(BA.ObjectToString("")),(Object)(_id),(Object)(BA.NumberToString(__ref.getField(true,"_idmaquina" /*RemoteObject*/ ))));
 BA.debugLineNum = 1007;BA.debugLine="selectSQl(id)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.ef.form.class, "_selectsql" /*void*/ ,(Object)(_id));
 BA.debugLineNum = 1008;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinner7_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner7_ItemClick (form) ","form",12,__ref.getField(false, "ba"),__ref,897);
if (RapidSub.canDelegate("spinner7_itemclick")) { return __ref.runUserSub(false, "form","spinner7_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 897;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
Debug.ShouldStop(1);
 BA.debugLineNum = 899;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinner8_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner8_ItemClick (form) ","form",12,__ref.getField(false, "ba"),__ref,901);
if (RapidSub.canDelegate("spinner8_itemclick")) { return __ref.runUserSub(false, "form","spinner8_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 901;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
Debug.ShouldStop(16);
 BA.debugLineNum = 903;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnernit_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerNit_ItemClick (form) ","form",12,__ref.getField(false, "ba"),__ref,888);
if (RapidSub.canDelegate("spinnernit_itemclick")) { return __ref.runUserSub(false, "form","spinnernit_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 888;BA.debugLine="Private Sub SpinnerNit_ItemClick (Position As Int,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 889;BA.debugLine="Log(Value)";
Debug.ShouldStop(16777216);
form.__c.runVoidMethod ("LogImpl","413303809",BA.ObjectToString(_value),0);
 BA.debugLineNum = 890;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnernit0_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerNit0_ItemClick (form) ","form",12,__ref.getField(false, "ba"),__ref,905);
if (RapidSub.canDelegate("spinnernit0_itemclick")) { return __ref.runUserSub(false, "form","spinnernit0_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 905;BA.debugLine="Private Sub SpinnerNit0_ItemClick (Position As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 907;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _validation(RemoteObject __ref,RemoteObject _edt) throws Exception{
try {
		Debug.PushSubsStack("validation (form) ","form",12,__ref.getField(false, "ba"),__ref,456);
if (RapidSub.canDelegate("validation")) { __ref.runUserSub(false, "form","validation", __ref, _edt); return;}
ResumableSub_validation rsub = new ResumableSub_validation(null,__ref,_edt);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_validation extends BA.ResumableSub {
public ResumableSub_validation(b4a.example.ef.form parent,RemoteObject __ref,RemoteObject _edt) {
this.parent = parent;
this.__ref = __ref;
this._edt = _edt;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.form parent;
RemoteObject _edt;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("validation (form) ","form",12,__ref.getField(false, "ba"),__ref,456);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("edt", _edt);
 BA.debugLineNum = 457;BA.debugLine="If edt.Text=\"\" Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_edt.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 459;BA.debugLine="edt.HintColor=Colors.Red";
Debug.ShouldStop(1024);
_edt.runMethod(true,"setHintColor",parent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 460;BA.debugLine="Sleep(350)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "form", "validation"),BA.numberCast(int.class, 350));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 461;BA.debugLine="edt.HintColor=Colors.Gray'.";
Debug.ShouldStop(4096);
_edt.runMethod(true,"setHintColor",parent.__c.getField(false,"Colors").getField(true,"Gray"));
 if (true) break;

case 5:
//C
this.state = 6;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 465;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}