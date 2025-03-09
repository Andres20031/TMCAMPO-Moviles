package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class listlabores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.listlabores");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.listlabores.class).invoke(this, new Object[] {null});
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
public b4a.example.ef.gifviewer _gifviewerloading = null;
public b4a.example3.customlistview _clv_labores = null;
public String _rdclink = "";
public anywheresoftware.b4a.objects.LabelWrapper _labellabores = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttongrabar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttoncancelar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonaplazar = null;
public ADR.stringdemo.stringfunctions _sf = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.listlabores __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="End Sub";
return null;
}
public void  _b4xpage_appear(b4a.example.ef.listlabores __ref) throws Exception{
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.listlabores parent,b4a.example.ef.listlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.listlabores __ref;
b4a.example.ef.listlabores parent;
String _nombreempresa = "";
String _nombrehacienda = "";
String _nombrelabor = "";
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
int _counter = 0;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
int _consecutivo = 0;
String _nit_programa_labor = "";
String _hacienda_programa_labor = "";
String _suerte_programa_labor = "";
String _fecha_programa_labor = "";
String _destino_programa_labor = "";
String _area_programa_labor = "";
String _observacion = "";
String[] _partesfecha = null;
b4a.example.ef.main._dbcommand _cmdnombre = null;
b4a.example.ef.httpjob _j2 = null;
b4a.example.ef.main._dbresult _resnombre = null;
Object[] _rownombre = null;
b4a.example.ef.main._dbcommand _cmdhacienda = null;
b4a.example.ef.httpjob _j3 = null;
b4a.example.ef.main._dbresult _reshacienda = null;
Object[] _rowhacienda = null;
b4a.example.ef.main._dbcommand _cmdlabor = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _reslabor = null;
Object[] _rowlabor = null;
long _fecha = 0L;
long _fechaunix = 0L;
long _fechaactual = 0L;
long _fechaunixactual = 0L;
long _diferenciasegundos = 0L;
int _diferenciadias = 0;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;
anywheresoftware.b4a.BA.IterableList group42;
int index42;
int groupLen42;
anywheresoftware.b4a.BA.IterableList group53;
int index53;
int groupLen53;
anywheresoftware.b4a.BA.IterableList group64;
int index64;
int groupLen64;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="listlabores";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="CLV_Labores.Clear";
__ref._clv_labores /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="GifViewerLoading.Start";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._start /*String*/ (null);
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Dim nombreEMPRESA As String";
_nombreempresa = "";
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Dim nombreHacienda As String";
_nombrehacienda = "";
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Dim nombreLabor As String";
_nombrelabor = "";
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_prog";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_programalabores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 46;
return;
case 46:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="Dim counter As Int";
_counter = 0;
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="counter = 0";
_counter = (int) (0);
RDebugUtils.currentLine=4784146;
 //BA.debugLineNum = 4784146;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 45;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 44;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4784147;
 //BA.debugLineNum = 4784147;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=4784150;
 //BA.debugLineNum = 4784150;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 47;
return;
case 47:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=4784153;
 //BA.debugLineNum = 4784153;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 42;
group16 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 48;
if (true) break;

case 48:
//C
this.state = 42;
if (index16 < groupLen16) {
this.state = 6;
_row = (Object[])(group16.Get(index16));}
if (true) break;

case 49:
//C
this.state = 48;
index16++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=4784155;
 //BA.debugLineNum = 4784155;BA.debugLine="Dim Consecutivo As Int = row(0)";
_consecutivo = (int)(BA.ObjectToNumber(_row[(int) (0)]));
RDebugUtils.currentLine=4784158;
 //BA.debugLineNum = 4784158;BA.debugLine="Dim Nit_Programa_Labor As String = row(1)";
_nit_programa_labor = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=4784161;
 //BA.debugLineNum = 4784161;BA.debugLine="Dim Hacienda_Programa_Labor As String = row(2)";
_hacienda_programa_labor = BA.ObjectToString(_row[(int) (2)]);
RDebugUtils.currentLine=4784164;
 //BA.debugLineNum = 4784164;BA.debugLine="Dim Suerte_Programa_Labor As String = row(3)";
_suerte_programa_labor = BA.ObjectToString(_row[(int) (3)]);
RDebugUtils.currentLine=4784167;
 //BA.debugLineNum = 4784167;BA.debugLine="Dim Fecha_Programa_Labor As String = row(4)";
_fecha_programa_labor = BA.ObjectToString(_row[(int) (4)]);
RDebugUtils.currentLine=4784170;
 //BA.debugLineNum = 4784170;BA.debugLine="Dim Destino_Programa_Labor As String = row(5)";
_destino_programa_labor = BA.ObjectToString(_row[(int) (5)]);
RDebugUtils.currentLine=4784173;
 //BA.debugLineNum = 4784173;BA.debugLine="Dim Area_Programa_Labor As String = row(6)";
_area_programa_labor = BA.ObjectToString(_row[(int) (6)]);
RDebugUtils.currentLine=4784176;
 //BA.debugLineNum = 4784176;BA.debugLine="Dim Observacion As String = row(7)";
_observacion = BA.ObjectToString(_row[(int) (7)]);
RDebugUtils.currentLine=4784179;
 //BA.debugLineNum = 4784179;BA.debugLine="Dim partesFecha() As String";
_partesfecha = new String[(int) (0)];
java.util.Arrays.fill(_partesfecha,"");
RDebugUtils.currentLine=4784180;
 //BA.debugLineNum = 4784180;BA.debugLine="partesFecha = Regex.Split(\" \", Fecha_Programa_L";
_partesfecha = parent.__c.Regex.Split(" ",_fecha_programa_labor);
RDebugUtils.currentLine=4784181;
 //BA.debugLineNum = 4784181;BA.debugLine="Fecha_Programa_Labor = partesFecha(0)";
_fecha_programa_labor = _partesfecha[(int) (0)];
RDebugUtils.currentLine=4784183;
 //BA.debugLineNum = 4784183;BA.debugLine="Log(\"Contador: \" & counter)";
parent.__c.LogImpl("74784183","Contador: "+BA.NumberToString(_counter),0);
RDebugUtils.currentLine=4784184;
 //BA.debugLineNum = 4784184;BA.debugLine="Log(\"Consecutivo: \" & Consecutivo)";
parent.__c.LogImpl("74784184","Consecutivo: "+BA.NumberToString(_consecutivo),0);
RDebugUtils.currentLine=4784185;
 //BA.debugLineNum = 4784185;BA.debugLine="Log(\"Nit_Programa_Labor: \" & Nit_Programa_Labor";
parent.__c.LogImpl("74784185","Nit_Programa_Labor: "+_nit_programa_labor,0);
RDebugUtils.currentLine=4784186;
 //BA.debugLineNum = 4784186;BA.debugLine="Log(\"Hacienda_Programa_Labor: \" & Hacienda_Prog";
parent.__c.LogImpl("74784186","Hacienda_Programa_Labor: "+_hacienda_programa_labor,0);
RDebugUtils.currentLine=4784187;
 //BA.debugLineNum = 4784187;BA.debugLine="Log(\"Suerte_Programa_Labor: \" & Suerte_Programa";
parent.__c.LogImpl("74784187","Suerte_Programa_Labor: "+_suerte_programa_labor,0);
RDebugUtils.currentLine=4784188;
 //BA.debugLineNum = 4784188;BA.debugLine="Log(\"Fecha_Programa_Labor: \" & Fecha_Programa_L";
parent.__c.LogImpl("74784188","Fecha_Programa_Labor: "+_fecha_programa_labor,0);
RDebugUtils.currentLine=4784189;
 //BA.debugLineNum = 4784189;BA.debugLine="Log(\"Destino_Programa_Labor: \" & Destino_Progra";
parent.__c.LogImpl("74784189","Destino_Programa_Labor: "+_destino_programa_labor,0);
RDebugUtils.currentLine=4784190;
 //BA.debugLineNum = 4784190;BA.debugLine="Log(\"Area_Programa_Labor: \" & Area_Programa_Lab";
parent.__c.LogImpl("74784190","Area_Programa_Labor: "+_area_programa_labor,0);
RDebugUtils.currentLine=4784191;
 //BA.debugLineNum = 4784191;BA.debugLine="Log(\"Observacion: \"& Observacion)";
parent.__c.LogImpl("74784191","Observacion: "+_observacion,0);
RDebugUtils.currentLine=4784195;
 //BA.debugLineNum = 4784195;BA.debugLine="Dim cmdNombre As DBCommand = CreateCommand(\"sel";
_cmdnombre = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit_details",new Object[]{(Object)(_nit_programa_labor)});
RDebugUtils.currentLine=4784196;
 //BA.debugLineNum = 4784196;BA.debugLine="Wait For (Req.ExecuteQuery(cmdNombre, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdnombre,(int) (0),parent.__c.Null)));
this.state = 50;
return;
case 50:
//C
this.state = 7;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=4784198;
 //BA.debugLineNum = 4784198;BA.debugLine="If j2.Success Then";
if (true) break;

case 7:
//if
this.state = 16;
if (_j2._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=4784199;
 //BA.debugLineNum = 4784199;BA.debugLine="Req.HandleJobAsync(j2, \"req_nombre\")";
_req._handlejobasync /*void*/ (null,_j2,"req_nombre");
RDebugUtils.currentLine=4784200;
 //BA.debugLineNum = 4784200;BA.debugLine="Wait For (Req) req_nombre_Result(resNombre As";
parent.__c.WaitFor("req_nombre_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 51;
return;
case 51:
//C
this.state = 10;
_resnombre = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=4784202;
 //BA.debugLineNum = 4784202;BA.debugLine="For Each rowNombre() As Object In resNombre.Ro";
if (true) break;

case 10:
//for
this.state = 13;
group42 = _resnombre.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index42 = 0;
groupLen42 = group42.getSize();
this.state = 52;
if (true) break;

case 52:
//C
this.state = 13;
if (index42 < groupLen42) {
this.state = 12;
_rownombre = (Object[])(group42.Get(index42));}
if (true) break;

case 53:
//C
this.state = 52;
index42++;
if (true) break;

case 12:
//C
this.state = 53;
RDebugUtils.currentLine=4784203;
 //BA.debugLineNum = 4784203;BA.debugLine="nombreEMPRESA = sf.Trim(rowNombre(0)) ' El pr";
_nombreempresa = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_rownombre[(int) (0)]));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=4784206;
 //BA.debugLineNum = 4784206;BA.debugLine="Log(\"ERROR al obtener el nombre del cliente: \"";
parent.__c.LogImpl("74784206","ERROR al obtener el nombre del cliente: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=4784210;
 //BA.debugLineNum = 4784210;BA.debugLine="Dim cmdHacienda As DBCommand = CreateCommand(\"s";
_cmdhacienda = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_hacienda_details",new Object[]{(Object)(_hacienda_programa_labor)});
RDebugUtils.currentLine=4784211;
 //BA.debugLineNum = 4784211;BA.debugLine="Wait For (Req.ExecuteQuery(cmdHacienda, 0, Null";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdhacienda,(int) (0),parent.__c.Null)));
this.state = 54;
return;
case 54:
//C
this.state = 17;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=4784213;
 //BA.debugLineNum = 4784213;BA.debugLine="If j3.Success Then";
if (true) break;

case 17:
//if
this.state = 26;
if (_j3._success /*boolean*/ ) { 
this.state = 19;
}else {
this.state = 25;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=4784214;
 //BA.debugLineNum = 4784214;BA.debugLine="Req.HandleJobAsync(j3, \"req_hacienda\")";
_req._handlejobasync /*void*/ (null,_j3,"req_hacienda");
RDebugUtils.currentLine=4784215;
 //BA.debugLineNum = 4784215;BA.debugLine="Wait For (Req) req_hacienda_Result(resHacienda";
parent.__c.WaitFor("req_hacienda_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 55;
return;
case 55:
//C
this.state = 20;
_reshacienda = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=4784217;
 //BA.debugLineNum = 4784217;BA.debugLine="For Each rowHacienda() As Object In resHaciend";
if (true) break;

case 20:
//for
this.state = 23;
group53 = _reshacienda.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index53 = 0;
groupLen53 = group53.getSize();
this.state = 56;
if (true) break;

case 56:
//C
this.state = 23;
if (index53 < groupLen53) {
this.state = 22;
_rowhacienda = (Object[])(group53.Get(index53));}
if (true) break;

case 57:
//C
this.state = 56;
index53++;
if (true) break;

case 22:
//C
this.state = 57;
RDebugUtils.currentLine=4784218;
 //BA.debugLineNum = 4784218;BA.debugLine="nombreHacienda = sf.Trim(rowHacienda(0)) ' El";
_nombrehacienda = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_rowhacienda[(int) (0)]));
 if (true) break;
if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=4784221;
 //BA.debugLineNum = 4784221;BA.debugLine="Log(\"ERROR al obtener el nombre de la hacienda";
parent.__c.LogImpl("74784221","ERROR al obtener el nombre de la hacienda: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=4784225;
 //BA.debugLineNum = 4784225;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"sele";
_cmdlabor = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_programa_labores_destino",new Object[]{(Object)(_destino_programa_labor)});
RDebugUtils.currentLine=4784226;
 //BA.debugLineNum = 4784226;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 58;
return;
case 58:
//C
this.state = 27;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=4784228;
 //BA.debugLineNum = 4784228;BA.debugLine="If j4.Success Then";
if (true) break;

case 27:
//if
this.state = 36;
if (_j4._success /*boolean*/ ) { 
this.state = 29;
}else {
this.state = 35;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=4784229;
 //BA.debugLineNum = 4784229;BA.debugLine="Req.HandleJobAsync(j4, \"req_labor\")";
_req._handlejobasync /*void*/ (null,_j4,"req_labor");
RDebugUtils.currentLine=4784230;
 //BA.debugLineNum = 4784230;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DB";
parent.__c.WaitFor("req_labor_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 59;
return;
case 59:
//C
this.state = 30;
_reslabor = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=4784232;
 //BA.debugLineNum = 4784232;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
if (true) break;

case 30:
//for
this.state = 33;
group64 = _reslabor.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index64 = 0;
groupLen64 = group64.getSize();
this.state = 60;
if (true) break;

case 60:
//C
this.state = 33;
if (index64 < groupLen64) {
this.state = 32;
_rowlabor = (Object[])(group64.Get(index64));}
if (true) break;

case 61:
//C
this.state = 60;
index64++;
if (true) break;

case 32:
//C
this.state = 61;
RDebugUtils.currentLine=4784233;
 //BA.debugLineNum = 4784233;BA.debugLine="nombreLabor = sf.Trim(rowLabor(0)) ' El prime";
_nombrelabor = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_rowlabor[(int) (0)]));
 if (true) break;
if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=4784236;
 //BA.debugLineNum = 4784236;BA.debugLine="Log(\"ERROR al obtener el nombre de la hacienda";
parent.__c.LogImpl("74784236","ERROR al obtener el nombre de la hacienda: "+_j3._errormessage /*String*/ ,0);
 if (true) break;
;
RDebugUtils.currentLine=4784240;
 //BA.debugLineNum = 4784240;BA.debugLine="Try";

case 36:
//try
this.state = 41;
this.catchState = 40;
this.state = 38;
if (true) break;

case 38:
//C
this.state = 41;
this.catchState = 40;
RDebugUtils.currentLine=4784242;
 //BA.debugLineNum = 4784242;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=4784243;
 //BA.debugLineNum = 4784243;BA.debugLine="Dim fecha As Long = DateTime.DateParse(Fecha_P";
_fecha = parent.__c.DateTime.DateParse(_fecha_programa_labor);
RDebugUtils.currentLine=4784244;
 //BA.debugLineNum = 4784244;BA.debugLine="Dim fechaUNIX As Long = DateUtils.TicksToUnixT";
_fechaunix = parent._dateutils._tickstounixtime(ba,_fecha);
RDebugUtils.currentLine=4784245;
 //BA.debugLineNum = 4784245;BA.debugLine="Log(\"LA FECHA EN LONG: \"&fechaUNIX)";
parent.__c.LogImpl("74784245","LA FECHA EN LONG: "+BA.NumberToString(_fechaunix),0);
RDebugUtils.currentLine=4784248;
 //BA.debugLineNum = 4784248;BA.debugLine="Dim fechaActual As Long = DateTime.Now";
_fechaactual = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=4784249;
 //BA.debugLineNum = 4784249;BA.debugLine="Dim fechaUNIXACTUAL As Long = DateUtils.TicksT";
_fechaunixactual = parent._dateutils._tickstounixtime(ba,_fechaactual);
RDebugUtils.currentLine=4784250;
 //BA.debugLineNum = 4784250;BA.debugLine="Log(\"LA FECHA ACTUAL: \"&fechaUNIXACTUAL)";
parent.__c.LogImpl("74784250","LA FECHA ACTUAL: "+BA.NumberToString(_fechaunixactual),0);
RDebugUtils.currentLine=4784253;
 //BA.debugLineNum = 4784253;BA.debugLine="Dim diferenciaSegundos As Long = fechaUNIXACTU";
_diferenciasegundos = (long) (_fechaunixactual-_fechaunix);
RDebugUtils.currentLine=4784256;
 //BA.debugLineNum = 4784256;BA.debugLine="Dim diferenciaDias As Int = diferenciaSegundos";
_diferenciadias = (int) (_diferenciasegundos/(double)86400);
RDebugUtils.currentLine=4784259;
 //BA.debugLineNum = 4784259;BA.debugLine="Log(\"Días de diferencia: \" & diferenciaDias)";
parent.__c.LogImpl("74784259","Días de diferencia: "+BA.NumberToString(_diferenciadias),0);
 if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 0;
RDebugUtils.currentLine=4784262;
 //BA.debugLineNum = 4784262;BA.debugLine="Log(\"Error: Formato de fecha inválido o no se";
parent.__c.LogImpl("74784262","Error: Formato de fecha inválido o no se pudo parsear la fecha.",0);
 if (true) break;
if (true) break;

case 41:
//C
this.state = 49;
this.catchState = 0;
;
RDebugUtils.currentLine=4784265;
 //BA.debugLineNum = 4784265;BA.debugLine="CLV_Labores.Add(CreateItem(counter,Consecutivo,";
__ref._clv_labores /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,BA.NumberToString(_counter),BA.NumberToString(_consecutivo),_nombreempresa,_nombrehacienda,_suerte_programa_labor,_area_programa_labor,_nombrelabor,_fecha_programa_labor,BA.NumberToString(_diferenciadias),_observacion).getObject())),(Object)(_consecutivo));
RDebugUtils.currentLine=4784266;
 //BA.debugLineNum = 4784266;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
 if (true) break;
if (true) break;

case 42:
//C
this.state = 45;
;
RDebugUtils.currentLine=4784269;
 //BA.debugLineNum = 4784269;BA.debugLine="GifViewerLoading.Stop";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._stop /*String*/ (null);
 if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=4784271;
 //BA.debugLineNum = 4784271;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("74784271","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 45:
//C
this.state = -1;
;
RDebugUtils.currentLine=4784273;
 //BA.debugLineNum = 4784273;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=4784275;
 //BA.debugLineNum = 4784275;BA.debugLine="End Sub";
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
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.listlabores __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.listlabores __ref,String _position,String _consecutivo,String _nit,String _hacienda,String _suerte,String _area,String _labor,String _fechapro,String _retraso,String _observacion) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", new Object[] {_position,_consecutivo,_nit,_hacienda,_suerte,_area,_labor,_fechapro,_retraso,_observacion}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub CreateItem(Position As String,Consecut";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 420dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (420)));
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="panel.LoadLayout(\"CardLabores\")";
_panel.LoadLayout("CardLabores",ba);
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Consecutivo: ")).PopAll();
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Consecuti";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_consecutivo+__c.CRLF)).PopAll();
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Nit: \").PopAl";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Nit: ")).PopAll();
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Nit & CRL";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).PopAll();
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).PopAll();
RDebugUtils.currentLine=4849683;
 //BA.debugLineNum = 4849683;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Hacienda";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).PopAll();
RDebugUtils.currentLine=4849685;
 //BA.debugLineNum = 4849685;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Suerte: \").Po";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Suerte: ")).PopAll();
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Suerte).P";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_suerte)).PopAll();
RDebugUtils.currentLine=4849687;
 //BA.debugLineNum = 4849687;BA.debugLine="cs.Append(\"  \")";
_cs.Append(BA.ObjectToCharSequence("  "));
RDebugUtils.currentLine=4849688;
 //BA.debugLineNum = 4849688;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Área: \").PopA";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Área: ")).PopAll();
RDebugUtils.currentLine=4849689;
 //BA.debugLineNum = 4849689;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Area & CR";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_area+__c.CRLF)).PopAll();
RDebugUtils.currentLine=4849691;
 //BA.debugLineNum = 4849691;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Labor: ")).PopAll();
RDebugUtils.currentLine=4849692;
 //BA.debugLineNum = 4849692;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Labor & C";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_labor+__c.CRLF)).PopAll();
RDebugUtils.currentLine=4849694;
 //BA.debugLineNum = 4849694;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha programa: ")).PopAll();
RDebugUtils.currentLine=4849695;
 //BA.debugLineNum = 4849695;BA.debugLine="cs.Color(Colors.Black).Underline.Append(FechaPro";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_fechapro+__c.CRLF)).PopAll();
RDebugUtils.currentLine=4849697;
 //BA.debugLineNum = 4849697;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Días atraso:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Días atraso: ")).PopAll();
RDebugUtils.currentLine=4849698;
 //BA.debugLineNum = 4849698;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Retraso &";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_retraso+__c.CRLF)).PopAll();
RDebugUtils.currentLine=4849700;
 //BA.debugLineNum = 4849700;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Observación:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Observación: ")).PopAll();
RDebugUtils.currentLine=4849701;
 //BA.debugLineNum = 4849701;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Observaci";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_observacion+__c.CRLF)).PopAll();
RDebugUtils.currentLine=4849703;
 //BA.debugLineNum = 4849703;BA.debugLine="LabelLabores.Text = cs";
__ref._labellabores /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=4849705;
 //BA.debugLineNum = 4849705;BA.debugLine="ButtonGrabar.Tag = Consecutivo";
__ref._buttongrabar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=4849706;
 //BA.debugLineNum = 4849706;BA.debugLine="ButtonCancelar.Tag = Consecutivo";
__ref._buttoncancelar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=4849707;
 //BA.debugLineNum = 4849707;BA.debugLine="ButtonAplazar.Tag = Consecutivo";
__ref._buttonaplazar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=4849709;
 //BA.debugLineNum = 4849709;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=4849711;
 //BA.debugLineNum = 4849711;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.listlabores __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="Root.LoadLayout(\"ListLaboresCampo\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListLaboresCampo",ba);
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="GifViewerLoading.SetGif(File.DirAssets,\"carga.gif";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._setgif /*String*/ (null,__c.File.getDirAssets(),"carga.gif");
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="End Sub";
return "";
}
public String  _buttonaplazar_click(b4a.example.ef.listlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "buttonaplazar_click", false))
	 {return ((String) Debug.delegate(ba, "buttonaplazar_click", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub ButtonAplazar_Click";
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
public String  _buttoncancelar_click(b4a.example.ef.listlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "buttoncancelar_click", false))
	 {return ((String) Debug.delegate(ba, "buttoncancelar_click", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub ButtonCancelar_Click";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public String  _buttongrabar_click(b4a.example.ef.listlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "buttongrabar_click", false))
	 {return ((String) Debug.delegate(ba, "buttongrabar_click", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub ButtonGrabar_Click";
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.listlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="Private GifViewerLoading As GifViewer";
_gifviewerloading = new b4a.example.ef.gifviewer();
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Private CLV_Labores As CustomListView";
_clv_labores = new b4a.example3.customlistview();
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="Private LabelLabores As Label";
_labellabores = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="Private ButtonGrabar As Button";
_buttongrabar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="Private ButtonCancelar As Button";
_buttoncancelar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="Private ButtonAplazar As Button";
_buttonaplazar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="End Sub";
return "";
}
}