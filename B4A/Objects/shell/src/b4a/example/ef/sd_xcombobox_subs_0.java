package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sd_xcombobox_subs_0 {


public static RemoteObject  _add(RemoteObject __ref,RemoteObject _text,RemoteObject _returnvalue) throws Exception{
try {
		Debug.PushSubsStack("Add (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("add")) { return __ref.runUserSub(false, "sd_xcombobox","add", __ref, _text, _returnvalue);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Text", _text);
Debug.locals.put("ReturnValue", _returnvalue);
 BA.debugLineNum = 280;BA.debugLine="Public Sub Add(Text As String, ReturnValue As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 281;BA.debugLine="Dim M As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("M", _m);
 BA.debugLineNum = 282;BA.debugLine="M.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 283;BA.debugLine="M.Put(\"Text\",Text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Text"))),(Object)((_text)));
 BA.debugLineNum = 284;BA.debugLine="M.Put(\"Value\",ReturnValue)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Value"))),(Object)(_returnvalue));
 BA.debugLineNum = 285;BA.debugLine="M.Put(\"object\",Null)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object"))),(Object)(sd_xcombobox.__c.getField(false,"Null")));
 BA.debugLineNum = 286;BA.debugLine="ListItem.Add(M)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addall(RemoteObject __ref,RemoteObject _l) throws Exception{
try {
		Debug.PushSubsStack("AddAll (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("addall")) { return __ref.runUserSub(false, "sd_xcombobox","addall", __ref, _l);}
RemoteObject _text = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("L", _l);
 BA.debugLineNum = 291;BA.debugLine="Public Sub AddAll(L As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 292;BA.debugLine="For Each text As String In L";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _l;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_text = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("text", _text);
Debug.locals.put("text", _text);
 BA.debugLineNum = 293;BA.debugLine="Dim M As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("M", _m);
 BA.debugLineNum = 294;BA.debugLine="M.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 295;BA.debugLine="M.Put(\"Text\",text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Text"))),(Object)((_text)));
 BA.debugLineNum = 296;BA.debugLine="M.Put(\"Value\",text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Value"))),(Object)((_text)));
 BA.debugLineNum = 297;BA.debugLine="M.Put(\"object\",Null)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object"))),(Object)(sd_xcombobox.__c.getField(false,"Null")));
 BA.debugLineNum = 299;BA.debugLine="ListItem.Add(M)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_m.getObject())));
 }
}Debug.locals.put("text", _text);
;
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "sd_xcombobox","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 199;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 200;BA.debugLine="If Style=\"Classic\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_style" /*RemoteObject*/ ),BA.ObjectToString("Classic"))) { 
 BA.debugLineNum = 201;BA.debugLine="MyLabel.Width=Width-10dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0)));
 BA.debugLineNum = 202;BA.debugLine="MyLabel.Height=Height-30dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 0)));
 BA.debugLineNum = 203;BA.debugLine="LabelHint.Width=Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, _width));
 }else {
 BA.debugLineNum = 205;BA.debugLine="If RTL Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_rtl" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 206;BA.debugLine="MyLabel.Width=Width-50dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0)));
 BA.debugLineNum = 207;BA.debugLine="MyLabel.Height=Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, _height));
 BA.debugLineNum = 208;BA.debugLine="LabelHint.Left=Width-45dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))}, "-",1, 0)));
 BA.debugLineNum = 209;BA.debugLine="LabelHint.Height=Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, _height));
 }else {
 BA.debugLineNum = 211;BA.debugLine="MyLabel.Width=Width-50dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0)));
 BA.debugLineNum = 212;BA.debugLine="MyLabel.Height=Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, _height));
 BA.debugLineNum = 213;BA.debugLine="LabelHint.Height=Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, _height));
 };
 };
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
sd_xcombobox._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",sd_xcombobox._meventname);
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
sd_xcombobox._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",sd_xcombobox._mcallback);
 //BA.debugLineNum = 18;BA.debugLine="Public mBase As B4XView";
sd_xcombobox._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",sd_xcombobox._mbase);
 //BA.debugLineNum = 19;BA.debugLine="Private xui As XUI 'ignore";
sd_xcombobox._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",sd_xcombobox._xui);
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
sd_xcombobox._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",sd_xcombobox._tag);
 //BA.debugLineNum = 22;BA.debugLine="Private outListPanel As B4XView";
sd_xcombobox._outlistpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_outlistpanel",sd_xcombobox._outlistpanel);
 //BA.debugLineNum = 23;BA.debugLine="Private ListPanel As B4XView";
sd_xcombobox._listpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_listpanel",sd_xcombobox._listpanel);
 //BA.debugLineNum = 24;BA.debugLine="Private ListItem As List";
sd_xcombobox._listitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_listitem",sd_xcombobox._listitem);
 //BA.debugLineNum = 25;BA.debugLine="Private SelIndex As Int";
sd_xcombobox._selindex = RemoteObject.createImmutable(0);__ref.setField("_selindex",sd_xcombobox._selindex);
 //BA.debugLineNum = 26;BA.debugLine="Private FindIndex As Int = -1";
sd_xcombobox._findindex = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_findindex",sd_xcombobox._findindex);
 //BA.debugLineNum = 28;BA.debugLine="Private Editable As Boolean";
sd_xcombobox._editable = RemoteObject.createImmutable(false);__ref.setField("_editable",sd_xcombobox._editable);
 //BA.debugLineNum = 29;BA.debugLine="Private Corner As Int";
sd_xcombobox._corner = RemoteObject.createImmutable(0);__ref.setField("_corner",sd_xcombobox._corner);
 //BA.debugLineNum = 30;BA.debugLine="Private Style As String = \"Frame\"";
sd_xcombobox._style = BA.ObjectToString("Frame");__ref.setField("_style",sd_xcombobox._style);
 //BA.debugLineNum = 31;BA.debugLine="Private Align As String = \"CENTER\"";
sd_xcombobox._align = BA.ObjectToString("CENTER");__ref.setField("_align",sd_xcombobox._align);
 //BA.debugLineNum = 32;BA.debugLine="Private TextAlign As String = \"LEFT\"";
sd_xcombobox._textalign = BA.ObjectToString("LEFT");__ref.setField("_textalign",sd_xcombobox._textalign);
 //BA.debugLineNum = 33;BA.debugLine="Private ModIntern As Boolean=False";
sd_xcombobox._modintern = sd_xcombobox.__c.getField(true,"False");__ref.setField("_modintern",sd_xcombobox._modintern);
 //BA.debugLineNum = 34;BA.debugLine="Private BClr As Int";
sd_xcombobox._bclr = RemoteObject.createImmutable(0);__ref.setField("_bclr",sd_xcombobox._bclr);
 //BA.debugLineNum = 35;BA.debugLine="Private RTL As Boolean = False";
sd_xcombobox._rtl = sd_xcombobox.__c.getField(true,"False");__ref.setField("_rtl",sd_xcombobox._rtl);
 //BA.debugLineNum = 36;BA.debugLine="Private LabelHint As B4XView";
sd_xcombobox._labelhint = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_labelhint",sd_xcombobox._labelhint);
 //BA.debugLineNum = 37;BA.debugLine="Private MyLabel As B4XView";
sd_xcombobox._mylabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mylabel",sd_xcombobox._mylabel);
 //BA.debugLineNum = 38;BA.debugLine="Private CornerColor As Int";
sd_xcombobox._cornercolor = RemoteObject.createImmutable(0);__ref.setField("_cornercolor",sd_xcombobox._cornercolor);
 //BA.debugLineNum = 40;BA.debugLine="Private kbh As Int = 0";
sd_xcombobox._kbh = BA.numberCast(int.class, 0);__ref.setField("_kbh",sd_xcombobox._kbh);
 //BA.debugLineNum = 41;BA.debugLine="Public ItemHeight As Int";
sd_xcombobox._itemheight = RemoteObject.createImmutable(0);__ref.setField("_itemheight",sd_xcombobox._itemheight);
 //BA.debugLineNum = 42;BA.debugLine="Public OpenDropDownOnFocus As Boolean";
sd_xcombobox._opendropdownonfocus = RemoteObject.createImmutable(false);__ref.setField("_opendropdownonfocus",sd_xcombobox._opendropdownonfocus);
 //BA.debugLineNum = 43;BA.debugLine="Public SelectOnlyFromList As Boolean = False";
sd_xcombobox._selectonlyfromlist = sd_xcombobox.__c.getField(true,"False");__ref.setField("_selectonlyfromlist",sd_xcombobox._selectonlyfromlist);
 //BA.debugLineNum = 46;BA.debugLine="Private kk As IME";
sd_xcombobox._kk = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_kk",sd_xcombobox._kk);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,308);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "sd_xcombobox","clear", __ref);}
 BA.debugLineNum = 308;BA.debugLine="Public Sub Clear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 309;BA.debugLine="ListItem.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 310;BA.debugLine="SelIndex=-1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 312;BA.debugLine="if Editable then  MyLabel.EditTextHint=\"<none>\"";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_editable" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setEditTextHint",BA.ObjectToCharSequence("<none>"));};
 BA.debugLineNum = 313;BA.debugLine="MyLabel.Text=\"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _closedropdown(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CloseDropDown (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("closedropdown")) { return __ref.runUserSub(false, "sd_xcombobox","closedropdown", __ref);}
 BA.debugLineNum = 324;BA.debugLine="Public Sub CloseDropDown";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 325;BA.debugLine="outListPanel.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,702);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "sd_xcombobox","createlabel", __ref, _eventname);}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 702;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 703;BA.debugLine="Dim L As Label";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 704;BA.debugLine="L.Initialize(EventName)";
Debug.JustUpdateDeviceLine();
_l.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 705;BA.debugLine="Return L";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _l.getObject());
 BA.debugLineNum = 706;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextview(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateTextView (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,708);
if (RapidSub.canDelegate("createtextview")) { return __ref.runUserSub(false, "sd_xcombobox","createtextview", __ref, _eventname);}
RemoteObject _t = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 708;BA.debugLine="Private Sub CreateTextView(EventName As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 710;BA.debugLine="Dim T As EditText";
Debug.JustUpdateDeviceLine();
_t = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");Debug.locals.put("T", _t);
 BA.debugLineNum = 711;BA.debugLine="T.Initialize(EventName)";
Debug.JustUpdateDeviceLine();
_t.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 719;BA.debugLine="Return T";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _t.getObject());
 BA.debugLineNum = 720;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("DesignerCreateView (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "sd_xcombobox","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _can = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _path = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 84;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 86;BA.debugLine="Tag = mBase.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 87;BA.debugLine="mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 89;BA.debugLine="If Props.ContainsKey(\"RTL\") Then RTL=Props.Get(\"R";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("RTL")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_rtl" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RTL"))))));};
 BA.debugLineNum = 90;BA.debugLine="If Props.ContainsKey(\"Style\") Then Style=Props.Ge";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Style")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_style" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Style"))))));};
 BA.debugLineNum = 91;BA.debugLine="If Props.ContainsKey(\"Align\") Then Align=Props.Ge";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Align")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_align" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Align"))))));};
 BA.debugLineNum = 92;BA.debugLine="If Props.ContainsKey(\"TextAlign\") Then TextAlign=";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("TextAlign")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_textalign" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextAlign"))))));};
 BA.debugLineNum = 93;BA.debugLine="If Props.ContainsKey(\"CornerColor\") Then CornerCo";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("CornerColor")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_cornercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CornerColor")))))));}
else {
__ref.setField ("_cornercolor" /*RemoteObject*/ ,__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));};
 BA.debugLineNum = 94;BA.debugLine="If Props.ContainsKey(\"Background\") Then	BClr=xui.";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Background")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_bclr" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Background")))))));}
else {
__ref.setField ("_bclr" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getColor"));};
 BA.debugLineNum = 95;BA.debugLine="If Props.ContainsKey(\"Editable\") Then Editable=Pr";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Editable")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_editable" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Editable"))))));};
 BA.debugLineNum = 96;BA.debugLine="Corner=Props.Get(\"Corner\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corner" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Corner"))))));
 BA.debugLineNum = 97;BA.debugLine="Corner=Corner*(100dip/100)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corner" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_corner" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)));
 BA.debugLineNum = 105;BA.debugLine="If Editable Then MyLabel=CreateTextView(\"MyLabel\"";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_editable" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.setField ("_mylabel" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_createtextview" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("MyLabel"))));}
else {
__ref.setField ("_mylabel" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("MyLabel"))));};
 BA.debugLineNum = 107;BA.debugLine="MyLabel.TextColor=Lbl.As(B4XView).TextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setTextColor",(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject())).runMethod(true,"getTextColor"));
 BA.debugLineNum = 108;BA.debugLine="MyLabel.TextSize=Lbl.As(B4XView).TextSize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setTextSize",(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject())).runMethod(true,"getTextSize"));
 BA.debugLineNum = 109;BA.debugLine="MyLabel.Font=Lbl.As(B4XView).Font";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(false,"setFont",(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject())).runMethod(false,"getFont"));
 BA.debugLineNum = 110;BA.debugLine="If Editable = False Then MyLabel.SetTextAlignment";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_editable" /*RemoteObject*/ ),sd_xcombobox.__c.getField(true,"False"))) { 
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(__ref.getField(true,"_textalign" /*RemoteObject*/ )));};
 BA.debugLineNum = 111;BA.debugLine="MyLabel.Color=xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 112;BA.debugLine="MyLabel.Text=Lbl.As(B4XView).Text";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject())).runMethod(true,"getText")));
 BA.debugLineNum = 113;BA.debugLine="If Editable Then MyLabel.EditTextHint=\"<none>\"";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_editable" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setEditTextHint",BA.ObjectToCharSequence("<none>"));};
 BA.debugLineNum = 115;BA.debugLine="LabelHint.Text=Chr(0xF006) 'lbx.EditTextHint";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(sd_xcombobox.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf006))))));
 BA.debugLineNum = 116;BA.debugLine="LabelHint.TextColor=MyLabel.TextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 117;BA.debugLine="LabelHint.Color=xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 118;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 119;BA.debugLine="LabelHint.Font=xui.CreateFontAwesome(MyLabel.Font";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFontAwesome",(Object)(__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(false,"getFont").runMethod(true,"getSize"))));
 BA.debugLineNum = 121;BA.debugLine="Select Style";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_style" /*RemoteObject*/ ),BA.ObjectToString("Frame"),BA.ObjectToString("Bead"),BA.ObjectToString("Classic"))) {
case 0: {
 BA.debugLineNum = 123;BA.debugLine="mBase.SetColorAndBorder(BClr,1dip,CornerColor,C";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_bclr" /*RemoteObject*/ )),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(__ref.getField(true,"_cornercolor" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_corner" /*RemoteObject*/ )));
 break; }
case 1: {
 BA.debugLineNum = 125;BA.debugLine="LabelHint.TextColor=BClr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_bclr" /*RemoteObject*/ ));
 BA.debugLineNum = 126;BA.debugLine="LabelHint.SetColorAndBorder(CornerColor,0dip,xu";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_cornercolor" /*RemoteObject*/ )),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 128;BA.debugLine="Dim Can As B4XCanvas";
Debug.JustUpdateDeviceLine();
_can = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("Can", _can);
 BA.debugLineNum = 129;BA.debugLine="Dim Rec As B4XRect";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("Rec", _rec);
 BA.debugLineNum = 131;BA.debugLine="Can.Initialize(mBase)";
Debug.JustUpdateDeviceLine();
_can.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 132;BA.debugLine="Rec.Initialize(20dip,mBase.Height/2,mBase.Width";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 1))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 133;BA.debugLine="Can.DrawRect(Rec,CornerColor,True,0dip)";
Debug.JustUpdateDeviceLine();
_can.runVoidMethod ("DrawRect",(Object)(_rec),(Object)(__ref.getField(true,"_cornercolor" /*RemoteObject*/ )),(Object)(sd_xcombobox.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 134;BA.debugLine="If RTL Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_rtl" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 135;BA.debugLine="Dim Rec As B4XRect";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("Rec", _rec);
 BA.debugLineNum = 136;BA.debugLine="Rec.Initialize(0dip,0dip,mBase.Width-45dip,mBa";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))}, "-",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1))));
 BA.debugLineNum = 137;BA.debugLine="Dim Path As B4XPath";
Debug.JustUpdateDeviceLine();
_path = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("Path", _path);
 BA.debugLineNum = 138;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))));
 BA.debugLineNum = 139;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
Debug.JustUpdateDeviceLine();
_can.runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.getField(true,"_bclr" /*RemoteObject*/ )),(Object)(sd_xcombobox.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 141;BA.debugLine="Dim Rec As B4XRect";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("Rec", _rec);
 BA.debugLineNum = 142;BA.debugLine="Rec.Initialize(45dip,0dip,mBase.Width,mBase.He";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45))))),(Object)(BA.numberCast(float.class, sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1))));
 BA.debugLineNum = 143;BA.debugLine="Dim Path As B4XPath";
Debug.JustUpdateDeviceLine();
_path = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("Path", _path);
 BA.debugLineNum = 144;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))));
 BA.debugLineNum = 145;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
Debug.JustUpdateDeviceLine();
_can.runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.getField(true,"_bclr" /*RemoteObject*/ )),(Object)(sd_xcombobox.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))));
 };
 BA.debugLineNum = 147;BA.debugLine="Can.Invalidate";
Debug.JustUpdateDeviceLine();
_can.runVoidMethod ("Invalidate");
 break; }
case 2: {
 BA.debugLineNum = 149;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 150;BA.debugLine="LabelHint.Font=xui.CreateDefaultBoldFont(MyLabe";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(false,"getFont").runMethod(true,"getSize"),RemoteObject.createImmutable(3)}, "-",1, 0)))));
 BA.debugLineNum = 151;BA.debugLine="LabelHint.Text=\"Set Hint\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Set Hint"));
 break; }
}
;
 BA.debugLineNum = 154;BA.debugLine="If Style=\"Classic\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_style" /*RemoteObject*/ ),BA.ObjectToString("Classic"))) { 
 BA.debugLineNum = 155;BA.debugLine="mBase.AddView(MyLabel,0dip,30dip,mBase.Width,mBa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mylabel" /*RemoteObject*/ ).getObject())),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)));
 BA.debugLineNum = 156;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,mBase.Width-10";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_labelhint" /*RemoteObject*/ ).getObject())),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 157;BA.debugLine="MyLabel.SetColorAndBorder(BClr,1dip,CornerColor,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_bclr" /*RemoteObject*/ )),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(__ref.getField(true,"_cornercolor" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_corner" /*RemoteObject*/ )));
 BA.debugLineNum = 158;BA.debugLine="If RTL Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_rtl" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 159;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("RIGHT")));
 BA.debugLineNum = 160;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"RIGHT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("RIGHT")));
 BA.debugLineNum = 164;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_mylabel" /*RemoteObject*/ ).getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))})));
 }else {
 BA.debugLineNum = 167;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"LEFT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 168;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"LEFT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 172;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_mylabel" /*RemoteObject*/ ).getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))})));
 };
 }else {
 BA.debugLineNum = 176;BA.debugLine="If RTL Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_rtl" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 177;BA.debugLine="mBase.AddView(LabelHint,mBase.Width-45dip,0dip,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_labelhint" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))}, "-",1, 1)),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 178;BA.debugLine="mBase.AddView(MyLabel,5dip,0dip,mBase.Width-50d";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mylabel" /*RemoteObject*/ ).getObject())),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 1)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 184;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("RIGHT")));
 BA.debugLineNum = 185;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_mylabel" /*RemoteObject*/ ).getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))})));
 }else {
 BA.debugLineNum = 188;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,40dip,mBase.H";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_labelhint" /*RemoteObject*/ ).getObject())),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 189;BA.debugLine="mBase.AddView(MyLabel,50dip,0dip,mBase.Width-50";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mylabel" /*RemoteObject*/ ).getObject())),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 1)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 193;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"LEFT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 };
 };
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _drawlistbox(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawListBox (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,650);
if (RapidSub.canDelegate("drawlistbox")) { __ref.runUserSub(false, "sd_xcombobox","drawlistbox", __ref); return;}
ResumableSub_DrawListBox rsub = new ResumableSub_DrawListBox(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DrawListBox extends BA.ResumableSub {
public ResumableSub_DrawListBox(b4a.example.ef.sd_xcombobox parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.sd_xcombobox parent;
RemoteObject _height = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int step5;
int limit5;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DrawListBox (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,650);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 651;BA.debugLine="Dim Height As Int = 0";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(int.class, 0);Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 653;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_OpenLis";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OpenList"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OpenList"))));
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 655;BA.debugLine="ListPanel.As(ScrollView).Panel.RemoveAllViews";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ScrollViewWrapper"), __ref.getField(false,"_listpanel" /*RemoteObject*/ ).getObject())).runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 656;BA.debugLine="ListPanel.Color=MyLabel.TextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 662;BA.debugLine="For i=0 To ListItem.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//for
this.state = 10;
step5 = 1;
limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 24;
if (true) break;

case 24:
//C
this.state = 10;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 9;
if (true) break;

case 25:
//C
this.state = 24;
_i = ((int)(0 + _i + step5)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 25;
 BA.debugLineNum = 663;BA.debugLine="Dim v As Map = ListItem.Get(i)";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 664;BA.debugLine="Dim L As B4XView = CreateLabel(\"LabSelect\")";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_l = __ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("LabSelect")));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 665;BA.debugLine="L.Color=BClr";
Debug.JustUpdateDeviceLine();
_l.runMethod(true,"setColor",__ref.getField(true,"_bclr" /*RemoteObject*/ ));
 BA.debugLineNum = 666;BA.debugLine="L.TextColor=MyLabel.TextColor";
Debug.JustUpdateDeviceLine();
_l.runMethod(true,"setTextColor",__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 667;BA.debugLine="L.Text=v.Get(\"Text\")";
Debug.JustUpdateDeviceLine();
_l.runMethod(true,"setText",BA.ObjectToCharSequence(_v.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text"))))));
 BA.debugLineNum = 668;BA.debugLine="L.SetTextAlignment(\"CENTER\",Align)";
Debug.JustUpdateDeviceLine();
_l.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(__ref.getField(true,"_align" /*RemoteObject*/ )));
 BA.debugLineNum = 669;BA.debugLine="L.Tag=i";
Debug.JustUpdateDeviceLine();
_l.runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 670;BA.debugLine="v.Put(\"object\",L)";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object"))),(Object)((_l.getObject())));
 BA.debugLineNum = 674;BA.debugLine="ListPanel.As(ScrollView).Panel.AddView(L,1dip,H";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ScrollViewWrapper"), __ref.getField(false,"_listpanel" /*RemoteObject*/ ).getObject())).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_l.getObject())),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(_height),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemheight" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1)));
 BA.debugLineNum = 679;BA.debugLine="Height=Height+ItemHeight";
Debug.JustUpdateDeviceLine();
_height = RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_itemheight" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("Height", _height);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 683;BA.debugLine="ListPanel.As(ScrollView).Panel.Height=Height";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ScrollViewWrapper"), __ref.getField(false,"_listpanel" /*RemoteObject*/ ).getObject())).runMethod(false,"getPanel").runMethod(true,"setHeight",_height);
 BA.debugLineNum = 688;BA.debugLine="ListPanel.ScrollViewContentHeight=Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentHeight",_height);
 BA.debugLineNum = 689;BA.debugLine="If Height<ListPanel.Height Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 20;
if (RemoteObject.solveBoolean("<",_height,BA.numberCast(double.class, __ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 690;BA.debugLine="If ListPanel.Top=0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"getTop"),BA.numberCast(double.class, 0))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 691;BA.debugLine="ListPanel.top=ListPanel.Height-Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),_height}, "-",1, 1));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 693;BA.debugLine="ListPanel.Height=Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"setHeight",_height);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;
;
 BA.debugLineNum = 696;BA.debugLine="If SelIndex>-1 Then";
Debug.JustUpdateDeviceLine();

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_selindex" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 697;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "sd_xcombobox", "drawlistbox"),BA.numberCast(int.class, 0));
this.state = 26;
return;
case 26:
//C
this.state = 23;
;
 BA.debugLineNum = 698;BA.debugLine="setSelectedIndex(SelIndex)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ )));
 if (true) break;

case 23:
//C
this.state = -1;
;
 BA.debugLineNum = 700;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _fixpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("fixPanel (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,599);
if (RapidSub.canDelegate("fixpanel")) { return __ref.runUserSub(false, "sd_xcombobox","fixpanel", __ref);}
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _prec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 599;BA.debugLine="Private Sub fixPanel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 600;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 601;BA.debugLine="Dim Left As Int = mBase.Left";
Debug.JustUpdateDeviceLine();
_left = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft");Debug.locals.put("Left", _left);Debug.locals.put("Left", _left);
 BA.debugLineNum = 602;BA.debugLine="Dim Top As Int = mBase.top";
Debug.JustUpdateDeviceLine();
_top = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop");Debug.locals.put("Top", _top);Debug.locals.put("Top", _top);
 BA.debugLineNum = 603;BA.debugLine="Dim width As Int";
Debug.JustUpdateDeviceLine();
_width = RemoteObject.createImmutable(0);Debug.locals.put("width", _width);
 BA.debugLineNum = 604;BA.debugLine="Dim height As Int";
Debug.JustUpdateDeviceLine();
_height = RemoteObject.createImmutable(0);Debug.locals.put("height", _height);
 BA.debugLineNum = 605;BA.debugLine="Dim prec As B4XView = mBase";
Debug.JustUpdateDeviceLine();
_prec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_prec = __ref.getField(false,"_mbase" /*RemoteObject*/ );Debug.locals.put("prec", _prec);Debug.locals.put("prec", _prec);
 BA.debugLineNum = 606;BA.debugLine="Dim pnl As B4XView = mBase.Parent";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent");Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 608;BA.debugLine="Do While (pnl.Parent.IsInitialized) And (GetType";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean(".",(_pnl.runMethod(false,"getParent").runMethod(true,"IsInitialized"))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",sd_xcombobox.__c.runMethod(true,"GetType",(Object)((_pnl.getObject()))),RemoteObject.createImmutable("B4IMainView")))))) {
 BA.debugLineNum = 610;BA.debugLine="Left=Left+pnl.Left";
Debug.JustUpdateDeviceLine();
_left = RemoteObject.solve(new RemoteObject[] {_left,_pnl.runMethod(true,"getLeft")}, "+",1, 1);Debug.locals.put("Left", _left);
 BA.debugLineNum = 611;BA.debugLine="Top=Top+pnl.Top";
Debug.JustUpdateDeviceLine();
_top = RemoteObject.solve(new RemoteObject[] {_top,_pnl.runMethod(true,"getTop")}, "+",1, 1);Debug.locals.put("Top", _top);
 BA.debugLineNum = 612;BA.debugLine="prec=pnl";
Debug.JustUpdateDeviceLine();
_prec = _pnl;Debug.locals.put("prec", _prec);
 BA.debugLineNum = 613;BA.debugLine="pnl=pnl.Parent";
Debug.JustUpdateDeviceLine();
_pnl = _pnl.runMethod(false,"getParent");Debug.locals.put("pnl", _pnl);
 }
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 616;BA.debugLine="Log(LastException.Message)";
Debug.JustUpdateDeviceLine();
sd_xcombobox.__c.runVoidMethod ("LogImpl","965470481",sd_xcombobox.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 618;BA.debugLine="If xui.IsB4i Then pnl=prec";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i").<Boolean>get().booleanValue()) { 
_pnl = _prec;Debug.locals.put("pnl", _pnl);};
 BA.debugLineNum = 620;BA.debugLine="width=pnl.Width";
Debug.JustUpdateDeviceLine();
_width = _pnl.runMethod(true,"getWidth");Debug.locals.put("width", _width);
 BA.debugLineNum = 621;BA.debugLine="height=pnl.Height";
Debug.JustUpdateDeviceLine();
_height = _pnl.runMethod(true,"getHeight");Debug.locals.put("height", _height);
 BA.debugLineNum = 626;BA.debugLine="If width=-1 Then width=100%x";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_width,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_width = sd_xcombobox.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"));Debug.locals.put("width", _width);};
 BA.debugLineNum = 627;BA.debugLine="If height=-1 Then height=100%y";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_height,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_height = sd_xcombobox.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"));Debug.locals.put("height", _height);};
 BA.debugLineNum = 630;BA.debugLine="outListPanel.Color=xui.Color_ARGB(5,5,5,5)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 631;BA.debugLine="outListPanel.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 632;BA.debugLine="pnl.AddView(outListPanel,0,0,width,height)";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 634;BA.debugLine="If kbh>0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_kbh" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 635;BA.debugLine="height=kbh";
Debug.JustUpdateDeviceLine();
_height = __ref.getField(true,"_kbh" /*RemoteObject*/ );Debug.locals.put("height", _height);
 };
 BA.debugLineNum = 639;BA.debugLine="ListPanel.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 641;BA.debugLine="If Top+(mBase.Height/2)>height/2 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_top,(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "+",1, 0),RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))) { 
 BA.debugLineNum = 643;BA.debugLine="outListPanel.AddView(ListPanel,Left,0,mBase.Widt";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_listpanel" /*RemoteObject*/ ).getObject())),(Object)(_left),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_top));
 }else {
 BA.debugLineNum = 646;BA.debugLine="outListPanel.AddView(ListPanel,Left,Top+mBase.He";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_listpanel" /*RemoteObject*/ ).getObject())),(Object)(_left),(Object)(RemoteObject.solve(new RemoteObject[] {_top,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),_top,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "---",3, 1)));
 };
 BA.debugLineNum = 648;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "sd_xcombobox","getbase", __ref);}
 BA.debugLineNum = 222;BA.debugLine="Public Sub GetBase As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 223;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcombotext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getComboText (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("getcombotext")) { return __ref.runUserSub(false, "sd_xcombobox","getcombotext", __ref);}
 BA.debugLineNum = 273;BA.debugLine="Public Sub getComboText As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 274;BA.debugLine="Return MyLabel.Text";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEnabled (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,413);
if (RapidSub.canDelegate("getenabled")) { return __ref.runUserSub(false, "sd_xcombobox","getenabled", __ref);}
 BA.debugLineNum = 413;BA.debugLine="Public Sub getEnabled As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 414;BA.debugLine="Return MyLabel.Enabled";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getEnabled");
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gethint(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHint (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,233);
if (RapidSub.canDelegate("gethint")) { return __ref.runUserSub(false, "sd_xcombobox","gethint", __ref);}
 BA.debugLineNum = 233;BA.debugLine="Public Sub getHint As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 234;BA.debugLine="Return LabelHint.Text";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gethintfont(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHintFont (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("gethintfont")) { return __ref.runUserSub(false, "sd_xcombobox","gethintfont", __ref);}
 BA.debugLineNum = 241;BA.debugLine="Public Sub getHintFont As B4XFont";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 242;BA.debugLine="Return LabelHint.Font";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(false,"getFont");
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitem(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("GetItem (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,332);
if (RapidSub.canDelegate("getitem")) { return __ref.runUserSub(false, "sd_xcombobox","getitem", __ref, _position);}
RemoteObject _ret = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
 BA.debugLineNum = 332;BA.debugLine="Public Sub GetItem(Position As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 333;BA.debugLine="Dim Ret As String = \"\"";
Debug.JustUpdateDeviceLine();
_ret = BA.ObjectToString("");Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 336;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_position,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("<",_position,BA.numberCast(double.class, __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 337;BA.debugLine="Ret=ListItem.Get(Position).As(Map).Get(\"Text\")";
Debug.JustUpdateDeviceLine();
_ret = BA.ObjectToString((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_position)))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))));Debug.locals.put("Ret", _ret);
 };
 BA.debugLineNum = 339;BA.debugLine="Return Ret";
Debug.JustUpdateDeviceLine();
if (true) return _ret;
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedIndex (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("getselectedindex")) { return __ref.runUserSub(false, "sd_xcombobox","getselectedindex", __ref);}
 BA.debugLineNum = 352;BA.debugLine="Public Sub getSelectedIndex As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 353;BA.debugLine="Return SelIndex";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_selindex" /*RemoteObject*/ );
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedtextitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedTextItem (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("getselectedtextitem")) { return __ref.runUserSub(false, "sd_xcombobox","getselectedtextitem", __ref);}
 BA.debugLineNum = 375;BA.debugLine="Public Sub getSelectedTextItem As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 376;BA.debugLine="Return  GetItem(SelIndex)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ )));
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedvalueitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedValueItem (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,394);
if (RapidSub.canDelegate("getselectedvalueitem")) { return __ref.runUserSub(false, "sd_xcombobox","getselectedvalueitem", __ref);}
 BA.debugLineNum = 394;BA.debugLine="Public Sub getSelectedValueItem As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 395;BA.debugLine="Return  GetValue(SelIndex)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ )));
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectionlength(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectionLength (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("getselectionlength")) { return __ref.runUserSub(false, "sd_xcombobox","getselectionlength", __ref);}
 BA.debugLineNum = 265;BA.debugLine="Public Sub getSelectionLength As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 266;BA.debugLine="Return MyLabel.SelectionLength";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getSelectionLength");
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectionstart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectionStart (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("getselectionstart")) { return __ref.runUserSub(false, "sd_xcombobox","getselectionstart", __ref);}
 BA.debugLineNum = 261;BA.debugLine="Public Sub getSelectionStart As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 262;BA.debugLine="Return MyLabel.SelectionStart";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getSelectionStart");
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextfont(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextFont (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("gettextfont")) { return __ref.runUserSub(false, "sd_xcombobox","gettextfont", __ref);}
 BA.debugLineNum = 257;BA.debugLine="Public Sub getTextFont As B4XFont";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 258;BA.debugLine="Return MyLabel.Font";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(false,"getFont");
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("GetValue (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "sd_xcombobox","getvalue", __ref, _position);}
RemoteObject _ret = RemoteObject.declareNull("Object");
Debug.locals.put("Position", _position);
 BA.debugLineNum = 342;BA.debugLine="Public Sub GetValue(Position As Int) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 343;BA.debugLine="Dim Ret As Object";
Debug.JustUpdateDeviceLine();
_ret = RemoteObject.createNew ("Object");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 344;BA.debugLine="If Position=-1 And Editable Then Return MyLabel.T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean(".",__ref.getField(true,"_editable" /*RemoteObject*/ ))) { 
if (true) return (__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getText"));};
 BA.debugLineNum = 345;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_position,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("<",_position,BA.numberCast(double.class, __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 346;BA.debugLine="Ret=ListItem.Get(Position).As(Map).Get(\"Value\")";
Debug.JustUpdateDeviceLine();
_ret = (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_position)))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value"))));Debug.locals.put("Ret", _ret);
 };
 BA.debugLineNum = 349;BA.debugLine="Return Ret";
Debug.JustUpdateDeviceLine();
if (true) return _ret;
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "sd_xcombobox","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _sc = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 50;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 52;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 54;BA.debugLine="outListPanel=xui.CreatePanel(\"outListPanel\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_outlistpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("outListPanel"))));
 BA.debugLineNum = 56;BA.debugLine="Dim Sc As ScrollView";
Debug.JustUpdateDeviceLine();
_sc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("Sc", _sc);
 BA.debugLineNum = 57;BA.debugLine="Sc.Initialize2(1000dip,\"Sc\")";
Debug.JustUpdateDeviceLine();
_sc.runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)(sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))),(Object)(RemoteObject.createImmutable("Sc")));
 BA.debugLineNum = 58;BA.debugLine="ListPanel=Sc";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).setObject (_sc.getObject());
 BA.debugLineNum = 60;BA.debugLine="kk.Initialize(\"kk\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_kk" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("kk")));
 BA.debugLineNum = 61;BA.debugLine="kk.AddHeightChangedEvent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_kk" /*RemoteObject*/ ).runVoidMethod ("AddHeightChangedEvent",__ref.getField(false, "ba"));
 BA.debugLineNum = 74;BA.debugLine="LabelHint=CreateLabel(\"LabelHint\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_labelhint" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("LabelHint"))));
 BA.debugLineNum = 76;BA.debugLine="ListItem.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 77;BA.debugLine="SelIndex=-1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 79;BA.debugLine="ItemHeight=40dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_itemheight" /*RemoteObject*/ ,sd_xcombobox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 80;BA.debugLine="OpenDropDownOnFocus=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_opendropdownonfocus" /*RemoteObject*/ ,sd_xcombobox.__c.getField(true,"True"));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isdropdownopen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("isDropDownOpen (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("isdropdownopen")) { return __ref.runUserSub(false, "sd_xcombobox","isdropdownopen", __ref);}
 BA.debugLineNum = 328;BA.debugLine="Public Sub isDropDownOpen As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="Return (outListPanel.Parent.IsInitialized)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized"));
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _kk_heightchanged(RemoteObject __ref,RemoteObject _newheight,RemoteObject _oldheight) throws Exception{
try {
		Debug.PushSubsStack("kk_HeightChanged (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,544);
if (RapidSub.canDelegate("kk_heightchanged")) { return __ref.runUserSub(false, "sd_xcombobox","kk_heightchanged", __ref, _newheight, _oldheight);}
Debug.locals.put("NewHeight", _newheight);
Debug.locals.put("OldHeight", _oldheight);
 BA.debugLineNum = 544;BA.debugLine="Private Sub kk_HeightChanged (NewHeight As Int, Ol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 545;BA.debugLine="kbh=NewHeight";
Debug.JustUpdateDeviceLine();
__ref.setField ("_kbh" /*RemoteObject*/ ,_newheight);
 BA.debugLineNum = 547;BA.debugLine="If isDropDownOpen Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_isdropdownopen" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 548;BA.debugLine="CloseDropDown";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_closedropdown" /*RemoteObject*/ );
 BA.debugLineNum = 549;BA.debugLine="fixPanel";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_fixpanel" /*RemoteObject*/ );
 BA.debugLineNum = 550;BA.debugLine="DrawListBox";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_drawlistbox" /*void*/ );
 };
 BA.debugLineNum = 552;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _labselect_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LabSelect_Click (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,431);
if (RapidSub.canDelegate("labselect_click")) { __ref.runUserSub(false, "sd_xcombobox","labselect_click", __ref); return;}
ResumableSub_LabSelect_Click rsub = new ResumableSub_LabSelect_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LabSelect_Click extends BA.ResumableSub {
public ResumableSub_LabSelect_Click(b4a.example.ef.sd_xcombobox parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.sd_xcombobox parent;
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LabSelect_Click (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,431);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 432;BA.debugLine="Dim L As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 433;BA.debugLine="Dim index As Int = L.Tag";
Debug.JustUpdateDeviceLine();
_index = BA.numberCast(int.class, _l.runMethod(false,"getTag"));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 435;BA.debugLine="setSelectedIndex(index)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,(Object)(_index));
 BA.debugLineNum = 436;BA.debugLine="Sleep(100)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "sd_xcombobox", "labselect_click"),BA.numberCast(int.class, 100));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 437;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)((_index)),(Object)(__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index))));
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 438;BA.debugLine="outListPanel.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _mylabel_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyLabel_Action (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,462);
if (RapidSub.canDelegate("mylabel_action")) { return __ref.runUserSub(false, "sd_xcombobox","mylabel_action", __ref);}
 BA.debugLineNum = 462;BA.debugLine="Private Sub MyLabel_Action";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 464;BA.debugLine="SelectedItem(MyLabel.Text)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_selecteditem" /*void*/ ,(Object)(__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 465;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mylabel_beginedit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyLabel_BeginEdit (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,458);
if (RapidSub.canDelegate("mylabel_beginedit")) { return __ref.runUserSub(false, "sd_xcombobox","mylabel_beginedit", __ref);}
 BA.debugLineNum = 458;BA.debugLine="Private Sub MyLabel_BeginEdit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 459;BA.debugLine="MyLabel_FocusChanged(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_mylabel_focuschanged" /*RemoteObject*/ ,(Object)(sd_xcombobox.__c.getField(true,"True")));
 BA.debugLineNum = 460;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mylabel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyLabel_Click (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,441);
if (RapidSub.canDelegate("mylabel_click")) { return __ref.runUserSub(false, "sd_xcombobox","mylabel_click", __ref);}
 BA.debugLineNum = 441;BA.debugLine="Private Sub MyLabel_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 442;BA.debugLine="OpenDropDown";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_opendropdown" /*RemoteObject*/ );
 BA.debugLineNum = 443;BA.debugLine="MyLabel.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mylabel_endedit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyLabel_EndEdit (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,472);
if (RapidSub.canDelegate("mylabel_endedit")) { return __ref.runUserSub(false, "sd_xcombobox","mylabel_endedit", __ref);}
 BA.debugLineNum = 472;BA.debugLine="Private Sub MyLabel_EndEdit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 474;BA.debugLine="MyLabel_FocusChanged(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_mylabel_focuschanged" /*RemoteObject*/ ,(Object)(sd_xcombobox.__c.getField(true,"False")));
 BA.debugLineNum = 476;BA.debugLine="SelectedItem(MyLabel.Text)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_selecteditem" /*void*/ ,(Object)(__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mylabel_enterpressed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyLabel_EnterPressed (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("mylabel_enterpressed")) { return __ref.runUserSub(false, "sd_xcombobox","mylabel_enterpressed", __ref);}
 BA.debugLineNum = 467;BA.debugLine="Private Sub MyLabel_EnterPressed";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 469;BA.debugLine="SelectedItem(MyLabel.Text)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_selecteditem" /*void*/ ,(Object)(__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 470;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mylabel_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("MyLabel_FocusChanged (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,446);
if (RapidSub.canDelegate("mylabel_focuschanged")) { return __ref.runUserSub(false, "sd_xcombobox","mylabel_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 446;BA.debugLine="Private Sub MyLabel_FocusChanged (HasFocus As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 447;BA.debugLine="If HasFocus And OpenDropDownOnFocus Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_hasfocus) && RemoteObject.solveBoolean(".",__ref.getField(true,"_opendropdownonfocus" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 448;BA.debugLine="OpenDropDown";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_opendropdown" /*RemoteObject*/ );
 };
 BA.debugLineNum = 453;BA.debugLine="ModIntern=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_modintern" /*RemoteObject*/ ,sd_xcombobox.__c.getField(true,"False"));
 BA.debugLineNum = 455;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FocusChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
sd_xcombobox.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FocusChanged"))),(Object)((_hasfocus)));};
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mylabel_textchanged(RemoteObject __ref,RemoteObject _oldtext,RemoteObject _newtext) throws Exception{
try {
		Debug.PushSubsStack("MyLabel_TextChanged (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,493);
if (RapidSub.canDelegate("mylabel_textchanged")) { return __ref.runUserSub(false, "sd_xcombobox","mylabel_textchanged", __ref, _oldtext, _newtext);}
int _i = 0;
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _startposition = RemoteObject.createImmutable(0);
RemoteObject _endposition = RemoteObject.createImmutable(0);
RemoteObject _startvisible = RemoteObject.createImmutable(0);
RemoteObject _endvisible = RemoteObject.createImmutable(0);
Debug.locals.put("OldText", _oldtext);
Debug.locals.put("NewText", _newtext);
 BA.debugLineNum = 493;BA.debugLine="Private Sub MyLabel_TextChanged (OldText As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 494;BA.debugLine="If ModIntern Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_modintern" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 495;BA.debugLine="ModIntern=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_modintern" /*RemoteObject*/ ,sd_xcombobox.__c.getField(true,"False"));
 BA.debugLineNum = 496;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 498;BA.debugLine="If OldText=NewText Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_oldtext,_newtext)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 499;BA.debugLine="If isDropDownOpen=False And OpenDropDownOnFocus T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_isdropdownopen" /*RemoteObject*/ ),sd_xcombobox.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.getField(true,"_opendropdownonfocus" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_opendropdown" /*RemoteObject*/ );};
 BA.debugLineNum = 500;BA.debugLine="FindIndex = -1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_findindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 502;BA.debugLine="For i=0 To ListItem.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 503;BA.debugLine="Dim v As Map = ListItem.Get(i)";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 505;BA.debugLine="If v.Get(\"Text\").As(String).ToLowerCase.IndexOf(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",(BA.ObjectToString(_v.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))))).runMethod(true,"toLowerCase").runMethod(true,"indexOf",(Object)(_newtext.runMethod(true,"toLowerCase"))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 506;BA.debugLine="FindIndex=i";
Debug.JustUpdateDeviceLine();
__ref.setField ("_findindex" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 507;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 511;BA.debugLine="If SelIndex>-1 And SelIndex<ListItem.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_selindex" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("<",__ref.getField(true,"_selindex" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 512;BA.debugLine="If ListItem.Get(SelIndex).As(Map).Get(\"object\").";
Debug.JustUpdateDeviceLine();
if ((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ ))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("object")))))).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 513;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ ))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("object")))))).runMethod(true,"setColor",__ref.getField(true,"_bclr" /*RemoteObject*/ ));
 BA.debugLineNum = 514;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ ))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("object")))))).runMethod(true,"setTextColor",__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 };
 };
 BA.debugLineNum = 518;BA.debugLine="SelIndex=FindIndex";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selindex" /*RemoteObject*/ ,__ref.getField(true,"_findindex" /*RemoteObject*/ ));
 BA.debugLineNum = 519;BA.debugLine="If SelIndex>-1 And SelIndex<ListItem.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_selindex" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("<",__ref.getField(true,"_selindex" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 520;BA.debugLine="If ListItem.Get(SelIndex).As(Map).Get(\"object\").";
Debug.JustUpdateDeviceLine();
if ((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ ))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("object")))))).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 521;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ ))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("object")))))).runMethod(true,"setColor",__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 522;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ ))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("object")))))).runMethod(true,"setTextColor",__ref.getField(true,"_bclr" /*RemoteObject*/ ));
 BA.debugLineNum = 525;BA.debugLine="Dim StartPosition As Int = ListItem.Get(SelInde";
Debug.JustUpdateDeviceLine();
_startposition = (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ ))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("object")))))).runMethod(true,"getTop");Debug.locals.put("StartPosition", _startposition);Debug.locals.put("StartPosition", _startposition);
 BA.debugLineNum = 526;BA.debugLine="Dim EndPosition As Int = StartPosition + ListIt";
Debug.JustUpdateDeviceLine();
_endposition = RemoteObject.solve(new RemoteObject[] {_startposition,(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ ))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("object")))))).runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("EndPosition", _endposition);Debug.locals.put("EndPosition", _endposition);
 BA.debugLineNum = 527;BA.debugLine="Dim StartVisible As Int = ListPanel.ScrollViewO";
Debug.JustUpdateDeviceLine();
_startvisible = __ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY");Debug.locals.put("StartVisible", _startvisible);Debug.locals.put("StartVisible", _startvisible);
 BA.debugLineNum = 528;BA.debugLine="Dim EndVisible As Int = StartVisible + ListPane";
Debug.JustUpdateDeviceLine();
_endvisible = RemoteObject.solve(new RemoteObject[] {_startvisible,__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("EndVisible", _endvisible);Debug.locals.put("EndVisible", _endvisible);
 BA.debugLineNum = 530;BA.debugLine="If Not((StartPosition>=StartVisible And StartPo";
Debug.JustUpdateDeviceLine();
if (sd_xcombobox.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_startposition,BA.numberCast(double.class, _startvisible)) && RemoteObject.solveBoolean("<",_startposition,BA.numberCast(double.class, _endvisible))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_endposition,BA.numberCast(double.class, _startvisible)) && RemoteObject.solveBoolean("k",_endposition,BA.numberCast(double.class, _endvisible)))))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 532;BA.debugLine="If StartPosition>ListPanel.ScrollViewContentHe";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_startposition,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentHeight"),__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)))) { 
 BA.debugLineNum = 533;BA.debugLine="ListPanel.ScrollViewOffsetY=ListPanel.ScrollV";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentHeight"),__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1));
 }else {
 BA.debugLineNum = 535;BA.debugLine="ListPanel.ScrollViewOffsetY=StartPosition";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",_startposition);
 };
 };
 };
 };
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _opendropdown(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OpenDropDown (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("opendropdown")) { return __ref.runUserSub(false, "sd_xcombobox","opendropdown", __ref);}
 BA.debugLineNum = 316;BA.debugLine="Public Sub OpenDropDown";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 320;BA.debugLine="fixPanel";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_fixpanel" /*RemoteObject*/ );
 BA.debugLineNum = 321;BA.debugLine="DrawListBox";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_drawlistbox" /*void*/ );
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _outlistpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("outListPanel_Click (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,425);
if (RapidSub.canDelegate("outlistpanel_click")) { return __ref.runUserSub(false, "sd_xcombobox","outlistpanel_click", __ref);}
 BA.debugLineNum = 425;BA.debugLine="Private Sub outListPanel_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 426;BA.debugLine="CloseDropDown";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_closedropdown" /*RemoteObject*/ );
 BA.debugLineNum = 427;BA.debugLine="outListPanel.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 428;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FocusChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
sd_xcombobox.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FocusChanged"))),(Object)((sd_xcombobox.__c.getField(true,"False"))));};
 BA.debugLineNum = 429;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _selecteditem(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SelectedItem (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,479);
if (RapidSub.canDelegate("selecteditem")) { __ref.runUserSub(false, "sd_xcombobox","selecteditem", __ref, _value); return;}
ResumableSub_SelectedItem rsub = new ResumableSub_SelectedItem(null,__ref,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SelectedItem extends BA.ResumableSub {
public ResumableSub_SelectedItem(b4a.example.ef.sd_xcombobox parent,RemoteObject __ref,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.sd_xcombobox parent;
RemoteObject _value;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SelectedItem (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,479);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 480;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 10;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 481;BA.debugLine="If SelectOnlyFromList Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(true,"_selectonlyfromlist" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 482;BA.debugLine="SelIndex=FindIndex";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selindex" /*RemoteObject*/ ,__ref.getField(true,"_findindex" /*RemoteObject*/ ));
 BA.debugLineNum = 483;BA.debugLine="MyLabel.Text=GetItem(SelIndex)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selindex" /*RemoteObject*/ )))));
 BA.debugLineNum = 484;BA.debugLine="CallSubDelayed3(mCallBack,mEventName & \"_ItemCl";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)((__ref.getField(true,"_selindex" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 486;BA.debugLine="CallSubDelayed3(mCallBack,mEventName & \"_ItemCl";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))),(Object)((_value)));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 489;BA.debugLine="Sleep(100)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "sd_xcombobox", "selecteditem"),BA.numberCast(int.class, 100));
this.state = 11;
return;
case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 490;BA.debugLine="outListPanel.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_outlistpanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 491;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _setenabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setEnabled (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,417);
if (RapidSub.canDelegate("setenabled")) { return __ref.runUserSub(false, "sd_xcombobox","setenabled", __ref, _b);}
Debug.locals.put("B", _b);
 BA.debugLineNum = 417;BA.debugLine="Public Sub setEnabled(B As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 418;BA.debugLine="MyLabel.Enabled=B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setEnabled",_b);
 BA.debugLineNum = 419;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethint(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("setHint (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("sethint")) { return __ref.runUserSub(false, "sd_xcombobox","sethint", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 229;BA.debugLine="Public Sub setHint(Text As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 230;BA.debugLine="LabelHint.Text=Text";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethintfont(RemoteObject __ref,RemoteObject _fnt) throws Exception{
try {
		Debug.PushSubsStack("setHintFont (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("sethintfont")) { return __ref.runUserSub(false, "sd_xcombobox","sethintfont", __ref, _fnt);}
Debug.locals.put("Fnt", _fnt);
 BA.debugLineNum = 237;BA.debugLine="Public Sub setHintFont(Fnt As B4XFont)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 238;BA.debugLine="LabelHint.Font=Fnt";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labelhint" /*RemoteObject*/ ).runMethod(false,"setFont",_fnt);
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedindex(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("setSelectedIndex (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("setselectedindex")) { return __ref.runUserSub(false, "sd_xcombobox","setselectedindex", __ref, _position);}
RemoteObject _pos = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 356;BA.debugLine="Public Sub setSelectedIndex(Position As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 357;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_position,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("<",_position,BA.numberCast(double.class, __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 358;BA.debugLine="SelIndex=Position";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selindex" /*RemoteObject*/ ,_position);
 BA.debugLineNum = 359;BA.debugLine="MyLabel.Text=GetItem(Position)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(_position))));
 BA.debugLineNum = 361;BA.debugLine="Dim Pos As Int = ItemHeight * Position";
Debug.JustUpdateDeviceLine();
_pos = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemheight" /*RemoteObject*/ ),_position}, "*",0, 1);Debug.locals.put("Pos", _pos);Debug.locals.put("Pos", _pos);
 BA.debugLineNum = 363;BA.debugLine="ListPanel.As(ScrollView).ScrollPosition=Pos";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ScrollViewWrapper"), __ref.getField(false,"_listpanel" /*RemoteObject*/ ).getObject())).runMethod(true,"setScrollPosition",_pos);
 }else 
{ BA.debugLineNum = 369;BA.debugLine="else if Position=-1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 370;BA.debugLine="SelIndex=Position";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selindex" /*RemoteObject*/ ,_position);
 }}
;
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedtextitem(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setSelectedTextItem (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,379);
if (RapidSub.canDelegate("setselectedtextitem")) { return __ref.runUserSub(false, "sd_xcombobox","setselectedtextitem", __ref, _value);}
int _i = 0;
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Value", _value);
 BA.debugLineNum = 379;BA.debugLine="Public Sub setSelectedTextItem(Value As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 380;BA.debugLine="If Editable Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_editable" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 381;BA.debugLine="ModIntern=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_modintern" /*RemoteObject*/ ,sd_xcombobox.__c.getField(true,"True"));
 BA.debugLineNum = 382;BA.debugLine="MyLabel.Text=Value";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 }else {
 BA.debugLineNum = 384;BA.debugLine="For i=0 To ListItem.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 385;BA.debugLine="Dim v As Map = ListItem.Get(i)";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 386;BA.debugLine="If Value = v.Get(\"Text\") Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(_v.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text"))))))) { 
 BA.debugLineNum = 387;BA.debugLine="SelIndex=i";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selindex" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 388;BA.debugLine="MyLabel.Text=GetItem(I)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)))));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedvalueitem(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setSelectedValueItem (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("setselectedvalueitem")) { return __ref.runUserSub(false, "sd_xcombobox","setselectedvalueitem", __ref, _value);}
int _i = 0;
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Value", _value);
 BA.debugLineNum = 398;BA.debugLine="Public Sub setSelectedValueItem(Value As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 399;BA.debugLine="If Editable Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_editable" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 400;BA.debugLine="ModIntern=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_modintern" /*RemoteObject*/ ,sd_xcombobox.__c.getField(true,"True"));
 BA.debugLineNum = 401;BA.debugLine="MyLabel.Text=Value";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 }else {
 BA.debugLineNum = 403;BA.debugLine="For i=0 To ListItem.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 404;BA.debugLine="Dim v As Map = ListItem.Get(i)";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 405;BA.debugLine="If Value = v.Get(\"Value\") Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_value,_v.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))))) { 
 BA.debugLineNum = 406;BA.debugLine="SelIndex=i";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selindex" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 407;BA.debugLine="MyLabel.Text=GetItem(I)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.ef.sd_xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)))));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselection(RemoteObject __ref,RemoteObject _start,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("SetSelection (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("setselection")) { return __ref.runUserSub(false, "sd_xcombobox","setselection", __ref, _start, _length);}
Debug.locals.put("Start", _start);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 269;BA.debugLine="Public Sub SetSelection(Start As Int, Length As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 270;BA.debugLine="MyLabel.SetSelection(Start,Length)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runVoidMethod ("SetSelection",(Object)(_start),(Object)(_length));
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextfont(RemoteObject __ref,RemoteObject _fnt) throws Exception{
try {
		Debug.PushSubsStack("setTextFont (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("settextfont")) { return __ref.runUserSub(false, "sd_xcombobox","settextfont", __ref, _fnt);}
Debug.locals.put("Fnt", _fnt);
 BA.debugLineNum = 253;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 254;BA.debugLine="MyLabel.Font=Fnt";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mylabel" /*RemoteObject*/ ).runMethod(false,"setFont",_fnt);
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _size(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Size (sd_xcombobox) ","sd_xcombobox",38,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("size")) { return __ref.runUserSub(false, "sd_xcombobox","size", __ref);}
 BA.debugLineNum = 304;BA.debugLine="public Sub Size As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 305;BA.debugLine="Return ListItem.Size";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_listitem" /*RemoteObject*/ ).runMethod(true,"getSize");
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}