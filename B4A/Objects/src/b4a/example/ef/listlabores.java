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
public String _consecutivoseleccionado = "";
public String _consecutivoseleccionadocancelar = "";
public String _conse = "";
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
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="End Sub";
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
anywheresoftware.b4a.BA.IterableList group33;
int index33;
int groupLen33;
anywheresoftware.b4a.BA.IterableList group44;
int index44;
int groupLen44;
anywheresoftware.b4a.BA.IterableList group55;
int index55;
int groupLen55;

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
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="CLV_Labores.Clear";
__ref._clv_labores /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="GifViewerLoading.Start";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._start /*String*/ (null);
RDebugUtils.currentLine=23461891;
 //BA.debugLineNum = 23461891;BA.debugLine="Dim nombreEMPRESA As String";
_nombreempresa = "";
RDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="Dim nombreHacienda As String";
_nombrehacienda = "";
RDebugUtils.currentLine=23461893;
 //BA.debugLineNum = 23461893;BA.debugLine="Dim nombreLabor As String";
_nombrelabor = "";
RDebugUtils.currentLine=23461896;
 //BA.debugLineNum = 23461896;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=23461897;
 //BA.debugLineNum = 23461897;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=23461898;
 //BA.debugLineNum = 23461898;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_prog";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_programalabores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=23461901;
 //BA.debugLineNum = 23461901;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 46;
return;
case 46:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=23461902;
 //BA.debugLineNum = 23461902;BA.debugLine="Dim counter As Int";
_counter = 0;
RDebugUtils.currentLine=23461903;
 //BA.debugLineNum = 23461903;BA.debugLine="counter = 0";
_counter = (int) (0);
RDebugUtils.currentLine=23461906;
 //BA.debugLineNum = 23461906;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=23461907;
 //BA.debugLineNum = 23461907;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=23461908;
 //BA.debugLineNum = 23461908;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=23461910;
 //BA.debugLineNum = 23461910;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 47;
return;
case 47:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=23461913;
 //BA.debugLineNum = 23461913;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=23461915;
 //BA.debugLineNum = 23461915;BA.debugLine="Dim Consecutivo As Int = row(0)";
_consecutivo = (int)(BA.ObjectToNumber(_row[(int) (0)]));
RDebugUtils.currentLine=23461918;
 //BA.debugLineNum = 23461918;BA.debugLine="Dim Nit_Programa_Labor As String = row(1)";
_nit_programa_labor = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=23461921;
 //BA.debugLineNum = 23461921;BA.debugLine="Dim Hacienda_Programa_Labor As String = row(2)";
_hacienda_programa_labor = BA.ObjectToString(_row[(int) (2)]);
RDebugUtils.currentLine=23461924;
 //BA.debugLineNum = 23461924;BA.debugLine="Dim Suerte_Programa_Labor As String = row(3)";
_suerte_programa_labor = BA.ObjectToString(_row[(int) (3)]);
RDebugUtils.currentLine=23461927;
 //BA.debugLineNum = 23461927;BA.debugLine="Dim Fecha_Programa_Labor As String = row(4)";
_fecha_programa_labor = BA.ObjectToString(_row[(int) (4)]);
RDebugUtils.currentLine=23461930;
 //BA.debugLineNum = 23461930;BA.debugLine="Dim Destino_Programa_Labor As String = row(5)";
_destino_programa_labor = BA.ObjectToString(_row[(int) (5)]);
RDebugUtils.currentLine=23461933;
 //BA.debugLineNum = 23461933;BA.debugLine="Dim Area_Programa_Labor As String = row(6)";
_area_programa_labor = BA.ObjectToString(_row[(int) (6)]);
RDebugUtils.currentLine=23461936;
 //BA.debugLineNum = 23461936;BA.debugLine="Dim Observacion As String = row(7)";
_observacion = BA.ObjectToString(_row[(int) (7)]);
RDebugUtils.currentLine=23461939;
 //BA.debugLineNum = 23461939;BA.debugLine="Dim partesFecha() As String";
_partesfecha = new String[(int) (0)];
java.util.Arrays.fill(_partesfecha,"");
RDebugUtils.currentLine=23461940;
 //BA.debugLineNum = 23461940;BA.debugLine="partesFecha = Regex.Split(\" \", Fecha_Programa_L";
_partesfecha = parent.__c.Regex.Split(" ",_fecha_programa_labor);
RDebugUtils.currentLine=23461941;
 //BA.debugLineNum = 23461941;BA.debugLine="Fecha_Programa_Labor = partesFecha(0)";
_fecha_programa_labor = _partesfecha[(int) (0)];
RDebugUtils.currentLine=23461955;
 //BA.debugLineNum = 23461955;BA.debugLine="Dim cmdNombre As DBCommand = CreateCommand(\"sel";
_cmdnombre = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit_details",new Object[]{(Object)(_nit_programa_labor)});
RDebugUtils.currentLine=23461956;
 //BA.debugLineNum = 23461956;BA.debugLine="Wait For (Req.ExecuteQuery(cmdNombre, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdnombre,(int) (0),parent.__c.Null)));
this.state = 50;
return;
case 50:
//C
this.state = 7;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=23461958;
 //BA.debugLineNum = 23461958;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=23461959;
 //BA.debugLineNum = 23461959;BA.debugLine="Req.HandleJobAsync(j2, \"req_nombre\")";
_req._handlejobasync /*void*/ (null,_j2,"req_nombre");
RDebugUtils.currentLine=23461960;
 //BA.debugLineNum = 23461960;BA.debugLine="Wait For (Req) req_nombre_Result(resNombre As";
parent.__c.WaitFor("req_nombre_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 51;
return;
case 51:
//C
this.state = 10;
_resnombre = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=23461962;
 //BA.debugLineNum = 23461962;BA.debugLine="For Each rowNombre() As Object In resNombre.Ro";
if (true) break;

case 10:
//for
this.state = 13;
group33 = _resnombre.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index33 = 0;
groupLen33 = group33.getSize();
this.state = 52;
if (true) break;

case 52:
//C
this.state = 13;
if (index33 < groupLen33) {
this.state = 12;
_rownombre = (Object[])(group33.Get(index33));}
if (true) break;

case 53:
//C
this.state = 52;
index33++;
if (true) break;

case 12:
//C
this.state = 53;
RDebugUtils.currentLine=23461963;
 //BA.debugLineNum = 23461963;BA.debugLine="nombreEMPRESA = sf.Trim(rowNombre(0)) ' El pr";
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
RDebugUtils.currentLine=23461966;
 //BA.debugLineNum = 23461966;BA.debugLine="Log(\"ERROR al obtener el nombre del cliente: \"";
parent.__c.LogImpl("323461966","ERROR al obtener el nombre del cliente: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=23461970;
 //BA.debugLineNum = 23461970;BA.debugLine="Dim cmdHacienda As DBCommand = CreateCommand(\"s";
_cmdhacienda = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_hacienda_details",new Object[]{(Object)(_hacienda_programa_labor)});
RDebugUtils.currentLine=23461971;
 //BA.debugLineNum = 23461971;BA.debugLine="Wait For (Req.ExecuteQuery(cmdHacienda, 0, Null";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdhacienda,(int) (0),parent.__c.Null)));
this.state = 54;
return;
case 54:
//C
this.state = 17;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=23461973;
 //BA.debugLineNum = 23461973;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=23461974;
 //BA.debugLineNum = 23461974;BA.debugLine="Req.HandleJobAsync(j3, \"req_hacienda\")";
_req._handlejobasync /*void*/ (null,_j3,"req_hacienda");
RDebugUtils.currentLine=23461975;
 //BA.debugLineNum = 23461975;BA.debugLine="Wait For (Req) req_hacienda_Result(resHacienda";
parent.__c.WaitFor("req_hacienda_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 55;
return;
case 55:
//C
this.state = 20;
_reshacienda = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=23461977;
 //BA.debugLineNum = 23461977;BA.debugLine="For Each rowHacienda() As Object In resHaciend";
if (true) break;

case 20:
//for
this.state = 23;
group44 = _reshacienda.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index44 = 0;
groupLen44 = group44.getSize();
this.state = 56;
if (true) break;

case 56:
//C
this.state = 23;
if (index44 < groupLen44) {
this.state = 22;
_rowhacienda = (Object[])(group44.Get(index44));}
if (true) break;

case 57:
//C
this.state = 56;
index44++;
if (true) break;

case 22:
//C
this.state = 57;
RDebugUtils.currentLine=23461978;
 //BA.debugLineNum = 23461978;BA.debugLine="nombreHacienda = sf.Trim(rowHacienda(0)) ' El";
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
RDebugUtils.currentLine=23461981;
 //BA.debugLineNum = 23461981;BA.debugLine="Log(\"ERROR al obtener el nombre de la hacienda";
parent.__c.LogImpl("323461981","ERROR al obtener el nombre de la hacienda: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=23461985;
 //BA.debugLineNum = 23461985;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"sele";
_cmdlabor = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_programa_labores_destino",new Object[]{(Object)(_destino_programa_labor)});
RDebugUtils.currentLine=23461986;
 //BA.debugLineNum = 23461986;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 58;
return;
case 58:
//C
this.state = 27;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=23461988;
 //BA.debugLineNum = 23461988;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=23461989;
 //BA.debugLineNum = 23461989;BA.debugLine="Req.HandleJobAsync(j4, \"req_labor\")";
_req._handlejobasync /*void*/ (null,_j4,"req_labor");
RDebugUtils.currentLine=23461990;
 //BA.debugLineNum = 23461990;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DB";
parent.__c.WaitFor("req_labor_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 59;
return;
case 59:
//C
this.state = 30;
_reslabor = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=23461992;
 //BA.debugLineNum = 23461992;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
if (true) break;

case 30:
//for
this.state = 33;
group55 = _reslabor.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index55 = 0;
groupLen55 = group55.getSize();
this.state = 60;
if (true) break;

case 60:
//C
this.state = 33;
if (index55 < groupLen55) {
this.state = 32;
_rowlabor = (Object[])(group55.Get(index55));}
if (true) break;

case 61:
//C
this.state = 60;
index55++;
if (true) break;

case 32:
//C
this.state = 61;
RDebugUtils.currentLine=23461993;
 //BA.debugLineNum = 23461993;BA.debugLine="nombreLabor = sf.Trim(rowLabor(0)) ' El prime";
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
RDebugUtils.currentLine=23461996;
 //BA.debugLineNum = 23461996;BA.debugLine="Log(\"ERROR al obtener el nombre de la hacienda";
parent.__c.LogImpl("323461996","ERROR al obtener el nombre de la hacienda: "+_j3._errormessage /*String*/ ,0);
 if (true) break;
;
RDebugUtils.currentLine=23462000;
 //BA.debugLineNum = 23462000;BA.debugLine="Try";

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
RDebugUtils.currentLine=23462002;
 //BA.debugLineNum = 23462002;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=23462003;
 //BA.debugLineNum = 23462003;BA.debugLine="Dim fecha As Long = DateTime.DateParse(Fecha_P";
_fecha = parent.__c.DateTime.DateParse(_fecha_programa_labor);
RDebugUtils.currentLine=23462004;
 //BA.debugLineNum = 23462004;BA.debugLine="Dim fechaUNIX As Long = DateUtils.TicksToUnixT";
_fechaunix = parent._dateutils._tickstounixtime(ba,_fecha);
RDebugUtils.currentLine=23462008;
 //BA.debugLineNum = 23462008;BA.debugLine="Dim fechaActual As Long = DateTime.Now";
_fechaactual = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=23462009;
 //BA.debugLineNum = 23462009;BA.debugLine="Dim fechaUNIXACTUAL As Long = DateUtils.TicksT";
_fechaunixactual = parent._dateutils._tickstounixtime(ba,_fechaactual);
RDebugUtils.currentLine=23462013;
 //BA.debugLineNum = 23462013;BA.debugLine="Dim diferenciaSegundos As Long = fechaUNIXACTU";
_diferenciasegundos = (long) (_fechaunixactual-_fechaunix);
RDebugUtils.currentLine=23462016;
 //BA.debugLineNum = 23462016;BA.debugLine="Dim diferenciaDias As Int = diferenciaSegundos";
_diferenciadias = (int) (_diferenciasegundos/(double)86400);
 if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 0;
RDebugUtils.currentLine=23462022;
 //BA.debugLineNum = 23462022;BA.debugLine="Log(\"Error: Formato de fecha inválido o no se";
parent.__c.LogImpl("323462022","Error: Formato de fecha inválido o no se pudo parsear la fecha.",0);
 if (true) break;
if (true) break;

case 41:
//C
this.state = 49;
this.catchState = 0;
;
RDebugUtils.currentLine=23462025;
 //BA.debugLineNum = 23462025;BA.debugLine="CLV_Labores.Add(CreateItem(counter,Consecutivo,";
__ref._clv_labores /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,BA.NumberToString(_counter),BA.NumberToString(_consecutivo),_nombreempresa,_nombrehacienda,_suerte_programa_labor,_area_programa_labor,_nombrelabor,_fecha_programa_labor,BA.NumberToString(_diferenciadias),_observacion).getObject())),(Object)(_consecutivo));
RDebugUtils.currentLine=23462026;
 //BA.debugLineNum = 23462026;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
 if (true) break;
if (true) break;

case 42:
//C
this.state = 45;
;
RDebugUtils.currentLine=23462029;
 //BA.debugLineNum = 23462029;BA.debugLine="GifViewerLoading.Stop";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._stop /*String*/ (null);
 if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=23462031;
 //BA.debugLineNum = 23462031;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("323462031","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 45:
//C
this.state = -1;
;
RDebugUtils.currentLine=23462033;
 //BA.debugLineNum = 23462033;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=23462035;
 //BA.debugLineNum = 23462035;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=23592965;
 //BA.debugLineNum = 23592965;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.listlabores __ref,String _position,String _consecutivo,String _nit,String _hacienda,String _suerte,String _area,String _labor,String _fechapro,String _retraso,String _observacion) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", new Object[] {_position,_consecutivo,_nit,_hacienda,_suerte,_area,_labor,_fechapro,_retraso,_observacion}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Private Sub CreateItem(Position As String,Consecut";
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 420dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (420)));
RDebugUtils.currentLine=23527430;
 //BA.debugLineNum = 23527430;BA.debugLine="panel.LoadLayout(\"CardLabores\")";
_panel.LoadLayout("CardLabores",ba);
RDebugUtils.currentLine=23527432;
 //BA.debugLineNum = 23527432;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=23527433;
 //BA.debugLineNum = 23527433;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=23527436;
 //BA.debugLineNum = 23527436;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Consecutivo: ")).PopAll();
RDebugUtils.currentLine=23527437;
 //BA.debugLineNum = 23527437;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Consecuti";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_consecutivo+__c.CRLF)).PopAll();
RDebugUtils.currentLine=23527439;
 //BA.debugLineNum = 23527439;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Nit: \").PopAl";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Nit: ")).PopAll();
RDebugUtils.currentLine=23527440;
 //BA.debugLineNum = 23527440;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Nit & CRL";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).PopAll();
RDebugUtils.currentLine=23527442;
 //BA.debugLineNum = 23527442;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).PopAll();
RDebugUtils.currentLine=23527443;
 //BA.debugLineNum = 23527443;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Hacienda";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).PopAll();
RDebugUtils.currentLine=23527445;
 //BA.debugLineNum = 23527445;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Suerte: \").Po";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Suerte: ")).PopAll();
RDebugUtils.currentLine=23527446;
 //BA.debugLineNum = 23527446;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Suerte).P";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_suerte)).PopAll();
RDebugUtils.currentLine=23527447;
 //BA.debugLineNum = 23527447;BA.debugLine="cs.Append(\"  \")";
_cs.Append(BA.ObjectToCharSequence("  "));
RDebugUtils.currentLine=23527448;
 //BA.debugLineNum = 23527448;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Área: \").PopA";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Área: ")).PopAll();
RDebugUtils.currentLine=23527449;
 //BA.debugLineNum = 23527449;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Area & CR";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_area+__c.CRLF)).PopAll();
RDebugUtils.currentLine=23527451;
 //BA.debugLineNum = 23527451;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Labor: ")).PopAll();
RDebugUtils.currentLine=23527452;
 //BA.debugLineNum = 23527452;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Labor & C";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_labor+__c.CRLF)).PopAll();
RDebugUtils.currentLine=23527454;
 //BA.debugLineNum = 23527454;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha programa: ")).PopAll();
RDebugUtils.currentLine=23527455;
 //BA.debugLineNum = 23527455;BA.debugLine="cs.Color(Colors.Black).Underline.Append(FechaPro";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_fechapro+__c.CRLF)).PopAll();
RDebugUtils.currentLine=23527457;
 //BA.debugLineNum = 23527457;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Días atraso:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Días atraso: ")).PopAll();
RDebugUtils.currentLine=23527458;
 //BA.debugLineNum = 23527458;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Retraso &";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_retraso+__c.CRLF)).PopAll();
RDebugUtils.currentLine=23527460;
 //BA.debugLineNum = 23527460;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Observación:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Observación: ")).PopAll();
RDebugUtils.currentLine=23527461;
 //BA.debugLineNum = 23527461;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Observaci";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_observacion+__c.CRLF)).PopAll();
RDebugUtils.currentLine=23527463;
 //BA.debugLineNum = 23527463;BA.debugLine="LabelLabores.Text = cs";
__ref._labellabores /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=23527465;
 //BA.debugLineNum = 23527465;BA.debugLine="ButtonGrabar.Tag = Consecutivo";
__ref._buttongrabar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=23527466;
 //BA.debugLineNum = 23527466;BA.debugLine="ButtonCancelar.Tag = Consecutivo";
__ref._buttoncancelar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=23527467;
 //BA.debugLineNum = 23527467;BA.debugLine="ButtonAplazar.Tag = Consecutivo";
__ref._buttonaplazar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=23527469;
 //BA.debugLineNum = 23527469;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=23527471;
 //BA.debugLineNum = 23527471;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.listlabores __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="Root.LoadLayout(\"ListLaboresCampo\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListLaboresCampo",ba);
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="GifViewerLoading.SetGif(File.DirAssets,\"carga.gif";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._setgif /*String*/ (null,__c.File.getDirAssets(),"carga.gif");
RDebugUtils.currentLine=23396361;
 //BA.debugLineNum = 23396361;BA.debugLine="End Sub";
return "";
}
public String  _buttonaplazar_click(b4a.example.ef.listlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "buttonaplazar_click", false))
	 {return ((String) Debug.delegate(ba, "buttonaplazar_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
int _consecutivo = 0;
b4a.example.ef.formprogramacampoaplazar _programacampoa = null;
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Private Sub ButtonAplazar_Click";
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="Dim btn As Button = Sender ' Obtiene el botón que";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=23789571;
 //BA.debugLineNum = 23789571;BA.debugLine="Dim consecutivo As Int = btn.Tag ' Extrae el Tag";
_consecutivo = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=23789573;
 //BA.debugLineNum = 23789573;BA.debugLine="Dim programaCampoA As FormProgramaCampoAplazar =";
_programacampoa = (b4a.example.ef.formprogramacampoaplazar)(_b4xpages._getpage /*Object*/ (ba,"FormProgramaCampoAplazar"));
RDebugUtils.currentLine=23789576;
 //BA.debugLineNum = 23789576;BA.debugLine="programaCampoA.SetConsecutivo(consecutivo)";
_programacampoa._setconsecutivo /*String*/ (null,BA.NumberToString(_consecutivo));
RDebugUtils.currentLine=23789578;
 //BA.debugLineNum = 23789578;BA.debugLine="B4XPages.ShowPage(\"FormProgramaCampoAplazar\")";
_b4xpages._showpage /*String*/ (ba,"FormProgramaCampoAplazar");
RDebugUtils.currentLine=23789579;
 //BA.debugLineNum = 23789579;BA.debugLine="End Sub";
return "";
}
public String  _buttoncancelar_click(b4a.example.ef.listlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "buttoncancelar_click", false))
	 {return ((String) Debug.delegate(ba, "buttoncancelar_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
int _consecutivo = 0;
b4a.example.ef.formprogramacampocancelar _programacampocancelar = null;
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Private Sub ButtonCancelar_Click";
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="Dim btn As Button = Sender ' Obtiene el botón que";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="Dim consecutivo As Int = btn.Tag ' Extrae el Tag";
_consecutivo = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=23724037;
 //BA.debugLineNum = 23724037;BA.debugLine="Dim programaCampoCancelar As FormProgramaCampoCan";
_programacampocancelar = (b4a.example.ef.formprogramacampocancelar)(_b4xpages._getpage /*Object*/ (ba,"FormProgramaCampoCancelar"));
RDebugUtils.currentLine=23724040;
 //BA.debugLineNum = 23724040;BA.debugLine="programaCampoCancelar.SetConsecutivo(consecutivo)";
_programacampocancelar._setconsecutivo /*String*/ (null,BA.NumberToString(_consecutivo));
RDebugUtils.currentLine=23724042;
 //BA.debugLineNum = 23724042;BA.debugLine="B4XPages.ShowPage(\"FormProgramaCampoCancelar\")";
_b4xpages._showpage /*String*/ (ba,"FormProgramaCampoCancelar");
RDebugUtils.currentLine=23724043;
 //BA.debugLineNum = 23724043;BA.debugLine="End Sub";
return "";
}
public String  _buttongrabar_click(b4a.example.ef.listlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "buttongrabar_click", false))
	 {return ((String) Debug.delegate(ba, "buttongrabar_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
int _consecutivo = 0;
b4a.example.ef.formprogramacampo _programacampo = null;
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Private Sub ButtonGrabar_Click";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="Dim btn As Button = Sender ' Obtiene el botón que";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="Dim consecutivo As Int = btn.Tag ' Extrae el Tag";
_consecutivo = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="Dim programaCampo As FormProgramaCampo = B4XPages";
_programacampo = (b4a.example.ef.formprogramacampo)(_b4xpages._getpage /*Object*/ (ba,"FormProgramaCampo"));
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="programaCampo.SetConsecutivo(consecutivo)";
_programacampo._setconsecutivo /*String*/ (null,BA.NumberToString(_consecutivo));
RDebugUtils.currentLine=23658506;
 //BA.debugLineNum = 23658506;BA.debugLine="B4XPages.ShowPage(\"FormProgramaCampo\")";
_b4xpages._showpage /*String*/ (ba,"FormProgramaCampo");
RDebugUtils.currentLine=23658508;
 //BA.debugLineNum = 23658508;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.listlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="Private GifViewerLoading As GifViewer";
_gifviewerloading = new b4a.example.ef.gifviewer();
RDebugUtils.currentLine=23265286;
 //BA.debugLineNum = 23265286;BA.debugLine="Private CLV_Labores As CustomListView";
_clv_labores = new b4a.example3.customlistview();
RDebugUtils.currentLine=23265287;
 //BA.debugLineNum = 23265287;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=23265288;
 //BA.debugLineNum = 23265288;BA.debugLine="Private LabelLabores As Label";
_labellabores = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23265289;
 //BA.debugLineNum = 23265289;BA.debugLine="Private ButtonGrabar As Button";
_buttongrabar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=23265290;
 //BA.debugLineNum = 23265290;BA.debugLine="Private ButtonCancelar As Button";
_buttoncancelar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=23265291;
 //BA.debugLineNum = 23265291;BA.debugLine="Private ButtonAplazar As Button";
_buttonaplazar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=23265292;
 //BA.debugLineNum = 23265292;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=23265293;
 //BA.debugLineNum = 23265293;BA.debugLine="Private ConsecutivoSeleccionado As String";
_consecutivoseleccionado = "";
RDebugUtils.currentLine=23265294;
 //BA.debugLineNum = 23265294;BA.debugLine="Private ConsecutivoSeleccionadoCancelar As Str";
_consecutivoseleccionadocancelar = "";
RDebugUtils.currentLine=23265295;
 //BA.debugLineNum = 23265295;BA.debugLine="Private Conse As String";
_conse = "";
RDebugUtils.currentLine=23265297;
 //BA.debugLineNum = 23265297;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.example.ef.listlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="End Sub";
return "";
}
}