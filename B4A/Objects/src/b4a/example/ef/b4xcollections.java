package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcollections {
private static b4xcollections mostCurrent = new b4xcollections();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static b4a.example.ef.b4xbitset  _createbitset(anywheresoftware.b4a.BA _ba,int _size) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createbitset", true))
	 {return ((b4a.example.ef.b4xbitset) Debug.delegate(null, "createbitset", new Object[] {_ba,_size}));}
b4a.example.ef.b4xbitset _s = null;
RDebugUtils.currentLine=50200576;
 //BA.debugLineNum = 50200576;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=50200577;
 //BA.debugLineNum = 50200577;BA.debugLine="Dim s As B4XBitSet";
_s = new b4a.example.ef.b4xbitset();
RDebugUtils.currentLine=50200578;
 //BA.debugLineNum = 50200578;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_size);
RDebugUtils.currentLine=50200579;
 //BA.debugLineNum = 50200579;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=50200580;
 //BA.debugLineNum = 50200580;BA.debugLine="End Sub";
return null;
}
public static b4a.example.ef.b4xorderedmap  _createorderedmap(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap", true))
	 {return ((b4a.example.ef.b4xorderedmap) Debug.delegate(null, "createorderedmap", new Object[] {_ba}));}
RDebugUtils.currentLine=50069504;
 //BA.debugLineNum = 50069504;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=50069505;
 //BA.debugLineNum = 50069505;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=50069506;
 //BA.debugLineNum = 50069506;BA.debugLine="End Sub";
return null;
}
public static b4a.example.ef.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap2", true))
	 {return ((b4a.example.ef.b4xorderedmap) Debug.delegate(null, "createorderedmap2", new Object[] {_ba,_keys,_values}));}
b4a.example.ef.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=50135040;
 //BA.debugLineNum = 50135040;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=50135041;
 //BA.debugLineNum = 50135041;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=50135042;
 //BA.debugLineNum = 50135042;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=50135043;
 //BA.debugLineNum = 50135043;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=50135044;
 //BA.debugLineNum = 50135044;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=50135045;
 //BA.debugLineNum = 50135045;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=50135048;
 //BA.debugLineNum = 50135048;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=50135049;
 //BA.debugLineNum = 50135049;BA.debugLine="End Sub";
return null;
}
public static b4a.example.ef.b4xset  _createset(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset", true))
	 {return ((b4a.example.ef.b4xset) Debug.delegate(null, "createset", new Object[] {_ba}));}
RDebugUtils.currentLine=49938432;
 //BA.debugLineNum = 49938432;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=49938433;
 //BA.debugLineNum = 49938433;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=49938434;
 //BA.debugLineNum = 49938434;BA.debugLine="End Sub";
return null;
}
public static b4a.example.ef.b4xset  _createset2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset2", true))
	 {return ((b4a.example.ef.b4xset) Debug.delegate(null, "createset2", new Object[] {_ba,_values}));}
b4a.example.ef.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=50003968;
 //BA.debugLineNum = 50003968;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=50003969;
 //BA.debugLineNum = 50003969;BA.debugLine="Dim s As B4XSet";
_s = new b4a.example.ef.b4xset();
RDebugUtils.currentLine=50003970;
 //BA.debugLineNum = 50003970;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=50003971;
 //BA.debugLineNum = 50003971;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=50003972;
 //BA.debugLineNum = 50003972;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=50003973;
 //BA.debugLineNum = 50003973;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=50003976;
 //BA.debugLineNum = 50003976;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=50003977;
 //BA.debugLineNum = 50003977;BA.debugLine="End Sub";
return null;
}
}