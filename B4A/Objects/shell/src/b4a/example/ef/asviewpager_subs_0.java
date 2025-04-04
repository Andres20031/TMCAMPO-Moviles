package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class asviewpager_subs_0 {


public static RemoteObject  _addpage(RemoteObject __ref,RemoteObject _layoutpanel,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddPage (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,458);
if (RapidSub.canDelegate("addpage")) { return __ref.runUserSub(false, "asviewpager","addpage", __ref, _layoutpanel, _value);}
Debug.locals.put("LayoutPanel", _layoutpanel);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 458;BA.debugLine="Public Sub AddPage(LayoutPanel As B4XView,Value As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 463;BA.debugLine="xclv_main.Add(LayoutPanel,Value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_layoutpanel),(Object)(_value));
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
public static RemoteObject  _addpageat(RemoteObject __ref,RemoteObject _index,RemoteObject _layoutpanel,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddPageAt (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,469);
if (RapidSub.canDelegate("addpageat")) { return __ref.runUserSub(false, "asviewpager","addpageat", __ref, _index, _layoutpanel, _value);}
Debug.locals.put("index", _index);
Debug.locals.put("LayoutPanel", _layoutpanel);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 469;BA.debugLine="Public Sub AddPageAt(index As Int,LayoutPanel As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 471;BA.debugLine="If index <= m_CurrentIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_index,BA.numberCast(double.class, __ref.getField(true,"_m_currentindex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 472;BA.debugLine="m_CurrentIndex = m_CurrentIndex +1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 };
 BA.debugLineNum = 478;BA.debugLine="xclv_main.InsertAt(index,LayoutPanel,Value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_insertat",(Object)(_index),(Object)(_layoutpanel),(Object)(_value));
 BA.debugLineNum = 488;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(__ref.getField(true,"_m_currentindex" /*RemoteObject*/ )));
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _allowback(RemoteObject __ref,RemoteObject _allow) throws Exception{
try {
		Debug.PushSubsStack("AllowBack (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,591);
if (RapidSub.canDelegate("allowback")) { return __ref.runUserSub(false, "asviewpager","allowback", __ref, _allow);}
Debug.locals.put("Allow", _allow);
 BA.debugLineNum = 591;BA.debugLine="Public Sub AllowBack(Allow As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 592;BA.debugLine="m_AllowBack = Allow";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_allowback" /*RemoteObject*/ ,_allow);
 BA.debugLineNum = 598;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _allownext(RemoteObject __ref,RemoteObject _allow) throws Exception{
try {
		Debug.PushSubsStack("AllowNext (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,579);
if (RapidSub.canDelegate("allownext")) { return __ref.runUserSub(false, "asviewpager","allownext", __ref, _allow);}
Debug.locals.put("Allow", _allow);
 BA.debugLineNum = 579;BA.debugLine="Public Sub AllowNext(Allow As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 580;BA.debugLine="m_AllowNext = Allow";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_allownext" /*RemoteObject*/ ,_allow);
 BA.debugLineNum = 586;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("base_resize")) { __ref.runUserSub(false, "asviewpager","base_resize", __ref, _width, _height); return;}
ResumableSub_Base_Resize rsub = new ResumableSub_Base_Resize(null,__ref,_width,_height);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Base_Resize extends BA.ResumableSub {
public ResumableSub_Base_Resize(b4a.example.ef.asviewpager parent,RemoteObject __ref,RemoteObject _width,RemoteObject _height) {
this.parent = parent;
this.__ref = __ref;
this._width = _width;
this._height = _height;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.asviewpager parent;
RemoteObject _width;
RemoteObject _height;
int _i = 0;
int step9;
int limit9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,353);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 395;BA.debugLine="xpnl_Loading.BringToFront";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 396;BA.debugLine="xpnl_Loading.SetLayoutAnimated(0,0,0,Width + 1000";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))}, "+",1, 0))));
 BA.debugLineNum = 397;BA.debugLine="xpnl_Loading.SetVisibleAnimated(0,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 399;BA.debugLine="mBase.Width = Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, _width));
 BA.debugLineNum = 400;BA.debugLine="mBase.Height = Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, _height));
 BA.debugLineNum = 401;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asviewpager", "base_resize"),BA.numberCast(int.class, 0));
this.state = 16;
return;
case 16:
//C
this.state = 1;
;
 BA.debugLineNum = 402;BA.debugLine="xclv_main.AsView.SetLayoutAnimated(0,xclv_main.As";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getTop")),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 403;BA.debugLine="xclv_main.Base_Resize(Width,Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 406;BA.debugLine="For i = 0 To xclv_main.Size -1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 10;
step9 = 1;
limit9 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 10;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 3;
if (true) break;

case 18:
//C
this.state = 17;
_i = ((int)(0 + _i + step9)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 407;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_orientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 408;BA.debugLine="xclv_main.ResizeItem(i,mBase.Width)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 410;BA.debugLine="xclv_main.ResizeItem(i,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 if (true) break;

case 9:
//C
this.state = 18;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 416;BA.debugLine="If xclv_main.Size > 0 Then xclv_main.JumpToItem(m";
Debug.JustUpdateDeviceLine();

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(__ref.getField(true,"_m_currentindex" /*RemoteObject*/ )));
if (true) break;

case 15:
//C
this.state = -1;
;
 BA.debugLineNum = 417;BA.debugLine="Sleep(250)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asviewpager", "base_resize"),BA.numberCast(int.class, 250));
this.state = 19;
return;
case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 418;BA.debugLine="LoadingPanelHandling";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_loadingpanelhandling" /*void*/ );
 BA.debugLineNum = 424;BA.debugLine="End Sub";
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
public static void  _checkcarousel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckCarousel (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,897);
if (RapidSub.canDelegate("checkcarousel")) { __ref.runUserSub(false, "asviewpager","checkcarousel", __ref); return;}
ResumableSub_CheckCarousel rsub = new ResumableSub_CheckCarousel(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckCarousel extends BA.ResumableSub {
public ResumableSub_CheckCarousel(b4a.example.ef.asviewpager parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.asviewpager parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckCarousel (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,897);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 898;BA.debugLine="If m_Carousel = True Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_carousel" /*RemoteObject*/ ),parent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 899;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asviewpager", "checkcarousel"),BA.numberCast(int.class, 0));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 BA.debugLineNum = 900;BA.debugLine="If m_CurrentIndex = xclv_main.Size -1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 902;BA.debugLine="Else If m_CurrentIndex = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 901;BA.debugLine="setCurrentIndex2(0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_setcurrentindex2" /*void*/ ,(Object)(BA.numberCast(int.class, 0)));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 903;BA.debugLine="setCurrentIndex2(xclv_main.Size -1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_setcurrentindex2" /*void*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
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
 BA.debugLineNum = 906;BA.debugLine="End Sub";
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
public static void  _checkloadingpanelvisiblity(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckLoadingPanelVisiblity (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,438);
if (RapidSub.canDelegate("checkloadingpanelvisiblity")) { __ref.runUserSub(false, "asviewpager","checkloadingpanelvisiblity", __ref); return;}
ResumableSub_CheckLoadingPanelVisiblity rsub = new ResumableSub_CheckLoadingPanelVisiblity(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckLoadingPanelVisiblity extends BA.ResumableSub {
public ResumableSub_CheckLoadingPanelVisiblity(b4a.example.ef.asviewpager parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.asviewpager parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckLoadingPanelVisiblity (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,438);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 440;BA.debugLine="Sleep(250)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asviewpager", "checkloadingpanelvisiblity"),BA.numberCast(int.class, 250));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 441;BA.debugLine="If xpnl_Loading.Visible = True And isHidding = Fa";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).runMethod(true,"getVisible"),parent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_ishidding" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 442;BA.debugLine="isHidding = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ishidding" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 443;BA.debugLine="xpnl_Loading.SetVisibleAnimated(m_LoadingPanelHi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(__ref.getField(true,"_m_loadingpanelhideduration" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 444;BA.debugLine="Sleep(m_LoadingPanelHideDuration + 50)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asviewpager", "checkloadingpanelvisiblity"),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_loadingpanelhideduration" /*RemoteObject*/ ),RemoteObject.createImmutable(50)}, "+",1, 1));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 BA.debugLineNum = 445;BA.debugLine="isHidding = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ishidding" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 448;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 177;BA.debugLine="Private mEventName As String 'ignore";
asviewpager._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",asviewpager._meventname);
 //BA.debugLineNum = 178;BA.debugLine="Private mCallBack As Object 'ignore";
asviewpager._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",asviewpager._mcallback);
 //BA.debugLineNum = 179;BA.debugLine="Private mBase As B4XView 'ignore";
asviewpager._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",asviewpager._mbase);
 //BA.debugLineNum = 180;BA.debugLine="Private xui As XUI 'ignore";
asviewpager._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",asviewpager._xui);
 //BA.debugLineNum = 186;BA.debugLine="Private xclv_main As CustomListView";
asviewpager._xclv_main = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_xclv_main",asviewpager._xclv_main);
 //BA.debugLineNum = 190;BA.debugLine="Private xpnl_Loading As B4XView";
asviewpager._xpnl_loading = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_loading",asviewpager._xpnl_loading);
 //BA.debugLineNum = 193;BA.debugLine="Private m_CurrentIndex As Int = 0'ignore";
asviewpager._m_currentindex = BA.numberCast(int.class, 0);__ref.setField("_m_currentindex",asviewpager._m_currentindex);
 //BA.debugLineNum = 196;BA.debugLine="Private g_x,g_y,g_dv,g_ad As Float";
asviewpager._g_x = RemoteObject.createImmutable(0f);__ref.setField("_g_x",asviewpager._g_x);
asviewpager._g_y = RemoteObject.createImmutable(0f);__ref.setField("_g_y",asviewpager._g_y);
asviewpager._g_dv = RemoteObject.createImmutable(0f);__ref.setField("_g_dv",asviewpager._g_dv);
asviewpager._g_ad = RemoteObject.createImmutable(0f);__ref.setField("_g_ad",asviewpager._g_ad);
 //BA.debugLineNum = 197;BA.debugLine="Private g_ms As Long";
asviewpager._g_ms = RemoteObject.createImmutable(0L);__ref.setField("_g_ms",asviewpager._g_ms);
 //BA.debugLineNum = 198;BA.debugLine="Private  isfirstmove As Boolean = False";
asviewpager._isfirstmove = asviewpager.__c.getField(true,"False");__ref.setField("_isfirstmove",asviewpager._isfirstmove);
 //BA.debugLineNum = 206;BA.debugLine="Private m_Ignore As Boolean = False'Ignore";
asviewpager._m_ignore = asviewpager.__c.getField(true,"False");__ref.setField("_m_ignore",asviewpager._m_ignore);
 //BA.debugLineNum = 207;BA.debugLine="Private g_ignorepagechangedevent As Boolean = Fal";
asviewpager._g_ignorepagechangedevent = asviewpager.__c.getField(true,"False");__ref.setField("_g_ignorepagechangedevent",asviewpager._g_ignorepagechangedevent);
 //BA.debugLineNum = 208;BA.debugLine="Private g_ignorepagechangeevent As Boolean = Fals";
asviewpager._g_ignorepagechangeevent = asviewpager.__c.getField(true,"False");__ref.setField("_g_ignorepagechangeevent",asviewpager._g_ignorepagechangeevent);
 //BA.debugLineNum = 209;BA.debugLine="Private m_Orientation As String";
asviewpager._m_orientation = RemoteObject.createImmutable("");__ref.setField("_m_orientation",asviewpager._m_orientation);
 //BA.debugLineNum = 210;BA.debugLine="Private m_Carousel As Boolean";
asviewpager._m_carousel = RemoteObject.createImmutable(false);__ref.setField("_m_carousel",asviewpager._m_carousel);
 //BA.debugLineNum = 211;BA.debugLine="Private m_LazyLoading As Boolean";
asviewpager._m_lazyloading = RemoteObject.createImmutable(false);__ref.setField("_m_lazyloading",asviewpager._m_lazyloading);
 //BA.debugLineNum = 212;BA.debugLine="Private m_LazyLoadingExtraSize As Int";
asviewpager._m_lazyloadingextrasize = RemoteObject.createImmutable(0);__ref.setField("_m_lazyloadingextrasize",asviewpager._m_lazyloadingextrasize);
 //BA.debugLineNum = 213;BA.debugLine="Private m_LoadingPanelColor As Int";
asviewpager._m_loadingpanelcolor = RemoteObject.createImmutable(0);__ref.setField("_m_loadingpanelcolor",asviewpager._m_loadingpanelcolor);
 //BA.debugLineNum = 214;BA.debugLine="Private m_BackGestureGap As Boolean 'Ignore";
asviewpager._m_backgesturegap = RemoteObject.createImmutable(false);__ref.setField("_m_backgesturegap",asviewpager._m_backgesturegap);
 //BA.debugLineNum = 215;BA.debugLine="Private m_AllowNext As Boolean = True";
asviewpager._m_allownext = asviewpager.__c.getField(true,"True");__ref.setField("_m_allownext",asviewpager._m_allownext);
 //BA.debugLineNum = 216;BA.debugLine="Private m_AllowBack As Boolean = True";
asviewpager._m_allowback = asviewpager.__c.getField(true,"True");__ref.setField("_m_allowback",asviewpager._m_allowback);
 //BA.debugLineNum = 217;BA.debugLine="Private m_MaxOffset As Int = 0'Ignore";
asviewpager._m_maxoffset = BA.numberCast(int.class, 0);__ref.setField("_m_maxoffset",asviewpager._m_maxoffset);
 //BA.debugLineNum = 219;BA.debugLine="Private ismoving As Boolean = False'Ignore";
asviewpager._ismoving = asviewpager.__c.getField(true,"False");__ref.setField("_ismoving",asviewpager._ismoving);
 //BA.debugLineNum = 220;BA.debugLine="Private g_isScrollEnabled As Boolean = True";
asviewpager._g_isscrollenabled = asviewpager.__c.getField(true,"True");__ref.setField("_g_isscrollenabled",asviewpager._g_isscrollenabled);
 //BA.debugLineNum = 221;BA.debugLine="Private m_IgnoreLazyLoading As Boolean = False'Ig";
asviewpager._m_ignorelazyloading = asviewpager.__c.getField(true,"False");__ref.setField("_m_ignorelazyloading",asviewpager._m_ignorelazyloading);
 //BA.debugLineNum = 223;BA.debugLine="Public Tag As Object";
asviewpager._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",asviewpager._tag);
 //BA.debugLineNum = 224;BA.debugLine="Private isLazyLoadingReady As Boolean = False";
asviewpager._islazyloadingready = asviewpager.__c.getField(true,"False");__ref.setField("_islazyloadingready",asviewpager._islazyloadingready);
 //BA.debugLineNum = 225;BA.debugLine="Private isHidding As Boolean = False";
asviewpager._ishidding = asviewpager.__c.getField(true,"False");__ref.setField("_ishidding",asviewpager._ishidding);
 //BA.debugLineNum = 227;BA.debugLine="Private OldIndex As Int = 0";
asviewpager._oldindex = BA.numberCast(int.class, 0);__ref.setField("_oldindex",asviewpager._oldindex);
 //BA.debugLineNum = 228;BA.debugLine="Private m_LoadingPanelHideDuration As Int = 500";
asviewpager._m_loadingpanelhideduration = BA.numberCast(int.class, 500);__ref.setField("_m_loadingpanelhideduration",asviewpager._m_loadingpanelhideduration);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,755);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "asviewpager","clear", __ref);}
 BA.debugLineNum = 755;BA.debugLine="Public Sub Clear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 757;BA.debugLine="xclv_main.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 758;BA.debugLine="m_CurrentIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 762;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _commit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Commit (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,566);
if (RapidSub.canDelegate("commit")) { return __ref.runUserSub(false, "asviewpager","commit", __ref);}
 BA.debugLineNum = 566;BA.debugLine="Public Sub Commit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 567;BA.debugLine="isLazyLoadingReady = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_islazyloadingready" /*RemoteObject*/ ,asviewpager.__c.getField(true,"True"));
 BA.debugLineNum = 571;BA.debugLine="xclv_main.Refresh";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_refresh");
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "asviewpager","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 237;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 238;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 239;BA.debugLine="Tag = mBase.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 240;BA.debugLine="mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 242;BA.debugLine="xpnl_Loading = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_loading" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 243;BA.debugLine="mBase.AddView(xpnl_Loading,0,0,mBase.Width,mBase.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 244;BA.debugLine="xpnl_Loading.Color = xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 245;BA.debugLine="xpnl_Loading.BringToFront";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 247;BA.debugLine="m_Orientation = Props.GetDefault(\"Orientation\",\"H";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_orientation" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Orientation"))),(Object)((RemoteObject.createImmutable("Horizontal"))))));
 BA.debugLineNum = 248;BA.debugLine="m_Carousel = Props.GetDefault(\"Carousel\",False)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_carousel" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Carousel"))),(Object)((asviewpager.__c.getField(true,"False"))))));
 BA.debugLineNum = 249;BA.debugLine="m_LazyLoading = Props.GetDefault(\"LazyLoading\",Fa";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_lazyloading" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("LazyLoading"))),(Object)((asviewpager.__c.getField(true,"False"))))));
 BA.debugLineNum = 250;BA.debugLine="m_LazyLoadingExtraSize = Props.GetDefault(\"LazyLo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_lazyloadingextrasize" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("LazyLoadingExtraSize"))),(Object)(RemoteObject.createImmutable((5))))));
 BA.debugLineNum = 251;BA.debugLine="m_LoadingPanelColor = xui.PaintOrColorToColor(Pro";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_loadingpanelcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("LoadingPanelColor"))),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black")))))));
 BA.debugLineNum = 252;BA.debugLine="xpnl_Loading.Color = m_LoadingPanelColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_loadingpanelcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 253;BA.debugLine="m_BackGestureGap = Props.GetDefault(\"BackGestureG";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_backgesturegap" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("BackGestureGap"))),(Object)((asviewpager.__c.getField(true,"False"))))));
 BA.debugLineNum = 256;BA.debugLine="If xclv_main.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),asviewpager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 257;BA.debugLine="ini_xclv";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_ini_xclv" /*RemoteObject*/ );
 };
 BA.debugLineNum = 266;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_base_resize" /*void*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ff(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("ff (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,796);
if (RapidSub.canDelegate("ff")) { return __ref.runUserSub(false, "asviewpager","ff", __ref, _x, _y);}
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 796;BA.debugLine="Private Sub ff(x As Float,y As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 797;BA.debugLine="isfirstmove = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isfirstmove" /*RemoteObject*/ ,asviewpager.__c.getField(true,"True"));
 BA.debugLineNum = 798;BA.debugLine="g_ms=DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_ms" /*RemoteObject*/ ,asviewpager.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 799;BA.debugLine="g_x=X";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_x" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 800;BA.debugLine="g_y=Y";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_y" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 801;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_orientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
 BA.debugLineNum = 802;BA.debugLine="g_dv = (mBase.Width)/2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_dv" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),RemoteObject.createImmutable(2)}, "/",0, 0)));
 }else {
 BA.debugLineNum = 804;BA.debugLine="g_dv = (mBase.Height)/2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_dv" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")),RemoteObject.createImmutable(2)}, "/",0, 0)));
 };
 BA.debugLineNum = 806;BA.debugLine="g_ad = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_ad" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 807;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getBase (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,454);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "asviewpager","getbase", __ref);}
 BA.debugLineNum = 454;BA.debugLine="Public Sub getBase As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 455;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentIndex (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,689);
if (RapidSub.canDelegate("getcurrentindex")) { return __ref.runUserSub(false, "asviewpager","getcurrentindex", __ref);}
 BA.debugLineNum = 689;BA.debugLine="Public Sub getCurrentIndex As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 693;BA.debugLine="Return m_CurrentIndex";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_currentindex" /*RemoteObject*/ );
 BA.debugLineNum = 695;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcustomlistview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCustomListView (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,730);
if (RapidSub.canDelegate("getcustomlistview")) { return __ref.runUserSub(false, "asviewpager","getcustomlistview", __ref);}
 BA.debugLineNum = 730;BA.debugLine="Public Sub getCustomListView As CustomListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 731;BA.debugLine="Return xclv_main";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xclv_main" /*RemoteObject*/ );
 BA.debugLineNum = 732;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getisscrollenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getisScrollEnabled (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,642);
if (RapidSub.canDelegate("getisscrollenabled")) { return __ref.runUserSub(false, "asviewpager","getisscrollenabled", __ref);}
 BA.debugLineNum = 642;BA.debugLine="Public Sub getisScrollEnabled As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 643;BA.debugLine="Return g_isScrollEnabled";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_isscrollenabled" /*RemoteObject*/ );
 BA.debugLineNum = 644;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlazyloading(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLazyLoading (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,618);
if (RapidSub.canDelegate("getlazyloading")) { return __ref.runUserSub(false, "asviewpager","getlazyloading", __ref);}
 BA.debugLineNum = 618;BA.debugLine="Public Sub getLazyLoading As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 619;BA.debugLine="Return m_LazyLoading";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_lazyloading" /*RemoteObject*/ );
 BA.debugLineNum = 620;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlazyloadingextrasize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLazyLoadingExtraSize (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,629);
if (RapidSub.canDelegate("getlazyloadingextrasize")) { return __ref.runUserSub(false, "asviewpager","getlazyloadingextrasize", __ref);}
 BA.debugLineNum = 629;BA.debugLine="Public Sub getLazyLoadingExtraSize As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 630;BA.debugLine="Return m_LazyLoadingExtraSize";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_lazyloadingextrasize" /*RemoteObject*/ );
 BA.debugLineNum = 631;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getloadingpanelcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLoadingPanelColor (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,607);
if (RapidSub.canDelegate("getloadingpanelcolor")) { return __ref.runUserSub(false, "asviewpager","getloadingpanelcolor", __ref);}
 BA.debugLineNum = 607;BA.debugLine="Public Sub getLoadingPanelColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 608;BA.debugLine="Return m_LoadingPanelColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_loadingpanelcolor" /*RemoteObject*/ );
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,747);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "asviewpager","getpanel", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 747;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 751;BA.debugLine="Return xclv_main.GetPanel(Index)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));
 BA.debugLineNum = 753;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,721);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "asviewpager","getsize", __ref);}
 BA.debugLineNum = 721;BA.debugLine="Public Sub getSize As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 725;BA.debugLine="Return xclv_main.Size";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize");
 BA.debugLineNum = 727;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetValue (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,739);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "asviewpager","getvalue", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 739;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 743;BA.debugLine="Return xclv_main.GetValue(Index)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index));
 BA.debugLineNum = 745;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handletouch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("HandleTouch (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,809);
if (RapidSub.canDelegate("handletouch")) { return __ref.runUserSub(false, "asviewpager","handletouch", __ref, _action, _x, _y);}
int _i = 0;
Debug.locals.put("Action", _action);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 809;BA.debugLine="Private Sub HandleTouch(Action As Int,x As Float,y";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 815;BA.debugLine="Select Action";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_action,BA.numberCast(int.class, 2),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 817;BA.debugLine="TouchBeginEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_touchbeginevent" /*RemoteObject*/ );
 BA.debugLineNum = 818;BA.debugLine="ismoving = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ismoving" /*RemoteObject*/ ,asviewpager.__c.getField(true,"True"));
 BA.debugLineNum = 819;BA.debugLine="If isfirstmove = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isfirstmove" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 821;BA.debugLine="ff(X,y)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_ff" /*RemoteObject*/ ,(Object)(_x),(Object)(_y));
 }else {
 };
 break; }
case 1: {
 BA.debugLineNum = 828;BA.debugLine="TouchEndEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_touchendevent" /*RemoteObject*/ );
 BA.debugLineNum = 829;BA.debugLine="ismoving = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ismoving" /*RemoteObject*/ ,asviewpager.__c.getField(true,"False"));
 BA.debugLineNum = 830;BA.debugLine="isfirstmove = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isfirstmove" /*RemoteObject*/ ,asviewpager.__c.getField(true,"False"));
 BA.debugLineNum = 832;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_orientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
 BA.debugLineNum = 833;BA.debugLine="If ((DateTime.Now-g_ms)<300) And (Abs(X - g_x)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",(RemoteObject.solve(new RemoteObject[] {asviewpager.__c.getField(false,"DateTime").runMethod(true,"getNow"),__ref.getField(true,"_g_ms" /*RemoteObject*/ )}, "-",1, 2)),BA.numberCast(long.class, 300))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",asviewpager.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_g_x" /*RemoteObject*/ )}, "-",1, 0))),BA.numberCast(double.class, (asviewpager.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))))))))) { 
 BA.debugLineNum = 835;BA.debugLine="g_dv =1dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_dv" /*RemoteObject*/ ,BA.numberCast(float.class, asviewpager.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 837;BA.debugLine="If X < g_x Then g_ad = 1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_x,BA.numberCast(double.class, __ref.getField(true,"_g_x" /*RemoteObject*/ )))) { 
__ref.setField ("_g_ad" /*RemoteObject*/ ,BA.numberCast(float.class, 1));};
 };
 }else {
 BA.debugLineNum = 841;BA.debugLine="If ((DateTime.Now-g_ms)<300)  And (Abs(y - g_y";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",(RemoteObject.solve(new RemoteObject[] {asviewpager.__c.getField(false,"DateTime").runMethod(true,"getNow"),__ref.getField(true,"_g_ms" /*RemoteObject*/ )}, "-",1, 2)),BA.numberCast(long.class, 300))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",asviewpager.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_g_y" /*RemoteObject*/ )}, "-",1, 0))),BA.numberCast(double.class, (asviewpager.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))))))))) { 
 BA.debugLineNum = 842;BA.debugLine="g_dv =1dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_dv" /*RemoteObject*/ ,BA.numberCast(float.class, asviewpager.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 844;BA.debugLine="If y < g_y Then g_ad = 1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_y,BA.numberCast(double.class, __ref.getField(true,"_g_y" /*RemoteObject*/ )))) { 
__ref.setField ("_g_ad" /*RemoteObject*/ ,BA.numberCast(float.class, 1));};
 };
 };
 BA.debugLineNum = 849;BA.debugLine="For i = 0 To xclv_main.Size -1";
Debug.JustUpdateDeviceLine();
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 850;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_orientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
 BA.debugLineNum = 851;BA.debugLine="If (((i+1)*mBase.Width) - xclv_main.sv.Scroll";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 1)),__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetX")}, "-",1, 1)),BA.numberCast(double.class, (__ref.getField(true,"_g_dv" /*RemoteObject*/ ))))) { 
 BA.debugLineNum = 853;BA.debugLine="If (i+g_ad) > (xclv_main.Size -1) Or xclv_ma";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_g_ad" /*RemoteObject*/ )}, "+",1, 0)),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) || RemoteObject.solveBoolean("k",__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetX"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 854;BA.debugLine="CheckCarousel";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_checkcarousel" /*void*/ );
 BA.debugLineNum = 855;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return asviewpager.__c.getField(true,"False");
 };
 BA.debugLineNum = 858;BA.debugLine="If isNumberOneCloserToZero(g_x - x,g_y - y)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_isnumberoneclosertozero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_x" /*RemoteObject*/ ),_x}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_y" /*RemoteObject*/ ),_y}, "-",1, 0)))),asviewpager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 859;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(__ref.getField(true,"_m_currentindex" /*RemoteObject*/ )));
 BA.debugLineNum = 860;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return asviewpager.__c.getField(true,"True");
 };
 BA.debugLineNum = 862;BA.debugLine="xclv_main.ScrollToItem(i+g_ad)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_g_ad" /*RemoteObject*/ )}, "+",1, 0))));
 BA.debugLineNum = 863;BA.debugLine="If m_CurrentIndex <> (i+g_ad) Then PageChang";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_g_ad" /*RemoteObject*/ )}, "+",1, 0)))) { 
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_pagechangedevent" /*void*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_g_ad" /*RemoteObject*/ )}, "+",1, 0))),(Object)(asviewpager.__c.getField(true,"True")));};
 BA.debugLineNum = 867;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return asviewpager.__c.getField(true,"True");
 };
 }else {
 BA.debugLineNum = 871;BA.debugLine="If (((i+1)*mBase.Height) - xclv_main.sv.Scrol";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 1)),__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY")}, "-",1, 1)),BA.numberCast(double.class, (__ref.getField(true,"_g_dv" /*RemoteObject*/ ))))) { 
 BA.debugLineNum = 873;BA.debugLine="If (i+g_ad) > xclv_main.Size-1 Or  xclv_main";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_g_ad" /*RemoteObject*/ )}, "+",1, 0)),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1))) || RemoteObject.solveBoolean("k",__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 874;BA.debugLine="CheckCarousel";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_checkcarousel" /*void*/ );
 BA.debugLineNum = 875;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return asviewpager.__c.getField(true,"False");
 };
 BA.debugLineNum = 878;BA.debugLine="If isNumberOneCloserToZero(g_y - y,g_x - x)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_isnumberoneclosertozero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_y" /*RemoteObject*/ ),_y}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_x" /*RemoteObject*/ ),_x}, "-",1, 0)))),asviewpager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 879;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(__ref.getField(true,"_m_currentindex" /*RemoteObject*/ )));
 BA.debugLineNum = 880;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return asviewpager.__c.getField(true,"True");
 };
 BA.debugLineNum = 882;BA.debugLine="xclv_main.ScrollToItem(i+g_ad)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_g_ad" /*RemoteObject*/ )}, "+",1, 0))));
 BA.debugLineNum = 883;BA.debugLine="If m_CurrentIndex <> (i+g_ad) Then PageChang";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_g_ad" /*RemoteObject*/ )}, "+",1, 0)))) { 
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_pagechangedevent" /*void*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_g_ad" /*RemoteObject*/ )}, "+",1, 0))),(Object)(asviewpager.__c.getField(true,"True")));};
 BA.debugLineNum = 887;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return asviewpager.__c.getField(true,"True");
 };
 };
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 BA.debugLineNum = 892;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return asviewpager.__c.getField(true,"False");
 BA.debugLineNum = 893;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ini_xclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ini_xclv (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,287);
if (RapidSub.canDelegate("ini_xclv")) { return __ref.runUserSub(false, "asviewpager","ini_xclv", __ref);}
RemoteObject _tmplbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _tmpmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _objpages = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 287;BA.debugLine="Private Sub ini_xclv";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 288;BA.debugLine="Dim tmplbl As Label";
Debug.JustUpdateDeviceLine();
_tmplbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("tmplbl", _tmplbl);
 BA.debugLineNum = 289;BA.debugLine="tmplbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_tmplbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 291;BA.debugLine="Dim tmpmap As Map";
Debug.JustUpdateDeviceLine();
_tmpmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("tmpmap", _tmpmap);
 BA.debugLineNum = 292;BA.debugLine="tmpmap.Initialize";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 293;BA.debugLine="tmpmap.Put(\"DividerColor\",0x00FFFFFF)";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DividerColor"))),(Object)(RemoteObject.createImmutable((((int)0x00ffffff)))));
 BA.debugLineNum = 294;BA.debugLine="tmpmap.Put(\"DividerHeight\",0)";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DividerHeight"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 295;BA.debugLine="tmpmap.Put(\"PressedColor\",0x00FFFFFF)";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("PressedColor"))),(Object)(RemoteObject.createImmutable((((int)0x00ffffff)))));
 BA.debugLineNum = 296;BA.debugLine="tmpmap.Put(\"InsertAnimationDuration\",0)";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("InsertAnimationDuration"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 297;BA.debugLine="tmpmap.Put(\"ListOrientation\",m_Orientation)";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ListOrientation"))),(Object)((__ref.getField(true,"_m_orientation" /*RemoteObject*/ ))));
 BA.debugLineNum = 298;BA.debugLine="tmpmap.Put(\"ShowScrollBar\",False)";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ShowScrollBar"))),(Object)((asviewpager.__c.getField(true,"False"))));
 BA.debugLineNum = 299;BA.debugLine="xclv_main.Initialize(Me,\"xclv_main\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("xclv_main")));
 BA.debugLineNum = 300;BA.debugLine="xclv_main.DesignerCreateView(mBase,tmplbl,tmpmap)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_designercreateview",(Object)((__ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject())),(Object)(_tmplbl),(Object)(_tmpmap));
 BA.debugLineNum = 302;BA.debugLine="Private objPages As Reflector";
Debug.JustUpdateDeviceLine();
_objpages = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("objPages", _objpages);
 BA.debugLineNum = 303;BA.debugLine="objPages.Target = xclv_main.sv";
Debug.JustUpdateDeviceLine();
_objpages.setField ("Target",(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).getField(false,"_sv").getObject()));
 BA.debugLineNum = 304;BA.debugLine="objPages.SetOnTouchListener(\"xpnl_PageArea2_Touch";
Debug.JustUpdateDeviceLine();
_objpages.runVoidMethod ("SetOnTouchListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_PageArea2_Touch")));
 BA.debugLineNum = 305;BA.debugLine="xclv_main.AsView.SetLayoutAnimated(0,xclv_main.As";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 306;BA.debugLine="xclv_main.Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("Initialize (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "asviewpager","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 231;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 232;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 233;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isnumberoneclosertozero(RemoteObject __ref,RemoteObject _numberone,RemoteObject _numbertwo) throws Exception{
try {
		Debug.PushSubsStack("isNumberOneCloserToZero (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1214);
if (RapidSub.canDelegate("isnumberoneclosertozero")) { return __ref.runUserSub(false, "asviewpager","isnumberoneclosertozero", __ref, _numberone, _numbertwo);}
Debug.locals.put("numberOne", _numberone);
Debug.locals.put("numberTwo", _numbertwo);
 BA.debugLineNum = 1214;BA.debugLine="Private Sub isNumberOneCloserToZero (numberOne As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1215;BA.debugLine="Return (Abs(numberOne) >= Abs(numberTwo))";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("g",asviewpager.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _numberone))),asviewpager.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _numbertwo))))));
 BA.debugLineNum = 1216;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lazyloadingaddcontent(RemoteObject __ref,RemoteObject _parent,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("LazyLoadingAddContent (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1158);
if (RapidSub.canDelegate("lazyloadingaddcontent")) { return __ref.runUserSub(false, "asviewpager","lazyloadingaddcontent", __ref, _parent, _value);}
Debug.locals.put("Parent", _parent);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1158;BA.debugLine="Private Sub LazyLoadingAddContent(Parent As B4XVie";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1159;BA.debugLine="If isLazyLoadingReady = True And xui.SubExists(mC";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_islazyloadingready" /*RemoteObject*/ ),asviewpager.__c.getField(true,"True")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_LazyLoadingAddContent"))),(Object)(BA.numberCast(int.class, 2))))) { 
 BA.debugLineNum = 1160;BA.debugLine="CallSub3(mCallBack, mEventName & \"_LazyLoadingAd";
Debug.JustUpdateDeviceLine();
asviewpager.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_LazyLoadingAddContent"))),(Object)((_parent)),(Object)(_value));
 };
 BA.debugLineNum = 1162;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadingpanelhandling(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadingPanelHandling (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,426);
if (RapidSub.canDelegate("loadingpanelhandling")) { __ref.runUserSub(false, "asviewpager","loadingpanelhandling", __ref); return;}
ResumableSub_LoadingPanelHandling rsub = new ResumableSub_LoadingPanelHandling(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadingPanelHandling extends BA.ResumableSub {
public ResumableSub_LoadingPanelHandling(b4a.example.ef.asviewpager parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.asviewpager parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadingPanelHandling (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,426);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 427;BA.debugLine="If isHidding = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_ishidding" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 428;BA.debugLine="isHidding = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ishidding" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 430;BA.debugLine="xpnl_Loading.SetVisibleAnimated(m_LoadingPanelHi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(__ref.getField(true,"_m_loadingpanelhideduration" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 431;BA.debugLine="Sleep(m_LoadingPanelHideDuration + 50)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asviewpager", "loadingpanelhandling"),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_loadingpanelhideduration" /*RemoteObject*/ ),RemoteObject.createImmutable(50)}, "+",1, 1));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 BA.debugLineNum = 432;BA.debugLine="isHidding = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ishidding" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 434;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asviewpager", "loadingpanelhandling"),BA.numberCast(int.class, 0));
this.state = 6;
return;
case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 435;BA.debugLine="CheckLoadingPanelVisiblity";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_checkloadingpanelvisiblity" /*void*/ );
 BA.debugLineNum = 436;BA.debugLine="End Sub";
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
public static RemoteObject  _nextpage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NextPage (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,537);
if (RapidSub.canDelegate("nextpage")) { return __ref.runUserSub(false, "asviewpager","nextpage", __ref);}
 BA.debugLineNum = 537;BA.debugLine="Public Sub NextPage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 538;BA.debugLine="If m_AllowNext = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_allownext" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 542;BA.debugLine="If (m_CurrentIndex +1) < xclv_main.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)),BA.numberCast(double.class, __ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize")))) { 
 BA.debugLineNum = 543;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex +1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 544;BA.debugLine="PageChangedEvent(m_CurrentIndex +1,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_pagechangedevent" /*void*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(asviewpager.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 545;BA.debugLine="Else If m_Carousel = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_carousel" /*RemoteObject*/ ),asviewpager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 546;BA.debugLine="CheckCarousel";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_checkcarousel" /*void*/ );
 }}
;
 BA.debugLineNum = 549;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nextpage2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NextPage2 (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,551);
if (RapidSub.canDelegate("nextpage2")) { return __ref.runUserSub(false, "asviewpager","nextpage2", __ref);}
 BA.debugLineNum = 551;BA.debugLine="Public Sub NextPage2";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 552;BA.debugLine="If m_AllowNext = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_allownext" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 556;BA.debugLine="If (m_CurrentIndex +1) < xclv_main.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)),BA.numberCast(double.class, __ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize")))) { 
 BA.debugLineNum = 558;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex +1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 559;BA.debugLine="PageChangedEvent(m_CurrentIndex +1,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_pagechangedevent" /*void*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(asviewpager.__c.getField(true,"False")));
 }else 
{ BA.debugLineNum = 560;BA.debugLine="Else If m_Carousel = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_carousel" /*RemoteObject*/ ),asviewpager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 561;BA.debugLine="CheckCarousel";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_checkcarousel" /*void*/ );
 }}
;
 BA.debugLineNum = 564;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _pagechangedevent(RemoteObject __ref,RemoteObject _index,RemoteObject _delayed) throws Exception{
try {
		Debug.PushSubsStack("PageChangedEvent (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1164);
if (RapidSub.canDelegate("pagechangedevent")) { __ref.runUserSub(false, "asviewpager","pagechangedevent", __ref, _index, _delayed); return;}
ResumableSub_PageChangedEvent rsub = new ResumableSub_PageChangedEvent(null,__ref,_index,_delayed);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PageChangedEvent extends BA.ResumableSub {
public ResumableSub_PageChangedEvent(b4a.example.ef.asviewpager parent,RemoteObject __ref,RemoteObject _index,RemoteObject _delayed) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._delayed = _delayed;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.asviewpager parent;
RemoteObject _index;
RemoteObject _delayed;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PageChangedEvent (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1164);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("index", _index);
Debug.locals.put("delayed", _delayed);
 BA.debugLineNum = 1165;BA.debugLine="If m_CurrentIndex = index Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, _index))) { 
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
 BA.debugLineNum = 1166;BA.debugLine="m_CurrentIndex = index";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentindex" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 1167;BA.debugLine="If g_ignorepagechangeevent = False And xui.SubExi";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_ignorepagechangeevent" /*RemoteObject*/ ),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageChange"))),(Object)(BA.numberCast(int.class, 1))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1168;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChange\",i";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageChange"))),(Object)((_index)));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1171;BA.debugLine="m_MaxOffset = xclv_main.GetRawListItem(index).Off";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_maxoffset" /*RemoteObject*/ ,__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_index)).getField(true,"Offset"));
 BA.debugLineNum = 1173;BA.debugLine="If delayed = True Then Sleep(300)";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_delayed,parent.__c.getField(true,"True"))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asviewpager", "pagechangedevent"),BA.numberCast(int.class, 300));
this.state = 24;
return;
case 24:
//C
this.state = 16;
;
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1175;BA.debugLine="m_MaxOffset = xclv_main.GetRawListItem(index).Off";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_maxoffset" /*RemoteObject*/ ,__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_index)).getField(true,"Offset"));
 BA.debugLineNum = 1177;BA.debugLine="If g_ignorepagechangedevent = False And xui.SubEx";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_ignorepagechangedevent" /*RemoteObject*/ ),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageChanged"))),(Object)(BA.numberCast(int.class, 1))))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1178;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChanged\",";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageChanged"))),(Object)((_index)));
 if (true) break;
;
 BA.debugLineNum = 1180;BA.debugLine="If g_ignorepagechangedevent = False And xui.SubEx";
Debug.JustUpdateDeviceLine();

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_ignorepagechangedevent" /*RemoteObject*/ ),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageChanged2"))),(Object)(BA.numberCast(int.class, 2))))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1181;BA.debugLine="CallSub3(mCallBack, mEventName & \"_PageChanged2\"";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageChanged2"))),(Object)((_index)),(Object)((__ref.getField(true,"_oldindex" /*RemoteObject*/ ))));
 if (true) break;

case 23:
//C
this.state = -1;
;
 BA.debugLineNum = 1183;BA.debugLine="OldIndex = index";
Debug.JustUpdateDeviceLine();
__ref.setField ("_oldindex" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 1184;BA.debugLine="End Sub";
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
public static RemoteObject  _previouspage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PreviousPage (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,508);
if (RapidSub.canDelegate("previouspage")) { return __ref.runUserSub(false, "asviewpager","previouspage", __ref);}
 BA.debugLineNum = 508;BA.debugLine="Public Sub PreviousPage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 509;BA.debugLine="If m_AllowBack = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_allowback" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 513;BA.debugLine="If (m_CurrentIndex -1) > -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 514;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex -1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 516;BA.debugLine="PageChangedEvent(m_CurrentIndex -1,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_pagechangedevent" /*void*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(asviewpager.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 517;BA.debugLine="Else If m_Carousel = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_carousel" /*RemoteObject*/ ),asviewpager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 518;BA.debugLine="CheckCarousel";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_checkcarousel" /*void*/ );
 }}
;
 BA.debugLineNum = 521;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _previouspage2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PreviousPage2 (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,523);
if (RapidSub.canDelegate("previouspage2")) { return __ref.runUserSub(false, "asviewpager","previouspage2", __ref);}
 BA.debugLineNum = 523;BA.debugLine="Public Sub PreviousPage2";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 524;BA.debugLine="If m_AllowBack = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_allowback" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 528;BA.debugLine="If (m_CurrentIndex -1) > -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 529;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex -1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 530;BA.debugLine="PageChangedEvent(m_CurrentIndex -1,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_pagechangedevent" /*void*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(asviewpager.__c.getField(true,"False")));
 }else 
{ BA.debugLineNum = 531;BA.debugLine="Else If m_Carousel = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_carousel" /*RemoteObject*/ ),asviewpager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 532;BA.debugLine="CheckCarousel";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_checkcarousel" /*void*/ );
 }}
;
 BA.debugLineNum = 535;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removepage(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemovePage (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,495);
if (RapidSub.canDelegate("removepage")) { return __ref.runUserSub(false, "asviewpager","removepage", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 495;BA.debugLine="Public Sub RemovePage(index As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 497;BA.debugLine="xclv_main.RemoveAt(index)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(_index));
 BA.debugLineNum = 498;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_orientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
 BA.debugLineNum = 499;BA.debugLine="m_CurrentIndex = xclv_main.FindIndexFromOffset(x";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentindex" /*RemoteObject*/ ,__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetX"))));
 }else {
 BA.debugLineNum = 501;BA.debugLine="m_CurrentIndex = xclv_main.FindIndexFromOffset(x";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentindex" /*RemoteObject*/ ,__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"))));
 };
 BA.debugLineNum = 506;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetlazyloadingindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetLazyloadingIndex (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1093);
if (RapidSub.canDelegate("resetlazyloadingindex")) { return __ref.runUserSub(false, "asviewpager","resetlazyloadingindex", __ref);}
 BA.debugLineNum = 1093;BA.debugLine="Public Sub ResetLazyloadingIndex";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1095;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetlazyloadingpanels(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetLazyLoadingPanels (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,770);
if (RapidSub.canDelegate("resetlazyloadingpanels")) { return __ref.runUserSub(false, "asviewpager","resetlazyloadingpanels", __ref);}
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 770;BA.debugLine="Public Sub ResetLazyLoadingPanels";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 780;BA.debugLine="For i = 0 To xclv_main.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 781;BA.debugLine="Dim p As B4XView = xclv_main.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 783;BA.debugLine="If p.NumberOfViews > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 784;BA.debugLine="p.RemoveAllViews '<--- remove the layout";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("RemoveAllViews");
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 788;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scroll2value(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Scroll2Value (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,653);
if (RapidSub.canDelegate("scroll2value")) { return __ref.runUserSub(false, "asviewpager","scroll2value", __ref, _value);}
int _i = 0;
Debug.locals.put("Value", _value);
 BA.debugLineNum = 653;BA.debugLine="Public Sub Scroll2Value(Value As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 662;BA.debugLine="For i = 0 To xclv_main.Size -1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 663;BA.debugLine="If xclv_main.GetValue(i) Is String And Value = x";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))), RemoteObject.createImmutable("String")) && RemoteObject.solveBoolean("=",_value,BA.ObjectToString(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i)))))) { 
 BA.debugLineNum = 664;BA.debugLine="setCurrentIndex(i)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_setcurrentindex" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 665;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 669;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scroll2value2(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Scroll2Value2 (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,671);
if (RapidSub.canDelegate("scroll2value2")) { return __ref.runUserSub(false, "asviewpager","scroll2value2", __ref, _value);}
int _i = 0;
Debug.locals.put("Value", _value);
 BA.debugLineNum = 671;BA.debugLine="Public Sub Scroll2Value2(Value As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 680;BA.debugLine="For i = 0 To xclv_main.Size -1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 681;BA.debugLine="If xclv_main.GetValue(i) Is String And Value = x";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))), RemoteObject.createImmutable("String")) && RemoteObject.solveBoolean("=",_value,BA.ObjectToString(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i)))))) { 
 BA.debugLineNum = 682;BA.debugLine="setCurrentIndex2(i)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_setcurrentindex2" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 683;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 687;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setcurrentindex(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("setCurrentIndex (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,697);
if (RapidSub.canDelegate("setcurrentindex")) { __ref.runUserSub(false, "asviewpager","setcurrentindex", __ref, _index); return;}
ResumableSub_setCurrentIndex rsub = new ResumableSub_setCurrentIndex(null,__ref,_index);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_setCurrentIndex extends BA.ResumableSub {
public ResumableSub_setCurrentIndex(b4a.example.ef.asviewpager parent,RemoteObject __ref,RemoteObject _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.asviewpager parent;
RemoteObject _index;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("setCurrentIndex (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,697);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("index", _index);
 BA.debugLineNum = 701;BA.debugLine="PageChangedEvent(index,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_pagechangedevent" /*void*/ ,(Object)(_index),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 702;BA.debugLine="m_Ignore = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_ignore" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 703;BA.debugLine="xclv_main.ScrollToItem(index)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(_index));
 BA.debugLineNum = 704;BA.debugLine="Sleep(250)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asviewpager", "setcurrentindex"),BA.numberCast(int.class, 250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 705;BA.debugLine="m_Ignore = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_ignore" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 707;BA.debugLine="End Sub";
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
public static void  _setcurrentindex2(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("setCurrentIndex2 (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,709);
if (RapidSub.canDelegate("setcurrentindex2")) { __ref.runUserSub(false, "asviewpager","setcurrentindex2", __ref, _index); return;}
ResumableSub_setCurrentIndex2 rsub = new ResumableSub_setCurrentIndex2(null,__ref,_index);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_setCurrentIndex2 extends BA.ResumableSub {
public ResumableSub_setCurrentIndex2(b4a.example.ef.asviewpager parent,RemoteObject __ref,RemoteObject _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.asviewpager parent;
RemoteObject _index;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("setCurrentIndex2 (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,709);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("index", _index);
 BA.debugLineNum = 713;BA.debugLine="m_Ignore = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_ignore" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 714;BA.debugLine="PageChangedEvent(index,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_pagechangedevent" /*void*/ ,(Object)(_index),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 715;BA.debugLine="xclv_main.JumpToItem(index)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 716;BA.debugLine="Sleep(250)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asviewpager", "setcurrentindex2"),BA.numberCast(int.class, 250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 717;BA.debugLine="m_Ignore = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_ignore" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 719;BA.debugLine="End Sub";
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
public static RemoteObject  _setignorelazyloading(RemoteObject __ref,RemoteObject _ignore) throws Exception{
try {
		Debug.PushSubsStack("setIgnoreLazyLoading (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1097);
if (RapidSub.canDelegate("setignorelazyloading")) { return __ref.runUserSub(false, "asviewpager","setignorelazyloading", __ref, _ignore);}
Debug.locals.put("Ignore", _ignore);
 BA.debugLineNum = 1097;BA.debugLine="Public Sub setIgnoreLazyLoading(Ignore As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1098;BA.debugLine="m_IgnoreLazyLoading = Ignore";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_ignorelazyloading" /*RemoteObject*/ ,_ignore);
 BA.debugLineNum = 1099;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setignorepagechangedevent(RemoteObject __ref,RemoteObject _ignore) throws Exception{
try {
		Debug.PushSubsStack("setIgnorePageChangedEvent (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,646);
if (RapidSub.canDelegate("setignorepagechangedevent")) { return __ref.runUserSub(false, "asviewpager","setignorepagechangedevent", __ref, _ignore);}
Debug.locals.put("ignore", _ignore);
 BA.debugLineNum = 646;BA.debugLine="Public Sub setIgnorePageChangedEvent(ignore As Boo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 647;BA.debugLine="g_ignorepagechangedevent = ignore";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_ignorepagechangedevent" /*RemoteObject*/ ,_ignore);
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
public static RemoteObject  _setignorepagechangeevent(RemoteObject __ref,RemoteObject _ignore) throws Exception{
try {
		Debug.PushSubsStack("setIgnorePageChangeEvent (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,649);
if (RapidSub.canDelegate("setignorepagechangeevent")) { return __ref.runUserSub(false, "asviewpager","setignorepagechangeevent", __ref, _ignore);}
Debug.locals.put("ignore", _ignore);
 BA.debugLineNum = 649;BA.debugLine="Public Sub setIgnorePageChangeEvent(ignore As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 650;BA.debugLine="g_ignorepagechangeevent = ignore";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_ignorepagechangeevent" /*RemoteObject*/ ,_ignore);
 BA.debugLineNum = 651;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlazyloading(RemoteObject __ref,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("setLazyLoading (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,611);
if (RapidSub.canDelegate("setlazyloading")) { return __ref.runUserSub(false, "asviewpager","setlazyloading", __ref, _enabled);}
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 611;BA.debugLine="Public Sub setLazyLoading(Enabled As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 612;BA.debugLine="m_LazyLoading = Enabled";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_lazyloading" /*RemoteObject*/ ,_enabled);
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlazyloadingextrasize(RemoteObject __ref,RemoteObject _extrasize) throws Exception{
try {
		Debug.PushSubsStack("setLazyLoadingExtraSize (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,622);
if (RapidSub.canDelegate("setlazyloadingextrasize")) { return __ref.runUserSub(false, "asviewpager","setlazyloadingextrasize", __ref, _extrasize);}
Debug.locals.put("ExtraSize", _extrasize);
 BA.debugLineNum = 622;BA.debugLine="Public Sub setLazyLoadingExtraSize(ExtraSize As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 623;BA.debugLine="m_LazyLoadingExtraSize = ExtraSize";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_lazyloadingextrasize" /*RemoteObject*/ ,_extrasize);
 BA.debugLineNum = 627;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setloadingpanelcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setLoadingPanelColor (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,602);
if (RapidSub.canDelegate("setloadingpanelcolor")) { return __ref.runUserSub(false, "asviewpager","setloadingpanelcolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 602;BA.debugLine="Public Sub setLoadingPanelColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 603;BA.debugLine="m_LoadingPanelColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_loadingpanelcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 604;BA.debugLine="xpnl_Loading.Color = Color";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loading" /*RemoteObject*/ ).runMethod(true,"setColor",_color);
 BA.debugLineNum = 605;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setloadingpanelhideduration(RemoteObject __ref,RemoteObject _duration) throws Exception{
try {
		Debug.PushSubsStack("setLoadingPanelHideDuration (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,450);
if (RapidSub.canDelegate("setloadingpanelhideduration")) { return __ref.runUserSub(false, "asviewpager","setloadingpanelhideduration", __ref, _duration);}
Debug.locals.put("Duration", _duration);
 BA.debugLineNum = 450;BA.debugLine="Public Sub setLoadingPanelHideDuration(Duration As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 451;BA.debugLine="m_LoadingPanelHideDuration = Duration";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_loadingpanelhideduration" /*RemoteObject*/ ,_duration);
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscroll(RemoteObject __ref,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("setScroll (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,634);
if (RapidSub.canDelegate("setscroll")) { return __ref.runUserSub(false, "asviewpager","setscroll", __ref, _enabled);}
Debug.locals.put("enabled", _enabled);
 BA.debugLineNum = 634;BA.debugLine="Public Sub setScroll(enabled As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 635;BA.debugLine="g_isScrollEnabled = enabled";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_isscrollenabled" /*RemoteObject*/ ,_enabled);
 BA.debugLineNum = 640;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchbeginevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TouchBeginEvent (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1186);
if (RapidSub.canDelegate("touchbeginevent")) { return __ref.runUserSub(false, "asviewpager","touchbeginevent", __ref);}
 BA.debugLineNum = 1186;BA.debugLine="Private Sub TouchBeginEvent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1187;BA.debugLine="If ismoving = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_ismoving" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1188;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchB";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TouchBegin"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1189;BA.debugLine="CallSub(mCallBack, mEventName & \"_TouchBegin\")";
Debug.JustUpdateDeviceLine();
asviewpager.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TouchBegin"))));
 };
 };
 BA.debugLineNum = 1192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchendevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TouchEndEvent (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1194);
if (RapidSub.canDelegate("touchendevent")) { return __ref.runUserSub(false, "asviewpager","touchendevent", __ref);}
 BA.debugLineNum = 1194;BA.debugLine="Private Sub TouchEndEvent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1195;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchE";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TouchEnd"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1196;BA.debugLine="CallSub(mCallBack, mEventName & \"_TouchEnd\")";
Debug.JustUpdateDeviceLine();
asviewpager.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TouchEnd"))));
 };
 BA.debugLineNum = 1198;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xclv_main_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("xclv_main_ItemClick (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1201);
if (RapidSub.canDelegate("xclv_main_itemclick")) { return __ref.runUserSub(false, "asviewpager","xclv_main_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1201;BA.debugLine="Private Sub xclv_main_ItemClick (Index As Int, Val";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1202;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCl";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageClick"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1203;BA.debugLine="CallSub3(mCallBack, mEventName & \"_PageClick\",In";
Debug.JustUpdateDeviceLine();
asviewpager.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageClick"))),(Object)((_index)),(Object)(_value));
 };
 BA.debugLineNum = 1205;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xclv_main_reachend(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xclv_main_ReachEnd (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1144);
if (RapidSub.canDelegate("xclv_main_reachend")) { return __ref.runUserSub(false, "asviewpager","xclv_main_reachend", __ref);}
 BA.debugLineNum = 1144;BA.debugLine="Private Sub xclv_main_ReachEnd";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1145;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_ReachE";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachEnd"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1146;BA.debugLine="CallSub(mCallBack, mEventName & \"_ReachEnd\")";
Debug.JustUpdateDeviceLine();
asviewpager.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachEnd"))));
 };
 BA.debugLineNum = 1148;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xclv_main_scrollchanged(RemoteObject __ref,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("xclv_main_ScrollChanged (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1103);
if (RapidSub.canDelegate("xclv_main_scrollchanged")) { return __ref.runUserSub(false, "asviewpager","xclv_main_scrollchanged", __ref, _offset);}
Debug.locals.put("Offset", _offset);
 BA.debugLineNum = 1103;BA.debugLine="Private Sub xclv_main_ScrollChanged (Offset As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1123;BA.debugLine="If xclv_main.FindIndexFromOffset(Offset) <> m_Cur";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(_offset)),BA.numberCast(double.class, __ref.getField(true,"_m_currentindex" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("=",_offset,RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, ((RemoteObject.solveBoolean("=",__ref.getField(true,"_m_orientation" /*RemoteObject*/ ),BA.ObjectToString("Vertical"))) ? ((__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))) : ((__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))))),__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(_offset))}, "*",0, 0)) && RemoteObject.solveBoolean("=",__ref.getField(true,"_m_ignore" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1124;BA.debugLine="PageChangedEvent(xclv_main.FindIndexFromOffset(O";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_pagechangedevent" /*void*/ ,(Object)(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(_offset))),(Object)(asviewpager.__c.getField(true,"False")));
 };
 BA.debugLineNum = 1127;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Scroll";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ScrollChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1128;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ScrollChanged";
Debug.JustUpdateDeviceLine();
asviewpager.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ScrollChanged"))),(Object)((_offset)));
 };
 BA.debugLineNum = 1130;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xclv_main_visiblerangechanged(RemoteObject __ref,RemoteObject _firstindex,RemoteObject _lastindex) throws Exception{
try {
		Debug.PushSubsStack("xclv_main_VisibleRangeChanged (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,1043);
if (RapidSub.canDelegate("xclv_main_visiblerangechanged")) { return __ref.runUserSub(false, "asviewpager","xclv_main_visiblerangechanged", __ref, _firstindex, _lastindex);}
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("FirstIndex", _firstindex);
Debug.locals.put("LastIndex", _lastindex);
 BA.debugLineNum = 1043;BA.debugLine="Private Sub xclv_main_VisibleRangeChanged (FirstIn";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1054;BA.debugLine="If m_LazyLoading = False Or m_IgnoreLazyLoading =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_lazyloading" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_m_ignorelazyloading" /*RemoteObject*/ ),asviewpager.__c.getField(true,"True"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1068;BA.debugLine="For i = 0 To xclv_main.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1069;BA.debugLine="Dim p As B4XView = xclv_main.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1070;BA.debugLine="If i > FirstIndex - m_LazyLoadingExtraSize And i";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,__ref.getField(true,"_m_lazyloadingextrasize" /*RemoteObject*/ )}, "-",1, 1))) && RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,__ref.getField(true,"_m_lazyloadingextrasize" /*RemoteObject*/ )}, "+",1, 1)))) { 
 BA.debugLineNum = 1072;BA.debugLine="If p.NumberOfViews = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1073;BA.debugLine="LazyLoadingAddContent(p,xclv_main.GetValue(i))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_lazyloadingaddcontent" /*RemoteObject*/ ,(Object)(_p),(Object)(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i)))));
 };
 }else {
 BA.debugLineNum = 1077;BA.debugLine="If i > m_CurrentIndex - m_LazyLoadingExtraSize";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),__ref.getField(true,"_m_lazyloadingextrasize" /*RemoteObject*/ )}, "-",1, 1))) && RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_currentindex" /*RemoteObject*/ ),__ref.getField(true,"_m_lazyloadingextrasize" /*RemoteObject*/ )}, "+",1, 1)))) { 
 }else {
 BA.debugLineNum = 1081;BA.debugLine="If p.NumberOfViews > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1082;BA.debugLine="p.RemoveAllViews '<--- remove the layout";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("RemoveAllViews");
 };
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1089;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_pagearea2_touch(RemoteObject __ref,RemoteObject _viewtag,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("xpnl_PageArea2_Touch (asviewpager) ","asviewpager",23,__ref.getField(false, "ba"),__ref,910);
if (RapidSub.canDelegate("xpnl_pagearea2_touch")) { return __ref.runUserSub(false, "asviewpager","xpnl_pagearea2_touch", __ref, _viewtag, _action, _x, _y, _motionevent);}
RemoteObject _skipcheck = RemoteObject.createImmutable(false);
Debug.locals.put("ViewTag", _viewtag);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 910;BA.debugLine="Private Sub xpnl_PageArea2_Touch(ViewTag As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 911;BA.debugLine="If g_isScrollEnabled = False Or (m_AllowBack = Fa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_isscrollenabled" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(true,"_m_allowback" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_m_allownext" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False")))))) { 
if (true) return asviewpager.__c.getField(true,"True");};
 BA.debugLineNum = 914;BA.debugLine="If m_AllowNext = False Or m_AllowBack = False The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_allownext" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_m_allowback" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 916;BA.debugLine="Dim SkipCheck As Boolean = False";
Debug.JustUpdateDeviceLine();
_skipcheck = asviewpager.__c.getField(true,"False");Debug.locals.put("SkipCheck", _skipcheck);Debug.locals.put("SkipCheck", _skipcheck);
 BA.debugLineNum = 917;BA.debugLine="If Action = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 918;BA.debugLine="isfirstmove = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isfirstmove" /*RemoteObject*/ ,asviewpager.__c.getField(true,"False"));
 BA.debugLineNum = 919;BA.debugLine="SkipCheck = True";
Debug.JustUpdateDeviceLine();
_skipcheck = asviewpager.__c.getField(true,"True");Debug.locals.put("SkipCheck", _skipcheck);
 };
 BA.debugLineNum = 922;BA.debugLine="If isfirstmove = False And SkipCheck = False The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isfirstmove" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_skipcheck,asviewpager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 924;BA.debugLine="ff(X,y)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.asviewpager.class, "_ff" /*RemoteObject*/ ,(Object)(_x),(Object)(_y));
 BA.debugLineNum = 926;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return asviewpager.__c.getField(true,"True");
 };
 BA.debugLineNum = 929;BA.debugLine="If m_AllowNext = False And x < g_x Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_allownext" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False")) && RemoteObject.solveBoolean("<",_x,BA.numberCast(double.class, __ref.getField(true,"_g_x" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 930;BA.debugLine="xclv_main.sv.ScrollViewOffsetX = m_MaxOffset";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setScrollViewOffsetX",__ref.getField(true,"_m_maxoffset" /*RemoteObject*/ ));
 BA.debugLineNum = 932;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return asviewpager.__c.getField(true,"True");
 }else 
{ BA.debugLineNum = 933;BA.debugLine="else If m_AllowBack = False And x > g_x Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_allowback" /*RemoteObject*/ ),asviewpager.__c.getField(true,"False")) && RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, __ref.getField(true,"_g_x" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 934;BA.debugLine="xclv_main.sv.ScrollViewOffsetX = m_MaxOffset";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setScrollViewOffsetX",__ref.getField(true,"_m_maxoffset" /*RemoteObject*/ ));
 BA.debugLineNum = 936;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return asviewpager.__c.getField(true,"True");
 }}
;
 };
 BA.debugLineNum = 944;BA.debugLine="Return HandleTouch(Action,x,y)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.ef.asviewpager.class, "_handletouch" /*RemoteObject*/ ,(Object)(_action),(Object)(_x),(Object)(_y));
 BA.debugLineNum = 945;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}