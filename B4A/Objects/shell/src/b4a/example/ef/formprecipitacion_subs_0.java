package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formprecipitacion_subs_0 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "formprecipitacion","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 134;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(32);
 BA.debugLineNum = 136;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(128);
_formatteddate = formprecipitacion.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 139;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(1024);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 142;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(8192);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 145;BA.debugLine="Label13Time.Text = formattedDate";
Debug.ShouldStop(65536);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 148;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formprecipitacion.__c.getField(true,"False"));
 BA.debugLineNum = 151;BA.debugLine="fecha = formattedDate";
Debug.ShouldStop(4194304);
__ref.setField ("_fecha" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 154;BA.debugLine="Log(fecha)";
Debug.ShouldStop(33554432);
formprecipitacion.__c.runVoidMethod ("LogImpl","217432596",__ref.getField(true,"_fecha" /*RemoteObject*/ ),0);
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("B4XPage_Appear (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("b4xpage_appear")) { __ref.runUserSub(false, "formprecipitacion","b4xpage_appear", __ref); return;}
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
public ResumableSub_B4XPage_Appear(b4a.example.ef.formprecipitacion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formprecipitacion parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmdpluviometro = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j2 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _respluviometro = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowpluviometro = null;
RemoteObject _cdgo_plvmtro = RemoteObject.createImmutable("");
RemoteObject _nombre_plvmtro = RemoteObject.createImmutable("");
RemoteObject _nit_plvmtro = RemoteObject.createImmutable("");
RemoteObject _hda_pvlmtro = RemoteObject.createImmutable("");
RemoteObject _detailsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,36);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 37;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="pluviometroMap.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_pluviometromap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
Debug.ShouldStop(64);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, ((int)0xb4008000))));
 BA.debugLineNum = 40;BA.debugLine="Root.LoadLayout(\"form\")";
Debug.ShouldStop(128);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("form")),__ref.getField(false, "ba"));
 BA.debugLineNum = 41;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
Debug.ShouldStop(256);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, ((int)0xff25253d)));
 BA.debugLineNum = 42;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
Debug.ShouldStop(512);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextcolor",parent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 43;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"formPreci\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formprecipitacion.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("formPreci"))));
 BA.debugLineNum = 45;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(4096);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 46;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(8192);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="Dim cmdPluviometro As DBCommand = CreateCommand(\"";
Debug.ShouldStop(65536);
_cmdpluviometro = __ref.runClassMethod (b4a.example.ef.formprecipitacion.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_maquina_pluviometros")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdPluviometro", _cmdpluviometro);Debug.locals.put("cmdPluviometro", _cmdpluviometro);
 BA.debugLineNum = 50;BA.debugLine="Wait For (Req.ExecuteQuery(cmdPluviometro, 0, Nul";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formprecipitacion", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdpluviometro),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j2", _j2);
;
 BA.debugLineNum = 51;BA.debugLine="If j2.Success Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 52;BA.debugLine="Req.HandleJobAsync(j2, \"req_pluviometro\")";
Debug.ShouldStop(524288);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j2),(Object)(RemoteObject.createImmutable("req_pluviometro")));
 BA.debugLineNum = 53;BA.debugLine="Wait For (Req) req_pluviometro_Result(resPluviom";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","req_pluviometro_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formprecipitacion", "b4xpage_appear"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_respluviometro = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resPluviometro", _respluviometro);
;
 BA.debugLineNum = 54;BA.debugLine="For Each rowPluviometro() As Object In resPluvio";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//for
this.state = 7;
group15 = _respluviometro.getField(false,"Rows" /*RemoteObject*/ );
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowPluviometro", _rowpluviometro);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index15 < groupLen15) {
this.state = 6;
_rowpluviometro = (group15.runMethod(false,"Get",index15));Debug.locals.put("rowPluviometro", _rowpluviometro);}
if (true) break;

case 14:
//C
this.state = 13;
index15++;
Debug.locals.put("rowPluviometro", _rowpluviometro);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 55;BA.debugLine="Dim cdgo_Plvmtro As String = rowPluviometro(0)";
Debug.ShouldStop(4194304);
_cdgo_plvmtro = BA.ObjectToString(_rowpluviometro.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("cdgo_Plvmtro", _cdgo_plvmtro);Debug.locals.put("cdgo_Plvmtro", _cdgo_plvmtro);
 BA.debugLineNum = 56;BA.debugLine="Dim Nombre_Plvmtro As String = rowPluviometro(1";
Debug.ShouldStop(8388608);
_nombre_plvmtro = BA.ObjectToString(_rowpluviometro.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Nombre_Plvmtro", _nombre_plvmtro);Debug.locals.put("Nombre_Plvmtro", _nombre_plvmtro);
 BA.debugLineNum = 57;BA.debugLine="Dim Nit_Plvmtro As String = rowPluviometro(2)";
Debug.ShouldStop(16777216);
_nit_plvmtro = BA.ObjectToString(_rowpluviometro.getArrayElement(false,BA.numberCast(int.class, 2)));Debug.locals.put("Nit_Plvmtro", _nit_plvmtro);Debug.locals.put("Nit_Plvmtro", _nit_plvmtro);
 BA.debugLineNum = 58;BA.debugLine="Dim Hda_Pvlmtro As String = rowPluviometro(3)";
Debug.ShouldStop(33554432);
_hda_pvlmtro = BA.ObjectToString(_rowpluviometro.getArrayElement(false,BA.numberCast(int.class, 3)));Debug.locals.put("Hda_Pvlmtro", _hda_pvlmtro);Debug.locals.put("Hda_Pvlmtro", _hda_pvlmtro);
 BA.debugLineNum = 61;BA.debugLine="Dim detailsMap As Map";
Debug.ShouldStop(268435456);
_detailsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("detailsMap", _detailsmap);
 BA.debugLineNum = 62;BA.debugLine="detailsMap.Initialize";
Debug.ShouldStop(536870912);
_detailsmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 63;BA.debugLine="detailsMap.Put(\"Nombre\", Nombre_Plvmtro)";
Debug.ShouldStop(1073741824);
_detailsmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((_nombre_plvmtro)));
 BA.debugLineNum = 64;BA.debugLine="detailsMap.Put(\"Nit\", Nit_Plvmtro)";
Debug.ShouldStop(-2147483648);
_detailsmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nit"))),(Object)((_nit_plvmtro)));
 BA.debugLineNum = 65;BA.debugLine="detailsMap.Put(\"Hda\", Hda_Pvlmtro)";
Debug.ShouldStop(1);
_detailsmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Hda"))),(Object)((_hda_pvlmtro)));
 BA.debugLineNum = 67;BA.debugLine="pluviometroMap.Put(cdgo_Plvmtro, detailsMap)";
Debug.ShouldStop(4);
__ref.getField(false,"_pluviometromap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_cdgo_plvmtro)),(Object)((_detailsmap.getObject())));
 BA.debugLineNum = 70;BA.debugLine="SD_xComboBoxPluviometro.Add(Nombre_Plvmtro, cdg";
Debug.ShouldStop(32);
__ref.getField(false,"_sd_xcomboboxpluviometro" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_nombre_plvmtro),(Object)((_cdgo_plvmtro)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("rowPluviometro", _rowpluviometro);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 73;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","216973861",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j2.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="j2.Release";
Debug.ShouldStop(1024);
_j2.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static void  _req_pluviometro_result(RemoteObject __ref,RemoteObject _respluviometro) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formprecipitacion","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 30;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Root = Root1";
Debug.ShouldStop(1073741824);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Button1_Click (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("button1_click")) { __ref.runUserSub(false, "formprecipitacion","button1_click", __ref); return;}
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
public ResumableSub_Button1_Click(b4a.example.ef.formprecipitacion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formprecipitacion parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,170);
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
 BA.debugLineNum = 171;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1024);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 172;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 175;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert.pluv";
Debug.ShouldStop(16384);
_cmd = __ref.runClassMethod (b4a.example.ef.formprecipitacion.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert.pluviometro")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(__ref.getField(true,"_selectedcdgo_plvmtro" /*RemoteObject*/ )),(__ref.getField(true,"_fecha" /*RemoteObject*/ )),(__ref.getField(true,"_textocapturado" /*RemoteObject*/ )),(__ref.getField(true,"_selectednit_plvmtro" /*RemoteObject*/ )),(__ref.getField(true,"_selectedhda_pvlmtro" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 178;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(131072);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 179;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formprecipitacion", "button1_click"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 182;BA.debugLine="Try";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 183;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 184;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 186;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","217563664",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
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
 BA.debugLineNum = 189;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","217563667",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
formprecipitacion._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",formprecipitacion._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
formprecipitacion._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",formprecipitacion._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
formprecipitacion._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",formprecipitacion._utilclass);
 //BA.debugLineNum = 5;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
formprecipitacion._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",formprecipitacion._rdclink);
 //BA.debugLineNum = 6;BA.debugLine="Private Label3 As Label";
formprecipitacion._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label3",formprecipitacion._label3);
 //BA.debugLineNum = 7;BA.debugLine="Private CustomListView1Geral As CustomListView";
formprecipitacion._customlistview1geral = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_customlistview1geral",formprecipitacion._customlistview1geral);
 //BA.debugLineNum = 8;BA.debugLine="Private Panel1geral As Panel";
formprecipitacion._panel1geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1geral",formprecipitacion._panel1geral);
 //BA.debugLineNum = 9;BA.debugLine="Private Label13Time As Label";
formprecipitacion._label13time = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label13time",formprecipitacion._label13time);
 //BA.debugLineNum = 10;BA.debugLine="Private SD_xComboBoxPluviometro As SD_xComboBox";
formprecipitacion._sd_xcomboboxpluviometro = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxpluviometro",formprecipitacion._sd_xcomboboxpluviometro);
 //BA.debugLineNum = 11;BA.debugLine="Private EditTextHoraFin As EditText";
formprecipitacion._edittexthorafin = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittexthorafin",formprecipitacion._edittexthorafin);
 //BA.debugLineNum = 12;BA.debugLine="Private Panel12 As Panel";
formprecipitacion._panel12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel12",formprecipitacion._panel12);
 //BA.debugLineNum = 13;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
formprecipitacion._as_datepicker1 = RemoteObject.createNew ("b4a.example.ef.as_datepicker");__ref.setField("_as_datepicker1",formprecipitacion._as_datepicker1);
 //BA.debugLineNum = 14;BA.debugLine="Dim fecha As String";
formprecipitacion._fecha = RemoteObject.createImmutable("");__ref.setField("_fecha",formprecipitacion._fecha);
 //BA.debugLineNum = 16;BA.debugLine="Dim selectedCdgo_Plvmtro As String";
formprecipitacion._selectedcdgo_plvmtro = RemoteObject.createImmutable("");__ref.setField("_selectedcdgo_plvmtro",formprecipitacion._selectedcdgo_plvmtro);
 //BA.debugLineNum = 17;BA.debugLine="Dim selectedNombre_Plvmtro As String";
formprecipitacion._selectednombre_plvmtro = RemoteObject.createImmutable("");__ref.setField("_selectednombre_plvmtro",formprecipitacion._selectednombre_plvmtro);
 //BA.debugLineNum = 18;BA.debugLine="Dim selectedNit_Plvmtro As String";
formprecipitacion._selectednit_plvmtro = RemoteObject.createImmutable("");__ref.setField("_selectednit_plvmtro",formprecipitacion._selectednit_plvmtro);
 //BA.debugLineNum = 19;BA.debugLine="Dim selectedHda_Pvlmtro As String";
formprecipitacion._selectedhda_pvlmtro = RemoteObject.createImmutable("");__ref.setField("_selectedhda_pvlmtro",formprecipitacion._selectedhda_pvlmtro);
 //BA.debugLineNum = 20;BA.debugLine="Dim textoCapturado As String";
formprecipitacion._textocapturado = RemoteObject.createImmutable("");__ref.setField("_textocapturado",formprecipitacion._textocapturado);
 //BA.debugLineNum = 21;BA.debugLine="Dim pluviometroMap As Map";
formprecipitacion._pluviometromap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_pluviometromap",formprecipitacion._pluviometromap);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formprecipitacion","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 91;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(134217728);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 93;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(268435456);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 94;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(536870912);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 95;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 96;BA.debugLine="Return cmd";
Debug.ShouldStop(-2147483648);
if (true) return _cmd;
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("CreateItem (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "formprecipitacion","createitem", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 80;BA.debugLine="Private Sub CreateItem As Panel";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(131072);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 83;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 92%Y)";
Debug.ShouldStop(262144);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formprecipitacion.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formprecipitacion.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 92)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 85;BA.debugLine="panel.LoadLayout(\"addPrecipitacionUI\")";
Debug.ShouldStop(1048576);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("addPrecipitacionUI")),__ref.getField(false, "ba"));
 BA.debugLineNum = 86;BA.debugLine="panel.Height=Panel1geral.Height";
Debug.ShouldStop(2097152);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel1geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 88;BA.debugLine="Return panel";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthorafin_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHoraFin_TextChanged (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("edittexthorafin_textchanged")) { return __ref.runUserSub(false, "formprecipitacion","edittexthorafin_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 157;BA.debugLine="Private Sub EditTextHoraFin_TextChanged (Old As St";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Log(\"Texto anterior: \" & Old)";
Debug.ShouldStop(536870912);
formprecipitacion.__c.runVoidMethod ("LogImpl","217498113",RemoteObject.concat(RemoteObject.createImmutable("Texto anterior: "),_old),0);
 BA.debugLineNum = 159;BA.debugLine="Log(\"Texto nuevo: \" & New)";
Debug.ShouldStop(1073741824);
formprecipitacion.__c.runVoidMethod ("LogImpl","217498114",RemoteObject.concat(RemoteObject.createImmutable("Texto nuevo: "),_new),0);
 BA.debugLineNum = 165;BA.debugLine="textoCapturado = New";
Debug.ShouldStop(16);
__ref.setField ("_textocapturado" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 166;BA.debugLine="Log(\"El texto es mayor de 5 caracteres: \" & texto";
Debug.ShouldStop(32);
formprecipitacion.__c.runVoidMethod ("LogImpl","217498121",RemoteObject.concat(RemoteObject.createImmutable("El texto es mayor de 5 caracteres: "),__ref.getField(true,"_textocapturado" /*RemoteObject*/ )),0);
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Initialize (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formprecipitacion","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Return Me";
Debug.ShouldStop(33554432);
if (true) return __ref;
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Label13Time_Click (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("label13time_click")) { return __ref.runUserSub(false, "formprecipitacion","label13time_click", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Private Sub Label13Time_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Panel12.Visible = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formprecipitacion.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Label1Back_Click (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("label1back_click")) { return __ref.runUserSub(false, "formprecipitacion","label1back_click", __ref);}
 BA.debugLineNum = 100;BA.debugLine="Private Sub Label1Back_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(16);
formprecipitacion._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Label2Save_Click (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("label2save_click")) { return __ref.runUserSub(false, "formprecipitacion","label2save_click", __ref);}
 BA.debugLineNum = 104;BA.debugLine="Private Sub Label2Save_Click";
Debug.ShouldStop(128);
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
public static RemoteObject  _sd_xcomboboxpluviometro_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxPluviometro_ItemClick (formprecipitacion) ","formprecipitacion",12,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("sd_xcomboboxpluviometro_itemclick")) { return __ref.runUserSub(false, "formprecipitacion","sd_xcomboboxpluviometro_itemclick", __ref, _position, _value);}
RemoteObject _detailsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 112;BA.debugLine="Private Sub SD_xComboBoxPluviometro_ItemClick (Pos";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Log(\"VALOR COMBOBOX: \" & Value)";
Debug.ShouldStop(65536);
formprecipitacion.__c.runVoidMethod ("LogImpl","217367041",RemoteObject.concat(RemoteObject.createImmutable("VALOR COMBOBOX: "),_value),0);
 BA.debugLineNum = 115;BA.debugLine="If pluviometroMap.ContainsKey(Value) Then";
Debug.ShouldStop(262144);
if (__ref.getField(false,"_pluviometromap" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)(_value)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 116;BA.debugLine="Dim detailsMap As Map = pluviometroMap.Get(Value";
Debug.ShouldStop(524288);
_detailsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_detailsmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_pluviometromap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_value)));Debug.locals.put("detailsMap", _detailsmap);Debug.locals.put("detailsMap", _detailsmap);
 BA.debugLineNum = 118;BA.debugLine="selectedCdgo_Plvmtro = Value";
Debug.ShouldStop(2097152);
__ref.setField ("_selectedcdgo_plvmtro" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 119;BA.debugLine="selectedNombre_Plvmtro = detailsMap.Get(\"Nombre\"";
Debug.ShouldStop(4194304);
__ref.setField ("_selectednombre_plvmtro" /*RemoteObject*/ ,BA.ObjectToString(_detailsmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 BA.debugLineNum = 120;BA.debugLine="selectedNit_Plvmtro = detailsMap.Get(\"Nit\")";
Debug.ShouldStop(8388608);
__ref.setField ("_selectednit_plvmtro" /*RemoteObject*/ ,BA.ObjectToString(_detailsmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nit"))))));
 BA.debugLineNum = 121;BA.debugLine="selectedHda_Pvlmtro = detailsMap.Get(\"Hda\")";
Debug.ShouldStop(16777216);
__ref.setField ("_selectedhda_pvlmtro" /*RemoteObject*/ ,BA.ObjectToString(_detailsmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Hda"))))));
 BA.debugLineNum = 124;BA.debugLine="Log(\"Código: \" & selectedCdgo_Plvmtro)";
Debug.ShouldStop(134217728);
formprecipitacion.__c.runVoidMethod ("LogImpl","217367052",RemoteObject.concat(RemoteObject.createImmutable("Código: "),__ref.getField(true,"_selectedcdgo_plvmtro" /*RemoteObject*/ )),0);
 BA.debugLineNum = 125;BA.debugLine="Log(\"Nombre: \" & selectedNombre_Plvmtro)";
Debug.ShouldStop(268435456);
formprecipitacion.__c.runVoidMethod ("LogImpl","217367053",RemoteObject.concat(RemoteObject.createImmutable("Nombre: "),__ref.getField(true,"_selectednombre_plvmtro" /*RemoteObject*/ )),0);
 BA.debugLineNum = 126;BA.debugLine="Log(\"NIT: \" & selectedNit_Plvmtro)";
Debug.ShouldStop(536870912);
formprecipitacion.__c.runVoidMethod ("LogImpl","217367054",RemoteObject.concat(RemoteObject.createImmutable("NIT: "),__ref.getField(true,"_selectednit_plvmtro" /*RemoteObject*/ )),0);
 BA.debugLineNum = 127;BA.debugLine="Log(\"Hacienda: \" & selectedHda_Pvlmtro)";
Debug.ShouldStop(1073741824);
formprecipitacion.__c.runVoidMethod ("LogImpl","217367055",RemoteObject.concat(RemoteObject.createImmutable("Hacienda: "),__ref.getField(true,"_selectedhda_pvlmtro" /*RemoteObject*/ )),0);
 }else {
 BA.debugLineNum = 129;BA.debugLine="Log(\"Error: No se encontraron detalles para el c";
Debug.ShouldStop(1);
formprecipitacion.__c.runVoidMethod ("LogImpl","217367057",RemoteObject.createImmutable("Error: No se encontraron detalles para el código seleccionado."),0);
 };
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}