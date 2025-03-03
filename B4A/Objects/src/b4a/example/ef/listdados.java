package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class listdados extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.listdados");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.listdados.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1details = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1details2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1agendar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1check = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2del = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4final = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3inicial = null;
public anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog _cd = null;
public lib.intellvold.datepicker.DatePicker _datepicker = null;
public lib.intellvold.datepicker.clander _mycalendar = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1area = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1textarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _label20desc = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1idmaquina = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.listdados __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=67371008;
 //BA.debugLineNum = 67371008;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=67371009;
 //BA.debugLineNum = 67371009;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=67371010;
 //BA.debugLineNum = 67371010;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_appear(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=67502080;
 //BA.debugLineNum = 67502080;BA.debugLine="Sub B4XPage_Appear";
RDebugUtils.currentLine=67502081;
 //BA.debugLineNum = 67502081;BA.debugLine="listDadosMaquina";
__ref._listdadosmaquina /*String*/ (null);
RDebugUtils.currentLine=67502082;
 //BA.debugLineNum = 67502082;BA.debugLine="End Sub";
return "";
}
public String  _listdadosmaquina(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "listdadosmaquina", false))
	 {return ((String) Debug.delegate(ba, "listdadosmaquina", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
String _hacienda = "";
String _lote = "";
String _labor = "";
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=67633152;
 //BA.debugLineNum = 67633152;BA.debugLine="Sub listDadosMaquina";
RDebugUtils.currentLine=67633153;
 //BA.debugLineNum = 67633153;BA.debugLine="CLV_Persons.Clear";
__ref._clv_persons /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=67633154;
 //BA.debugLineNum = 67633154;BA.debugLine="Label2.Text=Chr(0xE145)";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe145))));
RDebugUtils.currentLine=67633155;
 //BA.debugLineNum = 67633155;BA.debugLine="Label3.Text=\"Labores de Campo\"";
__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Labores de Campo"));
RDebugUtils.currentLine=67633156;
 //BA.debugLineNum = 67633156;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=67633157;
 //BA.debugLineNum = 67633157;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM ma";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina")));
RDebugUtils.currentLine=67633158;
 //BA.debugLineNum = 67633158;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=67633159;
 //BA.debugLineNum = 67633159;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=67633160;
 //BA.debugLineNum = 67633160;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
__c.LogImpl("567633160","=====Maquinas #"+BA.NumberToString(_i)+"=====",0);
RDebugUtils.currentLine=67633161;
 //BA.debugLineNum = 67633161;BA.debugLine="Log(Cursor.GetString(\"id\"))";
__c.LogImpl("567633161",_cursor.GetString("id"),0);
RDebugUtils.currentLine=67633163;
 //BA.debugLineNum = 67633163;BA.debugLine="Dim Hacienda As String=Cursor.GetString(\"haciend";
_hacienda = _cursor.GetString("hacienda");
RDebugUtils.currentLine=67633164;
 //BA.debugLineNum = 67633164;BA.debugLine="Dim Lote As String=Cursor.GetString(\"Lote\")";
_lote = _cursor.GetString("Lote");
RDebugUtils.currentLine=67633165;
 //BA.debugLineNum = 67633165;BA.debugLine="Dim labor As String=Cursor.GetString(\"labor\")";
_labor = _cursor.GetString("labor");
RDebugUtils.currentLine=67633166;
 //BA.debugLineNum = 67633166;BA.debugLine="CLV_Persons.Add(CreateItemMaquinas(Hacienda,Lote";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemmaquinas /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_hacienda,_lote,_labor).getObject())),(Object)(_cursor.GetString("id")));
 }
};
RDebugUtils.currentLine=67633168;
 //BA.debugLineNum = 67633168;BA.debugLine="Log(i)";
__c.LogImpl("567633168",BA.NumberToString(_i),0);
RDebugUtils.currentLine=67633169;
 //BA.debugLineNum = 67633169;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=67633170;
 //BA.debugLineNum = 67633170;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=67633171;
 //BA.debugLineNum = 67633171;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=67633172;
 //BA.debugLineNum = 67633172;BA.debugLine="p.SetLayout(0,0,CLV_Persons.AsView.Width,CLV_Per";
_p.SetLayout((int) (0),(int) (0),__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=67633173;
 //BA.debugLineNum = 67633173;BA.debugLine="p.LoadLayout(\"errorLayout\")";
_p.LoadLayout("errorLayout",ba);
RDebugUtils.currentLine=67633174;
 //BA.debugLineNum = 67633174;BA.debugLine="CLV_Persons.Add(p,0)";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(0));
 };
RDebugUtils.currentLine=67633176;
 //BA.debugLineNum = 67633176;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.listdados __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=67436544;
 //BA.debugLineNum = 67436544;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=67436545;
 //BA.debugLineNum = 67436545;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=67436546;
 //BA.debugLineNum = 67436546;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=67436547;
 //BA.debugLineNum = 67436547;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=67436548;
 //BA.debugLineNum = 67436548;BA.debugLine="Root.LoadLayout(\"ListPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListPerson",ba);
RDebugUtils.currentLine=67436549;
 //BA.debugLineNum = 67436549;BA.debugLine="Label3.Text=\"List dados\"";
__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("List dados"));
RDebugUtils.currentLine=67436551;
 //BA.debugLineNum = 67436551;BA.debugLine="End Sub";
return "";
}
public void  _button1addisumo_click(b4a.example.ef.listdados __ref) throws Exception{
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "button1addisumo_click", false))
	 {Debug.delegate(ba, "button1addisumo_click", null); return;}
ResumableSub_Button1AddIsumo_Click rsub = new ResumableSub_Button1AddIsumo_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1AddIsumo_Click extends BA.ResumableSub {
public ResumableSub_Button1AddIsumo_Click(b4a.example.ef.listdados parent,b4a.example.ef.listdados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.listdados __ref;
b4a.example.ef.listdados parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="listdados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=68681729;
 //BA.debugLineNum = 68681729;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"form"));
RDebugUtils.currentLine=68681730;
 //BA.debugLineNum = 68681730;BA.debugLine="Sleep(90)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1addisumo_click"),(int) (90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=68681731;
 //BA.debugLineNum = 68681731;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"new\"";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._tipo /*String*/  = "new";
RDebugUtils.currentLine=68681732;
 //BA.debugLineNum = 68681732;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Rnd(0";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._idmaquina /*int*/  = parent.__c.Rnd((int) (0001),(int) (9999));
RDebugUtils.currentLine=68681733;
 //BA.debugLineNum = 68681733;BA.debugLine="B4XPages.ShowPage(\"Form\")";
parent._b4xpages._showpage /*String*/ (ba,"Form");
RDebugUtils.currentLine=68681734;
 //BA.debugLineNum = 68681734;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _button1agendar_click(b4a.example.ef.listdados __ref) throws Exception{
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "button1agendar_click", false))
	 {Debug.delegate(ba, "button1agendar_click", null); return;}
ResumableSub_Button1agendar_Click rsub = new ResumableSub_Button1agendar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1agendar_Click extends BA.ResumableSub {
public ResumableSub_Button1agendar_Click(b4a.example.ef.listdados parent,b4a.example.ef.listdados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.listdados __ref;
b4a.example.ef.listdados parent;
int _id = 0;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="listdados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=68026369;
 //BA.debugLineNum = 68026369;BA.debugLine="Button1agendar=	Sender";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=68026370;
 //BA.debugLineNum = 68026370;BA.debugLine="Log(Button1agendar.Tag)";
parent.__c.LogImpl("568026370",BA.ObjectToString(__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=68026372;
 //BA.debugLineNum = 68026372;BA.debugLine="Dim	id As Int=Button1agendar.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=68026374;
 //BA.debugLineNum = 68026374;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=68026375;
 //BA.debugLineNum = 68026375;BA.debugLine="cd.SetSize(100%x,40%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=68026376;
 //BA.debugLineNum = 68026376;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1agendar_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=68026377;
 //BA.debugLineNum = 68026377;BA.debugLine="DialogPanel.LoadLayout(\"dialogAgenda\")";
_dialogpanel.LoadLayout("dialogAgenda",ba);
RDebugUtils.currentLine=68026378;
 //BA.debugLineNum = 68026378;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=68026379;
 //BA.debugLineNum = 68026379;BA.debugLine="EditText1Area.Color=Colors.Transparent";
__ref._edittext1area /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=68026380;
 //BA.debugLineNum = 68026380;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=68026381;
 //BA.debugLineNum = 68026381;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1agendar_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=68026382;
 //BA.debugLineNum = 68026382;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=68026383;
 //BA.debugLineNum = 68026383;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("568026383","DADOS:",0);
RDebugUtils.currentLine=68026385;
 //BA.debugLineNum = 68026385;BA.debugLine="Log(Label3Inicial.Text)";
parent.__c.LogImpl("568026385",__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=68026386;
 //BA.debugLineNum = 68026386;BA.debugLine="Log(Label4Final.Text)";
parent.__c.LogImpl("568026386",__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=68026387;
 //BA.debugLineNum = 68026387;BA.debugLine="Log(EditText1Area.Text)";
parent.__c.LogImpl("568026387",__ref._edittext1area /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),0);
RDebugUtils.currentLine=68026388;
 //BA.debugLineNum = 68026388;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("568026388","=======================",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=68026391;
 //BA.debugLineNum = 68026391;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _button1agendarpopuo_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "button1agendarpopuo_click", false))
	 {return ((String) Debug.delegate(ba, "button1agendarpopuo_click", null));}
RDebugUtils.currentLine=68485120;
 //BA.debugLineNum = 68485120;BA.debugLine="Private Sub Button1agendarPOPuo_Click";
RDebugUtils.currentLine=68485121;
 //BA.debugLineNum = 68485121;BA.debugLine="cd.CloseDialog(DialogResponse.POSITIVE)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
RDebugUtils.currentLine=68485123;
 //BA.debugLineNum = 68485123;BA.debugLine="End Sub";
return "";
}
public String  _button1canvel_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "button1canvel_click", false))
	 {return ((String) Debug.delegate(ba, "button1canvel_click", null));}
RDebugUtils.currentLine=68419584;
 //BA.debugLineNum = 68419584;BA.debugLine="Private Sub Button1Canvel_Click";
RDebugUtils.currentLine=68419585;
 //BA.debugLineNum = 68419585;BA.debugLine="cd.CloseDialog(DialogResponse.NEGATIVE)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.NEGATIVE);
RDebugUtils.currentLine=68419586;
 //BA.debugLineNum = 68419586;BA.debugLine="End Sub";
return "";
}
public void  _button1check_click(b4a.example.ef.listdados __ref) throws Exception{
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "button1check_click", false))
	 {Debug.delegate(ba, "button1check_click", null); return;}
ResumableSub_Button1Check_Click rsub = new ResumableSub_Button1Check_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1Check_Click extends BA.ResumableSub {
public ResumableSub_Button1Check_Click(b4a.example.ef.listdados parent,b4a.example.ef.listdados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.listdados __ref;
b4a.example.ef.listdados parent;
int _id = 0;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="listdados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67960833;
 //BA.debugLineNum = 67960833;BA.debugLine="Button1Check=	Sender";
__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=67960834;
 //BA.debugLineNum = 67960834;BA.debugLine="Log(Button1Check.Tag)";
parent.__c.LogImpl("567960834",BA.ObjectToString(__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=67960835;
 //BA.debugLineNum = 67960835;BA.debugLine="Dim	id As Int=Button1Check.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=67960837;
 //BA.debugLineNum = 67960837;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=67960838;
 //BA.debugLineNum = 67960838;BA.debugLine="cd.SetSize(100%x,30%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (30),ba));
RDebugUtils.currentLine=67960839;
 //BA.debugLineNum = 67960839;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1check_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=67960840;
 //BA.debugLineNum = 67960840;BA.debugLine="DialogPanel.LoadLayout(\"DialogDone\")";
_dialogpanel.LoadLayout("DialogDone",ba);
RDebugUtils.currentLine=67960841;
 //BA.debugLineNum = 67960841;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=67960843;
 //BA.debugLineNum = 67960843;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=67960844;
 //BA.debugLineNum = 67960844;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1check_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=67960845;
 //BA.debugLineNum = 67960845;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=67960846;
 //BA.debugLineNum = 67960846;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("567960846","DADOS:",0);
RDebugUtils.currentLine=67960848;
 //BA.debugLineNum = 67960848;BA.debugLine="Log(Label3Inicial.Text)";
parent.__c.LogImpl("567960848",__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=67960849;
 //BA.debugLineNum = 67960849;BA.debugLine="Log(Label4Final.Text)";
parent.__c.LogImpl("567960849",__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=67960851;
 //BA.debugLineNum = 67960851;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("567960851","=======================",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=67960854;
 //BA.debugLineNum = 67960854;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _button2del_click(b4a.example.ef.listdados __ref) throws Exception{
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "button2del_click", false))
	 {Debug.delegate(ba, "button2del_click", null); return;}
ResumableSub_Button2Del_Click rsub = new ResumableSub_Button2Del_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button2Del_Click extends BA.ResumableSub {
public ResumableSub_Button2Del_Click(b4a.example.ef.listdados parent,b4a.example.ef.listdados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.listdados __ref;
b4a.example.ef.listdados parent;
int _id = 0;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="listdados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67895297;
 //BA.debugLineNum = 67895297;BA.debugLine="Button2Del=	Sender";
__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=67895298;
 //BA.debugLineNum = 67895298;BA.debugLine="Log(Button2Del.Tag)";
parent.__c.LogImpl("567895298",BA.ObjectToString(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=67895299;
 //BA.debugLineNum = 67895299;BA.debugLine="Dim id As Int=Button2Del.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=67895300;
 //BA.debugLineNum = 67895300;BA.debugLine="Button1agendar=	Sender";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=67895301;
 //BA.debugLineNum = 67895301;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.True);
RDebugUtils.currentLine=67895302;
 //BA.debugLineNum = 67895302;BA.debugLine="cd.SetSize(100%x,35%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (35),ba));
RDebugUtils.currentLine=67895303;
 //BA.debugLineNum = 67895303;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=67895304;
 //BA.debugLineNum = 67895304;BA.debugLine="DialogPanel.LoadLayout(\"DialogDelete\")";
_dialogpanel.LoadLayout("DialogDelete",ba);
RDebugUtils.currentLine=67895306;
 //BA.debugLineNum = 67895306;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=67895307;
 //BA.debugLineNum = 67895307;BA.debugLine="EditText1TextArea.Color=Colors.Transparent";
__ref._edittext1textarea /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=67895308;
 //BA.debugLineNum = 67895308;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=67895309;
 //BA.debugLineNum = 67895309;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=67895310;
 //BA.debugLineNum = 67895310;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=67895311;
 //BA.debugLineNum = 67895311;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("567895311","DADOS:",0);
RDebugUtils.currentLine=67895312;
 //BA.debugLineNum = 67895312;BA.debugLine="Log(EditText1TextArea.Text)";
parent.__c.LogImpl("567895312",__ref._edittext1textarea /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),0);
RDebugUtils.currentLine=67895313;
 //BA.debugLineNum = 67895313;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("567895313","=======================",0);
RDebugUtils.currentLine=67895314;
 //BA.debugLineNum = 67895314;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from dados wh";
parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE from dados where Consecutivo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=67895315;
 //BA.debugLineNum = 67895315;BA.debugLine="Sleep(300)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"),(int) (300));
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=67895316;
 //BA.debugLineNum = 67895316;BA.debugLine="listDadso";
__ref._listdadso /*String*/ (null);
RDebugUtils.currentLine=67895317;
 //BA.debugLineNum = 67895317;BA.debugLine="ToastMessageShow(Button2Del.Tag&\" DELETED\",False";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(BA.ObjectToString(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag())+" DELETED"),parent.__c.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=67895333;
 //BA.debugLineNum = 67895333;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _listdadso(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "listdadso", false))
	 {return ((String) Debug.delegate(ba, "listdadso", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=67567616;
 //BA.debugLineNum = 67567616;BA.debugLine="Sub listDadso";
RDebugUtils.currentLine=67567617;
 //BA.debugLineNum = 67567617;BA.debugLine="CLV_Persons.Clear";
__ref._clv_persons /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=67567618;
 //BA.debugLineNum = 67567618;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=67567619;
 //BA.debugLineNum = 67567619;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM da";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM dados")));
RDebugUtils.currentLine=67567620;
 //BA.debugLineNum = 67567620;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=67567621;
 //BA.debugLineNum = 67567621;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=67567622;
 //BA.debugLineNum = 67567622;BA.debugLine="Log(Cursor.GetString(\"Consecutivo\"))";
__c.LogImpl("567567622",_cursor.GetString("Consecutivo"),0);
RDebugUtils.currentLine=67567624;
 //BA.debugLineNum = 67567624;BA.debugLine="CLV_Persons.Add(CreateItem(Cursor.GetString(\"Con";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_cursor.GetString("Consecutivo"),_cursor.GetString("Fecha_programa"),_cursor.GetString("NIT"),_cursor.GetString("Hacienda"),_cursor.GetString("Lote"),_cursor.GetString("labor")).getObject())),(Object)(_i));
 }
};
RDebugUtils.currentLine=67567626;
 //BA.debugLineNum = 67567626;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=67567627;
 //BA.debugLineNum = 67567627;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=67567628;
 //BA.debugLineNum = 67567628;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=67567629;
 //BA.debugLineNum = 67567629;BA.debugLine="p.LoadLayout(\"errorLayout\")";
_p.LoadLayout("errorLayout",ba);
RDebugUtils.currentLine=67567630;
 //BA.debugLineNum = 67567630;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
_p.SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=67567631;
 //BA.debugLineNum = 67567631;BA.debugLine="CLV_Persons.AsView.AddView(p,0,0,100%x,100%y)";
__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
RDebugUtils.currentLine=67567633;
 //BA.debugLineNum = 67567633;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
RDebugUtils.currentLine=67305472;
 //BA.debugLineNum = 67305472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=67305473;
 //BA.debugLineNum = 67305473;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=67305474;
 //BA.debugLineNum = 67305474;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=67305475;
 //BA.debugLineNum = 67305475;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=67305476;
 //BA.debugLineNum = 67305476;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=67305477;
 //BA.debugLineNum = 67305477;BA.debugLine="Private CLV_Persons As CustomListView";
_clv_persons = new b4a.example3.customlistview();
RDebugUtils.currentLine=67305481;
 //BA.debugLineNum = 67305481;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=67305482;
 //BA.debugLineNum = 67305482;BA.debugLine="Private Label1Details As Label";
_label1details = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=67305484;
 //BA.debugLineNum = 67305484;BA.debugLine="Private Label1Details2 As Label";
_label1details2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=67305485;
 //BA.debugLineNum = 67305485;BA.debugLine="Private Button1agendar As Button";
_button1agendar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=67305486;
 //BA.debugLineNum = 67305486;BA.debugLine="Private Button1Check As Button";
_button1check = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=67305487;
 //BA.debugLineNum = 67305487;BA.debugLine="Private Button2Del As Button";
_button2del = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=67305488;
 //BA.debugLineNum = 67305488;BA.debugLine="Private Label4Final As Label";
_label4final = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=67305489;
 //BA.debugLineNum = 67305489;BA.debugLine="Private Label3Inicial As Label";
_label3inicial = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=67305490;
 //BA.debugLineNum = 67305490;BA.debugLine="Dim cd As CustomLayoutDialog";
_cd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=67305491;
 //BA.debugLineNum = 67305491;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=67305492;
 //BA.debugLineNum = 67305492;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=67305493;
 //BA.debugLineNum = 67305493;BA.debugLine="Private EditText1Area As EditText";
_edittext1area = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=67305494;
 //BA.debugLineNum = 67305494;BA.debugLine="Private EditText1TextArea As EditText";
_edittext1textarea = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=67305495;
 //BA.debugLineNum = 67305495;BA.debugLine="Private Label20Desc As Label";
_label20desc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=67305496;
 //BA.debugLineNum = 67305496;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=67305497;
 //BA.debugLineNum = 67305497;BA.debugLine="Private Label1IdMaquina As Label";
_label1idmaquina = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=67305498;
 //BA.debugLineNum = 67305498;BA.debugLine="End Sub";
return "";
}
public void  _clv_persons_itemclick(b4a.example.ef.listdados __ref,int _index,Object _value) throws Exception{
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "clv_persons_itemclick", false))
	 {Debug.delegate(ba, "clv_persons_itemclick", new Object[] {_index,_value}); return;}
ResumableSub_CLV_Persons_ItemClick rsub = new ResumableSub_CLV_Persons_ItemClick(this,__ref,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_CLV_Persons_ItemClick extends BA.ResumableSub {
public ResumableSub_CLV_Persons_ItemClick(b4a.example.ef.listdados parent,b4a.example.ef.listdados __ref,int _index,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.listdados __ref;
b4a.example.ef.listdados parent;
int _index;
Object _value;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="listdados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=68550657;
 //BA.debugLineNum = 68550657;BA.debugLine="Log(Value)";
parent.__c.LogImpl("568550657",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=68550658;
 //BA.debugLineNum = 68550658;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"form"));
RDebugUtils.currentLine=68550659;
 //BA.debugLineNum = 68550659;BA.debugLine="Sleep(90)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "clv_persons_itemclick"),(int) (90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=68550660;
 //BA.debugLineNum = 68550660;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"update\"";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._tipo /*String*/  = "update";
RDebugUtils.currentLine=68550661;
 //BA.debugLineNum = 68550661;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Value";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._idmaquina /*int*/  = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=68550662;
 //BA.debugLineNum = 68550662;BA.debugLine="B4XPages.ShowPage(\"Form\")";
parent._b4xpages._showpage /*String*/ (ba,"Form");
RDebugUtils.currentLine=68550663;
 //BA.debugLineNum = 68550663;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _configtime(b4a.example.ef.listdados __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "configtime", false))
	 {return ((String) Debug.delegate(ba, "configtime", new Object[] {_tag}));}
RDebugUtils.currentLine=68222976;
 //BA.debugLineNum = 68222976;BA.debugLine="Sub configTime(tag As String)";
RDebugUtils.currentLine=68222978;
 //BA.debugLineNum = 68222978;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,_tag,(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=68222979;
 //BA.debugLineNum = 68222979;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=68222980;
 //BA.debugLineNum = 68222980;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=68222981;
 //BA.debugLineNum = 68222981;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=68222982;
 //BA.debugLineNum = 68222982;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=68222983;
 //BA.debugLineNum = 68222983;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=68222984;
 //BA.debugLineNum = 68222984;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=68222985;
 //BA.debugLineNum = 68222985;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=68222986;
 //BA.debugLineNum = 68222986;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=68222987;
 //BA.debugLineNum = 68222987;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=68222988;
 //BA.debugLineNum = 68222988;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=68222989;
 //BA.debugLineNum = 68222989;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=68222990;
 //BA.debugLineNum = 68222990;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=68222991;
 //BA.debugLineNum = 68222991;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.listdados __ref,String _consecutivo,String _fecha_programa,String _nit,String _hacienda,String _lote,String _labor) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", new Object[] {_consecutivo,_fecha_programa,_nit,_hacienda,_lote,_labor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=67764224;
 //BA.debugLineNum = 67764224;BA.debugLine="Private Sub CreateItem(Consecutivo,Fecha_programa,";
RDebugUtils.currentLine=67764226;
 //BA.debugLineNum = 67764226;BA.debugLine="Dim Panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=67764228;
 //BA.debugLineNum = 67764228;BA.debugLine="Panel.SetLayoutAnimated(1, 0, 0, 100%x, 140dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (140)));
RDebugUtils.currentLine=67764230;
 //BA.debugLineNum = 67764230;BA.debugLine="Panel.LoadLayout(\"cardDados\")";
_panel.LoadLayout("cardDados",ba);
RDebugUtils.currentLine=67764237;
 //BA.debugLineNum = 67764237;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=67764238;
 //BA.debugLineNum = 67764238;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=67764241;
 //BA.debugLineNum = 67764241;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Consecutivo: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_consecutivo+__c.CRLF)).Pop();
RDebugUtils.currentLine=67764244;
 //BA.debugLineNum = 67764244;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha programa: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_fecha_programa+__c.CRLF)).Pop();
RDebugUtils.currentLine=67764247;
 //BA.debugLineNum = 67764247;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"NIT: \").Pop.C";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("NIT: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).PopAll();
RDebugUtils.currentLine=67764251;
 //BA.debugLineNum = 67764251;BA.debugLine="Label1Details.Text = cs";
__ref._label1details /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=67764253;
 //BA.debugLineNum = 67764253;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=67764254;
 //BA.debugLineNum = 67764254;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=67764257;
 //BA.debugLineNum = 67764257;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).Pop();
RDebugUtils.currentLine=67764260;
 //BA.debugLineNum = 67764260;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Lote: \").Pop.";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Lote: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_lote+__c.CRLF)).Pop();
RDebugUtils.currentLine=67764262;
 //BA.debugLineNum = 67764262;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Labor: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_labor+__c.CRLF)).PopAll();
RDebugUtils.currentLine=67764265;
 //BA.debugLineNum = 67764265;BA.debugLine="Label1Details2.Text = cs";
__ref._label1details2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=67764267;
 //BA.debugLineNum = 67764267;BA.debugLine="Button1agendar.Tag=Consecutivo";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=67764268;
 //BA.debugLineNum = 67764268;BA.debugLine="Button1Check.Tag=Consecutivo";
__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=67764269;
 //BA.debugLineNum = 67764269;BA.debugLine="Button2Del.Tag=Consecutivo";
__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=67764270;
 //BA.debugLineNum = 67764270;BA.debugLine="Return Panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=67764271;
 //BA.debugLineNum = 67764271;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemmaquinas(b4a.example.ef.listdados __ref,String _hacienda,String _lote,String _labor) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "createitemmaquinas", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemmaquinas", new Object[] {_hacienda,_lote,_labor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
String _legend = "";
RDebugUtils.currentLine=67698688;
 //BA.debugLineNum = 67698688;BA.debugLine="Private Sub CreateItemMaquinas (Hacienda As String";
RDebugUtils.currentLine=67698690;
 //BA.debugLineNum = 67698690;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=67698691;
 //BA.debugLineNum = 67698691;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 70dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (70)));
RDebugUtils.currentLine=67698692;
 //BA.debugLineNum = 67698692;BA.debugLine="panel.LoadLayout(\"cardMaquina\")";
_panel.LoadLayout("cardMaquina",ba);
RDebugUtils.currentLine=67698693;
 //BA.debugLineNum = 67698693;BA.debugLine="Dim legend As String=Label1IdMaquina.Text";
_legend = __ref._label1idmaquina /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
RDebugUtils.currentLine=67698694;
 //BA.debugLineNum = 67698694;BA.debugLine="legend=	legend.Replace(\"{Hacienda}\",Hacienda)";
_legend = _legend.replace("{Hacienda}",_hacienda);
RDebugUtils.currentLine=67698695;
 //BA.debugLineNum = 67698695;BA.debugLine="legend=	legend.Replace(\"{Lote}\",Lote)";
_legend = _legend.replace("{Lote}",_lote);
RDebugUtils.currentLine=67698696;
 //BA.debugLineNum = 67698696;BA.debugLine="legend=	legend.Replace(\"{labor}\",labor)";
_legend = _legend.replace("{labor}",_labor);
RDebugUtils.currentLine=67698697;
 //BA.debugLineNum = 67698697;BA.debugLine="Label1IdMaquina.Text=legend";
__ref._label1idmaquina /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_legend));
RDebugUtils.currentLine=67698698;
 //BA.debugLineNum = 67698698;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=67698699;
 //BA.debugLineNum = 67698699;BA.debugLine="End Sub";
return null;
}
public String  _label1_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=67829760;
 //BA.debugLineNum = 67829760;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=67829761;
 //BA.debugLineNum = 67829761;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=67829762;
 //BA.debugLineNum = 67829762;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=68747264;
 //BA.debugLineNum = 68747264;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=68747265;
 //BA.debugLineNum = 68747265;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=68747266;
 //BA.debugLineNum = 68747266;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=68616192;
 //BA.debugLineNum = 68616192;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=68616193;
 //BA.debugLineNum = 68616193;BA.debugLine="Button1AddIsumo_Click";
__ref._button1addisumo_click /*void*/ (null);
RDebugUtils.currentLine=68616194;
 //BA.debugLineNum = 68616194;BA.debugLine="End Sub";
return "";
}
public String  _label3inicial_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label3inicial_click", false))
	 {return ((String) Debug.delegate(ba, "label3inicial_click", null));}
RDebugUtils.currentLine=68091904;
 //BA.debugLineNum = 68091904;BA.debugLine="Private Sub Label3Inicial_Click";
RDebugUtils.currentLine=68091905;
 //BA.debugLineNum = 68091905;BA.debugLine="configTime(\"TimeInicio\")";
__ref._configtime /*String*/ (null,"TimeInicio");
RDebugUtils.currentLine=68091907;
 //BA.debugLineNum = 68091907;BA.debugLine="End Sub";
return "";
}
public String  _label4final_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label4final_click", false))
	 {return ((String) Debug.delegate(ba, "label4final_click", null));}
RDebugUtils.currentLine=68157440;
 //BA.debugLineNum = 68157440;BA.debugLine="Private Sub Label4Final_Click";
RDebugUtils.currentLine=68157441;
 //BA.debugLineNum = 68157441;BA.debugLine="configTime(\"TimeFim\")";
__ref._configtime /*String*/ (null,"TimeFim");
RDebugUtils.currentLine=68157443;
 //BA.debugLineNum = 68157443;BA.debugLine="End Sub";
return "";
}
public String  _timefim_ondateset(b4a.example.ef.listdados __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "timefim_ondateset", false))
	 {return ((String) Debug.delegate(ba, "timefim_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=68354048;
 //BA.debugLineNum = 68354048;BA.debugLine="Sub TimeFim_OnDateSet(year As Int ,monthOfYear As";
RDebugUtils.currentLine=68354049;
 //BA.debugLineNum = 68354049;BA.debugLine="Label4Final.Text=year&\"/\"&(NumberFormat(monthOfYe";
__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=68354050;
 //BA.debugLineNum = 68354050;BA.debugLine="Label4Final.TextColor=Colors.Black";
__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=68354051;
 //BA.debugLineNum = 68354051;BA.debugLine="End Sub";
return "";
}
public String  _timeinicio_ondateset(b4a.example.ef.listdados __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "timeinicio_ondateset", false))
	 {return ((String) Debug.delegate(ba, "timeinicio_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=68288512;
 //BA.debugLineNum = 68288512;BA.debugLine="Sub TimeInicio_OnDateSet(year As Int ,monthOfYear";
RDebugUtils.currentLine=68288513;
 //BA.debugLineNum = 68288513;BA.debugLine="Label3Inicial.Text=year&\"/\"&(NumberFormat(monthOf";
__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=68288514;
 //BA.debugLineNum = 68288514;BA.debugLine="Label3Inicial.TextColor=Colors.Black";
__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=68288516;
 //BA.debugLineNum = 68288516;BA.debugLine="End Sub";
return "";
}
}