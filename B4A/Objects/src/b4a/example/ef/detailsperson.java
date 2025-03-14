package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class detailsperson extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.detailsperson");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.detailsperson.class).invoke(this, new Object[] {null});
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
public String _nameperson = "";
public String _idpersona = "";
public b4a.example3.customlistview _clv_persons = null;
public anywheresoftware.b4a.objects.LabelWrapper _label20desc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1check = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2del = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public String _rdclink = "";
public ADR.stringdemo.stringfunctions _sf = null;
public ADR.stringdemo.stringfunctions _sf2 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.detailsperson __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="detailsperson";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=56360960;
 //BA.debugLineNum = 56360960;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=56360961;
 //BA.debugLineNum = 56360961;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=56360962;
 //BA.debugLineNum = 56360962;BA.debugLine="End Sub";
return null;
}
public void  _b4xpage_appear(b4a.example.ef.detailsperson __ref) throws Exception{
RDebugUtils.currentModule="detailsperson";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.detailsperson parent,b4a.example.ef.detailsperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.detailsperson __ref;
b4a.example.ef.detailsperson parent;
String _idperson = "";
String[] _parts = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
int _counter = 0;
String _nombreempresa = "";
String _nombrehacienda = "";
String _nombreempresa_limitado = "";
String _nombrehacienda_limitado = "";
Object[] _row = null;
String _codigo = "";
String _fecha = "";
String _destino = "";
String _concepto = "";
String _hacienda = "";
String _estado = "";
String _horas = "";
String _cantidad = "";
String _valor = "";
String _area = "";
String _nit = "";
String _codigolote = "";
String[] _parts2 = null;
b4a.example.ef.main._dbcommand _cmdnombre = null;
b4a.example.ef.httpjob _j2 = null;
b4a.example.ef.main._dbresult _resnombre = null;
Object[] _rownombre = null;
b4a.example.ef.main._dbcommand _cmdhacienda = null;
b4a.example.ef.httpjob _j3 = null;
b4a.example.ef.main._dbresult _reshacienda = null;
Object[] _rowhacienda = null;
anywheresoftware.b4a.BA.IterableList group22;
int index22;
int groupLen22;
anywheresoftware.b4a.BA.IterableList group42;
int index42;
int groupLen42;
anywheresoftware.b4a.BA.IterableList group54;
int index54;
int groupLen54;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="detailsperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56492033;
 //BA.debugLineNum = 56492033;BA.debugLine="CLV_Persons.Clear";
__ref._clv_persons /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=56492034;
 //BA.debugLineNum = 56492034;BA.debugLine="Label3.Text=namePerson";
__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._nameperson /*String*/ ));
RDebugUtils.currentLine=56492036;
 //BA.debugLineNum = 56492036;BA.debugLine="Dim idPerson As String";
_idperson = "";
RDebugUtils.currentLine=56492038;
 //BA.debugLineNum = 56492038;BA.debugLine="namePerson=namePerson.Replace(\" \",\"\")";
__ref._nameperson /*String*/  = __ref._nameperson /*String*/ .replace(" ","");
RDebugUtils.currentLine=56492039;
 //BA.debugLineNum = 56492039;BA.debugLine="Dim parts() As String = Regex.Split(\"#\", namePers";
_parts = parent.__c.Regex.Split("#",__ref._nameperson /*String*/ );
RDebugUtils.currentLine=56492040;
 //BA.debugLineNum = 56492040;BA.debugLine="idPerson=parts(1)";
_idperson = _parts[(int) (1)];
RDebugUtils.currentLine=56492044;
 //BA.debugLineNum = 56492044;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=56492045;
 //BA.debugLineNum = 56492045;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=56492046;
 //BA.debugLineNum = 56492046;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_deta";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_detailsPerson",new Object[]{(Object)(_idperson),(Object)(_idperson)});
RDebugUtils.currentLine=56492047;
 //BA.debugLineNum = 56492047;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "detailsperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 37;
return;
case 37:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=56492049;
 //BA.debugLineNum = 56492049;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 36;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 35;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=56492050;
 //BA.debugLineNum = 56492050;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=56492051;
 //BA.debugLineNum = 56492051;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=56492052;
 //BA.debugLineNum = 56492052;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "detailsperson", "b4xpage_appear"), (Object)(_req));
this.state = 38;
return;
case 38:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=56492054;
 //BA.debugLineNum = 56492054;BA.debugLine="If res.Rows.Size > 0 Then";
if (true) break;

case 4:
//if
this.state = 33;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 6;
}else {
this.state = 32;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=56492055;
 //BA.debugLineNum = 56492055;BA.debugLine="Dim counter As Int";
_counter = 0;
RDebugUtils.currentLine=56492056;
 //BA.debugLineNum = 56492056;BA.debugLine="counter = 0";
_counter = (int) (0);
RDebugUtils.currentLine=56492057;
 //BA.debugLineNum = 56492057;BA.debugLine="Dim nombreEMPRESA As String";
_nombreempresa = "";
RDebugUtils.currentLine=56492058;
 //BA.debugLineNum = 56492058;BA.debugLine="Dim nombreHacienda As String";
_nombrehacienda = "";
RDebugUtils.currentLine=56492059;
 //BA.debugLineNum = 56492059;BA.debugLine="Dim nombreEMPRESA_Limitado As String";
_nombreempresa_limitado = "";
RDebugUtils.currentLine=56492060;
 //BA.debugLineNum = 56492060;BA.debugLine="Dim nombreHacienda_Limitado As String";
_nombrehacienda_limitado = "";
RDebugUtils.currentLine=56492062;
 //BA.debugLineNum = 56492062;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 7:
//for
this.state = 30;
group22 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index22 = 0;
groupLen22 = group22.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 30;
if (index22 < groupLen22) {
this.state = 9;
_row = (Object[])(group22.Get(index22));}
if (true) break;

case 40:
//C
this.state = 39;
index22++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=56492063;
 //BA.debugLineNum = 56492063;BA.debugLine="Dim codigo As String = sf.Trim(row(0))";
_codigo = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (0)]));
RDebugUtils.currentLine=56492064;
 //BA.debugLineNum = 56492064;BA.debugLine="Dim fecha As String = sf.Trim(row(1))";
_fecha = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (1)]));
RDebugUtils.currentLine=56492065;
 //BA.debugLineNum = 56492065;BA.debugLine="Dim destino As String = sf.Trim(row(2))";
_destino = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (2)]));
RDebugUtils.currentLine=56492066;
 //BA.debugLineNum = 56492066;BA.debugLine="Dim concepto As String = sf.Trim(row(3))";
_concepto = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (3)]));
RDebugUtils.currentLine=56492067;
 //BA.debugLineNum = 56492067;BA.debugLine="Dim hacienda As String = sf.Trim(row(4)) ' Cdg";
_hacienda = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (4)]));
RDebugUtils.currentLine=56492068;
 //BA.debugLineNum = 56492068;BA.debugLine="Dim estado As String = sf.Trim(row(5))";
_estado = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (5)]));
RDebugUtils.currentLine=56492069;
 //BA.debugLineNum = 56492069;BA.debugLine="Dim horas As String = sf.Trim(row(6))";
_horas = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (6)]));
RDebugUtils.currentLine=56492070;
 //BA.debugLineNum = 56492070;BA.debugLine="Dim cantidad As String = sf.Trim(row(7))";
_cantidad = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (7)]));
RDebugUtils.currentLine=56492071;
 //BA.debugLineNum = 56492071;BA.debugLine="Dim valor As String = sf.Trim(row(8))";
_valor = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (8)]));
RDebugUtils.currentLine=56492072;
 //BA.debugLineNum = 56492072;BA.debugLine="Dim area As String = sf.Trim(row(9))";
_area = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (9)]));
RDebugUtils.currentLine=56492073;
 //BA.debugLineNum = 56492073;BA.debugLine="Dim Nit As String = sf.Trim(row(10)) ' NIT del";
_nit = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (10)]));
RDebugUtils.currentLine=56492074;
 //BA.debugLineNum = 56492074;BA.debugLine="Dim codigoLote As String = sf.Trim(row(11))";
_codigolote = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (11)]));
RDebugUtils.currentLine=56492077;
 //BA.debugLineNum = 56492077;BA.debugLine="Dim parts2() As String";
_parts2 = new String[(int) (0)];
java.util.Arrays.fill(_parts2,"");
RDebugUtils.currentLine=56492078;
 //BA.debugLineNum = 56492078;BA.debugLine="parts2 = Regex.Split(\" \", fecha)";
_parts2 = parent.__c.Regex.Split(" ",_fecha);
RDebugUtils.currentLine=56492081;
 //BA.debugLineNum = 56492081;BA.debugLine="Dim cmdNombre As DBCommand = CreateCommand(\"se";
_cmdnombre = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit_details",new Object[]{(Object)(_nit)});
RDebugUtils.currentLine=56492082;
 //BA.debugLineNum = 56492082;BA.debugLine="Wait For (Req.ExecuteQuery(cmdNombre, 0, Null)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "detailsperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdnombre,(int) (0),parent.__c.Null)));
this.state = 41;
return;
case 41:
//C
this.state = 10;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=56492084;
 //BA.debugLineNum = 56492084;BA.debugLine="If j2.Success Then";
if (true) break;

case 10:
//if
this.state = 19;
if (_j2._success /*boolean*/ ) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=56492085;
 //BA.debugLineNum = 56492085;BA.debugLine="Req.HandleJobAsync(j2, \"req_nombre\")";
_req._handlejobasync /*void*/ (null,_j2,"req_nombre");
RDebugUtils.currentLine=56492086;
 //BA.debugLineNum = 56492086;BA.debugLine="Wait For (Req) req_nombre_Result(resNombre As";
parent.__c.WaitFor("req_nombre_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "detailsperson", "b4xpage_appear"), (Object)(_req));
this.state = 42;
return;
case 42:
//C
this.state = 13;
_resnombre = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=56492088;
 //BA.debugLineNum = 56492088;BA.debugLine="For Each rowNombre() As Object In resNombre.R";
if (true) break;

case 13:
//for
this.state = 16;
group42 = _resnombre.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index42 = 0;
groupLen42 = group42.getSize();
this.state = 43;
if (true) break;

case 43:
//C
this.state = 16;
if (index42 < groupLen42) {
this.state = 15;
_rownombre = (Object[])(group42.Get(index42));}
if (true) break;

case 44:
//C
this.state = 43;
index42++;
if (true) break;

case 15:
//C
this.state = 44;
RDebugUtils.currentLine=56492089;
 //BA.debugLineNum = 56492089;BA.debugLine="nombreEMPRESA = sf.Trim(rowNombre(0)) ' El p";
_nombreempresa = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_rownombre[(int) (0)]));
RDebugUtils.currentLine=56492090;
 //BA.debugLineNum = 56492090;BA.debugLine="nombreEMPRESA_Limitado = LimitarPalabras(nom";
_nombreempresa_limitado = __ref._limitarpalabras /*String*/ (null,_nombreempresa,(int) (3));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=56492093;
 //BA.debugLineNum = 56492093;BA.debugLine="Log(\"ERROR al obtener el nombre del cliente:";
parent.__c.LogImpl("056492093","ERROR al obtener el nombre del cliente: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=56492097;
 //BA.debugLineNum = 56492097;BA.debugLine="Dim cmdHacienda As DBCommand = CreateCommand(\"";
_cmdhacienda = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_hacienda_details",new Object[]{(Object)(_hacienda)});
RDebugUtils.currentLine=56492098;
 //BA.debugLineNum = 56492098;BA.debugLine="Wait For (Req.ExecuteQuery(cmdHacienda, 0, Nul";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "detailsperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdhacienda,(int) (0),parent.__c.Null)));
this.state = 45;
return;
case 45:
//C
this.state = 20;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=56492100;
 //BA.debugLineNum = 56492100;BA.debugLine="If j3.Success Then";
if (true) break;

case 20:
//if
this.state = 29;
if (_j3._success /*boolean*/ ) { 
this.state = 22;
}else {
this.state = 28;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=56492101;
 //BA.debugLineNum = 56492101;BA.debugLine="Req.HandleJobAsync(j3, \"req_hacienda\")";
_req._handlejobasync /*void*/ (null,_j3,"req_hacienda");
RDebugUtils.currentLine=56492102;
 //BA.debugLineNum = 56492102;BA.debugLine="Wait For (Req) req_hacienda_Result(resHaciend";
parent.__c.WaitFor("req_hacienda_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "detailsperson", "b4xpage_appear"), (Object)(_req));
this.state = 46;
return;
case 46:
//C
this.state = 23;
_reshacienda = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=56492104;
 //BA.debugLineNum = 56492104;BA.debugLine="For Each rowHacienda() As Object In resHacien";
if (true) break;

case 23:
//for
this.state = 26;
group54 = _reshacienda.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index54 = 0;
groupLen54 = group54.getSize();
this.state = 47;
if (true) break;

case 47:
//C
this.state = 26;
if (index54 < groupLen54) {
this.state = 25;
_rowhacienda = (Object[])(group54.Get(index54));}
if (true) break;

case 48:
//C
this.state = 47;
index54++;
if (true) break;

case 25:
//C
this.state = 48;
RDebugUtils.currentLine=56492105;
 //BA.debugLineNum = 56492105;BA.debugLine="nombreHacienda = sf.Trim(rowHacienda(0)) ' E";
_nombrehacienda = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_rowhacienda[(int) (0)]));
RDebugUtils.currentLine=56492106;
 //BA.debugLineNum = 56492106;BA.debugLine="nombreHacienda_Limitado = LimitarPalabras(no";
_nombrehacienda_limitado = __ref._limitarpalabras /*String*/ (null,_nombrehacienda,(int) (3));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 29;
;
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=56492109;
 //BA.debugLineNum = 56492109;BA.debugLine="Log(\"ERROR al obtener el nombre de la haciend";
parent.__c.LogImpl("056492109","ERROR al obtener el nombre de la hacienda: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 29:
//C
this.state = 40;
;
RDebugUtils.currentLine=56492113;
 //BA.debugLineNum = 56492113;BA.debugLine="CLV_Persons.Add(CreateItem(counter, parts2(0),";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_counter,_parts2[(int) (0)],_nombreempresa_limitado,_hacienda+" - "+_nombrehacienda_limitado,_codigolote).getObject())),(Object)(_counter));
RDebugUtils.currentLine=56492114;
 //BA.debugLineNum = 56492114;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
 if (true) break;
if (true) break;

case 30:
//C
this.state = 33;
;
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=56492117;
 //BA.debugLineNum = 56492117;BA.debugLine="CLV_Persons.AddTextItem(\"NO HAY DATOS\", \"no_dat";
__ref._clv_persons /*b4a.example3.customlistview*/ ._addtextitem((Object)("NO HAY DATOS"),(Object)("no_data"));
 if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=56492120;
 //BA.debugLineNum = 56492120;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("056492120","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=56492125;
 //BA.debugLineNum = 56492125;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.detailsperson __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="detailsperson";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=56819712;
 //BA.debugLineNum = 56819712;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=56819713;
 //BA.debugLineNum = 56819713;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=56819714;
 //BA.debugLineNum = 56819714;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=56819715;
 //BA.debugLineNum = 56819715;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=56819716;
 //BA.debugLineNum = 56819716;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=56819717;
 //BA.debugLineNum = 56819717;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=56819718;
 //BA.debugLineNum = 56819718;BA.debugLine="End Sub";
return null;
}
public String  _limitarpalabras(b4a.example.ef.detailsperson __ref,String _texto,int _maxpalabras) throws Exception{
__ref = this;
RDebugUtils.currentModule="detailsperson";
if (Debug.shouldDelegate(ba, "limitarpalabras", false))
	 {return ((String) Debug.delegate(ba, "limitarpalabras", new Object[] {_texto,_maxpalabras}));}
String[] _palabras = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _resultado = null;
int _i = 0;
RDebugUtils.currentLine=56950784;
 //BA.debugLineNum = 56950784;BA.debugLine="Sub LimitarPalabras(texto As String, maxPalabras A";
RDebugUtils.currentLine=56950785;
 //BA.debugLineNum = 56950785;BA.debugLine="Dim palabras() As String";
_palabras = new String[(int) (0)];
java.util.Arrays.fill(_palabras,"");
RDebugUtils.currentLine=56950786;
 //BA.debugLineNum = 56950786;BA.debugLine="palabras = Regex.Split(\"\\s+\", texto) ' Dividimos";
_palabras = __c.Regex.Split("\\s+",_texto);
RDebugUtils.currentLine=56950788;
 //BA.debugLineNum = 56950788;BA.debugLine="Dim resultado As StringBuilder";
_resultado = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=56950789;
 //BA.debugLineNum = 56950789;BA.debugLine="resultado.Initialize";
_resultado.Initialize();
RDebugUtils.currentLine=56950792;
 //BA.debugLineNum = 56950792;BA.debugLine="For i = 0 To Min(palabras.Length - 1, maxPalabras";
{
final int step5 = 1;
final int limit5 = (int) (__c.Min(_palabras.length-1,_maxpalabras-1));
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=56950793;
 //BA.debugLineNum = 56950793;BA.debugLine="resultado.Append(palabras(i)).Append(\" \")";
_resultado.Append(_palabras[_i]).Append(" ");
 }
};
RDebugUtils.currentLine=56950797;
 //BA.debugLineNum = 56950797;BA.debugLine="If palabras.Length > maxPalabras Then";
if (_palabras.length>_maxpalabras) { 
RDebugUtils.currentLine=56950798;
 //BA.debugLineNum = 56950798;BA.debugLine="resultado.Append(\"...\")";
_resultado.Append("...");
 };
RDebugUtils.currentLine=56950801;
 //BA.debugLineNum = 56950801;BA.debugLine="Return resultado.ToString.Trim";
if (true) return _resultado.ToString().trim();
RDebugUtils.currentLine=56950802;
 //BA.debugLineNum = 56950802;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.detailsperson __ref,int _position,String _fecha,String _nit,String _hacienda,String _lote) throws Exception{
__ref = this;
RDebugUtils.currentModule="detailsperson";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", new Object[] {_position,_fecha,_nit,_hacienda,_lote}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=56557568;
 //BA.debugLineNum = 56557568;BA.debugLine="Private Sub CreateItem(position As Int, Fecha As S";
RDebugUtils.currentLine=56557570;
 //BA.debugLineNum = 56557570;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=56557571;
 //BA.debugLineNum = 56557571;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 130dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (130)));
RDebugUtils.currentLine=56557574;
 //BA.debugLineNum = 56557574;BA.debugLine="panel.LoadLayout(\"Cardp\")";
_panel.LoadLayout("Cardp",ba);
RDebugUtils.currentLine=56557577;
 //BA.debugLineNum = 56557577;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=56557578;
 //BA.debugLineNum = 56557578;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=56557581;
 //BA.debugLineNum = 56557581;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_fecha+__c.CRLF)).Pop();
RDebugUtils.currentLine=56557583;
 //BA.debugLineNum = 56557583;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Nit: \").Pop.C";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Nit: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).Pop();
RDebugUtils.currentLine=56557585;
 //BA.debugLineNum = 56557585;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).Pop();
RDebugUtils.currentLine=56557588;
 //BA.debugLineNum = 56557588;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Lote: \").Pop.";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Lote: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_lote+__c.CRLF)).PopAll();
RDebugUtils.currentLine=56557591;
 //BA.debugLineNum = 56557591;BA.debugLine="Label20Desc.Text = cs";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=56557594;
 //BA.debugLineNum = 56557594;BA.debugLine="Button1Check.Tag = position";
__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_position));
RDebugUtils.currentLine=56557595;
 //BA.debugLineNum = 56557595;BA.debugLine="Button2Del.Tag = position";
__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_position));
RDebugUtils.currentLine=56557598;
 //BA.debugLineNum = 56557598;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=56557599;
 //BA.debugLineNum = 56557599;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.detailsperson __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="detailsperson";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=56426496;
 //BA.debugLineNum = 56426496;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=56426497;
 //BA.debugLineNum = 56426497;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=56426498;
 //BA.debugLineNum = 56426498;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=56426499;
 //BA.debugLineNum = 56426499;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=56426500;
 //BA.debugLineNum = 56426500;BA.debugLine="Root.LoadLayout(\"DetaiaPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("DetaiaPerson",ba);
RDebugUtils.currentLine=56426501;
 //BA.debugLineNum = 56426501;BA.debugLine="End Sub";
return "";
}
public String  _button1check_click(b4a.example.ef.detailsperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="detailsperson";
if (Debug.shouldDelegate(ba, "button1check_click", false))
	 {return ((String) Debug.delegate(ba, "button1check_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
int _index = 0;
RDebugUtils.currentLine=56688640;
 //BA.debugLineNum = 56688640;BA.debugLine="Private Sub Button1Check_Click";
RDebugUtils.currentLine=56688641;
 //BA.debugLineNum = 56688641;BA.debugLine="Try";
try {RDebugUtils.currentLine=56688643;
 //BA.debugLineNum = 56688643;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=56688644;
 //BA.debugLineNum = 56688644;BA.debugLine="Dim index As Int = btn.Tag";
_index = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=56688646;
 //BA.debugLineNum = 56688646;BA.debugLine="B4XPages.ShowPage(\"FormPerson\")";
_b4xpages._showpage /*String*/ (ba,"FormPerson");
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=56688649;
 //BA.debugLineNum = 56688649;BA.debugLine="Log(LastException)";
__c.LogImpl("056688649",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=56688651;
 //BA.debugLineNum = 56688651;BA.debugLine="End Sub";
return "";
}
public void  _button2del_click(b4a.example.ef.detailsperson __ref) throws Exception{
RDebugUtils.currentModule="detailsperson";
if (Debug.shouldDelegate(ba, "button2del_click", false))
	 {Debug.delegate(ba, "button2del_click", null); return;}
ResumableSub_Button2Del_Click rsub = new ResumableSub_Button2Del_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button2Del_Click extends BA.ResumableSub {
public ResumableSub_Button2Del_Click(b4a.example.ef.detailsperson parent,b4a.example.ef.detailsperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.detailsperson __ref;
b4a.example.ef.detailsperson parent;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
int _index = 0;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="detailsperson";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56623105;
 //BA.debugLineNum = 56623105;BA.debugLine="Try";
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
RDebugUtils.currentLine=56623107;
 //BA.debugLineNum = 56623107;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=56623108;
 //BA.debugLineNum = 56623108;BA.debugLine="Dim index As Int = btn.Tag";
_index = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=56623109;
 //BA.debugLineNum = 56623109;BA.debugLine="Log(index)";
parent.__c.LogImpl("056623109",BA.NumberToString(_index),0);
RDebugUtils.currentLine=56623111;
 //BA.debugLineNum = 56623111;BA.debugLine="If index >= 0 And index < CLV_Persons.Size Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_index>=0 && _index<__ref._clv_persons /*b4a.example3.customlistview*/ ._getsize()) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=56623113;
 //BA.debugLineNum = 56623113;BA.debugLine="Msgbox2Async(\"¿Está seguro de que desea elimina";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("¿Está seguro de que desea eliminar este elemento?"),BA.ObjectToCharSequence("Confirmación"),"Sí","Cancelar","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=56623114;
 //BA.debugLineNum = 56623114;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "detailsperson", "button2del_click"), null);
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=56623117;
 //BA.debugLineNum = 56623117;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=56623118;
 //BA.debugLineNum = 56623118;BA.debugLine="CLV_Persons.RemoveAt(index)";
__ref._clv_persons /*b4a.example3.customlistview*/ ._removeat(_index);
RDebugUtils.currentLine=56623119;
 //BA.debugLineNum = 56623119;BA.debugLine="CLV_Persons.Refresh";
__ref._clv_persons /*b4a.example3.customlistview*/ ._refresh();
 if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=56623123;
 //BA.debugLineNum = 56623123;BA.debugLine="Log(\"Error: el índice está fuera de los límites";
parent.__c.LogImpl("056623123","Error: el índice está fuera de los límites de la lista.",0);
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
RDebugUtils.currentLine=56623128;
 //BA.debugLineNum = 56623128;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("056623128",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=56623130;
 //BA.debugLineNum = 56623130;BA.debugLine="End Sub";
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
public String  _class_globals(b4a.example.ef.detailsperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="detailsperson";
RDebugUtils.currentLine=56295424;
 //BA.debugLineNum = 56295424;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=56295425;
 //BA.debugLineNum = 56295425;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56295426;
 //BA.debugLineNum = 56295426;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=56295427;
 //BA.debugLineNum = 56295427;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=56295428;
 //BA.debugLineNum = 56295428;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=56295429;
 //BA.debugLineNum = 56295429;BA.debugLine="Public namePerson As String=\"\"";
_nameperson = "";
RDebugUtils.currentLine=56295430;
 //BA.debugLineNum = 56295430;BA.debugLine="Public idPersona As String =\"\"";
_idpersona = "";
RDebugUtils.currentLine=56295431;
 //BA.debugLineNum = 56295431;BA.debugLine="Private CLV_Persons As CustomListView";
_clv_persons = new b4a.example3.customlistview();
RDebugUtils.currentLine=56295432;
 //BA.debugLineNum = 56295432;BA.debugLine="Private Label20Desc As Label";
_label20desc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=56295433;
 //BA.debugLineNum = 56295433;BA.debugLine="Private Button1Check As Button";
_button1check = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=56295434;
 //BA.debugLineNum = 56295434;BA.debugLine="Private Button2Del As Button";
_button2del = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=56295435;
 //BA.debugLineNum = 56295435;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=56295436;
 //BA.debugLineNum = 56295436;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=56295437;
 //BA.debugLineNum = 56295437;BA.debugLine="Dim sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=56295438;
 //BA.debugLineNum = 56295438;BA.debugLine="Dim sf2 As StringFunctions";
_sf2 = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=56295439;
 //BA.debugLineNum = 56295439;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.example.ef.detailsperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="detailsperson";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=56754176;
 //BA.debugLineNum = 56754176;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=56754177;
 //BA.debugLineNum = 56754177;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=56754178;
 //BA.debugLineNum = 56754178;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.example.ef.detailsperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="detailsperson";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=56885248;
 //BA.debugLineNum = 56885248;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=56885249;
 //BA.debugLineNum = 56885249;BA.debugLine="B4XPages.ShowPage(\"FormPerson\")";
_b4xpages._showpage /*String*/ (ba,"FormPerson");
RDebugUtils.currentLine=56885250;
 //BA.debugLineNum = 56885250;BA.debugLine="End Sub";
return "";
}
}