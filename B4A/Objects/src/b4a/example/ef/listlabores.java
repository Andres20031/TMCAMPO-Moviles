package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class listlabores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.listlabores");
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
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.listlabores parent) {
this.parent = parent;
}
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 35;BA.debugLine="CLV_Labores.Clear";
parent._clv_labores._clear();
 //BA.debugLineNum = 36;BA.debugLine="GifViewerLoading.Start";
parent._gifviewerloading._start /*String*/ ();
 //BA.debugLineNum = 37;BA.debugLine="Dim nombreEMPRESA As String";
_nombreempresa = "";
 //BA.debugLineNum = 38;BA.debugLine="Dim nombreHacienda As String";
_nombrehacienda = "";
 //BA.debugLineNum = 39;BA.debugLine="Dim nombreLabor As String";
_nombrelabor = "";
 //BA.debugLineNum = 42;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 43;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 44;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_prog";
_cmd = parent._createcommand("select_programalabores",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 47;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 46;
return;
case 46:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 48;BA.debugLine="Dim counter As Int";
_counter = 0;
 //BA.debugLineNum = 49;BA.debugLine="counter = 0";
_counter = (int) (0);
 //BA.debugLineNum = 52;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 53;BA.debugLine="sf.Initialize";
parent._sf._vvv1(ba);
 //BA.debugLineNum = 54;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 56;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 47;
return;
case 47:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 59;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 61;BA.debugLine="Dim Consecutivo As Int = row(0)";
_consecutivo = (int)(BA.ObjectToNumber(_row[(int) (0)]));
 //BA.debugLineNum = 64;BA.debugLine="Dim Nit_Programa_Labor As String = row(1)";
_nit_programa_labor = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 67;BA.debugLine="Dim Hacienda_Programa_Labor As String = row(2)";
_hacienda_programa_labor = BA.ObjectToString(_row[(int) (2)]);
 //BA.debugLineNum = 70;BA.debugLine="Dim Suerte_Programa_Labor As String = row(3)";
_suerte_programa_labor = BA.ObjectToString(_row[(int) (3)]);
 //BA.debugLineNum = 73;BA.debugLine="Dim Fecha_Programa_Labor As String = row(4)";
_fecha_programa_labor = BA.ObjectToString(_row[(int) (4)]);
 //BA.debugLineNum = 76;BA.debugLine="Dim Destino_Programa_Labor As String = row(5)";
_destino_programa_labor = BA.ObjectToString(_row[(int) (5)]);
 //BA.debugLineNum = 79;BA.debugLine="Dim Area_Programa_Labor As String = row(6)";
_area_programa_labor = BA.ObjectToString(_row[(int) (6)]);
 //BA.debugLineNum = 82;BA.debugLine="Dim Observacion As String = row(7)";
_observacion = BA.ObjectToString(_row[(int) (7)]);
 //BA.debugLineNum = 85;BA.debugLine="Dim partesFecha() As String";
_partesfecha = new String[(int) (0)];
java.util.Arrays.fill(_partesfecha,"");
 //BA.debugLineNum = 86;BA.debugLine="partesFecha = Regex.Split(\" \", Fecha_Programa_L";
_partesfecha = parent.__c.Regex.Split(" ",_fecha_programa_labor);
 //BA.debugLineNum = 87;BA.debugLine="Fecha_Programa_Labor = partesFecha(0)";
_fecha_programa_labor = _partesfecha[(int) (0)];
 //BA.debugLineNum = 89;BA.debugLine="Log(\"Contador: \" & counter)";
parent.__c.LogImpl("72621495","Contador: "+BA.NumberToString(_counter),0);
 //BA.debugLineNum = 90;BA.debugLine="Log(\"Consecutivo: \" & Consecutivo)";
parent.__c.LogImpl("72621496","Consecutivo: "+BA.NumberToString(_consecutivo),0);
 //BA.debugLineNum = 91;BA.debugLine="Log(\"Nit_Programa_Labor: \" & Nit_Programa_Labor";
parent.__c.LogImpl("72621497","Nit_Programa_Labor: "+_nit_programa_labor,0);
 //BA.debugLineNum = 92;BA.debugLine="Log(\"Hacienda_Programa_Labor: \" & Hacienda_Prog";
parent.__c.LogImpl("72621498","Hacienda_Programa_Labor: "+_hacienda_programa_labor,0);
 //BA.debugLineNum = 93;BA.debugLine="Log(\"Suerte_Programa_Labor: \" & Suerte_Programa";
parent.__c.LogImpl("72621499","Suerte_Programa_Labor: "+_suerte_programa_labor,0);
 //BA.debugLineNum = 94;BA.debugLine="Log(\"Fecha_Programa_Labor: \" & Fecha_Programa_L";
parent.__c.LogImpl("72621500","Fecha_Programa_Labor: "+_fecha_programa_labor,0);
 //BA.debugLineNum = 95;BA.debugLine="Log(\"Destino_Programa_Labor: \" & Destino_Progra";
parent.__c.LogImpl("72621501","Destino_Programa_Labor: "+_destino_programa_labor,0);
 //BA.debugLineNum = 96;BA.debugLine="Log(\"Area_Programa_Labor: \" & Area_Programa_Lab";
parent.__c.LogImpl("72621502","Area_Programa_Labor: "+_area_programa_labor,0);
 //BA.debugLineNum = 97;BA.debugLine="Log(\"Observacion: \"& Observacion)";
parent.__c.LogImpl("72621503","Observacion: "+_observacion,0);
 //BA.debugLineNum = 101;BA.debugLine="Dim cmdNombre As DBCommand = CreateCommand(\"sel";
_cmdnombre = parent._createcommand("select_nit_details",new Object[]{(Object)(_nit_programa_labor)});
 //BA.debugLineNum = 102;BA.debugLine="Wait For (Req.ExecuteQuery(cmdNombre, 0, Null))";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdnombre,(int) (0),parent.__c.Null)));
this.state = 50;
return;
case 50:
//C
this.state = 7;
_j2 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 104;BA.debugLine="If j2.Success Then";
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
 //BA.debugLineNum = 105;BA.debugLine="Req.HandleJobAsync(j2, \"req_nombre\")";
_req._handlejobasync /*void*/ (_j2,"req_nombre");
 //BA.debugLineNum = 106;BA.debugLine="Wait For (Req) req_nombre_Result(resNombre As";
parent.__c.WaitFor("req_nombre_result", ba, this, (Object)(_req));
this.state = 51;
return;
case 51:
//C
this.state = 10;
_resnombre = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 108;BA.debugLine="For Each rowNombre() As Object In resNombre.Ro";
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
 //BA.debugLineNum = 109;BA.debugLine="nombreEMPRESA = sf.Trim(rowNombre(0)) ' El pr";
_nombreempresa = parent._sf._vvvvv7(BA.ObjectToString(_rownombre[(int) (0)]));
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
 //BA.debugLineNum = 112;BA.debugLine="Log(\"ERROR al obtener el nombre del cliente: \"";
parent.__c.LogImpl("72621518","ERROR al obtener el nombre del cliente: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 116;BA.debugLine="Dim cmdHacienda As DBCommand = CreateCommand(\"s";
_cmdhacienda = parent._createcommand("select_hacienda_details",new Object[]{(Object)(_hacienda_programa_labor)});
 //BA.debugLineNum = 117;BA.debugLine="Wait For (Req.ExecuteQuery(cmdHacienda, 0, Null";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdhacienda,(int) (0),parent.__c.Null)));
this.state = 54;
return;
case 54:
//C
this.state = 17;
_j3 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 119;BA.debugLine="If j3.Success Then";
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
 //BA.debugLineNum = 120;BA.debugLine="Req.HandleJobAsync(j3, \"req_hacienda\")";
_req._handlejobasync /*void*/ (_j3,"req_hacienda");
 //BA.debugLineNum = 121;BA.debugLine="Wait For (Req) req_hacienda_Result(resHacienda";
parent.__c.WaitFor("req_hacienda_result", ba, this, (Object)(_req));
this.state = 55;
return;
case 55:
//C
this.state = 20;
_reshacienda = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 123;BA.debugLine="For Each rowHacienda() As Object In resHaciend";
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
 //BA.debugLineNum = 124;BA.debugLine="nombreHacienda = sf.Trim(rowHacienda(0)) ' El";
_nombrehacienda = parent._sf._vvvvv7(BA.ObjectToString(_rowhacienda[(int) (0)]));
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
 //BA.debugLineNum = 127;BA.debugLine="Log(\"ERROR al obtener el nombre de la hacienda";
parent.__c.LogImpl("72621533","ERROR al obtener el nombre de la hacienda: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 26:
//C
this.state = 27;
;
 //BA.debugLineNum = 131;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"sele";
_cmdlabor = parent._createcommand("select_programa_labores_destino",new Object[]{(Object)(_destino_programa_labor)});
 //BA.debugLineNum = 132;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null))";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 58;
return;
case 58:
//C
this.state = 27;
_j4 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 134;BA.debugLine="If j4.Success Then";
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
 //BA.debugLineNum = 135;BA.debugLine="Req.HandleJobAsync(j4, \"req_labor\")";
_req._handlejobasync /*void*/ (_j4,"req_labor");
 //BA.debugLineNum = 136;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DB";
parent.__c.WaitFor("req_labor_result", ba, this, (Object)(_req));
this.state = 59;
return;
case 59:
//C
this.state = 30;
_reslabor = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 138;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
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
 //BA.debugLineNum = 139;BA.debugLine="nombreLabor = sf.Trim(rowLabor(0)) ' El prime";
_nombrelabor = parent._sf._vvvvv7(BA.ObjectToString(_rowlabor[(int) (0)]));
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
 //BA.debugLineNum = 142;BA.debugLine="Log(\"ERROR al obtener el nombre de la hacienda";
parent.__c.LogImpl("72621548","ERROR al obtener el nombre de la hacienda: "+_j3._errormessage /*String*/ ,0);
 if (true) break;
;
 //BA.debugLineNum = 146;BA.debugLine="Try";

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
 //BA.debugLineNum = 148;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 149;BA.debugLine="Dim fecha As Long = DateTime.DateParse(Fecha_P";
_fecha = parent.__c.DateTime.DateParse(_fecha_programa_labor);
 //BA.debugLineNum = 150;BA.debugLine="Dim fechaUNIX As Long = DateUtils.TicksToUnixT";
_fechaunix = parent._dateutils._tickstounixtime(ba,_fecha);
 //BA.debugLineNum = 151;BA.debugLine="Log(\"LA FECHA EN LONG: \"&fechaUNIX)";
parent.__c.LogImpl("72621557","LA FECHA EN LONG: "+BA.NumberToString(_fechaunix),0);
 //BA.debugLineNum = 154;BA.debugLine="Dim fechaActual As Long = DateTime.Now";
_fechaactual = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 155;BA.debugLine="Dim fechaUNIXACTUAL As Long = DateUtils.TicksT";
_fechaunixactual = parent._dateutils._tickstounixtime(ba,_fechaactual);
 //BA.debugLineNum = 156;BA.debugLine="Log(\"LA FECHA ACTUAL: \"&fechaUNIXACTUAL)";
parent.__c.LogImpl("72621562","LA FECHA ACTUAL: "+BA.NumberToString(_fechaunixactual),0);
 //BA.debugLineNum = 159;BA.debugLine="Dim diferenciaSegundos As Long = fechaUNIXACTU";
_diferenciasegundos = (long) (_fechaunixactual-_fechaunix);
 //BA.debugLineNum = 162;BA.debugLine="Dim diferenciaDias As Int = diferenciaSegundos";
_diferenciadias = (int) (_diferenciasegundos/(double)86400);
 //BA.debugLineNum = 165;BA.debugLine="Log(\"Días de diferencia: \" & diferenciaDias)";
parent.__c.LogImpl("72621571","Días de diferencia: "+BA.NumberToString(_diferenciadias),0);
 if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 0;
 //BA.debugLineNum = 168;BA.debugLine="Log(\"Error: Formato de fecha inválido o no se";
parent.__c.LogImpl("72621574","Error: Formato de fecha inválido o no se pudo parsear la fecha.",0);
 if (true) break;
if (true) break;

case 41:
//C
this.state = 49;
this.catchState = 0;
;
 //BA.debugLineNum = 171;BA.debugLine="CLV_Labores.Add(CreateItem(counter,Consecutivo,";
parent._clv_labores._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createitem(BA.NumberToString(_counter),BA.NumberToString(_consecutivo),_nombreempresa,_nombrehacienda,_suerte_programa_labor,_area_programa_labor,_nombrelabor,_fecha_programa_labor,BA.NumberToString(_diferenciadias),_observacion).getObject())),(Object)(_consecutivo));
 //BA.debugLineNum = 172;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
 if (true) break;
if (true) break;

case 42:
//C
this.state = 45;
;
 //BA.debugLineNum = 175;BA.debugLine="GifViewerLoading.Stop";
parent._gifviewerloading._stop /*String*/ ();
 if (true) break;

case 44:
//C
this.state = 45;
 //BA.debugLineNum = 177;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("72621583","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 45:
//C
this.state = -1;
;
 //BA.debugLineNum = 179;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
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
public void  _jobdone(b4a.example.ef.httpjob _j) throws Exception{
}
public void  _req_result(b4a.example.ef.main._dbresult _res) throws Exception{
}
public void  _req_nombre_result(b4a.example.ef.main._dbresult _resnombre) throws Exception{
}
public void  _req_hacienda_result(b4a.example.ef.main._dbresult _reshacienda) throws Exception{
}
public void  _req_labor_result(b4a.example.ef.main._dbresult _reslabor) throws Exception{
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 24;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 25;BA.debugLine="utilClass.Initialize";
_utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 26;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
_utilclass._setstatusbarcolor /*String*/ (__c.Colors.White,__c.Colors.White);
 //BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"ListLaboresCampo\")";
_root.LoadLayout("ListLaboresCampo",ba);
 //BA.debugLineNum = 29;BA.debugLine="GifViewerLoading.SetGif(File.DirAssets,\"carga.gif";
_gifviewerloading._setgif /*String*/ (__c.File.getDirAssets(),"carga.gif");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _buttonaplazar_click() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Private Sub ButtonAplazar_Click";
 //BA.debugLineNum = 251;BA.debugLine="B4XPages.ShowPage(\"FormProgramaCampoAplazar\")";
_b4xpages._showpage /*String*/ (ba,"FormProgramaCampoAplazar");
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return "";
}
public String  _buttoncancelar_click() throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Private Sub ButtonCancelar_Click";
 //BA.debugLineNum = 247;BA.debugLine="B4XPages.ShowPage(\"FormProgramaCampoCancelar\")";
_b4xpages._showpage /*String*/ (ba,"FormProgramaCampoCancelar");
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public String  _buttongrabar_click() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Private Sub ButtonGrabar_Click";
 //BA.debugLineNum = 243;BA.debugLine="B4XPages.ShowPage(\"FormProgramaCampo\")";
_b4xpages._showpage /*String*/ (ba,"FormProgramaCampo");
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
 //BA.debugLineNum = 5;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private GifViewerLoading As GifViewer";
_gifviewerloading = new b4a.example.ef.gifviewer();
 //BA.debugLineNum = 7;BA.debugLine="Private CLV_Labores As CustomListView";
_clv_labores = new b4a.example3.customlistview();
 //BA.debugLineNum = 8;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 9;BA.debugLine="Private LabelLabores As Label";
_labellabores = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private ButtonGrabar As Button";
_buttongrabar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private ButtonCancelar As Button";
_buttoncancelar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private ButtonAplazar As Button";
_buttonaplazar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 232;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 233;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 234;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 235;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 236;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 237;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(String _position,String _consecutivo,String _nit,String _hacienda,String _suerte,String _area,String _labor,String _fechapro,String _retraso,String _observacion) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
 //BA.debugLineNum = 183;BA.debugLine="Private Sub CreateItem(Position As String,Consecut";
 //BA.debugLineNum = 185;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 186;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 420dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (420)));
 //BA.debugLineNum = 189;BA.debugLine="panel.LoadLayout(\"CardLabores\")";
_panel.LoadLayout("CardLabores",ba);
 //BA.debugLineNum = 191;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 192;BA.debugLine="cs.Initialize";
_cs.Initialize();
 //BA.debugLineNum = 195;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Consecutivo: ")).PopAll();
 //BA.debugLineNum = 196;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Consecuti";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_consecutivo+__c.CRLF)).PopAll();
 //BA.debugLineNum = 198;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Nit: \").PopAl";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Nit: ")).PopAll();
 //BA.debugLineNum = 199;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Nit & CRL";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).PopAll();
 //BA.debugLineNum = 201;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).PopAll();
 //BA.debugLineNum = 202;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Hacienda";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).PopAll();
 //BA.debugLineNum = 204;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Suerte: \").Po";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Suerte: ")).PopAll();
 //BA.debugLineNum = 205;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Suerte).P";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_suerte)).PopAll();
 //BA.debugLineNum = 206;BA.debugLine="cs.Append(\"  \")";
_cs.Append(BA.ObjectToCharSequence("  "));
 //BA.debugLineNum = 207;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Área: \").PopA";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Área: ")).PopAll();
 //BA.debugLineNum = 208;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Area & CR";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_area+__c.CRLF)).PopAll();
 //BA.debugLineNum = 210;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Labor: ")).PopAll();
 //BA.debugLineNum = 211;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Labor & C";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_labor+__c.CRLF)).PopAll();
 //BA.debugLineNum = 213;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha programa: ")).PopAll();
 //BA.debugLineNum = 214;BA.debugLine="cs.Color(Colors.Black).Underline.Append(FechaPro";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_fechapro+__c.CRLF)).PopAll();
 //BA.debugLineNum = 216;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Días atraso:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Días atraso: ")).PopAll();
 //BA.debugLineNum = 217;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Retraso &";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_retraso+__c.CRLF)).PopAll();
 //BA.debugLineNum = 219;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Observación:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Observación: ")).PopAll();
 //BA.debugLineNum = 220;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Observaci";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_observacion+__c.CRLF)).PopAll();
 //BA.debugLineNum = 222;BA.debugLine="LabelLabores.Text = cs";
_labellabores.setText(BA.ObjectToCharSequence(_cs.getObject()));
 //BA.debugLineNum = 224;BA.debugLine="ButtonGrabar.Tag = Consecutivo";
_buttongrabar.setTag((Object)(_consecutivo));
 //BA.debugLineNum = 225;BA.debugLine="ButtonCancelar.Tag = Consecutivo";
_buttoncancelar.setTag((Object)(_consecutivo));
 //BA.debugLineNum = 226;BA.debugLine="ButtonAplazar.Tag = Consecutivo";
_buttonaplazar.setTag((Object)(_consecutivo));
 //BA.debugLineNum = 228;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
