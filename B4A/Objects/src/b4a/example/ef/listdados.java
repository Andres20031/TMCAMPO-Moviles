package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class listdados extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.listdados");
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
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 45;BA.debugLine="listDadosMaquina";
_listdadosmaquina();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 36;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 37;BA.debugLine="utilClass.Initialize";
_utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 38;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
_utilclass._setstatusbarcolor /*String*/ (__c.Colors.White,__c.Colors.White);
 //BA.debugLineNum = 39;BA.debugLine="Root.LoadLayout(\"ListPerson\")";
_root.LoadLayout("ListPerson",ba);
 //BA.debugLineNum = 40;BA.debugLine="Label3.Text=\"List dados\"";
_label3.setText(BA.ObjectToCharSequence("List dados"));
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public void  _button1addisumo_click() throws Exception{
ResumableSub_Button1AddIsumo_Click rsub = new ResumableSub_Button1AddIsumo_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1AddIsumo_Click extends BA.ResumableSub {
public ResumableSub_Button1AddIsumo_Click(b4a.example.ef.listdados parent) {
this.parent = parent;
}
b4a.example.ef.listdados parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 323;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"form"));
 //BA.debugLineNum = 324;BA.debugLine="Sleep(90)";
parent.__c.Sleep(ba,this,(int) (90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 325;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"new\"";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._tipo /*String*/  = "new";
 //BA.debugLineNum = 326;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Rnd(0";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._idmaquina /*int*/  = parent.__c.Rnd((int) (0001),(int) (9999));
 //BA.debugLineNum = 327;BA.debugLine="B4XPages.ShowPage(\"Form\")";
parent._b4xpages._showpage /*String*/ (ba,"Form");
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _button1agendar_click() throws Exception{
ResumableSub_Button1agendar_Click rsub = new ResumableSub_Button1agendar_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1agendar_Click extends BA.ResumableSub {
public ResumableSub_Button1agendar_Click(b4a.example.ef.listdados parent) {
this.parent = parent;
}
b4a.example.ef.listdados parent;
int _id = 0;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 235;BA.debugLine="Button1agendar=	Sender";
parent._button1agendar = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 236;BA.debugLine="Log(Button1agendar.Tag)";
parent.__c.LogImpl("720316162",BA.ObjectToString(parent._button1agendar.getTag()),0);
 //BA.debugLineNum = 238;BA.debugLine="Dim	id As Int=Button1agendar.Tag";
_id = (int)(BA.ObjectToNumber(parent._button1agendar.getTag()));
 //BA.debugLineNum = 240;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = parent._cd.ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
 //BA.debugLineNum = 241;BA.debugLine="cd.SetSize(100%x,40%y)";
parent._cd.SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (40),ba));
 //BA.debugLineNum = 242;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, this, _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
 //BA.debugLineNum = 243;BA.debugLine="DialogPanel.LoadLayout(\"dialogAgenda\")";
_dialogpanel.LoadLayout("dialogAgenda",ba);
 //BA.debugLineNum = 244;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
parent._label20desc.setText(BA.ObjectToCharSequence(parent._label20desc.getText().replace("{id}",BA.NumberToString(_id))));
 //BA.debugLineNum = 245;BA.debugLine="EditText1Area.Color=Colors.Transparent";
parent._edittext1area.setColor(parent.__c.Colors.Transparent);
 //BA.debugLineNum = 246;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
 //BA.debugLineNum = 247;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, this, _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 248;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 249;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("720316175","DADOS:",0);
 //BA.debugLineNum = 251;BA.debugLine="Log(Label3Inicial.Text)";
parent.__c.LogImpl("720316177",parent._label3inicial.getText(),0);
 //BA.debugLineNum = 252;BA.debugLine="Log(Label4Final.Text)";
parent.__c.LogImpl("720316178",parent._label4final.getText(),0);
 //BA.debugLineNum = 253;BA.debugLine="Log(EditText1Area.Text)";
parent.__c.LogImpl("720316179",parent._edittext1area.getText(),0);
 //BA.debugLineNum = 254;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("720316180","=======================",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _dialog_ready(anywheresoftware.b4a.objects.PanelWrapper _dialogpanel) throws Exception{
}
public void  _dialog_result(int _result) throws Exception{
}
public String  _button1agendarpopuo_click() throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Private Sub Button1agendarPOPuo_Click";
 //BA.debugLineNum = 305;BA.debugLine="cd.CloseDialog(DialogResponse.POSITIVE)";
_cd.CloseDialog(ba,__c.DialogResponse.POSITIVE);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return "";
}
public String  _button1canvel_click() throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Private Sub Button1Canvel_Click";
 //BA.debugLineNum = 301;BA.debugLine="cd.CloseDialog(DialogResponse.NEGATIVE)";
_cd.CloseDialog(ba,__c.DialogResponse.NEGATIVE);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return "";
}
public void  _button1check_click() throws Exception{
ResumableSub_Button1Check_Click rsub = new ResumableSub_Button1Check_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1Check_Click extends BA.ResumableSub {
public ResumableSub_Button1Check_Click(b4a.example.ef.listdados parent) {
this.parent = parent;
}
b4a.example.ef.listdados parent;
int _id = 0;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 211;BA.debugLine="Button1Check=	Sender";
parent._button1check = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 212;BA.debugLine="Log(Button1Check.Tag)";
parent.__c.LogImpl("720250626",BA.ObjectToString(parent._button1check.getTag()),0);
 //BA.debugLineNum = 213;BA.debugLine="Dim	id As Int=Button1Check.Tag";
_id = (int)(BA.ObjectToNumber(parent._button1check.getTag()));
 //BA.debugLineNum = 215;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = parent._cd.ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
 //BA.debugLineNum = 216;BA.debugLine="cd.SetSize(100%x,30%y)";
parent._cd.SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (30),ba));
 //BA.debugLineNum = 217;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, this, _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
 //BA.debugLineNum = 218;BA.debugLine="DialogPanel.LoadLayout(\"DialogDone\")";
_dialogpanel.LoadLayout("DialogDone",ba);
 //BA.debugLineNum = 219;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
parent._label20desc.setText(BA.ObjectToCharSequence(parent._label20desc.getText().replace("{id}",BA.NumberToString(_id))));
 //BA.debugLineNum = 221;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
 //BA.debugLineNum = 222;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, this, _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 223;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 224;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("720250638","DADOS:",0);
 //BA.debugLineNum = 226;BA.debugLine="Log(Label3Inicial.Text)";
parent.__c.LogImpl("720250640",parent._label3inicial.getText(),0);
 //BA.debugLineNum = 227;BA.debugLine="Log(Label4Final.Text)";
parent.__c.LogImpl("720250641",parent._label4final.getText(),0);
 //BA.debugLineNum = 229;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("720250643","=======================",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _button2del_click() throws Exception{
ResumableSub_Button2Del_Click rsub = new ResumableSub_Button2Del_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button2Del_Click extends BA.ResumableSub {
public ResumableSub_Button2Del_Click(b4a.example.ef.listdados parent) {
this.parent = parent;
}
b4a.example.ef.listdados parent;
int _id = 0;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 172;BA.debugLine="Button2Del=	Sender";
parent._button2del = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 173;BA.debugLine="Log(Button2Del.Tag)";
parent.__c.LogImpl("720185090",BA.ObjectToString(parent._button2del.getTag()),0);
 //BA.debugLineNum = 174;BA.debugLine="Dim id As Int=Button2Del.Tag";
_id = (int)(BA.ObjectToNumber(parent._button2del.getTag()));
 //BA.debugLineNum = 175;BA.debugLine="Button1agendar=	Sender";
parent._button1agendar = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 176;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"\", \"\", \"\", \"\", N";
_sf = parent._cd.ShowAsync("","","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.True);
 //BA.debugLineNum = 177;BA.debugLine="cd.SetSize(100%x,35%y)";
parent._cd.SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (35),ba));
 //BA.debugLineNum = 178;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, this, _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
 //BA.debugLineNum = 179;BA.debugLine="DialogPanel.LoadLayout(\"DialogDelete\")";
_dialogpanel.LoadLayout("DialogDelete",ba);
 //BA.debugLineNum = 181;BA.debugLine="Label20Desc.Text=Label20Desc.Text.Replace(\"{id}\",";
parent._label20desc.setText(BA.ObjectToCharSequence(parent._label20desc.getText().replace("{id}",BA.NumberToString(_id))));
 //BA.debugLineNum = 182;BA.debugLine="EditText1TextArea.Color=Colors.Transparent";
parent._edittext1textarea.setColor(parent.__c.Colors.Transparent);
 //BA.debugLineNum = 183;BA.debugLine="DialogPanel.Color=Colors.Transparent";
_dialogpanel.setColor(parent.__c.Colors.Transparent);
 //BA.debugLineNum = 184;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, this, _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 185;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 186;BA.debugLine="Log(\"DADOS:\")";
parent.__c.LogImpl("720185103","DADOS:",0);
 //BA.debugLineNum = 187;BA.debugLine="Log(EditText1TextArea.Text)";
parent.__c.LogImpl("720185104",parent._edittext1textarea.getText(),0);
 //BA.debugLineNum = 188;BA.debugLine="Log(\"=======================\")";
parent.__c.LogImpl("720185105","=======================",0);
 //BA.debugLineNum = 189;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from dados wh";
parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE from dados where Consecutivo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
 //BA.debugLineNum = 190;BA.debugLine="Sleep(300)";
parent.__c.Sleep(ba,this,(int) (300));
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
 //BA.debugLineNum = 191;BA.debugLine="listDadso";
parent._listdadso();
 //BA.debugLineNum = 192;BA.debugLine="ToastMessageShow(Button2Del.Tag&\" DELETED\",False";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(BA.ObjectToString(parent._button2del.getTag())+" DELETED"),parent.__c.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
 //BA.debugLineNum = 10;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private Label1Details As Label";
_label1details = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private Label1Details2 As Label";
_label1details2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private Button1agendar As Button";
_button1agendar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private Button1Check As Button";
_button1check = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Button2Del As Button";
_button2del = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private Label4Final As Label";
_label4final = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private Label3Inicial As Label";
_label3inicial = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim cd As CustomLayoutDialog";
_cd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.CustomLayoutDialog();
 //BA.debugLineNum = 20;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
 //BA.debugLineNum = 21;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
 //BA.debugLineNum = 22;BA.debugLine="Private EditText1Area As EditText";
_edittext1area = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private EditText1TextArea As EditText";
_edittext1textarea = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Label20Desc As Label";
_label20desc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Label1IdMaquina As Label";
_label1idmaquina = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public void  _clv_persons_itemclick(int _index,Object _value) throws Exception{
ResumableSub_CLV_Persons_ItemClick rsub = new ResumableSub_CLV_Persons_ItemClick(this,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_CLV_Persons_ItemClick extends BA.ResumableSub {
public ResumableSub_CLV_Persons_ItemClick(b4a.example.ef.listdados parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
b4a.example.ef.listdados parent;
int _index;
Object _value;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 310;BA.debugLine="Log(Value)";
parent.__c.LogImpl("720840449",BA.ObjectToString(_value),0);
 //BA.debugLineNum = 311;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"form\"))";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"form"));
 //BA.debugLineNum = 312;BA.debugLine="Sleep(90)";
parent.__c.Sleep(ba,this,(int) (90));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 313;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).tipo=\"update\"";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._tipo /*String*/  = "update";
 //BA.debugLineNum = 314;BA.debugLine="B4XPages.GetPage(\"form\").As(Form).idMaquina=Value";
((b4a.example.ef.form)(parent._b4xpages._getpage /*Object*/ (ba,"form")))._idmaquina /*int*/  = (int)(BA.ObjectToNumber(_value));
 //BA.debugLineNum = 315;BA.debugLine="B4XPages.ShowPage(\"Form\")";
parent._b4xpages._showpage /*String*/ (ba,"Form");
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _configtime(String _tag) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub configTime(tag As String)";
 //BA.debugLineNum = 272;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
_datepicker.Initialize(ba,_tag,(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 273;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
_mycalendar.Initialize(ba,"dd.mm.yyyy",_mycalendar.PRC,"2.02.1990");
 //BA.debugLineNum = 274;BA.debugLine="Datepicker.SetThemeDark";
_datepicker.SetThemeDark();
 //BA.debugLineNum = 275;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
_datepicker.SetMinDate((java.util.Calendar)(_mycalendar.getObject()));
 //BA.debugLineNum = 276;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
_mycalendar.Initialize(ba,"dd.mm.yyyy",_mycalendar.PRC,"2.02.2030");
 //BA.debugLineNum = 277;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
_datepicker.SetMaxDate((java.util.Calendar)(_mycalendar.getObject()));
 //BA.debugLineNum = 278;BA.debugLine="Datepicker.CancelColor = Colors.White";
_datepicker.setCancelColor(__c.Colors.White);
 //BA.debugLineNum = 279;BA.debugLine="Datepicker.OkColor = Colors.White";
_datepicker.setOkColor(__c.Colors.White);
 //BA.debugLineNum = 280;BA.debugLine="Datepicker.Title = \"Selecione\"";
_datepicker.setTitle("Selecione");
 //BA.debugLineNum = 281;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
_datepicker.setCancelText("Cancelar");
 //BA.debugLineNum = 282;BA.debugLine="Datepicker.OkText = \"Ok\"";
_datepicker.setOkText("Ok");
 //BA.debugLineNum = 283;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
_datepicker.SetOnCancel("Cancel");
 //BA.debugLineNum = 284;BA.debugLine="Datepicker.show2(\"iki\")";
_datepicker.show2("iki");
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(String _consecutivo,String _fecha_programa,String _nit,String _hacienda,String _lote,String _labor) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
 //BA.debugLineNum = 112;BA.debugLine="Private Sub CreateItem(Consecutivo,Fecha_programa,";
 //BA.debugLineNum = 114;BA.debugLine="Dim Panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 116;BA.debugLine="Panel.SetLayoutAnimated(1, 0, 0, 100%x, 140dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (140)));
 //BA.debugLineNum = 118;BA.debugLine="Panel.LoadLayout(\"cardDados\")";
_panel.LoadLayout("cardDados",ba);
 //BA.debugLineNum = 125;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 126;BA.debugLine="cs.Initialize";
_cs.Initialize();
 //BA.debugLineNum = 129;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Consecutivo: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_consecutivo+__c.CRLF)).Pop();
 //BA.debugLineNum = 132;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Fecha programa: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_fecha_programa+__c.CRLF)).Pop();
 //BA.debugLineNum = 135;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"NIT: \").Pop.C";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("NIT: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_nit+__c.CRLF)).PopAll();
 //BA.debugLineNum = 139;BA.debugLine="Label1Details.Text = cs";
_label1details.setText(BA.ObjectToCharSequence(_cs.getObject()));
 //BA.debugLineNum = 141;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 142;BA.debugLine="cs.Initialize";
_cs.Initialize();
 //BA.debugLineNum = 145;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Hacienda: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_hacienda+__c.CRLF)).Pop();
 //BA.debugLineNum = 148;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Lote: \").Pop.";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Lote: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_lote+__c.CRLF)).Pop();
 //BA.debugLineNum = 150;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
_cs.Bold().Color(__c.Colors.Black).Append(BA.ObjectToCharSequence("Labor: ")).Pop().Color(__c.Colors.Gray).Append(BA.ObjectToCharSequence(_labor+__c.CRLF)).PopAll();
 //BA.debugLineNum = 153;BA.debugLine="Label1Details2.Text = cs";
_label1details2.setText(BA.ObjectToCharSequence(_cs.getObject()));
 //BA.debugLineNum = 155;BA.debugLine="Button1agendar.Tag=Consecutivo";
_button1agendar.setTag((Object)(_consecutivo));
 //BA.debugLineNum = 156;BA.debugLine="Button1Check.Tag=Consecutivo";
_button1check.setTag((Object)(_consecutivo));
 //BA.debugLineNum = 157;BA.debugLine="Button2Del.Tag=Consecutivo";
_button2del.setTag((Object)(_consecutivo));
 //BA.debugLineNum = 158;BA.debugLine="Return Panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemmaquinas(String _hacienda,String _lote,String _labor) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
String _legend = "";
 //BA.debugLineNum = 97;BA.debugLine="Private Sub CreateItemMaquinas (Hacienda As String";
 //BA.debugLineNum = 99;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 100;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 70dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (70)));
 //BA.debugLineNum = 101;BA.debugLine="panel.LoadLayout(\"cardMaquina\")";
_panel.LoadLayout("cardMaquina",ba);
 //BA.debugLineNum = 102;BA.debugLine="Dim legend As String=Label1IdMaquina.Text";
_legend = _label1idmaquina.getText();
 //BA.debugLineNum = 103;BA.debugLine="legend=	legend.Replace(\"{Hacienda}\",Hacienda)";
_legend = _legend.replace("{Hacienda}",_hacienda);
 //BA.debugLineNum = 104;BA.debugLine="legend=	legend.Replace(\"{Lote}\",Lote)";
_legend = _legend.replace("{Lote}",_lote);
 //BA.debugLineNum = 105;BA.debugLine="legend=	legend.Replace(\"{labor}\",labor)";
_legend = _legend.replace("{labor}",_labor);
 //BA.debugLineNum = 106;BA.debugLine="Label1IdMaquina.Text=legend";
_label1idmaquina.setText(BA.ObjectToCharSequence(_legend));
 //BA.debugLineNum = 107;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public String  _label1_click() throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Private Sub Label1_Click";
 //BA.debugLineNum = 168;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click() throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Private Sub Label1Back_Click";
 //BA.debugLineNum = 331;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return "";
}
public String  _label2_click() throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Private Sub Label2_Click";
 //BA.debugLineNum = 319;BA.debugLine="Button1AddIsumo_Click";
_button1addisumo_click();
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return "";
}
public String  _label3inicial_click() throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Private Sub Label3Inicial_Click";
 //BA.debugLineNum = 260;BA.debugLine="configTime(\"TimeInicio\")";
_configtime("TimeInicio");
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public String  _label4final_click() throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Private Sub Label4Final_Click";
 //BA.debugLineNum = 265;BA.debugLine="configTime(\"TimeFim\")";
_configtime("TimeFim");
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public String  _listdadosmaquina() throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
String _hacienda = "";
String _lote = "";
String _labor = "";
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 69;BA.debugLine="Sub listDadosMaquina";
 //BA.debugLineNum = 70;BA.debugLine="CLV_Persons.Clear";
_clv_persons._clear();
 //BA.debugLineNum = 71;BA.debugLine="Label2.Text=Chr(0xE145)";
_label2.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe145))));
 //BA.debugLineNum = 72;BA.debugLine="Label3.Text=\"Labores de Campo\"";
_label3.setText(BA.ObjectToCharSequence("Labores de Campo"));
 //BA.debugLineNum = 73;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 74;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM ma";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina")));
 //BA.debugLineNum = 75;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 76;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
 //BA.debugLineNum = 77;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
__c.LogImpl("719922952","=====Maquinas #"+BA.NumberToString(_i)+"=====",0);
 //BA.debugLineNum = 78;BA.debugLine="Log(Cursor.GetString(\"id\"))";
__c.LogImpl("719922953",_cursor.GetString("id"),0);
 //BA.debugLineNum = 80;BA.debugLine="Dim Hacienda As String=Cursor.GetString(\"haciend";
_hacienda = _cursor.GetString("hacienda");
 //BA.debugLineNum = 81;BA.debugLine="Dim Lote As String=Cursor.GetString(\"Lote\")";
_lote = _cursor.GetString("Lote");
 //BA.debugLineNum = 82;BA.debugLine="Dim labor As String=Cursor.GetString(\"labor\")";
_labor = _cursor.GetString("labor");
 //BA.debugLineNum = 83;BA.debugLine="CLV_Persons.Add(CreateItemMaquinas(Hacienda,Lote";
_clv_persons._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitemmaquinas(_hacienda,_lote,_labor).getObject())),(Object)(_cursor.GetString("id")));
 }
};
 //BA.debugLineNum = 85;BA.debugLine="Log(i)";
__c.LogImpl("719922960",BA.NumberToString(_i),0);
 //BA.debugLineNum = 86;BA.debugLine="If i=0 Then";
if (_i==0) { 
 //BA.debugLineNum = 87;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 88;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 89;BA.debugLine="p.SetLayout(0,0,CLV_Persons.AsView.Width,CLV_Per";
_p.SetLayout((int) (0),(int) (0),_clv_persons._asview().getWidth(),_clv_persons._asview().getHeight());
 //BA.debugLineNum = 90;BA.debugLine="p.LoadLayout(\"errorLayout\")";
_p.LoadLayout("errorLayout",ba);
 //BA.debugLineNum = 91;BA.debugLine="CLV_Persons.Add(p,0)";
_clv_persons._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(0));
 };
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _listdadso() throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 49;BA.debugLine="Sub listDadso";
 //BA.debugLineNum = 50;BA.debugLine="CLV_Persons.Clear";
_clv_persons._clear();
 //BA.debugLineNum = 51;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM da";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM dados")));
 //BA.debugLineNum = 53;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 54;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
 //BA.debugLineNum = 55;BA.debugLine="Log(Cursor.GetString(\"Consecutivo\"))";
__c.LogImpl("719857414",_cursor.GetString("Consecutivo"),0);
 //BA.debugLineNum = 57;BA.debugLine="CLV_Persons.Add(CreateItem(Cursor.GetString(\"Con";
_clv_persons._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(_cursor.GetString("Consecutivo"),_cursor.GetString("Fecha_programa"),_cursor.GetString("NIT"),_cursor.GetString("Hacienda"),_cursor.GetString("Lote"),_cursor.GetString("labor")).getObject())),(Object)(_i));
 }
};
 //BA.debugLineNum = 59;BA.debugLine="If i=0 Then";
if (_i==0) { 
 //BA.debugLineNum = 60;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 61;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 62;BA.debugLine="p.LoadLayout(\"errorLayout\")";
_p.LoadLayout("errorLayout",ba);
 //BA.debugLineNum = 63;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
_p.SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 64;BA.debugLine="CLV_Persons.AsView.AddView(p,0,0,100%x,100%y)";
_clv_persons._asview().AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _timefim_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub TimeFim_OnDateSet(year As Int ,monthOfYear As";
 //BA.debugLineNum = 296;BA.debugLine="Label4Final.Text=year&\"/\"&(NumberFormat(monthOfYe";
_label4final.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
 //BA.debugLineNum = 297;BA.debugLine="Label4Final.TextColor=Colors.Black";
_label4final.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public String  _timeinicio_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub TimeInicio_OnDateSet(year As Int ,monthOfYear";
 //BA.debugLineNum = 290;BA.debugLine="Label3Inicial.Text=year&\"/\"&(NumberFormat(monthOf";
_label3inicial.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
 //BA.debugLineNum = 291;BA.debugLine="Label3Inicial.TextColor=Colors.Black";
_label3inicial.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
