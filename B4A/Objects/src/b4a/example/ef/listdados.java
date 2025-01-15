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
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_appear(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub B4XPage_Appear";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="listDadosMaquina";
__ref._listdadosmaquina /*String*/ (null);
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub listDadosMaquina";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="CLV_Persons.Clear";
__ref._clv_persons /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Label2.Text=Chr(0xE145)";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe145))));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Label3.Text=\"Labores de Campo\"";
__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Labores de Campo"));
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM ma";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina")));
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
__c.LogImpl("22752520","=====Maquinas #"+BA.NumberToString(_i)+"=====",0);
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="Log(Cursor.GetString(\"id\"))";
__c.LogImpl("22752521",_cursor.GetString("id"),0);
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Dim Hacienda As String=Cursor.GetString(\"haciend";
_hacienda = _cursor.GetString("hacienda");
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="Dim Lote As String=Cursor.GetString(\"Lote\")";
_lote = _cursor.GetString("Lote");
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="Dim labor As String=Cursor.GetString(\"labor\")";
_labor = _cursor.GetString("labor");
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="CLV_Persons.Add(CreateItemMaquinas(Hacienda,Lote";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemmaquinas /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_hacienda,_lote,_labor).getObject())),(Object)(_cursor.GetString("id")));
 }
};
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="Log(i)";
__c.LogImpl("22752528",BA.NumberToString(_i),0);
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=2752530;
 //BA.debugLineNum = 2752530;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="p.SetLayout(0,0,CLV_Persons.AsView.Width,CLV_Per";
_p.SetLayout((int) (0),(int) (0),__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="p.LoadLayout(\"errorLayout\")";
_p.LoadLayout("errorLayout",ba);
RDebugUtils.currentLine=2752534;
 //BA.debugLineNum = 2752534;BA.debugLine="CLV_Persons.Add(p,0)";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(0));
 };
RDebugUtils.currentLine=2752536;
 //BA.debugLineNum = 2752536;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.listdados __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
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
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Root.LoadLayout(\"ListPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListPerson",ba);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Label3.Text=\"List dados\"";
__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("List dados"));
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"form"));
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Sleep(90)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1addisumo_click"),(int) (90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"new\"";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._tipo /*String*/  = "new";
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Rnd(0";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._idmaquina /*int*/  = parent.__c.Rnd((int) (0001),(int) (9999));
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="B4XPages.ShowPage(\"Form\")";
parent._b4xpages._showpage /*String*/ (ba,"Form");
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Button1agendar=	Sender";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Log(Button1agendar.Tag)";
parent.__c.LogImpl("23145730",BA.ObjectToString(__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Dim	id As Int=Button1agendar.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="cd.SetSize(100%x,40%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1agendar_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="DialogPanel.LoadLayout(\"dialogAgenda\")";
_dialogpanel.LoadLayout("dialogAgenda",ba);
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="EditText1Area.Color=Colors.Transparent";
__ref._edittext1area /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1agendar_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("23145743","DADOS:",0);
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="Log(Label3Inicial.Text)";
parent.__c.LogImpl("23145745",__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="Log(Label4Final.Text)";
parent.__c.LogImpl("23145746",__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="Log(EditText1Area.Text)";
parent.__c.LogImpl("23145747",__ref._edittext1area /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),0);
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("23145748","=======================",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=3145751;
 //BA.debugLineNum = 3145751;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub Button1agendarPOPuo_Click";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="cd.CloseDialog(DialogResponse.POSITIVE)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="End Sub";
return "";
}
public String  _button1canvel_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "button1canvel_click", false))
	 {return ((String) Debug.delegate(ba, "button1canvel_click", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub Button1Canvel_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="cd.CloseDialog(DialogResponse.NEGATIVE)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.NEGATIVE);
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Button1Check=	Sender";
__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Log(Button1Check.Tag)";
parent.__c.LogImpl("23080194",BA.ObjectToString(__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Dim	id As Int=Button1Check.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="cd.SetSize(100%x,30%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (30),ba));
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1check_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="DialogPanel.LoadLayout(\"DialogDone\")";
_dialogpanel.LoadLayout("DialogDone",ba);
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1check_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("23080206","DADOS:",0);
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="Log(Label3Inicial.Text)";
parent.__c.LogImpl("23080208",__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="Log(Label4Final.Text)";
parent.__c.LogImpl("23080209",__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("23080211","=======================",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Button2Del=	Sender";
__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Log(Button2Del.Tag)";
parent.__c.LogImpl("23014658",BA.ObjectToString(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Dim id As Int=Button2Del.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Button1agendar=	Sender";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.True);
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="cd.SetSize(100%x,35%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (35),ba));
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="DialogPanel.LoadLayout(\"DialogDelete\")";
_dialogpanel.LoadLayout("DialogDelete",ba);
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="EditText1TextArea.Color=Colors.Transparent";
__ref._edittext1textarea /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("23014671","DADOS:",0);
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="Log(EditText1TextArea.Text)";
parent.__c.LogImpl("23014672",__ref._edittext1textarea /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),0);
RDebugUtils.currentLine=3014673;
 //BA.debugLineNum = 3014673;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("23014673","=======================",0);
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from dados wh";
parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE from dados where Consecutivo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="Sleep(300)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"),(int) (300));
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=3014676;
 //BA.debugLineNum = 3014676;BA.debugLine="listDadso";
__ref._listdadso /*String*/ (null);
RDebugUtils.currentLine=3014677;
 //BA.debugLineNum = 3014677;BA.debugLine="ToastMessageShow(Button2Del.Tag&\" DELETED\",False";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(BA.ObjectToString(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag())+" DELETED"),parent.__c.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=3014693;
 //BA.debugLineNum = 3014693;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub listDadso";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="CLV_Persons.Clear";
__ref._clv_persons /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM da";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM dados")));
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Log(Cursor.GetString(\"Consecutivo\"))";
__c.LogImpl("22686982",_cursor.GetString("Consecutivo"),0);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="CLV_Persons.Add(CreateItem(Cursor.GetString(\"Con";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_cursor.GetString("Consecutivo"),_cursor.GetString("Fecha_programa"),_cursor.GetString("NIT"),_cursor.GetString("Hacienda"),_cursor.GetString("Lote"),_cursor.GetString("labor")).getObject())),(Object)(_i));
 }
};
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="p.LoadLayout(\"errorLayout\")";
_p.LoadLayout("errorLayout",ba);
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
_p.SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="CLV_Persons.AsView.AddView(p,0,0,100%x,100%y)";
__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
RDebugUtils.currentLine=2686993;
 //BA.debugLineNum = 2686993;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
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
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Private Label1Details As Label";
_label1details = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="Private Label1Details2 As Label";
_label1details2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="Private Button1agendar As Button";
_button1agendar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="Private Button1Check As Button";
_button1check = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="Private Button2Del As Button";
_button2del = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="Private Label4Final As Label";
_label4final = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="Private Label3Inicial As Label";
_label3inicial = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="Dim cd As CustomLayoutDialog";
_cd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=2424852;
 //BA.debugLineNum = 2424852;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=2424853;
 //BA.debugLineNum = 2424853;BA.debugLine="Private EditText1Area As EditText";
_edittext1area = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2424854;
 //BA.debugLineNum = 2424854;BA.debugLine="Private EditText1TextArea As EditText";
_edittext1textarea = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2424855;
 //BA.debugLineNum = 2424855;BA.debugLine="Private Label20Desc As Label";
_label20desc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424856;
 //BA.debugLineNum = 2424856;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424857;
 //BA.debugLineNum = 2424857;BA.debugLine="Private Label1IdMaquina As Label";
_label1idmaquina = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424858;
 //BA.debugLineNum = 2424858;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Log(Value)";
parent.__c.LogImpl("23670017",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"form"));
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Sleep(90)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "clv_persons_itemclick"),(int) (90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"update\"";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._tipo /*String*/  = "update";
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Value";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._idmaquina /*int*/  = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="B4XPages.ShowPage(\"Form\")";
parent._b4xpages._showpage /*String*/ (ba,"Form");
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub configTime(tag As String)";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,_tag,(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=3342350;
 //BA.debugLineNum = 3342350;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=3342351;
 //BA.debugLineNum = 3342351;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.listdados __ref,String _consecutivo,String _fecha_programa,String _nit,String _hacienda,String _lote,String _labor) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", new Object[] {_consecutivo,_fecha_programa,_nit,_hacienda,_lote,_labor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub CreateItem(Consecutivo,Fecha_programa,";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Dim Panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Panel.SetLayoutAnimated(1, 0, 0, 100%x, 140dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (140)));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Panel.LoadLayout(\"cardDados\")";
_panel.LoadLayout("cardDados",ba);
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Consecutivo: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_consecutivo+__c.CRLF)).Pop();
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha programa: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_fecha_programa+__c.CRLF)).Pop();
RDebugUtils.currentLine=2883607;
 //BA.debugLineNum = 2883607;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"NIT: \").Pop.C";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("NIT: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).PopAll();
RDebugUtils.currentLine=2883611;
 //BA.debugLineNum = 2883611;BA.debugLine="Label1Details.Text = cs";
__ref._label1details /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=2883613;
 //BA.debugLineNum = 2883613;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=2883614;
 //BA.debugLineNum = 2883614;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=2883617;
 //BA.debugLineNum = 2883617;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).Pop();
RDebugUtils.currentLine=2883620;
 //BA.debugLineNum = 2883620;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Lote: \").Pop.";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Lote: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_lote+__c.CRLF)).Pop();
RDebugUtils.currentLine=2883622;
 //BA.debugLineNum = 2883622;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Labor: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_labor+__c.CRLF)).PopAll();
RDebugUtils.currentLine=2883625;
 //BA.debugLineNum = 2883625;BA.debugLine="Label1Details2.Text = cs";
__ref._label1details2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=2883627;
 //BA.debugLineNum = 2883627;BA.debugLine="Button1agendar.Tag=Consecutivo";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=2883628;
 //BA.debugLineNum = 2883628;BA.debugLine="Button1Check.Tag=Consecutivo";
__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=2883629;
 //BA.debugLineNum = 2883629;BA.debugLine="Button2Del.Tag=Consecutivo";
__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=2883630;
 //BA.debugLineNum = 2883630;BA.debugLine="Return Panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=2883631;
 //BA.debugLineNum = 2883631;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemmaquinas(b4a.example.ef.listdados __ref,String _hacienda,String _lote,String _labor) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "createitemmaquinas", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemmaquinas", new Object[] {_hacienda,_lote,_labor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
String _legend = "";
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub CreateItemMaquinas (Hacienda As String";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 70dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (70)));
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="panel.LoadLayout(\"cardMaquina\")";
_panel.LoadLayout("cardMaquina",ba);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Dim legend As String=Label1IdMaquina.Text";
_legend = __ref._label1idmaquina /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="legend=	legend.Replace(\"{Hacienda}\",Hacienda)";
_legend = _legend.replace("{Hacienda}",_hacienda);
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="legend=	legend.Replace(\"{Lote}\",Lote)";
_legend = _legend.replace("{Lote}",_lote);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="legend=	legend.Replace(\"{labor}\",labor)";
_legend = _legend.replace("{labor}",_labor);
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="Label1IdMaquina.Text=legend";
__ref._label1idmaquina /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_legend));
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="End Sub";
return null;
}
public String  _label1_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Button1AddIsumo_Click";
__ref._button1addisumo_click /*void*/ (null);
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public String  _label3inicial_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label3inicial_click", false))
	 {return ((String) Debug.delegate(ba, "label3inicial_click", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub Label3Inicial_Click";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="configTime(\"TimeInicio\")";
__ref._configtime /*String*/ (null,"TimeInicio");
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public String  _label4final_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label4final_click", false))
	 {return ((String) Debug.delegate(ba, "label4final_click", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub Label4Final_Click";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="configTime(\"TimeFim\")";
__ref._configtime /*String*/ (null,"TimeFim");
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return "";
}
public String  _timefim_ondateset(b4a.example.ef.listdados __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "timefim_ondateset", false))
	 {return ((String) Debug.delegate(ba, "timefim_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub TimeFim_OnDateSet(year As Int ,monthOfYear As";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Label4Final.Text=year&\"/\"&(NumberFormat(monthOfYe";
__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Label4Final.TextColor=Colors.Black";
__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="End Sub";
return "";
}
public String  _timeinicio_ondateset(b4a.example.ef.listdados __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "timeinicio_ondateset", false))
	 {return ((String) Debug.delegate(ba, "timeinicio_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub TimeInicio_OnDateSet(year As Int ,monthOfYear";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Label3Inicial.Text=year&\"/\"&(NumberFormat(monthOf";
__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Label3Inicial.TextColor=Colors.Black";
__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="End Sub";
return "";
}
}