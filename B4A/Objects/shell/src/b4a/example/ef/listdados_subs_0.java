package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class listdados_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "listdados","b4xpage_appear", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Sub B4XPage_Appear";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="listDadosMaquina";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.listdados.class, "_listdadosmaquina" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("B4XPage_Created (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "listdados","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 35;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Root = Root1";
Debug.ShouldStop(8);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 37;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
Debug.ShouldStop(32);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(listdados.__c.getField(false,"Colors").getField(true,"White")),(Object)(listdados.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 39;BA.debugLine="Root.LoadLayout(\"ListPerson\")";
Debug.ShouldStop(64);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListPerson")),__ref.getField(false, "ba"));
 BA.debugLineNum = 40;BA.debugLine="Label3.Text=\"List dados\"";
Debug.ShouldStop(128);
__ref.getField(false,"_label3" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("List dados"));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _button1addisumo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1AddIsumo_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("button1addisumo_click")) { __ref.runUserSub(false, "listdados","button1addisumo_click", __ref); return;}
ResumableSub_Button1AddIsumo_Click rsub = new ResumableSub_Button1AddIsumo_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button1AddIsumo_Click extends BA.ResumableSub {
public ResumableSub_Button1AddIsumo_Click(b4a.example.ef.listdados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.listdados parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1AddIsumo_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,322);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 323;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
Debug.ShouldStop(4);
parent._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("form")))));
 BA.debugLineNum = 324;BA.debugLine="Sleep(90)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listdados", "button1addisumo_click"),BA.numberCast(int.class, 90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 325;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"new\"";
Debug.ShouldStop(16);
((parent._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("form"))))).setField ("_tipo" /*RemoteObject*/ ,BA.ObjectToString("new"));
 BA.debugLineNum = 326;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Rnd(0";
Debug.ShouldStop(32);
((parent._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("form"))))).setField ("_idmaquina" /*RemoteObject*/ ,parent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0001)),(Object)(BA.numberCast(int.class, 9999))));
 BA.debugLineNum = 327;BA.debugLine="B4XPages.ShowPage(\"Form\")";
Debug.ShouldStop(64);
parent._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Form")));
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static void  _button1agendar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1agendar_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("button1agendar_click")) { __ref.runUserSub(false, "listdados","button1agendar_click", __ref); return;}
ResumableSub_Button1agendar_Click rsub = new ResumableSub_Button1agendar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button1agendar_Click extends BA.ResumableSub {
public ResumableSub_Button1agendar_Click(b4a.example.ef.listdados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.listdados parent;
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1agendar_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,234);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 235;BA.debugLine="Button1agendar=	Sender";
Debug.ShouldStop(1024);
__ref.getField(false,"_button1agendar" /*RemoteObject*/ ).setObject (parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 236;BA.debugLine="Log(Button1agendar.Tag)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","322478850",BA.ObjectToString(__ref.getField(false,"_button1agendar" /*RemoteObject*/ ).runMethod(false,"getTag")),0);
 BA.debugLineNum = 238;BA.debugLine="Dim	id As Int=Button1agendar.Tag";
Debug.ShouldStop(8192);
_id = BA.numberCast(int.class, __ref.getField(false,"_button1agendar" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 240;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
Debug.ShouldStop(32768);
_sf = __ref.getField(false,"_cd" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 241;BA.debugLine="cd.SetSize(100%x,40%y)";
Debug.ShouldStop(65536);
__ref.getField(false,"_cd" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 242;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listdados", "button1agendar_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 243;BA.debugLine="DialogPanel.LoadLayout(\"dialogAgenda\")";
Debug.ShouldStop(262144);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialogAgenda")),__ref.getField(false, "ba"));
 BA.debugLineNum = 244;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
Debug.ShouldStop(524288);
__ref.getField(false,"_label20desc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_label20desc" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("{id}")),(Object)(BA.NumberToString(_id)))));
 BA.debugLineNum = 245;BA.debugLine="EditText1Area.Color=Colors.Transparent";
Debug.ShouldStop(1048576);
__ref.getField(false,"_edittext1area" /*RemoteObject*/ ).runVoidMethod ("setColor",parent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 246;BA.debugLine="DialogPanel.Color=Colors.Transparent";
Debug.ShouldStop(2097152);
_dialogpanel.runVoidMethod ("setColor",parent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 247;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listdados", "button1agendar_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 248;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 249;BA.debugLine="Log(\"DADOS:\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","322478863",RemoteObject.createImmutable("DADOS:"),0);
 BA.debugLineNum = 251;BA.debugLine="Log(Label3Inicial.Text)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","322478865",__ref.getField(false,"_label3inicial" /*RemoteObject*/ ).runMethod(true,"getText"),0);
 BA.debugLineNum = 252;BA.debugLine="Log(Label4Final.Text)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","322478866",__ref.getField(false,"_label4final" /*RemoteObject*/ ).runMethod(true,"getText"),0);
 BA.debugLineNum = 253;BA.debugLine="Log(EditText1Area.Text)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","322478867",__ref.getField(false,"_edittext1area" /*RemoteObject*/ ).runMethod(true,"getText"),0);
 BA.debugLineNum = 254;BA.debugLine="Log(\"=======================\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","322478868",RemoteObject.createImmutable("======================="),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static void  _dialog_ready(RemoteObject __ref,RemoteObject _dialogpanel) throws Exception{
}
public static void  _dialog_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _button1agendarpopuo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1agendarPOPuo_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("button1agendarpopuo_click")) { return __ref.runUserSub(false, "listdados","button1agendarpopuo_click", __ref);}
 BA.debugLineNum = 304;BA.debugLine="Private Sub Button1agendarPOPuo_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="cd.CloseDialog(DialogResponse.POSITIVE)";
Debug.ShouldStop(65536);
__ref.getField(false,"_cd" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(listdados.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1canvel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1Canvel_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,300);
if (RapidSub.canDelegate("button1canvel_click")) { return __ref.runUserSub(false, "listdados","button1canvel_click", __ref);}
 BA.debugLineNum = 300;BA.debugLine="Private Sub Button1Canvel_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 301;BA.debugLine="cd.CloseDialog(DialogResponse.NEGATIVE)";
Debug.ShouldStop(4096);
__ref.getField(false,"_cd" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(listdados.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")));
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _button1check_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1Check_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("button1check_click")) { __ref.runUserSub(false, "listdados","button1check_click", __ref); return;}
ResumableSub_Button1Check_Click rsub = new ResumableSub_Button1Check_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button1Check_Click extends BA.ResumableSub {
public ResumableSub_Button1Check_Click(b4a.example.ef.listdados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.listdados parent;
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1Check_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,210);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 211;BA.debugLine="Button1Check=	Sender";
Debug.ShouldStop(262144);
__ref.getField(false,"_button1check" /*RemoteObject*/ ).setObject (parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 212;BA.debugLine="Log(Button1Check.Tag)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","322413314",BA.ObjectToString(__ref.getField(false,"_button1check" /*RemoteObject*/ ).runMethod(false,"getTag")),0);
 BA.debugLineNum = 213;BA.debugLine="Dim	id As Int=Button1Check.Tag";
Debug.ShouldStop(1048576);
_id = BA.numberCast(int.class, __ref.getField(false,"_button1check" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 215;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
Debug.ShouldStop(4194304);
_sf = __ref.getField(false,"_cd" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 216;BA.debugLine="cd.SetSize(100%x,30%y)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_cd" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 217;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listdados", "button1check_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 218;BA.debugLine="DialogPanel.LoadLayout(\"DialogDone\")";
Debug.ShouldStop(33554432);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DialogDone")),__ref.getField(false, "ba"));
 BA.debugLineNum = 219;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
Debug.ShouldStop(67108864);
__ref.getField(false,"_label20desc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_label20desc" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("{id}")),(Object)(BA.NumberToString(_id)))));
 BA.debugLineNum = 221;BA.debugLine="DialogPanel.Color=Colors.Transparent";
Debug.ShouldStop(268435456);
_dialogpanel.runVoidMethod ("setColor",parent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 222;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listdados", "button1check_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 223;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 224;BA.debugLine="Log(\"DADOS:\")";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","322413326",RemoteObject.createImmutable("DADOS:"),0);
 BA.debugLineNum = 226;BA.debugLine="Log(Label3Inicial.Text)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","322413328",__ref.getField(false,"_label3inicial" /*RemoteObject*/ ).runMethod(true,"getText"),0);
 BA.debugLineNum = 227;BA.debugLine="Log(Label4Final.Text)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","322413329",__ref.getField(false,"_label4final" /*RemoteObject*/ ).runMethod(true,"getText"),0);
 BA.debugLineNum = 229;BA.debugLine="Log(\"=======================\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","322413331",RemoteObject.createImmutable("======================="),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static void  _button2del_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button2Del_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("button2del_click")) { __ref.runUserSub(false, "listdados","button2del_click", __ref); return;}
ResumableSub_Button2Del_Click rsub = new ResumableSub_Button2Del_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button2Del_Click extends BA.ResumableSub {
public ResumableSub_Button2Del_Click(b4a.example.ef.listdados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.listdados parent;
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button2Del_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,171);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 172;BA.debugLine="Button2Del=	Sender";
Debug.ShouldStop(2048);
__ref.getField(false,"_button2del" /*RemoteObject*/ ).setObject (parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 173;BA.debugLine="Log(Button2Del.Tag)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","322347778",BA.ObjectToString(__ref.getField(false,"_button2del" /*RemoteObject*/ ).runMethod(false,"getTag")),0);
 BA.debugLineNum = 174;BA.debugLine="Dim id As Int=Button2Del.Tag";
Debug.ShouldStop(8192);
_id = BA.numberCast(int.class, __ref.getField(false,"_button2del" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 175;BA.debugLine="Button1agendar=	Sender";
Debug.ShouldStop(16384);
__ref.getField(false,"_button1agendar" /*RemoteObject*/ ).setObject (parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 176;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
Debug.ShouldStop(32768);
_sf = __ref.getField(false,"_cd" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 177;BA.debugLine="cd.SetSize(100%x,35%y)";
Debug.ShouldStop(65536);
__ref.getField(false,"_cd" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 178;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listdados", "button2del_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 179;BA.debugLine="DialogPanel.LoadLayout(\"DialogDelete\")";
Debug.ShouldStop(262144);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DialogDelete")),__ref.getField(false, "ba"));
 BA.debugLineNum = 181;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
Debug.ShouldStop(1048576);
__ref.getField(false,"_label20desc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_label20desc" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("{id}")),(Object)(BA.NumberToString(_id)))));
 BA.debugLineNum = 182;BA.debugLine="EditText1TextArea.Color=Colors.Transparent";
Debug.ShouldStop(2097152);
__ref.getField(false,"_edittext1textarea" /*RemoteObject*/ ).runVoidMethod ("setColor",parent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 183;BA.debugLine="DialogPanel.Color=Colors.Transparent";
Debug.ShouldStop(4194304);
_dialogpanel.runVoidMethod ("setColor",parent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 184;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listdados", "button2del_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 185;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 186;BA.debugLine="Log(\"DADOS:\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","322347791",RemoteObject.createImmutable("DADOS:"),0);
 BA.debugLineNum = 187;BA.debugLine="Log(EditText1TextArea.Text)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","322347792",__ref.getField(false,"_edittext1textarea" /*RemoteObject*/ ).runMethod(true,"getText"),0);
 BA.debugLineNum = 188;BA.debugLine="Log(\"=======================\")";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","322347793",RemoteObject.createImmutable("======================="),0);
 BA.debugLineNum = 189;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from dados wh";
Debug.ShouldStop(268435456);
parent._starter._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE from dados where Consecutivo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id)})))));
 BA.debugLineNum = 190;BA.debugLine="Sleep(300)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listdados", "button2del_click"),BA.numberCast(int.class, 300));
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
 BA.debugLineNum = 191;BA.debugLine="listDadso";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.ef.listdados.class, "_listdadso" /*RemoteObject*/ );
 BA.debugLineNum = 192;BA.debugLine="ToastMessageShow(Button2Del.Tag&\" DELETED\",False";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_button2del" /*RemoteObject*/ ).runMethod(false,"getTag"),RemoteObject.createImmutable(" DELETED")))),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
listdados._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",listdados._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
listdados._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",listdados._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
listdados._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",listdados._utilclass);
 //BA.debugLineNum = 5;BA.debugLine="Dim xui As XUI";
listdados._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",listdados._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private CLV_Persons As CustomListView";
listdados._clv_persons = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clv_persons",listdados._clv_persons);
 //BA.debugLineNum = 10;BA.debugLine="Private Label3 As Label";
listdados._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label3",listdados._label3);
 //BA.debugLineNum = 11;BA.debugLine="Private Label1Details As Label";
listdados._label1details = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1details",listdados._label1details);
 //BA.debugLineNum = 13;BA.debugLine="Private Label1Details2 As Label";
listdados._label1details2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1details2",listdados._label1details2);
 //BA.debugLineNum = 14;BA.debugLine="Private Button1agendar As Button";
listdados._button1agendar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1agendar",listdados._button1agendar);
 //BA.debugLineNum = 15;BA.debugLine="Private Button1Check As Button";
listdados._button1check = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1check",listdados._button1check);
 //BA.debugLineNum = 16;BA.debugLine="Private Button2Del As Button";
listdados._button2del = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button2del",listdados._button2del);
 //BA.debugLineNum = 17;BA.debugLine="Private Label4Final As Label";
listdados._label4final = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label4final",listdados._label4final);
 //BA.debugLineNum = 18;BA.debugLine="Private Label3Inicial As Label";
listdados._label3inicial = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label3inicial",listdados._label3inicial);
 //BA.debugLineNum = 19;BA.debugLine="Dim cd As CustomLayoutDialog";
listdados._cd = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog");__ref.setField("_cd",listdados._cd);
 //BA.debugLineNum = 20;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
listdados._datepicker = RemoteObject.createNew ("lib.intellvold.datepicker.DatePicker");__ref.setField("_datepicker",listdados._datepicker);
 //BA.debugLineNum = 21;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
listdados._mycalendar = RemoteObject.createNew ("lib.intellvold.datepicker.clander");__ref.setField("_mycalendar",listdados._mycalendar);
 //BA.debugLineNum = 22;BA.debugLine="Private EditText1Area As EditText";
listdados._edittext1area = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1area",listdados._edittext1area);
 //BA.debugLineNum = 23;BA.debugLine="Private EditText1TextArea As EditText";
listdados._edittext1textarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1textarea",listdados._edittext1textarea);
 //BA.debugLineNum = 24;BA.debugLine="Private Label20Desc As Label";
listdados._label20desc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label20desc",listdados._label20desc);
 //BA.debugLineNum = 25;BA.debugLine="Private Label2 As Label";
listdados._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2",listdados._label2);
 //BA.debugLineNum = 26;BA.debugLine="Private Label1IdMaquina As Label";
listdados._label1idmaquina = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1idmaquina",listdados._label1idmaquina);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _clv_persons_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV_Persons_ItemClick (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,309);
if (RapidSub.canDelegate("clv_persons_itemclick")) { __ref.runUserSub(false, "listdados","clv_persons_itemclick", __ref, _index, _value); return;}
ResumableSub_CLV_Persons_ItemClick rsub = new ResumableSub_CLV_Persons_ItemClick(null,__ref,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CLV_Persons_ItemClick extends BA.ResumableSub {
public ResumableSub_CLV_Persons_ItemClick(b4a.example.ef.listdados parent,RemoteObject __ref,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.listdados parent;
RemoteObject _index;
RemoteObject _value;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CLV_Persons_ItemClick (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,309);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 310;BA.debugLine="Log(Value)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","323003137",BA.ObjectToString(_value),0);
 BA.debugLineNum = 311;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
Debug.ShouldStop(4194304);
parent._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("form")))));
 BA.debugLineNum = 312;BA.debugLine="Sleep(90)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listdados", "clv_persons_itemclick"),BA.numberCast(int.class, 90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 313;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"update\"";
Debug.ShouldStop(16777216);
((parent._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("form"))))).setField ("_tipo" /*RemoteObject*/ ,BA.ObjectToString("update"));
 BA.debugLineNum = 314;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Value";
Debug.ShouldStop(33554432);
((parent._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("form"))))).setField ("_idmaquina" /*RemoteObject*/ ,BA.numberCast(int.class, _value));
 BA.debugLineNum = 315;BA.debugLine="B4XPages.ShowPage(\"Form\")";
Debug.ShouldStop(67108864);
parent._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Form")));
 BA.debugLineNum = 316;BA.debugLine="End Sub";
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
public static RemoteObject  _configtime(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("configTime (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("configtime")) { return __ref.runUserSub(false, "listdados","configtime", __ref, _tag);}
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 270;BA.debugLine="Sub configTime(tag As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 272;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
Debug.ShouldStop(32768);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_tag),(Object)(BA.numberCast(int.class, 2022)),(Object)(listdados.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(listdados.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(listdados.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(listdados.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 273;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
Debug.ShouldStop(65536);
__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dd.mm.yyyy")),(Object)(__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getField(false,"PRC")),(Object)(RemoteObject.createImmutable("2.02.1990")));
 BA.debugLineNum = 274;BA.debugLine="Datepicker.SetThemeDark";
Debug.ShouldStop(131072);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetThemeDark");
 BA.debugLineNum = 275;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
Debug.ShouldStop(262144);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetMinDate",(Object)((__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 276;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
Debug.ShouldStop(524288);
__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dd.mm.yyyy")),(Object)(__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getField(false,"PRC")),(Object)(RemoteObject.createImmutable("2.02.2030")));
 BA.debugLineNum = 277;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetMaxDate",(Object)((__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 278;BA.debugLine="Datepicker.CancelColor = Colors.White";
Debug.ShouldStop(2097152);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setCancelColor",listdados.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 279;BA.debugLine="Datepicker.OkColor = Colors.White";
Debug.ShouldStop(4194304);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setOkColor",listdados.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 280;BA.debugLine="Datepicker.Title = \"Selecione\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setTitle",BA.ObjectToString("Selecione"));
 BA.debugLineNum = 281;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setCancelText",BA.ObjectToString("Cancelar"));
 BA.debugLineNum = 282;BA.debugLine="Datepicker.OkText = \"Ok\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setOkText",BA.ObjectToString("Ok"));
 BA.debugLineNum = 283;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetOnCancel",(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 284;BA.debugLine="Datepicker.show2(\"iki\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("show2",(Object)(RemoteObject.createImmutable("iki")));
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject __ref,RemoteObject _consecutivo,RemoteObject _fecha_programa,RemoteObject _nit,RemoteObject _hacienda,RemoteObject _lote,RemoteObject _labor) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "listdados","createitem", __ref, _consecutivo, _fecha_programa, _nit, _hacienda, _lote, _labor);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
Debug.locals.put("Consecutivo", _consecutivo);
Debug.locals.put("Fecha_programa", _fecha_programa);
Debug.locals.put("NIT", _nit);
Debug.locals.put("Hacienda", _hacienda);
Debug.locals.put("Lote", _lote);
Debug.locals.put("labor", _labor);
 BA.debugLineNum = 112;BA.debugLine="Private Sub CreateItem(Consecutivo,Fecha_programa,";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="Dim Panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(131072);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Panel", _panel);Debug.locals.put("Panel", _panel);
 BA.debugLineNum = 116;BA.debugLine="Panel.SetLayoutAnimated(1, 0, 0, 100%x, 140dip)";
Debug.ShouldStop(524288);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(listdados.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(listdados.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))));
 BA.debugLineNum = 118;BA.debugLine="Panel.LoadLayout(\"cardDados\")";
Debug.ShouldStop(2097152);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("cardDados")),__ref.getField(false, "ba"));
 BA.debugLineNum = 125;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(268435456);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 126;BA.debugLine="cs.Initialize";
Debug.ShouldStop(536870912);
_cs.runVoidMethod ("Initialize");
 BA.debugLineNum = 129;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
Debug.ShouldStop(1);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Consecutivo: ")))).runMethod(false,"Pop").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Gray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_consecutivo,listdados.__c.getField(true,"CRLF"))))).runVoidMethod ("Pop");
 BA.debugLineNum = 132;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
Debug.ShouldStop(8);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Fecha programa: ")))).runMethod(false,"Pop").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Gray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_fecha_programa,listdados.__c.getField(true,"CRLF"))))).runVoidMethod ("Pop");
 BA.debugLineNum = 135;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"NIT: \").Pop.C";
Debug.ShouldStop(64);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("NIT: ")))).runMethod(false,"Pop").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Gray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_nit,listdados.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 139;BA.debugLine="Label1Details.Text = cs";
Debug.ShouldStop(1024);
__ref.getField(false,"_label1details" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cs.getObject()));
 BA.debugLineNum = 141;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(4096);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 142;BA.debugLine="cs.Initialize";
Debug.ShouldStop(8192);
_cs.runVoidMethod ("Initialize");
 BA.debugLineNum = 145;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
Debug.ShouldStop(65536);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Hacienda: ")))).runMethod(false,"Pop").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Gray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_hacienda,listdados.__c.getField(true,"CRLF"))))).runVoidMethod ("Pop");
 BA.debugLineNum = 148;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Lote: \").Pop.";
Debug.ShouldStop(524288);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Lote: ")))).runMethod(false,"Pop").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Gray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_lote,listdados.__c.getField(true,"CRLF"))))).runVoidMethod ("Pop");
 BA.debugLineNum = 150;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
Debug.ShouldStop(2097152);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Labor: ")))).runMethod(false,"Pop").runMethod(false,"Color",(Object)(listdados.__c.getField(false,"Colors").getField(true,"Gray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_labor,listdados.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 153;BA.debugLine="Label1Details2.Text = cs";
Debug.ShouldStop(16777216);
__ref.getField(false,"_label1details2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cs.getObject()));
 BA.debugLineNum = 155;BA.debugLine="Button1agendar.Tag=Consecutivo";
Debug.ShouldStop(67108864);
__ref.getField(false,"_button1agendar" /*RemoteObject*/ ).runMethod(false,"setTag",(_consecutivo));
 BA.debugLineNum = 156;BA.debugLine="Button1Check.Tag=Consecutivo";
Debug.ShouldStop(134217728);
__ref.getField(false,"_button1check" /*RemoteObject*/ ).runMethod(false,"setTag",(_consecutivo));
 BA.debugLineNum = 157;BA.debugLine="Button2Del.Tag=Consecutivo";
Debug.ShouldStop(268435456);
__ref.getField(false,"_button2del" /*RemoteObject*/ ).runMethod(false,"setTag",(_consecutivo));
 BA.debugLineNum = 158;BA.debugLine="Return Panel";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitemmaquinas(RemoteObject __ref,RemoteObject _hacienda,RemoteObject _lote,RemoteObject _labor) throws Exception{
try {
		Debug.PushSubsStack("CreateItemMaquinas (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("createitemmaquinas")) { return __ref.runUserSub(false, "listdados","createitemmaquinas", __ref, _hacienda, _lote, _labor);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _legend = RemoteObject.createImmutable("");
Debug.locals.put("Hacienda", _hacienda);
Debug.locals.put("Lote", _lote);
Debug.locals.put("labor", _labor);
 BA.debugLineNum = 97;BA.debugLine="Private Sub CreateItemMaquinas (Hacienda As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 99;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 100;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 70dip)";
Debug.ShouldStop(8);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(listdados.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(listdados.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))));
 BA.debugLineNum = 101;BA.debugLine="panel.LoadLayout(\"cardMaquina\")";
Debug.ShouldStop(16);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("cardMaquina")),__ref.getField(false, "ba"));
 BA.debugLineNum = 102;BA.debugLine="Dim legend As String=Label1IdMaquina.Text";
Debug.ShouldStop(32);
_legend = __ref.getField(false,"_label1idmaquina" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("legend", _legend);Debug.locals.put("legend", _legend);
 BA.debugLineNum = 103;BA.debugLine="legend=	legend.Replace(\"{Hacienda}\",Hacienda)";
Debug.ShouldStop(64);
_legend = _legend.runMethod(true,"replace",(Object)(BA.ObjectToString("{Hacienda}")),(Object)(_hacienda));Debug.locals.put("legend", _legend);
 BA.debugLineNum = 104;BA.debugLine="legend=	legend.Replace(\"{Lote}\",Lote)";
Debug.ShouldStop(128);
_legend = _legend.runMethod(true,"replace",(Object)(BA.ObjectToString("{Lote}")),(Object)(_lote));Debug.locals.put("legend", _legend);
 BA.debugLineNum = 105;BA.debugLine="legend=	legend.Replace(\"{labor}\",labor)";
Debug.ShouldStop(256);
_legend = _legend.runMethod(true,"replace",(Object)(BA.ObjectToString("{labor}")),(Object)(_labor));Debug.locals.put("legend", _legend);
 BA.debugLineNum = 106;BA.debugLine="Label1IdMaquina.Text=legend";
Debug.ShouldStop(512);
__ref.getField(false,"_label1idmaquina" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_legend));
 BA.debugLineNum = 107;BA.debugLine="Return panel";
Debug.ShouldStop(1024);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Initialize (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "listdados","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Return Me";
Debug.ShouldStop(1073741824);
if (true) return __ref;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label1_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("label1_click")) { return __ref.runUserSub(false, "listdados","label1_click", __ref);}
 BA.debugLineNum = 167;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(128);
listdados._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Label1Back_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("label1back_click")) { return __ref.runUserSub(false, "listdados","label1back_click", __ref);}
 BA.debugLineNum = 330;BA.debugLine="Private Sub Label1Back_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(1024);
listdados._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("label2_click")) { return __ref.runUserSub(false, "listdados","label2_click", __ref);}
 BA.debugLineNum = 318;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="Button1AddIsumo_Click";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.ef.listdados.class, "_button1addisumo_click" /*void*/ );
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label3inicial_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label3Inicial_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("label3inicial_click")) { return __ref.runUserSub(false, "listdados","label3inicial_click", __ref);}
 BA.debugLineNum = 259;BA.debugLine="Private Sub Label3Inicial_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="configTime(\"TimeInicio\")";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.ef.listdados.class, "_configtime" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("TimeInicio")));
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label4final_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label4Final_Click (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("label4final_click")) { return __ref.runUserSub(false, "listdados","label4final_click", __ref);}
 BA.debugLineNum = 264;BA.debugLine="Private Sub Label4Final_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="configTime(\"TimeFim\")";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.ef.listdados.class, "_configtime" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("TimeFim")));
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listdadosmaquina(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listDadosMaquina (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("listdadosmaquina")) { return __ref.runUserSub(false, "listdados","listdadosmaquina", __ref);}
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _hacienda = RemoteObject.createImmutable("");
RemoteObject _lote = RemoteObject.createImmutable("");
RemoteObject _labor = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 69;BA.debugLine="Sub listDadosMaquina";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="CLV_Persons.Clear";
Debug.ShouldStop(32);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 71;BA.debugLine="Label2.Text=Chr(0xE145)";
Debug.ShouldStop(64);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(listdados.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe145))))));
 BA.debugLineNum = 72;BA.debugLine="Label3.Text=\"Labores de Campo\"";
Debug.ShouldStop(128);
__ref.getField(false,"_label3" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Labores de Campo"));
 BA.debugLineNum = 73;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(256);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 74;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM ma";
Debug.ShouldStop(512);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), listdados._starter._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM maquina"))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 75;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(1024);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 76;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(2048);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 77;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
Debug.ShouldStop(4096);
listdados.__c.runVoidMethod ("LogImpl","322085640",RemoteObject.concat(RemoteObject.createImmutable("=====Maquinas #"),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("=====")),0);
 BA.debugLineNum = 78;BA.debugLine="Log(Cursor.GetString(\"id\"))";
Debug.ShouldStop(8192);
listdados.__c.runVoidMethod ("LogImpl","322085641",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))),0);
 BA.debugLineNum = 80;BA.debugLine="Dim Hacienda As String=Cursor.GetString(\"haciend";
Debug.ShouldStop(32768);
_hacienda = _cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("hacienda")));Debug.locals.put("Hacienda", _hacienda);Debug.locals.put("Hacienda", _hacienda);
 BA.debugLineNum = 81;BA.debugLine="Dim Lote As String=Cursor.GetString(\"Lote\")";
Debug.ShouldStop(65536);
_lote = _cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Lote")));Debug.locals.put("Lote", _lote);Debug.locals.put("Lote", _lote);
 BA.debugLineNum = 82;BA.debugLine="Dim labor As String=Cursor.GetString(\"labor\")";
Debug.ShouldStop(131072);
_labor = _cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("labor")));Debug.locals.put("labor", _labor);Debug.locals.put("labor", _labor);
 BA.debugLineNum = 83;BA.debugLine="CLV_Persons.Add(CreateItemMaquinas(Hacienda,Lote";
Debug.ShouldStop(262144);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.listdados.class, "_createitemmaquinas" /*RemoteObject*/ ,(Object)(_hacienda),(Object)(_lote),(Object)(_labor)).getObject()),(Object)((_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 85;BA.debugLine="Log(i)";
Debug.ShouldStop(1048576);
listdados.__c.runVoidMethod ("LogImpl","322085648",BA.NumberToString(_i),0);
 BA.debugLineNum = 86;BA.debugLine="If i=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 87;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 88;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 89;BA.debugLine="p.SetLayout(0,0,CLV_Persons.AsView.Width,CLV_Per";
Debug.ShouldStop(16777216);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")));
 BA.debugLineNum = 90;BA.debugLine="p.LoadLayout(\"errorLayout\")";
Debug.ShouldStop(33554432);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("errorLayout")),__ref.getField(false, "ba"));
 BA.debugLineNum = 91;BA.debugLine="CLV_Persons.Add(p,0)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)(RemoteObject.createImmutable((0))));
 };
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
public static RemoteObject  _listdadso(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listDadso (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("listdadso")) { return __ref.runUserSub(false, "listdados","listdadso", __ref);}
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 49;BA.debugLine="Sub listDadso";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="CLV_Persons.Clear";
Debug.ShouldStop(131072);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 51;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(262144);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 52;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM da";
Debug.ShouldStop(524288);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), listdados._starter._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM dados"))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 53;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(1048576);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 54;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(2097152);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 55;BA.debugLine="Log(Cursor.GetString(\"Consecutivo\"))";
Debug.ShouldStop(4194304);
listdados.__c.runVoidMethod ("LogImpl","322020102",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Consecutivo"))),0);
 BA.debugLineNum = 57;BA.debugLine="CLV_Persons.Add(CreateItem(Cursor.GetString(\"Con";
Debug.ShouldStop(16777216);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.listdados.class, "_createitem" /*RemoteObject*/ ,(Object)(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Consecutivo")))),(Object)(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Fecha_programa")))),(Object)(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NIT")))),(Object)(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Hacienda")))),(Object)(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Lote")))),(Object)(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("labor"))))).getObject()),(Object)(RemoteObject.createImmutable((_i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 59;BA.debugLine="If i=0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 60;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 61;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 62;BA.debugLine="p.LoadLayout(\"errorLayout\")";
Debug.ShouldStop(536870912);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("errorLayout")),__ref.getField(false, "ba"));
 BA.debugLineNum = 63;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(listdados.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(listdados.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 64;BA.debugLine="CLV_Persons.AsView.AddView(p,0,0,100%x,100%y)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(listdados.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(listdados.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 };
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timefim_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("TimeFim_OnDateSet (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,295);
if (RapidSub.canDelegate("timefim_ondateset")) { return __ref.runUserSub(false, "listdados","timefim_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 295;BA.debugLine="Sub TimeFim_OnDateSet(year As Int ,monthOfYear As";
Debug.ShouldStop(64);
 BA.debugLineNum = 296;BA.debugLine="Label4Final.Text=year&\"/\"&(NumberFormat(monthOfYe";
Debug.ShouldStop(128);
__ref.getField(false,"_label4final" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),(listdados.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _monthofyear)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable("/"),listdados.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _dayofmonth)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 297;BA.debugLine="Label4Final.TextColor=Colors.Black";
Debug.ShouldStop(256);
__ref.getField(false,"_label4final" /*RemoteObject*/ ).runMethod(true,"setTextColor",listdados.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timeinicio_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("TimeInicio_OnDateSet (listdados) ","listdados",18,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("timeinicio_ondateset")) { return __ref.runUserSub(false, "listdados","timeinicio_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 289;BA.debugLine="Sub TimeInicio_OnDateSet(year As Int ,monthOfYear";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="Label3Inicial.Text=year&\"/\"&(NumberFormat(monthOf";
Debug.ShouldStop(2);
__ref.getField(false,"_label3inicial" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),(listdados.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _monthofyear)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable("/"),listdados.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _dayofmonth)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 291;BA.debugLine="Label3Inicial.TextColor=Colors.Black";
Debug.ShouldStop(4);
__ref.getField(false,"_label3inicial" /*RemoteObject*/ ).runMethod(true,"setTextColor",listdados.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}