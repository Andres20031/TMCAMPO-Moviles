package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sd_xcombobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.sd_xcombobox");
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
public String  _add(String _text,Object _returnvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 280;BA.debugLine="Public Sub Add(Text As String, ReturnValue As Obje";
 //BA.debugLineNum = 281;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 282;BA.debugLine="M.Initialize";
_m.Initialize();
 //BA.debugLineNum = 283;BA.debugLine="M.Put(\"Text\",Text)";
_m.Put((Object)("Text"),(Object)(_text));
 //BA.debugLineNum = 284;BA.debugLine="M.Put(\"Value\",ReturnValue)";
_m.Put((Object)("Value"),_returnvalue);
 //BA.debugLineNum = 285;BA.debugLine="M.Put(\"object\",Null)";
_m.Put((Object)("object"),__c.Null);
 //BA.debugLineNum = 286;BA.debugLine="ListItem.Add(M)";
_listitem.Add((Object)(_m.getObject()));
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return "";
}
public String  _addall(anywheresoftware.b4a.objects.collections.List _l) throws Exception{
String _text = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 291;BA.debugLine="Public Sub AddAll(L As List)";
 //BA.debugLineNum = 292;BA.debugLine="For Each text As String In L";
{
final anywheresoftware.b4a.BA.IterableList group1 = _l;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_text = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 293;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 294;BA.debugLine="M.Initialize";
_m.Initialize();
 //BA.debugLineNum = 295;BA.debugLine="M.Put(\"Text\",text)";
_m.Put((Object)("Text"),(Object)(_text));
 //BA.debugLineNum = 296;BA.debugLine="M.Put(\"Value\",text)";
_m.Put((Object)("Value"),(Object)(_text));
 //BA.debugLineNum = 297;BA.debugLine="M.Put(\"object\",Null)";
_m.Put((Object)("object"),__c.Null);
 //BA.debugLineNum = 299;BA.debugLine="ListItem.Add(M)";
_listitem.Add((Object)(_m.getObject()));
 }
};
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 200;BA.debugLine="If Style=\"Classic\" Then";
if ((_style).equals("Classic")) { 
 //BA.debugLineNum = 201;BA.debugLine="MyLabel.Width=Width-10dip";
_mylabel.setWidth((int) (_width-__c.DipToCurrent((int) (10))));
 //BA.debugLineNum = 202;BA.debugLine="MyLabel.Height=Height-30dip";
_mylabel.setHeight((int) (_height-__c.DipToCurrent((int) (30))));
 //BA.debugLineNum = 203;BA.debugLine="LabelHint.Width=Width";
_labelhint.setWidth((int) (_width));
 }else {
 //BA.debugLineNum = 205;BA.debugLine="If RTL Then";
if (_rtl) { 
 //BA.debugLineNum = 206;BA.debugLine="MyLabel.Width=Width-50dip";
_mylabel.setWidth((int) (_width-__c.DipToCurrent((int) (50))));
 //BA.debugLineNum = 207;BA.debugLine="MyLabel.Height=Height";
_mylabel.setHeight((int) (_height));
 //BA.debugLineNum = 208;BA.debugLine="LabelHint.Left=Width-45dip";
_labelhint.setLeft((int) (_width-__c.DipToCurrent((int) (45))));
 //BA.debugLineNum = 209;BA.debugLine="LabelHint.Height=Height";
_labelhint.setHeight((int) (_height));
 }else {
 //BA.debugLineNum = 211;BA.debugLine="MyLabel.Width=Width-50dip";
_mylabel.setWidth((int) (_width-__c.DipToCurrent((int) (50))));
 //BA.debugLineNum = 212;BA.debugLine="MyLabel.Height=Height";
_mylabel.setHeight((int) (_height));
 //BA.debugLineNum = 213;BA.debugLine="LabelHint.Height=Height";
_labelhint.setHeight((int) (_height));
 };
 };
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 22;BA.debugLine="Private outListPanel As B4XView";
_outlistpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private ListPanel As B4XView";
_listpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private ListItem As List";
_listitem = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 25;BA.debugLine="Private SelIndex As Int";
_selindex = 0;
 //BA.debugLineNum = 26;BA.debugLine="Private FindIndex As Int = -1";
_findindex = (int) (-1);
 //BA.debugLineNum = 28;BA.debugLine="Private Editable As Boolean";
_editable = false;
 //BA.debugLineNum = 29;BA.debugLine="Private Corner As Int";
_corner = 0;
 //BA.debugLineNum = 30;BA.debugLine="Private Style As String = \"Frame\"";
_style = "Frame";
 //BA.debugLineNum = 31;BA.debugLine="Private Align As String = \"CENTER\"";
_align = "CENTER";
 //BA.debugLineNum = 32;BA.debugLine="Private TextAlign As String = \"LEFT\"";
_textalign = "LEFT";
 //BA.debugLineNum = 33;BA.debugLine="Private ModIntern As Boolean=False";
_modintern = __c.False;
 //BA.debugLineNum = 34;BA.debugLine="Private BClr As Int";
_bclr = 0;
 //BA.debugLineNum = 35;BA.debugLine="Private RTL As Boolean = False";
_rtl = __c.False;
 //BA.debugLineNum = 36;BA.debugLine="Private LabelHint As B4XView";
_labelhint = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private MyLabel As B4XView";
_mylabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private CornerColor As Int";
_cornercolor = 0;
 //BA.debugLineNum = 40;BA.debugLine="Private kbh As Int = 0";
_kbh = (int) (0);
 //BA.debugLineNum = 41;BA.debugLine="Public ItemHeight As Int";
_itemheight = 0;
 //BA.debugLineNum = 42;BA.debugLine="Public OpenDropDownOnFocus As Boolean";
_opendropdownonfocus = false;
 //BA.debugLineNum = 43;BA.debugLine="Public SelectOnlyFromList As Boolean = False";
_selectonlyfromlist = __c.False;
 //BA.debugLineNum = 46;BA.debugLine="Private kk As IME";
_kk = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 309;BA.debugLine="ListItem.Clear";
_listitem.Clear();
 //BA.debugLineNum = 310;BA.debugLine="SelIndex=-1";
_selindex = (int) (-1);
 //BA.debugLineNum = 312;BA.debugLine="if Editable then  MyLabel.EditTextHint=\"<none>\"";
if (_editable) { 
_mylabel.setEditTextHint(BA.ObjectToCharSequence("<none>"));};
 //BA.debugLineNum = 313;BA.debugLine="MyLabel.Text=\"\"";
_mylabel.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return "";
}
public String  _closedropdown() throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Public Sub CloseDropDown";
 //BA.debugLineNum = 325;BA.debugLine="outListPanel.RemoveViewFromParent";
_outlistpanel.RemoveViewFromParent();
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(String _eventname) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 //BA.debugLineNum = 702;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
 //BA.debugLineNum = 703;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 704;BA.debugLine="L.Initialize(EventName)";
_l.Initialize(ba,_eventname);
 //BA.debugLineNum = 705;BA.debugLine="Return L";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l.getObject()));
 //BA.debugLineNum = 706;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextview(String _eventname) throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _t = null;
 //BA.debugLineNum = 708;BA.debugLine="Private Sub CreateTextView(EventName As String) As";
 //BA.debugLineNum = 710;BA.debugLine="Dim T As EditText";
_t = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 711;BA.debugLine="T.Initialize(EventName)";
_t.Initialize(ba,_eventname);
 //BA.debugLineNum = 719;BA.debugLine="Return T";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_t.getObject()));
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas _can = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rec = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _path = null;
 //BA.debugLineNum = 84;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 85;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 86;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 87;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 89;BA.debugLine="If Props.ContainsKey(\"RTL\") Then RTL=Props.Get(\"R";
if (_props.ContainsKey((Object)("RTL"))) { 
_rtl = BA.ObjectToBoolean(_props.Get((Object)("RTL")));};
 //BA.debugLineNum = 90;BA.debugLine="If Props.ContainsKey(\"Style\") Then Style=Props.Ge";
if (_props.ContainsKey((Object)("Style"))) { 
_style = BA.ObjectToString(_props.Get((Object)("Style")));};
 //BA.debugLineNum = 91;BA.debugLine="If Props.ContainsKey(\"Align\") Then Align=Props.Ge";
if (_props.ContainsKey((Object)("Align"))) { 
_align = BA.ObjectToString(_props.Get((Object)("Align")));};
 //BA.debugLineNum = 92;BA.debugLine="If Props.ContainsKey(\"TextAlign\") Then TextAlign=";
if (_props.ContainsKey((Object)("TextAlign"))) { 
_textalign = BA.ObjectToString(_props.Get((Object)("TextAlign")));};
 //BA.debugLineNum = 93;BA.debugLine="If Props.ContainsKey(\"CornerColor\") Then CornerCo";
if (_props.ContainsKey((Object)("CornerColor"))) { 
_cornercolor = _xui.PaintOrColorToColor(_props.Get((Object)("CornerColor")));}
else {
_cornercolor = _mylabel.getTextColor();};
 //BA.debugLineNum = 94;BA.debugLine="If Props.ContainsKey(\"Background\") Then	BClr=xui.";
if (_props.ContainsKey((Object)("Background"))) { 
_bclr = _xui.PaintOrColorToColor(_props.Get((Object)("Background")));}
else {
_bclr = _mbase.getColor();};
 //BA.debugLineNum = 95;BA.debugLine="If Props.ContainsKey(\"Editable\") Then Editable=Pr";
if (_props.ContainsKey((Object)("Editable"))) { 
_editable = BA.ObjectToBoolean(_props.Get((Object)("Editable")));};
 //BA.debugLineNum = 96;BA.debugLine="Corner=Props.Get(\"Corner\")";
_corner = (int)(BA.ObjectToNumber(_props.Get((Object)("Corner"))));
 //BA.debugLineNum = 97;BA.debugLine="Corner=Corner*(100dip/100)";
_corner = (int) (_corner*(__c.DipToCurrent((int) (100))/(double)100));
 //BA.debugLineNum = 105;BA.debugLine="If Editable Then MyLabel=CreateTextView(\"MyLabel\"";
if (_editable) { 
_mylabel = _createtextview("MyLabel");}
else {
_mylabel = _createlabel("MyLabel");};
 //BA.debugLineNum = 107;BA.debugLine="MyLabel.TextColor=Lbl.As(B4XView).TextColor";
_mylabel.setTextColor(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getTextColor());
 //BA.debugLineNum = 108;BA.debugLine="MyLabel.TextSize=Lbl.As(B4XView).TextSize";
_mylabel.setTextSize(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getTextSize());
 //BA.debugLineNum = 109;BA.debugLine="MyLabel.Font=Lbl.As(B4XView).Font";
_mylabel.setFont(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getFont());
 //BA.debugLineNum = 110;BA.debugLine="If Editable = False Then MyLabel.SetTextAlignment";
if (_editable==__c.False) { 
_mylabel.SetTextAlignment("CENTER",_textalign);};
 //BA.debugLineNum = 111;BA.debugLine="MyLabel.Color=xui.Color_Transparent";
_mylabel.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 112;BA.debugLine="MyLabel.Text=Lbl.As(B4XView).Text";
_mylabel.setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).getText()));
 //BA.debugLineNum = 113;BA.debugLine="If Editable Then MyLabel.EditTextHint=\"<none>\"";
if (_editable) { 
_mylabel.setEditTextHint(BA.ObjectToCharSequence("<none>"));};
 //BA.debugLineNum = 115;BA.debugLine="LabelHint.Text=Chr(0xF006) 'lbx.EditTextHint";
_labelhint.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf006))));
 //BA.debugLineNum = 116;BA.debugLine="LabelHint.TextColor=MyLabel.TextColor";
_labelhint.setTextColor(_mylabel.getTextColor());
 //BA.debugLineNum = 117;BA.debugLine="LabelHint.Color=xui.Color_Transparent";
_labelhint.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 118;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
_labelhint.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 119;BA.debugLine="LabelHint.Font=xui.CreateFontAwesome(MyLabel.Font";
_labelhint.setFont(_xui.CreateFontAwesome(_mylabel.getFont().getSize()));
 //BA.debugLineNum = 121;BA.debugLine="Select Style";
switch (BA.switchObjectToInt(_style,"Frame","Bead","Classic")) {
case 0: {
 //BA.debugLineNum = 123;BA.debugLine="mBase.SetColorAndBorder(BClr,1dip,CornerColor,C";
_mbase.SetColorAndBorder(_bclr,__c.DipToCurrent((int) (1)),_cornercolor,_corner);
 break; }
case 1: {
 //BA.debugLineNum = 125;BA.debugLine="LabelHint.TextColor=BClr";
_labelhint.setTextColor(_bclr);
 //BA.debugLineNum = 126;BA.debugLine="LabelHint.SetColorAndBorder(CornerColor,0dip,xu";
_labelhint.SetColorAndBorder(_cornercolor,__c.DipToCurrent((int) (0)),_xui.Color_Transparent,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 128;BA.debugLine="Dim Can As B4XCanvas";
_can = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 129;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 131;BA.debugLine="Can.Initialize(mBase)";
_can.Initialize(_mbase);
 //BA.debugLineNum = 132;BA.debugLine="Rec.Initialize(20dip,mBase.Height/2,mBase.Width";
_rec.Initialize((float) (__c.DipToCurrent((int) (20))),(float) (_mbase.getHeight()/(double)2),(float) (_mbase.getWidth()-__c.DipToCurrent((int) (20))),(float) (_mbase.getHeight()));
 //BA.debugLineNum = 133;BA.debugLine="Can.DrawRect(Rec,CornerColor,True,0dip)";
_can.DrawRect(_rec,_cornercolor,__c.True,(float) (__c.DipToCurrent((int) (0))));
 //BA.debugLineNum = 134;BA.debugLine="If RTL Then";
if (_rtl) { 
 //BA.debugLineNum = 135;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 136;BA.debugLine="Rec.Initialize(0dip,0dip,mBase.Width-45dip,mBa";
_rec.Initialize((float) (__c.DipToCurrent((int) (0))),(float) (__c.DipToCurrent((int) (0))),(float) (_mbase.getWidth()-__c.DipToCurrent((int) (45))),(float) (_mbase.getHeight()-__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 137;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 138;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (20))));
 //BA.debugLineNum = 139;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
_can.DrawPath(_path,_bclr,__c.True,(float) (__c.DipToCurrent((int) (0))));
 }else {
 //BA.debugLineNum = 141;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 142;BA.debugLine="Rec.Initialize(45dip,0dip,mBase.Width,mBase.He";
_rec.Initialize((float) (__c.DipToCurrent((int) (45))),(float) (__c.DipToCurrent((int) (0))),(float) (_mbase.getWidth()),(float) (_mbase.getHeight()-__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 143;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 144;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (20))));
 //BA.debugLineNum = 145;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
_can.DrawPath(_path,_bclr,__c.True,(float) (__c.DipToCurrent((int) (0))));
 };
 //BA.debugLineNum = 147;BA.debugLine="Can.Invalidate";
_can.Invalidate();
 break; }
case 2: {
 //BA.debugLineNum = 149;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
_labelhint.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 150;BA.debugLine="LabelHint.Font=xui.CreateDefaultBoldFont(MyLabe";
_labelhint.setFont(_xui.CreateDefaultBoldFont((float) (_mylabel.getFont().getSize()-3)));
 //BA.debugLineNum = 151;BA.debugLine="LabelHint.Text=\"Set Hint\"";
_labelhint.setText(BA.ObjectToCharSequence("Set Hint"));
 break; }
}
;
 //BA.debugLineNum = 154;BA.debugLine="If Style=\"Classic\" Then";
if ((_style).equals("Classic")) { 
 //BA.debugLineNum = 155;BA.debugLine="mBase.AddView(MyLabel,0dip,30dip,mBase.Width,mBa";
_mbase.AddView((android.view.View)(_mylabel.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (30)),_mbase.getWidth(),(int) (_mbase.getHeight()-__c.DipToCurrent((int) (30))));
 //BA.debugLineNum = 156;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,mBase.Width-10";
_mbase.AddView((android.view.View)(_labelhint.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),(int) (_mbase.getWidth()-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 157;BA.debugLine="MyLabel.SetColorAndBorder(BClr,1dip,CornerColor,";
_mylabel.SetColorAndBorder(_bclr,__c.DipToCurrent((int) (1)),_cornercolor,_corner);
 //BA.debugLineNum = 158;BA.debugLine="If RTL Then";
if (_rtl) { 
 //BA.debugLineNum = 159;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
_mylabel.SetTextAlignment("CENTER","RIGHT");
 //BA.debugLineNum = 160;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"RIGHT\")";
_labelhint.SetTextAlignment("CENTER","RIGHT");
 //BA.debugLineNum = 164;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mylabel.getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 }else {
 //BA.debugLineNum = 167;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"LEFT\")";
_mylabel.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 168;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"LEFT\")";
_labelhint.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 172;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mylabel.getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 };
 }else {
 //BA.debugLineNum = 176;BA.debugLine="If RTL Then";
if (_rtl) { 
 //BA.debugLineNum = 177;BA.debugLine="mBase.AddView(LabelHint,mBase.Width-45dip,0dip,";
_mbase.AddView((android.view.View)(_labelhint.getObject()),(int) (_mbase.getWidth()-__c.DipToCurrent((int) (45))),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),_mbase.getHeight());
 //BA.debugLineNum = 178;BA.debugLine="mBase.AddView(MyLabel,5dip,0dip,mBase.Width-50d";
_mbase.AddView((android.view.View)(_mylabel.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),(int) (_mbase.getWidth()-__c.DipToCurrent((int) (50))),_mbase.getHeight());
 //BA.debugLineNum = 184;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
_mylabel.SetTextAlignment("CENTER","RIGHT");
 //BA.debugLineNum = 185;BA.debugLine="MyLabel.As(JavaObject).RunMethod(\"setPadding\",";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mylabel.getObject()))).RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 }else {
 //BA.debugLineNum = 188;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,40dip,mBase.H";
_mbase.AddView((android.view.View)(_labelhint.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),_mbase.getHeight());
 //BA.debugLineNum = 189;BA.debugLine="mBase.AddView(MyLabel,50dip,0dip,mBase.Width-50";
_mbase.AddView((android.view.View)(_mylabel.getObject()),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (0)),(int) (_mbase.getWidth()-__c.DipToCurrent((int) (50))),_mbase.getHeight());
 //BA.debugLineNum = 193;BA.debugLine="MyLabel.SetTextAlignment(\"CENTER\",\"LEFT\")";
_mylabel.SetTextAlignment("CENTER","LEFT");
 };
 };
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public void  _drawlistbox() throws Exception{
ResumableSub_DrawListBox rsub = new ResumableSub_DrawListBox(this);
rsub.resume(ba, null);
}
public static class ResumableSub_DrawListBox extends BA.ResumableSub {
public ResumableSub_DrawListBox(b4a.example.ef.sd_xcombobox parent) {
this.parent = parent;
}
b4a.example.ef.sd_xcombobox parent;
int _height = 0;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
int step5;
int limit5;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 651;BA.debugLine="Dim Height As Int = 0";
_height = (int) (0);
 //BA.debugLineNum = 653;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_OpenLis";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._xui.SubExists(ba,parent._mcallback,parent._meventname+"_OpenList",(int) (0))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent.__c.CallSubNew(ba,parent._mcallback,parent._meventname+"_OpenList");
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 655;BA.debugLine="ListPanel.As(ScrollView).Panel.RemoveAllViews";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(parent._listpanel.getObject()))).getPanel().RemoveAllViews();
 //BA.debugLineNum = 656;BA.debugLine="ListPanel.Color=MyLabel.TextColor";
parent._listpanel.setColor(parent._mylabel.getTextColor());
 //BA.debugLineNum = 662;BA.debugLine="For i=0 To ListItem.Size-1";
if (true) break;

case 7:
//for
this.state = 10;
step5 = 1;
limit5 = (int) (parent._listitem.getSize()-1);
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
 //BA.debugLineNum = 663;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent._listitem.Get(_i)));
 //BA.debugLineNum = 664;BA.debugLine="Dim L As B4XView = CreateLabel(\"LabSelect\")";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l = parent._createlabel("LabSelect");
 //BA.debugLineNum = 665;BA.debugLine="L.Color=BClr";
_l.setColor(parent._bclr);
 //BA.debugLineNum = 666;BA.debugLine="L.TextColor=MyLabel.TextColor";
_l.setTextColor(parent._mylabel.getTextColor());
 //BA.debugLineNum = 667;BA.debugLine="L.Text=v.Get(\"Text\")";
_l.setText(BA.ObjectToCharSequence(_v.Get((Object)("Text"))));
 //BA.debugLineNum = 668;BA.debugLine="L.SetTextAlignment(\"CENTER\",Align)";
_l.SetTextAlignment("CENTER",parent._align);
 //BA.debugLineNum = 669;BA.debugLine="L.Tag=i";
_l.setTag((Object)(_i));
 //BA.debugLineNum = 670;BA.debugLine="v.Put(\"object\",L)";
_v.Put((Object)("object"),(Object)(_l.getObject()));
 //BA.debugLineNum = 674;BA.debugLine="ListPanel.As(ScrollView).Panel.AddView(L,1dip,H";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(parent._listpanel.getObject()))).getPanel().AddView((android.view.View)(_l.getObject()),parent.__c.DipToCurrent((int) (1)),_height,(int) (parent._listpanel.getWidth()-parent.__c.DipToCurrent((int) (2))),(int) (parent._itemheight-parent.__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 679;BA.debugLine="Height=Height+ItemHeight";
_height = (int) (_height+parent._itemheight);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 683;BA.debugLine="ListPanel.As(ScrollView).Panel.Height=Height";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(parent._listpanel.getObject()))).getPanel().setHeight(_height);
 //BA.debugLineNum = 688;BA.debugLine="ListPanel.ScrollViewContentHeight=Height";
parent._listpanel.setScrollViewContentHeight(_height);
 //BA.debugLineNum = 689;BA.debugLine="If Height<ListPanel.Height Then";
if (true) break;

case 11:
//if
this.state = 20;
if (_height<parent._listpanel.getHeight()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 690;BA.debugLine="If ListPanel.Top=0 Then";
if (true) break;

case 14:
//if
this.state = 19;
if (parent._listpanel.getTop()==0) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 //BA.debugLineNum = 691;BA.debugLine="ListPanel.top=ListPanel.Height-Height";
parent._listpanel.setTop((int) (parent._listpanel.getHeight()-_height));
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 693;BA.debugLine="ListPanel.Height=Height";
parent._listpanel.setHeight(_height);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;
;
 //BA.debugLineNum = 696;BA.debugLine="If SelIndex>-1 Then";

case 20:
//if
this.state = 23;
if (parent._selindex>-1) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 697;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 26;
return;
case 26:
//C
this.state = 23;
;
 //BA.debugLineNum = 698;BA.debugLine="setSelectedIndex(SelIndex)";
parent._setselectedindex(parent._selindex);
 if (true) break;

case 23:
//C
this.state = -1;
;
 //BA.debugLineNum = 700;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _fixpanel() throws Exception{
int _left = 0;
int _top = 0;
int _width = 0;
int _height = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _prec = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
 //BA.debugLineNum = 599;BA.debugLine="Private Sub fixPanel";
 //BA.debugLineNum = 600;BA.debugLine="Try";
try { //BA.debugLineNum = 601;BA.debugLine="Dim Left As Int = mBase.Left";
_left = _mbase.getLeft();
 //BA.debugLineNum = 602;BA.debugLine="Dim Top As Int = mBase.top";
_top = _mbase.getTop();
 //BA.debugLineNum = 603;BA.debugLine="Dim width As Int";
_width = 0;
 //BA.debugLineNum = 604;BA.debugLine="Dim height As Int";
_height = 0;
 //BA.debugLineNum = 605;BA.debugLine="Dim prec As B4XView = mBase";
_prec = new anywheresoftware.b4a.objects.B4XViewWrapper();
_prec = _mbase;
 //BA.debugLineNum = 606;BA.debugLine="Dim pnl As B4XView = mBase.Parent";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _mbase.getParent();
 //BA.debugLineNum = 608;BA.debugLine="Do While (pnl.Parent.IsInitialized) And (GetType";
while ((_pnl.getParent().IsInitialized()) && ((__c.GetType((Object)(_pnl.getObject()))).equals("B4IMainView") == false)) {
 //BA.debugLineNum = 610;BA.debugLine="Left=Left+pnl.Left";
_left = (int) (_left+_pnl.getLeft());
 //BA.debugLineNum = 611;BA.debugLine="Top=Top+pnl.Top";
_top = (int) (_top+_pnl.getTop());
 //BA.debugLineNum = 612;BA.debugLine="prec=pnl";
_prec = _pnl;
 //BA.debugLineNum = 613;BA.debugLine="pnl=pnl.Parent";
_pnl = _pnl.getParent();
 }
;
 } 
       catch (Exception e15) {
			ba.setLastException(e15); //BA.debugLineNum = 616;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("963176721",__c.LastException(ba).getMessage(),0);
 };
 //BA.debugLineNum = 618;BA.debugLine="If xui.IsB4i Then pnl=prec";
if (_xui.getIsB4i()) { 
_pnl = _prec;};
 //BA.debugLineNum = 620;BA.debugLine="width=pnl.Width";
_width = _pnl.getWidth();
 //BA.debugLineNum = 621;BA.debugLine="height=pnl.Height";
_height = _pnl.getHeight();
 //BA.debugLineNum = 626;BA.debugLine="If width=-1 Then width=100%x";
if (_width==-1) { 
_width = __c.PerXToCurrent((float) (100),ba);};
 //BA.debugLineNum = 627;BA.debugLine="If height=-1 Then height=100%y";
if (_height==-1) { 
_height = __c.PerYToCurrent((float) (100),ba);};
 //BA.debugLineNum = 630;BA.debugLine="outListPanel.Color=xui.Color_ARGB(5,5,5,5)";
_outlistpanel.setColor(_xui.Color_ARGB((int) (5),(int) (5),(int) (5),(int) (5)));
 //BA.debugLineNum = 631;BA.debugLine="outListPanel.RemoveViewFromParent";
_outlistpanel.RemoveViewFromParent();
 //BA.debugLineNum = 632;BA.debugLine="pnl.AddView(outListPanel,0,0,width,height)";
_pnl.AddView((android.view.View)(_outlistpanel.getObject()),(int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 634;BA.debugLine="If kbh>0 Then";
if (_kbh>0) { 
 //BA.debugLineNum = 635;BA.debugLine="height=kbh";
_height = _kbh;
 };
 //BA.debugLineNum = 639;BA.debugLine="ListPanel.RemoveViewFromParent";
_listpanel.RemoveViewFromParent();
 //BA.debugLineNum = 641;BA.debugLine="If Top+(mBase.Height/2)>height/2 Then";
if (_top+(_mbase.getHeight()/(double)2)>_height/(double)2) { 
 //BA.debugLineNum = 643;BA.debugLine="outListPanel.AddView(ListPanel,Left,0,mBase.Widt";
_outlistpanel.AddView((android.view.View)(_listpanel.getObject()),_left,(int) (0),_mbase.getWidth(),_top);
 }else {
 //BA.debugLineNum = 646;BA.debugLine="outListPanel.AddView(ListPanel,Left,Top+mBase.He";
_outlistpanel.AddView((android.view.View)(_listpanel.getObject()),_left,(int) (_top+_mbase.getHeight()),_mbase.getWidth(),(int) (_outlistpanel.getHeight()-_top-_mbase.getHeight()-__c.DipToCurrent((int) (20))));
 };
 //BA.debugLineNum = 648;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Public Sub GetBase As B4XView";
 //BA.debugLineNum = 223;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public String  _getcombotext() throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Public Sub getComboText As String";
 //BA.debugLineNum = 274;BA.debugLine="Return MyLabel.Text";
if (true) return _mylabel.getText();
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 413;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 414;BA.debugLine="Return MyLabel.Enabled";
if (true) return _mylabel.getEnabled();
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return false;
}
public String  _gethint() throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Public Sub getHint As String";
 //BA.debugLineNum = 234;BA.debugLine="Return LabelHint.Text";
if (true) return _labelhint.getText();
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gethintfont() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Public Sub getHintFont As B4XFont";
 //BA.debugLineNum = 242;BA.debugLine="Return LabelHint.Font";
if (true) return _labelhint.getFont();
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public String  _getitem(int _position) throws Exception{
String _ret = "";
 //BA.debugLineNum = 332;BA.debugLine="Public Sub GetItem(Position As Int) As String";
 //BA.debugLineNum = 333;BA.debugLine="Dim Ret As String = \"\"";
_ret = "";
 //BA.debugLineNum = 336;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<_listitem.getSize()) { 
 //BA.debugLineNum = 337;BA.debugLine="Ret=ListItem.Get(Position).As(Map).Get(\"Text\")";
_ret = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_position)))).Get((Object)("Text")));
 };
 //BA.debugLineNum = 339;BA.debugLine="Return Ret";
if (true) return _ret;
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return "";
}
public int  _getselectedindex() throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Public Sub getSelectedIndex As Int";
 //BA.debugLineNum = 353;BA.debugLine="Return SelIndex";
if (true) return _selindex;
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return 0;
}
public String  _getselectedtextitem() throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Public Sub getSelectedTextItem As String";
 //BA.debugLineNum = 376;BA.debugLine="Return  GetItem(SelIndex)";
if (true) return _getitem(_selindex);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return "";
}
public Object  _getselectedvalueitem() throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Public Sub getSelectedValueItem As Object";
 //BA.debugLineNum = 395;BA.debugLine="Return  GetValue(SelIndex)";
if (true) return _getvalue(_selindex);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public int  _getselectionlength() throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Public Sub getSelectionLength As Int";
 //BA.debugLineNum = 266;BA.debugLine="Return MyLabel.SelectionLength";
if (true) return _mylabel.getSelectionLength();
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return 0;
}
public int  _getselectionstart() throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Public Sub getSelectionStart As Int";
 //BA.debugLineNum = 262;BA.debugLine="Return MyLabel.SelectionStart";
if (true) return _mylabel.getSelectionStart();
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gettextfont() throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Public Sub getTextFont As B4XFont";
 //BA.debugLineNum = 258;BA.debugLine="Return MyLabel.Font";
if (true) return _mylabel.getFont();
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public Object  _getvalue(int _position) throws Exception{
Object _ret = null;
 //BA.debugLineNum = 342;BA.debugLine="Public Sub GetValue(Position As Int) As Object";
 //BA.debugLineNum = 343;BA.debugLine="Dim Ret As Object";
_ret = new Object();
 //BA.debugLineNum = 344;BA.debugLine="If Position=-1 And Editable Then Return MyLabel.T";
if (_position==-1 && _editable) { 
if (true) return (Object)(_mylabel.getText());};
 //BA.debugLineNum = 345;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<_listitem.getSize()) { 
 //BA.debugLineNum = 346;BA.debugLine="Ret=ListItem.Get(Position).As(Map).Get(\"Value\")";
_ret = ((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_position)))).Get((Object)("Value"));
 };
 //BA.debugLineNum = 349;BA.debugLine="Return Ret";
if (true) return _ret;
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.ScrollViewWrapper _sc = null;
 //BA.debugLineNum = 50;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 51;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 52;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 54;BA.debugLine="outListPanel=xui.CreatePanel(\"outListPanel\")";
_outlistpanel = _xui.CreatePanel(ba,"outListPanel");
 //BA.debugLineNum = 56;BA.debugLine="Dim Sc As ScrollView";
_sc = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Sc.Initialize2(1000dip,\"Sc\")";
_sc.Initialize2(ba,__c.DipToCurrent((int) (1000)),"Sc");
 //BA.debugLineNum = 58;BA.debugLine="ListPanel=Sc";
_listpanel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sc.getObject()));
 //BA.debugLineNum = 60;BA.debugLine="kk.Initialize(\"kk\")";
_kk.Initialize("kk");
 //BA.debugLineNum = 61;BA.debugLine="kk.AddHeightChangedEvent";
_kk.AddHeightChangedEvent(ba);
 //BA.debugLineNum = 74;BA.debugLine="LabelHint=CreateLabel(\"LabelHint\")";
_labelhint = _createlabel("LabelHint");
 //BA.debugLineNum = 76;BA.debugLine="ListItem.Initialize";
_listitem.Initialize();
 //BA.debugLineNum = 77;BA.debugLine="SelIndex=-1";
_selindex = (int) (-1);
 //BA.debugLineNum = 79;BA.debugLine="ItemHeight=40dip";
_itemheight = __c.DipToCurrent((int) (40));
 //BA.debugLineNum = 80;BA.debugLine="OpenDropDownOnFocus=True";
_opendropdownonfocus = __c.True;
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public boolean  _isdropdownopen() throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Public Sub isDropDownOpen As Boolean";
 //BA.debugLineNum = 329;BA.debugLine="Return (outListPanel.Parent.IsInitialized)";
if (true) return (_outlistpanel.getParent().IsInitialized());
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return false;
}
public String  _kk_heightchanged(int _newheight,int _oldheight) throws Exception{
 //BA.debugLineNum = 544;BA.debugLine="Private Sub kk_HeightChanged (NewHeight As Int, Ol";
 //BA.debugLineNum = 545;BA.debugLine="kbh=NewHeight";
_kbh = _newheight;
 //BA.debugLineNum = 547;BA.debugLine="If isDropDownOpen Then";
if (_isdropdownopen()) { 
 //BA.debugLineNum = 548;BA.debugLine="CloseDropDown";
_closedropdown();
 //BA.debugLineNum = 549;BA.debugLine="fixPanel";
_fixpanel();
 //BA.debugLineNum = 550;BA.debugLine="DrawListBox";
_drawlistbox();
 };
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return "";
}
public void  _labselect_click() throws Exception{
ResumableSub_LabSelect_Click rsub = new ResumableSub_LabSelect_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_LabSelect_Click extends BA.ResumableSub {
public ResumableSub_LabSelect_Click(b4a.example.ef.sd_xcombobox parent) {
this.parent = parent;
}
b4a.example.ef.sd_xcombobox parent;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
int _index = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 432;BA.debugLine="Dim L As B4XView = Sender";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 433;BA.debugLine="Dim index As Int = L.Tag";
_index = (int)(BA.ObjectToNumber(_l.getTag()));
 //BA.debugLineNum = 435;BA.debugLine="setSelectedIndex(index)";
parent._setselectedindex(_index);
 //BA.debugLineNum = 436;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 //BA.debugLineNum = 437;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._xui.SubExists(ba,parent._mcallback,parent._meventname+"_ItemClick",(int) (2))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent.__c.CallSubDelayed3(ba,parent._mcallback,parent._meventname+"_ItemClick",(Object)(_index),parent._getvalue(_index));
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 438;BA.debugLine="outListPanel.RemoveViewFromParent";
parent._outlistpanel.RemoveViewFromParent();
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _mylabel_action() throws Exception{
 //BA.debugLineNum = 462;BA.debugLine="Private Sub MyLabel_Action";
 //BA.debugLineNum = 464;BA.debugLine="SelectedItem(MyLabel.Text)";
_selecteditem(_mylabel.getText());
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_beginedit() throws Exception{
 //BA.debugLineNum = 458;BA.debugLine="Private Sub MyLabel_BeginEdit";
 //BA.debugLineNum = 459;BA.debugLine="MyLabel_FocusChanged(True)";
_mylabel_focuschanged(__c.True);
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_click() throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Private Sub MyLabel_Click";
 //BA.debugLineNum = 442;BA.debugLine="OpenDropDown";
_opendropdown();
 //BA.debugLineNum = 443;BA.debugLine="MyLabel.RequestFocus";
_mylabel.RequestFocus();
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_endedit() throws Exception{
 //BA.debugLineNum = 472;BA.debugLine="Private Sub MyLabel_EndEdit";
 //BA.debugLineNum = 474;BA.debugLine="MyLabel_FocusChanged(False)";
_mylabel_focuschanged(__c.False);
 //BA.debugLineNum = 476;BA.debugLine="SelectedItem(MyLabel.Text)";
_selecteditem(_mylabel.getText());
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_enterpressed() throws Exception{
 //BA.debugLineNum = 467;BA.debugLine="Private Sub MyLabel_EnterPressed";
 //BA.debugLineNum = 469;BA.debugLine="SelectedItem(MyLabel.Text)";
_selecteditem(_mylabel.getText());
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Private Sub MyLabel_FocusChanged (HasFocus As Bool";
 //BA.debugLineNum = 447;BA.debugLine="If HasFocus And OpenDropDownOnFocus Then";
if (_hasfocus && _opendropdownonfocus) { 
 //BA.debugLineNum = 448;BA.debugLine="OpenDropDown";
_opendropdown();
 };
 //BA.debugLineNum = 453;BA.debugLine="ModIntern=False";
_modintern = __c.False;
 //BA.debugLineNum = 455;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_xui.SubExists(ba,_mcallback,_meventname+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_mcallback,_meventname+"_FocusChanged",(Object)(_hasfocus));};
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return "";
}
public String  _mylabel_textchanged(String _oldtext,String _newtext) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
int _startposition = 0;
int _endposition = 0;
int _startvisible = 0;
int _endvisible = 0;
 //BA.debugLineNum = 493;BA.debugLine="Private Sub MyLabel_TextChanged (OldText As String";
 //BA.debugLineNum = 494;BA.debugLine="If ModIntern Then";
if (_modintern) { 
 //BA.debugLineNum = 495;BA.debugLine="ModIntern=False";
_modintern = __c.False;
 //BA.debugLineNum = 496;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 498;BA.debugLine="If OldText=NewText Then Return";
if ((_oldtext).equals(_newtext)) { 
if (true) return "";};
 //BA.debugLineNum = 499;BA.debugLine="If isDropDownOpen=False And OpenDropDownOnFocus T";
if (_isdropdownopen()==__c.False && _opendropdownonfocus) { 
_opendropdown();};
 //BA.debugLineNum = 500;BA.debugLine="FindIndex = -1";
_findindex = (int) (-1);
 //BA.debugLineNum = 502;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step8 = 1;
final int limit8 = (int) (_listitem.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 503;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_i)));
 //BA.debugLineNum = 505;BA.debugLine="If v.Get(\"Text\").As(String).ToLowerCase.IndexOf(";
if ((BA.ObjectToString(_v.Get((Object)("Text")))).toLowerCase().indexOf(_newtext.toLowerCase())>-1) { 
 //BA.debugLineNum = 506;BA.debugLine="FindIndex=i";
_findindex = _i;
 //BA.debugLineNum = 507;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 511;BA.debugLine="If SelIndex>-1 And SelIndex<ListItem.Size Then";
if (_selindex>-1 && _selindex<_listitem.getSize()) { 
 //BA.debugLineNum = 512;BA.debugLine="If ListItem.Get(SelIndex).As(Map).Get(\"object\").";
if (((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_selindex)))).Get((Object)("object"))))).IsInitialized()) { 
 //BA.debugLineNum = 513;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_selindex)))).Get((Object)("object"))))).setColor(_bclr);
 //BA.debugLineNum = 514;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_selindex)))).Get((Object)("object"))))).setTextColor(_mylabel.getTextColor());
 };
 };
 //BA.debugLineNum = 518;BA.debugLine="SelIndex=FindIndex";
_selindex = _findindex;
 //BA.debugLineNum = 519;BA.debugLine="If SelIndex>-1 And SelIndex<ListItem.Size Then";
if (_selindex>-1 && _selindex<_listitem.getSize()) { 
 //BA.debugLineNum = 520;BA.debugLine="If ListItem.Get(SelIndex).As(Map).Get(\"object\").";
if (((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_selindex)))).Get((Object)("object"))))).IsInitialized()) { 
 //BA.debugLineNum = 521;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_selindex)))).Get((Object)("object"))))).setColor(_mylabel.getTextColor());
 //BA.debugLineNum = 522;BA.debugLine="ListItem.Get(SelIndex).As(Map).Get(\"object\").As";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_selindex)))).Get((Object)("object"))))).setTextColor(_bclr);
 //BA.debugLineNum = 525;BA.debugLine="Dim StartPosition As Int = ListItem.Get(SelInde";
_startposition = ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_selindex)))).Get((Object)("object"))))).getTop();
 //BA.debugLineNum = 526;BA.debugLine="Dim EndPosition As Int = StartPosition + ListIt";
_endposition = (int) (_startposition+((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_selindex)))).Get((Object)("object"))))).getHeight());
 //BA.debugLineNum = 527;BA.debugLine="Dim StartVisible As Int = ListPanel.ScrollViewO";
_startvisible = _listpanel.getScrollViewOffsetY();
 //BA.debugLineNum = 528;BA.debugLine="Dim EndVisible As Int = StartVisible + ListPane";
_endvisible = (int) (_startvisible+_listpanel.getHeight());
 //BA.debugLineNum = 530;BA.debugLine="If Not((StartPosition>=StartVisible And StartPo";
if (__c.Not((_startposition>=_startvisible && _startposition<_endvisible) && (_endposition>_startvisible && _endposition<=_endvisible))) { 
 //BA.debugLineNum = 532;BA.debugLine="If StartPosition>ListPanel.ScrollViewContentHe";
if (_startposition>_listpanel.getScrollViewContentHeight()-_listpanel.getHeight()) { 
 //BA.debugLineNum = 533;BA.debugLine="ListPanel.ScrollViewOffsetY=ListPanel.ScrollV";
_listpanel.setScrollViewOffsetY((int) (_listpanel.getScrollViewContentHeight()-_listpanel.getHeight()));
 }else {
 //BA.debugLineNum = 535;BA.debugLine="ListPanel.ScrollViewOffsetY=StartPosition";
_listpanel.setScrollViewOffsetY(_startposition);
 };
 };
 };
 };
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return "";
}
public String  _opendropdown() throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Public Sub OpenDropDown";
 //BA.debugLineNum = 320;BA.debugLine="fixPanel";
_fixpanel();
 //BA.debugLineNum = 321;BA.debugLine="DrawListBox";
_drawlistbox();
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return "";
}
public String  _outlistpanel_click() throws Exception{
 //BA.debugLineNum = 425;BA.debugLine="Private Sub outListPanel_Click";
 //BA.debugLineNum = 426;BA.debugLine="CloseDropDown";
_closedropdown();
 //BA.debugLineNum = 427;BA.debugLine="outListPanel.RequestFocus";
_outlistpanel.RequestFocus();
 //BA.debugLineNum = 428;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_xui.SubExists(ba,_mcallback,_meventname+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_mcallback,_meventname+"_FocusChanged",(Object)(__c.False));};
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return "";
}
public void  _selecteditem(String _value) throws Exception{
ResumableSub_SelectedItem rsub = new ResumableSub_SelectedItem(this,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SelectedItem extends BA.ResumableSub {
public ResumableSub_SelectedItem(b4a.example.ef.sd_xcombobox parent,String _value) {
this.parent = parent;
this._value = _value;
}
b4a.example.ef.sd_xcombobox parent;
String _value;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 480;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
if (true) break;

case 1:
//if
this.state = 10;
if (parent._xui.SubExists(ba,parent._mcallback,parent._meventname+"_ItemClick",(int) (2))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 481;BA.debugLine="If SelectOnlyFromList Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._selectonlyfromlist) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 482;BA.debugLine="SelIndex=FindIndex";
parent._selindex = parent._findindex;
 //BA.debugLineNum = 483;BA.debugLine="MyLabel.Text=GetItem(SelIndex)";
parent._mylabel.setText(BA.ObjectToCharSequence(parent._getitem(parent._selindex)));
 //BA.debugLineNum = 484;BA.debugLine="CallSubDelayed3(mCallBack,mEventName & \"_ItemCl";
parent.__c.CallSubDelayed3(ba,parent._mcallback,parent._meventname+"_ItemClick",(Object)(parent._selindex),(Object)(parent._mylabel.getText()));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 486;BA.debugLine="CallSubDelayed3(mCallBack,mEventName & \"_ItemCl";
parent.__c.CallSubDelayed3(ba,parent._mcallback,parent._meventname+"_ItemClick",(Object)(-1),(Object)(_value));
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
 //BA.debugLineNum = 489;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 11;
return;
case 11:
//C
this.state = -1;
;
 //BA.debugLineNum = 490;BA.debugLine="outListPanel.RemoveViewFromParent";
parent._outlistpanel.RemoveViewFromParent();
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setenabled(boolean _b) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Public Sub setEnabled(B As Boolean)";
 //BA.debugLineNum = 418;BA.debugLine="MyLabel.Enabled=B";
_mylabel.setEnabled(_b);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return "";
}
public String  _sethint(String _text) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Public Sub setHint(Text As String)";
 //BA.debugLineNum = 230;BA.debugLine="LabelHint.Text=Text";
_labelhint.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return "";
}
public String  _sethintfont(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Public Sub setHintFont(Fnt As B4XFont)";
 //BA.debugLineNum = 238;BA.debugLine="LabelHint.Font=Fnt";
_labelhint.setFont(_fnt);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public String  _setselectedindex(int _position) throws Exception{
int _pos = 0;
 //BA.debugLineNum = 356;BA.debugLine="Public Sub setSelectedIndex(Position As Int)";
 //BA.debugLineNum = 357;BA.debugLine="If Position>-1 And Position<ListItem.Size Then";
if (_position>-1 && _position<_listitem.getSize()) { 
 //BA.debugLineNum = 358;BA.debugLine="SelIndex=Position";
_selindex = _position;
 //BA.debugLineNum = 359;BA.debugLine="MyLabel.Text=GetItem(Position)";
_mylabel.setText(BA.ObjectToCharSequence(_getitem(_position)));
 //BA.debugLineNum = 361;BA.debugLine="Dim Pos As Int = ItemHeight * Position";
_pos = (int) (_itemheight*_position);
 //BA.debugLineNum = 363;BA.debugLine="ListPanel.As(ScrollView).ScrollPosition=Pos";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(_listpanel.getObject()))).setScrollPosition(_pos);
 }else if(_position==-1) { 
 //BA.debugLineNum = 370;BA.debugLine="SelIndex=Position";
_selindex = _position;
 };
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return "";
}
public String  _setselectedtextitem(String _value) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
 //BA.debugLineNum = 379;BA.debugLine="Public Sub setSelectedTextItem(Value As String)";
 //BA.debugLineNum = 380;BA.debugLine="If Editable Then";
if (_editable) { 
 //BA.debugLineNum = 381;BA.debugLine="ModIntern=True";
_modintern = __c.True;
 //BA.debugLineNum = 382;BA.debugLine="MyLabel.Text=Value";
_mylabel.setText(BA.ObjectToCharSequence(_value));
 }else {
 //BA.debugLineNum = 384;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (_listitem.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 385;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_i)));
 //BA.debugLineNum = 386;BA.debugLine="If Value = v.Get(\"Text\") Then";
if ((_value).equals(BA.ObjectToString(_v.Get((Object)("Text"))))) { 
 //BA.debugLineNum = 387;BA.debugLine="SelIndex=i";
_selindex = _i;
 //BA.debugLineNum = 388;BA.debugLine="MyLabel.Text=GetItem(I)";
_mylabel.setText(BA.ObjectToCharSequence(_getitem(_i)));
 };
 }
};
 };
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return "";
}
public String  _setselectedvalueitem(Object _value) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _v = null;
 //BA.debugLineNum = 398;BA.debugLine="Public Sub setSelectedValueItem(Value As Object)";
 //BA.debugLineNum = 399;BA.debugLine="If Editable Then";
if (_editable) { 
 //BA.debugLineNum = 400;BA.debugLine="ModIntern=True";
_modintern = __c.True;
 //BA.debugLineNum = 401;BA.debugLine="MyLabel.Text=Value";
_mylabel.setText(BA.ObjectToCharSequence(_value));
 }else {
 //BA.debugLineNum = 403;BA.debugLine="For i=0 To ListItem.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (_listitem.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 404;BA.debugLine="Dim v As Map = ListItem.Get(i)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listitem.Get(_i)));
 //BA.debugLineNum = 405;BA.debugLine="If Value = v.Get(\"Value\") Then";
if ((_value).equals(_v.Get((Object)("Value")))) { 
 //BA.debugLineNum = 406;BA.debugLine="SelIndex=i";
_selindex = _i;
 //BA.debugLineNum = 407;BA.debugLine="MyLabel.Text=GetItem(I)";
_mylabel.setText(BA.ObjectToCharSequence(_getitem(_i)));
 };
 }
};
 };
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return "";
}
public String  _setselection(int _start,int _length) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Public Sub SetSelection(Start As Int, Length As In";
 //BA.debugLineNum = 270;BA.debugLine="MyLabel.SetSelection(Start,Length)";
_mylabel.SetSelection(_start,_length);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public String  _settextfont(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
 //BA.debugLineNum = 254;BA.debugLine="MyLabel.Font=Fnt";
_mylabel.setFont(_fnt);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public int  _size() throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="public Sub Size As Int";
 //BA.debugLineNum = 305;BA.debugLine="Return ListItem.Size";
if (true) return _listitem.getSize();
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
