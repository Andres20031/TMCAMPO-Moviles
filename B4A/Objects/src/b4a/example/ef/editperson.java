package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class editperson extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.editperson");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.editperson.class).invoke(this, new Object[] {null});
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
public b4a.example3.customlistview _clv_editar = null;
public String _fecha = "";
public anywheresoftware.b4a.objects.LabelWrapper _label12fecha = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonbuscar = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public b4a.example.ef.as_datepicker _as_datepicker1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneledit = null;
public b4a.example3.customlistview _customlistview1geral = null;
public anywheresoftware.b4a.objects.LabelWrapper _labellabores = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttongrabar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttoncancelar = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.editperson __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.editperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
String[] _dateparts = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
RDebugUtils.currentLine=3473422;
 //BA.debugLineNum = 3473422;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
RDebugUtils.currentLine=3473426;
 //BA.debugLineNum = 3473426;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=3473429;
 //BA.debugLineNum = 3473429;BA.debugLine="Label12Fecha.Text = formattedDate";
__ref._label12fecha /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=3473432;
 //BA.debugLineNum = 3473432;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3473435;
 //BA.debugLineNum = 3473435;BA.debugLine="Fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=3473438;
 //BA.debugLineNum = 3473438;BA.debugLine="Log(\"Fecha: \" & Fecha)";
__c.LogImpl("33473438","Fecha: "+__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=3473439;
 //BA.debugLineNum = 3473439;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.editperson __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Root.LoadLayout(\"EditPersons\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("EditPersons",ba);
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = __c.Colors.White;
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"EditPersons1";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("EditPersons1"));
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="panel.LoadLayout(\"CardInputEditPerson\")";
_panel.LoadLayout("CardInputEditPerson",ba);
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="panel.Height=PanelEdit.Height";
_panel.setHeight(__ref._paneledit /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="End Sub";
return null;
}
public void  _buttonbuscar_click(b4a.example.ef.editperson __ref) throws Exception{
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "buttonbuscar_click", false))
	 {Debug.delegate(ba, "buttonbuscar_click", null); return;}
ResumableSub_ButtonBuscar_Click rsub = new ResumableSub_ButtonBuscar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonBuscar_Click extends BA.ResumableSub {
public ResumableSub_ButtonBuscar_Click(b4a.example.ef.editperson parent,b4a.example.ef.editperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.editperson __ref;
b4a.example.ef.editperson parent;
String[] _partesfecha = null;
int _counter = 0;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codigoemple = "";
String _nombreemple = "";
String _nit = "";
String _labor = "";
String _codmotivo = "";
String _fechamotivos = "";
b4a.example.ef.main._dbcommand _cmd2 = null;
b4a.example.ef.httpjob _j2 = null;
b4a.example.ef.main._dbresult _resno = null;
Object[] _rowno = null;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;
anywheresoftware.b4a.BA.IterableList group45;
int index45;
int groupLen45;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="editperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="If Label12Fecha.Text = \"\" Then";
if (true) break;

case 1:
//if
this.state = 28;
if ((__ref._label12fecha /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 28;
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="MsgboxAsync(\"Selecciona una fecha antes de busca";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Selecciona una fecha antes de buscar"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="CustomListView1Geral.Clear";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"EditPersons";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("EditPersons1"));
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="Label12Fecha.Text = Fecha";
__ref._label12fecha /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._fecha /*String*/ ));
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="Dim partesFecha() As String";
_partesfecha = new String[(int) (0)];
java.util.Arrays.fill(_partesfecha,"");
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="partesFecha = Regex.Split(\" \", Fecha)";
_partesfecha = parent.__c.Regex.Split(" ",__ref._fecha /*String*/ );
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="Fecha = partesFecha(0)";
__ref._fecha /*String*/  = _partesfecha[(int) (0)];
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="Log(Fecha)";
parent.__c.LogImpl("33407883",__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="Dim counter As Int";
_counter = 0;
RDebugUtils.currentLine=3407886;
 //BA.debugLineNum = 3407886;BA.debugLine="counter = 0";
_counter = (int) (0);
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=3407890;
 //BA.debugLineNum = 3407890;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lab";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labores_Echas",new Object[]{(Object)(__ref._fecha /*String*/ )});
RDebugUtils.currentLine=3407892;
 //BA.debugLineNum = 3407892;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "editperson", "buttonbuscar_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 29;
return;
case 29:
//C
this.state = 6;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=3407894;
 //BA.debugLineNum = 3407894;BA.debugLine="If j.Success Then";
if (true) break;

case 6:
//if
this.state = 19;
if (_j._success /*boolean*/ ) { 
this.state = 8;
}else {
this.state = 18;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=3407895;
 //BA.debugLineNum = 3407895;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=3407896;
 //BA.debugLineNum = 3407896;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "editperson", "buttonbuscar_click"), (Object)(_req));
this.state = 30;
return;
case 30:
//C
this.state = 9;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=3407898;
 //BA.debugLineNum = 3407898;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 9:
//for
this.state = 16;
group20 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 31;
if (true) break;

case 31:
//C
this.state = 16;
if (index20 < groupLen20) {
this.state = 11;
_row = (Object[])(group20.Get(index20));}
if (true) break;

case 32:
//C
this.state = 31;
index20++;
if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=3407900;
 //BA.debugLineNum = 3407900;BA.debugLine="Dim CodigoEmple As String = row(0)";
_codigoemple = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=3407903;
 //BA.debugLineNum = 3407903;BA.debugLine="Dim NombreEmple As String = row(1)&\" \"&row(2)&";
_nombreemple = BA.ObjectToString(_row[(int) (1)])+" "+BA.ObjectToString(_row[(int) (2)])+" "+BA.ObjectToString(_row[(int) (3)]);
RDebugUtils.currentLine=3407906;
 //BA.debugLineNum = 3407906;BA.debugLine="Dim Nit As String = row(4)";
_nit = BA.ObjectToString(_row[(int) (4)]);
RDebugUtils.currentLine=3407909;
 //BA.debugLineNum = 3407909;BA.debugLine="Dim Labor As String = row(5)";
_labor = BA.ObjectToString(_row[(int) (5)]);
RDebugUtils.currentLine=3407910;
 //BA.debugLineNum = 3407910;BA.debugLine="If Labor = \"null\" Then";
if (true) break;

case 12:
//if
this.state = 15;
if ((_labor).equals("null")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=3407911;
 //BA.debugLineNum = 3407911;BA.debugLine="Labor = \"\"";
_labor = "";
 if (true) break;

case 15:
//C
this.state = 32;
;
RDebugUtils.currentLine=3407915;
 //BA.debugLineNum = 3407915;BA.debugLine="Dim CodMotivo As String = row(6)";
_codmotivo = BA.ObjectToString(_row[(int) (6)]);
RDebugUtils.currentLine=3407918;
 //BA.debugLineNum = 3407918;BA.debugLine="Dim FechaMotivos As String = row(7)";
_fechamotivos = BA.ObjectToString(_row[(int) (7)]);
RDebugUtils.currentLine=3407921;
 //BA.debugLineNum = 3407921;BA.debugLine="Dim partesFecha() As String";
_partesfecha = new String[(int) (0)];
java.util.Arrays.fill(_partesfecha,"");
RDebugUtils.currentLine=3407922;
 //BA.debugLineNum = 3407922;BA.debugLine="partesFecha = Regex.Split(\" \", FechaMotivos)";
_partesfecha = parent.__c.Regex.Split(" ",_fechamotivos);
RDebugUtils.currentLine=3407923;
 //BA.debugLineNum = 3407923;BA.debugLine="FechaMotivos = partesFecha(0)";
_fechamotivos = _partesfecha[(int) (0)];
RDebugUtils.currentLine=3407925;
 //BA.debugLineNum = 3407925;BA.debugLine="CustomListView1Geral.Add(CreateItemLabores(cou";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemlabores /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_counter,_codigoemple,_nombreemple,_nit,_labor,_codmotivo,_fechamotivos).getObject())),(Object)(_counter));
RDebugUtils.currentLine=3407926;
 //BA.debugLineNum = 3407926;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
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
RDebugUtils.currentLine=3407929;
 //BA.debugLineNum = 3407929;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("33407929","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=3407931;
 //BA.debugLineNum = 3407931;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=3407933;
 //BA.debugLineNum = 3407933;BA.debugLine="Dim cmd2 As DBCommand = CreateCommand(\"select_la";
_cmd2 = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labores_NoEchas",new Object[]{(Object)(__ref._fecha /*String*/ )});
RDebugUtils.currentLine=3407934;
 //BA.debugLineNum = 3407934;BA.debugLine="Wait For (Req.ExecuteQuery(cmd2, 0, Null)) JobDo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "editperson", "buttonbuscar_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd2,(int) (0),parent.__c.Null)));
this.state = 33;
return;
case 33:
//C
this.state = 20;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=3407935;
 //BA.debugLineNum = 3407935;BA.debugLine="If j2.Success Then";
if (true) break;

case 20:
//if
this.state = 27;
if (_j2._success /*boolean*/ ) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=3407936;
 //BA.debugLineNum = 3407936;BA.debugLine="Req.HandleJobAsync(j2, \"req_no\")";
_req._handlejobasync /*void*/ (null,_j2,"req_no");
RDebugUtils.currentLine=3407937;
 //BA.debugLineNum = 3407937;BA.debugLine="Wait For (Req) req_no_Result(resNo As DBResult)";
parent.__c.WaitFor("req_no_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "editperson", "buttonbuscar_click"), (Object)(_req));
this.state = 34;
return;
case 34:
//C
this.state = 23;
_resno = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=3407938;
 //BA.debugLineNum = 3407938;BA.debugLine="For Each rowNo() As Object In resNo.Rows";
if (true) break;

case 23:
//for
this.state = 26;
group45 = _resno.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index45 = 0;
groupLen45 = group45.getSize();
this.state = 35;
if (true) break;

case 35:
//C
this.state = 26;
if (index45 < groupLen45) {
this.state = 25;
_rowno = (Object[])(group45.Get(index45));}
if (true) break;

case 36:
//C
this.state = 35;
index45++;
if (true) break;

case 25:
//C
this.state = 36;
RDebugUtils.currentLine=3407940;
 //BA.debugLineNum = 3407940;BA.debugLine="Dim CodigoEmple As String = row(0)";
_codigoemple = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=3407942;
 //BA.debugLineNum = 3407942;BA.debugLine="Dim NombreEmple As String = row(1)&\" \"&row(2)&";
_nombreemple = BA.ObjectToString(_row[(int) (1)])+" "+BA.ObjectToString(_row[(int) (2)])+" "+BA.ObjectToString(_row[(int) (3)]);
RDebugUtils.currentLine=3407943;
 //BA.debugLineNum = 3407943;BA.debugLine="CustomListView1Geral.Add(CreateItemLabores(cou";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemlabores /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_counter,_codigoemple,_nombreemple,"N/A","N/A","N/A","N/A").getObject())),(Object)(_counter));
RDebugUtils.currentLine=3407944;
 //BA.debugLineNum = 3407944;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=3407949;
 //BA.debugLineNum = 3407949;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.editperson __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=87949312;
 //BA.debugLineNum = 87949312;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=87949313;
 //BA.debugLineNum = 87949313;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=87949314;
 //BA.debugLineNum = 87949314;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=87949315;
 //BA.debugLineNum = 87949315;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=87949316;
 //BA.debugLineNum = 87949316;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=87949317;
 //BA.debugLineNum = 87949317;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=87949318;
 //BA.debugLineNum = 87949318;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemlabores(b4a.example.ef.editperson __ref,int _consecutivo,String _codigoemple,String _nombreemple,String _nit,String _labor,String _codmotivo,String _fechamotivos) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "createitemlabores", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemlabores", new Object[] {_consecutivo,_codigoemple,_nombreemple,_nit,_labor,_codmotivo,_fechamotivos}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=87752704;
 //BA.debugLineNum = 87752704;BA.debugLine="Private Sub CreateItemLabores (Consecutivo As Int,";
RDebugUtils.currentLine=87752706;
 //BA.debugLineNum = 87752706;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=87752707;
 //BA.debugLineNum = 87752707;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 240dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (240)));
RDebugUtils.currentLine=87752709;
 //BA.debugLineNum = 87752709;BA.debugLine="panel.LoadLayout(\"CardLaboresNoRe\")";
_panel.LoadLayout("CardLaboresNoRe",ba);
RDebugUtils.currentLine=87752710;
 //BA.debugLineNum = 87752710;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=87752711;
 //BA.debugLineNum = 87752711;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=87752714;
 //BA.debugLineNum = 87752714;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Codigo Emplea";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Codigo Empleado: ")).PopAll();
RDebugUtils.currentLine=87752715;
 //BA.debugLineNum = 87752715;BA.debugLine="cs.Color(Colors.Black).Underline.Append(CodigoEmp";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_codigoemple+__c.CRLF)).PopAll();
RDebugUtils.currentLine=87752717;
 //BA.debugLineNum = 87752717;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Nombre Emplea";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Nombre Empleado: ")).PopAll();
RDebugUtils.currentLine=87752718;
 //BA.debugLineNum = 87752718;BA.debugLine="cs.Color(Colors.Black).Underline.Append(NombreEmp";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_nombreemple+__c.CRLF)).PopAll();
RDebugUtils.currentLine=87752720;
 //BA.debugLineNum = 87752720;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"NIT: \").PopAl";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("NIT: ")).PopAll();
RDebugUtils.currentLine=87752721;
 //BA.debugLineNum = 87752721;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Nit & CRL";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).PopAll();
RDebugUtils.currentLine=87752723;
 //BA.debugLineNum = 87752723;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Labor: ")).PopAll();
RDebugUtils.currentLine=87752724;
 //BA.debugLineNum = 87752724;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Labor & C";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_labor+__c.CRLF)).PopAll();
RDebugUtils.currentLine=87752726;
 //BA.debugLineNum = 87752726;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Codigo Motivo";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Codigo Motivos: ")).PopAll();
RDebugUtils.currentLine=87752727;
 //BA.debugLineNum = 87752727;BA.debugLine="cs.Color(Colors.Black).Underline.Append(CodMotivo";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_codmotivo+__c.CRLF)).PopAll();
RDebugUtils.currentLine=87752729;
 //BA.debugLineNum = 87752729;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha: ")).PopAll();
RDebugUtils.currentLine=87752730;
 //BA.debugLineNum = 87752730;BA.debugLine="cs.Color(Colors.Black).Underline.Append(FechaMoti";
_cs.Color(__c.Colors.Black).Underline().Append(BA.ObjectToCharSequence(_fechamotivos+__c.CRLF)).PopAll();
RDebugUtils.currentLine=87752732;
 //BA.debugLineNum = 87752732;BA.debugLine="LabelLabores.Text = cs";
__ref._labellabores /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=87752733;
 //BA.debugLineNum = 87752733;BA.debugLine="ButtonGrabar.Tag = Consecutivo";
__ref._buttongrabar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=87752734;
 //BA.debugLineNum = 87752734;BA.debugLine="ButtonCancelar.Tag = Consecutivo";
__ref._buttoncancelar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=87752736;
 //BA.debugLineNum = 87752736;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=87752737;
 //BA.debugLineNum = 87752737;BA.debugLine="End Sub";
return null;
}
public String  _buttoncancelar_click(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "buttoncancelar_click", false))
	 {return ((String) Debug.delegate(ba, "buttoncancelar_click", null));}
RDebugUtils.currentLine=87883776;
 //BA.debugLineNum = 87883776;BA.debugLine="Private Sub ButtonCancelar_Click";
RDebugUtils.currentLine=87883778;
 //BA.debugLineNum = 87883778;BA.debugLine="End Sub";
return "";
}
public String  _buttongrabar_click(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "buttongrabar_click", false))
	 {return ((String) Debug.delegate(ba, "buttongrabar_click", null));}
RDebugUtils.currentLine=87818240;
 //BA.debugLineNum = 87818240;BA.debugLine="Private Sub ButtonGrabar_Click";
RDebugUtils.currentLine=87818242;
 //BA.debugLineNum = 87818242;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Private CLV_Editar As CustomListView";
_clv_editar = new b4a.example3.customlistview();
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Dim Fecha As String";
_fecha = "";
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Private Label12Fecha As Label";
_label12fecha = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Private ButtonBuscar As Button";
_buttonbuscar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="Private PanelEdit As Panel";
_paneledit = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="Private LabelLabores As Label";
_labellabores = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="Private ButtonGrabar As Button";
_buttongrabar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="Private ButtonCancelar As Button";
_buttoncancelar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="End Sub";
return "";
}
public String  _label12fecha_click(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "label12fecha_click", false))
	 {return ((String) Debug.delegate(ba, "label12fecha_click", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub Label12Fecha_Click";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public String  _labelatras_click(b4a.example.ef.editperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editperson";
if (Debug.shouldDelegate(ba, "labelatras_click", false))
	 {return ((String) Debug.delegate(ba, "labelatras_click", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub LabelAtras_Click";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return "";
}
}