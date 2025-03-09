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
RDebugUtils.currentLine=45154304;
 //BA.debugLineNum = 45154304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=45154308;
 //BA.debugLineNum = 45154308;BA.debugLine="Private data() As Int";
_data = new int[(int) (0)];
;
RDebugUtils.currentLine=45154310;
 //BA.debugLineNum = 45154310;BA.debugLine="Private mSize As Int";
_msize = 0;
RDebugUtils.currentLine=45154311;
 //BA.debugLineNum = 45154311;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=45481984;
 //BA.debugLineNum = 45481984;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=45481988;
 //BA.debugLineNum = 45481988;BA.debugLine="Dim data(Bit.ShiftRight(mSize, 5) + 1) As Int";
_data = new int[(int) (__c.Bit.ShiftRight(__ref._msize /*int*/ ,(int) (5))+1)];
;
RDebugUtils.currentLine=45481990;
 //BA.debugLineNum = 45481990;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45350912;
 //BA.debugLineNum = 45350912;BA.debugLine="Public Sub Get(Index As Int) As Boolean";
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
RDebugUtils.currentLine=45350914;
 //BA.debugLineNum = 45350914;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And(((int)0x0000001f),_index);
RDebugUtils.currentLine=45350918;
 //BA.debugLineNum = 45350918;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = __ref._data /*int[]*/ [_dindex];
RDebugUtils.currentLine=45350920;
 //BA.debugLineNum = 45350920;BA.debugLine="Return Bit.And(BlockValue, Bit.ShiftLeft(1, offse";
if (true) return __c.Bit.And(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset))!=0;
RDebugUtils.currentLine=45350921;
 //BA.debugLineNum = 45350921;BA.debugLine="End Sub";
return false;
}
public int  _getsize(b4a.example.ef.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=45416449;
 //BA.debugLineNum = 45416449;BA.debugLine="Return mSize";
if (true) return __ref._msize /*int*/ ;
RDebugUtils.currentLine=45416450;
 //BA.debugLineNum = 45416450;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.ef.b4xbitset __ref,anywheresoftware.b4a.BA _ba,int _size) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_size}));}
RDebugUtils.currentLine=45219840;
 //BA.debugLineNum = 45219840;BA.debugLine="Public Sub Initialize (Size As Int)";
RDebugUtils.currentLine=45219841;
 //BA.debugLineNum = 45219841;BA.debugLine="mSize = Size";
__ref._msize /*int*/  = _size;
RDebugUtils.currentLine=45219842;
 //BA.debugLineNum = 45219842;BA.debugLine="Clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=45219843;
 //BA.debugLineNum = 45219843;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45285376;
 //BA.debugLineNum = 45285376;BA.debugLine="Public Sub Set(Index As Int, Value As Boolean)";
RDebugUtils.currentLine=45285377;
 //BA.debugLineNum = 45285377;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
RDebugUtils.currentLine=45285378;
 //BA.debugLineNum = 45285378;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And(((int)0x0000001f),_index);
RDebugUtils.currentLine=45285382;
 //BA.debugLineNum = 45285382;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = __ref._data /*int[]*/ [_dindex];
RDebugUtils.currentLine=45285384;
 //BA.debugLineNum = 45285384;BA.debugLine="Dim NewBlockValue As Int";
_newblockvalue = 0;
RDebugUtils.currentLine=45285385;
 //BA.debugLineNum = 45285385;BA.debugLine="If Value Then";
if (_value) { 
RDebugUtils.currentLine=45285386;
 //BA.debugLineNum = 45285386;BA.debugLine="NewBlockValue = Bit.Or(BlockValue, Bit.ShiftLeft";
_newblockvalue = __c.Bit.Or(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset));
 }else {
RDebugUtils.currentLine=45285388;
 //BA.debugLineNum = 45285388;BA.debugLine="NewBlockValue = Bit.And(BlockValue, Bit.Not(Bit.";
_newblockvalue = __c.Bit.And(_blockvalue,__c.Bit.Not(__c.Bit.ShiftLeft((int) (1),_offset)));
 };
RDebugUtils.currentLine=45285393;
 //BA.debugLineNum = 45285393;BA.debugLine="data(dindex) = NewBlockValue";
__ref._data /*int[]*/ [_dindex] = _newblockvalue;
RDebugUtils.currentLine=45285395;
 //BA.debugLineNum = 45285395;BA.debugLine="End Sub";
return "";
}
}