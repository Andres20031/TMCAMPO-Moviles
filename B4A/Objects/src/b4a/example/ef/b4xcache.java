package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcache extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xcache");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xcache.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xcacheitem{
public boolean IsInitialized;
public Object Value;
public long LastAccessedTime;
public String Key;
public boolean Eternal;
public void Initialize() {
IsInitialized = true;
Value = new Object();
LastAccessedTime = 0L;
Key = "";
Eternal = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.ef.b4xorderedmap _data = null;
public int _mmaxsize = 0;
public float _removethreshold = 0f;
public int _eternalcounts = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.ef.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
RDebugUtils.currentLine=43122688;
 //BA.debugLineNum = 43122688;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=43122689;
 //BA.debugLineNum = 43122689;BA.debugLine="Type B4XCacheItem (Value As Object, LastAccessedT";
;
RDebugUtils.currentLine=43122690;
 //BA.debugLineNum = 43122690;BA.debugLine="Private Data As B4XOrderedMap";
_data = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=43122691;
 //BA.debugLineNum = 43122691;BA.debugLine="Private mMaxSize As Int = 100";
_mmaxsize = (int) (100);
RDebugUtils.currentLine=43122692;
 //BA.debugLineNum = 43122692;BA.debugLine="Private RemoveThreshold As Float = 0.3";
_removethreshold = (float) (0.3);
RDebugUtils.currentLine=43122693;
 //BA.debugLineNum = 43122693;BA.debugLine="Private EternalCounts As Int";
_eternalcounts = 0;
RDebugUtils.currentLine=43122694;
 //BA.debugLineNum = 43122694;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(b4a.example.ef.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=43712512;
 //BA.debugLineNum = 43712512;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
RDebugUtils.currentLine=43712513;
 //BA.debugLineNum = 43712513;BA.debugLine="Return Data.ContainsKey(Key)";
if (true) return __ref._data /*b4a.example.ef.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_key));
RDebugUtils.currentLine=43712514;
 //BA.debugLineNum = 43712514;BA.debugLine="End Sub";
return false;
}
public b4a.example.ef.b4xcache._b4xcacheitem  _createb4xcacheitem(b4a.example.ef.b4xcache __ref,Object _value,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "createb4xcacheitem", true))
	 {return ((b4a.example.ef.b4xcache._b4xcacheitem) Debug.delegate(ba, "createb4xcacheitem", new Object[] {_value,_key}));}
b4a.example.ef.b4xcache._b4xcacheitem _t1 = null;
RDebugUtils.currentLine=44040192;
 //BA.debugLineNum = 44040192;BA.debugLine="Private Sub CreateB4XCacheItem (Value As Object, K";
RDebugUtils.currentLine=44040193;
 //BA.debugLineNum = 44040193;BA.debugLine="Dim t1 As B4XCacheItem";
_t1 = new b4a.example.ef.b4xcache._b4xcacheitem();
RDebugUtils.currentLine=44040194;
 //BA.debugLineNum = 44040194;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=44040195;
 //BA.debugLineNum = 44040195;BA.debugLine="t1.Value = Value";
_t1.Value /*Object*/  = _value;
RDebugUtils.currentLine=44040196;
 //BA.debugLineNum = 44040196;BA.debugLine="t1.LastAccessedTime = DateTime.Now";
_t1.LastAccessedTime /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=44040197;
 //BA.debugLineNum = 44040197;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=44040198;
 //BA.debugLineNum = 44040198;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=44040199;
 //BA.debugLineNum = 44040199;BA.debugLine="End Sub";
return null;
}
public Object  _get(b4a.example.ef.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
b4a.example.ef.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=43384832;
 //BA.debugLineNum = 43384832;BA.debugLine="Public Sub Get (Key As String) As Object";
RDebugUtils.currentLine=43384833;
 //BA.debugLineNum = 43384833;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4a.example.ef.b4xcache._b4xcacheitem)(__ref._data /*b4a.example.ef.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=43384834;
 //BA.debugLineNum = 43384834;BA.debugLine="If ci <> Null Then";
if (_ci!= null) { 
RDebugUtils.currentLine=43384835;
 //BA.debugLineNum = 43384835;BA.debugLine="If ci.Eternal = False Then ci.LastAccessedTime =";
if (_ci.Eternal /*boolean*/ ==__c.False) { 
_ci.LastAccessedTime /*long*/  = __c.DateTime.getNow();};
RDebugUtils.currentLine=43384836;
 //BA.debugLineNum = 43384836;BA.debugLine="Return ci.Value";
if (true) return _ci.Value /*Object*/ ;
 };
RDebugUtils.currentLine=43384838;
 //BA.debugLineNum = 43384838;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=43384839;
 //BA.debugLineNum = 43384839;BA.debugLine="End Sub";
return null;
}
public int  _getmaxsize(b4a.example.ef.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "getmaxsize", true))
	 {return ((Integer) Debug.delegate(ba, "getmaxsize", null));}
RDebugUtils.currentLine=43319296;
 //BA.debugLineNum = 43319296;BA.debugLine="Public Sub getMaxSize As Int";
RDebugUtils.currentLine=43319297;
 //BA.debugLineNum = 43319297;BA.debugLine="Return mMaxSize";
if (true) return __ref._mmaxsize /*int*/ ;
RDebugUtils.currentLine=43319298;
 //BA.debugLineNum = 43319298;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.ef.b4xcache __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=43188224;
 //BA.debugLineNum = 43188224;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=43188225;
 //BA.debugLineNum = 43188225;BA.debugLine="Data.Initialize";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=43188226;
 //BA.debugLineNum = 43188226;BA.debugLine="End Sub";
return "";
}
public boolean  _iseternal(b4a.example.ef.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "iseternal", true))
	 {return ((Boolean) Debug.delegate(ba, "iseternal", new Object[] {_key}));}
b4a.example.ef.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=43646976;
 //BA.debugLineNum = 43646976;BA.debugLine="Private Sub IsEternal(Key As String) As Boolean";
RDebugUtils.currentLine=43646977;
 //BA.debugLineNum = 43646977;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4a.example.ef.b4xcache._b4xcacheitem)(__ref._data /*b4a.example.ef.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=43646978;
 //BA.debugLineNum = 43646978;BA.debugLine="Return IIf(ci = Null, False, ci.Eternal)";
if (true) return BA.ObjectToBoolean(((_ci== null) ? ((Object)(__c.False)) : ((Object)(_ci.Eternal /*boolean*/ ))));
RDebugUtils.currentLine=43646979;
 //BA.debugLineNum = 43646979;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _keys(b4a.example.ef.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "keys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "keys", null));}
RDebugUtils.currentLine=43974656;
 //BA.debugLineNum = 43974656;BA.debugLine="Public Sub Keys As List";
RDebugUtils.currentLine=43974657;
 //BA.debugLineNum = 43974657;BA.debugLine="Return Data.Keys";
if (true) return __ref._data /*b4a.example.ef.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=43974658;
 //BA.debugLineNum = 43974658;BA.debugLine="End Sub";
return null;
}
public Object  _put(b4a.example.ef.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((Object) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=43450368;
 //BA.debugLineNum = 43450368;BA.debugLine="Public Sub Put (Key As String, Value As Object) As";
RDebugUtils.currentLine=43450369;
 //BA.debugLineNum = 43450369;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=43450370;
 //BA.debugLineNum = 43450370;BA.debugLine="Data.Put(Key, CreateB4XCacheItem(Value, Key))";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(__ref._createb4xcacheitem /*b4a.example.ef.b4xcache._b4xcacheitem*/ (null,_value,_key)));
RDebugUtils.currentLine=43450371;
 //BA.debugLineNum = 43450371;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=43450372;
 //BA.debugLineNum = 43450372;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=43450373;
 //BA.debugLineNum = 43450373;BA.debugLine="End Sub";
return null;
}
public String  _trimifoversize(b4a.example.ef.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "trimifoversize", true))
	 {return ((String) Debug.delegate(ba, "trimifoversize", null));}
anywheresoftware.b4a.objects.collections.List _values = null;
int _numberofitemstoremove = 0;
int _i = 0;
RDebugUtils.currentLine=43778048;
 //BA.debugLineNum = 43778048;BA.debugLine="Private Sub TrimIfOversize";
RDebugUtils.currentLine=43778049;
 //BA.debugLineNum = 43778049;BA.debugLine="If Data.Size - EternalCounts > mMaxSize Then";
if (__ref._data /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null)-__ref._eternalcounts /*int*/ >__ref._mmaxsize /*int*/ ) { 
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4a.example.ef.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=43778051;
 //BA.debugLineNum = 43778051;BA.debugLine="values.SortType(\"LastAccessedTime\", True)";
_values.SortType("LastAccessedTime",__c.True);
RDebugUtils.currentLine=43778052;
 //BA.debugLineNum = 43778052;BA.debugLine="Dim NumberOfItemsToRemove As Int = Ceil(mMaxSize";
_numberofitemstoremove = (int) (__c.Ceil(__ref._mmaxsize /*int*/ *__ref._removethreshold /*float*/ ));
RDebugUtils.currentLine=43778053;
 //BA.debugLineNum = 43778053;BA.debugLine="For i = 0 To NumberOfItemsToRemove";
{
final int step5 = 1;
final int limit5 = _numberofitemstoremove;
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=43778054;
 //BA.debugLineNum = 43778054;BA.debugLine="Data.Remove(values.Get(i).As(B4XCacheItem).Key)";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(((b4a.example.ef.b4xcache._b4xcacheitem)(_values.Get(_i))).Key /*String*/ ));
 }
};
 };
RDebugUtils.currentLine=43778057;
 //BA.debugLineNum = 43778057;BA.debugLine="End Sub";
return "";
}
public Object  _puteternal(b4a.example.ef.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "puteternal", true))
	 {return ((Object) Debug.delegate(ba, "puteternal", new Object[] {_key,_value}));}
b4a.example.ef.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=43515904;
 //BA.debugLineNum = 43515904;BA.debugLine="Public Sub PutEternal (Key As String, Value As Obj";
RDebugUtils.currentLine=43515905;
 //BA.debugLineNum = 43515905;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=43515906;
 //BA.debugLineNum = 43515906;BA.debugLine="Dim ci As B4XCacheItem = CreateB4XCacheItem(Value";
_ci = __ref._createb4xcacheitem /*b4a.example.ef.b4xcache._b4xcacheitem*/ (null,_value,_key);
RDebugUtils.currentLine=43515907;
 //BA.debugLineNum = 43515907;BA.debugLine="ci.Eternal = True";
_ci.Eternal /*boolean*/  = __c.True;
RDebugUtils.currentLine=43515908;
 //BA.debugLineNum = 43515908;BA.debugLine="ci.LastAccessedTime = 9223372036854775807";
_ci.LastAccessedTime /*long*/  = (long) (9223372036854775807L);
RDebugUtils.currentLine=43515909;
 //BA.debugLineNum = 43515909;BA.debugLine="EternalCounts = EternalCounts + 1";
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ +1);
RDebugUtils.currentLine=43515910;
 //BA.debugLineNum = 43515910;BA.debugLine="Data.Put(Key, ci)";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(_ci));
RDebugUtils.currentLine=43515911;
 //BA.debugLineNum = 43515911;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=43515912;
 //BA.debugLineNum = 43515912;BA.debugLine="End Sub";
return null;
}
public String  _remove(b4a.example.ef.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=43581440;
 //BA.debugLineNum = 43581440;BA.debugLine="Public Sub Remove (Key As String)";
RDebugUtils.currentLine=43581441;
 //BA.debugLineNum = 43581441;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=43581442;
 //BA.debugLineNum = 43581442;BA.debugLine="Data.Remove(Key)";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_key));
RDebugUtils.currentLine=43581443;
 //BA.debugLineNum = 43581443;BA.debugLine="End Sub";
return "";
}
public String  _removeolditems(b4a.example.ef.b4xcache __ref,long _agems) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "removeolditems", true))
	 {return ((String) Debug.delegate(ba, "removeolditems", new Object[] {_agems}));}
anywheresoftware.b4a.objects.collections.List _values = null;
long _level = 0L;
b4a.example.ef.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="Public Sub RemoveOldItems (AgeMs As Long)";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4a.example.ef.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="Dim level As Long = DateTime.Now - AgeMs";
_level = (long) (__c.DateTime.getNow()-_agems);
RDebugUtils.currentLine=43843587;
 //BA.debugLineNum = 43843587;BA.debugLine="For Each ci As B4XCacheItem In values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _values;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_ci = (b4a.example.ef.b4xcache._b4xcacheitem)(group3.Get(index3));
RDebugUtils.currentLine=43843588;
 //BA.debugLineNum = 43843588;BA.debugLine="If ci.LastAccessedTime <= level Then";
if (_ci.LastAccessedTime /*long*/ <=_level) { 
RDebugUtils.currentLine=43843589;
 //BA.debugLineNum = 43843589;BA.debugLine="Data.Remove(ci.Key)";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_ci.Key /*String*/ ));
 };
 }
};
RDebugUtils.currentLine=43843592;
 //BA.debugLineNum = 43843592;BA.debugLine="End Sub";
return "";
}
public String  _setmaxsize(b4a.example.ef.b4xcache __ref,int _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "setmaxsize", true))
	 {return ((String) Debug.delegate(ba, "setmaxsize", new Object[] {_s}));}
RDebugUtils.currentLine=43253760;
 //BA.debugLineNum = 43253760;BA.debugLine="Public Sub setMaxSize(s As Int)";
RDebugUtils.currentLine=43253761;
 //BA.debugLineNum = 43253761;BA.debugLine="mMaxSize = s";
__ref._mmaxsize /*int*/  = _s;
RDebugUtils.currentLine=43253762;
 //BA.debugLineNum = 43253762;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=43253763;
 //BA.debugLineNum = 43253763;BA.debugLine="End Sub";
return "";
}
public int  _size(b4a.example.ef.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "size", true))
	 {return ((Integer) Debug.delegate(ba, "size", null));}
RDebugUtils.currentLine=43909120;
 //BA.debugLineNum = 43909120;BA.debugLine="Public Sub Size As Int";
RDebugUtils.currentLine=43909121;
 //BA.debugLineNum = 43909121;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=43909122;
 //BA.debugLineNum = 43909122;BA.debugLine="End Sub";
return 0;
}
}