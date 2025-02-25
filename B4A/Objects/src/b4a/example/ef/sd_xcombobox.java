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
RDebugUtils.currentLine=58589184;
 //BA.debugLineNum = 58589184;BA.debugLine="Public Sub Add(Text As String, ReturnValue As Obje";
RDebugUtils.currentLine=58589185;
 //BA.debugLineNum = 58589185;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58589186;
 //BA.debugLineNum = 58589186;BA.debugLine="M.Initialize";
_m.Initialize();
RDebugUtils.currentLine=58589187;
 //BA.debugLineNum = 58589187;BA.debugLine="M.Put(\"Text\",Text)";
_m.Put((Object)("Text"),(Object)(_text));
RDebugUtils.currentLine=58589188;
 //BA.debugLineNum = 58589188;BA.debugLine="M.Put(\"Value\",ReturnValue)";
_m.Put((Object)("Value"),_returnvalue);
RDebugUtils.currentLine=58589189;
 //BA.debugLineNum = 58589189;BA.debugLine="M.Put(\"object\",Null)";
_m.Put((Object)("object"),__c.Null);
RDebugUtils.currentLine=58589190;
 //BA.debugLineNum = 58589190;BA.debugLine="ListItem.Add(M)";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m.getObject()));
RDebugUtils.currentLine=58589192;
 //BA.debugLineNum = 58589192;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=58785792;
 //BA.debugLineNum = 58785792;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=58785793;
 //BA.debugLineNum = 58785793;BA.debugLine="ListItem.Clear";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=58785794;
 //BA.debugLineNum = 58785794;BA.debugLine="SelIndex=-1";
__ref._selindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=58785796;
 //BA.debugLineNum = 58785796;BA.debugLine="if Editable then  MyLabel.EditTextHint=\"<none>\"";
if (__ref._editable /*boolean*/ ) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEditTextHint(BA.ObjectToCharSequence("<none>"));};
RDebugUtils.currentLine=58785797;
 //BA.debugLineNum = 58785797;BA.debugLine="MyLabel.Text=\"\"";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=58785798;
 //BA.debugLineNum = 58785798;BA.debugLine="End Sub";
return "";
}
public String  _getitem(b4a.example.ef.sd_xcombobox __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getitem", true))
	 {return ((String) Debug.delegate(ba, "getitem", new Object[] {_position}));}
String _ret = "";
RDebugUtils.currentLine=59047936;
 //BA.debugLineNum = 59047936;BA.debugLine="Public Sub GetItem(Position As Int) As String";
RDebugUtils.currentLine=59047937;
 //BA.debugLineNum = 59047937;BA.debugLine="Dim Ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=59047940;
 //BA.debugLineNum = 59047940;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=59047941;
 //BA.debugLineNum = 59047941;BA.debugLine="Ret=ListItem.Get(Position).As(Map).Get(\"Text\")";
_ret = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_position)))).Get((Object)("Text")));
 };
RDebugUtils.currentLine=59047943;
 //BA.debugLineNum = 59047943;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=59047944;
 //BA.debugLineNum = 59047944;BA.debugLine="End Sub";
return "";
}
public String  _addall(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.objects.collections.List _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "addall", true))
	 {return ((String) Debug.delegate(ba, "addall", new Object[] {_l}));}
String _text = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Public Sub AddAll(L As List)";
RDebugUtils.currentLine=58654721;
 //BA.debugLineNum = 58654721;BA.debugLine="For Each text As String In L";
{
final anywheresoftware.b4a.BA.IterableList group1 = _l;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_text = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=58654722;
 //BA.debugLineNum = 58654722;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58654723;
 //BA.debugLineNum = 58654723;BA.debugLine="M.Initialize";
_m.Initialize();
RDebugUtils.currentLine=58654724;
 //BA.debugLineNum = 58654724;BA.debugLine="M.Put(\"Text\",text)";
_m.Put((Object)("Text"),(Object)(_text));
RDebugUtils.currentLine=58654725;
 //BA.debugLineNum = 58654725;BA.debugLine="M.Put(\"Value\",text)";
_m.Put((Object)("Value"),(Object)(_text));
RDebugUtils.currentLine=58654726;
 //BA.debugLineNum = 58654726;BA.debugLine="M.Put(\"object\",Null)";
_m.Put((Object)("object"),__c.Null);
RDebugUtils.currentLine=58654728;
 //BA.debugLineNum = 58654728;BA.debugLine="ListItem.Add(M)";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m.getObject()));
 }
};
RDebugUtils.currentLine=58654731;
 //BA.debugLineNum = 58654731;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.ef.sd_xcombobox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=57802753;
 //BA.debugLineNum = 57802753;BA.debugLine="If Style=\"Classic\" Then";
if ((__ref._style /*String*/ ).equals("Classic")) { 
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="MyLabel.Width=Width-10dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width-__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=57802755;
 //BA.debugLineNum = 57802755;BA.debugLine="MyLabel.Height=Height-30dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height-__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=57802756;
 //BA.debugLineNum = 57802756;BA.debugLine="LabelHint.Width=Width";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width));
 }else {
RDebugUtils.currentLine=57802758;
 //BA.debugLineNum = 57802758;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=57802759;
 //BA.debugLineNum = 57802759;BA.debugLine="MyLabel.Width=Width-50dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width-__c.DipToCurrent((int) (50))));
RDebugUtils.currentLine=57802760;
 //BA.debugLineNum = 57802760;BA.debugLine="MyLabel.Height=Height";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
RDebugUtils.currentLine=57802761;
 //BA.debugLineNum = 57802761;BA.debugLine="LabelHint.Left=Width-45dip";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (_width-__c.DipToCurrent((int) (45))));
RDebugUtils.currentLine=57802762;
 //BA.debugLineNum = 57802762;BA.debugLine="LabelHint.Height=Height";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
 }else {
RDebugUtils.currentLine=57802764;
 //BA.debugLineNum = 57802764;BA.debugLine="MyLabel.Width=Width-50dip";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width-__c.DipToCurrent((int) (50))));
RDebugUtils.currentLine=57802765;
 //BA.debugLineNum = 57802765;BA.debugLine="MyLabel.Height=Height";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
RDebugUtils.currentLine=57802766;
 //BA.debugLineNum = 57802766;BA.debugLine="LabelHint.Height=Height";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
 };
 };
RDebugUtils.currentLine=57802773;
 //BA.debugLineNum = 57802773;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
RDebugUtils.currentLine=57606144;
 //BA.debugLineNum = 57606144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=57606145;
 //BA.debugLineNum = 57606145;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=57606146;
 //BA.debugLineNum = 57606146;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=57606147;
 //BA.debugLineNum = 57606147;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=57606148;
 //BA.debugLineNum = 57606148;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=57606149;
 //BA.debugLineNum = 57606149;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=57606151;
 //BA.debugLineNum = 57606151;BA.debugLine="Private outListPanel As B4XView";
_outlistpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=57606152;
 //BA.debugLineNum = 57606152;BA.debugLine="Private ListPanel As B4XView";
_listpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=57606153;
 //BA.debugLineNum = 57606153;BA.debugLine="Private ListItem As List";
_listitem = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57606154;
 //BA.debugLineNum = 57606154;BA.debugLine="Private SelIndex As Int";
_selindex = 0;
RDebugUtils.currentLine=57606155;
 //BA.debugLineNum = 57606155;BA.debugLine="Private FindIndex As Int = -1";
_findindex = (int) (-1);
RDebugUtils.currentLine=57606157;
 //BA.debugLineNum = 57606157;BA.debugLine="Private Editable As Boolean";
_editable = false;
RDebugUtils.currentLine=57606158;
 //BA.debugLineNum = 57606158;BA.debugLine="Private Corner As Int";
_corner = 0;
RDebugUtils.currentLine=57606159;
 //BA.debugLineNum = 57606159;BA.debugLine="Private Style As String = \"Frame\"";
_style = "Frame";
RDebugUtils.currentLine=57606160;
 //BA.debugLineNum = 57606160;BA.debugLine="Private Align As String = \"CENTER\"";
_align = "CENTER";
RDebugUtils.currentLine=57606161;
 //BA.debugLineNum = 57606161;BA.debugLine="Private TextAlign As String = \"LEFT\"";
_textalign = "LEFT";
RDebugUtils.currentLine=57606162;
 //BA.debugLineNum = 57606162;BA.debugLine="Private ModIntern As Boolean=False";
_modintern = __c.False;
RDebugUtils.currentLine=57606163;
 //BA.debugLineNum = 57606163;BA.debugLine="Private BClr As Int";
_bclr = 0;
RDebugUtils.currentLine=57606164;
 //BA.debugLineNum = 57606164;BA.debugLine="Private RTL As Boolean = False";
_rtl = __c.False;
RDebugUtils.currentLine=57606165;
 //BA.debugLineNum = 57606165;BA.debugLine="Private LabelHint As B4XView";
_labelhint = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=57606166;
 //BA.debugLineNum = 57606166;BA.debugLine="Private MyLabel As B4XView";
_mylabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=57606167;
 //BA.debugLineNum = 57606167;BA.debugLine="Private CornerColor As Int";
_cornercolor = 0;
RDebugUtils.currentLine=57606169;
 //BA.debugLineNum = 57606169;BA.debugLine="Private kbh As Int = 0";
_kbh = (int) (0);
RDebugUtils.currentLine=57606170;
 //BA.debugLineNum = 57606170;BA.debugLine="Public ItemHeight As Int";
_itemheight = 0;
RDebugUtils.currentLine=57606171;
 //BA.debugLineNum = 57606171;BA.debugLine="Public OpenDropDownOnFocus As Boolean";
_opendropdownonfocus = false;
RDebugUtils.currentLine=57606172;
 //BA.debugLineNum = 57606172;BA.debugLine="Public SelectOnlyFromList As Boolean = False";
_selectonlyfromlist = __c.False;
RDebugUtils.currentLine=57606175;
 //BA.debugLineNum = 57606175;BA.debugLine="Private kk As IME";
_kk = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=57606177;
 //BA.debugLineNum = 57606177;BA.debugLine="End Sub";
return "";
}
public String  _closedropdown(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "closedropdown", true))
	 {return ((String) Debug.delegate(ba, "closedropdown", null));}
RDebugUtils.currentLine=58916864;
 //BA.debugLineNum = 58916864;BA.debugLine="Public Sub CloseDropDown";
RDebugUtils.currentLine=58916865;
 //BA.debugLineNum = 58916865;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=58916866;
 //BA.debugLineNum = 58916866;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.ef.sd_xcombobox __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=60555264;
 //BA.debugLineNum = 60555264;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=60555265;
 //BA.debugLineNum = 60555265;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=60555266;
 //BA.debugLineNum = 60555266;BA.debugLine="L.Initialize(EventName)";
_l.Initialize(ba,_eventname);
RDebugUtils.currentLine=60555267;
 //BA.debugLineNum = 60555267;BA.debugLine="Return L";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l.getObject()));
RDebugUtils.currentLine=60555268;
 //BA.debugLineNum = 60555268;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextview(b4a.example.ef.sd_xcombobox __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "createtextview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.EditTextWrapper _t = null;
RDebugUtils.currentLine=60620800;
 //BA.debugLineNum = 60620800;BA.debugLine="Private Sub CreateTextView(EventName As String) As";
RDebugUtils.currentLine=60620802;
 //BA.debugLineNum = 60620802;BA.debugLine="Dim T As EditText";
_t = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=60620803;
 //BA.debugLineNum = 60620803;BA.debugLine="T.Initialize(EventName)";
_t.Initialize(ba,_eventname);
RDebugUtils.currentLine=60620811;
 //BA.debugLineNum = 60620811;BA.debugLine="Return T";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_t.getObject()));
RDebugUtils.currentLine=60620812;
 //BA.debugLineNum = 60620812;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=57737216;
 //BA.debugLineNum = 57737216;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=57737217;
 //BA.debugLineNum = 57737217;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=57737218;
 //BA.debugLineNum = 57737218;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=57737219;
 //BA.debugLineNum = 57737219;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=57737221;
 //BA.debugLineNum = 57737221;BA.debugLine="If Props.ContainsKey(\"RTL\") Then RTL=Props.Get(\"R";
if (_props.ContainsKey((Object)("RTL"))) { 
__ref._rtl /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("RTL")));};
RDebugUtils.currentLine=57737222;
 //BA.debugLineNum = 57737222;BA.debugLine="If Props.ContainsKey(\"Style\") Then Style=Props.Ge";
if (_props.ContainsKey((Object)("Style"))) { 
__ref._style /*String*/  = BA.ObjectToString(_props.Get((Object)("Style")));};
RDebugUtils.currentLine=57737223;
 //BA.debugLineNum = 57737223;BA.debugLine="If Props.ContainsKey(\"Align\") Then Align=Props.Ge";
if (_props.ContainsKey((Object)("Align"))) { 
__ref._align /*String*/  = BA.ObjectToString(_props.Get((Object)("Align")));};
RDebugUtils.currentLine=57737224;
 //BA.debugLineNum = 57737224;BA.debugLine="If Props.ContainsKey(\"TextAlign\") Then TextAlign=";
if (_props.ContainsKey((Object)("TextAlign"))) { 
__ref._textalign /*String*/  = BA.ObjectToString(_props.Get((Object)("TextAlign")));};
RDebugUtils.currentLine=57737225;
 //BA.debugLineNum = 57737225;BA.debugLine="If Props.ContainsKey(\"CornerColor\") Then CornerCo";
if (_props.ContainsKey((Object)("CornerColor"))) { 
__ref._cornercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CornerColor")));}
else {
__ref._cornercolor /*int*/  = __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor();};
RDebugUtils.currentLine=57737226;
 //BA.debugLineNum = 57737226;BA.debugLine="If Props.ContainsKey(\"Background\") Then	BClr=xui.";
if (_props.ContainsKey((Object)("Background"))) { 
__ref._bclr /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Background")));}
else {
__ref._bclr /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor();};
RDebugUtils.currentLine=57737227;
 //BA.debugLineNum = 57737227;BA.debugLine="If Props.ContainsKey(\"Editable\") Then Editable=Pr";
if (_props.ContainsKey((Object)("Editable"))) { 
__ref._editable /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Editable")));};
RDebugUtils.currentLine=57737228;
 //BA.debugLineNum = 57737228;BA.debugLine="Corner=Props.Get(\"Corner\")";
__ref._corner /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Corner"))));
RDebugUtils.currentLine=57737229;
 //BA.debugLineNum = 57737229;BA.debugLine="Corner=Corner*(100dip/100)";
__ref._corner /*int*/  = (int) (__ref._corner /*int*/ *(__c.DipToCurrent((int) (100))/(double)100));
RDebugUtils.currentLine=57737237;
 //BA.debugLineNum = 57737237;BA.debugLine="If Editable Then MyLabel=CreateTextView(\"MyLabel\"";
if (__ref._editable /*boolean*/ ) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"MyLabel");}
else {
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"MyLabel");};
RDebugUtils.currentLine=57737239;
 //BA.debugLineNum = 57737239;BA.debugLine="MyLabel.TextColor=Lbl.As(B4XView).TextColor";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getTextColor());
RDebugUtils.currentLine=57737240;
 //BA.debugLineNum = 57737240;BA.debugLine="MyLabel.TextSize=Lbl.As(B4XView).TextSize";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getTextSize());
RDebugUtils.currentLine=57737241;
 //BA.debugLineNum = 57737241;BA.debugLine="MyLabel.Font=Lbl.As(B4XView).Font";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getFont());
RDebugUtils.currentLine=57737242;
 //BA.debugLineNum = 57737242;BA.debugLine="If Editable = False Then MyLabel.SetTextAlignment";
if (__ref._editable /*boolean*/ ==__c.False) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER",__ref._textalign /*String*/ );};
RDebugUtils.currentLine=57737243;
 //BA.debugLineNum = 57737243;BA.debugLine="MyLabel.Color=xui.Color_Transparent";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=57737244;
 //BA.debugLineNum = 57737244;BA.debugLine="MyLabel.Text=Lbl.As(B4XView).Text";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getText()));
RDebugUtils.currentLine=57737245;
 //BA.debugLineNum = 57737245;BA.debugLine="If Editable Then MyLabel.EditTextHint=\"<none>\"";
if (__ref._editable /*boolean*/ ) { 
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEditTextHint(BA.ObjectToCharSequence("<none>"));};
RDebugUtils.currentLine=57737247;
 //BA.debugLineNum = 57737247;BA.debugLine="LabelHint.Text=Chr(0xF006) 'lbx.EditTextHint";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf006))));
RDebugUtils.currentLine=57737248;
 //BA.debugLineNum = 57737248;BA.debugLine="LabelHint.TextColor=MyLabel.TextColor";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=57737249;
 //BA.debugLineNum = 57737249;BA.debugLine="LabelHint.Color=xui.Color_Transparent";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=57737250;
 //BA.debugLineNum = 57737250;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=57737251;
 //BA.debugLineNum = 57737251;BA.debugLine="LabelHint.Font=xui.CreateFontAwesome(MyLabel.Font";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont().getSize()));
RDebugUtils.currentLine=57737253;
 //BA.debugLineNum = 57737253;BA.debugLine="Select Style";
switch (BA.switchObjectToInt(__ref._style /*String*/ ,"Frame","Bead","Classic")) {
case 0: {
RDebugUtils.currentLine=57737255;
 //BA.debugLineNum = 57737255;BA.debugLine="mBase.SetColorAndBorder(BClr,1dip,CornerColor,C";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._bclr /*int*/ ,__c.DipToCurrent((int) (1)),__ref._cornercolor /*int*/ ,__ref._corner /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=57737257;
 //BA.debugLineNum = 57737257;BA.debugLine="LabelHint.TextColor=BClr";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=57737258;
 //BA.debugLineNum = 57737258;BA.debugLine="LabelHint.SetColorAndBorder(CornerColor,0dip,xu";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._cornercolor /*int*/ ,__c.DipToCurrent((int) (0)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=57737260;
 //BA.debugLineNum = 57737260;BA.debugLine="Dim Can As B4XCanvas";
_can = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=57737261;
 //BA.debugLineNum = 57737261;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=57737263;
 //BA.debugLineNum = 57737263;BA.debugLine="Can.Initialize(mBase)";
_can.Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=57737264;
 //BA.debugLineNum = 57737264;BA.debugLine="Rec.Initialize(20dip,mBase.Height/2,mBase.Width";
_rec.Initialize((float) (__c.DipToCurrent((int) (20))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (20))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=57737265;
 //BA.debugLineNum = 57737265;BA.debugLine="Can.DrawRect(Rec,CornerColor,True,0dip)";
_can.DrawRect(_rec,__ref._cornercolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (0))));
RDebugUtils.currentLine=57737266;
 //BA.debugLineNum = 57737266;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=57737267;
 //BA.debugLineNum = 57737267;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=57737268;
 //BA.debugLineNum = 57737268;BA.debugLine="Rec.Initialize(0dip,0dip,mBase.Width-45dip,mBa";
_rec.Initialize((float) (__c.DipToCurrent((int) (0))),(float) (__c.DipToCurrent((int) (0))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (45))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=57737269;
 //BA.debugLineNum = 57737269;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=57737270;
 //BA.debugLineNum = 57737270;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=57737271;
 //BA.debugLineNum = 57737271;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
_can.DrawPath(_path,__ref._bclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (0))));
 }else {
RDebugUtils.currentLine=57737273;
 //BA.debugLineNum = 57737273;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=57737274;
 //BA.debugLineNum = 57737274;BA.debugLine="Rec.Initialize(45dip,0dip,mBase.Width,mBase.He";
_rec.Initialize((float) (__c.DipToCurrent((int) (45))),(float) (__c.DipToCurrent((int) (0))),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=57737275;
 //BA.debugLineNum = 57737275;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=57737276;
 //BA.debugLineNum = 57737276;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=57737277;
 //BA.debugLineNum = 57737277;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
_can.DrawPath(_path,__ref._bclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (0))));
 };
RDebugUtils.currentLine=57737279;
 //BA.debugLineNum = 57737279;BA.debugLine="Can.Invalidate";
_can.Invalidate();
 break; }
case 2: {
RDebugUtils.currentLine=57737281;
 //BA.debugLineNum = 57737281;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=57737282;
 //BA.debugLineNum = 57737282;BA.debugLine="LabelHint.Font=xui.CreateDefaultBoldFont(MyLabe";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont().getSize()-3)));
RDebugUtils.currentLine=57737283;
 //BA.debugLineNum = 57737283;BA.debugLine="LabelHint.Text=\"Set Hint\"";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Set Hint"));
 break; }
}
;
RDebugUtils.currentLine=57737286;
 //BA.debugLineNum = 57737286;BA.debugLine="If Style=\"Classic\" Then";
if ((__ref._style /*String*/ ).equals("Classic")) { 
RDebugUtils.currentLine=57737287;
 //BA.debugLineNum = 57737287;BA.debugLine="mBase.AddView(MyLabel,0dip,30dip,mBase.Width,mBa";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (30)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=57737288;
 //BA.debugLineNum = 57737288;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,mBase.Width-10";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=57737289;
 //BA.debugLineNum = 57737289;BA.debugLine="MyLabel.SetColorAndBorder(BClr,1dip,CornerColor,";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._bclr /*int*/ ,__c.DipToCurrent((int) (1)),__ref._cornercolor /*int*/ ,__ref._corner /*int*/ );
RDebugUtils.currentLine=57737290;
 //BA.debugLineNum = 57737290;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=57737291;
 //BA.debugLineNum = 57737291;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=57737292;
 //BA.debugLineNum = 57737292;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"RIGHT\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=57737296;
 //BA.debugLineNum = 57737296;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 }else {
RDebugUtils.currentLine=57737299;
 //BA.debugLineNum = 57737299;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"LEFT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=57737300;
 //BA.debugLineNum = 57737300;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"LEFT\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=57737304;
 //BA.debugLineNum = 57737304;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 };
 }else {
RDebugUtils.currentLine=57737308;
 //BA.debugLineNum = 57737308;BA.debugLine="If RTL Then";
if (__ref._rtl /*boolean*/ ) { 
RDebugUtils.currentLine=57737309;
 //BA.debugLineNum = 57737309;BA.debugLine="mBase.AddView(LabelHint,mBase.Width-45dip,0dip,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (45))),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=57737310;
 //BA.debugLineNum = 57737310;BA.debugLine="mBase.AddView(MyLabel,5dip,0dip,mBase.Width-50d";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (50))),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=57737316;
 //BA.debugLineNum = 57737316;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=57737317;
 //BA.debugLineNum = 57737317;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 }else {
RDebugUtils.currentLine=57737320;
 //BA.debugLineNum = 57737320;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,40dip,mBase.H";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=57737321;
 //BA.debugLineNum = 57737321;BA.debugLine="mBase.AddView(MyLabel,50dip,0dip,mBase.Width-50";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (0)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (50))),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=57737325;
 //BA.debugLineNum = 57737325;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"LEFT\")";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
 };
 };
RDebugUtils.currentLine=57737329;
 //BA.debugLineNum = 57737329;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=60489729;
 //BA.debugLineNum = 60489729;BA.debugLine="Dim Height As Int = 0";
_height = (int) (0);
RDebugUtils.currentLine=60489731;
 //BA.debugLineNum = 60489731;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_OpenLis";
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
RDebugUtils.currentLine=60489733;
 //BA.debugLineNum = 60489733;BA.debugLine="ListPanel.As(ScrollView).Panel.RemoveAllViews";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).getPanel().RemoveAllViews();
RDebugUtils.currentLine=60489734;
 //BA.debugLineNum = 60489734;BA.debugLine="ListPanel.Color=MyLabel.TextColor";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=60489740;
 //BA.debugLineNum = 60489740;BA.debugLine="For i=0 To ListItem.Size-1";
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
RDebugUtils.currentLine=60489741;
 //BA.debugLineNum = 60489741;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=60489742;
 //BA.debugLineNum = 60489742;BA.debugLine="Dim L As B4XView = CreateLabel(\"LabSelect\")";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"LabSelect");
RDebugUtils.currentLine=60489743;
 //BA.debugLineNum = 60489743;BA.debugLine="L.Color=BClr";
_l.setColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=60489744;
 //BA.debugLineNum = 60489744;BA.debugLine="L.TextColor=MyLabel.TextColor";
_l.setTextColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=60489745;
 //BA.debugLineNum = 60489745;BA.debugLine="L.Text=v.Get(\"Text\")";
_l.setText(BA.ObjectToCharSequence(_v.Get((Object)("Text"))));
RDebugUtils.currentLine=60489746;
 //BA.debugLineNum = 60489746;BA.debugLine="L.SetTextAlignment(\"CENTER\",Align)";
_l.SetTextAlignment("CENTER",__ref._align /*String*/ );
RDebugUtils.currentLine=60489747;
 //BA.debugLineNum = 60489747;BA.debugLine="L.Tag=i";
_l.setTag((Object)(_i));
RDebugUtils.currentLine=60489748;
 //BA.debugLineNum = 60489748;BA.debugLine="v.Put(\"object\",L)";
_v.Put((Object)("object"),(Object)(_l.getObject()));
RDebugUtils.currentLine=60489752;
 //BA.debugLineNum = 60489752;BA.debugLine="ListPanel.As(ScrollView).Panel.AddView(L,1dip,H";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).getPanel().AddView((android.view.View)(_l.getObject()),parent.__c.DipToCurrent((int) (1)),_height,(int) (__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-parent.__c.DipToCurrent((int) (2))),(int) (__ref._itemheight /*int*/ -parent.__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=60489757;
 //BA.debugLineNum = 60489757;BA.debugLine="Height=Height+ItemHeight";
_height = (int) (_height+__ref._itemheight /*int*/ );
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=60489761;
 //BA.debugLineNum = 60489761;BA.debugLine="ListPanel.As(ScrollView).Panel.Height=Height";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).getPanel().setHeight(_height);
RDebugUtils.currentLine=60489766;
 //BA.debugLineNum = 60489766;BA.debugLine="ListPanel.ScrollViewContentHeight=Height";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentHeight(_height);
RDebugUtils.currentLine=60489767;
 //BA.debugLineNum = 60489767;BA.debugLine="If Height<ListPanel.Height Then";
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
RDebugUtils.currentLine=60489768;
 //BA.debugLineNum = 60489768;BA.debugLine="If ListPanel.Top=0 Then";
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
RDebugUtils.currentLine=60489769;
 //BA.debugLineNum = 60489769;BA.debugLine="ListPanel.top=ListPanel.Height-Height";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_height));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=60489771;
 //BA.debugLineNum = 60489771;BA.debugLine="ListPanel.Height=Height";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(_height);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;
;
RDebugUtils.currentLine=60489774;
 //BA.debugLineNum = 60489774;BA.debugLine="If SelIndex>-1 Then";

case 20:
//if
this.state = 23;
if (__ref._selindex /*int*/ >-1) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=60489775;
 //BA.debugLineNum = 60489775;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "sd_xcombobox", "drawlistbox"),(int) (0));
this.state = 26;
return;
case 26:
//C
this.state = 23;
;
RDebugUtils.currentLine=60489776;
 //BA.debugLineNum = 60489776;BA.debugLine="setSelectedIndex(SelIndex)";
__ref._setselectedindex /*String*/ (null,__ref._selindex /*int*/ );
 if (true) break;

case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=60489778;
 //BA.debugLineNum = 60489778;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=59244544;
 //BA.debugLineNum = 59244544;BA.debugLine="Public Sub setSelectedIndex(Position As Int)";
RDebugUtils.currentLine=59244545;
 //BA.debugLineNum = 59244545;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=59244546;
 //BA.debugLineNum = 59244546;BA.debugLine="SelIndex=Position";
__ref._selindex /*int*/  = _position;
RDebugUtils.currentLine=59244547;
 //BA.debugLineNum = 59244547;BA.debugLine="MyLabel.Text=GetItem(Position)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,_position)));
RDebugUtils.currentLine=59244549;
 //BA.debugLineNum = 59244549;BA.debugLine="Dim Pos As Int = ItemHeight * Position";
_pos = (int) (__ref._itemheight /*int*/ *_position);
RDebugUtils.currentLine=59244551;
 //BA.debugLineNum = 59244551;BA.debugLine="ListPanel.As(ScrollView).ScrollPosition=Pos";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()))).setScrollPosition(_pos);
 }else 
{RDebugUtils.currentLine=59244557;
 //BA.debugLineNum = 59244557;BA.debugLine="else if Position=-1 Then";
if (_position==-1) { 
RDebugUtils.currentLine=59244558;
 //BA.debugLineNum = 59244558;BA.debugLine="SelIndex=Position";
__ref._selindex /*int*/  = _position;
 }}
;
RDebugUtils.currentLine=59244561;
 //BA.debugLineNum = 59244561;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=60424192;
 //BA.debugLineNum = 60424192;BA.debugLine="Private Sub fixPanel";
RDebugUtils.currentLine=60424193;
 //BA.debugLineNum = 60424193;BA.debugLine="Try";
try {RDebugUtils.currentLine=60424194;
 //BA.debugLineNum = 60424194;BA.debugLine="Dim Left As Int = mBase.Left";
_left = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft();
RDebugUtils.currentLine=60424195;
 //BA.debugLineNum = 60424195;BA.debugLine="Dim Top As Int = mBase.top";
_top = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop();
RDebugUtils.currentLine=60424196;
 //BA.debugLineNum = 60424196;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=60424197;
 //BA.debugLineNum = 60424197;BA.debugLine="Dim height As Int";
_height = 0;
RDebugUtils.currentLine=60424198;
 //BA.debugLineNum = 60424198;BA.debugLine="Dim prec As B4XView = mBase";
_prec = new anywheresoftware.b4a.objects.B4XViewWrapper();
_prec = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=60424199;
 //BA.debugLineNum = 60424199;BA.debugLine="Dim pnl As B4XView = mBase.Parent";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=60424201;
 //BA.debugLineNum = 60424201;BA.debugLine="Do While (pnl.Parent.IsInitialized) And (GetType";
while ((_pnl.getParent().IsInitialized()) && ((__c.GetType((Object)(_pnl.getObject()))).equals("B4IMainView") == false)) {
RDebugUtils.currentLine=60424203;
 //BA.debugLineNum = 60424203;BA.debugLine="Left=Left+pnl.Left";
_left = (int) (_left+_pnl.getLeft());
RDebugUtils.currentLine=60424204;
 //BA.debugLineNum = 60424204;BA.debugLine="Top=Top+pnl.Top";
_top = (int) (_top+_pnl.getTop());
RDebugUtils.currentLine=60424205;
 //BA.debugLineNum = 60424205;BA.debugLine="prec=pnl";
_prec = _pnl;
RDebugUtils.currentLine=60424206;
 //BA.debugLineNum = 60424206;BA.debugLine="pnl=pnl.Parent";
_pnl = _pnl.getParent();
 }
;
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=60424209;
 //BA.debugLineNum = 60424209;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("960424209",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=60424211;
 //BA.debugLineNum = 60424211;BA.debugLine="If xui.IsB4i Then pnl=prec";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
_pnl = _prec;};
RDebugUtils.currentLine=60424213;
 //BA.debugLineNum = 60424213;BA.debugLine="width=pnl.Width";
_width = _pnl.getWidth();
RDebugUtils.currentLine=60424214;
 //BA.debugLineNum = 60424214;BA.debugLine="height=pnl.Height";
_height = _pnl.getHeight();
RDebugUtils.currentLine=60424219;
 //BA.debugLineNum = 60424219;BA.debugLine="If width=-1 Then width=100%x";
if (_width==-1) { 
_width = __c.PerXToCurrent((float) (100),ba);};
RDebugUtils.currentLine=60424220;
 //BA.debugLineNum = 60424220;BA.debugLine="If height=-1 Then height=100%y";
if (_height==-1) { 
_height = __c.PerYToCurrent((float) (100),ba);};
RDebugUtils.currentLine=60424223;
 //BA.debugLineNum = 60424223;BA.debugLine="outListPanel.Color=xui.Color_ARGB(5,5,5,5)";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (5),(int) (5),(int) (5),(int) (5)));
RDebugUtils.currentLine=60424224;
 //BA.debugLineNum = 60424224;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=60424225;
 //BA.debugLineNum = 60424225;BA.debugLine="pnl.AddView(outListPanel,0,0,width,height)";
_pnl.AddView((android.view.View)(__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=60424227;
 //BA.debugLineNum = 60424227;BA.debugLine="If kbh>0 Then";
if (__ref._kbh /*int*/ >0) { 
RDebugUtils.currentLine=60424228;
 //BA.debugLineNum = 60424228;BA.debugLine="height=kbh";
_height = __ref._kbh /*int*/ ;
 };
RDebugUtils.currentLine=60424232;
 //BA.debugLineNum = 60424232;BA.debugLine="ListPanel.RemoveViewFromParent";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=60424234;
 //BA.debugLineNum = 60424234;BA.debugLine="If Top+(mBase.Height/2)>height/2 Then";
if (_top+(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)>_height/(double)2) { 
RDebugUtils.currentLine=60424236;
 //BA.debugLineNum = 60424236;BA.debugLine="outListPanel.AddView(ListPanel,Left,0,mBase.Widt";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_left,(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_top);
 }else {
RDebugUtils.currentLine=60424239;
 //BA.debugLineNum = 60424239;BA.debugLine="outListPanel.AddView(ListPanel,Left,Top+mBase.He";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_left,(int) (_top+__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_top-__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (20))));
 };
RDebugUtils.currentLine=60424241;
 //BA.debugLineNum = 60424241;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getbase", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=57868288;
 //BA.debugLineNum = 57868288;BA.debugLine="Public Sub GetBase As B4XView";
RDebugUtils.currentLine=57868289;
 //BA.debugLineNum = 57868289;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=57868290;
 //BA.debugLineNum = 57868290;BA.debugLine="End Sub";
return null;
}
public String  _getcombotext(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getcombotext", true))
	 {return ((String) Debug.delegate(ba, "getcombotext", null));}
RDebugUtils.currentLine=58523648;
 //BA.debugLineNum = 58523648;BA.debugLine="Public Sub getComboText As String";
RDebugUtils.currentLine=58523649;
 //BA.debugLineNum = 58523649;BA.debugLine="Return MyLabel.Text";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=59572224;
 //BA.debugLineNum = 59572224;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=59572225;
 //BA.debugLineNum = 59572225;BA.debugLine="Return MyLabel.Enabled";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=59572226;
 //BA.debugLineNum = 59572226;BA.debugLine="End Sub";
return false;
}
public String  _gethint(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "gethint", true))
	 {return ((String) Debug.delegate(ba, "gethint", null));}
RDebugUtils.currentLine=57999360;
 //BA.debugLineNum = 57999360;BA.debugLine="Public Sub getHint As String";
RDebugUtils.currentLine=57999361;
 //BA.debugLineNum = 57999361;BA.debugLine="Return LabelHint.Text";
if (true) return __ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=57999362;
 //BA.debugLineNum = 57999362;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gethintfont(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "gethintfont", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) Debug.delegate(ba, "gethintfont", null));}
RDebugUtils.currentLine=58130432;
 //BA.debugLineNum = 58130432;BA.debugLine="Public Sub getHintFont As B4XFont";
RDebugUtils.currentLine=58130433;
 //BA.debugLineNum = 58130433;BA.debugLine="Return LabelHint.Font";
if (true) return __ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=58130434;
 //BA.debugLineNum = 58130434;BA.debugLine="End Sub";
return null;
}
public int  _getselectedindex(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectedindex", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedindex", null));}
RDebugUtils.currentLine=59179008;
 //BA.debugLineNum = 59179008;BA.debugLine="Public Sub getSelectedIndex As Int";
RDebugUtils.currentLine=59179009;
 //BA.debugLineNum = 59179009;BA.debugLine="Return SelIndex";
if (true) return __ref._selindex /*int*/ ;
RDebugUtils.currentLine=59179010;
 //BA.debugLineNum = 59179010;BA.debugLine="End Sub";
return 0;
}
public String  _getselectedtextitem(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectedtextitem", true))
	 {return ((String) Debug.delegate(ba, "getselectedtextitem", null));}
RDebugUtils.currentLine=59310080;
 //BA.debugLineNum = 59310080;BA.debugLine="Public Sub getSelectedTextItem As String";
RDebugUtils.currentLine=59310081;
 //BA.debugLineNum = 59310081;BA.debugLine="Return  GetItem(SelIndex)";
if (true) return __ref._getitem /*String*/ (null,__ref._selindex /*int*/ );
RDebugUtils.currentLine=59310082;
 //BA.debugLineNum = 59310082;BA.debugLine="End Sub";
return "";
}
public Object  _getselectedvalueitem(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectedvalueitem", true))
	 {return ((Object) Debug.delegate(ba, "getselectedvalueitem", null));}
RDebugUtils.currentLine=59441152;
 //BA.debugLineNum = 59441152;BA.debugLine="Public Sub getSelectedValueItem As Object";
RDebugUtils.currentLine=59441153;
 //BA.debugLineNum = 59441153;BA.debugLine="Return  GetValue(SelIndex)";
if (true) return __ref._getvalue /*Object*/ (null,__ref._selindex /*int*/ );
RDebugUtils.currentLine=59441154;
 //BA.debugLineNum = 59441154;BA.debugLine="End Sub";
return null;
}
public Object  _getvalue(b4a.example.ef.sd_xcombobox __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_position}));}
Object _ret = null;
RDebugUtils.currentLine=59113472;
 //BA.debugLineNum = 59113472;BA.debugLine="Public Sub GetValue(Position As Int) As Object";
RDebugUtils.currentLine=59113473;
 //BA.debugLineNum = 59113473;BA.debugLine="Dim Ret As Object";
_ret = new Object();
RDebugUtils.currentLine=59113474;
 //BA.debugLineNum = 59113474;BA.debugLine="If Position=-1 And Editable Then Return MyLabel.T";
if (_position==-1 && __ref._editable /*boolean*/ ) { 
if (true) return (Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());};
RDebugUtils.currentLine=59113475;
 //BA.debugLineNum = 59113475;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=59113476;
 //BA.debugLineNum = 59113476;BA.debugLine="Ret=ListItem.Get(Position).As(Map).Get(\"Value\")";
_ret = ((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_position)))).Get((Object)("Value"));
 };
RDebugUtils.currentLine=59113479;
 //BA.debugLineNum = 59113479;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=59113480;
 //BA.debugLineNum = 59113480;BA.debugLine="End Sub";
return null;
}
public int  _getselectionlength(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectionlength", true))
	 {return ((Integer) Debug.delegate(ba, "getselectionlength", null));}
RDebugUtils.currentLine=58392576;
 //BA.debugLineNum = 58392576;BA.debugLine="Public Sub getSelectionLength As Int";
RDebugUtils.currentLine=58392577;
 //BA.debugLineNum = 58392577;BA.debugLine="Return MyLabel.SelectionLength";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getSelectionLength();
RDebugUtils.currentLine=58392578;
 //BA.debugLineNum = 58392578;BA.debugLine="End Sub";
return 0;
}
public int  _getselectionstart(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "getselectionstart", true))
	 {return ((Integer) Debug.delegate(ba, "getselectionstart", null));}
RDebugUtils.currentLine=58327040;
 //BA.debugLineNum = 58327040;BA.debugLine="Public Sub getSelectionStart As Int";
RDebugUtils.currentLine=58327041;
 //BA.debugLineNum = 58327041;BA.debugLine="Return MyLabel.SelectionStart";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getSelectionStart();
RDebugUtils.currentLine=58327042;
 //BA.debugLineNum = 58327042;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gettextfont(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "gettextfont", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) Debug.delegate(ba, "gettextfont", null));}
RDebugUtils.currentLine=58261504;
 //BA.debugLineNum = 58261504;BA.debugLine="Public Sub getTextFont As B4XFont";
RDebugUtils.currentLine=58261505;
 //BA.debugLineNum = 58261505;BA.debugLine="Return MyLabel.Font";
if (true) return __ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=58261506;
 //BA.debugLineNum = 58261506;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4a.objects.ScrollViewWrapper _sc = null;
RDebugUtils.currentLine=57671680;
 //BA.debugLineNum = 57671680;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=57671681;
 //BA.debugLineNum = 57671681;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=57671682;
 //BA.debugLineNum = 57671682;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=57671684;
 //BA.debugLineNum = 57671684;BA.debugLine="outListPanel=xui.CreatePanel(\"outListPanel\")";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"outListPanel");
RDebugUtils.currentLine=57671686;
 //BA.debugLineNum = 57671686;BA.debugLine="Dim Sc As ScrollView";
_sc = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=57671687;
 //BA.debugLineNum = 57671687;BA.debugLine="Sc.Initialize2(1000dip,\"Sc\")";
_sc.Initialize2(ba,__c.DipToCurrent((int) (1000)),"Sc");
RDebugUtils.currentLine=57671688;
 //BA.debugLineNum = 57671688;BA.debugLine="ListPanel=Sc";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sc.getObject()));
RDebugUtils.currentLine=57671690;
 //BA.debugLineNum = 57671690;BA.debugLine="kk.Initialize(\"kk\")";
__ref._kk /*anywheresoftware.b4a.objects.IME*/ .Initialize("kk");
RDebugUtils.currentLine=57671691;
 //BA.debugLineNum = 57671691;BA.debugLine="kk.AddHeightChangedEvent";
__ref._kk /*anywheresoftware.b4a.objects.IME*/ .AddHeightChangedEvent(ba);
RDebugUtils.currentLine=57671704;
 //BA.debugLineNum = 57671704;BA.debugLine="LabelHint=CreateLabel(\"LabelHint\")";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"LabelHint");
RDebugUtils.currentLine=57671706;
 //BA.debugLineNum = 57671706;BA.debugLine="ListItem.Initialize";
__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=57671707;
 //BA.debugLineNum = 57671707;BA.debugLine="SelIndex=-1";
__ref._selindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=57671709;
 //BA.debugLineNum = 57671709;BA.debugLine="ItemHeight=40dip";
__ref._itemheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=57671710;
 //BA.debugLineNum = 57671710;BA.debugLine="OpenDropDownOnFocus=True";
__ref._opendropdownonfocus /*boolean*/  = __c.True;
RDebugUtils.currentLine=57671711;
 //BA.debugLineNum = 57671711;BA.debugLine="End Sub";
return "";
}
public boolean  _isdropdownopen(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "isdropdownopen", true))
	 {return ((Boolean) Debug.delegate(ba, "isdropdownopen", null));}
RDebugUtils.currentLine=58982400;
 //BA.debugLineNum = 58982400;BA.debugLine="Public Sub isDropDownOpen As Boolean";
RDebugUtils.currentLine=58982401;
 //BA.debugLineNum = 58982401;BA.debugLine="Return (outListPanel.Parent.IsInitialized)";
if (true) return (__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized());
RDebugUtils.currentLine=58982402;
 //BA.debugLineNum = 58982402;BA.debugLine="End Sub";
return false;
}
public String  _kk_heightchanged(b4a.example.ef.sd_xcombobox __ref,int _newheight,int _oldheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "kk_heightchanged", true))
	 {return ((String) Debug.delegate(ba, "kk_heightchanged", new Object[] {_newheight,_oldheight}));}
RDebugUtils.currentLine=60358656;
 //BA.debugLineNum = 60358656;BA.debugLine="Private Sub kk_HeightChanged (NewHeight As Int, Ol";
RDebugUtils.currentLine=60358657;
 //BA.debugLineNum = 60358657;BA.debugLine="kbh=NewHeight";
__ref._kbh /*int*/  = _newheight;
RDebugUtils.currentLine=60358659;
 //BA.debugLineNum = 60358659;BA.debugLine="If isDropDownOpen Then";
if (__ref._isdropdownopen /*boolean*/ (null)) { 
RDebugUtils.currentLine=60358660;
 //BA.debugLineNum = 60358660;BA.debugLine="CloseDropDown";
__ref._closedropdown /*String*/ (null);
RDebugUtils.currentLine=60358661;
 //BA.debugLineNum = 60358661;BA.debugLine="fixPanel";
__ref._fixpanel /*String*/ (null);
RDebugUtils.currentLine=60358662;
 //BA.debugLineNum = 60358662;BA.debugLine="DrawListBox";
__ref._drawlistbox /*void*/ (null);
 };
RDebugUtils.currentLine=60358664;
 //BA.debugLineNum = 60358664;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=59768833;
 //BA.debugLineNum = 59768833;BA.debugLine="Dim L As B4XView = Sender";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=59768834;
 //BA.debugLineNum = 59768834;BA.debugLine="Dim index As Int = L.Tag";
_index = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=59768836;
 //BA.debugLineNum = 59768836;BA.debugLine="setSelectedIndex(index)";
__ref._setselectedindex /*String*/ (null,_index);
RDebugUtils.currentLine=59768837;
 //BA.debugLineNum = 59768837;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "sd_xcombobox", "labselect_click"),(int) (100));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=59768838;
 //BA.debugLineNum = 59768838;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
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
RDebugUtils.currentLine=59768839;
 //BA.debugLineNum = 59768839;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=59768840;
 //BA.debugLineNum = 59768840;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=60030976;
 //BA.debugLineNum = 60030976;BA.debugLine="Private Sub MyLabel_Action";
RDebugUtils.currentLine=60030978;
 //BA.debugLineNum = 60030978;BA.debugLine="SelectedItem(MyLabel.Text)";
__ref._selecteditem /*void*/ (null,__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=60030979;
 //BA.debugLineNum = 60030979;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=60227585;
 //BA.debugLineNum = 60227585;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
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
RDebugUtils.currentLine=60227586;
 //BA.debugLineNum = 60227586;BA.debugLine="If SelectOnlyFromList Then";
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
RDebugUtils.currentLine=60227587;
 //BA.debugLineNum = 60227587;BA.debugLine="SelIndex=FindIndex";
__ref._selindex /*int*/  = __ref._findindex /*int*/ ;
RDebugUtils.currentLine=60227588;
 //BA.debugLineNum = 60227588;BA.debugLine="MyLabel.Text=GetItem(SelIndex)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,__ref._selindex /*int*/ )));
RDebugUtils.currentLine=60227589;
 //BA.debugLineNum = 60227589;BA.debugLine="CallSubDelayed3(mCallBack,mEventName & \"_ItemCl";
parent.__c.CallSubDelayed3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ItemClick",(Object)(__ref._selindex /*int*/ ),(Object)(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=60227591;
 //BA.debugLineNum = 60227591;BA.debugLine="CallSubDelayed3(mCallBack,mEventName & \"_ItemCl";
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
RDebugUtils.currentLine=60227594;
 //BA.debugLineNum = 60227594;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "sd_xcombobox", "selecteditem"),(int) (100));
this.state = 11;
return;
case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=60227595;
 //BA.debugLineNum = 60227595;BA.debugLine="outListPanel.RemoveViewFromParent";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=60227596;
 //BA.debugLineNum = 60227596;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=59965440;
 //BA.debugLineNum = 59965440;BA.debugLine="Private Sub MyLabel_BeginEdit";
RDebugUtils.currentLine=59965441;
 //BA.debugLineNum = 59965441;BA.debugLine="MyLabel_FocusChanged(True)";
__ref._mylabel_focuschanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=59965442;
 //BA.debugLineNum = 59965442;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_focuschanged(b4a.example.ef.sd_xcombobox __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "mylabel_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=59899904;
 //BA.debugLineNum = 59899904;BA.debugLine="Private Sub MyLabel_FocusChanged (HasFocus As Bool";
RDebugUtils.currentLine=59899905;
 //BA.debugLineNum = 59899905;BA.debugLine="If HasFocus And OpenDropDownOnFocus Then";
if (_hasfocus && __ref._opendropdownonfocus /*boolean*/ ) { 
RDebugUtils.currentLine=59899906;
 //BA.debugLineNum = 59899906;BA.debugLine="OpenDropDown";
__ref._opendropdown /*String*/ (null);
 };
RDebugUtils.currentLine=59899911;
 //BA.debugLineNum = 59899911;BA.debugLine="ModIntern=False";
__ref._modintern /*boolean*/  = __c.False;
RDebugUtils.currentLine=59899913;
 //BA.debugLineNum = 59899913;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(_hasfocus));};
RDebugUtils.currentLine=59899914;
 //BA.debugLineNum = 59899914;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_click(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_click", true))
	 {return ((String) Debug.delegate(ba, "mylabel_click", null));}
RDebugUtils.currentLine=59834368;
 //BA.debugLineNum = 59834368;BA.debugLine="Private Sub MyLabel_Click";
RDebugUtils.currentLine=59834369;
 //BA.debugLineNum = 59834369;BA.debugLine="OpenDropDown";
__ref._opendropdown /*String*/ (null);
RDebugUtils.currentLine=59834370;
 //BA.debugLineNum = 59834370;BA.debugLine="MyLabel.RequestFocus";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=59834371;
 //BA.debugLineNum = 59834371;BA.debugLine="End Sub";
return "";
}
public String  _opendropdown(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "opendropdown", true))
	 {return ((String) Debug.delegate(ba, "opendropdown", null));}
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Public Sub OpenDropDown";
RDebugUtils.currentLine=58851332;
 //BA.debugLineNum = 58851332;BA.debugLine="fixPanel";
__ref._fixpanel /*String*/ (null);
RDebugUtils.currentLine=58851333;
 //BA.debugLineNum = 58851333;BA.debugLine="DrawListBox";
__ref._drawlistbox /*void*/ (null);
RDebugUtils.currentLine=58851334;
 //BA.debugLineNum = 58851334;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_endedit(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_endedit", true))
	 {return ((String) Debug.delegate(ba, "mylabel_endedit", null));}
RDebugUtils.currentLine=60162048;
 //BA.debugLineNum = 60162048;BA.debugLine="Private Sub MyLabel_EndEdit";
RDebugUtils.currentLine=60162050;
 //BA.debugLineNum = 60162050;BA.debugLine="MyLabel_FocusChanged(False)";
__ref._mylabel_focuschanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=60162052;
 //BA.debugLineNum = 60162052;BA.debugLine="SelectedItem(MyLabel.Text)";
__ref._selecteditem /*void*/ (null,__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=60162053;
 //BA.debugLineNum = 60162053;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_enterpressed(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "mylabel_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "mylabel_enterpressed", null));}
RDebugUtils.currentLine=60096512;
 //BA.debugLineNum = 60096512;BA.debugLine="Private Sub MyLabel_EnterPressed";
RDebugUtils.currentLine=60096514;
 //BA.debugLineNum = 60096514;BA.debugLine="SelectedItem(MyLabel.Text)";
__ref._selecteditem /*void*/ (null,__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=60096515;
 //BA.debugLineNum = 60096515;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=60293120;
 //BA.debugLineNum = 60293120;BA.debugLine="Private Sub MyLabel_TextChanged (OldText As String";
RDebugUtils.currentLine=60293121;
 //BA.debugLineNum = 60293121;BA.debugLine="If ModIntern Then";
if (__ref._modintern /*boolean*/ ) { 
RDebugUtils.currentLine=60293122;
 //BA.debugLineNum = 60293122;BA.debugLine="ModIntern=False";
__ref._modintern /*boolean*/  = __c.False;
RDebugUtils.currentLine=60293123;
 //BA.debugLineNum = 60293123;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=60293125;
 //BA.debugLineNum = 60293125;BA.debugLine="If OldText=NewText Then Return";
if ((_oldtext).equals(_newtext)) { 
if (true) return "";};
RDebugUtils.currentLine=60293126;
 //BA.debugLineNum = 60293126;BA.debugLine="If isDropDownOpen=False And OpenDropDownOnFocus T";
if (__ref._isdropdownopen /*boolean*/ (null)==__c.False && __ref._opendropdownonfocus /*boolean*/ ) { 
__ref._opendropdown /*String*/ (null);};
RDebugUtils.currentLine=60293127;
 //BA.debugLineNum = 60293127;BA.debugLine="FindIndex = -1";
__ref._findindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=60293129;
 //BA.debugLineNum = 60293129;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=60293130;
 //BA.debugLineNum = 60293130;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=60293132;
 //BA.debugLineNum = 60293132;BA.debugLine="If v.Get(\"Text\").As(String).ToLowerCase.IndexOf(";
if ((BA.ObjectToString(_v.Get((Object)("Text")))).toLowerCase().indexOf(_newtext.toLowerCase())>-1) { 
RDebugUtils.currentLine=60293133;
 //BA.debugLineNum = 60293133;BA.debugLine="FindIndex=i";
__ref._findindex /*int*/  = _i;
RDebugUtils.currentLine=60293134;
 //BA.debugLineNum = 60293134;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=60293138;
 //BA.debugLineNum = 60293138;BA.debugLine="If SelIndex>-1 And SelIndex<ListItem.Size Then";
if (__ref._selindex /*int*/ >-1 && __ref._selindex /*int*/ <__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=60293139;
 //BA.debugLineNum = 60293139;BA.debugLine="If ListItem.Get(SelIndex).As(Map).Get(\"object\").";
if (((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).IsInitialized()) { 
RDebugUtils.currentLine=60293140;
 //BA.debugLineNum = 60293140;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=60293141;
 //BA.debugLineNum = 60293141;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setTextColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
 };
 };
RDebugUtils.currentLine=60293145;
 //BA.debugLineNum = 60293145;BA.debugLine="SelIndex=FindIndex";
__ref._selindex /*int*/  = __ref._findindex /*int*/ ;
RDebugUtils.currentLine=60293146;
 //BA.debugLineNum = 60293146;BA.debugLine="If SelIndex>-1 And SelIndex<ListItem.Size Then";
if (__ref._selindex /*int*/ >-1 && __ref._selindex /*int*/ <__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=60293147;
 //BA.debugLineNum = 60293147;BA.debugLine="If ListItem.Get(SelIndex).As(Map).Get(\"object\").";
if (((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).IsInitialized()) { 
RDebugUtils.currentLine=60293148;
 //BA.debugLineNum = 60293148;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setColor(__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=60293149;
 //BA.debugLineNum = 60293149;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).setTextColor(__ref._bclr /*int*/ );
RDebugUtils.currentLine=60293152;
 //BA.debugLineNum = 60293152;BA.debugLine="Dim StartPosition As Int = ListItem.Get(SelInde";
_startposition = ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).getTop();
RDebugUtils.currentLine=60293153;
 //BA.debugLineNum = 60293153;BA.debugLine="Dim EndPosition As Int = StartPosition + ListIt";
_endposition = (int) (_startposition+((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selindex /*int*/ )))).Get((Object)("object"))))).getHeight());
RDebugUtils.currentLine=60293154;
 //BA.debugLineNum = 60293154;BA.debugLine="Dim StartVisible As Int = ListPanel.ScrollViewO";
_startvisible = __ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetY();
RDebugUtils.currentLine=60293155;
 //BA.debugLineNum = 60293155;BA.debugLine="Dim EndVisible As Int = StartVisible + ListPane";
_endvisible = (int) (_startvisible+__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=60293157;
 //BA.debugLineNum = 60293157;BA.debugLine="If Not((StartPosition>=StartVisible And StartPo";
if (__c.Not((_startposition>=_startvisible && _startposition<_endvisible) && (_endposition>_startvisible && _endposition<=_endvisible))) { 
RDebugUtils.currentLine=60293159;
 //BA.debugLineNum = 60293159;BA.debugLine="If StartPosition>ListPanel.ScrollViewContentHe";
if (_startposition>__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight()-__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=60293160;
 //BA.debugLineNum = 60293160;BA.debugLine="ListPanel.ScrollViewOffsetY=ListPanel.ScrollV";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetY((int) (__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight()-__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 }else {
RDebugUtils.currentLine=60293162;
 //BA.debugLineNum = 60293162;BA.debugLine="ListPanel.ScrollViewOffsetY=StartPosition";
__ref._listpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetY(_startposition);
 };
 };
 };
 };
RDebugUtils.currentLine=60293167;
 //BA.debugLineNum = 60293167;BA.debugLine="End Sub";
return "";
}
public String  _outlistpanel_click(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "outlistpanel_click", true))
	 {return ((String) Debug.delegate(ba, "outlistpanel_click", null));}
RDebugUtils.currentLine=59703296;
 //BA.debugLineNum = 59703296;BA.debugLine="Private Sub outListPanel_Click";
RDebugUtils.currentLine=59703297;
 //BA.debugLineNum = 59703297;BA.debugLine="CloseDropDown";
__ref._closedropdown /*String*/ (null);
RDebugUtils.currentLine=59703298;
 //BA.debugLineNum = 59703298;BA.debugLine="outListPanel.RequestFocus";
__ref._outlistpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=59703299;
 //BA.debugLineNum = 59703299;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(__c.False));};
RDebugUtils.currentLine=59703300;
 //BA.debugLineNum = 59703300;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4a.example.ef.sd_xcombobox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=59637760;
 //BA.debugLineNum = 59637760;BA.debugLine="Public Sub setEnabled(B As Boolean)";
RDebugUtils.currentLine=59637761;
 //BA.debugLineNum = 59637761;BA.debugLine="MyLabel.Enabled=B";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_b);
RDebugUtils.currentLine=59637762;
 //BA.debugLineNum = 59637762;BA.debugLine="End Sub";
return "";
}
public String  _sethint(b4a.example.ef.sd_xcombobox __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "sethint", true))
	 {return ((String) Debug.delegate(ba, "sethint", new Object[] {_text}));}
RDebugUtils.currentLine=57933824;
 //BA.debugLineNum = 57933824;BA.debugLine="Public Sub setHint(Text As String)";
RDebugUtils.currentLine=57933825;
 //BA.debugLineNum = 57933825;BA.debugLine="LabelHint.Text=Text";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=57933826;
 //BA.debugLineNum = 57933826;BA.debugLine="End Sub";
return "";
}
public String  _sethintfont(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "sethintfont", true))
	 {return ((String) Debug.delegate(ba, "sethintfont", new Object[] {_fnt}));}
RDebugUtils.currentLine=58064896;
 //BA.debugLineNum = 58064896;BA.debugLine="Public Sub setHintFont(Fnt As B4XFont)";
RDebugUtils.currentLine=58064897;
 //BA.debugLineNum = 58064897;BA.debugLine="LabelHint.Font=Fnt";
__ref._labelhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_fnt);
RDebugUtils.currentLine=58064898;
 //BA.debugLineNum = 58064898;BA.debugLine="End Sub";
return "";
}
public String  _setselectedtextitem(b4a.example.ef.sd_xcombobox __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setselectedtextitem", true))
	 {return ((String) Debug.delegate(ba, "setselectedtextitem", new Object[] {_value}));}
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
RDebugUtils.currentLine=59375616;
 //BA.debugLineNum = 59375616;BA.debugLine="Public Sub setSelectedTextItem(Value As String)";
RDebugUtils.currentLine=59375617;
 //BA.debugLineNum = 59375617;BA.debugLine="If Editable Then";
if (__ref._editable /*boolean*/ ) { 
RDebugUtils.currentLine=59375618;
 //BA.debugLineNum = 59375618;BA.debugLine="ModIntern=True";
__ref._modintern /*boolean*/  = __c.True;
RDebugUtils.currentLine=59375619;
 //BA.debugLineNum = 59375619;BA.debugLine="MyLabel.Text=Value";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_value));
 }else {
RDebugUtils.currentLine=59375621;
 //BA.debugLineNum = 59375621;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=59375622;
 //BA.debugLineNum = 59375622;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=59375623;
 //BA.debugLineNum = 59375623;BA.debugLine="If Value = v.Get(\"Text\") Then";
if ((_value).equals(BA.ObjectToString(_v.Get((Object)("Text"))))) { 
RDebugUtils.currentLine=59375624;
 //BA.debugLineNum = 59375624;BA.debugLine="SelIndex=i";
__ref._selindex /*int*/  = _i;
RDebugUtils.currentLine=59375625;
 //BA.debugLineNum = 59375625;BA.debugLine="MyLabel.Text=GetItem(I)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,_i)));
 };
 }
};
 };
RDebugUtils.currentLine=59375629;
 //BA.debugLineNum = 59375629;BA.debugLine="End Sub";
return "";
}
public String  _setselectedvalueitem(b4a.example.ef.sd_xcombobox __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setselectedvalueitem", true))
	 {return ((String) Debug.delegate(ba, "setselectedvalueitem", new Object[] {_value}));}
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
RDebugUtils.currentLine=59506688;
 //BA.debugLineNum = 59506688;BA.debugLine="Public Sub setSelectedValueItem(Value As Object)";
RDebugUtils.currentLine=59506689;
 //BA.debugLineNum = 59506689;BA.debugLine="If Editable Then";
if (__ref._editable /*boolean*/ ) { 
RDebugUtils.currentLine=59506690;
 //BA.debugLineNum = 59506690;BA.debugLine="ModIntern=True";
__ref._modintern /*boolean*/  = __c.True;
RDebugUtils.currentLine=59506691;
 //BA.debugLineNum = 59506691;BA.debugLine="MyLabel.Text=Value";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_value));
 }else {
RDebugUtils.currentLine=59506693;
 //BA.debugLineNum = 59506693;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=59506694;
 //BA.debugLineNum = 59506694;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=59506695;
 //BA.debugLineNum = 59506695;BA.debugLine="If Value = v.Get(\"Value\") Then";
if ((_value).equals(_v.Get((Object)("Value")))) { 
RDebugUtils.currentLine=59506696;
 //BA.debugLineNum = 59506696;BA.debugLine="SelIndex=i";
__ref._selindex /*int*/  = _i;
RDebugUtils.currentLine=59506697;
 //BA.debugLineNum = 59506697;BA.debugLine="MyLabel.Text=GetItem(I)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._getitem /*String*/ (null,_i)));
 };
 }
};
 };
RDebugUtils.currentLine=59506701;
 //BA.debugLineNum = 59506701;BA.debugLine="End Sub";
return "";
}
public String  _setselection(b4a.example.ef.sd_xcombobox __ref,int _start,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "setselection", true))
	 {return ((String) Debug.delegate(ba, "setselection", new Object[] {_start,_length}));}
RDebugUtils.currentLine=58458112;
 //BA.debugLineNum = 58458112;BA.debugLine="Public Sub SetSelection(Start As Int, Length As In";
RDebugUtils.currentLine=58458113;
 //BA.debugLineNum = 58458113;BA.debugLine="MyLabel.SetSelection(Start,Length)";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetSelection(_start,_length);
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="End Sub";
return "";
}
public String  _settextfont(b4a.example.ef.sd_xcombobox __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "settextfont", true))
	 {return ((String) Debug.delegate(ba, "settextfont", new Object[] {_fnt}));}
RDebugUtils.currentLine=58195968;
 //BA.debugLineNum = 58195968;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
RDebugUtils.currentLine=58195969;
 //BA.debugLineNum = 58195969;BA.debugLine="MyLabel.Font=Fnt";
__ref._mylabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_fnt);
RDebugUtils.currentLine=58195970;
 //BA.debugLineNum = 58195970;BA.debugLine="End Sub";
return "";
}
public int  _size(b4a.example.ef.sd_xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_xcombobox";
if (Debug.shouldDelegate(ba, "size", true))
	 {return ((Integer) Debug.delegate(ba, "size", null));}
RDebugUtils.currentLine=58720256;
 //BA.debugLineNum = 58720256;BA.debugLine="public Sub Size As Int";
RDebugUtils.currentLine=58720257;
 //BA.debugLineNum = 58720257;BA.debugLine="Return ListItem.Size";
if (true) return __ref._listitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=58720258;
 //BA.debugLineNum = 58720258;BA.debugLine="End Sub";
return 0;
}
}