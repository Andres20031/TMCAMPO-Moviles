package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sd_xcombobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.sd_xcombobox");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.sd_xcombobox.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _outlistpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _listpanel = null;
public anywheresoftware.b4a.objects.collections.List _listitem = null;
public int _selindex = 0;
public int _findindex = 0;
public boolean _editable = false;
public int _corner = 0;
public String _style = "";
public String _align = "";
public String _textalign = "";
public boolean _modintern = false;
public int _bclr = 0;
public boolean _rtl = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _labelhint = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mylabel = null;
public int _cornercolor = 0;
public int _kbh = 0;
public int _itemheight = 0;
public boolean _opendropdownonfocus = false;
public boolean _selectonlyfromlist = false;
public anywheresoftware.b4a.objects.IME _kk = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _add(b4a.example.ef.sd_xcombobox __ref,String _text,Object _returnvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "add", true))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_text,_returnvalue}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=63635456;
 //BA.debugLineNum = 63635456;BA.debugLine="Public Sub Add(Text As String, ReturnValue As Obje";
RDebugUtils.currentLine=63635457;
 //BA.debugLineNum = 63635457;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63635458;
 //BA.debugLineNum = 63635458;BA.debugLine="M.Initialize";
_m.Initialize();
RDebugUtils.currentLine=63635459;
 //BA.debugLineNum = 63635459;BA.debugLine="M.Put(\"Text\",Text)";
_m.Put((Object)("Text"),(Object)(_text));
RDebugUtils.currentLine=63635460;
 //BA.debugLineNum = 63635460;BA.debugLine="M.Put(\"Value\",ReturnValue)";
_m.Put((Object)("Value"),_returnvalue);
RDebugUtils.currentLine=63635461;
 //BA.debugLineNum = 63635461;BA.debugLine="M.Put(\"object\",Null)";
_m.Put((Object)("object"),__c.Null);
RDebugUtils.currentLine=63635462;
 //BA.debugLineNum = 63635462;BA.debugLine="ListItem.Add(M)";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m.getObject()));
RDebugUtils.currentLine=63635464;
 //BA.debugLineNum = 63635464;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=63832064;
 //BA.debugLineNum = 63832064;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=63832065;
 //BA.debugLineNum = 63832065;BA.debugLine="ListItem.Clear";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=63832066;
 //BA.debugLineNum = 63832066;BA.debugLine="SelIndex=-1";
__ref._selindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=63832068;
 //BA.debugLineNum = 63832068;BA.debugLine="if Editable then  MyLabel.EditTextHint=\"<none>\"";
if (__ref._editable /*boolean*/ ) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEditTextHint(BA.ObjectToCharSequence("<none>"));};
RDebugUtils.currentLine=63832069;
 //BA.debugLineNum = 63832069;BA.debugLine="MyLabel.Text=\"\"";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=63832070;
 //BA.debugLineNum = 63832070;BA.debugLine="End Sub";
return "";
}
public String  _getitem(b4a.example.ef.sd_xcombobox __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getitem", true))
	 {return ((String) Debug.delegate(ba, "getitem", new Object[] {_position}));}
String _ret = "";
RDebugUtils.currentLine=64094208;
 //BA.debugLineNum = 64094208;BA.debugLine="Public Sub GetItem(Position As Int) As String";
RDebugUtils.currentLine=64094209;
 //BA.debugLineNum = 64094209;BA.debugLine="Dim Ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=64094212;
 //BA.debugLineNum = 64094212;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=64094213;
 //BA.debugLineNum = 64094213;BA.debugLine="Ret=ListItem.Get(Position).As(Map).Get(\"Text\")";
_ret = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_position)))).Get((Object)("Text")));
 };
RDebugUtils.currentLine=64094215;
 //BA.debugLineNum = 64094215;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=64094216;
 //BA.debugLineNum = 64094216;BA.debugLine="End Sub";
return "";
}
public String  _addall(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.objects.collections.List _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "addall", true))
	 {return ((String) Debug.delegate(ba, "addall", new Object[] {_l}));}
String _text = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=63700992;
 //BA.debugLineNum = 63700992;BA.debugLine="Public Sub AddAll(L As List)";
RDebugUtils.currentLine=63700993;
 //BA.debugLineNum = 63700993;BA.debugLine="For Each text As String In L";
{
final anywheresoftware.b4a.BA.IterableList group1 = _l;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_text = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=63700994;
 //BA.debugLineNum = 63700994;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63700995;
 //BA.debugLineNum = 63700995;BA.debugLine="M.Initialize";
_m.Initialize();
RDebugUtils.currentLine=63700996;
 //BA.debugLineNum = 63700996;BA.debugLine="M.Put(\"Text\",text)";
_m.Put((Object)("Text"),(Object)(_text));
RDebugUtils.currentLine=63700997;
 //BA.debugLineNum = 63700997;BA.debugLine="M.Put(\"Value\",text)";
_m.Put((Object)("Value"),(Object)(_text));
RDebugUtils.currentLine=63700998;
 //BA.debugLineNum = 63700998;BA.debugLine="M.Put(\"object\",Null)";
_m.Put((Object)("object"),__c.Null);
RDebugUtils.currentLine=63701000;
 //BA.debugLineNum = 63701000;BA.debugLine="ListItem.Add(M)";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m.getObject()));
 }
};
RDebugUtils.currentLine=63701003;
 //BA.debugLineNum = 63701003;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.ef.sd_xcombobox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=62849024;
 //BA.debugLineNum = 62849024;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=62849025;
 //BA.debugLineNum = 62849025;BA.debugLine="If Style=\"Classic\" Then";
if ((__ref._style /*String*/ ).equals("Classic")) { 
RDebugUtils.currentLine=62849026;
 //BA.debugLineNum = 62849026;BA.debugLine="MyLabel.Width=Width-10dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width-__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=62849027;
 //BA.debugLineNum = 62849027;BA.debugLine="MyLabel.Height=Height-30dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height-__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=62849028;
 //BA.debugLineNum = 62849028;BA.debugLine="LabelHint.Width=Width";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width));
 }else {
RDebugUtils.currentLine=62849030;
 //BA.debugLineNum = 62849030;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=62849031;
 //BA.debugLineNum = 62849031;BA.debugLine="MyLabel.Width=Width-50dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width-__c.DipToCurrent((int) (50))));
RDebugUtils.currentLine=62849032;
 //BA.debugLineNum = 62849032;BA.debugLine="MyLabel.Height=Height";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
RDebugUtils.currentLine=62849033;
 //BA.debugLineNum = 62849033;BA.debugLine="LabelHint.Left=Width-45dip";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (_width-__c.DipToCurrent((int) (45))));
RDebugUtils.currentLine=62849034;
 //BA.debugLineNum = 62849034;BA.debugLine="LabelHint.Height=Height";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
 }else {
RDebugUtils.currentLine=62849036;
 //BA.debugLineNum = 62849036;BA.debugLine="MyLabel.Width=Width-50dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width-__c.DipToCurrent((int) (50))));
RDebugUtils.currentLine=62849037;
 //BA.debugLineNum = 62849037;BA.debugLine="MyLabel.Height=Height";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
RDebugUtils.currentLine=62849038;
 //BA.debugLineNum = 62849038;BA.debugLine="LabelHint.Height=Height";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
 };
 };
RDebugUtils.currentLine=62849045;
 //BA.debugLineNum = 62849045;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
RDebugUtils.currentLine=62652416;
 //BA.debugLineNum = 62652416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=62652417;
 //BA.debugLineNum = 62652417;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=62652418;
 //BA.debugLineNum = 62652418;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=62652419;
 //BA.debugLineNum = 62652419;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=62652420;
 //BA.debugLineNum = 62652420;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=62652421;
 //BA.debugLineNum = 62652421;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=62652423;
 //BA.debugLineNum = 62652423;BA.debugLine="Private outListPanel As B4XView";
_outlistpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=62652424;
 //BA.debugLineNum = 62652424;BA.debugLine="Private ListPanel As B4XView";
_listpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=62652425;
 //BA.debugLineNum = 62652425;BA.debugLine="Private ListItem As List";
_listitem = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62652426;
 //BA.debugLineNum = 62652426;BA.debugLine="Private SelIndex As Int";
_selindex = 0;
RDebugUtils.currentLine=62652427;
 //BA.debugLineNum = 62652427;BA.debugLine="Private FindIndex As Int = -1";
_findindex = (int) (-1);
RDebugUtils.currentLine=62652429;
 //BA.debugLineNum = 62652429;BA.debugLine="Private Editable As Boolean";
_editable = false;
RDebugUtils.currentLine=62652430;
 //BA.debugLineNum = 62652430;BA.debugLine="Private Corner As Int";
_corner = 0;
RDebugUtils.currentLine=62652431;
 //BA.debugLineNum = 62652431;BA.debugLine="Private Style As String = \"Frame\"";
_style = "Frame";
RDebugUtils.currentLine=62652432;
 //BA.debugLineNum = 62652432;BA.debugLine="Private Align As String = \"CENTER\"";
_align = "CENTER";
RDebugUtils.currentLine=62652433;
 //BA.debugLineNum = 62652433;BA.debugLine="Private TextAlign As String = \"LEFT\"";
_textalign = "LEFT";
RDebugUtils.currentLine=62652434;
 //BA.debugLineNum = 62652434;BA.debugLine="Private ModIntern As Boolean=False";
_modintern = __c.False;
RDebugUtils.currentLine=62652435;
 //BA.debugLineNum = 62652435;BA.debugLine="Private BClr As Int";
_bclr = 0;
RDebugUtils.currentLine=62652436;
 //BA.debugLineNum = 62652436;BA.debugLine="Private RTL As Boolean = False";
_rtl = __c.False;
RDebugUtils.currentLine=62652437;
 //BA.debugLineNum = 62652437;BA.debugLine="Private LabelHint As B4XView";
_labelhint = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=62652438;
 //BA.debugLineNum = 62652438;BA.debugLine="Private MyLabel As B4XView";
_mylabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=62652439;
 //BA.debugLineNum = 62652439;BA.debugLine="Private CornerColor As Int";
_cornercolor = 0;
RDebugUtils.currentLine=62652441;
 //BA.debugLineNum = 62652441;BA.debugLine="Private kbh As Int = 0";
_kbh = (int) (0);
RDebugUtils.currentLine=62652442;
 //BA.debugLineNum = 62652442;BA.debugLine="Public ItemHeight As Int";
_itemheight = 0;
RDebugUtils.currentLine=62652443;
 //BA.debugLineNum = 62652443;BA.debugLine="Public OpenDropDownOnFocus As Boolean";
_opendropdownonfocus = false;
RDebugUtils.currentLine=62652444;
 //BA.debugLineNum = 62652444;BA.debugLine="Public SelectOnlyFromList As Boolean = False";
_selectonlyfromlist = __c.False;
RDebugUtils.currentLine=62652447;
 //BA.debugLineNum = 62652447;BA.debugLine="Private kk As IME";
_kk = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=62652449;
 //BA.debugLineNum = 62652449;BA.debugLine="End Sub";
return "";
}
public String  _closedropdown(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "closedropdown", true))
	 {return ((String) Debug.delegate(ba, "closedropdown", null));}
RDebugUtils.currentLine=63963136;
 //BA.debugLineNum = 63963136;BA.debugLine="Public Sub CloseDropDown";
RDebugUtils.currentLine=63963137;
 //BA.debugLineNum = 63963137;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=63963138;
 //BA.debugLineNum = 63963138;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.ef.sd_xcombobox __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=65601536;
 //BA.debugLineNum = 65601536;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=65601537;
 //BA.debugLineNum = 65601537;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=65601538;
 //BA.debugLineNum = 65601538;BA.debugLine="L.Initialize(EventName)";
_l.Initialize(ba,_eventname);
RDebugUtils.currentLine=65601539;
 //BA.debugLineNum = 65601539;BA.debugLine="Return L";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l.getObject()));
RDebugUtils.currentLine=65601540;
 //BA.debugLineNum = 65601540;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextview(b4a.example.ef.sd_xcombobox __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "createtextview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.EditTextWrapper _t = null;
RDebugUtils.currentLine=65667072;
 //BA.debugLineNum = 65667072;BA.debugLine="Private Sub CreateTextView(EventName As String) As";
RDebugUtils.currentLine=65667074;
 //BA.debugLineNum = 65667074;BA.debugLine="Dim T As EditText";
_t = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=65667075;
 //BA.debugLineNum = 65667075;BA.debugLine="T.Initialize(EventName)";
_t.Initialize(ba,_eventname);
RDebugUtils.currentLine=65667083;
 //BA.debugLineNum = 65667083;BA.debugLine="Return T";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_t.getObject()));
RDebugUtils.currentLine=65667084;
 //BA.debugLineNum = 65667084;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4a.example.ef.sd_xcombobox __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XCanvas _can = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rec = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _path = null;
RDebugUtils.currentLine=62783488;
 //BA.debugLineNum = 62783488;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=62783489;
 //BA.debugLineNum = 62783489;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=62783490;
 //BA.debugLineNum = 62783490;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=62783491;
 //BA.debugLineNum = 62783491;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=62783493;
 //BA.debugLineNum = 62783493;BA.debugLine="If Props.ContainsKey(\"RTL\") Then RTL=Props.Get(\"R";
if (_props.ContainsKey((Object)("RTL"))) { 
__ref._rtl /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("RTL")));};
RDebugUtils.currentLine=62783494;
 //BA.debugLineNum = 62783494;BA.debugLine="If Props.ContainsKey(\"Style\") Then Style=Props.Ge";
if (_props.ContainsKey((Object)("Style"))) { 
__ref._style /*String*/  = BA.ObjectToString(_props.Get((Object)("Style")));};
RDebugUtils.currentLine=62783495;
 //BA.debugLineNum = 62783495;BA.debugLine="If Props.ContainsKey(\"Align\") Then Align=Props.Ge";
if (_props.ContainsKey((Object)("Align"))) { 
__ref._align /*String*/  = BA.ObjectToString(_props.Get((Object)("Align")));};
RDebugUtils.currentLine=62783496;
 //BA.debugLineNum = 62783496;BA.debugLine="If Props.ContainsKey(\"TextAlign\") Then TextAlign=";
if (_props.ContainsKey((Object)("TextAlign"))) { 
__ref._textalign /*String*/  = BA.ObjectToString(_props.Get((Object)("TextAlign")));};
RDebugUtils.currentLine=62783497;
 //BA.debugLineNum = 62783497;BA.debugLine="If Props.ContainsKey(\"CornerColor\") Then CornerCo";
if (_props.ContainsKey((Object)("CornerColor"))) { 
__ref._cornercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CornerColor")));}
else {
__ref._cornercolor /*int*/  = __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor();};
RDebugUtils.currentLine=62783498;
 //BA.debugLineNum = 62783498;BA.debugLine="If Props.ContainsKey(\"Background\") Then	BClr=xui.";
if (_props.ContainsKey((Object)("Background"))) { 
__ref._bclr /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Background")));}
else {
__ref._bclr /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor();};
RDebugUtils.currentLine=62783499;
 //BA.debugLineNum = 62783499;BA.debugLine="If Props.ContainsKey(\"Editable\") Then Editable=Pr";
if (_props.ContainsKey((Object)("Editable"))) { 
__ref._editable /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Editable")));};
RDebugUtils.currentLine=62783500;
 //BA.debugLineNum = 62783500;BA.debugLine="Corner=Props.Get(\"Corner\")";
__ref._corner /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Corner"))));
RDebugUtils.currentLine=62783501;
 //BA.debugLineNum = 62783501;BA.debugLine="Corner=Corner*(100dip/100)";
__ref._corner /*int*/  = (int) (__ref._corner /*int*/ *(__c.DipToCurrent((int) (100))/(double)100));
RDebugUtils.currentLine=62783509;
 //BA.debugLineNum = 62783509;BA.debugLine="If Editable Then MyLabel=CreateTextView(\"MyLabel\"";
if (__ref._editable /*boolean*/ ) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"MyLabel");}
else {
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"MyLabel");};
RDebugUtils.currentLine=62783511;
 //BA.debugLineNum = 62783511;BA.debugLine="MyLabel.TextColor=Lbl.As(B4XView).TextColor";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getTextColor());
RDebugUtils.currentLine=62783512;
 //BA.debugLineNum = 62783512;BA.debugLine="MyLabel.TextSize=Lbl.As(B4XView).TextSize";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getTextSize());
RDebugUtils.currentLine=62783513;
 //BA.debugLineNum = 62783513;BA.debugLine="MyLabel.Font=Lbl.As(B4XView).Font";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getFont());
RDebugUtils.currentLine=62783514;
 //BA.debugLineNum = 62783514;BA.debugLine="If Editable = False Then MyLabel.SetTextAlignment";
if (__ref._editable /*boolean*/ ==__c.False) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER",__ref._textalign /*String*/ );};
RDebugUtils.currentLine=62783515;
 //BA.debugLineNum = 62783515;BA.debugLine="MyLabel.Color=xui.Color_Transparent";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=62783516;
 //BA.debugLineNum = 62783516;BA.debugLine="MyLabel.Text=Lbl.As(B4XView).Text";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getText()));
RDebugUtils.currentLine=62783517;
 //BA.debugLineNum = 62783517;BA.debugLine="If Editable Then MyLabel.EditTextHint=\"<none>\"";
if (__ref._editable /*boolean*/ ) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEditTextHint(BA.ObjectToCharSequence("<none>"));};
RDebugUtils.currentLine=62783519;
 //BA.debugLineNum = 62783519;BA.debugLine="LabelHint.Text=Chr(0xF006) 'lbx.EditTextHint";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf006))));
RDebugUtils.currentLine=62783520;
 //BA.debugLineNum = 62783520;BA.debugLine="LabelHint.TextColor=MyLabel.TextColor";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=62783521;
 //BA.debugLineNum = 62783521;BA.debugLine="LabelHint.Color=xui.Color_Transparent";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=62783522;
 //BA.debugLineNum = 62783522;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=62783523;
 //BA.debugLineNum = 62783523;BA.debugLine="LabelHint.Font=xui.CreateFontAwesome(MyLabel.Font";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont().getSize()));
RDebugUtils.currentLine=62783525;
 //BA.debugLineNum = 62783525;BA.debugLine="Select Style";
switch (BA.switchObjectToInt(__ref._style /*String*/ ,"Frame","Bead","Classic")) {
case 0: {
RDebugUtils.currentLine=62783527;
 //BA.debugLineNum = 62783527;BA.debugLine="mBase.SetColorAndBorder(BClr,1dip,CornerColor,C";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._bclr /*int*/ ,__c.DipToCurrent((int) (1)),__ref._cornercolor /*int*/ ,__ref._corner /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=62783529;
 //BA.debugLineNum = 62783529;BA.debugLine="LabelHint.TextColor=BClr";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=62783530;
 //BA.debugLineNum = 62783530;BA.debugLine="LabelHint.SetColorAndBorder(CornerColor,0dip,xu";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._cornercolor /*int*/ ,__c.DipToCurrent((int) (0)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=62783532;
 //BA.debugLineNum = 62783532;BA.debugLine="Dim Can As B4XCanvas";
_can = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=62783533;
 //BA.debugLineNum = 62783533;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=62783535;
 //BA.debugLineNum = 62783535;BA.debugLine="Can.Initialize(mBase)";
_can.Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=62783536;
 //BA.debugLineNum = 62783536;BA.debugLine="Rec.Initialize(20dip,mBase.Height/2,mBase.Width";
_rec.Initialize((float) (__c.DipToCurrent((int) (20))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (20))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=62783537;
 //BA.debugLineNum = 62783537;BA.debugLine="Can.DrawRect(Rec,CornerColor,True,0dip)";
_can.DrawRect(_rec,__ref._cornercolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (0))));
RDebugUtils.currentLine=62783538;
 //BA.debugLineNum = 62783538;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=62783539;
 //BA.debugLineNum = 62783539;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=62783540;
 //BA.debugLineNum = 62783540;BA.debugLine="Rec.Initialize(0dip,0dip,mBase.Width-45dip,mBa";
_rec.Initialize((float) (__c.DipToCurrent((int) (0))),(float) (__c.DipToCurrent((int) (0))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (45))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=62783541;
 //BA.debugLineNum = 62783541;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=62783542;
 //BA.debugLineNum = 62783542;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=62783543;
 //BA.debugLineNum = 62783543;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
_can.DrawPath(_path,__ref._bclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (0))));
 }else {
RDebugUtils.currentLine=62783545;
 //BA.debugLineNum = 62783545;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=62783546;
 //BA.debugLineNum = 62783546;BA.debugLine="Rec.Initialize(45dip,0dip,mBase.Width,mBase.He";
_rec.Initialize((float) (__c.DipToCurrent((int) (45))),(float) (__c.DipToCurrent((int) (0))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=62783547;
 //BA.debugLineNum = 62783547;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=62783548;
 //BA.debugLineNum = 62783548;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=62783549;
 //BA.debugLineNum = 62783549;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
_can.DrawPath(_path,__ref._bclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (0))));
 };
RDebugUtils.currentLine=62783551;
 //BA.debugLineNum = 62783551;BA.debugLine="Can.Invalidate";
_can.Invalidate();
 break; }
case 2: {
RDebugUtils.currentLine=62783553;
 //BA.debugLineNum = 62783553;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=62783554;
 //BA.debugLineNum = 62783554;BA.debugLine="LabelHint.Font=xui.CreateDefaultBoldFont(MyLabe";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont().getSize()-3)));
RDebugUtils.currentLine=62783555;
 //BA.debugLineNum = 62783555;BA.debugLine="LabelHint.Text=\"Set Hint\"";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Set Hint"));
 break; }
}
;
RDebugUtils.currentLine=62783558;
 //BA.debugLineNum = 62783558;BA.debugLine="If Style=\"Classic\" Then";
if ((__ref._style /*String*/ ).equals("Classic")) { 
RDebugUtils.currentLine=62783559;
 //BA.debugLineNum = 62783559;BA.debugLine="mBase.AddView(MyLabel,0dip,30dip,mBase.Width,mBa";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (30)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=62783560;
 //BA.debugLineNum = 62783560;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,mBase.Width-10";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=62783561;
 //BA.debugLineNum = 62783561;BA.debugLine="MyLabel.SetColorAndBorder(BClr,1dip,CornerColor,";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._bclr /*int*/ ,__c.DipToCurrent((int) (1)),__ref._cornercolor /*int*/ ,__ref._corner /*int*/ );
RDebugUtils.currentLine=62783562;
 //BA.debugLineNum = 62783562;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=62783563;
 //BA.debugLineNum = 62783563;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=62783564;
 //BA.debugLineNum = 62783564;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"RIGHT\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=62783568;
 //BA.debugLineNum = 62783568;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 }else {
RDebugUtils.currentLine=62783571;
 //BA.debugLineNum = 62783571;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"LEFT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=62783572;
 //BA.debugLineNum = 62783572;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"LEFT\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=62783576;
 //BA.debugLineNum = 62783576;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 };
 }else {
RDebugUtils.currentLine=62783580;
 //BA.debugLineNum = 62783580;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=62783581;
 //BA.debugLineNum = 62783581;BA.debugLine="mBase.AddView(LabelHint,mBase.Width-45dip,0dip,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (45))),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=62783582;
 //BA.debugLineNum = 62783582;BA.debugLine="mBase.AddView(MyLabel,5dip,0dip,mBase.Width-50d";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (50))),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=62783588;
 //BA.debugLineNum = 62783588;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=62783589;
 //BA.debugLineNum = 62783589;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 }else {
RDebugUtils.currentLine=62783592;
 //BA.debugLineNum = 62783592;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,40dip,mBase.H";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=62783593;
 //BA.debugLineNum = 62783593;BA.debugLine="mBase.AddView(MyLabel,50dip,0dip,mBase.Width-50";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (0)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (50))),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=62783597;
 //BA.debugLineNum = 62783597;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"LEFT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
 };
 };
RDebugUtils.currentLine=62783601;
 //BA.debugLineNum = 62783601;BA.debugLine="End Sub";
return "";
}
public void  _drawlistbox(b4a.example.ef.sd_xcombobox __ref) throws Exception{
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "drawlistbox", true))
	 {Debug.delegate(ba, "drawlistbox", null); return;}
ResumableSub_DrawListBox rsub = new ResumableSub_DrawListBox(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_DrawListBox extends BA.ResumableSub {
public ResumableSub_DrawListBox(b4a.example.ef.sd_xcombobox parent,b4a.example.ef.sd_xcombobox __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.sd_xcombobox __ref;
b4a.example.ef.sd_xcombobox parent;
int _height = 0;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
int step5;
int limit5;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="sd_xcombobox";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65536001;
 //BA.debugLineNum = 65536001;BA.debugLine="Dim Height As Int = 0";
_height = (int) (0);
RDebugUtils.currentLine=65536003;
 //BA.debugLineNum = 65536003;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_OpenLis";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OpenList",(int) (0))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OpenList");
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=65536005;
 //BA.debugLineNum = 65536005;BA.debugLine="ListPanel.As(ScrollView).Panel.RemoveAllViews";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).getPanel().RemoveAllViews();
RDebugUtils.currentLine=65536006;
 //BA.debugLineNum = 65536006;BA.debugLine="ListPanel.Color=MyLabel.TextColor";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=65536012;
 //BA.debugLineNum = 65536012;BA.debugLine="For i=0 To ListItem.Size-1";
if (true) break;

case 7:
//for
this.state = 10;
step5 = 1;
limit5 = (int) (__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 9:
//C
this.state = 25;
RDebugUtils.currentLine=65536013;
 //BA.debugLineNum = 65536013;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=65536014;
 //BA.debugLineNum = 65536014;BA.debugLine="Dim L As B4XView = CreateLabel(\"LabSelect\")";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"LabSelect");
RDebugUtils.currentLine=65536015;
 //BA.debugLineNum = 65536015;BA.debugLine="L.Color=BClr";
_l.setColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=65536016;
 //BA.debugLineNum = 65536016;BA.debugLine="L.TextColor=MyLabel.TextColor";
_l.setTextColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=65536017;
 //BA.debugLineNum = 65536017;BA.debugLine="L.Text=v.Get(\"Text\")";
_l.setText(BA.ObjectToCharSequence(_v.Get((Object)("Text"))));
RDebugUtils.currentLine=65536018;
 //BA.debugLineNum = 65536018;BA.debugLine="L.SetTextAlignment(\"CENTER\",Align)";
_l.SetTextAlignment("CENTER",__ref._align /*String*/ );
RDebugUtils.currentLine=65536019;
 //BA.debugLineNum = 65536019;BA.debugLine="L.Tag=i";
_l.setTag((Object)(_i));
RDebugUtils.currentLine=65536020;
 //BA.debugLineNum = 65536020;BA.debugLine="v.Put(\"object\",L)";
_v.Put((Object)("object"),(Object)(_l.getObject()));
RDebugUtils.currentLine=65536024;
 //BA.debugLineNum = 65536024;BA.debugLine="ListPanel.As(ScrollView).Panel.AddView(L,1dip,H";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).getPanel().AddView((android.view.View)(_l.getObject()),parent.__c.DipToCurrent((int) (1)),_height,(int) (__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-parent.__c.DipToCurrent((int) (2))),(int) (__ref._itemheight /*int*/ -parent.__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=65536029;
 //BA.debugLineNum = 65536029;BA.debugLine="Height=Height+ItemHeight";
_height = (int) (_height+__ref._itemheight /*int*/ );
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=65536033;
 //BA.debugLineNum = 65536033;BA.debugLine="ListPanel.As(ScrollView).Panel.Height=Height";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).getPanel().setHeight(_height);
RDebugUtils.currentLine=65536038;
 //BA.debugLineNum = 65536038;BA.debugLine="ListPanel.ScrollViewContentHeight=Height";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentHeight(_height);
RDebugUtils.currentLine=65536039;
 //BA.debugLineNum = 65536039;BA.debugLine="If Height<ListPanel.Height Then";
if (true) break;

case 11:
//if
this.state = 20;
if (_height<__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=65536040;
 //BA.debugLineNum = 65536040;BA.debugLine="If ListPanel.Top=0 Then";
if (true) break;

case 14:
//if
this.state = 19;
if (__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()==0) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=65536041;
 //BA.debugLineNum = 65536041;BA.debugLine="ListPanel.top=ListPanel.Height-Height";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_height));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=65536043;
 //BA.debugLineNum = 65536043;BA.debugLine="ListPanel.Height=Height";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(_height);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;
;
RDebugUtils.currentLine=65536046;
 //BA.debugLineNum = 65536046;BA.debugLine="If SelIndex>-1 Then";

case 20:
//if
this.state = 23;
if (__ref._selindex /*int*/ >-1) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=65536047;
 //BA.debugLineNum = 65536047;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "sd_xcombobox", "drawlistbox"),(int) (0));
this.state = 26;
return;
case 26:
//C
this.state = 23;
;
RDebugUtils.currentLine=65536048;
 //BA.debugLineNum = 65536048;BA.debugLine="setSelectedIndex(SelIndex)";
__ref._setselectedindex /*String*/ (null,__ref._selindex /*int*/ );
 if (true) break;

case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=65536050;
 //BA.debugLineNum = 65536050;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setselectedindex(b4a.example.ef.sd_xcombobox __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setselectedindex", true))
	 {return ((String) Debug.delegate(ba, "setselectedindex", new Object[] {_position}));}
int _pos = 0;
RDebugUtils.currentLine=64290816;
 //BA.debugLineNum = 64290816;BA.debugLine="Public Sub setSelectedIndex(Position As Int)";
RDebugUtils.currentLine=64290817;
 //BA.debugLineNum = 64290817;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=64290818;
 //BA.debugLineNum = 64290818;BA.debugLine="SelIndex=Position";
__ref._selindex /*int*/  = _position;
RDebugUtils.currentLine=64290819;
 //BA.debugLineNum = 64290819;BA.debugLine="MyLabel.Text=GetItem(Position)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,_position)));
RDebugUtils.currentLine=64290821;
 //BA.debugLineNum = 64290821;BA.debugLine="Dim Pos As Int = ItemHeight * Position";
_pos = (int) (__ref._itemheight /*int*/ *_position);
RDebugUtils.currentLine=64290823;
 //BA.debugLineNum = 64290823;BA.debugLine="ListPanel.As(ScrollView).ScrollPosition=Pos";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).setScrollPosition(_pos);
 }else 
{RDebugUtils.currentLine=64290829;
 //BA.debugLineNum = 64290829;BA.debugLine="else if Position=-1 Then";
if (_position==-1) { 
RDebugUtils.currentLine=64290830;
 //BA.debugLineNum = 64290830;BA.debugLine="SelIndex=Position";
__ref._selindex /*int*/  = _position;
 }}
;
RDebugUtils.currentLine=64290833;
 //BA.debugLineNum = 64290833;BA.debugLine="End Sub";
return "";
}
public String  _fixpanel(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "fixpanel", true))
	 {return ((String) Debug.delegate(ba, "fixpanel", null));}
int _left = 0;
int _top = 0;
int _width = 0;
int _height = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _prec = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=65470464;
 //BA.debugLineNum = 65470464;BA.debugLine="Private Sub fixPanel";
RDebugUtils.currentLine=65470465;
 //BA.debugLineNum = 65470465;BA.debugLine="Try";
try {RDebugUtils.currentLine=65470466;
 //BA.debugLineNum = 65470466;BA.debugLine="Dim Left As Int = mBase.Left";
_left = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft();
RDebugUtils.currentLine=65470467;
 //BA.debugLineNum = 65470467;BA.debugLine="Dim Top As Int = mBase.top";
_top = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop();
RDebugUtils.currentLine=65470468;
 //BA.debugLineNum = 65470468;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=65470469;
 //BA.debugLineNum = 65470469;BA.debugLine="Dim height As Int";
_height = 0;
RDebugUtils.currentLine=65470470;
 //BA.debugLineNum = 65470470;BA.debugLine="Dim prec As B4XView = mBase";
_prec = new anywheresoftware.b4a.objects.B4XViewWrapper();
_prec = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=65470471;
 //BA.debugLineNum = 65470471;BA.debugLine="Dim pnl As B4XView = mBase.Parent";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=65470473;
 //BA.debugLineNum = 65470473;BA.debugLine="Do While (pnl.Parent.IsInitialized) And (GetType";
while ((_pnl.getParent().IsInitialized()) && ((__c.GetType((Object)(_pnl.getObject()))).equals("B4IMainView") == false)) {
RDebugUtils.currentLine=65470475;
 //BA.debugLineNum = 65470475;BA.debugLine="Left=Left+pnl.Left";
_left = (int) (_left+_pnl.getLeft());
RDebugUtils.currentLine=65470476;
 //BA.debugLineNum = 65470476;BA.debugLine="Top=Top+pnl.Top";
_top = (int) (_top+_pnl.getTop());
RDebugUtils.currentLine=65470477;
 //BA.debugLineNum = 65470477;BA.debugLine="prec=pnl";
_prec = _pnl;
RDebugUtils.currentLine=65470478;
 //BA.debugLineNum = 65470478;BA.debugLine="pnl=pnl.Parent";
_pnl = _pnl.getParent();
 }
;
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=65470481;
 //BA.debugLineNum = 65470481;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("965470481",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=65470483;
 //BA.debugLineNum = 65470483;BA.debugLine="If xui.IsB4i Then pnl=prec";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
_pnl = _prec;};
RDebugUtils.currentLine=65470485;
 //BA.debugLineNum = 65470485;BA.debugLine="width=pnl.Width";
_width = _pnl.getWidth();
RDebugUtils.currentLine=65470486;
 //BA.debugLineNum = 65470486;BA.debugLine="height=pnl.Height";
_height = _pnl.getHeight();
RDebugUtils.currentLine=65470491;
 //BA.debugLineNum = 65470491;BA.debugLine="If width=-1 Then width=100%x";
if (_width==-1) { 
_width = __c.PerXToCurrent((float) (100),ba);};
RDebugUtils.currentLine=65470492;
 //BA.debugLineNum = 65470492;BA.debugLine="If height=-1 Then height=100%y";
if (_height==-1) { 
_height = __c.PerYToCurrent((float) (100),ba);};
RDebugUtils.currentLine=65470495;
 //BA.debugLineNum = 65470495;BA.debugLine="outListPanel.Color=xui.Color_ARGB(5,5,5,5)";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (5),(int) (5),(int) (5),(int) (5)));
RDebugUtils.currentLine=65470496;
 //BA.debugLineNum = 65470496;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=65470497;
 //BA.debugLineNum = 65470497;BA.debugLine="pnl.AddView(outListPanel,0,0,width,height)";
_pnl.AddView((android.view.View)(__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=65470499;
 //BA.debugLineNum = 65470499;BA.debugLine="If kbh>0 Then";
if (__ref._kbh /*int*/ >0) { 
RDebugUtils.currentLine=65470500;
 //BA.debugLineNum = 65470500;BA.debugLine="height=kbh";
_height = __ref._kbh /*int*/ ;
 };
RDebugUtils.currentLine=65470504;
 //BA.debugLineNum = 65470504;BA.debugLine="ListPanel.RemoveViewFromParent";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=65470506;
 //BA.debugLineNum = 65470506;BA.debugLine="If Top+(mBase.Height/2)>height/2 Then";
if (_top+(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)>_height/(double)2) { 
RDebugUtils.currentLine=65470508;
 //BA.debugLineNum = 65470508;BA.debugLine="outListPanel.AddView(ListPanel,Left,0,mBase.Widt";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_left,(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_top);
 }else {
RDebugUtils.currentLine=65470511;
 //BA.debugLineNum = 65470511;BA.debugLine="outListPanel.AddView(ListPanel,Left,Top+mBase.He";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_left,(int) (_top+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_top-__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (20))));
 };
RDebugUtils.currentLine=65470513;
 //BA.debugLineNum = 65470513;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getbase", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=62914560;
 //BA.debugLineNum = 62914560;BA.debugLine="Public Sub GetBase As B4XView";
RDebugUtils.currentLine=62914561;
 //BA.debugLineNum = 62914561;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=62914562;
 //BA.debugLineNum = 62914562;BA.debugLine="End Sub";
return null;
}
public String  _getcombotext(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getcombotext", true))
	 {return ((String) Debug.delegate(ba, "getcombotext", null));}
RDebugUtils.currentLine=63569920;
 //BA.debugLineNum = 63569920;BA.debugLine="Public Sub getComboText As String";
RDebugUtils.currentLine=63569921;
 //BA.debugLineNum = 63569921;BA.debugLine="Return MyLabel.Text";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=63569922;
 //BA.debugLineNum = 63569922;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=64618496;
 //BA.debugLineNum = 64618496;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=64618497;
 //BA.debugLineNum = 64618497;BA.debugLine="Return MyLabel.Enabled";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=64618498;
 //BA.debugLineNum = 64618498;BA.debugLine="End Sub";
return false;
}
public String  _gethint(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "gethint", true))
	 {return ((String) Debug.delegate(ba, "gethint", null));}
RDebugUtils.currentLine=63045632;
 //BA.debugLineNum = 63045632;BA.debugLine="Public Sub getHint As String";
RDebugUtils.currentLine=63045633;
 //BA.debugLineNum = 63045633;BA.debugLine="Return LabelHint.Text";
if (true) return __ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=63045634;
 //BA.debugLineNum = 63045634;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gethintfont(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "gethintfont", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) Debug.delegate(ba, "gethintfont", null));}
RDebugUtils.currentLine=63176704;
 //BA.debugLineNum = 63176704;BA.debugLine="Public Sub getHintFont As B4XFont";
RDebugUtils.currentLine=63176705;
 //BA.debugLineNum = 63176705;BA.debugLine="Return LabelHint.Font";
if (true) return __ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=63176706;
 //BA.debugLineNum = 63176706;BA.debugLine="End Sub";
return null;
}
public int  _getselectedindex(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectedindex", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedindex", null));}
RDebugUtils.currentLine=64225280;
 //BA.debugLineNum = 64225280;BA.debugLine="Public Sub getSelectedIndex As Int";
RDebugUtils.currentLine=64225281;
 //BA.debugLineNum = 64225281;BA.debugLine="Return SelIndex";
if (true) return __ref._selindex /*int*/ ;
RDebugUtils.currentLine=64225282;
 //BA.debugLineNum = 64225282;BA.debugLine="End Sub";
return 0;
}
public String  _getselectedtextitem(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectedtextitem", true))
	 {return ((String) Debug.delegate(ba, "getselectedtextitem", null));}
RDebugUtils.currentLine=64356352;
 //BA.debugLineNum = 64356352;BA.debugLine="Public Sub getSelectedTextItem As String";
RDebugUtils.currentLine=64356353;
 //BA.debugLineNum = 64356353;BA.debugLine="Return  GetItem(SelIndex)";
if (true) return __ref._getitem /*String*/ (null,__ref._selindex /*int*/ );
RDebugUtils.currentLine=64356354;
 //BA.debugLineNum = 64356354;BA.debugLine="End Sub";
return "";
}
public Object  _getselectedvalueitem(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectedvalueitem", true))
	 {return ((Object) Debug.delegate(ba, "getselectedvalueitem", null));}
RDebugUtils.currentLine=64487424;
 //BA.debugLineNum = 64487424;BA.debugLine="Public Sub getSelectedValueItem As Object";
RDebugUtils.currentLine=64487425;
 //BA.debugLineNum = 64487425;BA.debugLine="Return  GetValue(SelIndex)";
if (true) return __ref._getvalue /*Object*/ (null,__ref._selindex /*int*/ );
RDebugUtils.currentLine=64487426;
 //BA.debugLineNum = 64487426;BA.debugLine="End Sub";
return null;
}
public Object  _getvalue(b4a.example.ef.sd_xcombobox __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_position}));}
Object _ret = null;
RDebugUtils.currentLine=64159744;
 //BA.debugLineNum = 64159744;BA.debugLine="Public Sub GetValue(Position As Int) As Object";
RDebugUtils.currentLine=64159745;
 //BA.debugLineNum = 64159745;BA.debugLine="Dim Ret As Object";
_ret = new Object();
RDebugUtils.currentLine=64159746;
 //BA.debugLineNum = 64159746;BA.debugLine="If Position=-1 And Editable Then Return MyLabel.T";
if (_position==-1 && __ref._editable /*boolean*/ ) { 
if (true) return (Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());};
RDebugUtils.currentLine=64159747;
 //BA.debugLineNum = 64159747;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=64159748;
 //BA.debugLineNum = 64159748;BA.debugLine="Ret=ListItem.Get(Position).As(Map).Get(\"Value\")";
_ret = ((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_position)))).Get((Object)("Value"));
 };
RDebugUtils.currentLine=64159751;
 //BA.debugLineNum = 64159751;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=64159752;
 //BA.debugLineNum = 64159752;BA.debugLine="End Sub";
return null;
}
public int  _getselectionlength(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectionlength", true))
	 {return ((Integer) Debug.delegate(ba, "getselectionlength", null));}
RDebugUtils.currentLine=63438848;
 //BA.debugLineNum = 63438848;BA.debugLine="Public Sub getSelectionLength As Int";
RDebugUtils.currentLine=63438849;
 //BA.debugLineNum = 63438849;BA.debugLine="Return MyLabel.SelectionLength";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getSelectionLength();
RDebugUtils.currentLine=63438850;
 //BA.debugLineNum = 63438850;BA.debugLine="End Sub";
return 0;
}
public int  _getselectionstart(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectionstart", true))
	 {return ((Integer) Debug.delegate(ba, "getselectionstart", null));}
RDebugUtils.currentLine=63373312;
 //BA.debugLineNum = 63373312;BA.debugLine="Public Sub getSelectionStart As Int";
RDebugUtils.currentLine=63373313;
 //BA.debugLineNum = 63373313;BA.debugLine="Return MyLabel.SelectionStart";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getSelectionStart();
RDebugUtils.currentLine=63373314;
 //BA.debugLineNum = 63373314;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gettextfont(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "gettextfont", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) Debug.delegate(ba, "gettextfont", null));}
RDebugUtils.currentLine=63307776;
 //BA.debugLineNum = 63307776;BA.debugLine="Public Sub getTextFont As B4XFont";
RDebugUtils.currentLine=63307777;
 //BA.debugLineNum = 63307777;BA.debugLine="Return MyLabel.Font";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=63307778;
 //BA.debugLineNum = 63307778;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4a.objects.ScrollViewWrapper _sc = null;
RDebugUtils.currentLine=62717952;
 //BA.debugLineNum = 62717952;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=62717953;
 //BA.debugLineNum = 62717953;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=62717954;
 //BA.debugLineNum = 62717954;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=62717956;
 //BA.debugLineNum = 62717956;BA.debugLine="outListPanel=xui.CreatePanel(\"outListPanel\")";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"outListPanel");
RDebugUtils.currentLine=62717958;
 //BA.debugLineNum = 62717958;BA.debugLine="Dim Sc As ScrollView";
_sc = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=62717959;
 //BA.debugLineNum = 62717959;BA.debugLine="Sc.Initialize2(1000dip,\"Sc\")";
_sc.Initialize2(ba,__c.DipToCurrent((int) (1000)),"Sc");
RDebugUtils.currentLine=62717960;
 //BA.debugLineNum = 62717960;BA.debugLine="ListPanel=Sc";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sc.getObject()));
RDebugUtils.currentLine=62717962;
 //BA.debugLineNum = 62717962;BA.debugLine="kk.Initialize(\"kk\")";
__ref._kk /*anywheresoftware.b4a.objects.IME*/ .Initialize("kk");
RDebugUtils.currentLine=62717963;
 //BA.debugLineNum = 62717963;BA.debugLine="kk.AddHeightChangedEvent";
__ref._kk /*anywheresoftware.b4a.objects.IME*/ .AddHeightChangedEvent(ba);
RDebugUtils.currentLine=62717976;
 //BA.debugLineNum = 62717976;BA.debugLine="LabelHint=CreateLabel(\"LabelHint\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"LabelHint");
RDebugUtils.currentLine=62717978;
 //BA.debugLineNum = 62717978;BA.debugLine="ListItem.Initialize";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=62717979;
 //BA.debugLineNum = 62717979;BA.debugLine="SelIndex=-1";
__ref._selindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=62717981;
 //BA.debugLineNum = 62717981;BA.debugLine="ItemHeight=40dip";
__ref._itemheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=62717982;
 //BA.debugLineNum = 62717982;BA.debugLine="OpenDropDownOnFocus=True";
__ref._opendropdownonfocus /*boolean*/  = __c.True;
RDebugUtils.currentLine=62717983;
 //BA.debugLineNum = 62717983;BA.debugLine="End Sub";
return "";
}
public boolean  _isdropdownopen(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "isdropdownopen", true))
	 {return ((Boolean) Debug.delegate(ba, "isdropdownopen", null));}
RDebugUtils.currentLine=64028672;
 //BA.debugLineNum = 64028672;BA.debugLine="Public Sub isDropDownOpen As Boolean";
RDebugUtils.currentLine=64028673;
 //BA.debugLineNum = 64028673;BA.debugLine="Return (outListPanel.Parent.IsInitialized)";
if (true) return (__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized());
RDebugUtils.currentLine=64028674;
 //BA.debugLineNum = 64028674;BA.debugLine="End Sub";
return false;
}
public String  _kk_heightchanged(b4a.example.ef.sd_xcombobox __ref,int _newheight,int _oldheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "kk_heightchanged", true))
	 {return ((String) Debug.delegate(ba, "kk_heightchanged", new Object[] {_newheight,_oldheight}));}
RDebugUtils.currentLine=65404928;
 //BA.debugLineNum = 65404928;BA.debugLine="Private Sub kk_HeightChanged (NewHeight As Int, Ol";
RDebugUtils.currentLine=65404929;
 //BA.debugLineNum = 65404929;BA.debugLine="kbh=NewHeight";
__ref._kbh /*int*/  = _newheight;
RDebugUtils.currentLine=65404931;
 //BA.debugLineNum = 65404931;BA.debugLine="If isDropDownOpen Then";
if (__ref._isdropdownopen /*boolean*/ (null)) { 
RDebugUtils.currentLine=65404932;
 //BA.debugLineNum = 65404932;BA.debugLine="CloseDropDown";
__ref._closedropdown /*String*/ (null);
RDebugUtils.currentLine=65404933;
 //BA.debugLineNum = 65404933;BA.debugLine="fixPanel";
__ref._fixpanel /*String*/ (null);
RDebugUtils.currentLine=65404934;
 //BA.debugLineNum = 65404934;BA.debugLine="DrawListBox";
__ref._drawlistbox /*void*/ (null);
 };
RDebugUtils.currentLine=65404936;
 //BA.debugLineNum = 65404936;BA.debugLine="End Sub";
return "";
}
public void  _labselect_click(b4a.example.ef.sd_xcombobox __ref) throws Exception{
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "labselect_click", true))
	 {Debug.delegate(ba, "labselect_click", null); return;}
ResumableSub_LabSelect_Click rsub = new ResumableSub_LabSelect_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LabSelect_Click extends BA.ResumableSub {
public ResumableSub_LabSelect_Click(b4a.example.ef.sd_xcombobox parent,b4a.example.ef.sd_xcombobox __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.sd_xcombobox __ref;
b4a.example.ef.sd_xcombobox parent;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
int _index = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="sd_xcombobox";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=64815105;
 //BA.debugLineNum = 64815105;BA.debugLine="Dim L As B4XView = Sender";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=64815106;
 //BA.debugLineNum = 64815106;BA.debugLine="Dim index As Int = L.Tag";
_index = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=64815108;
 //BA.debugLineNum = 64815108;BA.debugLine="setSelectedIndex(index)";
__ref._setselectedindex /*String*/ (null,_index);
RDebugUtils.currentLine=64815109;
 //BA.debugLineNum = 64815109;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "sd_xcombobox", "labselect_click"),(int) (100));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=64815110;
 //BA.debugLineNum = 64815110;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ItemClick",(int) (2))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent.__c.CallSubDelayed3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ItemClick",(Object)(_index),__ref._getvalue /*Object*/ (null,_index));
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=64815111;
 //BA.debugLineNum = 64815111;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=64815112;
 //BA.debugLineNum = 64815112;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _mylabel_action(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_action", true))
	 {return ((String) Debug.delegate(ba, "mylabel_action", null));}
RDebugUtils.currentLine=65077248;
 //BA.debugLineNum = 65077248;BA.debugLine="Private Sub MyLabel_Action";
RDebugUtils.currentLine=65077250;
 //BA.debugLineNum = 65077250;BA.debugLine="SelectedItem(MyLabel.Text)";
__ref._selecteditem /*void*/ (null,__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=65077251;
 //BA.debugLineNum = 65077251;BA.debugLine="End Sub";
return "";
}
public void  _selecteditem(b4a.example.ef.sd_xcombobox __ref,String _value) throws Exception{
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "selecteditem", true))
	 {Debug.delegate(ba, "selecteditem", new Object[] {_value}); return;}
ResumableSub_SelectedItem rsub = new ResumableSub_SelectedItem(this,__ref,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SelectedItem extends BA.ResumableSub {
public ResumableSub_SelectedItem(b4a.example.ef.sd_xcombobox parent,b4a.example.ef.sd_xcombobox __ref,String _value) {
this.parent = parent;
this.__ref = __ref;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.sd_xcombobox __ref;
b4a.example.ef.sd_xcombobox parent;
String _value;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="sd_xcombobox";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65273857;
 //BA.debugLineNum = 65273857;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
if (true) break;

case 1:
//if
this.state = 10;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ItemClick",(int) (2))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=65273858;
 //BA.debugLineNum = 65273858;BA.debugLine="If SelectOnlyFromList Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._selectonlyfromlist /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=65273859;
 //BA.debugLineNum = 65273859;BA.debugLine="SelIndex=FindIndex";
__ref._selindex /*int*/  = __ref._findindex /*int*/ ;
RDebugUtils.currentLine=65273860;
 //BA.debugLineNum = 65273860;BA.debugLine="MyLabel.Text=GetItem(SelIndex)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,__ref._selindex /*int*/ )));
RDebugUtils.currentLine=65273861;
 //BA.debugLineNum = 65273861;BA.debugLine="CallSubDelayed3(mCallBack,mEventName & \"_ItemCl";
parent.__c.CallSubDelayed3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ItemClick",(Object)(__ref._selindex /*int*/ ),(Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=65273863;
 //BA.debugLineNum = 65273863;BA.debugLine="CallSubDelayed3(mCallBack,mEventName & \"_ItemCl";
parent.__c.CallSubDelayed3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ItemClick",(Object)(-1),(Object)(_value));
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
RDebugUtils.currentLine=65273866;
 //BA.debugLineNum = 65273866;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "sd_xcombobox", "selecteditem"),(int) (100));
this.state = 11;
return;
case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=65273867;
 //BA.debugLineNum = 65273867;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=65273868;
 //BA.debugLineNum = 65273868;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _mylabel_beginedit(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_beginedit", true))
	 {return ((String) Debug.delegate(ba, "mylabel_beginedit", null));}
RDebugUtils.currentLine=65011712;
 //BA.debugLineNum = 65011712;BA.debugLine="Private Sub MyLabel_BeginEdit";
RDebugUtils.currentLine=65011713;
 //BA.debugLineNum = 65011713;BA.debugLine="MyLabel_FocusChanged(True)";
__ref._mylabel_focuschanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=65011714;
 //BA.debugLineNum = 65011714;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_focuschanged(b4a.example.ef.sd_xcombobox __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "mylabel_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=64946176;
 //BA.debugLineNum = 64946176;BA.debugLine="Private Sub MyLabel_FocusChanged (HasFocus As Bool";
RDebugUtils.currentLine=64946177;
 //BA.debugLineNum = 64946177;BA.debugLine="If HasFocus And OpenDropDownOnFocus Then";
if (_hasfocus && __ref._opendropdownonfocus /*boolean*/ ) { 
RDebugUtils.currentLine=64946178;
 //BA.debugLineNum = 64946178;BA.debugLine="OpenDropDown";
__ref._opendropdown /*String*/ (null);
 };
RDebugUtils.currentLine=64946183;
 //BA.debugLineNum = 64946183;BA.debugLine="ModIntern=False";
__ref._modintern /*boolean*/  = __c.False;
RDebugUtils.currentLine=64946185;
 //BA.debugLineNum = 64946185;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(_hasfocus));};
RDebugUtils.currentLine=64946186;
 //BA.debugLineNum = 64946186;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_click(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_click", true))
	 {return ((String) Debug.delegate(ba, "mylabel_click", null));}
RDebugUtils.currentLine=64880640;
 //BA.debugLineNum = 64880640;BA.debugLine="Private Sub MyLabel_Click";
RDebugUtils.currentLine=64880641;
 //BA.debugLineNum = 64880641;BA.debugLine="OpenDropDown";
__ref._opendropdown /*String*/ (null);
RDebugUtils.currentLine=64880642;
 //BA.debugLineNum = 64880642;BA.debugLine="MyLabel.RequestFocus";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=64880643;
 //BA.debugLineNum = 64880643;BA.debugLine="End Sub";
return "";
}
public String  _opendropdown(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "opendropdown", true))
	 {return ((String) Debug.delegate(ba, "opendropdown", null));}
RDebugUtils.currentLine=63897600;
 //BA.debugLineNum = 63897600;BA.debugLine="Public Sub OpenDropDown";
RDebugUtils.currentLine=63897604;
 //BA.debugLineNum = 63897604;BA.debugLine="fixPanel";
__ref._fixpanel /*String*/ (null);
RDebugUtils.currentLine=63897605;
 //BA.debugLineNum = 63897605;BA.debugLine="DrawListBox";
__ref._drawlistbox /*void*/ (null);
RDebugUtils.currentLine=63897606;
 //BA.debugLineNum = 63897606;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_endedit(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_endedit", true))
	 {return ((String) Debug.delegate(ba, "mylabel_endedit", null));}
RDebugUtils.currentLine=65208320;
 //BA.debugLineNum = 65208320;BA.debugLine="Private Sub MyLabel_EndEdit";
RDebugUtils.currentLine=65208322;
 //BA.debugLineNum = 65208322;BA.debugLine="MyLabel_FocusChanged(False)";
__ref._mylabel_focuschanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=65208324;
 //BA.debugLineNum = 65208324;BA.debugLine="SelectedItem(MyLabel.Text)";
__ref._selecteditem /*void*/ (null,__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=65208325;
 //BA.debugLineNum = 65208325;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_enterpressed(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "mylabel_enterpressed", null));}
RDebugUtils.currentLine=65142784;
 //BA.debugLineNum = 65142784;BA.debugLine="Private Sub MyLabel_EnterPressed";
RDebugUtils.currentLine=65142786;
 //BA.debugLineNum = 65142786;BA.debugLine="SelectedItem(MyLabel.Text)";
__ref._selecteditem /*void*/ (null,__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=65142787;
 //BA.debugLineNum = 65142787;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_textchanged(b4a.example.ef.sd_xcombobox __ref,String _oldtext,String _newtext) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_textchanged", true))
	 {return ((String) Debug.delegate(ba, "mylabel_textchanged", new Object[] {_oldtext,_newtext}));}
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
int _startposition = 0;
int _endposition = 0;
int _startvisible = 0;
int _endvisible = 0;
RDebugUtils.currentLine=65339392;
 //BA.debugLineNum = 65339392;BA.debugLine="Private Sub MyLabel_TextChanged (OldText As String";
RDebugUtils.currentLine=65339393;
 //BA.debugLineNum = 65339393;BA.debugLine="If ModIntern Then";
if (__ref._modintern /*boolean*/ ) { 
RDebugUtils.currentLine=65339394;
 //BA.debugLineNum = 65339394;BA.debugLine="ModIntern=False";
__ref._modintern /*boolean*/  = __c.False;
RDebugUtils.currentLine=65339395;
 //BA.debugLineNum = 65339395;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=65339397;
 //BA.debugLineNum = 65339397;BA.debugLine="If OldText=NewText Then Return";
if ((_oldtext).equals(_newtext)) { 
if (true) return "";};
RDebugUtils.currentLine=65339398;
 //BA.debugLineNum = 65339398;BA.debugLine="If isDropDownOpen=False And OpenDropDownOnFocus T";
if (__ref._isdropdownopen /*boolean*/ (null)==__c.False && __ref._opendropdownonfocus /*boolean*/ ) { 
__ref._opendropdown /*String*/ (null);};
RDebugUtils.currentLine=65339399;
 //BA.debugLineNum = 65339399;BA.debugLine="FindIndex = -1";
__ref._findindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=65339401;
 //BA.debugLineNum = 65339401;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=65339402;
 //BA.debugLineNum = 65339402;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=65339404;
 //BA.debugLineNum = 65339404;BA.debugLine="If v.Get(\"Text\").As(String).ToLowerCase.IndexOf(";
if ((BA.ObjectToString(_v.Get((Object)("Text")))).toLowerCase().indexOf(_newtext.toLowerCase())>-1) { 
RDebugUtils.currentLine=65339405;
 //BA.debugLineNum = 65339405;BA.debugLine="FindIndex=i";
__ref._findindex /*int*/  = _i;
RDebugUtils.currentLine=65339406;
 //BA.debugLineNum = 65339406;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=65339410;
 //BA.debugLineNum = 65339410;BA.debugLine="If SelIndex>-1 And SelIndex<ListItem.Size Then";
if (__ref._selindex /*int*/ >-1 && __ref._selindex /*int*/ <__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=65339411;
 //BA.debugLineNum = 65339411;BA.debugLine="If ListItem.Get(SelIndex).As(Map).Get(\"object\").";
if (((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).IsInitialized()) { 
RDebugUtils.currentLine=65339412;
 //BA.debugLineNum = 65339412;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=65339413;
 //BA.debugLineNum = 65339413;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setTextColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
 };
 };
RDebugUtils.currentLine=65339417;
 //BA.debugLineNum = 65339417;BA.debugLine="SelIndex=FindIndex";
__ref._selindex /*int*/  = __ref._findindex /*int*/ ;
RDebugUtils.currentLine=65339418;
 //BA.debugLineNum = 65339418;BA.debugLine="If SelIndex>-1 And SelIndex<ListItem.Size Then";
if (__ref._selindex /*int*/ >-1 && __ref._selindex /*int*/ <__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=65339419;
 //BA.debugLineNum = 65339419;BA.debugLine="If ListItem.Get(SelIndex).As(Map).Get(\"object\").";
if (((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).IsInitialized()) { 
RDebugUtils.currentLine=65339420;
 //BA.debugLineNum = 65339420;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=65339421;
 //BA.debugLineNum = 65339421;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setTextColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=65339424;
 //BA.debugLineNum = 65339424;BA.debugLine="Dim StartPosition As Int = ListItem.Get(SelInde";
_startposition = ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).getTop();
RDebugUtils.currentLine=65339425;
 //BA.debugLineNum = 65339425;BA.debugLine="Dim EndPosition As Int = StartPosition + ListIt";
_endposition = (int) (_startposition+((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).getHeight());
RDebugUtils.currentLine=65339426;
 //BA.debugLineNum = 65339426;BA.debugLine="Dim StartVisible As Int = ListPanel.ScrollViewO";
_startvisible = __ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetY();
RDebugUtils.currentLine=65339427;
 //BA.debugLineNum = 65339427;BA.debugLine="Dim EndVisible As Int = StartVisible + ListPane";
_endvisible = (int) (_startvisible+__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=65339429;
 //BA.debugLineNum = 65339429;BA.debugLine="If Not((StartPosition>=StartVisible And StartPo";
if (__c.Not((_startposition>=_startvisible && _startposition<_endvisible) && (_endposition>_startvisible && _endposition<=_endvisible))) { 
RDebugUtils.currentLine=65339431;
 //BA.debugLineNum = 65339431;BA.debugLine="If StartPosition>ListPanel.ScrollViewContentHe";
if (_startposition>__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight()-__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=65339432;
 //BA.debugLineNum = 65339432;BA.debugLine="ListPanel.ScrollViewOffsetY=ListPanel.ScrollV";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetY((int) (__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight()-__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 }else {
RDebugUtils.currentLine=65339434;
 //BA.debugLineNum = 65339434;BA.debugLine="ListPanel.ScrollViewOffsetY=StartPosition";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetY(_startposition);
 };
 };
 };
 };
RDebugUtils.currentLine=65339439;
 //BA.debugLineNum = 65339439;BA.debugLine="End Sub";
return "";
}
public String  _outlistpanel_click(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "outlistpanel_click", true))
	 {return ((String) Debug.delegate(ba, "outlistpanel_click", null));}
RDebugUtils.currentLine=64749568;
 //BA.debugLineNum = 64749568;BA.debugLine="Private Sub outListPanel_Click";
RDebugUtils.currentLine=64749569;
 //BA.debugLineNum = 64749569;BA.debugLine="CloseDropDown";
__ref._closedropdown /*String*/ (null);
RDebugUtils.currentLine=64749570;
 //BA.debugLineNum = 64749570;BA.debugLine="outListPanel.RequestFocus";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=64749571;
 //BA.debugLineNum = 64749571;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(__c.False));};
RDebugUtils.currentLine=64749572;
 //BA.debugLineNum = 64749572;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4a.example.ef.sd_xcombobox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=64684032;
 //BA.debugLineNum = 64684032;BA.debugLine="Public Sub setEnabled(B As Boolean)";
RDebugUtils.currentLine=64684033;
 //BA.debugLineNum = 64684033;BA.debugLine="MyLabel.Enabled=B";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_b);
RDebugUtils.currentLine=64684034;
 //BA.debugLineNum = 64684034;BA.debugLine="End Sub";
return "";
}
public String  _sethint(b4a.example.ef.sd_xcombobox __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "sethint", true))
	 {return ((String) Debug.delegate(ba, "sethint", new Object[] {_text}));}
RDebugUtils.currentLine=62980096;
 //BA.debugLineNum = 62980096;BA.debugLine="Public Sub setHint(Text As String)";
RDebugUtils.currentLine=62980097;
 //BA.debugLineNum = 62980097;BA.debugLine="LabelHint.Text=Text";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=62980098;
 //BA.debugLineNum = 62980098;BA.debugLine="End Sub";
return "";
}
public String  _sethintfont(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "sethintfont", true))
	 {return ((String) Debug.delegate(ba, "sethintfont", new Object[] {_fnt}));}
RDebugUtils.currentLine=63111168;
 //BA.debugLineNum = 63111168;BA.debugLine="Public Sub setHintFont(Fnt As B4XFont)";
RDebugUtils.currentLine=63111169;
 //BA.debugLineNum = 63111169;BA.debugLine="LabelHint.Font=Fnt";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_fnt);
RDebugUtils.currentLine=63111170;
 //BA.debugLineNum = 63111170;BA.debugLine="End Sub";
return "";
}
public String  _setselectedtextitem(b4a.example.ef.sd_xcombobox __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setselectedtextitem", true))
	 {return ((String) Debug.delegate(ba, "setselectedtextitem", new Object[] {_value}));}
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
RDebugUtils.currentLine=64421888;
 //BA.debugLineNum = 64421888;BA.debugLine="Public Sub setSelectedTextItem(Value As String)";
RDebugUtils.currentLine=64421889;
 //BA.debugLineNum = 64421889;BA.debugLine="If Editable Then";
if (__ref._editable /*boolean*/ ) { 
RDebugUtils.currentLine=64421890;
 //BA.debugLineNum = 64421890;BA.debugLine="ModIntern=True";
__ref._modintern /*boolean*/  = __c.True;
RDebugUtils.currentLine=64421891;
 //BA.debugLineNum = 64421891;BA.debugLine="MyLabel.Text=Value";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_value));
 }else {
RDebugUtils.currentLine=64421893;
 //BA.debugLineNum = 64421893;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=64421894;
 //BA.debugLineNum = 64421894;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=64421895;
 //BA.debugLineNum = 64421895;BA.debugLine="If Value = v.Get(\"Text\") Then";
if ((_value).equals(BA.ObjectToString(_v.Get((Object)("Text"))))) { 
RDebugUtils.currentLine=64421896;
 //BA.debugLineNum = 64421896;BA.debugLine="SelIndex=i";
__ref._selindex /*int*/  = _i;
RDebugUtils.currentLine=64421897;
 //BA.debugLineNum = 64421897;BA.debugLine="MyLabel.Text=GetItem(I)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,_i)));
 };
 }
};
 };
RDebugUtils.currentLine=64421901;
 //BA.debugLineNum = 64421901;BA.debugLine="End Sub";
return "";
}
public String  _setselectedvalueitem(b4a.example.ef.sd_xcombobox __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setselectedvalueitem", true))
	 {return ((String) Debug.delegate(ba, "setselectedvalueitem", new Object[] {_value}));}
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
RDebugUtils.currentLine=64552960;
 //BA.debugLineNum = 64552960;BA.debugLine="Public Sub setSelectedValueItem(Value As Object)";
RDebugUtils.currentLine=64552961;
 //BA.debugLineNum = 64552961;BA.debugLine="If Editable Then";
if (__ref._editable /*boolean*/ ) { 
RDebugUtils.currentLine=64552962;
 //BA.debugLineNum = 64552962;BA.debugLine="ModIntern=True";
__ref._modintern /*boolean*/  = __c.True;
RDebugUtils.currentLine=64552963;
 //BA.debugLineNum = 64552963;BA.debugLine="MyLabel.Text=Value";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_value));
 }else {
RDebugUtils.currentLine=64552965;
 //BA.debugLineNum = 64552965;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=64552966;
 //BA.debugLineNum = 64552966;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=64552967;
 //BA.debugLineNum = 64552967;BA.debugLine="If Value = v.Get(\"Value\") Then";
if ((_value).equals(_v.Get((Object)("Value")))) { 
RDebugUtils.currentLine=64552968;
 //BA.debugLineNum = 64552968;BA.debugLine="SelIndex=i";
__ref._selindex /*int*/  = _i;
RDebugUtils.currentLine=64552969;
 //BA.debugLineNum = 64552969;BA.debugLine="MyLabel.Text=GetItem(I)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,_i)));
 };
 }
};
 };
RDebugUtils.currentLine=64552973;
 //BA.debugLineNum = 64552973;BA.debugLine="End Sub";
return "";
}
public String  _setselection(b4a.example.ef.sd_xcombobox __ref,int _start,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setselection", true))
	 {return ((String) Debug.delegate(ba, "setselection", new Object[] {_start,_length}));}
RDebugUtils.currentLine=63504384;
 //BA.debugLineNum = 63504384;BA.debugLine="Public Sub SetSelection(Start As Int, Length As In";
RDebugUtils.currentLine=63504385;
 //BA.debugLineNum = 63504385;BA.debugLine="MyLabel.SetSelection(Start,Length)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetSelection(_start,_length);
RDebugUtils.currentLine=63504386;
 //BA.debugLineNum = 63504386;BA.debugLine="End Sub";
return "";
}
public String  _settextfont(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "settextfont", true))
	 {return ((String) Debug.delegate(ba, "settextfont", new Object[] {_fnt}));}
RDebugUtils.currentLine=63242240;
 //BA.debugLineNum = 63242240;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
RDebugUtils.currentLine=63242241;
 //BA.debugLineNum = 63242241;BA.debugLine="MyLabel.Font=Fnt";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_fnt);
RDebugUtils.currentLine=63242242;
 //BA.debugLineNum = 63242242;BA.debugLine="End Sub";
return "";
}
public int  _size(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "size", true))
	 {return ((Integer) Debug.delegate(ba, "size", null));}
RDebugUtils.currentLine=63766528;
 //BA.debugLineNum = 63766528;BA.debugLine="public Sub Size As Int";
RDebugUtils.currentLine=63766529;
 //BA.debugLineNum = 63766529;BA.debugLine="Return ListItem.Size";
if (true) return __ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=63766530;
 //BA.debugLineNum = 63766530;BA.debugLine="End Sub";
return 0;
}
}