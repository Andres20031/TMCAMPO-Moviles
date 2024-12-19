package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formlabores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formlabores");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.formlabores.class).invoke(this, new Object[] {null});
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
public b4a.example3.customlistview _customlistview1geral = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1geral = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13time = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14time = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public String _rdclink = "";
public String _fechainicio = "";
public String _fechafin = "";
public b4a.example.ef.sd_xcombobox _sd_xcomboboxnit = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxhacienda = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlote = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlabor = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxelemento = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxtypeform = null;
public String _haciendacbx = "";
public String _nitempresacbx = "";
public anywheresoftware.b4a.objects.PanelWrapper _panel2geral = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxtiporiego = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3geral = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxcodigovariedad = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxtipolabranza = null;
public int _cantidadinsumos = 0;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxinsumo = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextcantidadinsumo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonaddinsumo = null;
public b4a.example.ef.table _table1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondeleteinsumo = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel0geral = null;
public String _idinsumo = "";
public String _nameinsumo = "";
public String _cantinsumo = "";
public anywheresoftware.b4a.objects.LabelWrapper _labelcantidadinsumos = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.ef.formlabores __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formlabores __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=24969224;
 //BA.debugLineNum = 24969224;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=24969227;
 //BA.debugLineNum = 24969227;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=24969230;
 //BA.debugLineNum = 24969230;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=24969233;
 //BA.debugLineNum = 24969233;BA.debugLine="fechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=24969236;
 //BA.debugLineNum = 24969236;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formlabores __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=25034757;
 //BA.debugLineNum = 25034757;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=25034760;
 //BA.debugLineNum = 25034760;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=25034763;
 //BA.debugLineNum = 25034763;BA.debugLine="Label14Time.Text = formattedDate";
__ref._label14time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=25034766;
 //BA.debugLineNum = 25034766;BA.debugLine="Panel3.Visible = False";
__ref._panel3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=25034769;
 //BA.debugLineNum = 25034769;BA.debugLine="fechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=25034772;
 //BA.debugLineNum = 25034772;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _razonsocial = "";
String _nit = "";
b4a.example.ef.main._dbcommand _cmdlabormaquina = null;
b4a.example.ef.httpjob _j3 = null;
b4a.example.ef.main._dbresult _reslabormaquina = null;
Object[] _rowlabormaquina = null;
String _codigolabormaquina = "";
String _descripcionlabormaquina = "";
b4a.example.ef.main._dbcommand _cmdelementogasto = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _reselementogasto = null;
Object[] _rowelementogasto = null;
String _codigoelementogasto = "";
String _descripcionelementogasto = "";
anywheresoftware.b4a.BA.IterableList group14;
int index14;
int groupLen14;
anywheresoftware.b4a.BA.IterableList group27;
int index27;
int groupLen27;
anywheresoftware.b4a.BA.IterableList group41;
int index41;
int groupLen41;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=24576003;
 //BA.debugLineNum = 24576003;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=24576004;
 //BA.debugLineNum = 24576004;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=24576005;
 //BA.debugLineNum = 24576005;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=24576006;
 //BA.debugLineNum = 24576006;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=24576008;
 //BA.debugLineNum = 24576008;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=24576009;
 //BA.debugLineNum = 24576009;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=24576012;
 //BA.debugLineNum = 24576012;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=24576013;
 //BA.debugLineNum = 24576013;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 31;
return;
case 31:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=24576014;
 //BA.debugLineNum = 24576014;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=24576015;
 //BA.debugLineNum = 24576015;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=24576016;
 //BA.debugLineNum = 24576016;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 32;
return;
case 32:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=24576017;
 //BA.debugLineNum = 24576017;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group14 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index14 = 0;
groupLen14 = group14.getSize();
this.state = 33;
if (true) break;

case 33:
//C
this.state = 7;
if (index14 < groupLen14) {
this.state = 6;
_row = (Object[])(group14.Get(index14));}
if (true) break;

case 34:
//C
this.state = 33;
index14++;
if (true) break;

case 6:
//C
this.state = 34;
RDebugUtils.currentLine=24576018;
 //BA.debugLineNum = 24576018;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=24576019;
 //BA.debugLineNum = 24576019;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=24576020;
 //BA.debugLineNum = 24576020;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_razonsocial+" - "+_nit,(Object)(_nit));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=24576023;
 //BA.debugLineNum = 24576023;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("324576023","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=24576028;
 //BA.debugLineNum = 24576028;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor_maq",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=24576029;
 //BA.debugLineNum = 24576029;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 35;
return;
case 35:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=24576030;
 //BA.debugLineNum = 24576030;BA.debugLine="If j3.Success Then";
if (true) break;

case 11:
//if
this.state = 20;
if (_j3._success /*boolean*/ ) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=24576031;
 //BA.debugLineNum = 24576031;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (null,_j3,"req_labormaquina");
RDebugUtils.currentLine=24576032;
 //BA.debugLineNum = 24576032;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 36;
return;
case 36:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=24576033;
 //BA.debugLineNum = 24576033;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
if (true) break;

case 14:
//for
this.state = 17;
group27 = _reslabormaquina.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index27 = 0;
groupLen27 = group27.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 17;
if (index27 < groupLen27) {
this.state = 16;
_rowlabormaquina = (Object[])(group27.Get(index27));}
if (true) break;

case 38:
//C
this.state = 37;
index27++;
if (true) break;

case 16:
//C
this.state = 38;
RDebugUtils.currentLine=24576034;
 //BA.debugLineNum = 24576034;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
RDebugUtils.currentLine=24576035;
 //BA.debugLineNum = 24576035;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
RDebugUtils.currentLine=24576036;
 //BA.debugLineNum = 24576036;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina &";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionlabormaquina+" - "+_codigolabormaquina,(Object)(_codigolabormaquina));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=24576039;
 //BA.debugLineNum = 24576039;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("324576039","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=24576041;
 //BA.debugLineNum = 24576041;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=24576045;
 //BA.debugLineNum = 24576045;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
_cmdelementogasto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_elementoGasto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=24576046;
 //BA.debugLineNum = 24576046;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdelementogasto,(int) (0),parent.__c.Null)));
this.state = 39;
return;
case 39:
//C
this.state = 21;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=24576047;
 //BA.debugLineNum = 24576047;BA.debugLine="If j4.Success Then";
if (true) break;

case 21:
//if
this.state = 30;
if (_j4._success /*boolean*/ ) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=24576048;
 //BA.debugLineNum = 24576048;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
_req._handlejobasync /*void*/ (null,_j4,"req_elementoGasto");
RDebugUtils.currentLine=24576049;
 //BA.debugLineNum = 24576049;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
parent.__c.WaitFor("req_elementogasto_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 40;
return;
case 40:
//C
this.state = 24;
_reselementogasto = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=24576050;
 //BA.debugLineNum = 24576050;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
if (true) break;

case 24:
//for
this.state = 27;
group41 = _reselementogasto.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index41 = 0;
groupLen41 = group41.getSize();
this.state = 41;
if (true) break;

case 41:
//C
this.state = 27;
if (index41 < groupLen41) {
this.state = 26;
_rowelementogasto = (Object[])(group41.Get(index41));}
if (true) break;

case 42:
//C
this.state = 41;
index41++;
if (true) break;

case 26:
//C
this.state = 42;
RDebugUtils.currentLine=24576051;
 //BA.debugLineNum = 24576051;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
_codigoelementogasto = BA.ObjectToString(_rowelementogasto[(int) (0)]);
RDebugUtils.currentLine=24576052;
 //BA.debugLineNum = 24576052;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto[(int) (1)]);
RDebugUtils.currentLine=24576053;
 //BA.debugLineNum = 24576053;BA.debugLine="SD_xComboBoxElemento.Add(descripcionElementoGas";
__ref._sd_xcomboboxelemento /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionelementogasto+" - "+_codigoelementogasto,(Object)(_codigoelementogasto));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=24576056;
 //BA.debugLineNum = 24576056;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("324576056","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=24576058;
 //BA.debugLineNum = 24576058;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=24576063;
 //BA.debugLineNum = 24576063;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Insumo\",0)";
__ref._sd_xcomboboxtypeform /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Insumo",(Object)(0));
RDebugUtils.currentLine=24576064;
 //BA.debugLineNum = 24576064;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Siembra\",1)";
__ref._sd_xcomboboxtypeform /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Siembra",(Object)(1));
RDebugUtils.currentLine=24576065;
 //BA.debugLineNum = 24576065;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Riego\",2)";
__ref._sd_xcomboboxtypeform /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Riego",(Object)(2));
RDebugUtils.currentLine=24576068;
 //BA.debugLineNum = 24576068;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=24641542;
 //BA.debugLineNum = 24641542;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
_panel.LoadLayout("addLaboresUI",ba);
RDebugUtils.currentLine=24641544;
 //BA.debugLineNum = 24641544;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=24641546;
 //BA.debugLineNum = 24641546;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=24641547;
 //BA.debugLineNum = 24641547;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formlabores __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=25100292;
 //BA.debugLineNum = 25100292;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=25100293;
 //BA.debugLineNum = 25100293;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=25100294;
 //BA.debugLineNum = 25100294;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formlabores __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=24510468;
 //BA.debugLineNum = 24510468;BA.debugLine="End Sub";
return "";
}
public String  _buttonaddinsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttonaddinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "buttonaddinsumo_click", null));}
RDebugUtils.currentLine=55967744;
 //BA.debugLineNum = 55967744;BA.debugLine="Private Sub ButtonAddInsumo_Click";
RDebugUtils.currentLine=55967745;
 //BA.debugLineNum = 55967745;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
if ((__ref._nameinsumo /*String*/ ).equals("") && (__ref._idinsumo /*String*/ ).equals("") && (__ref._cantinsumo /*String*/ ).equals("")) { 
RDebugUtils.currentLine=55967746;
 //BA.debugLineNum = 55967746;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
__c.MsgboxAsync(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo"),BA.ObjectToCharSequence("Error"),ba);
 }else {
RDebugUtils.currentLine=55967748;
 //BA.debugLineNum = 55967748;BA.debugLine="Table1.AddRow(Array As String(IDINSUMO,NAMEINSUM";
__ref._table1 /*b4a.example.ef.table*/ ._addrow /*String*/ (null,new String[]{__ref._idinsumo /*String*/ ,__ref._nameinsumo /*String*/ ,__ref._cantinsumo /*String*/ });
RDebugUtils.currentLine=55967749;
 //BA.debugLineNum = 55967749;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
__ref._cantidadinsumos /*int*/  = (int) (__ref._cantidadinsumos /*int*/ +1);
RDebugUtils.currentLine=55967750;
 //BA.debugLineNum = 55967750;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=55967751;
 //BA.debugLineNum = 55967751;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
__ref._edittextcantidadinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=55967753;
 //BA.debugLineNum = 55967753;BA.debugLine="End Sub";
return "";
}
public String  _buttondeleteinsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttondeleteinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "buttondeleteinsumo_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _i = 0;
int _row = 0;
RDebugUtils.currentLine=56098816;
 //BA.debugLineNum = 56098816;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
RDebugUtils.currentLine=56098817;
 //BA.debugLineNum = 56098817;BA.debugLine="Private lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56098818;
 //BA.debugLineNum = 56098818;BA.debugLine="Private i, row As Int";
_i = 0;
_row = 0;
RDebugUtils.currentLine=56098819;
 //BA.debugLineNum = 56098819;BA.debugLine="lst = Table1.SelectedRows";
_lst = __ref._table1 /*b4a.example.ef.table*/ ._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=56098820;
 //BA.debugLineNum = 56098820;BA.debugLine="lst.Sort(True)";
_lst.Sort(__c.True);
RDebugUtils.currentLine=56098821;
 //BA.debugLineNum = 56098821;BA.debugLine="For i = lst.Size - 1 To 0 Step -1";
{
final int step5 = -1;
final int limit5 = (int) (0);
_i = (int) (_lst.getSize()-1) ;
for (;_i >= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=56098822;
 //BA.debugLineNum = 56098822;BA.debugLine="row = lst.Get(i)";
_row = (int)(BA.ObjectToNumber(_lst.Get(_i)));
RDebugUtils.currentLine=56098823;
 //BA.debugLineNum = 56098823;BA.debugLine="Table1.RemoveRow(row)";
__ref._table1 /*b4a.example.ef.table*/ ._removerow /*String*/ (null,_row);
 }
};
RDebugUtils.currentLine=56098825;
 //BA.debugLineNum = 56098825;BA.debugLine="ButtonDeleteInsumo.Visible = False";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=56098826;
 //BA.debugLineNum = 56098826;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
__ref._cantidadinsumos /*int*/  = (int) (__ref._cantidadinsumos /*int*/ -1);
RDebugUtils.currentLine=56098827;
 //BA.debugLineNum = 56098827;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=56098828;
 //BA.debugLineNum = 56098828;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=24379395;
 //BA.debugLineNum = 24379395;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=24379397;
 //BA.debugLineNum = 24379397;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=24379398;
 //BA.debugLineNum = 24379398;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24379399;
 //BA.debugLineNum = 24379399;BA.debugLine="Private Label14Time As Label";
_label14time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24379400;
 //BA.debugLineNum = 24379400;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=24379401;
 //BA.debugLineNum = 24379401;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=24379402;
 //BA.debugLineNum = 24379402;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=24379403;
 //BA.debugLineNum = 24379403;BA.debugLine="Dim fechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=24379404;
 //BA.debugLineNum = 24379404;BA.debugLine="Dim fechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=24379407;
 //BA.debugLineNum = 24379407;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=24379408;
 //BA.debugLineNum = 24379408;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=24379409;
 //BA.debugLineNum = 24379409;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=24379410;
 //BA.debugLineNum = 24379410;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=24379411;
 //BA.debugLineNum = 24379411;BA.debugLine="Private SD_xComboBoxElemento As SD_xComboBox";
_sd_xcomboboxelemento = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=24379412;
 //BA.debugLineNum = 24379412;BA.debugLine="Private SD_xComboBoxTypeForm As SD_xComboBox";
_sd_xcomboboxtypeform = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=24379413;
 //BA.debugLineNum = 24379413;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=24379414;
 //BA.debugLineNum = 24379414;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=24379416;
 //BA.debugLineNum = 24379416;BA.debugLine="Private Panel2geral As Panel";
_panel2geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=24379417;
 //BA.debugLineNum = 24379417;BA.debugLine="Private SD_xComboBoxTipoRiego As SD_xComboBox";
_sd_xcomboboxtiporiego = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=24379419;
 //BA.debugLineNum = 24379419;BA.debugLine="Private Panel3geral As Panel";
_panel3geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=24379420;
 //BA.debugLineNum = 24379420;BA.debugLine="Private SD_xComboBoxCodigoVariedad As SD_xComboBo";
_sd_xcomboboxcodigovariedad = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=24379421;
 //BA.debugLineNum = 24379421;BA.debugLine="Private SD_xComboBoxTipoLabranza As SD_xComboBox";
_sd_xcomboboxtipolabranza = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=24379423;
 //BA.debugLineNum = 24379423;BA.debugLine="Private cantidadInsumos As Int";
_cantidadinsumos = 0;
RDebugUtils.currentLine=24379425;
 //BA.debugLineNum = 24379425;BA.debugLine="Private SD_xComboBoxInsumo As SD_xComboBox";
_sd_xcomboboxinsumo = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=24379426;
 //BA.debugLineNum = 24379426;BA.debugLine="Private EditTextCantidadInsumo As EditText";
_edittextcantidadinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=24379427;
 //BA.debugLineNum = 24379427;BA.debugLine="Private ButtonAddInsumo As Button";
_buttonaddinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=24379428;
 //BA.debugLineNum = 24379428;BA.debugLine="Private Table1 As Table";
_table1 = new b4a.example.ef.table();
RDebugUtils.currentLine=24379429;
 //BA.debugLineNum = 24379429;BA.debugLine="Private ButtonDeleteInsumo As Button";
_buttondeleteinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=24379430;
 //BA.debugLineNum = 24379430;BA.debugLine="Private Panel0geral As Panel";
_panel0geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=24379432;
 //BA.debugLineNum = 24379432;BA.debugLine="Private IDINSUMO As String";
_idinsumo = "";
RDebugUtils.currentLine=24379433;
 //BA.debugLineNum = 24379433;BA.debugLine="Private NAMEINSUMO As String";
_nameinsumo = "";
RDebugUtils.currentLine=24379434;
 //BA.debugLineNum = 24379434;BA.debugLine="Private CANTINSUMO As String";
_cantinsumo = "";
RDebugUtils.currentLine=24379436;
 //BA.debugLineNum = 24379436;BA.debugLine="Private LabelCantidadInsumos As Label";
_labelcantidadinsumos = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24379437;
 //BA.debugLineNum = 24379437;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumo(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createiteminsumo", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createiteminsumo", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=57409536;
 //BA.debugLineNum = 57409536;BA.debugLine="Private Sub CreateItemInsumo As Panel";
RDebugUtils.currentLine=57409538;
 //BA.debugLineNum = 57409538;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=57409539;
 //BA.debugLineNum = 57409539;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=57409542;
 //BA.debugLineNum = 57409542;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
_panel.LoadLayout("FormInsumo",ba);
RDebugUtils.currentLine=57409544;
 //BA.debugLineNum = 57409544;BA.debugLine="panel.Height=Panel0geral.Height";
_panel.setHeight(__ref._panel0geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=57409546;
 //BA.debugLineNum = 57409546;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=57409547;
 //BA.debugLineNum = 57409547;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemriego(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitemriego", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemriego", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Private Sub CreateItemRiego As Panel";
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=24707075;
 //BA.debugLineNum = 24707075;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
_panel.LoadLayout("FormRiego",ba);
RDebugUtils.currentLine=24707080;
 //BA.debugLineNum = 24707080;BA.debugLine="panel.Height=Panel2geral.Height";
_panel.setHeight(__ref._panel2geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=24707082;
 //BA.debugLineNum = 24707082;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=24707083;
 //BA.debugLineNum = 24707083;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemsiembra(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitemsiembra", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemsiembra", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Private Sub CreateItemSiembra As Panel";
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=24772614;
 //BA.debugLineNum = 24772614;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
_panel.LoadLayout("FormSiembra",ba);
RDebugUtils.currentLine=24772616;
 //BA.debugLineNum = 24772616;BA.debugLine="panel.Height=Panel3geral.Height";
_panel.setHeight(__ref._panel3geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=24772618;
 //BA.debugLineNum = 24772618;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=24772619;
 //BA.debugLineNum = 24772619;BA.debugLine="End Sub";
return null;
}
public String  _edittextbandereo_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextbandereo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextbandereo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadagua_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcantidadagua_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcantidadagua_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadinsumo_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcantidadinsumo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcantidadinsumo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=55902208;
 //BA.debugLineNum = 55902208;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
RDebugUtils.currentLine=55902209;
 //BA.debugLineNum = 55902209;BA.debugLine="If New == \" \" Then";
if ((_new).equals(" ")) { 
RDebugUtils.currentLine=55902210;
 //BA.debugLineNum = 55902210;BA.debugLine="Log(\"EL NEW: \"&New)";
__c.LogImpl("355902210","EL NEW: "+_new,0);
RDebugUtils.currentLine=55902211;
 //BA.debugLineNum = 55902211;BA.debugLine="Log(\"EL OLD: \"&Old)";
__c.LogImpl("355902211","EL OLD: "+_old,0);
 }else {
RDebugUtils.currentLine=55902213;
 //BA.debugLineNum = 55902213;BA.debugLine="ButtonAddInsumo.Enabled = True";
__ref._buttonaddinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=55902215;
 //BA.debugLineNum = 55902215;BA.debugLine="CANTINSUMO = New";
__ref._cantinsumo /*String*/  = _new;
RDebugUtils.currentLine=55902216;
 //BA.debugLineNum = 55902216;BA.debugLine="End Sub";
return "";
}
public String  _edittextcaudalaplicado_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcaudalaplicado_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcaudalaplicado_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="End Sub";
return "";
}
public String  _edittextdistanciasiembra_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextdistanciasiembra_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextdistanciasiembra_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeromacollos_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextnumeromacollos_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextnumeromacollos_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeropaquetes_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextnumeropaquetes_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextnumeropaquetes_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedencia_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextprocedencia_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextprocedencia_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedenciadestino_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextprocedenciadestino_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextprocedenciadestino_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="End Sub";
return "";
}
public String  _edittexttoneladasemilla_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittexttoneladasemilla_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittexttoneladasemilla_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="End Sub";
return "";
}
public String  _label14time_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label14time_click", false))
	 {return ((String) Debug.delegate(ba, "label14time_click", null));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Private Sub Label14Time_Click";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="Panel3.Visible = True";
__ref._panel3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="End Sub";
return "";
}
public void  _llenarcomboboxinsumo(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "llenarcomboboxinsumo", false))
	 {Debug.delegate(ba, "llenarcomboboxinsumo", null); return;}
ResumableSub_LlenarComboBoxInsumo rsub = new ResumableSub_LlenarComboBoxInsumo(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxInsumo extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxInsumo(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_producto = "";
String _dscrpcion_producto = "";
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56885249;
 //BA.debugLineNum = 56885249;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=56885250;
 //BA.debugLineNum = 56885250;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=56885252;
 //BA.debugLineNum = 56885252;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_insumosSort",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=56885253;
 //BA.debugLineNum = 56885253;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxinsumo"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=56885254;
 //BA.debugLineNum = 56885254;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=56885255;
 //BA.debugLineNum = 56885255;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=56885256;
 //BA.debugLineNum = 56885256;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxinsumo"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=56885257;
 //BA.debugLineNum = 56885257;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (Object[])(group8.Get(index8));}
if (true) break;

case 14:
//C
this.state = 13;
index8++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=56885258;
 //BA.debugLineNum = 56885258;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
_cdgo_producto = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=56885259;
 //BA.debugLineNum = 56885259;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
_dscrpcion_producto = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=56885260;
 //BA.debugLineNum = 56885260;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto & \" -";
__ref._sd_xcomboboxinsumo /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_producto+" - "+_cdgo_producto,(Object)(_dscrpcion_producto+" - "+_cdgo_producto));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=56885263;
 //BA.debugLineNum = 56885263;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("356885263","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=56885266;
 //BA.debugLineNum = 56885266;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _llenarcomboboxriego(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "llenarcomboboxriego", false))
	 {Debug.delegate(ba, "llenarcomboboxriego", null); return;}
ResumableSub_LlenarComboBoxRiego rsub = new ResumableSub_LlenarComboBoxRiego(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxRiego extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxRiego(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_tipo_riego = "";
String _dscrpcion_tipo_riego = "";
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_tipoRiego",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=26476549;
 //BA.debugLineNum = 26476549;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxriego"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=26476550;
 //BA.debugLineNum = 26476550;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=26476551;
 //BA.debugLineNum = 26476551;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=26476552;
 //BA.debugLineNum = 26476552;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxriego"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=26476553;
 //BA.debugLineNum = 26476553;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (Object[])(group8.Get(index8));}
if (true) break;

case 14:
//C
this.state = 13;
index8++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=26476554;
 //BA.debugLineNum = 26476554;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
_cdgo_tipo_riego = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=26476555;
 //BA.debugLineNum = 26476555;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
_dscrpcion_tipo_riego = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=26476556;
 //BA.debugLineNum = 26476556;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego";
__ref._sd_xcomboboxtiporiego /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_tipo_riego+" - "+_cdgo_tipo_riego,(Object)(_cdgo_tipo_riego));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=26476559;
 //BA.debugLineNum = 26476559;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("326476559","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=26476562;
 //BA.debugLineNum = 26476562;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _llenarcomboboxsiembra(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "llenarcomboboxsiembra", false))
	 {Debug.delegate(ba, "llenarcomboboxsiembra", null); return;}
ResumableSub_LlenarComboBoxSiembra rsub = new ResumableSub_LlenarComboBoxSiembra(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxSiembra extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxSiembra(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_variedad = "";
b4a.example.ef.main._dbcommand _cmdtipolabranza = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _restipolabranza = null;
Object[] _rowtipolabranza = null;
String _cdgo_tipo_labranza = "";
String _dscrpcion_tipo_labranza = "";
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=26542085;
 //BA.debugLineNum = 26542085;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_codVariedad",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=26542086;
 //BA.debugLineNum = 26542086;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=26542087;
 //BA.debugLineNum = 26542087;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=26542088;
 //BA.debugLineNum = 26542088;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=26542089;
 //BA.debugLineNum = 26542089;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=26542090;
 //BA.debugLineNum = 26542090;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (Object[])(group8.Get(index8));}
if (true) break;

case 24:
//C
this.state = 23;
index8++;
if (true) break;

case 6:
//C
this.state = 24;
RDebugUtils.currentLine=26542091;
 //BA.debugLineNum = 26542091;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
_cdgo_variedad = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=26542092;
 //BA.debugLineNum = 26542092;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
__ref._sd_xcomboboxcodigovariedad /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cdgo_variedad,(Object)(_cdgo_variedad));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=26542095;
 //BA.debugLineNum = 26542095;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("326542095","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=26542097;
 //BA.debugLineNum = 26542097;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=26542101;
 //BA.debugLineNum = 26542101;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
_cmdtipolabranza = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_tipoLabranza",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=26542102;
 //BA.debugLineNum = 26542102;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdtipolabranza,(int) (0),parent.__c.Null)));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=26542103;
 //BA.debugLineNum = 26542103;BA.debugLine="If j4.Success Then";
if (true) break;

case 11:
//if
this.state = 20;
if (_j4._success /*boolean*/ ) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=26542104;
 //BA.debugLineNum = 26542104;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
_req._handlejobasync /*void*/ (null,_j4,"req_TipoLabranza");
RDebugUtils.currentLine=26542105;
 //BA.debugLineNum = 26542105;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
parent.__c.WaitFor("req_tipolabranza_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=26542106;
 //BA.debugLineNum = 26542106;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
if (true) break;

case 14:
//for
this.state = 17;
group21 = _restipolabranza.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 27;
if (true) break;

case 27:
//C
this.state = 17;
if (index21 < groupLen21) {
this.state = 16;
_rowtipolabranza = (Object[])(group21.Get(index21));}
if (true) break;

case 28:
//C
this.state = 27;
index21++;
if (true) break;

case 16:
//C
this.state = 28;
RDebugUtils.currentLine=26542107;
 //BA.debugLineNum = 26542107;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (0)]);
RDebugUtils.currentLine=26542108;
 //BA.debugLineNum = 26542108;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (1)]);
RDebugUtils.currentLine=26542109;
 //BA.debugLineNum = 26542109;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
__ref._sd_xcomboboxtipolabranza /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_tipo_labranza+" - "+_cdgo_tipo_labranza,(Object)(_cdgo_tipo_labranza));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=26542112;
 //BA.debugLineNum = 26542112;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
parent.__c.LogImpl("326542112","Error en la consulta de Tipo_Labranza: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=26542114;
 //BA.debugLineNum = 26542114;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=26542116;
 //BA.debugLineNum = 26542116;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _removeform0ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform0ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform0ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=57016320;
 //BA.debugLineNum = 57016320;BA.debugLine="Private Sub RemoveForm0IfExists";
RDebugUtils.currentLine=57016322;
 //BA.debugLineNum = 57016322;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=57016323;
 //BA.debugLineNum = 57016323;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form0"))) { 
RDebugUtils.currentLine=57016324;
 //BA.debugLineNum = 57016324;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=57016325;
 //BA.debugLineNum = 57016325;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=57016328;
 //BA.debugLineNum = 57016328;BA.debugLine="End Sub";
return "";
}
public String  _removeform2ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform2ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform2ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Private Sub RemoveForm2IfExists";
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form2"))) { 
RDebugUtils.currentLine=25821188;
 //BA.debugLineNum = 25821188;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=25821189;
 //BA.debugLineNum = 25821189;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=25821192;
 //BA.debugLineNum = 25821192;BA.debugLine="End Sub";
return "";
}
public String  _removeform3ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform3ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform3ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Private Sub RemoveForm3IfExists";
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=25886723;
 //BA.debugLineNum = 25886723;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form3"))) { 
RDebugUtils.currentLine=25886724;
 //BA.debugLineNum = 25886724;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=25886725;
 //BA.debugLineNum = 25886725;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=25886728;
 //BA.debugLineNum = 25886728;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxcodigovariedad_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxcodigovariedad_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxcodigovariedad_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxelemento_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxelemento_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxelemento_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxhacienda_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxhacienda_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxhacienda_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _position;
Object _value;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codg_hacienda = "";
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="haciendaCBX=Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=25231363;
 //BA.debugLineNum = 25231363;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=25231364;
 //BA.debugLineNum = 25231364;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=25231365;
 //BA.debugLineNum = 25231365;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=25231366;
 //BA.debugLineNum = 25231366;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=25231369;
 //BA.debugLineNum = 25231369;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=25231372;
 //BA.debugLineNum = 25231372;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=25231374;
 //BA.debugLineNum = 25231374;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=25231375;
 //BA.debugLineNum = 25231375;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=25231379;
 //BA.debugLineNum = 25231379;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (Object[])(group10.Get(index10));}
if (true) break;

case 14:
//C
this.state = 13;
index10++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=25231380;
 //BA.debugLineNum = 25231380;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=25231383;
 //BA.debugLineNum = 25231383;BA.debugLine="SD_xComboBoxLote.Add(\"Codigo: \"&Codg_Hacienda,";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Codigo: "+_codg_hacienda,(Object)(_codg_hacienda));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=25231388;
 //BA.debugLineNum = 25231388;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("325231388","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=25231392;
 //BA.debugLineNum = 25231392;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=25231394;
 //BA.debugLineNum = 25231394;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxinsumo_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxinsumo_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxinsumo_itemclick", new Object[] {_position,_value}));}
String[] _partes = null;
RDebugUtils.currentLine=55836672;
 //BA.debugLineNum = 55836672;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
RDebugUtils.currentLine=55836673;
 //BA.debugLineNum = 55836673;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
_partes = __c.Regex.Split(" - ",BA.ObjectToString(_value));
RDebugUtils.currentLine=55836674;
 //BA.debugLineNum = 55836674;BA.debugLine="NAMEINSUMO = partes(0)";
__ref._nameinsumo /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=55836675;
 //BA.debugLineNum = 55836675;BA.debugLine="IDINSUMO = partes(1)";
__ref._idinsumo /*String*/  = _partes[(int) (1)];
RDebugUtils.currentLine=55836676;
 //BA.debugLineNum = 55836676;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxnit_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxnit_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxnit_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxNit_ItemClick rsub = new ResumableSub_SD_xComboBoxNit_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxNit_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNit_ItemClick(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _position;
Object _value;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codg_hacienda = "";
String _nombrehacienda = "";
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=25165827;
 //BA.debugLineNum = 25165827;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=25165829;
 //BA.debugLineNum = 25165829;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)("N")});
RDebugUtils.currentLine=25165832;
 //BA.debugLineNum = 25165832;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=25165835;
 //BA.debugLineNum = 25165835;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=25165837;
 //BA.debugLineNum = 25165837;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=25165838;
 //BA.debugLineNum = 25165838;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=25165842;
 //BA.debugLineNum = 25165842;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group9 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index9 < groupLen9) {
this.state = 6;
_row = (Object[])(group9.Get(index9));}
if (true) break;

case 14:
//C
this.state = 13;
index9++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=25165843;
 //BA.debugLineNum = 25165843;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=25165844;
 //BA.debugLineNum = 25165844;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=25165847;
 //BA.debugLineNum = 25165847;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda & \" - \"";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombrehacienda+" - "+_codg_hacienda,(Object)(_codg_hacienda));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=25165852;
 //BA.debugLineNum = 25165852;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("325165852","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=25165855;
 //BA.debugLineNum = 25165855;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=25165857;
 //BA.debugLineNum = 25165857;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxtipolabranza_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtipolabranza_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtipolabranza_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtiporiego_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtiporiego_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtiporiego_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtypeform_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtypeform_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtypeform_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _tf = null;
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
RDebugUtils.currentLine=25493507;
 //BA.debugLineNum = 25493507;BA.debugLine="If IsNumber(Value) Then";
if (__c.IsNumber(BA.ObjectToString(_value))) { 
RDebugUtils.currentLine=25493508;
 //BA.debugLineNum = 25493508;BA.debugLine="Select Case Value";
switch (BA.switchObjectToInt(_value,(Object)(0),(Object)(1),(Object)(2))) {
case 0: {
RDebugUtils.currentLine=25493510;
 //BA.debugLineNum = 25493510;BA.debugLine="RemoveForm2IfExists";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=25493511;
 //BA.debugLineNum = 25493511;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=25493512;
 //BA.debugLineNum = 25493512;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createiteminsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form0"));
RDebugUtils.currentLine=25493513;
 //BA.debugLineNum = 25493513;BA.debugLine="LlenarComboBoxInsumo";
__ref._llenarcomboboxinsumo /*void*/ (null);
RDebugUtils.currentLine=25493514;
 //BA.debugLineNum = 25493514;BA.debugLine="Table1.SetHeader(Array As String(\"ID\", \"NOMBRE";
__ref._table1 /*b4a.example.ef.table*/ ._setheader /*String*/ (null,new String[]{"ID","NOMBRE","CANTIDAD"});
RDebugUtils.currentLine=25493515;
 //BA.debugLineNum = 25493515;BA.debugLine="Table1.SetColumnDataTypes(Array As String(\"T\",";
__ref._table1 /*b4a.example.ef.table*/ ._setcolumndatatypes /*String*/ (null,new String[]{"T","T","T"});
RDebugUtils.currentLine=25493517;
 //BA.debugLineNum = 25493517;BA.debugLine="Private tf() As Typeface";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _tf.length;
for (int i0 = 0;i0 < d0;i0++) {
_tf[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=25493518;
 //BA.debugLineNum = 25493518;BA.debugLine="tf = Array As Typeface(Typeface.DEFAULT_BOLD,";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]{(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT_BOLD)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT_BOLD)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT_BOLD))};
RDebugUtils.currentLine=25493519;
 //BA.debugLineNum = 25493519;BA.debugLine="Table1.SetTextColors(Array As Int(Colors.White";
__ref._table1 /*b4a.example.ef.table*/ ._settextcolors /*String*/ (null,new int[]{__c.Colors.White,__c.Colors.White,__c.Colors.White});
RDebugUtils.currentLine=25493520;
 //BA.debugLineNum = 25493520;BA.debugLine="Table1.SetHeaderTypeFaces(tf)";
__ref._table1 /*b4a.example.ef.table*/ ._setheadertypefaces /*String*/ (null,_tf);
RDebugUtils.currentLine=25493521;
 //BA.debugLineNum = 25493521;BA.debugLine="Table1.SelectedCellTextColor= Colors.White";
__ref._table1 /*b4a.example.ef.table*/ ._setselectedcelltextcolor /*int*/ (null,__c.Colors.White);
RDebugUtils.currentLine=25493522;
 //BA.debugLineNum = 25493522;BA.debugLine="cantidadInsumos = 0";
__ref._cantidadinsumos /*int*/  = (int) (0);
RDebugUtils.currentLine=25493523;
 //BA.debugLineNum = 25493523;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=25493524;
 //BA.debugLineNum = 25493524;BA.debugLine="CANTINSUMO = \"\"";
__ref._cantinsumo /*String*/  = "";
 break; }
case 1: {
RDebugUtils.currentLine=25493526;
 //BA.debugLineNum = 25493526;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=25493527;
 //BA.debugLineNum = 25493527;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=25493528;
 //BA.debugLineNum = 25493528;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemsiembra /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form3"));
RDebugUtils.currentLine=25493529;
 //BA.debugLineNum = 25493529;BA.debugLine="LlenarComboBoxSiembra";
__ref._llenarcomboboxsiembra /*void*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=25493531;
 //BA.debugLineNum = 25493531;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=25493532;
 //BA.debugLineNum = 25493532;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=25493533;
 //BA.debugLineNum = 25493533;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemriego /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form2"));
RDebugUtils.currentLine=25493534;
 //BA.debugLineNum = 25493534;BA.debugLine="LlenarComboBoxRiego";
__ref._llenarcomboboxriego /*void*/ (null);
 break; }
default: {
RDebugUtils.currentLine=25493537;
 //BA.debugLineNum = 25493537;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
__c.LogImpl("325493537","Valor no reconocido: "+BA.ObjectToString(_value),0);
 break; }
}
;
 }else {
RDebugUtils.currentLine=25493540;
 //BA.debugLineNum = 25493540;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
__c.LogImpl("325493540","Error: Value no es un número válido.",0);
 };
RDebugUtils.currentLine=25493542;
 //BA.debugLineNum = 25493542;BA.debugLine="End Sub";
return "";
}
public String  _table1_cellclick(b4a.example.ef.formlabores __ref,int _col,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "table1_cellclick", false))
	 {return ((String) Debug.delegate(ba, "table1_cellclick", new Object[] {_col,_row}));}
RDebugUtils.currentLine=56033280;
 //BA.debugLineNum = 56033280;BA.debugLine="Private Sub Table1_CellClick(col As Int, row As In";
RDebugUtils.currentLine=56033281;
 //BA.debugLineNum = 56033281;BA.debugLine="ButtonDeleteInsumo.Visible=True";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=56033283;
 //BA.debugLineNum = 56033283;BA.debugLine="End Sub";
return "";
}
}