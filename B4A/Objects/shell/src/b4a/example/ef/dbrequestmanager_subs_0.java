package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dbrequestmanager_subs_0 {


public static RemoteObject  _bytestoimage(RemoteObject __ref,RemoteObject _bytes) throws Exception{
try {
		Debug.PushSubsStack("BytesToImage (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("bytestoimage")) { return __ref.runUserSub(false, "dbrequestmanager","bytestoimage", __ref, _bytes);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 125;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As Bitmap";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(536870912);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 127;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
Debug.ShouldStop(1073741824);
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_bytes),(Object)(BA.numberCast(int.class, 0)),(Object)(_bytes.getField(true,"length")));
 BA.debugLineNum = 128;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(-2147483648);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 129;BA.debugLine="bmp.Initialize2(In)";
Debug.ShouldStop(1);
_bmp.runVoidMethod ("Initialize2",(Object)((_in.getObject())));
 BA.debugLineNum = 130;BA.debugLine="Return bmp";
Debug.ShouldStop(2);
if (true) return _bmp;
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mTarget As Object";
dbrequestmanager._mtarget = RemoteObject.createNew ("Object");__ref.setField("_mtarget",dbrequestmanager._mtarget);
 //BA.debugLineNum = 6;BA.debugLine="Private link As String";
dbrequestmanager._link = RemoteObject.createImmutable("");__ref.setField("_link",dbrequestmanager._link);
 //BA.debugLineNum = 7;BA.debugLine="Private VERSION As Float = 2";
dbrequestmanager._version = BA.numberCast(float.class, 2);__ref.setField("_version",dbrequestmanager._version);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createjob(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateJob (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("createjob")) { return __ref.runUserSub(false, "dbrequestmanager","createjob", __ref);}
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
 BA.debugLineNum = 45;BA.debugLine="Private Sub CreateJob As HttpJob";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(8192);
_j = RemoteObject.createNew ("b4a.example.ef.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 47;BA.debugLine="j.Initialize(\"DBRequest\", mTarget)";
Debug.ShouldStop(16384);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("DBRequest")),(Object)(__ref.getField(false,"_mtarget" /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="Return j";
Debug.ShouldStop(32768);
if (true) return _j;
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executebatch(RemoteObject __ref,RemoteObject _listofcommands,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("ExecuteBatch (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("executebatch")) { return __ref.runUserSub(false, "dbrequestmanager","executebatch", __ref, _listofcommands, _tag);}
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
Debug.locals.put("ListOfCommands", _listofcommands);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 54;BA.debugLine="Public Sub ExecuteBatch(ListOfCommands As List, Ta";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim j As HttpJob = CreateJob";
Debug.ShouldStop(4194304);
_j = __ref.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_createjob" /*RemoteObject*/ );Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 56;BA.debugLine="ExecuteBatchImpl(j, ListOfCommands, Tag)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executebatchimpl" /*void*/ ,(Object)(_j),(Object)(_listofcommands),(Object)(_tag));
 BA.debugLineNum = 57;BA.debugLine="Return j";
Debug.ShouldStop(16777216);
if (true) return _j;
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _executebatchimpl(RemoteObject __ref,RemoteObject _job,RemoteObject _listofcommands,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("ExecuteBatchImpl (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("executebatchimpl")) { __ref.runUserSub(false, "dbrequestmanager","executebatchimpl", __ref, _job, _listofcommands, _tag); return;}
ResumableSub_ExecuteBatchImpl rsub = new ResumableSub_ExecuteBatchImpl(null,__ref,_job,_listofcommands,_tag);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ExecuteBatchImpl extends BA.ResumableSub {
public ResumableSub_ExecuteBatchImpl(b4a.example.ef.dbrequestmanager parent,RemoteObject __ref,RemoteObject _job,RemoteObject _listofcommands,RemoteObject _tag) {
this.parent = parent;
this.__ref = __ref;
this._job = _job;
this._listofcommands = _listofcommands;
this._tag = _tag;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.dbrequestmanager parent;
RemoteObject _job;
RemoteObject _listofcommands;
RemoteObject _tag;
RemoteObject _ser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _bytes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExecuteBatchImpl (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,60);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Job", _job);
Debug.locals.put("ListOfCommands", _listofcommands);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 61;BA.debugLine="Dim ser As B4XSerializator";
Debug.ShouldStop(268435456);
_ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("ser", _ser);
 BA.debugLineNum = 62;BA.debugLine="ser.ConvertObjectToBytesAsync(CreateMap(\"commands";
Debug.ShouldStop(536870912);
_ser.runVoidMethod ("ConvertObjectToBytesAsync",__ref.getField(false, "ba"),(Object)((parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("commands")),(_listofcommands.getObject()),RemoteObject.createImmutable(("version")),(__ref.getField(true,"_version" /*RemoteObject*/ ))})).getObject())),(Object)(RemoteObject.createImmutable("ser")));
 BA.debugLineNum = 63;BA.debugLine="Wait For (ser) ser_ObjectToBytes (Success As Bool";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","ser_objecttobytes", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dbrequestmanager", "executebatchimpl"), (_ser));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_bytes = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Bytes", _bytes);
;
 BA.debugLineNum = 64;BA.debugLine="If Success = False Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 65;BA.debugLine="Log(\"Error building command: \" & LastException)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","38454149",RemoteObject.concat(RemoteObject.createImmutable("Error building command: "),parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 BA.debugLineNum = 66;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 68;BA.debugLine="Dim ser As B4XSerializator = Sender";
Debug.ShouldStop(8);
_ser = (parent.__c.runMethod(false,"Sender",__ref.runMethod(false,"getActivityBA")));Debug.locals.put("ser", _ser);Debug.locals.put("ser", _ser);
 BA.debugLineNum = 69;BA.debugLine="SendJob(Job, Bytes, Tag, \"batch2\")";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_sendjob" /*RemoteObject*/ ,(Object)(_job),(Object)(_bytes),(Object)(_tag),(Object)(RemoteObject.createImmutable("batch2")));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _ser_objecttobytes(RemoteObject __ref,RemoteObject _success,RemoteObject _bytes) throws Exception{
}
public static RemoteObject  _executecommand(RemoteObject __ref,RemoteObject _command,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("ExecuteCommand (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("executecommand")) { return __ref.runUserSub(false, "dbrequestmanager","executecommand", __ref, _command, _tag);}
Debug.locals.put("Command", _command);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 74;BA.debugLine="Public Sub ExecuteCommand(Command As DBCommand, Ta";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Return ExecuteBatch(Array As DBCommand(Command),";
Debug.ShouldStop(1024);
if (true) return __ref.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executebatch" /*RemoteObject*/ ,(Object)(dbrequestmanager.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("b4a.example.ef.main._dbcommand",new int[] {1},new Object[] {_command})))),(Object)(_tag));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executequery(RemoteObject __ref,RemoteObject _command,RemoteObject _limit,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("ExecuteQuery (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("executequery")) { return __ref.runUserSub(false, "dbrequestmanager","executequery", __ref, _command, _limit, _tag);}
RemoteObject _ser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _data = null;
Debug.locals.put("Command", _command);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 21;BA.debugLine="Public Sub ExecuteQuery(Command As DBCommand, Limi";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim ser As B4XSerializator";
Debug.ShouldStop(2097152);
_ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("ser", _ser);
 BA.debugLineNum = 23;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(Cre";
Debug.ShouldStop(4194304);
_data = _ser.runMethod(false,"ConvertObjectToBytes",(Object)((dbrequestmanager.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("command")),(_command),RemoteObject.createImmutable(("limit")),(_limit),RemoteObject.createImmutable(("version")),(__ref.getField(true,"_version" /*RemoteObject*/ ))})).getObject())));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 24;BA.debugLine="Return SendJob(CreateJob, data, Tag, \"query2\")";
Debug.ShouldStop(8388608);
if (true) return __ref.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_sendjob" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_createjob" /*RemoteObject*/ )),(Object)(_data),(Object)(_tag),(Object)(RemoteObject.createImmutable("query2")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filetobytes(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("FileToBytes (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("filetobytes")) { return __ref.runUserSub(false, "dbrequestmanager","filetobytes", __ref, _dir, _filename);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 107;BA.debugLine="Public Sub FileToBytes(Dir As String, FileName As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(2048);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 109;BA.debugLine="out.InitializeToBytesArray(0)";
Debug.ShouldStop(4096);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 110;BA.debugLine="Dim In As InputStream = File.OpenInput(Dir, FileN";
Debug.ShouldStop(8192);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
_in = dbrequestmanager.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename));Debug.locals.put("In", _in);Debug.locals.put("In", _in);
 BA.debugLineNum = 111;BA.debugLine="File.Copy2(In, out)";
Debug.ShouldStop(16384);
dbrequestmanager.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_in.getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 112;BA.debugLine="out.Close";
Debug.ShouldStop(32768);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 113;BA.debugLine="Return out.ToBytesArray";
Debug.ShouldStop(65536);
if (true) return _out.runMethod(false,"ToBytesArray");
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handlejob(RemoteObject __ref,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("HandleJob (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("handlejob")) { return __ref.runUserSub(false, "dbrequestmanager","handlejob", __ref, _job);}
RemoteObject _ser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _data = null;
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 80;BA.debugLine="Public Sub HandleJob(Job As HttpJob) As DBResult";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Dim ser As B4XSerializator";
Debug.ShouldStop(65536);
_ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("ser", _ser);
 BA.debugLineNum = 82;BA.debugLine="Dim data() As Byte = Bit.InputStreamToBytes(Job.G";
Debug.ShouldStop(131072);
_data = dbrequestmanager.__c.getField(false,"Bit").runMethod(false,"InputStreamToBytes",(Object)((_job.runClassMethod (b4a.example.ef.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 83;BA.debugLine="Dim res As DBResult = ser.ConvertBytesToObject(da";
Debug.ShouldStop(262144);
_res = (_ser.runMethod(false,"ConvertBytesToObject",(Object)(_data)));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 84;BA.debugLine="res.Tag = Job.Tag";
Debug.ShouldStop(524288);
_res.setField ("Tag" /*RemoteObject*/ ,_job.getField(false,"_tag" /*RemoteObject*/ ));
 BA.debugLineNum = 85;BA.debugLine="Return res";
Debug.ShouldStop(1048576);
if (true) return _res;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _handlejobasync(RemoteObject __ref,RemoteObject _job,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("HandleJobAsync (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("handlejobasync")) { __ref.runUserSub(false, "dbrequestmanager","handlejobasync", __ref, _job, _eventname); return;}
ResumableSub_HandleJobAsync rsub = new ResumableSub_HandleJobAsync(null,__ref,_job,_eventname);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_HandleJobAsync extends BA.ResumableSub {
public ResumableSub_HandleJobAsync(b4a.example.ef.dbrequestmanager parent,RemoteObject __ref,RemoteObject _job,RemoteObject _eventname) {
this.parent = parent;
this.__ref = __ref;
this._job = _job;
this._eventname = _eventname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.dbrequestmanager parent;
RemoteObject _job;
RemoteObject _eventname;
RemoteObject _ser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _data = null;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _newobject = RemoteObject.declareNull("Object");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HandleJobAsync (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,89);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Job", _job);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 90;BA.debugLine="Dim ser As B4XSerializator";
Debug.ShouldStop(33554432);
_ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("ser", _ser);
 BA.debugLineNum = 91;BA.debugLine="Dim data() As Byte = Bit.InputStreamToBytes(Job.G";
Debug.ShouldStop(67108864);
_data = parent.__c.getField(false,"Bit").runMethod(false,"InputStreamToBytes",(Object)((_job.runClassMethod (b4a.example.ef.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 92;BA.debugLine="ser.ConvertBytesToObjectAsync(data, \"ser\")";
Debug.ShouldStop(134217728);
_ser.runVoidMethod ("ConvertBytesToObjectAsync",__ref.getField(false, "ba"),(Object)(_data),(Object)(RemoteObject.createImmutable("ser")));
 BA.debugLineNum = 93;BA.debugLine="Wait For (ser) ser_BytesToObject (Success As Bool";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","ser_bytestoobject", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dbrequestmanager", "handlejobasync"), (_ser));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_newobject = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("NewObject", _newobject);
;
 BA.debugLineNum = 94;BA.debugLine="If Success = False Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 95;BA.debugLine="Log(\"Error reading response: \" & LastException)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","38650758",RemoteObject.concat(RemoteObject.createImmutable("Error reading response: "),parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 BA.debugLineNum = 96;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 98;BA.debugLine="Dim res As DBResult = NewObject";
Debug.ShouldStop(2);
_res = (_newobject);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 99;BA.debugLine="res.Tag = Job.Tag";
Debug.ShouldStop(4);
_res.setField ("Tag" /*RemoteObject*/ ,_job.getField(false,"_tag" /*RemoteObject*/ ));
 BA.debugLineNum = 100;BA.debugLine="CallSubDelayed2(mTarget, EventName & \"_result\", r";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtarget" /*RemoteObject*/ )),(Object)(RemoteObject.concat(_eventname,RemoteObject.createImmutable("_result"))),(Object)((_res)));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _ser_bytestoobject(RemoteObject __ref,RemoteObject _success,RemoteObject _newobject) throws Exception{
}
public static RemoteObject  _imagetobytes(RemoteObject __ref,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("ImageToBytes (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("imagetobytes")) { return __ref.runUserSub(false, "dbrequestmanager","imagetobytes", __ref, _image);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Image", _image);
 BA.debugLineNum = 117;BA.debugLine="Public Sub ImageToBytes(Image As Bitmap) As Byte()";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(2097152);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 119;BA.debugLine="out.InitializeToBytesArray(0)";
Debug.ShouldStop(4194304);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 120;BA.debugLine="Image.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(8388608);
_image.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 121;BA.debugLine="out.Close";
Debug.ShouldStop(16777216);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 122;BA.debugLine="Return out.ToBytesArray";
Debug.ShouldStop(33554432);
if (true) return _out.runMethod(false,"ToBytesArray");
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _target,RemoteObject _connectorlink) throws Exception{
try {
		Debug.PushSubsStack("Initialize (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "dbrequestmanager","initialize", __ref, _ba, _target, _connectorlink);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Target", _target);
Debug.locals.put("ConnectorLink", _connectorlink);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize (Target As Object, Connector";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="mTarget = Target";
Debug.ShouldStop(4096);
__ref.setField ("_mtarget" /*RemoteObject*/ ,_target);
 BA.debugLineNum = 14;BA.debugLine="link = ConnectorLink";
Debug.ShouldStop(8192);
__ref.setField ("_link" /*RemoteObject*/ ,_connectorlink);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printtable(RemoteObject __ref,RemoteObject _table) throws Exception{
try {
		Debug.PushSubsStack("PrintTable (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("printtable")) { return __ref.runUserSub(false, "dbrequestmanager","printtable", __ref, _table);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _col = RemoteObject.declareNull("Object");
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
Debug.locals.put("Table", _table);
 BA.debugLineNum = 135;BA.debugLine="Public Sub PrintTable(Table As DBResult)";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Log(\"Tag: \" & Table.Tag & \", Columns: \" & Table.C";
Debug.ShouldStop(128);
dbrequestmanager.__c.runVoidMethod ("LogImpl","38912897",RemoteObject.concat(RemoteObject.createImmutable("Tag: "),_table.getField(false,"Tag" /*RemoteObject*/ ),RemoteObject.createImmutable(", Columns: "),_table.getField(false,"Columns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(", Rows: "),_table.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize")),0);
 BA.debugLineNum = 137;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(256);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 138;BA.debugLine="sb.Initialize";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 139;BA.debugLine="For Each col In Table.Columns.Keys";
Debug.ShouldStop(1024);
{
final RemoteObject group4 = _table.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_col = group4.runMethod(false,"Get",index4);Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 140;BA.debugLine="sb.Append(col).Append(TAB)";
Debug.ShouldStop(2048);
_sb.runMethod(false,"Append",(Object)(BA.ObjectToString(_col))).runVoidMethod ("Append",(Object)(dbrequestmanager.__c.getField(true,"TAB")));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 142;BA.debugLine="Log(sb.ToString)";
Debug.ShouldStop(8192);
dbrequestmanager.__c.runVoidMethod ("LogImpl","38912903",_sb.runMethod(true,"ToString"),0);
 BA.debugLineNum = 143;BA.debugLine="For Each row() As Object In Table.Rows";
Debug.ShouldStop(16384);
{
final RemoteObject group8 = _table.getField(false,"Rows" /*RemoteObject*/ );
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_row = (group8.runMethod(false,"Get",index8));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 144;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32768);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 145;BA.debugLine="sb.Initialize";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 146;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(131072);
{
final RemoteObject group11 = _row;
final int groupLen11 = group11.getField(true,"length").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_record = group11.getArrayElement(false,RemoteObject.createImmutable(index11));Debug.locals.put("record", _record);
Debug.locals.put("record", _record);
 BA.debugLineNum = 147;BA.debugLine="sb.Append(record).Append(TAB)";
Debug.ShouldStop(262144);
_sb.runMethod(false,"Append",(Object)(BA.ObjectToString(_record))).runVoidMethod ("Append",(Object)(dbrequestmanager.__c.getField(true,"TAB")));
 }
}Debug.locals.put("record", _record);
;
 BA.debugLineNum = 149;BA.debugLine="Log(sb.ToString)";
Debug.ShouldStop(1048576);
dbrequestmanager.__c.runVoidMethod ("LogImpl","38912910",_sb.runMethod(true,"ToString"),0);
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendjob(RemoteObject __ref,RemoteObject _j,RemoteObject _data,RemoteObject _tag,RemoteObject _method) throws Exception{
try {
		Debug.PushSubsStack("SendJob (dbrequestmanager) ","dbrequestmanager",8,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("sendjob")) { return __ref.runUserSub(false, "dbrequestmanager","sendjob", __ref, _j, _data, _tag, _method);}
Debug.locals.put("j", _j);
Debug.locals.put("Data", _data);
Debug.locals.put("Tag", _tag);
Debug.locals.put("Method", _method);
 BA.debugLineNum = 38;BA.debugLine="Private Sub SendJob(j As HttpJob, Data() As Byte,";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="j.Tag = Tag";
Debug.ShouldStop(64);
_j.setField ("_tag" /*RemoteObject*/ ,_tag);
 BA.debugLineNum = 40;BA.debugLine="If link.Contains(\"?\") Then link = link & \"&\" E";
Debug.ShouldStop(128);
if (__ref.getField(true,"_link" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("?"))).<Boolean>get().booleanValue()) { 
__ref.setField ("_link" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_link" /*RemoteObject*/ ),RemoteObject.createImmutable("&")));}
else {
__ref.setField ("_link" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_link" /*RemoteObject*/ ),RemoteObject.createImmutable("?")));};
 BA.debugLineNum = 41;BA.debugLine="j.PostBytes(link & \"method=\" & Method , Data)";
Debug.ShouldStop(256);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_postbytes" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_link" /*RemoteObject*/ ),RemoteObject.createImmutable("method="),_method)),(Object)(_data));
 BA.debugLineNum = 42;BA.debugLine="Return j";
Debug.ShouldStop(512);
if (true) return _j;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}