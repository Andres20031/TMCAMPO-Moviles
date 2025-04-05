package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class listperson extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.listperson");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.listperson.class).invoke(this, new Object[] {null});
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
public b4a.example3.customlistview _clv_persons = null;
public anywheresoftware.b4a.objects.LabelWrapper _label20name = null;
public b4a.example.ef.b4xprogressbar _anotherprogressbar1dias_reportados = null;
public b4a.example.ef.b4xprogressbar _anotherprogressbar2horas_extras = null;
public String _rdclink = "";
public ADR.stringdemo.stringfunctions _sf = null;
public b4a.example.ef.gifviewer _gifviewerloading = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.listperson __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="listperson";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="End Sub";
return null;
}
public void  _b4xpage_appear(b4a.example.ef.listperson __ref) throws Exception{
RDebugUtils.currentModule="listperson";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.listperson parent,b4a.example.ef.listperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.listperson __ref;
b4a.example.ef.listperson parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _personid = "";
String _personlastname = "";
String _personlastname2 = "";
String _personname = "";
String _displaytext = "";
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="listperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="CLV_Persons.Clear";
__ref._clv_persons /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="GifViewerLoading.Start";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._start /*String*/ (null);
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_list";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_listPerson",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="sf.Initialize";
__ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(ba);
RDebugUtils.currentLine=2621456;
 //BA.debugLineNum = 2621456;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listperson", "b4xpage_appear"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=2621461;
 //BA.debugLineNum = 2621461;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group11 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index11 < groupLen11) {
this.state = 6;
_row = (Object[])(group11.Get(index11));}
if (true) break;

case 14:
//C
this.state = 13;
index11++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=2621462;
 //BA.debugLineNum = 2621462;BA.debugLine="Dim personID As String = sf.Trim(row(0))";
_personid = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (0)]));
RDebugUtils.currentLine=2621463;
 //BA.debugLineNum = 2621463;BA.debugLine="Dim personLastName As String = sf.Trim(row(1))";
_personlastname = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (1)]));
RDebugUtils.currentLine=2621464;
 //BA.debugLineNum = 2621464;BA.debugLine="Dim personLastName2 As String = sf.Trim(row(2))";
_personlastname2 = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (2)]));
RDebugUtils.currentLine=2621465;
 //BA.debugLineNum = 2621465;BA.debugLine="Dim personName As String = sf.Trim(row(3))";
_personname = __ref._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv7(BA.ObjectToString(_row[(int) (3)]));
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="Dim displayText As String = personLastName & \"";
_displaytext = _personlastname+" "+_personname+" #"+_personid;
RDebugUtils.currentLine=2621468;
 //BA.debugLineNum = 2621468;BA.debugLine="CLV_Persons.Add(CreateItem(displayText, Rnd(0,";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_displaytext,parent.__c.Rnd((int) (0),(int) (100)),parent.__c.Rnd((int) (0),(int) (100))).getObject())),(Object)(_displaytext));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=2621471;
 //BA.debugLineNum = 2621471;BA.debugLine="GifViewerLoading.Stop";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._stop /*String*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2621473;
 //BA.debugLineNum = 2621473;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("32621473","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=2621476;
 //BA.debugLineNum = 2621476;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.listperson __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="listperson";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.listperson __ref,String _nombreelemento,int _diasreportados,int _horasextras) throws Exception{
__ref = this;
RDebugUtils.currentModule="listperson";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", new Object[] {_nombreelemento,_diasreportados,_horasextras}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.LabelWrapper _etiquetahorasextras = null;
anywheresoftware.b4a.objects.LabelWrapper _etiquetadiasreportados = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub CreateItem(NombreElemento As String, D";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim Panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="Panel.SetLayoutAnimated(1, 0, 0, 100%x, 119dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (119)));
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Panel.LoadLayout(\"CartDep\")";
_panel.LoadLayout("CartDep",ba);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="AnotherProgressBar1Dias_reportados.Progress = Dia";
__ref._anotherprogressbar1dias_reportados /*b4a.example.ef.b4xprogressbar*/ ._setprogress /*float*/ (null,(float) (_diasreportados));
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="AnotherProgressBar2Horas_Extras.Progress = HorasE";
__ref._anotherprogressbar2horas_extras /*b4a.example.ef.b4xprogressbar*/ ._setprogress /*float*/ (null,(float) (_horasextras));
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="Dim EtiquetaHorasExtras As Label";
_etiquetahorasextras = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="EtiquetaHorasExtras.Initialize(\"\")";
_etiquetahorasextras.Initialize(ba,"");
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="EtiquetaHorasExtras.Text = HorasExtras & \"%\"";
_etiquetahorasextras.setText(BA.ObjectToCharSequence(BA.NumberToString(_horasextras)+"%"));
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="EtiquetaHorasExtras.TextSize = 12";
_etiquetahorasextras.setTextSize((float) (12));
RDebugUtils.currentLine=2686992;
 //BA.debugLineNum = 2686992;BA.debugLine="EtiquetaHorasExtras.TextColor = Colors.White";
_etiquetahorasextras.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2686993;
 //BA.debugLineNum = 2686993;BA.debugLine="EtiquetaHorasExtras.Gravity = Gravity.LEFT";
_etiquetahorasextras.setGravity(__c.Gravity.LEFT);
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="EtiquetaHorasExtras.Gravity = Gravity.BOTTOM";
_etiquetahorasextras.setGravity(__c.Gravity.BOTTOM);
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="AnotherProgressBar2Horas_Extras.mBase.AddView(Eti";
__ref._anotherprogressbar2horas_extras /*b4a.example.ef.b4xprogressbar*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_etiquetahorasextras.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__ref._anotherprogressbar2horas_extras /*b4a.example.ef.b4xprogressbar*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2686998;
 //BA.debugLineNum = 2686998;BA.debugLine="Dim EtiquetaDiasReportados As Label";
_etiquetadiasreportados = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2686999;
 //BA.debugLineNum = 2686999;BA.debugLine="EtiquetaDiasReportados.Initialize(\"\")";
_etiquetadiasreportados.Initialize(ba,"");
RDebugUtils.currentLine=2687000;
 //BA.debugLineNum = 2687000;BA.debugLine="EtiquetaDiasReportados.Text = DiasReportados & \"%";
_etiquetadiasreportados.setText(BA.ObjectToCharSequence(BA.NumberToString(_diasreportados)+"%"));
RDebugUtils.currentLine=2687001;
 //BA.debugLineNum = 2687001;BA.debugLine="EtiquetaDiasReportados.TextSize = 13";
_etiquetadiasreportados.setTextSize((float) (13));
RDebugUtils.currentLine=2687002;
 //BA.debugLineNum = 2687002;BA.debugLine="EtiquetaDiasReportados.TextColor = Colors.White";
_etiquetadiasreportados.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2687003;
 //BA.debugLineNum = 2687003;BA.debugLine="EtiquetaDiasReportados.Gravity = Gravity.LEFT";
_etiquetadiasreportados.setGravity(__c.Gravity.LEFT);
RDebugUtils.currentLine=2687004;
 //BA.debugLineNum = 2687004;BA.debugLine="EtiquetaDiasReportados.Gravity = Gravity.BOTTOM";
_etiquetadiasreportados.setGravity(__c.Gravity.BOTTOM);
RDebugUtils.currentLine=2687006;
 //BA.debugLineNum = 2687006;BA.debugLine="AnotherProgressBar1Dias_reportados.mBase.AddView(";
__ref._anotherprogressbar1dias_reportados /*b4a.example.ef.b4xprogressbar*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_etiquetadiasreportados.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__ref._anotherprogressbar1dias_reportados /*b4a.example.ef.b4xprogressbar*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2687008;
 //BA.debugLineNum = 2687008;BA.debugLine="Label20Name.Text = NombreElemento";
__ref._label20name /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_nombreelemento));
RDebugUtils.currentLine=2687010;
 //BA.debugLineNum = 2687010;BA.debugLine="Return Panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=2687011;
 //BA.debugLineNum = 2687011;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.listperson __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="listperson";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Root.LoadLayout(\"ListPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListPerson",ba);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="GifViewerLoading.SetGif(File.DirAssets,\"carga.gif";
__ref._gifviewerloading /*b4a.example.ef.gifviewer*/ ._setgif /*String*/ (null,__c.File.getDirAssets(),"carga.gif");
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.listperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listperson";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Private CLV_Persons As CustomListView";
_clv_persons = new b4a.example3.customlistview();
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Private Label20Name As Label";
_label20name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="Private AnotherProgressBar1Dias_reportados As B4X";
_anotherprogressbar1dias_reportados = new b4a.example.ef.b4xprogressbar();
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="Private AnotherProgressBar2Horas_Extras As B4XPro";
_anotherprogressbar2horas_extras = new b4a.example.ef.b4xprogressbar();
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Dim sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="Private GifViewerLoading As GifViewer";
_gifviewerloading = new b4a.example.ef.gifviewer();
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="End Sub";
return "";
}
public String  _clv_persons_itemclick(b4a.example.ef.listperson __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="listperson";
if (Debug.shouldDelegate(ba, "clv_persons_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clv_persons_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub CLV_Persons_ItemClick (Index As Int, V";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="B4XPages.ShowPage(\"DetailsPerson\")";
_b4xpages._showpage /*String*/ (ba,"DetailsPerson");
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="B4XPages.GetPage(\"DetailsPerson\").As(DetailsPerso";
((b4a.example.ef.detailsperson)(_b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.example.ef.listperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listperson";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.example.ef.listperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listperson";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="B4XPages.ShowPage(\"EditPerson\")";
_b4xpages._showpage /*String*/ (ba,"EditPerson");
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
}