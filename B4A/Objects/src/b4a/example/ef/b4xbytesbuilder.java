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
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public b4a.example.ef.b4xbytesbuilder  _append(b4a.example.ef.b4xbytesbuilder __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((b4a.example.ef.b4xbytesbuilder) Debug.delegate(ba, "append", new Object[] {_data}));}
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Public Sub Append(Data() As Byte) As B4XBytesBuild";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="Return Append2(Data, 0, Data.Length)";
if (true) return __ref._append2 /*b4a.example.ef.b4xbytesbuilder*/ (null,_data,(int) (0),_data.length);
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.b4xbytesbuilder  _append2(b4a.example.ef.b4xbytesbuilder __ref,byte[] _data,int _startindex,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "append2", true))
	 {return ((b4a.example.ef.b4xbytesbuilder) Debug.delegate(ba, "append2", new Object[] {_data,_startindex,_length}));}
int _oldlength = 0;
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Public Sub Append2(Data() As Byte, StartIndex As I";
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="Dim OldLength As Int = ChangeLength(mLength + Len";
_oldlength = __ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ +_length));
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="Bit.ArrayCopy(Data, StartIndex, mBuffer, OldLengt";
__c.Bit.ArrayCopy((Object)(_data),_startindex,(Object)(__ref._mbuffer /*byte[]*/ ),_oldlength,_length);
RDebugUtils.currentLine=28114947;
 //BA.debugLineNum = 28114947;BA.debugLine="Return Me";
if (true) return (b4a.example.ef.b4xbytesbuilder)(this);
RDebugUtils.currentLine=28114948;
 //BA.debugLineNum = 28114948;BA.debugLine="End Sub";
return null;
}
public int  _changelength(b4a.example.ef.b4xbytesbuilder __ref,int _newlength) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "changelength", true))
	 {return ((Integer) Debug.delegate(ba, "changelength", new Object[] {_newlength}));}
int _oldlength = 0;
byte[] _b = null;
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Private Sub ChangeLength (NewLength As Int) As Int";
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="Dim OldLength As Int = mLength";
_oldlength = __ref._mlength /*int*/ ;
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="mLength = NewLength";
__ref._mlength /*int*/  = _newlength;
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="If mBuffer.Length < mLength Then";
if (__ref._mbuffer /*byte[]*/ .length<__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=27983876;
 //BA.debugLineNum = 27983876;BA.debugLine="Dim b(Max(mBuffer.Length * 2, NewLength)) As Byt";
_b = new byte[(int) (__c.Max(__ref._mbuffer /*byte[]*/ .length*2,_newlength))];
;
RDebugUtils.currentLine=27983877;
 //BA.debugLineNum = 27983877;BA.debugLine="Bit.ArrayCopy(mBuffer, 0, b, 0, mBuffer.Length)";
__c.Bit.ArrayCopy((Object)(__ref._mbuffer /*byte[]*/ ),(int) (0),(Object)(_b),(int) (0),__ref._mbuffer /*byte[]*/ .length);
RDebugUtils.currentLine=27983878;
 //BA.debugLineNum = 27983878;BA.debugLine="mBuffer = b";
__ref._mbuffer /*byte[]*/  = _b;
 };
RDebugUtils.currentLine=27983880;
 //BA.debugLineNum = 27983880;BA.debugLine="Return OldLength";
if (true) return _oldlength;
RDebugUtils.currentLine=27983881;
 //BA.debugLineNum = 27983881;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="Private mBuffer() As Byte";
_mbuffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="Private mLength As Int";
_mlength = 0;
RDebugUtils.currentLine=27852803;
 //BA.debugLineNum = 27852803;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="ChangeLength(0)";
__ref._changelength /*int*/ (null,(int) (0));
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="End Sub";
return "";
}
public byte[]  _getbuffer(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getbuffer", true))
	 {return ((byte[]) Debug.delegate(ba, "getbuffer", null));}
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Private Sub getBuffer As Byte() 'ignore";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="End Sub";
return null;
}
public byte[]  _getinternalbuffer(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getinternalbuffer", true))
	 {return ((byte[]) Debug.delegate(ba, "getinternalbuffer", null));}
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Public Sub getInternalBuffer As Byte()";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Return mBuffer";
if (true) return __ref._mbuffer /*byte[]*/ ;
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="End Sub";
return null;
}
public int  _getlength(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getlength", true))
	 {return ((Integer) Debug.delegate(ba, "getlength", null));}
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Public Sub getLength As Int";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="Return mLength";
if (true) return __ref._mlength /*int*/ ;
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(b4a.example.ef.b4xbytesbuilder __ref,byte[] _searchfor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_searchfor}));}
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Public Sub IndexOf(SearchFor() As Byte) As Int";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="Return IndexOf2(SearchFor, 0)";
if (true) return __ref._indexof2 /*int*/ (null,_searchfor,(int) (0));
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="End Sub";
return 0;
}
public int  _indexof2(b4a.example.ef.b4xbytesbuilder __ref,byte[] _searchfor,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "indexof2", true))
	 {return ((Integer) Debug.delegate(ba, "indexof2", new Object[] {_searchfor,_index}));}
int _i1 = 0;
int _i2 = 0;
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Public Sub IndexOf2(SearchFor() As Byte, Index As";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="For i1 = Index To mLength - SearchFor.Length";
{
final int step1 = 1;
final int limit1 = (int) (__ref._mlength /*int*/ -_searchfor.length);
_i1 = _index ;
for (;_i1 <= limit1 ;_i1 = _i1 + step1 ) {
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="For i2 = 0 To SearchFor.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_searchfor.length-1);
_i2 = (int) (0) ;
for (;_i2 <= limit2 ;_i2 = _i2 + step2 ) {
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="If SearchFor(i2) <> mBuffer(i1 + i2) Then";
if (_searchfor[_i2]!=__ref._mbuffer /*byte[]*/ [(int) (_i1+_i2)]) { 
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=28835847;
 //BA.debugLineNum = 28835847;BA.debugLine="If i2 = SearchFor.Length Then";
if (_i2==_searchfor.length) { 
RDebugUtils.currentLine=28835848;
 //BA.debugLineNum = 28835848;BA.debugLine="Return i1";
if (true) return _i1;
 };
 }
};
RDebugUtils.currentLine=28835851;
 //BA.debugLineNum = 28835851;BA.debugLine="Return -1";
if (true) return (int) (-1);
RDebugUtils.currentLine=28835852;
 //BA.debugLineNum = 28835852;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.ef.b4xbytesbuilder __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="Dim mBuffer(100) As Byte";
_mbuffer = new byte[(int) (100)];
;
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="mLength = 0";
__ref._mlength /*int*/  = (int) (0);
RDebugUtils.currentLine=27918339;
 //BA.debugLineNum = 27918339;BA.debugLine="End Sub";
return "";
}
public String  _insert(b4a.example.ef.b4xbytesbuilder __ref,int _index,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "insert", true))
	 {return ((String) Debug.delegate(ba, "insert", new Object[] {_index,_data}));}
byte[] _afterindex = null;
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Public Sub Insert(Index As Int, Data() As Byte)";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="If Index >= mLength Then";
if (_index>=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=28246018;
 //BA.debugLineNum = 28246018;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>__ref._mlength /*int*/ ) { 
__c.LogImpl("928246018","Index too large",0);};
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="Append(Data)";
__ref._append /*b4a.example.ef.b4xbytesbuilder*/ (null,_data);
 }else {
RDebugUtils.currentLine=28246021;
 //BA.debugLineNum = 28246021;BA.debugLine="Dim AfterIndex() As Byte = SubArray(Index)";
_afterindex = __ref._subarray /*byte[]*/ (null,_index);
RDebugUtils.currentLine=28246022;
 //BA.debugLineNum = 28246022;BA.debugLine="ChangeLength(mLength + Data.Length)";
__ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ +_data.length));
RDebugUtils.currentLine=28246023;
 //BA.debugLineNum = 28246023;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_index,_data.length);
RDebugUtils.currentLine=28246024;
 //BA.debugLineNum = 28246024;BA.debugLine="Bit.ArrayCopy(AfterIndex, 0, mBuffer, Index + Da";
__c.Bit.ArrayCopy((Object)(_afterindex),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),(int) (_index+_data.length),_afterindex.length);
 };
RDebugUtils.currentLine=28246026;
 //BA.debugLineNum = 28246026;BA.debugLine="End Sub";
return "";
}
public byte[]  _subarray(b4a.example.ef.b4xbytesbuilder __ref,int _beginindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "subarray", true))
	 {return ((byte[]) Debug.delegate(ba, "subarray", new Object[] {_beginindex}));}
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Public Sub SubArray(BeginIndex As Int) As Byte()";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="Return SubArray2(BeginIndex, mLength)";
if (true) return __ref._subarray2 /*byte[]*/ (null,_beginindex,__ref._mlength /*int*/ );
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="End Sub";
return null;
}
public byte[]  _remove(b4a.example.ef.b4xbytesbuilder __ref,int _beginindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((byte[]) Debug.delegate(ba, "remove", new Object[] {_beginindex,_endindex}));}
byte[] _res = null;
byte[] _afterendindex = null;
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Public Sub Remove(BeginIndex As Int, EndIndex As I";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="Dim res() As Byte = SubArray2(BeginIndex, EndInde";
_res = __ref._subarray2 /*byte[]*/ (null,_beginindex,_endindex);
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="If EndIndex <= mLength Then";
if (_endindex<=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="Dim AfterEndIndex() As Byte = SubArray(EndIndex)";
_afterendindex = __ref._subarray /*byte[]*/ (null,_endindex);
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="Bit.ArrayCopy(AfterEndIndex, 0, mBuffer, BeginIn";
__c.Bit.ArrayCopy((Object)(_afterendindex),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_beginindex,_afterendindex.length);
 };
RDebugUtils.currentLine=28377094;
 //BA.debugLineNum = 28377094;BA.debugLine="ChangeLength(mLength - (EndIndex - BeginIndex))";
__ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ -(_endindex-_beginindex)));
RDebugUtils.currentLine=28377095;
 //BA.debugLineNum = 28377095;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=28377096;
 //BA.debugLineNum = 28377096;BA.debugLine="End Sub";
return null;
}
public byte[]  _subarray2(b4a.example.ef.b4xbytesbuilder __ref,int _beginindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "subarray2", true))
	 {return ((byte[]) Debug.delegate(ba, "subarray2", new Object[] {_beginindex,_endindex}));}
byte[] _b = null;
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Public Sub SubArray2(BeginIndex As Int, EndIndex A";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="Dim b(EndIndex - BeginIndex) As Byte";
_b = new byte[(int) (_endindex-_beginindex)];
;
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="Bit.ArrayCopy(mBuffer, BeginIndex, b, 0, b.Length";
__c.Bit.ArrayCopy((Object)(__ref._mbuffer /*byte[]*/ ),_beginindex,(Object)(_b),(int) (0),_b.length);
RDebugUtils.currentLine=28508163;
 //BA.debugLineNum = 28508163;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=28508164;
 //BA.debugLineNum = 28508164;BA.debugLine="End Sub";
return null;
}
public String  _set(b4a.example.ef.b4xbytesbuilder __ref,int _index,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_data}));}
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Public Sub Set(Index As Int, Data() As Byte)";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="If Index >= mLength Then";
if (_index>=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>__ref._mlength /*int*/ ) { 
__c.LogImpl("928311554","Index too large",0);};
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="Append(Data)";
__ref._append /*b4a.example.ef.b4xbytesbuilder*/ (null,_data);
 }else {
RDebugUtils.currentLine=28311557;
 //BA.debugLineNum = 28311557;BA.debugLine="If Data.Length + Index > mLength Then";
if (_data.length+_index>__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=28311558;
 //BA.debugLineNum = 28311558;BA.debugLine="ChangeLength(Data.Length + Index)";
__ref._changelength /*int*/ (null,(int) (_data.length+_index));
 };
RDebugUtils.currentLine=28311560;
 //BA.debugLineNum = 28311560;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_index,_data.length);
 };
RDebugUtils.currentLine=28311562;
 //BA.debugLineNum = 28311562;BA.debugLine="End Sub";
return "";
}
public byte[]  _toarray(b4a.example.ef.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "toarray", true))
	 {return ((byte[]) Debug.delegate(ba, "toarray", null));}
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Public Sub ToArray() As Byte()";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="Return SubArray(0)";
if (true) return __ref._subarray /*byte[]*/ (null,(int) (0));
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="End Sub";
return null;
}
}