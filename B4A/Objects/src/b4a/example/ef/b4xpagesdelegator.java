package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpagesdelegator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xpagesdelegator");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xpagesdelegator.class).invoke(this, new Object[] {null});
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
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _activity_actionbarhomeclick(b4a.example.ef.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "activity_actionbarhomeclick", true))
	 {return ((String) Debug.delegate(ba, "activity_actionbarhomeclick", null));}
RDebugUtils.currentLine=53870592;
 //BA.debugLineNum = 53870592;BA.debugLine="Public Sub Activity_ActionBarHomeClick";
RDebugUtils.currentLine=53870593;
 //BA.debugLineNum = 53870593;BA.debugLine="B4XPages.GetManager.Activity_ActionBarHomeClick";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (getActivityBA())._activity_actionbarhomeclick /*String*/ (null);
RDebugUtils.currentLine=53870594;
 //BA.debugLineNum = 53870594;BA.debugLine="End Sub";
return "";
}
public boolean  _activity_keypress(b4a.example.ef.b4xpagesdelegator __ref,int _keycode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "activity_keypress", true))
	 {return ((Boolean) Debug.delegate(ba, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=53739520;
 //BA.debugLineNum = 53739520;BA.debugLine="Public Sub Activity_KeyPress (KeyCode As Int) As B";
RDebugUtils.currentLine=53739521;
 //BA.debugLineNum = 53739521;BA.debugLine="Return B4XPages.GetManager.Activity_KeyPress (Key";
if (true) return _b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (getActivityBA())._activity_keypress /*boolean*/ (null,_keycode);
RDebugUtils.currentLine=53739522;
 //BA.debugLineNum = 53739522;BA.debugLine="End Sub";
return false;
}
public String  _activity_pause(b4a.example.ef.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
RDebugUtils.currentLine=54132736;
 //BA.debugLineNum = 54132736;BA.debugLine="Public Sub Activity_Pause";
RDebugUtils.currentLine=54132737;
 //BA.debugLineNum = 54132737;BA.debugLine="B4XPages.GetManager.Activity_Pause";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (getActivityBA())._activity_pause /*String*/ (null);
RDebugUtils.currentLine=54132738;
 //BA.debugLineNum = 54132738;BA.debugLine="End Sub";
return "";
}
public String  _activity_permissionresult(b4a.example.ef.b4xpagesdelegator __ref,String _permission,boolean _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "activity_permissionresult", true))
	 {return ((String) Debug.delegate(ba, "activity_permissionresult", new Object[] {_permission,_result}));}
RDebugUtils.currentLine=53805056;
 //BA.debugLineNum = 53805056;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
RDebugUtils.currentLine=53805057;
 //BA.debugLineNum = 53805057;BA.debugLine="B4XPages.GetManager.RaiseEvent(B4XPages.GetManage";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (getActivityBA())._raiseevent /*String*/ (null,_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (getActivityBA())._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_PermissionResult",new Object[]{(Object)(_permission),(Object)(_result)});
RDebugUtils.currentLine=53805058;
 //BA.debugLineNum = 53805058;BA.debugLine="End Sub";
return "";
}
public String  _activity_resume(b4a.example.ef.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "activity_resume", true))
	 {return ((String) Debug.delegate(ba, "activity_resume", null));}
RDebugUtils.currentLine=54067200;
 //BA.debugLineNum = 54067200;BA.debugLine="Public Sub Activity_Resume";
RDebugUtils.currentLine=54067201;
 //BA.debugLineNum = 54067201;BA.debugLine="B4XPages.GetManager.Activity_Resume";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (getActivityBA())._activity_resume /*String*/ (null);
RDebugUtils.currentLine=54067202;
 //BA.debugLineNum = 54067202;BA.debugLine="End Sub";
return "";
}
public String  _create_menu(b4a.example.ef.b4xpagesdelegator __ref,Object _menu) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "create_menu", true))
	 {return ((String) Debug.delegate(ba, "create_menu", new Object[] {_menu}));}
RDebugUtils.currentLine=53936128;
 //BA.debugLineNum = 53936128;BA.debugLine="Public Sub Create_Menu (Menu As Object)";
RDebugUtils.currentLine=53936129;
 //BA.debugLineNum = 53936129;BA.debugLine="B4XPages.GetManager.CreateMenu(Menu)";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (getActivityBA())._createmenu /*String*/ (null,_menu);
RDebugUtils.currentLine=53936130;
 //BA.debugLineNum = 53936130;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xpagesdelegator __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=53673984;
 //BA.debugLineNum = 53673984;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=53673986;
 //BA.debugLineNum = 53673986;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
RDebugUtils.currentLine=53608448;
 //BA.debugLineNum = 53608448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=53608449;
 //BA.debugLineNum = 53608449;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(b4a.example.ef.b4xpagesdelegator __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=54001664;
 //BA.debugLineNum = 54001664;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
RDebugUtils.currentLine=54001665;
 //BA.debugLineNum = 54001665;BA.debugLine="B4XPages.GetManager.MainForm_Resize(Width, Height";
_b4xpages._getmanager /*b4a.example.ef.b4xpagesmanager*/ (getActivityBA())._mainform_resize /*String*/ (null,_width,_height);
RDebugUtils.currentLine=54001666;
 //BA.debugLineNum = 54001666;BA.debugLine="End Sub";
return "";
}
}