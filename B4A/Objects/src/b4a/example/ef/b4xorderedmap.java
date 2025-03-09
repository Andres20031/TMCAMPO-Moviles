package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xorderedmap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xorderedmap");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xorderedmap.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _map = null;
public anywheresoftware.b4a.objects.collections.List _list = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.ef.b4xorderedmap __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=48496640;
 //BA.debugLineNum = 48496640;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=48496641;
 //BA.debugLineNum = 48496641;BA.debugLine="map.Initialize";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=48496642;
 //BA.debugLineNum = 48496642;BA.debugLine="list.Initialize";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=48496643;
 //BA.debugLineNum = 48496643;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(b4a.example.ef.b4xorderedmap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=48955392;
 //BA.debugLineNum = 48955392;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
RDebugUtils.currentLine=48955393;
 //BA.debugLineNum = 48955393;BA.debugLine="Return map.ContainsKey(Key)";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key);
RDebugUtils.currentLine=48955394;
 //BA.debugLineNum = 48955394;BA.debugLine="End Sub";
return false;
}
public Object  _get(b4a.example.ef.b4xorderedmap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
RDebugUtils.currentLine=48824320;
 //BA.debugLineNum = 48824320;BA.debugLine="Public Sub Get (Key As Object) As Object";
RDebugUtils.currentLine=48824321;
 //BA.debugLineNum = 48824321;BA.debugLine="Return map.Get(Key)";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_key);
RDebugUtils.currentLine=48824322;
 //BA.debugLineNum = 48824322;BA.debugLine="End Sub";
return null;
}
public String  _put(b4a.example.ef.b4xorderedmap __ref,Object _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((String) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=48562176;
 //BA.debugLineNum = 48562176;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
RDebugUtils.currentLine=48562177;
 //BA.debugLineNum = 48562177;BA.debugLine="If map.ContainsKey(Key) = False Then";
if (__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key)==__c.False) { 
RDebugUtils.currentLine=48562178;
 //BA.debugLineNum = 48562178;BA.debugLine="list.Add(Key)";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .Add(_key);
 };
RDebugUtils.currentLine=48562180;
 //BA.debugLineNum = 48562180;BA.debugLine="map.Put(Key, Value)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_key,_value);
RDebugUtils.currentLine=48562181;
 //BA.debugLineNum = 48562181;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getkeys(b4a.example.ef.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getkeys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getkeys", null));}
RDebugUtils.currentLine=48758784;
 //BA.debugLineNum = 48758784;BA.debugLine="Public Sub getKeys As List";
RDebugUtils.currentLine=48758785;
 //BA.debugLineNum = 48758785;BA.debugLine="Return list";
if (true) return __ref._list /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=48758786;
 //BA.debugLineNum = 48758786;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getvalues(b4a.example.ef.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getvalues", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getvalues", null));}
anywheresoftware.b4a.objects.collections.List _res = null;
Object _key = null;
RDebugUtils.currentLine=49086464;
 //BA.debugLineNum = 49086464;BA.debugLine="Public Sub getValues As List";
RDebugUtils.currentLine=49086465;
 //BA.debugLineNum = 49086465;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49086466;
 //BA.debugLineNum = 49086466;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=49086467;
 //BA.debugLineNum = 49086467;BA.debugLine="For Each key As Object In list";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._list /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = group3.Get(index3);
RDebugUtils.currentLine=49086468;
 //BA.debugLineNum = 49086468;BA.debugLine="res.Add(map.Get(key))";
_res.Add(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_key));
 }
};
RDebugUtils.currentLine=49086470;
 //BA.debugLineNum = 49086470;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=49086471;
 //BA.debugLineNum = 49086471;BA.debugLine="End Sub";
return null;
}
public String  _remove(b4a.example.ef.b4xorderedmap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=48627712;
 //BA.debugLineNum = 48627712;BA.debugLine="Public Sub Remove (Key As Object)";
RDebugUtils.currentLine=48627713;
 //BA.debugLineNum = 48627713;BA.debugLine="If map.ContainsKey(Key) = False Then Return";
if (__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=48627714;
 //BA.debugLineNum = 48627714;BA.debugLine="list.RemoveAt(list.IndexOf(Key))";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_key));
RDebugUtils.currentLine=48627715;
 //BA.debugLineNum = 48627715;BA.debugLine="map.Remove(Key)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Remove(_key);
RDebugUtils.currentLine=48627716;
 //BA.debugLineNum = 48627716;BA.debugLine="End Sub";
return "";
}
public int  _getsize(b4a.example.ef.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=49020928;
 //BA.debugLineNum = 49020928;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=49020929;
 //BA.debugLineNum = 49020929;BA.debugLine="Return map.Size";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=49020930;
 //BA.debugLineNum = 49020930;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.example.ef.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="Private map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="Private list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=48431107;
 //BA.debugLineNum = 48431107;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=48693248;
 //BA.debugLineNum = 48693248;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=48693249;
 //BA.debugLineNum = 48693249;BA.debugLine="list.Clear";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=48693250;
 //BA.debugLineNum = 48693250;BA.debugLine="map.Clear";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=48693251;
 //BA.debugLineNum = 48693251;BA.debugLine="End Sub";
return "";
}
public Object  _getdataforserializator(b4a.example.ef.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getdataforserializator", true))
	 {return ((Object) Debug.delegate(ba, "getdataforserializator", null));}
RDebugUtils.currentLine=49152000;
 //BA.debugLineNum = 49152000;BA.debugLine="Public Sub GetDataForSerializator As Object";
RDebugUtils.currentLine=49152001;
 //BA.debugLineNum = 49152001;BA.debugLine="Return Array(map, list)";
if (true) return (Object)(new Object[]{(Object)(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=49152002;
 //BA.debugLineNum = 49152002;BA.debugLine="End Sub";
return null;
}
public Object  _getdefault(b4a.example.ef.b4xorderedmap __ref,Object _key,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getdefault", true))
	 {return ((Object) Debug.delegate(ba, "getdefault", new Object[] {_key,_defaultvalue}));}
RDebugUtils.currentLine=48889856;
 //BA.debugLineNum = 48889856;BA.debugLine="Public Sub GetDefault (Key As Object, DefaultValue";
RDebugUtils.currentLine=48889857;
 //BA.debugLineNum = 48889857;BA.debugLine="Return map.GetDefault(Key, DefaultValue)";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault(_key,_defaultvalue);
RDebugUtils.currentLine=48889858;
 //BA.debugLineNum = 48889858;BA.debugLine="End Sub";
return null;
}
public String  _setdatafromserializator(b4a.example.ef.b4xorderedmap __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "setdatafromserializator", true))
	 {return ((String) Debug.delegate(ba, "setdatafromserializator", new Object[] {_data}));}
Object[] _o = null;
RDebugUtils.currentLine=49217536;
 //BA.debugLineNum = 49217536;BA.debugLine="Public Sub SetDataFromSerializator (Data As Object";
RDebugUtils.currentLine=49217537;
 //BA.debugLineNum = 49217537;BA.debugLine="Dim o() As Object = Data";
_o = (Object[])(_data);
RDebugUtils.currentLine=49217538;
 //BA.debugLineNum = 49217538;BA.debugLine="map = o(0)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_o[(int) (0)]));
RDebugUtils.currentLine=49217539;
 //BA.debugLineNum = 49217539;BA.debugLine="list = o(1)";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_o[(int) (1)]));
RDebugUtils.currentLine=49217540;
 //BA.debugLineNum = 49217540;BA.debugLine="End Sub";
return "";
}
}