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
RDebugUtils.currentLine=51970048;
 //BA.debugLineNum = 51970048;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=51970049;
 //BA.debugLineNum = 51970049;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=51970051;
 //BA.debugLineNum = 51970051;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=52101121;
 //BA.debugLineNum = 52101121;BA.debugLine="CLV_Labores.Clear";
__ref._clv_labores /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=52101122;
 //BA.debugLineNum = 52101122;BA.debugLine="GifViewerLoading.Start";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._start /*String*/ (null);
RDebugUtils.currentLine=52101123;
 //BA.debugLineNum = 52101123;BA.debugLine="Dim nombreEMPRESA As String";
_nombreempresa = "";
RDebugUtils.currentLine=52101124;
 //BA.debugLineNum = 52101124;BA.debugLine="Dim nombreHacienda As String";
_nombrehacienda = "";
RDebugUtils.currentLine=52101125;
 //BA.debugLineNum = 52101125;BA.debugLine="Dim nombreLabor As String";
_nombrelabor = "";
RDebugUtils.currentLine=52101128;
 //BA.debugLineNum = 52101128;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=52101129;
 //BA.debugLineNum = 52101129;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=52101130;
 //BA.debugLineNum = 52101130;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_prog";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_programalabores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=52101133;
 //BA.debugLineNum = 52101133;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 46;
return;
case 46:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=52101134;
 //BA.debugLineNum = 52101134;BA.debugLine="Dim counter As Int";
_counter = 0;
RDebugUtils.currentLine=52101135;
 //BA.debugLineNum = 52101135;BA.debugLine="counter = 0";
_counter = (int) (0);
RDebugUtils.currentLine=52101138;
 //BA.debugLineNum = 52101138;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=52101139;
 //BA.debugLineNum = 52101139;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=52101140;
 //BA.debugLineNum = 52101140;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=52101142;
 //BA.debugLineNum = 52101142;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 47;
return;
case 47:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=52101145;
 //BA.debugLineNum = 52101145;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=52101147;
 //BA.debugLineNum = 52101147;BA.debugLine="Dim Consecutivo As Int = row(0)";
_consecutivo = (int)(BA.ObjectToNumber(_row[(int) (0)]));
RDebugUtils.currentLine=52101150;
 //BA.debugLineNum = 52101150;BA.debugLine="Dim Nit_Programa_Labor As String = row(1)";
_nit_programa_labor = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=52101153;
 //BA.debugLineNum = 52101153;BA.debugLine="Dim Hacienda_Programa_Labor As String = row(2)";
_hacienda_programa_labor = BA.ObjectToString(_row[(int) (2)]);
RDebugUtils.currentLine=52101156;
 //BA.debugLineNum = 52101156;BA.debugLine="Dim Suerte_Programa_Labor As String = row(3)";
_suerte_programa_labor = BA.ObjectToString(_row[(int) (3)]);
RDebugUtils.currentLine=52101159;
 //BA.debugLineNum = 52101159;BA.debugLine="Dim Fecha_Programa_Labor As String = row(4)";
_fecha_programa_labor = BA.ObjectToString(_row[(int) (4)]);
RDebugUtils.currentLine=52101162;
 //BA.debugLineNum = 52101162;BA.debugLine="Dim Destino_Programa_Labor As String = row(5)";
_destino_programa_labor = BA.ObjectToString(_row[(int) (5)]);
RDebugUtils.currentLine=52101165;
 //BA.debugLineNum = 52101165;BA.debugLine="Dim Area_Programa_Labor As String = row(6)";
_area_programa_labor = BA.ObjectToString(_row[(int) (6)]);
RDebugUtils.currentLine=52101168;
 //BA.debugLineNum = 52101168;BA.debugLine="Dim Observacion As String = row(7)";
_observacion = BA.ObjectToString(_row[(int) (7)]);
RDebugUtils.currentLine=52101171;
 //BA.debugLineNum = 52101171;BA.debugLine="Dim partesFecha() As String";
_partesfecha = new String[(int) (0)];
java.util.Arrays.fill(_partesfecha,"");
RDebugUtils.currentLine=52101172;
 //BA.debugLineNum = 52101172;BA.debugLine="partesFecha = Regex.Split(\" \", Fecha_Programa_L";
_partesfecha = parent.__c.Regex.Split(" ",_fecha_programa_labor);
RDebugUtils.currentLine=52101173;
 //BA.debugLineNum = 52101173;BA.debugLine="Fecha_Programa_Labor = partesFecha(0)";
_fecha_programa_labor = _partesfecha[(int) (0)];
RDebugUtils.currentLine=52101187;
 //BA.debugLineNum = 52101187;BA.debugLine="Dim cmdNombre As DBCommand = CreateCommand(\"sel";
_cmdnombre = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit_details",new Object[]{(Object)(_nit_programa_labor)});
RDebugUtils.currentLine=52101188;
 //BA.debugLineNum = 52101188;BA.debugLine="Wait For (Req.ExecuteQuery(cmdNombre, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdnombre,(int) (0),parent.__c.Null)));
this.state = 50;
return;
case 50:
//C
this.state = 7;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=52101190;
 //BA.debugLineNum = 52101190;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=52101191;
 //BA.debugLineNum = 52101191;BA.debugLine="Req.HandleJobAsync(j2, \"req_nombre\")";
_req._handlejobasync /*void*/ (null,_j2,"req_nombre");
RDebugUtils.currentLine=52101192;
 //BA.debugLineNum = 52101192;BA.debugLine="Wait For (Req) req_nombre_Result(resNombre As";
parent.__c.WaitFor("req_nombre_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 51;
return;
case 51:
//C
this.state = 10;
_resnombre = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=52101194;
 //BA.debugLineNum = 52101194;BA.debugLine="For Each rowNombre() As Object In resNombre.Ro";
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
RDebugUtils.currentLine=52101195;
 //BA.debugLineNum = 52101195;BA.debugLine="nombreEMPRESA = sf.Trim(rowNombre(0)) ' El pr";
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
RDebugUtils.currentLine=52101198;
 //BA.debugLineNum = 52101198;BA.debugLine="Log(\"ERROR al obtener el nombre del cliente: \"";
parent.__c.LogImpl("052101198","ERROR al obtener el nombre del cliente: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=52101202;
 //BA.debugLineNum = 52101202;BA.debugLine="Dim cmdHacienda As DBCommand = CreateCommand(\"s";
_cmdhacienda = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_hacienda_details",new Object[]{(Object)(_hacienda_programa_labor)});
RDebugUtils.currentLine=52101203;
 //BA.debugLineNum = 52101203;BA.debugLine="Wait For (Req.ExecuteQuery(cmdHacienda, 0, Null";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdhacienda,(int) (0),parent.__c.Null)));
this.state = 54;
return;
case 54:
//C
this.state = 17;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=52101205;
 //BA.debugLineNum = 52101205;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=52101206;
 //BA.debugLineNum = 52101206;BA.debugLine="Req.HandleJobAsync(j3, \"req_hacienda\")";
_req._handlejobasync /*void*/ (null,_j3,"req_hacienda");
RDebugUtils.currentLine=52101207;
 //BA.debugLineNum = 52101207;BA.debugLine="Wait For (Req) req_hacienda_Result(resHacienda";
parent.__c.WaitFor("req_hacienda_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 55;
return;
case 55:
//C
this.state = 20;
_reshacienda = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=52101209;
 //BA.debugLineNum = 52101209;BA.debugLine="For Each rowHacienda() As Object In resHaciend";
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
RDebugUtils.currentLine=52101210;
 //BA.debugLineNum = 52101210;BA.debugLine="nombreHacienda = sf.Trim(rowHacienda(0)) ' El";
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
RDebugUtils.currentLine=52101213;
 //BA.debugLineNum = 52101213;BA.debugLine="Log(\"ERROR al obtener el nombre de la hacienda";
parent.__c.LogImpl("052101213","ERROR al obtener el nombre de la hacienda: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=52101217;
 //BA.debugLineNum = 52101217;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"sele";
_cmdlabor = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_programa_labores_destino",new Object[]{(Object)(_destino_programa_labor)});
RDebugUtils.currentLine=52101218;
 //BA.debugLineNum = 52101218;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 58;
return;
case 58:
//C
this.state = 27;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=52101220;
 //BA.debugLineNum = 52101220;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=52101221;
 //BA.debugLineNum = 52101221;BA.debugLine="Req.HandleJobAsync(j4, \"req_labor\")";
_req._handlejobasync /*void*/ (null,_j4,"req_labor");
RDebugUtils.currentLine=52101222;
 //BA.debugLineNum = 52101222;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DB";
parent.__c.WaitFor("req_labor_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listlabores", "b4xpage_appear"), (Object)(_req));
this.state = 59;
return;
case 59:
//C
this.state = 30;
_reslabor = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=52101224;
 //BA.debugLineNum = 52101224;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
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
RDebugUtils.currentLine=52101225;
 //BA.debugLineNum = 52101225;BA.debugLine="nombreLabor = sf.Trim(rowLabor(0)) ' El prime";
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
RDebugUtils.currentLine=52101228;
 //BA.debugLineNum = 52101228;BA.debugLine="Log(\"ERROR al obtener el nombre de la hacienda";
parent.__c.LogImpl("052101228","ERROR al obtener el nombre de la hacienda: "+_j3._errormessage /*String*/ ,0);
 if (true) break;
;
RDebugUtils.currentLine=52101232;
 //BA.debugLineNum = 52101232;BA.debugLine="Try";

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
RDebugUtils.currentLine=52101234;
 //BA.debugLineNum = 52101234;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=52101235;
 //BA.debugLineNum = 52101235;BA.debugLine="Dim fecha As Long = DateTime.DateParse(Fecha_P";
_fecha = parent.__c.DateTime.DateParse(_fecha_programa_labor);
RDebugUtils.currentLine=52101236;
 //BA.debugLineNum = 52101236;BA.debugLine="Dim fechaUNIX As Long = DateUtils.TicksToUnixT";
_fechaunix = parent._dateutils._tickstounixtime(ba,_fecha);
RDebugUtils.currentLine=52101240;
 //BA.debugLineNum = 52101240;BA.debugLine="Dim fechaActual As Long = DateTime.Now";
_fechaactual = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=52101241;
 //BA.debugLineNum = 52101241;BA.debugLine="Dim fechaUNIXACTUAL As Long = DateUtils.TicksT";
_fechaunixactual = parent._dateutils._tickstounixtime(ba,_fechaactual);
RDebugUtils.currentLine=52101245;
 //BA.debugLineNum = 52101245;BA.debugLine="Dim diferenciaSegundos As Long = fechaUNIXACTU";
_diferenciasegundos = (long) (_fechaunixactual-_fechaunix);
RDebugUtils.currentLine=52101248;
 //BA.debugLineNum = 52101248;BA.debugLine="Dim diferenciaDias As Int = diferenciaSegundos";
_diferenciadias = (int) (_diferenciasegundos/(double)86400);
 if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 0;
RDebugUtils.currentLine=52101254;
 //BA.debugLineNum = 52101254;BA.debugLine="Log(\"Error: Formato de fecha inválido o no se";
parent.__c.LogImpl("052101254","Error: Formato de fecha inválido o no se pudo parsear la fecha.",0);
 if (true) break;
if (true) break;

case 41:
//C
this.state = 49;
this.catchState = 0;
;
RDebugUtils.currentLine=52101257;
 //BA.debugLineNum = 52101257;BA.debugLine="CLV_Labores.Add(CreateItem(counter,Consecutivo,";
__ref._clv_labores /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,BA.NumberToString(_counter),BA.NumberToString(_consecutivo),_nombreempresa,_nombrehacienda,_suerte_programa_labor,_area_programa_labor,_nombrelabor,_fecha_programa_labor,BA.NumberToString(_diferenciadias),_observacion).getObject())),(Object)(_consecutivo));
RDebugUtils.currentLine=52101258;
 //BA.debugLineNum = 52101258;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
 if (true) break;
if (true) break;

case 42:
//C
this.state = 45;
;
RDebugUtils.currentLine=52101261;
 //BA.debugLineNum = 52101261;BA.debugLine="GifViewerLoading.Stop";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._stop /*String*/ (null);
 if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=52101263;
 //BA.debugLineNum = 52101263;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("052101263","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 45:
//C
this.state = -1;
;
RDebugUtils.currentLine=52101265;
 //BA.debugLineNum = 52101265;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=52101267;
 //BA.debugLineNum = 52101267;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=52232192;
 //BA.debugLineNum = 52232192;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=52232193;
 //BA.debugLineNum = 52232193;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=52232194;
 //BA.debugLineNum = 52232194;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=52232195;
 //BA.debugLineNum = 52232195;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=52232196;
 //BA.debugLineNum = 52232196;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=52232197;
 //BA.debugLineNum = 52232197;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=52232198;
 //BA.debugLineNum = 52232198;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.listlabores __ref,String _position,String _consecutivo,String _nit,String _hacienda,String _suerte,String _area,String _labor,String _fechapro,String _retraso,String _observacion) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", new Object[] {_position,_consecutivo,_nit,_hacienda,_suerte,_area,_labor,_fechapro,_retraso,_observacion}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=52166656;
 //BA.debugLineNum = 52166656;BA.debugLine="Private Sub CreateItem(Position As String,Consecut";
RDebugUtils.currentLine=52166658;
 //BA.debugLineNum = 52166658;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=52166659;
 //BA.debugLineNum = 52166659;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 420dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (420)));
RDebugUtils.currentLine=52166662;
 //BA.debugLineNum = 52166662;BA.debugLine="panel.LoadLayout(\"CardLabores\")";
_panel.LoadLayout("CardLabores",ba);
RDebugUtils.currentLine=52166664;
 //BA.debugLineNum = 52166664;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=52166665;
 //BA.debugLineNum = 52166665;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=52166668;
 //BA.debugLineNum = 52166668;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Consecutivo: ")).PopAll();
RDebugUtils.currentLine=52166669;
 //BA.debugLineNum = 52166669;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Consecuti";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_consecutivo+__c.CRLF)).PopAll();
RDebugUtils.currentLine=52166671;
 //BA.debugLineNum = 52166671;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Nit: \").PopAl";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Nit: ")).PopAll();
RDebugUtils.currentLine=52166672;
 //BA.debugLineNum = 52166672;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Nit & CRL";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).PopAll();
RDebugUtils.currentLine=52166674;
 //BA.debugLineNum = 52166674;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).PopAll();
RDebugUtils.currentLine=52166675;
 //BA.debugLineNum = 52166675;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Hacienda";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).PopAll();
RDebugUtils.currentLine=52166677;
 //BA.debugLineNum = 52166677;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Suerte: \").Po";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Suerte: ")).PopAll();
RDebugUtils.currentLine=52166678;
 //BA.debugLineNum = 52166678;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Suerte).P";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_suerte)).PopAll();
RDebugUtils.currentLine=52166679;
 //BA.debugLineNum = 52166679;BA.debugLine="cs.Append(\"  \")";
_cs.Append(BA.ObjectToCharSequence("  "));
RDebugUtils.currentLine=52166680;
 //BA.debugLineNum = 52166680;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Área: \").PopA";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Área: ")).PopAll();
RDebugUtils.currentLine=52166681;
 //BA.debugLineNum = 52166681;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Area & CR";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_area+__c.CRLF)).PopAll();
RDebugUtils.currentLine=52166683;
 //BA.debugLineNum = 52166683;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Labor: ")).PopAll();
RDebugUtils.currentLine=52166684;
 //BA.debugLineNum = 52166684;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Labor & C";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_labor+__c.CRLF)).PopAll();
RDebugUtils.currentLine=52166686;
 //BA.debugLineNum = 52166686;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha programa: ")).PopAll();
RDebugUtils.currentLine=52166687;
 //BA.debugLineNum = 52166687;BA.debugLine="cs.Color(Colors.Black).Underline.Append(FechaPro";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_fechapro+__c.CRLF)).PopAll();
RDebugUtils.currentLine=52166689;
 //BA.debugLineNum = 52166689;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Días atraso:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Días atraso: ")).PopAll();
RDebugUtils.currentLine=52166690;
 //BA.debugLineNum = 52166690;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Retraso &";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_retraso+__c.CRLF)).PopAll();
RDebugUtils.currentLine=52166692;
 //BA.debugLineNum = 52166692;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Observación:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Observación: ")).PopAll();
RDebugUtils.currentLine=52166693;
 //BA.debugLineNum = 52166693;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Observaci";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_observacion+__c.CRLF)).PopAll();
RDebugUtils.currentLine=52166695;
 //BA.debugLineNum = 52166695;BA.debugLine="LabelLabores.Text = cs";
__ref._labellabores /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=52166697;
 //BA.debugLineNum = 52166697;BA.debugLine="ButtonGrabar.Tag = Consecutivo";
__ref._buttongrabar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=52166698;
 //BA.debugLineNum = 52166698;BA.debugLine="ButtonCancelar.Tag = Consecutivo";
__ref._buttoncancelar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=52166699;
 //BA.debugLineNum = 52166699;BA.debugLine="ButtonAplazar.Tag = Consecutivo";
__ref._buttonaplazar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=52166701;
 //BA.debugLineNum = 52166701;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=52166703;
 //BA.debugLineNum = 52166703;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.listlabores __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=52035584;
 //BA.debugLineNum = 52035584;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=52035585;
 //BA.debugLineNum = 52035585;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=52035586;
 //BA.debugLineNum = 52035586;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=52035587;
 //BA.debugLineNum = 52035587;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=52035589;
 //BA.debugLineNum = 52035589;BA.debugLine="Root.LoadLayout(\"ListLaboresCampo\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListLaboresCampo",ba);
RDebugUtils.currentLine=52035590;
 //BA.debugLineNum = 52035590;BA.debugLine="GifViewerLoading.SetGif(File.DirAssets,\"carga.gif";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._setgif /*String*/ (null,__c.File.getDirAssets(),"carga.gif");
RDebugUtils.currentLine=52035593;
 //BA.debugLineNum = 52035593;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=52428800;
 //BA.debugLineNum = 52428800;BA.debugLine="Private Sub ButtonAplazar_Click";
RDebugUtils.currentLine=52428802;
 //BA.debugLineNum = 52428802;BA.debugLine="Dim btn As Button = Sender ' Obtiene el botón que";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=52428803;
 //BA.debugLineNum = 52428803;BA.debugLine="Dim consecutivo As Int = btn.Tag ' Extrae el Tag";
_consecutivo = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=52428805;
 //BA.debugLineNum = 52428805;BA.debugLine="Dim programaCampoA As FormProgramaCampoAplazar =";
_programacampoa = (b4a.example.ef.formprogramacampoaplazar)(_b4xpages._getpage /*Object*/ (ba,"FormProgramaCampoAplazar"));
RDebugUtils.currentLine=52428808;
 //BA.debugLineNum = 52428808;BA.debugLine="programaCampoA.SetConsecutivo(consecutivo)";
_programacampoa._setconsecutivo /*String*/ (null,BA.NumberToString(_consecutivo));
RDebugUtils.currentLine=52428810;
 //BA.debugLineNum = 52428810;BA.debugLine="B4XPages.ShowPage(\"FormProgramaCampoAplazar\")";
_b4xpages._showpage /*String*/ (ba,"FormProgramaCampoAplazar");
RDebugUtils.currentLine=52428811;
 //BA.debugLineNum = 52428811;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=52363264;
 //BA.debugLineNum = 52363264;BA.debugLine="Private Sub ButtonCancelar_Click";
RDebugUtils.currentLine=52363266;
 //BA.debugLineNum = 52363266;BA.debugLine="Dim btn As Button = Sender ' Obtiene el botón que";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=52363267;
 //BA.debugLineNum = 52363267;BA.debugLine="Dim consecutivo As Int = btn.Tag ' Extrae el Tag";
_consecutivo = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=52363269;
 //BA.debugLineNum = 52363269;BA.debugLine="Dim programaCampoCancelar As FormProgramaCampoCan";
_programacampocancelar = (b4a.example.ef.formprogramacampocancelar)(_b4xpages._getpage /*Object*/ (ba,"FormProgramaCampoCancelar"));
RDebugUtils.currentLine=52363272;
 //BA.debugLineNum = 52363272;BA.debugLine="programaCampoCancelar.SetConsecutivo(consecutivo)";
_programacampocancelar._setconsecutivo /*String*/ (null,BA.NumberToString(_consecutivo));
RDebugUtils.currentLine=52363274;
 //BA.debugLineNum = 52363274;BA.debugLine="B4XPages.ShowPage(\"FormProgramaCampoCancelar\")";
_b4xpages._showpage /*String*/ (ba,"FormProgramaCampoCancelar");
RDebugUtils.currentLine=52363275;
 //BA.debugLineNum = 52363275;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=52297728;
 //BA.debugLineNum = 52297728;BA.debugLine="Private Sub ButtonGrabar_Click";
RDebugUtils.currentLine=52297729;
 //BA.debugLineNum = 52297729;BA.debugLine="Dim btn As Button = Sender ' Obtiene el botón que";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=52297730;
 //BA.debugLineNum = 52297730;BA.debugLine="Dim consecutivo As Int = btn.Tag ' Extrae el Tag";
_consecutivo = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=52297733;
 //BA.debugLineNum = 52297733;BA.debugLine="Dim programaCampo As FormProgramaCampo = B4XPages";
_programacampo = (b4a.example.ef.formprogramacampo)(_b4xpages._getpage /*Object*/ (ba,"FormProgramaCampo"));
RDebugUtils.currentLine=52297736;
 //BA.debugLineNum = 52297736;BA.debugLine="programaCampo.SetConsecutivo(consecutivo)";
_programacampo._setconsecutivo /*String*/ (null,BA.NumberToString(_consecutivo));
RDebugUtils.currentLine=52297738;
 //BA.debugLineNum = 52297738;BA.debugLine="B4XPages.ShowPage(\"FormProgramaCampo\")";
_b4xpages._showpage /*String*/ (ba,"FormProgramaCampo");
RDebugUtils.currentLine=52297740;
 //BA.debugLineNum = 52297740;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.listlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listlabores";
RDebugUtils.currentLine=51904512;
 //BA.debugLineNum = 51904512;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=51904513;
 //BA.debugLineNum = 51904513;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=51904514;
 //BA.debugLineNum = 51904514;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=51904515;
 //BA.debugLineNum = 51904515;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=51904516;
 //BA.debugLineNum = 51904516;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=51904517;
 //BA.debugLineNum = 51904517;BA.debugLine="Private GifViewerLoading As GifViewer";
_gifviewerloading = new b4a.example.ef.gifviewer();
RDebugUtils.currentLine=51904518;
 //BA.debugLineNum = 51904518;BA.debugLine="Private CLV_Labores As CustomListView";
_clv_labores = new b4a.example3.customlistview();
RDebugUtils.currentLine=51904519;
 //BA.debugLineNum = 51904519;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=51904520;
 //BA.debugLineNum = 51904520;BA.debugLine="Private LabelLabores As Label";
_labellabores = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=51904521;
 //BA.debugLineNum = 51904521;BA.debugLine="Private ButtonGrabar As Button";
_buttongrabar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=51904522;
 //BA.debugLineNum = 51904522;BA.debugLine="Private ButtonCancelar As Button";
_buttoncancelar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=51904523;
 //BA.debugLineNum = 51904523;BA.debugLine="Private ButtonAplazar As Button";
_buttonaplazar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=51904524;
 //BA.debugLineNum = 51904524;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=51904525;
 //BA.debugLineNum = 51904525;BA.debugLine="Private ConsecutivoSeleccionado As String";
_consecutivoseleccionado = "";
RDebugUtils.currentLine=51904526;
 //BA.debugLineNum = 51904526;BA.debugLine="Private ConsecutivoSeleccionadoCancelar As Str";
_consecutivoseleccionadocancelar = "";
RDebugUtils.currentLine=51904527;
 //BA.debugLineNum = 51904527;BA.debugLine="Private Conse As String";
_conse = "";
RDebugUtils.currentLine=51904529;
 //BA.debugLineNum = 51904529;BA.debugLine="End Sub";
return "";
}
}