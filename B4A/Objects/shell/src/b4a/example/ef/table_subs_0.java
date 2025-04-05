package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class table_subs_0 {


public static RemoteObject  _addrow(RemoteObject __ref,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("AddRow (table) ","table",20,__ref.getField(false, "ba"),__ref,1221);
if (RapidSub.canDelegate("addrow")) { return __ref.runUserSub(false, "table","addrow", __ref, _values);}
RemoteObject _lastrow = RemoteObject.createImmutable(0);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 1221;BA.debugLine="Public Sub AddRow(Values() As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1222;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",_values.getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1223;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
Debug.ShouldStop(64);
table.__c.runVoidMethod ("LogImpl","324969218",RemoteObject.concat(RemoteObject.createImmutable("Wrong number of values ="),_values.getField(true,"length"),RemoteObject.createImmutable(" col="),__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1224;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1226;BA.debugLine="Data.Add(Values)";
Debug.ShouldStop(512);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_values)));
 BA.debugLineNum = 1227;BA.debugLine="lstRowColorIndexes.Add(0)";
Debug.ShouldStop(1024);
__ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1229;BA.debugLine="Dim lastRow As Int";
Debug.ShouldStop(4096);
_lastrow = RemoteObject.createImmutable(0);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 1230;BA.debugLine="lastRow = Data.Size - 1";
Debug.ShouldStop(8192);
_lastrow = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 1231;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("<",_lastrow,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"),__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),__ref.getField(true,"_crowheight" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "/+",1, 0))) { 
 BA.debugLineNum = 1232;BA.debugLine="ShowRow(lastRow)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(_lastrow));
 };
 BA.debugLineNum = 1240;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addrowautomaticwidth(RemoteObject __ref,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("AddRowAutomaticWidth (table) ","table",20,__ref.getField(false, "ba"),__ref,1244);
if (RapidSub.canDelegate("addrowautomaticwidth")) { return __ref.runUserSub(false, "table","addrowautomaticwidth", __ref, _values);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lastrow = RemoteObject.createImmutable(0);
RemoteObject _changed = RemoteObject.createImmutable(false);
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 1244;BA.debugLine="Public Sub AddRowAutomaticWidth(Values() As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1245;BA.debugLine="Private i As Int";
Debug.ShouldStop(268435456);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1247;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_values.getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1248;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
Debug.ShouldStop(-2147483648);
table.__c.runVoidMethod ("LogImpl","325034756",RemoteObject.concat(RemoteObject.createImmutable("Wrong number of values ="),_values.getField(true,"length"),RemoteObject.createImmutable(" col="),__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1249;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1251;BA.debugLine="Data.Add(Values)";
Debug.ShouldStop(4);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_values)));
 BA.debugLineNum = 1252;BA.debugLine="lstRowColorIndexes.Add(0)";
Debug.ShouldStop(8);
__ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1254;BA.debugLine="Dim lastRow As Int";
Debug.ShouldStop(32);
_lastrow = RemoteObject.createImmutable(0);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 1255;BA.debugLine="lastRow = Data.Size - 1";
Debug.ShouldStop(64);
_lastrow = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 1257;BA.debugLine="Dim changed = False As Boolean";
Debug.ShouldStop(256);
_changed = table.__c.getField(true,"False");Debug.locals.put("changed", _changed);Debug.locals.put("changed", _changed);
 BA.debugLineNum = 1258;BA.debugLine="Dim width As Int";
Debug.ShouldStop(512);
_width = RemoteObject.createImmutable(0);Debug.locals.put("width", _width);
 BA.debugLineNum = 1259;BA.debugLine="If Data.Size = 1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1260;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(2048);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _i.<Integer>get().intValue() <= limit13) || (step13 < 0 && _i.<Integer>get().intValue() >= limit13) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1261;BA.debugLine="If HeaderMultiTypeFace = False Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1262;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
Debug.ShouldStop(8192);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(__ref.getField(false,"_headernames" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)))),(Object)((__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("width", _width);
 }else {
 BA.debugLineNum = 1264;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
Debug.ShouldStop(32768);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(__ref.getField(false,"_headernames" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)))),(Object)((__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_i).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("width", _width);
 };
 BA.debugLineNum = 1266;BA.debugLine="ColumnWidths(i) = width";
Debug.ShouldStop(131072);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (_width,_i);
 BA.debugLineNum = 1267;BA.debugLine="SavedWidths(i) = width";
Debug.ShouldStop(262144);
__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).setArrayElement (_width,_i);
 BA.debugLineNum = 1268;BA.debugLine="HeaderWidths(i) = width";
Debug.ShouldStop(524288);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (_width,_i);
 BA.debugLineNum = 1269;BA.debugLine="DataWidths(i) = width";
Debug.ShouldStop(1048576);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (_width,_i);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1272;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(8388608);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step25 > 0 && _i.<Integer>get().intValue() <= limit25) || (step25 < 0 && _i.<Integer>get().intValue() >= limit25) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1273;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1274;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
Debug.ShouldStop(33554432);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_values.getArrayElement(true,_i)),(Object)((__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("width", _width);
 }else {
 BA.debugLineNum = 1276;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
Debug.ShouldStop(134217728);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_values.getArrayElement(true,_i)),(Object)((__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,_i).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("width", _width);
 };
 BA.debugLineNum = 1278;BA.debugLine="If ColumnWidths(i) < width Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,_i),BA.numberCast(double.class, _width))) { 
 BA.debugLineNum = 1279;BA.debugLine="ColumnWidths(i) = width";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (_width,_i);
 BA.debugLineNum = 1280;BA.debugLine="SavedWidths(i) = width";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).setArrayElement (_width,_i);
 BA.debugLineNum = 1281;BA.debugLine="HeaderWidths(i) = width";
Debug.ShouldStop(1);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (_width,_i);
 BA.debugLineNum = 1282;BA.debugLine="DataWidths(i) = width";
Debug.ShouldStop(2);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (_width,_i);
 BA.debugLineNum = 1283;BA.debugLine="changed = True";
Debug.ShouldStop(4);
_changed = table.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1287;BA.debugLine="If changed = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_changed,table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1288;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1291;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",_lastrow,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"),__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),__ref.getField(true,"_crowheight" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "/+",1, 0))) { 
 BA.debugLineNum = 1292;BA.debugLine="ShowRow(lastRow)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(_lastrow));
 };
 BA.debugLineNum = 1299;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtoactivity(RemoteObject __ref,RemoteObject _act,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("AddToActivity (table) ","table",20,__ref.getField(false, "ba"),__ref,656);
if (RapidSub.canDelegate("addtoactivity")) { return __ref.runUserSub(false, "table","addtoactivity", __ref, _act, _left, _top, _width, _height);}
Debug.locals.put("Act", _act);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 656;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 657;BA.debugLine="cLeft = Left";
Debug.ShouldStop(65536);
__ref.setField ("_cleft" /*RemoteObject*/ ,_left);
 BA.debugLineNum = 658;BA.debugLine="cTop = Top";
Debug.ShouldStop(131072);
__ref.setField ("_ctop" /*RemoteObject*/ ,_top);
 BA.debugLineNum = 659;BA.debugLine="cWidth = Width";
Debug.ShouldStop(262144);
__ref.setField ("_cwidth" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 660;BA.debugLine="cHeight = Height";
Debug.ShouldStop(524288);
__ref.setField ("_cheight" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 662;BA.debugLine="pnlTable.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 663;BA.debugLine="pnlTable.Color = Colors.Transparent";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("setColor",table.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 664;BA.debugLine="Act.AddView(pnlTable, cLeft, cTop , cWidth, cHeig";
Debug.ShouldStop(8388608);
_act.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnltable" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_cleft" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_ctop" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_cwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_cheight" /*RemoteObject*/ )));
 BA.debugLineNum = 666;BA.debugLine="InitTable";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.ef.table.class, "_inittable" /*RemoteObject*/ );
 BA.debugLineNum = 667;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtoview(RemoteObject __ref,RemoteObject _v,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("AddToView (table) ","table",20,__ref.getField(false, "ba"),__ref,647);
if (RapidSub.canDelegate("addtoview")) { return __ref.runUserSub(false, "table","addtoview", __ref, _v, _left, _top, _width, _height);}
Debug.locals.put("v", _v);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 647;BA.debugLine="Public Sub AddToView(v As View, Left As Int, Top A";
Debug.ShouldStop(64);
 BA.debugLineNum = 648;BA.debugLine="AddToActivity(v,Left,Top,Width,Height)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.ef.table.class, "_addtoactivity" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), _v.getObject()),(Object)(_left),(Object)(_top),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 649;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcfastscroll(RemoteObject __ref,RemoteObject _pos) throws Exception{
try {
		Debug.PushSubsStack("CalcFastScroll (table) ","table",20,__ref.getField(false, "ba"),__ref,2597);
if (RapidSub.canDelegate("calcfastscroll")) { return __ref.runUserSub(false, "table","calcfastscroll", __ref, _pos);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _str = null;
Debug.locals.put("Pos", _pos);
 BA.debugLineNum = 2597;BA.debugLine="Private Sub CalcFastScroll(Pos As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 2598;BA.debugLine="Private i, Top As Int";
Debug.ShouldStop(32);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
_top = RemoteObject.createImmutable(0);Debug.locals.put("Top", _top);
 BA.debugLineNum = 2599;BA.debugLine="Top = Pos * FScScale";
Debug.ShouldStop(64);
_top = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pos,__ref.getField(true,"_fscscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("Top", _top);
 BA.debugLineNum = 2600;BA.debugLine="pnlFastScrollCursor.Top = Top";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"setTop",_top);
 BA.debugLineNum = 2601;BA.debugLine="If mFastScrollFixedLabel = False Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscrollfixedlabel" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2602;BA.debugLine="lblFastScroll.Top = Top + FscLabelTopDelta";
Debug.ShouldStop(512);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_top,__ref.getField(true,"_fsclabeltopdelta" /*RemoteObject*/ )}, "+",1, 1));
 };
 BA.debugLineNum = 2604;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2605;BA.debugLine="i = (Pos + SV2.Height / 2) / cRowHeight";
Debug.ShouldStop(4096);
_i = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_pos,__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0)),__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("i", _i);
 BA.debugLineNum = 2606;BA.debugLine="Private str() As String";
Debug.ShouldStop(8192);
_str = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("str", _str);
 BA.debugLineNum = 2607;BA.debugLine="str = Data.Get(i)";
Debug.ShouldStop(16384);
_str = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)));Debug.locals.put("str", _str);
 BA.debugLineNum = 2608;BA.debugLine="lblFastScroll.Text = str(mFastScrollColumnIndex)";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_str.getArrayElement(true,__ref.getField(true,"_mfastscrollcolumnindex" /*RemoteObject*/ )).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _str.getArrayElement(true,__ref.getField(true,"_mfastscrollcolumnindex" /*RemoteObject*/ )).runMethod(true,"length"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mfastscrolllabelmaxchars" /*RemoteObject*/ )))))))));
 };
 BA.debugLineNum = 2611;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cell_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Cell_Click (table) ","table",20,__ref.getField(false, "ba"),__ref,1594);
if (RapidSub.canDelegate("cell_click")) { return __ref.runUserSub(false, "table","cell_click", __ref);}
RemoteObject _rc = RemoteObject.declareNull("b4a.example.ef.table._rowcol");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 1594;BA.debugLine="Private Sub Cell_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1595;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(67108864);
_rc = RemoteObject.createNew ("b4a.example.ef.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1596;BA.debugLine="Dim L As Label";
Debug.ShouldStop(134217728);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 1597;BA.debugLine="L = Sender";
Debug.ShouldStop(268435456);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("L", _l);
 BA.debugLineNum = 1598;BA.debugLine="rc = L.Tag";
Debug.ShouldStop(536870912);
_rc = (_l.runMethod(false,"getTag"));Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1601;BA.debugLine="SelectRow(rc)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.ef.table.class, "_selectrow" /*RemoteObject*/ ,(Object)(_rc));
 BA.debugLineNum = 1602;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellClick\"";
Debug.ShouldStop(2);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CellClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1603;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellClick\", r";
Debug.ShouldStop(4);
table.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CellClick"))),(Object)((_rc.getField(true,"Col" /*RemoteObject*/ ))),(Object)((_rc.getField(true,"Row" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 1605;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cell_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Cell_LongClick (table) ","table",20,__ref.getField(false, "ba"),__ref,1571);
if (RapidSub.canDelegate("cell_longclick")) { return __ref.runUserSub(false, "table","cell_longclick", __ref);}
RemoteObject _rc = RemoteObject.declareNull("b4a.example.ef.table._rowcol");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 1571;BA.debugLine="Private Sub Cell_LongClick";
Debug.ShouldStop(4);
 BA.debugLineNum = 1573;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(16);
_rc = RemoteObject.createNew ("b4a.example.ef.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1574;BA.debugLine="Dim L As Label";
Debug.ShouldStop(32);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 1575;BA.debugLine="L = Sender";
Debug.ShouldStop(64);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("L", _l);
 BA.debugLineNum = 1576;BA.debugLine="rc = L.Tag";
Debug.ShouldStop(128);
_rc = (_l.runMethod(false,"getTag"));Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1578;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellLongCl";
Debug.ShouldStop(512);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CellLongClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1579;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellLongClick";
Debug.ShouldStop(1024);
table.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CellLongClick"))),(Object)((_rc.getField(true,"Col" /*RemoteObject*/ ))),(Object)((_rc.getField(true,"Row" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 1581;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check1ddoubleallsame(RemoteObject __ref,RemoteObject _arrdouble,RemoteObject _istart,RemoteObject _iend) throws Exception{
try {
		Debug.PushSubsStack("Check1DDoubleAllSame (table) ","table",20,__ref.getField(false, "ba"),__ref,4585);
if (RapidSub.canDelegate("check1ddoubleallsame")) { return __ref.runUserSub(false, "table","check1ddoubleallsame", __ref, _arrdouble, _istart, _iend);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _dval = RemoteObject.createImmutable(0);
Debug.locals.put("arrDouble", _arrdouble);
Debug.locals.put("iStart", _istart);
Debug.locals.put("iEnd", _iend);
 BA.debugLineNum = 4585;BA.debugLine="Sub Check1DDoubleAllSame(arrDouble() As Double, iS";
Debug.ShouldStop(256);
 BA.debugLineNum = 4587;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1024);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 4588;BA.debugLine="Dim dVal As Double";
Debug.ShouldStop(2048);
_dval = RemoteObject.createImmutable(0);Debug.locals.put("dVal", _dval);
 BA.debugLineNum = 4590;BA.debugLine="If arrDouble.Length = 1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_arrdouble.getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 4591;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) return table.__c.getField(true,"True");
 };
 BA.debugLineNum = 4594;BA.debugLine="If iStart = -1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_istart,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4595;BA.debugLine="iStart = 1";
Debug.ShouldStop(262144);
_istart = BA.numberCast(int.class, 1);Debug.locals.put("iStart", _istart);
 };
 BA.debugLineNum = 4598;BA.debugLine="If iEnd = -1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_iend,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4599;BA.debugLine="iEnd = arrDouble.Length - 1";
Debug.ShouldStop(4194304);
_iend = RemoteObject.solve(new RemoteObject[] {_arrdouble.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iEnd", _iend);
 };
 BA.debugLineNum = 4602;BA.debugLine="dVal = arrDouble(0)";
Debug.ShouldStop(33554432);
_dval = _arrdouble.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("dVal", _dval);
 BA.debugLineNum = 4604;BA.debugLine="For i = iStart To iEnd";
Debug.ShouldStop(134217728);
{
final int step13 = 1;
final int limit13 = _iend.<Integer>get().intValue();
_i = _istart ;
for (;(step13 > 0 && _i.<Integer>get().intValue() <= limit13) || (step13 < 0 && _i.<Integer>get().intValue() >= limit13) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4605;BA.debugLine="If arrDouble(i) <> dVal Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",_arrdouble.getArrayElement(true,_i),_dval)) { 
 BA.debugLineNum = 4606;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return table.__c.getField(true,"False");
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4610;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return table.__c.getField(true,"True");
 BA.debugLineNum = 4612;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check1dlongallsame(RemoteObject __ref,RemoteObject _arrlong,RemoteObject _istart,RemoteObject _iend) throws Exception{
try {
		Debug.PushSubsStack("Check1DLongAllSame (table) ","table",20,__ref.getField(false, "ba"),__ref,4506);
if (RapidSub.canDelegate("check1dlongallsame")) { return __ref.runUserSub(false, "table","check1dlongallsame", __ref, _arrlong, _istart, _iend);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lval = RemoteObject.createImmutable(0L);
Debug.locals.put("arrLong", _arrlong);
Debug.locals.put("iStart", _istart);
Debug.locals.put("iEnd", _iend);
 BA.debugLineNum = 4506;BA.debugLine="Sub Check1DLongAllSame(arrLong() As Long, iStart A";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 4508;BA.debugLine="Dim i As Int";
Debug.ShouldStop(134217728);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 4509;BA.debugLine="Dim lVal As Long";
Debug.ShouldStop(268435456);
_lval = RemoteObject.createImmutable(0L);Debug.locals.put("lVal", _lval);
 BA.debugLineNum = 4511;BA.debugLine="If arrLong.Length = 1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_arrlong.getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 4512;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return table.__c.getField(true,"True");
 };
 BA.debugLineNum = 4515;BA.debugLine="If iStart = -1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_istart,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4516;BA.debugLine="iStart = 1";
Debug.ShouldStop(8);
_istart = BA.numberCast(int.class, 1);Debug.locals.put("iStart", _istart);
 };
 BA.debugLineNum = 4519;BA.debugLine="If iEnd = -1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_iend,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4520;BA.debugLine="iEnd = arrLong.Length - 1";
Debug.ShouldStop(128);
_iend = RemoteObject.solve(new RemoteObject[] {_arrlong.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iEnd", _iend);
 };
 BA.debugLineNum = 4523;BA.debugLine="lVal = arrLong(0)";
Debug.ShouldStop(1024);
_lval = _arrlong.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("lVal", _lval);
 BA.debugLineNum = 4525;BA.debugLine="For i = iStart To iEnd";
Debug.ShouldStop(4096);
{
final int step13 = 1;
final int limit13 = _iend.<Integer>get().intValue();
_i = _istart ;
for (;(step13 > 0 && _i.<Integer>get().intValue() <= limit13) || (step13 < 0 && _i.<Integer>get().intValue() >= limit13) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4526;BA.debugLine="If arrLong(i) <> lVal Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",_arrlong.getArrayElement(true,_i),_lval)) { 
 BA.debugLineNum = 4527;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) return table.__c.getField(true,"False");
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4531;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) return table.__c.getField(true,"True");
 BA.debugLineNum = 4533;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check1dstringallsame(RemoteObject __ref,RemoteObject _arrstring,RemoteObject _bcaseinsensitive,RemoteObject _istart,RemoteObject _iend) throws Exception{
try {
		Debug.PushSubsStack("Check1DStringAllSame (table) ","table",20,__ref.getField(false, "ba"),__ref,4768);
if (RapidSub.canDelegate("check1dstringallsame")) { return __ref.runUserSub(false, "table","check1dstringallsame", __ref, _arrstring, _bcaseinsensitive, _istart, _iend);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("arrstring", _arrstring);
Debug.locals.put("bCaseInsensitive", _bcaseinsensitive);
Debug.locals.put("iStart", _istart);
Debug.locals.put("iEnd", _iend);
 BA.debugLineNum = 4768;BA.debugLine="Sub Check1DStringAllSame(arrstring() As String, bC";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 4770;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 4771;BA.debugLine="Dim str As String";
Debug.ShouldStop(4);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 4773;BA.debugLine="If arrstring.Length = 1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_arrstring.getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 4774;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) return table.__c.getField(true,"True");
 };
 BA.debugLineNum = 4777;BA.debugLine="If iStart = -1 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_istart,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4778;BA.debugLine="iStart = 1";
Debug.ShouldStop(512);
_istart = BA.numberCast(int.class, 1);Debug.locals.put("iStart", _istart);
 };
 BA.debugLineNum = 4781;BA.debugLine="If iEnd = -1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_iend,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4782;BA.debugLine="iEnd = arrstring.Length - 1";
Debug.ShouldStop(8192);
_iend = RemoteObject.solve(new RemoteObject[] {_arrstring.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iEnd", _iend);
 };
 BA.debugLineNum = 4785;BA.debugLine="If bCaseInsensitive Then";
Debug.ShouldStop(65536);
if (_bcaseinsensitive.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4786;BA.debugLine="str = arrstring(0).ToLowerCase";
Debug.ShouldStop(131072);
_str = _arrstring.getArrayElement(true,BA.numberCast(int.class, 0)).runMethod(true,"toLowerCase");Debug.locals.put("str", _str);
 BA.debugLineNum = 4787;BA.debugLine="For i = iStart To iEnd";
Debug.ShouldStop(262144);
{
final int step14 = 1;
final int limit14 = _iend.<Integer>get().intValue();
_i = _istart ;
for (;(step14 > 0 && _i.<Integer>get().intValue() <= limit14) || (step14 < 0 && _i.<Integer>get().intValue() >= limit14) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4788;BA.debugLine="If arrstring(i).ToLowerCase.CompareTo(str) <> 0";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_arrstring.getArrayElement(true,_i).runMethod(true,"toLowerCase").runMethod(true,"compareTo",(Object)(_str)),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 4789;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
if (true) return table.__c.getField(true,"False");
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 4793;BA.debugLine="str = arrstring(0)";
Debug.ShouldStop(16777216);
_str = _arrstring.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("str", _str);
 BA.debugLineNum = 4794;BA.debugLine="For i = iStart To iEnd";
Debug.ShouldStop(33554432);
{
final int step21 = 1;
final int limit21 = _iend.<Integer>get().intValue();
_i = _istart ;
for (;(step21 > 0 && _i.<Integer>get().intValue() <= limit21) || (step21 < 0 && _i.<Integer>get().intValue() >= limit21) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4795;BA.debugLine="If arrstring(i).CompareTo(str) <> 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",_arrstring.getArrayElement(true,_i).runMethod(true,"compareTo",(Object)(_str)),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 4796;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) return table.__c.getField(true,"False");
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 4801;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return table.__c.getField(true,"True");
 BA.debugLineNum = 4803;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkcolumndatatypes(RemoteObject __ref,RemoteObject _mycurs) throws Exception{
try {
		Debug.PushSubsStack("CheckColumnDataTypes (table) ","table",20,__ref.getField(false, "ba"),__ref,3456);
if (RapidSub.canDelegate("checkcolumndatatypes")) { return __ref.runUserSub(false, "table","checkcolumndatatypes", __ref, _mycurs);}
RemoteObject _nbcols = RemoteObject.createImmutable(0);
RemoteObject _nbrows = RemoteObject.createImmutable(0);
RemoteObject _columntypes = null;
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
Debug.locals.put("MyCurs", _mycurs);
 BA.debugLineNum = 3456;BA.debugLine="Private Sub CheckColumnDataTypes(MyCurs As Cursor)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 3457;BA.debugLine="Private NbCols, NbRows As Int";
Debug.ShouldStop(1);
_nbcols = RemoteObject.createImmutable(0);Debug.locals.put("NbCols", _nbcols);
_nbrows = RemoteObject.createImmutable(0);Debug.locals.put("NbRows", _nbrows);
 BA.debugLineNum = 3458;BA.debugLine="NbCols = MyCurs.ColumnCount";
Debug.ShouldStop(2);
_nbcols = _mycurs.runMethod(true,"getColumnCount");Debug.locals.put("NbCols", _nbcols);
 BA.debugLineNum = 3459;BA.debugLine="NbRows = MyCurs.RowCount";
Debug.ShouldStop(4);
_nbrows = _mycurs.runMethod(true,"getRowCount");Debug.locals.put("NbRows", _nbrows);
 BA.debugLineNum = 3461;BA.debugLine="Private ColumnTypes(NbCols), str As String";
Debug.ShouldStop(16);
_columntypes = RemoteObject.createNewArray ("String", new int[] {_nbcols.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("ColumnTypes", _columntypes);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3462;BA.debugLine="Private col, row As Int";
Debug.ShouldStop(32);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 3464;BA.debugLine="For col = 0 To NbCols - 1";
Debug.ShouldStop(128);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_nbcols,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _col.<Integer>get().intValue() <= limit6) || (step6 < 0 && _col.<Integer>get().intValue() >= limit6) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3465;BA.debugLine="ColumnTypes(col) = \"T\"";
Debug.ShouldStop(256);
_columntypes.setArrayElement (BA.ObjectToString("T"),_col);
 BA.debugLineNum = 3466;BA.debugLine="For row = 0 To NbRows - 1";
Debug.ShouldStop(512);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_nbrows,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && _row.<Integer>get().intValue() <= limit8) || (step8 < 0 && _row.<Integer>get().intValue() >= limit8) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3467;BA.debugLine="MyCurs.Position = row";
Debug.ShouldStop(1024);
_mycurs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3468;BA.debugLine="str = MyCurs.GetString2(col)";
Debug.ShouldStop(2048);
_str = _mycurs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3469;BA.debugLine="If str = Null Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("n",_str)) { 
 BA.debugLineNum = 3470;BA.debugLine="str = \"\"";
Debug.ShouldStop(8192);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 3472;BA.debugLine="If IsNumber(str) Then";
Debug.ShouldStop(32768);
if (table.__c.runMethod(true,"IsNumber",(Object)(_str)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3473;BA.debugLine="If str.Contains(\".\") Then";
Debug.ShouldStop(65536);
if (_str.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3474;BA.debugLine="ColumnTypes(col) = \"R\"";
Debug.ShouldStop(131072);
_columntypes.setArrayElement (BA.ObjectToString("R"),_col);
 }else {
 BA.debugLineNum = 3476;BA.debugLine="ColumnTypes(col) = \"I\"";
Debug.ShouldStop(524288);
_columntypes.setArrayElement (BA.ObjectToString("I"),_col);
 };
 }else {
 BA.debugLineNum = 3479;BA.debugLine="ColumnTypes(col) = \"T\"";
Debug.ShouldStop(4194304);
_columntypes.setArrayElement (BA.ObjectToString("T"),_col);
 BA.debugLineNum = 3480;BA.debugLine="Exit";
Debug.ShouldStop(8388608);
if (true) break;
 };
 }
}Debug.locals.put("row", _row);
;
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3485;BA.debugLine="Return ColumnTypes";
Debug.ShouldStop(268435456);
if (true) return _columntypes;
 BA.debugLineNum = 3486;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 415;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 417;BA.debugLine="Private StringUtils1 As StringUtils";
table._stringutils1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_stringutils1",table._stringutils1);
 //BA.debugLineNum = 418;BA.debugLine="Private SV2 As ScrollView2D";
table._sv2 = RemoteObject.createNew ("flm.b4a.scrollview2d.ScrollView2DWrapper");__ref.setField("_sv2",table._sv2);
 //BA.debugLineNum = 419;BA.debugLine="Private SVF As ScrollView";
table._svf = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_svf",table._svf);
 //BA.debugLineNum = 420;BA.debugLine="Private pnlTable As Panel";
table._pnltable = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnltable",table._pnltable);
 //BA.debugLineNum = 421;BA.debugLine="Private Header, HeaderBase As Panel";
table._header = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_header",table._header);
table._headerbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_headerbase",table._headerbase);
 //BA.debugLineNum = 422;BA.debugLine="Private HeaderFirst As Panel";
table._headerfirst = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_headerfirst",table._headerfirst);
 //BA.debugLineNum = 423;BA.debugLine="Private lblStatusLine As Label";
table._lblstatusline = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblstatusline",table._lblstatusline);
 //BA.debugLineNum = 425;BA.debugLine="Private pnlFastScroll As Panel";
table._pnlfastscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlfastscroll",table._pnlfastscroll);
 //BA.debugLineNum = 426;BA.debugLine="Private pnlFastScrollCursor As Panel";
table._pnlfastscrollcursor = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlfastscrollcursor",table._pnlfastscrollcursor);
 //BA.debugLineNum = 427;BA.debugLine="Private FScCursorWidth = 25dip As Int";
table._fsccursorwidth = table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)));__ref.setField("_fsccursorwidth",table._fsccursorwidth);
 //BA.debugLineNum = 428;BA.debugLine="Private FScCursorHeight = 60dip As Int";
table._fsccursorheight = table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)));__ref.setField("_fsccursorheight",table._fsccursorheight);
 //BA.debugLineNum = 429;BA.debugLine="Private FscLabelTopDelta As Int";
table._fsclabeltopdelta = RemoteObject.createImmutable(0);__ref.setField("_fsclabeltopdelta",table._fsclabeltopdelta);
 //BA.debugLineNum = 430;BA.debugLine="Private FScBackgroundColor = Colors.ARGB(48, 128,";
table._fscbackgroundcolor = table.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 48)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 128)));__ref.setField("_fscbackgroundcolor",table._fscbackgroundcolor);
 //BA.debugLineNum = 431;BA.debugLine="Private FScCursorCol1 = Colors.Blue As Int";
table._fsccursorcol1 = table.__c.getField(false,"Colors").getField(true,"Blue");__ref.setField("_fsccursorcol1",table._fsccursorcol1);
 //BA.debugLineNum = 432;BA.debugLine="Private FScCursorCol2 = Colors.Yellow As Int";
table._fsccursorcol2 = table.__c.getField(false,"Colors").getField(true,"Yellow");__ref.setField("_fsccursorcol2",table._fsccursorcol2);
 //BA.debugLineNum = 433;BA.debugLine="Private lblFastScroll As Label";
table._lblfastscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfastscroll",table._lblfastscroll);
 //BA.debugLineNum = 434;BA.debugLine="Private FSY0, FSdY, FastScrollHeight As Int";
table._fsy0 = RemoteObject.createImmutable(0);__ref.setField("_fsy0",table._fsy0);
table._fsdy = RemoteObject.createImmutable(0);__ref.setField("_fsdy",table._fsdy);
table._fastscrollheight = RemoteObject.createImmutable(0);__ref.setField("_fastscrollheight",table._fastscrollheight);
 //BA.debugLineNum = 435;BA.debugLine="Private FScScale As Double";
table._fscscale = RemoteObject.createImmutable(0);__ref.setField("_fscscale",table._fscscale);
 //BA.debugLineNum = 436;BA.debugLine="Private FScTimer As Timer";
table._fsctimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_fsctimer",table._fsctimer);
 //BA.debugLineNum = 437;BA.debugLine="Private mFastScroll = False As Boolean";
table._mfastscroll = table.__c.getField(true,"False");__ref.setField("_mfastscroll",table._mfastscroll);
 //BA.debugLineNum = 438;BA.debugLine="Private FastScrollActive As Boolean";
table._fastscrollactive = RemoteObject.createImmutable(false);__ref.setField("_fastscrollactive",table._fastscrollactive);
 //BA.debugLineNum = 439;BA.debugLine="Private mFastScrollColumnIndex = 0 As Int";
table._mfastscrollcolumnindex = BA.numberCast(int.class, 0);__ref.setField("_mfastscrollcolumnindex",table._mfastscrollcolumnindex);
 //BA.debugLineNum = 440;BA.debugLine="Private mFastScrollMinItems = 50 As Int";
table._mfastscrollminitems = BA.numberCast(int.class, 50);__ref.setField("_mfastscrollminitems",table._mfastscrollminitems);
 //BA.debugLineNum = 441;BA.debugLine="Private mFastScrollShowLabel = True As Boolean";
table._mfastscrollshowlabel = table.__c.getField(true,"True");__ref.setField("_mfastscrollshowlabel",table._mfastscrollshowlabel);
 //BA.debugLineNum = 442;BA.debugLine="Private mFastScrollFixedLabel = False As Boolean";
table._mfastscrollfixedlabel = table.__c.getField(true,"False");__ref.setField("_mfastscrollfixedlabel",table._mfastscrollfixedlabel);
 //BA.debugLineNum = 443;BA.debugLine="Private mFastScrollLabelMaxChars = 10 As Int";
table._mfastscrolllabelmaxchars = BA.numberCast(int.class, 10);__ref.setField("_mfastscrolllabelmaxchars",table._mfastscrolllabelmaxchars);
 //BA.debugLineNum = 444;BA.debugLine="Private mFastScrollLabelWidth = 150dip As Int";
table._mfastscrolllabelwidth = table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)));__ref.setField("_mfastscrolllabelwidth",table._mfastscrolllabelwidth);
 //BA.debugLineNum = 445;BA.debugLine="Private mFastScrollLabelHeight = 30dip As Int";
table._mfastscrolllabelheight = table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)));__ref.setField("_mfastscrolllabelheight",table._mfastscrolllabelheight);
 //BA.debugLineNum = 447;BA.debugLine="Private cCallBack As Object";
table._ccallback = RemoteObject.createNew ("Object");__ref.setField("_ccallback",table._ccallback);
 //BA.debugLineNum = 448;BA.debugLine="Private cEventName As String";
table._ceventname = RemoteObject.createImmutable("");__ref.setField("_ceventname",table._ceventname);
 //BA.debugLineNum = 449;BA.debugLine="Private cLeft, cTop , cWidth, cHeight As Int";
table._cleft = RemoteObject.createImmutable(0);__ref.setField("_cleft",table._cleft);
table._ctop = RemoteObject.createImmutable(0);__ref.setField("_ctop",table._ctop);
table._cwidth = RemoteObject.createImmutable(0);__ref.setField("_cwidth",table._cwidth);
table._cheight = RemoteObject.createImmutable(0);__ref.setField("_cheight",table._cheight);
 //BA.debugLineNum = 450;BA.debugLine="Public HeaderNames As List";
table._headernames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_headernames",table._headernames);
 //BA.debugLineNum = 451;BA.debugLine="Public SelectedRows As List ' selected rows ' con";
table._selectedrows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_selectedrows",table._selectedrows);
 //BA.debugLineNum = 452;BA.debugLine="Private SelectedCol As Int";
table._selectedcol = RemoteObject.createImmutable(0);__ref.setField("_selectedcol",table._selectedcol);
 //BA.debugLineNum = 453;BA.debugLine="Public Data As List";
table._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_data",table._data);
 //BA.debugLineNum = 454;BA.debugLine="Private LabelsCache As List";
table._labelscache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_labelscache",table._labelscache);
 //BA.debugLineNum = 455;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
table._minvisiblerow = RemoteObject.createImmutable(0);__ref.setField("_minvisiblerow",table._minvisiblerow);
table._maxvisiblerow = RemoteObject.createImmutable(0);__ref.setField("_maxvisiblerow",table._maxvisiblerow);
 //BA.debugLineNum = 456;BA.debugLine="Private IsVisible As Boolean";
table._isvisible = RemoteObject.createImmutable(false);__ref.setField("_isvisible",table._isvisible);
 //BA.debugLineNum = 457;BA.debugLine="Public visibleRows As Map";
table._visiblerows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_visiblerows",table._visiblerows);
 //BA.debugLineNum = 458;BA.debugLine="Private mNumberOfColumns, ColumnWidths(), cColumn";
table._mnumberofcolumns = RemoteObject.createImmutable(0);__ref.setField("_mnumberofcolumns",table._mnumberofcolumns);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
table._ccolumncolors = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_ccolumncolors",table._ccolumncolors);
table._ctextcolors = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_ctextcolors",table._ctextcolors);
table._cheadercolors = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_cheadercolors",table._cheadercolors);
table._cheadertextcolors = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_cheadertextcolors",table._cheadertextcolors);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 //BA.debugLineNum = 459;BA.debugLine="Private cColumnDataType() As String";
table._ccolumndatatype = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});__ref.setField("_ccolumndatatype",table._ccolumndatatype);
 //BA.debugLineNum = 460;BA.debugLine="Private cRowHeight, cHeaderColor, cTableColor, cT";
table._crowheight = RemoteObject.createImmutable(0);__ref.setField("_crowheight",table._crowheight);
table._cheadercolor = RemoteObject.createImmutable(0);__ref.setField("_cheadercolor",table._cheadercolor);
table._ctablecolor = RemoteObject.createImmutable(0);__ref.setField("_ctablecolor",table._ctablecolor);
table._ctextcolor = RemoteObject.createImmutable(0);__ref.setField("_ctextcolor",table._ctextcolor);
table._cheaderheight = RemoteObject.createImmutable(0);__ref.setField("_cheaderheight",table._cheaderheight);
table._cheadertextcolor = RemoteObject.createImmutable(0);__ref.setField("_cheadertextcolor",table._cheadertextcolor);
table._cstatuslineheight = RemoteObject.createImmutable(0);__ref.setField("_cstatuslineheight",table._cstatuslineheight);
 //BA.debugLineNum = 461;BA.debugLine="Private cAutomaticWidths = False As Boolean";
table._cautomaticwidths = table.__c.getField(true,"False");__ref.setField("_cautomaticwidths",table._cautomaticwidths);
 //BA.debugLineNum = 462;BA.debugLine="Private cTextSize As Float";
table._ctextsize = RemoteObject.createImmutable(0f);__ref.setField("_ctextsize",table._ctextsize);
 //BA.debugLineNum = 463;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
 //BA.debugLineNum = 464;BA.debugLine="Private cAlignment As Int";
table._calignment = RemoteObject.createImmutable(0);__ref.setField("_calignment",table._calignment);
 //BA.debugLineNum = 465;BA.debugLine="Private cAlignments() As Int";
table._calignments = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_calignments",table._calignments);
 //BA.debugLineNum = 466;BA.debugLine="Private cAlignments0() As Int";
table._calignments0 = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_calignments0",table._calignments0);
 //BA.debugLineNum = 467;BA.debugLine="Private MultiAlignments = False As Boolean";
table._multialignments = table.__c.getField(true,"False");__ref.setField("_multialignments",table._multialignments);
 //BA.debugLineNum = 468;BA.debugLine="Private MultiTypeFace = False As Boolean";
table._multitypeface = table.__c.getField(true,"False");__ref.setField("_multitypeface",table._multitypeface);
 //BA.debugLineNum = 469;BA.debugLine="Private MultiTextColors = False As Boolean";
table._multitextcolors = table.__c.getField(true,"False");__ref.setField("_multitextcolors",table._multitextcolors);
 //BA.debugLineNum = 470;BA.debugLine="Private cHeaderAlignment = Gravity.CENTER As Int";
table._cheaderalignment = table.__c.getField(false,"Gravity").getField(true,"CENTER");__ref.setField("_cheaderalignment",table._cheaderalignment);
 //BA.debugLineNum = 471;BA.debugLine="Private cHeaderAlignments() As Int";
table._cheaderalignments = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_cheaderalignments",table._cheaderalignments);
 //BA.debugLineNum = 472;BA.debugLine="Private cHeaderAlignments0() As Int";
table._cheaderalignments0 = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_cheaderalignments0",table._cheaderalignments0);
 //BA.debugLineNum = 473;BA.debugLine="Private HeaderMultiAlignments = False As Boolean";
table._headermultialignments = table.__c.getField(true,"False");__ref.setField("_headermultialignments",table._headermultialignments);
 //BA.debugLineNum = 474;BA.debugLine="Private cTypeFace = Typeface.DEFAULT As Typeface";
table._ctypeface = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
table._ctypeface = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), table.__c.getField(false,"Typeface").getField(false,"DEFAULT"));__ref.setField("_ctypeface",table._ctypeface);
 //BA.debugLineNum = 475;BA.debugLine="Private cTypeFaces() As Typeface";
table._ctypefaces = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {0}, new Object[]{});__ref.setField("_ctypefaces",table._ctypefaces);
 //BA.debugLineNum = 476;BA.debugLine="Private cTypeFaces0() As Typeface";
table._ctypefaces0 = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {0}, new Object[]{});__ref.setField("_ctypefaces0",table._ctypefaces0);
 //BA.debugLineNum = 477;BA.debugLine="Private HeaderMultiTypeFace = False As Boolean";
table._headermultitypeface = table.__c.getField(true,"False");__ref.setField("_headermultitypeface",table._headermultitypeface);
 //BA.debugLineNum = 478;BA.debugLine="Private cHeaderTypeFace = Typeface.DEFAULT As Typ";
table._cheadertypeface = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
table._cheadertypeface = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), table.__c.getField(false,"Typeface").getField(false,"DEFAULT"));__ref.setField("_cheadertypeface",table._cheadertypeface);
 //BA.debugLineNum = 479;BA.debugLine="Private cHeaderTypeFaces() As Typeface";
table._cheadertypefaces = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {0}, new Object[]{});__ref.setField("_cheadertypefaces",table._cheadertypefaces);
 //BA.debugLineNum = 480;BA.debugLine="Private cHeaderTypeFaces0() As Typeface";
table._cheadertypefaces0 = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {0}, new Object[]{});__ref.setField("_cheadertypefaces0",table._cheadertypefaces0);
 //BA.debugLineNum = 481;BA.debugLine="Private cLineWidth = Max(1, 1dip) As Int";
table._clinewidth = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))))));__ref.setField("_clinewidth",table._clinewidth);
 //BA.debugLineNum = 482;BA.debugLine="Private ExtraWidth = 12dip + cLineWidth	As Int";
table._extrawidth = RemoteObject.solve(new RemoteObject[] {table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12))),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "+",1, 1);__ref.setField("_extrawidth",table._extrawidth);
 //BA.debugLineNum = 483;BA.debugLine="Private SelectedDrawable(), Drawable1(), Drawable";
table._selecteddrawable = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setField("_selecteddrawable",table._selecteddrawable);
table._drawable1 = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setField("_drawable1",table._drawable1);
table._drawable2 = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setField("_drawable2",table._drawable2);
table._columndrawables = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setField("_columndrawables",table._columndrawables);
 //BA.debugLineNum = 484;BA.debugLine="Private SelectedCellDrawable As Object";
table._selectedcelldrawable = RemoteObject.createNew ("Object");__ref.setField("_selectedcelldrawable",table._selectedcelldrawable);
 //BA.debugLineNum = 485;BA.debugLine="Private cRowColor1, cRowColor2, cSelectedRowColor";
table._crowcolor1 = RemoteObject.createImmutable(0);__ref.setField("_crowcolor1",table._crowcolor1);
table._crowcolor2 = RemoteObject.createImmutable(0);__ref.setField("_crowcolor2",table._crowcolor2);
table._cselectedrowcolor = RemoteObject.createImmutable(0);__ref.setField("_cselectedrowcolor",table._cselectedrowcolor);
table._cselectedcellcolor = RemoteObject.createImmutable(0);__ref.setField("_cselectedcellcolor",table._cselectedcellcolor);
table._cselectedrowtextcolor = RemoteObject.createImmutable(0);__ref.setField("_cselectedrowtextcolor",table._cselectedrowtextcolor);
table._cselectedcelltextcolor = RemoteObject.createImmutable(0);__ref.setField("_cselectedcelltextcolor",table._cselectedcelltextcolor);
 //BA.debugLineNum = 486;BA.debugLine="Private cSortColumn = True As Boolean";
table._csortcolumn = table.__c.getField(true,"True");__ref.setField("_csortcolumn",table._csortcolumn);
 //BA.debugLineNum = 487;BA.debugLine="Private cUseColumnColors = False As Boolean";
table._cusecolumncolors = table.__c.getField(true,"False");__ref.setField("_cusecolumncolors",table._cusecolumncolors);
 //BA.debugLineNum = 488;BA.debugLine="Private cSortRemoveAccents = False As Boolean";
table._csortremoveaccents = table.__c.getField(true,"False");__ref.setField("_csortremoveaccents",table._csortremoveaccents);
 //BA.debugLineNum = 489;BA.debugLine="Private mFirstColumnsWidth = 0 As Int";
table._mfirstcolumnswidth = BA.numberCast(int.class, 0);__ref.setField("_mfirstcolumnswidth",table._mfirstcolumnswidth);
 //BA.debugLineNum = 490;BA.debugLine="Private mFirstColumnFixed = False As Boolean";
table._mfirstcolumnfixed = table.__c.getField(true,"False");__ref.setField("_mfirstcolumnfixed",table._mfirstcolumnfixed);
 //BA.debugLineNum = 491;BA.debugLine="Private mNumberOfFixedColumns As Int";
table._mnumberoffixedcolumns = RemoteObject.createImmutable(0);__ref.setField("_mnumberoffixedcolumns",table._mnumberoffixedcolumns);
 //BA.debugLineNum = 492;BA.debugLine="Private bmp As Bitmap		' used for the canvas belo";
table._bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp",table._bmp);
 //BA.debugLineNum = 493;BA.debugLine="Private cvs As Canvas		' used to measure string w";
table._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvs",table._cvs);
 //BA.debugLineNum = 494;BA.debugLine="Private lstRowColorIndexes As List";
table._lstrowcolorindexes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstrowcolorindexes",table._lstrowcolorindexes);
 //BA.debugLineNum = 495;BA.debugLine="Private lstRowColors As List";
table._lstrowcolors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstrowcolors",table._lstrowcolors);
 //BA.debugLineNum = 496;BA.debugLine="Private lstRowDrawables As List";
table._lstrowdrawables = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstrowdrawables",table._lstrowdrawables);
 //BA.debugLineNum = 498;BA.debugLine="cHeaderColor = Colors.Gray";
__ref.setField ("_cheadercolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").getField(true,"Gray"));
 //BA.debugLineNum = 499;BA.debugLine="cTableColor = Colors.LightGray";
__ref.setField ("_ctablecolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").getField(true,"LightGray"));
 //BA.debugLineNum = 500;BA.debugLine="cTextColor = Colors.Black";
__ref.setField ("_ctextcolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").getField(true,"Black"));
 //BA.debugLineNum = 501;BA.debugLine="cHeaderTextColor = Colors.White";
__ref.setField ("_cheadertextcolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").getField(true,"White"));
 //BA.debugLineNum = 502;BA.debugLine="cTextSize = 14";
__ref.setField ("_ctextsize" /*RemoteObject*/ ,BA.numberCast(float.class, 14));
 //BA.debugLineNum = 503;BA.debugLine="cAlignment = Gravity.CENTER 'change to Gravity.LE";
__ref.setField ("_calignment" /*RemoteObject*/ ,table.__c.getField(false,"Gravity").getField(true,"CENTER"));
 //BA.debugLineNum = 504;BA.debugLine="cRowColor1 = Colors.White";
__ref.setField ("_crowcolor1" /*RemoteObject*/ ,table.__c.getField(false,"Colors").getField(true,"White"));
 //BA.debugLineNum = 505;BA.debugLine="cRowColor2 = 0xFF98F5FF";
__ref.setField ("_crowcolor2" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff98f5ff)));
 //BA.debugLineNum = 506;BA.debugLine="cSelectedRowColor = 0xFF007FFF";
__ref.setField ("_cselectedrowcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff007fff)));
 //BA.debugLineNum = 507;BA.debugLine="cSelectedRowTextColor = Colors.Black";
__ref.setField ("_cselectedrowtextcolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").getField(true,"Black"));
 //BA.debugLineNum = 508;BA.debugLine="cSelectedCellColor = 0xFFFC8EAC";
__ref.setField ("_cselectedcellcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xfffc8eac)));
 //BA.debugLineNum = 509;BA.debugLine="cSelectedCellTextColor = Colors.Black";
__ref.setField ("_cselectedcelltextcolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").getField(true,"Black"));
 //BA.debugLineNum = 510;BA.debugLine="cRowHeight = 40dip";
__ref.setField ("_crowheight" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 //BA.debugLineNum = 511;BA.debugLine="cHeaderHeight = cRowHeight";
__ref.setField ("_cheaderheight" /*RemoteObject*/ ,__ref.getField(true,"_crowheight" /*RemoteObject*/ ));
 //BA.debugLineNum = 512;BA.debugLine="cStatusLineHeight = cRowHeight";
__ref.setField ("_cstatuslineheight" /*RemoteObject*/ ,__ref.getField(true,"_crowheight" /*RemoteObject*/ ));
 //BA.debugLineNum = 514;BA.debugLine="Private cSingleLine = True As Boolean		' does a l";
table._csingleline = table.__c.getField(true,"True");__ref.setField("_csingleline",table._csingleline);
 //BA.debugLineNum = 516;BA.debugLine="Private mMultiSelect As Boolean = False";
table._mmultiselect = table.__c.getField(true,"False");__ref.setField("_mmultiselect",table._mmultiselect);
 //BA.debugLineNum = 517;BA.debugLine="Private cAllowSelection = True As Boolean";
table._callowselection = table.__c.getField(true,"True");__ref.setField("_callowselection",table._callowselection);
 //BA.debugLineNum = 518;BA.debugLine="Private SavedWidths() As Int' to keep the user se";
table._savedwidths = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_savedwidths",table._savedwidths);
 //BA.debugLineNum = 519;BA.debugLine="Private cShowStatusLine As Boolean =True";
table._cshowstatusline = table.__c.getField(true,"True");__ref.setField("_cshowstatusline",table._cshowstatusline);
 //BA.debugLineNum = 521;BA.debugLine="Private internalPanel As Panel";
table._internalpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_internalpanel",table._internalpanel);
 //BA.debugLineNum = 523;BA.debugLine="Public sortingDir As Int = 0 ' -1,0,1 as acc, uns";
table._sortingdir = BA.numberCast(int.class, 0);__ref.setField("_sortingdir",table._sortingdir);
 //BA.debugLineNum = 524;BA.debugLine="Public sortedCol As Int = -1' hold the sorted col";
table._sortedcol = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_sortedcol",table._sortedcol);
 //BA.debugLineNum = 525;BA.debugLine="Private pnlSortingView As Panel";
table._pnlsortingview = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlsortingview",table._pnlsortingview);
 //BA.debugLineNum = 527;BA.debugLine="Private debug_counter As Long";
table._debug_counter = RemoteObject.createImmutable(0L);__ref.setField("_debug_counter",table._debug_counter);
 //BA.debugLineNum = 528;BA.debugLine="Private enableStatusLineAutoFill As Boolean = Tru";
table._enablestatuslineautofill = table.__c.getField(true,"True");__ref.setField("_enablestatuslineautofill",table._enablestatuslineautofill);
 //BA.debugLineNum = 530;BA.debugLine="Private pnlAsc As Panel										'added in versio";
table._pnlasc = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlasc",table._pnlasc);
 //BA.debugLineNum = 531;BA.debugLine="Private bmpAsc, bmpDes, bmpEqual As Bitmap					'a";
table._bmpasc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmpasc",table._bmpasc);
table._bmpdes = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmpdes",table._bmpdes);
table._bmpequal = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmpequal",table._bmpequal);
 //BA.debugLineNum = 532;BA.debugLine="Private cvsAsc, cvsDes, cvsEqual As Canvas					'a";
table._cvsasc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvsasc",table._cvsasc);
table._cvsdes = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvsdes",table._cvsdes);
table._cvsequal = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvsequal",table._cvsequal);
 //BA.debugLineNum = 533;BA.debugLine="Private cSortBitmapWidth As Int						'added in ve";
table._csortbitmapwidth = RemoteObject.createImmutable(0);__ref.setField("_csortbitmapwidth",table._csortbitmapwidth);
 //BA.debugLineNum = 534;BA.debugLine="Private cSortBitmapHeight As Int					'added in ve";
table._csortbitmapheight = RemoteObject.createImmutable(0);__ref.setField("_csortbitmapheight",table._csortbitmapheight);
 //BA.debugLineNum = 535;BA.debugLine="Private cSortBitmapColor As Int						'added in ve";
table._csortbitmapcolor = RemoteObject.createImmutable(0);__ref.setField("_csortbitmapcolor",table._csortbitmapcolor);
 //BA.debugLineNum = 536;BA.debugLine="Private mCustomSortingBitmaps As Boolean	'added i";
table._mcustomsortingbitmaps = RemoteObject.createImmutable(false);__ref.setField("_mcustomsortingbitmaps",table._mcustomsortingbitmaps);
 //BA.debugLineNum = 537;BA.debugLine="Private mZeroSelection = False As Boolean";
table._mzeroselection = table.__c.getField(true,"False");__ref.setField("_mzeroselection",table._mzeroselection);
 //BA.debugLineNum = 538;BA.debugLine="Private SV2Scrolls, SVFScrolls As Boolean";
table._sv2scrolls = RemoteObject.createImmutable(false);__ref.setField("_sv2scrolls",table._sv2scrolls);
table._svfscrolls = RemoteObject.createImmutable(false);__ref.setField("_svfscrolls",table._svfscrolls);
 //BA.debugLineNum = 539;BA.debugLine="Private SV2PosX As Int";
table._sv2posx = RemoteObject.createImmutable(0);__ref.setField("_sv2posx",table._sv2posx);
 //BA.debugLineNum = 540;BA.debugLine="Public TableObject As Table";
table._tableobject = RemoteObject.createNew ("b4a.example.ef.table");__ref.setField("_tableobject",table._tableobject);
 //BA.debugLineNum = 545;BA.debugLine="Private arrColLong() As Long";
table._arrcollong = RemoteObject.createNewArray ("long", new int[] {0}, new Object[]{});__ref.setField("_arrcollong",table._arrcollong);
 //BA.debugLineNum = 546;BA.debugLine="Private arrColDouble() As Double";
table._arrcoldouble = RemoteObject.createNewArray ("double", new int[] {0}, new Object[]{});__ref.setField("_arrcoldouble",table._arrcoldouble);
 //BA.debugLineNum = 547;BA.debugLine="Private arrColString() As String";
table._arrcolstring = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});__ref.setField("_arrcolstring",table._arrcolstring);
 //BA.debugLineNum = 548;BA.debugLine="Private arrSortIndex() As Int";
table._arrsortindex = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_arrsortindex",table._arrsortindex);
 //BA.debugLineNum = 549;BA.debugLine="Private iPreviousSortColumn As Int = -1 'ignore w";
table._iprevioussortcolumn = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_iprevioussortcolumn",table._iprevioussortcolumn);
 //BA.debugLineNum = 550;BA.debugLine="Private bPreviousSortAscending As Boolean 'ignore";
table._bprevioussortascending = RemoteObject.createImmutable(false);__ref.setField("_bprevioussortascending",table._bprevioussortascending);
 //BA.debugLineNum = 551;BA.debugLine="Private mapSortingIndexes As Map";
table._mapsortingindexes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mapsortingindexes",table._mapsortingindexes);
 //BA.debugLineNum = 552;BA.debugLine="Private arrDataSorted() As Boolean 'added";
table._arrdatasorted = RemoteObject.createNewArray ("boolean", new int[] {0}, new Object[]{});__ref.setField("_arrdatasorted",table._arrdatasorted);
 //BA.debugLineNum = 553;BA.debugLine="Private bDataTempDone As Boolean 'added";
table._bdatatempdone = RemoteObject.createImmutable(false);__ref.setField("_bdatatempdone",table._bdatatempdone);
 //BA.debugLineNum = 554;BA.debugLine="Private DataTemp As List 'added";
table._datatemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_datatemp",table._datatemp);
 //BA.debugLineNum = 555;BA.debugLine="Private mMultiColumnSort As Boolean = False";
table._mmulticolumnsort = table.__c.getField(true,"False");__ref.setField("_mmulticolumnsort",table._mmulticolumnsort);
 //BA.debugLineNum = 556;BA.debugLine="Private mSortCaseInsensitive As Boolean = False";
table._msortcaseinsensitive = table.__c.getField(true,"False");__ref.setField("_msortcaseinsensitive",table._msortcaseinsensitive);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearAll (table) ","table",20,__ref.getField(false, "ba"),__ref,907);
if (RapidSub.canDelegate("clearall")) { return __ref.runUserSub(false, "table","clearall", __ref);}
 BA.debugLineNum = 907;BA.debugLine="Public Sub ClearAll";
Debug.ShouldStop(1024);
 BA.debugLineNum = 908;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 909;BA.debugLine="updateIPLocation";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.table.class, "_updateiplocation" /*RemoteObject*/ );
 BA.debugLineNum = 910;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearselection(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("clearSelection (table) ","table",20,__ref.getField(false, "ba"),__ref,2094);
if (RapidSub.canDelegate("clearselection")) { return __ref.runUserSub(false, "table","clearselection", __ref);}
 BA.debugLineNum = 2094;BA.debugLine="Public Sub clearSelection";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2096;BA.debugLine="SelectedRows.Clear";
Debug.ShouldStop(32768);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 2097;BA.debugLine="RefreshTable";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.ef.table.class, "_refreshtable" /*RemoteObject*/ );
 BA.debugLineNum = 2098;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnewlabels(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateNewLabels (table) ","table",20,__ref.getField(false, "ba"),__ref,1457);
if (RapidSub.canDelegate("createnewlabels")) { return __ref.runUserSub(false, "table","createnewlabels", __ref);}
RemoteObject _lbls = null;
int _i = 0;
RemoteObject _rc = RemoteObject.declareNull("b4a.example.ef.table._rowcol");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 1457;BA.debugLine="Private Sub CreateNewLabels As Label()";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1458;BA.debugLine="Dim lbls(mNumberOfColumns) As Label";
Debug.ShouldStop(131072);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1459;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(262144);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1460;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(524288);
_rc = RemoteObject.createNew ("b4a.example.ef.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1461;BA.debugLine="rc.Col = i";
Debug.ShouldStop(1048576);
_rc.setField ("Col" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 1462;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(2097152);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1463;BA.debugLine="lbl.Initialize(\"Cell\")";
Debug.ShouldStop(4194304);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Cell")));
 BA.debugLineNum = 1465;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(16777216);
_lbl.runMethod(true,"setTextSize",__ref.getField(true,"_ctextsize" /*RemoteObject*/ ));
 BA.debugLineNum = 1467;BA.debugLine="If cUseColumnColors = False Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cusecolumncolors" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1468;BA.debugLine="lbl.TextColor = cTextColor";
Debug.ShouldStop(134217728);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_ctextcolor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 1470;BA.debugLine="lbl.TextColor = cTextColors(i)";
Debug.ShouldStop(536870912);
_lbl.runMethod(true,"setTextColor",__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)));
 };
 BA.debugLineNum = 1473;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1474;BA.debugLine="lbl.Typeface = cTypeFace";
Debug.ShouldStop(2);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject()));
 }else {
 BA.debugLineNum = 1476;BA.debugLine="lbl.Typeface = cTypeFaces(i)";
Debug.ShouldStop(8);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _i)).getObject()));
 };
 BA.debugLineNum = 1479;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.ef.table.class, "_setpadding" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _lbl.getObject()),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 1481;BA.debugLine="lbl.SingleLine = cSingleLine";
Debug.ShouldStop(256);
_lbl.runVoidMethod ("setSingleLine",__ref.getField(true,"_csingleline" /*RemoteObject*/ ));
 BA.debugLineNum = 1482;BA.debugLine="lbl.Tag = rc";
Debug.ShouldStop(512);
_lbl.runMethod(false,"setTag",(_rc));
 BA.debugLineNum = 1483;BA.debugLine="lbls(i) = lbl";
Debug.ShouldStop(1024);
_lbls.setArrayElement (_lbl,BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1485;BA.debugLine="Return lbls";
Debug.ShouldStop(4096);
if (true) return _lbls;
 BA.debugLineNum = 1486;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (table) ","table",20,__ref.getField(false, "ba"),__ref,568);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "table","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 568;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 569;BA.debugLine="pnlTable = Base";
Debug.ShouldStop(16777216);
__ref.setField ("_pnltable" /*RemoteObject*/ ,_base);
 BA.debugLineNum = 571;BA.debugLine="cLeft = Base.Left";
Debug.ShouldStop(67108864);
__ref.setField ("_cleft" /*RemoteObject*/ ,_base.runMethod(true,"getLeft"));
 BA.debugLineNum = 572;BA.debugLine="cTop = Base.Top";
Debug.ShouldStop(134217728);
__ref.setField ("_ctop" /*RemoteObject*/ ,_base.runMethod(true,"getTop"));
 BA.debugLineNum = 573;BA.debugLine="cWidth = Base.Width";
Debug.ShouldStop(268435456);
__ref.setField ("_cwidth" /*RemoteObject*/ ,_base.runMethod(true,"getWidth"));
 BA.debugLineNum = 574;BA.debugLine="cHeight = Base.Height";
Debug.ShouldStop(536870912);
__ref.setField ("_cheight" /*RemoteObject*/ ,_base.runMethod(true,"getHeight"));
 BA.debugLineNum = 575;BA.debugLine="pnlTable.Color = Colors.Transparent";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("setColor",table.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 578;BA.debugLine="Select Props.Get(\"TextAlignment\")";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextAlignment")))),RemoteObject.createImmutable(("LEFT")),RemoteObject.createImmutable(("CENTER")),RemoteObject.createImmutable(("RIGHT")))) {
case 0: {
 BA.debugLineNum = 580;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
Debug.ShouldStop(8);
__ref.setField ("_calignment" /*RemoteObject*/ ,table.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(table.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(table.__c.getField(false,"Gravity").getField(true,"LEFT"))));
 break; }
case 1: {
 BA.debugLineNum = 582;BA.debugLine="cAlignment = Gravity.CENTER";
Debug.ShouldStop(32);
__ref.setField ("_calignment" /*RemoteObject*/ ,table.__c.getField(false,"Gravity").getField(true,"CENTER"));
 break; }
case 2: {
 BA.debugLineNum = 584;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
Debug.ShouldStop(128);
__ref.setField ("_calignment" /*RemoteObject*/ ,table.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(table.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(table.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 break; }
}
;
 BA.debugLineNum = 588;BA.debugLine="Select Props.Get(\"HeaderTextAlignment\")";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HeaderTextAlignment")))),RemoteObject.createImmutable(("LEFT")),RemoteObject.createImmutable(("CENTER")),RemoteObject.createImmutable(("RIGHT")))) {
case 0: {
 BA.debugLineNum = 590;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
Debug.ShouldStop(8192);
__ref.setField ("_cheaderalignment" /*RemoteObject*/ ,table.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(table.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(table.__c.getField(false,"Gravity").getField(true,"LEFT"))));
 break; }
case 1: {
 BA.debugLineNum = 592;BA.debugLine="cHeaderAlignment = Gravity.CENTER";
Debug.ShouldStop(32768);
__ref.setField ("_cheaderalignment" /*RemoteObject*/ ,table.__c.getField(false,"Gravity").getField(true,"CENTER"));
 break; }
case 2: {
 BA.debugLineNum = 594;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
Debug.ShouldStop(131072);
__ref.setField ("_cheaderalignment" /*RemoteObject*/ ,table.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(table.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(table.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 break; }
}
;
 BA.debugLineNum = 597;BA.debugLine="cLineWidth = DipToCurrent(Props.Get(\"LineWidth\"))";
Debug.ShouldStop(1048576);
__ref.setField ("_clinewidth" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("LineWidth"))))))));
 BA.debugLineNum = 599;BA.debugLine="mNumberOfColumns = Props.Get(\"NumberOfColumns\")";
Debug.ShouldStop(4194304);
__ref.setField ("_mnumberofcolumns" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumberOfColumns"))))));
 BA.debugLineNum = 600;BA.debugLine="mNumberOfFixedColumns = Props.Get(\"NumberOfFixedC";
Debug.ShouldStop(8388608);
__ref.setField ("_mnumberoffixedcolumns" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumberOfFixedColumns"))))));
 BA.debugLineNum = 601;BA.debugLine="mFirstColumnFixed = Props.Get(\"FirstColumnFixed\")";
Debug.ShouldStop(16777216);
__ref.setField ("_mfirstcolumnfixed" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstColumnFixed"))))));
 BA.debugLineNum = 602;BA.debugLine="If mFirstColumnFixed = True And mNumberOfFixedCol";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfirstcolumnfixed" /*RemoteObject*/ ),table.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 603;BA.debugLine="mNumberOfFixedColumns = 1";
Debug.ShouldStop(67108864);
__ref.setField ("_mnumberoffixedcolumns" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 605;BA.debugLine="mMultiSelect = Props.Get(\"MultiSelect\")";
Debug.ShouldStop(268435456);
__ref.setField ("_mmultiselect" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MultiSelect"))))));
 BA.debugLineNum = 606;BA.debugLine="cSingleLine = Props.GetDefault(\"SingleLine\", True";
Debug.ShouldStop(536870912);
__ref.setField ("_csingleline" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("SingleLine"))),(Object)((table.__c.getField(true,"True"))))));
 BA.debugLineNum = 607;BA.debugLine="mZeroSelection = Props.Get(\"ZeroSelection\")";
Debug.ShouldStop(1073741824);
__ref.setField ("_mzeroselection" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ZeroSelection"))))));
 BA.debugLineNum = 608;BA.debugLine="cHeaderColor = Props.Get(\"HeaderColor\")";
Debug.ShouldStop(-2147483648);
__ref.setField ("_cheadercolor" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HeaderColor"))))));
 BA.debugLineNum = 609;BA.debugLine="cTableColor = Props.Get(\"TableColor\")";
Debug.ShouldStop(1);
__ref.setField ("_ctablecolor" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TableColor"))))));
 BA.debugLineNum = 610;BA.debugLine="cHeaderTextColor = Props.Get(\"HeaderTextColor\")";
Debug.ShouldStop(2);
__ref.setField ("_cheadertextcolor" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HeaderTextColor"))))));
 BA.debugLineNum = 611;BA.debugLine="cTextColor = Props.Get(\"CellTextColor\")";
Debug.ShouldStop(4);
__ref.setField ("_ctextcolor" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CellTextColor"))))));
 BA.debugLineNum = 612;BA.debugLine="cRowColor1 = Props.Get(\"Row1Color\")";
Debug.ShouldStop(8);
__ref.setField ("_crowcolor1" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Row1Color"))))));
 BA.debugLineNum = 613;BA.debugLine="cRowColor2 = Props.Get(\"Row2Color\")";
Debug.ShouldStop(16);
__ref.setField ("_crowcolor2" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Row2Color"))))));
 BA.debugLineNum = 614;BA.debugLine="cSelectedRowColor = Props.Get(\"SelectedRowColor\")";
Debug.ShouldStop(32);
__ref.setField ("_cselectedrowcolor" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SelectedRowColor"))))));
 BA.debugLineNum = 615;BA.debugLine="cSelectedCellColor = Props.Get(\"SelectedCellColor";
Debug.ShouldStop(64);
__ref.setField ("_cselectedcellcolor" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SelectedCellColor"))))));
 BA.debugLineNum = 617;BA.debugLine="cTextSize = Props.Get(\"TextSize\")";
Debug.ShouldStop(256);
__ref.setField ("_ctextsize" /*RemoteObject*/ ,BA.numberCast(float.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextSize"))))));
 BA.debugLineNum = 619;BA.debugLine="cRowHeight = DipToCurrent(Props.Get(\"RowHeight\"))";
Debug.ShouldStop(1024);
__ref.setField ("_crowheight" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RowHeight"))))))));
 BA.debugLineNum = 620;BA.debugLine="cHeaderHeight = DipToCurrent(Props.Get(\"HeaderHei";
Debug.ShouldStop(2048);
__ref.setField ("_cheaderheight" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HeaderHeight"))))))));
 BA.debugLineNum = 621;BA.debugLine="cShowStatusLine = Props.Get(\"ShowStatusLine\")";
Debug.ShouldStop(4096);
__ref.setField ("_cshowstatusline" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowStatusLine"))))));
 BA.debugLineNum = 622;BA.debugLine="cStatusLineHeight = DipToCurrent(Props.GetDefault";
Debug.ShouldStop(8192);
__ref.setField ("_cstatuslineheight" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("HeaderHeight"))),(Object)(RemoteObject.createImmutable((40))))))));
 BA.debugLineNum = 623;BA.debugLine="cSortColumn = Props.Get(\"SortColumn\")";
Debug.ShouldStop(16384);
__ref.setField ("_csortcolumn" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SortColumn"))))));
 BA.debugLineNum = 624;BA.debugLine="cSortRemoveAccents = Props.Get(\"SortRemoveAccents";
Debug.ShouldStop(32768);
__ref.setField ("_csortremoveaccents" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SortRemoveAccents"))))));
 BA.debugLineNum = 625;BA.debugLine="cSortBitmapWidth = DipToCurrent(Props.Get(\"SortBi";
Debug.ShouldStop(65536);
__ref.setField ("_csortbitmapwidth" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SortBitmapWidth"))))))));
 BA.debugLineNum = 626;BA.debugLine="cSortBitmapColor = Props.Get(\"SortBitmapColor\")";
Debug.ShouldStop(131072);
__ref.setField ("_csortbitmapcolor" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SortBitmapColor"))))));
 BA.debugLineNum = 628;BA.debugLine="mFastScroll = Props.GetDefault(\"FastScroll\", Fals";
Debug.ShouldStop(524288);
__ref.setField ("_mfastscroll" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FastScroll"))),(Object)((table.__c.getField(true,"False"))))));
 BA.debugLineNum = 629;BA.debugLine="mFastScrollMinItems = Props.GetDefault(\"FastScrol";
Debug.ShouldStop(1048576);
__ref.setField ("_mfastscrollminitems" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FastScrollMinItems"))),(Object)(RemoteObject.createImmutable((50))))));
 BA.debugLineNum = 630;BA.debugLine="mFastScrollColumnIndex = Props.GetDefault(\"FastSc";
Debug.ShouldStop(2097152);
__ref.setField ("_mfastscrollcolumnindex" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FastScrollColumnIndex"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 631;BA.debugLine="mFastScrollShowLabel = Props.GetDefault(\"FastScro";
Debug.ShouldStop(4194304);
__ref.setField ("_mfastscrollshowlabel" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FastScrollShowLabel"))),(Object)((table.__c.getField(true,"True"))))));
 BA.debugLineNum = 632;BA.debugLine="mFastScrollFixedLabel = Props.GetDefault(\"FastScr";
Debug.ShouldStop(8388608);
__ref.setField ("_mfastscrollfixedlabel" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FastScrollFixedLabel"))),(Object)((table.__c.getField(true,"False"))))));
 BA.debugLineNum = 633;BA.debugLine="mFastScrollLabelMaxChars = Props.GetDefault(\"Fast";
Debug.ShouldStop(16777216);
__ref.setField ("_mfastscrolllabelmaxchars" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FastScrollLabelMaxChars"))),(Object)(RemoteObject.createImmutable((10))))));
 BA.debugLineNum = 634;BA.debugLine="mFastScrollLabelWidth = DipToCurrent(Props.GetDef";
Debug.ShouldStop(33554432);
__ref.setField ("_mfastscrolllabelwidth" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FastScrollLabelWidth"))),(Object)((table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150))))))))));
 BA.debugLineNum = 635;BA.debugLine="mFastScrollLabelHeight = DipToCurrent(Props.GetDe";
Debug.ShouldStop(67108864);
__ref.setField ("_mfastscrolllabelheight" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FastScrollLabelHeight"))),(Object)((table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))))))));
 BA.debugLineNum = 636;BA.debugLine="mSortCaseInsensitive = Props.GetDefault(\"SortCase";
Debug.ShouldStop(134217728);
__ref.setField ("_msortcaseinsensitive" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("SortCaseInsensitive"))),(Object)((table.__c.getField(true,"False"))))));
 BA.debugLineNum = 637;BA.debugLine="mMultiColumnSort = Props.GetDefault(\"MultiColumnS";
Debug.ShouldStop(268435456);
__ref.setField ("_mmulticolumnsort" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("MultiColumnSort"))),(Object)((table.__c.getField(true,"False"))))));
 BA.debugLineNum = 639;BA.debugLine="InitTable";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.ef.table.class, "_inittable" /*RemoteObject*/ );
 BA.debugLineNum = 640;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawfastscrollcursor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawFastScrollCursor (table) ","table",20,__ref.getField(false, "ba"),__ref,855);
if (RapidSub.canDelegate("drawfastscrollcursor")) { return __ref.runUserSub(false, "table","drawfastscrollcursor", __ref);}
RemoteObject _ptharrow = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");
RemoteObject _cvsfsc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _x1 = RemoteObject.createImmutable(0);
RemoteObject _x2 = RemoteObject.createImmutable(0);
RemoteObject _x3 = RemoteObject.createImmutable(0);
RemoteObject _y1 = RemoteObject.createImmutable(0);
RemoteObject _y2 = RemoteObject.createImmutable(0);
RemoteObject _dd = RemoteObject.createImmutable(0);
RemoteObject _rr = RemoteObject.createImmutable(0);
RemoteObject _rct = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
 BA.debugLineNum = 855;BA.debugLine="Private Sub DrawFastScrollCursor";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 856;BA.debugLine="Private pthArrow As Path";
Debug.ShouldStop(8388608);
_ptharrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");Debug.locals.put("pthArrow", _ptharrow);
 BA.debugLineNum = 857;BA.debugLine="Private cvsFSc As Canvas";
Debug.ShouldStop(16777216);
_cvsfsc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvsFSc", _cvsfsc);
 BA.debugLineNum = 858;BA.debugLine="Private x1, x2, x3, y1, y2, dd, rr As Int";
Debug.ShouldStop(33554432);
_x1 = RemoteObject.createImmutable(0);Debug.locals.put("x1", _x1);
_x2 = RemoteObject.createImmutable(0);Debug.locals.put("x2", _x2);
_x3 = RemoteObject.createImmutable(0);Debug.locals.put("x3", _x3);
_y1 = RemoteObject.createImmutable(0);Debug.locals.put("y1", _y1);
_y2 = RemoteObject.createImmutable(0);Debug.locals.put("y2", _y2);
_dd = RemoteObject.createImmutable(0);Debug.locals.put("dd", _dd);
_rr = RemoteObject.createImmutable(0);Debug.locals.put("rr", _rr);
 BA.debugLineNum = 859;BA.debugLine="Private rct As Rect";
Debug.ShouldStop(67108864);
_rct = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("rct", _rct);
 BA.debugLineNum = 861;BA.debugLine="rr = 7dip";
Debug.ShouldStop(268435456);
_rr = table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)));Debug.locals.put("rr", _rr);
 BA.debugLineNum = 863;BA.debugLine="cvsFSc.Initialize(pnlFastScrollCursor)";
Debug.ShouldStop(1073741824);
_cvsfsc.runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 864;BA.debugLine="rct.Initialize(0, 0, FScCursorWidth, FScCursorHei";
Debug.ShouldStop(-2147483648);
_rct.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ )));
 BA.debugLineNum = 865;BA.debugLine="cvsFSc.DrawRect(rct, Colors.Transparent, True, 1d";
Debug.ShouldStop(1);
_cvsfsc.runVoidMethod ("DrawRect",(Object)((_rct.getObject())),(Object)(table.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 867;BA.debugLine="cvsFSc.DrawCircle(rr, rr, rr, FScCursorCol1, True";
Debug.ShouldStop(4);
_cvsfsc.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _rr)),(Object)(BA.numberCast(float.class, _rr)),(Object)(BA.numberCast(float.class, _rr)),(Object)(__ref.getField(true,"_fsccursorcol1" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 868;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, rr, rr, FS";
Debug.ShouldStop(8);
_cvsfsc.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ ),_rr}, "-",1, 1))),(Object)(BA.numberCast(float.class, _rr)),(Object)(BA.numberCast(float.class, _rr)),(Object)(__ref.getField(true,"_fsccursorcol1" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 869;BA.debugLine="cvsFSc.DrawCircle(rr, FScCursorHeight - rr, rr, F";
Debug.ShouldStop(16);
_cvsfsc.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _rr)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),_rr}, "-",1, 1))),(Object)(BA.numberCast(float.class, _rr)),(Object)(__ref.getField(true,"_fsccursorcol1" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 870;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, FScCursorH";
Debug.ShouldStop(32);
_cvsfsc.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ ),_rr}, "-",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),_rr}, "-",1, 1))),(Object)(BA.numberCast(float.class, _rr)),(Object)(__ref.getField(true,"_fsccursorcol1" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 872;BA.debugLine="rct.Initialize(rr, 0, FScCursorWidth - rr, rr)";
Debug.ShouldStop(128);
_rct.runVoidMethod ("Initialize",(Object)(_rr),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ ),_rr}, "-",1, 1)),(Object)(_rr));
 BA.debugLineNum = 873;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
Debug.ShouldStop(256);
_cvsfsc.runVoidMethod ("DrawRect",(Object)((_rct.getObject())),(Object)(__ref.getField(true,"_fsccursorcol1" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 874;BA.debugLine="rct.Initialize(0, rr, FScCursorWidth, FScCursorHe";
Debug.ShouldStop(512);
_rct.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(_rr),(Object)(__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),_rr}, "-",1, 1)));
 BA.debugLineNum = 875;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
Debug.ShouldStop(1024);
_cvsfsc.runVoidMethod ("DrawRect",(Object)((_rct.getObject())),(Object)(__ref.getField(true,"_fsccursorcol1" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 876;BA.debugLine="rct.Initialize(rr, FScCursorHeight - rr, FScCurso";
Debug.ShouldStop(2048);
_rct.runVoidMethod ("Initialize",(Object)(_rr),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),_rr}, "-",1, 1)),(Object)(__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ )));
 BA.debugLineNum = 877;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
Debug.ShouldStop(4096);
_cvsfsc.runVoidMethod ("DrawRect",(Object)((_rct.getObject())),(Object)(__ref.getField(true,"_fsccursorcol1" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 879;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 - 5dip,";
Debug.ShouldStop(16384);
_cvsfsc.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "/-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ ),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "/-",1, 0))),(Object)(__ref.getField(true,"_fsccursorcol2" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 880;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2, FScCur";
Debug.ShouldStop(32768);
_cvsfsc.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ ),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(true,"_fsccursorcol2" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 881;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 + 5dip,";
Debug.ShouldStop(65536);
_cvsfsc.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "/+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ ),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "/+",1, 0))),(Object)(__ref.getField(true,"_fsccursorcol2" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 883;BA.debugLine="dd = 7dip";
Debug.ShouldStop(262144);
_dd = table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)));Debug.locals.put("dd", _dd);
 BA.debugLineNum = 884;BA.debugLine="x2 = FScCursorWidth / 2";
Debug.ShouldStop(524288);
_x2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("x2", _x2);
 BA.debugLineNum = 885;BA.debugLine="x1 = x2 - dd";
Debug.ShouldStop(1048576);
_x1 = RemoteObject.solve(new RemoteObject[] {_x2,_dd}, "-",1, 1);Debug.locals.put("x1", _x1);
 BA.debugLineNum = 886;BA.debugLine="x3 = x2 + dd";
Debug.ShouldStop(2097152);
_x3 = RemoteObject.solve(new RemoteObject[] {_x2,_dd}, "+",1, 1);Debug.locals.put("x3", _x3);
 BA.debugLineNum = 887;BA.debugLine="y2 = dd";
Debug.ShouldStop(4194304);
_y2 = _dd;Debug.locals.put("y2", _y2);
 BA.debugLineNum = 888;BA.debugLine="y1 = y2 + dd";
Debug.ShouldStop(8388608);
_y1 = RemoteObject.solve(new RemoteObject[] {_y2,_dd}, "+",1, 1);Debug.locals.put("y1", _y1);
 BA.debugLineNum = 889;BA.debugLine="pthArrow.Initialize(x1, y1)";
Debug.ShouldStop(16777216);
_ptharrow.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _x1)),(Object)(BA.numberCast(float.class, _y1)));
 BA.debugLineNum = 890;BA.debugLine="pthArrow.LineTo(x3, y1)";
Debug.ShouldStop(33554432);
_ptharrow.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, _x3)),(Object)(BA.numberCast(float.class, _y1)));
 BA.debugLineNum = 891;BA.debugLine="pthArrow.LineTo(x2, y2)";
Debug.ShouldStop(67108864);
_ptharrow.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, _x2)),(Object)(BA.numberCast(float.class, _y2)));
 BA.debugLineNum = 892;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
Debug.ShouldStop(134217728);
_cvsfsc.runVoidMethod ("DrawPath",(Object)((_ptharrow.getObject())),(Object)(__ref.getField(true,"_fsccursorcol2" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 894;BA.debugLine="x2 = FScCursorWidth / 2";
Debug.ShouldStop(536870912);
_x2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("x2", _x2);
 BA.debugLineNum = 895;BA.debugLine="x1 = x2 - dd";
Debug.ShouldStop(1073741824);
_x1 = RemoteObject.solve(new RemoteObject[] {_x2,_dd}, "-",1, 1);Debug.locals.put("x1", _x1);
 BA.debugLineNum = 896;BA.debugLine="x3 = x2 + dd";
Debug.ShouldStop(-2147483648);
_x3 = RemoteObject.solve(new RemoteObject[] {_x2,_dd}, "+",1, 1);Debug.locals.put("x3", _x3);
 BA.debugLineNum = 897;BA.debugLine="y2 = FScCursorHeight - dd";
Debug.ShouldStop(1);
_y2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),_dd}, "-",1, 1);Debug.locals.put("y2", _y2);
 BA.debugLineNum = 898;BA.debugLine="y1 = y2 - dd";
Debug.ShouldStop(2);
_y1 = RemoteObject.solve(new RemoteObject[] {_y2,_dd}, "-",1, 1);Debug.locals.put("y1", _y1);
 BA.debugLineNum = 899;BA.debugLine="pthArrow.Initialize(x1, y1)";
Debug.ShouldStop(4);
_ptharrow.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _x1)),(Object)(BA.numberCast(float.class, _y1)));
 BA.debugLineNum = 900;BA.debugLine="pthArrow.LineTo(x3, y1)";
Debug.ShouldStop(8);
_ptharrow.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, _x3)),(Object)(BA.numberCast(float.class, _y1)));
 BA.debugLineNum = 901;BA.debugLine="pthArrow.LineTo(x2, y2)";
Debug.ShouldStop(16);
_ptharrow.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, _x2)),(Object)(BA.numberCast(float.class, _y2)));
 BA.debugLineNum = 902;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
Debug.ShouldStop(32);
_cvsfsc.runVoidMethod ("DrawPath",(Object)((_ptharrow.getObject())),(Object)(__ref.getField(true,"_fsccursorcol2" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 903;BA.debugLine="pnlFastScrollCursor.Invalidate";
Debug.ShouldStop(64);
__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 904;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fastscrolltimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FastScrollTimer_Tick (table) ","table",20,__ref.getField(false, "ba"),__ref,2613);
if (RapidSub.canDelegate("fastscrolltimer_tick")) { return __ref.runUserSub(false, "table","fastscrolltimer_tick", __ref);}
 BA.debugLineNum = 2613;BA.debugLine="Private Sub FastScrollTimer_Tick";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2614;BA.debugLine="FScTimer.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_fsctimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",table.__c.getField(true,"False"));
 BA.debugLineNum = 2615;BA.debugLine="lblFastScroll.Visible = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"False"));
 BA.debugLineNum = 2616;BA.debugLine="pnlFastScroll.Visible = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"False"));
 BA.debugLineNum = 2617;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getallowselection(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getAllowSelection (table) ","table",20,__ref.getField(false, "ba"),__ref,2163);
if (RapidSub.canDelegate("getallowselection")) { return __ref.runUserSub(false, "table","getallowselection", __ref);}
 BA.debugLineNum = 2163;BA.debugLine="Public Sub getAllowSelection As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2164;BA.debugLine="Return cAllowSelection";
Debug.ShouldStop(524288);
if (true) return __ref.getField(true,"_callowselection" /*RemoteObject*/ );
 BA.debugLineNum = 2165;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcellalignment(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCellAlignment (table) ","table",20,__ref.getField(false, "ba"),__ref,2653);
if (RapidSub.canDelegate("getcellalignment")) { return __ref.runUserSub(false, "table","getcellalignment", __ref);}
 BA.debugLineNum = 2653;BA.debugLine="Public Sub getCellAlignment As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2654;BA.debugLine="Return cAlignment";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(true,"_calignment" /*RemoteObject*/ );
 BA.debugLineNum = 2655;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolumncolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetColumnColors (table) ","table",20,__ref.getField(false, "ba"),__ref,3564);
if (RapidSub.canDelegate("getcolumncolors")) { return __ref.runUserSub(false, "table","getcolumncolors", __ref);}
 BA.debugLineNum = 3564;BA.debugLine="Public Sub GetColumnColors As Int()";
Debug.ShouldStop(2048);
 BA.debugLineNum = 3565;BA.debugLine="Return cColumnColors";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_ccolumncolors" /*RemoteObject*/ );
 BA.debugLineNum = 3566;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolumndatatype(RemoteObject __ref,RemoteObject _column) throws Exception{
try {
		Debug.PushSubsStack("GetColumnDataType (table) ","table",20,__ref.getField(false, "ba"),__ref,3940);
if (RapidSub.canDelegate("getcolumndatatype")) { return __ref.runUserSub(false, "table","getcolumndatatype", __ref, _column);}
Debug.locals.put("Column", _column);
 BA.debugLineNum = 3940;BA.debugLine="Public Sub GetColumnDataType(Column As Int) As Str";
Debug.ShouldStop(8);
 BA.debugLineNum = 3941;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",_column,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_column,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 3942;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
Debug.ShouldStop(32);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Wrong column index")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 3943;BA.debugLine="Return \"\"";
Debug.ShouldStop(64);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 3946;BA.debugLine="Return cColumnDataType(Column)";
Debug.ShouldStop(512);
if (true) return __ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).getArrayElement(true,_column);
 BA.debugLineNum = 3947;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolumndatatypes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetColumnDataTypes (table) ","table",20,__ref.getField(false, "ba"),__ref,3970);
if (RapidSub.canDelegate("getcolumndatatypes")) { return __ref.runUserSub(false, "table","getcolumndatatypes", __ref);}
 BA.debugLineNum = 3970;BA.debugLine="Public Sub GetColumnDataTypes As String()";
Debug.ShouldStop(2);
 BA.debugLineNum = 3971;BA.debugLine="Return cColumnDataType";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ );
 BA.debugLineNum = 3972;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolumnwidths(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetColumnWidths (table) ","table",20,__ref.getField(false, "ba"),__ref,1034);
if (RapidSub.canDelegate("getcolumnwidths")) { return __ref.runUserSub(false, "table","getcolumnwidths", __ref);}
 BA.debugLineNum = 1034;BA.debugLine="Public Sub GetColumnWidths As Int()";
Debug.ShouldStop(512);
 BA.debugLineNum = 1035;BA.debugLine="Return SavedWidths";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_savedwidths" /*RemoteObject*/ );
 BA.debugLineNum = 1036;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcontrastcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("GetContrastColor (table) ","table",20,__ref.getField(false, "ba"),__ref,4152);
if (RapidSub.canDelegate("getcontrastcolor")) { return __ref.runUserSub(false, "table","getcontrastcolor", __ref, _color);}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
RemoteObject _yiq = RemoteObject.createImmutable(0);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 4152;BA.debugLine="Private Sub GetContrastColor(Color As Int) As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 4153;BA.debugLine="Private a, r, g, b, yiq As Int	'ignore";
Debug.ShouldStop(16777216);
_a = RemoteObject.createImmutable(0);Debug.locals.put("a", _a);
_r = RemoteObject.createImmutable(0);Debug.locals.put("r", _r);
_g = RemoteObject.createImmutable(0);Debug.locals.put("g", _g);
_b = RemoteObject.createImmutable(0);Debug.locals.put("b", _b);
_yiq = RemoteObject.createImmutable(0);Debug.locals.put("yiq", _yiq);
 BA.debugLineNum = 4155;BA.debugLine="a = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
Debug.ShouldStop(67108864);
_a = table.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(table.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff000000))))),(Object)(BA.numberCast(int.class, 24)));Debug.locals.put("a", _a);
 BA.debugLineNum = 4156;BA.debugLine="r = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
Debug.ShouldStop(134217728);
_r = table.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(table.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff0000))))),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("r", _r);
 BA.debugLineNum = 4157;BA.debugLine="g = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00)";
Debug.ShouldStop(268435456);
_g = table.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(table.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff00))))),(Object)(BA.numberCast(int.class, 8)));Debug.locals.put("g", _g);
 BA.debugLineNum = 4158;BA.debugLine="b = Bit.And(Color, 0xff)";
Debug.ShouldStop(536870912);
_b = table.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff))));Debug.locals.put("b", _b);
 BA.debugLineNum = 4160;BA.debugLine="yiq = r * 0.299 + g * 0.587 + b * 0.114";
Debug.ShouldStop(-2147483648);
_yiq = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(0.299),_g,RemoteObject.createImmutable(0.587),_b,RemoteObject.createImmutable(0.114)}, "*+*+*",2, 0));Debug.locals.put("yiq", _yiq);
 BA.debugLineNum = 4162;BA.debugLine="If yiq > 128 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_yiq,BA.numberCast(double.class, 128))) { 
 BA.debugLineNum = 4163;BA.debugLine="Return Colors.Black";
Debug.ShouldStop(4);
if (true) return table.__c.getField(false,"Colors").getField(true,"Black");
 }else {
 BA.debugLineNum = 4165;BA.debugLine="Return Colors.White";
Debug.ShouldStop(16);
if (true) return table.__c.getField(false,"Colors").getField(true,"White");
 };
 BA.debugLineNum = 4167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfastscroll(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFastScroll (table) ","table",20,__ref.getField(false, "ba"),__ref,4172);
if (RapidSub.canDelegate("getfastscroll")) { return __ref.runUserSub(false, "table","getfastscroll", __ref);}
 BA.debugLineNum = 4172;BA.debugLine="Public Sub getFastScroll As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 4173;BA.debugLine="Return mFastScroll";
Debug.ShouldStop(4096);
if (true) return __ref.getField(true,"_mfastscroll" /*RemoteObject*/ );
 BA.debugLineNum = 4174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfastscrollcolumnindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFastScrollColumnIndex (table) ","table",20,__ref.getField(false, "ba"),__ref,4196);
if (RapidSub.canDelegate("getfastscrollcolumnindex")) { return __ref.runUserSub(false, "table","getfastscrollcolumnindex", __ref);}
 BA.debugLineNum = 4196;BA.debugLine="Public Sub getFastScrollColumnIndex As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 4197;BA.debugLine="Return mFastScrollColumnIndex";
Debug.ShouldStop(16);
if (true) return __ref.getField(true,"_mfastscrollcolumnindex" /*RemoteObject*/ );
 BA.debugLineNum = 4198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfastscrollfixedlabel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFastScrollFixedLabel (table) ","table",20,__ref.getField(false, "ba"),__ref,4220);
if (RapidSub.canDelegate("getfastscrollfixedlabel")) { return __ref.runUserSub(false, "table","getfastscrollfixedlabel", __ref);}
 BA.debugLineNum = 4220;BA.debugLine="Public Sub getFastScrollFixedLabel As Boolean";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 4221;BA.debugLine="Return mFastScrollFixedLabel";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(true,"_mfastscrollfixedlabel" /*RemoteObject*/ );
 BA.debugLineNum = 4222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfastscrolllabelheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFastScrollLabelHeight (table) ","table",20,__ref.getField(false, "ba"),__ref,4261);
if (RapidSub.canDelegate("getfastscrolllabelheight")) { return __ref.runUserSub(false, "table","getfastscrolllabelheight", __ref);}
 BA.debugLineNum = 4261;BA.debugLine="Public Sub getFastScrollLabelHeight As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 4262;BA.debugLine="Return mFastScrollLabelWidth";
Debug.ShouldStop(32);
if (true) return __ref.getField(true,"_mfastscrolllabelwidth" /*RemoteObject*/ );
 BA.debugLineNum = 4263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfastscrolllabelmaxchars(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFastScrollLabelMaxChars (table) ","table",20,__ref.getField(false, "ba"),__ref,4237);
if (RapidSub.canDelegate("getfastscrolllabelmaxchars")) { return __ref.runUserSub(false, "table","getfastscrolllabelmaxchars", __ref);}
 BA.debugLineNum = 4237;BA.debugLine="Public Sub getFastScrollLabelMaxChars As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 4238;BA.debugLine="Return mFastScrollLabelMaxChars";
Debug.ShouldStop(8192);
if (true) return __ref.getField(true,"_mfastscrolllabelmaxchars" /*RemoteObject*/ );
 BA.debugLineNum = 4239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfastscrolllabelwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFastScrollLabelWidth (table) ","table",20,__ref.getField(false, "ba"),__ref,4246);
if (RapidSub.canDelegate("getfastscrolllabelwidth")) { return __ref.runUserSub(false, "table","getfastscrolllabelwidth", __ref);}
 BA.debugLineNum = 4246;BA.debugLine="Public Sub getFastScrollLabelWidth As Int";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 4247;BA.debugLine="Return mFastScrollLabelWidth";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(true,"_mfastscrolllabelwidth" /*RemoteObject*/ );
 BA.debugLineNum = 4248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfastscrollminitems(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFastScrollMinItems (table) ","table",20,__ref.getField(false, "ba"),__ref,4185);
if (RapidSub.canDelegate("getfastscrollminitems")) { return __ref.runUserSub(false, "table","getfastscrollminitems", __ref);}
 BA.debugLineNum = 4185;BA.debugLine="Public Sub getFastScrollMinItems As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 4186;BA.debugLine="Return mFastScrollMinItems";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(true,"_mfastscrollminitems" /*RemoteObject*/ );
 BA.debugLineNum = 4187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfastscrollshowlabel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFastScrollShowLabel (table) ","table",20,__ref.getField(false, "ba"),__ref,4208);
if (RapidSub.canDelegate("getfastscrollshowlabel")) { return __ref.runUserSub(false, "table","getfastscrollshowlabel", __ref);}
 BA.debugLineNum = 4208;BA.debugLine="Public Sub getFastScrollShowLabel As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 4209;BA.debugLine="Return mFastScrollShowLabel";
Debug.ShouldStop(65536);
if (true) return __ref.getField(true,"_mfastscrollshowlabel" /*RemoteObject*/ );
 BA.debugLineNum = 4210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfirstcolumnfixed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFirstColumnFixed (table) ","table",20,__ref.getField(false, "ba"),__ref,4147);
if (RapidSub.canDelegate("getfirstcolumnfixed")) { return __ref.runUserSub(false, "table","getfirstcolumnfixed", __ref);}
 BA.debugLineNum = 4147;BA.debugLine="Public Sub getFirstColumnFixed As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 4148;BA.debugLine="Return mFirstColumnFixed";
Debug.ShouldStop(524288);
if (true) return __ref.getField(true,"_mfirstcolumnfixed" /*RemoteObject*/ );
 BA.debugLineNum = 4149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheadercolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2726);
if (RapidSub.canDelegate("getheadercolor")) { return __ref.runUserSub(false, "table","getheadercolor", __ref);}
 BA.debugLineNum = 2726;BA.debugLine="Public Sub getHeaderColor As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 2727;BA.debugLine="Return cHeaderColor";
Debug.ShouldStop(64);
if (true) return __ref.getField(true,"_cheadercolor" /*RemoteObject*/ );
 BA.debugLineNum = 2728;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheadercolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetHeaderColors (table) ","table",20,__ref.getField(false, "ba"),__ref,3638);
if (RapidSub.canDelegate("getheadercolors")) { return __ref.runUserSub(false, "table","getheadercolors", __ref);}
 BA.debugLineNum = 3638;BA.debugLine="Public Sub GetHeaderColors As Int()";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 3639;BA.debugLine="Return cHeaderColors";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_cheadercolors" /*RemoteObject*/ );
 BA.debugLineNum = 3640;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheaderheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderHeight (table) ","table",20,__ref.getField(false, "ba"),__ref,2695);
if (RapidSub.canDelegate("getheaderheight")) { return __ref.runUserSub(false, "table","getheaderheight", __ref);}
 BA.debugLineNum = 2695;BA.debugLine="Public Sub getHeaderHeight As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 2696;BA.debugLine="Return cHeaderHeight";
Debug.ShouldStop(128);
if (true) return __ref.getField(true,"_cheaderheight" /*RemoteObject*/ );
 BA.debugLineNum = 2697;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheaderpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderPanel (table) ","table",20,__ref.getField(false, "ba"),__ref,2177);
if (RapidSub.canDelegate("getheaderpanel")) { return __ref.runUserSub(false, "table","getheaderpanel", __ref);}
 BA.debugLineNum = 2177;BA.debugLine="Public Sub getHeaderPanel As Panel";
Debug.ShouldStop(1);
 BA.debugLineNum = 2178;BA.debugLine="Return Header";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_header" /*RemoteObject*/ );
 BA.debugLineNum = 2179;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheadertextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderTextColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2757);
if (RapidSub.canDelegate("getheadertextcolor")) { return __ref.runUserSub(false, "table","getheadertextcolor", __ref);}
 BA.debugLineNum = 2757;BA.debugLine="Public Sub getHeaderTextColor As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 2758;BA.debugLine="Return cHeaderTextColor";
Debug.ShouldStop(32);
if (true) return __ref.getField(true,"_cheadertextcolor" /*RemoteObject*/ );
 BA.debugLineNum = 2759;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheadertextcolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetHeaderTextColors (table) ","table",20,__ref.getField(false, "ba"),__ref,3759);
if (RapidSub.canDelegate("getheadertextcolors")) { return __ref.runUserSub(false, "table","getheadertextcolors", __ref);}
 BA.debugLineNum = 3759;BA.debugLine="Public Sub GetHeaderTextColors As Int()";
Debug.ShouldStop(16384);
 BA.debugLineNum = 3760;BA.debugLine="Return cHeaderTextColors";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_cheadertextcolors" /*RemoteObject*/ );
 BA.debugLineNum = 3761;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheadertypeface(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderTypeFace (table) ","table",20,__ref.getField(false, "ba"),__ref,3669);
if (RapidSub.canDelegate("getheadertypeface")) { return __ref.runUserSub(false, "table","getheadertypeface", __ref);}
 BA.debugLineNum = 3669;BA.debugLine="Public Sub getHeaderTypeFace As Typeface";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 3670;BA.debugLine="Return cHeaderTypeFace";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(false,"_cheadertypeface" /*RemoteObject*/ );
 BA.debugLineNum = 3671;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (table) ","table",20,__ref.getField(false, "ba"),__ref,2301);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "table","getheight", __ref);}
 BA.debugLineNum = 2301;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2302;BA.debugLine="Return pnlTable.Height";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 2303;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getinnertotalwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getInnerTotalWidth (table) ","table",20,__ref.getField(false, "ba"),__ref,2270);
if (RapidSub.canDelegate("getinnertotalwidth")) { return __ref.runUserSub(false, "table","getinnertotalwidth", __ref);}
 BA.debugLineNum = 2270;BA.debugLine="Public Sub getInnerTotalWidth As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2271;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2272;BA.debugLine="Return Header.Width";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth");
 }else {
 BA.debugLineNum = 2274;BA.debugLine="Return HeaderFirst.Width + Header.Width";
Debug.ShouldStop(2);
if (true) return RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 1);
 };
 BA.debugLineNum = 2276;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlabels(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("GetLabels (table) ","table",20,__ref.getField(false, "ba"),__ref,1440);
if (RapidSub.canDelegate("getlabels")) { return __ref.runUserSub(false, "table","getlabels", __ref, _row);}
RemoteObject _lbls = null;
int _i = 0;
RemoteObject _rc = RemoteObject.declareNull("b4a.example.ef.table._rowcol");
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1440;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1441;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(1);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1442;BA.debugLine="If LabelsCache.Size > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1444;BA.debugLine="lbls = LabelsCache.Get(LabelsCache.Size - 1)";
Debug.ShouldStop(8);
_lbls = (__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1445;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
Debug.ShouldStop(16);
__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 }else {
 BA.debugLineNum = 1447;BA.debugLine="lbls = CreateNewLabels";
Debug.ShouldStop(64);
_lbls = __ref.runClassMethod (b4a.example.ef.table.class, "_createnewlabels" /*RemoteObject*/ );Debug.locals.put("lbls", _lbls);
 };
 BA.debugLineNum = 1449;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(256);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 1450;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(512);
_rc = RemoteObject.createNew ("b4a.example.ef.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1451;BA.debugLine="rc = lbls(I).Tag";
Debug.ShouldStop(1024);
_rc = (_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"getTag"));Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1452;BA.debugLine="rc.Row = Row";
Debug.ShouldStop(2048);
_rc.setField ("Row" /*RemoteObject*/ ,_row);
 }
}Debug.locals.put("I", _i);
;
 BA.debugLineNum = 1454;BA.debugLine="Return lbls";
Debug.ShouldStop(8192);
if (true) return _lbls;
 BA.debugLineNum = 1455;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeft (table) ","table",20,__ref.getField(false, "ba"),__ref,2242);
if (RapidSub.canDelegate("getleft")) { return __ref.runUserSub(false, "table","getleft", __ref);}
 BA.debugLineNum = 2242;BA.debugLine="Public Sub getLeft As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 2243;BA.debugLine="Return pnlTable.Left";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"getLeft");
 BA.debugLineNum = 2244;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlinewidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLineWidth (table) ","table",20,__ref.getField(false, "ba"),__ref,2319);
if (RapidSub.canDelegate("getlinewidth")) { return __ref.runUserSub(false, "table","getlinewidth", __ref);}
 BA.debugLineNum = 2319;BA.debugLine="Public Sub getLineWidth As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 2320;BA.debugLine="Return cLineWidth";
Debug.ShouldStop(32768);
if (true) return __ref.getField(true,"_clinewidth" /*RemoteObject*/ );
 BA.debugLineNum = 2321;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmulticolumnsort(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMultiColumnSort (table) ","table",20,__ref.getField(false, "ba"),__ref,5026);
if (RapidSub.canDelegate("getmulticolumnsort")) { return __ref.runUserSub(false, "table","getmulticolumnsort", __ref);}
 BA.debugLineNum = 5026;BA.debugLine="Public Sub getMultiColumnSort As Boolean";
Debug.ShouldStop(2);
 BA.debugLineNum = 5027;BA.debugLine="Return mMultiColumnSort";
Debug.ShouldStop(4);
if (true) return __ref.getField(true,"_mmulticolumnsort" /*RemoteObject*/ );
 BA.debugLineNum = 5028;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmultiselect(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMultiSelect (table) ","table",20,__ref.getField(false, "ba"),__ref,2151);
if (RapidSub.canDelegate("getmultiselect")) { return __ref.runUserSub(false, "table","getmultiselect", __ref);}
 BA.debugLineNum = 2151;BA.debugLine="Public Sub getMultiSelect As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 2152;BA.debugLine="Return mMultiSelect";
Debug.ShouldStop(128);
if (true) return __ref.getField(true,"_mmultiselect" /*RemoteObject*/ );
 BA.debugLineNum = 2153;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnumberofcolumns(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getNumberOfColumns (table) ","table",20,__ref.getField(false, "ba"),__ref,3975);
if (RapidSub.canDelegate("getnumberofcolumns")) { return __ref.runUserSub(false, "table","getnumberofcolumns", __ref);}
 BA.debugLineNum = 3975;BA.debugLine="Public Sub getNumberOfColumns As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 3976;BA.debugLine="Return mNumberOfColumns";
Debug.ShouldStop(128);
if (true) return __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ );
 BA.debugLineNum = 3977;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnumberoffixedcolumns(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getNumberOfFixedColumns (table) ","table",20,__ref.getField(false, "ba"),__ref,4124);
if (RapidSub.canDelegate("getnumberoffixedcolumns")) { return __ref.runUserSub(false, "table","getnumberoffixedcolumns", __ref);}
 BA.debugLineNum = 4124;BA.debugLine="Public Sub getNumberOfFixedColumns As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 4125;BA.debugLine="Return mNumberOfFixedColumns";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ );
 BA.debugLineNum = 4126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnumberofrows(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getNumberOfRows (table) ","table",20,__ref.getField(false, "ba"),__ref,3996);
if (RapidSub.canDelegate("getnumberofrows")) { return __ref.runUserSub(false, "table","getnumberofrows", __ref);}
 BA.debugLineNum = 3996;BA.debugLine="Public Sub getNumberOfRows As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 3997;BA.debugLine="Return Data.Size";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize");
 BA.debugLineNum = 3998;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPanel (table) ","table",20,__ref.getField(false, "ba"),__ref,3840);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "table","getpanel", __ref);}
 BA.debugLineNum = 3840;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 3841;BA.debugLine="Return pnlTable";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_pnltable" /*RemoteObject*/ );
 BA.debugLineNum = 3842;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrowcolor1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRowColor1 (table) ","table",20,__ref.getField(false, "ba"),__ref,2769);
if (RapidSub.canDelegate("getrowcolor1")) { return __ref.runUserSub(false, "table","getrowcolor1", __ref);}
 BA.debugLineNum = 2769;BA.debugLine="Public Sub getRowColor1 As Int";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2770;BA.debugLine="Return cRowColor1";
Debug.ShouldStop(131072);
if (true) return __ref.getField(true,"_crowcolor1" /*RemoteObject*/ );
 BA.debugLineNum = 2771;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrowcolor2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRowColor2 (table) ","table",20,__ref.getField(false, "ba"),__ref,2781);
if (RapidSub.canDelegate("getrowcolor2")) { return __ref.runUserSub(false, "table","getrowcolor2", __ref);}
 BA.debugLineNum = 2781;BA.debugLine="Public Sub getRowColor2 As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2782;BA.debugLine="Return cRowColor2";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(true,"_crowcolor2" /*RemoteObject*/ );
 BA.debugLineNum = 2783;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrowcolorn(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("GetRowColorN (table) ","table",20,__ref.getField(false, "ba"),__ref,2817);
if (RapidSub.canDelegate("getrowcolorn")) { return __ref.runUserSub(false, "table","getrowcolorn", __ref, _row);}
Debug.locals.put("Row", _row);
 BA.debugLineNum = 2817;BA.debugLine="Public Sub GetRowColorN(Row As Int) As Int";
Debug.ShouldStop(1);
 BA.debugLineNum = 2818;BA.debugLine="Return lstRowColors.Get(lstRowColorIndexes.Get(Ro";
Debug.ShouldStop(2);
if (true) return BA.numberCast(int.class, __ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row))),RemoteObject.createImmutable(2)}, "-",1, 0)))));
 BA.debugLineNum = 2819;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrowheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRowHeight (table) ","table",20,__ref.getField(false, "ba"),__ref,2993);
if (RapidSub.canDelegate("getrowheight")) { return __ref.runUserSub(false, "table","getrowheight", __ref);}
 BA.debugLineNum = 2993;BA.debugLine="Public Sub getRowHeight As Int";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2994;BA.debugLine="Return cRowHeight";
Debug.ShouldStop(131072);
if (true) return __ref.getField(true,"_crowheight" /*RemoteObject*/ );
 BA.debugLineNum = 2995;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedcellcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedCellColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2863);
if (RapidSub.canDelegate("getselectedcellcolor")) { return __ref.runUserSub(false, "table","getselectedcellcolor", __ref);}
 BA.debugLineNum = 2863;BA.debugLine="Public Sub getSelectedCellColor As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 2864;BA.debugLine="Return cSelectedCellColor";
Debug.ShouldStop(32768);
if (true) return __ref.getField(true,"_cselectedcellcolor" /*RemoteObject*/ );
 BA.debugLineNum = 2865;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedcelltextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedCellTextColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2875);
if (RapidSub.canDelegate("getselectedcelltextcolor")) { return __ref.runUserSub(false, "table","getselectedcelltextcolor", __ref);}
 BA.debugLineNum = 2875;BA.debugLine="Public Sub getSelectedCellTextColor As Int";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2876;BA.debugLine="Return cSelectedCellTextColor";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(true,"_cselectedcelltextcolor" /*RemoteObject*/ );
 BA.debugLineNum = 2877;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedrowcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedRowColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2839);
if (RapidSub.canDelegate("getselectedrowcolor")) { return __ref.runUserSub(false, "table","getselectedrowcolor", __ref);}
 BA.debugLineNum = 2839;BA.debugLine="Public Sub getSelectedRowColor As Int";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 2840;BA.debugLine="Return cSelectedRowColor";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(true,"_cselectedrowcolor" /*RemoteObject*/ );
 BA.debugLineNum = 2841;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedrows(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedRows (table) ","table",20,__ref.getField(false, "ba"),__ref,2182);
if (RapidSub.canDelegate("getselectedrows")) { return __ref.runUserSub(false, "table","getselectedrows", __ref);}
RemoteObject _sr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 2182;BA.debugLine="Public Sub getSelectedRows As List";
Debug.ShouldStop(32);
 BA.debugLineNum = 2183;BA.debugLine="Dim sr As List";
Debug.ShouldStop(64);
_sr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sr", _sr);
 BA.debugLineNum = 2184;BA.debugLine="sr.Initialize";
Debug.ShouldStop(128);
_sr.runVoidMethod ("Initialize");
 BA.debugLineNum = 2185;BA.debugLine="sr.AddAll(SelectedRows)";
Debug.ShouldStop(256);
_sr.runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_selectedrows" /*RemoteObject*/ )));
 BA.debugLineNum = 2186;BA.debugLine="Return sr";
Debug.ShouldStop(512);
if (true) return _sr;
 BA.debugLineNum = 2187;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedrowtextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedRowTextColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2851);
if (RapidSub.canDelegate("getselectedrowtextcolor")) { return __ref.runUserSub(false, "table","getselectedrowtextcolor", __ref);}
 BA.debugLineNum = 2851;BA.debugLine="Public Sub getSelectedRowTextColor As Int";
Debug.ShouldStop(4);
 BA.debugLineNum = 2852;BA.debugLine="Return cSelectedRowTextColor";
Debug.ShouldStop(8);
if (true) return __ref.getField(true,"_cselectedrowtextcolor" /*RemoteObject*/ );
 BA.debugLineNum = 2853;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshowstatusline(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getShowStatusLine (table) ","table",20,__ref.getField(false, "ba"),__ref,3835);
if (RapidSub.canDelegate("getshowstatusline")) { return __ref.runUserSub(false, "table","getshowstatusline", __ref);}
 BA.debugLineNum = 3835;BA.debugLine="Public Sub getShowStatusLine As Boolean";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 3836;BA.debugLine="Return cShowStatusLine";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(true,"_cshowstatusline" /*RemoteObject*/ );
 BA.debugLineNum = 3837;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsingleline(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSingleLine (table) ","table",20,__ref.getField(false, "ba"),__ref,3783);
if (RapidSub.canDelegate("getsingleline")) { return __ref.runUserSub(false, "table","getsingleline", __ref);}
 BA.debugLineNum = 3783;BA.debugLine="Public Sub getSingleLine As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 3784;BA.debugLine="Return cSingleLine";
Debug.ShouldStop(128);
if (true) return __ref.getField(true,"_csingleline" /*RemoteObject*/ );
 BA.debugLineNum = 3785;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (table) ","table",20,__ref.getField(false, "ba"),__ref,2232);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "table","getsize", __ref);}
 BA.debugLineNum = 2232;BA.debugLine="Public Sub getSize As Long";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 2233;BA.debugLine="Return Data.Size";
Debug.ShouldStop(16777216);
if (true) return BA.numberCast(long.class, __ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"));
 BA.debugLineNum = 2234;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsortbitmapcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSortBitmapColor (table) ","table",20,__ref.getField(false, "ba"),__ref,4044);
if (RapidSub.canDelegate("getsortbitmapcolor")) { return __ref.runUserSub(false, "table","getsortbitmapcolor", __ref);}
 BA.debugLineNum = 4044;BA.debugLine="Public Sub getSortBitmapColor As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 4045;BA.debugLine="Return cSortBitmapColor";
Debug.ShouldStop(4096);
if (true) return __ref.getField(true,"_csortbitmapcolor" /*RemoteObject*/ );
 BA.debugLineNum = 4046;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsortbitmapwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSortBitmapWidth (table) ","table",20,__ref.getField(false, "ba"),__ref,4034);
if (RapidSub.canDelegate("getsortbitmapwidth")) { return __ref.runUserSub(false, "table","getsortbitmapwidth", __ref);}
 BA.debugLineNum = 4034;BA.debugLine="Public Sub getSortBitmapWidth As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 4035;BA.debugLine="Return cSortBitmapWidth";
Debug.ShouldStop(4);
if (true) return __ref.getField(true,"_csortbitmapwidth" /*RemoteObject*/ );
 BA.debugLineNum = 4036;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsortcaseinsensitive(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSortCaseInsensitive (table) ","table",20,__ref.getField(false, "ba"),__ref,5034);
if (RapidSub.canDelegate("getsortcaseinsensitive")) { return __ref.runUserSub(false, "table","getsortcaseinsensitive", __ref);}
 BA.debugLineNum = 5034;BA.debugLine="Public Sub getSortCaseInsensitive As Boolean";
Debug.ShouldStop(512);
 BA.debugLineNum = 5035;BA.debugLine="Return mSortCaseInsensitive";
Debug.ShouldStop(1024);
if (true) return __ref.getField(true,"_msortcaseinsensitive" /*RemoteObject*/ );
 BA.debugLineNum = 5036;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsortcolumn(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSortColumn (table) ","table",20,__ref.getField(false, "ba"),__ref,3501);
if (RapidSub.canDelegate("getsortcolumn")) { return __ref.runUserSub(false, "table","getsortcolumn", __ref);}
 BA.debugLineNum = 3501;BA.debugLine="Public Sub getSortColumn As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 3502;BA.debugLine="Return cSortColumn";
Debug.ShouldStop(8192);
if (true) return __ref.getField(true,"_csortcolumn" /*RemoteObject*/ );
 BA.debugLineNum = 3503;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsortremoveaccents(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSortRemoveAccents (table) ","table",20,__ref.getField(false, "ba"),__ref,4004);
if (RapidSub.canDelegate("getsortremoveaccents")) { return __ref.runUserSub(false, "table","getsortremoveaccents", __ref);}
 BA.debugLineNum = 4004;BA.debugLine="Public Sub getSortRemoveAccents As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 4005;BA.debugLine="Return cSortRemoveAccents";
Debug.ShouldStop(16);
if (true) return __ref.getField(true,"_csortremoveaccents" /*RemoteObject*/ );
 BA.debugLineNum = 4006;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstatuslineheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getStatusLineHeight (table) ","table",20,__ref.getField(false, "ba"),__ref,3002);
if (RapidSub.canDelegate("getstatuslineheight")) { return __ref.runUserSub(false, "table","getstatuslineheight", __ref);}
 BA.debugLineNum = 3002;BA.debugLine="Public Sub getStatusLineHeight As Int";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 3003;BA.debugLine="Return cStatusLineHeight";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ );
 BA.debugLineNum = 3004;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettablecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTableColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2892);
if (RapidSub.canDelegate("gettablecolor")) { return __ref.runUserSub(false, "table","gettablecolor", __ref);}
 BA.debugLineNum = 2892;BA.debugLine="Public Sub getTableColor As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 2893;BA.debugLine="Return cTableColor";
Debug.ShouldStop(4096);
if (true) return __ref.getField(true,"_ctablecolor" /*RemoteObject*/ );
 BA.debugLineNum = 2894;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettag(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTag (table) ","table",20,__ref.getField(false, "ba"),__ref,3918);
if (RapidSub.canDelegate("gettag")) { return __ref.runUserSub(false, "table","gettag", __ref);}
 BA.debugLineNum = 3918;BA.debugLine="Public Sub getTag As Object";
Debug.ShouldStop(8192);
 BA.debugLineNum = 3919;BA.debugLine="Return pnlTable.Tag";
Debug.ShouldStop(16384);
if (true) return __ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(false,"getTag");
 BA.debugLineNum = 3920;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2926);
if (RapidSub.canDelegate("gettextcolor")) { return __ref.runUserSub(false, "table","gettextcolor", __ref);}
 BA.debugLineNum = 2926;BA.debugLine="Public Sub getTextColor As Int";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2927;BA.debugLine="Return cTextColor";
Debug.ShouldStop(16384);
if (true) return __ref.getField(true,"_ctextcolor" /*RemoteObject*/ );
 BA.debugLineNum = 2928;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextcolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTextColors (table) ","table",20,__ref.getField(false, "ba"),__ref,3607);
if (RapidSub.canDelegate("gettextcolors")) { return __ref.runUserSub(false, "table","gettextcolors", __ref);}
 BA.debugLineNum = 3607;BA.debugLine="Public Sub GetTextColors As Int()";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 3608;BA.debugLine="Return cTextColors";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_ctextcolors" /*RemoteObject*/ );
 BA.debugLineNum = 3609;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextSize (table) ","table",20,__ref.getField(false, "ba"),__ref,2981);
if (RapidSub.canDelegate("gettextsize")) { return __ref.runUserSub(false, "table","gettextsize", __ref);}
 BA.debugLineNum = 2981;BA.debugLine="Public Sub getTextSize As Float";
Debug.ShouldStop(16);
 BA.debugLineNum = 2982;BA.debugLine="Return cTextSize";
Debug.ShouldStop(32);
if (true) return __ref.getField(true,"_ctextsize" /*RemoteObject*/ );
 BA.debugLineNum = 2983;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTop (table) ","table",20,__ref.getField(false, "ba"),__ref,2252);
if (RapidSub.canDelegate("gettop")) { return __ref.runUserSub(false, "table","gettop", __ref);}
 BA.debugLineNum = 2252;BA.debugLine="Public Sub getTop As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 2253;BA.debugLine="Return pnlTable.Top";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"getTop");
 BA.debugLineNum = 2254;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettoprowindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTopRowIndex (table) ","table",20,__ref.getField(false, "ba"),__ref,2325);
if (RapidSub.canDelegate("gettoprowindex")) { return __ref.runUserSub(false, "table","gettoprowindex", __ref);}
 BA.debugLineNum = 2325;BA.debugLine="Public Sub getTopRowIndex As Int";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2326;BA.debugLine="Return SV2.VerticalScrollPosition / cRowHeight";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"),__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "/",0, 0));
 BA.debugLineNum = 2327;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getusecolumncolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getUseColumnColors (table) ","table",20,__ref.getField(false, "ba"),__ref,3539);
if (RapidSub.canDelegate("getusecolumncolors")) { return __ref.runUserSub(false, "table","getusecolumncolors", __ref);}
 BA.debugLineNum = 3539;BA.debugLine="Public Sub getUseColumnColors As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3540;BA.debugLine="Return cUseColumnColors";
Debug.ShouldStop(524288);
if (true) return __ref.getField(true,"_cusecolumncolors" /*RemoteObject*/ );
 BA.debugLineNum = 3541;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _col,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("GetValue (table) ","table",20,__ref.getField(false, "ba"),__ref,1608);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "table","getvalue", __ref, _col, _row);}
RemoteObject _values = null;
Debug.locals.put("Col", _col);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1608;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int) As Str";
Debug.ShouldStop(128);
 BA.debugLineNum = 1609;BA.debugLine="Dim values() As String";
Debug.ShouldStop(256);
_values = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 1610;BA.debugLine="values = Data.Get(Row)";
Debug.ShouldStop(512);
_values = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("values", _values);
 BA.debugLineNum = 1611;BA.debugLine="Return values(Col)";
Debug.ShouldStop(1024);
if (true) return _values.getArrayElement(true,_col);
 BA.debugLineNum = 1612;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalues(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("GetValues (table) ","table",20,__ref.getField(false, "ba"),__ref,1978);
if (RapidSub.canDelegate("getvalues")) { return __ref.runUserSub(false, "table","getvalues", __ref, _row);}
RemoteObject _rowdata = null;
RemoteObject _tmp = null;
int _i = 0;
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1978;BA.debugLine="Public Sub GetValues(Row As Int ) As String()";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1979;BA.debugLine="Dim rowData() As String  = Data.Get(Row) ' will t";
Debug.ShouldStop(67108864);
_rowdata = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("rowData", _rowdata);Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 1980;BA.debugLine="Dim tmp(mNumberOfColumns) As String";
Debug.ShouldStop(134217728);
_tmp = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 1981;BA.debugLine="For i=0 To mNumberOfColumns-1 ' copy the array";
Debug.ShouldStop(268435456);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1982;BA.debugLine="tmp(i) =  rowData(i)";
Debug.ShouldStop(536870912);
_tmp.setArrayElement (_rowdata.getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1984;BA.debugLine="Return tmp";
Debug.ShouldStop(-2147483648);
if (true) return _tmp;
 BA.debugLineNum = 1985;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getVisible (table) ","table",20,__ref.getField(false, "ba"),__ref,2310);
if (RapidSub.canDelegate("getvisible")) { return __ref.runUserSub(false, "table","getvisible", __ref);}
 BA.debugLineNum = 2310;BA.debugLine="Public Sub getVisible As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 2311;BA.debugLine="Return pnlTable.Visible";
Debug.ShouldStop(64);
if (true) return __ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"getVisible");
 BA.debugLineNum = 2312;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWidth (table) ","table",20,__ref.getField(false, "ba"),__ref,2278);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "table","getwidth", __ref);}
 BA.debugLineNum = 2278;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 2279;BA.debugLine="Return pnlTable.Width";
Debug.ShouldStop(64);
if (true) return __ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"getWidth");
 BA.debugLineNum = 2280;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _header_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Header_Click (table) ","table",20,__ref.getField(false, "ba"),__ref,2330);
if (RapidSub.canDelegate("header_click")) { return __ref.runUserSub(false, "table","header_click", __ref);}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _bsorted = RemoteObject.createImmutable(false);
RemoteObject _dir = RemoteObject.createImmutable(0);
 BA.debugLineNum = 2330;BA.debugLine="Private Sub Header_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 2332;BA.debugLine="Dim L As Label";
Debug.ShouldStop(134217728);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 2333;BA.debugLine="Dim col As Int";
Debug.ShouldStop(268435456);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 2334;BA.debugLine="Dim bSorted As Boolean";
Debug.ShouldStop(536870912);
_bsorted = RemoteObject.createImmutable(false);Debug.locals.put("bSorted", _bsorted);
 BA.debugLineNum = 2338;BA.debugLine="If Data.Size < 2 Then Return";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 2))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2340;BA.debugLine="L = Sender";
Debug.ShouldStop(8);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("L", _l);
 BA.debugLineNum = 2341;BA.debugLine="col = L.Tag";
Debug.ShouldStop(16);
_col = BA.numberCast(int.class, _l.runMethod(false,"getTag"));Debug.locals.put("col", _col);
 BA.debugLineNum = 2345;BA.debugLine="If cSortColumn Then 'this is set in the designer";
Debug.ShouldStop(256);
if (__ref.getField(true,"_csortcolumn" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2346;BA.debugLine="Dim dir As Int = 0 ' unsorted";
Debug.ShouldStop(512);
_dir = BA.numberCast(int.class, 0);Debug.locals.put("dir", _dir);Debug.locals.put("dir", _dir);
 BA.debugLineNum = 2347;BA.debugLine="If (sortedCol = col) Then ' we are sorting the s";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",__ref.getField(true,"_sortedcol" /*RemoteObject*/ ),BA.numberCast(double.class, _col)))) { 
 BA.debugLineNum = 2348;BA.debugLine="Select sortingDir";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(__ref.getField(true,"_sortingdir" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, -(double) (0 + 1)))) {
case 0: {
 BA.debugLineNum = 2349;BA.debugLine="Case 0: dir = -1 ' going up";
Debug.ShouldStop(4096);
_dir = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("dir", _dir);
 break; }
case 1: {
 BA.debugLineNum = 2350;BA.debugLine="Case 1: dir = -1";
Debug.ShouldStop(8192);
_dir = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("dir", _dir);
 break; }
case 2: {
 BA.debugLineNum = 2351;BA.debugLine="Case -1: dir = 1";
Debug.ShouldStop(16384);
_dir = BA.numberCast(int.class, 1);Debug.locals.put("dir", _dir);
 break; }
}
;
 }else {
 BA.debugLineNum = 2354;BA.debugLine="dir = -1 ' start with going up";
Debug.ShouldStop(131072);
_dir = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("dir", _dir);
 };
 BA.debugLineNum = 2357;BA.debugLine="bSorted = SortTable2(col, dir <= 0)";
Debug.ShouldStop(1048576);
_bsorted = __ref.runClassMethod (b4a.example.ef.table.class, "_sorttable2" /*RemoteObject*/ ,(Object)(_col),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("k",_dir,BA.numberCast(double.class, 0)))));Debug.locals.put("bSorted", _bsorted);
 BA.debugLineNum = 2359;BA.debugLine="If bSorted Then";
Debug.ShouldStop(4194304);
if (_bsorted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2360;BA.debugLine="showHeaderSorting(col, dir)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.ef.table.class, "_showheadersorting" /*RemoteObject*/ ,(Object)(_col),(Object)(_dir));
 BA.debugLineNum = 2361;BA.debugLine="sortedCol = col 'only change if a sort actually";
Debug.ShouldStop(16777216);
__ref.setField ("_sortedcol" /*RemoteObject*/ ,_col);
 BA.debugLineNum = 2362;BA.debugLine="sortingDir = dir 'only change if a sort actuall";
Debug.ShouldStop(33554432);
__ref.setField ("_sortingdir" /*RemoteObject*/ ,_dir);
 }else {
 BA.debugLineNum = 2364;BA.debugLine="showHeaderSorting(col, 2) 'no sort done so rect";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.ef.table.class, "_showheadersorting" /*RemoteObject*/ ,(Object)(_col),(Object)(BA.numberCast(int.class, 2)));
 };
 };
 BA.debugLineNum = 2368;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
Debug.ShouldStop(-2147483648);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_HeaderClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2369;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
Debug.ShouldStop(1);
table.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_HeaderClick"))),(Object)((_col)));
 };
 BA.debugLineNum = 2372;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _header_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Header_LongClick (table) ","table",20,__ref.getField(false, "ba"),__ref,1583);
if (RapidSub.canDelegate("header_longclick")) { return __ref.runUserSub(false, "table","header_longclick", __ref);}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _col = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1583;BA.debugLine="Private Sub Header_LongClick";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1585;BA.debugLine="Dim L As Label";
Debug.ShouldStop(65536);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 1586;BA.debugLine="Dim col As Int";
Debug.ShouldStop(131072);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 1587;BA.debugLine="L = Sender";
Debug.ShouldStop(262144);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("L", _l);
 BA.debugLineNum = 1588;BA.debugLine="col = L.Tag";
Debug.ShouldStop(524288);
_col = BA.numberCast(int.class, _l.runMethod(false,"getTag"));Debug.locals.put("col", _col);
 BA.debugLineNum = 1589;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderLong";
Debug.ShouldStop(1048576);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_HeaderLongClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1590;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderLongCli";
Debug.ShouldStop(2097152);
table.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_HeaderLongClick"))),(Object)((_col)));
 };
 BA.debugLineNum = 1592;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidecol(RemoteObject __ref,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("hideCol (table) ","table",20,__ref.getField(false, "ba"),__ref,2190);
if (RapidSub.canDelegate("hidecol")) { return __ref.runUserSub(false, "table","hidecol", __ref, _col);}
RemoteObject _tmpwidths = null;
int _i = 0;
Debug.locals.put("col", _col);
 BA.debugLineNum = 2190;BA.debugLine="Public Sub hideCol(col As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2191;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
Debug.ShouldStop(16384);
_tmpwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("tmpWidths", _tmpwidths);
 BA.debugLineNum = 2192;BA.debugLine="For i = 0 To SavedWidths.Length - 1";
Debug.ShouldStop(32768);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2193;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
Debug.ShouldStop(65536);
_tmpwidths.setArrayElement (__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2196;BA.debugLine="tmpWidths(col) = 0	'???";
Debug.ShouldStop(524288);
_tmpwidths.setArrayElement (BA.numberCast(int.class, 0),_col);
 BA.debugLineNum = 2197;BA.debugLine="SetColumnsWidths(tmpWidths)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_tmpwidths));
 BA.debugLineNum = 2198;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hiderow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("HideRow (table) ","table",20,__ref.getField(false, "ba"),__ref,1425);
if (RapidSub.canDelegate("hiderow")) { return __ref.runUserSub(false, "table","hiderow", __ref, _row);}
RemoteObject _lbls = null;
int _i = 0;
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1425;BA.debugLine="Private Sub HideRow (Row As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1427;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(262144);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1428;BA.debugLine="lbls = visibleRows.Get(Row)";
Debug.ShouldStop(524288);
_lbls = (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_row))));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1429;BA.debugLine="If lbls = Null Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("n",_lbls)) { 
 BA.debugLineNum = 1431;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1433;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(16777216);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 1434;BA.debugLine="lbls(I).RemoveView";
Debug.ShouldStop(33554432);
_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("RemoveView");
 }
}Debug.locals.put("I", _i);
;
 BA.debugLineNum = 1436;BA.debugLine="visibleRows.Remove(Row)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_row)));
 BA.debugLineNum = 1437;BA.debugLine="LabelsCache.Add(lbls)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_lbls)));
 BA.debugLineNum = 1438;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initfastscroll(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitFastScroll (table) ","table",20,__ref.getField(false, "ba"),__ref,2585);
if (RapidSub.canDelegate("initfastscroll")) { return __ref.runUserSub(false, "table","initfastscroll", __ref);}
 BA.debugLineNum = 2585;BA.debugLine="Private Sub InitFastScroll";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 2586;BA.debugLine="pnlFastScroll.Top = SV2.Top";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getTop"));
 BA.debugLineNum = 2587;BA.debugLine="pnlFastScroll.Height = SV2.Height";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 2588;BA.debugLine="FastScrollHeight = pnlFastScroll.Height - pnlFast";
Debug.ShouldStop(134217728);
__ref.setField ("_fastscrollheight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 2589;BA.debugLine="pnlFastScrollCursor.Top = SV2.VerticalScrollPosit";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"),__ref.getField(true,"_fscscale" /*RemoteObject*/ )}, "*",0, 0)));
 BA.debugLineNum = 2590;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight - m";
Debug.ShouldStop(536870912);
__ref.setField ("_fsclabeltopdelta" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),__ref.getField(true,"_mfastscrolllabelheight" /*RemoteObject*/ )}, "-",1, 1)),RemoteObject.createImmutable(2)}, "+/",1, 0)));
 BA.debugLineNum = 2591;BA.debugLine="If mFastScrollFixedLabel = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscrollfixedlabel" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2592;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(true,"_fsclabeltopdelta" /*RemoteObject*/ )}, "+",1, 1));
 };
 BA.debugLineNum = 2594;BA.debugLine="DrawFastScrollCursor";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.ef.table.class, "_drawfastscrollcursor" /*RemoteObject*/ );
 BA.debugLineNum = 2595;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (table) ","table",20,__ref.getField(false, "ba"),__ref,560);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "table","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 560;BA.debugLine="Public Sub Initialize (CallBack As Object, EventNa";
Debug.ShouldStop(32768);
 BA.debugLineNum = 561;BA.debugLine="cEventName = EventName";
Debug.ShouldStop(65536);
__ref.setField ("_ceventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 562;BA.debugLine="cCallBack = CallBack";
Debug.ShouldStop(131072);
__ref.setField ("_ccallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 564;BA.debugLine="cSortBitmapWidth = 10dip";
Debug.ShouldStop(524288);
__ref.setField ("_csortbitmapwidth" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));
 BA.debugLineNum = 565;BA.debugLine="cSortBitmapColor = Colors.Yellow";
Debug.ShouldStop(1048576);
__ref.setField ("_csortbitmapcolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 566;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializesortingbitmaps(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitializeSortingBitmaps (table) ","table",20,__ref.getField(false, "ba"),__ref,818);
if (RapidSub.canDelegate("initializesortingbitmaps")) { return __ref.runUserSub(false, "table","initializesortingbitmaps", __ref);}
RemoteObject _pthasc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");
RemoteObject _pthdes = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");
RemoteObject _pthequal = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");
 BA.debugLineNum = 818;BA.debugLine="Private Sub InitializeSortingBitmaps";
Debug.ShouldStop(131072);
 BA.debugLineNum = 819;BA.debugLine="Private pthAsc, pthDes, pthEqual As Path";
Debug.ShouldStop(262144);
_pthasc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");Debug.locals.put("pthAsc", _pthasc);
_pthdes = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");Debug.locals.put("pthDes", _pthdes);
_pthequal = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");Debug.locals.put("pthEqual", _pthequal);
 BA.debugLineNum = 821;BA.debugLine="cSortBitmapHeight = cSortBitmapWidth / 2";
Debug.ShouldStop(1048576);
__ref.setField ("_csortbitmapheight" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_csortbitmapwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 823;BA.debugLine="pnlAsc.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlasc" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 824;BA.debugLine="pnlTable.AddView(pnlAsc, 0, 0, cSortBitmapWidth,";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlasc" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_csortbitmapwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ )));
 BA.debugLineNum = 825;BA.debugLine="cvsAsc.Initialize(pnlAsc)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_cvsasc" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_pnlasc" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 826;BA.debugLine="pthAsc.Initialize(0, 0)";
Debug.ShouldStop(33554432);
_pthasc.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 827;BA.debugLine="pthAsc.LineTo(cSortBitmapWidth, 0)";
Debug.ShouldStop(67108864);
_pthasc.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, __ref.getField(true,"_csortbitmapwidth" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 828;BA.debugLine="pthAsc.LineTo(cSortBitmapHeight, cSortBitmapHeigh";
Debug.ShouldStop(134217728);
_pthasc.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, __ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 829;BA.debugLine="cvsAsc.DrawColor(Colors.Transparent)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cvsasc" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(table.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 830;BA.debugLine="cvsAsc.DrawPath(pthAsc, cSortBitmapColor, True, 1";
Debug.ShouldStop(536870912);
__ref.getField(false,"_cvsasc" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)((_pthasc.getObject())),(Object)(__ref.getField(true,"_csortbitmapcolor" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 831;BA.debugLine="bmpAsc = cvsAsc.Bitmap";
Debug.ShouldStop(1073741824);
__ref.setField ("_bmpasc" /*RemoteObject*/ ,__ref.getField(false,"_cvsasc" /*RemoteObject*/ ).runMethod(false,"getBitmap"));
 BA.debugLineNum = 833;BA.debugLine="cvsDes.Initialize(pnlAsc)";
Debug.ShouldStop(1);
__ref.getField(false,"_cvsdes" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_pnlasc" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 834;BA.debugLine="pthDes.Initialize(0, cSortBitmapHeight)";
Debug.ShouldStop(2);
_pthdes.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 835;BA.debugLine="pthDes.LineTo(cSortBitmapHeight, 0)";
Debug.ShouldStop(4);
_pthdes.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, __ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 836;BA.debugLine="pthDes.LineTo(cSortBitmapWidth, cSortBitmapHeight";
Debug.ShouldStop(8);
_pthdes.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, __ref.getField(true,"_csortbitmapwidth" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 837;BA.debugLine="cvsDes.DrawColor(Colors.Transparent)";
Debug.ShouldStop(16);
__ref.getField(false,"_cvsdes" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(table.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 838;BA.debugLine="cvsDes.DrawPath(pthDes, cSortBitmapColor, True, 1";
Debug.ShouldStop(32);
__ref.getField(false,"_cvsdes" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)((_pthdes.getObject())),(Object)(__ref.getField(true,"_csortbitmapcolor" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 839;BA.debugLine="bmpDes = cvsDes.Bitmap";
Debug.ShouldStop(64);
__ref.setField ("_bmpdes" /*RemoteObject*/ ,__ref.getField(false,"_cvsdes" /*RemoteObject*/ ).runMethod(false,"getBitmap"));
 BA.debugLineNum = 842;BA.debugLine="cvsEqual.Initialize(pnlAsc)";
Debug.ShouldStop(512);
__ref.getField(false,"_cvsequal" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_pnlasc" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 843;BA.debugLine="pthEqual.Initialize(0, cSortBitmapHeight / 2)";
Debug.ShouldStop(1024);
_pthequal.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 844;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, cSortBitmap";
Debug.ShouldStop(2048);
_pthequal.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_csortbitmapwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 845;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth, cSortBitmapHeig";
Debug.ShouldStop(4096);
_pthequal.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, __ref.getField(true,"_csortbitmapwidth" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 846;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, 0)";
Debug.ShouldStop(8192);
_pthequal.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_csortbitmapwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 847;BA.debugLine="cvsEqual.DrawColor(Colors.Transparent)";
Debug.ShouldStop(16384);
__ref.getField(false,"_cvsequal" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(table.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 848;BA.debugLine="cvsEqual.DrawPath(pthEqual, cSortBitmapColor, Tru";
Debug.ShouldStop(32768);
__ref.getField(false,"_cvsequal" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)((_pthequal.getObject())),(Object)(__ref.getField(true,"_csortbitmapcolor" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 849;BA.debugLine="bmpEqual = cvsEqual.Bitmap";
Debug.ShouldStop(65536);
__ref.setField ("_bmpequal" /*RemoteObject*/ ,__ref.getField(false,"_cvsequal" /*RemoteObject*/ ).runMethod(false,"getBitmap"));
 BA.debugLineNum = 851;BA.debugLine="pnlAsc.RemoveView";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlasc" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 852;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializetable(RemoteObject __ref,RemoteObject _numberofcolumns,RemoteObject _cellalignement,RemoteObject _showstatusline) throws Exception{
try {
		Debug.PushSubsStack("InitializeTable (table) ","table",20,__ref.getField(false, "ba"),__ref,792);
if (RapidSub.canDelegate("initializetable")) { return __ref.runUserSub(false, "table","initializetable", __ref, _numberofcolumns, _cellalignement, _showstatusline);}
int _i = 0;
Debug.locals.put("NumberOfColumns", _numberofcolumns);
Debug.locals.put("cellAlignement", _cellalignement);
Debug.locals.put("showStatusLine", _showstatusline);
 BA.debugLineNum = 792;BA.debugLine="Public Sub InitializeTable (NumberOfColumns As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 794;BA.debugLine="setShowStatusLine(showStatusLine)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.ef.table.class, "_setshowstatusline" /*RemoteObject*/ ,(Object)(_showstatusline));
 BA.debugLineNum = 796;BA.debugLine="SelectedRows.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 797;BA.debugLine="cAlignment = cellAlignement";
Debug.ShouldStop(268435456);
__ref.setField ("_calignment" /*RemoteObject*/ ,_cellalignement);
 BA.debugLineNum = 799;BA.debugLine="mNumberOfColumns = NumberOfColumns";
Debug.ShouldStop(1073741824);
__ref.setField ("_mnumberofcolumns" /*RemoteObject*/ ,_numberofcolumns);
 BA.debugLineNum = 800;BA.debugLine="Data.Initialize	'needed";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 802;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(2);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 803;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(4);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 804;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(8);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
 BA.debugLineNum = 805;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(16);
table._savedwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_savedwidths",table._savedwidths);
 BA.debugLineNum = 806;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
Debug.ShouldStop(32);
table._ccolumndatatype = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ccolumndatatype",table._ccolumndatatype);
 BA.debugLineNum = 807;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(64);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 808;BA.debugLine="ColumnWidths(i) = cWidth / mNumberOfColumns";
Debug.ShouldStop(128);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cwidth" /*RemoteObject*/ ),__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )}, "/",0, 0)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 809;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(256);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 810;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(512);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 811;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(1024);
__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 814;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 815;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inittable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitTable (table) ","table",20,__ref.getField(false, "ba"),__ref,669);
if (RapidSub.canDelegate("inittable")) { return __ref.runUserSub(false, "table","inittable", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cdw = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
int _i = 0;
 BA.debugLineNum = 669;BA.debugLine="Private Sub InitTable";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 670;BA.debugLine="Data.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 671;BA.debugLine="lstRowColors.Initialize				'list of the different";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 672;BA.debugLine="lstRowColorIndexes.Initialize	'list of the color";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 673;BA.debugLine="lstRowDrawables.Initialize		'list of the drawable";
Debug.ShouldStop(1);
__ref.getField(false,"_lstrowdrawables" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 675;BA.debugLine="visibleRows.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 677;BA.debugLine="pnlTable.Tag = \"Table\"";
Debug.ShouldStop(16);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("Table")));
 BA.debugLineNum = 678;BA.debugLine="TableObject = Me";
Debug.ShouldStop(32);
__ref.setField ("_tableobject" /*RemoteObject*/ ,(__ref));
 BA.debugLineNum = 680;BA.debugLine="SV2.Initialize(0, 0, \"SV2\")";
Debug.ShouldStop(128);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("SV2")));
 BA.debugLineNum = 681;BA.debugLine="SVF.Initialize2(0, \"SVF\")";
Debug.ShouldStop(256);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("SVF")));
 BA.debugLineNum = 682;BA.debugLine="Private jo As JavaObject";
Debug.ShouldStop(512);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 683;BA.debugLine="jo = SVF";
Debug.ShouldStop(1024);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_svf" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 684;BA.debugLine="jo.RunMethod(\"setVerticalScrollBarEnabled\", Array";
Debug.ShouldStop(2048);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVerticalScrollBarEnabled")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(table.__c.getField(true,"False"))})));
 BA.debugLineNum = 685;BA.debugLine="internalPanel.Initialize(\"IP\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_internalpanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("IP")));
 BA.debugLineNum = 686;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 688;BA.debugLine="SV2.Panel.Color = cTableColor";
Debug.ShouldStop(32768);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("setColor",__ref.getField(true,"_ctablecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 689;BA.debugLine="SV2.FadingEdges(False)";
Debug.ShouldStop(65536);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runVoidMethod ("FadingEdges",(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 690;BA.debugLine="SVF.Panel.Color = cTableColor";
Debug.ShouldStop(131072);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("setColor",__ref.getField(true,"_ctablecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 691;BA.debugLine="IsVisible = True";
Debug.ShouldStop(262144);
__ref.setField ("_isvisible" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 692;BA.debugLine="HeaderFirst.Initialize(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 693;BA.debugLine="HeaderFirst.Color = cTableColor";
Debug.ShouldStop(1048576);
__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runVoidMethod ("setColor",__ref.getField(true,"_ctablecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 694;BA.debugLine="HeaderBase.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_headerbase" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 695;BA.debugLine="HeaderBase.Color = Colors.Transparent";
Debug.ShouldStop(4194304);
__ref.getField(false,"_headerbase" /*RemoteObject*/ ).runVoidMethod ("setColor",table.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 696;BA.debugLine="Header.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_header" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 697;BA.debugLine="Header.Color = cTableColor";
Debug.ShouldStop(16777216);
__ref.getField(false,"_header" /*RemoteObject*/ ).runVoidMethod ("setColor",__ref.getField(true,"_ctablecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 699;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 700;BA.debugLine="mFirstColumnsWidth = 0";
Debug.ShouldStop(134217728);
__ref.setField ("_mfirstcolumnswidth" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 702;BA.debugLine="mFirstColumnsWidth = 100dip";
Debug.ShouldStop(536870912);
__ref.setField ("_mfirstcolumnswidth" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))));
 };
 BA.debugLineNum = 704;BA.debugLine="pnlTable.AddView(Header, mFirstColumnsWidth, 0 ,";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_header" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cwidth" /*RemoteObject*/ ),__ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ )}, "-",1, 1)),(Object)(__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )));
 BA.debugLineNum = 705;BA.debugLine="pnlTable.AddView(HeaderFirst, 0, 0, mFirstColumns";
Debug.ShouldStop(1);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )));
 BA.debugLineNum = 708;BA.debugLine="lblStatusLine.Initialize(\"\")";
Debug.ShouldStop(8);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 709;BA.debugLine="lblStatusLine.Color = Colors.Transparent ' is it";
Debug.ShouldStop(16);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runVoidMethod ("setColor",table.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 710;BA.debugLine="internalPanel.Color = Colors.Transparent 'TODO un";
Debug.ShouldStop(32);
__ref.getField(false,"_internalpanel" /*RemoteObject*/ ).runVoidMethod ("setColor",table.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 711;BA.debugLine="If (cShowStatusLine = True) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",__ref.getField(true,"_cshowstatusline" /*RemoteObject*/ ),table.__c.getField(true,"True")))) { 
 BA.debugLineNum = 712;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
Debug.ShouldStop(128);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_svf" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(__ref.getField(true,"_cwidth" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ )}, "--",2, 1)));
 BA.debugLineNum = 713;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
Debug.ShouldStop(256);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sv2" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cwidth" /*RemoteObject*/ ),__ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ )}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ )}, "--",2, 1)));
 BA.debugLineNum = 714;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
Debug.ShouldStop(512);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),(Object)(__ref.getField(true,"_cwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 716;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sv2" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cwidth" /*RemoteObject*/ ),__ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ )}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)));
 BA.debugLineNum = 717;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_svf" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(__ref.getField(true,"_cwidth" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)));
 BA.debugLineNum = 718;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 720;BA.debugLine="SetPadding(lblStatusLine, 4dip, 2dip, 4dip, 2dip)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.ef.table.class, "_setpadding" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).getObject()),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 721;BA.debugLine="pnlTable.AddView(internalPanel, 0, 0, cWidth, 0)";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_internalpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_cwidth" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 723;BA.debugLine="pnlFastScroll.Initialize(\"pnlFastScroll\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlFastScroll")));
 BA.debugLineNum = 724;BA.debugLine="pnlFastScroll.Color = FScBackgroundColor";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runVoidMethod ("setColor",__ref.getField(true,"_fscbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 725;BA.debugLine="pnlFastScroll.Visible = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"False"));
 BA.debugLineNum = 726;BA.debugLine="pnlTable.AddView(pnlFastScroll,  cWidth - FScCurs";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cwidth" /*RemoteObject*/ ),__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ )}, "-",1, 1)),(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 727;BA.debugLine="pnlFastScrollCursor.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 728;BA.debugLine="pnlFastScrollCursor.Color = Colors.White";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runVoidMethod ("setColor",table.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 729;BA.debugLine="pnlFastScroll.AddView(pnlFastScrollCursor,  0, 0,";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ )));
 BA.debugLineNum = 730;BA.debugLine="lblFastScroll.Initialize(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 731;BA.debugLine="Private cdw As ColorDrawable";
Debug.ShouldStop(67108864);
_cdw = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdw", _cdw);
 BA.debugLineNum = 732;BA.debugLine="cdw.Initialize2(Colors.White, 3dip, 1dip, Colors.";
Debug.ShouldStop(134217728);
_cdw.runVoidMethod ("Initialize2",(Object)(table.__c.getField(false,"Colors").getField(true,"White")),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(table.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 733;BA.debugLine="lblFastScroll.Background = cdw";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(false,"setBackground",(_cdw.getObject()));
 BA.debugLineNum = 734;BA.debugLine="lblFastScroll.TextColor = Colors.Black";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTextColor",table.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 735;BA.debugLine="lblFastScroll.Gravity = Bit.Or(Gravity.LEFT, Grav";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setGravity",table.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(table.__c.getField(false,"Gravity").getField(true,"LEFT")),(Object)(table.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 736;BA.debugLine="lblFastScroll.Padding = Array As Int(5dip, 0, 0,";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 737;BA.debugLine="lblFastScroll.Visible = False";
Debug.ShouldStop(1);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"False"));
 BA.debugLineNum = 738;BA.debugLine="If mFastScrollFixedLabel = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscrollfixedlabel" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 739;BA.debugLine="pnlTable.AddView(lblFastScroll,  cWidth - mFastS";
Debug.ShouldStop(4);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cwidth" /*RemoteObject*/ ),__ref.getField(true,"_mfastscrolllabelwidth" /*RemoteObject*/ ),__ref.getField(true,"_fsccursorwidth" /*RemoteObject*/ )}, "--",2, 1)),(Object)(__ref.getField(true,"_fsclabeltopdelta" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mfastscrolllabelwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mfastscrolllabelheight" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 741;BA.debugLine="pnlTable.AddView(lblFastScroll,  0, (SV2.Height";
Debug.ShouldStop(16);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_mfastscrolllabelheight" /*RemoteObject*/ )}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(true,"_mfastscrolllabelwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mfastscrolllabelheight" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 743;BA.debugLine="FScTimer.Initialize(\"FastScrollTimer\", 1500)";
Debug.ShouldStop(64);
__ref.getField(false,"_fsctimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("FastScrollTimer")),(Object)(BA.numberCast(long.class, 1500)));
 BA.debugLineNum = 745;BA.debugLine="updateIPLocation";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.ef.table.class, "_updateiplocation" /*RemoteObject*/ );
 BA.debugLineNum = 747;BA.debugLine="InitFastScroll";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.ef.table.class, "_initfastscroll" /*RemoteObject*/ );
 BA.debugLineNum = 749;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(4096);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 750;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(8192);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 751;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(16384);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
 BA.debugLineNum = 752;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(32768);
table._savedwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_savedwidths",table._savedwidths);
 BA.debugLineNum = 753;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
Debug.ShouldStop(65536);
table._ccolumndatatype = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ccolumndatatype",table._ccolumndatatype);
 BA.debugLineNum = 754;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(131072);
{
final int step74 = 1;
final int limit74 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step74 > 0 && _i <= limit74) || (step74 < 0 && _i >= limit74) ;_i = ((int)(0 + _i + step74))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 755;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
Debug.ShouldStop(262144);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )}, "/",0, 0)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 756;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(524288);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 757;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 758;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 759;BA.debugLine="cColumnDataType(i) = \"T\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).setArrayElement (BA.ObjectToString("T"),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 761;BA.debugLine="SVF.Panel.Width = SVF.Width";
Debug.ShouldStop(16777216);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setWidth",__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 762;BA.debugLine="SVF_ScrollChanged(0)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.ef.table.class, "_svf_scrollchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 763;BA.debugLine="SV2.Panel.Width = SV2.Width";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setWidth",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 764;BA.debugLine="SV2_ScrollChanged(0, 0)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.ef.table.class, "_sv2_scrollchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 766;BA.debugLine="InitFastScroll";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.table.class, "_initfastscroll" /*RemoteObject*/ );
 BA.debugLineNum = 768;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean(".",__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_enablestatuslineautofill" /*RemoteObject*/ ),table.__c.getField(true,"True")))) { 
__ref.runClassMethod (b4a.example.ef.table.class, "_setstatusline" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));};
 BA.debugLineNum = 770;BA.debugLine="pnlSortingView.Initialize(\"\")";
Debug.ShouldStop(2);
__ref.getField(false,"_pnlsortingview" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 771;BA.debugLine="If mCustomSortingBitmaps = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mcustomsortingbitmaps" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 772;BA.debugLine="InitializeSortingBitmaps";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.ef.table.class, "_initializesortingbitmaps" /*RemoteObject*/ );
 };
 BA.debugLineNum = 776;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
Debug.ShouldStop(128);
__ref.getField(false,"_bmp" /*RemoteObject*/ ).runVoidMethod ("InitializeMutable",(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 777;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(256);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)((__ref.getField(false,"_bmp" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 785;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _innerclearall(RemoteObject __ref,RemoteObject _vnumberofcolumns,RemoteObject _cleardata) throws Exception{
try {
		Debug.PushSubsStack("innerClearAll (table) ","table",20,__ref.getField(false, "ba"),__ref,1038);
if (RapidSub.canDelegate("innerclearall")) { return __ref.runUserSub(false, "table","innerclearall", __ref, _vnumberofcolumns, _cleardata);}
int _i = 0;
RemoteObject _cds = null;
RemoteObject _color = RemoteObject.createImmutable(0);
int _col = 0;
RemoteObject _cdi = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cd1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cd2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cd3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cd4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("vNumberOfColumns", _vnumberofcolumns);
Debug.locals.put("ClearData", _cleardata);
 BA.debugLineNum = 1038;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int,";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1039;BA.debugLine="SelectedRows.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1040;BA.debugLine="SV2.Panel.RemoveAllViews";
Debug.ShouldStop(32768);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 1041;BA.debugLine="SVF.Panel.RemoveAllViews";
Debug.ShouldStop(65536);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 1042;BA.debugLine="mNumberOfColumns = vNumberOfColumns";
Debug.ShouldStop(131072);
__ref.setField ("_mnumberofcolumns" /*RemoteObject*/ ,_vnumberofcolumns);
 BA.debugLineNum = 1043;BA.debugLine="Dim Drawable1(mNumberOfColumns) As Object";
Debug.ShouldStop(262144);
table._drawable1 = RemoteObject.createNewArray ("Object", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_drawable1",table._drawable1);
 BA.debugLineNum = 1044;BA.debugLine="Dim Drawable2(mNumberOfColumns) As Object";
Debug.ShouldStop(524288);
table._drawable2 = RemoteObject.createNewArray ("Object", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_drawable2",table._drawable2);
 BA.debugLineNum = 1045;BA.debugLine="Dim SelectedDrawable(mNumberOfColumns) As Object";
Debug.ShouldStop(1048576);
table._selecteddrawable = RemoteObject.createNewArray ("Object", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_selecteddrawable",table._selecteddrawable);
 BA.debugLineNum = 1046;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
Debug.ShouldStop(2097152);
table._calignments = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_calignments",table._calignments);
 BA.debugLineNum = 1047;BA.debugLine="Dim cHeaderAlignments(mNumberOfColumns) As Int";
Debug.ShouldStop(4194304);
table._cheaderalignments = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_cheaderalignments",table._cheaderalignments);
 BA.debugLineNum = 1048;BA.debugLine="Dim cTypeFaces(mNumberOfColumns) As Typeface";
Debug.ShouldStop(8388608);
table._ctypefaces = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ctypefaces",table._ctypefaces);
 BA.debugLineNum = 1049;BA.debugLine="Dim cHeaderTypeFaces(mNumberOfColumns) As Typefac";
Debug.ShouldStop(16777216);
table._cheadertypefaces = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_cheadertypefaces",table._cheadertypefaces);
 BA.debugLineNum = 1051;BA.debugLine="If cUseColumnColors = False Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cusecolumncolors" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1052;BA.debugLine="If lstRowColors.Size > 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1053;BA.debugLine="For i = 0 To lstRowColors.Size - 1";
Debug.ShouldStop(268435456);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1054;BA.debugLine="Private cds(mNumberOfColumns) As Object";
Debug.ShouldStop(536870912);
_cds = RemoteObject.createNewArray ("Object", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("cds", _cds);
 BA.debugLineNum = 1055;BA.debugLine="Private color = lstRowColors.Get(i) As Int";
Debug.ShouldStop(1073741824);
_color = BA.numberCast(int.class, __ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("color", _color);Debug.locals.put("color", _color);
 BA.debugLineNum = 1056;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(-2147483648);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step17 > 0 && _col <= limit17) || (step17 < 0 && _col >= limit17) ;_col = ((int)(0 + _col + step17))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1057;BA.debugLine="Private cdi As ColorDrawable";
Debug.ShouldStop(1);
_cdi = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdi", _cdi);
 BA.debugLineNum = 1058;BA.debugLine="cdi.Initialize(color, 0)";
Debug.ShouldStop(2);
_cdi.runVoidMethod ("Initialize",(Object)(_color),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1059;BA.debugLine="cds(col) = cdi";
Debug.ShouldStop(4);
_cds.setArrayElement ((_cdi.getObject()),BA.numberCast(int.class, _col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1061;BA.debugLine="lstRowDrawables.Add(cds)";
Debug.ShouldStop(16);
__ref.getField(false,"_lstrowdrawables" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cds)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1064;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(128);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1065;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
Debug.ShouldStop(256);
_cd1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd1", _cd1);
_cd2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd2", _cd2);
_cd3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd3", _cd3);
 BA.debugLineNum = 1066;BA.debugLine="cd1.Initialize(cRowColor1, 0)";
Debug.ShouldStop(512);
_cd1.runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_crowcolor1" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1067;BA.debugLine="cd2.Initialize(cRowColor2, 0)";
Debug.ShouldStop(1024);
_cd2.runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_crowcolor2" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1068;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
Debug.ShouldStop(2048);
_cd3.runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_cselectedrowcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1069;BA.debugLine="Drawable1(i) = cd1";
Debug.ShouldStop(4096);
__ref.getField(false,"_drawable1" /*RemoteObject*/ ).setArrayElement ((_cd1.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1070;BA.debugLine="Drawable2(i) = cd2";
Debug.ShouldStop(8192);
__ref.getField(false,"_drawable2" /*RemoteObject*/ ).setArrayElement ((_cd2.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1071;BA.debugLine="SelectedDrawable(i) = cd3";
Debug.ShouldStop(16384);
__ref.getField(false,"_selecteddrawable" /*RemoteObject*/ ).setArrayElement ((_cd3.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1072;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multialignments" /*RemoteObject*/ ),table.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",__ref.getField(false,"_calignments0" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1073;BA.debugLine="cAlignments(i) = cAlignment";
Debug.ShouldStop(65536);
__ref.getField(false,"_calignments" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_calignment" /*RemoteObject*/ ),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 1075;BA.debugLine="cAlignments(i) = cAlignments0(i)";
Debug.ShouldStop(262144);
__ref.getField(false,"_calignments" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_calignments0" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 };
 BA.debugLineNum = 1077;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",__ref.getField(false,"_ctypefaces0" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1078;BA.debugLine="cTypeFaces(i) = cTypeFace";
Debug.ShouldStop(2097152);
__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_ctypeface" /*RemoteObject*/ ),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 1080;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_ctypefaces0" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 };
 BA.debugLineNum = 1083;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultialignments" /*RemoteObject*/ ),table.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",__ref.getField(false,"_cheaderalignments0" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1084;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
Debug.ShouldStop(134217728);
__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_cheaderalignment" /*RemoteObject*/ ),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 1086;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_cheaderalignments0" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 };
 BA.debugLineNum = 1088;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",__ref.getField(false,"_cheadertypefaces0" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1089;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
Debug.ShouldStop(1);
__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 1091;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
Debug.ShouldStop(4);
__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_cheadertypefaces0" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 1095;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(64);
{
final int step55 = 1;
final int limit55 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55) ;_i = ((int)(0 + _i + step55))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1096;BA.debugLine="Private cd1, cd2, cd3 As ColorDrawable";
Debug.ShouldStop(128);
_cd1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd1", _cd1);
_cd2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd2", _cd2);
_cd3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd3", _cd3);
 BA.debugLineNum = 1097;BA.debugLine="cd1.Initialize(cColumnColors(i), 0)";
Debug.ShouldStop(256);
_cd1.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_ccolumncolors" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1098;BA.debugLine="cd2.Initialize(cColumnColors(i), 0)";
Debug.ShouldStop(512);
_cd2.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_ccolumncolors" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1099;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
Debug.ShouldStop(1024);
_cd3.runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_cselectedrowcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1100;BA.debugLine="Drawable1(i) = cd1";
Debug.ShouldStop(2048);
__ref.getField(false,"_drawable1" /*RemoteObject*/ ).setArrayElement ((_cd1.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1101;BA.debugLine="Drawable2(i) = cd2";
Debug.ShouldStop(4096);
__ref.getField(false,"_drawable2" /*RemoteObject*/ ).setArrayElement ((_cd2.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1102;BA.debugLine="SelectedDrawable(i) = cd3";
Debug.ShouldStop(8192);
__ref.getField(false,"_selecteddrawable" /*RemoteObject*/ ).setArrayElement ((_cd3.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1103;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multialignments" /*RemoteObject*/ ),table.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",__ref.getField(false,"_calignments0" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1104;BA.debugLine="cAlignments(i) = cAlignment";
Debug.ShouldStop(32768);
__ref.getField(false,"_calignments" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_calignment" /*RemoteObject*/ ),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 1106;BA.debugLine="cAlignments(i) = cAlignments0(i)";
Debug.ShouldStop(131072);
__ref.getField(false,"_calignments" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_calignments0" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 };
 BA.debugLineNum = 1108;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",__ref.getField(false,"_ctypefaces0" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1109;BA.debugLine="cTypeFaces(i) = cTypeFace";
Debug.ShouldStop(1048576);
__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_ctypeface" /*RemoteObject*/ ),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 1111;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_ctypefaces0" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 };
 BA.debugLineNum = 1114;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultialignments" /*RemoteObject*/ ),table.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",__ref.getField(false,"_cheaderalignments0" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1115;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_cheaderalignment" /*RemoteObject*/ ),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 1117;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_cheaderalignments0" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 };
 BA.debugLineNum = 1119;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",__ref.getField(false,"_cheadertypefaces0" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1120;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 1122;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
Debug.ShouldStop(2);
__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_cheadertypefaces0" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1127;BA.debugLine="Dim cd4 As ColorDrawable";
Debug.ShouldStop(64);
_cd4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd4", _cd4);
 BA.debugLineNum = 1128;BA.debugLine="cd4.Initialize(cSelectedCellColor, 0)";
Debug.ShouldStop(128);
_cd4.runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_cselectedcellcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1129;BA.debugLine="SelectedCellDrawable = cd4";
Debug.ShouldStop(256);
__ref.setField ("_selectedcelldrawable" /*RemoteObject*/ ,(_cd4.getObject()));
 BA.debugLineNum = 1131;BA.debugLine="SV2.Panel.Height = 0";
Debug.ShouldStop(1024);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1132;BA.debugLine="SVF.Panel.Height = 0";
Debug.ShouldStop(2048);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1135;BA.debugLine="SelectedCol = -1";
Debug.ShouldStop(16384);
__ref.setField ("_selectedcol" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 1136;BA.debugLine="minVisibleRow = -1";
Debug.ShouldStop(32768);
__ref.setField ("_minvisiblerow" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 1137;BA.debugLine="maxVisibleRow = 0";
Debug.ShouldStop(65536);
__ref.setField ("_maxvisiblerow" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1138;BA.debugLine="If ClearData = True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cleardata,table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1139;BA.debugLine="Data.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 1141;BA.debugLine="LabelsCache.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1142;BA.debugLine="visibleRows.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1143;BA.debugLine="SV2.VerticalScrollPosition = 0";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setVerticalScrollPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1144;BA.debugLine="SVF.ScrollPosition = 0";
Debug.ShouldStop(8388608);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setScrollPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1145;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
Debug.ShouldStop(16777216);
{
final int step100 = 1;
final int limit100 = 80;
_i = 1 ;
for (;(step100 > 0 && _i <= limit100) || (step100 < 0 && _i >= limit100) ;_i = ((int)(0 + _i + step100))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1146;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.ef.table.class, "_createnewlabels" /*RemoteObject*/ ))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1148;BA.debugLine="If IsVisible Then";
Debug.ShouldStop(134217728);
if (__ref.getField(true,"_isvisible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1149;BA.debugLine="SV2_ScrollChanged(0, 0)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.ef.table.class, "_sv2_scrollchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1150;BA.debugLine="SVF_ScrollChanged(0)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.table.class, "_svf_scrollchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1152;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean(".",__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_enablestatuslineautofill" /*RemoteObject*/ ),table.__c.getField(true,"True")))) { 
__ref.runClassMethod (b4a.example.ef.table.class, "_setstatusline" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));};
 BA.debugLineNum = 1154;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertrowat(RemoteObject __ref,RemoteObject _row,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("insertRowAt (table) ","table",20,__ref.getField(false, "ba"),__ref,1988);
if (RapidSub.canDelegate("insertrowat")) { return __ref.runUserSub(false, "table","insertrowat", __ref, _row, _values);}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _keepsel = RemoteObject.createImmutable(0);
RemoteObject _changed = RemoteObject.createImmutable(false);
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("Row", _row);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 1988;BA.debugLine="Public Sub insertRowAt (Row As Int, Values() As St";
Debug.ShouldStop(8);
 BA.debugLineNum = 1989;BA.debugLine="If (Row < 0) Then Row = 0";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, 0)))) { 
_row = BA.numberCast(int.class, 0);Debug.locals.put("Row", _row);};
 BA.debugLineNum = 1990;BA.debugLine="If (Row > Data.Size) Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean(">",_row,BA.numberCast(double.class, __ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"))))) { 
 BA.debugLineNum = 1991;BA.debugLine="If cAutomaticWidths = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cautomaticwidths" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1992;BA.debugLine="AddRow(Values)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.ef.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_values));
 }else {
 BA.debugLineNum = 1994;BA.debugLine="AddRowAutomaticWidth(Values)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.ef.table.class, "_addrowautomaticwidth" /*RemoteObject*/ ,(Object)(_values));
 };
 BA.debugLineNum = 1996;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return table.__c.getField(true,"True");
 };
 BA.debugLineNum = 1998;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.ef.table.class, "_sv2_scrollchanged" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHorizontalScrollPosition")),(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition")));
 BA.debugLineNum = 2000;BA.debugLine="Dim L As List";
Debug.ShouldStop(32768);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("L", _l);
 BA.debugLineNum = 2001;BA.debugLine="L.Initialize";
Debug.ShouldStop(65536);
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 2002;BA.debugLine="L.Add(Values)";
Debug.ShouldStop(131072);
_l.runVoidMethod ("Add",(Object)((_values)));
 BA.debugLineNum = 2004;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
Debug.ShouldStop(524288);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2005;BA.debugLine="Dim keepSel As Int";
Debug.ShouldStop(1048576);
_keepsel = RemoteObject.createImmutable(0);Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 2006;BA.debugLine="keepSel = SelectedRows.Get(i)";
Debug.ShouldStop(2097152);
_keepsel = BA.numberCast(int.class, __ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 2007;BA.debugLine="If (keepSel >= Row) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("g",_keepsel,BA.numberCast(double.class, _row)))) { 
 BA.debugLineNum = 2008;BA.debugLine="SelectedRows.set(i,keepSel+1) ' dec row number";
Debug.ShouldStop(8388608);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(BA.numberCast(int.class, _i)),(Object)((RemoteObject.solve(new RemoteObject[] {_keepsel,RemoteObject.createImmutable(1)}, "+",1, 1))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2012;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
Debug.ShouldStop(134217728);
{
final int step21 = 1;
final int limit21 = __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue();
_i = __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21) ;_i = ((int)(0 + _i + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2013;BA.debugLine="HideRow(i)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.ef.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2015;BA.debugLine="Data.AddAllAt(Row,L) ' now I can add the row";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("AddAllAt",(Object)(_row),(Object)(_l));
 BA.debugLineNum = 2016;BA.debugLine="lstRowColorIndexes.InsertAt(Row, 0)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(_row),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2018;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.ef.table.class, "_sv2_scrollchanged" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHorizontalScrollPosition")),(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition")));
 BA.debugLineNum = 2020;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
Debug.ShouldStop(8);
{
final int step27 = 1;
final int limit27 = __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue();
_i = __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2021;BA.debugLine="ShowRow(i)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2024;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(128);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 2025;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
Debug.ShouldStop(256);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"));
 BA.debugLineNum = 2026;BA.debugLine="updateIPLocation";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.ef.table.class, "_updateiplocation" /*RemoteObject*/ );
 BA.debugLineNum = 2027;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.ef.table.class, "_sv2_scrollchanged" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHorizontalScrollPosition")),(Object)(BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight")))))));
 BA.debugLineNum = 2028;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean(".",__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_enablestatuslineautofill" /*RemoteObject*/ ),table.__c.getField(true,"True")))) { 
__ref.runClassMethod (b4a.example.ef.table.class, "_setstatusline" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));};
 BA.debugLineNum = 2030;BA.debugLine="If cAutomaticWidths = True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cautomaticwidths" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2031;BA.debugLine="Dim changed = False As Boolean";
Debug.ShouldStop(16384);
_changed = table.__c.getField(true,"False");Debug.locals.put("changed", _changed);Debug.locals.put("changed", _changed);
 BA.debugLineNum = 2032;BA.debugLine="Dim width As Int";
Debug.ShouldStop(32768);
_width = RemoteObject.createImmutable(0);Debug.locals.put("width", _width);
 BA.debugLineNum = 2033;BA.debugLine="If Data.Size = 1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2034;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(131072);
{
final int step39 = 1;
final int limit39 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39) ;_i = ((int)(0 + _i + step39))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2035;BA.debugLine="If HeaderMultiTypeFace = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2036;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
Debug.ShouldStop(524288);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(__ref.getField(false,"_headernames" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)((__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("width", _width);
 }else {
 BA.debugLineNum = 2038;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
Debug.ShouldStop(2097152);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(__ref.getField(false,"_headernames" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)((__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("width", _width);
 };
 BA.debugLineNum = 2040;BA.debugLine="ColumnWidths(i) = width";
Debug.ShouldStop(8388608);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 2041;BA.debugLine="SavedWidths(i) = width";
Debug.ShouldStop(16777216);
__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 2042;BA.debugLine="HeaderWidths(i) = width";
Debug.ShouldStop(33554432);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 2043;BA.debugLine="DataWidths(i) = width";
Debug.ShouldStop(67108864);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (_width,BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 2046;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(536870912);
{
final int step51 = 1;
final int limit51 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51) ;_i = ((int)(0 + _i + step51))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2047;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2048;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
Debug.ShouldStop(-2147483648);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_values.getArrayElement(true,BA.numberCast(int.class, _i))),(Object)((__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("width", _width);
 }else {
 BA.debugLineNum = 2050;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
Debug.ShouldStop(2);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_values.getArrayElement(true,BA.numberCast(int.class, _i))),(Object)((__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("width", _width);
 };
 BA.debugLineNum = 2052;BA.debugLine="If ColumnWidths(i) < width Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(double.class, _width))) { 
 BA.debugLineNum = 2053;BA.debugLine="ColumnWidths(i) = width";
Debug.ShouldStop(16);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 2054;BA.debugLine="SavedWidths(i) = width";
Debug.ShouldStop(32);
__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 2055;BA.debugLine="HeaderWidths(i) = width";
Debug.ShouldStop(64);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 2056;BA.debugLine="DataWidths(i) = width";
Debug.ShouldStop(128);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 2057;BA.debugLine="changed = True";
Debug.ShouldStop(256);
_changed = table.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2061;BA.debugLine="If changed = True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_changed,table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2062;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 2066;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) return table.__c.getField(true,"False");
 BA.debugLineNum = 2067;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ip_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IP_Click (table) ","table",20,__ref.getField(false, "ba"),__ref,2214);
if (RapidSub.canDelegate("ip_click")) { return __ref.runUserSub(false, "table","ip_click", __ref);}
 BA.debugLineNum = 2214;BA.debugLine="Private Sub IP_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 2216;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
Debug.ShouldStop(128);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_HeaderClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2217;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
Debug.ShouldStop(256);
table.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_HeaderClick"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))));
 };
 BA.debugLineNum = 2219;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isrowvisible(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("IsRowVisible (table) ","table",20,__ref.getField(false, "ba"),__ref,1420);
if (RapidSub.canDelegate("isrowvisible")) { return __ref.runUserSub(false, "table","isrowvisible", __ref, _row);}
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1420;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean		'";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1421;BA.debugLine="Return Row < (SV2.VerticalScrollPosition + SV2.He";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("<",_row,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"),__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_crowheight" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))}, "/",0, 0)) && RemoteObject.solveBoolean(">",_row,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"),__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 1423;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jumptorow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("JumpToRow (table) ","table",20,__ref.getField(false, "ba"),__ref,1699);
if (RapidSub.canDelegate("jumptorow")) { __ref.runUserSub(false, "table","jumptorow", __ref, _row); return;}
ResumableSub_JumpToRow rsub = new ResumableSub_JumpToRow(null,__ref,_row);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_JumpToRow extends BA.ResumableSub {
public ResumableSub_JumpToRow(b4a.example.ef.table parent,RemoteObject __ref,RemoteObject _row) {
this.parent = parent;
this.__ref = __ref;
this._row = _row;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.table parent;
RemoteObject _row;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JumpToRow (table) ","table",20,__ref.getField(false, "ba"),__ref,1699);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1700;BA.debugLine="Sleep(0)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "table", "jumptorow"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 1701;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
Debug.ShouldStop(16);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setVerticalScrollPosition",RemoteObject.solve(new RemoteObject[] {_row,__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 1702;BA.debugLine="End Sub";
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
public static void  _jumptorowandselect(RemoteObject __ref,RemoteObject _col,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("JumpToRowAndSelect (table) ","table",20,__ref.getField(false, "ba"),__ref,1705);
if (RapidSub.canDelegate("jumptorowandselect")) { __ref.runUserSub(false, "table","jumptorowandselect", __ref, _col, _row); return;}
ResumableSub_JumpToRowAndSelect rsub = new ResumableSub_JumpToRowAndSelect(null,__ref,_col,_row);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_JumpToRowAndSelect extends BA.ResumableSub {
public ResumableSub_JumpToRowAndSelect(b4a.example.ef.table parent,RemoteObject __ref,RemoteObject _col,RemoteObject _row) {
this.parent = parent;
this.__ref = __ref;
this._col = _col;
this._row = _row;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.table parent;
RemoteObject _col;
RemoteObject _row;
RemoteObject _rc = RemoteObject.declareNull("b4a.example.ef.table._rowcol");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
int step12;
int limit12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JumpToRowAndSelect (table) ","table",20,__ref.getField(false, "ba"),__ref,1705);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Col", _col);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1706;BA.debugLine="Log(\"You may get this warning:\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","326017793",RemoteObject.createImmutable("You may get this warning:"),0);
 BA.debugLineNum = 1707;BA.debugLine="Log(\"Unexpected event (missing RaiseSynchronousEv";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","326017794",RemoteObject.createImmutable("Unexpected event (missing RaiseSynchronousEvents): sv_scrollchanged"),0);
 BA.debugLineNum = 1708;BA.debugLine="Log(\"Ignore it, it is NOT harmful !\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","326017795",RemoteObject.createImmutable("Ignore it, it is NOT harmful !"),0);
 BA.debugLineNum = 1709;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(4096);
_rc = RemoteObject.createNew ("b4a.example.ef.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1711;BA.debugLine="rc.Row = Row";
Debug.ShouldStop(16384);
_rc.setField ("Row" /*RemoteObject*/ ,_row);
 BA.debugLineNum = 1712;BA.debugLine="rc.Col = Col";
Debug.ShouldStop(32768);
_rc.setField ("Col" /*RemoteObject*/ ,_col);
 BA.debugLineNum = 1713;BA.debugLine="Sleep(0)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "table", "jumptorowandselect"),BA.numberCast(int.class, 0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 1714;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
Debug.ShouldStop(131072);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setVerticalScrollPosition",RemoteObject.solve(new RemoteObject[] {_row,__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 1716;BA.debugLine="SelectRow(rc)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.ef.table.class, "_selectrow" /*RemoteObject*/ ,(Object)(_rc));
 BA.debugLineNum = 1718;BA.debugLine="Private i, Left As Int";
Debug.ShouldStop(2097152);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
_left = RemoteObject.createImmutable(0);Debug.locals.put("Left", _left);
 BA.debugLineNum = 1719;BA.debugLine="If Col > 0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",_col,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1720;BA.debugLine="For i = 0 To Col - 1";
Debug.ShouldStop(8388608);
if (true) break;

case 4:
//for
this.state = 7;
step12 = 1;
limit12 = RemoteObject.solve(new RemoteObject[] {_col,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
Debug.locals.put("i", _i);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step12 > 0 && _i.<Integer>get().intValue() <= limit12) || (step12 < 0 && _i.<Integer>get().intValue() >= limit12)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step12)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 1721;BA.debugLine="Left = Left + ColumnWidths(i)";
Debug.ShouldStop(16777216);
_left = RemoteObject.solve(new RemoteObject[] {_left,__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,_i)}, "+",1, 1);Debug.locals.put("Left", _left);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1724;BA.debugLine="Left = Left - SVF.Width";
Debug.ShouldStop(134217728);
_left = RemoteObject.solve(new RemoteObject[] {_left,__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1);Debug.locals.put("Left", _left);
 BA.debugLineNum = 1725;BA.debugLine="SV2.HorizontalScrollPosition = Left";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHorizontalScrollPosition",_left);
 BA.debugLineNum = 1726;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _loadsqlitedb(RemoteObject __ref,RemoteObject _sqlite,RemoteObject _query,RemoteObject _automaticwidths) throws Exception{
try {
		Debug.PushSubsStack("LoadSQLiteDB (table) ","table",20,__ref.getField(false, "ba"),__ref,3040);
if (RapidSub.canDelegate("loadsqlitedb")) { return __ref.runUserSub(false, "table","loadsqlitedb", __ref, _sqlite, _query, _automaticwidths);}
RemoteObject _curs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _headers = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _r = null;
Debug.locals.put("SQLite", _sqlite);
Debug.locals.put("Query", _query);
Debug.locals.put("AutomaticWidths", _automaticwidths);
 BA.debugLineNum = 3040;BA.debugLine="Public Sub LoadSQLiteDB(SQLite As SQL, Query As St";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 3041;BA.debugLine="Dim Curs As Cursor";
Debug.ShouldStop(1);
_curs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 3042;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
Debug.ShouldStop(2);
_curs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sqlite.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 3044;BA.debugLine="cAutomaticWidths = AutomaticWidths";
Debug.ShouldStop(8);
__ref.setField ("_cautomaticwidths" /*RemoteObject*/ ,_automaticwidths);
 BA.debugLineNum = 3045;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
Debug.ShouldStop(16);
__ref.setField ("_mnumberofcolumns" /*RemoteObject*/ ,_curs.runMethod(true,"getColumnCount"));
 BA.debugLineNum = 3046;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 3048;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
Debug.ShouldStop(128);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 3049;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(256);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 3050;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(512);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 3051;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(1024);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
 BA.debugLineNum = 3052;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
Debug.ShouldStop(2048);
table._ccolumndatatype = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ccolumndatatype",table._ccolumndatatype);
 BA.debugLineNum = 3053;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(4096);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 3054;BA.debugLine="Dim str As String";
Debug.ShouldStop(8192);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3055;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(16384);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _col.<Integer>get().intValue() <= limit13) || (step13 < 0 && _col.<Integer>get().intValue() >= limit13) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3056;BA.debugLine="cColumnDataType(col) = \"T\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).setArrayElement (BA.ObjectToString("T"),_col);
 BA.debugLineNum = 3057;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
Debug.ShouldStop(65536);
_headers.setArrayElement (_curs.runMethod(true,"GetColumnName",(Object)(_col)),_col);
 BA.debugLineNum = 3058;BA.debugLine="If AutomaticWidths = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_automaticwidths,table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3059;BA.debugLine="ColumnWidths(col) = 130dip";
Debug.ShouldStop(262144);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 3060;BA.debugLine="HeaderWidths(col) = 130dip";
Debug.ShouldStop(524288);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 3061;BA.debugLine="DataWidths(col) = 130dip";
Debug.ShouldStop(1048576);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 }else {
 BA.debugLineNum = 3063;BA.debugLine="If MultiTypeFace = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3064;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
Debug.ShouldStop(8388608);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 }else {
 BA.debugLineNum = 3066;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
Debug.ShouldStop(33554432);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 };
 BA.debugLineNum = 3068;BA.debugLine="DataWidths(col) = 0";
Debug.ShouldStop(134217728);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, 0),_col);
 BA.debugLineNum = 3069;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(268435456);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step27 > 0 && _row.<Integer>get().intValue() <= limit27) || (step27 < 0 && _row.<Integer>get().intValue() >= limit27) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step27))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3070;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(536870912);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3071;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(1073741824);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3072;BA.debugLine="If str <> Null Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("N",_str)) { 
 BA.debugLineNum = 3073;BA.debugLine="If MultiTypeFace = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3074;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
Debug.ShouldStop(2);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)(__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getField(false,"DEFAULT")),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 }else {
 BA.debugLineNum = 3076;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
Debug.ShouldStop(8);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)((__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 };
 };
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3080;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
Debug.ShouldStop(128);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))))),_col);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3084;BA.debugLine="SetHeader(Headers)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.ef.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers));
 BA.debugLineNum = 3085;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 BA.debugLineNum = 3089;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.ef.table.class, "_setarrcolumnssorted" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 3091;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(262144);
{
final int step44 = 1;
final int limit44 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step44 > 0 && _row.<Integer>get().intValue() <= limit44) || (step44 < 0 && _row.<Integer>get().intValue() >= limit44) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step44))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3092;BA.debugLine="Dim R(mNumberOfColumns), str As String";
Debug.ShouldStop(524288);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("R", _r);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3093;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(1048576);
{
final int step46 = 1;
final int limit46 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step46 > 0 && _col.<Integer>get().intValue() <= limit46) || (step46 < 0 && _col.<Integer>get().intValue() >= limit46) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step46))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3094;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(2097152);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3095;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(4194304);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3096;BA.debugLine="If str <> Null Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_str)) { 
 BA.debugLineNum = 3097;BA.debugLine="R(col) = str";
Debug.ShouldStop(16777216);
_r.setArrayElement (_str,_col);
 }else {
 BA.debugLineNum = 3099;BA.debugLine="R(col) = \"\"";
Debug.ShouldStop(67108864);
_r.setArrayElement (BA.ObjectToString(""),_col);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3102;BA.debugLine="AddRow(R)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3105;BA.debugLine="Curs.Close";
Debug.ShouldStop(1);
_curs.runVoidMethod ("Close");
 BA.debugLineNum = 3108;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsqlitedb2(RemoteObject __ref,RemoteObject _sqlite,RemoteObject _query,RemoteObject _automaticwidths,RemoteObject _columndatatypes) throws Exception{
try {
		Debug.PushSubsStack("LoadSQLiteDB2 (table) ","table",20,__ref.getField(false, "ba"),__ref,3120);
if (RapidSub.canDelegate("loadsqlitedb2")) { return __ref.runUserSub(false, "table","loadsqlitedb2", __ref, _sqlite, _query, _automaticwidths, _columndatatypes);}
RemoteObject _curs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _headers = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _ii = RemoteObject.createImmutable(0L);
RemoteObject _dd = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _r = null;
Debug.locals.put("SQLite", _sqlite);
Debug.locals.put("Query", _query);
Debug.locals.put("AutomaticWidths", _automaticwidths);
Debug.locals.put("ColumnDataTypes", _columndatatypes);
 BA.debugLineNum = 3120;BA.debugLine="Public Sub LoadSQLiteDB2(SQLite As SQL, Query As S";
Debug.ShouldStop(32768);
 BA.debugLineNum = 3121;BA.debugLine="Dim Curs As Cursor";
Debug.ShouldStop(65536);
_curs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 3122;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
Debug.ShouldStop(131072);
_curs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sqlite.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 3124;BA.debugLine="cAutomaticWidths = AutomaticWidths";
Debug.ShouldStop(524288);
__ref.setField ("_cautomaticwidths" /*RemoteObject*/ ,_automaticwidths);
 BA.debugLineNum = 3125;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
Debug.ShouldStop(1048576);
__ref.setField ("_mnumberofcolumns" /*RemoteObject*/ ,_curs.runMethod(true,"getColumnCount"));
 BA.debugLineNum = 3126;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 3128;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
Debug.ShouldStop(8388608);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 3129;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(16777216);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 3130;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(33554432);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 3131;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(67108864);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
 BA.debugLineNum = 3132;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
Debug.ShouldStop(134217728);
table._ccolumndatatype = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ccolumndatatype",table._ccolumndatatype);
 BA.debugLineNum = 3133;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(268435456);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 3134;BA.debugLine="Dim ii As Long";
Debug.ShouldStop(536870912);
_ii = RemoteObject.createImmutable(0L);Debug.locals.put("ii", _ii);
 BA.debugLineNum = 3135;BA.debugLine="Dim dd As Double";
Debug.ShouldStop(1073741824);
_dd = RemoteObject.createImmutable(0);Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3136;BA.debugLine="Dim str As String";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3137;BA.debugLine="cColumnDataType = ColumnDataTypes";
Debug.ShouldStop(1);
__ref.setField ("_ccolumndatatype" /*RemoteObject*/ ,_columndatatypes);
 BA.debugLineNum = 3138;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(2);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step16 > 0 && _col.<Integer>get().intValue() <= limit16) || (step16 < 0 && _col.<Integer>get().intValue() >= limit16) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3139;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
Debug.ShouldStop(4);
_headers.setArrayElement (_curs.runMethod(true,"GetColumnName",(Object)(_col)),_col);
 BA.debugLineNum = 3140;BA.debugLine="If AutomaticWidths = False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_automaticwidths,table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3141;BA.debugLine="ColumnWidths(col) = 130dip";
Debug.ShouldStop(16);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 3142;BA.debugLine="HeaderWidths(col) = 130dip";
Debug.ShouldStop(32);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 3143;BA.debugLine="DataWidths(col) = 130dip";
Debug.ShouldStop(64);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 }else {
 BA.debugLineNum = 3145;BA.debugLine="If HeaderMultiTypeFace = True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3146;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
Debug.ShouldStop(512);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 }else {
 BA.debugLineNum = 3148;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
Debug.ShouldStop(2048);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 };
 BA.debugLineNum = 3150;BA.debugLine="DataWidths(col) = 0";
Debug.ShouldStop(8192);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, 0),_col);
 BA.debugLineNum = 3151;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(16384);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step29 > 0 && _row.<Integer>get().intValue() <= limit29) || (step29 < 0 && _row.<Integer>get().intValue() >= limit29) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step29))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3152;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(32768);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3153;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(65536);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3154;BA.debugLine="If str <> Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("N",_str)) { 
 BA.debugLineNum = 3155;BA.debugLine="Select cColumnDataType(col)";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).getArrayElement(true,_col),BA.ObjectToString("I"),BA.ObjectToString("R"))) {
case 0: {
 BA.debugLineNum = 3157;BA.debugLine="ii = Curs.GetInt2(col)";
Debug.ShouldStop(1048576);
_ii = BA.numberCast(long.class, _curs.runMethod(true,"GetInt2",(Object)(_col)));Debug.locals.put("ii", _ii);
 BA.debugLineNum = 3158;BA.debugLine="str = ii";
Debug.ShouldStop(2097152);
_str = BA.NumberToString(_ii);Debug.locals.put("str", _str);
 break; }
case 1: {
 BA.debugLineNum = 3160;BA.debugLine="dd = Curs.GetDouble2(col)";
Debug.ShouldStop(8388608);
_dd = _curs.runMethod(true,"GetDouble2",(Object)(_col));Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3161;BA.debugLine="str = dd";
Debug.ShouldStop(16777216);
_str = BA.NumberToString(_dd);Debug.locals.put("str", _str);
 break; }
}
;
 }else {
 BA.debugLineNum = 3164;BA.debugLine="str = \"\"";
Debug.ShouldStop(134217728);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 3166;BA.debugLine="If MultiTypeFace = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3167;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)((__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 }else {
 BA.debugLineNum = 3169;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
Debug.ShouldStop(1);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)((__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 };
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3172;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
Debug.ShouldStop(8);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))))),_col);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3176;BA.debugLine="SetHeader(Headers)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.ef.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers));
 BA.debugLineNum = 3177;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 BA.debugLineNum = 3181;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.table.class, "_setarrcolumnssorted" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 3183;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(16384);
{
final int step56 = 1;
final int limit56 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step56 > 0 && _row.<Integer>get().intValue() <= limit56) || (step56 < 0 && _row.<Integer>get().intValue() >= limit56) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step56))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3184;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(32768);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3185;BA.debugLine="Dim R(mNumberOfColumns), str As String";
Debug.ShouldStop(65536);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("R", _r);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3186;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(131072);
{
final int step59 = 1;
final int limit59 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step59 > 0 && _col.<Integer>get().intValue() <= limit59) || (step59 < 0 && _col.<Integer>get().intValue() >= limit59) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step59))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3187;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(262144);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3188;BA.debugLine="If str = Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("n",_str)) { 
 BA.debugLineNum = 3189;BA.debugLine="R(col) = \"\"";
Debug.ShouldStop(1048576);
_r.setArrayElement (BA.ObjectToString(""),_col);
 }else {
 BA.debugLineNum = 3191;BA.debugLine="Select cColumnDataType(col)";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).getArrayElement(true,_col),BA.ObjectToString("I"),BA.ObjectToString("R"),BA.ObjectToString("T"))) {
case 0: {
 BA.debugLineNum = 3193;BA.debugLine="ii = Curs.GetLong2(col)";
Debug.ShouldStop(16777216);
_ii = _curs.runMethod(true,"GetLong2",(Object)(_col));Debug.locals.put("ii", _ii);
 BA.debugLineNum = 3194;BA.debugLine="R(col) = ii";
Debug.ShouldStop(33554432);
_r.setArrayElement (BA.NumberToString(_ii),_col);
 break; }
case 1: {
 BA.debugLineNum = 3196;BA.debugLine="dd = Curs.GetDouble2(col)";
Debug.ShouldStop(134217728);
_dd = _curs.runMethod(true,"GetDouble2",(Object)(_col));Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3197;BA.debugLine="R(col) = dd";
Debug.ShouldStop(268435456);
_r.setArrayElement (BA.NumberToString(_dd),_col);
 break; }
case 2: {
 BA.debugLineNum = 3199;BA.debugLine="R(col) = Curs.GetString2(col)";
Debug.ShouldStop(1073741824);
_r.setArrayElement (_curs.runMethod(true,"GetString2",(Object)(_col)),_col);
 break; }
default: {
 BA.debugLineNum = 3201;BA.debugLine="R(col) = \"\"";
Debug.ShouldStop(1);
_r.setArrayElement (BA.ObjectToString(""),_col);
 break; }
}
;
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3205;BA.debugLine="AddRow(R)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3208;BA.debugLine="Curs.Close";
Debug.ShouldStop(128);
_curs.runVoidMethod ("Close");
 BA.debugLineNum = 3209;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsqlitedb3(RemoteObject __ref,RemoteObject _sqlite,RemoteObject _query,RemoteObject _values,RemoteObject _automaticwidths) throws Exception{
try {
		Debug.PushSubsStack("LoadSQLiteDB3 (table) ","table",20,__ref.getField(false, "ba"),__ref,3220);
if (RapidSub.canDelegate("loadsqlitedb3")) { return __ref.runUserSub(false, "table","loadsqlitedb3", __ref, _sqlite, _query, _values, _automaticwidths);}
RemoteObject _curs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _headers = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _r = null;
Debug.locals.put("SQLite", _sqlite);
Debug.locals.put("Query", _query);
Debug.locals.put("Values", _values);
Debug.locals.put("AutomaticWidths", _automaticwidths);
 BA.debugLineNum = 3220;BA.debugLine="Public Sub LoadSQLiteDB3(SQLite As SQL, Query As S";
Debug.ShouldStop(524288);
 BA.debugLineNum = 3221;BA.debugLine="Dim Curs As Cursor";
Debug.ShouldStop(1048576);
_curs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 3222;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
Debug.ShouldStop(2097152);
_curs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sqlite.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_values)));Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 3224;BA.debugLine="cAutomaticWidths = AutomaticWidths";
Debug.ShouldStop(8388608);
__ref.setField ("_cautomaticwidths" /*RemoteObject*/ ,_automaticwidths);
 BA.debugLineNum = 3225;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
Debug.ShouldStop(16777216);
__ref.setField ("_mnumberofcolumns" /*RemoteObject*/ ,_curs.runMethod(true,"getColumnCount"));
 BA.debugLineNum = 3226;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 3228;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
Debug.ShouldStop(134217728);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 3229;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(268435456);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 3230;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(536870912);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 3231;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(1073741824);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
 BA.debugLineNum = 3232;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
Debug.ShouldStop(-2147483648);
table._ccolumndatatype = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ccolumndatatype",table._ccolumndatatype);
 BA.debugLineNum = 3233;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(1);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 3234;BA.debugLine="Dim str As String";
Debug.ShouldStop(2);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3235;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(4);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _col.<Integer>get().intValue() <= limit13) || (step13 < 0 && _col.<Integer>get().intValue() >= limit13) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3236;BA.debugLine="cColumnDataType(col) = \"T\"";
Debug.ShouldStop(8);
__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).setArrayElement (BA.ObjectToString("T"),_col);
 BA.debugLineNum = 3237;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
Debug.ShouldStop(16);
_headers.setArrayElement (_curs.runMethod(true,"GetColumnName",(Object)(_col)),_col);
 BA.debugLineNum = 3238;BA.debugLine="If AutomaticWidths = False Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_automaticwidths,table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3239;BA.debugLine="ColumnWidths(col) = 130dip";
Debug.ShouldStop(64);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 3240;BA.debugLine="HeaderWidths(col) = 130dip";
Debug.ShouldStop(128);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 3241;BA.debugLine="DataWidths(col) = 130dip";
Debug.ShouldStop(256);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 }else {
 BA.debugLineNum = 3243;BA.debugLine="If HeaderMultiTypeFace = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3244;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
Debug.ShouldStop(2048);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 }else {
 BA.debugLineNum = 3246;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
Debug.ShouldStop(8192);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 };
 BA.debugLineNum = 3248;BA.debugLine="DataWidths(col) = 0";
Debug.ShouldStop(32768);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, 0),_col);
 BA.debugLineNum = 3249;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(65536);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step27 > 0 && _row.<Integer>get().intValue() <= limit27) || (step27 < 0 && _row.<Integer>get().intValue() >= limit27) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step27))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3250;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(131072);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3251;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(262144);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3252;BA.debugLine="If str <> Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",_str)) { 
 BA.debugLineNum = 3253;BA.debugLine="If MultiTypeFace = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3254;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
Debug.ShouldStop(2097152);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)((__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 }else {
 BA.debugLineNum = 3256;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
Debug.ShouldStop(8388608);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)((__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 };
 };
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3260;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
Debug.ShouldStop(134217728);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))))),_col);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3264;BA.debugLine="SetHeader(Headers)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.ef.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers));
 BA.debugLineNum = 3265;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 BA.debugLineNum = 3269;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.table.class, "_setarrcolumnssorted" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 3271;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(64);
{
final int step44 = 1;
final int limit44 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step44 > 0 && _row.<Integer>get().intValue() <= limit44) || (step44 < 0 && _row.<Integer>get().intValue() >= limit44) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step44))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3272;BA.debugLine="Dim R(mNumberOfColumns), str As String";
Debug.ShouldStop(128);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("R", _r);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3273;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(256);
{
final int step46 = 1;
final int limit46 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step46 > 0 && _col.<Integer>get().intValue() <= limit46) || (step46 < 0 && _col.<Integer>get().intValue() >= limit46) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step46))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3274;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(512);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3275;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(1024);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3276;BA.debugLine="If str <> Null Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("N",_str)) { 
 BA.debugLineNum = 3277;BA.debugLine="R(col) = str";
Debug.ShouldStop(4096);
_r.setArrayElement (_str,_col);
 }else {
 BA.debugLineNum = 3279;BA.debugLine="R(col) = \"\"";
Debug.ShouldStop(16384);
_r.setArrayElement (BA.ObjectToString(""),_col);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3282;BA.debugLine="AddRow(R)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.ef.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3285;BA.debugLine="Curs.Close";
Debug.ShouldStop(1048576);
_curs.runVoidMethod ("Close");
 BA.debugLineNum = 3286;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsqlitedb4(RemoteObject __ref,RemoteObject _sqlite,RemoteObject _query,RemoteObject _automaticwidths) throws Exception{
try {
		Debug.PushSubsStack("LoadSQLiteDB4 (table) ","table",20,__ref.getField(false, "ba"),__ref,3294);
if (RapidSub.canDelegate("loadsqlitedb4")) { return __ref.runUserSub(false, "table","loadsqlitedb4", __ref, _sqlite, _query, _automaticwidths);}
RemoteObject _curs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _headers = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _dval = RemoteObject.createImmutable(0);
RemoteObject _r = null;
Debug.locals.put("SQLite", _sqlite);
Debug.locals.put("Query", _query);
Debug.locals.put("AutomaticWidths", _automaticwidths);
 BA.debugLineNum = 3294;BA.debugLine="Public Sub LoadSQLiteDB4(SQLite As SQL, Query As S";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 3295;BA.debugLine="Private Curs As Cursor";
Debug.ShouldStop(1073741824);
_curs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 3297;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
Debug.ShouldStop(1);
_curs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sqlite.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 3299;BA.debugLine="cAutomaticWidths = AutomaticWidths";
Debug.ShouldStop(4);
__ref.setField ("_cautomaticwidths" /*RemoteObject*/ ,_automaticwidths);
 BA.debugLineNum = 3300;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
Debug.ShouldStop(8);
__ref.setField ("_mnumberofcolumns" /*RemoteObject*/ ,_curs.runMethod(true,"getColumnCount"));
 BA.debugLineNum = 3301;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 3303;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
Debug.ShouldStop(64);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 3304;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(128);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 3305;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(256);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 3306;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(512);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
 BA.debugLineNum = 3307;BA.debugLine="Private col, row As Int";
Debug.ShouldStop(1024);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 3308;BA.debugLine="Private str As String";
Debug.ShouldStop(2048);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3309;BA.debugLine="Private dVal As Double";
Debug.ShouldStop(4096);
_dval = RemoteObject.createImmutable(0);Debug.locals.put("dVal", _dval);
 BA.debugLineNum = 3311;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
Debug.ShouldStop(16384);
__ref.setField ("_ccolumndatatype" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_checkcolumndatatypes" /*RemoteObject*/ ,(Object)(_curs)));
 BA.debugLineNum = 3313;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(65536);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step14 > 0 && _col.<Integer>get().intValue() <= limit14) || (step14 < 0 && _col.<Integer>get().intValue() >= limit14) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step14))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3314;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
Debug.ShouldStop(131072);
_headers.setArrayElement (_curs.runMethod(true,"GetColumnName",(Object)(_col)),_col);
 BA.debugLineNum = 3315;BA.debugLine="If AutomaticWidths = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_automaticwidths,table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3316;BA.debugLine="ColumnWidths(col) = 130dip";
Debug.ShouldStop(524288);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 3317;BA.debugLine="HeaderWidths(col) = 130dip";
Debug.ShouldStop(1048576);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 3318;BA.debugLine="DataWidths(col) = 130dip";
Debug.ShouldStop(2097152);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 }else {
 BA.debugLineNum = 3320;BA.debugLine="If HeaderMultiTypeFace = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3321;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
Debug.ShouldStop(16777216);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 }else {
 BA.debugLineNum = 3323;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
Debug.ShouldStop(67108864);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 };
 BA.debugLineNum = 3325;BA.debugLine="DataWidths(col) = 0";
Debug.ShouldStop(268435456);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, 0),_col);
 BA.debugLineNum = 3326;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(536870912);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step27 > 0 && _row.<Integer>get().intValue() <= limit27) || (step27 < 0 && _row.<Integer>get().intValue() >= limit27) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step27))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3327;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(1073741824);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3328;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(-2147483648);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3329;BA.debugLine="If str = Null Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("n",_str)) { 
 BA.debugLineNum = 3330;BA.debugLine="str = \"\"";
Debug.ShouldStop(2);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);
 }else 
{ BA.debugLineNum = 3331;BA.debugLine="Else If IsNumber(str) Then";
Debug.ShouldStop(4);
if (table.__c.runMethod(true,"IsNumber",(Object)(_str)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3332;BA.debugLine="dVal = Curs.GetDouble2(col)";
Debug.ShouldStop(8);
_dval = _curs.runMethod(true,"GetDouble2",(Object)(_col));Debug.locals.put("dVal", _dval);
 BA.debugLineNum = 3333;BA.debugLine="str = dVal";
Debug.ShouldStop(16);
_str = BA.NumberToString(_dval);Debug.locals.put("str", _str);
 }}
;
 BA.debugLineNum = 3335;BA.debugLine="If MultiTypeFace = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3336;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
Debug.ShouldStop(128);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)((__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 }else {
 BA.debugLineNum = 3338;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
Debug.ShouldStop(512);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)((__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 };
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3341;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
Debug.ShouldStop(4096);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))))),_col);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3345;BA.debugLine="SetHeader(Headers)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.ef.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers));
 BA.debugLineNum = 3346;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 BA.debugLineNum = 3350;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.ef.table.class, "_setarrcolumnssorted" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 3352;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(8388608);
{
final int step48 = 1;
final int limit48 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step48 > 0 && _row.<Integer>get().intValue() <= limit48) || (step48 < 0 && _row.<Integer>get().intValue() >= limit48) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step48))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3353;BA.debugLine="Dim R(mNumberOfColumns), str As String";
Debug.ShouldStop(16777216);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("R", _r);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3354;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(33554432);
{
final int step50 = 1;
final int limit50 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step50 > 0 && _col.<Integer>get().intValue() <= limit50) || (step50 < 0 && _col.<Integer>get().intValue() >= limit50) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step50))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3355;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(67108864);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3356;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(134217728);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3357;BA.debugLine="If str = Null Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("n",_str)) { 
 BA.debugLineNum = 3358;BA.debugLine="str = \"\"";
Debug.ShouldStop(536870912);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);
 }else 
{ BA.debugLineNum = 3359;BA.debugLine="Else If IsNumber(str) Then";
Debug.ShouldStop(1073741824);
if (table.__c.runMethod(true,"IsNumber",(Object)(_str)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3360;BA.debugLine="dVal = Curs.GetDouble2(col)";
Debug.ShouldStop(-2147483648);
_dval = _curs.runMethod(true,"GetDouble2",(Object)(_col));Debug.locals.put("dVal", _dval);
 BA.debugLineNum = 3361;BA.debugLine="str = dVal";
Debug.ShouldStop(1);
_str = BA.NumberToString(_dval);Debug.locals.put("str", _str);
 }}
;
 BA.debugLineNum = 3363;BA.debugLine="R(col) = str";
Debug.ShouldStop(4);
_r.setArrayElement (_str,_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3365;BA.debugLine="AddRow(R)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3368;BA.debugLine="Curs.Close";
Debug.ShouldStop(128);
_curs.runVoidMethod ("Close");
 BA.debugLineNum = 3369;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsqlitedb5(RemoteObject __ref,RemoteObject _sqlite,RemoteObject _query,RemoteObject _values,RemoteObject _automaticwidths) throws Exception{
try {
		Debug.PushSubsStack("LoadSQLiteDB5 (table) ","table",20,__ref.getField(false, "ba"),__ref,3377);
if (RapidSub.canDelegate("loadsqlitedb5")) { return __ref.runUserSub(false, "table","loadsqlitedb5", __ref, _sqlite, _query, _values, _automaticwidths);}
RemoteObject _curs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _headers = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _dval = RemoteObject.createImmutable(0);
RemoteObject _r = null;
Debug.locals.put("SQLite", _sqlite);
Debug.locals.put("Query", _query);
Debug.locals.put("Values", _values);
Debug.locals.put("AutomaticWidths", _automaticwidths);
 BA.debugLineNum = 3377;BA.debugLine="Public Sub LoadSQLiteDB5(SQLite As SQL, Query As S";
Debug.ShouldStop(65536);
 BA.debugLineNum = 3378;BA.debugLine="Private Curs As Cursor";
Debug.ShouldStop(131072);
_curs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 3380;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
Debug.ShouldStop(524288);
_curs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sqlite.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_values)));Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 3382;BA.debugLine="cAutomaticWidths = AutomaticWidths";
Debug.ShouldStop(2097152);
__ref.setField ("_cautomaticwidths" /*RemoteObject*/ ,_automaticwidths);
 BA.debugLineNum = 3383;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
Debug.ShouldStop(4194304);
__ref.setField ("_mnumberofcolumns" /*RemoteObject*/ ,_curs.runMethod(true,"getColumnCount"));
 BA.debugLineNum = 3384;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 3386;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
Debug.ShouldStop(33554432);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 3387;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(67108864);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 3388;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(134217728);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 3389;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(268435456);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
 BA.debugLineNum = 3390;BA.debugLine="Private col, row As Int";
Debug.ShouldStop(536870912);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 3391;BA.debugLine="Private str As String";
Debug.ShouldStop(1073741824);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3392;BA.debugLine="Private dVal As Double";
Debug.ShouldStop(-2147483648);
_dval = RemoteObject.createImmutable(0);Debug.locals.put("dVal", _dval);
 BA.debugLineNum = 3394;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
Debug.ShouldStop(2);
__ref.setField ("_ccolumndatatype" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_checkcolumndatatypes" /*RemoteObject*/ ,(Object)(_curs)));
 BA.debugLineNum = 3396;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(8);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step14 > 0 && _col.<Integer>get().intValue() <= limit14) || (step14 < 0 && _col.<Integer>get().intValue() >= limit14) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step14))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3397;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
Debug.ShouldStop(16);
_headers.setArrayElement (_curs.runMethod(true,"GetColumnName",(Object)(_col)),_col);
 BA.debugLineNum = 3398;BA.debugLine="If AutomaticWidths = False Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_automaticwidths,table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3399;BA.debugLine="ColumnWidths(col) = 130dip";
Debug.ShouldStop(64);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 3400;BA.debugLine="HeaderWidths(col) = 130dip";
Debug.ShouldStop(128);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 3401;BA.debugLine="DataWidths(col) = 130dip";
Debug.ShouldStop(256);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 }else {
 BA.debugLineNum = 3403;BA.debugLine="If HeaderMultiTypeFace = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3404;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
Debug.ShouldStop(2048);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 }else {
 BA.debugLineNum = 3406;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
Debug.ShouldStop(8192);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 };
 BA.debugLineNum = 3408;BA.debugLine="DataWidths(col) = 0";
Debug.ShouldStop(32768);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, 0),_col);
 BA.debugLineNum = 3409;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(65536);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step27 > 0 && _row.<Integer>get().intValue() <= limit27) || (step27 < 0 && _row.<Integer>get().intValue() >= limit27) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step27))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3410;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(131072);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3411;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(262144);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3412;BA.debugLine="If str = Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("n",_str)) { 
 BA.debugLineNum = 3413;BA.debugLine="str = \"\"";
Debug.ShouldStop(1048576);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);
 }else 
{ BA.debugLineNum = 3414;BA.debugLine="Else If IsNumber(str) Then";
Debug.ShouldStop(2097152);
if (table.__c.runMethod(true,"IsNumber",(Object)(_str)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3415;BA.debugLine="dVal = Curs.GetDouble2(col)";
Debug.ShouldStop(4194304);
_dval = _curs.runMethod(true,"GetDouble2",(Object)(_col));Debug.locals.put("dVal", _dval);
 BA.debugLineNum = 3416;BA.debugLine="str = dVal";
Debug.ShouldStop(8388608);
_str = BA.NumberToString(_dval);Debug.locals.put("str", _str);
 }}
;
 BA.debugLineNum = 3418;BA.debugLine="If MultiTypeFace = True Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3419;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
Debug.ShouldStop(67108864);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)((__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 }else {
 BA.debugLineNum = 3421;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
Debug.ShouldStop(268435456);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)((__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 };
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3424;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))))),_col);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3428;BA.debugLine="SetHeader(Headers)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.ef.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers));
 BA.debugLineNum = 3429;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 BA.debugLineNum = 3433;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.ef.table.class, "_setarrcolumnssorted" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 3435;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(1024);
{
final int step48 = 1;
final int limit48 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step48 > 0 && _row.<Integer>get().intValue() <= limit48) || (step48 < 0 && _row.<Integer>get().intValue() >= limit48) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step48))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3436;BA.debugLine="Dim R(mNumberOfColumns), str As String";
Debug.ShouldStop(2048);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("R", _r);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 3437;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(4096);
{
final int step50 = 1;
final int limit50 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step50 > 0 && _col.<Integer>get().intValue() <= limit50) || (step50 < 0 && _col.<Integer>get().intValue() >= limit50) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step50))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3438;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(8192);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3439;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(16384);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 3440;BA.debugLine="If str = Null Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("n",_str)) { 
 BA.debugLineNum = 3441;BA.debugLine="str = \"\"";
Debug.ShouldStop(65536);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);
 }else 
{ BA.debugLineNum = 3442;BA.debugLine="Else If IsNumber(str) Then";
Debug.ShouldStop(131072);
if (table.__c.runMethod(true,"IsNumber",(Object)(_str)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3443;BA.debugLine="dVal = Curs.GetDouble2(col)";
Debug.ShouldStop(262144);
_dval = _curs.runMethod(true,"GetDouble2",(Object)(_col));Debug.locals.put("dVal", _dval);
 BA.debugLineNum = 3444;BA.debugLine="str = dVal";
Debug.ShouldStop(524288);
_str = BA.NumberToString(_dval);Debug.locals.put("str", _str);
 }}
;
 BA.debugLineNum = 3446;BA.debugLine="R(col) = str";
Debug.ShouldStop(2097152);
_r.setArrayElement (_str,_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3448;BA.debugLine="AddRow(R)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.ef.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3451;BA.debugLine="Curs.Close";
Debug.ShouldStop(67108864);
_curs.runVoidMethod ("Close");
 BA.debugLineNum = 3452;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadtablefromcsv(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _headersexist) throws Exception{
try {
		Debug.PushSubsStack("LoadTableFromCSV (table) ","table",20,__ref.getField(false, "ba"),__ref,1730);
if (RapidSub.canDelegate("loadtablefromcsv")) { return __ref.runUserSub(false, "table","loadtablefromcsv", __ref, _dir, _filename, _headersexist);}
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _h = null;
RemoteObject _headers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _firstrow = null;
RemoteObject _row = null;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
Debug.locals.put("HeadersExist", _headersexist);
 BA.debugLineNum = 1730;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filenam";
Debug.ShouldStop(2);
 BA.debugLineNum = 1732;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(8);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1733;BA.debugLine="Dim h() As String";
Debug.ShouldStop(16);
_h = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("h", _h);
 BA.debugLineNum = 1735;BA.debugLine="cAutomaticWidths = False";
Debug.ShouldStop(64);
__ref.setField ("_cautomaticwidths" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 BA.debugLineNum = 1737;BA.debugLine="If HeadersExist Then";
Debug.ShouldStop(256);
if (_headersexist.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1738;BA.debugLine="Dim headers As List";
Debug.ShouldStop(512);
_headers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("headers", _headers);
 BA.debugLineNum = 1739;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\"";
Debug.ShouldStop(1024);
_list1 = __ref.getField(false,"_stringutils1" /*RemoteObject*/ ).runMethod(false,"LoadCSV2",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(",")),(Object)(_headers));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1740;BA.debugLine="Dim h(headers.Size) As String";
Debug.ShouldStop(2048);
_h = RemoteObject.createNewArray ("String", new int[] {_headers.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("h", _h);
 BA.debugLineNum = 1741;BA.debugLine="For i = 0 To headers.Size - 1";
Debug.ShouldStop(4096);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_headers.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1742;BA.debugLine="h(i) = headers.Get(i)";
Debug.ShouldStop(8192);
_h.setArrayElement (BA.ObjectToString(_headers.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 1745;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
Debug.ShouldStop(65536);
_list1 = __ref.getField(false,"_stringutils1" /*RemoteObject*/ ).runMethod(false,"LoadCSV",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(RemoteObject.createImmutable(","))));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1746;BA.debugLine="Dim firstRow() As String";
Debug.ShouldStop(131072);
_firstrow = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 1747;BA.debugLine="firstRow = List1.Get(0)";
Debug.ShouldStop(262144);
_firstrow = (_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 1748;BA.debugLine="Dim h(firstRow.Length) As String";
Debug.ShouldStop(524288);
_h = RemoteObject.createNewArray ("String", new int[] {_firstrow.getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("h", _h);
 BA.debugLineNum = 1749;BA.debugLine="For i = 0 To firstRow.Length - 1";
Debug.ShouldStop(1048576);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_firstrow.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1750;BA.debugLine="h(i) = \"Col\" & (i + 1)";
Debug.ShouldStop(2097152);
_h.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("Col"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1753;BA.debugLine="innerClearAll(h.Length, True)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(_h.getField(true,"length")),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 1754;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(33554432);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 1755;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(67108864);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 1756;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(134217728);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
 BA.debugLineNum = 1757;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
Debug.ShouldStop(268435456);
table._ccolumndatatype = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ccolumndatatype",table._ccolumndatatype);
 BA.debugLineNum = 1758;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(536870912);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1759;BA.debugLine="cColumnDataType(i) = \"T\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).setArrayElement (BA.ObjectToString("T"),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1760;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )}, "/",0, 0)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1761;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(1);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1762;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(2);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1765;BA.debugLine="SetHeader(h)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_h));
 BA.debugLineNum = 1766;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 BA.debugLineNum = 1770;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.ef.table.class, "_setarrcolumnssorted" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 1772;BA.debugLine="For i = 0 To List1.Size - 1";
Debug.ShouldStop(2048);
{
final int step34 = 1;
final int limit34 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34) ;_i = ((int)(0 + _i + step34))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1773;BA.debugLine="Dim Row() As String";
Debug.ShouldStop(4096);
_row = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Row", _row);
 BA.debugLineNum = 1774;BA.debugLine="Row = List1.Get(i)";
Debug.ShouldStop(8192);
_row = (_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1775;BA.debugLine="AddRow(Row)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.ef.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_row));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1777;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadtablefromcsv2(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _headersexist,RemoteObject _separatorchar,RemoteObject _automaticwidths) throws Exception{
try {
		Debug.PushSubsStack("LoadTableFromCSV2 (table) ","table",20,__ref.getField(false, "ba"),__ref,1784);
if (RapidSub.canDelegate("loadtablefromcsv2")) { return __ref.runUserSub(false, "table","loadtablefromcsv2", __ref, _dir, _filename, _headersexist, _separatorchar, _automaticwidths);}
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstheaders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _headers = null;
int _i = 0;
RemoteObject _firstrow = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _strrow = null;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
Debug.locals.put("HeadersExist", _headersexist);
Debug.locals.put("SeparatorChar", _separatorchar);
Debug.locals.put("AutomaticWidths", _automaticwidths);
 BA.debugLineNum = 1784;BA.debugLine="Public Sub LoadTableFromCSV2(Dir As String, Filena";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1786;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(33554432);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1788;BA.debugLine="cAutomaticWidths = AutomaticWidths";
Debug.ShouldStop(134217728);
__ref.setField ("_cautomaticwidths" /*RemoteObject*/ ,_automaticwidths);
 BA.debugLineNum = 1790;BA.debugLine="If HeadersExist Then";
Debug.ShouldStop(536870912);
if (_headersexist.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1791;BA.debugLine="Dim lstHeaders As List";
Debug.ShouldStop(1073741824);
_lstheaders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstHeaders", _lstheaders);
 BA.debugLineNum = 1792;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, Sep";
Debug.ShouldStop(-2147483648);
_list1 = __ref.getField(false,"_stringutils1" /*RemoteObject*/ ).runMethod(false,"LoadCSV2",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(_separatorchar)),(Object)(_lstheaders));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1793;BA.debugLine="Dim Headers(lstHeaders.Size) As String";
Debug.ShouldStop(1);
_headers = RemoteObject.createNewArray ("String", new int[] {_lstheaders.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 1794;BA.debugLine="For i = 0 To lstHeaders.Size - 1";
Debug.ShouldStop(2);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_lstheaders.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1795;BA.debugLine="Headers(i) = lstHeaders.Get(i)";
Debug.ShouldStop(4);
_headers.setArrayElement (BA.ObjectToString(_lstheaders.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 1798;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, Sepa";
Debug.ShouldStop(32);
_list1 = __ref.getField(false,"_stringutils1" /*RemoteObject*/ ).runMethod(false,"LoadCSV",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(_separatorchar)));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1799;BA.debugLine="Dim firstRow() As String";
Debug.ShouldStop(64);
_firstrow = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 1800;BA.debugLine="firstRow = List1.Get(0)";
Debug.ShouldStop(128);
_firstrow = (_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 1801;BA.debugLine="Dim Headers(firstRow.Length) As String";
Debug.ShouldStop(256);
_headers = RemoteObject.createNewArray ("String", new int[] {_firstrow.getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 1802;BA.debugLine="For i = 0 To firstRow.Length - 1";
Debug.ShouldStop(512);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_firstrow.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1803;BA.debugLine="Headers(i) = \"Col\" & (i + 1)";
Debug.ShouldStop(1024);
_headers.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("Col"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1806;BA.debugLine="innerClearAll(Headers.Length, True)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(_headers.getField(true,"length")),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 1807;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(16384);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 1808;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(32768);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 1809;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(65536);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
 BA.debugLineNum = 1810;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
Debug.ShouldStop(131072);
table._ccolumndatatype = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ccolumndatatype",table._ccolumndatatype);
 BA.debugLineNum = 1812;BA.debugLine="Dim col, Row As Int";
Debug.ShouldStop(524288);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("Row", _row);
 BA.debugLineNum = 1813;BA.debugLine="If AutomaticWidths = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_automaticwidths,table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1814;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(2097152);
{
final int step26 = 1;
final int limit26 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step26 > 0 && _col.<Integer>get().intValue() <= limit26) || (step26 < 0 && _col.<Integer>get().intValue() >= limit26) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step26))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1815;BA.debugLine="cColumnDataType(col) = \"T\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).setArrayElement (BA.ObjectToString("T"),_col);
 BA.debugLineNum = 1816;BA.debugLine="ColumnWidths(col) = SV2.Width / mNumberOfColumn";
Debug.ShouldStop(8388608);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )}, "/",0, 0)),_col);
 BA.debugLineNum = 1817;BA.debugLine="HeaderWidths(col) = ColumnWidths(col)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,_col),_col);
 BA.debugLineNum = 1818;BA.debugLine="DataWidths(col) = ColumnWidths(col)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,_col),_col);
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 1821;BA.debugLine="If HeadersExist Then";
Debug.ShouldStop(268435456);
if (_headersexist.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1822;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
Debug.ShouldStop(536870912);
_strrow = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 1823;BA.debugLine="strRow = List1.Get(col)";
Debug.ShouldStop(1073741824);
_strrow = (_list1.runMethod(false,"Get",(Object)(_col)));Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 1824;BA.debugLine="If HeaderMultiTypeFace = False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1825;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(1);
{
final int step37 = 1;
final int limit37 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step37 > 0 && _col.<Integer>get().intValue() <= limit37) || (step37 < 0 && _col.<Integer>get().intValue() >= limit37) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step37))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1826;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
Debug.ShouldStop(2);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(_lstheaders.runMethod(false,"Get",(Object)(_col)))),(Object)((__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 1829;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(16);
{
final int step41 = 1;
final int limit41 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step41 > 0 && _col.<Integer>get().intValue() <= limit41) || (step41 < 0 && _col.<Integer>get().intValue() >= limit41) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step41))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1830;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
Debug.ShouldStop(32);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(_lstheaders.runMethod(false,"Get",(Object)(_col)))),(Object)((__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 }
}Debug.locals.put("col", _col);
;
 };
 };
 BA.debugLineNum = 1834;BA.debugLine="For Row = 0 To List1.Size - 1";
Debug.ShouldStop(512);
{
final int step46 = 1;
final int limit46 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step46 > 0 && _row.<Integer>get().intValue() <= limit46) || (step46 < 0 && _row.<Integer>get().intValue() >= limit46) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step46))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1835;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
Debug.ShouldStop(1024);
_strrow = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 1836;BA.debugLine="strRow = List1.Get(Row)";
Debug.ShouldStop(2048);
_strrow = (_list1.runMethod(false,"Get",(Object)(_row)));Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 1837;BA.debugLine="If MultiTypeFace = True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1838;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(8192);
{
final int step50 = 1;
final int limit50 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step50 > 0 && _col.<Integer>get().intValue() <= limit50) || (step50 < 0 && _col.<Integer>get().intValue() >= limit50) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step50))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1839;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
Debug.ShouldStop(16384);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_strrow.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 1842;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(131072);
{
final int step54 = 1;
final int limit54 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step54 > 0 && _col.<Integer>get().intValue() <= limit54) || (step54 < 0 && _col.<Integer>get().intValue() >= limit54) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step54))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1843;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
Debug.ShouldStop(262144);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_strrow.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 }
}Debug.locals.put("col", _col);
;
 };
 }
}Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 1847;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(4194304);
{
final int step59 = 1;
final int limit59 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step59 > 0 && _col.<Integer>get().intValue() <= limit59) || (step59 < 0 && _col.<Integer>get().intValue() >= limit59) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step59))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1848;BA.debugLine="cColumnDataType(col) = \"T\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).setArrayElement (BA.ObjectToString("T"),_col);
 BA.debugLineNum = 1849;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
Debug.ShouldStop(16777216);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))))),_col);
 }
}Debug.locals.put("col", _col);
;
 };
 BA.debugLineNum = 1853;BA.debugLine="SetHeader(Headers)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.ef.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers));
 BA.debugLineNum = 1854;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 BA.debugLineNum = 1858;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.ef.table.class, "_setarrcolumnssorted" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 1860;BA.debugLine="For i = 0 To List1.Size - 1";
Debug.ShouldStop(8);
{
final int step67 = 1;
final int limit67 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67) ;_i = ((int)(0 + _i + step67))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1861;BA.debugLine="Dim strRow() As String";
Debug.ShouldStop(16);
_strrow = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 1862;BA.debugLine="strRow = List1.Get(i)";
Debug.ShouldStop(32);
_strrow = (_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 1863;BA.debugLine="AddRow(strRow)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.ef.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_strrow));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1866;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlfastscroll_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("pnlFastScroll_Touch (table) ","table",20,__ref.getField(false, "ba"),__ref,2560);
if (RapidSub.canDelegate("pnlfastscroll_touch")) { return __ref.runUserSub(false, "table","pnlfastscroll_touch", __ref, _action, _x, _y);}
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _sv2top = RemoteObject.createImmutable(0);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 2560;BA.debugLine="Private Sub pnlFastScroll_Touch (Action As Int, X";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 2561;BA.debugLine="Select Action";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(_action,BA.numberCast(int.class, 0),BA.numberCast(int.class, 2),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 2563;BA.debugLine="If Y >= pnlFastScrollCursor.Top And Y <= pnlFas";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",_y,BA.numberCast(double.class, __ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"getTop"))) && RemoteObject.solveBoolean("k",_y,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)))) { 
 BA.debugLineNum = 2564;BA.debugLine="FSY0 = pnlFastScrollCursor.Top";
Debug.ShouldStop(8);
__ref.setField ("_fsy0" /*RemoteObject*/ ,__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"getTop"));
 BA.debugLineNum = 2565;BA.debugLine="FSdY = Y - FSY0";
Debug.ShouldStop(16);
__ref.setField ("_fsdy" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_fsy0" /*RemoteObject*/ )}, "-",1, 0)));
 BA.debugLineNum = 2566;BA.debugLine="FastScrollActive = True";
Debug.ShouldStop(32);
__ref.setField ("_fastscrollactive" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 };
 break; }
case 1: {
 BA.debugLineNum = 2569;BA.debugLine="If FastScrollActive = True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fastscrollactive" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2570;BA.debugLine="Private Top, SV2Top As Int";
Debug.ShouldStop(512);
_top = RemoteObject.createImmutable(0);Debug.locals.put("Top", _top);
_sv2top = RemoteObject.createImmutable(0);Debug.locals.put("SV2Top", _sv2top);
 BA.debugLineNum = 2571;BA.debugLine="Top = Max(Y - FSdY, 0)";
Debug.ShouldStop(1024);
_top = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_fsdy" /*RemoteObject*/ )}, "-",1, 0)),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Top", _top);
 BA.debugLineNum = 2572;BA.debugLine="Top = Min(Top, pnlFastScroll.Height - pnlFastS";
Debug.ShouldStop(2048);
_top = BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _top)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)))));Debug.locals.put("Top", _top);
 BA.debugLineNum = 2573;BA.debugLine="pnlFastScrollCursor.Top = Top";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"setTop",_top);
 BA.debugLineNum = 2574;BA.debugLine="If mFastScrollFixedLabel = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscrollfixedlabel" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2575;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top +";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(true,"_fsclabeltopdelta" /*RemoteObject*/ )}, "+",1, 1));
 };
 BA.debugLineNum = 2577;BA.debugLine="SV2Top = Top / FScScale";
Debug.ShouldStop(65536);
_sv2top = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_top,__ref.getField(true,"_fscscale" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("SV2Top", _sv2top);
 BA.debugLineNum = 2578;BA.debugLine="SV2.VerticalScrollPosition = SV2Top";
Debug.ShouldStop(131072);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setVerticalScrollPosition",_sv2top);
 };
 break; }
case 2: {
 BA.debugLineNum = 2581;BA.debugLine="FScTimer.Enabled = True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_fsctimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",table.__c.getField(true,"True"));
 break; }
}
;
 BA.debugLineNum = 2583;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshlabels(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshLabels (table) ","table",20,__ref.getField(false, "ba"),__ref,2110);
if (RapidSub.canDelegate("refreshlabels")) { return __ref.runUserSub(false, "table","refreshlabels", __ref);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _j = RemoteObject.createImmutable(0);
RemoteObject _lbls = null;
 BA.debugLineNum = 2110;BA.debugLine="Public Sub RefreshLabels";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2111;BA.debugLine="Private i, j As Int";
Debug.ShouldStop(1073741824);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
_j = RemoteObject.createImmutable(0);Debug.locals.put("j", _j);
 BA.debugLineNum = 2113;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.ef.table.class, "_sv2_scrollchanged" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHorizontalScrollPosition")),(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition")));
 BA.debugLineNum = 2114;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
Debug.ShouldStop(2);
{
final int step3 = 1;
final int limit3 = __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue();
_i = __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ) ;
for (;(step3 > 0 && _i.<Integer>get().intValue() <= limit3) || (step3 < 0 && _i.<Integer>get().intValue() >= limit3) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2115;BA.debugLine="HideRow(i)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.ef.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(_i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2118;BA.debugLine="If cTypeFaces.Length < mNumberOfColumns Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 2119;BA.debugLine="Private cTypeFaces(mNumberOfColumns) As Typeface";
Debug.ShouldStop(64);
table._ctypefaces = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ctypefaces",table._ctypefaces);
 BA.debugLineNum = 2120;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(128);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && _j.<Integer>get().intValue() <= limit8) || (step8 < 0 && _j.<Integer>get().intValue() >= limit8) ;_j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 2121;BA.debugLine="cTypeFaces(j) = cTypeFace";
Debug.ShouldStop(256);
__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_ctypeface" /*RemoteObject*/ ),_j);
 }
}Debug.locals.put("j", _j);
;
 };
 BA.debugLineNum = 2125;BA.debugLine="If cTextColors.Length < mNumberOfColumns Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 2126;BA.debugLine="Private cTextColors(mNumberOfColumns) As Int";
Debug.ShouldStop(8192);
table._ctextcolors = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ctextcolors",table._ctextcolors);
 BA.debugLineNum = 2127;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(16384);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = BA.numberCast(int.class, 0) ;
for (;(step14 > 0 && _j.<Integer>get().intValue() <= limit14) || (step14 < 0 && _j.<Integer>get().intValue() >= limit14) ;_j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step14))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 2128;BA.debugLine="cTextColors(j) = cTextColor";
Debug.ShouldStop(32768);
__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_ctextcolor" /*RemoteObject*/ ),_j);
 }
}Debug.locals.put("j", _j);
;
 };
 BA.debugLineNum = 2131;BA.debugLine="For i = 0 To LabelsCache.Size - 1";
Debug.ShouldStop(262144);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step18 > 0 && _i.<Integer>get().intValue() <= limit18) || (step18 < 0 && _i.<Integer>get().intValue() >= limit18) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2132;BA.debugLine="Private lbls() As Label";
Debug.ShouldStop(524288);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 2133;BA.debugLine="lbls = LabelsCache.Get(i)";
Debug.ShouldStop(1048576);
_lbls = (__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 2134;BA.debugLine="For j = 0 To lbls.Length - 1";
Debug.ShouldStop(2097152);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = BA.numberCast(int.class, 0) ;
for (;(step21 > 0 && _j.<Integer>get().intValue() <= limit21) || (step21 < 0 && _j.<Integer>get().intValue() >= limit21) ;_j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step21))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 2135;BA.debugLine="If MultiTypeFace = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2136;BA.debugLine="lbls(j).Typeface = cTypeFaces(j)";
Debug.ShouldStop(8388608);
_lbls.getArrayElement(false,_j).runMethod(false,"setTypeface",(__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,_j).getObject()));
 BA.debugLineNum = 2137;BA.debugLine="lbls(j).TextColor = cTextColors(j)";
Debug.ShouldStop(16777216);
_lbls.getArrayElement(false,_j).runMethod(true,"setTextColor",__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getArrayElement(true,_j));
 }else {
 BA.debugLineNum = 2139;BA.debugLine="lbls(j).Typeface = cTypeFace";
Debug.ShouldStop(67108864);
_lbls.getArrayElement(false,_j).runMethod(false,"setTypeface",(__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 2140;BA.debugLine="lbls(j).TextColor = cTextColor";
Debug.ShouldStop(134217728);
_lbls.getArrayElement(false,_j).runMethod(true,"setTextColor",__ref.getField(true,"_ctextcolor" /*RemoteObject*/ ));
 };
 }
}Debug.locals.put("j", _j);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2145;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show all";
Debug.ShouldStop(1);
{
final int step31 = 1;
final int limit31 = __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue();
_i = __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ) ;
for (;(step31 > 0 && _i.<Integer>get().intValue() <= limit31) || (step31 < 0 && _i.<Integer>get().intValue() >= limit31) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2146;BA.debugLine="ShowRow(i)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(_i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2148;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshtable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshTable (table) ","table",20,__ref.getField(false, "ba"),__ref,2101);
if (RapidSub.canDelegate("refreshtable")) { return __ref.runUserSub(false, "table","refreshtable", __ref);}
int _i = 0;
 BA.debugLineNum = 2101;BA.debugLine="Public Sub RefreshTable";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2102;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.ef.table.class, "_sv2_scrollchanged" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHorizontalScrollPosition")),(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition")));
 BA.debugLineNum = 2103;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
Debug.ShouldStop(4194304);
{
final int step2 = 1;
final int limit2 = __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue();
_i = __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2104;BA.debugLine="HideRow(i)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.ef.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 2105;BA.debugLine="ShowRow(i)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2107;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeaccents(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("RemoveAccents (table) ","table",20,__ref.getField(false, "ba"),__ref,4013);
if (RapidSub.canDelegate("removeaccents")) { return __ref.runUserSub(false, "table","removeaccents", __ref, _s);}
RemoteObject _normalizer = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _n = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("s", _s);
 BA.debugLineNum = 4013;BA.debugLine="Private Sub RemoveAccents(s As String) As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 4014;BA.debugLine="Dim normalizer As JavaObject";
Debug.ShouldStop(8192);
_normalizer = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("normalizer", _normalizer);
 BA.debugLineNum = 4015;BA.debugLine="normalizer.InitializeStatic(\"java.text.Normalizer";
Debug.ShouldStop(16384);
_normalizer.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.text.Normalizer")));
 BA.debugLineNum = 4016;BA.debugLine="Dim n As String = normalizer.RunMethod(\"normalize";
Debug.ShouldStop(32768);
_n = BA.ObjectToString(_normalizer.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("normalize")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_s),(RemoteObject.createImmutable("NFD"))}))));Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 4017;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(65536);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 4018;BA.debugLine="sb.Initialize";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 4019;BA.debugLine="For i = 0 To n.Length - 1";
Debug.ShouldStop(262144);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_n.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4020;BA.debugLine="If Regex.IsMatch(\"\\p{InCombiningDiacriticalMarks";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",table.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(BA.ObjectToString("\\p{InCombiningDiacriticalMarks}")),(Object)(BA.ObjectToString(_n.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i)))))),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 4021;BA.debugLine="sb.Append(n.CharAt(i))";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_n.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4024;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(8388608);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 4025;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removerow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("RemoveRow (table) ","table",20,__ref.getField(false, "ba"),__ref,1922);
if (RapidSub.canDelegate("removerow")) { return __ref.runUserSub(false, "table","removerow", __ref, _row);}
RemoteObject _previndex = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _keepsel = RemoteObject.createImmutable(0);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1922;BA.debugLine="Public Sub RemoveRow(Row As Int)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1923;BA.debugLine="If (Row <0 Or Row > Data.Size-1) Then Return ' ca";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_row,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1925;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.table.class, "_sv2_scrollchanged" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHorizontalScrollPosition")),(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition")));
 BA.debugLineNum = 1929;BA.debugLine="Dim prevIndex As Int";
Debug.ShouldStop(256);
_previndex = RemoteObject.createImmutable(0);Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 1930;BA.debugLine="prevIndex = SelectedRows.IndexOf(Row) ' if the rm";
Debug.ShouldStop(512);
_previndex = __ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_row)));Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 1932;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
Debug.ShouldStop(2048);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1933;BA.debugLine="Dim keepSel As Int";
Debug.ShouldStop(4096);
_keepsel = RemoteObject.createImmutable(0);Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 1934;BA.debugLine="keepSel = SelectedRows.Get(i)";
Debug.ShouldStop(8192);
_keepsel = BA.numberCast(int.class, __ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 1935;BA.debugLine="If (keepSel > Row) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean(">",_keepsel,BA.numberCast(double.class, _row)))) { 
 BA.debugLineNum = 1936;BA.debugLine="SelectedRows.set(i,keepSel-1) ' dec row number";
Debug.ShouldStop(32768);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(BA.numberCast(int.class, _i)),(Object)((RemoteObject.solve(new RemoteObject[] {_keepsel,RemoteObject.createImmutable(1)}, "-",1, 1))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1941;BA.debugLine="If (prevIndex <> -1) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("!",_previndex,BA.numberCast(double.class, -(double) (0 + 1))))) { 
 BA.debugLineNum = 1943;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' removed the c";
Debug.ShouldStop(4194304);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_previndex));
 };
 BA.debugLineNum = 1946;BA.debugLine="Data.RemoveAt(Row)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_row));
 BA.debugLineNum = 1947;BA.debugLine="lstRowColorIndexes.RemoveAt(Row)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_row));
 BA.debugLineNum = 1948;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
Debug.ShouldStop(134217728);
{
final int step17 = 1;
final int limit17 = __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue();
_i = __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1949;BA.debugLine="HideRow(i)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.ef.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1960;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1961;BA.debugLine="maxVisibleRow = Min(maxVisibleRow, Data.Size - 1";
Debug.ShouldStop(256);
__ref.setField ("_maxvisiblerow" /*RemoteObject*/ ,BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))));
 BA.debugLineNum = 1962;BA.debugLine="minVisibleRow = Min(minVisibleRow, Data.Size - 1";
Debug.ShouldStop(512);
__ref.setField ("_minvisiblerow" /*RemoteObject*/ ,BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))));
 BA.debugLineNum = 1963;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show al";
Debug.ShouldStop(1024);
{
final int step23 = 1;
final int limit23 = __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue();
_i = __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1965;BA.debugLine="ShowRow(i)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1969;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(65536);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 1970;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
Debug.ShouldStop(131072);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"));
 BA.debugLineNum = 1971;BA.debugLine="updateIPLocation";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.ef.table.class, "_updateiplocation" /*RemoteObject*/ );
 BA.debugLineNum = 1973;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.ef.table.class, "_sv2_scrollchanged" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHorizontalScrollPosition")),(Object)(BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight")))))));
 BA.debugLineNum = 1974;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean(".",__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_enablestatuslineautofill" /*RemoteObject*/ ),table.__c.getField(true,"True")))) { 
__ref.runClassMethod (b4a.example.ef.table.class, "_setstatusline" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));};
 BA.debugLineNum = 1975;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removerowcolorn(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("RemoveRowColorN (table) ","table",20,__ref.getField(false, "ba"),__ref,2822);
if (RapidSub.canDelegate("removerowcolorn")) { return __ref.runUserSub(false, "table","removerowcolorn", __ref, _row);}
Debug.locals.put("Row", _row);
 BA.debugLineNum = 2822;BA.debugLine="Public Sub RemoveRowColorN(Row As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 2823;BA.debugLine="If Row > -1 And Row <lstRowColorIndexes.Size Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_row,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, __ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 2824;BA.debugLine="lstRowColorIndexes.Set(Row, 0)";
Debug.ShouldStop(128);
__ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(_row),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2825;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(256);
if (__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2826;BA.debugLine="RefreshLabels";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.ef.table.class, "_refreshlabels" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 2829;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveView (table) ","table",20,__ref.getField(false, "ba"),__ref,3488);
if (RapidSub.canDelegate("removeview")) { return __ref.runUserSub(false, "table","removeview", __ref);}
 BA.debugLineNum = 3488;BA.debugLine="Public Sub RemoveView";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 3489;BA.debugLine="pnlTable.RemoveView";
Debug.ShouldStop(1);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 3490;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reverseindexdouble(RemoteObject __ref,RemoteObject _arrdouble,RemoteObject _arrindex,RemoteObject _bunique) throws Exception{
try {
		Debug.PushSubsStack("ReverseIndexDouble (table) ","table",20,__ref.getField(false, "ba"),__ref,4913);
if (RapidSub.canDelegate("reverseindexdouble")) { return __ref.runUserSub(false, "table","reverseindexdouble", __ref, _arrdouble, _arrindex, _bunique);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _n = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _iub = RemoteObject.createImmutable(0);
RemoteObject _bsame = RemoteObject.createImmutable(false);
RemoteObject _arrindex2 = null;
Debug.locals.put("arrDouble", _arrdouble);
Debug.locals.put("arrIndex", _arrindex);
Debug.locals.put("bUnique", _bunique);
 BA.debugLineNum = 4913;BA.debugLine="Sub ReverseIndexDouble(arrDouble() As Double, arrI";
Debug.ShouldStop(65536);
 BA.debugLineNum = 4915;BA.debugLine="Dim i As Int";
Debug.ShouldStop(262144);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 4916;BA.debugLine="Dim c As Int";
Debug.ShouldStop(524288);
_c = RemoteObject.createImmutable(0);Debug.locals.put("c", _c);
 BA.debugLineNum = 4917;BA.debugLine="Dim n As Int";
Debug.ShouldStop(1048576);
_n = RemoteObject.createImmutable(0);Debug.locals.put("n", _n);
 BA.debugLineNum = 4918;BA.debugLine="Dim x As Int";
Debug.ShouldStop(2097152);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 4919;BA.debugLine="Dim iUB As Int";
Debug.ShouldStop(4194304);
_iub = RemoteObject.createImmutable(0);Debug.locals.put("iUB", _iub);
 BA.debugLineNum = 4920;BA.debugLine="Dim bSame As Boolean";
Debug.ShouldStop(8388608);
_bsame = RemoteObject.createImmutable(false);Debug.locals.put("bSame", _bsame);
 BA.debugLineNum = 4921;BA.debugLine="Dim arrIndex2(arrDouble.Length) As Int";
Debug.ShouldStop(16777216);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {_arrdouble.getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4923;BA.debugLine="iUB = arrDouble.Length - 1";
Debug.ShouldStop(67108864);
_iub = RemoteObject.solve(new RemoteObject[] {_arrdouble.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iUB", _iub);
 BA.debugLineNum = 4925;BA.debugLine="If bUnique Then";
Debug.ShouldStop(268435456);
if (_bunique.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4927;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(1073741824);
{
final int step10 = 1;
final int limit10 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step10 > 0 && _i.<Integer>get().intValue() <= limit10) || (step10 < 0 && _i.<Integer>get().intValue() >= limit10) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4928;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
Debug.ShouldStop(-2147483648);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_i),RemoteObject.solve(new RemoteObject[] {_iub,_i}, "-",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4930;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(2);
if (true) return _arrindex2;
 }else {
 BA.debugLineNum = 4932;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(8);
{
final int step15 = 1;
final int limit15 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step15 > 0 && _i.<Integer>get().intValue() <= limit15) || (step15 < 0 && _i.<Integer>get().intValue() >= limit15) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4933;BA.debugLine="If i < iUB Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, _iub))) { 
 BA.debugLineNum = 4934;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
Debug.ShouldStop(32);
_bsame = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_arrdouble.getArrayElement(true,_arrindex.getArrayElement(true,_i)),_arrdouble.getArrayElement(true,_arrindex.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)))));Debug.locals.put("bSame", _bsame);
 }else {
 BA.debugLineNum = 4936;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
Debug.ShouldStop(128);
_bsame = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_arrdouble.getArrayElement(true,_arrindex.getArrayElement(true,_i)),_arrdouble.getArrayElement(true,_arrindex.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1)))));Debug.locals.put("bSame", _bsame);
 };
 BA.debugLineNum = 4938;BA.debugLine="If bSame Then";
Debug.ShouldStop(512);
if (_bsame.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4939;BA.debugLine="c = c + 1";
Debug.ShouldStop(1024);
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("c", _c);
 BA.debugLineNum = 4940;BA.debugLine="If i = iUB Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _iub))) { 
 BA.debugLineNum = 4941;BA.debugLine="x = 0";
Debug.ShouldStop(4096);
_x = BA.numberCast(int.class, 0);Debug.locals.put("x", _x);
 BA.debugLineNum = 4942;BA.debugLine="For n = (i - c) + 1 To i";
Debug.ShouldStop(8192);
{
final int step25 = 1;
final int limit25 = _i.<Integer>get().intValue();
_n = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_i,_c}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1) ;
for (;(step25 > 0 && _n.<Integer>get().intValue() <= limit25) || (step25 < 0 && _n.<Integer>get().intValue() >= limit25) ;_n = RemoteObject.createImmutable((int)(0 + _n.<Integer>get().intValue() + step25))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 4943;BA.debugLine="arrIndex2(x) = arrIndex(n)";
Debug.ShouldStop(16384);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_n),_x);
 BA.debugLineNum = 4944;BA.debugLine="x = x + 1";
Debug.ShouldStop(32768);
_x = RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("x", _x);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 4946;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(131072);
if (true) return _arrindex2;
 };
 }else {
 BA.debugLineNum = 4949;BA.debugLine="If c > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_c,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 4950;BA.debugLine="x = 0";
Debug.ShouldStop(2097152);
_x = BA.numberCast(int.class, 0);Debug.locals.put("x", _x);
 BA.debugLineNum = 4951;BA.debugLine="For n = i - c To i";
Debug.ShouldStop(4194304);
{
final int step34 = 1;
final int limit34 = _i.<Integer>get().intValue();
_n = RemoteObject.solve(new RemoteObject[] {_i,_c}, "-",1, 1) ;
for (;(step34 > 0 && _n.<Integer>get().intValue() <= limit34) || (step34 < 0 && _n.<Integer>get().intValue() >= limit34) ;_n = RemoteObject.createImmutable((int)(0 + _n.<Integer>get().intValue() + step34))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 4952;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
Debug.ShouldStop(8388608);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_n),RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iub,_i}, "-",1, 1)),_x}, "+",1, 1));
 BA.debugLineNum = 4953;BA.debugLine="x = x + 1";
Debug.ShouldStop(16777216);
_x = RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("x", _x);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 4955;BA.debugLine="c = 0";
Debug.ShouldStop(67108864);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);
 }else {
 BA.debugLineNum = 4957;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
Debug.ShouldStop(268435456);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_i),RemoteObject.solve(new RemoteObject[] {_iub,_i}, "-",1, 1));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 4963;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(4);
if (true) return _arrindex2;
 BA.debugLineNum = 4965;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reverseindexlong(RemoteObject __ref,RemoteObject _arrlong,RemoteObject _arrindex,RemoteObject _bunique) throws Exception{
try {
		Debug.PushSubsStack("ReverseIndexLong (table) ","table",20,__ref.getField(false, "ba"),__ref,4859);
if (RapidSub.canDelegate("reverseindexlong")) { return __ref.runUserSub(false, "table","reverseindexlong", __ref, _arrlong, _arrindex, _bunique);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _n = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _iub = RemoteObject.createImmutable(0);
RemoteObject _bsame = RemoteObject.createImmutable(false);
RemoteObject _arrindex2 = null;
Debug.locals.put("arrLong", _arrlong);
Debug.locals.put("arrIndex", _arrindex);
Debug.locals.put("bUnique", _bunique);
 BA.debugLineNum = 4859;BA.debugLine="Sub ReverseIndexLong(arrLong() As Long, arrIndex()";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 4861;BA.debugLine="Dim i As Int";
Debug.ShouldStop(268435456);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 4862;BA.debugLine="Dim c As Int";
Debug.ShouldStop(536870912);
_c = RemoteObject.createImmutable(0);Debug.locals.put("c", _c);
 BA.debugLineNum = 4863;BA.debugLine="Dim n As Int";
Debug.ShouldStop(1073741824);
_n = RemoteObject.createImmutable(0);Debug.locals.put("n", _n);
 BA.debugLineNum = 4864;BA.debugLine="Dim x As Int";
Debug.ShouldStop(-2147483648);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 4865;BA.debugLine="Dim iUB As Int";
Debug.ShouldStop(1);
_iub = RemoteObject.createImmutable(0);Debug.locals.put("iUB", _iub);
 BA.debugLineNum = 4866;BA.debugLine="Dim bSame As Boolean";
Debug.ShouldStop(2);
_bsame = RemoteObject.createImmutable(false);Debug.locals.put("bSame", _bsame);
 BA.debugLineNum = 4867;BA.debugLine="Dim arrIndex2(arrLong.Length) As Int";
Debug.ShouldStop(4);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {_arrlong.getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4869;BA.debugLine="iUB = arrLong.Length - 1";
Debug.ShouldStop(16);
_iub = RemoteObject.solve(new RemoteObject[] {_arrlong.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iUB", _iub);
 BA.debugLineNum = 4871;BA.debugLine="If bUnique Then";
Debug.ShouldStop(64);
if (_bunique.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4873;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(256);
{
final int step10 = 1;
final int limit10 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step10 > 0 && _i.<Integer>get().intValue() <= limit10) || (step10 < 0 && _i.<Integer>get().intValue() >= limit10) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4874;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
Debug.ShouldStop(512);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_i),RemoteObject.solve(new RemoteObject[] {_iub,_i}, "-",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4876;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(2048);
if (true) return _arrindex2;
 }else {
 BA.debugLineNum = 4878;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(8192);
{
final int step15 = 1;
final int limit15 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step15 > 0 && _i.<Integer>get().intValue() <= limit15) || (step15 < 0 && _i.<Integer>get().intValue() >= limit15) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4879;BA.debugLine="If i < iUB Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, _iub))) { 
 BA.debugLineNum = 4880;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
Debug.ShouldStop(32768);
_bsame = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_arrlong.getArrayElement(true,_arrindex.getArrayElement(true,_i)),_arrlong.getArrayElement(true,_arrindex.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)))));Debug.locals.put("bSame", _bsame);
 }else {
 BA.debugLineNum = 4882;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
Debug.ShouldStop(131072);
_bsame = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_arrlong.getArrayElement(true,_arrindex.getArrayElement(true,_i)),_arrlong.getArrayElement(true,_arrindex.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1)))));Debug.locals.put("bSame", _bsame);
 };
 BA.debugLineNum = 4884;BA.debugLine="If bSame Then";
Debug.ShouldStop(524288);
if (_bsame.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4885;BA.debugLine="c = c + 1";
Debug.ShouldStop(1048576);
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("c", _c);
 BA.debugLineNum = 4886;BA.debugLine="If i = iUB Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _iub))) { 
 BA.debugLineNum = 4887;BA.debugLine="x = 0";
Debug.ShouldStop(4194304);
_x = BA.numberCast(int.class, 0);Debug.locals.put("x", _x);
 BA.debugLineNum = 4888;BA.debugLine="For n = (i - c) + 1 To i";
Debug.ShouldStop(8388608);
{
final int step25 = 1;
final int limit25 = _i.<Integer>get().intValue();
_n = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_i,_c}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1) ;
for (;(step25 > 0 && _n.<Integer>get().intValue() <= limit25) || (step25 < 0 && _n.<Integer>get().intValue() >= limit25) ;_n = RemoteObject.createImmutable((int)(0 + _n.<Integer>get().intValue() + step25))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 4889;BA.debugLine="arrIndex2(x) = arrIndex(n)";
Debug.ShouldStop(16777216);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_n),_x);
 BA.debugLineNum = 4890;BA.debugLine="x = x + 1";
Debug.ShouldStop(33554432);
_x = RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("x", _x);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 4892;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(134217728);
if (true) return _arrindex2;
 };
 }else {
 BA.debugLineNum = 4895;BA.debugLine="If c > 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_c,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 4896;BA.debugLine="x = 0";
Debug.ShouldStop(-2147483648);
_x = BA.numberCast(int.class, 0);Debug.locals.put("x", _x);
 BA.debugLineNum = 4897;BA.debugLine="For n = i - c To i";
Debug.ShouldStop(1);
{
final int step34 = 1;
final int limit34 = _i.<Integer>get().intValue();
_n = RemoteObject.solve(new RemoteObject[] {_i,_c}, "-",1, 1) ;
for (;(step34 > 0 && _n.<Integer>get().intValue() <= limit34) || (step34 < 0 && _n.<Integer>get().intValue() >= limit34) ;_n = RemoteObject.createImmutable((int)(0 + _n.<Integer>get().intValue() + step34))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 4898;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
Debug.ShouldStop(2);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_n),RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iub,_i}, "-",1, 1)),_x}, "+",1, 1));
 BA.debugLineNum = 4899;BA.debugLine="x = x + 1";
Debug.ShouldStop(4);
_x = RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("x", _x);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 4901;BA.debugLine="c = 0";
Debug.ShouldStop(16);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);
 }else {
 BA.debugLineNum = 4903;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
Debug.ShouldStop(64);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_i),RemoteObject.solve(new RemoteObject[] {_iub,_i}, "-",1, 1));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 4909;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(4096);
if (true) return _arrindex2;
 BA.debugLineNum = 4911;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reverseindexstring(RemoteObject __ref,RemoteObject _arrstring,RemoteObject _arrindex,RemoteObject _bunique) throws Exception{
try {
		Debug.PushSubsStack("ReverseIndexString (table) ","table",20,__ref.getField(false, "ba"),__ref,4967);
if (RapidSub.canDelegate("reverseindexstring")) { return __ref.runUserSub(false, "table","reverseindexstring", __ref, _arrstring, _arrindex, _bunique);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _n = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _iub = RemoteObject.createImmutable(0);
RemoteObject _bsame = RemoteObject.createImmutable(false);
RemoteObject _arrindex2 = null;
Debug.locals.put("arrString", _arrstring);
Debug.locals.put("arrIndex", _arrindex);
Debug.locals.put("bUnique", _bunique);
 BA.debugLineNum = 4967;BA.debugLine="Sub ReverseIndexString(arrString() As String, arrI";
Debug.ShouldStop(64);
 BA.debugLineNum = 4969;BA.debugLine="Dim i As Int";
Debug.ShouldStop(256);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 4970;BA.debugLine="Dim c As Int";
Debug.ShouldStop(512);
_c = RemoteObject.createImmutable(0);Debug.locals.put("c", _c);
 BA.debugLineNum = 4971;BA.debugLine="Dim n As Int";
Debug.ShouldStop(1024);
_n = RemoteObject.createImmutable(0);Debug.locals.put("n", _n);
 BA.debugLineNum = 4972;BA.debugLine="Dim x As Int";
Debug.ShouldStop(2048);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 4973;BA.debugLine="Dim iUB As Int";
Debug.ShouldStop(4096);
_iub = RemoteObject.createImmutable(0);Debug.locals.put("iUB", _iub);
 BA.debugLineNum = 4974;BA.debugLine="Dim bSame As Boolean";
Debug.ShouldStop(8192);
_bsame = RemoteObject.createImmutable(false);Debug.locals.put("bSame", _bsame);
 BA.debugLineNum = 4975;BA.debugLine="Dim arrIndex2(arrString.Length) As Int";
Debug.ShouldStop(16384);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {_arrstring.getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4977;BA.debugLine="iUB = arrString.Length - 1";
Debug.ShouldStop(65536);
_iub = RemoteObject.solve(new RemoteObject[] {_arrstring.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iUB", _iub);
 BA.debugLineNum = 4979;BA.debugLine="If bUnique Then";
Debug.ShouldStop(262144);
if (_bunique.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4981;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(1048576);
{
final int step10 = 1;
final int limit10 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step10 > 0 && _i.<Integer>get().intValue() <= limit10) || (step10 < 0 && _i.<Integer>get().intValue() >= limit10) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4982;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
Debug.ShouldStop(2097152);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_i),RemoteObject.solve(new RemoteObject[] {_iub,_i}, "-",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4984;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(8388608);
if (true) return _arrindex2;
 }else {
 BA.debugLineNum = 4986;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(33554432);
{
final int step15 = 1;
final int limit15 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step15 > 0 && _i.<Integer>get().intValue() <= limit15) || (step15 < 0 && _i.<Integer>get().intValue() >= limit15) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4987;BA.debugLine="If i < iUB Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, _iub))) { 
 BA.debugLineNum = 4988;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
Debug.ShouldStop(134217728);
_bsame = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_arrstring.getArrayElement(true,_arrindex.getArrayElement(true,_i)),_arrstring.getArrayElement(true,_arrindex.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)))));Debug.locals.put("bSame", _bsame);
 }else {
 BA.debugLineNum = 4990;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
Debug.ShouldStop(536870912);
_bsame = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_arrstring.getArrayElement(true,_arrindex.getArrayElement(true,_i)),_arrstring.getArrayElement(true,_arrindex.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1)))));Debug.locals.put("bSame", _bsame);
 };
 BA.debugLineNum = 4992;BA.debugLine="If bSame Then";
Debug.ShouldStop(-2147483648);
if (_bsame.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4993;BA.debugLine="c = c + 1";
Debug.ShouldStop(1);
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("c", _c);
 BA.debugLineNum = 4994;BA.debugLine="If i = iUB Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _iub))) { 
 BA.debugLineNum = 4995;BA.debugLine="x = 0";
Debug.ShouldStop(4);
_x = BA.numberCast(int.class, 0);Debug.locals.put("x", _x);
 BA.debugLineNum = 4996;BA.debugLine="For n = (i - c) + 1 To i";
Debug.ShouldStop(8);
{
final int step25 = 1;
final int limit25 = _i.<Integer>get().intValue();
_n = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_i,_c}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1) ;
for (;(step25 > 0 && _n.<Integer>get().intValue() <= limit25) || (step25 < 0 && _n.<Integer>get().intValue() >= limit25) ;_n = RemoteObject.createImmutable((int)(0 + _n.<Integer>get().intValue() + step25))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 4997;BA.debugLine="arrIndex2(x) = arrIndex(n)";
Debug.ShouldStop(16);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_n),_x);
 BA.debugLineNum = 4998;BA.debugLine="x = x + 1";
Debug.ShouldStop(32);
_x = RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("x", _x);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 5000;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(128);
if (true) return _arrindex2;
 };
 }else {
 BA.debugLineNum = 5003;BA.debugLine="If c > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_c,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 5004;BA.debugLine="x = 0";
Debug.ShouldStop(2048);
_x = BA.numberCast(int.class, 0);Debug.locals.put("x", _x);
 BA.debugLineNum = 5005;BA.debugLine="For n = i - c To i";
Debug.ShouldStop(4096);
{
final int step34 = 1;
final int limit34 = _i.<Integer>get().intValue();
_n = RemoteObject.solve(new RemoteObject[] {_i,_c}, "-",1, 1) ;
for (;(step34 > 0 && _n.<Integer>get().intValue() <= limit34) || (step34 < 0 && _n.<Integer>get().intValue() >= limit34) ;_n = RemoteObject.createImmutable((int)(0 + _n.<Integer>get().intValue() + step34))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 5006;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
Debug.ShouldStop(8192);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_n),RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iub,_i}, "-",1, 1)),_x}, "+",1, 1));
 BA.debugLineNum = 5007;BA.debugLine="x = x + 1";
Debug.ShouldStop(16384);
_x = RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("x", _x);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 5010;BA.debugLine="c = 0";
Debug.ShouldStop(131072);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);
 }else {
 BA.debugLineNum = 5012;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
Debug.ShouldStop(524288);
_arrindex2.setArrayElement (_arrindex.getArrayElement(true,_i),RemoteObject.solve(new RemoteObject[] {_iub,_i}, "-",1, 1));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 5018;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(33554432);
if (true) return _arrindex2;
 BA.debugLineNum = 5020;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savetabletocsv(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SaveTableToCSV (table) ","table",20,__ref.getField(false, "ba"),__ref,1869);
if (RapidSub.canDelegate("savetabletocsv")) { return __ref.runUserSub(false, "table","savetabletocsv", __ref, _dir, _filename);}
RemoteObject _headers = null;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 1869;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1870;BA.debugLine="Private Headers(mNumberOfColumns) As String";
Debug.ShouldStop(8192);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 1871;BA.debugLine="Private i As Int";
Debug.ShouldStop(16384);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1873;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1874;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(131072);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step4 > 0 && _i.<Integer>get().intValue() <= limit4) || (step4 < 0 && _i.<Integer>get().intValue() >= limit4) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1875;BA.debugLine="Dim L As B4XView";
Debug.ShouldStop(262144);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 1876;BA.debugLine="L = Header.GetView(i)";
Debug.ShouldStop(524288);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("L", _l);
 BA.debugLineNum = 1877;BA.debugLine="Headers(i) = L.Text";
Debug.ShouldStop(1048576);
_headers.setArrayElement (_l.runMethod(true,"getText"),_i);
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 1880;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(8388608);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step10 > 0 && _i.<Integer>get().intValue() <= limit10) || (step10 < 0 && _i.<Integer>get().intValue() >= limit10) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1881;BA.debugLine="Dim L As B4XView";
Debug.ShouldStop(16777216);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 1882;BA.debugLine="If i < mNumberOfFixedColumns Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1883;BA.debugLine="L = HeaderFirst.GetView(i)";
Debug.ShouldStop(67108864);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("L", _l);
 }else {
 BA.debugLineNum = 1885;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
Debug.ShouldStop(268435456);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_i,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("L", _l);
 BA.debugLineNum = 1886;BA.debugLine="Headers(i) = L.Text";
Debug.ShouldStop(536870912);
_headers.setArrayElement (_l.runMethod(true,"getText"),_i);
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1890;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, H";
Debug.ShouldStop(2);
__ref.getField(false,"_stringutils1" /*RemoteObject*/ ).runVoidMethod ("SaveCSV2",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(",")),(Object)(__ref.getField(false,"_data" /*RemoteObject*/ )),(Object)(table.__c.runMethod(false, "ArrayToList", (Object)(_headers))));
 BA.debugLineNum = 1891;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savetabletocsv2(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _separatorchar) throws Exception{
try {
		Debug.PushSubsStack("SaveTableToCSV2 (table) ","table",20,__ref.getField(false, "ba"),__ref,1894);
if (RapidSub.canDelegate("savetabletocsv2")) { return __ref.runUserSub(false, "table","savetabletocsv2", __ref, _dir, _filename, _separatorchar);}
RemoteObject _headers = null;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
Debug.locals.put("SeparatorChar", _separatorchar);
 BA.debugLineNum = 1894;BA.debugLine="Public Sub SaveTableToCSV2(Dir As String, Filename";
Debug.ShouldStop(32);
 BA.debugLineNum = 1895;BA.debugLine="Dim headers(mNumberOfColumns) As String";
Debug.ShouldStop(64);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 1896;BA.debugLine="Private headers(mNumberOfColumns) As String";
Debug.ShouldStop(128);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 1897;BA.debugLine="Private i As Int";
Debug.ShouldStop(256);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1899;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1900;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(2048);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _i.<Integer>get().intValue() <= limit5) || (step5 < 0 && _i.<Integer>get().intValue() >= limit5) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1901;BA.debugLine="Dim L As B4XView";
Debug.ShouldStop(4096);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 1902;BA.debugLine="L = Header.GetView(i)";
Debug.ShouldStop(8192);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("L", _l);
 BA.debugLineNum = 1903;BA.debugLine="headers(i) = L.Text";
Debug.ShouldStop(16384);
_headers.setArrayElement (_l.runMethod(true,"getText"),_i);
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 1906;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(131072);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step11 > 0 && _i.<Integer>get().intValue() <= limit11) || (step11 < 0 && _i.<Integer>get().intValue() >= limit11) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1907;BA.debugLine="Dim L As B4XView";
Debug.ShouldStop(262144);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 1908;BA.debugLine="If i < mNumberOfFixedColumns Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1909;BA.debugLine="L = HeaderFirst.GetView(i)";
Debug.ShouldStop(1048576);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("L", _l);
 }else {
 BA.debugLineNum = 1911;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
Debug.ShouldStop(4194304);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_i,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("L", _l);
 BA.debugLineNum = 1912;BA.debugLine="headers(i) = L.Text";
Debug.ShouldStop(8388608);
_headers.setArrayElement (_l.runMethod(true,"getText"),_i);
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1916;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, SeparatorCha";
Debug.ShouldStop(134217728);
__ref.getField(false,"_stringutils1" /*RemoteObject*/ ).runVoidMethod ("SaveCSV2",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(_separatorchar)),(Object)(__ref.getField(false,"_data" /*RemoteObject*/ )),(Object)(table.__c.runMethod(false, "ArrayToList", (Object)(_headers))));
 BA.debugLineNum = 1917;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scaletable(RemoteObject __ref,RemoteObject _scalex,RemoteObject _scaley,RemoteObject _scalealldone) throws Exception{
try {
		Debug.PushSubsStack("ScaleTable (table) ","table",20,__ref.getField(false, "ba"),__ref,3851);
if (RapidSub.canDelegate("scaletable")) { return __ref.runUserSub(false, "table","scaletable", __ref, _scalex, _scaley, _scalealldone);}
int _i = 0;
Debug.locals.put("ScaleX", _scalex);
Debug.locals.put("ScaleY", _scaley);
Debug.locals.put("ScaleAllDone", _scalealldone);
 BA.debugLineNum = 3851;BA.debugLine="Public Sub ScaleTable(ScaleX As Double, ScaleY As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 3852;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3853;BA.debugLine="ToastMessageShow(\"Table.ScaleTable must be calle";
Debug.ShouldStop(4096);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Table.ScaleTable must be called before filling the Table")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 3854;BA.debugLine="Log(\"Table.ScaleTable must be called before fill";
Debug.ShouldStop(8192);
table.__c.runVoidMethod ("LogImpl","333423363",RemoteObject.createImmutable("Table.ScaleTable must be called before filling the Table"),0);
 BA.debugLineNum = 3855;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 3858;BA.debugLine="cTextSize = cTextSize * Min(ScaleX, ScaleY)";
Debug.ShouldStop(131072);
__ref.setField ("_ctextsize" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_ctextsize" /*RemoteObject*/ ),table.__c.runMethod(true,"Min",(Object)(_scalex),(Object)(_scaley))}, "*",0, 0)));
 BA.debugLineNum = 3859;BA.debugLine="cLineWidth = cLineWidth * ScaleX";
Debug.ShouldStop(262144);
__ref.setField ("_clinewidth" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_clinewidth" /*RemoteObject*/ ),_scalex}, "*",0, 0)));
 BA.debugLineNum = 3860;BA.debugLine="ExtraWidth = ExtraWidth * ScaleX";
Debug.ShouldStop(524288);
__ref.setField ("_extrawidth" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_extrawidth" /*RemoteObject*/ ),_scalex}, "*",0, 0)));
 BA.debugLineNum = 3861;BA.debugLine="cRowHeight  = cRowHeight * ScaleY";
Debug.ShouldStop(1048576);
__ref.setField ("_crowheight" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_crowheight" /*RemoteObject*/ ),_scaley}, "*",0, 0)));
 BA.debugLineNum = 3862;BA.debugLine="cHeaderHeight = cHeaderHeight * ScaleY";
Debug.ShouldStop(2097152);
__ref.setField ("_cheaderheight" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ),_scaley}, "*",0, 0)));
 BA.debugLineNum = 3863;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(4194304);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3864;BA.debugLine="ColumnWidths(i) = ColumnWidths(i) * ScaleX";
Debug.ShouldStop(8388608);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),_scalex}, "*",0, 0)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 3865;BA.debugLine="DataWidths(i) = DataWidths(i) * ScaleX";
Debug.ShouldStop(16777216);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),_scalex}, "*",0, 0)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 3866;BA.debugLine="HeaderWidths(i) = HeaderWidths(i)	* ScaleX";
Debug.ShouldStop(33554432);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),_scalex}, "*",0, 0)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 3867;BA.debugLine="SavedWidths(i) = SavedWidths(i)	* ScaleX";
Debug.ShouldStop(67108864);
__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),_scalex}, "*",0, 0)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3870;BA.debugLine="If ScaleAllDone = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_scalealldone,table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3871;BA.debugLine="cLeft = cLeft * ScaleX";
Debug.ShouldStop(1073741824);
__ref.setField ("_cleft" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cleft" /*RemoteObject*/ ),_scalex}, "*",0, 0)));
 BA.debugLineNum = 3872;BA.debugLine="cTop = cTop * ScaleY";
Debug.ShouldStop(-2147483648);
__ref.setField ("_ctop" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_ctop" /*RemoteObject*/ ),_scaley}, "*",0, 0)));
 BA.debugLineNum = 3873;BA.debugLine="cWidth = cWidth * ScaleX";
Debug.ShouldStop(1);
__ref.setField ("_cwidth" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cwidth" /*RemoteObject*/ ),_scalex}, "*",0, 0)));
 BA.debugLineNum = 3874;BA.debugLine="cHeight = cHeight * ScaleY";
Debug.ShouldStop(2);
__ref.setField ("_cheight" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),_scaley}, "*",0, 0)));
 BA.debugLineNum = 3876;BA.debugLine="cTextSize = cTextSize * ScaleY";
Debug.ShouldStop(8);
__ref.setField ("_ctextsize" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_ctextsize" /*RemoteObject*/ ),_scaley}, "*",0, 0)));
 BA.debugLineNum = 3877;BA.debugLine="pnlTable.Left = cLeft";
Debug.ShouldStop(16);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setLeft",__ref.getField(true,"_cleft" /*RemoteObject*/ ));
 BA.debugLineNum = 3878;BA.debugLine="pnlTable.Top = cTop";
Debug.ShouldStop(32);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setTop",__ref.getField(true,"_ctop" /*RemoteObject*/ ));
 BA.debugLineNum = 3879;BA.debugLine="pnlTable.Width = cWidth";
Debug.ShouldStop(64);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(true,"_cwidth" /*RemoteObject*/ ));
 BA.debugLineNum = 3880;BA.debugLine="pnlTable.Height = cHeight";
Debug.ShouldStop(128);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(true,"_cheight" /*RemoteObject*/ ));
 BA.debugLineNum = 3881;BA.debugLine="Header.Height = cHeaderHeight";
Debug.ShouldStop(256);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 BA.debugLineNum = 3882;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
Debug.ShouldStop(512);
__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 BA.debugLineNum = 3883;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3884;BA.debugLine="SV2.Width = cWidth";
Debug.ShouldStop(2048);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(true,"_cwidth" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 3886;BA.debugLine="SVF.Width = SVF.Width * ScaleX";
Debug.ShouldStop(8192);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"getWidth"),_scalex}, "*",0, 0)));
 BA.debugLineNum = 3887;BA.debugLine="SV2.Width = SV2.Width * ScaleX";
Debug.ShouldStop(16384);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getWidth"),_scalex}, "*",0, 0)));
 BA.debugLineNum = 3888;BA.debugLine="SV2.Left = SVF.Width";
Debug.ShouldStop(32768);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setLeft",__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 };
 BA.debugLineNum = 3890;BA.debugLine="SV2.Top = cHeaderHeight";
Debug.ShouldStop(131072);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setTop",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 BA.debugLineNum = 3891;BA.debugLine="SVF.Top = cHeaderHeight";
Debug.ShouldStop(262144);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setTop",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 BA.debugLineNum = 3892;BA.debugLine="If (cShowStatusLine = True) Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",__ref.getField(true,"_cshowstatusline" /*RemoteObject*/ ),table.__c.getField(true,"True")))) { 
 BA.debugLineNum = 3893;BA.debugLine="SV2.Height = cHeight - cStatusLineHeight - cHea";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),__ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ ),__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )}, "--",2, 1));
 BA.debugLineNum = 3894;BA.debugLine="SVF.Height = cHeight - cStatusLineHeight - cHea";
Debug.ShouldStop(2097152);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),__ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ ),__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )}, "--",2, 1));
 }else {
 BA.debugLineNum = 3896;BA.debugLine="SV2.Height = cHeight - cHeaderHeight";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )}, "-",1, 1));
 BA.debugLineNum = 3897;BA.debugLine="SVF.Height = cHeight - cHeaderHeight";
Debug.ShouldStop(16777216);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )}, "-",1, 1));
 };
 BA.debugLineNum = 3899;BA.debugLine="lblFastScroll.Width = lblFastScroll.Width * Scal";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"getWidth"),_scalex}, "*",0, 0)));
 BA.debugLineNum = 3900;BA.debugLine="lblFastScroll.Height = lblFastScroll.Height * Sc";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"getHeight"),_scaley}, "*",0, 0)));
 BA.debugLineNum = 3902;BA.debugLine="lblFastScroll.TextSize = lblFastScroll.TextSize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"getTextSize"),_scaley}, "*",0, 0)));
 BA.debugLineNum = 3903;BA.debugLine="lblFastScroll.Left = lblFastScroll.Left * ScaleX";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"getLeft"),_scalex}, "*",0, 0)));
 BA.debugLineNum = 3904;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)),RemoteObject.createImmutable(2),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/+",1, 0)));
 BA.debugLineNum = 3905;BA.debugLine="InitFastScroll";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.ef.table.class, "_initfastscroll" /*RemoteObject*/ );
 BA.debugLineNum = 3906;BA.debugLine="lblStatusLine.TextSize = cTextSize";
Debug.ShouldStop(2);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"setTextSize",__ref.getField(true,"_ctextsize" /*RemoteObject*/ ));
 BA.debugLineNum = 3907;BA.debugLine="lblStatusLine.Height = cStatusLineHeight";
Debug.ShouldStop(4);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ ));
 BA.debugLineNum = 3908;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
Debug.ShouldStop(8);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 3910;BA.debugLine="CreateNewLabels";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.ef.table.class, "_createnewlabels" /*RemoteObject*/ );
 BA.debugLineNum = 3911;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scroll(RemoteObject __ref,RemoteObject _posx,RemoteObject _posy) throws Exception{
try {
		Debug.PushSubsStack("Scroll (table) ","table",20,__ref.getField(false, "ba"),__ref,1185);
if (RapidSub.canDelegate("scroll")) { return __ref.runUserSub(false, "table","scroll", __ref, _posx, _posy);}
RemoteObject _currentmin = RemoteObject.createImmutable(0);
RemoteObject _currentmax = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("PosX", _posx);
Debug.locals.put("PosY", _posy);
 BA.debugLineNum = 1185;BA.debugLine="Private Sub Scroll(PosX As Int, PosY As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 1186;BA.debugLine="Dim currentMin, currentMax As Int";
Debug.ShouldStop(2);
_currentmin = RemoteObject.createImmutable(0);Debug.locals.put("currentMin", _currentmin);
_currentmax = RemoteObject.createImmutable(0);Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 1187;BA.debugLine="currentMin = Max(0, PosY / cRowHeight - 30)";
Debug.ShouldStop(4);
_currentmin = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_posy,__ref.getField(true,"_crowheight" /*RemoteObject*/ ),RemoteObject.createImmutable(30)}, "/-",1, 0))));Debug.locals.put("currentMin", _currentmin);
 BA.debugLineNum = 1188;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV2.Heigh";
Debug.ShouldStop(8);
_currentmax = BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_posy,__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),__ref.getField(true,"_crowheight" /*RemoteObject*/ ),RemoteObject.createImmutable(30)}, "/+",1, 0))));Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 1189;BA.debugLine="If minVisibleRow > -1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1190;BA.debugLine="If minVisibleRow < currentMin Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ),BA.numberCast(double.class, _currentmin))) { 
 BA.debugLineNum = 1192;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
Debug.ShouldStop(128);
{
final int step6 = 1;
final int limit6 = (int) (0 + table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_currentmin,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ )))).<Double>get().doubleValue());
_i = __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 1193;BA.debugLine="HideRow(I)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.ef.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("I", _i);
;
 }else 
{ BA.debugLineNum = 1195;BA.debugLine="Else If minVisibleRow > currentMin Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ),BA.numberCast(double.class, _currentmin))) { 
 BA.debugLineNum = 1197;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
Debug.ShouldStop(4096);
{
final int step10 = 1;
final int limit10 = (int) (0 + table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, _currentmax))).<Double>get().doubleValue());
_i = _currentmin.<Integer>get().intValue() ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 1198;BA.debugLine="ShowRow(I)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("I", _i);
;
 }}
;
 BA.debugLineNum = 1201;BA.debugLine="If maxVisibleRow > currentMax Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ),BA.numberCast(double.class, _currentmax))) { 
 BA.debugLineNum = 1203;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
Debug.ShouldStop(262144);
{
final int step15 = -1;
final int limit15 = (int) (0 + table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_currentmax,RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ )))).<Double>get().doubleValue());
_i = __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 1204;BA.debugLine="HideRow(I)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.ef.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("I", _i);
;
 }else 
{ BA.debugLineNum = 1206;BA.debugLine="Else If maxVisibleRow < currentMax Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ),BA.numberCast(double.class, _currentmax))) { 
 BA.debugLineNum = 1208;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
Debug.ShouldStop(8388608);
{
final int step19 = -1;
final int limit19 = (int) (0 + table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(BA.numberCast(double.class, _currentmin))).<Double>get().doubleValue());
_i = _currentmax.<Integer>get().intValue() ;
for (;(step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19) ;_i = ((int)(0 + _i + step19))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 1209;BA.debugLine="ShowRow(I)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("I", _i);
;
 }}
;
 };
 BA.debugLineNum = 1213;BA.debugLine="minVisibleRow = currentMin";
Debug.ShouldStop(268435456);
__ref.setField ("_minvisiblerow" /*RemoteObject*/ ,_currentmin);
 BA.debugLineNum = 1214;BA.debugLine="maxVisibleRow = currentMax";
Debug.ShouldStop(536870912);
__ref.setField ("_maxvisiblerow" /*RemoteObject*/ ,_currentmax);
 BA.debugLineNum = 1215;BA.debugLine="Header.Left = -PosX + mFirstColumnsWidth";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + _posx.<Integer>get().intValue())+(double) (0 + __ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ ).<Integer>get().intValue())));
 BA.debugLineNum = 1216;BA.debugLine="lblStatusLine.Left = - PosX";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + _posx.<Integer>get().intValue())));
 BA.debugLineNum = 1217;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectrow(RemoteObject __ref,RemoteObject _rc) throws Exception{
try {
		Debug.PushSubsStack("SelectRow (table) ","table",20,__ref.getField(false, "ba"),__ref,1626);
if (RapidSub.canDelegate("selectrow")) { return __ref.runUserSub(false, "table","selectrow", __ref, _rc);}
RemoteObject _previndex = RemoteObject.createImmutable(0);
RemoteObject _prev = RemoteObject.createImmutable(0);
Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1626;BA.debugLine="Public Sub SelectRow(rc As RowCol)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1627;BA.debugLine="If Not(cAllowSelection) Then Return";
Debug.ShouldStop(67108864);
if (table.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_callowselection" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1629;BA.debugLine="Dim prevIndex As Int";
Debug.ShouldStop(268435456);
_previndex = RemoteObject.createImmutable(0);Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 1630;BA.debugLine="Dim prev As Int ' if we select an alreday selecte";
Debug.ShouldStop(536870912);
_prev = RemoteObject.createImmutable(0);Debug.locals.put("prev", _prev);
 BA.debugLineNum = 1632;BA.debugLine="prevIndex = SelectedRows.indexof(rc.Row)	 ' -1 if";
Debug.ShouldStop(-2147483648);
_previndex = __ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_rc.getField(true,"Row" /*RemoteObject*/ ))));Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 1633;BA.debugLine="If (prevIndex <> -1 And mMultiSelect = False) The";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("!",_previndex,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("=",__ref.getField(true,"_mmultiselect" /*RemoteObject*/ ),table.__c.getField(true,"False")))) { 
 BA.debugLineNum = 1635;BA.debugLine="SelectedCol = rc.col";
Debug.ShouldStop(4);
__ref.setField ("_selectedcol" /*RemoteObject*/ ,_rc.getField(true,"Col" /*RemoteObject*/ ));
 BA.debugLineNum = 1636;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
Debug.ShouldStop(8);
if (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rc.getField(true,"Row" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1637;BA.debugLine="HideRow(rc.Row)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(_rc.getField(true,"Row" /*RemoteObject*/ )));
 BA.debugLineNum = 1638;BA.debugLine="ShowRow(rc.Row)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(_rc.getField(true,"Row" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1640;BA.debugLine="If mZeroSelection = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mzeroselection" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1641;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 1645;BA.debugLine="If (prevIndex = -1) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",_previndex,BA.numberCast(double.class, -(double) (0 + 1))))) { 
 BA.debugLineNum = 1646;BA.debugLine="If (mMultiSelect) Then";
Debug.ShouldStop(8192);
if ((__ref.getField(true,"_mmultiselect" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1647;BA.debugLine="SelectedRows.Add(rc.Row) 'Select the new row";
Debug.ShouldStop(16384);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_rc.getField(true,"Row" /*RemoteObject*/ ))));
 BA.debugLineNum = 1648;BA.debugLine="prev = -1";
Debug.ShouldStop(32768);
_prev = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("prev", _prev);
 }else {
 BA.debugLineNum = 1652;BA.debugLine="If (SelectedRows.Size <> 0) Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("!",__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1653;BA.debugLine="prev = SelectedRows.Get(0) ' there should be o";
Debug.ShouldStop(1048576);
_prev = BA.numberCast(int.class, __ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("prev", _prev);
 BA.debugLineNum = 1654;BA.debugLine="SelectedRows.set(0, rc.Row) ' change it to the";
Debug.ShouldStop(2097152);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 0)),(Object)((_rc.getField(true,"Row" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 1656;BA.debugLine="prev = -1";
Debug.ShouldStop(8388608);
_prev = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("prev", _prev);
 BA.debugLineNum = 1657;BA.debugLine="SelectedRows.Add(rc.Row)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_rc.getField(true,"Row" /*RemoteObject*/ ))));
 };
 };
 }else {
 BA.debugLineNum = 1662;BA.debugLine="prev = SelectedRows.Get(prevIndex) ' should be R";
Debug.ShouldStop(536870912);
_prev = BA.numberCast(int.class, __ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_previndex)));Debug.locals.put("prev", _prev);
 BA.debugLineNum = 1663;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' deselect the";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_previndex));
 };
 BA.debugLineNum = 1666;BA.debugLine="If prev > -1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_prev,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1667;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
Debug.ShouldStop(4);
if (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rc.getField(true,"Row" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1668;BA.debugLine="HideRow(prev)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.ef.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(_prev));
 BA.debugLineNum = 1669;BA.debugLine="ShowRow(prev)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(_prev));
 };
 };
 BA.debugLineNum = 1673;BA.debugLine="SelectedCol = rc.col";
Debug.ShouldStop(256);
__ref.setField ("_selectedcol" /*RemoteObject*/ ,_rc.getField(true,"Col" /*RemoteObject*/ ));
 BA.debugLineNum = 1674;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
Debug.ShouldStop(512);
if (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rc.getField(true,"Row" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1675;BA.debugLine="HideRow(rc.Row)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.ef.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(_rc.getField(true,"Row" /*RemoteObject*/ )));
 BA.debugLineNum = 1676;BA.debugLine="ShowRow(rc.Row)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(_rc.getField(true,"Row" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1678;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setallowselection(RemoteObject __ref,RemoteObject _allowselection) throws Exception{
try {
		Debug.PushSubsStack("setAllowSelection (table) ","table",20,__ref.getField(false, "ba"),__ref,2169);
if (RapidSub.canDelegate("setallowselection")) { return __ref.runUserSub(false, "table","setallowselection", __ref, _allowselection);}
Debug.locals.put("AllowSelection", _allowselection);
 BA.debugLineNum = 2169;BA.debugLine="Public Sub setAllowSelection(AllowSelection As Boo";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 2170;BA.debugLine="cAllowSelection = AllowSelection";
Debug.ShouldStop(33554432);
__ref.setField ("_callowselection" /*RemoteObject*/ ,_allowselection);
 BA.debugLineNum = 2171;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(67108864);
if (__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2172;BA.debugLine="clearSelection";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.ef.table.class, "_clearselection" /*RemoteObject*/ );
 };
 BA.debugLineNum = 2174;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setarrcolumnssorted(RemoteObject __ref,RemoteObject _icolumns) throws Exception{
try {
		Debug.PushSubsStack("SetArrColumnsSorted (table) ","table",20,__ref.getField(false, "ba"),__ref,4442);
if (RapidSub.canDelegate("setarrcolumnssorted")) { return __ref.runUserSub(false, "table","setarrcolumnssorted", __ref, _icolumns);}
Debug.locals.put("iColumns", _icolumns);
 BA.debugLineNum = 4442;BA.debugLine="Public Sub SetArrColumnsSorted(iColumns As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 4444;BA.debugLine="sortingDir = 0 ' -1, 0, 1 as asc, unsorted, desc";
Debug.ShouldStop(134217728);
__ref.setField ("_sortingdir" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4445;BA.debugLine="sortedCol = -1";
Debug.ShouldStop(268435456);
__ref.setField ("_sortedcol" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 4447;BA.debugLine="Dim arrDataSorted(iColumns) As Boolean";
Debug.ShouldStop(1073741824);
table._arrdatasorted = RemoteObject.createNewArray ("boolean", new int[] {_icolumns.<Integer>get().intValue()}, new Object[]{});__ref.setField("_arrdatasorted",table._arrdatasorted);
 BA.debugLineNum = 4448;BA.debugLine="bDataTempDone = False";
Debug.ShouldStop(-2147483648);
__ref.setField ("_bdatatempdone" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 BA.debugLineNum = 4449;BA.debugLine="Dim arrSortIndex() As Int";
Debug.ShouldStop(1);
table._arrsortindex = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_arrsortindex",table._arrsortindex);
 BA.debugLineNum = 4450;BA.debugLine="mapSortingIndexes.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_mapsortingindexes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 4452;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setautomaticwidths(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAutomaticWidths (table) ","table",20,__ref.getField(false, "ba"),__ref,3789);
if (RapidSub.canDelegate("setautomaticwidths")) { return __ref.runUserSub(false, "table","setautomaticwidths", __ref);}
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _vals = null;
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _widths = null;
 BA.debugLineNum = 3789;BA.debugLine="Public Sub SetAutomaticWidths";
Debug.ShouldStop(4096);
 BA.debugLineNum = 3790;BA.debugLine="Dim row, col As Int";
Debug.ShouldStop(8192);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 3791;BA.debugLine="Dim Vals(mNumberOfColumns) As String";
Debug.ShouldStop(16384);
_vals = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Vals", _vals);
 BA.debugLineNum = 3792;BA.debugLine="Dim Width, Widths(mNumberOfColumns) As Int";
Debug.ShouldStop(32768);
_width = RemoteObject.createImmutable(0);Debug.locals.put("Width", _width);
_widths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 3794;BA.debugLine="cAutomaticWidths = True";
Debug.ShouldStop(131072);
__ref.setField ("_cautomaticwidths" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 3796;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(524288);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _col.<Integer>get().intValue() <= limit5) || (step5 < 0 && _col.<Integer>get().intValue() >= limit5) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3797;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3798;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
Debug.ShouldStop(2097152);
_widths.setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(__ref.getField(false,"_headernames" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_col)))),(Object)((__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 }else {
 BA.debugLineNum = 3800;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
Debug.ShouldStop(8388608);
_widths.setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(__ref.getField(false,"_headernames" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_col)))),(Object)((__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 };
 BA.debugLineNum = 3803;BA.debugLine="For row = 0 To Data.Size - 1";
Debug.ShouldStop(67108864);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step11 > 0 && _row.<Integer>get().intValue() <= limit11) || (step11 < 0 && _row.<Integer>get().intValue() >= limit11) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step11))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3804;BA.debugLine="Vals = Data.Get(row)";
Debug.ShouldStop(134217728);
_vals = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("Vals", _vals);
 BA.debugLineNum = 3805;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3806;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
Debug.ShouldStop(536870912);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_vals.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_ctypeface" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("Width", _width);
 }else {
 BA.debugLineNum = 3808;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
Debug.ShouldStop(-2147483648);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_vals.getArrayElement(true,_col)),(Object)((__ref.getField(false,"_ctypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject())),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("Width", _width);
 };
 BA.debugLineNum = 3810;BA.debugLine="If Widths(col) < Width Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",_widths.getArrayElement(true,_col),BA.numberCast(double.class, _width))) { 
 BA.debugLineNum = 3811;BA.debugLine="Widths(col) = Width";
Debug.ShouldStop(4);
_widths.setArrayElement (_width,_col);
 };
 }
}Debug.locals.put("row", _row);
;
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3815;BA.debugLine="SetColumnsWidths(Widths)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_widths));
 BA.debugLineNum = 3816;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcellalignment(RemoteObject __ref,RemoteObject _alignment) throws Exception{
try {
		Debug.PushSubsStack("setCellAlignment (table) ","table",20,__ref.getField(false, "ba"),__ref,2440);
if (RapidSub.canDelegate("setcellalignment")) { return __ref.runUserSub(false, "table","setcellalignment", __ref, _alignment);}
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Alignment", _alignment);
 BA.debugLineNum = 2440;BA.debugLine="Public Sub setCellAlignment(Alignment As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 2441;BA.debugLine="Dim i As Int";
Debug.ShouldStop(256);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2443;BA.debugLine="cAlignment = Alignment";
Debug.ShouldStop(1024);
__ref.setField ("_calignment" /*RemoteObject*/ ,_alignment);
 BA.debugLineNum = 2444;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
Debug.ShouldStop(2048);
table._calignments = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_calignments",table._calignments);
 BA.debugLineNum = 2445;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(4096);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step4 > 0 && _i.<Integer>get().intValue() <= limit4) || (step4 < 0 && _i.<Integer>get().intValue() >= limit4) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2446;BA.debugLine="cAlignments(i) = cAlignment";
Debug.ShouldStop(8192);
__ref.getField(false,"_calignments" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_calignment" /*RemoteObject*/ ),_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2448;BA.debugLine="MultiAlignments = False";
Debug.ShouldStop(32768);
__ref.setField ("_multialignments" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 BA.debugLineNum = 2449;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2450;BA.debugLine="RefreshTable";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.ef.table.class, "_refreshtable" /*RemoteObject*/ );
 };
 BA.debugLineNum = 2452;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcellalignmentcoln(RemoteObject __ref,RemoteObject _col,RemoteObject _alignmentcoln) throws Exception{
try {
		Debug.PushSubsStack("SetCellAlignmentColN (table) ","table",20,__ref.getField(false, "ba"),__ref,2457);
if (RapidSub.canDelegate("setcellalignmentcoln")) { return __ref.runUserSub(false, "table","setcellalignmentcoln", __ref, _col, _alignmentcoln);}
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Col", _col);
Debug.locals.put("AlignmentColN", _alignmentcoln);
 BA.debugLineNum = 2457;BA.debugLine="Public Sub SetCellAlignmentColN(Col As Int, Alignm";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 2458;BA.debugLine="Private i As Int";
Debug.ShouldStop(33554432);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2460;BA.debugLine="Col = Max(0, Col)";
Debug.ShouldStop(134217728);
_col = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _col))));Debug.locals.put("Col", _col);
 BA.debugLineNum = 2461;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_col,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 2462;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
Debug.ShouldStop(536870912);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("The column index is higher than the number of columns.")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 2463;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 2466;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multialignments" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2467;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
Debug.ShouldStop(4);
table._calignments = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_calignments",table._calignments);
 BA.debugLineNum = 2468;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(8);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2469;BA.debugLine="cAlignments(i) = cAlignment";
Debug.ShouldStop(16);
__ref.getField(false,"_calignments" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_calignment" /*RemoteObject*/ ),_i);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 2472;BA.debugLine="cAlignments(Col) = AlignmentColN";
Debug.ShouldStop(128);
__ref.getField(false,"_calignments" /*RemoteObject*/ ).setArrayElement (_alignmentcoln,_col);
 BA.debugLineNum = 2473;BA.debugLine="cAlignments0 = cAlignments";
Debug.ShouldStop(256);
__ref.setField ("_calignments0" /*RemoteObject*/ ,__ref.getField(false,"_calignments" /*RemoteObject*/ ));
 BA.debugLineNum = 2475;BA.debugLine="MultiAlignments = True";
Debug.ShouldStop(1024);
__ref.setField ("_multialignments" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 2476;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2477;BA.debugLine="RefreshTable";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.table.class, "_refreshtable" /*RemoteObject*/ );
 };
 BA.debugLineNum = 2479;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcellalignments(RemoteObject __ref,RemoteObject _alignments) throws Exception{
try {
		Debug.PushSubsStack("SetCellAlignments (table) ","table",20,__ref.getField(false, "ba"),__ref,2422);
if (RapidSub.canDelegate("setcellalignments")) { return __ref.runUserSub(false, "table","setcellalignments", __ref, _alignments);}
Debug.locals.put("Alignments", _alignments);
 BA.debugLineNum = 2422;BA.debugLine="Public Sub SetCellAlignments(Alignments() As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 2423;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_alignments.getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 2424;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
Debug.ShouldStop(8388608);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns.")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 2425;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 2428;BA.debugLine="cAlignments0 = Alignments";
Debug.ShouldStop(134217728);
__ref.setField ("_calignments0" /*RemoteObject*/ ,_alignments);
 BA.debugLineNum = 2429;BA.debugLine="cAlignments = cAlignments0";
Debug.ShouldStop(268435456);
__ref.setField ("_calignments" /*RemoteObject*/ ,__ref.getField(false,"_calignments0" /*RemoteObject*/ ));
 BA.debugLineNum = 2431;BA.debugLine="MultiAlignments = True";
Debug.ShouldStop(1073741824);
__ref.setField ("_multialignments" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 2432;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2433;BA.debugLine="RefreshTable";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.ef.table.class, "_refreshtable" /*RemoteObject*/ );
 };
 BA.debugLineNum = 2435;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumncolors(RemoteObject __ref,RemoteObject _columncolors) throws Exception{
try {
		Debug.PushSubsStack("SetColumnColors (table) ","table",20,__ref.getField(false, "ba"),__ref,3544);
if (RapidSub.canDelegate("setcolumncolors")) { return __ref.runUserSub(false, "table","setcolumncolors", __ref, _columncolors);}
int _i = 0;
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("ColumnColors", _columncolors);
 BA.debugLineNum = 3544;BA.debugLine="Public Sub SetColumnColors(ColumnColors() As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 3545;BA.debugLine="cColumnColors = ColumnColors";
Debug.ShouldStop(16777216);
__ref.setField ("_ccolumncolors" /*RemoteObject*/ ,_columncolors);
 BA.debugLineNum = 3547;BA.debugLine="Dim ColumnDrawables(cColumnColors.Length) As Obje";
Debug.ShouldStop(67108864);
table._columndrawables = RemoteObject.createNewArray ("Object", new int[] {__ref.getField(false,"_ccolumncolors" /*RemoteObject*/ ).getField(true,"length").<Integer>get().intValue()}, new Object[]{});__ref.setField("_columndrawables",table._columndrawables);
 BA.debugLineNum = 3548;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(134217728);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3549;BA.debugLine="Private cd As ColorDrawable";
Debug.ShouldStop(268435456);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 3550;BA.debugLine="cd.Initialize(cColumnColors(i), 0)";
Debug.ShouldStop(536870912);
_cd.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_ccolumncolors" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3551;BA.debugLine="ColumnDrawables(i) = cd";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_columndrawables" /*RemoteObject*/ ).setArrayElement ((_cd.getObject()),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3554;BA.debugLine="If ColumnColors.Length > 1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_columncolors.getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 3555;BA.debugLine="cUseColumnColors = True";
Debug.ShouldStop(4);
__ref.setField ("_cusecolumncolors" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 3557;BA.debugLine="cUseColumnColors = False";
Debug.ShouldStop(16);
__ref.setField ("_cusecolumncolors" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 };
 BA.debugLineNum = 3559;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3560;BA.debugLine="RefreshTable";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.ef.table.class, "_refreshtable" /*RemoteObject*/ );
 };
 BA.debugLineNum = 3562;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumndatatype(RemoteObject __ref,RemoteObject _column,RemoteObject _datatype) throws Exception{
try {
		Debug.PushSubsStack("SetColumnDataType (table) ","table",20,__ref.getField(false, "ba"),__ref,3925);
if (RapidSub.canDelegate("setcolumndatatype")) { return __ref.runUserSub(false, "table","setcolumndatatype", __ref, _column, _datatype);}
Debug.locals.put("Column", _column);
Debug.locals.put("DataType", _datatype);
 BA.debugLineNum = 3925;BA.debugLine="Public Sub SetColumnDataType(Column As Int, DataTy";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 3926;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",_column,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_column,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 3927;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
Debug.ShouldStop(4194304);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Wrong column index")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 3928;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 3931;BA.debugLine="If DataType <> \"T\" And DataType <> \"R\" And DataTy";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",_datatype,BA.ObjectToString("T")) && RemoteObject.solveBoolean("!",_datatype,BA.ObjectToString("R")) && RemoteObject.solveBoolean("!",_datatype,BA.ObjectToString("I"))) { 
 BA.debugLineNum = 3932;BA.debugLine="ToastMessageShow(\"Wrong data type only TEXT abd";
Debug.ShouldStop(134217728);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Wrong data type only TEXT abd NUMBER are allowed")),(Object)(table.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 3934;BA.debugLine="cColumnDataType(Column) = DataType";
Debug.ShouldStop(536870912);
__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).setArrayElement (_datatype,_column);
 };
 BA.debugLineNum = 3936;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumndatatypes(RemoteObject __ref,RemoteObject _datatype) throws Exception{
try {
		Debug.PushSubsStack("SetColumnDataTypes (table) ","table",20,__ref.getField(false, "ba"),__ref,3952);
if (RapidSub.canDelegate("setcolumndatatypes")) { return __ref.runUserSub(false, "table","setcolumndatatypes", __ref, _datatype);}
int _col = 0;
Debug.locals.put("DataType", _datatype);
 BA.debugLineNum = 3952;BA.debugLine="Public Sub SetColumnDataTypes(DataType() As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 3953;BA.debugLine="If DataType.Length <> mNumberOfColumns Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",_datatype.getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 3954;BA.debugLine="ToastMessageShow(\"Wrong number of columns\", Fals";
Debug.ShouldStop(131072);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Wrong number of columns")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 3955;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 3958;BA.debugLine="For Col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(2097152);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step5 > 0 && _col <= limit5) || (step5 < 0 && _col >= limit5) ;_col = ((int)(0 + _col + step5))  ) {
Debug.locals.put("Col", _col);
 BA.debugLineNum = 3959;BA.debugLine="If DataType(Col) <> \"T\" And DataType(Col) <> \"R\"";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_datatype.getArrayElement(true,BA.numberCast(int.class, _col)),BA.ObjectToString("T")) && RemoteObject.solveBoolean("!",_datatype.getArrayElement(true,BA.numberCast(int.class, _col)),BA.ObjectToString("R")) && RemoteObject.solveBoolean("!",_datatype.getArrayElement(true,BA.numberCast(int.class, _col)),BA.ObjectToString("I"))) { 
 BA.debugLineNum = 3960;BA.debugLine="ToastMessageShow(\"Wrong data type only T, R and";
Debug.ShouldStop(8388608);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Wrong data type only T, R and I are allowed")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 3961;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 }
}Debug.locals.put("Col", _col);
;
 BA.debugLineNum = 3965;BA.debugLine="cColumnDataType = DataType";
Debug.ShouldStop(268435456);
__ref.setField ("_ccolumndatatype" /*RemoteObject*/ ,_datatype);
 BA.debugLineNum = 3966;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnswidths(RemoteObject __ref,RemoteObject _widths) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsWidths (table) ","table",20,__ref.getField(false, "ba"),__ref,914);
if (RapidSub.canDelegate("setcolumnswidths")) { return __ref.runUserSub(false, "table","setcolumnswidths", __ref, _widths);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _lbls = null;
RemoteObject _wt = RemoteObject.createImmutable(0);
RemoteObject _col_x = RemoteObject.createImmutable(0);
Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 914;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 916;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(524288);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 918;BA.debugLine="Dim SavedWidths(Widths.Length) As Int";
Debug.ShouldStop(2097152);
table._savedwidths = RemoteObject.createNewArray ("int", new int[] {_widths.getField(true,"length").<Integer>get().intValue()}, new Object[]{});__ref.setField("_savedwidths",table._savedwidths);
 BA.debugLineNum = 919;BA.debugLine="Dim ColumnWidths(Widths.Length) As Int";
Debug.ShouldStop(4194304);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {_widths.getField(true,"length").<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 920;BA.debugLine="Dim HeaderWidths(Widths.Length) As Int";
Debug.ShouldStop(8388608);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {_widths.getField(true,"length").<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 921;BA.debugLine="If cAutomaticWidths = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cautomaticwidths" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 922;BA.debugLine="For col = 0 To Widths.Length - 1";
Debug.ShouldStop(33554432);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _col.<Integer>get().intValue() <= limit6) || (step6 < 0 && _col.<Integer>get().intValue() >= limit6) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 923;BA.debugLine="SavedWidths(col) = Widths(col)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).setArrayElement (_widths.getArrayElement(true,_col),_col);
 BA.debugLineNum = 924;BA.debugLine="ColumnWidths(col) = Widths(col)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (_widths.getArrayElement(true,_col),_col);
 BA.debugLineNum = 925;BA.debugLine="HeaderWidths(col) = Widths(col)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (_widths.getArrayElement(true,_col),_col);
 BA.debugLineNum = 926;BA.debugLine="DataWidths(col) = Widths(col)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (_widths.getArrayElement(true,_col),_col);
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 929;BA.debugLine="For col = 0 To Widths.Length - 1";
Debug.ShouldStop(1);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _col.<Integer>get().intValue() <= limit13) || (step13 < 0 && _col.<Integer>get().intValue() >= limit13) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 930;BA.debugLine="SavedWidths(col) = Widths(col)";
Debug.ShouldStop(2);
__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).setArrayElement (_widths.getArrayElement(true,_col),_col);
 BA.debugLineNum = 931;BA.debugLine="ColumnWidths(col) = Widths(col)";
Debug.ShouldStop(4);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (_widths.getArrayElement(true,_col),_col);
 }
}Debug.locals.put("col", _col);
;
 };
 BA.debugLineNum = 935;BA.debugLine="Private v As View";
Debug.ShouldStop(64);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 936;BA.debugLine="Private w As Int";
Debug.ShouldStop(128);
_w = RemoteObject.createImmutable(0);Debug.locals.put("w", _w);
 BA.debugLineNum = 937;BA.debugLine="Private Left As Int";
Debug.ShouldStop(256);
_left = RemoteObject.createImmutable(0);Debug.locals.put("Left", _left);
 BA.debugLineNum = 938;BA.debugLine="Left = cLineWidth";
Debug.ShouldStop(512);
_left = __ref.getField(true,"_clinewidth" /*RemoteObject*/ );Debug.locals.put("Left", _left);
 BA.debugLineNum = 939;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 940;BA.debugLine="For col = 0 To Widths.Length - 1";
Debug.ShouldStop(2048);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step23 > 0 && _col.<Integer>get().intValue() <= limit23) || (step23 < 0 && _col.<Integer>get().intValue() >= limit23) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step23))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 941;BA.debugLine="v = Header.GetView(col)";
Debug.ShouldStop(4096);
_v = __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col));Debug.locals.put("v", _v);
 BA.debugLineNum = 942;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
Debug.ShouldStop(8192);
_w = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_widths.getArrayElement(true,_col),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "-",1, 1)))));Debug.locals.put("w", _w);
 BA.debugLineNum = 943;BA.debugLine="v.Width = w";
Debug.ShouldStop(16384);
_v.runMethod(true,"setWidth",_w);
 BA.debugLineNum = 944;BA.debugLine="v.Left = Left";
Debug.ShouldStop(32768);
_v.runMethod(true,"setLeft",_left);
 BA.debugLineNum = 945;BA.debugLine="If w > 2dip Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_w,BA.numberCast(double.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))))) { 
 BA.debugLineNum = 946;BA.debugLine="Left = Left + w + cLineWidth";
Debug.ShouldStop(131072);
_left = RemoteObject.solve(new RemoteObject[] {_left,_w,__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "++",2, 1);Debug.locals.put("Left", _left);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 949;BA.debugLine="mFirstColumnsWidth = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_mfirstcolumnswidth" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 950;BA.debugLine="HeaderFirst.Width = 0";
Debug.ShouldStop(2097152);
__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, 0));
 BA.debugLineNum = 951;BA.debugLine="SVF.Width = 0";
Debug.ShouldStop(4194304);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, 0));
 BA.debugLineNum = 952;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))).runMethod(true,"getLeft"),_widths.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))}, "+",1, 1));
 BA.debugLineNum = 953;BA.debugLine="SV2.Panel.Width = Header.Width";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setWidth",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 954;BA.debugLine="SV2.Left = 0";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 955;BA.debugLine="SV2.Width = Min(Header.Width, cWidth)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_cwidth" /*RemoteObject*/ ))))));
 BA.debugLineNum = 956;BA.debugLine="Header.Left = 0";
Debug.ShouldStop(134217728);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 957;BA.debugLine="SV2.HorizontalScrollPosition = 0";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHorizontalScrollPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 958;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(536870912);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 959;BA.debugLine="For row = 0 To visibleRows.Size - 1";
Debug.ShouldStop(1073741824);
{
final int step42 = 1;
final int limit42 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step42 > 0 && _row.<Integer>get().intValue() <= limit42) || (step42 < 0 && _row.<Integer>get().intValue() >= limit42) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step42))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 960;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
Debug.ShouldStop(-2147483648);
_lbls = (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(false,"GetValueAt",(Object)(_row)));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 961;BA.debugLine="For col = 0 To lbls.Length - 1";
Debug.ShouldStop(1);
{
final int step44 = 1;
final int limit44 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step44 > 0 && _col.<Integer>get().intValue() <= limit44) || (step44 < 0 && _col.<Integer>get().intValue() >= limit44) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step44))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 962;BA.debugLine="lbls(col).SetLayout(Header.GetView(col).Left,";
Debug.ShouldStop(2);
_lbls.getArrayElement(false,_col).runVoidMethod ("SetLayout",(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).runMethod(true,"getLeft")),(Object)(_lbls.getArrayElement(false,_col).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_crowheight" /*RemoteObject*/ ),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "-",1, 1)));
 }
}Debug.locals.put("col", _col);
;
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 965;BA.debugLine="pnlTable.Width = Min(Header.Width, cWidth)";
Debug.ShouldStop(16);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_cwidth" /*RemoteObject*/ ))))));
 BA.debugLineNum = 966;BA.debugLine="lblStatusLine.Width = Header.Width";
Debug.ShouldStop(32);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 967;BA.debugLine="internalPanel.Width = Header.Width";
Debug.ShouldStop(64);
__ref.getField(false,"_internalpanel" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 }else {
 BA.debugLineNum = 969;BA.debugLine="Private v As View";
Debug.ShouldStop(256);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 970;BA.debugLine="Private w, wt As Int";
Debug.ShouldStop(512);
_w = RemoteObject.createImmutable(0);Debug.locals.put("w", _w);
_wt = RemoteObject.createImmutable(0);Debug.locals.put("wt", _wt);
 BA.debugLineNum = 971;BA.debugLine="Left = cLineWidth";
Debug.ShouldStop(1024);
_left = __ref.getField(true,"_clinewidth" /*RemoteObject*/ );Debug.locals.put("Left", _left);
 BA.debugLineNum = 972;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(2048);
{
final int step55 = 1;
final int limit55 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step55 > 0 && _col.<Integer>get().intValue() <= limit55) || (step55 < 0 && _col.<Integer>get().intValue() >= limit55) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step55))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 973;BA.debugLine="Private v As View";
Debug.ShouldStop(4096);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 974;BA.debugLine="v = HeaderFirst.GetView(col)";
Debug.ShouldStop(8192);
_v = __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col));Debug.locals.put("v", _v);
 BA.debugLineNum = 976;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)	'???";
Debug.ShouldStop(32768);
_w = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_widths.getArrayElement(true,_col),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "-",1, 1)))));Debug.locals.put("w", _w);
 BA.debugLineNum = 977;BA.debugLine="v.Width = w";
Debug.ShouldStop(65536);
_v.runMethod(true,"setWidth",_w);
 BA.debugLineNum = 978;BA.debugLine="wt = wt + w";
Debug.ShouldStop(131072);
_wt = RemoteObject.solve(new RemoteObject[] {_wt,_w}, "+",1, 1);Debug.locals.put("wt", _wt);
 BA.debugLineNum = 979;BA.debugLine="v.Left = Left";
Debug.ShouldStop(262144);
_v.runMethod(true,"setLeft",_left);
 BA.debugLineNum = 980;BA.debugLine="If w > 2dip Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_w,BA.numberCast(double.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))))) { 
 BA.debugLineNum = 981;BA.debugLine="Left = Left + w + cLineWidth";
Debug.ShouldStop(1048576);
_left = RemoteObject.solve(new RemoteObject[] {_left,_w,__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "++",2, 1);Debug.locals.put("Left", _left);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 984;BA.debugLine="mFirstColumnsWidth = Left";
Debug.ShouldStop(8388608);
__ref.setField ("_mfirstcolumnswidth" /*RemoteObject*/ ,_left);
 BA.debugLineNum = 985;BA.debugLine="HeaderFirst.Width = Left";
Debug.ShouldStop(16777216);
__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"setWidth",_left);
 BA.debugLineNum = 986;BA.debugLine="SVF.Width = HeaderFirst.Width";
Debug.ShouldStop(33554432);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 987;BA.debugLine="SV2.Left = HeaderFirst.Width";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setLeft",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 988;BA.debugLine="Private Left, col_x As Int";
Debug.ShouldStop(134217728);
_left = RemoteObject.createImmutable(0);Debug.locals.put("Left", _left);
_col_x = RemoteObject.createImmutable(0);Debug.locals.put("col_x", _col_x);
 BA.debugLineNum = 989;BA.debugLine="Left = 0";
Debug.ShouldStop(268435456);
_left = BA.numberCast(int.class, 0);Debug.locals.put("Left", _left);
 BA.debugLineNum = 990;BA.debugLine="For col = mNumberOfFixedColumns To Widths.Length";
Debug.ShouldStop(536870912);
{
final int step72 = 1;
final int limit72 = RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step72 > 0 && _col.<Integer>get().intValue() <= limit72) || (step72 < 0 && _col.<Integer>get().intValue() >= limit72) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step72))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 991;BA.debugLine="Private v As View";
Debug.ShouldStop(1073741824);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 992;BA.debugLine="col_x = col - mNumberOfFixedColumns";
Debug.ShouldStop(-2147483648);
_col_x = RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1);Debug.locals.put("col_x", _col_x);
 BA.debugLineNum = 993;BA.debugLine="v = Header.GetView(col_x)";
Debug.ShouldStop(1);
_v = __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col_x));Debug.locals.put("v", _v);
 BA.debugLineNum = 994;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
Debug.ShouldStop(2);
_w = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_widths.getArrayElement(true,_col),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "-",1, 1)))));Debug.locals.put("w", _w);
 BA.debugLineNum = 995;BA.debugLine="v.Width = w";
Debug.ShouldStop(4);
_v.runMethod(true,"setWidth",_w);
 BA.debugLineNum = 996;BA.debugLine="v.Left = Left";
Debug.ShouldStop(8);
_v.runMethod(true,"setLeft",_left);
 BA.debugLineNum = 997;BA.debugLine="If w > 2dip Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_w,BA.numberCast(double.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))))) { 
 BA.debugLineNum = 998;BA.debugLine="Left = Left + w + cLineWidth";
Debug.ShouldStop(32);
_left = RemoteObject.solve(new RemoteObject[] {_left,_w,__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "++",2, 1);Debug.locals.put("Left", _left);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1001;BA.debugLine="Header.Width = Left";
Debug.ShouldStop(256);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setWidth",_left);
 BA.debugLineNum = 1002;BA.debugLine="Header.Left = -SV2.HorizontalScrollPosition + mF";
Debug.ShouldStop(512);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHorizontalScrollPosition").<Integer>get().intValue())+(double) (0 + __ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ ).<Integer>get().intValue())));
 BA.debugLineNum = 1003;BA.debugLine="SV2.Panel.Width = Header.Width";
Debug.ShouldStop(1024);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setWidth",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 1004;BA.debugLine="Header.Left = mFirstColumnsWidth";
Debug.ShouldStop(2048);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setLeft",__ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ ));
 BA.debugLineNum = 1005;BA.debugLine="SV2.HorizontalScrollPosition = 0";
Debug.ShouldStop(4096);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHorizontalScrollPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1006;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(8192);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1007;BA.debugLine="For row = 0 To visibleRows.Size - 1";
Debug.ShouldStop(16384);
{
final int step89 = 1;
final int limit89 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step89 > 0 && _row.<Integer>get().intValue() <= limit89) || (step89 < 0 && _row.<Integer>get().intValue() >= limit89) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step89))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 1008;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
Debug.ShouldStop(32768);
_lbls = (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(false,"GetValueAt",(Object)(_row)));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1009;BA.debugLine="Left = 0";
Debug.ShouldStop(65536);
_left = BA.numberCast(int.class, 0);Debug.locals.put("Left", _left);
 BA.debugLineNum = 1010;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(131072);
{
final int step92 = 1;
final int limit92 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step92 > 0 && _col.<Integer>get().intValue() <= limit92) || (step92 < 0 && _col.<Integer>get().intValue() >= limit92) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step92))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1011;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Width";
Debug.ShouldStop(262144);
_lbls.getArrayElement(false,_col).runVoidMethod ("SetLayout",(Object)(_left),(Object)(_lbls.getArrayElement(false,_col).runMethod(true,"getTop")),(Object)(_widths.getArrayElement(true,_col)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_crowheight" /*RemoteObject*/ ),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "-",1, 1)));
 BA.debugLineNum = 1012;BA.debugLine="Left = HeaderFirst.GetView(col).Left + HeaderF";
Debug.ShouldStop(524288);
_left = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).runMethod(true,"getLeft"),__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).runMethod(true,"getWidth"),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "++",2, 1);Debug.locals.put("Left", _left);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1014;BA.debugLine="Left = 0";
Debug.ShouldStop(2097152);
_left = BA.numberCast(int.class, 0);Debug.locals.put("Left", _left);
 BA.debugLineNum = 1015;BA.debugLine="For col = mNumberOfFixedColumns To lbls.Length";
Debug.ShouldStop(4194304);
{
final int step97 = 1;
final int limit97 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step97 > 0 && _col.<Integer>get().intValue() <= limit97) || (step97 < 0 && _col.<Integer>get().intValue() >= limit97) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step97))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1016;BA.debugLine="col_x = col - mNumberOfFixedColumns";
Debug.ShouldStop(8388608);
_col_x = RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1);Debug.locals.put("col_x", _col_x);
 BA.debugLineNum = 1017;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Heade";
Debug.ShouldStop(16777216);
_lbls.getArrayElement(false,_col).runVoidMethod ("SetLayout",(Object)(_left),(Object)(_lbls.getArrayElement(false,_col).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col_x)).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_crowheight" /*RemoteObject*/ ),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "-",1, 1)));
 BA.debugLineNum = 1018;BA.debugLine="Left = Left + Header.GetView(col_x).Width + cL";
Debug.ShouldStop(33554432);
_left = RemoteObject.solve(new RemoteObject[] {_left,__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col_x)).runMethod(true,"getWidth"),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "++",2, 1);Debug.locals.put("Left", _left);
 }
}Debug.locals.put("col", _col);
;
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 1021;BA.debugLine="SV2.Width = Min(Header.Width, cWidth - HeaderFir";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cwidth" /*RemoteObject*/ ),__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1))))));
 BA.debugLineNum = 1022;BA.debugLine="pnlTable.Width = Min(HeaderFirst.Width + Header.";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 1))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_cwidth" /*RemoteObject*/ ))))));
 BA.debugLineNum = 1023;BA.debugLine="lblStatusLine.Width = HeaderFirst.Width + Header";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 1));
 BA.debugLineNum = 1024;BA.debugLine="internalPanel.Width = HeaderFirst.Width + Header";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_internalpanel" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 1));
 };
 BA.debugLineNum = 1026;BA.debugLine="pnlFastScroll.Left = pnlTable.Width - pnlFastScro";
Debug.ShouldStop(2);
__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1));
 BA.debugLineNum = 1027;BA.debugLine="If mFastScrollFixedLabel = True Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscrollfixedlabel" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1028;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
Debug.ShouldStop(8);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)),RemoteObject.createImmutable(2),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/+",1, 0)));
 };
 BA.debugLineNum = 1031;BA.debugLine="RefreshTable";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.ef.table.class, "_refreshtable" /*RemoteObject*/ );
 BA.debugLineNum = 1032;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfastscroll(RemoteObject __ref,RemoteObject _fastscroll) throws Exception{
try {
		Debug.PushSubsStack("setFastScroll (table) ","table",20,__ref.getField(false, "ba"),__ref,4176);
if (RapidSub.canDelegate("setfastscroll")) { return __ref.runUserSub(false, "table","setfastscroll", __ref, _fastscroll);}
Debug.locals.put("FastScroll", _fastscroll);
 BA.debugLineNum = 4176;BA.debugLine="Public Sub setFastScroll (FastScroll As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 4177;BA.debugLine="mFastScroll = FastScroll";
Debug.ShouldStop(65536);
__ref.setField ("_mfastscroll" /*RemoteObject*/ ,_fastscroll);
 BA.debugLineNum = 4178;BA.debugLine="pnlFastScroll.Visible = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"False"));
 BA.debugLineNum = 4179;BA.debugLine="lblFastScroll.Visible = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"False"));
 BA.debugLineNum = 4180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfastscrollcolumnindex(RemoteObject __ref,RemoteObject _fastscrollcolumnindex) throws Exception{
try {
		Debug.PushSubsStack("setFastScrollColumnIndex (table) ","table",20,__ref.getField(false, "ba"),__ref,4200);
if (RapidSub.canDelegate("setfastscrollcolumnindex")) { return __ref.runUserSub(false, "table","setfastscrollcolumnindex", __ref, _fastscrollcolumnindex);}
Debug.locals.put("FastScrollColumnIndex", _fastscrollcolumnindex);
 BA.debugLineNum = 4200;BA.debugLine="Public Sub setFastScrollColumnIndex (FastScrollCol";
Debug.ShouldStop(128);
 BA.debugLineNum = 4201;BA.debugLine="mFastScrollColumnIndex = Max(0, FastScrollColumnI";
Debug.ShouldStop(256);
__ref.setField ("_mfastscrollcolumnindex" /*RemoteObject*/ ,BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _fastscrollcolumnindex)))));
 BA.debugLineNum = 4202;BA.debugLine="mFastScrollColumnIndex = Min(mFastScrollColumnInd";
Debug.ShouldStop(512);
__ref.setField ("_mfastscrollcolumnindex" /*RemoteObject*/ ,BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_mfastscrollcolumnindex" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))))));
 BA.debugLineNum = 4203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfastscrollfixedlabel(RemoteObject __ref,RemoteObject _fastscrollfixedlabel) throws Exception{
try {
		Debug.PushSubsStack("setFastScrollFixedLabel (table) ","table",20,__ref.getField(false, "ba"),__ref,4224);
if (RapidSub.canDelegate("setfastscrollfixedlabel")) { return __ref.runUserSub(false, "table","setfastscrollfixedlabel", __ref, _fastscrollfixedlabel);}
Debug.locals.put("FastScrollFixedLabel", _fastscrollfixedlabel);
 BA.debugLineNum = 4224;BA.debugLine="Public Sub setFastScrollFixedLabel (FastScrollFixe";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 4225;BA.debugLine="mFastScrollFixedLabel = FastScrollFixedLabel";
Debug.ShouldStop(1);
__ref.setField ("_mfastscrollfixedlabel" /*RemoteObject*/ ,_fastscrollfixedlabel);
 BA.debugLineNum = 4226;BA.debugLine="If mFastScrollFixedLabel = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscrollfixedlabel" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 4227;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
Debug.ShouldStop(4);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cwidth" /*RemoteObject*/ ),__ref.getField(true,"_mfastscrolllabelwidth" /*RemoteObject*/ ),__ref.getField(true,"_mfastscrolllabelwidth" /*RemoteObject*/ )}, "--",2, 1));
 BA.debugLineNum = 4228;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
Debug.ShouldStop(8);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(true,"_fsclabeltopdelta" /*RemoteObject*/ )}, "+",1, 1));
 }else {
 BA.debugLineNum = 4230;BA.debugLine="lblFastScroll.Left = 0";
Debug.ShouldStop(32);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 4231;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
Debug.ShouldStop(64);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)),RemoteObject.createImmutable(2),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/+",1, 0)));
 };
 BA.debugLineNum = 4233;BA.debugLine="lblFastScroll.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"False"));
 BA.debugLineNum = 4234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfastscrolllabelheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("setFastScrollLabelHeight (table) ","table",20,__ref.getField(false, "ba"),__ref,4265);
if (RapidSub.canDelegate("setfastscrolllabelheight")) { return __ref.runUserSub(false, "table","setfastscrolllabelheight", __ref, _height);}
Debug.locals.put("Height", _height);
 BA.debugLineNum = 4265;BA.debugLine="Public Sub setFastScrollLabelHeight(Height As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 4266;BA.debugLine="mFastScrollLabelHeight = Height";
Debug.ShouldStop(512);
__ref.setField ("_mfastscrolllabelheight" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 4267;BA.debugLine="lblFastScroll.Height = mFastScrollLabelHeight";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(true,"_mfastscrolllabelheight" /*RemoteObject*/ ));
 BA.debugLineNum = 4268;BA.debugLine="If mFastScrollFixedLabel = False Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscrollfixedlabel" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 4269;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight -";
Debug.ShouldStop(4096);
__ref.setField ("_fsclabeltopdelta" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fsccursorheight" /*RemoteObject*/ ),__ref.getField(true,"_mfastscrolllabelheight" /*RemoteObject*/ )}, "-",1, 1)),RemoteObject.createImmutable(2)}, "+/",1, 0)));
 BA.debugLineNum = 4270;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfastscrollcursor" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(true,"_fsclabeltopdelta" /*RemoteObject*/ )}, "+",1, 1));
 }else {
 BA.debugLineNum = 4272;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)),RemoteObject.createImmutable(2),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/+",1, 0)));
 };
 BA.debugLineNum = 4274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfastscrolllabelmaxchars(RemoteObject __ref,RemoteObject _fastscrolllabelmaxchars) throws Exception{
try {
		Debug.PushSubsStack("setFastScrollLabelMaxChars (table) ","table",20,__ref.getField(false, "ba"),__ref,4241);
if (RapidSub.canDelegate("setfastscrolllabelmaxchars")) { return __ref.runUserSub(false, "table","setfastscrolllabelmaxchars", __ref, _fastscrolllabelmaxchars);}
Debug.locals.put("FastScrollLabelMaxChars", _fastscrolllabelmaxchars);
 BA.debugLineNum = 4241;BA.debugLine="Public Sub setFastScrollLabelMaxChars(FastScrollLa";
Debug.ShouldStop(65536);
 BA.debugLineNum = 4242;BA.debugLine="mFastScrollLabelMaxChars = FastScrollLabelMaxChar";
Debug.ShouldStop(131072);
__ref.setField ("_mfastscrolllabelmaxchars" /*RemoteObject*/ ,_fastscrolllabelmaxchars);
 BA.debugLineNum = 4243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfastscrolllabelwidth(RemoteObject __ref,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setFastScrollLabelWidth (table) ","table",20,__ref.getField(false, "ba"),__ref,4250);
if (RapidSub.canDelegate("setfastscrolllabelwidth")) { return __ref.runUserSub(false, "table","setfastscrolllabelwidth", __ref, _width);}
Debug.locals.put("Width", _width);
 BA.debugLineNum = 4250;BA.debugLine="Public Sub setFastScrollLabelWidth(Width As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 4251;BA.debugLine="mFastScrollLabelWidth = Width";
Debug.ShouldStop(67108864);
__ref.setField ("_mfastscrolllabelwidth" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 4252;BA.debugLine="lblFastScroll.Width = mFastScrollLabelWidth";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(true,"_mfastscrolllabelwidth" /*RemoteObject*/ ));
 BA.debugLineNum = 4253;BA.debugLine="If mFastScrollFixedLabel = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscrollfixedlabel" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 4254;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cwidth" /*RemoteObject*/ ),__ref.getField(true,"_mfastscrolllabelwidth" /*RemoteObject*/ ),__ref.getField(true,"_mfastscrolllabelwidth" /*RemoteObject*/ )}, "--",2, 1));
 }else {
 BA.debugLineNum = 4256;BA.debugLine="lblFastScroll.Left = 0";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 4258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfastscrollminitems(RemoteObject __ref,RemoteObject _fastscrollminitems) throws Exception{
try {
		Debug.PushSubsStack("setFastScrollMinItems (table) ","table",20,__ref.getField(false, "ba"),__ref,4189);
if (RapidSub.canDelegate("setfastscrollminitems")) { return __ref.runUserSub(false, "table","setfastscrollminitems", __ref, _fastscrollminitems);}
Debug.locals.put("FastScrollMinItems", _fastscrollminitems);
 BA.debugLineNum = 4189;BA.debugLine="Public Sub setFastScrollMinItems (FastScrollMinIte";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 4190;BA.debugLine="mFastScrollMinItems = FastScrollMinItems";
Debug.ShouldStop(536870912);
__ref.setField ("_mfastscrollminitems" /*RemoteObject*/ ,_fastscrollminitems);
 BA.debugLineNum = 4191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfastscrollshowlabel(RemoteObject __ref,RemoteObject _fastscrollshowlabel) throws Exception{
try {
		Debug.PushSubsStack("setFastScrollShowLabel (table) ","table",20,__ref.getField(false, "ba"),__ref,4212);
if (RapidSub.canDelegate("setfastscrollshowlabel")) { return __ref.runUserSub(false, "table","setfastscrollshowlabel", __ref, _fastscrollshowlabel);}
Debug.locals.put("FastScrollShowLabel", _fastscrollshowlabel);
 BA.debugLineNum = 4212;BA.debugLine="Public Sub setFastScrollShowLabel (FastScrollShowL";
Debug.ShouldStop(524288);
 BA.debugLineNum = 4213;BA.debugLine="mFastScrollShowLabel = FastScrollShowLabel";
Debug.ShouldStop(1048576);
__ref.setField ("_mfastscrollshowlabel" /*RemoteObject*/ ,_fastscrollshowlabel);
 BA.debugLineNum = 4214;BA.debugLine="lblFastScroll.Visible = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"False"));
 BA.debugLineNum = 4215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfirstcolumnfixed(RemoteObject __ref,RemoteObject _firstcolumnfixed) throws Exception{
try {
		Debug.PushSubsStack("setFirstColumnFixed (table) ","table",20,__ref.getField(false, "ba"),__ref,4135);
if (RapidSub.canDelegate("setfirstcolumnfixed")) { return __ref.runUserSub(false, "table","setfirstcolumnfixed", __ref, _firstcolumnfixed);}
Debug.locals.put("FirstColumnFixed", _firstcolumnfixed);
 BA.debugLineNum = 4135;BA.debugLine="Public Sub setFirstColumnFixed(FirstColumnFixed As";
Debug.ShouldStop(64);
 BA.debugLineNum = 4136;BA.debugLine="If FirstColumnFixed = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_firstcolumnfixed,table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 4137;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 4138;BA.debugLine="setNumberOfFixedColumns(1)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.ef.table.class, "_setnumberoffixedcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)));
 };
 }else {
 BA.debugLineNum = 4141;BA.debugLine="If mNumberOfFixedColumns = 1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 4142;BA.debugLine="setNumberOfFixedColumns(0)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.ef.table.class, "_setnumberoffixedcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 };
 };
 BA.debugLineNum = 4145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheader(RemoteObject __ref,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("SetHeader (table) ","table",20,__ref.getField(false, "ba"),__ref,1490);
if (RapidSub.canDelegate("setheader")) { return __ref.runUserSub(false, "table","setheader", __ref, _values);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _change = RemoteObject.createImmutable(0);
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _str = null;
RemoteObject _j = RemoteObject.createImmutable(0);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 1490;BA.debugLine="Public Sub SetHeader(Values() As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1491;BA.debugLine="Dim col As Int";
Debug.ShouldStop(262144);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 1493;BA.debugLine="Header.RemoveAllViews";
Debug.ShouldStop(1048576);
__ref.getField(false,"_header" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 1494;BA.debugLine="HeaderNames.Initialize2(Values)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_headernames" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(table.__c.runMethod(false, "ArrayToList", (Object)(_values))));
 BA.debugLineNum = 1496;BA.debugLine="Dim Left = 0 As Int";
Debug.ShouldStop(8388608);
_left = BA.numberCast(int.class, 0);Debug.locals.put("Left", _left);Debug.locals.put("Left", _left);
 BA.debugLineNum = 1498;BA.debugLine="Dim Change = 0 As Int";
Debug.ShouldStop(33554432);
_change = BA.numberCast(int.class, 0);Debug.locals.put("Change", _change);Debug.locals.put("Change", _change);
 BA.debugLineNum = 1499;BA.debugLine="Dim w As Int";
Debug.ShouldStop(67108864);
_w = RemoteObject.createImmutable(0);Debug.locals.put("w", _w);
 BA.debugLineNum = 1500;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(134217728);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step7 > 0 && _col.<Integer>get().intValue() <= limit7) || (step7 < 0 && _col.<Integer>get().intValue() >= limit7) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1501;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(268435456);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1502;BA.debugLine="lbl.Initialize(\"header\")";
Debug.ShouldStop(536870912);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("header")));
 BA.debugLineNum = 1503;BA.debugLine="If HeaderMultiAlignments = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultialignments" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1504;BA.debugLine="lbl.Gravity = cHeaderAlignment";
Debug.ShouldStop(-2147483648);
_lbl.runMethod(true,"setGravity",__ref.getField(true,"_cheaderalignment" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 1506;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
Debug.ShouldStop(2);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getArrayElement(true,_col));
 };
 BA.debugLineNum = 1509;BA.debugLine="If HeaderMultiTypeFace = False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultitypeface" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1510;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
Debug.ShouldStop(32);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject()));
 }else {
 BA.debugLineNum = 1512;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
Debug.ShouldStop(128);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject()));
 };
 BA.debugLineNum = 1515;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(1024);
_lbl.runMethod(true,"setTextSize",__ref.getField(true,"_ctextsize" /*RemoteObject*/ ));
 BA.debugLineNum = 1516;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.ef.table.class, "_setpadding" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _lbl.getObject()),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 1518;BA.debugLine="If cUseColumnColors = False Or cHeaderTextColors";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cusecolumncolors" /*RemoteObject*/ ),table.__c.getField(true,"False")) || RemoteObject.solveBoolean("!",__ref.getField(false,"_cheadertextcolors" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1519;BA.debugLine="lbl.Color = cHeaderColor";
Debug.ShouldStop(16384);
_lbl.runVoidMethod ("setColor",__ref.getField(true,"_cheadercolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1520;BA.debugLine="lbl.TextColor = cHeaderTextColor";
Debug.ShouldStop(32768);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_cheadertextcolor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 1522;BA.debugLine="lbl.Color = cHeaderColors(col)";
Debug.ShouldStop(131072);
_lbl.runVoidMethod ("setColor",__ref.getField(false,"_cheadercolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 BA.debugLineNum = 1523;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
Debug.ShouldStop(262144);
_lbl.runMethod(true,"setTextColor",__ref.getField(false,"_cheadertextcolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 };
 BA.debugLineNum = 1526;BA.debugLine="lbl.Text = Values(col)";
Debug.ShouldStop(2097152);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_values.getArrayElement(true,_col)));
 BA.debugLineNum = 1527;BA.debugLine="lbl.Tag = col";
Debug.ShouldStop(4194304);
_lbl.runMethod(false,"setTag",(_col));
 BA.debugLineNum = 1529;BA.debugLine="w = Max(0, ColumnWidths(col) - cLineWidth)		' ne";
Debug.ShouldStop(16777216);
_w = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,_col),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "-",1, 1)))));Debug.locals.put("w", _w);
 BA.debugLineNum = 1531;BA.debugLine="If mNumberOfFixedColumns > 0 And col < mNumberOf";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_col,BA.numberCast(double.class, __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1532;BA.debugLine="HeaderFirst.AddView(lbl, Left, 0, w, cHeaderHei";
Debug.ShouldStop(134217728);
__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(_left),(Object)(BA.numberCast(int.class, 0)),(Object)(_w),(Object)(__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 1535;BA.debugLine="If col = mNumberOfFixedColumns Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_col,BA.numberCast(double.class, __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1536;BA.debugLine="Left = 0";
Debug.ShouldStop(-2147483648);
_left = BA.numberCast(int.class, 0);Debug.locals.put("Left", _left);
 };
 BA.debugLineNum = 1538;BA.debugLine="Header.AddView(lbl, Left, 0, w, cHeaderHeight)";
Debug.ShouldStop(2);
__ref.getField(false,"_header" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(_left),(Object)(BA.numberCast(int.class, 0)),(Object)(_w),(Object)(__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1542;BA.debugLine="If cAutomaticWidths = True Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cautomaticwidths" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1543;BA.debugLine="If Values(col).Contains(CRLF) Then";
Debug.ShouldStop(64);
if (_values.getArrayElement(true,_col).runMethod(true,"contains",(Object)(table.__c.getField(true,"CRLF"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1544;BA.debugLine="Dim str() As String";
Debug.ShouldStop(128);
_str = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("str", _str);
 BA.debugLineNum = 1545;BA.debugLine="Dim j As Int";
Debug.ShouldStop(256);
_j = RemoteObject.createImmutable(0);Debug.locals.put("j", _j);
 BA.debugLineNum = 1546;BA.debugLine="str = Regex.Split(CRLF, Values(col))";
Debug.ShouldStop(512);
_str = table.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(table.__c.getField(true,"CRLF")),(Object)(_values.getArrayElement(true,_col)));Debug.locals.put("str", _str);
 BA.debugLineNum = 1547;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(str";
Debug.ShouldStop(1024);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_lbl.runMethod(false,"getTypeface")),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 BA.debugLineNum = 1548;BA.debugLine="For j = 1 To str.Length - 1";
Debug.ShouldStop(2048);
{
final int step46 = 1;
final int limit46 = RemoteObject.solve(new RemoteObject[] {_str.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = BA.numberCast(int.class, 1) ;
for (;(step46 > 0 && _j.<Integer>get().intValue() <= limit46) || (step46 < 0 && _j.<Integer>get().intValue() >= limit46) ;_j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step46))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 1549;BA.debugLine="HeaderWidths(col) = Max(HeaderWidths(col),cvs";
Debug.ShouldStop(4096);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_str.getArrayElement(true,_j)),(Object)(_lbl.runMethod(false,"getTypeface")),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)))),_col);
 }
}Debug.locals.put("j", _j);
;
 }else {
 BA.debugLineNum = 1552;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Val";
Debug.ShouldStop(32768);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringWidth",(Object)(_values.getArrayElement(true,_col)),(Object)(_lbl.runMethod(false,"getTypeface")),(Object)(__ref.getField(true,"_ctextsize" /*RemoteObject*/ ))),__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 0)),_col);
 };
 BA.debugLineNum = 1554;BA.debugLine="If HeaderWidths(col) > ColumnWidths(col) Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col),BA.numberCast(double.class, __ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,_col)))) { 
 BA.debugLineNum = 1555;BA.debugLine="Change = 1";
Debug.ShouldStop(262144);
_change = BA.numberCast(int.class, 1);Debug.locals.put("Change", _change);
 BA.debugLineNum = 1556;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Col";
Debug.ShouldStop(524288);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,_col))))),_col);
 }else 
{ BA.debugLineNum = 1557;BA.debugLine="Else If ColumnWidths(col) > HeaderWidths(col) A";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,_col),BA.numberCast(double.class, __ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col))) && RemoteObject.solveBoolean(">",__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,_col),BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col)))) { 
 BA.debugLineNum = 1558;BA.debugLine="Change = 1";
Debug.ShouldStop(2097152);
_change = BA.numberCast(int.class, 1);Debug.locals.put("Change", _change);
 BA.debugLineNum = 1559;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Dat";
Debug.ShouldStop(4194304);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_headerwidths" /*RemoteObject*/ ).getArrayElement(true,_col))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_datawidths" /*RemoteObject*/ ).getArrayElement(true,_col))))),_col);
 }}
;
 };
 BA.debugLineNum = 1562;BA.debugLine="Left = Left + ColumnWidths(col)";
Debug.ShouldStop(33554432);
_left = RemoteObject.solve(new RemoteObject[] {_left,__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).getArrayElement(true,_col)}, "+",1, 1);Debug.locals.put("Left", _left);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1565;BA.debugLine="If Change = 1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_change,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1566;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1568;BA.debugLine="Header.Left = - SV2.HorizontalScrollPosition + mF";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHorizontalScrollPosition").<Integer>get().intValue())+(double) (0 + __ref.getField(true,"_mfirstcolumnswidth" /*RemoteObject*/ ).<Integer>get().intValue())));
 BA.debugLineNum = 1569;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheaderalignment(RemoteObject __ref,RemoteObject _alignment) throws Exception{
try {
		Debug.PushSubsStack("setHeaderAlignment (table) ","table",20,__ref.getField(false, "ba"),__ref,2622);
if (RapidSub.canDelegate("setheaderalignment")) { return __ref.runUserSub(false, "table","setheaderalignment", __ref, _alignment);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Alignment", _alignment);
 BA.debugLineNum = 2622;BA.debugLine="Public Sub setHeaderAlignment(Alignment As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2623;BA.debugLine="cHeaderAlignment = Alignment";
Debug.ShouldStop(1073741824);
__ref.setField ("_cheaderalignment" /*RemoteObject*/ ,_alignment);
 BA.debugLineNum = 2625;BA.debugLine="If cHeaderAlignments.Length = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2626;BA.debugLine="Private cHeaderAlignments(mNumberOfColumns) As I";
Debug.ShouldStop(2);
table._cheaderalignments = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_cheaderalignments",table._cheaderalignments);
 };
 BA.debugLineNum = 2629;BA.debugLine="Dim col As Int";
Debug.ShouldStop(16);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 2630;BA.debugLine="HeaderMultiAlignments = False";
Debug.ShouldStop(32);
__ref.setField ("_headermultialignments" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 BA.debugLineNum = 2631;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2632;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2633;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(256);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _col.<Integer>get().intValue() <= limit9) || (step9 < 0 && _col.<Integer>get().intValue() >= limit9) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2634;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(512);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2635;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(1024);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2636;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
Debug.ShouldStop(2048);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 2638;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
Debug.ShouldStop(8192);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step14 > 0 && _col.<Integer>get().intValue() <= limit14) || (step14 < 0 && _col.<Integer>get().intValue() >= limit14) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step14))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2639;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(16384);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2640;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
Debug.ShouldStop(32768);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2641;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
Debug.ShouldStop(65536);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 2644;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(524288);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step20 > 0 && _col.<Integer>get().intValue() <= limit20) || (step20 < 0 && _col.<Integer>get().intValue() >= limit20) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step20))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2645;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(1048576);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2646;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(2097152);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2647;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
Debug.ShouldStop(4194304);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 };
 };
 BA.debugLineNum = 2651;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheaderalignmentcoln(RemoteObject __ref,RemoteObject _col,RemoteObject _alignmentcoln) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderAlignmentColN (table) ","table",20,__ref.getField(false, "ba"),__ref,2522);
if (RapidSub.canDelegate("setheaderalignmentcoln")) { return __ref.runUserSub(false, "table","setheaderalignmentcoln", __ref, _col, _alignmentcoln);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Col", _col);
Debug.locals.put("AlignmentColN", _alignmentcoln);
 BA.debugLineNum = 2522;BA.debugLine="Public Sub SetHeaderAlignmentColN(Col As Int, Alig";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 2523;BA.debugLine="Private i As Int";
Debug.ShouldStop(67108864);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2525;BA.debugLine="Col = Max(0, Col)";
Debug.ShouldStop(268435456);
_col = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _col))));Debug.locals.put("Col", _col);
 BA.debugLineNum = 2526;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_col,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 2527;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
Debug.ShouldStop(1073741824);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("The column index is higher than the number of columns.")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 2528;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 2531;BA.debugLine="If HeaderMultiAlignments = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_headermultialignments" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2532;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
Debug.ShouldStop(8);
table._cheaderalignments0 = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_cheaderalignments0",table._cheaderalignments0);
 BA.debugLineNum = 2533;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(16);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2534;BA.debugLine="cHeaderAlignments0(i) = cHeaderAlignment";
Debug.ShouldStop(32);
__ref.getField(false,"_cheaderalignments0" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_cheaderalignment" /*RemoteObject*/ ),_i);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 2537;BA.debugLine="cHeaderAlignments0(Col) = AlignmentColN";
Debug.ShouldStop(256);
__ref.getField(false,"_cheaderalignments0" /*RemoteObject*/ ).setArrayElement (_alignmentcoln,_col);
 BA.debugLineNum = 2538;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
Debug.ShouldStop(512);
__ref.setField ("_cheaderalignments" /*RemoteObject*/ ,__ref.getField(false,"_cheaderalignments0" /*RemoteObject*/ ));
 BA.debugLineNum = 2539;BA.debugLine="If Header.NumberOfViews > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2540;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2541;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(4096);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2542;BA.debugLine="lbl = Header.GetView(Col)";
Debug.ShouldStop(8192);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2543;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
Debug.ShouldStop(16384);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getArrayElement(true,_col));
 }else {
 BA.debugLineNum = 2545;BA.debugLine="For i = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(65536);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step21 > 0 && _i.<Integer>get().intValue() <= limit21) || (step21 < 0 && _i.<Integer>get().intValue() >= limit21) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2546;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(131072);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2547;BA.debugLine="If Col < mNumberOfFixedColumns Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("<",_col,BA.numberCast(double.class, __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 2548;BA.debugLine="lbl = HeaderFirst.GetView(Col)";
Debug.ShouldStop(524288);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2549;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
Debug.ShouldStop(1048576);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getArrayElement(true,_col));
 }else {
 BA.debugLineNum = 2551;BA.debugLine="lbl = Header.GetView(Col)";
Debug.ShouldStop(4194304);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2552;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col + mNumber";
Debug.ShouldStop(8388608);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "+",1, 1)));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 2557;BA.debugLine="HeaderMultiAlignments = True";
Debug.ShouldStop(268435456);
__ref.setField ("_headermultialignments" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 2558;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheaderalignments(RemoteObject __ref,RemoteObject _alignments) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderAlignments (table) ","table",20,__ref.getField(false, "ba"),__ref,2485);
if (RapidSub.canDelegate("setheaderalignments")) { return __ref.runUserSub(false, "table","setheaderalignments", __ref, _alignments);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Alignments", _alignments);
 BA.debugLineNum = 2485;BA.debugLine="Public Sub SetHeaderAlignments(Alignments() As Int";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2486;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_alignments.getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 2487;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
Debug.ShouldStop(4194304);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns.")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 2488;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 2491;BA.debugLine="Dim col As Int";
Debug.ShouldStop(67108864);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 2492;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
Debug.ShouldStop(134217728);
table._cheaderalignments0 = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_cheaderalignments0",table._cheaderalignments0);
 BA.debugLineNum = 2494;BA.debugLine="cHeaderAlignments0 = Alignments";
Debug.ShouldStop(536870912);
__ref.setField ("_cheaderalignments0" /*RemoteObject*/ ,_alignments);
 BA.debugLineNum = 2495;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
Debug.ShouldStop(1073741824);
__ref.setField ("_cheaderalignments" /*RemoteObject*/ ,__ref.getField(false,"_cheaderalignments0" /*RemoteObject*/ ));
 BA.debugLineNum = 2496;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2497;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2498;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(2);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step11 > 0 && _col.<Integer>get().intValue() <= limit11) || (step11 < 0 && _col.<Integer>get().intValue() >= limit11) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step11))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2499;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(4);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2500;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(8);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2501;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
Debug.ShouldStop(16);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 2503;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
Debug.ShouldStop(64);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step16 > 0 && _col.<Integer>get().intValue() <= limit16) || (step16 < 0 && _col.<Integer>get().intValue() >= limit16) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2504;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(128);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2505;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
Debug.ShouldStop(256);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2506;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
Debug.ShouldStop(512);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 2509;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(4096);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step22 > 0 && _col.<Integer>get().intValue() <= limit22) || (step22 < 0 && _col.<Integer>get().intValue() >= limit22) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step22))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2510;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(8192);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2511;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(16384);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2512;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
Debug.ShouldStop(32768);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_cheaderalignments" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 };
 };
 BA.debugLineNum = 2516;BA.debugLine="HeaderMultiAlignments = True";
Debug.ShouldStop(524288);
__ref.setField ("_headermultialignments" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 2517;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheadercolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setHeaderColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2700);
if (RapidSub.canDelegate("setheadercolor")) { return __ref.runUserSub(false, "table","setheadercolor", __ref, _color);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Color", _color);
 BA.debugLineNum = 2700;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 2701;BA.debugLine="Private col As Int";
Debug.ShouldStop(4096);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 2703;BA.debugLine="cHeaderColor = Color";
Debug.ShouldStop(16384);
__ref.setField ("_cheadercolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 2704;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2705;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2706;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(131072);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _col.<Integer>get().intValue() <= limit5) || (step5 < 0 && _col.<Integer>get().intValue() >= limit5) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2707;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(262144);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2708;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(524288);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2709;BA.debugLine="lbl.Color = cHeaderColor";
Debug.ShouldStop(1048576);
_lbl.runVoidMethod ("setColor",__ref.getField(true,"_cheadercolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 2711;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
Debug.ShouldStop(4194304);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step10 > 0 && _col.<Integer>get().intValue() <= limit10) || (step10 < 0 && _col.<Integer>get().intValue() >= limit10) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step10))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2712;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(8388608);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2713;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
Debug.ShouldStop(16777216);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2714;BA.debugLine="lbl.Color = cHeaderColor";
Debug.ShouldStop(33554432);
_lbl.runVoidMethod ("setColor",__ref.getField(true,"_cheadercolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 2717;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(268435456);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step16 > 0 && _col.<Integer>get().intValue() <= limit16) || (step16 < 0 && _col.<Integer>get().intValue() >= limit16) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2718;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(536870912);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2719;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(1073741824);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2720;BA.debugLine="lbl.Color = cHeaderColor";
Debug.ShouldStop(-2147483648);
_lbl.runVoidMethod ("setColor",__ref.getField(true,"_cheadercolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("col", _col);
;
 };
 };
 BA.debugLineNum = 2724;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheadercolors(RemoteObject __ref,RemoteObject _headercolors) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderColors (table) ","table",20,__ref.getField(false, "ba"),__ref,3612);
if (RapidSub.canDelegate("setheadercolors")) { return __ref.runUserSub(false, "table","setheadercolors", __ref, _headercolors);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("HeaderColors", _headercolors);
 BA.debugLineNum = 3612;BA.debugLine="Public Sub SetHeaderColors(HeaderColors() As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 3613;BA.debugLine="Private col As Int";
Debug.ShouldStop(268435456);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 3615;BA.debugLine="cHeaderColors = HeaderColors";
Debug.ShouldStop(1073741824);
__ref.setField ("_cheadercolors" /*RemoteObject*/ ,_headercolors);
 BA.debugLineNum = 3616;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3617;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3618;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(2);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _col.<Integer>get().intValue() <= limit5) || (step5 < 0 && _col.<Integer>get().intValue() >= limit5) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3619;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(4);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3620;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(8);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3621;BA.debugLine="lbl.Color = cHeaderColors(col)";
Debug.ShouldStop(16);
_lbl.runVoidMethod ("setColor",__ref.getField(false,"_cheadercolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3623;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
Debug.ShouldStop(64);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step10 > 0 && _col.<Integer>get().intValue() <= limit10) || (step10 < 0 && _col.<Integer>get().intValue() >= limit10) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step10))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3624;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(128);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3625;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
Debug.ShouldStop(256);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3626;BA.debugLine="lbl.Color = cHeaderColors(col)";
Debug.ShouldStop(512);
_lbl.runVoidMethod ("setColor",__ref.getField(false,"_cheadercolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 3629;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(4096);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step16 > 0 && _col.<Integer>get().intValue() <= limit16) || (step16 < 0 && _col.<Integer>get().intValue() >= limit16) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3630;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(8192);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3631;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(16384);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3632;BA.debugLine="lbl.Color = cHeaderColors(col)";
Debug.ShouldStop(32768);
_lbl.runVoidMethod ("setColor",__ref.getField(false,"_cheadercolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 };
 };
 BA.debugLineNum = 3636;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheaderheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("setHeaderHeight (table) ","table",20,__ref.getField(false, "ba"),__ref,2658);
if (RapidSub.canDelegate("setheaderheight")) { return __ref.runUserSub(false, "table","setheaderheight", __ref, _height);}
int _col = 0;
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Height", _height);
 BA.debugLineNum = 2658;BA.debugLine="Public Sub setHeaderHeight(Height As Int)";
Debug.ShouldStop(2);
 BA.debugLineNum = 2659;BA.debugLine="cHeaderHeight = Height";
Debug.ShouldStop(4);
__ref.setField ("_cheaderheight" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 2660;BA.debugLine="If Header.IsInitialized Then";
Debug.ShouldStop(8);
if (__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2661;BA.debugLine="Header.Height = cHeaderHeight";
Debug.ShouldStop(16);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 BA.debugLineNum = 2662;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
Debug.ShouldStop(32);
__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 BA.debugLineNum = 2663;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2664;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2665;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(256);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step7 > 0 && _col <= limit7) || (step7 < 0 && _col >= limit7) ;_col = ((int)(0 + _col + step7))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2666;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(512);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2667;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(1024);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _col))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2668;BA.debugLine="lbl.Height = cHeaderHeight";
Debug.ShouldStop(2048);
_lbl.runMethod(true,"setHeight",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 2670;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
Debug.ShouldStop(8192);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step12 > 0 && _col <= limit12) || (step12 < 0 && _col >= limit12) ;_col = ((int)(0 + _col + step12))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2671;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(16384);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2672;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
Debug.ShouldStop(32768);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_col),__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2673;BA.debugLine="lbl.Height = cHeaderHeight";
Debug.ShouldStop(65536);
_lbl.runMethod(true,"setHeight",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 2676;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(524288);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step18 > 0 && _col <= limit18) || (step18 < 0 && _col >= limit18) ;_col = ((int)(0 + _col + step18))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2677;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(1048576);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2678;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(2097152);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _col))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2679;BA.debugLine="lbl.Height = cHeaderHeight";
Debug.ShouldStop(4194304);
_lbl.runMethod(true,"setHeight",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 }
}Debug.locals.put("col", _col);
;
 };
 };
 BA.debugLineNum = 2683;BA.debugLine="SV2.Top = cHeaderHeight";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setTop",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 BA.debugLineNum = 2684;BA.debugLine="SVF.Top = cHeaderHeight";
Debug.ShouldStop(134217728);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setTop",__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ));
 BA.debugLineNum = 2685;BA.debugLine="If cShowStatusLine = True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cshowstatusline" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2686;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight -";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_cheaderheight" /*RemoteObject*/ ),__ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ )}, "--",2, 1));
 }else {
 BA.debugLineNum = 2688;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )}, "-",1, 1));
 };
 BA.debugLineNum = 2690;BA.debugLine="SVF.Height = SV2.Height";
Debug.ShouldStop(2);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 2691;BA.debugLine="InitFastScroll";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.ef.table.class, "_initfastscroll" /*RemoteObject*/ );
 };
 BA.debugLineNum = 2693;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheadertextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setHeaderTextColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2731);
if (RapidSub.canDelegate("setheadertextcolor")) { return __ref.runUserSub(false, "table","setheadertextcolor", __ref, _color);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Color", _color);
 BA.debugLineNum = 2731;BA.debugLine="Public Sub setHeaderTextColor(Color As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2732;BA.debugLine="Private col As Int";
Debug.ShouldStop(2048);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 2734;BA.debugLine="cHeaderTextColor = Color";
Debug.ShouldStop(8192);
__ref.setField ("_cheadertextcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 2735;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2736;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2737;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(65536);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _col.<Integer>get().intValue() <= limit5) || (step5 < 0 && _col.<Integer>get().intValue() >= limit5) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2738;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(131072);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2739;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(262144);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2740;BA.debugLine="lbl.TextColor = cHeaderTextColor";
Debug.ShouldStop(524288);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_cheadertextcolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 2742;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
Debug.ShouldStop(2097152);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step10 > 0 && _col.<Integer>get().intValue() <= limit10) || (step10 < 0 && _col.<Integer>get().intValue() >= limit10) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step10))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2743;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(4194304);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2744;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
Debug.ShouldStop(8388608);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2745;BA.debugLine="lbl.TextColor = cHeaderTextColor";
Debug.ShouldStop(16777216);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_cheadertextcolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 2748;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(134217728);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step16 > 0 && _col.<Integer>get().intValue() <= limit16) || (step16 < 0 && _col.<Integer>get().intValue() >= limit16) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2749;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(268435456);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2750;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(536870912);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2751;BA.debugLine="lbl.TextColor = cHeaderTextColor";
Debug.ShouldStop(1073741824);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_cheadertextcolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("col", _col);
;
 };
 };
 BA.debugLineNum = 2755;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheadertextcolors(RemoteObject __ref,RemoteObject _headertextcolors) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderTextColors (table) ","table",20,__ref.getField(false, "ba"),__ref,3643);
if (RapidSub.canDelegate("setheadertextcolors")) { return __ref.runUserSub(false, "table","setheadertextcolors", __ref, _headertextcolors);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("HeaderTextColors", _headertextcolors);
 BA.debugLineNum = 3643;BA.debugLine="Public Sub SetHeaderTextColors(HeaderTextColors()";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 3644;BA.debugLine="Private col As Int";
Debug.ShouldStop(134217728);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 3646;BA.debugLine="cHeaderTextColors = HeaderTextColors";
Debug.ShouldStop(536870912);
__ref.setField ("_cheadertextcolors" /*RemoteObject*/ ,_headertextcolors);
 BA.debugLineNum = 3647;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3648;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3649;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(1);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _col.<Integer>get().intValue() <= limit5) || (step5 < 0 && _col.<Integer>get().intValue() >= limit5) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3650;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(2);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3651;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(4);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3652;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
Debug.ShouldStop(8);
_lbl.runMethod(true,"setTextColor",__ref.getField(false,"_cheadertextcolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3654;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
Debug.ShouldStop(32);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step10 > 0 && _col.<Integer>get().intValue() <= limit10) || (step10 < 0 && _col.<Integer>get().intValue() >= limit10) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step10))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3655;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(64);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3656;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
Debug.ShouldStop(128);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3657;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
Debug.ShouldStop(256);
_lbl.runMethod(true,"setTextColor",__ref.getField(false,"_cheadertextcolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 3660;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(2048);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step16 > 0 && _col.<Integer>get().intValue() <= limit16) || (step16 < 0 && _col.<Integer>get().intValue() >= limit16) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3661;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(4096);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3662;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(8192);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3663;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
Debug.ShouldStop(16384);
_lbl.runMethod(true,"setTextColor",__ref.getField(false,"_cheadertextcolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("col", _col);
;
 };
 };
 BA.debugLineNum = 3667;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheadertypeface(RemoteObject __ref,RemoteObject _headertypeface) throws Exception{
try {
		Debug.PushSubsStack("setHeaderTypeFace (table) ","table",20,__ref.getField(false, "ba"),__ref,3674);
if (RapidSub.canDelegate("setheadertypeface")) { return __ref.runUserSub(false, "table","setheadertypeface", __ref, _headertypeface);}
int _col = 0;
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("HeaderTypeFace", _headertypeface);
 BA.debugLineNum = 3674;BA.debugLine="Public Sub setHeaderTypeFace(HeaderTypeFace As Typ";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 3675;BA.debugLine="cHeaderTypeFace = HeaderTypeFace";
Debug.ShouldStop(67108864);
__ref.setField ("_cheadertypeface" /*RemoteObject*/ ,_headertypeface);
 BA.debugLineNum = 3676;BA.debugLine="HeaderMultiTypeFace = False";
Debug.ShouldStop(134217728);
__ref.setField ("_headermultitypeface" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 BA.debugLineNum = 3677;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3678;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3679;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(1073741824);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step5 > 0 && _col <= limit5) || (step5 < 0 && _col >= limit5) ;_col = ((int)(0 + _col + step5))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3680;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(-2147483648);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3681;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(1);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _col))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3682;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
Debug.ShouldStop(2);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject()));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3684;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
Debug.ShouldStop(8);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step10 > 0 && _col <= limit10) || (step10 < 0 && _col >= limit10) ;_col = ((int)(0 + _col + step10))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3685;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(16);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3686;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
Debug.ShouldStop(32);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_col),__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3687;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
Debug.ShouldStop(64);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject()));
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 3690;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(512);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step16 > 0 && _col <= limit16) || (step16 < 0 && _col >= limit16) ;_col = ((int)(0 + _col + step16))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3691;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(1024);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3692;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(2048);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _col))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3693;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
Debug.ShouldStop(4096);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject()));
 }
}Debug.locals.put("col", _col);
;
 };
 };
 BA.debugLineNum = 3697;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheadertypefaces(RemoteObject __ref,RemoteObject _headertypefaces) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderTypeFaces (table) ","table",20,__ref.getField(false, "ba"),__ref,3700);
if (RapidSub.canDelegate("setheadertypefaces")) { return __ref.runUserSub(false, "table","setheadertypefaces", __ref, _headertypefaces);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("HeaderTypeFaces", _headertypefaces);
 BA.debugLineNum = 3700;BA.debugLine="Public Sub SetHeaderTypeFaces(HeaderTypeFaces() As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 3701;BA.debugLine="Private col As Int";
Debug.ShouldStop(1048576);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 3703;BA.debugLine="If HeaderTypeFaces.Length = 1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_headertypefaces.getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 3704;BA.debugLine="cHeaderTypeFace = HeaderTypeFaces(0)";
Debug.ShouldStop(8388608);
__ref.setField ("_cheadertypeface" /*RemoteObject*/ ,_headertypefaces.getArrayElement(false,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3705;BA.debugLine="HeaderMultiTypeFace = False";
Debug.ShouldStop(16777216);
__ref.setField ("_headermultitypeface" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 BA.debugLineNum = 3706;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3707;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3708;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(134217728);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step7 > 0 && _col.<Integer>get().intValue() <= limit7) || (step7 < 0 && _col.<Integer>get().intValue() >= limit7) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3709;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(268435456);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3710;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(536870912);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3711;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
Debug.ShouldStop(1073741824);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject()));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3713;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
Debug.ShouldStop(1);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step12 > 0 && _col.<Integer>get().intValue() <= limit12) || (step12 < 0 && _col.<Integer>get().intValue() >= limit12) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3714;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(2);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3715;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
Debug.ShouldStop(4);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3716;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
Debug.ShouldStop(8);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject()));
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 3719;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(64);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step18 > 0 && _col.<Integer>get().intValue() <= limit18) || (step18 < 0 && _col.<Integer>get().intValue() >= limit18) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step18))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3720;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(128);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3721;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(256);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3722;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
Debug.ShouldStop(512);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypeface" /*RemoteObject*/ ).getObject()));
 }
}Debug.locals.put("col", _col);
;
 };
 };
 }else {
 BA.debugLineNum = 3727;BA.debugLine="If HeaderTypeFaces.Length <> mNumberOfColumns Th";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_headertypefaces.getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 3728;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
Debug.ShouldStop(32768);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Invalid number of columns")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 3729;BA.debugLine="Log(\"SetHeaderTypeFaces: Invalid number of colu";
Debug.ShouldStop(65536);
table.__c.runVoidMethod ("LogImpl","332899101",RemoteObject.createImmutable("SetHeaderTypeFaces: Invalid number of columns"),0);
 BA.debugLineNum = 3730;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 3732;BA.debugLine="cHeaderTypeFaces0 = HeaderTypeFaces";
Debug.ShouldStop(524288);
__ref.setField ("_cheadertypefaces0" /*RemoteObject*/ ,_headertypefaces);
 BA.debugLineNum = 3733;BA.debugLine="cHeaderTypeFaces = cHeaderTypeFaces0";
Debug.ShouldStop(1048576);
__ref.setField ("_cheadertypefaces" /*RemoteObject*/ ,__ref.getField(false,"_cheadertypefaces0" /*RemoteObject*/ ));
 BA.debugLineNum = 3734;BA.debugLine="HeaderMultiTypeFace = True";
Debug.ShouldStop(2097152);
__ref.setField ("_headermultitypeface" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 3735;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numb";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3736;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3737;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(16777216);
{
final int step36 = 1;
final int limit36 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step36 > 0 && _col.<Integer>get().intValue() <= limit36) || (step36 < 0 && _col.<Integer>get().intValue() >= limit36) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step36))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3738;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(33554432);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3739;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(67108864);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3740;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
Debug.ShouldStop(134217728);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject()));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3742;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfC";
Debug.ShouldStop(536870912);
{
final int step41 = 1;
final int limit41 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step41 > 0 && _col.<Integer>get().intValue() <= limit41) || (step41 < 0 && _col.<Integer>get().intValue() >= limit41) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step41))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3743;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(1073741824);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3744;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedCol";
Debug.ShouldStop(-2147483648);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3745;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
Debug.ShouldStop(1);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject()));
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 3748;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(8);
{
final int step47 = 1;
final int limit47 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step47 > 0 && _col.<Integer>get().intValue() <= limit47) || (step47 < 0 && _col.<Integer>get().intValue() >= limit47) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step47))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3749;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(16);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3750;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(32);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3751;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
Debug.ShouldStop(64);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_cheadertypefaces" /*RemoteObject*/ ).getArrayElement(false,_col).getObject()));
 }
}Debug.locals.put("col", _col);
;
 };
 };
 };
 };
 BA.debugLineNum = 3757;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("setHeight (table) ","table",20,__ref.getField(false, "ba"),__ref,2283);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "table","setheight", __ref, _height);}
Debug.locals.put("Height", _height);
 BA.debugLineNum = 2283;BA.debugLine="Public Sub setHeight(Height As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2284;BA.debugLine="cHeight = Height";
Debug.ShouldStop(2048);
__ref.setField ("_cheight" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 2285;BA.debugLine="pnlTable.Height = Height";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setHeight",_height);
 BA.debugLineNum = 2286;BA.debugLine="If (cShowStatusLine = True) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("=",__ref.getField(true,"_cshowstatusline" /*RemoteObject*/ ),table.__c.getField(true,"True")))) { 
 BA.debugLineNum = 2287;BA.debugLine="SVF.Height = Height - cStatusLineHeight - cHeade";
Debug.ShouldStop(16384);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ ),__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )}, "--",2, 1));
 BA.debugLineNum = 2288;BA.debugLine="SV2.Height = Height - cStatusLineHeight - cHeade";
Debug.ShouldStop(32768);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ ),__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )}, "--",2, 1));
 }else {
 BA.debugLineNum = 2290;BA.debugLine="SVF.Height = Height - cHeaderHeight";
Debug.ShouldStop(131072);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )}, "-",1, 1));
 BA.debugLineNum = 2291;BA.debugLine="SV2.Height = Height - cHeaderHeight";
Debug.ShouldStop(262144);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )}, "-",1, 1));
 };
 BA.debugLineNum = 2293;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 2294;BA.debugLine="SVF_ScrollChanged(0)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.ef.table.class, "_svf_scrollchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 2295;BA.debugLine="SV2_ScrollChanged(0, 0)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.ef.table.class, "_sv2_scrollchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 2296;BA.debugLine="InitFastScroll";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.ef.table.class, "_initfastscroll" /*RemoteObject*/ );
 BA.debugLineNum = 2298;BA.debugLine="updateIPLocation";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.ef.table.class, "_updateiplocation" /*RemoteObject*/ );
 BA.debugLineNum = 2299;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setleft(RemoteObject __ref,RemoteObject _left) throws Exception{
try {
		Debug.PushSubsStack("setLeft (table) ","table",20,__ref.getField(false, "ba"),__ref,2237);
if (RapidSub.canDelegate("setleft")) { return __ref.runUserSub(false, "table","setleft", __ref, _left);}
Debug.locals.put("Left", _left);
 BA.debugLineNum = 2237;BA.debugLine="Public Sub setLeft(Left As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2238;BA.debugLine="cLeft = Left";
Debug.ShouldStop(536870912);
__ref.setField ("_cleft" /*RemoteObject*/ ,_left);
 BA.debugLineNum = 2239;BA.debugLine="pnlTable.Left = Left";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setLeft",_left);
 BA.debugLineNum = 2240;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlinewidth(RemoteObject __ref,RemoteObject _linewidth) throws Exception{
try {
		Debug.PushSubsStack("setLineWidth (table) ","table",20,__ref.getField(false, "ba"),__ref,2315);
if (RapidSub.canDelegate("setlinewidth")) { return __ref.runUserSub(false, "table","setlinewidth", __ref, _linewidth);}
Debug.locals.put("LineWidth", _linewidth);
 BA.debugLineNum = 2315;BA.debugLine="Public Sub setLineWidth(LineWidth As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2316;BA.debugLine="cLineWidth = LineWidth";
Debug.ShouldStop(2048);
__ref.setField ("_clinewidth" /*RemoteObject*/ ,_linewidth);
 BA.debugLineNum = 2317;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmulticolumnsort(RemoteObject __ref,RemoteObject _bdo) throws Exception{
try {
		Debug.PushSubsStack("setMultiColumnSort (table) ","table",20,__ref.getField(false, "ba"),__ref,5022);
if (RapidSub.canDelegate("setmulticolumnsort")) { return __ref.runUserSub(false, "table","setmulticolumnsort", __ref, _bdo);}
Debug.locals.put("bDo", _bdo);
 BA.debugLineNum = 5022;BA.debugLine="Public Sub setMultiColumnSort(bDo As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 5023;BA.debugLine="mMultiColumnSort = bDo";
Debug.ShouldStop(1073741824);
__ref.setField ("_mmulticolumnsort" /*RemoteObject*/ ,_bdo);
 BA.debugLineNum = 5024;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmultiselect(RemoteObject __ref,RemoteObject _multiselect) throws Exception{
try {
		Debug.PushSubsStack("setMultiSelect (table) ","table",20,__ref.getField(false, "ba"),__ref,2158);
if (RapidSub.canDelegate("setmultiselect")) { return __ref.runUserSub(false, "table","setmultiselect", __ref, _multiselect);}
Debug.locals.put("MultiSelect", _multiselect);
 BA.debugLineNum = 2158;BA.debugLine="Public Sub setMultiSelect(MultiSelect As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2159;BA.debugLine="clearSelection";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.ef.table.class, "_clearselection" /*RemoteObject*/ );
 BA.debugLineNum = 2160;BA.debugLine="mMultiSelect = MultiSelect";
Debug.ShouldStop(32768);
__ref.setField ("_mmultiselect" /*RemoteObject*/ ,_multiselect);
 BA.debugLineNum = 2161;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumberofcolumns(RemoteObject __ref,RemoteObject _numberofcolumns) throws Exception{
try {
		Debug.PushSubsStack("setNumberOfColumns (table) ","table",20,__ref.getField(false, "ba"),__ref,3979);
if (RapidSub.canDelegate("setnumberofcolumns")) { return __ref.runUserSub(false, "table","setnumberofcolumns", __ref, _numberofcolumns);}
int _col = 0;
Debug.locals.put("NumberOfColumns", _numberofcolumns);
 BA.debugLineNum = 3979;BA.debugLine="Public Sub setNumberOfColumns (NumberOfColumns As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 3980;BA.debugLine="mNumberOfColumns = NumberOfColumns";
Debug.ShouldStop(2048);
__ref.setField ("_mnumberofcolumns" /*RemoteObject*/ ,_numberofcolumns);
 BA.debugLineNum = 3981;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 BA.debugLineNum = 3984;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(32768);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_columnwidths",table._columnwidths);
 BA.debugLineNum = 3985;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(65536);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_headerwidths",table._headerwidths);
 BA.debugLineNum = 3986;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
Debug.ShouldStop(131072);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_datawidths",table._datawidths);
 BA.debugLineNum = 3987;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
Debug.ShouldStop(262144);
table._ccolumndatatype = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ccolumndatatype",table._ccolumndatatype);
 BA.debugLineNum = 3988;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(524288);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step7 > 0 && _col <= limit7) || (step7 < 0 && _col >= limit7) ;_col = ((int)(0 + _col + step7))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3989;BA.debugLine="ColumnWidths(col) = 130dip";
Debug.ShouldStop(1048576);
__ref.getField(false,"_columnwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),BA.numberCast(int.class, _col));
 BA.debugLineNum = 3990;BA.debugLine="HeaderWidths(col) = 130dip";
Debug.ShouldStop(2097152);
__ref.getField(false,"_headerwidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),BA.numberCast(int.class, _col));
 BA.debugLineNum = 3991;BA.debugLine="DataWidths(col) = 130dip";
Debug.ShouldStop(4194304);
__ref.getField(false,"_datawidths" /*RemoteObject*/ ).setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),BA.numberCast(int.class, _col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 3993;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumberoffixedcolumns(RemoteObject __ref,RemoteObject _numberoffixedcolumns) throws Exception{
try {
		Debug.PushSubsStack("setNumberOfFixedColumns (table) ","table",20,__ref.getField(false, "ba"),__ref,4071);
if (RapidSub.canDelegate("setnumberoffixedcolumns")) { return __ref.runUserSub(false, "table","setnumberoffixedcolumns", __ref, _numberoffixedcolumns);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _headers = null;
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _currentmax = RemoteObject.createImmutable(0);
int _row = 0;
Debug.locals.put("NumberOfFixedColumns", _numberoffixedcolumns);
 BA.debugLineNum = 4071;BA.debugLine="Public Sub setNumberOfFixedColumns(NumberOfFixedCo";
Debug.ShouldStop(64);
 BA.debugLineNum = 4072;BA.debugLine="NumberOfFixedColumns = Max(0, Min(3, NumberOfFixe";
Debug.ShouldStop(128);
_numberoffixedcolumns = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 3)),(Object)(BA.numberCast(double.class, _numberoffixedcolumns))))));Debug.locals.put("NumberOfFixedColumns", _numberoffixedcolumns);
 BA.debugLineNum = 4073;BA.debugLine="If mNumberOfFixedColumns = NumberOfFixedColumns T";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, _numberoffixedcolumns))) { 
 BA.debugLineNum = 4074;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 4077;BA.debugLine="If Header.NumberOfViews = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 4078;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns	'Ne";
Debug.ShouldStop(8192);
__ref.setField ("_mnumberoffixedcolumns" /*RemoteObject*/ ,_numberoffixedcolumns);
 }else {
 BA.debugLineNum = 4080;BA.debugLine="Private col As Int";
Debug.ShouldStop(32768);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 4082;BA.debugLine="Private Headers(mNumberOfColumns) As String";
Debug.ShouldStop(131072);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 4083;BA.debugLine="If HeaderFirst.NumberOfViews = 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 4084;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(524288);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step11 > 0 && _col.<Integer>get().intValue() <= limit11) || (step11 < 0 && _col.<Integer>get().intValue() >= limit11) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step11))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 4085;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(1048576);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 4086;BA.debugLine="lbl = Header.GetView(col)";
Debug.ShouldStop(2097152);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 4087;BA.debugLine="Headers(col) = lbl.Text";
Debug.ShouldStop(4194304);
_headers.setArrayElement (_lbl.runMethod(true,"getText"),_col);
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 4090;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
Debug.ShouldStop(33554432);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step17 > 0 && _col.<Integer>get().intValue() <= limit17) || (step17 < 0 && _col.<Integer>get().intValue() >= limit17) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step17))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 4091;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(67108864);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 4092;BA.debugLine="lbl = HeaderFirst.GetView(col)";
Debug.ShouldStop(134217728);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 4093;BA.debugLine="Headers(col) = lbl.Text";
Debug.ShouldStop(268435456);
_headers.setArrayElement (_lbl.runMethod(true,"getText"),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 4095;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
Debug.ShouldStop(1073741824);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ) ;
for (;(step22 > 0 && _col.<Integer>get().intValue() <= limit22) || (step22 < 0 && _col.<Integer>get().intValue() >= limit22) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step22))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 4096;BA.debugLine="Private lbl As Label";
Debug.ShouldStop(-2147483648);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 4097;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
Debug.ShouldStop(1);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 4098;BA.debugLine="Headers(col) = lbl.Text";
Debug.ShouldStop(2);
_headers.setArrayElement (_lbl.runMethod(true,"getText"),_col);
 }
}Debug.locals.put("col", _col);
;
 };
 BA.debugLineNum = 4102;BA.debugLine="HeaderFirst.RemoveAllViews";
Debug.ShouldStop(32);
__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 4103;BA.debugLine="Header.RemoveAllViews";
Debug.ShouldStop(64);
__ref.getField(false,"_header" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 4105;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns";
Debug.ShouldStop(256);
__ref.setField ("_mnumberoffixedcolumns" /*RemoteObject*/ ,_numberoffixedcolumns);
 BA.debugLineNum = 4107;BA.debugLine="innerClearAll(mNumberOfColumns, False)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 4108;BA.debugLine="SetHeader(Headers)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.ef.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers));
 BA.debugLineNum = 4109;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_columnwidths" /*RemoteObject*/ )));
 BA.debugLineNum = 4110;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(8192);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 4111;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
Debug.ShouldStop(16384);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"));
 BA.debugLineNum = 4114;BA.debugLine="Private currentMax As Int";
Debug.ShouldStop(131072);
_currentmax = RemoteObject.createImmutable(0);Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 4115;BA.debugLine="currentMax = Min(Data.Size - 1, SV2.Height / cRo";
Debug.ShouldStop(262144);
_currentmax = BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_crowheight" /*RemoteObject*/ ),RemoteObject.createImmutable(30)}, "/+",1, 0))));Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 4117;BA.debugLine="For row = 0 To currentMax";
Debug.ShouldStop(1048576);
{
final int step38 = 1;
final int limit38 = _currentmax.<Integer>get().intValue();
_row = 0 ;
for (;(step38 > 0 && _row <= limit38) || (step38 < 0 && _row >= limit38) ;_row = ((int)(0 + _row + step38))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 4118;BA.debugLine="ShowRow(row)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(BA.numberCast(int.class, _row)));
 }
}Debug.locals.put("row", _row);
;
 };
 BA.debugLineNum = 4122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _v,RemoteObject _left,RemoteObject _top,RemoteObject _right,RemoteObject _bottom) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (table) ","table",20,__ref.getField(false, "ba"),__ref,3492);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "table","setpadding", __ref, _v, _left, _top, _right, _bottom);}
Debug.locals.put("v", _v);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Right", _right);
Debug.locals.put("Bottom", _bottom);
 BA.debugLineNum = 3492;BA.debugLine="Private Sub SetPadding(v As View, Left As Int, Top";
Debug.ShouldStop(8);
 BA.debugLineNum = 3493;BA.debugLine="v.Padding = Array As Int (Left, Top, Right, Botto";
Debug.ShouldStop(16);
_v.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {_left,_top,_right,_bottom}));
 BA.debugLineNum = 3494;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrowcolor1(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setRowColor1 (table) ","table",20,__ref.getField(false, "ba"),__ref,2762);
if (RapidSub.canDelegate("setrowcolor1")) { return __ref.runUserSub(false, "table","setrowcolor1", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 2762;BA.debugLine="Public Sub setRowColor1(Color As Int)";
Debug.ShouldStop(512);
 BA.debugLineNum = 2763;BA.debugLine="cRowColor1 = Color";
Debug.ShouldStop(1024);
__ref.setField ("_crowcolor1" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 2764;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(2048);
if (__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2765;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 };
 BA.debugLineNum = 2767;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrowcolor2(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setRowColor2 (table) ","table",20,__ref.getField(false, "ba"),__ref,2774);
if (RapidSub.canDelegate("setrowcolor2")) { return __ref.runUserSub(false, "table","setrowcolor2", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 2774;BA.debugLine="Public Sub setRowColor2(Color As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 2775;BA.debugLine="cRowColor2 = Color";
Debug.ShouldStop(4194304);
__ref.setField ("_crowcolor2" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 2776;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(8388608);
if (__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2777;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 };
 BA.debugLineNum = 2779;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrowcolorn(RemoteObject __ref,RemoteObject _row,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetRowColorN (table) ","table",20,__ref.getField(false, "ba"),__ref,2786);
if (RapidSub.canDelegate("setrowcolorn")) { return __ref.runUserSub(false, "table","setrowcolorn", __ref, _row, _color);}
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _new = RemoteObject.createImmutable(false);
RemoteObject _cdi = null;
RemoteObject _cdw = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("Row", _row);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 2786;BA.debugLine="Public Sub SetRowColorN(Row As Int, Color As Int)";
Debug.ShouldStop(2);
 BA.debugLineNum = 2787;BA.debugLine="Private col As Int";
Debug.ShouldStop(4);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 2788;BA.debugLine="Private New = False As Boolean";
Debug.ShouldStop(8);
_new = table.__c.getField(true,"False");Debug.locals.put("New", _new);Debug.locals.put("New", _new);
 BA.debugLineNum = 2789;BA.debugLine="If lstRowColors.IndexOf(Color) >= 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_color))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2790;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.IndexOf";
Debug.ShouldStop(32);
__ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(_row),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_color))),RemoteObject.createImmutable(2)}, "+",1, 1))));
 }else {
 BA.debugLineNum = 2792;BA.debugLine="lstRowColors.Add(Color)";
Debug.ShouldStop(128);
__ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_color)));
 BA.debugLineNum = 2793;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.Size +";
Debug.ShouldStop(256);
__ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(_row),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 2794;BA.debugLine="New = True";
Debug.ShouldStop(512);
_new = table.__c.getField(true,"True");Debug.locals.put("New", _new);
 };
 BA.debugLineNum = 2797;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2798;BA.debugLine="Private cdi(mNumberOfColumns) As Object";
Debug.ShouldStop(8192);
_cdi = RemoteObject.createNewArray ("Object", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("cdi", _cdi);
 BA.debugLineNum = 2799;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(16384);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _col.<Integer>get().intValue() <= limit12) || (step12 < 0 && _col.<Integer>get().intValue() >= limit12) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 2800;BA.debugLine="Private cdw As ColorDrawable";
Debug.ShouldStop(32768);
_cdw = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdw", _cdw);
 BA.debugLineNum = 2801;BA.debugLine="cdw.Initialize(Color, 0)";
Debug.ShouldStop(65536);
_cdw.runVoidMethod ("Initialize",(Object)(_color),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 2802;BA.debugLine="cdi(col) = cdw";
Debug.ShouldStop(131072);
_cdi.setArrayElement ((_cdw.getObject()),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 2804;BA.debugLine="If New = False Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_new,table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2805;BA.debugLine="lstRowDrawables.Set(lstRowColors.IndexOf(Color)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lstrowdrawables" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(__ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_color)))),(Object)((_cdi)));
 }else {
 BA.debugLineNum = 2807;BA.debugLine="lstRowDrawables.Add(cdi)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lstrowdrawables" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cdi)));
 };
 BA.debugLineNum = 2812;BA.debugLine="RefreshLabels";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.ef.table.class, "_refreshlabels" /*RemoteObject*/ );
 };
 BA.debugLineNum = 2814;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrowheight(RemoteObject __ref,RemoteObject _rowheight) throws Exception{
try {
		Debug.PushSubsStack("setRowHeight (table) ","table",20,__ref.getField(false, "ba"),__ref,2986);
if (RapidSub.canDelegate("setrowheight")) { return __ref.runUserSub(false, "table","setrowheight", __ref, _rowheight);}
Debug.locals.put("RowHeight", _rowheight);
 BA.debugLineNum = 2986;BA.debugLine="Public Sub setRowHeight(RowHeight As Int)";
Debug.ShouldStop(512);
 BA.debugLineNum = 2987;BA.debugLine="If cRowHeight = cHeaderHeight Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_crowheight" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_cheaderheight" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 2988;BA.debugLine="setHeaderHeight(RowHeight)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.ef.table.class, "_setheaderheight" /*RemoteObject*/ ,(Object)(_rowheight));
 };
 BA.debugLineNum = 2990;BA.debugLine="cRowHeight = RowHeight";
Debug.ShouldStop(8192);
__ref.setField ("_crowheight" /*RemoteObject*/ ,_rowheight);
 BA.debugLineNum = 2991;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedcellcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setSelectedCellColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2856);
if (RapidSub.canDelegate("setselectedcellcolor")) { return __ref.runUserSub(false, "table","setselectedcellcolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 2856;BA.debugLine="Public Sub setSelectedCellColor(Color As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 2857;BA.debugLine="cSelectedCellColor = Color";
Debug.ShouldStop(256);
__ref.setField ("_cselectedcellcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 2858;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(512);
if (__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2859;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 };
 BA.debugLineNum = 2861;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedcelltextcolor(RemoteObject __ref,RemoteObject _textcolor) throws Exception{
try {
		Debug.PushSubsStack("setSelectedCellTextColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2868);
if (RapidSub.canDelegate("setselectedcelltextcolor")) { return __ref.runUserSub(false, "table","setselectedcelltextcolor", __ref, _textcolor);}
Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 2868;BA.debugLine="Public Sub setSelectedCellTextColor(TextColor As I";
Debug.ShouldStop(524288);
 BA.debugLineNum = 2869;BA.debugLine="cSelectedCellTextColor = TextColor";
Debug.ShouldStop(1048576);
__ref.setField ("_cselectedcelltextcolor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 2870;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(2097152);
if (__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2871;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 };
 BA.debugLineNum = 2873;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedrowcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setSelectedRowColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2832);
if (RapidSub.canDelegate("setselectedrowcolor")) { return __ref.runUserSub(false, "table","setselectedrowcolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 2832;BA.debugLine="Public Sub setSelectedRowColor(Color As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 2833;BA.debugLine="cSelectedRowColor = Color";
Debug.ShouldStop(65536);
__ref.setField ("_cselectedrowcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 2834;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2835;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 };
 BA.debugLineNum = 2837;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedrowtextcolor(RemoteObject __ref,RemoteObject _textcolor) throws Exception{
try {
		Debug.PushSubsStack("setSelectedRowTextColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2844);
if (RapidSub.canDelegate("setselectedrowtextcolor")) { return __ref.runUserSub(false, "table","setselectedrowtextcolor", __ref, _textcolor);}
Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 2844;BA.debugLine="Public Sub setSelectedRowTextColor(TextColor As In";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 2845;BA.debugLine="cSelectedRowTextColor = TextColor";
Debug.ShouldStop(268435456);
__ref.setField ("_cselectedrowtextcolor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 2846;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(536870912);
if (__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2847;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.ef.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")));
 };
 BA.debugLineNum = 2849;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowstatusline(RemoteObject __ref,RemoteObject _showstatusline) throws Exception{
try {
		Debug.PushSubsStack("setShowStatusLine (table) ","table",20,__ref.getField(false, "ba"),__ref,3819);
if (RapidSub.canDelegate("setshowstatusline")) { return __ref.runUserSub(false, "table","setshowstatusline", __ref, _showstatusline);}
Debug.locals.put("ShowStatusLine", _showstatusline);
 BA.debugLineNum = 3819;BA.debugLine="Public Sub setShowStatusLine(ShowStatusLine As Boo";
Debug.ShouldStop(1024);
 BA.debugLineNum = 3820;BA.debugLine="cShowStatusLine = ShowStatusLine";
Debug.ShouldStop(2048);
__ref.setField ("_cshowstatusline" /*RemoteObject*/ ,_showstatusline);
 BA.debugLineNum = 3821;BA.debugLine="If cShowStatusLine = True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cshowstatusline" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3822;BA.debugLine="SV2.Height = cHeight - Header.Height - cStatusLi";
Debug.ShouldStop(8192);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_cstatuslineheight" /*RemoteObject*/ )}, "--",2, 1));
 BA.debugLineNum = 3823;BA.debugLine="lblStatusLine.Visible = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 3825;BA.debugLine="SV2.Height = cHeight - Header.Height";
Debug.ShouldStop(65536);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cheight" /*RemoteObject*/ ),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 3826;BA.debugLine="lblStatusLine.Visible = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"False"));
 };
 BA.debugLineNum = 3828;BA.debugLine="SVF.Height = SV2.Height";
Debug.ShouldStop(524288);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 3829;BA.debugLine="If mFastScrollFixedLabel = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscrollfixedlabel" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3830;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)),RemoteObject.createImmutable(2),__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/+",1, 0)));
 };
 BA.debugLineNum = 3832;BA.debugLine="InitFastScroll";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.ef.table.class, "_initfastscroll" /*RemoteObject*/ );
 BA.debugLineNum = 3833;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsingleline(RemoteObject __ref,RemoteObject _singleline) throws Exception{
try {
		Debug.PushSubsStack("setSingleLine (table) ","table",20,__ref.getField(false, "ba"),__ref,3764);
if (RapidSub.canDelegate("setsingleline")) { return __ref.runUserSub(false, "table","setsingleline", __ref, _singleline);}
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _lbls = null;
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("SingleLine", _singleline);
 BA.debugLineNum = 3764;BA.debugLine="Public Sub setSingleLine(SingleLine As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 3766;BA.debugLine="Private row, col As Int";
Debug.ShouldStop(2097152);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 3767;BA.debugLine="cSingleLine = SingleLine";
Debug.ShouldStop(4194304);
__ref.setField ("_csingleline" /*RemoteObject*/ ,_singleline);
 BA.debugLineNum = 3769;BA.debugLine="If LabelsCache.Size > 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3770;BA.debugLine="For row = 0 To LabelsCache.Size - 1";
Debug.ShouldStop(33554432);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step4 > 0 && _row.<Integer>get().intValue() <= limit4) || (step4 < 0 && _row.<Integer>get().intValue() >= limit4) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step4))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 3771;BA.debugLine="Private lbls(mNumberOfColumns) As Label";
Debug.ShouldStop(67108864);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 3772;BA.debugLine="lbls = LabelsCache.Get(row)";
Debug.ShouldStop(134217728);
_lbls = (__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 3773;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(268435456);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step7 > 0 && _col.<Integer>get().intValue() <= limit7) || (step7 < 0 && _col.<Integer>get().intValue() >= limit7) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 3774;BA.debugLine="Private jo As JavaObject";
Debug.ShouldStop(536870912);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 3775;BA.debugLine="jo = lbls(col)";
Debug.ShouldStop(1073741824);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _lbls.getArrayElement(false,_col).getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 3776;BA.debugLine="jo.RunMethod(\"setSingleLine\", Array(cSingleLin";
Debug.ShouldStop(-2147483648);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSingleLine")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_csingleline" /*RemoteObject*/ ))})));
 }
}Debug.locals.put("col", _col);
;
 }
}Debug.locals.put("row", _row);
;
 };
 BA.debugLineNum = 3781;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsortbitmapcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setSortBitmapColor (table) ","table",20,__ref.getField(false, "ba"),__ref,4039);
if (RapidSub.canDelegate("setsortbitmapcolor")) { return __ref.runUserSub(false, "table","setsortbitmapcolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 4039;BA.debugLine="Public Sub setSortBitmapColor(Color As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 4040;BA.debugLine="cSortBitmapColor = Color";
Debug.ShouldStop(128);
__ref.setField ("_csortbitmapcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 4041;BA.debugLine="InitializeSortingBitmaps";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.ef.table.class, "_initializesortingbitmaps" /*RemoteObject*/ );
 BA.debugLineNum = 4042;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsortbitmapwidth(RemoteObject __ref,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setSortBitmapWidth (table) ","table",20,__ref.getField(false, "ba"),__ref,4029);
if (RapidSub.canDelegate("setsortbitmapwidth")) { return __ref.runUserSub(false, "table","setsortbitmapwidth", __ref, _width);}
Debug.locals.put("Width", _width);
 BA.debugLineNum = 4029;BA.debugLine="Public Sub setSortBitmapWidth(Width As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 4030;BA.debugLine="cSortBitmapWidth = Width";
Debug.ShouldStop(536870912);
__ref.setField ("_csortbitmapwidth" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 4031;BA.debugLine="InitializeSortingBitmaps";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.ef.table.class, "_initializesortingbitmaps" /*RemoteObject*/ );
 BA.debugLineNum = 4032;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsortcaseinsensitive(RemoteObject __ref,RemoteObject _bdo) throws Exception{
try {
		Debug.PushSubsStack("setSortCaseInsensitive (table) ","table",20,__ref.getField(false, "ba"),__ref,5030);
if (RapidSub.canDelegate("setsortcaseinsensitive")) { return __ref.runUserSub(false, "table","setsortcaseinsensitive", __ref, _bdo);}
Debug.locals.put("bDo", _bdo);
 BA.debugLineNum = 5030;BA.debugLine="Public Sub setSortCaseInsensitive(bDo As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 5031;BA.debugLine="mSortCaseInsensitive = bDo";
Debug.ShouldStop(64);
__ref.setField ("_msortcaseinsensitive" /*RemoteObject*/ ,_bdo);
 BA.debugLineNum = 5032;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsortcolumn(RemoteObject __ref,RemoteObject _sortcolumn) throws Exception{
try {
		Debug.PushSubsStack("setSortColumn (table) ","table",20,__ref.getField(false, "ba"),__ref,3497);
if (RapidSub.canDelegate("setsortcolumn")) { return __ref.runUserSub(false, "table","setsortcolumn", __ref, _sortcolumn);}
Debug.locals.put("SortColumn", _sortcolumn);
 BA.debugLineNum = 3497;BA.debugLine="Public Sub setSortColumn(SortColumn As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 3498;BA.debugLine="cSortColumn = SortColumn";
Debug.ShouldStop(512);
__ref.setField ("_csortcolumn" /*RemoteObject*/ ,_sortcolumn);
 BA.debugLineNum = 3499;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsortingbitmaps(RemoteObject __ref,RemoteObject _bitmapascfilename,RemoteObject _bitmapdesfilename) throws Exception{
try {
		Debug.PushSubsStack("SetSortingBitmaps (table) ","table",20,__ref.getField(false, "ba"),__ref,4054);
if (RapidSub.canDelegate("setsortingbitmaps")) { return __ref.runUserSub(false, "table","setsortingbitmaps", __ref, _bitmapascfilename, _bitmapdesfilename);}
Debug.locals.put("BitmapAscFilename", _bitmapascfilename);
Debug.locals.put("BitmapDesFilename", _bitmapdesfilename);
 BA.debugLineNum = 4054;BA.debugLine="Public Sub SetSortingBitmaps(BitmapAscFilename As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 4055;BA.debugLine="bmpAsc.Initialize(File.DirAssets, BitmapAscFilena";
Debug.ShouldStop(4194304);
__ref.getField(false,"_bmpasc" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(table.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_bitmapascfilename));
 BA.debugLineNum = 4056;BA.debugLine="bmpDes.Initialize(File.DirAssets, BitmapDesFilena";
Debug.ShouldStop(8388608);
__ref.getField(false,"_bmpdes" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(table.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_bitmapdesfilename));
 BA.debugLineNum = 4057;BA.debugLine="mCustomSortingBitmaps = True";
Debug.ShouldStop(16777216);
__ref.setField ("_mcustomsortingbitmaps" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 4058;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsortremoveaccents(RemoteObject __ref,RemoteObject _sortremoveaccents) throws Exception{
try {
		Debug.PushSubsStack("setSortRemoveAccents (table) ","table",20,__ref.getField(false, "ba"),__ref,4008);
if (RapidSub.canDelegate("setsortremoveaccents")) { return __ref.runUserSub(false, "table","setsortremoveaccents", __ref, _sortremoveaccents);}
Debug.locals.put("SortRemoveAccents", _sortremoveaccents);
 BA.debugLineNum = 4008;BA.debugLine="Public Sub setSortRemoveAccents(SortRemoveAccents";
Debug.ShouldStop(128);
 BA.debugLineNum = 4009;BA.debugLine="cSortRemoveAccents = SortRemoveAccents";
Debug.ShouldStop(256);
__ref.setField ("_csortremoveaccents" /*RemoteObject*/ ,_sortremoveaccents);
 BA.debugLineNum = 4010;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatusline(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("setStatusLine (table) ","table",20,__ref.getField(false, "ba"),__ref,2210);
if (RapidSub.canDelegate("setstatusline")) { return __ref.runUserSub(false, "table","setstatusline", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 2210;BA.debugLine="Public Sub setStatusLine(Text As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 2211;BA.debugLine="If (lblStatusLine.IsInitialized) Then lblStatusLi";
Debug.ShouldStop(4);
if ((__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_text));};
 BA.debugLineNum = 2212;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatuslineheight(RemoteObject __ref,RemoteObject _statuslineheight) throws Exception{
try {
		Debug.PushSubsStack("setStatusLineHeight (table) ","table",20,__ref.getField(false, "ba"),__ref,2998);
if (RapidSub.canDelegate("setstatuslineheight")) { return __ref.runUserSub(false, "table","setstatuslineheight", __ref, _statuslineheight);}
Debug.locals.put("StatusLineHeight", _statuslineheight);
 BA.debugLineNum = 2998;BA.debugLine="Public Sub setStatusLineHeight(StatusLineHeight As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 2999;BA.debugLine="cStatusLineHeight = StatusLineHeight";
Debug.ShouldStop(4194304);
__ref.setField ("_cstatuslineheight" /*RemoteObject*/ ,_statuslineheight);
 BA.debugLineNum = 3000;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settablecolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTableColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2880);
if (RapidSub.canDelegate("settablecolor")) { return __ref.runUserSub(false, "table","settablecolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 2880;BA.debugLine="Public Sub setTableColor(Color As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 2881;BA.debugLine="cTableColor = Color";
Debug.ShouldStop(1);
__ref.setField ("_ctablecolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 2882;BA.debugLine="If SV2.IsInitialized = True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2883;BA.debugLine="SV2.Panel.Color = cTableColor";
Debug.ShouldStop(4);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("setColor",__ref.getField(true,"_ctablecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 2884;BA.debugLine="SVF.Panel.Color = cTableColor";
Debug.ShouldStop(8);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("setColor",__ref.getField(true,"_ctablecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 2885;BA.debugLine="If Header.IsInitialized Then";
Debug.ShouldStop(16);
if (__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2886;BA.debugLine="Header.Color = cTableColor";
Debug.ShouldStop(32);
__ref.getField(false,"_header" /*RemoteObject*/ ).runVoidMethod ("setColor",__ref.getField(true,"_ctablecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 2887;BA.debugLine="HeaderFirst.Color = cTableColor";
Debug.ShouldStop(64);
__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runVoidMethod ("setColor",__ref.getField(true,"_ctablecolor" /*RemoteObject*/ ));
 };
 };
 BA.debugLineNum = 2890;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settag(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("setTag (table) ","table",20,__ref.getField(false, "ba"),__ref,3914);
if (RapidSub.canDelegate("settag")) { return __ref.runUserSub(false, "table","settag", __ref, _tag);}
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 3914;BA.debugLine="Public Sub setTag(Tag As Object)";
Debug.ShouldStop(512);
 BA.debugLineNum = 3915;BA.debugLine="pnlTable.Tag = Tag";
Debug.ShouldStop(1024);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(false,"setTag",_tag);
 BA.debugLineNum = 3916;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (table) ","table",20,__ref.getField(false, "ba"),__ref,2897);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "table","settextcolor", __ref, _color);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Color", _color);
 BA.debugLineNum = 2897;BA.debugLine="Public Sub setTextColor(Color As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2898;BA.debugLine="cTextColor = Color";
Debug.ShouldStop(131072);
__ref.setField ("_ctextcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 2899;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2900;BA.debugLine="If SV2.IsInitialized = True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2901;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1048576);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2902;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
Debug.ShouldStop(2097152);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _i.<Integer>get().intValue() <= limit5) || (step5 < 0 && _i.<Integer>get().intValue() >= limit5) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2903;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(4194304);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2904;BA.debugLine="lbl = SV2.Panel.GetView(i)";
Debug.ShouldStop(8388608);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2905;BA.debugLine="lbl.TextColor = cTextColor";
Debug.ShouldStop(16777216);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_ctextcolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 };
 }else {
 BA.debugLineNum = 2909;BA.debugLine="If SV2.IsInitialized = True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2910;BA.debugLine="Dim i As Int";
Debug.ShouldStop(536870912);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2911;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
Debug.ShouldStop(1073741824);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step14 > 0 && _i.<Integer>get().intValue() <= limit14) || (step14 < 0 && _i.<Integer>get().intValue() >= limit14) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2912;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(-2147483648);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2913;BA.debugLine="lbl = SVF.Panel.GetView(i)";
Debug.ShouldStop(1);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2914;BA.debugLine="lbl.TextColor = cTextColor";
Debug.ShouldStop(2);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_ctextcolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2916;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2917;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
Debug.ShouldStop(16);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step20 > 0 && _i.<Integer>get().intValue() <= limit20) || (step20 < 0 && _i.<Integer>get().intValue() >= limit20) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2918;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(32);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2919;BA.debugLine="lbl = SV2.Panel.GetView(i)";
Debug.ShouldStop(64);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2920;BA.debugLine="lbl.TextColor = cTextColor";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_ctextcolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 2924;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextcolors(RemoteObject __ref,RemoteObject _textcolors) throws Exception{
try {
		Debug.PushSubsStack("SetTextColors (table) ","table",20,__ref.getField(false, "ba"),__ref,3569);
if (RapidSub.canDelegate("settextcolors")) { return __ref.runUserSub(false, "table","settextcolors", __ref, _textcolors);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("TextColors", _textcolors);
 BA.debugLineNum = 3569;BA.debugLine="Public Sub SetTextColors(TextColors() As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 3570;BA.debugLine="cTextColors = TextColors";
Debug.ShouldStop(131072);
__ref.setField ("_ctextcolors" /*RemoteObject*/ ,_textcolors);
 BA.debugLineNum = 3571;BA.debugLine="If cTextColors.Length = 1 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 3572;BA.debugLine="MultiTextColors = False";
Debug.ShouldStop(524288);
__ref.setField ("_multitextcolors" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 BA.debugLineNum = 3573;BA.debugLine="setTextColor(cTextColors(0))";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.ef.table.class, "_settextcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 3574;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 3576;BA.debugLine="MultiTextColors = True";
Debug.ShouldStop(8388608);
__ref.setField ("_multitextcolors" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 };
 BA.debugLineNum = 3578;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3579;BA.debugLine="If SV2.IsInitialized = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3580;BA.debugLine="Dim i, col As Int";
Debug.ShouldStop(134217728);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 3581;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
Debug.ShouldStop(268435456);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _i.<Integer>get().intValue() <= limit12) || (step12 < 0 && _i.<Integer>get().intValue() >= limit12) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3582;BA.debugLine="col = i Mod mNumberOfColumns";
Debug.ShouldStop(536870912);
_col = RemoteObject.solve(new RemoteObject[] {_i,__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )}, "%",0, 1);Debug.locals.put("col", _col);
 BA.debugLineNum = 3583;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(1073741824);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3584;BA.debugLine="lbl = SV2.Panel.GetView(i)";
Debug.ShouldStop(-2147483648);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3585;BA.debugLine="lbl.TextColor = cTextColors(col)";
Debug.ShouldStop(1);
_lbl.runMethod(true,"setTextColor",__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("i", _i);
;
 };
 }else {
 BA.debugLineNum = 3589;BA.debugLine="If SV2.IsInitialized = True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3590;BA.debugLine="Dim i, col As Int";
Debug.ShouldStop(32);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 3591;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
Debug.ShouldStop(64);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step22 > 0 && _i.<Integer>get().intValue() <= limit22) || (step22 < 0 && _i.<Integer>get().intValue() >= limit22) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3592;BA.debugLine="col = i Mod mNumberOfFixedColumns";
Debug.ShouldStop(128);
_col = RemoteObject.solve(new RemoteObject[] {_i,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "%",0, 1);Debug.locals.put("col", _col);
 BA.debugLineNum = 3593;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(256);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3594;BA.debugLine="lbl = SVF.Panel.GetView(i)";
Debug.ShouldStop(512);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3595;BA.debugLine="lbl.TextColor = cTextColors(col)";
Debug.ShouldStop(1024);
_lbl.runMethod(true,"setTextColor",__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3597;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
Debug.ShouldStop(4096);
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step28 > 0 && _i.<Integer>get().intValue() <= limit28) || (step28 < 0 && _i.<Integer>get().intValue() >= limit28) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3598;BA.debugLine="col = i Mod (mNumberOfColumns - mNumberOfFixed";
Debug.ShouldStop(8192);
_col = RemoteObject.solve(new RemoteObject[] {_i,(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "%+",1, 1);Debug.locals.put("col", _col);
 BA.debugLineNum = 3599;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(16384);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3600;BA.debugLine="lbl = SV2.Panel.GetView(i)";
Debug.ShouldStop(32768);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3601;BA.debugLine="lbl.TextColor = cTextColors(col)";
Debug.ShouldStop(65536);
_lbl.runMethod(true,"setTextColor",__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getArrayElement(true,_col));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 3605;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextsize(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("setTextSize (table) ","table",20,__ref.getField(false, "ba"),__ref,2931);
if (RapidSub.canDelegate("settextsize")) { return __ref.runUserSub(false, "table","settextsize", __ref, _size);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Size", _size);
 BA.debugLineNum = 2931;BA.debugLine="Public Sub setTextSize(Size As Float)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2932;BA.debugLine="cTextSize = Size";
Debug.ShouldStop(524288);
__ref.setField ("_ctextsize" /*RemoteObject*/ ,_size);
 BA.debugLineNum = 2934;BA.debugLine="Private i As Int";
Debug.ShouldStop(2097152);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2936;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2937;BA.debugLine="If Header.IsInitialized Then";
Debug.ShouldStop(16777216);
if (__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2938;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
Debug.ShouldStop(33554432);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _i.<Integer>get().intValue() <= limit5) || (step5 < 0 && _i.<Integer>get().intValue() >= limit5) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2939;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(67108864);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2940;BA.debugLine="lbl = Header.GetView(i)";
Debug.ShouldStop(134217728);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2941;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(268435456);
_lbl.runMethod(true,"setTextSize",__ref.getField(true,"_ctextsize" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 2945;BA.debugLine="If SV2.IsInitialized = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2946;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
Debug.ShouldStop(2);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _i.<Integer>get().intValue() <= limit12) || (step12 < 0 && _i.<Integer>get().intValue() >= limit12) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2947;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(4);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2948;BA.debugLine="lbl = SV2.Panel.GetView(i)";
Debug.ShouldStop(8);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2949;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(16);
_lbl.runMethod(true,"setTextSize",__ref.getField(true,"_ctextsize" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 };
 }else {
 BA.debugLineNum = 2953;BA.debugLine="If Header.IsInitialized Then";
Debug.ShouldStop(256);
if (__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2954;BA.debugLine="For i = 0 To HeaderFirst.NumberOfViews - 1";
Debug.ShouldStop(512);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step20 > 0 && _i.<Integer>get().intValue() <= limit20) || (step20 < 0 && _i.<Integer>get().intValue() >= limit20) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2955;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(1024);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2956;BA.debugLine="lbl = HeaderFirst.GetView(i)";
Debug.ShouldStop(2048);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2957;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(4096);
_lbl.runMethod(true,"setTextSize",__ref.getField(true,"_ctextsize" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2959;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
Debug.ShouldStop(16384);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step25 > 0 && _i.<Integer>get().intValue() <= limit25) || (step25 < 0 && _i.<Integer>get().intValue() >= limit25) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2960;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(32768);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2961;BA.debugLine="lbl = Header.GetView(i)";
Debug.ShouldStop(65536);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2962;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(131072);
_lbl.runMethod(true,"setTextSize",__ref.getField(true,"_ctextsize" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 2966;BA.debugLine="If SV2.IsInitialized = True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2967;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
Debug.ShouldStop(4194304);
{
final int step32 = 1;
final int limit32 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step32 > 0 && _i.<Integer>get().intValue() <= limit32) || (step32 < 0 && _i.<Integer>get().intValue() >= limit32) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step32))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2968;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(8388608);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2969;BA.debugLine="lbl = SVF.Panel.GetView(i)";
Debug.ShouldStop(16777216);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2970;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setTextSize",__ref.getField(true,"_ctextsize" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2972;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
Debug.ShouldStop(134217728);
{
final int step37 = 1;
final int limit37 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step37 > 0 && _i.<Integer>get().intValue() <= limit37) || (step37 < 0 && _i.<Integer>get().intValue() >= limit37) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step37))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2973;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(268435456);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2974;BA.debugLine="lbl = SV2.Panel.GetView(i)";
Debug.ShouldStop(536870912);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2975;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(1073741824);
_lbl.runMethod(true,"setTextSize",__ref.getField(true,"_ctextsize" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 2979;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settop(RemoteObject __ref,RemoteObject _top) throws Exception{
try {
		Debug.PushSubsStack("setTop (table) ","table",20,__ref.getField(false, "ba"),__ref,2247);
if (RapidSub.canDelegate("settop")) { return __ref.runUserSub(false, "table","settop", __ref, _top);}
Debug.locals.put("Top", _top);
 BA.debugLineNum = 2247;BA.debugLine="Public Sub setTop(Top As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 2248;BA.debugLine="cTop = Top";
Debug.ShouldStop(128);
__ref.setField ("_ctop" /*RemoteObject*/ ,_top);
 BA.debugLineNum = 2249;BA.debugLine="pnlTable.Top = Top";
Debug.ShouldStop(256);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setTop",_top);
 BA.debugLineNum = 2250;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settypefaces(RemoteObject __ref,RemoteObject _typefaces) throws Exception{
try {
		Debug.PushSubsStack("SetTypeFaces (table) ","table",20,__ref.getField(false, "ba"),__ref,3013);
if (RapidSub.canDelegate("settypefaces")) { return __ref.runUserSub(false, "table","settypefaces", __ref, _typefaces);}
Debug.locals.put("TypeFaces", _typefaces);
 BA.debugLineNum = 3013;BA.debugLine="Public Sub SetTypeFaces(TypeFaces() As Typeface)";
Debug.ShouldStop(16);
 BA.debugLineNum = 3014;BA.debugLine="If TypeFaces.Length = 1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_typefaces.getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 3015;BA.debugLine="cTypeFace = TypeFaces(0)";
Debug.ShouldStop(64);
__ref.setField ("_ctypeface" /*RemoteObject*/ ,_typefaces.getArrayElement(false,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3016;BA.debugLine="MultiTypeFace = False";
Debug.ShouldStop(128);
__ref.setField ("_multitypeface" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 3018;BA.debugLine="If TypeFaces.Length <> mNumberOfColumns Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",_typefaces.getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 3019;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
Debug.ShouldStop(1024);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Invalid number of columns")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 3020;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 3023;BA.debugLine="cTypeFaces0 = TypeFaces";
Debug.ShouldStop(16384);
__ref.setField ("_ctypefaces0" /*RemoteObject*/ ,_typefaces);
 BA.debugLineNum = 3024;BA.debugLine="cTypeFaces = cTypeFaces0";
Debug.ShouldStop(32768);
__ref.setField ("_ctypefaces" /*RemoteObject*/ ,__ref.getField(false,"_ctypefaces0" /*RemoteObject*/ ));
 BA.debugLineNum = 3025;BA.debugLine="MultiTypeFace = True";
Debug.ShouldStop(65536);
__ref.setField ("_multitypeface" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 };
 BA.debugLineNum = 3028;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3029;BA.debugLine="RefreshLabels";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.ef.table.class, "_refreshlabels" /*RemoteObject*/ );
 };
 BA.debugLineNum = 3031;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setusecolumncolors(RemoteObject __ref,RemoteObject _usecolumncolors) throws Exception{
try {
		Debug.PushSubsStack("setUseColumnColors (table) ","table",20,__ref.getField(false, "ba"),__ref,3506);
if (RapidSub.canDelegate("setusecolumncolors")) { return __ref.runUserSub(false, "table","setusecolumncolors", __ref, _usecolumncolors);}
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("UseColumnColors", _usecolumncolors);
 BA.debugLineNum = 3506;BA.debugLine="Public Sub setUseColumnColors(UseColumnColors As B";
Debug.ShouldStop(131072);
 BA.debugLineNum = 3507;BA.debugLine="cUseColumnColors = UseColumnColors";
Debug.ShouldStop(262144);
__ref.setField ("_cusecolumncolors" /*RemoteObject*/ ,_usecolumncolors);
 BA.debugLineNum = 3508;BA.debugLine="If cColumnColors.Length = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_ccolumncolors" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3509;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1048576);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 3510;BA.debugLine="Dim cColumnColors(mNumberOfColumns) As Int";
Debug.ShouldStop(2097152);
table._ccolumncolors = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ccolumncolors",table._ccolumncolors);
 BA.debugLineNum = 3511;BA.debugLine="Dim cTextColors(mNumberOfColumns) As Int";
Debug.ShouldStop(4194304);
table._ctextcolors = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_ctextcolors",table._ctextcolors);
 BA.debugLineNum = 3512;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(8388608);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _i.<Integer>get().intValue() <= limit6) || (step6 < 0 && _i.<Integer>get().intValue() >= limit6) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3513;BA.debugLine="If i Mod 2 = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3514;BA.debugLine="cColumnColors(i) = cRowColor1";
Debug.ShouldStop(33554432);
__ref.getField(false,"_ccolumncolors" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_crowcolor1" /*RemoteObject*/ ),_i);
 }else {
 BA.debugLineNum = 3516;BA.debugLine="cColumnColors(i) = cRowColor2";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ccolumncolors" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_crowcolor2" /*RemoteObject*/ ),_i);
 };
 BA.debugLineNum = 3518;BA.debugLine="cTextColors(i) = cTextColor";
Debug.ShouldStop(536870912);
__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_ctextcolor" /*RemoteObject*/ ),_i);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 3522;BA.debugLine="If cHeaderColors.Length = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cheadercolors" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3523;BA.debugLine="Dim i As Int";
Debug.ShouldStop(4);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 3524;BA.debugLine="Dim cHeaderColors(mNumberOfColumns) As Int";
Debug.ShouldStop(8);
table._cheadercolors = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_cheadercolors",table._cheadercolors);
 BA.debugLineNum = 3525;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(16);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step18 > 0 && _i.<Integer>get().intValue() <= limit18) || (step18 < 0 && _i.<Integer>get().intValue() >= limit18) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3526;BA.debugLine="cHeaderColors(i) = cHeaderColor";
Debug.ShouldStop(32);
__ref.getField(false,"_cheadercolors" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_cheadercolor" /*RemoteObject*/ ),_i);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 3530;BA.debugLine="If cHeaderTextColors.Length = 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cheadertextcolors" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3531;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1024);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 3532;BA.debugLine="Dim cHeaderTextColors(mNumberOfColumns) As Int";
Debug.ShouldStop(2048);
table._cheadertextcolors = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_cheadertextcolors",table._cheadertextcolors);
 BA.debugLineNum = 3533;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
Debug.ShouldStop(4096);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step25 > 0 && _i.<Integer>get().intValue() <= limit25) || (step25 < 0 && _i.<Integer>get().intValue() >= limit25) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3534;BA.debugLine="cHeaderTextColors(i) = cHeaderTextColor";
Debug.ShouldStop(8192);
__ref.getField(false,"_cheadertextcolors" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_cheadertextcolor" /*RemoteObject*/ ),_i);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 3537;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _col,RemoteObject _row,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetValue (table) ","table",20,__ref.getField(false, "ba"),__ref,1615);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "table","setvalue", __ref, _col, _row, _value);}
RemoteObject _values = null;
RemoteObject _lbls = null;
Debug.locals.put("Col", _col);
Debug.locals.put("Row", _row);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1615;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1616;BA.debugLine="Dim values() As String";
Debug.ShouldStop(32768);
_values = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 1617;BA.debugLine="values = Data.Get(Row)";
Debug.ShouldStop(65536);
_values = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("values", _values);
 BA.debugLineNum = 1618;BA.debugLine="values(Col) = Value";
Debug.ShouldStop(131072);
_values.setArrayElement (_value,_col);
 BA.debugLineNum = 1619;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
Debug.ShouldStop(262144);
if (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_row))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1620;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(524288);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1621;BA.debugLine="lbls = visibleRows.Get(Row)";
Debug.ShouldStop(1048576);
_lbls = (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_row))));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1622;BA.debugLine="lbls(Col).Text = Value";
Debug.ShouldStop(2097152);
_lbls.getArrayElement(false,_col).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 };
 BA.debugLineNum = 1624;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _visible) throws Exception{
try {
		Debug.PushSubsStack("setVisible (table) ","table",20,__ref.getField(false, "ba"),__ref,2306);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "table","setvisible", __ref, _visible);}
Debug.locals.put("Visible", _visible);
 BA.debugLineNum = 2306;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 2307;BA.debugLine="pnlTable.Visible = Visible";
Debug.ShouldStop(4);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setVisible",_visible);
 BA.debugLineNum = 2308;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setWidth (table) ","table",20,__ref.getField(false, "ba"),__ref,2257);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "table","setwidth", __ref, _width);}
Debug.locals.put("Width", _width);
 BA.debugLineNum = 2257;BA.debugLine="Public Sub setWidth(Width As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2258;BA.debugLine="cWidth = Width";
Debug.ShouldStop(131072);
__ref.setField ("_cwidth" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 2259;BA.debugLine="pnlTable.Width = Width";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnltable" /*RemoteObject*/ ).runMethod(true,"setWidth",_width);
 BA.debugLineNum = 2260;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2261;BA.debugLine="SV2.Width = Width";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setWidth",_width);
 }else {
 BA.debugLineNum = 2263;BA.debugLine="SV2.Width = Width - SVF.Width";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1));
 };
 BA.debugLineNum = 2266;BA.debugLine="updateIPLocation";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.ef.table.class, "_updateiplocation" /*RemoteObject*/ );
 BA.debugLineNum = 2267;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzeroselection(RemoteObject __ref,RemoteObject _zeroselection) throws Exception{
try {
		Debug.PushSubsStack("setZeroSelection (table) ","table",20,__ref.getField(false, "ba"),__ref,4063);
if (RapidSub.canDelegate("setzeroselection")) { return __ref.runUserSub(false, "table","setzeroselection", __ref, _zeroselection);}
Debug.locals.put("ZeroSelection", _zeroselection);
 BA.debugLineNum = 4063;BA.debugLine="Public Sub setZeroSelection(ZeroSelection As Boole";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 4064;BA.debugLine="mZeroSelection = ZeroSelection";
Debug.ShouldStop(-2147483648);
__ref.setField ("_mzeroselection" /*RemoteObject*/ ,_zeroselection);
 BA.debugLineNum = 4065;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showheadersorting(RemoteObject __ref,RemoteObject _col,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("showHeaderSorting (table) ","table",20,__ref.getField(false, "ba"),__ref,2375);
if (RapidSub.canDelegate("showheadersorting")) { return __ref.runUserSub(false, "table","showheadersorting", __ref, _col, _dir);}
RemoteObject _l = RemoteObject.createImmutable(0);
RemoteObject _t = RemoteObject.createImmutable(0);
RemoteObject _view = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _parentview = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 2375;BA.debugLine="Public Sub showHeaderSorting(col As Int, dir As In";
Debug.ShouldStop(64);
 BA.debugLineNum = 2378;BA.debugLine="Dim L As Int ' calculate left";
Debug.ShouldStop(512);
_l = RemoteObject.createImmutable(0);Debug.locals.put("L", _l);
 BA.debugLineNum = 2379;BA.debugLine="Dim t As Int ' calculate top";
Debug.ShouldStop(1024);
_t = RemoteObject.createImmutable(0);Debug.locals.put("t", _t);
 BA.debugLineNum = 2380;BA.debugLine="Dim View As View";
Debug.ShouldStop(2048);
_view = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("View", _view);
 BA.debugLineNum = 2381;BA.debugLine="Dim ParentView As Panel";
Debug.ShouldStop(4096);
_parentview = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("ParentView", _parentview);
 BA.debugLineNum = 2383;BA.debugLine="pnlSortingView.RemoveView";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnlsortingview" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 2385;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2386;BA.debugLine="If col < mNumberOfFixedColumns Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("<",_col,BA.numberCast(double.class, __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 2387;BA.debugLine="View = HeaderFirst.GetView(col)";
Debug.ShouldStop(262144);
_view = __ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col));Debug.locals.put("View", _view);
 BA.debugLineNum = 2388;BA.debugLine="ParentView = HeaderFirst";
Debug.ShouldStop(524288);
_parentview = __ref.getField(false,"_headerfirst" /*RemoteObject*/ );Debug.locals.put("ParentView", _parentview);
 }else {
 BA.debugLineNum = 2390;BA.debugLine="View = Header.GetView(col - mNumberOfFixedColum";
Debug.ShouldStop(2097152);
_view = __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1)));Debug.locals.put("View", _view);
 BA.debugLineNum = 2391;BA.debugLine="ParentView = Header";
Debug.ShouldStop(4194304);
_parentview = __ref.getField(false,"_header" /*RemoteObject*/ );Debug.locals.put("ParentView", _parentview);
 };
 }else {
 BA.debugLineNum = 2394;BA.debugLine="View = Header.GetView(col)";
Debug.ShouldStop(33554432);
_view = __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_col));Debug.locals.put("View", _view);
 BA.debugLineNum = 2395;BA.debugLine="ParentView = Header";
Debug.ShouldStop(67108864);
_parentview = __ref.getField(false,"_header" /*RemoteObject*/ );Debug.locals.put("ParentView", _parentview);
 };
 BA.debugLineNum = 2398;BA.debugLine="L = View.Left + View.Width - cSortBitmapWidth - 2";
Debug.ShouldStop(536870912);
_l = RemoteObject.solve(new RemoteObject[] {_view.runMethod(true,"getLeft"),_view.runMethod(true,"getWidth"),__ref.getField(true,"_csortbitmapwidth" /*RemoteObject*/ ),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+--",3, 1);Debug.locals.put("L", _l);
 BA.debugLineNum = 2400;BA.debugLine="If (dir = 0) Then Return ' remove the view only";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",_dir,BA.numberCast(double.class, 0)))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2402;BA.debugLine="Select Case dir";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(_dir,BA.numberCast(int.class, -(double) (0 + 1)),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 2404;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpDes)";
Debug.ShouldStop(8);
__ref.getField(false,"_pnlsortingview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_bmpdes" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 2405;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
Debug.ShouldStop(16);
_t = RemoteObject.solve(new RemoteObject[] {_view.runMethod(true,"getTop"),_view.runMethod(true,"getHeight"),__ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+--",3, 1);Debug.locals.put("t", _t);
 break; }
case 1: {
 BA.debugLineNum = 2407;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpAsc)";
Debug.ShouldStop(64);
__ref.getField(false,"_pnlsortingview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_bmpasc" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 2408;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
Debug.ShouldStop(128);
_t = RemoteObject.solve(new RemoteObject[] {_view.runMethod(true,"getTop"),_view.runMethod(true,"getHeight"),__ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+--",3, 1);Debug.locals.put("t", _t);
 break; }
case 2: {
 BA.debugLineNum = 2410;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpEqual)";
Debug.ShouldStop(512);
__ref.getField(false,"_pnlsortingview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_bmpequal" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 2411;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
Debug.ShouldStop(1024);
_t = RemoteObject.solve(new RemoteObject[] {_view.runMethod(true,"getTop"),_view.runMethod(true,"getHeight"),__ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ ),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+--",3, 1);Debug.locals.put("t", _t);
 break; }
}
;
 BA.debugLineNum = 2414;BA.debugLine="ParentView.AddView(pnlSortingView, L, t, cSortBit";
Debug.ShouldStop(8192);
_parentview.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlsortingview" /*RemoteObject*/ ).getObject())),(Object)(_l),(Object)(_t),(Object)(__ref.getField(true,"_csortbitmapwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_csortbitmapheight" /*RemoteObject*/ )));
 BA.debugLineNum = 2416;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _showrow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("ShowRow (table) ","table",20,__ref.getField(false, "ba"),__ref,1302);
if (RapidSub.canDelegate("showrow")) { __ref.runUserSub(false, "table","showrow", __ref, _row); return;}
ResumableSub_ShowRow rsub = new ResumableSub_ShowRow(null,__ref,_row);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ShowRow extends BA.ResumableSub {
public ResumableSub_ShowRow(b4a.example.ef.table parent,RemoteObject __ref,RemoteObject _row) {
this.parent = parent;
this.__ref = __ref;
this._row = _row;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.table parent;
RemoteObject _row;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbls = null;
RemoteObject _values = null;
RemoteObject _rowcolor = null;
RemoteObject _txtcolor = RemoteObject.createImmutable(0);
RemoteObject _i_1 = RemoteObject.createImmutable(0);
int step29;
int limit29;
int step53;
int limit53;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowRow (table) ","table",20,__ref.getField(false, "ba"),__ref,1302);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1303;BA.debugLine="Private i As Int";
Debug.ShouldStop(4194304);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1305;BA.debugLine="If visibleRows.ContainsKey(Row) Then Return";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_row))).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1308;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(134217728);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1309;BA.debugLine="Dim values() As String";
Debug.ShouldStop(268435456);
_values = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 1310;BA.debugLine="lbls = GetLabels(Row)";
Debug.ShouldStop(536870912);
_lbls = __ref.runClassMethod (b4a.example.ef.table.class, "_getlabels" /*RemoteObject*/ ,(Object)(_row));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 1311;BA.debugLine="values = Data.Get(Row)";
Debug.ShouldStop(1073741824);
_values = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("values", _values);
 BA.debugLineNum = 1312;BA.debugLine="visibleRows.Put(Row, lbls)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_row)),(Object)((_lbls)));
 BA.debugLineNum = 1313;BA.debugLine="Dim rowColor() As Object";
Debug.ShouldStop(1);
_rowcolor = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});Debug.locals.put("rowColor", _rowcolor);
 BA.debugLineNum = 1314;BA.debugLine="Private txtColor As Int";
Debug.ShouldStop(2);
_txtcolor = RemoteObject.createImmutable(0);Debug.locals.put("txtColor", _txtcolor);
 BA.debugLineNum = 1315;BA.debugLine="If (SelectedRows.indexof(Row) <> -1 )Then";
Debug.ShouldStop(4);
if (true) break;

case 7:
//if
this.state = 22;
if ((RemoteObject.solveBoolean("!",__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_row))),BA.numberCast(double.class, -(double) (0 + 1))))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 1318;BA.debugLine="Else If lstRowColorIndexes.Get(Row) > 1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row))),BA.numberCast(double.class, 1))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 1322;BA.debugLine="Else If cUseColumnColors = True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cusecolumncolors" /*RemoteObject*/ ),parent.__c.getField(true,"True"))) { 
this.state = 13;
}else {
this.state = 15;
}}}
if (true) break;

case 9:
//C
this.state = 22;
 BA.debugLineNum = 1316;BA.debugLine="rowColor = SelectedDrawable";
Debug.ShouldStop(8);
_rowcolor = __ref.getField(false,"_selecteddrawable" /*RemoteObject*/ );Debug.locals.put("rowColor", _rowcolor);
 BA.debugLineNum = 1317;BA.debugLine="txtColor = cSelectedRowTextColor";
Debug.ShouldStop(16);
_txtcolor = __ref.getField(true,"_cselectedrowtextcolor" /*RemoteObject*/ );Debug.locals.put("txtColor", _txtcolor);
 if (true) break;

case 11:
//C
this.state = 22;
 BA.debugLineNum = 1319;BA.debugLine="rowColor = lstRowDrawables.Get(lstRowColorIndexe";
Debug.ShouldStop(64);
_rowcolor = (__ref.getField(false,"_lstrowdrawables" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row))),RemoteObject.createImmutable(2)}, "-",1, 0)))));Debug.locals.put("rowColor", _rowcolor);
 BA.debugLineNum = 1321;BA.debugLine="txtColor = GetContrastColor(lstRowColors.Get(lst";
Debug.ShouldStop(256);
_txtcolor = __ref.runClassMethod (b4a.example.ef.table.class, "_getcontrastcolor" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_lstrowcolors" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lstrowcolorindexes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row))),RemoteObject.createImmutable(2)}, "-",1, 0)))))));Debug.locals.put("txtColor", _txtcolor);
 if (true) break;

case 13:
//C
this.state = 22;
 BA.debugLineNum = 1323;BA.debugLine="rowColor = ColumnDrawables";
Debug.ShouldStop(1024);
_rowcolor = __ref.getField(false,"_columndrawables" /*RemoteObject*/ );Debug.locals.put("rowColor", _rowcolor);
 BA.debugLineNum = 1324;BA.debugLine="txtColor = cTextColor";
Debug.ShouldStop(2048);
_txtcolor = __ref.getField(true,"_ctextcolor" /*RemoteObject*/ );Debug.locals.put("txtColor", _txtcolor);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1326;BA.debugLine="If Row Mod 2 = 0 Then";
Debug.ShouldStop(8192);
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 1327;BA.debugLine="rowColor = Drawable1";
Debug.ShouldStop(16384);
_rowcolor = __ref.getField(false,"_drawable1" /*RemoteObject*/ );Debug.locals.put("rowColor", _rowcolor);
 BA.debugLineNum = 1328;BA.debugLine="txtColor = cTextColor";
Debug.ShouldStop(32768);
_txtcolor = __ref.getField(true,"_ctextcolor" /*RemoteObject*/ );Debug.locals.put("txtColor", _txtcolor);
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1330;BA.debugLine="rowColor = Drawable2";
Debug.ShouldStop(131072);
_rowcolor = __ref.getField(false,"_drawable2" /*RemoteObject*/ );Debug.locals.put("rowColor", _rowcolor);
 BA.debugLineNum = 1331;BA.debugLine="txtColor = cTextColor";
Debug.ShouldStop(262144);
_txtcolor = __ref.getField(true,"_ctextcolor" /*RemoteObject*/ );Debug.locals.put("txtColor", _txtcolor);
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;
;
 BA.debugLineNum = 1334;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
Debug.ShouldStop(2097152);

case 22:
//if
this.state = 100;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 24;
}else {
this.state = 51;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1335;BA.debugLine="For i = 0 To lbls.Length - 1";
Debug.ShouldStop(4194304);
if (true) break;

case 25:
//for
this.state = 49;
step29 = 1;
limit29 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
Debug.locals.put("i", _i);
this.state = 111;
if (true) break;

case 111:
//C
this.state = 49;
if ((step29 > 0 && _i.<Integer>get().intValue() <= limit29) || (step29 < 0 && _i.<Integer>get().intValue() >= limit29)) this.state = 27;
if (true) break;

case 112:
//C
this.state = 111;
_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step29)) ;
Debug.locals.put("i", _i);
if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 1336;BA.debugLine="If (Header.GetView(I).Width > 1 ) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 28:
//if
this.state = 48;
if ((RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).runMethod(true,"getWidth"),BA.numberCast(double.class, 1)))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1337;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(I).L";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_lbls.getArrayElement(false,_i).getObject())),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {_row,__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1)),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_crowheight" /*RemoteObject*/ ),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "-",1, 1)));
 BA.debugLineNum = 1338;BA.debugLine="lbls(i).Text = values(i)";
Debug.ShouldStop(33554432);
_lbls.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(_values.getArrayElement(true,_i)));
 BA.debugLineNum = 1339;BA.debugLine="lbls(i).TextColor = txtColor";
Debug.ShouldStop(67108864);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",_txtcolor);
 BA.debugLineNum = 1340;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
Debug.ShouldStop(134217728);
if (true) break;

case 31:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, __ref.getField(true,"_selectedcol" /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_row))),BA.numberCast(double.class, -(double) (0 + 1))))))) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 42;
 BA.debugLineNum = 1341;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
Debug.ShouldStop(268435456);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",__ref.getField(true,"_cselectedcelltextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1342;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
Debug.ShouldStop(536870912);
_lbls.getArrayElement(false,_i).runMethod(false,"setBackground",(__ref.getField(false,"_selectedcelldrawable" /*RemoteObject*/ )));
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1344;BA.debugLine="If MultiTextColors = False Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 36:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitextcolors" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 38;
}else {
this.state = 40;
}if (true) break;

case 38:
//C
this.state = 41;
 BA.debugLineNum = 1345;BA.debugLine="lbls(i).TextColor = txtColor";
Debug.ShouldStop(1);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",_txtcolor);
 if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 1347;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
Debug.ShouldStop(4);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getArrayElement(true,_i));
 if (true) break;

case 41:
//C
this.state = 42;
;
 BA.debugLineNum = 1349;BA.debugLine="lbls(i).Background = rowColor(i)";
Debug.ShouldStop(16);
_lbls.getArrayElement(false,_i).runMethod(false,"setBackground",(_rowcolor.getArrayElement(false,_i)));
 if (true) break;
;
 BA.debugLineNum = 1351;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(64);

case 42:
//if
this.state = 47;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multialignments" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 44;
}else {
this.state = 46;
}if (true) break;

case 44:
//C
this.state = 47;
 BA.debugLineNum = 1352;BA.debugLine="lbls(i).Gravity = cAlignment";
Debug.ShouldStop(128);
_lbls.getArrayElement(false,_i).runMethod(true,"setGravity",__ref.getField(true,"_calignment" /*RemoteObject*/ ));
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1354;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
Debug.ShouldStop(512);
_lbls.getArrayElement(false,_i).runMethod(true,"setGravity",__ref.getField(false,"_calignments" /*RemoteObject*/ ).getArrayElement(true,_i));
 if (true) break;

case 47:
//C
this.state = 48;
;
 if (true) break;

case 48:
//C
this.state = 112;
;
 if (true) break;
if (true) break;

case 49:
//C
this.state = 100;
Debug.locals.put("i", _i);
;
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1359;BA.debugLine="For i = 0 To lbls.Length - 1";
Debug.ShouldStop(16384);
if (true) break;

case 52:
//for
this.state = 99;
step53 = 1;
limit53 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
Debug.locals.put("i", _i);
this.state = 113;
if (true) break;

case 113:
//C
this.state = 99;
if ((step53 > 0 && _i.<Integer>get().intValue() <= limit53) || (step53 < 0 && _i.<Integer>get().intValue() >= limit53)) this.state = 54;
if (true) break;

case 114:
//C
this.state = 113;
_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step53)) ;
Debug.locals.put("i", _i);
if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 1360;BA.debugLine="If i < mNumberOfFixedColumns Then";
Debug.ShouldStop(32768);
if (true) break;

case 55:
//if
this.state = 98;
if (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, __ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )))) { 
this.state = 57;
}else {
this.state = 76;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 1361;BA.debugLine="SVF.Panel.AddView(lbls(i), HeaderFirst.GetView";
Debug.ShouldStop(65536);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_lbls.getArrayElement(false,_i).getObject())),(Object)(__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {_row,__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1)),(Object)(__ref.getField(false,"_headerfirst" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i)).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_crowheight" /*RemoteObject*/ ),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "-",1, 1)));
 BA.debugLineNum = 1362;BA.debugLine="lbls(i).Text = values(i)";
Debug.ShouldStop(131072);
_lbls.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(_values.getArrayElement(true,_i)));
 BA.debugLineNum = 1363;BA.debugLine="lbls(i).TextColor = txtColor";
Debug.ShouldStop(262144);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",_txtcolor);
 BA.debugLineNum = 1364;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
Debug.ShouldStop(524288);
if (true) break;

case 58:
//if
this.state = 69;
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, __ref.getField(true,"_selectedcol" /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_row))),BA.numberCast(double.class, -(double) (0 + 1))))))) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 69;
 BA.debugLineNum = 1365;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
Debug.ShouldStop(1048576);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",__ref.getField(true,"_cselectedcelltextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1366;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
Debug.ShouldStop(2097152);
_lbls.getArrayElement(false,_i).runMethod(false,"setBackground",(__ref.getField(false,"_selectedcelldrawable" /*RemoteObject*/ )));
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 1368;BA.debugLine="If MultiTextColors = False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 63:
//if
this.state = 68;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitextcolors" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 65;
}else {
this.state = 67;
}if (true) break;

case 65:
//C
this.state = 68;
 BA.debugLineNum = 1369;BA.debugLine="lbls(i).TextColor = txtColor";
Debug.ShouldStop(16777216);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",_txtcolor);
 if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 1371;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
Debug.ShouldStop(67108864);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getArrayElement(true,_i));
 if (true) break;

case 68:
//C
this.state = 69;
;
 BA.debugLineNum = 1373;BA.debugLine="lbls(i).Background = rowColor(i)";
Debug.ShouldStop(268435456);
_lbls.getArrayElement(false,_i).runMethod(false,"setBackground",(_rowcolor.getArrayElement(false,_i)));
 if (true) break;
;
 BA.debugLineNum = 1375;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(1073741824);

case 69:
//if
this.state = 74;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multialignments" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 71;
}else {
this.state = 73;
}if (true) break;

case 71:
//C
this.state = 74;
 BA.debugLineNum = 1376;BA.debugLine="lbls(i).Gravity = cAlignment";
Debug.ShouldStop(-2147483648);
_lbls.getArrayElement(false,_i).runMethod(true,"setGravity",__ref.getField(true,"_calignment" /*RemoteObject*/ ));
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 1378;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
Debug.ShouldStop(2);
_lbls.getArrayElement(false,_i).runMethod(true,"setGravity",__ref.getField(false,"_calignments" /*RemoteObject*/ ).getArrayElement(true,_i));
 if (true) break;

case 74:
//C
this.state = 98;
;
 if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 1381;BA.debugLine="Private i_1 As Int";
Debug.ShouldStop(16);
_i_1 = RemoteObject.createImmutable(0);Debug.locals.put("i_1", _i_1);
 BA.debugLineNum = 1382;BA.debugLine="i_1 = i - mNumberOfFixedColumns";
Debug.ShouldStop(32);
_i_1 = RemoteObject.solve(new RemoteObject[] {_i,__ref.getField(true,"_mnumberoffixedcolumns" /*RemoteObject*/ )}, "-",1, 1);Debug.locals.put("i_1", _i_1);
 BA.debugLineNum = 1383;BA.debugLine="If (Header.GetView(i_1).Width > 1 ) Then";
Debug.ShouldStop(64);
if (true) break;

case 77:
//if
this.state = 97;
if ((RemoteObject.solveBoolean(">",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i_1)).runMethod(true,"getWidth"),BA.numberCast(double.class, 1)))) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 1384;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(i_1";
Debug.ShouldStop(128);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_lbls.getArrayElement(false,_i).getObject())),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i_1)).runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {_row,__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1)),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_i_1)).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_crowheight" /*RemoteObject*/ ),__ref.getField(true,"_clinewidth" /*RemoteObject*/ )}, "-",1, 1)));
 BA.debugLineNum = 1385;BA.debugLine="lbls(i).Text = values(i)";
Debug.ShouldStop(256);
_lbls.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(_values.getArrayElement(true,_i)));
 BA.debugLineNum = 1386;BA.debugLine="lbls(i).TextColor = txtColor";
Debug.ShouldStop(512);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",_txtcolor);
 BA.debugLineNum = 1387;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(";
Debug.ShouldStop(1024);
if (true) break;

case 80:
//if
this.state = 91;
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, __ref.getField(true,"_selectedcol" /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_row))),BA.numberCast(double.class, -(double) (0 + 1))))))) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 91;
 BA.debugLineNum = 1388;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
Debug.ShouldStop(2048);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",__ref.getField(true,"_cselectedcelltextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1389;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
Debug.ShouldStop(4096);
_lbls.getArrayElement(false,_i).runMethod(false,"setBackground",(__ref.getField(false,"_selectedcelldrawable" /*RemoteObject*/ )));
 if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 1391;BA.debugLine="If MultiTextColors = False Then";
Debug.ShouldStop(16384);
if (true) break;

case 85:
//if
this.state = 90;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multitextcolors" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 87;
}else {
this.state = 89;
}if (true) break;

case 87:
//C
this.state = 90;
 BA.debugLineNum = 1392;BA.debugLine="lbls(i).TextColor = txtColor";
Debug.ShouldStop(32768);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",_txtcolor);
 if (true) break;

case 89:
//C
this.state = 90;
 BA.debugLineNum = 1394;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
Debug.ShouldStop(131072);
_lbls.getArrayElement(false,_i).runMethod(true,"setTextColor",__ref.getField(false,"_ctextcolors" /*RemoteObject*/ ).getArrayElement(true,_i));
 if (true) break;

case 90:
//C
this.state = 91;
;
 BA.debugLineNum = 1396;BA.debugLine="lbls(i).Background = rowColor(i)";
Debug.ShouldStop(524288);
_lbls.getArrayElement(false,_i).runMethod(false,"setBackground",(_rowcolor.getArrayElement(false,_i)));
 if (true) break;
;
 BA.debugLineNum = 1398;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(2097152);

case 91:
//if
this.state = 96;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multialignments" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 93;
}else {
this.state = 95;
}if (true) break;

case 93:
//C
this.state = 96;
 BA.debugLineNum = 1399;BA.debugLine="lbls(i).Gravity = cAlignment";
Debug.ShouldStop(4194304);
_lbls.getArrayElement(false,_i).runMethod(true,"setGravity",__ref.getField(true,"_calignment" /*RemoteObject*/ ));
 if (true) break;

case 95:
//C
this.state = 96;
 BA.debugLineNum = 1401;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
Debug.ShouldStop(16777216);
_lbls.getArrayElement(false,_i).runMethod(true,"setGravity",__ref.getField(false,"_calignments" /*RemoteObject*/ ).getArrayElement(true,_i));
 if (true) break;

case 96:
//C
this.state = 97;
;
 if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;

case 98:
//C
this.state = 114;
;
 if (true) break;
if (true) break;

case 99:
//C
this.state = 100;
Debug.locals.put("i", _i);
;
 if (true) break;

case 100:
//C
this.state = 101;
;
 BA.debugLineNum = 1409;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(1);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 1410;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
Debug.ShouldStop(2);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"));
 BA.debugLineNum = 1411;BA.debugLine="updateIPLocation";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.ef.table.class, "_updateiplocation" /*RemoteObject*/ );
 BA.debugLineNum = 1412;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
Debug.ShouldStop(8);
if (true) break;

case 101:
//if
this.state = 106;
if ((RemoteObject.solveBoolean(".",__ref.getField(false,"_lblstatusline" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_enablestatuslineautofill" /*RemoteObject*/ ),parent.__c.getField(true,"True")))) { 
this.state = 103;
;}if (true) break;

case 103:
//C
this.state = 106;
__ref.runClassMethod (b4a.example.ef.table.class, "_setstatusline" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));
if (true) break;

case 106:
//C
this.state = 107;
;
 BA.debugLineNum = 1414;BA.debugLine="If SubExists(cCallBack, cEventName & \"_ShowRow\")";
Debug.ShouldStop(32);
if (true) break;

case 107:
//if
this.state = 110;
if (parent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ShowRow")))).<Boolean>get().booleanValue()) { 
this.state = 109;
}if (true) break;

case 109:
//C
this.state = 110;
 BA.debugLineNum = 1415;BA.debugLine="Sleep(0)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "table", "showrow"),BA.numberCast(int.class, 0));
this.state = 115;
return;
case 115:
//C
this.state = 110;
;
 BA.debugLineNum = 1416;BA.debugLine="CallSub3(cCallBack, cEventName & \"_ShowRow\", Row";
Debug.ShouldStop(128);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ccallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ceventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ShowRow"))),(Object)((_row)),(Object)((_lbls)));
 if (true) break;

case 110:
//C
this.state = -1;
;
 BA.debugLineNum = 1418;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static RemoteObject  _snapshot(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SnapShot (table) ","table",20,__ref.getField(false, "ba"),__ref,4276);
if (RapidSub.canDelegate("snapshot")) { return __ref.runUserSub(false, "table","snapshot", __ref);}
RemoteObject _bmpsnapshot = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _xpnltable = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 4276;BA.debugLine="Public Sub SnapShot As Bitmap";
Debug.ShouldStop(524288);
 BA.debugLineNum = 4277;BA.debugLine="Private bmpSnapshot As Bitmap";
Debug.ShouldStop(1048576);
_bmpsnapshot = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmpSnapshot", _bmpsnapshot);
 BA.debugLineNum = 4278;BA.debugLine="Private xpnlTable As B4XView";
Debug.ShouldStop(2097152);
_xpnltable = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("xpnlTable", _xpnltable);
 BA.debugLineNum = 4280;BA.debugLine="xpnlTable = pnlTable";
Debug.ShouldStop(8388608);
_xpnltable = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_pnltable" /*RemoteObject*/ ).getObject());Debug.locals.put("xpnlTable", _xpnltable);
 BA.debugLineNum = 4281;BA.debugLine="bmpSnapshot = xpnlTable.Snapshot";
Debug.ShouldStop(16777216);
_bmpsnapshot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _xpnltable.runMethod(false,"Snapshot").getObject());Debug.locals.put("bmpSnapshot", _bmpsnapshot);
 BA.debugLineNum = 4283;BA.debugLine="Return bmpSnapshot";
Debug.ShouldStop(67108864);
if (true) return _bmpsnapshot;
 BA.debugLineNum = 4284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sortomdoubleidx(RemoteObject __ref,RemoteObject _arrdouble,RemoteObject _bascending,RemoteObject _istart,RemoteObject _iend) throws Exception{
try {
		Debug.PushSubsStack("SortOMDoubleIDX (table) ","table",20,__ref.getField(false, "ba"),__ref,4614);
if (RapidSub.canDelegate("sortomdoubleidx")) { return __ref.runUserSub(false, "table","sortomdoubleidx", __ref, _arrdouble, _bascending, _istart, _iend);}
RemoteObject _i = RemoteObject.createImmutable(0L);
RemoteObject _c = RemoteObject.createImmutable(0L);
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _b4xom = RemoteObject.declareNull("b4a.example.ef.b4xorderedmap");
RemoteObject _arrindex2 = null;
RemoteObject _lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _arrindex = null;
RemoteObject _ovalue = RemoteObject.declareNull("Object");
Debug.locals.put("arrDouble", _arrdouble);
Debug.locals.put("bAscending", _bascending);
Debug.locals.put("iStart", _istart);
Debug.locals.put("iEnd", _iend);
 BA.debugLineNum = 4614;BA.debugLine="Sub SortOMDoubleIDX(arrDouble() As Double, bAscend";
Debug.ShouldStop(32);
 BA.debugLineNum = 4616;BA.debugLine="Dim i As Long";
Debug.ShouldStop(128);
_i = RemoteObject.createImmutable(0L);Debug.locals.put("i", _i);
 BA.debugLineNum = 4617;BA.debugLine="Dim c As Long";
Debug.ShouldStop(256);
_c = RemoteObject.createImmutable(0L);Debug.locals.put("c", _c);
 BA.debugLineNum = 4618;BA.debugLine="Dim n As Long";
Debug.ShouldStop(512);
_n = RemoteObject.createImmutable(0L);Debug.locals.put("n", _n);
 BA.debugLineNum = 4619;BA.debugLine="Dim B4XOM As B4XOrderedMap";
Debug.ShouldStop(1024);
_b4xom = RemoteObject.createNew ("b4a.example.ef.b4xorderedmap");Debug.locals.put("B4XOM", _b4xom);
 BA.debugLineNum = 4621;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
Debug.ShouldStop(4096);
if (__ref.runClassMethod (b4a.example.ef.table.class, "_check1ddoubleallsame" /*RemoteObject*/ ,(Object)(_arrdouble),(Object)(_istart),(Object)(_iend)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4622;BA.debugLine="Dim arrIndex2(1) As Int";
Debug.ShouldStop(8192);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4623;BA.debugLine="arrIndex2(0) = -1";
Debug.ShouldStop(16384);
_arrindex2.setArrayElement (BA.numberCast(int.class, -(double) (0 + 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 4624;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(32768);
if (true) return _arrindex2;
 };
 BA.debugLineNum = 4627;BA.debugLine="B4XOM.Initialize";
Debug.ShouldStop(262144);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 4629;BA.debugLine="If iStart = -1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_istart,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4630;BA.debugLine="iStart = 0";
Debug.ShouldStop(2097152);
_istart = BA.numberCast(int.class, 0);Debug.locals.put("iStart", _istart);
 };
 BA.debugLineNum = 4633;BA.debugLine="If iEnd = -1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_iend,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4634;BA.debugLine="iEnd = arrDouble.Length - 1";
Debug.ShouldStop(33554432);
_iend = RemoteObject.solve(new RemoteObject[] {_arrdouble.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iEnd", _iend);
 };
 BA.debugLineNum = 4637;BA.debugLine="For i = iStart To iEnd";
Debug.ShouldStop(268435456);
{
final long step17 = 1;
final long limit17 = (long) (0 + _iend.<Integer>get().intValue());
_i = BA.numberCast(long.class, _istart) ;
for (;(step17 > 0 && _i.<Long>get().longValue() <= limit17) || (step17 < 0 && _i.<Long>get().longValue() >= limit17) ;_i = RemoteObject.createImmutable((long)(0 + _i.<Long>get().longValue() + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4638;BA.debugLine="Dim lstIndexes As List";
Debug.ShouldStop(536870912);
_lstindexes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4639;BA.debugLine="If B4XOM.ContainsKey(arrDouble(i)) Then";
Debug.ShouldStop(1073741824);
if (_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_arrdouble.getArrayElement(true,BA.numberCast(int.class, _i))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4640;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(i))";
Debug.ShouldStop(-2147483648);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_arrdouble.getArrayElement(true,BA.numberCast(int.class, _i))))));Debug.locals.put("lstIndexes", _lstindexes);
 }else {
 BA.debugLineNum = 4642;BA.debugLine="lstIndexes.Initialize";
Debug.ShouldStop(2);
_lstindexes.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 4644;BA.debugLine="lstIndexes.Add(i)";
Debug.ShouldStop(8);
_lstindexes.runVoidMethod ("Add",(Object)((_i)));
 BA.debugLineNum = 4645;BA.debugLine="B4XOM.Put(arrDouble(i), lstIndexes)";
Debug.ShouldStop(16);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_arrdouble.getArrayElement(true,BA.numberCast(int.class, _i)))),(Object)((_lstindexes.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4648;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
Debug.ShouldStop(128);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(_bascending));
 BA.debugLineNum = 4650;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
Debug.ShouldStop(512);
_arrindex = RemoteObject.createNewArray ("int", new int[] {RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iend,_istart}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arrIndex", _arrindex);
 BA.debugLineNum = 4652;BA.debugLine="For Each oValue As Object In B4XOM.Values";
Debug.ShouldStop(2048);
{
final RemoteObject group29 = _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.runMethod(false,"Get",index29);Debug.locals.put("oValue", _ovalue);
Debug.locals.put("oValue", _ovalue);
 BA.debugLineNum = 4653;BA.debugLine="lstIndexes = oValue";
Debug.ShouldStop(4096);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _ovalue);Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4654;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
Debug.ShouldStop(8192);
{
final long step31 = 1;
final long limit31 = (long) (0 + RemoteObject.solve(new RemoteObject[] {_lstindexes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue());
_c = BA.numberCast(long.class, 0) ;
for (;(step31 > 0 && _c.<Long>get().longValue() <= limit31) || (step31 < 0 && _c.<Long>get().longValue() >= limit31) ;_c = RemoteObject.createImmutable((long)(0 + _c.<Long>get().longValue() + step31))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 4655;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
Debug.ShouldStop(16384);
_arrindex.setArrayElement (BA.numberCast(int.class, _lstindexes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _c)))),BA.numberCast(int.class, _n));
 BA.debugLineNum = 4656;BA.debugLine="n = n + 1";
Debug.ShouldStop(32768);
_n = RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(1)}, "+",1, 2);Debug.locals.put("n", _n);
 }
}Debug.locals.put("c", _c);
;
 }
}Debug.locals.put("oValue", _ovalue);
;
 BA.debugLineNum = 4660;BA.debugLine="Return arrIndex";
Debug.ShouldStop(524288);
if (true) return _arrindex;
 BA.debugLineNum = 4662;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sortomdoubleidx2(RemoteObject __ref,RemoteObject _arrdouble,RemoteObject _arrindex,RemoteObject _bascending,RemoteObject _istart,RemoteObject _iend) throws Exception{
try {
		Debug.PushSubsStack("SortOMDoubleIDX2 (table) ","table",20,__ref.getField(false, "ba"),__ref,4664);
if (RapidSub.canDelegate("sortomdoubleidx2")) { return __ref.runUserSub(false, "table","sortomdoubleidx2", __ref, _arrdouble, _arrindex, _bascending, _istart, _iend);}
RemoteObject _i = RemoteObject.createImmutable(0L);
RemoteObject _c = RemoteObject.createImmutable(0L);
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _b4xom = RemoteObject.declareNull("b4a.example.ef.b4xorderedmap");
RemoteObject _arrindex2 = null;
RemoteObject _lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ovalue = RemoteObject.declareNull("Object");
Debug.locals.put("arrDouble", _arrdouble);
Debug.locals.put("arrIndex", _arrindex);
Debug.locals.put("bAscending", _bascending);
Debug.locals.put("iStart", _istart);
Debug.locals.put("iEnd", _iend);
 BA.debugLineNum = 4664;BA.debugLine="Sub SortOMDoubleIDX2(arrDouble() As Double, arrInd";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 4666;BA.debugLine="Dim i As Long";
Debug.ShouldStop(33554432);
_i = RemoteObject.createImmutable(0L);Debug.locals.put("i", _i);
 BA.debugLineNum = 4667;BA.debugLine="Dim c As Long";
Debug.ShouldStop(67108864);
_c = RemoteObject.createImmutable(0L);Debug.locals.put("c", _c);
 BA.debugLineNum = 4668;BA.debugLine="Dim n As Long";
Debug.ShouldStop(134217728);
_n = RemoteObject.createImmutable(0L);Debug.locals.put("n", _n);
 BA.debugLineNum = 4669;BA.debugLine="Dim B4XOM As B4XOrderedMap";
Debug.ShouldStop(268435456);
_b4xom = RemoteObject.createNew ("b4a.example.ef.b4xorderedmap");Debug.locals.put("B4XOM", _b4xom);
 BA.debugLineNum = 4671;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
Debug.ShouldStop(1073741824);
if (__ref.runClassMethod (b4a.example.ef.table.class, "_check1ddoubleallsame" /*RemoteObject*/ ,(Object)(_arrdouble),(Object)(_istart),(Object)(_iend)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4672;BA.debugLine="Dim arrIndex2(1) As Int";
Debug.ShouldStop(-2147483648);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4673;BA.debugLine="arrIndex2(0) = -1";
Debug.ShouldStop(1);
_arrindex2.setArrayElement (BA.numberCast(int.class, -(double) (0 + 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 4674;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(2);
if (true) return _arrindex2;
 };
 BA.debugLineNum = 4677;BA.debugLine="B4XOM.Initialize";
Debug.ShouldStop(16);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 4679;BA.debugLine="If iStart = -1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_istart,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4680;BA.debugLine="iStart = 0";
Debug.ShouldStop(128);
_istart = BA.numberCast(int.class, 0);Debug.locals.put("iStart", _istart);
 };
 BA.debugLineNum = 4683;BA.debugLine="If iEnd = -1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_iend,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4684;BA.debugLine="iEnd = arrDouble.Length - 1";
Debug.ShouldStop(2048);
_iend = RemoteObject.solve(new RemoteObject[] {_arrdouble.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iEnd", _iend);
 };
 BA.debugLineNum = 4687;BA.debugLine="For i = iStart To iEnd";
Debug.ShouldStop(16384);
{
final long step17 = 1;
final long limit17 = (long) (0 + _iend.<Integer>get().intValue());
_i = BA.numberCast(long.class, _istart) ;
for (;(step17 > 0 && _i.<Long>get().longValue() <= limit17) || (step17 < 0 && _i.<Long>get().longValue() >= limit17) ;_i = RemoteObject.createImmutable((long)(0 + _i.<Long>get().longValue() + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4688;BA.debugLine="Dim lstIndexes As List";
Debug.ShouldStop(32768);
_lstindexes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4689;BA.debugLine="If B4XOM.ContainsKey(arrDouble(arrIndex(i))) The";
Debug.ShouldStop(65536);
if (_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_arrdouble.getArrayElement(true,_arrindex.getArrayElement(true,BA.numberCast(int.class, _i)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4690;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(arrIndex(i)))";
Debug.ShouldStop(131072);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_arrdouble.getArrayElement(true,_arrindex.getArrayElement(true,BA.numberCast(int.class, _i)))))));Debug.locals.put("lstIndexes", _lstindexes);
 }else {
 BA.debugLineNum = 4692;BA.debugLine="lstIndexes.Initialize";
Debug.ShouldStop(524288);
_lstindexes.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 4694;BA.debugLine="lstIndexes.Add(arrIndex(i))";
Debug.ShouldStop(2097152);
_lstindexes.runVoidMethod ("Add",(Object)((_arrindex.getArrayElement(true,BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 4695;BA.debugLine="B4XOM.Put(arrDouble(arrIndex(i)), lstIndexes)";
Debug.ShouldStop(4194304);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_arrdouble.getArrayElement(true,_arrindex.getArrayElement(true,BA.numberCast(int.class, _i))))),(Object)((_lstindexes.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4698;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
Debug.ShouldStop(33554432);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(_bascending));
 BA.debugLineNum = 4700;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
Debug.ShouldStop(134217728);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iend,_istart}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4702;BA.debugLine="For Each oValue As Object In B4XOM.Values";
Debug.ShouldStop(536870912);
{
final RemoteObject group29 = _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.runMethod(false,"Get",index29);Debug.locals.put("oValue", _ovalue);
Debug.locals.put("oValue", _ovalue);
 BA.debugLineNum = 4703;BA.debugLine="lstIndexes = oValue";
Debug.ShouldStop(1073741824);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _ovalue);Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4704;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
Debug.ShouldStop(-2147483648);
{
final long step31 = 1;
final long limit31 = (long) (0 + RemoteObject.solve(new RemoteObject[] {_lstindexes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue());
_c = BA.numberCast(long.class, 0) ;
for (;(step31 > 0 && _c.<Long>get().longValue() <= limit31) || (step31 < 0 && _c.<Long>get().longValue() >= limit31) ;_c = RemoteObject.createImmutable((long)(0 + _c.<Long>get().longValue() + step31))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 4705;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
Debug.ShouldStop(1);
_arrindex2.setArrayElement (BA.numberCast(int.class, _lstindexes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _c)))),BA.numberCast(int.class, _n));
 BA.debugLineNum = 4706;BA.debugLine="n = n + 1";
Debug.ShouldStop(2);
_n = RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(1)}, "+",1, 2);Debug.locals.put("n", _n);
 }
}Debug.locals.put("c", _c);
;
 }
}Debug.locals.put("oValue", _ovalue);
;
 BA.debugLineNum = 4710;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(32);
if (true) return _arrindex2;
 BA.debugLineNum = 4712;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sortomlongidx(RemoteObject __ref,RemoteObject _arrlong,RemoteObject _bascending,RemoteObject _istart,RemoteObject _iend) throws Exception{
try {
		Debug.PushSubsStack("SortOMLongIDX (table) ","table",20,__ref.getField(false, "ba"),__ref,4456);
if (RapidSub.canDelegate("sortomlongidx")) { return __ref.runUserSub(false, "table","sortomlongidx", __ref, _arrlong, _bascending, _istart, _iend);}
RemoteObject _i = RemoteObject.createImmutable(0L);
RemoteObject _c = RemoteObject.createImmutable(0L);
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _b4xom = RemoteObject.declareNull("b4a.example.ef.b4xorderedmap");
RemoteObject _arrindex2 = null;
RemoteObject _lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _arrindex = null;
RemoteObject _ovalue = RemoteObject.declareNull("Object");
Debug.locals.put("arrLong", _arrlong);
Debug.locals.put("bAscending", _bascending);
Debug.locals.put("iStart", _istart);
Debug.locals.put("iEnd", _iend);
 BA.debugLineNum = 4456;BA.debugLine="Sub SortOMLongIDX(arrLong() As Long, bAscending As";
Debug.ShouldStop(128);
 BA.debugLineNum = 4458;BA.debugLine="Dim i As Long";
Debug.ShouldStop(512);
_i = RemoteObject.createImmutable(0L);Debug.locals.put("i", _i);
 BA.debugLineNum = 4459;BA.debugLine="Dim c As Long";
Debug.ShouldStop(1024);
_c = RemoteObject.createImmutable(0L);Debug.locals.put("c", _c);
 BA.debugLineNum = 4460;BA.debugLine="Dim n As Long";
Debug.ShouldStop(2048);
_n = RemoteObject.createImmutable(0L);Debug.locals.put("n", _n);
 BA.debugLineNum = 4461;BA.debugLine="Dim B4XOM As B4XOrderedMap";
Debug.ShouldStop(4096);
_b4xom = RemoteObject.createNew ("b4a.example.ef.b4xorderedmap");Debug.locals.put("B4XOM", _b4xom);
 BA.debugLineNum = 4463;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
Debug.ShouldStop(16384);
if (__ref.runClassMethod (b4a.example.ef.table.class, "_check1dlongallsame" /*RemoteObject*/ ,(Object)(_arrlong),(Object)(_istart),(Object)(_iend)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4464;BA.debugLine="Dim arrIndex2(1) As Int";
Debug.ShouldStop(32768);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4465;BA.debugLine="arrIndex2(0) = -1";
Debug.ShouldStop(65536);
_arrindex2.setArrayElement (BA.numberCast(int.class, -(double) (0 + 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 4466;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(131072);
if (true) return _arrindex2;
 };
 BA.debugLineNum = 4469;BA.debugLine="B4XOM.Initialize";
Debug.ShouldStop(1048576);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 4471;BA.debugLine="If iStart = -1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_istart,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4472;BA.debugLine="iStart = 0";
Debug.ShouldStop(8388608);
_istart = BA.numberCast(int.class, 0);Debug.locals.put("iStart", _istart);
 };
 BA.debugLineNum = 4475;BA.debugLine="If iEnd = -1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_iend,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4476;BA.debugLine="iEnd = arrLong.Length - 1";
Debug.ShouldStop(134217728);
_iend = RemoteObject.solve(new RemoteObject[] {_arrlong.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iEnd", _iend);
 };
 BA.debugLineNum = 4479;BA.debugLine="For i = iStart To iEnd";
Debug.ShouldStop(1073741824);
{
final long step17 = 1;
final long limit17 = (long) (0 + _iend.<Integer>get().intValue());
_i = BA.numberCast(long.class, _istart) ;
for (;(step17 > 0 && _i.<Long>get().longValue() <= limit17) || (step17 < 0 && _i.<Long>get().longValue() >= limit17) ;_i = RemoteObject.createImmutable((long)(0 + _i.<Long>get().longValue() + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4480;BA.debugLine="Dim lstIndexes As List";
Debug.ShouldStop(-2147483648);
_lstindexes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4481;BA.debugLine="If B4XOM.ContainsKey(arrLong(i)) Then";
Debug.ShouldStop(1);
if (_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_arrlong.getArrayElement(true,BA.numberCast(int.class, _i))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4482;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(i))";
Debug.ShouldStop(2);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_arrlong.getArrayElement(true,BA.numberCast(int.class, _i))))));Debug.locals.put("lstIndexes", _lstindexes);
 }else {
 BA.debugLineNum = 4484;BA.debugLine="lstIndexes.Initialize";
Debug.ShouldStop(8);
_lstindexes.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 4486;BA.debugLine="lstIndexes.Add(i)";
Debug.ShouldStop(32);
_lstindexes.runVoidMethod ("Add",(Object)((_i)));
 BA.debugLineNum = 4487;BA.debugLine="B4XOM.Put(arrLong(i), lstIndexes)";
Debug.ShouldStop(64);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_arrlong.getArrayElement(true,BA.numberCast(int.class, _i)))),(Object)((_lstindexes.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4490;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
Debug.ShouldStop(512);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(_bascending));
 BA.debugLineNum = 4492;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
Debug.ShouldStop(2048);
_arrindex = RemoteObject.createNewArray ("int", new int[] {RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iend,_istart}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arrIndex", _arrindex);
 BA.debugLineNum = 4494;BA.debugLine="For Each oValue As Object In B4XOM.Values";
Debug.ShouldStop(8192);
{
final RemoteObject group29 = _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.runMethod(false,"Get",index29);Debug.locals.put("oValue", _ovalue);
Debug.locals.put("oValue", _ovalue);
 BA.debugLineNum = 4495;BA.debugLine="lstIndexes = oValue";
Debug.ShouldStop(16384);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _ovalue);Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4496;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
Debug.ShouldStop(32768);
{
final long step31 = 1;
final long limit31 = (long) (0 + RemoteObject.solve(new RemoteObject[] {_lstindexes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue());
_c = BA.numberCast(long.class, 0) ;
for (;(step31 > 0 && _c.<Long>get().longValue() <= limit31) || (step31 < 0 && _c.<Long>get().longValue() >= limit31) ;_c = RemoteObject.createImmutable((long)(0 + _c.<Long>get().longValue() + step31))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 4497;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
Debug.ShouldStop(65536);
_arrindex.setArrayElement (BA.numberCast(int.class, _lstindexes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _c)))),BA.numberCast(int.class, _n));
 BA.debugLineNum = 4498;BA.debugLine="n = n + 1";
Debug.ShouldStop(131072);
_n = RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(1)}, "+",1, 2);Debug.locals.put("n", _n);
 }
}Debug.locals.put("c", _c);
;
 }
}Debug.locals.put("oValue", _ovalue);
;
 BA.debugLineNum = 4502;BA.debugLine="Return arrIndex";
Debug.ShouldStop(2097152);
if (true) return _arrindex;
 BA.debugLineNum = 4504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sortomlongidx2(RemoteObject __ref,RemoteObject _arrlong,RemoteObject _arrindex,RemoteObject _bascending,RemoteObject _istart,RemoteObject _iend) throws Exception{
try {
		Debug.PushSubsStack("SortOMLongIDX2 (table) ","table",20,__ref.getField(false, "ba"),__ref,4535);
if (RapidSub.canDelegate("sortomlongidx2")) { return __ref.runUserSub(false, "table","sortomlongidx2", __ref, _arrlong, _arrindex, _bascending, _istart, _iend);}
RemoteObject _i = RemoteObject.createImmutable(0L);
RemoteObject _c = RemoteObject.createImmutable(0L);
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _b4xom = RemoteObject.declareNull("b4a.example.ef.b4xorderedmap");
RemoteObject _arrindex2 = null;
RemoteObject _lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ovalue = RemoteObject.declareNull("Object");
Debug.locals.put("arrLong", _arrlong);
Debug.locals.put("arrIndex", _arrindex);
Debug.locals.put("bAscending", _bascending);
Debug.locals.put("iStart", _istart);
Debug.locals.put("iEnd", _iend);
 BA.debugLineNum = 4535;BA.debugLine="Sub SortOMLongIDX2(arrLong() As Long, arrIndex() A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 4537;BA.debugLine="Dim i As Long";
Debug.ShouldStop(16777216);
_i = RemoteObject.createImmutable(0L);Debug.locals.put("i", _i);
 BA.debugLineNum = 4538;BA.debugLine="Dim c As Long";
Debug.ShouldStop(33554432);
_c = RemoteObject.createImmutable(0L);Debug.locals.put("c", _c);
 BA.debugLineNum = 4539;BA.debugLine="Dim n As Long";
Debug.ShouldStop(67108864);
_n = RemoteObject.createImmutable(0L);Debug.locals.put("n", _n);
 BA.debugLineNum = 4540;BA.debugLine="Dim B4XOM As B4XOrderedMap";
Debug.ShouldStop(134217728);
_b4xom = RemoteObject.createNew ("b4a.example.ef.b4xorderedmap");Debug.locals.put("B4XOM", _b4xom);
 BA.debugLineNum = 4542;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
Debug.ShouldStop(536870912);
if (__ref.runClassMethod (b4a.example.ef.table.class, "_check1dlongallsame" /*RemoteObject*/ ,(Object)(_arrlong),(Object)(_istart),(Object)(_iend)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4543;BA.debugLine="Dim arrIndex2(1) As Int";
Debug.ShouldStop(1073741824);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4544;BA.debugLine="arrIndex2(0) = -1";
Debug.ShouldStop(-2147483648);
_arrindex2.setArrayElement (BA.numberCast(int.class, -(double) (0 + 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 4545;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(1);
if (true) return _arrindex2;
 };
 BA.debugLineNum = 4548;BA.debugLine="B4XOM.Initialize";
Debug.ShouldStop(8);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 4550;BA.debugLine="If iStart = -1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_istart,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4551;BA.debugLine="iStart = 0";
Debug.ShouldStop(64);
_istart = BA.numberCast(int.class, 0);Debug.locals.put("iStart", _istart);
 };
 BA.debugLineNum = 4554;BA.debugLine="If iEnd = -1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_iend,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4555;BA.debugLine="iEnd = arrLong.Length - 1";
Debug.ShouldStop(1024);
_iend = RemoteObject.solve(new RemoteObject[] {_arrlong.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iEnd", _iend);
 };
 BA.debugLineNum = 4558;BA.debugLine="For i = iStart To iEnd";
Debug.ShouldStop(8192);
{
final long step17 = 1;
final long limit17 = (long) (0 + _iend.<Integer>get().intValue());
_i = BA.numberCast(long.class, _istart) ;
for (;(step17 > 0 && _i.<Long>get().longValue() <= limit17) || (step17 < 0 && _i.<Long>get().longValue() >= limit17) ;_i = RemoteObject.createImmutable((long)(0 + _i.<Long>get().longValue() + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4559;BA.debugLine="Dim lstIndexes As List";
Debug.ShouldStop(16384);
_lstindexes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4560;BA.debugLine="If B4XOM.ContainsKey(arrLong(arrIndex(i))) Then";
Debug.ShouldStop(32768);
if (_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_arrlong.getArrayElement(true,_arrindex.getArrayElement(true,BA.numberCast(int.class, _i)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4561;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(arrIndex(i)))";
Debug.ShouldStop(65536);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_arrlong.getArrayElement(true,_arrindex.getArrayElement(true,BA.numberCast(int.class, _i)))))));Debug.locals.put("lstIndexes", _lstindexes);
 }else {
 BA.debugLineNum = 4563;BA.debugLine="lstIndexes.Initialize";
Debug.ShouldStop(262144);
_lstindexes.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 4565;BA.debugLine="lstIndexes.Add(arrIndex(i))";
Debug.ShouldStop(1048576);
_lstindexes.runVoidMethod ("Add",(Object)((_arrindex.getArrayElement(true,BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 4566;BA.debugLine="B4XOM.Put(arrLong(arrIndex(i)), lstIndexes)";
Debug.ShouldStop(2097152);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_arrlong.getArrayElement(true,_arrindex.getArrayElement(true,BA.numberCast(int.class, _i))))),(Object)((_lstindexes.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4569;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
Debug.ShouldStop(16777216);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(_bascending));
 BA.debugLineNum = 4571;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
Debug.ShouldStop(67108864);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iend,_istart}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4573;BA.debugLine="For Each oValue As Object In B4XOM.Values";
Debug.ShouldStop(268435456);
{
final RemoteObject group29 = _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.runMethod(false,"Get",index29);Debug.locals.put("oValue", _ovalue);
Debug.locals.put("oValue", _ovalue);
 BA.debugLineNum = 4574;BA.debugLine="lstIndexes = oValue";
Debug.ShouldStop(536870912);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _ovalue);Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4575;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
Debug.ShouldStop(1073741824);
{
final long step31 = 1;
final long limit31 = (long) (0 + RemoteObject.solve(new RemoteObject[] {_lstindexes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue());
_c = BA.numberCast(long.class, 0) ;
for (;(step31 > 0 && _c.<Long>get().longValue() <= limit31) || (step31 < 0 && _c.<Long>get().longValue() >= limit31) ;_c = RemoteObject.createImmutable((long)(0 + _c.<Long>get().longValue() + step31))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 4576;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
Debug.ShouldStop(-2147483648);
_arrindex2.setArrayElement (BA.numberCast(int.class, _lstindexes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _c)))),BA.numberCast(int.class, _n));
 BA.debugLineNum = 4577;BA.debugLine="n = n + 1";
Debug.ShouldStop(1);
_n = RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(1)}, "+",1, 2);Debug.locals.put("n", _n);
 }
}Debug.locals.put("c", _c);
;
 }
}Debug.locals.put("oValue", _ovalue);
;
 BA.debugLineNum = 4581;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(16);
if (true) return _arrindex2;
 BA.debugLineNum = 4583;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sortomstringidx(RemoteObject __ref,RemoteObject _arrstring,RemoteObject _bascending,RemoteObject _bcaseinsensitive,RemoteObject _istart,RemoteObject _iend) throws Exception{
try {
		Debug.PushSubsStack("SortOMStringIDX (table) ","table",20,__ref.getField(false, "ba"),__ref,4714);
if (RapidSub.canDelegate("sortomstringidx")) { return __ref.runUserSub(false, "table","sortomstringidx", __ref, _arrstring, _bascending, _bcaseinsensitive, _istart, _iend);}
RemoteObject _i = RemoteObject.createImmutable(0L);
RemoteObject _c = RemoteObject.createImmutable(0L);
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _b4xom = RemoteObject.declareNull("b4a.example.ef.b4xorderedmap");
RemoteObject _arrindex2 = null;
RemoteObject _lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _arrindex = null;
RemoteObject _ovalue = RemoteObject.declareNull("Object");
Debug.locals.put("arrString", _arrstring);
Debug.locals.put("bAscending", _bascending);
Debug.locals.put("bCaseInsensitive", _bcaseinsensitive);
Debug.locals.put("iStart", _istart);
Debug.locals.put("iEnd", _iend);
 BA.debugLineNum = 4714;BA.debugLine="Sub SortOMStringIDX(arrString() As String, bAscend";
Debug.ShouldStop(512);
 BA.debugLineNum = 4716;BA.debugLine="Dim i As Long";
Debug.ShouldStop(2048);
_i = RemoteObject.createImmutable(0L);Debug.locals.put("i", _i);
 BA.debugLineNum = 4717;BA.debugLine="Dim c As Long";
Debug.ShouldStop(4096);
_c = RemoteObject.createImmutable(0L);Debug.locals.put("c", _c);
 BA.debugLineNum = 4718;BA.debugLine="Dim n As Long";
Debug.ShouldStop(8192);
_n = RemoteObject.createImmutable(0L);Debug.locals.put("n", _n);
 BA.debugLineNum = 4719;BA.debugLine="Dim B4XOM As B4XOrderedMap";
Debug.ShouldStop(16384);
_b4xom = RemoteObject.createNew ("b4a.example.ef.b4xorderedmap");Debug.locals.put("B4XOM", _b4xom);
 BA.debugLineNum = 4721;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
Debug.ShouldStop(65536);
if (__ref.runClassMethod (b4a.example.ef.table.class, "_check1dstringallsame" /*RemoteObject*/ ,(Object)(_arrstring),(Object)(_bcaseinsensitive),(Object)(_istart),(Object)(_iend)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4722;BA.debugLine="Dim arrIndex2(1) As Int";
Debug.ShouldStop(131072);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4723;BA.debugLine="arrIndex2(0) = -1";
Debug.ShouldStop(262144);
_arrindex2.setArrayElement (BA.numberCast(int.class, -(double) (0 + 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 4724;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(524288);
if (true) return _arrindex2;
 };
 BA.debugLineNum = 4727;BA.debugLine="B4XOM.Initialize";
Debug.ShouldStop(4194304);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 4729;BA.debugLine="If iStart = -1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_istart,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4730;BA.debugLine="iStart = 0";
Debug.ShouldStop(33554432);
_istart = BA.numberCast(int.class, 0);Debug.locals.put("iStart", _istart);
 };
 BA.debugLineNum = 4733;BA.debugLine="If iEnd = -1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_iend,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4734;BA.debugLine="iEnd = arrString.Length - 1";
Debug.ShouldStop(536870912);
_iend = RemoteObject.solve(new RemoteObject[] {_arrstring.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iEnd", _iend);
 };
 BA.debugLineNum = 4737;BA.debugLine="For i = iStart To iEnd";
Debug.ShouldStop(1);
{
final long step17 = 1;
final long limit17 = (long) (0 + _iend.<Integer>get().intValue());
_i = BA.numberCast(long.class, _istart) ;
for (;(step17 > 0 && _i.<Long>get().longValue() <= limit17) || (step17 < 0 && _i.<Long>get().longValue() >= limit17) ;_i = RemoteObject.createImmutable((long)(0 + _i.<Long>get().longValue() + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4738;BA.debugLine="Dim lstIndexes As List";
Debug.ShouldStop(2);
_lstindexes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4739;BA.debugLine="If B4XOM.ContainsKey(arrString(i)) Then";
Debug.ShouldStop(4);
if (_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_arrstring.getArrayElement(true,BA.numberCast(int.class, _i))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4740;BA.debugLine="lstIndexes = B4XOM.Get(arrString(i))";
Debug.ShouldStop(8);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_arrstring.getArrayElement(true,BA.numberCast(int.class, _i))))));Debug.locals.put("lstIndexes", _lstindexes);
 }else {
 BA.debugLineNum = 4742;BA.debugLine="lstIndexes.Initialize";
Debug.ShouldStop(32);
_lstindexes.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 4744;BA.debugLine="lstIndexes.Add(i)";
Debug.ShouldStop(128);
_lstindexes.runVoidMethod ("Add",(Object)((_i)));
 BA.debugLineNum = 4745;BA.debugLine="B4XOM.Put(arrString(i), lstIndexes)";
Debug.ShouldStop(256);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_arrstring.getArrayElement(true,BA.numberCast(int.class, _i)))),(Object)((_lstindexes.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4748;BA.debugLine="If bCaseInsensitive Then";
Debug.ShouldStop(2048);
if (_bcaseinsensitive.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4749;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
Debug.ShouldStop(4096);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runVoidMethod ("SortCaseInsensitive",(Object)(_bascending));
 }else {
 BA.debugLineNum = 4751;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
Debug.ShouldStop(16384);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(_bascending));
 };
 BA.debugLineNum = 4754;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
Debug.ShouldStop(131072);
_arrindex = RemoteObject.createNewArray ("int", new int[] {RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iend,_istart}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arrIndex", _arrindex);
 BA.debugLineNum = 4756;BA.debugLine="For Each oValue As Object In B4XOM.Values";
Debug.ShouldStop(524288);
{
final RemoteObject group33 = _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen33 = group33.runMethod(true,"getSize").<Integer>get()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.runMethod(false,"Get",index33);Debug.locals.put("oValue", _ovalue);
Debug.locals.put("oValue", _ovalue);
 BA.debugLineNum = 4757;BA.debugLine="lstIndexes = oValue";
Debug.ShouldStop(1048576);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _ovalue);Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4758;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
Debug.ShouldStop(2097152);
{
final long step35 = 1;
final long limit35 = (long) (0 + RemoteObject.solve(new RemoteObject[] {_lstindexes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue());
_c = BA.numberCast(long.class, 0) ;
for (;(step35 > 0 && _c.<Long>get().longValue() <= limit35) || (step35 < 0 && _c.<Long>get().longValue() >= limit35) ;_c = RemoteObject.createImmutable((long)(0 + _c.<Long>get().longValue() + step35))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 4759;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
Debug.ShouldStop(4194304);
_arrindex.setArrayElement (BA.numberCast(int.class, _lstindexes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _c)))),BA.numberCast(int.class, _n));
 BA.debugLineNum = 4760;BA.debugLine="n = n + 1";
Debug.ShouldStop(8388608);
_n = RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(1)}, "+",1, 2);Debug.locals.put("n", _n);
 }
}Debug.locals.put("c", _c);
;
 }
}Debug.locals.put("oValue", _ovalue);
;
 BA.debugLineNum = 4764;BA.debugLine="Return arrIndex";
Debug.ShouldStop(134217728);
if (true) return _arrindex;
 BA.debugLineNum = 4766;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sortomstringidx2(RemoteObject __ref,RemoteObject _arrstring,RemoteObject _arrindex,RemoteObject _bascending,RemoteObject _bcaseinsensitive,RemoteObject _istart,RemoteObject _iend) throws Exception{
try {
		Debug.PushSubsStack("SortOMStringIDX2 (table) ","table",20,__ref.getField(false, "ba"),__ref,4805);
if (RapidSub.canDelegate("sortomstringidx2")) { return __ref.runUserSub(false, "table","sortomstringidx2", __ref, _arrstring, _arrindex, _bascending, _bcaseinsensitive, _istart, _iend);}
RemoteObject _i = RemoteObject.createImmutable(0L);
RemoteObject _c = RemoteObject.createImmutable(0L);
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _b4xom = RemoteObject.declareNull("b4a.example.ef.b4xorderedmap");
RemoteObject _arrindex2 = null;
RemoteObject _lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ovalue = RemoteObject.declareNull("Object");
Debug.locals.put("arrString", _arrstring);
Debug.locals.put("arrIndex", _arrindex);
Debug.locals.put("bAscending", _bascending);
Debug.locals.put("bCaseInsensitive", _bcaseinsensitive);
Debug.locals.put("iStart", _istart);
Debug.locals.put("iEnd", _iend);
 BA.debugLineNum = 4805;BA.debugLine="Sub SortOMStringIDX2(arrString() As String, arrInd";
Debug.ShouldStop(16);
 BA.debugLineNum = 4807;BA.debugLine="Dim i As Long";
Debug.ShouldStop(64);
_i = RemoteObject.createImmutable(0L);Debug.locals.put("i", _i);
 BA.debugLineNum = 4808;BA.debugLine="Dim c As Long";
Debug.ShouldStop(128);
_c = RemoteObject.createImmutable(0L);Debug.locals.put("c", _c);
 BA.debugLineNum = 4809;BA.debugLine="Dim n As Long";
Debug.ShouldStop(256);
_n = RemoteObject.createImmutable(0L);Debug.locals.put("n", _n);
 BA.debugLineNum = 4810;BA.debugLine="Dim B4XOM As B4XOrderedMap 'this needs the B4XCol";
Debug.ShouldStop(512);
_b4xom = RemoteObject.createNew ("b4a.example.ef.b4xorderedmap");Debug.locals.put("B4XOM", _b4xom);
 BA.debugLineNum = 4812;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
Debug.ShouldStop(2048);
if (__ref.runClassMethod (b4a.example.ef.table.class, "_check1dstringallsame" /*RemoteObject*/ ,(Object)(_arrstring),(Object)(_bcaseinsensitive),(Object)(_istart),(Object)(_iend)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4813;BA.debugLine="Dim arrIndex2(1) As Int";
Debug.ShouldStop(4096);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4814;BA.debugLine="arrIndex2(0) = -1";
Debug.ShouldStop(8192);
_arrindex2.setArrayElement (BA.numberCast(int.class, -(double) (0 + 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 4815;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(16384);
if (true) return _arrindex2;
 };
 BA.debugLineNum = 4818;BA.debugLine="B4XOM.Initialize";
Debug.ShouldStop(131072);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 4820;BA.debugLine="If iStart = -1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_istart,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4821;BA.debugLine="iStart = 0";
Debug.ShouldStop(1048576);
_istart = BA.numberCast(int.class, 0);Debug.locals.put("iStart", _istart);
 };
 BA.debugLineNum = 4824;BA.debugLine="If iEnd = -1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_iend,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4825;BA.debugLine="iEnd = arrString.Length - 1";
Debug.ShouldStop(16777216);
_iend = RemoteObject.solve(new RemoteObject[] {_arrstring.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iEnd", _iend);
 };
 BA.debugLineNum = 4828;BA.debugLine="For i = iStart To iEnd";
Debug.ShouldStop(134217728);
{
final long step17 = 1;
final long limit17 = (long) (0 + _iend.<Integer>get().intValue());
_i = BA.numberCast(long.class, _istart) ;
for (;(step17 > 0 && _i.<Long>get().longValue() <= limit17) || (step17 < 0 && _i.<Long>get().longValue() >= limit17) ;_i = RemoteObject.createImmutable((long)(0 + _i.<Long>get().longValue() + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4829;BA.debugLine="Dim lstIndexes As List";
Debug.ShouldStop(268435456);
_lstindexes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4830;BA.debugLine="If B4XOM.ContainsKey(arrString(arrIndex(i))) The";
Debug.ShouldStop(536870912);
if (_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_arrstring.getArrayElement(true,_arrindex.getArrayElement(true,BA.numberCast(int.class, _i)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4831;BA.debugLine="lstIndexes = B4XOM.Get(arrString(arrIndex(i)))";
Debug.ShouldStop(1073741824);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_arrstring.getArrayElement(true,_arrindex.getArrayElement(true,BA.numberCast(int.class, _i)))))));Debug.locals.put("lstIndexes", _lstindexes);
 }else {
 BA.debugLineNum = 4833;BA.debugLine="lstIndexes.Initialize";
Debug.ShouldStop(1);
_lstindexes.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 4835;BA.debugLine="lstIndexes.Add(arrIndex(i))";
Debug.ShouldStop(4);
_lstindexes.runVoidMethod ("Add",(Object)((_arrindex.getArrayElement(true,BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 4836;BA.debugLine="B4XOM.Put(arrString(arrIndex(i)), lstIndexes)";
Debug.ShouldStop(8);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_arrstring.getArrayElement(true,_arrindex.getArrayElement(true,BA.numberCast(int.class, _i))))),(Object)((_lstindexes.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4839;BA.debugLine="If bCaseInsensitive Then";
Debug.ShouldStop(64);
if (_bcaseinsensitive.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4840;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
Debug.ShouldStop(128);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runVoidMethod ("SortCaseInsensitive",(Object)(_bascending));
 }else {
 BA.debugLineNum = 4842;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
Debug.ShouldStop(512);
_b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(_bascending));
 };
 BA.debugLineNum = 4845;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
Debug.ShouldStop(4096);
_arrindex2 = RemoteObject.createNewArray ("int", new int[] {RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iend,_istart}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arrIndex2", _arrindex2);
 BA.debugLineNum = 4847;BA.debugLine="For Each oValue As Object In B4XOM.Values";
Debug.ShouldStop(16384);
{
final RemoteObject group33 = _b4xom.runClassMethod (b4a.example.ef.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen33 = group33.runMethod(true,"getSize").<Integer>get()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.runMethod(false,"Get",index33);Debug.locals.put("oValue", _ovalue);
Debug.locals.put("oValue", _ovalue);
 BA.debugLineNum = 4848;BA.debugLine="lstIndexes = oValue";
Debug.ShouldStop(32768);
_lstindexes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _ovalue);Debug.locals.put("lstIndexes", _lstindexes);
 BA.debugLineNum = 4849;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
Debug.ShouldStop(65536);
{
final long step35 = 1;
final long limit35 = (long) (0 + RemoteObject.solve(new RemoteObject[] {_lstindexes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue());
_c = BA.numberCast(long.class, 0) ;
for (;(step35 > 0 && _c.<Long>get().longValue() <= limit35) || (step35 < 0 && _c.<Long>get().longValue() >= limit35) ;_c = RemoteObject.createImmutable((long)(0 + _c.<Long>get().longValue() + step35))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 4850;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
Debug.ShouldStop(131072);
_arrindex2.setArrayElement (BA.numberCast(int.class, _lstindexes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _c)))),BA.numberCast(int.class, _n));
 BA.debugLineNum = 4851;BA.debugLine="n = n + 1";
Debug.ShouldStop(262144);
_n = RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(1)}, "+",1, 2);Debug.locals.put("n", _n);
 }
}Debug.locals.put("c", _c);
;
 }
}Debug.locals.put("oValue", _ovalue);
;
 BA.debugLineNum = 4855;BA.debugLine="Return arrIndex2";
Debug.ShouldStop(4194304);
if (true) return _arrindex2;
 BA.debugLineNum = 4857;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sorttable2(RemoteObject __ref,RemoteObject _col,RemoteObject _bascending) throws Exception{
try {
		Debug.PushSubsStack("SortTable2 (table) ","table",20,__ref.getField(false, "ba"),__ref,4289);
if (RapidSub.canDelegate("sorttable2")) { return __ref.runUserSub(false, "table","sorttable2", __ref, _col, _bascending);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _iub = RemoteObject.createImmutable(0);
RemoteObject _arrrow = null;
RemoteObject _bdomulticolumnsort = RemoteObject.createImmutable(false);
RemoteObject _bvalidarrsortindex = RemoteObject.createImmutable(false);
RemoteObject _bsorted = RemoteObject.createImmutable(false);
Debug.locals.put("Col", _col);
Debug.locals.put("bAscending", _bascending);
 BA.debugLineNum = 4289;BA.debugLine="Public Sub SortTable2(Col As Int, bAscending As Bo";
Debug.ShouldStop(1);
 BA.debugLineNum = 4291;BA.debugLine="Dim i As Int";
Debug.ShouldStop(4);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 4292;BA.debugLine="Dim iUB As Int";
Debug.ShouldStop(8);
_iub = RemoteObject.createImmutable(0);Debug.locals.put("iUB", _iub);
 BA.debugLineNum = 4293;BA.debugLine="Dim arrRow() As String";
Debug.ShouldStop(16);
_arrrow = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("arrRow", _arrrow);
 BA.debugLineNum = 4294;BA.debugLine="Dim bDoMultiColumnSort As Boolean";
Debug.ShouldStop(32);
_bdomulticolumnsort = RemoteObject.createImmutable(false);Debug.locals.put("bDoMultiColumnSort", _bdomulticolumnsort);
 BA.debugLineNum = 4295;BA.debugLine="Dim bValidArrSortIndex As Boolean";
Debug.ShouldStop(64);
_bvalidarrsortindex = RemoteObject.createImmutable(false);Debug.locals.put("bValidArrSortIndex", _bvalidarrsortindex);
 BA.debugLineNum = 4296;BA.debugLine="Dim bSorted As Boolean";
Debug.ShouldStop(128);
_bsorted = RemoteObject.createImmutable(false);Debug.locals.put("bSorted", _bsorted);
 BA.debugLineNum = 4298;BA.debugLine="If Col <> iPreviousSortColumn Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",_col,BA.numberCast(double.class, __ref.getField(true,"_iprevioussortcolumn" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 4299;BA.debugLine="iPreviousSortColumn = Col";
Debug.ShouldStop(1024);
__ref.setField ("_iprevioussortcolumn" /*RemoteObject*/ ,_col);
 BA.debugLineNum = 4300;BA.debugLine="arrDataSorted(Col) = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_arrdatasorted" /*RemoteObject*/ ).setArrayElement (table.__c.getField(true,"False"),_col);
 };
 BA.debugLineNum = 4303;BA.debugLine="iUB = Data.Size - 1";
Debug.ShouldStop(16384);
_iub = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iUB", _iub);
 BA.debugLineNum = 4310;BA.debugLine="If bDataTempDone = False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_bdatatempdone" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 4311;BA.debugLine="DataTemp.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_datatemp" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 4312;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(8388608);
{
final int step14 = 1;
final int limit14 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step14 > 0 && _i.<Integer>get().intValue() <= limit14) || (step14 < 0 && _i.<Integer>get().intValue() >= limit14) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4313;BA.debugLine="DataTemp.Add(Data.Get(i))";
Debug.ShouldStop(16777216);
__ref.getField(false,"_datatemp" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4315;BA.debugLine="bDataTempDone = True";
Debug.ShouldStop(67108864);
__ref.setField ("_bdatatempdone" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 };
 BA.debugLineNum = 4321;BA.debugLine="If arrDataSorted(Col) = False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_arrdatasorted" /*RemoteObject*/ ).getArrayElement(true,_col),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 4322;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
Debug.ShouldStop(2);
table.__c.runVoidMethod ("LogImpl","336110369",RemoteObject.concat(RemoteObject.createImmutable("SortTable2, cColumnDataType("),_col,RemoteObject.createImmutable("): "),__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).getArrayElement(true,_col)),0);
 BA.debugLineNum = 4323;BA.debugLine="Select Case cColumnDataType(Col)";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).getArrayElement(true,_col),BA.ObjectToString("I"),BA.ObjectToString("L"),BA.ObjectToString("R"),BA.ObjectToString("T"),BA.ObjectToString("N"),BA.ObjectToString("B"))) {
case 0: 
case 1: {
 BA.debugLineNum = 4325;BA.debugLine="Dim arrColLong(Data.Size) As Long";
Debug.ShouldStop(16);
table._arrcollong = RemoteObject.createNewArray ("long", new int[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});__ref.setField("_arrcollong",table._arrcollong);
 BA.debugLineNum = 4326;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(32);
{
final int step24 = 1;
final int limit24 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step24 > 0 && _i.<Integer>get().intValue() <= limit24) || (step24 < 0 && _i.<Integer>get().intValue() >= limit24) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4327;BA.debugLine="arrRow = DataTemp.Get(i)";
Debug.ShouldStop(64);
_arrrow = (__ref.getField(false,"_datatemp" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)));Debug.locals.put("arrRow", _arrrow);
 BA.debugLineNum = 4328;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 4329;BA.debugLine="arrColLong(i) = arrRow(Col)";
Debug.ShouldStop(256);
__ref.getField(false,"_arrcollong" /*RemoteObject*/ ).setArrayElement (BA.numberCast(long.class, _arrrow.getArrayElement(true,_col)),_i);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e29) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e29.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break; }
case 2: {
 BA.debugLineNum = 4335;BA.debugLine="Dim arrColDouble(Data.Size) As Double";
Debug.ShouldStop(16384);
table._arrcoldouble = RemoteObject.createNewArray ("double", new int[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});__ref.setField("_arrcoldouble",table._arrcoldouble);
 BA.debugLineNum = 4336;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(32768);
{
final int step33 = 1;
final int limit33 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step33 > 0 && _i.<Integer>get().intValue() <= limit33) || (step33 < 0 && _i.<Integer>get().intValue() >= limit33) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step33))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4337;BA.debugLine="arrRow = DataTemp.Get(i)";
Debug.ShouldStop(65536);
_arrrow = (__ref.getField(false,"_datatemp" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)));Debug.locals.put("arrRow", _arrrow);
 BA.debugLineNum = 4338;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 4339;BA.debugLine="arrColDouble(i) = arrRow(Col)";
Debug.ShouldStop(262144);
__ref.getField(false,"_arrcoldouble" /*RemoteObject*/ ).setArrayElement (BA.numberCast(double.class, _arrrow.getArrayElement(true,_col)),_i);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e38.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break; }
case 3: {
 BA.debugLineNum = 4345;BA.debugLine="Dim arrColString(Data.size) As String";
Debug.ShouldStop(16777216);
table._arrcolstring = RemoteObject.createNewArray ("String", new int[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});__ref.setField("_arrcolstring",table._arrcolstring);
 BA.debugLineNum = 4346;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(33554432);
{
final int step42 = 1;
final int limit42 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step42 > 0 && _i.<Integer>get().intValue() <= limit42) || (step42 < 0 && _i.<Integer>get().intValue() >= limit42) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step42))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4347;BA.debugLine="arrRow = DataTemp.Get(i)";
Debug.ShouldStop(67108864);
_arrrow = (__ref.getField(false,"_datatemp" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)));Debug.locals.put("arrRow", _arrrow);
 BA.debugLineNum = 4348;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 4349;BA.debugLine="arrColString(i) = arrRow(Col)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_arrcolstring" /*RemoteObject*/ ).setArrayElement (_arrrow.getArrayElement(true,_col),_i);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e47) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e47.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break; }
case 4: 
case 5: {
 break; }
}
;
 };
 BA.debugLineNum = 4361;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
Debug.ShouldStop(256);
_bvalidarrsortindex = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_arrsortindex" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",__ref.getField(false,"_arrsortindex" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 0)),BA.numberCast(double.class, -(double) (0 + 1))));Debug.locals.put("bValidArrSortIndex", _bvalidarrsortindex);
 BA.debugLineNum = 4362;BA.debugLine="bDoMultiColumnSort = mMultiColumnSort And bValidA";
Debug.ShouldStop(512);
_bdomulticolumnsort = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(true,"_mmulticolumnsort" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",_bvalidarrsortindex) && RemoteObject.solveBoolean(">",__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),BA.numberCast(double.class, 1)));Debug.locals.put("bDoMultiColumnSort", _bdomulticolumnsort);
 BA.debugLineNum = 4367;BA.debugLine="If arrDataSorted(Col) = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_arrdatasorted" /*RemoteObject*/ ).getArrayElement(true,_col),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 4368;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
Debug.ShouldStop(32768);
table.__c.runVoidMethod ("LogImpl","336110415",RemoteObject.concat(RemoteObject.createImmutable("SortTable2, cColumnDataType("),_col,RemoteObject.createImmutable("): "),__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).getArrayElement(true,_col)),0);
 BA.debugLineNum = 4369;BA.debugLine="Select Case cColumnDataType(Col)";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).getArrayElement(true,_col),BA.ObjectToString("I"),BA.ObjectToString("L"),BA.ObjectToString("R"),BA.ObjectToString("T"),BA.ObjectToString("N"),BA.ObjectToString("B"))) {
case 0: 
case 1: {
 BA.debugLineNum = 4372;BA.debugLine="If bDoMultiColumnSort Then";
Debug.ShouldStop(524288);
if (_bdomulticolumnsort.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4373;BA.debugLine="arrSortIndex = SortOMLongIDX2(arrColLong, arr";
Debug.ShouldStop(1048576);
__ref.setField ("_arrsortindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_sortomlongidx2" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_arrcollong" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_arrsortindex" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))));
 }else {
 BA.debugLineNum = 4375;BA.debugLine="arrSortIndex = SortOMLongIDX(arrColLong, True";
Debug.ShouldStop(4194304);
__ref.setField ("_arrsortindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_sortomlongidx" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_arrcollong" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))));
 };
 break; }
case 2: {
 BA.debugLineNum = 4379;BA.debugLine="If bDoMultiColumnSort Then";
Debug.ShouldStop(67108864);
if (_bdomulticolumnsort.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4380;BA.debugLine="arrSortIndex = SortOMDoubleIDX2(arrColDouble,";
Debug.ShouldStop(134217728);
__ref.setField ("_arrsortindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_sortomdoubleidx2" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_arrcoldouble" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_arrsortindex" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))));
 }else {
 BA.debugLineNum = 4382;BA.debugLine="arrSortIndex = SortOMDoubleIDX(arrColDouble,";
Debug.ShouldStop(536870912);
__ref.setField ("_arrsortindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_sortomdoubleidx" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_arrcoldouble" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))));
 };
 break; }
case 3: {
 BA.debugLineNum = 4386;BA.debugLine="If bDoMultiColumnSort Then";
Debug.ShouldStop(2);
if (_bdomulticolumnsort.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4387;BA.debugLine="arrSortIndex = SortOMStringIDX2(arrColString,";
Debug.ShouldStop(4);
__ref.setField ("_arrsortindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_sortomstringidx2" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_arrcolstring" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_arrsortindex" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(__ref.getField(true,"_msortcaseinsensitive" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))));
 }else {
 BA.debugLineNum = 4389;BA.debugLine="arrSortIndex = SortOMStringIDX(arrColString,";
Debug.ShouldStop(16);
__ref.setField ("_arrsortindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_sortomstringidx" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_arrcolstring" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"True")),(Object)(__ref.getField(true,"_msortcaseinsensitive" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))));
 };
 break; }
case 4: 
case 5: {
 BA.debugLineNum = 4393;BA.debugLine="Dim arrSortIndex(1) As Int";
Debug.ShouldStop(256);
table._arrsortindex = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});__ref.setField("_arrsortindex",table._arrsortindex);
 BA.debugLineNum = 4394;BA.debugLine="arrSortIndex(0) = -1";
Debug.ShouldStop(512);
__ref.getField(false,"_arrsortindex" /*RemoteObject*/ ).setArrayElement (BA.numberCast(int.class, -(double) (0 + 1)),BA.numberCast(int.class, 0));
 break; }
}
;
 BA.debugLineNum = 4397;BA.debugLine="arrDataSorted(Col) = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_arrdatasorted" /*RemoteObject*/ ).setArrayElement (table.__c.getField(true,"True"),_col);
 BA.debugLineNum = 4398;BA.debugLine="mapSortingIndexes.Put(Col, arrSortIndex)";
Debug.ShouldStop(8192);
__ref.getField(false,"_mapsortingindexes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_col)),(Object)((__ref.getField(false,"_arrsortindex" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 4400;BA.debugLine="arrSortIndex = mapSortingIndexes.Get(Col) 'retri";
Debug.ShouldStop(32768);
__ref.setField ("_arrsortindex" /*RemoteObject*/ ,(__ref.getField(false,"_mapsortingindexes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_col)))));
 };
 BA.debugLineNum = 4403;BA.debugLine="SelectedRows.Clear";
Debug.ShouldStop(262144);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 4411;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
Debug.ShouldStop(67108864);
_bvalidarrsortindex = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_arrsortindex" /*RemoteObject*/ ).getField(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",__ref.getField(false,"_arrsortindex" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 0)),BA.numberCast(double.class, -(double) (0 + 1))));Debug.locals.put("bValidArrSortIndex", _bvalidarrsortindex);
 BA.debugLineNum = 4413;BA.debugLine="If bAscending = False And bValidArrSortIndex Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_bascending,table.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",_bvalidarrsortindex)) { 
 BA.debugLineNum = 4414;BA.debugLine="Select Case cColumnDataType(Col)";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(__ref.getField(false,"_ccolumndatatype" /*RemoteObject*/ ).getArrayElement(true,_col),BA.ObjectToString("I"),BA.ObjectToString("L"),BA.ObjectToString("R"),BA.ObjectToString("T"))) {
case 0: 
case 1: {
 BA.debugLineNum = 4416;BA.debugLine="arrSortIndex = ReverseIndexLong(arrColLong, ar";
Debug.ShouldStop(-2147483648);
__ref.setField ("_arrsortindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_reverseindexlong" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_arrcollong" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_arrsortindex" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"False"))));
 break; }
case 2: {
 BA.debugLineNum = 4418;BA.debugLine="arrSortIndex = ReverseIndexDouble(arrColDouble";
Debug.ShouldStop(2);
__ref.setField ("_arrsortindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_reverseindexdouble" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_arrcoldouble" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_arrsortindex" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"False"))));
 break; }
case 3: {
 BA.debugLineNum = 4420;BA.debugLine="arrSortIndex = ReverseIndexString(arrColString";
Debug.ShouldStop(8);
__ref.setField ("_arrsortindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.table.class, "_reverseindexstring" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_arrcolstring" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_arrsortindex" /*RemoteObject*/ )),(Object)(table.__c.getField(true,"False"))));
 break; }
}
;
 };
 BA.debugLineNum = 4427;BA.debugLine="If arrSortIndex(0) > -1 Then 'so don't move rows";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_arrsortindex" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 0)),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 4428;BA.debugLine="For i = 0 To iUB";
Debug.ShouldStop(2048);
{
final int step97 = 1;
final int limit97 = _iub.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step97 > 0 && _i.<Integer>get().intValue() <= limit97) || (step97 < 0 && _i.<Integer>get().intValue() >= limit97) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step97))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4429;BA.debugLine="Data.Set(i, DataTemp.Get(arrSortIndex(i)))";
Debug.ShouldStop(4096);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(_i),(Object)(__ref.getField(false,"_datatemp" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(false,"_arrsortindex" /*RemoteObject*/ ).getArrayElement(true,_i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4431;BA.debugLine="RefreshTable";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.ef.table.class, "_refreshtable" /*RemoteObject*/ );
 BA.debugLineNum = 4432;BA.debugLine="bSorted = True";
Debug.ShouldStop(32768);
_bsorted = table.__c.getField(true,"True");Debug.locals.put("bSorted", _bsorted);
 };
 BA.debugLineNum = 4435;BA.debugLine="iPreviousSortColumn = Col";
Debug.ShouldStop(262144);
__ref.setField ("_iprevioussortcolumn" /*RemoteObject*/ ,_col);
 BA.debugLineNum = 4436;BA.debugLine="bPreviousSortAscending = bAscending 'not used for";
Debug.ShouldStop(524288);
__ref.setField ("_bprevioussortascending" /*RemoteObject*/ ,_bascending);
 BA.debugLineNum = 4438;BA.debugLine="Return bSorted";
Debug.ShouldStop(2097152);
if (true) return _bsorted;
 BA.debugLineNum = 4440;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sv2_scrollchanged(RemoteObject __ref,RemoteObject _posx,RemoteObject _posy) throws Exception{
try {
		Debug.PushSubsStack("SV2_ScrollChanged (table) ","table",20,__ref.getField(false, "ba"),__ref,1165);
if (RapidSub.canDelegate("sv2_scrollchanged")) { return __ref.runUserSub(false, "table","sv2_scrollchanged", __ref, _posx, _posy);}
Debug.locals.put("PosX", _posx);
Debug.locals.put("PosY", _posy);
 BA.debugLineNum = 1165;BA.debugLine="Private Sub SV2_ScrollChanged(PosX As Int, PosY As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1166;BA.debugLine="SV2Scrolls = True";
Debug.ShouldStop(8192);
__ref.setField ("_sv2scrolls" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 1167;BA.debugLine="If SVFScrolls = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_svfscrolls" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1168;BA.debugLine="SVF.ScrollToNow(PosY)";
Debug.ShouldStop(32768);
__ref.getField(false,"_svf" /*RemoteObject*/ ).runVoidMethod ("ScrollToNow",(Object)(_posy));
 BA.debugLineNum = 1169;BA.debugLine="Scroll(PosX, PosY)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.ef.table.class, "_scroll" /*RemoteObject*/ ,(Object)(_posx),(Object)(_posy));
 BA.debugLineNum = 1170;BA.debugLine="SV2PosX = PosX";
Debug.ShouldStop(131072);
__ref.setField ("_sv2posx" /*RemoteObject*/ ,_posx);
 };
 BA.debugLineNum = 1173;BA.debugLine="SV2Scrolls = False";
Debug.ShouldStop(1048576);
__ref.setField ("_sv2scrolls" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 BA.debugLineNum = 1174;BA.debugLine="If mFastScroll = True And Data.Size >= mFastScrol";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscroll" /*RemoteObject*/ ),table.__c.getField(true,"True")) && RemoteObject.solveBoolean("g",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_mfastscrollminitems" /*RemoteObject*/ ))) && RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1),BA.numberCast(double.class, __ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 1175;BA.debugLine="FScScale = FastScrollHeight / (SV2.Panel.Height";
Debug.ShouldStop(4194304);
__ref.setField ("_fscscale" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fastscrollheight" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"),__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1))}, "/",0, 0));
 BA.debugLineNum = 1176;BA.debugLine="pnlFastScroll.Visible = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlfastscroll" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"True"));
 BA.debugLineNum = 1177;BA.debugLine="If mFastScrollShowLabel = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mfastscrollshowlabel" /*RemoteObject*/ ),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1178;BA.debugLine="lblFastScroll.Visible = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblfastscroll" /*RemoteObject*/ ).runMethod(true,"setVisible",table.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1180;BA.debugLine="CalcFastScroll(PosY)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.ef.table.class, "_calcfastscroll" /*RemoteObject*/ ,(Object)(_posy));
 BA.debugLineNum = 1181;BA.debugLine="FScTimer.Enabled = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_fsctimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",table.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1183;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _svf_scrollchanged(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("SVF_ScrollChanged (table) ","table",20,__ref.getField(false, "ba"),__ref,1156);
if (RapidSub.canDelegate("svf_scrollchanged")) { return __ref.runUserSub(false, "table","svf_scrollchanged", __ref, _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1156;BA.debugLine="Private Sub SVF_ScrollChanged(Position As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 1157;BA.debugLine="SVFScrolls = True";
Debug.ShouldStop(16);
__ref.setField ("_svfscrolls" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 1158;BA.debugLine="If SV2Scrolls = False Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_sv2scrolls" /*RemoteObject*/ ),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1159;BA.debugLine="Scroll(SV2PosX, Position)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.ef.table.class, "_scroll" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_sv2posx" /*RemoteObject*/ )),(Object)(_position));
 BA.debugLineNum = 1160;BA.debugLine="SV2.VerticalScrollPosition = Position";
Debug.ShouldStop(128);
__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"setVerticalScrollPosition",_position);
 };
 BA.debugLineNum = 1162;BA.debugLine="SVFScrolls = False";
Debug.ShouldStop(512);
__ref.setField ("_svfscrolls" /*RemoteObject*/ ,table.__c.getField(true,"False"));
 BA.debugLineNum = 1163;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unhidecol(RemoteObject __ref,RemoteObject _col,RemoteObject _newsize) throws Exception{
try {
		Debug.PushSubsStack("unHideCol (table) ","table",20,__ref.getField(false, "ba"),__ref,2201);
if (RapidSub.canDelegate("unhidecol")) { return __ref.runUserSub(false, "table","unhidecol", __ref, _col, _newsize);}
RemoteObject _tmpwidths = null;
int _i = 0;
Debug.locals.put("col", _col);
Debug.locals.put("newSize", _newsize);
 BA.debugLineNum = 2201;BA.debugLine="Public Sub unHideCol(col As Int, newSize As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 2202;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
Debug.ShouldStop(33554432);
_tmpwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("tmpWidths", _tmpwidths);
 BA.debugLineNum = 2203;BA.debugLine="For i=0 To SavedWidths.Length-1";
Debug.ShouldStop(67108864);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2204;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
Debug.ShouldStop(134217728);
_tmpwidths.setArrayElement (__ref.getField(false,"_savedwidths" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2206;BA.debugLine="tmpWidths(col) = newSize";
Debug.ShouldStop(536870912);
_tmpwidths.setArrayElement (_newsize,_col);
 BA.debugLineNum = 2207;BA.debugLine="SetColumnsWidths(tmpWidths)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.ef.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_tmpwidths));
 BA.debugLineNum = 2208;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unselectrow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("UnselectRow (table) ","table",20,__ref.getField(false, "ba"),__ref,1681);
if (RapidSub.canDelegate("unselectrow")) { return __ref.runUserSub(false, "table","unselectrow", __ref, _row);}
RemoteObject _previndex = RemoteObject.createImmutable(0);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1681;BA.debugLine="Public Sub UnselectRow(Row As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1682;BA.debugLine="If Not(cAllowSelection) Then Return";
Debug.ShouldStop(131072);
if (table.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_callowselection" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1684;BA.debugLine="Dim prevIndex As Int";
Debug.ShouldStop(524288);
_previndex = RemoteObject.createImmutable(0);Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 1686;BA.debugLine="prevIndex = SelectedRows.indexof(Row)	 ' -1 if se";
Debug.ShouldStop(2097152);
_previndex = __ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_row)));Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 1687;BA.debugLine="If prevIndex > -1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_previndex,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1689;BA.debugLine="SelectedCol = -1";
Debug.ShouldStop(16777216);
__ref.setField ("_selectedcol" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 1690;BA.debugLine="SelectedRows.RemoveAt(prevIndex)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_selectedrows" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_previndex));
 BA.debugLineNum = 1691;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
Debug.ShouldStop(67108864);
if (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_row))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1692;BA.debugLine="HideRow(Row)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.ef.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(_row));
 BA.debugLineNum = 1693;BA.debugLine="ShowRow(Row)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.ef.table.class, "_showrow" /*void*/ ,(Object)(_row));
 };
 };
 BA.debugLineNum = 1696;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatecell(RemoteObject __ref,RemoteObject _col,RemoteObject _row,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("UpdateCell (table) ","table",20,__ref.getField(false, "ba"),__ref,2086);
if (RapidSub.canDelegate("updatecell")) { return __ref.runUserSub(false, "table","updatecell", __ref, _col, _row, _value);}
Debug.locals.put("Col", _col);
Debug.locals.put("Row", _row);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2086;BA.debugLine="Public Sub UpdateCell(Col As Int, Row As Int, Valu";
Debug.ShouldStop(32);
 BA.debugLineNum = 2087;BA.debugLine="If (Col < 0 Or Col > mNumberOfColumns - 1 Or Row";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("<",_col,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_col,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))) || RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_row,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 2088;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return table.__c.getField(true,"False");
 };
 BA.debugLineNum = 2090;BA.debugLine="SetValue(Col, Row, Value)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.ef.table.class, "_setvalue" /*RemoteObject*/ ,(Object)(_col),(Object)(_row),(Object)(_value));
 BA.debugLineNum = 2091;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return table.__c.getField(true,"True");
 BA.debugLineNum = 2092;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateiplocation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("updateIPLocation (table) ","table",20,__ref.getField(false, "ba"),__ref,2222);
if (RapidSub.canDelegate("updateiplocation")) { return __ref.runUserSub(false, "table","updateiplocation", __ref);}
 BA.debugLineNum = 2222;BA.debugLine="Private Sub updateIPLocation";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2223;BA.debugLine="If (SV2.Height > Data.Size * cRowHeight) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean(">",__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1))))) { 
 BA.debugLineNum = 2225;BA.debugLine="internalPanel.Top = Data.Size * cRowHeight + cHe";
Debug.ShouldStop(65536);
__ref.getField(false,"_internalpanel" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),__ref.getField(true,"_crowheight" /*RemoteObject*/ ),__ref.getField(true,"_cheaderheight" /*RemoteObject*/ )}, "*+",1, 1));
 BA.debugLineNum = 2226;BA.debugLine="internalPanel.Height = SV2.Height - (Data.Size *";
Debug.ShouldStop(131072);
__ref.getField(false,"_internalpanel" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv2" /*RemoteObject*/ ).runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),__ref.getField(true,"_crowheight" /*RemoteObject*/ )}, "*",0, 1))}, "-",1, 1));
 }else {
 BA.debugLineNum = 2228;BA.debugLine="internalPanel.Height = 0";
Debug.ShouldStop(524288);
__ref.getField(false,"_internalpanel" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 2230;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterow(RemoteObject __ref,RemoteObject _row,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("UpdateRow (table) ","table",20,__ref.getField(false, "ba"),__ref,2072);
if (RapidSub.canDelegate("updaterow")) { return __ref.runUserSub(false, "table","updaterow", __ref, _row, _values);}
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Row", _row);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 2072;BA.debugLine="Public Sub UpdateRow(Row As Int, Values () As Stri";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 2073;BA.debugLine="Dim i As Int";
Debug.ShouldStop(16777216);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2074;BA.debugLine="If (Values.Length <> mNumberOfColumns Or Row <0 O";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("!",_values.getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_mnumberofcolumns" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_row,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 2075;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) return table.__c.getField(true,"False");
 };
 BA.debugLineNum = 2077;BA.debugLine="For i=0 To Values.Length-1";
Debug.ShouldStop(268435456);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_values.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _i.<Integer>get().intValue() <= limit5) || (step5 < 0 && _i.<Integer>get().intValue() >= limit5) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2078;BA.debugLine="SetValue(i,Row,Values(i))";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.table.class, "_setvalue" /*RemoteObject*/ ,(Object)(_i),(Object)(_row),(Object)(_values.getArrayElement(true,_i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2080;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return table.__c.getField(true,"True");
 BA.debugLineNum = 2081;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}