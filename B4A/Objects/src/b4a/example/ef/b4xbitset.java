package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xbitset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xbitset");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xbitset.class).invoke(this, new Object[] {null});
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
public int[] _data = null;
public int _msize = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4a.example.ef.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=27459588;
 //BA.debugLineNum = 27459588;BA.debugLine="Private data() As Int";
_data = new int[(int) (0)];
;
RDebugUtils.currentLine=27459590;
 //BA.debugLineNum = 27459590;BA.debugLine="Private mSize As Int";
_msize = 0;
RDebugUtils.currentLine=27459591;
 //BA.debugLineNum = 27459591;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=27787268;
 //BA.debugLineNum = 27787268;BA.debugLine="Dim data(Bit.ShiftRight(mSize, 5) + 1) As Int";
_data = new int[(int) (__c.Bit.ShiftRight(__ref._msize /*int*/ ,(int) (5))+1)];
;
RDebugUtils.currentLine=27787270;
 //BA.debugLineNum = 27787270;BA.debugLine="End Sub";
return "";
}
public boolean  _get(b4a.example.ef.b4xbitset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Boolean) Debug.delegate(ba, "get", new Object[] {_index}));}
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Public Sub Get(Index As Int) As Boolean";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And(((int)0x0000001f),_index);
RDebugUtils.currentLine=27656198;
 //BA.debugLineNum = 27656198;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = __ref._data /*int[]*/ [_dindex];
RDebugUtils.currentLine=27656200;
 //BA.debugLineNum = 27656200;BA.debugLine="Return Bit.And(BlockValue, Bit.ShiftLeft(1, offse";
if (true) return __c.Bit.And(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset))!=0;
RDebugUtils.currentLine=27656201;
 //BA.debugLineNum = 27656201;BA.debugLine="End Sub";
return false;
}
public int  _getsize(b4a.example.ef.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="Return mSize";
if (true) return __ref._msize /*int*/ ;
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.ef.b4xbitset __ref,anywheresoftware.b4a.BA _ba,int _size) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_size}));}
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Public Sub Initialize (Size As Int)";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="mSize = Size";
__ref._msize /*int*/  = _size;
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="Clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=27525123;
 //BA.debugLineNum = 27525123;BA.debugLine="End Sub";
return "";
}
public String  _set(b4a.example.ef.b4xbitset __ref,int _index,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_value}));}
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
int _newblockvalue = 0;
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Public Sub Set(Index As Int, Value As Boolean)";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And(((int)0x0000001f),_index);
RDebugUtils.currentLine=27590662;
 //BA.debugLineNum = 27590662;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = __ref._data /*int[]*/ [_dindex];
RDebugUtils.currentLine=27590664;
 //BA.debugLineNum = 27590664;BA.debugLine="Dim NewBlockValue As Int";
_newblockvalue = 0;
RDebugUtils.currentLine=27590665;
 //BA.debugLineNum = 27590665;BA.debugLine="If Value Then";
if (_value) { 
RDebugUtils.currentLine=27590666;
 //BA.debugLineNum = 27590666;BA.debugLine="NewBlockValue = Bit.Or(BlockValue, Bit.ShiftLeft";
_newblockvalue = __c.Bit.Or(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset));
 }else {
RDebugUtils.currentLine=27590668;
 //BA.debugLineNum = 27590668;BA.debugLine="NewBlockValue = Bit.And(BlockValue, Bit.Not(Bit.";
_newblockvalue = __c.Bit.And(_blockvalue,__c.Bit.Not(__c.Bit.ShiftLeft((int) (1),_offset)));
 };
RDebugUtils.currentLine=27590673;
 //BA.debugLineNum = 27590673;BA.debugLine="data(dindex) = NewBlockValue";
__ref._data /*int[]*/ [_dindex] = _newblockvalue;
RDebugUtils.currentLine=27590675;
 //BA.debugLineNum = 27590675;BA.debugLine="End Sub";
return "";
}
}