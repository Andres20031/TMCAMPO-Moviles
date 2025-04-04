package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbrequestmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.dbrequestmanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.dbrequestmanager.class).invoke(this, new Object[] {null});
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
public Object _mtarget = null;
public String _link = "";
public float _version = 0f;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.ef.dbrequestmanager __ref,anywheresoftware.b4a.BA _ba,Object _target,String _connectorlink) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_target,_connectorlink}));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub Initialize (Target As Object, Connector";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="mTarget = Target";
__ref._mtarget /*Object*/  = _target;
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="link = ConnectorLink";
__ref._link /*String*/  = _connectorlink;
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.httpjob  _executequery(b4a.example.ef.dbrequestmanager __ref,b4a.example.ef.main._dbcommand _command,int _limit,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executequery", false))
	 {return ((b4a.example.ef.httpjob) Debug.delegate(ba, "executequery", new Object[] {_command,_limit,_tag}));}
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub ExecuteQuery(Command As DBCommand, Limi";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(Cre";
_data = _ser.ConvertObjectToBytes((Object)(__c.createMap(new Object[] {(Object)("command"),(Object)(_command),(Object)("limit"),(Object)(_limit),(Object)("version"),(Object)(__ref._version /*float*/ )}).getObject()));
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Return SendJob(CreateJob, data, Tag, \"query2\")";
if (true) return __ref._sendjob /*b4a.example.ef.httpjob*/ (null,__ref._createjob /*b4a.example.ef.httpjob*/ (null),_data,_tag,"query2");
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="End Sub";
return null;
}
public void  _handlejobasync(b4a.example.ef.dbrequestmanager __ref,b4a.example.ef.httpjob _job,String _eventname) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "handlejobasync", false))
	 {Debug.delegate(ba, "handlejobasync", new Object[] {_job,_eventname}); return;}
ResumableSub_HandleJobAsync rsub = new ResumableSub_HandleJobAsync(this,__ref,_job,_eventname);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleJobAsync extends BA.ResumableSub {
public ResumableSub_HandleJobAsync(b4a.example.ef.dbrequestmanager parent,b4a.example.ef.dbrequestmanager __ref,b4a.example.ef.httpjob _job,String _eventname) {
this.parent = parent;
this.__ref = __ref;
this._job = _job;
this._eventname = _eventname;
this.__ref = parent;
}
b4a.example.ef.dbrequestmanager __ref;
b4a.example.ef.dbrequestmanager parent;
b4a.example.ef.httpjob _job;
String _eventname;
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;
boolean _success = false;
Object _newobject = null;
b4a.example.ef.main._dbresult _res = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Dim data() As Byte = Bit.InputStreamToBytes(Job.G";
_data = parent.__c.Bit.InputStreamToBytes((java.io.InputStream)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()));
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="ser.ConvertBytesToObjectAsync(data, \"ser\")";
_ser.ConvertBytesToObjectAsync(ba,_data,"ser");
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="Wait For (ser) ser_BytesToObject (Success As Bool";
parent.__c.WaitFor("ser_bytestoobject", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dbrequestmanager", "handlejobasync"), (Object)(_ser));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (Boolean) result[1];
_newobject = (Object) result[2];
;
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="If Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="Log(\"Error reading response: \" & LastException)";
parent.__c.LogImpl("49961478","Error reading response: "+BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="Dim res As DBResult = NewObject";
_res = (b4a.example.ef.main._dbresult)(_newobject);
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="res.Tag = Job.Tag";
_res.Tag /*Object*/  = _job._tag /*Object*/ ;
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="CallSubDelayed2(mTarget, EventName & \"_result\", r";
parent.__c.CallSubDelayed2(ba,__ref._mtarget /*Object*/ ,_eventname+"_result",(Object)(_res));
RDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.ef.httpjob  _executecommand(b4a.example.ef.dbrequestmanager __ref,b4a.example.ef.main._dbcommand _command,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executecommand", false))
	 {return ((b4a.example.ef.httpjob) Debug.delegate(ba, "executecommand", new Object[] {_command,_tag}));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub ExecuteCommand(Command As DBCommand, Ta";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Return ExecuteBatch(Array As DBCommand(Command),";
if (true) return __ref._executebatch /*b4a.example.ef.httpjob*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new b4a.example.ef.main._dbcommand[]{_command}),_tag);
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="End Sub";
return null;
}
public String  _printtable(b4a.example.ef.dbrequestmanager __ref,b4a.example.ef.main._dbresult _table) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "printtable", false))
	 {return ((String) Debug.delegate(ba, "printtable", new Object[] {_table}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
Object _col = null;
Object[] _row = null;
Object _record = null;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub PrintTable(Table As DBResult)";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Log(\"Tag: \" & Table.Tag & \", Columns: \" & Table.C";
__c.LogImpl("410223617","Tag: "+BA.ObjectToString(_table.Tag /*Object*/ )+", Columns: "+BA.NumberToString(_table.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize())+", Rows: "+BA.NumberToString(_table.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="For Each col In Table.Columns.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_col = group4.Get(index4);
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="sb.Append(col).Append(TAB)";
_sb.Append(BA.ObjectToString(_col)).Append(__c.TAB);
 }
};
RDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("410223623",_sb.ToString(),0);
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="For Each row() As Object In Table.Rows";
{
final anywheresoftware.b4a.BA.IterableList group8 = _table.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_row = (Object[])(group8.Get(index8));
RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10223626;
 //BA.debugLineNum = 10223626;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10223627;
 //BA.debugLineNum = 10223627;BA.debugLine="For Each record As Object In row";
{
final Object[] group11 = _row;
final int groupLen11 = group11.length
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_record = group11[index11];
RDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="sb.Append(record).Append(TAB)";
_sb.Append(BA.ObjectToString(_record)).Append(__c.TAB);
 }
};
RDebugUtils.currentLine=10223630;
 //BA.debugLineNum = 10223630;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("410223630",_sb.ToString(),0);
 }
};
RDebugUtils.currentLine=10223632;
 //BA.debugLineNum = 10223632;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _bytestoimage(b4a.example.ef.dbrequestmanager __ref,byte[] _bytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "bytestoimage", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "bytestoimage", new Object[] {_bytes}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As Bitmap";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="bmp.Initialize2(In)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.dbrequestmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Private mTarget As Object";
_mtarget = new Object();
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Private link As String";
_link = "";
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Private VERSION As Float = 2";
_version = (float) (2);
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.httpjob  _createjob(b4a.example.ef.dbrequestmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "createjob", false))
	 {return ((b4a.example.ef.httpjob) Debug.delegate(ba, "createjob", null));}
b4a.example.ef.httpjob _j = null;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub CreateJob As HttpJob";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.ef.httpjob();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="j.Initialize(\"DBRequest\", mTarget)";
_j._initialize /*String*/ (null,ba,"DBRequest",__ref._mtarget /*Object*/ );
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Return j";
if (true) return _j;
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.httpjob  _executebatch(b4a.example.ef.dbrequestmanager __ref,anywheresoftware.b4a.objects.collections.List _listofcommands,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executebatch", false))
	 {return ((b4a.example.ef.httpjob) Debug.delegate(ba, "executebatch", new Object[] {_listofcommands,_tag}));}
b4a.example.ef.httpjob _j = null;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub ExecuteBatch(ListOfCommands As List, Ta";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim j As HttpJob = CreateJob";
_j = __ref._createjob /*b4a.example.ef.httpjob*/ (null);
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="ExecuteBatchImpl(j, ListOfCommands, Tag)";
__ref._executebatchimpl /*void*/ (null,_j,_listofcommands,_tag);
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Return j";
if (true) return _j;
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="End Sub";
return null;
}
public void  _executebatchimpl(b4a.example.ef.dbrequestmanager __ref,b4a.example.ef.httpjob _job,anywheresoftware.b4a.objects.collections.List _listofcommands,Object _tag) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executebatchimpl", false))
	 {Debug.delegate(ba, "executebatchimpl", new Object[] {_job,_listofcommands,_tag}); return;}
ResumableSub_ExecuteBatchImpl rsub = new ResumableSub_ExecuteBatchImpl(this,__ref,_job,_listofcommands,_tag);
rsub.resume(ba, null);
}
public static class ResumableSub_ExecuteBatchImpl extends BA.ResumableSub {
public ResumableSub_ExecuteBatchImpl(b4a.example.ef.dbrequestmanager parent,b4a.example.ef.dbrequestmanager __ref,b4a.example.ef.httpjob _job,anywheresoftware.b4a.objects.collections.List _listofcommands,Object _tag) {
this.parent = parent;
this.__ref = __ref;
this._job = _job;
this._listofcommands = _listofcommands;
this._tag = _tag;
this.__ref = parent;
}
b4a.example.ef.dbrequestmanager __ref;
b4a.example.ef.dbrequestmanager parent;
b4a.example.ef.httpjob _job;
anywheresoftware.b4a.objects.collections.List _listofcommands;
Object _tag;
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
boolean _success = false;
byte[] _bytes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="ser.ConvertObjectToBytesAsync(CreateMap(\"commands";
_ser.ConvertObjectToBytesAsync(ba,(Object)(parent.__c.createMap(new Object[] {(Object)("commands"),(Object)(_listofcommands.getObject()),(Object)("version"),(Object)(__ref._version /*float*/ )}).getObject()),"ser");
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Wait For (ser) ser_ObjectToBytes (Success As Bool";
parent.__c.WaitFor("ser_objecttobytes", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dbrequestmanager", "executebatchimpl"), (Object)(_ser));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (Boolean) result[1];
_bytes = (byte[]) result[2];
;
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="If Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="Log(\"Error building command: \" & LastException)";
parent.__c.LogImpl("49764869","Error building command: "+BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="Dim ser As B4XSerializator = Sender";
_ser = (anywheresoftware.b4a.randomaccessfile.B4XSerializator)(parent.__c.Sender(parent.getActivityBA()));
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="SendJob(Job, Bytes, Tag, \"batch2\")";
__ref._sendjob /*b4a.example.ef.httpjob*/ (null,_job,_bytes,_tag,"batch2");
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.ef.httpjob  _sendjob(b4a.example.ef.dbrequestmanager __ref,b4a.example.ef.httpjob _j,byte[] _data,Object _tag,String _method) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "sendjob", false))
	 {return ((b4a.example.ef.httpjob) Debug.delegate(ba, "sendjob", new Object[] {_j,_data,_tag,_method}));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Private Sub SendJob(j As HttpJob, Data() As Byte,";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="j.Tag = Tag";
_j._tag /*Object*/  = _tag;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="If link.Contains(\"?\") Then link = link & \"&\" E";
if (__ref._link /*String*/ .contains("?")) { 
__ref._link /*String*/  = __ref._link /*String*/ +"&";}
else {
__ref._link /*String*/  = __ref._link /*String*/ +"?";};
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="j.PostBytes(link & \"method=\" & Method , Data)";
_j._postbytes /*String*/ (null,__ref._link /*String*/ +"method="+_method,_data);
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Return j";
if (true) return _j;
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="End Sub";
return null;
}
public byte[]  _filetobytes(b4a.example.ef.dbrequestmanager __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "filetobytes", false))
	 {return ((byte[]) Debug.delegate(ba, "filetobytes", new Object[] {_dir,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub FileToBytes(Dir As String, FileName As";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Dim In As InputStream = File.OpenInput(Dir, FileN";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbresult  _handlejob(b4a.example.ef.dbrequestmanager __ref,b4a.example.ef.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "handlejob", false))
	 {return ((b4a.example.ef.main._dbresult) Debug.delegate(ba, "handlejob", new Object[] {_job}));}
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;
b4a.example.ef.main._dbresult _res = null;
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub HandleJob(Job As HttpJob) As DBResult";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Dim data() As Byte = Bit.InputStreamToBytes(Job.G";
_data = __c.Bit.InputStreamToBytes((java.io.InputStream)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()));
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="Dim res As DBResult = ser.ConvertBytesToObject(da";
_res = (b4a.example.ef.main._dbresult)(_ser.ConvertBytesToObject(_data));
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="res.Tag = Job.Tag";
_res.Tag /*Object*/  = _job._tag /*Object*/ ;
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="End Sub";
return null;
}
public byte[]  _imagetobytes(b4a.example.ef.dbrequestmanager __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "imagetobytes", false))
	 {return ((byte[]) Debug.delegate(ba, "imagetobytes", new Object[] {_image}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub ImageToBytes(Image As Bitmap) As Byte()";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="Image.WriteToStream(out, 100, \"JPEG\")";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="End Sub";
return null;
}
}