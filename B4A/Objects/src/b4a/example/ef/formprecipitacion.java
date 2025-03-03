package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formprecipitacion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formprecipitacion");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.formprecipitacion.class).invoke(this, new Object[] {null});
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
public String _rdclink = "";
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public b4a.example3.customlistview _customlistview1geral = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1geral = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13time = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxpluviometro = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthorafin = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public b4a.example.ef.as_datepicker _as_datepicker1 = null;
public String _fecha = "";
public String _selectedcdgo_plvmtro = "";
public String _selectednombre_plvmtro = "";
public String _selectednit_plvmtro = "";
public String _selectedhda_pvlmtro = "";
public String _textocapturado = "";
public anywheresoftware.b4a.objects.collections.Map _pluviometromap = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.formprecipitacion __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formprecipitacion __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=16777221;
 //BA.debugLineNum = 16777221;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=16777224;
 //BA.debugLineNum = 16777224;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=16777227;
 //BA.debugLineNum = 16777227;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=16777230;
 //BA.debugLineNum = 16777230;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=16777233;
 //BA.debugLineNum = 16777233;BA.debugLine="fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=16777236;
 //BA.debugLineNum = 16777236;BA.debugLine="Log(fecha)";
__c.LogImpl("516777236",__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=16777237;
 //BA.debugLineNum = 16777237;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear(b4a.example.ef.formprecipitacion __ref) throws Exception{
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formprecipitacion parent,b4a.example.ef.formprecipitacion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formprecipitacion __ref;
b4a.example.ef.formprecipitacion parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmdpluviometro = null;
b4a.example.ef.httpjob _j2 = null;
b4a.example.ef.main._dbresult _respluviometro = null;
Object[] _rowpluviometro = null;
String _cdgo_plvmtro = "";
String _nombre_plvmtro = "";
String _nit_plvmtro = "";
String _hda_pvlmtro = "";
anywheresoftware.b4a.objects.collections.Map _detailsmap = null;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formprecipitacion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="pluviometroMap.Initialize";
__ref._pluviometromap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=16318471;
 //BA.debugLineNum = 16318471;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"formPreci\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("formPreci"));
RDebugUtils.currentLine=16318473;
 //BA.debugLineNum = 16318473;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16318474;
 //BA.debugLineNum = 16318474;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=16318477;
 //BA.debugLineNum = 16318477;BA.debugLine="Dim cmdPluviometro As DBCommand = CreateCommand(\"";
_cmdpluviometro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maquina_pluviometros",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=16318478;
 //BA.debugLineNum = 16318478;BA.debugLine="Wait For (Req.ExecuteQuery(cmdPluviometro, 0, Nul";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprecipitacion", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdpluviometro,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16318479;
 //BA.debugLineNum = 16318479;BA.debugLine="If j2.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j2._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16318480;
 //BA.debugLineNum = 16318480;BA.debugLine="Req.HandleJobAsync(j2, \"req_pluviometro\")";
_req._handlejobasync /*void*/ (null,_j2,"req_pluviometro");
RDebugUtils.currentLine=16318481;
 //BA.debugLineNum = 16318481;BA.debugLine="Wait For (Req) req_pluviometro_Result(resPluviom";
parent.__c.WaitFor("req_pluviometro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprecipitacion", "b4xpage_appear"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_respluviometro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=16318482;
 //BA.debugLineNum = 16318482;BA.debugLine="For Each rowPluviometro() As Object In resPluvio";
if (true) break;

case 4:
//for
this.state = 7;
group15 = _respluviometro.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index15 < groupLen15) {
this.state = 6;
_rowpluviometro = (Object[])(group15.Get(index15));}
if (true) break;

case 14:
//C
this.state = 13;
index15++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=16318483;
 //BA.debugLineNum = 16318483;BA.debugLine="Dim cdgo_Plvmtro As String = rowPluviometro(0)";
_cdgo_plvmtro = BA.ObjectToString(_rowpluviometro[(int) (0)]);
RDebugUtils.currentLine=16318484;
 //BA.debugLineNum = 16318484;BA.debugLine="Dim Nombre_Plvmtro As String = rowPluviometro(1";
_nombre_plvmtro = BA.ObjectToString(_rowpluviometro[(int) (1)]);
RDebugUtils.currentLine=16318485;
 //BA.debugLineNum = 16318485;BA.debugLine="Dim Nit_Plvmtro As String = rowPluviometro(2)";
_nit_plvmtro = BA.ObjectToString(_rowpluviometro[(int) (2)]);
RDebugUtils.currentLine=16318486;
 //BA.debugLineNum = 16318486;BA.debugLine="Dim Hda_Pvlmtro As String = rowPluviometro(3)";
_hda_pvlmtro = BA.ObjectToString(_rowpluviometro[(int) (3)]);
RDebugUtils.currentLine=16318489;
 //BA.debugLineNum = 16318489;BA.debugLine="Dim detailsMap As Map";
_detailsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16318490;
 //BA.debugLineNum = 16318490;BA.debugLine="detailsMap.Initialize";
_detailsmap.Initialize();
RDebugUtils.currentLine=16318491;
 //BA.debugLineNum = 16318491;BA.debugLine="detailsMap.Put(\"Nombre\", Nombre_Plvmtro)";
_detailsmap.Put((Object)("Nombre"),(Object)(_nombre_plvmtro));
RDebugUtils.currentLine=16318492;
 //BA.debugLineNum = 16318492;BA.debugLine="detailsMap.Put(\"Nit\", Nit_Plvmtro)";
_detailsmap.Put((Object)("Nit"),(Object)(_nit_plvmtro));
RDebugUtils.currentLine=16318493;
 //BA.debugLineNum = 16318493;BA.debugLine="detailsMap.Put(\"Hda\", Hda_Pvlmtro)";
_detailsmap.Put((Object)("Hda"),(Object)(_hda_pvlmtro));
RDebugUtils.currentLine=16318495;
 //BA.debugLineNum = 16318495;BA.debugLine="pluviometroMap.Put(cdgo_Plvmtro, detailsMap)";
__ref._pluviometromap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_cdgo_plvmtro),(Object)(_detailsmap.getObject()));
RDebugUtils.currentLine=16318498;
 //BA.debugLineNum = 16318498;BA.debugLine="SD_xComboBoxPluviometro.Add(Nombre_Plvmtro, cdg";
__ref._sd_xcomboboxpluviometro /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombre_plvmtro,(Object)(_cdgo_plvmtro));
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
RDebugUtils.currentLine=16318501;
 //BA.debugLineNum = 16318501;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
parent.__c.LogImpl("516318501","Error en la consulta de Maquina: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=16318503;
 //BA.debugLineNum = 16318503;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=16318505;
 //BA.debugLineNum = 16318505;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.formprecipitacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 92%Y)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (92),ba));
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="panel.LoadLayout(\"addPrecipitacionUI\")";
_panel.LoadLayout("addPrecipitacionUI",ba);
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formprecipitacion __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formprecipitacion __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="End Sub";
return "";
}
public void  _button1_click(b4a.example.ef.formprecipitacion __ref) throws Exception{
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {Debug.delegate(ba, "button1_click", null); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formprecipitacion parent,b4a.example.ef.formprecipitacion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formprecipitacion __ref;
b4a.example.ef.formprecipitacion parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formprecipitacion";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert.pluv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert.pluviometro",new Object[]{(Object)(__ref._selectedcdgo_plvmtro /*String*/ ),(Object)(__ref._fecha /*String*/ ),(Object)(__ref._textocapturado /*String*/ ),(Object)(__ref._selectednit_plvmtro /*String*/ ),(Object)(__ref._selectedhda_pvlmtro /*String*/ )});
RDebugUtils.currentLine=16908296;
 //BA.debugLineNum = 16908296;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=16908297;
 //BA.debugLineNum = 16908297;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formprecipitacion", "button1_click"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16908300;
 //BA.debugLineNum = 16908300;BA.debugLine="Try";
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
RDebugUtils.currentLine=16908301;
 //BA.debugLineNum = 16908301;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=16908302;
 //BA.debugLineNum = 16908302;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=16908304;
 //BA.debugLineNum = 16908304;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("516908304","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=16908307;
 //BA.debugLineNum = 16908307;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("516908307","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=16908309;
 //BA.debugLineNum = 16908309;BA.debugLine="End Sub";
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
public String  _class_globals(b4a.example.ef.formprecipitacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=16121864;
 //BA.debugLineNum = 16121864;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16121865;
 //BA.debugLineNum = 16121865;BA.debugLine="Private SD_xComboBoxPluviometro As SD_xComboBox";
_sd_xcomboboxpluviometro = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=16121866;
 //BA.debugLineNum = 16121866;BA.debugLine="Private EditTextHoraFin As EditText";
_edittexthorafin = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=16121867;
 //BA.debugLineNum = 16121867;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=16121868;
 //BA.debugLineNum = 16121868;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=16121869;
 //BA.debugLineNum = 16121869;BA.debugLine="Dim fecha As String";
_fecha = "";
RDebugUtils.currentLine=16121871;
 //BA.debugLineNum = 16121871;BA.debugLine="Dim selectedCdgo_Plvmtro As String";
_selectedcdgo_plvmtro = "";
RDebugUtils.currentLine=16121872;
 //BA.debugLineNum = 16121872;BA.debugLine="Dim selectedNombre_Plvmtro As String";
_selectednombre_plvmtro = "";
RDebugUtils.currentLine=16121873;
 //BA.debugLineNum = 16121873;BA.debugLine="Dim selectedNit_Plvmtro As String";
_selectednit_plvmtro = "";
RDebugUtils.currentLine=16121874;
 //BA.debugLineNum = 16121874;BA.debugLine="Dim selectedHda_Pvlmtro As String";
_selectedhda_pvlmtro = "";
RDebugUtils.currentLine=16121875;
 //BA.debugLineNum = 16121875;BA.debugLine="Dim textoCapturado As String";
_textocapturado = "";
RDebugUtils.currentLine=16121876;
 //BA.debugLineNum = 16121876;BA.debugLine="Dim pluviometroMap As Map";
_pluviometromap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16121877;
 //BA.debugLineNum = 16121877;BA.debugLine="End Sub";
return "";
}
public String  _edittexthorafin_textchanged(b4a.example.ef.formprecipitacion __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "edittexthorafin_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittexthorafin_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Private Sub EditTextHoraFin_TextChanged (Old As St";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Log(\"Texto anterior: \" & Old)";
__c.LogImpl("516842753","Texto anterior: "+_old,0);
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="Log(\"Texto nuevo: \" & New)";
__c.LogImpl("516842754","Texto nuevo: "+_new,0);
RDebugUtils.currentLine=16842760;
 //BA.debugLineNum = 16842760;BA.debugLine="textoCapturado = New";
__ref._textocapturado /*String*/  = _new;
RDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="Log(\"El texto es mayor de 5 caracteres: \" & texto";
__c.LogImpl("516842761","El texto es mayor de 5 caracteres: "+__ref._textocapturado /*String*/ ,0);
RDebugUtils.currentLine=16842763;
 //BA.debugLineNum = 16842763;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formprecipitacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formprecipitacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click(b4a.example.ef.formprecipitacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "label2save_click", false))
	 {return ((String) Debug.delegate(ba, "label2save_click", null));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Private Sub Label2Save_Click";
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxpluviometro_itemclick(b4a.example.ef.formprecipitacion __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formprecipitacion";
if (Debug.shouldDelegate(ba, "sd_xcomboboxpluviometro_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxpluviometro_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.Map _detailsmap = null;
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Private Sub SD_xComboBoxPluviometro_ItemClick (Pos";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="Log(\"VALOR COMBOBOX: \" & Value)";
__c.LogImpl("516711681","VALOR COMBOBOX: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="If pluviometroMap.ContainsKey(Value) Then";
if (__ref._pluviometromap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_value)) { 
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="Dim detailsMap As Map = pluviometroMap.Get(Value";
_detailsmap = new anywheresoftware.b4a.objects.collections.Map();
_detailsmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._pluviometromap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_value)));
RDebugUtils.currentLine=16711686;
 //BA.debugLineNum = 16711686;BA.debugLine="selectedCdgo_Plvmtro = Value";
__ref._selectedcdgo_plvmtro /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="selectedNombre_Plvmtro = detailsMap.Get(\"Nombre\"";
__ref._selectednombre_plvmtro /*String*/  = BA.ObjectToString(_detailsmap.Get((Object)("Nombre")));
RDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="selectedNit_Plvmtro = detailsMap.Get(\"Nit\")";
__ref._selectednit_plvmtro /*String*/  = BA.ObjectToString(_detailsmap.Get((Object)("Nit")));
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="selectedHda_Pvlmtro = detailsMap.Get(\"Hda\")";
__ref._selectedhda_pvlmtro /*String*/  = BA.ObjectToString(_detailsmap.Get((Object)("Hda")));
RDebugUtils.currentLine=16711692;
 //BA.debugLineNum = 16711692;BA.debugLine="Log(\"Código: \" & selectedCdgo_Plvmtro)";
__c.LogImpl("516711692","Código: "+__ref._selectedcdgo_plvmtro /*String*/ ,0);
RDebugUtils.currentLine=16711693;
 //BA.debugLineNum = 16711693;BA.debugLine="Log(\"Nombre: \" & selectedNombre_Plvmtro)";
__c.LogImpl("516711693","Nombre: "+__ref._selectednombre_plvmtro /*String*/ ,0);
RDebugUtils.currentLine=16711694;
 //BA.debugLineNum = 16711694;BA.debugLine="Log(\"NIT: \" & selectedNit_Plvmtro)";
__c.LogImpl("516711694","NIT: "+__ref._selectednit_plvmtro /*String*/ ,0);
RDebugUtils.currentLine=16711695;
 //BA.debugLineNum = 16711695;BA.debugLine="Log(\"Hacienda: \" & selectedHda_Pvlmtro)";
__c.LogImpl("516711695","Hacienda: "+__ref._selectedhda_pvlmtro /*String*/ ,0);
 }else {
RDebugUtils.currentLine=16711697;
 //BA.debugLineNum = 16711697;BA.debugLine="Log(\"Error: No se encontraron detalles para el c";
__c.LogImpl("516711697","Error: No se encontraron detalles para el código seleccionado.",0);
 };
RDebugUtils.currentLine=16711699;
 //BA.debugLineNum = 16711699;BA.debugLine="End Sub";
return "";
}
}