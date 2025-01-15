package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xinputtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xinputtemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xinputtemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public String _text = "";
public b4a.example.ef.b4xdialog _xdialog = null;
public String _regexpattern = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _textfield1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public boolean _mallowdecimals = false;
public int _bordercolor = 0;
public int _bordercolorinvalid = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.ef.b4xinputtemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=71565312;
 //BA.debugLineNum = 71565312;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=71565313;
 //BA.debugLineNum = 71565313;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=71565314;
 //BA.debugLineNum = 71565314;BA.debugLine="End Sub";
return null;
}
public void  _show(b4a.example.ef.b4xinputtemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.ef.b4xinputtemplate parent,b4a.example.ef.b4xinputtemplate __ref,b4a.example.ef.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4a.example.ef.b4xinputtemplate __ref;
b4a.example.ef.b4xinputtemplate parent;
b4a.example.ef.b4xdialog _dialog;
anywheresoftware.b4a.objects.EditTextWrapper _tf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xinputtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=71630849;
 //BA.debugLineNum = 71630849;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4a.example.ef.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=71630850;
 //BA.debugLineNum = 71630850;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*b4a.example.ef.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=71630851;
 //BA.debugLineNum = 71630851;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xinputtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=71630852;
 //BA.debugLineNum = 71630852;BA.debugLine="TextField1.Text = Text";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._text /*String*/ ));
RDebugUtils.currentLine=71630853;
 //BA.debugLineNum = 71630853;BA.debugLine="Validate(Text)";
__ref._validate /*String*/ (null,__ref._text /*String*/ );
RDebugUtils.currentLine=71630854;
 //BA.debugLineNum = 71630854;BA.debugLine="TextField1.RequestFocus";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=71630856;
 //BA.debugLineNum = 71630856;BA.debugLine="Dim tf As EditText = TextField1";
_tf = new anywheresoftware.b4a.objects.EditTextWrapper();
_tf = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=71630857;
 //BA.debugLineNum = 71630857;BA.debugLine="tf.SelectAll";
_tf.SelectAll();
RDebugUtils.currentLine=71630858;
 //BA.debugLineNum = 71630858;BA.debugLine="IME.ShowKeyboard(TextField1)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=71630863;
 //BA.debugLineNum = 71630863;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4a.example.ef.b4xinputtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=71696384;
 //BA.debugLineNum = 71696384;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=71696385;
 //BA.debugLineNum = 71696385;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=71696386;
 //BA.debugLineNum = 71696386;BA.debugLine="Text = TextField1.Text";
__ref._text /*String*/  = __ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
 };
RDebugUtils.currentLine=71696388;
 //BA.debugLineNum = 71696388;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
RDebugUtils.currentLine=70909952;
 //BA.debugLineNum = 70909952;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=70909953;
 //BA.debugLineNum = 70909953;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=70909954;
 //BA.debugLineNum = 70909954;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=70909955;
 //BA.debugLineNum = 70909955;BA.debugLine="Public Text As String";
_text = "";
RDebugUtils.currentLine=70909956;
 //BA.debugLineNum = 70909956;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=70909957;
 //BA.debugLineNum = 70909957;BA.debugLine="Public RegexPattern As String";
_regexpattern = "";
RDebugUtils.currentLine=70909958;
 //BA.debugLineNum = 70909958;BA.debugLine="Public TextField1 As B4XView";
_textfield1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=70909959;
 //BA.debugLineNum = 70909959;BA.debugLine="Public lblTitle As B4XView";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=70909961;
 //BA.debugLineNum = 70909961;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=70909963;
 //BA.debugLineNum = 70909963;BA.debugLine="Private mAllowDecimals As Boolean";
_mallowdecimals = false;
RDebugUtils.currentLine=70909964;
 //BA.debugLineNum = 70909964;BA.debugLine="Private BorderColor = xui.Color_White, BorderColo";
_bordercolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
_bordercolorinvalid = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red;
RDebugUtils.currentLine=70909965;
 //BA.debugLineNum = 70909965;BA.debugLine="End Sub";
return "";
}
public String  _configurefornumbers(b4a.example.ef.b4xinputtemplate __ref,boolean _allowdecimals,boolean _allownegative) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "configurefornumbers", true))
	 {return ((String) Debug.delegate(ba, "configurefornumbers", new Object[] {_allowdecimals,_allownegative}));}
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
RDebugUtils.currentLine=71106560;
 //BA.debugLineNum = 71106560;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
RDebugUtils.currentLine=71106562;
 //BA.debugLineNum = 71106562;BA.debugLine="Dim et As EditText = TextField1";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=71106563;
 //BA.debugLineNum = 71106563;BA.debugLine="If AllowDecimals Or AllowNegative Then";
if (_allowdecimals || _allownegative) { 
RDebugUtils.currentLine=71106564;
 //BA.debugLineNum = 71106564;BA.debugLine="et.InputType = et.INPUT_TYPE_DECIMAL_NUMBERS";
_et.setInputType(_et.INPUT_TYPE_DECIMAL_NUMBERS);
 }else {
RDebugUtils.currentLine=71106566;
 //BA.debugLineNum = 71106566;BA.debugLine="et.InputType = et.INPUT_TYPE_NUMBERS";
_et.setInputType(_et.INPUT_TYPE_NUMBERS);
 };
RDebugUtils.currentLine=71106579;
 //BA.debugLineNum = 71106579;BA.debugLine="If AllowDecimals And AllowNegative Then";
if (_allowdecimals && _allownegative) { 
RDebugUtils.currentLine=71106580;
 //BA.debugLineNum = 71106580;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
__ref._regexpattern /*String*/  = "^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else 
{RDebugUtils.currentLine=71106581;
 //BA.debugLineNum = 71106581;BA.debugLine="Else If AllowDecimals And AllowNegative = False T";
if (_allowdecimals && _allownegative==__c.False) { 
RDebugUtils.currentLine=71106582;
 //BA.debugLineNum = 71106582;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
__ref._regexpattern /*String*/  = "^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else 
{RDebugUtils.currentLine=71106583;
 //BA.debugLineNum = 71106583;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
if (_allowdecimals==__c.False && _allownegative==__c.True) { 
RDebugUtils.currentLine=71106584;
 //BA.debugLineNum = 71106584;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
__ref._regexpattern /*String*/  = "^-?(0|[1-9]\\d*)$";
 }else 
{RDebugUtils.currentLine=71106585;
 //BA.debugLineNum = 71106585;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
if (_allowdecimals==__c.False && _allownegative==__c.False) { 
RDebugUtils.currentLine=71106586;
 //BA.debugLineNum = 71106586;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
__ref._regexpattern /*String*/  = "^(0|[1-9]\\d*)$";
 }}}}
;
RDebugUtils.currentLine=71106588;
 //BA.debugLineNum = 71106588;BA.debugLine="mAllowDecimals = AllowDecimals";
__ref._mallowdecimals /*boolean*/  = _allowdecimals;
RDebugUtils.currentLine=71106589;
 //BA.debugLineNum = 71106589;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xinputtemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=70975488;
 //BA.debugLineNum = 70975488;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=70975489;
 //BA.debugLineNum = 70975489;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=70975490;
 //BA.debugLineNum = 70975490;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 80dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=70975491;
 //BA.debugLineNum = 70975491;BA.debugLine="mBase.LoadLayout(\"B4XInputTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("B4XInputTemplate",ba);
RDebugUtils.currentLine=70975492;
 //BA.debugLineNum = 70975492;BA.debugLine="TextField1.TextColor = xui.Color_White";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=70975494;
 //BA.debugLineNum = 70975494;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=70975495;
 //BA.debugLineNum = 70975495;BA.debugLine="Dim jo As JavaObject = TextField1";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=70975496;
 //BA.debugLineNum = 70975496;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(335544";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(__c.Bit.Or((int) (33554432),(int) (6)))});
RDebugUtils.currentLine=70975498;
 //BA.debugLineNum = 70975498;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=70975499;
 //BA.debugLineNum = 70975499;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
_jo.RunMethod("RemoveWarning",(Object[])(__c.Null));
RDebugUtils.currentLine=70975502;
 //BA.debugLineNum = 70975502;BA.debugLine="SetBorder(BorderColor)";
__ref._setborder /*String*/ (null,__ref._bordercolor /*int*/ );
RDebugUtils.currentLine=70975503;
 //BA.debugLineNum = 70975503;BA.debugLine="End Sub";
return "";
}
public String  _setborder(b4a.example.ef.b4xinputtemplate __ref,int _bc) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_bc}));}
RDebugUtils.currentLine=71303168;
 //BA.debugLineNum = 71303168;BA.debugLine="Private Sub SetBorder(bc As Int)";
RDebugUtils.currentLine=71303169;
 //BA.debugLineNum = 71303169;BA.debugLine="TextField1.SetColorAndBorder(xui.Color_Transparen";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_bc,__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=71303170;
 //BA.debugLineNum = 71303170;BA.debugLine="End Sub";
return "";
}
public boolean  _isvalid(b4a.example.ef.b4xinputtemplate __ref,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "isvalid", true))
	 {return ((Boolean) Debug.delegate(ba, "isvalid", new Object[] {_new}));}
RDebugUtils.currentLine=71368704;
 //BA.debugLineNum = 71368704;BA.debugLine="Private Sub IsValid(New As String) As Boolean";
RDebugUtils.currentLine=71368705;
 //BA.debugLineNum = 71368705;BA.debugLine="Return RegexPattern = \"\" Or Regex.IsMatch(RegexPa";
if (true) return (__ref._regexpattern /*String*/ ).equals("") || __c.Regex.IsMatch(__ref._regexpattern /*String*/ ,_new);
RDebugUtils.currentLine=71368706;
 //BA.debugLineNum = 71368706;BA.debugLine="End Sub";
return false;
}
public String  _setbordercolor(b4a.example.ef.b4xinputtemplate __ref,int _valid,int _invalid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "setbordercolor", true))
	 {return ((String) Debug.delegate(ba, "setbordercolor", new Object[] {_valid,_invalid}));}
RDebugUtils.currentLine=71041024;
 //BA.debugLineNum = 71041024;BA.debugLine="Public Sub SetBorderColor(Valid As Int, Invalid As";
RDebugUtils.currentLine=71041025;
 //BA.debugLineNum = 71041025;BA.debugLine="BorderColor = Valid";
__ref._bordercolor /*int*/  = _valid;
RDebugUtils.currentLine=71041026;
 //BA.debugLineNum = 71041026;BA.debugLine="BorderColorInvalid = Invalid";
__ref._bordercolorinvalid /*int*/  = _invalid;
RDebugUtils.currentLine=71041027;
 //BA.debugLineNum = 71041027;BA.debugLine="SetBorder(BorderColor)";
__ref._setborder /*String*/ (null,__ref._bordercolor /*int*/ );
RDebugUtils.currentLine=71041028;
 //BA.debugLineNum = 71041028;BA.debugLine="End Sub";
return "";
}
public String  _validate(b4a.example.ef.b4xinputtemplate __ref,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "validate", true))
	 {return ((String) Debug.delegate(ba, "validate", new Object[] {_new}));}
int _bc = 0;
boolean _enabled = false;
RDebugUtils.currentLine=71237632;
 //BA.debugLineNum = 71237632;BA.debugLine="Private Sub Validate (New As String)";
RDebugUtils.currentLine=71237633;
 //BA.debugLineNum = 71237633;BA.debugLine="Dim bc As Int = BorderColor";
_bc = __ref._bordercolor /*int*/ ;
RDebugUtils.currentLine=71237634;
 //BA.debugLineNum = 71237634;BA.debugLine="Dim enabled As Boolean = True";
_enabled = __c.True;
RDebugUtils.currentLine=71237635;
 //BA.debugLineNum = 71237635;BA.debugLine="If IsValid(New) = False Then";
if (__ref._isvalid /*boolean*/ (null,_new)==__c.False) { 
RDebugUtils.currentLine=71237636;
 //BA.debugLineNum = 71237636;BA.debugLine="If New.Length > 0 Then";
if (_new.length()>0) { 
RDebugUtils.currentLine=71237637;
 //BA.debugLineNum = 71237637;BA.debugLine="bc = BorderColorInvalid";
_bc = __ref._bordercolorinvalid /*int*/ ;
 };
RDebugUtils.currentLine=71237639;
 //BA.debugLineNum = 71237639;BA.debugLine="enabled = False";
_enabled = __c.False;
 };
RDebugUtils.currentLine=71237641;
 //BA.debugLineNum = 71237641;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
__ref._xdialog /*b4a.example.ef.b4xdialog*/ ._setbuttonstate /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,_enabled);
RDebugUtils.currentLine=71237642;
 //BA.debugLineNum = 71237642;BA.debugLine="SetBorder(bc)";
__ref._setborder /*String*/ (null,_bc);
RDebugUtils.currentLine=71237643;
 //BA.debugLineNum = 71237643;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_action(b4a.example.ef.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_action", true))
	 {return ((String) Debug.delegate(ba, "textfield1_action", null));}
RDebugUtils.currentLine=71434240;
 //BA.debugLineNum = 71434240;BA.debugLine="Private Sub TextField1_Action";
RDebugUtils.currentLine=71434241;
 //BA.debugLineNum = 71434241;BA.debugLine="TextField1_EnterPressed";
__ref._textfield1_enterpressed /*String*/ (null);
RDebugUtils.currentLine=71434242;
 //BA.debugLineNum = 71434242;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_enterpressed(b4a.example.ef.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "textfield1_enterpressed", null));}
RDebugUtils.currentLine=71499776;
 //BA.debugLineNum = 71499776;BA.debugLine="Private Sub TextField1_EnterPressed";
RDebugUtils.currentLine=71499777;
 //BA.debugLineNum = 71499777;BA.debugLine="If IsValid(TextField1.Text) Then xDialog.Close(xu";
if (__ref._isvalid /*boolean*/ (null,__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText())) { 
__ref._xdialog /*b4a.example.ef.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);};
RDebugUtils.currentLine=71499778;
 //BA.debugLineNum = 71499778;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_textchanged(b4a.example.ef.b4xinputtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_textchanged", true))
	 {return ((String) Debug.delegate(ba, "textfield1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=71172096;
 //BA.debugLineNum = 71172096;BA.debugLine="Private Sub TextField1_TextChanged (Old As String,";
RDebugUtils.currentLine=71172108;
 //BA.debugLineNum = 71172108;BA.debugLine="Validate (New)";
__ref._validate /*String*/ (null,_new);
RDebugUtils.currentLine=71172109;
 //BA.debugLineNum = 71172109;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("textfield1_textchanged");
}
}