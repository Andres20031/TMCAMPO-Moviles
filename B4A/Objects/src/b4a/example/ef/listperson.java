package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class listperson extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.listperson");
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
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.listperson parent) {
this.parent = parent;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 36;BA.debugLine="CLV_Persons.Clear";
parent._clv_persons._clear();
 //BA.debugLineNum = 38;BA.debugLine="GifViewerLoading.Start";
parent._gifviewerloading._start /*String*/ ();
 //BA.debugLineNum = 41;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 42;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 43;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_list";
_cmd = parent._createcommand("select_listPerson",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 46;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 49;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 50;BA.debugLine="sf.Initialize";
parent._sf._vvv1(ba);
 //BA.debugLineNum = 51;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 53;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 56;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 57;BA.debugLine="Dim personID As String = sf.Trim(row(0))";
_personid = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (0)]));
 //BA.debugLineNum = 58;BA.debugLine="Dim personLastName As String = sf.Trim(row(1))";
_personlastname = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (1)]));
 //BA.debugLineNum = 59;BA.debugLine="Dim personLastName2 As String = sf.Trim(row(2))";
_personlastname2 = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (2)]));
 //BA.debugLineNum = 60;BA.debugLine="Dim personName As String = sf.Trim(row(3))";
_personname = parent._sf._vvvvv7(BA.ObjectToString(_row[(int) (3)]));
 //BA.debugLineNum = 62;BA.debugLine="Dim displayText As String = personLastName & \"";
_displaytext = _personlastname+" "+_personname+" #"+_personid;
 //BA.debugLineNum = 63;BA.debugLine="CLV_Persons.Add(CreateItem(displayText, Rnd(0,";
parent._clv_persons._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createitem(_displaytext,parent.__c.Rnd((int) (0),(int) (100)),parent.__c.Rnd((int) (0),(int) (100))).getObject())),(Object)(_displaytext));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 //BA.debugLineNum = 66;BA.debugLine="GifViewerLoading.Stop";
parent._gifviewerloading._stop /*String*/ ();
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 68;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("672417313","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.ef.httpjob _j) throws Exception{
}
public void  _req_result(b4a.example.ef.main._dbresult _res) throws Exception{
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 26;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 27;BA.debugLine="utilClass.Initialize";
_utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 28;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
_utilclass._setstatusbarcolor /*String*/ (__c.Colors.White,__c.Colors.White);
 //BA.debugLineNum = 30;BA.debugLine="Root.LoadLayout(\"ListPerson\")";
_root.LoadLayout("ListPerson",ba);
 //BA.debugLineNum = 31;BA.debugLine="GifViewerLoading.SetGif(File.DirAssets,\"carga.gif";
_gifviewerloading._setgif /*String*/ (__c.File.getDirAssets(),"carga.gif");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Private CLV_Persons As CustomListView";
_clv_persons = new b4a.example3.customlistview();
 //BA.debugLineNum = 7;BA.debugLine="Private Label20Name As Label";
_label20name = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private AnotherProgressBar1Dias_reportados As B4X";
_anotherprogressbar1dias_reportados = new b4a.example.ef.b4xprogressbar();
 //BA.debugLineNum = 9;BA.debugLine="Private AnotherProgressBar2Horas_Extras As B4XPro";
_anotherprogressbar2horas_extras = new b4a.example.ef.b4xprogressbar();
 //BA.debugLineNum = 10;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 11;BA.debugLine="Dim sf As StringFunctions";
_sf = new ADR.stringdemo.stringfunctions();
 //BA.debugLineNum = 14;BA.debugLine="Private GifViewerLoading As GifViewer";
_gifviewerloading = new b4a.example.ef.gifviewer();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _clv_persons_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Private Sub CLV_Persons_ItemClick (Index As Int, V";
 //BA.debugLineNum = 113;BA.debugLine="B4XPages.ShowPage(\"DetailsPerson\")";
_b4xpages._showpage /*String*/ (ba,"DetailsPerson");
 //BA.debugLineNum = 114;BA.debugLine="B4XPages.GetPage(\"DetailsPerson\").As(DetailsPerso";
((b4a.example.ef.detailsperson)(_b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/  = BA.ObjectToString(_value);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 121;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 122;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 123;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 124;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 125;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 126;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(String _nombreelemento,int _diasreportados,int _horasextras) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.LabelWrapper _etiquetahorasextras = null;
anywheresoftware.b4a.objects.LabelWrapper _etiquetadiasreportados = null;
 //BA.debugLineNum = 74;BA.debugLine="Private Sub CreateItem(NombreElemento As String, D";
 //BA.debugLineNum = 76;BA.debugLine="Dim Panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 78;BA.debugLine="Panel.SetLayoutAnimated(1, 0, 0, 100%x, 119dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (119)));
 //BA.debugLineNum = 80;BA.debugLine="Panel.LoadLayout(\"CartDep\")";
_panel.LoadLayout("CartDep",ba);
 //BA.debugLineNum = 82;BA.debugLine="AnotherProgressBar1Dias_reportados.Progress = Dia";
_anotherprogressbar1dias_reportados._setprogress /*float*/ ((float) (_diasreportados));
 //BA.debugLineNum = 84;BA.debugLine="AnotherProgressBar2Horas_Extras.Progress = HorasE";
_anotherprogressbar2horas_extras._setprogress /*float*/ ((float) (_horasextras));
 //BA.debugLineNum = 86;BA.debugLine="Dim EtiquetaHorasExtras As Label";
_etiquetahorasextras = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 87;BA.debugLine="EtiquetaHorasExtras.Initialize(\"\")";
_etiquetahorasextras.Initialize(ba,"");
 //BA.debugLineNum = 88;BA.debugLine="EtiquetaHorasExtras.Text = HorasExtras & \"%\"";
_etiquetahorasextras.setText(BA.ObjectToCharSequence(BA.NumberToString(_horasextras)+"%"));
 //BA.debugLineNum = 89;BA.debugLine="EtiquetaHorasExtras.TextSize = 12";
_etiquetahorasextras.setTextSize((float) (12));
 //BA.debugLineNum = 90;BA.debugLine="EtiquetaHorasExtras.TextColor = Colors.White";
_etiquetahorasextras.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 91;BA.debugLine="EtiquetaHorasExtras.Gravity = Gravity.LEFT";
_etiquetahorasextras.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 92;BA.debugLine="EtiquetaHorasExtras.Gravity = Gravity.BOTTOM";
_etiquetahorasextras.setGravity(__c.Gravity.BOTTOM);
 //BA.debugLineNum = 94;BA.debugLine="AnotherProgressBar2Horas_Extras.mBase.AddView(Eti";
_anotherprogressbar2horas_extras._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_etiquetahorasextras.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_anotherprogressbar2horas_extras._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 //BA.debugLineNum = 96;BA.debugLine="Dim EtiquetaDiasReportados As Label";
_etiquetadiasreportados = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 97;BA.debugLine="EtiquetaDiasReportados.Initialize(\"\")";
_etiquetadiasreportados.Initialize(ba,"");
 //BA.debugLineNum = 98;BA.debugLine="EtiquetaDiasReportados.Text = DiasReportados & \"%";
_etiquetadiasreportados.setText(BA.ObjectToCharSequence(BA.NumberToString(_diasreportados)+"%"));
 //BA.debugLineNum = 99;BA.debugLine="EtiquetaDiasReportados.TextSize = 13";
_etiquetadiasreportados.setTextSize((float) (13));
 //BA.debugLineNum = 100;BA.debugLine="EtiquetaDiasReportados.TextColor = Colors.White";
_etiquetadiasreportados.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 101;BA.debugLine="EtiquetaDiasReportados.Gravity = Gravity.LEFT";
_etiquetadiasreportados.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 102;BA.debugLine="EtiquetaDiasReportados.Gravity = Gravity.BOTTOM";
_etiquetadiasreportados.setGravity(__c.Gravity.BOTTOM);
 //BA.debugLineNum = 104;BA.debugLine="AnotherProgressBar1Dias_reportados.mBase.AddView(";
_anotherprogressbar1dias_reportados._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_etiquetadiasreportados.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_anotherprogressbar1dias_reportados._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 //BA.debugLineNum = 106;BA.debugLine="Label20Name.Text = NombreElemento";
_label20name.setText(BA.ObjectToCharSequence(_nombreelemento));
 //BA.debugLineNum = 108;BA.debugLine="Return Panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _label1_click() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Private Sub Label1_Click";
 //BA.debugLineNum = 118;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
