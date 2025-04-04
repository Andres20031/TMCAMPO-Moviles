package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formmaquinaria_subs_0 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,377);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "formmaquinaria","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 377;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 379;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(67108864);
_formatteddate = formmaquinaria.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 382;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(536870912);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 385;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(1);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 388;BA.debugLine="Label13Time.Text = formattedDate";
Debug.ShouldStop(8);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 391;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(64);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formmaquinaria.__c.getField(true,"False"));
 BA.debugLineNum = 394;BA.debugLine="fecha = formattedDate";
Debug.ShouldStop(512);
__ref.setField ("_fecha" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("b4xpage_appear")) { __ref.runUserSub(false, "formmaquinaria","b4xpage_appear", __ref); return;}
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
public ResumableSub_B4XPage_Appear(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _itemsmaquina = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmdmaquina = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j2 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resmaquina = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowmaquina = null;
RemoteObject _codigomaquina = RemoteObject.createImmutable("");
RemoteObject _descripcionmaquina = RemoteObject.createImmutable("");
RemoteObject _itemslabormaquina = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmdlabormaquina = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j3 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _reslabormaquina = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowlabormaquina = null;
RemoteObject _codigolabormaquina = RemoteObject.createImmutable("");
RemoteObject _descripcionlabormaquina = RemoteObject.createImmutable("");
RemoteObject _itemsnit = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _razonsocial = RemoteObject.createImmutable("");
RemoteObject _nit = RemoteObject.createImmutable("");
RemoteObject _itemsimplemento = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmdimple = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j4 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resimple = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowimple = null;
RemoteObject _codigoimple = RemoteObject.createImmutable("");
RemoteObject _descripcionimple = RemoteObject.createImmutable("");
RemoteObject _itemsoperario = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmdoper = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j5 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resoper = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowoper = null;
RemoteObject _codigooper = RemoteObject.createImmutable("");
RemoteObject _apellido1 = RemoteObject.createImmutable("");
RemoteObject _apellido2 = RemoteObject.createImmutable("");
RemoteObject _nombre = RemoteObject.createImmutable("");
RemoteObject _itemsobservaciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmdobser = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j6 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resobser = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowobser = null;
RemoteObject _codigoobser = RemoteObject.createImmutable("");
RemoteObject _desobser = RemoteObject.createImmutable("");
RemoteObject group18;
int index18;
int groupLen18;
RemoteObject group38;
int index38;
int groupLen38;
RemoteObject group58;
int index58;
int groupLen58;
RemoteObject group79;
int index79;
int groupLen79;
RemoteObject group101;
int index101;
int groupLen101;
RemoteObject group123;
int index123;
int groupLen123;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,108);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 109;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 110;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
Debug.ShouldStop(8192);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, ((int)0xb4008000))));
 BA.debugLineNum = 111;BA.debugLine="Root.LoadLayout(\"form\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("form")),__ref.getField(false, "ba"));
 BA.debugLineNum = 112;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
Debug.ShouldStop(32768);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, ((int)0xff25253d)));
 BA.debugLineNum = 113;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
Debug.ShouldStop(65536);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextcolor",parent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 114;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form1"))));
 BA.debugLineNum = 116;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(524288);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 117;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(1048576);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 120;BA.debugLine="SearchTemplateMaquina.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_searchtemplatemaquina" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 122;BA.debugLine="Dim itemsMaquina As List";
Debug.ShouldStop(33554432);
_itemsmaquina = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("itemsMaquina", _itemsmaquina);
 BA.debugLineNum = 123;BA.debugLine="itemsMaquina.Initialize";
Debug.ShouldStop(67108864);
_itemsmaquina.runVoidMethod ("Initialize");
 BA.debugLineNum = 124;BA.debugLine="itemsMaquina.Add(\"Seleccionar:\")";
Debug.ShouldStop(134217728);
_itemsmaquina.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 126;BA.debugLine="Dim cmdMaquina As DBCommand = CreateCommand(\"sele";
Debug.ShouldStop(536870912);
_cmdmaquina = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_maquina")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdMaquina", _cmdmaquina);Debug.locals.put("cmdMaquina", _cmdmaquina);
 BA.debugLineNum = 127;BA.debugLine="Wait For (Req.ExecuteQuery(cmdMaquina, 0, Null))";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdmaquina),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 61;
return;
case 61:
//C
this.state = 1;
_j2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j2", _j2);
;
 BA.debugLineNum = 128;BA.debugLine="If j2.Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 10;
if (_j2.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 129;BA.debugLine="Req.HandleJobAsync(j2, \"req_maquina\")";
Debug.ShouldStop(1);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j2),(Object)(RemoteObject.createImmutable("req_maquina")));
 BA.debugLineNum = 130;BA.debugLine="Wait For (Req) req_maquina_Result(resMaquina As";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","req_maquina_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 62;
return;
case 62:
//C
this.state = 4;
_resmaquina = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resMaquina", _resmaquina);
;
 BA.debugLineNum = 131;BA.debugLine="For Each rowMaquina() As Object In resMaquina.Ro";
Debug.ShouldStop(4);
if (true) break;

case 4:
//for
this.state = 7;
group18 = _resmaquina.getField(false,"Rows" /*RemoteObject*/ );
index18 = 0;
groupLen18 = group18.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowMaquina", _rowmaquina);
this.state = 63;
if (true) break;

case 63:
//C
this.state = 7;
if (index18 < groupLen18) {
this.state = 6;
_rowmaquina = (group18.runMethod(false,"Get",index18));Debug.locals.put("rowMaquina", _rowmaquina);}
if (true) break;

case 64:
//C
this.state = 63;
index18++;
Debug.locals.put("rowMaquina", _rowmaquina);
if (true) break;

case 6:
//C
this.state = 64;
 BA.debugLineNum = 132;BA.debugLine="Dim codigoMaquina As String = rowMaquina(0) ' C";
Debug.ShouldStop(8);
_codigomaquina = BA.ObjectToString(_rowmaquina.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoMaquina", _codigomaquina);Debug.locals.put("codigoMaquina", _codigomaquina);
 BA.debugLineNum = 133;BA.debugLine="Dim descripcionMaquina As String = rowMaquina(1";
Debug.ShouldStop(16);
_descripcionmaquina = BA.ObjectToString(_rowmaquina.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionMaquina", _descripcionmaquina);Debug.locals.put("descripcionMaquina", _descripcionmaquina);
 BA.debugLineNum = 134;BA.debugLine="SD_xComboBoxMaquina.Add(descripcionMaquina, cod";
Debug.ShouldStop(32);
__ref.getField(false,"_sd_xcomboboxmaquina" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_descripcionmaquina),(Object)((_codigomaquina)));
 BA.debugLineNum = 135;BA.debugLine="itemsMaquina.Add(codigoMaquina&\":\"&descripcionM";
Debug.ShouldStop(64);
_itemsmaquina.runVoidMethod ("Add",(Object)((RemoteObject.concat(_codigomaquina,RemoteObject.createImmutable(":"),_descripcionmaquina))));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("rowMaquina", _rowmaquina);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 138;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","418153502",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j2.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 140;BA.debugLine="SearchTemplateMaquina.SetItems(itemsMaquina)";
Debug.ShouldStop(2048);
__ref.getField(false,"_searchtemplatemaquina" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemsmaquina));
 BA.debugLineNum = 141;BA.debugLine="j2.Release";
Debug.ShouldStop(4096);
_j2.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 147;BA.debugLine="SearchTemplateLabor.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 149;BA.debugLine="Dim itemsLaborMaquina As List";
Debug.ShouldStop(1048576);
_itemslabormaquina = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("itemsLaborMaquina", _itemslabormaquina);
 BA.debugLineNum = 150;BA.debugLine="itemsLaborMaquina.Initialize";
Debug.ShouldStop(2097152);
_itemslabormaquina.runVoidMethod ("Initialize");
 BA.debugLineNum = 151;BA.debugLine="itemsLaborMaquina.Add(\"Seleccionar:\")";
Debug.ShouldStop(4194304);
_itemslabormaquina.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 153;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
Debug.ShouldStop(16777216);
_cmdlabormaquina = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labor_maq")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);
 BA.debugLineNum = 154;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdlabormaquina),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 65;
return;
case 65:
//C
this.state = 11;
_j3 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j3", _j3);
;
 BA.debugLineNum = 155;BA.debugLine="If j3.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 11:
//if
this.state = 20;
if (_j3.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 156;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
Debug.ShouldStop(134217728);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j3),(Object)(RemoteObject.createImmutable("req_labormaquina")));
 BA.debugLineNum = 157;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","req_labormaquina_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 66;
return;
case 66:
//C
this.state = 14;
_reslabormaquina = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resLaborMaquina", _reslabormaquina);
;
 BA.debugLineNum = 158;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
Debug.ShouldStop(536870912);
if (true) break;

case 14:
//for
this.state = 17;
group38 = _reslabormaquina.getField(false,"Rows" /*RemoteObject*/ );
index38 = 0;
groupLen38 = group38.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
this.state = 67;
if (true) break;

case 67:
//C
this.state = 17;
if (index38 < groupLen38) {
this.state = 16;
_rowlabormaquina = (group38.runMethod(false,"Get",index38));Debug.locals.put("rowLaborMaquina", _rowlabormaquina);}
if (true) break;

case 68:
//C
this.state = 67;
index38++;
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
if (true) break;

case 16:
//C
this.state = 68;
 BA.debugLineNum = 159;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
Debug.ShouldStop(1073741824);
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);
 BA.debugLineNum = 160;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
Debug.ShouldStop(-2147483648);
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);
 BA.debugLineNum = 161;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina,";
Debug.ShouldStop(1);
__ref.getField(false,"_sd_xcomboboxlabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_descripcionlabormaquina),(Object)((_codigolabormaquina)));
 BA.debugLineNum = 162;BA.debugLine="itemsLaborMaquina.Add(codigoLaborMaquina&\":\"&de";
Debug.ShouldStop(2);
_itemslabormaquina.runVoidMethod ("Add",(Object)((RemoteObject.concat(_codigolabormaquina,RemoteObject.createImmutable(":"),_descripcionlabormaquina))));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 165;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","418153529",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j3.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 167;BA.debugLine="SearchTemplateLabor.SetItems(itemsLaborMaquina)";
Debug.ShouldStop(64);
__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemslabormaquina));
 BA.debugLineNum = 168;BA.debugLine="j3.Release";
Debug.ShouldStop(128);
_j3.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 172;BA.debugLine="SearchTemplateNit.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_searchtemplatenit" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 174;BA.debugLine="Dim itemsNit As List";
Debug.ShouldStop(8192);
_itemsnit = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("itemsNit", _itemsnit);
 BA.debugLineNum = 175;BA.debugLine="itemsNit.Initialize";
Debug.ShouldStop(16384);
_itemsnit.runVoidMethod ("Initialize");
 BA.debugLineNum = 176;BA.debugLine="itemsNit.Add(\"Seleccionar:\")";
Debug.ShouldStop(32768);
_itemsnit.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 178;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
Debug.ShouldStop(131072);
_cmd = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_nit")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 179;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 69;
return;
case 69:
//C
this.state = 21;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 180;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 21:
//if
this.state = 30;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 181;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1048576);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 182;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 70;
return;
case 70:
//C
this.state = 24;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 183;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4194304);
if (true) break;

case 24:
//for
this.state = 27;
group58 = _res.getField(false,"Rows" /*RemoteObject*/ );
index58 = 0;
groupLen58 = group58.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 71;
if (true) break;

case 71:
//C
this.state = 27;
if (index58 < groupLen58) {
this.state = 26;
_row = (group58.runMethod(false,"Get",index58));Debug.locals.put("row", _row);}
if (true) break;

case 72:
//C
this.state = 71;
index58++;
Debug.locals.put("row", _row);
if (true) break;

case 26:
//C
this.state = 72;
 BA.debugLineNum = 184;BA.debugLine="Dim razonSocial As String = row(0)";
Debug.ShouldStop(8388608);
_razonsocial = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("razonSocial", _razonsocial);Debug.locals.put("razonSocial", _razonsocial);
 BA.debugLineNum = 185;BA.debugLine="Dim nit As String = row(1)";
Debug.ShouldStop(16777216);
_nit = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("nit", _nit);Debug.locals.put("nit", _nit);
 BA.debugLineNum = 186;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sd_xcomboboxnit" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_razonsocial,RemoteObject.createImmutable(" - "),_nit)),(Object)((_nit)));
 BA.debugLineNum = 187;BA.debugLine="itemsNit.Add(nit&\":\"&razonSocial)";
Debug.ShouldStop(67108864);
_itemsnit.runVoidMethod ("Add",(Object)((RemoteObject.concat(_nit,RemoteObject.createImmutable(":"),_razonsocial))));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
Debug.locals.put("row", _row);
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 190;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","418153554",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 192;BA.debugLine="SearchTemplateNit.SetItems(itemsNit)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_searchtemplatenit" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemsnit));
 BA.debugLineNum = 193;BA.debugLine="j.Release";
Debug.ShouldStop(1);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 197;BA.debugLine="SearchTemplateImplemento.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_searchtemplateimplemento" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 198;BA.debugLine="SearchTemplateImplemento2.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_searchtemplateimplemento2" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 200;BA.debugLine="Dim itemsImplemento As List";
Debug.ShouldStop(128);
_itemsimplemento = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("itemsImplemento", _itemsimplemento);
 BA.debugLineNum = 201;BA.debugLine="itemsImplemento.Initialize";
Debug.ShouldStop(256);
_itemsimplemento.runVoidMethod ("Initialize");
 BA.debugLineNum = 202;BA.debugLine="itemsImplemento.Add(\"Seleccionar:\")";
Debug.ShouldStop(512);
_itemsimplemento.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 204;BA.debugLine="Dim cmdImple As DBCommand = CreateCommand(\"select";
Debug.ShouldStop(2048);
_cmdimple = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_implemento")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdImple", _cmdimple);Debug.locals.put("cmdImple", _cmdimple);
 BA.debugLineNum = 205;BA.debugLine="Wait For (Req.ExecuteQuery(cmdImple, 0, Null)) Jo";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdimple),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 73;
return;
case 73:
//C
this.state = 31;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 206;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 31:
//if
this.state = 40;
if (_j4.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 33;
}else {
this.state = 39;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 207;BA.debugLine="Req.HandleJobAsync(j4, \"req_imple\")";
Debug.ShouldStop(16384);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_imple")));
 BA.debugLineNum = 208;BA.debugLine="Wait For (Req) req_imple_Result(resImple As DBRe";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","req_imple_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 74;
return;
case 74:
//C
this.state = 34;
_resimple = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resImple", _resimple);
;
 BA.debugLineNum = 209;BA.debugLine="For Each rowImple() As Object In resImple.Rows";
Debug.ShouldStop(65536);
if (true) break;

case 34:
//for
this.state = 37;
group79 = _resimple.getField(false,"Rows" /*RemoteObject*/ );
index79 = 0;
groupLen79 = group79.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowImple", _rowimple);
this.state = 75;
if (true) break;

case 75:
//C
this.state = 37;
if (index79 < groupLen79) {
this.state = 36;
_rowimple = (group79.runMethod(false,"Get",index79));Debug.locals.put("rowImple", _rowimple);}
if (true) break;

case 76:
//C
this.state = 75;
index79++;
Debug.locals.put("rowImple", _rowimple);
if (true) break;

case 36:
//C
this.state = 76;
 BA.debugLineNum = 210;BA.debugLine="Dim codigoImple As String = rowImple(0) ' Cdgo_";
Debug.ShouldStop(131072);
_codigoimple = BA.ObjectToString(_rowimple.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoImple", _codigoimple);Debug.locals.put("codigoImple", _codigoimple);
 BA.debugLineNum = 211;BA.debugLine="Dim descripcionImple As String = rowImple(1) '";
Debug.ShouldStop(262144);
_descripcionimple = BA.ObjectToString(_rowimple.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionImple", _descripcionimple);Debug.locals.put("descripcionImple", _descripcionimple);
 BA.debugLineNum = 212;BA.debugLine="SD_xComboBoxImplemento.Add(descripcionImple, co";
Debug.ShouldStop(524288);
__ref.getField(false,"_sd_xcomboboximplemento" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_descripcionimple),(Object)((_codigoimple)));
 BA.debugLineNum = 213;BA.debugLine="SD_xComboBoxImplemento2.Add(descripcionImple, c";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sd_xcomboboximplemento2" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_descripcionimple),(Object)((_codigoimple)));
 BA.debugLineNum = 214;BA.debugLine="itemsImplemento.Add(codigoImple&\":\"&descripcion";
Debug.ShouldStop(2097152);
_itemsimplemento.runVoidMethod ("Add",(Object)((RemoteObject.concat(_codigoimple,RemoteObject.createImmutable(":"),_descripcionimple))));
 if (true) break;
if (true) break;

case 37:
//C
this.state = 40;
Debug.locals.put("rowImple", _rowimple);
;
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 217;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","418153581",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 219;BA.debugLine="SearchTemplateImplemento.SetItems(itemsImplemento";
Debug.ShouldStop(67108864);
__ref.getField(false,"_searchtemplateimplemento" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemsimplemento));
 BA.debugLineNum = 220;BA.debugLine="SearchTemplateImplemento2.SetItems(itemsImplement";
Debug.ShouldStop(134217728);
__ref.getField(false,"_searchtemplateimplemento2" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemsimplemento));
 BA.debugLineNum = 221;BA.debugLine="j4.Release";
Debug.ShouldStop(268435456);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 225;BA.debugLine="SearchTemplateOperario.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_searchtemplateoperario" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 227;BA.debugLine="Dim itemsOperario As List";
Debug.ShouldStop(4);
_itemsoperario = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("itemsOperario", _itemsoperario);
 BA.debugLineNum = 228;BA.debugLine="itemsOperario.Initialize";
Debug.ShouldStop(8);
_itemsoperario.runVoidMethod ("Initialize");
 BA.debugLineNum = 229;BA.debugLine="itemsOperario.Add(\"Seleccionar:\")";
Debug.ShouldStop(16);
_itemsoperario.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 231;BA.debugLine="Dim cmdOper As DBCommand = CreateCommand(\"select_";
Debug.ShouldStop(64);
_cmdoper = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_operario")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdOper", _cmdoper);Debug.locals.put("cmdOper", _cmdoper);
 BA.debugLineNum = 232;BA.debugLine="Wait For (Req.ExecuteQuery(cmdOper, 0, Null)) Job";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdoper),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 77;
return;
case 77:
//C
this.state = 41;
_j5 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j5", _j5);
;
 BA.debugLineNum = 233;BA.debugLine="If j5.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 41:
//if
this.state = 50;
if (_j5.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 43;
}else {
this.state = 49;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 234;BA.debugLine="Req.HandleJobAsync(j5, \"req_oper\")";
Debug.ShouldStop(512);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j5),(Object)(RemoteObject.createImmutable("req_oper")));
 BA.debugLineNum = 235;BA.debugLine="Wait For (Req) req_oper_Result(resOper As DBResu";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","req_oper_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 78;
return;
case 78:
//C
this.state = 44;
_resoper = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resOper", _resoper);
;
 BA.debugLineNum = 236;BA.debugLine="For Each rowOper() As Object In resOper.Rows";
Debug.ShouldStop(2048);
if (true) break;

case 44:
//for
this.state = 47;
group101 = _resoper.getField(false,"Rows" /*RemoteObject*/ );
index101 = 0;
groupLen101 = group101.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowOper", _rowoper);
this.state = 79;
if (true) break;

case 79:
//C
this.state = 47;
if (index101 < groupLen101) {
this.state = 46;
_rowoper = (group101.runMethod(false,"Get",index101));Debug.locals.put("rowOper", _rowoper);}
if (true) break;

case 80:
//C
this.state = 79;
index101++;
Debug.locals.put("rowOper", _rowoper);
if (true) break;

case 46:
//C
this.state = 80;
 BA.debugLineNum = 237;BA.debugLine="Dim codigoOper As String = rowOper(0)";
Debug.ShouldStop(4096);
_codigooper = BA.ObjectToString(_rowoper.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoOper", _codigooper);Debug.locals.put("codigoOper", _codigooper);
 BA.debugLineNum = 238;BA.debugLine="Dim apellido1 As String = rowOper(1)";
Debug.ShouldStop(8192);
_apellido1 = BA.ObjectToString(_rowoper.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("apellido1", _apellido1);Debug.locals.put("apellido1", _apellido1);
 BA.debugLineNum = 239;BA.debugLine="Dim apellido2 As String = rowOper(2)";
Debug.ShouldStop(16384);
_apellido2 = BA.ObjectToString(_rowoper.getArrayElement(false,BA.numberCast(int.class, 2)));Debug.locals.put("apellido2", _apellido2);Debug.locals.put("apellido2", _apellido2);
 BA.debugLineNum = 240;BA.debugLine="Dim nombre As String = rowOper(3)";
Debug.ShouldStop(32768);
_nombre = BA.ObjectToString(_rowoper.getArrayElement(false,BA.numberCast(int.class, 3)));Debug.locals.put("nombre", _nombre);Debug.locals.put("nombre", _nombre);
 BA.debugLineNum = 241;BA.debugLine="SD_xComboBoxOperario.Add(apellido1&\" \"&apellido";
Debug.ShouldStop(65536);
__ref.getField(false,"_sd_xcomboboxoperario" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_apellido1,RemoteObject.createImmutable(" "),_apellido2,RemoteObject.createImmutable(" "),_nombre)),(Object)((_codigooper)));
 BA.debugLineNum = 242;BA.debugLine="itemsOperario.Add(codigoOper&\":\"&apellido1&\" \"&";
Debug.ShouldStop(131072);
_itemsoperario.runVoidMethod ("Add",(Object)((RemoteObject.concat(_codigooper,RemoteObject.createImmutable(":"),_apellido1,RemoteObject.createImmutable(" "),_apellido2,RemoteObject.createImmutable(" "),_nombre))));
 if (true) break;
if (true) break;

case 47:
//C
this.state = 50;
Debug.locals.put("rowOper", _rowoper);
;
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 245;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j5.Err";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","418153609",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j5.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 247;BA.debugLine="SearchTemplateOperario.SetItems(itemsOperario)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_searchtemplateoperario" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemsoperario));
 BA.debugLineNum = 248;BA.debugLine="j5.Release";
Debug.ShouldStop(8388608);
_j5.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 252;BA.debugLine="SearchTemplateObservaciones.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_searchtemplateobservaciones" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 254;BA.debugLine="Dim itemsObservaciones As List";
Debug.ShouldStop(536870912);
_itemsobservaciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("itemsObservaciones", _itemsobservaciones);
 BA.debugLineNum = 255;BA.debugLine="itemsObservaciones.Initialize";
Debug.ShouldStop(1073741824);
_itemsobservaciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 256;BA.debugLine="itemsObservaciones.Add(\"Seleccionar:\")";
Debug.ShouldStop(-2147483648);
_itemsobservaciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 257;BA.debugLine="Dim cmdObser As DBCommand = CreateCommand(\"select";
Debug.ShouldStop(1);
_cmdobser = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_observaciones")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdObser", _cmdobser);Debug.locals.put("cmdObser", _cmdobser);
 BA.debugLineNum = 258;BA.debugLine="Wait For (Req.ExecuteQuery(cmdObser, 0, Null)) Jo";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdobser),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 81;
return;
case 81:
//C
this.state = 51;
_j6 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j6", _j6);
;
 BA.debugLineNum = 259;BA.debugLine="If j6.Success Then";
Debug.ShouldStop(4);
if (true) break;

case 51:
//if
this.state = 60;
if (_j6.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 53;
}else {
this.state = 59;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 260;BA.debugLine="Req.HandleJobAsync(j6, \"req_obser\")";
Debug.ShouldStop(8);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j6),(Object)(RemoteObject.createImmutable("req_obser")));
 BA.debugLineNum = 261;BA.debugLine="Wait For (Req) req_obser_Result(resObser As DBRe";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","req_obser_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 82;
return;
case 82:
//C
this.state = 54;
_resobser = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resObser", _resobser);
;
 BA.debugLineNum = 262;BA.debugLine="For Each rowObser() As Object In resObser.Rows";
Debug.ShouldStop(32);
if (true) break;

case 54:
//for
this.state = 57;
group123 = _resobser.getField(false,"Rows" /*RemoteObject*/ );
index123 = 0;
groupLen123 = group123.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowObser", _rowobser);
this.state = 83;
if (true) break;

case 83:
//C
this.state = 57;
if (index123 < groupLen123) {
this.state = 56;
_rowobser = (group123.runMethod(false,"Get",index123));Debug.locals.put("rowObser", _rowobser);}
if (true) break;

case 84:
//C
this.state = 83;
index123++;
Debug.locals.put("rowObser", _rowobser);
if (true) break;

case 56:
//C
this.state = 84;
 BA.debugLineNum = 263;BA.debugLine="Dim codigoObser As String = rowObser(0)";
Debug.ShouldStop(64);
_codigoobser = BA.ObjectToString(_rowobser.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoObser", _codigoobser);Debug.locals.put("codigoObser", _codigoobser);
 BA.debugLineNum = 264;BA.debugLine="Dim desObser As String = rowObser(1)";
Debug.ShouldStop(128);
_desobser = BA.ObjectToString(_rowobser.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("desObser", _desobser);Debug.locals.put("desObser", _desobser);
 BA.debugLineNum = 265;BA.debugLine="SD_xComboBoxObservaciones.Add(desObser ,codigoO";
Debug.ShouldStop(256);
__ref.getField(false,"_sd_xcomboboxobservaciones" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_desobser),(Object)((_codigoobser)));
 BA.debugLineNum = 266;BA.debugLine="itemsObservaciones.Add(codigoObser&\":\"&desObser";
Debug.ShouldStop(512);
_itemsobservaciones.runVoidMethod ("Add",(Object)((RemoteObject.concat(_codigoobser,RemoteObject.createImmutable(":"),_desobser))));
 if (true) break;
if (true) break;

case 57:
//C
this.state = 60;
Debug.locals.put("rowObser", _rowobser);
;
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 269;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j6.Err";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","418153633",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j6.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 60:
//C
this.state = -1;
;
 BA.debugLineNum = 271;BA.debugLine="SearchTemplateObservaciones.SetItems(itemsObserva";
Debug.ShouldStop(16384);
__ref.getField(false,"_searchtemplateobservaciones" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemsobservaciones));
 BA.debugLineNum = 272;BA.debugLine="j6.Release";
Debug.ShouldStop(32768);
_j6.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 275;BA.debugLine="SearchTemplateHacienda.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_searchtemplatehacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 277;BA.debugLine="SearchTemplateLote.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_searchtemplatelote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 280;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j2) throws Exception{
}
public static void  _req_maquina_result(RemoteObject __ref,RemoteObject _resmaquina) throws Exception{
}
public static void  _req_labormaquina_result(RemoteObject __ref,RemoteObject _reslabormaquina) throws Exception{
}
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static void  _req_imple_result(RemoteObject __ref,RemoteObject _resimple) throws Exception{
}
public static void  _req_oper_result(RemoteObject __ref,RemoteObject _resoper) throws Exception{
}
public static void  _req_obser_result(RemoteObject __ref,RemoteObject _resobser) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formmaquinaria","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 93;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Root = Root1";
Debug.ShouldStop(536870912);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 96;BA.debugLine="Base = Root";
Debug.ShouldStop(-2147483648);
__ref.setField ("_base" /*RemoteObject*/ ,__ref.getField(false,"_root" /*RemoteObject*/ ));
 BA.debugLineNum = 97;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(1);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )));
 BA.debugLineNum = 98;BA.debugLine="Dialog.Title = \"Buscador\"";
Debug.ShouldStop(2);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Buscador")));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,449);
if (RapidSub.canDelegate("button1_click")) { __ref.runUserSub(false, "formmaquinaria","button1_click", __ref); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,449);
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
 BA.debugLineNum = 451;BA.debugLine="Ascdo_Maq_Mvto_Maq = \"CP\"";
Debug.ShouldStop(4);
__ref.setField ("_ascdo_maq_mvto_maq" /*RemoteObject*/ ,BA.ObjectToString("CP"));
 BA.debugLineNum = 453;BA.debugLine="horainicio = EditText1HoraInicio.Text";
Debug.ShouldStop(16);
__ref.setField ("_horainicio" /*RemoteObject*/ ,__ref.getField(false,"_edittext1horainicio" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 454;BA.debugLine="horafin = EditText2HoraFim.Text";
Debug.ShouldStop(32);
__ref.setField ("_horafin" /*RemoteObject*/ ,__ref.getField(false,"_edittext2horafim" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 455;BA.debugLine="combustible = EditText1.Text";
Debug.ShouldStop(64);
__ref.setField ("_combustible" /*RemoteObject*/ ,__ref.getField(false,"_edittext1" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 456;BA.debugLine="area = EditText2.Text";
Debug.ShouldStop(128);
__ref.setField ("_area" /*RemoteObject*/ ,__ref.getField(false,"_edittext2" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 457;BA.debugLine="user = Main.pUser";
Debug.ShouldStop(256);
__ref.setField ("_user" /*RemoteObject*/ ,parent._main._puser /*RemoteObject*/ );
 BA.debugLineNum = 459;BA.debugLine="fechaHoy = DateTime.Date(DateTime.Now) ' Esto te";
Debug.ShouldStop(1024);
__ref.setField ("_fechahoy" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 460;BA.debugLine="fechaHoy = fechaHoy.Replace(\"/\", \"-\") ' Reemplaza";
Debug.ShouldStop(2048);
__ref.setField ("_fechahoy" /*RemoteObject*/ ,__ref.getField(true,"_fechahoy" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-"))));
 BA.debugLineNum = 461;BA.debugLine="fechaHoy = fechaHoy & \" 00:00:00\" ' Agregar la";
Debug.ShouldStop(4096);
__ref.setField ("_fechahoy" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_fechahoy" /*RemoteObject*/ ),RemoteObject.createImmutable(" 00:00:00")));
 BA.debugLineNum = 463;BA.debugLine="horaActual = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(16384);
__ref.setField ("_horaactual" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 464;BA.debugLine="DeviceName = GetDeviceName";
Debug.ShouldStop(32768);
__ref.setField ("_devicename" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_getdevicename" /*RemoteObject*/ ));
 BA.debugLineNum = 466;BA.debugLine="Log(\"Ascdo_Maq_Mvto_Maq: \" & Ascdo_Maq_Mvto_Maq)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","419070993",RemoteObject.concat(RemoteObject.createImmutable("Ascdo_Maq_Mvto_Maq: "),__ref.getField(true,"_ascdo_maq_mvto_maq" /*RemoteObject*/ )),0);
 BA.debugLineNum = 467;BA.debugLine="Log(\"maquina: \" & maquina)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","419070994",RemoteObject.concat(RemoteObject.createImmutable("maquina: "),__ref.getField(true,"_maquina" /*RemoteObject*/ )),0);
 BA.debugLineNum = 468;BA.debugLine="Log(\"fecha: \" & fecha)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","419070995",RemoteObject.concat(RemoteObject.createImmutable("fecha: "),__ref.getField(true,"_fecha" /*RemoteObject*/ )),0);
 BA.debugLineNum = 469;BA.debugLine="Log(\"labor: \" & labor)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","419070996",RemoteObject.concat(RemoteObject.createImmutable("labor: "),__ref.getField(true,"_labor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 470;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","419070997",RemoteObject.concat(RemoteObject.createImmutable("nitEmpresaCBX: "),__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 471;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","419070998",RemoteObject.concat(RemoteObject.createImmutable("haciendaCBX: "),__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 472;BA.debugLine="Log(\"Lote: \" & Lote)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","419070999",RemoteObject.concat(RemoteObject.createImmutable("Lote: "),__ref.getField(true,"_lote" /*RemoteObject*/ )),0);
 BA.debugLineNum = 473;BA.debugLine="Log(\"implemento: \" & implemento)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","419071000",RemoteObject.concat(RemoteObject.createImmutable("implemento: "),__ref.getField(true,"_implemento" /*RemoteObject*/ )),0);
 BA.debugLineNum = 474;BA.debugLine="Log(\"horainicio: \" & horainicio)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","419071001",RemoteObject.concat(RemoteObject.createImmutable("horainicio: "),__ref.getField(true,"_horainicio" /*RemoteObject*/ )),0);
 BA.debugLineNum = 475;BA.debugLine="Log(\"horafin: \" & horafin)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","419071002",RemoteObject.concat(RemoteObject.createImmutable("horafin: "),__ref.getField(true,"_horafin" /*RemoteObject*/ )),0);
 BA.debugLineNum = 476;BA.debugLine="Log(\"combustible: \" & combustible)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","419071003",RemoteObject.concat(RemoteObject.createImmutable("combustible: "),__ref.getField(true,"_combustible" /*RemoteObject*/ )),0);
 BA.debugLineNum = 477;BA.debugLine="Log(\"observaciones: \" & observaciones)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","419071004",RemoteObject.concat(RemoteObject.createImmutable("observaciones: "),__ref.getField(true,"_observaciones" /*RemoteObject*/ )),0);
 BA.debugLineNum = 478;BA.debugLine="Log(\"operario: \" & operario)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","419071005",RemoteObject.concat(RemoteObject.createImmutable("operario: "),__ref.getField(true,"_operario" /*RemoteObject*/ )),0);
 BA.debugLineNum = 479;BA.debugLine="Log(\"implemento2: \" & implemento2)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","419071006",RemoteObject.concat(RemoteObject.createImmutable("implemento2: "),__ref.getField(true,"_implemento2" /*RemoteObject*/ )),0);
 BA.debugLineNum = 480;BA.debugLine="Log(\"area: \" & area)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","419071007",RemoteObject.concat(RemoteObject.createImmutable("area: "),__ref.getField(true,"_area" /*RemoteObject*/ )),0);
 BA.debugLineNum = 481;BA.debugLine="Log(\"fechaHoy: \" & fechaHoy)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","419071008",RemoteObject.concat(RemoteObject.createImmutable("fechaHoy: "),__ref.getField(true,"_fechahoy" /*RemoteObject*/ )),0);
 BA.debugLineNum = 482;BA.debugLine="Log(\"horaActual: \" & horaActual)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","419071009",RemoteObject.concat(RemoteObject.createImmutable("horaActual: "),__ref.getField(true,"_horaactual" /*RemoteObject*/ )),0);
 BA.debugLineNum = 483;BA.debugLine="Log(\"user: \" & user)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","419071010",RemoteObject.concat(RemoteObject.createImmutable("user: "),__ref.getField(true,"_user" /*RemoteObject*/ )),0);
 BA.debugLineNum = 484;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","419071011",RemoteObject.concat(RemoteObject.createImmutable("DeviceName: "),__ref.getField(true,"_devicename" /*RemoteObject*/ )),0);
 BA.debugLineNum = 487;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(64);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 488;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(128);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 491;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mvto";
Debug.ShouldStop(1024);
_cmd = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_Mvto_Maq")),(Object)(RemoteObject.createNewArray("Object",new int[] {19},new Object[] {(__ref.getField(true,"_ascdo_maq_mvto_maq" /*RemoteObject*/ )),(__ref.getField(true,"_maquina" /*RemoteObject*/ )),(__ref.getField(true,"_fecha" /*RemoteObject*/ )),(__ref.getField(true,"_labor" /*RemoteObject*/ )),(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),(__ref.getField(true,"_lote" /*RemoteObject*/ )),(__ref.getField(true,"_implemento" /*RemoteObject*/ )),(__ref.getField(true,"_horainicio" /*RemoteObject*/ )),(__ref.getField(true,"_horafin" /*RemoteObject*/ )),(__ref.getField(true,"_combustible" /*RemoteObject*/ )),(__ref.getField(true,"_observaciones" /*RemoteObject*/ )),(__ref.getField(true,"_operario" /*RemoteObject*/ )),(__ref.getField(true,"_implemento2" /*RemoteObject*/ )),(__ref.getField(true,"_area" /*RemoteObject*/ )),(__ref.getField(true,"_fechahoy" /*RemoteObject*/ )),(__ref.getField(true,"_horaactual" /*RemoteObject*/ )),(__ref.getField(true,"_user" /*RemoteObject*/ )),(__ref.getField(true,"_devicename" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 494;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(8192);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 495;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "button1_click"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 498;BA.debugLine="Try";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 499;BA.debugLine="If j.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 500;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 502;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","419071029",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 505;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","419071032",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 507;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView 'ignore";
formmaquinaria._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",formmaquinaria._root);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI 'ignore";
formmaquinaria._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",formmaquinaria._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private utilClass As util";
formmaquinaria._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",formmaquinaria._utilclass);
 //BA.debugLineNum = 6;BA.debugLine="Private CustomListView1Geral As CustomListView";
formmaquinaria._customlistview1geral = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_customlistview1geral",formmaquinaria._customlistview1geral);
 //BA.debugLineNum = 7;BA.debugLine="Private Panel1geral As Panel";
formmaquinaria._panel1geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1geral",formmaquinaria._panel1geral);
 //BA.debugLineNum = 8;BA.debugLine="Private Label1Back As Label";
formmaquinaria._label1back = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1back",formmaquinaria._label1back);
 //BA.debugLineNum = 9;BA.debugLine="Private Label2Save As Label";
formmaquinaria._label2save = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2save",formmaquinaria._label2save);
 //BA.debugLineNum = 11;BA.debugLine="Private SD_xComboBoxMaquina As SD_xComboBox";
formmaquinaria._sd_xcomboboxmaquina = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxmaquina",formmaquinaria._sd_xcomboboxmaquina);
 //BA.debugLineNum = 12;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
formmaquinaria._sd_xcomboboxlabor = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlabor",formmaquinaria._sd_xcomboboxlabor);
 //BA.debugLineNum = 13;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
formmaquinaria._sd_xcomboboxnit = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxnit",formmaquinaria._sd_xcomboboxnit);
 //BA.debugLineNum = 14;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
formmaquinaria._sd_xcomboboxhacienda = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxhacienda",formmaquinaria._sd_xcomboboxhacienda);
 //BA.debugLineNum = 15;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
formmaquinaria._sd_xcomboboxlote = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlote",formmaquinaria._sd_xcomboboxlote);
 //BA.debugLineNum = 16;BA.debugLine="Private SD_xComboBoxImplemento As SD_xComboBox";
formmaquinaria._sd_xcomboboximplemento = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboximplemento",formmaquinaria._sd_xcomboboximplemento);
 //BA.debugLineNum = 17;BA.debugLine="Private SD_xComboBoxImplemento2 As SD_xComboBox";
formmaquinaria._sd_xcomboboximplemento2 = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboximplemento2",formmaquinaria._sd_xcomboboximplemento2);
 //BA.debugLineNum = 18;BA.debugLine="Private SD_xComboBoxOperario As SD_xComboBox";
formmaquinaria._sd_xcomboboxoperario = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxoperario",formmaquinaria._sd_xcomboboxoperario);
 //BA.debugLineNum = 19;BA.debugLine="Private SD_xComboBoxObservaciones As SD_xComboBox";
formmaquinaria._sd_xcomboboxobservaciones = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxobservaciones",formmaquinaria._sd_xcomboboxobservaciones);
 //BA.debugLineNum = 22;BA.debugLine="Dim haciendaCBX As String";
formmaquinaria._haciendacbx = RemoteObject.createImmutable("");__ref.setField("_haciendacbx",formmaquinaria._haciendacbx);
 //BA.debugLineNum = 24;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
formmaquinaria._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",formmaquinaria._rdclink);
 //BA.debugLineNum = 27;BA.debugLine="Private Panel2Time As Panel";
formmaquinaria._panel2time = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel2time",formmaquinaria._panel2time);
 //BA.debugLineNum = 28;BA.debugLine="Private Label13Time As Label";
formmaquinaria._label13time = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label13time",formmaquinaria._label13time);
 //BA.debugLineNum = 30;BA.debugLine="Private Panel12 As Panel";
formmaquinaria._panel12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel12",formmaquinaria._panel12);
 //BA.debugLineNum = 33;BA.debugLine="Dim fecha As String";
formmaquinaria._fecha = RemoteObject.createImmutable("");__ref.setField("_fecha",formmaquinaria._fecha);
 //BA.debugLineNum = 34;BA.debugLine="Dim maquina As String";
formmaquinaria._maquina = RemoteObject.createImmutable("");__ref.setField("_maquina",formmaquinaria._maquina);
 //BA.debugLineNum = 35;BA.debugLine="Dim labor As String";
formmaquinaria._labor = RemoteObject.createImmutable("");__ref.setField("_labor",formmaquinaria._labor);
 //BA.debugLineNum = 36;BA.debugLine="Dim nitEmpresaCBX As String";
formmaquinaria._nitempresacbx = RemoteObject.createImmutable("");__ref.setField("_nitempresacbx",formmaquinaria._nitempresacbx);
 //BA.debugLineNum = 37;BA.debugLine="Dim haciendaCBX As String";
formmaquinaria._haciendacbx = RemoteObject.createImmutable("");__ref.setField("_haciendacbx",formmaquinaria._haciendacbx);
 //BA.debugLineNum = 38;BA.debugLine="Dim Lote As String";
formmaquinaria._lote = RemoteObject.createImmutable("");__ref.setField("_lote",formmaquinaria._lote);
 //BA.debugLineNum = 39;BA.debugLine="Dim implemento As String";
formmaquinaria._implemento = RemoteObject.createImmutable("");__ref.setField("_implemento",formmaquinaria._implemento);
 //BA.debugLineNum = 40;BA.debugLine="Dim implemento2 As String";
formmaquinaria._implemento2 = RemoteObject.createImmutable("");__ref.setField("_implemento2",formmaquinaria._implemento2);
 //BA.debugLineNum = 41;BA.debugLine="Dim operario As String";
formmaquinaria._operario = RemoteObject.createImmutable("");__ref.setField("_operario",formmaquinaria._operario);
 //BA.debugLineNum = 42;BA.debugLine="Dim observaciones As String";
formmaquinaria._observaciones = RemoteObject.createImmutable("");__ref.setField("_observaciones",formmaquinaria._observaciones);
 //BA.debugLineNum = 43;BA.debugLine="Dim horafin As String";
formmaquinaria._horafin = RemoteObject.createImmutable("");__ref.setField("_horafin",formmaquinaria._horafin);
 //BA.debugLineNum = 44;BA.debugLine="Dim horainicio As String";
formmaquinaria._horainicio = RemoteObject.createImmutable("");__ref.setField("_horainicio",formmaquinaria._horainicio);
 //BA.debugLineNum = 45;BA.debugLine="Dim combustible As String";
formmaquinaria._combustible = RemoteObject.createImmutable("");__ref.setField("_combustible",formmaquinaria._combustible);
 //BA.debugLineNum = 46;BA.debugLine="Dim area As String";
formmaquinaria._area = RemoteObject.createImmutable("");__ref.setField("_area",formmaquinaria._area);
 //BA.debugLineNum = 47;BA.debugLine="Dim horaActual As String";
formmaquinaria._horaactual = RemoteObject.createImmutable("");__ref.setField("_horaactual",formmaquinaria._horaactual);
 //BA.debugLineNum = 48;BA.debugLine="Dim user As String";
formmaquinaria._user = RemoteObject.createImmutable("");__ref.setField("_user",formmaquinaria._user);
 //BA.debugLineNum = 49;BA.debugLine="Dim DeviceName As String";
formmaquinaria._devicename = RemoteObject.createImmutable("");__ref.setField("_devicename",formmaquinaria._devicename);
 //BA.debugLineNum = 50;BA.debugLine="Dim Ascdo_Maq_Mvto_Maq As String";
formmaquinaria._ascdo_maq_mvto_maq = RemoteObject.createImmutable("");__ref.setField("_ascdo_maq_mvto_maq",formmaquinaria._ascdo_maq_mvto_maq);
 //BA.debugLineNum = 51;BA.debugLine="Private EditText1HoraInicio As EditText";
formmaquinaria._edittext1horainicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1horainicio",formmaquinaria._edittext1horainicio);
 //BA.debugLineNum = 52;BA.debugLine="Private EditText2HoraFim As EditText";
formmaquinaria._edittext2horafim = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext2horafim",formmaquinaria._edittext2horafim);
 //BA.debugLineNum = 53;BA.debugLine="Private EditText1 As EditText";
formmaquinaria._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1",formmaquinaria._edittext1);
 //BA.debugLineNum = 54;BA.debugLine="Private EditText2 As EditText";
formmaquinaria._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext2",formmaquinaria._edittext2);
 //BA.debugLineNum = 55;BA.debugLine="Dim fechaHoy As String";
formmaquinaria._fechahoy = RemoteObject.createImmutable("");__ref.setField("_fechahoy",formmaquinaria._fechahoy);
 //BA.debugLineNum = 57;BA.debugLine="Private Dialog As B4XDialog";
formmaquinaria._dialog = RemoteObject.createNew ("b4a.example.ef.b4xdialog");__ref.setField("_dialog",formmaquinaria._dialog);
 //BA.debugLineNum = 58;BA.debugLine="Private Base As B4XView";
formmaquinaria._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",formmaquinaria._base);
 //BA.debugLineNum = 59;BA.debugLine="Private SwiftButtonMaquina As SwiftButton";
formmaquinaria._swiftbuttonmaquina = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonmaquina",formmaquinaria._swiftbuttonmaquina);
 //BA.debugLineNum = 60;BA.debugLine="Private SearchTemplateMaquina As B4XSearchTemplat";
formmaquinaria._searchtemplatemaquina = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatemaquina",formmaquinaria._searchtemplatemaquina);
 //BA.debugLineNum = 62;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
formmaquinaria._swiftbuttonlabor = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonlabor",formmaquinaria._swiftbuttonlabor);
 //BA.debugLineNum = 63;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
formmaquinaria._searchtemplatelabor = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatelabor",formmaquinaria._searchtemplatelabor);
 //BA.debugLineNum = 65;BA.debugLine="Private SwiftButtonNit As SwiftButton";
formmaquinaria._swiftbuttonnit = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonnit",formmaquinaria._swiftbuttonnit);
 //BA.debugLineNum = 66;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
formmaquinaria._searchtemplatenit = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatenit",formmaquinaria._searchtemplatenit);
 //BA.debugLineNum = 68;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
formmaquinaria._swiftbuttonhacienda = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonhacienda",formmaquinaria._swiftbuttonhacienda);
 //BA.debugLineNum = 69;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
formmaquinaria._searchtemplatehacienda = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatehacienda",formmaquinaria._searchtemplatehacienda);
 //BA.debugLineNum = 71;BA.debugLine="Private SwiftButtonLote As SwiftButton";
formmaquinaria._swiftbuttonlote = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonlote",formmaquinaria._swiftbuttonlote);
 //BA.debugLineNum = 72;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
formmaquinaria._searchtemplatelote = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatelote",formmaquinaria._searchtemplatelote);
 //BA.debugLineNum = 74;BA.debugLine="Private SwiftButtonImplemento As SwiftButton";
formmaquinaria._swiftbuttonimplemento = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonimplemento",formmaquinaria._swiftbuttonimplemento);
 //BA.debugLineNum = 75;BA.debugLine="Private SearchTemplateImplemento As B4XSearchTemp";
formmaquinaria._searchtemplateimplemento = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplateimplemento",formmaquinaria._searchtemplateimplemento);
 //BA.debugLineNum = 77;BA.debugLine="Private SwiftButtonImplemento2 As SwiftButton";
formmaquinaria._swiftbuttonimplemento2 = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonimplemento2",formmaquinaria._swiftbuttonimplemento2);
 //BA.debugLineNum = 78;BA.debugLine="Private SearchTemplateImplemento2 As B4XSearchTem";
formmaquinaria._searchtemplateimplemento2 = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplateimplemento2",formmaquinaria._searchtemplateimplemento2);
 //BA.debugLineNum = 80;BA.debugLine="Private SwiftButtonOperario As SwiftButton";
formmaquinaria._swiftbuttonoperario = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonoperario",formmaquinaria._swiftbuttonoperario);
 //BA.debugLineNum = 81;BA.debugLine="Private SearchTemplateOperario As B4XSearchTempla";
formmaquinaria._searchtemplateoperario = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplateoperario",formmaquinaria._searchtemplateoperario);
 //BA.debugLineNum = 83;BA.debugLine="Private SwiftButtonObservaciones As SwiftButton";
formmaquinaria._swiftbuttonobservaciones = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonobservaciones",formmaquinaria._swiftbuttonobservaciones);
 //BA.debugLineNum = 84;BA.debugLine="Private SearchTemplateObservaciones As B4XSearchT";
formmaquinaria._searchtemplateobservaciones = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplateobservaciones",formmaquinaria._searchtemplateobservaciones);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formmaquinaria","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 403;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 404;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(524288);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 405;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(1048576);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 406;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(2097152);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 407;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 408;BA.debugLine="Return cmd";
Debug.ShouldStop(8388608);
if (true) return _cmd;
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("CreateItem (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "formmaquinaria","createitem", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 353;BA.debugLine="Private Sub CreateItem As Panel";
Debug.ShouldStop(1);
 BA.debugLineNum = 355;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 356;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(8);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formmaquinaria.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formmaquinaria.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 359;BA.debugLine="panel.LoadLayout(\"addMaquinariaUI\")";
Debug.ShouldStop(64);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("addMaquinariaUI")),__ref.getField(false, "ba"));
 BA.debugLineNum = 361;BA.debugLine="panel.Height=Panel1geral.Height";
Debug.ShouldStop(256);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel1geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 363;BA.debugLine="Return panel";
Debug.ShouldStop(1024);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 364;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdevicename(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDeviceName (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("getdevicename")) { return __ref.runUserSub(false, "formmaquinaria","getdevicename", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _manufacturer = RemoteObject.createImmutable("");
RemoteObject _model = RemoteObject.createImmutable("");
 BA.debugLineNum = 101;BA.debugLine="Sub GetDeviceName As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(32);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 103;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
Debug.ShouldStop(64);
_manufacturer = _p.runMethod(true,"getManufacturer");Debug.locals.put("Manufacturer", _manufacturer);Debug.locals.put("Manufacturer", _manufacturer);
 BA.debugLineNum = 104;BA.debugLine="Dim Model As String = p.Model";
Debug.ShouldStop(128);
_model = _p.runMethod(true,"getModel");Debug.locals.put("Model", _model);Debug.locals.put("Model", _model);
 BA.debugLineNum = 105;BA.debugLine="Return Manufacturer & \" \" & Model";
Debug.ShouldStop(256);
if (true) return RemoteObject.concat(_manufacturer,RemoteObject.createImmutable(" "),_model);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formmaquinaria","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 88;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Return Me";
Debug.ShouldStop(16777216);
if (true) return __ref;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label13time_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label13Time_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,371);
if (RapidSub.canDelegate("label13time_click")) { return __ref.runUserSub(false, "formmaquinaria","label13time_click", __ref);}
 BA.debugLineNum = 371;BA.debugLine="Private Sub Label13Time_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 372;BA.debugLine="Panel12.Visible = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formmaquinaria.__c.getField(true,"True"));
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Label1Back_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,509);
if (RapidSub.canDelegate("label1back_click")) { return __ref.runUserSub(false, "formmaquinaria","label1back_click", __ref);}
 BA.debugLineNum = 509;BA.debugLine="Private Sub Label1Back_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 510;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(536870912);
formmaquinaria._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 511;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _sd_xcomboboxhacienda_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("sd_xcomboboxhacienda_itemclick")) { __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxhacienda_itemclick", __ref, _position, _value); return;}
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(null,__ref,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formmaquinaria parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codg_hacienda = RemoteObject.createImmutable("");
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,317);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 318;BA.debugLine="haciendaCBX=Value";
Debug.ShouldStop(536870912);
__ref.setField ("_haciendacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 320;BA.debugLine="SD_xComboBoxLote.Clear";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 321;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 322;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(2);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 323;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
Debug.ShouldStop(4);
_cmd = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 326;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 329;BA.debugLine="If j.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 10;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 331;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1024);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 332;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 336;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.getField(false,"Rows" /*RemoteObject*/ );
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (group10.runMethod(false,"Get",index10));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index10++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 337;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(65536);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 340;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
Debug.ShouldStop(524288);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_codg_hacienda),(Object)((_codg_hacienda)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("row", _row);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 345;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","418284572",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 349;BA.debugLine="j.Release";
Debug.ShouldStop(268435456);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 351;BA.debugLine="End Sub";
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
public static RemoteObject  _sd_xcomboboximplemento_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxImplemento_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,427);
if (RapidSub.canDelegate("sd_xcomboboximplemento_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboximplemento_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 427;BA.debugLine="Private Sub SD_xComboBoxImplemento_ItemClick (Posi";
Debug.ShouldStop(1024);
 BA.debugLineNum = 428;BA.debugLine="implemento = Value";
Debug.ShouldStop(2048);
__ref.setField ("_implemento" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 431;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboximplemento2_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxImplemento2_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,433);
if (RapidSub.canDelegate("sd_xcomboboximplemento2_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboximplemento2_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 433;BA.debugLine="Private Sub SD_xComboBoxImplemento2_ItemClick (Pos";
Debug.ShouldStop(65536);
 BA.debugLineNum = 434;BA.debugLine="implemento2 = Value";
Debug.ShouldStop(131072);
__ref.setField ("_implemento2" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 436;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("SD_xComboBoxLabor_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("sd_xcomboboxlabor_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxlabor_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 418;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
Debug.ShouldStop(2);
 BA.debugLineNum = 419;BA.debugLine="labor = Value";
Debug.ShouldStop(4);
__ref.setField ("_labor" /*RemoteObject*/ ,BA.ObjectToString(_value));
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
public static RemoteObject  _sd_xcomboboxlote_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxLote_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,422);
if (RapidSub.canDelegate("sd_xcomboboxlote_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxlote_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 422;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
Debug.ShouldStop(32);
 BA.debugLineNum = 423;BA.debugLine="Lote = Value";
Debug.ShouldStop(64);
__ref.setField ("_lote" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 424;BA.debugLine="Log(Lote)";
Debug.ShouldStop(128);
formmaquinaria.__c.runVoidMethod ("LogImpl","418743298",__ref.getField(true,"_lote" /*RemoteObject*/ ),0);
 BA.debugLineNum = 425;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxmaquina_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxMaquina_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,412);
if (RapidSub.canDelegate("sd_xcomboboxmaquina_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxmaquina_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 412;BA.debugLine="Private Sub SD_xComboBoxMaquina_ItemClick (Positio";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 413;BA.debugLine="maquina =Value";
Debug.ShouldStop(268435456);
__ref.setField ("_maquina" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _sd_xcomboboxnit_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,282);
if (RapidSub.canDelegate("sd_xcomboboxnit_itemclick")) { __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxnit_itemclick", __ref, _position, _value); return;}
ResumableSub_SD_xComboBoxNit_ItemClick rsub = new ResumableSub_SD_xComboBoxNit_ItemClick(null,__ref,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SD_xComboBoxNit_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNit_ItemClick(b4a.example.ef.formmaquinaria parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codg_hacienda = RemoteObject.createImmutable("");
RemoteObject _nombrehacienda = RemoteObject.createImmutable("");
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,282);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 283;BA.debugLine="nitEmpresaCBX=Value";
Debug.ShouldStop(67108864);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 284;BA.debugLine="SD_xComboBoxHacienda.Clear";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sd_xcomboboxhacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 285;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(268435456);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 286;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 287;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
Debug.ShouldStop(1073741824);
_cmd = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_value})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 290;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 293;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 10;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 295;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(64);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 296;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 300;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.getField(false,"Rows" /*RemoteObject*/ );
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (group10.runMethod(false,"Get",index10));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index10++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 301;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(4096);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 302;BA.debugLine="Dim NombreHacienda As String = row(1)";
Debug.ShouldStop(8192);
_nombrehacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("NombreHacienda", _nombrehacienda);Debug.locals.put("NombreHacienda", _nombrehacienda);
 BA.debugLineNum = 305;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
Debug.ShouldStop(65536);
__ref.getField(false,"_sd_xcomboboxhacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_nombrehacienda),(Object)((_codg_hacienda)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("row", _row);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 310;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","418219036",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 313;BA.debugLine="j.Release";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _sd_xcomboboxobservaciones_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxObservaciones_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,443);
if (RapidSub.canDelegate("sd_xcomboboxobservaciones_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxobservaciones_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 443;BA.debugLine="Private Sub SD_xComboBoxObservaciones_ItemClick (P";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 444;BA.debugLine="observaciones = Value";
Debug.ShouldStop(134217728);
__ref.setField ("_observaciones" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxoperario_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxOperario_ItemClick (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,438);
if (RapidSub.canDelegate("sd_xcomboboxoperario_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxoperario_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 438;BA.debugLine="Private Sub SD_xComboBoxOperario_ItemClick (Positi";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 439;BA.debugLine="operario =Value";
Debug.ShouldStop(4194304);
__ref.setField ("_operario" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 441;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _swiftbuttonhacienda_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonHacienda_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,606);
if (RapidSub.canDelegate("swiftbuttonhacienda_click")) { __ref.runUserSub(false, "formmaquinaria","swiftbuttonhacienda_click", __ref); return;}
ResumableSub_SwiftButtonHacienda_Click rsub = new ResumableSub_SwiftButtonHacienda_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonHacienda_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonHacienda_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _itemslote = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _haciendacompleto = RemoteObject.createImmutable("");
RemoteObject _partes = null;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codg_hacienda = RemoteObject.createImmutable("");
RemoteObject group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonHacienda_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,606);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 607;BA.debugLine="Dim ItemsLote As List";
Debug.ShouldStop(1073741824);
_itemslote = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsLote", _itemslote);
 BA.debugLineNum = 608;BA.debugLine="ItemsLote.Initialize";
Debug.ShouldStop(-2147483648);
_itemslote.runVoidMethod ("Initialize");
 BA.debugLineNum = 610;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonhacienda_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatehacienda" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 611;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 612;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
Debug.ShouldStop(8);
__ref.getField(false,"_swiftbuttonhacienda" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatehacienda" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 613;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
Debug.ShouldStop(16);
_haciendacompleto = __ref.getField(false,"_searchtemplatehacienda" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("HACIENDACOMPLETO", _haciendacompleto);Debug.locals.put("HACIENDACOMPLETO", _haciendacompleto);
 BA.debugLineNum = 614;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
Debug.ShouldStop(32);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_haciendacompleto));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 615;BA.debugLine="haciendaCBX = Partes(0)";
Debug.ShouldStop(64);
__ref.setField ("_haciendacbx" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 616;BA.debugLine="ItemsLote.Clear";
Debug.ShouldStop(128);
_itemslote.runVoidMethod ("Clear");
 BA.debugLineNum = 617;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
Debug.ShouldStop(256);
_itemslote.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 618;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
Debug.ShouldStop(512);
__ref.getField(false,"_swiftbuttonlote" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 620;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(2048);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 621;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
Debug.ShouldStop(4096);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 622;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
Debug.ShouldStop(8192);
_cmd = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 625;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonhacienda_click"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 628;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 13;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 630;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(2097152);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 631;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonhacienda_click"), (_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 635;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//for
this.state = 10;
group19 = _res.getField(false,"Rows" /*RemoteObject*/ );
index19 = 0;
groupLen19 = group19.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index19 < groupLen19) {
this.state = 9;
_row = (group19.runMethod(false,"Get",index19));Debug.locals.put("row", _row);}
if (true) break;

case 19:
//C
this.state = 18;
index19++;
Debug.locals.put("row", _row);
if (true) break;

case 9:
//C
this.state = 19;
 BA.debugLineNum = 636;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(134217728);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 640;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
Debug.ShouldStop(-2147483648);
_itemslote.runVoidMethod ("Add",(Object)((_codg_hacienda)));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("row", _row);
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 645;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","419398695",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 647;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
Debug.ShouldStop(64);
__ref.getField(false,"_searchtemplatelote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemslote));
 BA.debugLineNum = 648;BA.debugLine="SwiftButtonLote.Enabled = True";
Debug.ShouldStop(128);
__ref.getField(false,"_swiftbuttonlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.swiftbutton.class, "_setenabled" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 650;BA.debugLine="Log(haciendaCBX)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","419398700",__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ),0);
 BA.debugLineNum = 651;BA.debugLine="j.Release";
Debug.ShouldStop(1024);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 654;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static void  _swiftbuttonimplemento_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonImplemento_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,669);
if (RapidSub.canDelegate("swiftbuttonimplemento_click")) { __ref.runUserSub(false, "formmaquinaria","swiftbuttonimplemento_click", __ref); return;}
ResumableSub_SwiftButtonImplemento_Click rsub = new ResumableSub_SwiftButtonImplemento_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonImplemento_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonImplemento_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonImplemento_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,669);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 670;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateImple";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonimplemento_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplateimplemento" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 672;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 673;BA.debugLine="SwiftButtonImplemento.xLBL.Text = SearchTemplate";
Debug.ShouldStop(1);
__ref.getField(false,"_swiftbuttonimplemento" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplateimplemento" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 676;BA.debugLine="If SearchTemplateImplemento.SelectedItem.Contain";
Debug.ShouldStop(8);
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(false,"_searchtemplateimplemento" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable(":"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 677;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
Debug.ShouldStop(16);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplateimplemento" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 678;BA.debugLine="implemento = Partes(0) ' Asignar solo la primer";
Debug.ShouldStop(32);
__ref.setField ("_implemento" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 681;BA.debugLine="Log(\"Implemento seleccionado: \" & implemento)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","419529740",RemoteObject.concat(RemoteObject.createImmutable("Implemento seleccionado: "),__ref.getField(true,"_implemento" /*RemoteObject*/ )),0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 683;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","419529742",RemoteObject.createImmutable("El texto no contiene ':' por lo que no se pudo dividir."),0);
 BA.debugLineNum = 684;BA.debugLine="implemento = SearchTemplateImplemento.SelectedI";
Debug.ShouldStop(2048);
__ref.setField ("_implemento" /*RemoteObject*/ ,__ref.getField(false,"_searchtemplateimplemento" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ ));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 687;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static void  _swiftbuttonimplemento2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonImplemento2_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,690);
if (RapidSub.canDelegate("swiftbuttonimplemento2_click")) { __ref.runUserSub(false, "formmaquinaria","swiftbuttonimplemento2_click", __ref); return;}
ResumableSub_SwiftButtonImplemento2_Click rsub = new ResumableSub_SwiftButtonImplemento2_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonImplemento2_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonImplemento2_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonImplemento2_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,690);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 691;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateImple";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonimplemento2_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplateimplemento2" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 693;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 694;BA.debugLine="SwiftButtonImplemento2.xLBL.Text = SearchTemplat";
Debug.ShouldStop(2097152);
__ref.getField(false,"_swiftbuttonimplemento2" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplateimplemento2" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 697;BA.debugLine="If SearchTemplateImplemento2.SelectedItem.Contai";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(false,"_searchtemplateimplemento2" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable(":"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 698;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
Debug.ShouldStop(33554432);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplateimplemento2" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 699;BA.debugLine="implemento2 = Partes(0) ' Asignar solo la prime";
Debug.ShouldStop(67108864);
__ref.setField ("_implemento2" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 701;BA.debugLine="Log(\"Implemento2 seleccionado: \" & implemento2)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","419595275",RemoteObject.concat(RemoteObject.createImmutable("Implemento2 seleccionado: "),__ref.getField(true,"_implemento2" /*RemoteObject*/ )),0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 703;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","419595277",RemoteObject.createImmutable("El texto no contiene ':' por lo que no se pudo dividir."),0);
 BA.debugLineNum = 704;BA.debugLine="implemento2 = SearchTemplateImplemento2.Selecte";
Debug.ShouldStop(-2147483648);
__ref.setField ("_implemento2" /*RemoteObject*/ ,__ref.getField(false,"_searchtemplateimplemento2" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ ));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 707;BA.debugLine="End Sub";
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
public static void  _swiftbuttonlabor_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonLabor_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("swiftbuttonlabor_click")) { __ref.runUserSub(false, "formmaquinaria","swiftbuttonlabor_click", __ref); return;}
ResumableSub_SwiftButtonLabor_Click rsub = new ResumableSub_SwiftButtonLabor_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonLabor_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLabor_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonLabor_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,533);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 534;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonlabor_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 536;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 537;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
Debug.ShouldStop(16777216);
__ref.getField(false,"_swiftbuttonlabor" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 540;BA.debugLine="If SearchTemplateLabor.SelectedItem.Contains(\":\"";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable(":"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 541;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
Debug.ShouldStop(268435456);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 542;BA.debugLine="labor = Partes(0) ' Asignar solo la primera par";
Debug.ShouldStop(536870912);
__ref.setField ("_labor" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 545;BA.debugLine="Log(\"Texto completo: \" & SearchTemplateLabor.Se";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","419267596",RemoteObject.concat(RemoteObject.createImmutable("Texto completo: "),__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )),0);
 BA.debugLineNum = 546;BA.debugLine="Log(\"Labor seleccionada: \" & labor)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","419267597",RemoteObject.concat(RemoteObject.createImmutable("Labor seleccionada: "),__ref.getField(true,"_labor" /*RemoteObject*/ )),0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 548;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","419267599",RemoteObject.createImmutable("El texto no contiene ':' por lo que no se pudo dividir."),0);
 BA.debugLineNum = 549;BA.debugLine="labor = SearchTemplateLabor.SelectedItem ' Asig";
Debug.ShouldStop(16);
__ref.setField ("_labor" /*RemoteObject*/ ,__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ ));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 552;BA.debugLine="Log(labor)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","419267603",__ref.getField(true,"_labor" /*RemoteObject*/ ),0);
 BA.debugLineNum = 553;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static void  _swiftbuttonlote_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonLote_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,656);
if (RapidSub.canDelegate("swiftbuttonlote_click")) { __ref.runUserSub(false, "formmaquinaria","swiftbuttonlote_click", __ref); return;}
ResumableSub_SwiftButtonLote_Click rsub = new ResumableSub_SwiftButtonLote_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonLote_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLote_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonLote_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,656);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 657;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonlote_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatelote" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 659;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 660;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.S";
Debug.ShouldStop(524288);
__ref.getField(false,"_swiftbuttonlote" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatelote" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 662;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
Debug.ShouldStop(2097152);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplatelote" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 663;BA.debugLine="Lote= Partes(0) ' Asignar solo la primera parte";
Debug.ShouldStop(4194304);
__ref.setField ("_lote" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 665;BA.debugLine="Log(Lote)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","419464201",__ref.getField(true,"_lote" /*RemoteObject*/ ),0);
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static void  _swiftbuttonmaquina_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonMaquina_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,513);
if (RapidSub.canDelegate("swiftbuttonmaquina_click")) { __ref.runUserSub(false, "formmaquinaria","swiftbuttonmaquina_click", __ref); return;}
ResumableSub_SwiftButtonMaquina_Click rsub = new ResumableSub_SwiftButtonMaquina_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonMaquina_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonMaquina_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonMaquina_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,513);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 514;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateMaqui";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonmaquina_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatemaquina" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 516;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 517;BA.debugLine="SwiftButtonMaquina.xLBL.Text = SearchTemplateMaq";
Debug.ShouldStop(16);
__ref.getField(false,"_swiftbuttonmaquina" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatemaquina" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 520;BA.debugLine="If SearchTemplateMaquina.SelectedItem.Contains(\"";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(false,"_searchtemplatemaquina" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable(":"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 521;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
Debug.ShouldStop(256);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplatemaquina" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 522;BA.debugLine="maquina = Partes(0) ' Asignar solo la primera p";
Debug.ShouldStop(512);
__ref.setField ("_maquina" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 524;BA.debugLine="Log(\"Máquina seleccionada: \" & maquina)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","419202059",RemoteObject.concat(RemoteObject.createImmutable("Máquina seleccionada: "),__ref.getField(true,"_maquina" /*RemoteObject*/ )),0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 526;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","419202061",RemoteObject.createImmutable("El texto no contiene ':' por lo que no se pudo dividir."),0);
 BA.debugLineNum = 527;BA.debugLine="maquina = SearchTemplateMaquina.SelectedItem '";
Debug.ShouldStop(16384);
__ref.setField ("_maquina" /*RemoteObject*/ ,__ref.getField(false,"_searchtemplatemaquina" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ ));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 530;BA.debugLine="End Sub";
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
public static void  _swiftbuttonnit_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonNit_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,555);
if (RapidSub.canDelegate("swiftbuttonnit_click")) { __ref.runUserSub(false, "formmaquinaria","swiftbuttonnit_click", __ref); return;}
ResumableSub_SwiftButtonNit_Click rsub = new ResumableSub_SwiftButtonNit_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonNit_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonNit_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _itemshacienda = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _nitcompleto = RemoteObject.createImmutable("");
RemoteObject _partes = null;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codg_hacienda = RemoteObject.createImmutable("");
RemoteObject _nombrehacienda = RemoteObject.createImmutable("");
RemoteObject group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonNit_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,555);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 556;BA.debugLine="Dim ItemsHacienda As List";
Debug.ShouldStop(2048);
_itemshacienda = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsHacienda", _itemshacienda);
 BA.debugLineNum = 557;BA.debugLine="ItemsHacienda.Initialize";
Debug.ShouldStop(4096);
_itemshacienda.runVoidMethod ("Initialize");
 BA.debugLineNum = 558;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonnit_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatenit" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 559;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 560;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
Debug.ShouldStop(32768);
__ref.getField(false,"_swiftbuttonnit" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatenit" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 561;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
Debug.ShouldStop(65536);
_nitcompleto = __ref.getField(false,"_searchtemplatenit" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("NITCOMPLETO", _nitcompleto);Debug.locals.put("NITCOMPLETO", _nitcompleto);
 BA.debugLineNum = 562;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
Debug.ShouldStop(131072);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_nitcompleto));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 563;BA.debugLine="nitEmpresaCBX = Partes(0)";
Debug.ShouldStop(262144);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 564;BA.debugLine="ItemsHacienda.Clear";
Debug.ShouldStop(524288);
_itemshacienda.runVoidMethod ("Clear");
 BA.debugLineNum = 565;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
Debug.ShouldStop(1048576);
_itemshacienda.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 566;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_swiftbuttonhacienda" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 568;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(8388608);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 569;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
Debug.ShouldStop(16777216);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 570;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
Debug.ShouldStop(33554432);
_cmd = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 573;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonnit_click"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 576;BA.debugLine="If j.Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 13;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 578;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(2);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 579;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonnit_click"), (_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 583;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(64);
if (true) break;

case 7:
//for
this.state = 10;
group19 = _res.getField(false,"Rows" /*RemoteObject*/ );
index19 = 0;
groupLen19 = group19.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index19 < groupLen19) {
this.state = 9;
_row = (group19.runMethod(false,"Get",index19));Debug.locals.put("row", _row);}
if (true) break;

case 19:
//C
this.state = 18;
index19++;
Debug.locals.put("row", _row);
if (true) break;

case 9:
//C
this.state = 19;
 BA.debugLineNum = 584;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(128);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 585;BA.debugLine="Dim NombreHacienda As String = row(1)";
Debug.ShouldStop(256);
_nombrehacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("NombreHacienda", _nombrehacienda);Debug.locals.put("NombreHacienda", _nombrehacienda);
 BA.debugLineNum = 590;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
Debug.ShouldStop(8192);
_itemshacienda.runVoidMethod ("Add",(Object)((RemoteObject.concat(_codg_hacienda,RemoteObject.createImmutable(":"),_nombrehacienda))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("row", _row);
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 595;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","419333160",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 597;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_searchtemplatehacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemshacienda));
 BA.debugLineNum = 598;BA.debugLine="SwiftButtonHacienda.Enabled = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_swiftbuttonhacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.swiftbutton.class, "_setenabled" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 599;BA.debugLine="Log(nitEmpresaCBX)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","419333164",__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ ),0);
 BA.debugLineNum = 601;BA.debugLine="j.Release";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 604;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static void  _swiftbuttonobservaciones_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonObservaciones_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,731);
if (RapidSub.canDelegate("swiftbuttonobservaciones_click")) { __ref.runUserSub(false, "formmaquinaria","swiftbuttonobservaciones_click", __ref); return;}
ResumableSub_SwiftButtonObservaciones_Click rsub = new ResumableSub_SwiftButtonObservaciones_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonObservaciones_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonObservaciones_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonObservaciones_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,731);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 732;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateObser";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonobservaciones_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplateobservaciones" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 734;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 735;BA.debugLine="SwiftButtonObservaciones.xLBL.Text = SearchTempl";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_swiftbuttonobservaciones" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplateobservaciones" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 738;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
Debug.ShouldStop(2);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplateobservaciones" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 739;BA.debugLine="Dim observaciones As String = Partes(0) ' Guarda";
Debug.ShouldStop(4);
parent._observaciones = _partes.getArrayElement(true,BA.numberCast(int.class, 0));__ref.setField("_observaciones",parent._observaciones);
 BA.debugLineNum = 743;BA.debugLine="Log(\"Primera parte (observacionCBX): \" & observa";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","419726348",RemoteObject.concat(RemoteObject.createImmutable("Primera parte (observacionCBX): "),__ref.getField(true,"_observaciones" /*RemoteObject*/ )),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 745;BA.debugLine="Log(\"Operación cancelada por el usuario.\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","419726350",RemoteObject.createImmutable("Operación cancelada por el usuario."),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 747;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static void  _swiftbuttonoperario_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonOperario_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,710);
if (RapidSub.canDelegate("swiftbuttonoperario_click")) { __ref.runUserSub(false, "formmaquinaria","swiftbuttonoperario_click", __ref); return;}
ResumableSub_SwiftButtonOperario_Click rsub = new ResumableSub_SwiftButtonOperario_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonOperario_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonOperario_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonOperario_Click (formmaquinaria) ","formmaquinaria",14,__ref.getField(false, "ba"),__ref,710);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 711;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateOpera";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "swiftbuttonoperario_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplateoperario" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 713;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 714;BA.debugLine="SwiftButtonOperario.xLBL.Text = SearchTemplateOp";
Debug.ShouldStop(512);
__ref.getField(false,"_swiftbuttonoperario" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplateoperario" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 717;BA.debugLine="If SearchTemplateOperario.SelectedItem.Contains(";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(false,"_searchtemplateoperario" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable(":"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 718;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
Debug.ShouldStop(8192);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplateoperario" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 719;BA.debugLine="operario = Partes(0) ' Asignar solo la primera";
Debug.ShouldStop(16384);
__ref.setField ("_operario" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 722;BA.debugLine="Log(\"Operario seleccionado: \" & operario)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","419660812",RemoteObject.concat(RemoteObject.createImmutable("Operario seleccionado: "),__ref.getField(true,"_operario" /*RemoteObject*/ )),0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 724;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","419660814",RemoteObject.createImmutable("El texto no contiene ':' por lo que no se pudo dividir."),0);
 BA.debugLineNum = 725;BA.debugLine="operario = SearchTemplateOperario.SelectedItem";
Debug.ShouldStop(1048576);
__ref.setField ("_operario" /*RemoteObject*/ ,__ref.getField(false,"_searchtemplateoperario" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ ));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 728;BA.debugLine="End Sub";
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
}