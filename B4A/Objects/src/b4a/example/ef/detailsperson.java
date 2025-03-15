package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class detailsperson extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.detailsperson");
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
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.detailsperson parent) {
this.parent = parent;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 32;BA.debugLine="CLV_Persons.Clear";
parent._clv_persons._clear();
 //BA.debugLineNum = 33;BA.debugLine="Label3.Text=namePerson";
parent._label3.setText(BA.ObjectToCharSequence(parent._nameperson));
 //BA.debugLineNum = 35;BA.debugLine="Dim idPerson As String";
_idperson = "";
 //BA.debugLineNum = 37;BA.debugLine="namePerson=namePerson.Replace(\" \",\"\")";
parent._nameperson = parent._nameperson.replace(" ","");
 //BA.debugLineNum = 38;BA.debugLine="Dim parts() As String = Regex.Split(\"#\", namePers";
_parts = parent.__c.Regex.Split("#",parent._nameperson);
 //BA.debugLineNum = 39;BA.debugLine="idPerson=parts(1)";
_idperson = _parts[(int) (1)];
 //BA.debugLineNum = 43;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 44;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 45;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_deta";
_cmd = parent._createcommand("select_detailsPerson",new Object[]{(Object)(_idperson),(Object)(_idperson)});
 //BA.debugLineNum = 46;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 37;
return;
case 37:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 48;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 49;BA.debugLine="sf.Initialize";
parent._sf._vvv1(ba);
 //BA.debugLineNum = 50;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 51;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 38;
return;
case 38:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 53;BA.debugLine="If res.Rows.Size > 0 Then";
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
 //BA.debugLineNum = 54;BA.debugLine="Dim counter As Int";
_counter = 0;
 //BA.debugLineNum = 55;BA.debugLine="counter = 0";
_counter = (int) (0);
 //BA.debugLineNum = 56;BA.debugLine="Dim nombreEMPRESA As String";
_nombreempresa = "";
 //BA.debugLineNum = 57;BA.debugLine="Dim nombreHacienda As String";
_nombrehacienda = "";
 //BA.debugLineNum = 58;BA.debugLine="Dim nombreEMPRESA_Limitado As String";
_nombreempresa_limitado = "";
 //BA.debugLineNum = 59;BA.debugLine="Dim nombreHacienda_Limitado As String";
_nombrehacienda_limitado = "";
 //BA.debugLineNum = 61;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 62;BA.debugLine="Dim codigo As String = sf.Trim(row(0))";
_codigo = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (0)]));
 //BA.debugLineNum = 63;BA.debugLine="Dim fecha As String = sf.Trim(row(1))";
_fecha = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (1)]));
 //BA.debugLineNum = 64;BA.debugLine="Dim destino As String = sf.Trim(row(2))";
_destino = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (2)]));
 //BA.debugLineNum = 65;BA.debugLine="Dim concepto As String = sf.Trim(row(3))";
_concepto = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (3)]));
 //BA.debugLineNum = 66;BA.debugLine="Dim hacienda As String = sf.Trim(row(4)) ' Cdg";
_hacienda = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (4)]));
 //BA.debugLineNum = 67;BA.debugLine="Dim estado As String = sf.Trim(row(5))";
_estado = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (5)]));
 //BA.debugLineNum = 68;BA.debugLine="Dim horas As String = sf.Trim(row(6))";
_horas = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (6)]));
 //BA.debugLineNum = 69;BA.debugLine="Dim cantidad As String = sf.Trim(row(7))";
_cantidad = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (7)]));
 //BA.debugLineNum = 70;BA.debugLine="Dim valor As String = sf.Trim(row(8))";
_valor = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (8)]));
 //BA.debugLineNum = 71;BA.debugLine="Dim area As String = sf.Trim(row(9))";
_area = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (9)]));
 //BA.debugLineNum = 72;BA.debugLine="Dim Nit As String = sf.Trim(row(10)) ' NIT del";
_nit = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (10)]));
 //BA.debugLineNum = 73;BA.debugLine="Dim codigoLote As String = sf.Trim(row(11))";
_codigolote = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (11)]));
 //BA.debugLineNum = 76;BA.debugLine="Dim parts2() As String";
_parts2 = new String[(int) (0)];
java.util.Arrays.fill(_parts2,"");
 //BA.debugLineNum = 77;BA.debugLine="parts2 = Regex.Split(\" \", fecha)";
_parts2 = parent.__c.Regex.Split(" ",_fecha);
 //BA.debugLineNum = 80;BA.debugLine="Dim cmdNombre As DBCommand = CreateCommand(\"se";
_cmdnombre = parent._createcommand("select_nit_details",new Object[]{(Object)(_nit)});
 //BA.debugLineNum = 81;BA.debugLine="Wait For (Req.ExecuteQuery(cmdNombre, 0, Null)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdnombre,(int) (0),parent.__c.Null)));
this.state = 41;
return;
case 41:
//C
this.state = 10;
_j2 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 83;BA.debugLine="If j2.Success Then";
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
 //BA.debugLineNum = 84;BA.debugLine="Req.HandleJobAsync(j2, \"req_nombre\")";
_req._handlejobasync /*void*/ (_j2,"req_nombre");
 //BA.debugLineNum = 85;BA.debugLine="Wait For (Req) req_nombre_Result(resNombre As";
parent.__c.WaitFor("req_nombre_result", ba, this, (Object)(_req));
this.state = 42;
return;
case 42:
//C
this.state = 13;
_resnombre = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 87;BA.debugLine="For Each rowNombre() As Object In resNombre.R";
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
 //BA.debugLineNum = 88;BA.debugLine="nombreEMPRESA = sf.Trim(rowNombre(0)) ' El p";
_nombreempresa = parent._sf._vvvvv7(BA.ObjectToString(_rownombre[(int) (0)]));
 //BA.debugLineNum = 89;BA.debugLine="nombreEMPRESA_Limitado = LimitarPalabras(nom";
_nombreempresa_limitado = parent._limitarpalabras(_nombreempresa,(int) (3));
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
 //BA.debugLineNum = 92;BA.debugLine="Log(\"ERROR al obtener el nombre del cliente:";
parent.__c.LogImpl("656361021","ERROR al obtener el nombre del cliente: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 96;BA.debugLine="Dim cmdHacienda As DBCommand = CreateCommand(\"";
_cmdhacienda = parent._createcommand("select_hacienda_details",new Object[]{(Object)(_hacienda)});
 //BA.debugLineNum = 97;BA.debugLine="Wait For (Req.ExecuteQuery(cmdHacienda, 0, Nul";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdhacienda,(int) (0),parent.__c.Null)));
this.state = 45;
return;
case 45:
//C
this.state = 20;
_j3 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 99;BA.debugLine="If j3.Success Then";
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
 //BA.debugLineNum = 100;BA.debugLine="Req.HandleJobAsync(j3, \"req_hacienda\")";
_req._handlejobasync /*void*/ (_j3,"req_hacienda");
 //BA.debugLineNum = 101;BA.debugLine="Wait For (Req) req_hacienda_Result(resHaciend";
parent.__c.WaitFor("req_hacienda_result", ba, this, (Object)(_req));
this.state = 46;
return;
case 46:
//C
this.state = 23;
_reshacienda = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 103;BA.debugLine="For Each rowHacienda() As Object In resHacien";
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
 //BA.debugLineNum = 104;BA.debugLine="nombreHacienda = sf.Trim(rowHacienda(0)) ' E";
_nombrehacienda = parent._sf._vvvvv7(BA.ObjectToString(_rowhacienda[(int) (0)]));
 //BA.debugLineNum = 105;BA.debugLine="nombreHacienda_Limitado = LimitarPalabras(no";
_nombrehacienda_limitado = parent._limitarpalabras(_nombrehacienda,(int) (3));
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
 //BA.debugLineNum = 108;BA.debugLine="Log(\"ERROR al obtener el nombre de la haciend";
parent.__c.LogImpl("656361037","ERROR al obtener el nombre de la hacienda: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 29:
//C
this.state = 40;
;
 //BA.debugLineNum = 112;BA.debugLine="CLV_Persons.Add(CreateItem(counter, parts2(0),";
parent._clv_persons._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createitem(_counter,_parts2[(int) (0)],_nombreempresa_limitado,_hacienda+" - "+_nombrehacienda_limitado,_codigolote).getObject())),(Object)(_counter));
 //BA.debugLineNum = 113;BA.debugLine="counter = counter + 1";
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
 //BA.debugLineNum = 116;BA.debugLine="CLV_Persons.AddTextItem(\"NO HAY DATOS\", \"no_dat";
parent._clv_persons._addtextitem((Object)("NO HAY DATOS"),(Object)("no_data"));
 if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
 //BA.debugLineNum = 119;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("656361048","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 36:
//C
this.state = -1;
;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
if (true) break;

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
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 25;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 26;BA.debugLine="utilClass.Initialize";
_utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 27;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
_utilclass._setstatusbarcolor /*String*/ (__c.Colors.White,__c.Colors.White);
 //BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"DetaiaPerson\")";
_root.LoadLayout("DetaiaPerson",ba);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _button1check_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
int _index = 0;
 //BA.debugLineNum = 191;BA.debugLine="Private Sub Button1Check_Click";
 //BA.debugLineNum = 192;BA.debugLine="Try";
try { //BA.debugLineNum = 194;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 195;BA.debugLine="Dim index As Int = btn.Tag";
_index = (int)(BA.ObjectToNumber(_btn.getTag()));
 //BA.debugLineNum = 197;BA.debugLine="B4XPages.ShowPage(\"FormPerson\")";
_b4xpages._showpage /*String*/ (ba,"FormPerson");
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 200;BA.debugLine="Log(LastException)";
__c.LogImpl("656557577",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public void  _button2del_click() throws Exception{
ResumableSub_Button2Del_Click rsub = new ResumableSub_Button2Del_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button2Del_Click extends BA.ResumableSub {
public ResumableSub_Button2Del_Click(b4a.example.ef.detailsperson parent) {
this.parent = parent;
}
b4a.example.ef.detailsperson parent;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
int _index = 0;
int _result = 0;

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
 //BA.debugLineNum = 163;BA.debugLine="Try";
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
 //BA.debugLineNum = 165;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 166;BA.debugLine="Dim index As Int = btn.Tag";
_index = (int)(BA.ObjectToNumber(_btn.getTag()));
 //BA.debugLineNum = 167;BA.debugLine="Log(index)";
parent.__c.LogImpl("656492037",BA.NumberToString(_index),0);
 //BA.debugLineNum = 169;BA.debugLine="If index >= 0 And index < CLV_Persons.Size Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_index>=0 && _index<parent._clv_persons._getsize()) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 171;BA.debugLine="Msgbox2Async(\"¿Está seguro de que desea elimina";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("¿Está seguro de que desea eliminar este elemento?"),BA.ObjectToCharSequence("Confirmación"),"Sí","Cancelar","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 172;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 175;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 176;BA.debugLine="CLV_Persons.RemoveAt(index)";
parent._clv_persons._removeat(_index);
 //BA.debugLineNum = 177;BA.debugLine="CLV_Persons.Refresh";
parent._clv_persons._refresh();
 if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 181;BA.debugLine="Log(\"Error: el índice está fuera de los límites";
parent.__c.LogImpl("656492051","Error: el índice está fuera de los límites de la lista.",0);
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
 //BA.debugLineNum = 186;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("656492056",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
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
public void  _msgbox_result(int _result) throws Exception{
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
 //BA.debugLineNum = 6;BA.debugLine="Public namePerson As String=\"\"";
_nameperson = "";
 //BA.debugLineNum = 7;BA.debugLine="Public idPersona As String =\"\"";
_idpersona = "";
 //BA.debugLineNum = 8;BA.debugLine="Private CLV_Persons As CustomListView";
_clv_persons = new b4a.example3.customlistview();
 //BA.debugLineNum = 9;BA.debugLine="Private Label20Desc As Label";
_label20desc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private Button1Check As Button";
_button1check = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private Button2Del As Button";
_button2del = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 14;BA.debugLine="Dim sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
 //BA.debugLineNum = 15;BA.debugLine="Dim sf2 As StringFunctions";
_sf2 = new ADR.stringdemo.stringfunctions();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 210;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 211;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 212;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 213;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 214;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 215;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _position,String _fecha,String _nit,String _hacienda,String _lote) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
 //BA.debugLineNum = 128;BA.debugLine="Private Sub CreateItem(position As Int, Fecha As S";
 //BA.debugLineNum = 130;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 131;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 130dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (130)));
 //BA.debugLineNum = 134;BA.debugLine="panel.LoadLayout(\"Cardp\")";
_panel.LoadLayout("Cardp",ba);
 //BA.debugLineNum = 137;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 138;BA.debugLine="cs.Initialize";
_cs.Initialize();
 //BA.debugLineNum = 141;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_fecha+__c.CRLF)).Pop();
 //BA.debugLineNum = 143;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Nit: \").Pop.C";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Nit: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).Pop();
 //BA.debugLineNum = 145;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).Pop();
 //BA.debugLineNum = 148;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Lote: \").Pop.";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Lote: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_lote+__c.CRLF)).PopAll();
 //BA.debugLineNum = 151;BA.debugLine="Label20Desc.Text = cs";
_label20desc.setText(BA.ObjectToCharSequence(_cs.getObject()));
 //BA.debugLineNum = 154;BA.debugLine="Button1Check.Tag = position";
_button1check.setTag((Object)(_position));
 //BA.debugLineNum = 155;BA.debugLine="Button2Del.Tag = position";
_button2del.setTag((Object)(_position));
 //BA.debugLineNum = 158;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _label1_click() throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Private Sub Label1_Click";
 //BA.debugLineNum = 207;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public String  _label2_click() throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Private Sub Label2_Click";
 //BA.debugLineNum = 220;BA.debugLine="B4XPages.ShowPage(\"FormPerson\")";
_b4xpages._showpage /*String*/ (ba,"FormPerson");
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public String  _limitarpalabras(String _texto,int _maxpalabras) throws Exception{
String[] _palabras = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _resultado = null;
int _i = 0;
 //BA.debugLineNum = 224;BA.debugLine="Sub LimitarPalabras(texto As String, maxPalabras A";
 //BA.debugLineNum = 225;BA.debugLine="Dim palabras() As String";
_palabras = new String[(int) (0)];
java.util.Arrays.fill(_palabras,"");
 //BA.debugLineNum = 226;BA.debugLine="palabras = Regex.Split(\"\\s+\", texto) ' Dividimos";
_palabras = __c.Regex.Split("\\s+",_texto);
 //BA.debugLineNum = 228;BA.debugLine="Dim resultado As StringBuilder";
_resultado = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 229;BA.debugLine="resultado.Initialize";
_resultado.Initialize();
 //BA.debugLineNum = 232;BA.debugLine="For i = 0 To Min(palabras.Length - 1, maxPalabras";
{
final int step5 = 1;
final int limit5 = (int) (__c.Min(_palabras.length-1,_maxpalabras-1));
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 233;BA.debugLine="resultado.Append(palabras(i)).Append(\" \")";
_resultado.Append(_palabras[_i]).Append(" ");
 }
};
 //BA.debugLineNum = 237;BA.debugLine="If palabras.Length > maxPalabras Then";
if (_palabras.length>_maxpalabras) { 
 //BA.debugLineNum = 238;BA.debugLine="resultado.Append(\"...\")";
_resultado.Append("...");
 };
 //BA.debugLineNum = 241;BA.debugLine="Return resultado.ToString.Trim";
if (true) return _resultado.ToString().trim();
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
