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
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_appear(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Sub B4XPage_Appear";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="listDadosMaquina";
__ref._listdadosmaquina /*String*/ (null);
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Sub listDadosMaquina";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="CLV_Persons.Clear";
__ref._clv_persons /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Label2.Text=Chr(0xE145)";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe145))));
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="Label3.Text=\"Labores de Campo\"";
__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Labores de Campo"));
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=17301509;
 //BA.debugLineNum = 17301509;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM ma";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina")));
RDebugUtils.currentLine=17301510;
 //BA.debugLineNum = 17301510;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=17301511;
 //BA.debugLineNum = 17301511;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=17301512;
 //BA.debugLineNum = 17301512;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
__c.LogImpl("017301512","=====Maquinas #"+BA.NumberToString(_i)+"=====",0);
RDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="Log(Cursor.GetString(\"id\"))";
__c.LogImpl("017301513",_cursor.GetString("id"),0);
RDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="Dim Hacienda As String=Cursor.GetString(\"haciend";
_hacienda = _cursor.GetString("hacienda");
RDebugUtils.currentLine=17301516;
 //BA.debugLineNum = 17301516;BA.debugLine="Dim Lote As String=Cursor.GetString(\"Lote\")";
_lote = _cursor.GetString("Lote");
RDebugUtils.currentLine=17301517;
 //BA.debugLineNum = 17301517;BA.debugLine="Dim labor As String=Cursor.GetString(\"labor\")";
_labor = _cursor.GetString("labor");
RDebugUtils.currentLine=17301518;
 //BA.debugLineNum = 17301518;BA.debugLine="CLV_Persons.Add(CreateItemMaquinas(Hacienda,Lote";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemmaquinas /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_hacienda,_lote,_labor).getObject())),(Object)(_cursor.GetString("id")));
 }
};
RDebugUtils.currentLine=17301520;
 //BA.debugLineNum = 17301520;BA.debugLine="Log(i)";
__c.LogImpl("017301520",BA.NumberToString(_i),0);
RDebugUtils.currentLine=17301521;
 //BA.debugLineNum = 17301521;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=17301522;
 //BA.debugLineNum = 17301522;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=17301523;
 //BA.debugLineNum = 17301523;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=17301524;
 //BA.debugLineNum = 17301524;BA.debugLine="p.SetLayout(0,0,CLV_Persons.AsView.Width,CLV_Per";
_p.SetLayout((int) (0),(int) (0),__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=17301525;
 //BA.debugLineNum = 17301525;BA.debugLine="p.LoadLayout(\"errorLayout\")";
_p.LoadLayout("errorLayout",ba);
RDebugUtils.currentLine=17301526;
 //BA.debugLineNum = 17301526;BA.debugLine="CLV_Persons.Add(p,0)";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(0));
 };
RDebugUtils.currentLine=17301528;
 //BA.debugLineNum = 17301528;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.listdados __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="Root.LoadLayout(\"ListPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListPerson",ba);
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="Label3.Text=\"List dados\"";
__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("List dados"));
RDebugUtils.currentLine=17104903;
 //BA.debugLineNum = 17104903;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"form"));
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="Sleep(90)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1addisumo_click"),(int) (90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"new\"";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._tipo /*String*/  = "new";
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Rnd(0";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._idmaquina /*int*/  = parent.__c.Rnd((int) (0001),(int) (9999));
RDebugUtils.currentLine=18350085;
 //BA.debugLineNum = 18350085;BA.debugLine="B4XPages.ShowPage(\"Form\")";
parent._b4xpages._showpage /*String*/ (ba,"Form");
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Button1agendar=	Sender";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="Log(Button1agendar.Tag)";
parent.__c.LogImpl("017694722",BA.ObjectToString(__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="Dim	id As Int=Button1agendar.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="cd.SetSize(100%x,40%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1agendar_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=17694729;
 //BA.debugLineNum = 17694729;BA.debugLine="DialogPanel.LoadLayout(\"dialogAgenda\")";
_dialogpanel.LoadLayout("dialogAgenda",ba);
RDebugUtils.currentLine=17694730;
 //BA.debugLineNum = 17694730;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=17694731;
 //BA.debugLineNum = 17694731;BA.debugLine="EditText1Area.Color=Colors.Transparent";
__ref._edittext1area /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=17694732;
 //BA.debugLineNum = 17694732;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=17694733;
 //BA.debugLineNum = 17694733;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1agendar_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17694734;
 //BA.debugLineNum = 17694734;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=17694735;
 //BA.debugLineNum = 17694735;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("017694735","DADOS:",0);
RDebugUtils.currentLine=17694737;
 //BA.debugLineNum = 17694737;BA.debugLine="Log(Label3Inicial.Text)";
parent.__c.LogImpl("017694737",__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=17694738;
 //BA.debugLineNum = 17694738;BA.debugLine="Log(Label4Final.Text)";
parent.__c.LogImpl("017694738",__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=17694739;
 //BA.debugLineNum = 17694739;BA.debugLine="Log(EditText1Area.Text)";
parent.__c.LogImpl("017694739",__ref._edittext1area /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),0);
RDebugUtils.currentLine=17694740;
 //BA.debugLineNum = 17694740;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("017694740","=======================",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17694743;
 //BA.debugLineNum = 17694743;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Private Sub Button1agendarPOPuo_Click";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="cd.CloseDialog(DialogResponse.POSITIVE)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="End Sub";
return "";
}
public String  _button1canvel_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "button1canvel_click", false))
	 {return ((String) Debug.delegate(ba, "button1canvel_click", null));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub Button1Canvel_Click";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="cd.CloseDialog(DialogResponse.NEGATIVE)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.NEGATIVE);
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Button1Check=	Sender";
__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="Log(Button1Check.Tag)";
parent.__c.LogImpl("017629186",BA.ObjectToString(__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="Dim	id As Int=Button1Check.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=17629189;
 //BA.debugLineNum = 17629189;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=17629190;
 //BA.debugLineNum = 17629190;BA.debugLine="cd.SetSize(100%x,30%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (30),ba));
RDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1check_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=17629192;
 //BA.debugLineNum = 17629192;BA.debugLine="DialogPanel.LoadLayout(\"DialogDone\")";
_dialogpanel.LoadLayout("DialogDone",ba);
RDebugUtils.currentLine=17629193;
 //BA.debugLineNum = 17629193;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=17629195;
 //BA.debugLineNum = 17629195;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=17629196;
 //BA.debugLineNum = 17629196;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1check_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17629197;
 //BA.debugLineNum = 17629197;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=17629198;
 //BA.debugLineNum = 17629198;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("017629198","DADOS:",0);
RDebugUtils.currentLine=17629200;
 //BA.debugLineNum = 17629200;BA.debugLine="Log(Label3Inicial.Text)";
parent.__c.LogImpl("017629200",__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=17629201;
 //BA.debugLineNum = 17629201;BA.debugLine="Log(Label4Final.Text)";
parent.__c.LogImpl("017629201",__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=17629203;
 //BA.debugLineNum = 17629203;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("017629203","=======================",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17629206;
 //BA.debugLineNum = 17629206;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Button2Del=	Sender";
__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="Log(Button2Del.Tag)";
parent.__c.LogImpl("017563650",BA.ObjectToString(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="Dim id As Int=Button2Del.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="Button1agendar=	Sender";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.True);
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="cd.SetSize(100%x,35%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (35),ba));
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="DialogPanel.LoadLayout(\"DialogDelete\")";
_dialogpanel.LoadLayout("DialogDelete",ba);
RDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=17563659;
 //BA.debugLineNum = 17563659;BA.debugLine="EditText1TextArea.Color=Colors.Transparent";
__ref._edittext1textarea /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=17563660;
 //BA.debugLineNum = 17563660;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=17563661;
 //BA.debugLineNum = 17563661;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=17563663;
 //BA.debugLineNum = 17563663;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("017563663","DADOS:",0);
RDebugUtils.currentLine=17563664;
 //BA.debugLineNum = 17563664;BA.debugLine="Log(EditText1TextArea.Text)";
parent.__c.LogImpl("017563664",__ref._edittext1textarea /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),0);
RDebugUtils.currentLine=17563665;
 //BA.debugLineNum = 17563665;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("017563665","=======================",0);
RDebugUtils.currentLine=17563666;
 //BA.debugLineNum = 17563666;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from dados wh";
parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE from dados where Consecutivo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=17563667;
 //BA.debugLineNum = 17563667;BA.debugLine="Sleep(300)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"),(int) (300));
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=17563668;
 //BA.debugLineNum = 17563668;BA.debugLine="listDadso";
__ref._listdadso /*String*/ (null);
RDebugUtils.currentLine=17563669;
 //BA.debugLineNum = 17563669;BA.debugLine="ToastMessageShow(Button2Del.Tag&\" DELETED\",False";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(BA.ObjectToString(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag())+" DELETED"),parent.__c.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17563685;
 //BA.debugLineNum = 17563685;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Sub listDadso";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="CLV_Persons.Clear";
__ref._clv_persons /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM da";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM dados")));
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=17235973;
 //BA.debugLineNum = 17235973;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=17235974;
 //BA.debugLineNum = 17235974;BA.debugLine="Log(Cursor.GetString(\"Consecutivo\"))";
__c.LogImpl("017235974",_cursor.GetString("Consecutivo"),0);
RDebugUtils.currentLine=17235976;
 //BA.debugLineNum = 17235976;BA.debugLine="CLV_Persons.Add(CreateItem(Cursor.GetString(\"Con";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_cursor.GetString("Consecutivo"),_cursor.GetString("Fecha_programa"),_cursor.GetString("NIT"),_cursor.GetString("Hacienda"),_cursor.GetString("Lote"),_cursor.GetString("labor")).getObject())),(Object)(_i));
 }
};
RDebugUtils.currentLine=17235978;
 //BA.debugLineNum = 17235978;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=17235979;
 //BA.debugLineNum = 17235979;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=17235980;
 //BA.debugLineNum = 17235980;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=17235981;
 //BA.debugLineNum = 17235981;BA.debugLine="p.LoadLayout(\"errorLayout\")";
_p.LoadLayout("errorLayout",ba);
RDebugUtils.currentLine=17235982;
 //BA.debugLineNum = 17235982;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
_p.SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=17235983;
 //BA.debugLineNum = 17235983;BA.debugLine="CLV_Persons.AsView.AddView(p,0,0,100%x,100%y)";
__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
RDebugUtils.currentLine=17235985;
 //BA.debugLineNum = 17235985;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=16973829;
 //BA.debugLineNum = 16973829;BA.debugLine="Private CLV_Persons As CustomListView";
_clv_persons = new b4a.example3.customlistview();
RDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16973834;
 //BA.debugLineNum = 16973834;BA.debugLine="Private Label1Details As Label";
_label1details = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16973836;
 //BA.debugLineNum = 16973836;BA.debugLine="Private Label1Details2 As Label";
_label1details2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16973837;
 //BA.debugLineNum = 16973837;BA.debugLine="Private Button1agendar As Button";
_button1agendar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=16973838;
 //BA.debugLineNum = 16973838;BA.debugLine="Private Button1Check As Button";
_button1check = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=16973839;
 //BA.debugLineNum = 16973839;BA.debugLine="Private Button2Del As Button";
_button2del = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=16973840;
 //BA.debugLineNum = 16973840;BA.debugLine="Private Label4Final As Label";
_label4final = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16973841;
 //BA.debugLineNum = 16973841;BA.debugLine="Private Label3Inicial As Label";
_label3inicial = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16973842;
 //BA.debugLineNum = 16973842;BA.debugLine="Dim cd As CustomLayoutDialog";
_cd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=16973843;
 //BA.debugLineNum = 16973843;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=16973844;
 //BA.debugLineNum = 16973844;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=16973845;
 //BA.debugLineNum = 16973845;BA.debugLine="Private EditText1Area As EditText";
_edittext1area = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=16973846;
 //BA.debugLineNum = 16973846;BA.debugLine="Private EditText1TextArea As EditText";
_edittext1textarea = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=16973847;
 //BA.debugLineNum = 16973847;BA.debugLine="Private Label20Desc As Label";
_label20desc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16973848;
 //BA.debugLineNum = 16973848;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16973849;
 //BA.debugLineNum = 16973849;BA.debugLine="Private Label1IdMaquina As Label";
_label1idmaquina = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16973850;
 //BA.debugLineNum = 16973850;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Log(Value)";
parent.__c.LogImpl("018219009",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"form"));
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="Sleep(90)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "clv_persons_itemclick"),(int) (90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"update\"";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._tipo /*String*/  = "update";
RDebugUtils.currentLine=18219013;
 //BA.debugLineNum = 18219013;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Value";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._idmaquina /*int*/  = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=18219014;
 //BA.debugLineNum = 18219014;BA.debugLine="B4XPages.ShowPage(\"Form\")";
parent._b4xpages._showpage /*String*/ (ba,"Form");
RDebugUtils.currentLine=18219015;
 //BA.debugLineNum = 18219015;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Sub configTime(tag As String)";
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,_tag,(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=17891336;
 //BA.debugLineNum = 17891336;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=17891337;
 //BA.debugLineNum = 17891337;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=17891339;
 //BA.debugLineNum = 17891339;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=17891340;
 //BA.debugLineNum = 17891340;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=17891341;
 //BA.debugLineNum = 17891341;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=17891342;
 //BA.debugLineNum = 17891342;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=17891343;
 //BA.debugLineNum = 17891343;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.listdados __ref,String _consecutivo,String _fecha_programa,String _nit,String _hacienda,String _lote,String _labor) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", new Object[] {_consecutivo,_fecha_programa,_nit,_hacienda,_lote,_labor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Private Sub CreateItem(Consecutivo,Fecha_programa,";
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="Dim Panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="Panel.SetLayoutAnimated(1, 0, 0, 100%x, 140dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (140)));
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="Panel.LoadLayout(\"cardDados\")";
_panel.LoadLayout("cardDados",ba);
RDebugUtils.currentLine=17432589;
 //BA.debugLineNum = 17432589;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=17432590;
 //BA.debugLineNum = 17432590;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=17432593;
 //BA.debugLineNum = 17432593;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Consecutivo: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_consecutivo+__c.CRLF)).Pop();
RDebugUtils.currentLine=17432596;
 //BA.debugLineNum = 17432596;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha programa: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_fecha_programa+__c.CRLF)).Pop();
RDebugUtils.currentLine=17432599;
 //BA.debugLineNum = 17432599;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"NIT: \").Pop.C";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("NIT: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).PopAll();
RDebugUtils.currentLine=17432603;
 //BA.debugLineNum = 17432603;BA.debugLine="Label1Details.Text = cs";
__ref._label1details /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=17432605;
 //BA.debugLineNum = 17432605;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=17432606;
 //BA.debugLineNum = 17432606;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=17432609;
 //BA.debugLineNum = 17432609;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).Pop();
RDebugUtils.currentLine=17432612;
 //BA.debugLineNum = 17432612;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Lote: \").Pop.";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Lote: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_lote+__c.CRLF)).Pop();
RDebugUtils.currentLine=17432614;
 //BA.debugLineNum = 17432614;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Labor: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_labor+__c.CRLF)).PopAll();
RDebugUtils.currentLine=17432617;
 //BA.debugLineNum = 17432617;BA.debugLine="Label1Details2.Text = cs";
__ref._label1details2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=17432619;
 //BA.debugLineNum = 17432619;BA.debugLine="Button1agendar.Tag=Consecutivo";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=17432620;
 //BA.debugLineNum = 17432620;BA.debugLine="Button1Check.Tag=Consecutivo";
__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=17432621;
 //BA.debugLineNum = 17432621;BA.debugLine="Button2Del.Tag=Consecutivo";
__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=17432622;
 //BA.debugLineNum = 17432622;BA.debugLine="Return Panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=17432623;
 //BA.debugLineNum = 17432623;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemmaquinas(b4a.example.ef.listdados __ref,String _hacienda,String _lote,String _labor) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "createitemmaquinas", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemmaquinas", new Object[] {_hacienda,_lote,_labor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
String _legend = "";
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Private Sub CreateItemMaquinas (Hacienda As String";
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 70dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (70)));
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="panel.LoadLayout(\"cardMaquina\")";
_panel.LoadLayout("cardMaquina",ba);
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="Dim legend As String=Label1IdMaquina.Text";
_legend = __ref._label1idmaquina /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="legend=	legend.Replace(\"{Hacienda}\",Hacienda)";
_legend = _legend.replace("{Hacienda}",_hacienda);
RDebugUtils.currentLine=17367047;
 //BA.debugLineNum = 17367047;BA.debugLine="legend=	legend.Replace(\"{Lote}\",Lote)";
_legend = _legend.replace("{Lote}",_lote);
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="legend=	legend.Replace(\"{labor}\",labor)";
_legend = _legend.replace("{labor}",_labor);
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="Label1IdMaquina.Text=legend";
__ref._label1idmaquina /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_legend));
RDebugUtils.currentLine=17367050;
 //BA.debugLineNum = 17367050;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=17367051;
 //BA.debugLineNum = 17367051;BA.debugLine="End Sub";
return null;
}
public String  _label1_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Button1AddIsumo_Click";
__ref._button1addisumo_click /*void*/ (null);
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return "";
}
public String  _label3inicial_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label3inicial_click", false))
	 {return ((String) Debug.delegate(ba, "label3inicial_click", null));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub Label3Inicial_Click";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="configTime(\"TimeInicio\")";
__ref._configtime /*String*/ (null,"TimeInicio");
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="End Sub";
return "";
}
public String  _label4final_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label4final_click", false))
	 {return ((String) Debug.delegate(ba, "label4final_click", null));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Private Sub Label4Final_Click";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="configTime(\"TimeFim\")";
__ref._configtime /*String*/ (null,"TimeFim");
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="End Sub";
return "";
}
public String  _timefim_ondateset(b4a.example.ef.listdados __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "timefim_ondateset", false))
	 {return ((String) Debug.delegate(ba, "timefim_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Sub TimeFim_OnDateSet(year As Int ,monthOfYear As";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Label4Final.Text=year&\"/\"&(NumberFormat(monthOfYe";
__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="Label4Final.TextColor=Colors.Black";
__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="End Sub";
return "";
}
public String  _timeinicio_ondateset(b4a.example.ef.listdados __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "timeinicio_ondateset", false))
	 {return ((String) Debug.delegate(ba, "timeinicio_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Sub TimeInicio_OnDateSet(year As Int ,monthOfYear";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Label3Inicial.Text=year&\"/\"&(NumberFormat(monthOf";
__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="Label3Inicial.TextColor=Colors.Black";
__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="End Sub";
return "";
}
}