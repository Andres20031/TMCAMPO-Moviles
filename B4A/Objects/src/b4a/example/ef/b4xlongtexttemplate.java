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
RDebugUtils.currentLine=75825152;
 //BA.debugLineNum = 75825152;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=75825153;
 //BA.debugLineNum = 75825153;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=75825154;
 //BA.debugLineNum = 75825154;BA.debugLine="End Sub";
return null;
}
public String  _show(b4a.example.ef.b4xlongtexttemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog}));}
RDebugUtils.currentLine=75890688;
 //BA.debugLineNum = 75890688;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
RDebugUtils.currentLine=75890689;
 //BA.debugLineNum = 75890689;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=75890690;
 //BA.debugLineNum = 75890690;BA.debugLine="CustomListView1.AddTextItem(Text, \"\")";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._addtextitem(__ref._text /*Object*/ ,(Object)(""));
RDebugUtils.currentLine=75890691;
 //BA.debugLineNum = 75890691;BA.debugLine="CustomListView1.GetPanel(0).GetView(0).SetTextAli";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel((int) (0)).GetView((int) (0)).SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=75890692;
 //BA.debugLineNum = 75890692;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
_xuiviewsutils._addstubtoclvifneeded /*String*/ (ba,__ref._customlistview1 /*b4a.example3.customlistview*/ ,__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor);
RDebugUtils.currentLine=75890693;
 //BA.debugLineNum = 75890693;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4a.example.ef.b4xlongtexttemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=75956224;
 //BA.debugLineNum = 75956224;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=75956226;
 //BA.debugLineNum = 75956226;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xlongtexttemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
RDebugUtils.currentLine=75628544;
 //BA.debugLineNum = 75628544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=75628545;
 //BA.debugLineNum = 75628545;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=75628546;
 //BA.debugLineNum = 75628546;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=75628547;
 //BA.debugLineNum = 75628547;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=75628548;
 //BA.debugLineNum = 75628548;BA.debugLine="Public Text As Object";
_text = new Object();
RDebugUtils.currentLine=75628549;
 //BA.debugLineNum = 75628549;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xlongtexttemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=75694080;
 //BA.debugLineNum = 75694080;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=75694081;
 //BA.debugLineNum = 75694081;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=75694082;
 //BA.debugLineNum = 75694082;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=75694083;
 //BA.debugLineNum = 75694083;BA.debugLine="mBase.LoadLayout(\"LongTextTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("LongTextTemplate",ba);
RDebugUtils.currentLine=75694084;
 //BA.debugLineNum = 75694084;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=75694085;
 //BA.debugLineNum = 75694085;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=75694086;
 //BA.debugLineNum = 75694086;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=75694087;
 //BA.debugLineNum = 75694087;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=75694088;
 //BA.debugLineNum = 75694088;BA.debugLine="CustomListView1.sv.Color = 0xFF464646";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.setColor(((int)0xff464646));
RDebugUtils.currentLine=75694093;
 //BA.debugLineNum = 75694093;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.example.ef.b4xlongtexttemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=75759616;
 //BA.debugLineNum = 75759616;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=75759617;
 //BA.debugLineNum = 75759617;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=75759618;
 //BA.debugLineNum = 75759618;BA.debugLine="CustomListView1.AsView.SetLayoutAnimated(0, 0, 0,";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=75759619;
 //BA.debugLineNum = 75759619;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=75759620;
 //BA.debugLineNum = 75759620;BA.debugLine="End Sub";
return "";
}
}