package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xset");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xset.class).invoke(this, new Object[] {null});
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
public b4a.example.ef.b4xorderedmap _map = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.ef.b4xset __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="map.Initialize";
__ref._map /*b4a.example.ef.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="End Sub";
return "";
}
public String  _add(b4a.example.ef.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "add", true))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_value}));}
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Public Sub Add(Value As Object)";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="map.Put(Value, \"\")";
__ref._map /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,_value,(Object)(""));
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _aslist(b4a.example.ef.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "aslist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "aslist", null));}
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Public Sub AsList As List";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="Return map.Keys";
if (true) return __ref._map /*b4a.example.ef.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="Private map As B4XOrderedMap";
_map = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="map.Clear";
__ref._map /*b4a.example.ef.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="End Sub";
return "";
}
public boolean  _contains(b4a.example.ef.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "contains", true))
	 {return ((Boolean) Debug.delegate(ba, "contains", new Object[] {_value}));}
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Public Sub Contains (Value As Object) As Boolean";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="Return map.ContainsKey(Value)";
if (true) return __ref._map /*b4a.example.ef.b4xorderedmap*/ ._containskey /*boolean*/ (null,_value);
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="End Sub";
return false;
}
public int  _getsize(b4a.example.ef.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="Return map.Size";
if (true) return __ref._map /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="End Sub";
return 0;
}
public String  _remove(b4a.example.ef.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_value}));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Public Sub Remove(Value As Object)";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="map.Remove(Value)";
__ref._map /*b4a.example.ef.b4xorderedmap*/ ._remove /*String*/ (null,_value);
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="End Sub";
return "";
}
}