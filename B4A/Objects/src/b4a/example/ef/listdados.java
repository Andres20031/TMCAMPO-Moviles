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
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_appear(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub B4XPage_Appear";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="listDadosMaquina";
__ref._listdadosmaquina /*String*/ (null);
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub listDadosMaquina";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="CLV_Persons.Clear";
__ref._clv_persons /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Label2.Text=Chr(0xE145)";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe145))));
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Label3.Text=\"Labores de Campo\"";
__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Labores de Campo"));
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM ma";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina")));
RDebugUtils.currentLine=21626886;
 //BA.debugLineNum = 21626886;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=21626888;
 //BA.debugLineNum = 21626888;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
__c.LogImpl("421626888","=====Maquinas #"+BA.NumberToString(_i)+"=====",0);
RDebugUtils.currentLine=21626889;
 //BA.debugLineNum = 21626889;BA.debugLine="Log(Cursor.GetString(\"id\"))";
__c.LogImpl("421626889",_cursor.GetString("id"),0);
RDebugUtils.currentLine=21626891;
 //BA.debugLineNum = 21626891;BA.debugLine="Dim Hacienda As String=Cursor.GetString(\"haciend";
_hacienda = _cursor.GetString("hacienda");
RDebugUtils.currentLine=21626892;
 //BA.debugLineNum = 21626892;BA.debugLine="Dim Lote As String=Cursor.GetString(\"Lote\")";
_lote = _cursor.GetString("Lote");
RDebugUtils.currentLine=21626893;
 //BA.debugLineNum = 21626893;BA.debugLine="Dim labor As String=Cursor.GetString(\"labor\")";
_labor = _cursor.GetString("labor");
RDebugUtils.currentLine=21626894;
 //BA.debugLineNum = 21626894;BA.debugLine="CLV_Persons.Add(CreateItemMaquinas(Hacienda,Lote";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemmaquinas /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_hacienda,_lote,_labor).getObject())),(Object)(_cursor.GetString("id")));
 }
};
RDebugUtils.currentLine=21626896;
 //BA.debugLineNum = 21626896;BA.debugLine="Log(i)";
__c.LogImpl("421626896",BA.NumberToString(_i),0);
RDebugUtils.currentLine=21626897;
 //BA.debugLineNum = 21626897;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=21626898;
 //BA.debugLineNum = 21626898;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=21626899;
 //BA.debugLineNum = 21626899;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=21626900;
 //BA.debugLineNum = 21626900;BA.debugLine="p.SetLayout(0,0,CLV_Persons.AsView.Width,CLV_Per";
_p.SetLayout((int) (0),(int) (0),__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=21626901;
 //BA.debugLineNum = 21626901;BA.debugLine="p.LoadLayout(\"errorLayout\")";
_p.LoadLayout("errorLayout",ba);
RDebugUtils.currentLine=21626902;
 //BA.debugLineNum = 21626902;BA.debugLine="CLV_Persons.Add(p,0)";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(0));
 };
RDebugUtils.currentLine=21626904;
 //BA.debugLineNum = 21626904;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.listdados __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="Root.LoadLayout(\"ListPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListPerson",ba);
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="Label3.Text=\"List dados\"";
__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("List dados"));
RDebugUtils.currentLine=21430279;
 //BA.debugLineNum = 21430279;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"form"));
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="Sleep(90)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1addisumo_click"),(int) (90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"new\"";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._tipo /*String*/  = "new";
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Rnd(0";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._idmaquina /*int*/  = parent.__c.Rnd((int) (0001),(int) (9999));
RDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="B4XPages.ShowPage(\"Form\")";
parent._b4xpages._showpage /*String*/ (ba,"Form");
RDebugUtils.currentLine=22675462;
 //BA.debugLineNum = 22675462;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Button1agendar=	Sender";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="Log(Button1agendar.Tag)";
parent.__c.LogImpl("422020098",BA.ObjectToString(__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="Dim	id As Int=Button1agendar.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="cd.SetSize(100%x,40%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1agendar_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=22020105;
 //BA.debugLineNum = 22020105;BA.debugLine="DialogPanel.LoadLayout(\"dialogAgenda\")";
_dialogpanel.LoadLayout("dialogAgenda",ba);
RDebugUtils.currentLine=22020106;
 //BA.debugLineNum = 22020106;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=22020107;
 //BA.debugLineNum = 22020107;BA.debugLine="EditText1Area.Color=Colors.Transparent";
__ref._edittext1area /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=22020108;
 //BA.debugLineNum = 22020108;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=22020109;
 //BA.debugLineNum = 22020109;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1agendar_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=22020110;
 //BA.debugLineNum = 22020110;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=22020111;
 //BA.debugLineNum = 22020111;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("422020111","DADOS:",0);
RDebugUtils.currentLine=22020113;
 //BA.debugLineNum = 22020113;BA.debugLine="Log(Label3Inicial.Text)";
parent.__c.LogImpl("422020113",__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=22020114;
 //BA.debugLineNum = 22020114;BA.debugLine="Log(Label4Final.Text)";
parent.__c.LogImpl("422020114",__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=22020115;
 //BA.debugLineNum = 22020115;BA.debugLine="Log(EditText1Area.Text)";
parent.__c.LogImpl("422020115",__ref._edittext1area /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),0);
RDebugUtils.currentLine=22020116;
 //BA.debugLineNum = 22020116;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("422020116","=======================",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=22020119;
 //BA.debugLineNum = 22020119;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Private Sub Button1agendarPOPuo_Click";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="cd.CloseDialog(DialogResponse.POSITIVE)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="End Sub";
return "";
}
public String  _button1canvel_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "button1canvel_click", false))
	 {return ((String) Debug.delegate(ba, "button1canvel_click", null));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub Button1Canvel_Click";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="cd.CloseDialog(DialogResponse.NEGATIVE)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.NEGATIVE);
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="Button1Check=	Sender";
__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="Log(Button1Check.Tag)";
parent.__c.LogImpl("421954562",BA.ObjectToString(__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="Dim	id As Int=Button1Check.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=21954566;
 //BA.debugLineNum = 21954566;BA.debugLine="cd.SetSize(100%x,30%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (30),ba));
RDebugUtils.currentLine=21954567;
 //BA.debugLineNum = 21954567;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1check_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=21954568;
 //BA.debugLineNum = 21954568;BA.debugLine="DialogPanel.LoadLayout(\"DialogDone\")";
_dialogpanel.LoadLayout("DialogDone",ba);
RDebugUtils.currentLine=21954569;
 //BA.debugLineNum = 21954569;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=21954571;
 //BA.debugLineNum = 21954571;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=21954572;
 //BA.debugLineNum = 21954572;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button1check_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=21954573;
 //BA.debugLineNum = 21954573;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=21954574;
 //BA.debugLineNum = 21954574;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("421954574","DADOS:",0);
RDebugUtils.currentLine=21954576;
 //BA.debugLineNum = 21954576;BA.debugLine="Log(Label3Inicial.Text)";
parent.__c.LogImpl("421954576",__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=21954577;
 //BA.debugLineNum = 21954577;BA.debugLine="Log(Label4Final.Text)";
parent.__c.LogImpl("421954577",__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=21954579;
 //BA.debugLineNum = 21954579;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("421954579","=======================",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=21954582;
 //BA.debugLineNum = 21954582;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Button2Del=	Sender";
__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="Log(Button2Del.Tag)";
parent.__c.LogImpl("421889026",BA.ObjectToString(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),0);
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="Dim id As Int=Button2Del.Tag";
_id = (int)(BA.ObjectToNumber(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()));
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="Button1agendar=	Sender";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = __ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.True);
RDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="cd.SetSize(100%x,35%y)";
__ref._cd /*anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (35),ba));
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="DialogPanel.LoadLayout(\"DialogDelete\")";
_dialogpanel.LoadLayout("DialogDelete",ba);
RDebugUtils.currentLine=21889034;
 //BA.debugLineNum = 21889034;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._label20desc /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace("{id}",BA.NumberToString(_id))));
RDebugUtils.currentLine=21889035;
 //BA.debugLineNum = 21889035;BA.debugLine="EditText1TextArea.Color=Colors.Transparent";
__ref._edittext1textarea /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=21889036;
 //BA.debugLineNum = 21889036;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
RDebugUtils.currentLine=21889037;
 //BA.debugLineNum = 21889037;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=21889038;
 //BA.debugLineNum = 21889038;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=21889039;
 //BA.debugLineNum = 21889039;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("421889039","DADOS:",0);
RDebugUtils.currentLine=21889040;
 //BA.debugLineNum = 21889040;BA.debugLine="Log(EditText1TextArea.Text)";
parent.__c.LogImpl("421889040",__ref._edittext1textarea /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),0);
RDebugUtils.currentLine=21889041;
 //BA.debugLineNum = 21889041;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("421889041","=======================",0);
RDebugUtils.currentLine=21889042;
 //BA.debugLineNum = 21889042;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from dados wh";
parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE from dados where Consecutivo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=21889043;
 //BA.debugLineNum = 21889043;BA.debugLine="Sleep(300)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "button2del_click"),(int) (300));
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=21889044;
 //BA.debugLineNum = 21889044;BA.debugLine="listDadso";
__ref._listdadso /*String*/ (null);
RDebugUtils.currentLine=21889045;
 //BA.debugLineNum = 21889045;BA.debugLine="ToastMessageShow(Button2Del.Tag&\" DELETED\",False";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(BA.ObjectToString(__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag())+" DELETED"),parent.__c.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=21889061;
 //BA.debugLineNum = 21889061;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub listDadso";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="CLV_Persons.Clear";
__ref._clv_persons /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM da";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM dados")));
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Log(Cursor.GetString(\"Consecutivo\"))";
__c.LogImpl("421561350",_cursor.GetString("Consecutivo"),0);
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="CLV_Persons.Add(CreateItem(Cursor.GetString(\"Con";
__ref._clv_persons /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_cursor.GetString("Consecutivo"),_cursor.GetString("Fecha_programa"),_cursor.GetString("NIT"),_cursor.GetString("Hacienda"),_cursor.GetString("Lote"),_cursor.GetString("labor")).getObject())),(Object)(_i));
 }
};
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=21561355;
 //BA.debugLineNum = 21561355;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=21561356;
 //BA.debugLineNum = 21561356;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="p.LoadLayout(\"errorLayout\")";
_p.LoadLayout("errorLayout",ba);
RDebugUtils.currentLine=21561358;
 //BA.debugLineNum = 21561358;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
_p.SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=21561359;
 //BA.debugLineNum = 21561359;BA.debugLine="CLV_Persons.AsView.AddView(p,0,0,100%x,100%y)";
__ref._clv_persons /*b4a.example3.customlistview*/ ._asview().AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
RDebugUtils.currentLine=21561361;
 //BA.debugLineNum = 21561361;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="Private CLV_Persons As CustomListView";
_clv_persons = new b4a.example3.customlistview();
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="Private Label1Details As Label";
_label1details = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21299212;
 //BA.debugLineNum = 21299212;BA.debugLine="Private Label1Details2 As Label";
_label1details2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21299213;
 //BA.debugLineNum = 21299213;BA.debugLine="Private Button1agendar As Button";
_button1agendar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=21299214;
 //BA.debugLineNum = 21299214;BA.debugLine="Private Button1Check As Button";
_button1check = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=21299215;
 //BA.debugLineNum = 21299215;BA.debugLine="Private Button2Del As Button";
_button2del = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=21299216;
 //BA.debugLineNum = 21299216;BA.debugLine="Private Label4Final As Label";
_label4final = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21299217;
 //BA.debugLineNum = 21299217;BA.debugLine="Private Label3Inicial As Label";
_label3inicial = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21299218;
 //BA.debugLineNum = 21299218;BA.debugLine="Dim cd As CustomLayoutDialog";
_cd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=21299219;
 //BA.debugLineNum = 21299219;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=21299220;
 //BA.debugLineNum = 21299220;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=21299221;
 //BA.debugLineNum = 21299221;BA.debugLine="Private EditText1Area As EditText";
_edittext1area = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=21299222;
 //BA.debugLineNum = 21299222;BA.debugLine="Private EditText1TextArea As EditText";
_edittext1textarea = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=21299223;
 //BA.debugLineNum = 21299223;BA.debugLine="Private Label20Desc As Label";
_label20desc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21299224;
 //BA.debugLineNum = 21299224;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21299225;
 //BA.debugLineNum = 21299225;BA.debugLine="Private Label1IdMaquina As Label";
_label1idmaquina = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21299226;
 //BA.debugLineNum = 21299226;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="Log(Value)";
parent.__c.LogImpl("422544385",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"form"));
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="Sleep(90)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "listdados", "clv_persons_itemclick"),(int) (90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"update\"";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._tipo /*String*/  = "update";
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Value";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._idmaquina /*int*/  = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="B4XPages.ShowPage(\"Form\")";
parent._b4xpages._showpage /*String*/ (ba,"Form");
RDebugUtils.currentLine=22544391;
 //BA.debugLineNum = 22544391;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Sub configTime(tag As String)";
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,_tag,(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=22216709;
 //BA.debugLineNum = 22216709;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=22216711;
 //BA.debugLineNum = 22216711;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=22216712;
 //BA.debugLineNum = 22216712;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=22216713;
 //BA.debugLineNum = 22216713;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=22216714;
 //BA.debugLineNum = 22216714;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=22216715;
 //BA.debugLineNum = 22216715;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=22216716;
 //BA.debugLineNum = 22216716;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=22216717;
 //BA.debugLineNum = 22216717;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=22216718;
 //BA.debugLineNum = 22216718;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=22216719;
 //BA.debugLineNum = 22216719;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.listdados __ref,String _consecutivo,String _fecha_programa,String _nit,String _hacienda,String _lote,String _labor) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", new Object[] {_consecutivo,_fecha_programa,_nit,_hacienda,_lote,_labor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Private Sub CreateItem(Consecutivo,Fecha_programa,";
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="Dim Panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="Panel.SetLayoutAnimated(1, 0, 0, 100%x, 140dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (140)));
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="Panel.LoadLayout(\"cardDados\")";
_panel.LoadLayout("cardDados",ba);
RDebugUtils.currentLine=21757965;
 //BA.debugLineNum = 21757965;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=21757966;
 //BA.debugLineNum = 21757966;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=21757969;
 //BA.debugLineNum = 21757969;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Consecutivo: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_consecutivo+__c.CRLF)).Pop();
RDebugUtils.currentLine=21757972;
 //BA.debugLineNum = 21757972;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha programa: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_fecha_programa+__c.CRLF)).Pop();
RDebugUtils.currentLine=21757975;
 //BA.debugLineNum = 21757975;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"NIT: \").Pop.C";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("NIT: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).PopAll();
RDebugUtils.currentLine=21757979;
 //BA.debugLineNum = 21757979;BA.debugLine="Label1Details.Text = cs";
__ref._label1details /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=21757981;
 //BA.debugLineNum = 21757981;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=21757982;
 //BA.debugLineNum = 21757982;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=21757985;
 //BA.debugLineNum = 21757985;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).Pop();
RDebugUtils.currentLine=21757988;
 //BA.debugLineNum = 21757988;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Lote: \").Pop.";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Lote: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_lote+__c.CRLF)).Pop();
RDebugUtils.currentLine=21757990;
 //BA.debugLineNum = 21757990;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Labor: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_labor+__c.CRLF)).PopAll();
RDebugUtils.currentLine=21757993;
 //BA.debugLineNum = 21757993;BA.debugLine="Label1Details2.Text = cs";
__ref._label1details2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=21757995;
 //BA.debugLineNum = 21757995;BA.debugLine="Button1agendar.Tag=Consecutivo";
__ref._button1agendar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=21757996;
 //BA.debugLineNum = 21757996;BA.debugLine="Button1Check.Tag=Consecutivo";
__ref._button1check /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=21757997;
 //BA.debugLineNum = 21757997;BA.debugLine="Button2Del.Tag=Consecutivo";
__ref._button2del /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_consecutivo));
RDebugUtils.currentLine=21757998;
 //BA.debugLineNum = 21757998;BA.debugLine="Return Panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=21757999;
 //BA.debugLineNum = 21757999;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemmaquinas(b4a.example.ef.listdados __ref,String _hacienda,String _lote,String _labor) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "createitemmaquinas", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemmaquinas", new Object[] {_hacienda,_lote,_labor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
String _legend = "";
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Private Sub CreateItemMaquinas (Hacienda As String";
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 70dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (70)));
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="panel.LoadLayout(\"cardMaquina\")";
_panel.LoadLayout("cardMaquina",ba);
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="Dim legend As String=Label1IdMaquina.Text";
_legend = __ref._label1idmaquina /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="legend=	legend.Replace(\"{Hacienda}\",Hacienda)";
_legend = _legend.replace("{Hacienda}",_hacienda);
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="legend=	legend.Replace(\"{Lote}\",Lote)";
_legend = _legend.replace("{Lote}",_lote);
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="legend=	legend.Replace(\"{labor}\",labor)";
_legend = _legend.replace("{labor}",_labor);
RDebugUtils.currentLine=21692425;
 //BA.debugLineNum = 21692425;BA.debugLine="Label1IdMaquina.Text=legend";
__ref._label1idmaquina /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_legend));
RDebugUtils.currentLine=21692426;
 //BA.debugLineNum = 21692426;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=21692427;
 //BA.debugLineNum = 21692427;BA.debugLine="End Sub";
return null;
}
public String  _label1_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Button1AddIsumo_Click";
__ref._button1addisumo_click /*void*/ (null);
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="End Sub";
return "";
}
public String  _label3inicial_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label3inicial_click", false))
	 {return ((String) Debug.delegate(ba, "label3inicial_click", null));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub Label3Inicial_Click";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="configTime(\"TimeInicio\")";
__ref._configtime /*String*/ (null,"TimeInicio");
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="End Sub";
return "";
}
public String  _label4final_click(b4a.example.ef.listdados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "label4final_click", false))
	 {return ((String) Debug.delegate(ba, "label4final_click", null));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub Label4Final_Click";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="configTime(\"TimeFim\")";
__ref._configtime /*String*/ (null,"TimeFim");
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="End Sub";
return "";
}
public String  _timefim_ondateset(b4a.example.ef.listdados __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "timefim_ondateset", false))
	 {return ((String) Debug.delegate(ba, "timefim_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Sub TimeFim_OnDateSet(year As Int ,monthOfYear As";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Label4Final.Text=year&\"/\"&(NumberFormat(monthOfYe";
__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="Label4Final.TextColor=Colors.Black";
__ref._label4final /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="End Sub";
return "";
}
public String  _timeinicio_ondateset(b4a.example.ef.listdados __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdados";
if (Debug.shouldDelegate(ba, "timeinicio_ondateset", false))
	 {return ((String) Debug.delegate(ba, "timeinicio_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Sub TimeInicio_OnDateSet(year As Int ,monthOfYear";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Label3Inicial.Text=year&\"/\"&(NumberFormat(monthOf";
__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="Label3Inicial.TextColor=Colors.Black";
__ref._label3inicial /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="End Sub";
return "";
}
}