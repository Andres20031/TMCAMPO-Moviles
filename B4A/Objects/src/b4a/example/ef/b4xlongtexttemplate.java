package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xlongtexttemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xlongtexttemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xlongtexttemplate.class).invoke(this, new Object[] {null});
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
public b4a.example3.customlistview _customlistview1 = null;
public Object _text = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.ef.b4xlongtexttemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=72810496;
 //BA.debugLineNum = 72810496;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=72810497;
 //BA.debugLineNum = 72810497;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=72810498;
 //BA.debugLineNum = 72810498;BA.debugLine="End Sub";
return null;
}
public String  _show(b4a.example.ef.b4xlongtexttemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog}));}
RDebugUtils.currentLine=72876032;
 //BA.debugLineNum = 72876032;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
RDebugUtils.currentLine=72876033;
 //BA.debugLineNum = 72876033;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=72876034;
 //BA.debugLineNum = 72876034;BA.debugLine="CustomListView1.AddTextItem(Text, \"\")";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._addtextitem(__ref._text /*Object*/ ,(Object)(""));
RDebugUtils.currentLine=72876035;
 //BA.debugLineNum = 72876035;BA.debugLine="CustomListView1.GetPanel(0).GetView(0).SetTextAli";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel((int) (0)).GetView((int) (0)).SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=72876036;
 //BA.debugLineNum = 72876036;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
_xuiviewsutils._addstubtoclvifneeded /*String*/ (ba,__ref._customlistview1 /*b4a.example3.customlistview*/ ,__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor);
RDebugUtils.currentLine=72876037;
 //BA.debugLineNum = 72876037;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4a.example.ef.b4xlongtexttemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=72941568;
 //BA.debugLineNum = 72941568;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=72941570;
 //BA.debugLineNum = 72941570;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xlongtexttemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
RDebugUtils.currentLine=72613888;
 //BA.debugLineNum = 72613888;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=72613889;
 //BA.debugLineNum = 72613889;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=72613890;
 //BA.debugLineNum = 72613890;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=72613891;
 //BA.debugLineNum = 72613891;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=72613892;
 //BA.debugLineNum = 72613892;BA.debugLine="Public Text As Object";
_text = new Object();
RDebugUtils.currentLine=72613893;
 //BA.debugLineNum = 72613893;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xlongtexttemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=72679424;
 //BA.debugLineNum = 72679424;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=72679425;
 //BA.debugLineNum = 72679425;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=72679426;
 //BA.debugLineNum = 72679426;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=72679427;
 //BA.debugLineNum = 72679427;BA.debugLine="mBase.LoadLayout(\"LongTextTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("LongTextTemplate",ba);
RDebugUtils.currentLine=72679428;
 //BA.debugLineNum = 72679428;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=72679429;
 //BA.debugLineNum = 72679429;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=72679430;
 //BA.debugLineNum = 72679430;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=72679431;
 //BA.debugLineNum = 72679431;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=72679432;
 //BA.debugLineNum = 72679432;BA.debugLine="CustomListView1.sv.Color = 0xFF464646";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.setColor(((int)0xff464646));
RDebugUtils.currentLine=72679437;
 //BA.debugLineNum = 72679437;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.example.ef.b4xlongtexttemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=72744960;
 //BA.debugLineNum = 72744960;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=72744961;
 //BA.debugLineNum = 72744961;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=72744962;
 //BA.debugLineNum = 72744962;BA.debugLine="CustomListView1.AsView.SetLayoutAnimated(0, 0, 0,";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=72744963;
 //BA.debugLineNum = 72744963;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=72744964;
 //BA.debugLineNum = 72744964;BA.debugLine="End Sub";
return "";
}
}