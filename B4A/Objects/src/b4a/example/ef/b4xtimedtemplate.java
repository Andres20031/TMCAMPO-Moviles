package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xtimedtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xtimedtemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xtimedtemplate.class).invoke(this, new Object[] {null});
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
public b4a.example.ef.anotherprogressbar _anotherprogressbar1 = null;
public Object _mtemplate = null;
public int _timeoutmilliseconds = 0;
public int _index = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.ef.b4xtimedtemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
anywheresoftware.b4a.objects.B4XViewWrapper _innerpanel = null;
RDebugUtils.currentLine=80871424;
 //BA.debugLineNum = 80871424;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=80871425;
 //BA.debugLineNum = 80871425;BA.debugLine="If mBase.NumberOfViews = 0 Then";
if (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=80871426;
 //BA.debugLineNum = 80871426;BA.debugLine="Dim InnerPanel As B4XView = CallSub2(mTemplate,";
_innerpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_innerpanel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.CallSubDebug2(ba,__ref._mtemplate /*Object*/ ,"GetPanel",(Object)(_dialog))));
RDebugUtils.currentLine=80871427;
 //BA.debugLineNum = 80871427;BA.debugLine="If InnerPanel.Parent.IsInitialized Then InnerPan";
if (_innerpanel.getParent().IsInitialized()) { 
_innerpanel.RemoveViewFromParent();};
RDebugUtils.currentLine=80871428;
 //BA.debugLineNum = 80871428;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, InnerPanel.Widt";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_innerpanel.getWidth(),(int) (_innerpanel.getHeight()+__c.DipToCurrent((int) (19))));
RDebugUtils.currentLine=80871429;
 //BA.debugLineNum = 80871429;BA.debugLine="mBase.LoadLayout(\"TimedDialogTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("TimedDialogTemplate",ba);
RDebugUtils.currentLine=80871430;
 //BA.debugLineNum = 80871430;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=80871431;
 //BA.debugLineNum = 80871431;BA.debugLine="mBase.AddView(InnerPanel, 0, 19dip, InnerPanel.W";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_innerpanel.getObject()),(int) (0),__c.DipToCurrent((int) (19)),_innerpanel.getWidth(),_innerpanel.getHeight());
 };
RDebugUtils.currentLine=80871433;
 //BA.debugLineNum = 80871433;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=80871434;
 //BA.debugLineNum = 80871434;BA.debugLine="End Sub";
return null;
}
public void  _show(b4a.example.ef.b4xtimedtemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.ef.b4xtimedtemplate parent,b4a.example.ef.b4xtimedtemplate __ref,b4a.example.ef.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4a.example.ef.b4xtimedtemplate __ref;
b4a.example.ef.b4xtimedtemplate parent;
b4a.example.ef.b4xdialog _dialog;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtimedtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=80936961;
 //BA.debugLineNum = 80936961;BA.debugLine="CallSub2(mTemplate, \"Show\", Dialog)";
parent.__c.CallSubDebug2(ba,__ref._mtemplate /*Object*/ ,"Show",(Object)(_dialog));
RDebugUtils.currentLine=80936962;
 //BA.debugLineNum = 80936962;BA.debugLine="AnotherProgressBar1.SetValueNoAnimation(0)";
__ref._anotherprogressbar1 /*b4a.example.ef.anotherprogressbar*/ ._setvaluenoanimation /*String*/ (null,(int) (0));
RDebugUtils.currentLine=80936963;
 //BA.debugLineNum = 80936963;BA.debugLine="AnotherProgressBar1.ValueChangePerSecond = 100 /";
__ref._anotherprogressbar1 /*b4a.example.ef.anotherprogressbar*/ ._valuechangepersecond /*float*/  = (float) (100/(double)(__ref._timeoutmilliseconds /*int*/ /(double)1000));
RDebugUtils.currentLine=80936964;
 //BA.debugLineNum = 80936964;BA.debugLine="AnotherProgressBar1.Value = 100";
__ref._anotherprogressbar1 /*b4a.example.ef.anotherprogressbar*/ ._setvalue /*int*/ (null,(int) (100));
RDebugUtils.currentLine=80936965;
 //BA.debugLineNum = 80936965;BA.debugLine="Index = Index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=80936966;
 //BA.debugLineNum = 80936966;BA.debugLine="Dim MyIndex As Int = Index";
_myindex = __ref._index /*int*/ ;
RDebugUtils.currentLine=80936967;
 //BA.debugLineNum = 80936967;BA.debugLine="Sleep(TimeoutMilliseconds)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtimedtemplate", "show"),__ref._timeoutmilliseconds /*int*/ );
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=80936968;
 //BA.debugLineNum = 80936968;BA.debugLine="If MyIndex = Index Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_myindex==__ref._index /*int*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=80936969;
 //BA.debugLineNum = 80936969;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
_dialog._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=80936971;
 //BA.debugLineNum = 80936971;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4a.example.ef.b4xtimedtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=81002496;
 //BA.debugLineNum = 81002496;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=81002497;
 //BA.debugLineNum = 81002497;BA.debugLine="Index = Index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=81002498;
 //BA.debugLineNum = 81002498;BA.debugLine="CallSub2(mTemplate, \"DialogClosed\", Result)";
__c.CallSubDebug2(ba,__ref._mtemplate /*Object*/ ,"DialogClosed",(Object)(_result));
RDebugUtils.currentLine=81002499;
 //BA.debugLineNum = 81002499;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xtimedtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtimedtemplate";
RDebugUtils.currentLine=80740352;
 //BA.debugLineNum = 80740352;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=80740353;
 //BA.debugLineNum = 80740353;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=80740354;
 //BA.debugLineNum = 80740354;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=80740355;
 //BA.debugLineNum = 80740355;BA.debugLine="Private AnotherProgressBar1 As AnotherProgressBar";
_anotherprogressbar1 = new b4a.example.ef.anotherprogressbar();
RDebugUtils.currentLine=80740356;
 //BA.debugLineNum = 80740356;BA.debugLine="Private mTemplate As Object";
_mtemplate = new Object();
RDebugUtils.currentLine=80740357;
 //BA.debugLineNum = 80740357;BA.debugLine="Public TimeoutMilliseconds As Int = 10000";
_timeoutmilliseconds = (int) (10000);
RDebugUtils.currentLine=80740358;
 //BA.debugLineNum = 80740358;BA.debugLine="Private Index As Int";
_index = 0;
RDebugUtils.currentLine=80740359;
 //BA.debugLineNum = 80740359;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xtimedtemplate __ref,anywheresoftware.b4a.BA _ba,Object _innertemplate) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_innertemplate}));}
RDebugUtils.currentLine=80805888;
 //BA.debugLineNum = 80805888;BA.debugLine="Public Sub Initialize (InnerTemplate As Object)";
RDebugUtils.currentLine=80805889;
 //BA.debugLineNum = 80805889;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=80805890;
 //BA.debugLineNum = 80805890;BA.debugLine="mTemplate = InnerTemplate";
__ref._mtemplate /*Object*/  = _innertemplate;
RDebugUtils.currentLine=80805892;
 //BA.debugLineNum = 80805892;BA.debugLine="End Sub";
return "";
}
}