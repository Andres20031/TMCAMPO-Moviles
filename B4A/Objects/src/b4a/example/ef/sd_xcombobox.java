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
public String  _add(b4a.example.ef.sd_xcombobox __ref,String _text,Object _returnvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "add", true))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_text,_returnvalue}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=53673984;
 //BA.debugLineNum = 53673984;BA.debugLine="Public Sub Add(Text As String, ReturnValue As Obje";
RDebugUtils.currentLine=53673985;
 //BA.debugLineNum = 53673985;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=53673986;
 //BA.debugLineNum = 53673986;BA.debugLine="M.Initialize";
_m.Initialize();
RDebugUtils.currentLine=53673987;
 //BA.debugLineNum = 53673987;BA.debugLine="M.Put(\"Text\",Text)";
_m.Put((Object)("Text"),(Object)(_text));
RDebugUtils.currentLine=53673988;
 //BA.debugLineNum = 53673988;BA.debugLine="M.Put(\"Value\",ReturnValue)";
_m.Put((Object)("Value"),_returnvalue);
RDebugUtils.currentLine=53673989;
 //BA.debugLineNum = 53673989;BA.debugLine="M.Put(\"object\",Null)";
_m.Put((Object)("object"),__c.Null);
RDebugUtils.currentLine=53673990;
 //BA.debugLineNum = 53673990;BA.debugLine="ListItem.Add(M)";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m.getObject()));
RDebugUtils.currentLine=53673992;
 //BA.debugLineNum = 53673992;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=53870592;
 //BA.debugLineNum = 53870592;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=53870593;
 //BA.debugLineNum = 53870593;BA.debugLine="ListItem.Clear";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=53870594;
 //BA.debugLineNum = 53870594;BA.debugLine="SelIndex=-1";
__ref._selindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=53870596;
 //BA.debugLineNum = 53870596;BA.debugLine="if Editable then  MyLabel.EditTextHint=\"<none>\"";
if (__ref._editable /*boolean*/ ) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEditTextHint(BA.ObjectToCharSequence("<none>"));};
RDebugUtils.currentLine=53870597;
 //BA.debugLineNum = 53870597;BA.debugLine="MyLabel.Text=\"\"";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=53870598;
 //BA.debugLineNum = 53870598;BA.debugLine="End Sub";
return "";
}
public String  _getitem(b4a.example.ef.sd_xcombobox __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getitem", true))
	 {return ((String) Debug.delegate(ba, "getitem", new Object[] {_position}));}
String _ret = "";
RDebugUtils.currentLine=54132736;
 //BA.debugLineNum = 54132736;BA.debugLine="Public Sub GetItem(Position As Int) As String";
RDebugUtils.currentLine=54132737;
 //BA.debugLineNum = 54132737;BA.debugLine="Dim Ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=54132740;
 //BA.debugLineNum = 54132740;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=54132741;
 //BA.debugLineNum = 54132741;BA.debugLine="Ret=ListItem.Get(Position).As(Map).Get(\"Text\")";
_ret = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_position)))).Get((Object)("Text")));
 };
RDebugUtils.currentLine=54132743;
 //BA.debugLineNum = 54132743;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=54132744;
 //BA.debugLineNum = 54132744;BA.debugLine="End Sub";
return "";
}
public String  _addall(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.objects.collections.List _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "addall", true))
	 {return ((String) Debug.delegate(ba, "addall", new Object[] {_l}));}
String _text = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=53739520;
 //BA.debugLineNum = 53739520;BA.debugLine="Public Sub AddAll(L As List)";
RDebugUtils.currentLine=53739521;
 //BA.debugLineNum = 53739521;BA.debugLine="For Each text As String In L";
{
final anywheresoftware.b4a.BA.IterableList group1 = _l;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_text = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=53739522;
 //BA.debugLineNum = 53739522;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=53739523;
 //BA.debugLineNum = 53739523;BA.debugLine="M.Initialize";
_m.Initialize();
RDebugUtils.currentLine=53739524;
 //BA.debugLineNum = 53739524;BA.debugLine="M.Put(\"Text\",text)";
_m.Put((Object)("Text"),(Object)(_text));
RDebugUtils.currentLine=53739525;
 //BA.debugLineNum = 53739525;BA.debugLine="M.Put(\"Value\",text)";
_m.Put((Object)("Value"),(Object)(_text));
RDebugUtils.currentLine=53739526;
 //BA.debugLineNum = 53739526;BA.debugLine="M.Put(\"object\",Null)";
_m.Put((Object)("object"),__c.Null);
RDebugUtils.currentLine=53739528;
 //BA.debugLineNum = 53739528;BA.debugLine="ListItem.Add(M)";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m.getObject()));
 }
};
RDebugUtils.currentLine=53739531;
 //BA.debugLineNum = 53739531;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.ef.sd_xcombobox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=52887552;
 //BA.debugLineNum = 52887552;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=52887553;
 //BA.debugLineNum = 52887553;BA.debugLine="If Style=\"Classic\" Then";
if ((__ref._style /*String*/ ).equals("Classic")) { 
RDebugUtils.currentLine=52887554;
 //BA.debugLineNum = 52887554;BA.debugLine="MyLabel.Width=Width-10dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width-__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=52887555;
 //BA.debugLineNum = 52887555;BA.debugLine="MyLabel.Height=Height-30dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height-__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=52887556;
 //BA.debugLineNum = 52887556;BA.debugLine="LabelHint.Width=Width";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width));
 }else {
RDebugUtils.currentLine=52887558;
 //BA.debugLineNum = 52887558;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=52887559;
 //BA.debugLineNum = 52887559;BA.debugLine="MyLabel.Width=Width-50dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width-__c.DipToCurrent((int) (50))));
RDebugUtils.currentLine=52887560;
 //BA.debugLineNum = 52887560;BA.debugLine="MyLabel.Height=Height";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
RDebugUtils.currentLine=52887561;
 //BA.debugLineNum = 52887561;BA.debugLine="LabelHint.Left=Width-45dip";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (_width-__c.DipToCurrent((int) (45))));
RDebugUtils.currentLine=52887562;
 //BA.debugLineNum = 52887562;BA.debugLine="LabelHint.Height=Height";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
 }else {
RDebugUtils.currentLine=52887564;
 //BA.debugLineNum = 52887564;BA.debugLine="MyLabel.Width=Width-50dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width-__c.DipToCurrent((int) (50))));
RDebugUtils.currentLine=52887565;
 //BA.debugLineNum = 52887565;BA.debugLine="MyLabel.Height=Height";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
RDebugUtils.currentLine=52887566;
 //BA.debugLineNum = 52887566;BA.debugLine="LabelHint.Height=Height";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
 };
 };
RDebugUtils.currentLine=52887573;
 //BA.debugLineNum = 52887573;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
RDebugUtils.currentLine=52690944;
 //BA.debugLineNum = 52690944;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=52690945;
 //BA.debugLineNum = 52690945;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=52690946;
 //BA.debugLineNum = 52690946;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=52690947;
 //BA.debugLineNum = 52690947;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=52690948;
 //BA.debugLineNum = 52690948;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=52690949;
 //BA.debugLineNum = 52690949;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=52690951;
 //BA.debugLineNum = 52690951;BA.debugLine="Private outListPanel As B4XView";
_outlistpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=52690952;
 //BA.debugLineNum = 52690952;BA.debugLine="Private ListPanel As B4XView";
_listpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=52690953;
 //BA.debugLineNum = 52690953;BA.debugLine="Private ListItem As List";
_listitem = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=52690954;
 //BA.debugLineNum = 52690954;BA.debugLine="Private SelIndex As Int";
_selindex = 0;
RDebugUtils.currentLine=52690955;
 //BA.debugLineNum = 52690955;BA.debugLine="Private FindIndex As Int = -1";
_findindex = (int) (-1);
RDebugUtils.currentLine=52690957;
 //BA.debugLineNum = 52690957;BA.debugLine="Private Editable As Boolean";
_editable = false;
RDebugUtils.currentLine=52690958;
 //BA.debugLineNum = 52690958;BA.debugLine="Private Corner As Int";
_corner = 0;
RDebugUtils.currentLine=52690959;
 //BA.debugLineNum = 52690959;BA.debugLine="Private Style As String = \"Frame\"";
_style = "Frame";
RDebugUtils.currentLine=52690960;
 //BA.debugLineNum = 52690960;BA.debugLine="Private Align As String = \"CENTER\"";
_align = "CENTER";
RDebugUtils.currentLine=52690961;
 //BA.debugLineNum = 52690961;BA.debugLine="Private TextAlign As String = \"LEFT\"";
_textalign = "LEFT";
RDebugUtils.currentLine=52690962;
 //BA.debugLineNum = 52690962;BA.debugLine="Private ModIntern As Boolean=False";
_modintern = __c.False;
RDebugUtils.currentLine=52690963;
 //BA.debugLineNum = 52690963;BA.debugLine="Private BClr As Int";
_bclr = 0;
RDebugUtils.currentLine=52690964;
 //BA.debugLineNum = 52690964;BA.debugLine="Private RTL As Boolean = False";
_rtl = __c.False;
RDebugUtils.currentLine=52690965;
 //BA.debugLineNum = 52690965;BA.debugLine="Private LabelHint As B4XView";
_labelhint = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=52690966;
 //BA.debugLineNum = 52690966;BA.debugLine="Private MyLabel As B4XView";
_mylabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=52690967;
 //BA.debugLineNum = 52690967;BA.debugLine="Private CornerColor As Int";
_cornercolor = 0;
RDebugUtils.currentLine=52690969;
 //BA.debugLineNum = 52690969;BA.debugLine="Private kbh As Int = 0";
_kbh = (int) (0);
RDebugUtils.currentLine=52690970;
 //BA.debugLineNum = 52690970;BA.debugLine="Public ItemHeight As Int";
_itemheight = 0;
RDebugUtils.currentLine=52690971;
 //BA.debugLineNum = 52690971;BA.debugLine="Public OpenDropDownOnFocus As Boolean";
_opendropdownonfocus = false;
RDebugUtils.currentLine=52690972;
 //BA.debugLineNum = 52690972;BA.debugLine="Public SelectOnlyFromList As Boolean = False";
_selectonlyfromlist = __c.False;
RDebugUtils.currentLine=52690975;
 //BA.debugLineNum = 52690975;BA.debugLine="Private kk As IME";
_kk = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=52690977;
 //BA.debugLineNum = 52690977;BA.debugLine="End Sub";
return "";
}
public String  _closedropdown(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "closedropdown", true))
	 {return ((String) Debug.delegate(ba, "closedropdown", null));}
RDebugUtils.currentLine=54001664;
 //BA.debugLineNum = 54001664;BA.debugLine="Public Sub CloseDropDown";
RDebugUtils.currentLine=54001665;
 //BA.debugLineNum = 54001665;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=54001666;
 //BA.debugLineNum = 54001666;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.ef.sd_xcombobox __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=55640064;
 //BA.debugLineNum = 55640064;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=55640065;
 //BA.debugLineNum = 55640065;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=55640066;
 //BA.debugLineNum = 55640066;BA.debugLine="L.Initialize(EventName)";
_l.Initialize(ba,_eventname);
RDebugUtils.currentLine=55640067;
 //BA.debugLineNum = 55640067;BA.debugLine="Return L";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l.getObject()));
RDebugUtils.currentLine=55640068;
 //BA.debugLineNum = 55640068;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextview(b4a.example.ef.sd_xcombobox __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "createtextview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.EditTextWrapper _t = null;
RDebugUtils.currentLine=55705600;
 //BA.debugLineNum = 55705600;BA.debugLine="Private Sub CreateTextView(EventName As String) As";
RDebugUtils.currentLine=55705602;
 //BA.debugLineNum = 55705602;BA.debugLine="Dim T As EditText";
_t = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=55705603;
 //BA.debugLineNum = 55705603;BA.debugLine="T.Initialize(EventName)";
_t.Initialize(ba,_eventname);
RDebugUtils.currentLine=55705611;
 //BA.debugLineNum = 55705611;BA.debugLine="Return T";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_t.getObject()));
RDebugUtils.currentLine=55705612;
 //BA.debugLineNum = 55705612;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=52822016;
 //BA.debugLineNum = 52822016;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=52822017;
 //BA.debugLineNum = 52822017;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=52822018;
 //BA.debugLineNum = 52822018;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=52822019;
 //BA.debugLineNum = 52822019;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=52822021;
 //BA.debugLineNum = 52822021;BA.debugLine="If Props.ContainsKey(\"RTL\") Then RTL=Props.Get(\"R";
if (_props.ContainsKey((Object)("RTL"))) { 
__ref._rtl /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("RTL")));};
RDebugUtils.currentLine=52822022;
 //BA.debugLineNum = 52822022;BA.debugLine="If Props.ContainsKey(\"Style\") Then Style=Props.Ge";
if (_props.ContainsKey((Object)("Style"))) { 
__ref._style /*String*/  = BA.ObjectToString(_props.Get((Object)("Style")));};
RDebugUtils.currentLine=52822023;
 //BA.debugLineNum = 52822023;BA.debugLine="If Props.ContainsKey(\"Align\") Then Align=Props.Ge";
if (_props.ContainsKey((Object)("Align"))) { 
__ref._align /*String*/  = BA.ObjectToString(_props.Get((Object)("Align")));};
RDebugUtils.currentLine=52822024;
 //BA.debugLineNum = 52822024;BA.debugLine="If Props.ContainsKey(\"TextAlign\") Then TextAlign=";
if (_props.ContainsKey((Object)("TextAlign"))) { 
__ref._textalign /*String*/  = BA.ObjectToString(_props.Get((Object)("TextAlign")));};
RDebugUtils.currentLine=52822025;
 //BA.debugLineNum = 52822025;BA.debugLine="If Props.ContainsKey(\"CornerColor\") Then CornerCo";
if (_props.ContainsKey((Object)("CornerColor"))) { 
__ref._cornercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CornerColor")));}
else {
__ref._cornercolor /*int*/  = __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor();};
RDebugUtils.currentLine=52822026;
 //BA.debugLineNum = 52822026;BA.debugLine="If Props.ContainsKey(\"Background\") Then	BClr=xui.";
if (_props.ContainsKey((Object)("Background"))) { 
__ref._bclr /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Background")));}
else {
__ref._bclr /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor();};
RDebugUtils.currentLine=52822027;
 //BA.debugLineNum = 52822027;BA.debugLine="If Props.ContainsKey(\"Editable\") Then Editable=Pr";
if (_props.ContainsKey((Object)("Editable"))) { 
__ref._editable /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Editable")));};
RDebugUtils.currentLine=52822028;
 //BA.debugLineNum = 52822028;BA.debugLine="Corner=Props.Get(\"Corner\")";
__ref._corner /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Corner"))));
RDebugUtils.currentLine=52822029;
 //BA.debugLineNum = 52822029;BA.debugLine="Corner=Corner*(100dip/100)";
__ref._corner /*int*/  = (int) (__ref._corner /*int*/ *(__c.DipToCurrent((int) (100))/(double)100));
RDebugUtils.currentLine=52822037;
 //BA.debugLineNum = 52822037;BA.debugLine="If Editable Then MyLabel=CreateTextView(\"MyLabel\"";
if (__ref._editable /*boolean*/ ) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"MyLabel");}
else {
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"MyLabel");};
RDebugUtils.currentLine=52822039;
 //BA.debugLineNum = 52822039;BA.debugLine="MyLabel.TextColor=Lbl.As(B4XView).TextColor";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getTextColor());
RDebugUtils.currentLine=52822040;
 //BA.debugLineNum = 52822040;BA.debugLine="MyLabel.TextSize=Lbl.As(B4XView).TextSize";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getTextSize());
RDebugUtils.currentLine=52822041;
 //BA.debugLineNum = 52822041;BA.debugLine="MyLabel.Font=Lbl.As(B4XView).Font";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getFont());
RDebugUtils.currentLine=52822042;
 //BA.debugLineNum = 52822042;BA.debugLine="If Editable = False Then MyLabel.SetTextAlignment";
if (__ref._editable /*boolean*/ ==__c.False) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER",__ref._textalign /*String*/ );};
RDebugUtils.currentLine=52822043;
 //BA.debugLineNum = 52822043;BA.debugLine="MyLabel.Color=xui.Color_Transparent";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=52822044;
 //BA.debugLineNum = 52822044;BA.debugLine="MyLabel.Text=Lbl.As(B4XView).Text";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getText()));
RDebugUtils.currentLine=52822045;
 //BA.debugLineNum = 52822045;BA.debugLine="If Editable Then MyLabel.EditTextHint=\"<none>\"";
if (__ref._editable /*boolean*/ ) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEditTextHint(BA.ObjectToCharSequence("<none>"));};
RDebugUtils.currentLine=52822047;
 //BA.debugLineNum = 52822047;BA.debugLine="LabelHint.Text=Chr(0xF006) 'lbx.EditTextHint";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf006))));
RDebugUtils.currentLine=52822048;
 //BA.debugLineNum = 52822048;BA.debugLine="LabelHint.TextColor=MyLabel.TextColor";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=52822049;
 //BA.debugLineNum = 52822049;BA.debugLine="LabelHint.Color=xui.Color_Transparent";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=52822050;
 //BA.debugLineNum = 52822050;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=52822051;
 //BA.debugLineNum = 52822051;BA.debugLine="LabelHint.Font=xui.CreateFontAwesome(MyLabel.Font";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont().getSize()));
RDebugUtils.currentLine=52822053;
 //BA.debugLineNum = 52822053;BA.debugLine="Select Style";
switch (BA.switchObjectToInt(__ref._style /*String*/ ,"Frame","Bead","Classic")) {
case 0: {
RDebugUtils.currentLine=52822055;
 //BA.debugLineNum = 52822055;BA.debugLine="mBase.SetColorAndBorder(BClr,1dip,CornerColor,C";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._bclr /*int*/ ,__c.DipToCurrent((int) (1)),__ref._cornercolor /*int*/ ,__ref._corner /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=52822057;
 //BA.debugLineNum = 52822057;BA.debugLine="LabelHint.TextColor=BClr";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=52822058;
 //BA.debugLineNum = 52822058;BA.debugLine="LabelHint.SetColorAndBorder(CornerColor,0dip,xu";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._cornercolor /*int*/ ,__c.DipToCurrent((int) (0)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=52822060;
 //BA.debugLineNum = 52822060;BA.debugLine="Dim Can As B4XCanvas";
_can = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=52822061;
 //BA.debugLineNum = 52822061;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=52822063;
 //BA.debugLineNum = 52822063;BA.debugLine="Can.Initialize(mBase)";
_can.Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=52822064;
 //BA.debugLineNum = 52822064;BA.debugLine="Rec.Initialize(20dip,mBase.Height/2,mBase.Width";
_rec.Initialize((float) (__c.DipToCurrent((int) (20))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (20))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=52822065;
 //BA.debugLineNum = 52822065;BA.debugLine="Can.DrawRect(Rec,CornerColor,True,0dip)";
_can.DrawRect(_rec,__ref._cornercolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (0))));
RDebugUtils.currentLine=52822066;
 //BA.debugLineNum = 52822066;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=52822067;
 //BA.debugLineNum = 52822067;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=52822068;
 //BA.debugLineNum = 52822068;BA.debugLine="Rec.Initialize(0dip,0dip,mBase.Width-45dip,mBa";
_rec.Initialize((float) (__c.DipToCurrent((int) (0))),(float) (__c.DipToCurrent((int) (0))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (45))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=52822069;
 //BA.debugLineNum = 52822069;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=52822070;
 //BA.debugLineNum = 52822070;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=52822071;
 //BA.debugLineNum = 52822071;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
_can.DrawPath(_path,__ref._bclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (0))));
 }else {
RDebugUtils.currentLine=52822073;
 //BA.debugLineNum = 52822073;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=52822074;
 //BA.debugLineNum = 52822074;BA.debugLine="Rec.Initialize(45dip,0dip,mBase.Width,mBase.He";
_rec.Initialize((float) (__c.DipToCurrent((int) (45))),(float) (__c.DipToCurrent((int) (0))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=52822075;
 //BA.debugLineNum = 52822075;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=52822076;
 //BA.debugLineNum = 52822076;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=52822077;
 //BA.debugLineNum = 52822077;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
_can.DrawPath(_path,__ref._bclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (0))));
 };
RDebugUtils.currentLine=52822079;
 //BA.debugLineNum = 52822079;BA.debugLine="Can.Invalidate";
_can.Invalidate();
 break; }
case 2: {
RDebugUtils.currentLine=52822081;
 //BA.debugLineNum = 52822081;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=52822082;
 //BA.debugLineNum = 52822082;BA.debugLine="LabelHint.Font=xui.CreateDefaultBoldFont(MyLabe";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont().getSize()-3)));
RDebugUtils.currentLine=52822083;
 //BA.debugLineNum = 52822083;BA.debugLine="LabelHint.Text=\"Set Hint\"";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Set Hint"));
 break; }
}
;
RDebugUtils.currentLine=52822086;
 //BA.debugLineNum = 52822086;BA.debugLine="If Style=\"Classic\" Then";
if ((__ref._style /*String*/ ).equals("Classic")) { 
RDebugUtils.currentLine=52822087;
 //BA.debugLineNum = 52822087;BA.debugLine="mBase.AddView(MyLabel,0dip,30dip,mBase.Width,mBa";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (30)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=52822088;
 //BA.debugLineNum = 52822088;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,mBase.Width-10";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=52822089;
 //BA.debugLineNum = 52822089;BA.debugLine="MyLabel.SetColorAndBorder(BClr,1dip,CornerColor,";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._bclr /*int*/ ,__c.DipToCurrent((int) (1)),__ref._cornercolor /*int*/ ,__ref._corner /*int*/ );
RDebugUtils.currentLine=52822090;
 //BA.debugLineNum = 52822090;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=52822091;
 //BA.debugLineNum = 52822091;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=52822092;
 //BA.debugLineNum = 52822092;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"RIGHT\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=52822096;
 //BA.debugLineNum = 52822096;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 }else {
RDebugUtils.currentLine=52822099;
 //BA.debugLineNum = 52822099;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"LEFT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=52822100;
 //BA.debugLineNum = 52822100;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"LEFT\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=52822104;
 //BA.debugLineNum = 52822104;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 };
 }else {
RDebugUtils.currentLine=52822108;
 //BA.debugLineNum = 52822108;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=52822109;
 //BA.debugLineNum = 52822109;BA.debugLine="mBase.AddView(LabelHint,mBase.Width-45dip,0dip,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (45))),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=52822110;
 //BA.debugLineNum = 52822110;BA.debugLine="mBase.AddView(MyLabel,5dip,0dip,mBase.Width-50d";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (50))),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=52822116;
 //BA.debugLineNum = 52822116;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=52822117;
 //BA.debugLineNum = 52822117;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 }else {
RDebugUtils.currentLine=52822120;
 //BA.debugLineNum = 52822120;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,40dip,mBase.H";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=52822121;
 //BA.debugLineNum = 52822121;BA.debugLine="mBase.AddView(MyLabel,50dip,0dip,mBase.Width-50";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (0)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (50))),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=52822125;
 //BA.debugLineNum = 52822125;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"LEFT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
 };
 };
RDebugUtils.currentLine=52822129;
 //BA.debugLineNum = 52822129;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=55574529;
 //BA.debugLineNum = 55574529;BA.debugLine="Dim Height As Int = 0";
_height = (int) (0);
RDebugUtils.currentLine=55574531;
 //BA.debugLineNum = 55574531;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_OpenLis";
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
RDebugUtils.currentLine=55574533;
 //BA.debugLineNum = 55574533;BA.debugLine="ListPanel.As(ScrollView).Panel.RemoveAllViews";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).getPanel().RemoveAllViews();
RDebugUtils.currentLine=55574534;
 //BA.debugLineNum = 55574534;BA.debugLine="ListPanel.Color=MyLabel.TextColor";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=55574540;
 //BA.debugLineNum = 55574540;BA.debugLine="For i=0 To ListItem.Size-1";
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
RDebugUtils.currentLine=55574541;
 //BA.debugLineNum = 55574541;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=55574542;
 //BA.debugLineNum = 55574542;BA.debugLine="Dim L As B4XView = CreateLabel(\"LabSelect\")";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"LabSelect");
RDebugUtils.currentLine=55574543;
 //BA.debugLineNum = 55574543;BA.debugLine="L.Color=BClr";
_l.setColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=55574544;
 //BA.debugLineNum = 55574544;BA.debugLine="L.TextColor=MyLabel.TextColor";
_l.setTextColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=55574545;
 //BA.debugLineNum = 55574545;BA.debugLine="L.Text=v.Get(\"Text\")";
_l.setText(BA.ObjectToCharSequence(_v.Get((Object)("Text"))));
RDebugUtils.currentLine=55574546;
 //BA.debugLineNum = 55574546;BA.debugLine="L.SetTextAlignment(\"CENTER\",Align)";
_l.SetTextAlignment("CENTER",__ref._align /*String*/ );
RDebugUtils.currentLine=55574547;
 //BA.debugLineNum = 55574547;BA.debugLine="L.Tag=i";
_l.setTag((Object)(_i));
RDebugUtils.currentLine=55574548;
 //BA.debugLineNum = 55574548;BA.debugLine="v.Put(\"object\",L)";
_v.Put((Object)("object"),(Object)(_l.getObject()));
RDebugUtils.currentLine=55574552;
 //BA.debugLineNum = 55574552;BA.debugLine="ListPanel.As(ScrollView).Panel.AddView(L,1dip,H";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).getPanel().AddView((android.view.View)(_l.getObject()),parent.__c.DipToCurrent((int) (1)),_height,(int) (__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-parent.__c.DipToCurrent((int) (2))),(int) (__ref._itemheight /*int*/ -parent.__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=55574557;
 //BA.debugLineNum = 55574557;BA.debugLine="Height=Height+ItemHeight";
_height = (int) (_height+__ref._itemheight /*int*/ );
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=55574561;
 //BA.debugLineNum = 55574561;BA.debugLine="ListPanel.As(ScrollView).Panel.Height=Height";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).getPanel().setHeight(_height);
RDebugUtils.currentLine=55574566;
 //BA.debugLineNum = 55574566;BA.debugLine="ListPanel.ScrollViewContentHeight=Height";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentHeight(_height);
RDebugUtils.currentLine=55574567;
 //BA.debugLineNum = 55574567;BA.debugLine="If Height<ListPanel.Height Then";
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
RDebugUtils.currentLine=55574568;
 //BA.debugLineNum = 55574568;BA.debugLine="If ListPanel.Top=0 Then";
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
RDebugUtils.currentLine=55574569;
 //BA.debugLineNum = 55574569;BA.debugLine="ListPanel.top=ListPanel.Height-Height";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_height));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=55574571;
 //BA.debugLineNum = 55574571;BA.debugLine="ListPanel.Height=Height";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(_height);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;
;
RDebugUtils.currentLine=55574574;
 //BA.debugLineNum = 55574574;BA.debugLine="If SelIndex>-1 Then";

case 20:
//if
this.state = 23;
if (__ref._selindex /*int*/ >-1) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=55574575;
 //BA.debugLineNum = 55574575;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "sd_xcombobox", "drawlistbox"),(int) (0));
this.state = 26;
return;
case 26:
//C
this.state = 23;
;
RDebugUtils.currentLine=55574576;
 //BA.debugLineNum = 55574576;BA.debugLine="setSelectedIndex(SelIndex)";
__ref._setselectedindex /*String*/ (null,__ref._selindex /*int*/ );
 if (true) break;

case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=55574578;
 //BA.debugLineNum = 55574578;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=54329344;
 //BA.debugLineNum = 54329344;BA.debugLine="Public Sub setSelectedIndex(Position As Int)";
RDebugUtils.currentLine=54329345;
 //BA.debugLineNum = 54329345;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=54329346;
 //BA.debugLineNum = 54329346;BA.debugLine="SelIndex=Position";
__ref._selindex /*int*/  = _position;
RDebugUtils.currentLine=54329347;
 //BA.debugLineNum = 54329347;BA.debugLine="MyLabel.Text=GetItem(Position)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,_position)));
RDebugUtils.currentLine=54329349;
 //BA.debugLineNum = 54329349;BA.debugLine="Dim Pos As Int = ItemHeight * Position";
_pos = (int) (__ref._itemheight /*int*/ *_position);
RDebugUtils.currentLine=54329351;
 //BA.debugLineNum = 54329351;BA.debugLine="ListPanel.As(ScrollView).ScrollPosition=Pos";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).setScrollPosition(_pos);
 }else 
{RDebugUtils.currentLine=54329357;
 //BA.debugLineNum = 54329357;BA.debugLine="else if Position=-1 Then";
if (_position==-1) { 
RDebugUtils.currentLine=54329358;
 //BA.debugLineNum = 54329358;BA.debugLine="SelIndex=Position";
__ref._selindex /*int*/  = _position;
 }}
;
RDebugUtils.currentLine=54329361;
 //BA.debugLineNum = 54329361;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=55508992;
 //BA.debugLineNum = 55508992;BA.debugLine="Private Sub fixPanel";
RDebugUtils.currentLine=55508993;
 //BA.debugLineNum = 55508993;BA.debugLine="Try";
try {RDebugUtils.currentLine=55508994;
 //BA.debugLineNum = 55508994;BA.debugLine="Dim Left As Int = mBase.Left";
_left = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft();
RDebugUtils.currentLine=55508995;
 //BA.debugLineNum = 55508995;BA.debugLine="Dim Top As Int = mBase.top";
_top = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop();
RDebugUtils.currentLine=55508996;
 //BA.debugLineNum = 55508996;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=55508997;
 //BA.debugLineNum = 55508997;BA.debugLine="Dim height As Int";
_height = 0;
RDebugUtils.currentLine=55508998;
 //BA.debugLineNum = 55508998;BA.debugLine="Dim prec As B4XView = mBase";
_prec = new anywheresoftware.b4a.objects.B4XViewWrapper();
_prec = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=55508999;
 //BA.debugLineNum = 55508999;BA.debugLine="Dim pnl As B4XView = mBase.Parent";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=55509001;
 //BA.debugLineNum = 55509001;BA.debugLine="Do While (pnl.Parent.IsInitialized) And (GetType";
while ((_pnl.getParent().IsInitialized()) && ((__c.GetType((Object)(_pnl.getObject()))).equals("B4IMainView") == false)) {
RDebugUtils.currentLine=55509003;
 //BA.debugLineNum = 55509003;BA.debugLine="Left=Left+pnl.Left";
_left = (int) (_left+_pnl.getLeft());
RDebugUtils.currentLine=55509004;
 //BA.debugLineNum = 55509004;BA.debugLine="Top=Top+pnl.Top";
_top = (int) (_top+_pnl.getTop());
RDebugUtils.currentLine=55509005;
 //BA.debugLineNum = 55509005;BA.debugLine="prec=pnl";
_prec = _pnl;
RDebugUtils.currentLine=55509006;
 //BA.debugLineNum = 55509006;BA.debugLine="pnl=pnl.Parent";
_pnl = _pnl.getParent();
 }
;
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=55509009;
 //BA.debugLineNum = 55509009;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("955509009",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=55509011;
 //BA.debugLineNum = 55509011;BA.debugLine="If xui.IsB4i Then pnl=prec";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
_pnl = _prec;};
RDebugUtils.currentLine=55509013;
 //BA.debugLineNum = 55509013;BA.debugLine="width=pnl.Width";
_width = _pnl.getWidth();
RDebugUtils.currentLine=55509014;
 //BA.debugLineNum = 55509014;BA.debugLine="height=pnl.Height";
_height = _pnl.getHeight();
RDebugUtils.currentLine=55509019;
 //BA.debugLineNum = 55509019;BA.debugLine="If width=-1 Then width=100%x";
if (_width==-1) { 
_width = __c.PerXToCurrent((float) (100),ba);};
RDebugUtils.currentLine=55509020;
 //BA.debugLineNum = 55509020;BA.debugLine="If height=-1 Then height=100%y";
if (_height==-1) { 
_height = __c.PerYToCurrent((float) (100),ba);};
RDebugUtils.currentLine=55509023;
 //BA.debugLineNum = 55509023;BA.debugLine="outListPanel.Color=xui.Color_ARGB(5,5,5,5)";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (5),(int) (5),(int) (5),(int) (5)));
RDebugUtils.currentLine=55509024;
 //BA.debugLineNum = 55509024;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=55509025;
 //BA.debugLineNum = 55509025;BA.debugLine="pnl.AddView(outListPanel,0,0,width,height)";
_pnl.AddView((android.view.View)(__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=55509027;
 //BA.debugLineNum = 55509027;BA.debugLine="If kbh>0 Then";
if (__ref._kbh /*int*/ >0) { 
RDebugUtils.currentLine=55509028;
 //BA.debugLineNum = 55509028;BA.debugLine="height=kbh";
_height = __ref._kbh /*int*/ ;
 };
RDebugUtils.currentLine=55509032;
 //BA.debugLineNum = 55509032;BA.debugLine="ListPanel.RemoveViewFromParent";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=55509034;
 //BA.debugLineNum = 55509034;BA.debugLine="If Top+(mBase.Height/2)>height/2 Then";
if (_top+(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)>_height/(double)2) { 
RDebugUtils.currentLine=55509036;
 //BA.debugLineNum = 55509036;BA.debugLine="outListPanel.AddView(ListPanel,Left,0,mBase.Widt";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_left,(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_top);
 }else {
RDebugUtils.currentLine=55509039;
 //BA.debugLineNum = 55509039;BA.debugLine="outListPanel.AddView(ListPanel,Left,Top+mBase.He";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_left,(int) (_top+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_top-__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (20))));
 };
RDebugUtils.currentLine=55509041;
 //BA.debugLineNum = 55509041;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getbase", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=52953088;
 //BA.debugLineNum = 52953088;BA.debugLine="Public Sub GetBase As B4XView";
RDebugUtils.currentLine=52953089;
 //BA.debugLineNum = 52953089;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=52953090;
 //BA.debugLineNum = 52953090;BA.debugLine="End Sub";
return null;
}
public String  _getcombotext(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getcombotext", true))
	 {return ((String) Debug.delegate(ba, "getcombotext", null));}
RDebugUtils.currentLine=53608448;
 //BA.debugLineNum = 53608448;BA.debugLine="Public Sub getComboText As String";
RDebugUtils.currentLine=53608449;
 //BA.debugLineNum = 53608449;BA.debugLine="Return MyLabel.Text";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=53608450;
 //BA.debugLineNum = 53608450;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=54657024;
 //BA.debugLineNum = 54657024;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=54657025;
 //BA.debugLineNum = 54657025;BA.debugLine="Return MyLabel.Enabled";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=54657026;
 //BA.debugLineNum = 54657026;BA.debugLine="End Sub";
return false;
}
public String  _gethint(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "gethint", true))
	 {return ((String) Debug.delegate(ba, "gethint", null));}
RDebugUtils.currentLine=53084160;
 //BA.debugLineNum = 53084160;BA.debugLine="Public Sub getHint As String";
RDebugUtils.currentLine=53084161;
 //BA.debugLineNum = 53084161;BA.debugLine="Return LabelHint.Text";
if (true) return __ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=53084162;
 //BA.debugLineNum = 53084162;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gethintfont(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "gethintfont", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) Debug.delegate(ba, "gethintfont", null));}
RDebugUtils.currentLine=53215232;
 //BA.debugLineNum = 53215232;BA.debugLine="Public Sub getHintFont As B4XFont";
RDebugUtils.currentLine=53215233;
 //BA.debugLineNum = 53215233;BA.debugLine="Return LabelHint.Font";
if (true) return __ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=53215234;
 //BA.debugLineNum = 53215234;BA.debugLine="End Sub";
return null;
}
public int  _getselectedindex(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectedindex", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedindex", null));}
RDebugUtils.currentLine=54263808;
 //BA.debugLineNum = 54263808;BA.debugLine="Public Sub getSelectedIndex As Int";
RDebugUtils.currentLine=54263809;
 //BA.debugLineNum = 54263809;BA.debugLine="Return SelIndex";
if (true) return __ref._selindex /*int*/ ;
RDebugUtils.currentLine=54263810;
 //BA.debugLineNum = 54263810;BA.debugLine="End Sub";
return 0;
}
public String  _getselectedtextitem(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectedtextitem", true))
	 {return ((String) Debug.delegate(ba, "getselectedtextitem", null));}
RDebugUtils.currentLine=54394880;
 //BA.debugLineNum = 54394880;BA.debugLine="Public Sub getSelectedTextItem As String";
RDebugUtils.currentLine=54394881;
 //BA.debugLineNum = 54394881;BA.debugLine="Return  GetItem(SelIndex)";
if (true) return __ref._getitem /*String*/ (null,__ref._selindex /*int*/ );
RDebugUtils.currentLine=54394882;
 //BA.debugLineNum = 54394882;BA.debugLine="End Sub";
return "";
}
public Object  _getselectedvalueitem(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectedvalueitem", true))
	 {return ((Object) Debug.delegate(ba, "getselectedvalueitem", null));}
RDebugUtils.currentLine=54525952;
 //BA.debugLineNum = 54525952;BA.debugLine="Public Sub getSelectedValueItem As Object";
RDebugUtils.currentLine=54525953;
 //BA.debugLineNum = 54525953;BA.debugLine="Return  GetValue(SelIndex)";
if (true) return __ref._getvalue /*Object*/ (null,__ref._selindex /*int*/ );
RDebugUtils.currentLine=54525954;
 //BA.debugLineNum = 54525954;BA.debugLine="End Sub";
return null;
}
public Object  _getvalue(b4a.example.ef.sd_xcombobox __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_position}));}
Object _ret = null;
RDebugUtils.currentLine=54198272;
 //BA.debugLineNum = 54198272;BA.debugLine="Public Sub GetValue(Position As Int) As Object";
RDebugUtils.currentLine=54198273;
 //BA.debugLineNum = 54198273;BA.debugLine="Dim Ret As Object";
_ret = new Object();
RDebugUtils.currentLine=54198274;
 //BA.debugLineNum = 54198274;BA.debugLine="If Position=-1 And Editable Then Return MyLabel.T";
if (_position==-1 && __ref._editable /*boolean*/ ) { 
if (true) return (Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());};
RDebugUtils.currentLine=54198275;
 //BA.debugLineNum = 54198275;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=54198276;
 //BA.debugLineNum = 54198276;BA.debugLine="Ret=ListItem.Get(Position).As(Map).Get(\"Value\")";
_ret = ((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_position)))).Get((Object)("Value"));
 };
RDebugUtils.currentLine=54198279;
 //BA.debugLineNum = 54198279;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=54198280;
 //BA.debugLineNum = 54198280;BA.debugLine="End Sub";
return null;
}
public int  _getselectionlength(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectionlength", true))
	 {return ((Integer) Debug.delegate(ba, "getselectionlength", null));}
RDebugUtils.currentLine=53477376;
 //BA.debugLineNum = 53477376;BA.debugLine="Public Sub getSelectionLength As Int";
RDebugUtils.currentLine=53477377;
 //BA.debugLineNum = 53477377;BA.debugLine="Return MyLabel.SelectionLength";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getSelectionLength();
RDebugUtils.currentLine=53477378;
 //BA.debugLineNum = 53477378;BA.debugLine="End Sub";
return 0;
}
public int  _getselectionstart(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectionstart", true))
	 {return ((Integer) Debug.delegate(ba, "getselectionstart", null));}
RDebugUtils.currentLine=53411840;
 //BA.debugLineNum = 53411840;BA.debugLine="Public Sub getSelectionStart As Int";
RDebugUtils.currentLine=53411841;
 //BA.debugLineNum = 53411841;BA.debugLine="Return MyLabel.SelectionStart";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getSelectionStart();
RDebugUtils.currentLine=53411842;
 //BA.debugLineNum = 53411842;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gettextfont(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "gettextfont", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) Debug.delegate(ba, "gettextfont", null));}
RDebugUtils.currentLine=53346304;
 //BA.debugLineNum = 53346304;BA.debugLine="Public Sub getTextFont As B4XFont";
RDebugUtils.currentLine=53346305;
 //BA.debugLineNum = 53346305;BA.debugLine="Return MyLabel.Font";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=53346306;
 //BA.debugLineNum = 53346306;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4a.objects.ScrollViewWrapper _sc = null;
RDebugUtils.currentLine=52756480;
 //BA.debugLineNum = 52756480;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=52756481;
 //BA.debugLineNum = 52756481;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=52756482;
 //BA.debugLineNum = 52756482;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=52756484;
 //BA.debugLineNum = 52756484;BA.debugLine="outListPanel=xui.CreatePanel(\"outListPanel\")";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"outListPanel");
RDebugUtils.currentLine=52756486;
 //BA.debugLineNum = 52756486;BA.debugLine="Dim Sc As ScrollView";
_sc = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=52756487;
 //BA.debugLineNum = 52756487;BA.debugLine="Sc.Initialize2(1000dip,\"Sc\")";
_sc.Initialize2(ba,__c.DipToCurrent((int) (1000)),"Sc");
RDebugUtils.currentLine=52756488;
 //BA.debugLineNum = 52756488;BA.debugLine="ListPanel=Sc";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sc.getObject()));
RDebugUtils.currentLine=52756490;
 //BA.debugLineNum = 52756490;BA.debugLine="kk.Initialize(\"kk\")";
__ref._kk /*anywheresoftware.b4a.objects.IME*/ .Initialize("kk");
RDebugUtils.currentLine=52756491;
 //BA.debugLineNum = 52756491;BA.debugLine="kk.AddHeightChangedEvent";
__ref._kk /*anywheresoftware.b4a.objects.IME*/ .AddHeightChangedEvent(ba);
RDebugUtils.currentLine=52756504;
 //BA.debugLineNum = 52756504;BA.debugLine="LabelHint=CreateLabel(\"LabelHint\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"LabelHint");
RDebugUtils.currentLine=52756506;
 //BA.debugLineNum = 52756506;BA.debugLine="ListItem.Initialize";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=52756507;
 //BA.debugLineNum = 52756507;BA.debugLine="SelIndex=-1";
__ref._selindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=52756509;
 //BA.debugLineNum = 52756509;BA.debugLine="ItemHeight=40dip";
__ref._itemheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=52756510;
 //BA.debugLineNum = 52756510;BA.debugLine="OpenDropDownOnFocus=True";
__ref._opendropdownonfocus /*boolean*/  = __c.True;
RDebugUtils.currentLine=52756511;
 //BA.debugLineNum = 52756511;BA.debugLine="End Sub";
return "";
}
public boolean  _isdropdownopen(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "isdropdownopen", true))
	 {return ((Boolean) Debug.delegate(ba, "isdropdownopen", null));}
RDebugUtils.currentLine=54067200;
 //BA.debugLineNum = 54067200;BA.debugLine="Public Sub isDropDownOpen As Boolean";
RDebugUtils.currentLine=54067201;
 //BA.debugLineNum = 54067201;BA.debugLine="Return (outListPanel.Parent.IsInitialized)";
if (true) return (__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized());
RDebugUtils.currentLine=54067202;
 //BA.debugLineNum = 54067202;BA.debugLine="End Sub";
return false;
}
public String  _kk_heightchanged(b4a.example.ef.sd_xcombobox __ref,int _newheight,int _oldheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "kk_heightchanged", true))
	 {return ((String) Debug.delegate(ba, "kk_heightchanged", new Object[] {_newheight,_oldheight}));}
RDebugUtils.currentLine=55443456;
 //BA.debugLineNum = 55443456;BA.debugLine="Private Sub kk_HeightChanged (NewHeight As Int, Ol";
RDebugUtils.currentLine=55443457;
 //BA.debugLineNum = 55443457;BA.debugLine="kbh=NewHeight";
__ref._kbh /*int*/  = _newheight;
RDebugUtils.currentLine=55443459;
 //BA.debugLineNum = 55443459;BA.debugLine="If isDropDownOpen Then";
if (__ref._isdropdownopen /*boolean*/ (null)) { 
RDebugUtils.currentLine=55443460;
 //BA.debugLineNum = 55443460;BA.debugLine="CloseDropDown";
__ref._closedropdown /*String*/ (null);
RDebugUtils.currentLine=55443461;
 //BA.debugLineNum = 55443461;BA.debugLine="fixPanel";
__ref._fixpanel /*String*/ (null);
RDebugUtils.currentLine=55443462;
 //BA.debugLineNum = 55443462;BA.debugLine="DrawListBox";
__ref._drawlistbox /*void*/ (null);
 };
RDebugUtils.currentLine=55443464;
 //BA.debugLineNum = 55443464;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=54853633;
 //BA.debugLineNum = 54853633;BA.debugLine="Dim L As B4XView = Sender";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=54853634;
 //BA.debugLineNum = 54853634;BA.debugLine="Dim index As Int = L.Tag";
_index = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=54853636;
 //BA.debugLineNum = 54853636;BA.debugLine="setSelectedIndex(index)";
__ref._setselectedindex /*String*/ (null,_index);
RDebugUtils.currentLine=54853637;
 //BA.debugLineNum = 54853637;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "sd_xcombobox", "labselect_click"),(int) (100));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=54853638;
 //BA.debugLineNum = 54853638;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
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
RDebugUtils.currentLine=54853639;
 //BA.debugLineNum = 54853639;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=54853640;
 //BA.debugLineNum = 54853640;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=55115776;
 //BA.debugLineNum = 55115776;BA.debugLine="Private Sub MyLabel_Action";
RDebugUtils.currentLine=55115778;
 //BA.debugLineNum = 55115778;BA.debugLine="SelectedItem(MyLabel.Text)";
__ref._selecteditem /*void*/ (null,__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=55115779;
 //BA.debugLineNum = 55115779;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=55312385;
 //BA.debugLineNum = 55312385;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
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
RDebugUtils.currentLine=55312386;
 //BA.debugLineNum = 55312386;BA.debugLine="If SelectOnlyFromList Then";
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
RDebugUtils.currentLine=55312387;
 //BA.debugLineNum = 55312387;BA.debugLine="SelIndex=FindIndex";
__ref._selindex /*int*/  = __ref._findindex /*int*/ ;
RDebugUtils.currentLine=55312388;
 //BA.debugLineNum = 55312388;BA.debugLine="MyLabel.Text=GetItem(SelIndex)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,__ref._selindex /*int*/ )));
RDebugUtils.currentLine=55312389;
 //BA.debugLineNum = 55312389;BA.debugLine="CallSubDelayed3(mCallBack,mEventName & \"_ItemCl";
parent.__c.CallSubDelayed3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ItemClick",(Object)(__ref._selindex /*int*/ ),(Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=55312391;
 //BA.debugLineNum = 55312391;BA.debugLine="CallSubDelayed3(mCallBack,mEventName & \"_ItemCl";
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
RDebugUtils.currentLine=55312394;
 //BA.debugLineNum = 55312394;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "sd_xcombobox", "selecteditem"),(int) (100));
this.state = 11;
return;
case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=55312395;
 //BA.debugLineNum = 55312395;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=55312396;
 //BA.debugLineNum = 55312396;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=55050240;
 //BA.debugLineNum = 55050240;BA.debugLine="Private Sub MyLabel_BeginEdit";
RDebugUtils.currentLine=55050241;
 //BA.debugLineNum = 55050241;BA.debugLine="MyLabel_FocusChanged(True)";
__ref._mylabel_focuschanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=55050242;
 //BA.debugLineNum = 55050242;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_focuschanged(b4a.example.ef.sd_xcombobox __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "mylabel_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=54984704;
 //BA.debugLineNum = 54984704;BA.debugLine="Private Sub MyLabel_FocusChanged (HasFocus As Bool";
RDebugUtils.currentLine=54984705;
 //BA.debugLineNum = 54984705;BA.debugLine="If HasFocus And OpenDropDownOnFocus Then";
if (_hasfocus && __ref._opendropdownonfocus /*boolean*/ ) { 
RDebugUtils.currentLine=54984706;
 //BA.debugLineNum = 54984706;BA.debugLine="OpenDropDown";
__ref._opendropdown /*String*/ (null);
 };
RDebugUtils.currentLine=54984711;
 //BA.debugLineNum = 54984711;BA.debugLine="ModIntern=False";
__ref._modintern /*boolean*/  = __c.False;
RDebugUtils.currentLine=54984713;
 //BA.debugLineNum = 54984713;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(_hasfocus));};
RDebugUtils.currentLine=54984714;
 //BA.debugLineNum = 54984714;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_click(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_click", true))
	 {return ((String) Debug.delegate(ba, "mylabel_click", null));}
RDebugUtils.currentLine=54919168;
 //BA.debugLineNum = 54919168;BA.debugLine="Private Sub MyLabel_Click";
RDebugUtils.currentLine=54919169;
 //BA.debugLineNum = 54919169;BA.debugLine="OpenDropDown";
__ref._opendropdown /*String*/ (null);
RDebugUtils.currentLine=54919170;
 //BA.debugLineNum = 54919170;BA.debugLine="MyLabel.RequestFocus";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=54919171;
 //BA.debugLineNum = 54919171;BA.debugLine="End Sub";
return "";
}
public String  _opendropdown(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "opendropdown", true))
	 {return ((String) Debug.delegate(ba, "opendropdown", null));}
RDebugUtils.currentLine=53936128;
 //BA.debugLineNum = 53936128;BA.debugLine="Public Sub OpenDropDown";
RDebugUtils.currentLine=53936132;
 //BA.debugLineNum = 53936132;BA.debugLine="fixPanel";
__ref._fixpanel /*String*/ (null);
RDebugUtils.currentLine=53936133;
 //BA.debugLineNum = 53936133;BA.debugLine="DrawListBox";
__ref._drawlistbox /*void*/ (null);
RDebugUtils.currentLine=53936134;
 //BA.debugLineNum = 53936134;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_endedit(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_endedit", true))
	 {return ((String) Debug.delegate(ba, "mylabel_endedit", null));}
RDebugUtils.currentLine=55246848;
 //BA.debugLineNum = 55246848;BA.debugLine="Private Sub MyLabel_EndEdit";
RDebugUtils.currentLine=55246850;
 //BA.debugLineNum = 55246850;BA.debugLine="MyLabel_FocusChanged(False)";
__ref._mylabel_focuschanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=55246852;
 //BA.debugLineNum = 55246852;BA.debugLine="SelectedItem(MyLabel.Text)";
__ref._selecteditem /*void*/ (null,__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=55246853;
 //BA.debugLineNum = 55246853;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_enterpressed(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "mylabel_enterpressed", null));}
RDebugUtils.currentLine=55181312;
 //BA.debugLineNum = 55181312;BA.debugLine="Private Sub MyLabel_EnterPressed";
RDebugUtils.currentLine=55181314;
 //BA.debugLineNum = 55181314;BA.debugLine="SelectedItem(MyLabel.Text)";
__ref._selecteditem /*void*/ (null,__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=55181315;
 //BA.debugLineNum = 55181315;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=55377920;
 //BA.debugLineNum = 55377920;BA.debugLine="Private Sub MyLabel_TextChanged (OldText As String";
RDebugUtils.currentLine=55377921;
 //BA.debugLineNum = 55377921;BA.debugLine="If ModIntern Then";
if (__ref._modintern /*boolean*/ ) { 
RDebugUtils.currentLine=55377922;
 //BA.debugLineNum = 55377922;BA.debugLine="ModIntern=False";
__ref._modintern /*boolean*/  = __c.False;
RDebugUtils.currentLine=55377923;
 //BA.debugLineNum = 55377923;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=55377925;
 //BA.debugLineNum = 55377925;BA.debugLine="If OldText=NewText Then Return";
if ((_oldtext).equals(_newtext)) { 
if (true) return "";};
RDebugUtils.currentLine=55377926;
 //BA.debugLineNum = 55377926;BA.debugLine="If isDropDownOpen=False And OpenDropDownOnFocus T";
if (__ref._isdropdownopen /*boolean*/ (null)==__c.False && __ref._opendropdownonfocus /*boolean*/ ) { 
__ref._opendropdown /*String*/ (null);};
RDebugUtils.currentLine=55377927;
 //BA.debugLineNum = 55377927;BA.debugLine="FindIndex = -1";
__ref._findindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=55377929;
 //BA.debugLineNum = 55377929;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=55377930;
 //BA.debugLineNum = 55377930;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=55377932;
 //BA.debugLineNum = 55377932;BA.debugLine="If v.Get(\"Text\").As(String).ToLowerCase.IndexOf(";
if ((BA.ObjectToString(_v.Get((Object)("Text")))).toLowerCase().indexOf(_newtext.toLowerCase())>-1) { 
RDebugUtils.currentLine=55377933;
 //BA.debugLineNum = 55377933;BA.debugLine="FindIndex=i";
__ref._findindex /*int*/  = _i;
RDebugUtils.currentLine=55377934;
 //BA.debugLineNum = 55377934;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=55377938;
 //BA.debugLineNum = 55377938;BA.debugLine="If SelIndex>-1 And SelIndex<ListItem.Size Then";
if (__ref._selindex /*int*/ >-1 && __ref._selindex /*int*/ <__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=55377939;
 //BA.debugLineNum = 55377939;BA.debugLine="If ListItem.Get(SelIndex).As(Map).Get(\"object\").";
if (((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).IsInitialized()) { 
RDebugUtils.currentLine=55377940;
 //BA.debugLineNum = 55377940;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=55377941;
 //BA.debugLineNum = 55377941;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setTextColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
 };
 };
RDebugUtils.currentLine=55377945;
 //BA.debugLineNum = 55377945;BA.debugLine="SelIndex=FindIndex";
__ref._selindex /*int*/  = __ref._findindex /*int*/ ;
RDebugUtils.currentLine=55377946;
 //BA.debugLineNum = 55377946;BA.debugLine="If SelIndex>-1 And SelIndex<ListItem.Size Then";
if (__ref._selindex /*int*/ >-1 && __ref._selindex /*int*/ <__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=55377947;
 //BA.debugLineNum = 55377947;BA.debugLine="If ListItem.Get(SelIndex).As(Map).Get(\"object\").";
if (((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).IsInitialized()) { 
RDebugUtils.currentLine=55377948;
 //BA.debugLineNum = 55377948;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=55377949;
 //BA.debugLineNum = 55377949;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setTextColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=55377952;
 //BA.debugLineNum = 55377952;BA.debugLine="Dim StartPosition As Int = ListItem.Get(SelInde";
_startposition = ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).getTop();
RDebugUtils.currentLine=55377953;
 //BA.debugLineNum = 55377953;BA.debugLine="Dim EndPosition As Int = StartPosition + ListIt";
_endposition = (int) (_startposition+((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).getHeight());
RDebugUtils.currentLine=55377954;
 //BA.debugLineNum = 55377954;BA.debugLine="Dim StartVisible As Int = ListPanel.ScrollViewO";
_startvisible = __ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetY();
RDebugUtils.currentLine=55377955;
 //BA.debugLineNum = 55377955;BA.debugLine="Dim EndVisible As Int = StartVisible + ListPane";
_endvisible = (int) (_startvisible+__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=55377957;
 //BA.debugLineNum = 55377957;BA.debugLine="If Not((StartPosition>=StartVisible And StartPo";
if (__c.Not((_startposition>=_startvisible && _startposition<_endvisible) && (_endposition>_startvisible && _endposition<=_endvisible))) { 
RDebugUtils.currentLine=55377959;
 //BA.debugLineNum = 55377959;BA.debugLine="If StartPosition>ListPanel.ScrollViewContentHe";
if (_startposition>__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight()-__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=55377960;
 //BA.debugLineNum = 55377960;BA.debugLine="ListPanel.ScrollViewOffsetY=ListPanel.ScrollV";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetY((int) (__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight()-__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 }else {
RDebugUtils.currentLine=55377962;
 //BA.debugLineNum = 55377962;BA.debugLine="ListPanel.ScrollViewOffsetY=StartPosition";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetY(_startposition);
 };
 };
 };
 };
RDebugUtils.currentLine=55377967;
 //BA.debugLineNum = 55377967;BA.debugLine="End Sub";
return "";
}
public String  _outlistpanel_click(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "outlistpanel_click", true))
	 {return ((String) Debug.delegate(ba, "outlistpanel_click", null));}
RDebugUtils.currentLine=54788096;
 //BA.debugLineNum = 54788096;BA.debugLine="Private Sub outListPanel_Click";
RDebugUtils.currentLine=54788097;
 //BA.debugLineNum = 54788097;BA.debugLine="CloseDropDown";
__ref._closedropdown /*String*/ (null);
RDebugUtils.currentLine=54788098;
 //BA.debugLineNum = 54788098;BA.debugLine="outListPanel.RequestFocus";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=54788099;
 //BA.debugLineNum = 54788099;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(__c.False));};
RDebugUtils.currentLine=54788100;
 //BA.debugLineNum = 54788100;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4a.example.ef.sd_xcombobox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=54722560;
 //BA.debugLineNum = 54722560;BA.debugLine="Public Sub setEnabled(B As Boolean)";
RDebugUtils.currentLine=54722561;
 //BA.debugLineNum = 54722561;BA.debugLine="MyLabel.Enabled=B";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_b);
RDebugUtils.currentLine=54722562;
 //BA.debugLineNum = 54722562;BA.debugLine="End Sub";
return "";
}
public String  _sethint(b4a.example.ef.sd_xcombobox __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "sethint", true))
	 {return ((String) Debug.delegate(ba, "sethint", new Object[] {_text}));}
RDebugUtils.currentLine=53018624;
 //BA.debugLineNum = 53018624;BA.debugLine="Public Sub setHint(Text As String)";
RDebugUtils.currentLine=53018625;
 //BA.debugLineNum = 53018625;BA.debugLine="LabelHint.Text=Text";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=53018626;
 //BA.debugLineNum = 53018626;BA.debugLine="End Sub";
return "";
}
public String  _sethintfont(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "sethintfont", true))
	 {return ((String) Debug.delegate(ba, "sethintfont", new Object[] {_fnt}));}
RDebugUtils.currentLine=53149696;
 //BA.debugLineNum = 53149696;BA.debugLine="Public Sub setHintFont(Fnt As B4XFont)";
RDebugUtils.currentLine=53149697;
 //BA.debugLineNum = 53149697;BA.debugLine="LabelHint.Font=Fnt";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_fnt);
RDebugUtils.currentLine=53149698;
 //BA.debugLineNum = 53149698;BA.debugLine="End Sub";
return "";
}
public String  _setselectedtextitem(b4a.example.ef.sd_xcombobox __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setselectedtextitem", true))
	 {return ((String) Debug.delegate(ba, "setselectedtextitem", new Object[] {_value}));}
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
RDebugUtils.currentLine=54460416;
 //BA.debugLineNum = 54460416;BA.debugLine="Public Sub setSelectedTextItem(Value As String)";
RDebugUtils.currentLine=54460417;
 //BA.debugLineNum = 54460417;BA.debugLine="If Editable Then";
if (__ref._editable /*boolean*/ ) { 
RDebugUtils.currentLine=54460418;
 //BA.debugLineNum = 54460418;BA.debugLine="ModIntern=True";
__ref._modintern /*boolean*/  = __c.True;
RDebugUtils.currentLine=54460419;
 //BA.debugLineNum = 54460419;BA.debugLine="MyLabel.Text=Value";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_value));
 }else {
RDebugUtils.currentLine=54460421;
 //BA.debugLineNum = 54460421;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=54460422;
 //BA.debugLineNum = 54460422;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=54460423;
 //BA.debugLineNum = 54460423;BA.debugLine="If Value = v.Get(\"Text\") Then";
if ((_value).equals(BA.ObjectToString(_v.Get((Object)("Text"))))) { 
RDebugUtils.currentLine=54460424;
 //BA.debugLineNum = 54460424;BA.debugLine="SelIndex=i";
__ref._selindex /*int*/  = _i;
RDebugUtils.currentLine=54460425;
 //BA.debugLineNum = 54460425;BA.debugLine="MyLabel.Text=GetItem(I)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,_i)));
 };
 }
};
 };
RDebugUtils.currentLine=54460429;
 //BA.debugLineNum = 54460429;BA.debugLine="End Sub";
return "";
}
public String  _setselectedvalueitem(b4a.example.ef.sd_xcombobox __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setselectedvalueitem", true))
	 {return ((String) Debug.delegate(ba, "setselectedvalueitem", new Object[] {_value}));}
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
RDebugUtils.currentLine=54591488;
 //BA.debugLineNum = 54591488;BA.debugLine="Public Sub setSelectedValueItem(Value As Object)";
RDebugUtils.currentLine=54591489;
 //BA.debugLineNum = 54591489;BA.debugLine="If Editable Then";
if (__ref._editable /*boolean*/ ) { 
RDebugUtils.currentLine=54591490;
 //BA.debugLineNum = 54591490;BA.debugLine="ModIntern=True";
__ref._modintern /*boolean*/  = __c.True;
RDebugUtils.currentLine=54591491;
 //BA.debugLineNum = 54591491;BA.debugLine="MyLabel.Text=Value";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_value));
 }else {
RDebugUtils.currentLine=54591493;
 //BA.debugLineNum = 54591493;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=54591494;
 //BA.debugLineNum = 54591494;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=54591495;
 //BA.debugLineNum = 54591495;BA.debugLine="If Value = v.Get(\"Value\") Then";
if ((_value).equals(_v.Get((Object)("Value")))) { 
RDebugUtils.currentLine=54591496;
 //BA.debugLineNum = 54591496;BA.debugLine="SelIndex=i";
__ref._selindex /*int*/  = _i;
RDebugUtils.currentLine=54591497;
 //BA.debugLineNum = 54591497;BA.debugLine="MyLabel.Text=GetItem(I)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,_i)));
 };
 }
};
 };
RDebugUtils.currentLine=54591501;
 //BA.debugLineNum = 54591501;BA.debugLine="End Sub";
return "";
}
public String  _setselection(b4a.example.ef.sd_xcombobox __ref,int _start,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setselection", true))
	 {return ((String) Debug.delegate(ba, "setselection", new Object[] {_start,_length}));}
RDebugUtils.currentLine=53542912;
 //BA.debugLineNum = 53542912;BA.debugLine="Public Sub SetSelection(Start As Int, Length As In";
RDebugUtils.currentLine=53542913;
 //BA.debugLineNum = 53542913;BA.debugLine="MyLabel.SetSelection(Start,Length)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetSelection(_start,_length);
RDebugUtils.currentLine=53542914;
 //BA.debugLineNum = 53542914;BA.debugLine="End Sub";
return "";
}
public String  _settextfont(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "settextfont", true))
	 {return ((String) Debug.delegate(ba, "settextfont", new Object[] {_fnt}));}
RDebugUtils.currentLine=53280768;
 //BA.debugLineNum = 53280768;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
RDebugUtils.currentLine=53280769;
 //BA.debugLineNum = 53280769;BA.debugLine="MyLabel.Font=Fnt";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_fnt);
RDebugUtils.currentLine=53280770;
 //BA.debugLineNum = 53280770;BA.debugLine="End Sub";
return "";
}
public int  _size(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "size", true))
	 {return ((Integer) Debug.delegate(ba, "size", null));}
RDebugUtils.currentLine=53805056;
 //BA.debugLineNum = 53805056;BA.debugLine="public Sub Size As Int";
RDebugUtils.currentLine=53805057;
 //BA.debugLineNum = 53805057;BA.debugLine="Return ListItem.Size";
if (true) return __ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=53805058;
 //BA.debugLineNum = 53805058;BA.debugLine="End Sub";
return 0;
}
}