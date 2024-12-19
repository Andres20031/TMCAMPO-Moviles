package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xbytesbuilder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xbytesbuilder");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xbytesbuilder.class).invoke(this, new Object[] {null});
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
public byte[] _mbuffer = null;
public int _mlength = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.b4xbytesbuilder  _append(b4a.example.ef.b4xbytesbuilder __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((b4a.example.ef.b4xbytesbuilder) Debug.delegate(ba, "append", new Object[] {_data}));}
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Public Sub Append(Data() As Byte) As B4XBytesBuild";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="Return Append2(Data, 0, Data.Length)";
if (true) return __ref._append2 /*b4a.example.ef.b4xbytesbuilder*/ (null,_data,(int) (0),_data.length);
RDebugUtils.currentLine=42205186;
 //BA.debugLineNum = 42205186;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.b4xbytesbuilder  _append2(b4a.example.ef.b4xbytesbuilder __ref,byte[] _data,int _startindex,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "append2", true))
	 {return ((b4a.example.ef.b4xbytesbuilder) Debug.delegate(ba, "append2", new Object[] {_data,_startindex,_length}));}
int _oldlength = 0;
RDebugUtils.currentLine=42270720;
 //BA.debugLineNum = 42270720;BA.debugLine="Public Sub Append2(Data() As Byte, StartIndex As I";
RDebugUtils.currentLine=42270721;
 //BA.debugLineNum = 42270721;BA.debugLine="Dim OldLength As Int = ChangeLength(mLength + Len";
_oldlength = __ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ +_length));
RDebugUtils.currentLine=42270722;
 //BA.debugLineNum = 42270722;BA.debugLine="Bit.ArrayCopy(Data, StartIndex, mBuffer, OldLengt";
__c.Bit.ArrayCopy((Object)(_data),_startindex,(Object)(__ref._mbuffer /*byte[]*/ ),_oldlength,_length);
RDebugUtils.currentLine=42270723;
 //BA.debugLineNum = 42270723;BA.debugLine="Return Me";
if (true) return (b4a.example.ef.b4xbytesbuilder)(this);
RDebugUtils.currentLine=42270724;
 //BA.debugLineNum = 42270724;BA.debugLine="End Sub";
return null;
}
public int  _changelength(b4a.example.ef.b4xbytesbuilder __ref,int _newlength) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "changelength", true))
	 {return ((Integer) Debug.delegate(ba, "changelength", new Object[] {_newlength}));}
int _oldlength = 0;
byte[] _b = null;
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Private Sub ChangeLength (NewLength As Int) As Int";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="Dim OldLength As Int = mLength";
_oldlength = __ref._mlength /*int*/ ;
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="mLength = NewLength";
__ref._mlength /*int*/  = _newlength;
RDebugUtils.currentLine=42139651;
 //BA.debugLineNum = 42139651;BA.debugLine="If mBuffer.Length < mLength Then";
if (__ref._mbuffer /*byte[]*/ .length<__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=42139652;
 //BA.debugLineNum = 42139652;BA.debugLine="Dim b(Max(mBuffer.Length * 2, NewLength)) As Byt";
_b = new byte[(int) (__c.Max(__ref._mbuffer /*byte[]*/ .length*2,_newlength))];
;
RDebugUtils.currentLine=42139653;
 //BA.debugLineNum = 42139653;BA.debugLine="Bit.ArrayCopy(mBuffer, 0, b, 0, mBuffer.Length)";
__c.Bit.ArrayCopy((Object)(__ref._mbuffer /*byte[]*/ ),(int) (0),(Object)(_b),(int) (0),__ref._mbuffer /*byte[]*/ .length);
RDebugUtils.currentLine=42139654;
 //BA.debugLineNum = 42139654;BA.debugLine="mBuffer = b";
__ref._mbuffer /*byte[]*/  = _b;
 };
RDebugUtils.currentLine=42139656;
 //BA.debugLineNum = 42139656;BA.debugLine="Return OldLength";
if (true) return _oldlength;
RDebugUtils.currentLine=42139657;
 //BA.debugLineNum = 42139657;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
RDebugUtils.currentLine=42008576;
 //BA.debugLineNum = 42008576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="Private mBuffer() As Byte";
_mbuffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="Private mLength As Int";
_mlength = 0;
RDebugUtils.currentLine=42008579;
 //BA.debugLineNum = 42008579;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="ChangeLength(0)";
__ref._changelength /*int*/ (null,(int) (0));
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="End Sub";
return "";
}
public byte[]  _getbuffer(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getbuffer", true))
	 {return ((byte[]) Debug.delegate(ba, "getbuffer", null));}
RDebugUtils.currentLine=42860544;
 //BA.debugLineNum = 42860544;BA.debugLine="Private Sub getBuffer As Byte() 'ignore";
RDebugUtils.currentLine=42860545;
 //BA.debugLineNum = 42860545;BA.debugLine="End Sub";
return null;
}
public byte[]  _getinternalbuffer(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getinternalbuffer", true))
	 {return ((byte[]) Debug.delegate(ba, "getinternalbuffer", null));}
RDebugUtils.currentLine=43057152;
 //BA.debugLineNum = 43057152;BA.debugLine="Public Sub getInternalBuffer As Byte()";
RDebugUtils.currentLine=43057153;
 //BA.debugLineNum = 43057153;BA.debugLine="Return mBuffer";
if (true) return __ref._mbuffer /*byte[]*/ ;
RDebugUtils.currentLine=43057154;
 //BA.debugLineNum = 43057154;BA.debugLine="End Sub";
return null;
}
public int  _getlength(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getlength", true))
	 {return ((Integer) Debug.delegate(ba, "getlength", null));}
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Public Sub getLength As Int";
RDebugUtils.currentLine=42729473;
 //BA.debugLineNum = 42729473;BA.debugLine="Return mLength";
if (true) return __ref._mlength /*int*/ ;
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(b4a.example.ef.b4xbytesbuilder __ref,byte[] _searchfor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_searchfor}));}
RDebugUtils.currentLine=42926080;
 //BA.debugLineNum = 42926080;BA.debugLine="Public Sub IndexOf(SearchFor() As Byte) As Int";
RDebugUtils.currentLine=42926081;
 //BA.debugLineNum = 42926081;BA.debugLine="Return IndexOf2(SearchFor, 0)";
if (true) return __ref._indexof2 /*int*/ (null,_searchfor,(int) (0));
RDebugUtils.currentLine=42926082;
 //BA.debugLineNum = 42926082;BA.debugLine="End Sub";
return 0;
}
public int  _indexof2(b4a.example.ef.b4xbytesbuilder __ref,byte[] _searchfor,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "indexof2", true))
	 {return ((Integer) Debug.delegate(ba, "indexof2", new Object[] {_searchfor,_index}));}
int _i1 = 0;
int _i2 = 0;
RDebugUtils.currentLine=42991616;
 //BA.debugLineNum = 42991616;BA.debugLine="Public Sub IndexOf2(SearchFor() As Byte, Index As";
RDebugUtils.currentLine=42991617;
 //BA.debugLineNum = 42991617;BA.debugLine="For i1 = Index To mLength - SearchFor.Length";
{
final int step1 = 1;
final int limit1 = (int) (__ref._mlength /*int*/ -_searchfor.length);
_i1 = _index ;
for (;_i1 <= limit1 ;_i1 = _i1 + step1 ) {
RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="For i2 = 0 To SearchFor.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_searchfor.length-1);
_i2 = (int) (0) ;
for (;_i2 <= limit2 ;_i2 = _i2 + step2 ) {
RDebugUtils.currentLine=42991619;
 //BA.debugLineNum = 42991619;BA.debugLine="If SearchFor(i2) <> mBuffer(i1 + i2) Then";
if (_searchfor[_i2]!=__ref._mbuffer /*byte[]*/ [(int) (_i1+_i2)]) { 
RDebugUtils.currentLine=42991620;
 //BA.debugLineNum = 42991620;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=42991623;
 //BA.debugLineNum = 42991623;BA.debugLine="If i2 = SearchFor.Length Then";
if (_i2==_searchfor.length) { 
RDebugUtils.currentLine=42991624;
 //BA.debugLineNum = 42991624;BA.debugLine="Return i1";
if (true) return _i1;
 };
 }
};
RDebugUtils.currentLine=42991627;
 //BA.debugLineNum = 42991627;BA.debugLine="Return -1";
if (true) return (int) (-1);
RDebugUtils.currentLine=42991628;
 //BA.debugLineNum = 42991628;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.ef.b4xbytesbuilder __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="Dim mBuffer(100) As Byte";
_mbuffer = new byte[(int) (100)];
;
RDebugUtils.currentLine=42074114;
 //BA.debugLineNum = 42074114;BA.debugLine="mLength = 0";
__ref._mlength /*int*/  = (int) (0);
RDebugUtils.currentLine=42074115;
 //BA.debugLineNum = 42074115;BA.debugLine="End Sub";
return "";
}
public String  _insert(b4a.example.ef.b4xbytesbuilder __ref,int _index,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "insert", true))
	 {return ((String) Debug.delegate(ba, "insert", new Object[] {_index,_data}));}
byte[] _afterindex = null;
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Public Sub Insert(Index As Int, Data() As Byte)";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="If Index >= mLength Then";
if (_index>=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>__ref._mlength /*int*/ ) { 
__c.LogImpl("942401794","Index too large",0);};
RDebugUtils.currentLine=42401795;
 //BA.debugLineNum = 42401795;BA.debugLine="Append(Data)";
__ref._append /*b4a.example.ef.b4xbytesbuilder*/ (null,_data);
 }else {
RDebugUtils.currentLine=42401797;
 //BA.debugLineNum = 42401797;BA.debugLine="Dim AfterIndex() As Byte = SubArray(Index)";
_afterindex = __ref._subarray /*byte[]*/ (null,_index);
RDebugUtils.currentLine=42401798;
 //BA.debugLineNum = 42401798;BA.debugLine="ChangeLength(mLength + Data.Length)";
__ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ +_data.length));
RDebugUtils.currentLine=42401799;
 //BA.debugLineNum = 42401799;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_index,_data.length);
RDebugUtils.currentLine=42401800;
 //BA.debugLineNum = 42401800;BA.debugLine="Bit.ArrayCopy(AfterIndex, 0, mBuffer, Index + Da";
__c.Bit.ArrayCopy((Object)(_afterindex),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),(int) (_index+_data.length),_afterindex.length);
 };
RDebugUtils.currentLine=42401802;
 //BA.debugLineNum = 42401802;BA.debugLine="End Sub";
return "";
}
public byte[]  _subarray(b4a.example.ef.b4xbytesbuilder __ref,int _beginindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "subarray", true))
	 {return ((byte[]) Debug.delegate(ba, "subarray", new Object[] {_beginindex}));}
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Public Sub SubArray(BeginIndex As Int) As Byte()";
RDebugUtils.currentLine=42598401;
 //BA.debugLineNum = 42598401;BA.debugLine="Return SubArray2(BeginIndex, mLength)";
if (true) return __ref._subarray2 /*byte[]*/ (null,_beginindex,__ref._mlength /*int*/ );
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="End Sub";
return null;
}
public byte[]  _remove(b4a.example.ef.b4xbytesbuilder __ref,int _beginindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((byte[]) Debug.delegate(ba, "remove", new Object[] {_beginindex,_endindex}));}
byte[] _res = null;
byte[] _afterendindex = null;
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Public Sub Remove(BeginIndex As Int, EndIndex As I";
RDebugUtils.currentLine=42532865;
 //BA.debugLineNum = 42532865;BA.debugLine="Dim res() As Byte = SubArray2(BeginIndex, EndInde";
_res = __ref._subarray2 /*byte[]*/ (null,_beginindex,_endindex);
RDebugUtils.currentLine=42532866;
 //BA.debugLineNum = 42532866;BA.debugLine="If EndIndex <= mLength Then";
if (_endindex<=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=42532867;
 //BA.debugLineNum = 42532867;BA.debugLine="Dim AfterEndIndex() As Byte = SubArray(EndIndex)";
_afterendindex = __ref._subarray /*byte[]*/ (null,_endindex);
RDebugUtils.currentLine=42532868;
 //BA.debugLineNum = 42532868;BA.debugLine="Bit.ArrayCopy(AfterEndIndex, 0, mBuffer, BeginIn";
__c.Bit.ArrayCopy((Object)(_afterendindex),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_beginindex,_afterendindex.length);
 };
RDebugUtils.currentLine=42532870;
 //BA.debugLineNum = 42532870;BA.debugLine="ChangeLength(mLength - (EndIndex - BeginIndex))";
__ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ -(_endindex-_beginindex)));
RDebugUtils.currentLine=42532871;
 //BA.debugLineNum = 42532871;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=42532872;
 //BA.debugLineNum = 42532872;BA.debugLine="End Sub";
return null;
}
public byte[]  _subarray2(b4a.example.ef.b4xbytesbuilder __ref,int _beginindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "subarray2", true))
	 {return ((byte[]) Debug.delegate(ba, "subarray2", new Object[] {_beginindex,_endindex}));}
byte[] _b = null;
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Public Sub SubArray2(BeginIndex As Int, EndIndex A";
RDebugUtils.currentLine=42663937;
 //BA.debugLineNum = 42663937;BA.debugLine="Dim b(EndIndex - BeginIndex) As Byte";
_b = new byte[(int) (_endindex-_beginindex)];
;
RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="Bit.ArrayCopy(mBuffer, BeginIndex, b, 0, b.Length";
__c.Bit.ArrayCopy((Object)(__ref._mbuffer /*byte[]*/ ),_beginindex,(Object)(_b),(int) (0),_b.length);
RDebugUtils.currentLine=42663939;
 //BA.debugLineNum = 42663939;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=42663940;
 //BA.debugLineNum = 42663940;BA.debugLine="End Sub";
return null;
}
public String  _set(b4a.example.ef.b4xbytesbuilder __ref,int _index,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_data}));}
RDebugUtils.currentLine=42467328;
 //BA.debugLineNum = 42467328;BA.debugLine="Public Sub Set(Index As Int, Data() As Byte)";
RDebugUtils.currentLine=42467329;
 //BA.debugLineNum = 42467329;BA.debugLine="If Index >= mLength Then";
if (_index>=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>__ref._mlength /*int*/ ) { 
__c.LogImpl("942467330","Index too large",0);};
RDebugUtils.currentLine=42467331;
 //BA.debugLineNum = 42467331;BA.debugLine="Append(Data)";
__ref._append /*b4a.example.ef.b4xbytesbuilder*/ (null,_data);
 }else {
RDebugUtils.currentLine=42467333;
 //BA.debugLineNum = 42467333;BA.debugLine="If Data.Length + Index > mLength Then";
if (_data.length+_index>__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=42467334;
 //BA.debugLineNum = 42467334;BA.debugLine="ChangeLength(Data.Length + Index)";
__ref._changelength /*int*/ (null,(int) (_data.length+_index));
 };
RDebugUtils.currentLine=42467336;
 //BA.debugLineNum = 42467336;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_index,_data.length);
 };
RDebugUtils.currentLine=42467338;
 //BA.debugLineNum = 42467338;BA.debugLine="End Sub";
return "";
}
public byte[]  _toarray(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "toarray", true))
	 {return ((byte[]) Debug.delegate(ba, "toarray", null));}
RDebugUtils.currentLine=42795008;
 //BA.debugLineNum = 42795008;BA.debugLine="Public Sub ToArray() As Byte()";
RDebugUtils.currentLine=42795009;
 //BA.debugLineNum = 42795009;BA.debugLine="Return SubArray(0)";
if (true) return __ref._subarray /*byte[]*/ (null,(int) (0));
RDebugUtils.currentLine=42795010;
 //BA.debugLineNum = 42795010;BA.debugLine="End Sub";
return null;
}
}