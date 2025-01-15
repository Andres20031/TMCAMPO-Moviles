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
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4a.example.ef.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=44302337;
 //BA.debugLineNum = 44302337;BA.debugLine="Type B4XCacheItem (Value As Object, LastAccessedT";
;
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="Private Data As B4XOrderedMap";
_data = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=44302339;
 //BA.debugLineNum = 44302339;BA.debugLine="Private mMaxSize As Int = 100";
_mmaxsize = (int) (100);
RDebugUtils.currentLine=44302340;
 //BA.debugLineNum = 44302340;BA.debugLine="Private RemoveThreshold As Float = 0.3";
_removethreshold = (float) (0.3);
RDebugUtils.currentLine=44302341;
 //BA.debugLineNum = 44302341;BA.debugLine="Private EternalCounts As Int";
_eternalcounts = 0;
RDebugUtils.currentLine=44302342;
 //BA.debugLineNum = 44302342;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(b4a.example.ef.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=44892160;
 //BA.debugLineNum = 44892160;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="Return Data.ContainsKey(Key)";
if (true) return __ref._data /*b4a.example.ef.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_key));
RDebugUtils.currentLine=44892162;
 //BA.debugLineNum = 44892162;BA.debugLine="End Sub";
return false;
}
public b4a.example.ef.b4xcache._b4xcacheitem  _createb4xcacheitem(b4a.example.ef.b4xcache __ref,Object _value,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "createb4xcacheitem", true))
	 {return ((b4a.example.ef.b4xcache._b4xcacheitem) Debug.delegate(ba, "createb4xcacheitem", new Object[] {_value,_key}));}
b4a.example.ef.b4xcache._b4xcacheitem _t1 = null;
RDebugUtils.currentLine=45219840;
 //BA.debugLineNum = 45219840;BA.debugLine="Private Sub CreateB4XCacheItem (Value As Object, K";
RDebugUtils.currentLine=45219841;
 //BA.debugLineNum = 45219841;BA.debugLine="Dim t1 As B4XCacheItem";
_t1 = new b4a.example.ef.b4xcache._b4xcacheitem();
RDebugUtils.currentLine=45219842;
 //BA.debugLineNum = 45219842;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=45219843;
 //BA.debugLineNum = 45219843;BA.debugLine="t1.Value = Value";
_t1.Value /*Object*/  = _value;
RDebugUtils.currentLine=45219844;
 //BA.debugLineNum = 45219844;BA.debugLine="t1.LastAccessedTime = DateTime.Now";
_t1.LastAccessedTime /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=45219845;
 //BA.debugLineNum = 45219845;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=45219846;
 //BA.debugLineNum = 45219846;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=45219847;
 //BA.debugLineNum = 45219847;BA.debugLine="End Sub";
return null;
}
public Object  _get(b4a.example.ef.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
b4a.example.ef.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=44564480;
 //BA.debugLineNum = 44564480;BA.debugLine="Public Sub Get (Key As String) As Object";
RDebugUtils.currentLine=44564481;
 //BA.debugLineNum = 44564481;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4a.example.ef.b4xcache._b4xcacheitem)(__ref._data /*b4a.example.ef.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=44564482;
 //BA.debugLineNum = 44564482;BA.debugLine="If ci <> Null Then";
if (_ci!= null) { 
RDebugUtils.currentLine=44564483;
 //BA.debugLineNum = 44564483;BA.debugLine="If ci.Eternal = False Then ci.LastAccessedTime =";
if (_ci.Eternal /*boolean*/ ==__c.False) { 
_ci.LastAccessedTime /*long*/  = __c.DateTime.getNow();};
RDebugUtils.currentLine=44564484;
 //BA.debugLineNum = 44564484;BA.debugLine="Return ci.Value";
if (true) return _ci.Value /*Object*/ ;
 };
RDebugUtils.currentLine=44564486;
 //BA.debugLineNum = 44564486;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=44564487;
 //BA.debugLineNum = 44564487;BA.debugLine="End Sub";
return null;
}
public int  _getmaxsize(b4a.example.ef.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "getmaxsize", true))
	 {return ((Integer) Debug.delegate(ba, "getmaxsize", null));}
RDebugUtils.currentLine=44498944;
 //BA.debugLineNum = 44498944;BA.debugLine="Public Sub getMaxSize As Int";
RDebugUtils.currentLine=44498945;
 //BA.debugLineNum = 44498945;BA.debugLine="Return mMaxSize";
if (true) return __ref._mmaxsize /*int*/ ;
RDebugUtils.currentLine=44498946;
 //BA.debugLineNum = 44498946;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.ef.b4xcache __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=44367872;
 //BA.debugLineNum = 44367872;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=44367873;
 //BA.debugLineNum = 44367873;BA.debugLine="Data.Initialize";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=44367874;
 //BA.debugLineNum = 44367874;BA.debugLine="End Sub";
return "";
}
public boolean  _iseternal(b4a.example.ef.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "iseternal", true))
	 {return ((Boolean) Debug.delegate(ba, "iseternal", new Object[] {_key}));}
b4a.example.ef.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="Private Sub IsEternal(Key As String) As Boolean";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4a.example.ef.b4xcache._b4xcacheitem)(__ref._data /*b4a.example.ef.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=44826626;
 //BA.debugLineNum = 44826626;BA.debugLine="Return IIf(ci = Null, False, ci.Eternal)";
if (true) return BA.ObjectToBoolean(((_ci== null) ? ((Object)(__c.False)) : ((Object)(_ci.Eternal /*boolean*/ ))));
RDebugUtils.currentLine=44826627;
 //BA.debugLineNum = 44826627;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _keys(b4a.example.ef.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "keys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "keys", null));}
RDebugUtils.currentLine=45154304;
 //BA.debugLineNum = 45154304;BA.debugLine="Public Sub Keys As List";
RDebugUtils.currentLine=45154305;
 //BA.debugLineNum = 45154305;BA.debugLine="Return Data.Keys";
if (true) return __ref._data /*b4a.example.ef.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=45154306;
 //BA.debugLineNum = 45154306;BA.debugLine="End Sub";
return null;
}
public Object  _put(b4a.example.ef.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((Object) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=44630016;
 //BA.debugLineNum = 44630016;BA.debugLine="Public Sub Put (Key As String, Value As Object) As";
RDebugUtils.currentLine=44630017;
 //BA.debugLineNum = 44630017;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=44630018;
 //BA.debugLineNum = 44630018;BA.debugLine="Data.Put(Key, CreateB4XCacheItem(Value, Key))";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(__ref._createb4xcacheitem /*b4a.example.ef.b4xcache._b4xcacheitem*/ (null,_value,_key)));
RDebugUtils.currentLine=44630019;
 //BA.debugLineNum = 44630019;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=44630020;
 //BA.debugLineNum = 44630020;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=44630021;
 //BA.debugLineNum = 44630021;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=44957696;
 //BA.debugLineNum = 44957696;BA.debugLine="Private Sub TrimIfOversize";
RDebugUtils.currentLine=44957697;
 //BA.debugLineNum = 44957697;BA.debugLine="If Data.Size - EternalCounts > mMaxSize Then";
if (__ref._data /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null)-__ref._eternalcounts /*int*/ >__ref._mmaxsize /*int*/ ) { 
RDebugUtils.currentLine=44957698;
 //BA.debugLineNum = 44957698;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4a.example.ef.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=44957699;
 //BA.debugLineNum = 44957699;BA.debugLine="values.SortType(\"LastAccessedTime\", True)";
_values.SortType("LastAccessedTime",__c.True);
RDebugUtils.currentLine=44957700;
 //BA.debugLineNum = 44957700;BA.debugLine="Dim NumberOfItemsToRemove As Int = Ceil(mMaxSize";
_numberofitemstoremove = (int) (__c.Ceil(__ref._mmaxsize /*int*/ *__ref._removethreshold /*float*/ ));
RDebugUtils.currentLine=44957701;
 //BA.debugLineNum = 44957701;BA.debugLine="For i = 0 To NumberOfItemsToRemove";
{
final int step5 = 1;
final int limit5 = _numberofitemstoremove;
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=44957702;
 //BA.debugLineNum = 44957702;BA.debugLine="Data.Remove(values.Get(i).As(B4XCacheItem).Key)";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(((b4a.example.ef.b4xcache._b4xcacheitem)(_values.Get(_i))).Key /*String*/ ));
 }
};
 };
RDebugUtils.currentLine=44957705;
 //BA.debugLineNum = 44957705;BA.debugLine="End Sub";
return "";
}
public Object  _puteternal(b4a.example.ef.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "puteternal", true))
	 {return ((Object) Debug.delegate(ba, "puteternal", new Object[] {_key,_value}));}
b4a.example.ef.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=44695552;
 //BA.debugLineNum = 44695552;BA.debugLine="Public Sub PutEternal (Key As String, Value As Obj";
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=44695554;
 //BA.debugLineNum = 44695554;BA.debugLine="Dim ci As B4XCacheItem = CreateB4XCacheItem(Value";
_ci = __ref._createb4xcacheitem /*b4a.example.ef.b4xcache._b4xcacheitem*/ (null,_value,_key);
RDebugUtils.currentLine=44695555;
 //BA.debugLineNum = 44695555;BA.debugLine="ci.Eternal = True";
_ci.Eternal /*boolean*/  = __c.True;
RDebugUtils.currentLine=44695556;
 //BA.debugLineNum = 44695556;BA.debugLine="ci.LastAccessedTime = 9223372036854775807";
_ci.LastAccessedTime /*long*/  = (long) (9223372036854775807L);
RDebugUtils.currentLine=44695557;
 //BA.debugLineNum = 44695557;BA.debugLine="EternalCounts = EternalCounts + 1";
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ +1);
RDebugUtils.currentLine=44695558;
 //BA.debugLineNum = 44695558;BA.debugLine="Data.Put(Key, ci)";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(_ci));
RDebugUtils.currentLine=44695559;
 //BA.debugLineNum = 44695559;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=44695560;
 //BA.debugLineNum = 44695560;BA.debugLine="End Sub";
return null;
}
public String  _remove(b4a.example.ef.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=44761088;
 //BA.debugLineNum = 44761088;BA.debugLine="Public Sub Remove (Key As String)";
RDebugUtils.currentLine=44761089;
 //BA.debugLineNum = 44761089;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=44761090;
 //BA.debugLineNum = 44761090;BA.debugLine="Data.Remove(Key)";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_key));
RDebugUtils.currentLine=44761091;
 //BA.debugLineNum = 44761091;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45023232;
 //BA.debugLineNum = 45023232;BA.debugLine="Public Sub RemoveOldItems (AgeMs As Long)";
RDebugUtils.currentLine=45023233;
 //BA.debugLineNum = 45023233;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4a.example.ef.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=45023234;
 //BA.debugLineNum = 45023234;BA.debugLine="Dim level As Long = DateTime.Now - AgeMs";
_level = (long) (__c.DateTime.getNow()-_agems);
RDebugUtils.currentLine=45023235;
 //BA.debugLineNum = 45023235;BA.debugLine="For Each ci As B4XCacheItem In values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _values;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_ci = (b4a.example.ef.b4xcache._b4xcacheitem)(group3.Get(index3));
RDebugUtils.currentLine=45023236;
 //BA.debugLineNum = 45023236;BA.debugLine="If ci.LastAccessedTime <= level Then";
if (_ci.LastAccessedTime /*long*/ <=_level) { 
RDebugUtils.currentLine=45023237;
 //BA.debugLineNum = 45023237;BA.debugLine="Data.Remove(ci.Key)";
__ref._data /*b4a.example.ef.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_ci.Key /*String*/ ));
 };
 }
};
RDebugUtils.currentLine=45023240;
 //BA.debugLineNum = 45023240;BA.debugLine="End Sub";
return "";
}
public String  _setmaxsize(b4a.example.ef.b4xcache __ref,int _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "setmaxsize", true))
	 {return ((String) Debug.delegate(ba, "setmaxsize", new Object[] {_s}));}
RDebugUtils.currentLine=44433408;
 //BA.debugLineNum = 44433408;BA.debugLine="Public Sub setMaxSize(s As Int)";
RDebugUtils.currentLine=44433409;
 //BA.debugLineNum = 44433409;BA.debugLine="mMaxSize = s";
__ref._mmaxsize /*int*/  = _s;
RDebugUtils.currentLine=44433410;
 //BA.debugLineNum = 44433410;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=44433411;
 //BA.debugLineNum = 44433411;BA.debugLine="End Sub";
return "";
}
public int  _size(b4a.example.ef.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "size", true))
	 {return ((Integer) Debug.delegate(ba, "size", null));}
RDebugUtils.currentLine=45088768;
 //BA.debugLineNum = 45088768;BA.debugLine="Public Sub Size As Int";
RDebugUtils.currentLine=45088769;
 //BA.debugLineNum = 45088769;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=45088770;
 //BA.debugLineNum = 45088770;BA.debugLine="End Sub";
return 0;
}
}