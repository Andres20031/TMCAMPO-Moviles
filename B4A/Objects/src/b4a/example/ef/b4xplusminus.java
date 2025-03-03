package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xplusminus extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xplusminus");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xplusminus.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlplus = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlminus = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblplus = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblminus = null;
public String _formation = "";
public boolean _mcyclic = false;
public boolean _mrapid = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _mainlabel = null;
public int _arrowssize = 0;
public anywheresoftware.b4a.objects.collections.List _mstringitems = null;
public double _mstartrange = 0;
public double _minterval = 0;
public double _mendrange = 0;
public int _mselectedindex = 0;
public int _loopindex = 0;
public int _rapidperiod1 = 0;
public int _rapidperiod2 = 0;
public b4a.example.ef.b4xformatter _formatter = null;
public boolean _stringmode = false;
public int _size = 0;
public boolean _mhaptic = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.ef.b4xplusminus __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=58523648;
 //BA.debugLineNum = 58523648;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=58523649;
 //BA.debugLineNum = 58523649;BA.debugLine="If Formation = \"Horizontal\" Then";
if ((__ref._formation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, 0, ArrowsSize,";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._arrowssize /*int*/ ,(int) (_height));
RDebugUtils.currentLine=58523651;
 //BA.debugLineNum = 58523651;BA.debugLine="pnlPlus.SetLayoutAnimated(0, Width - ArrowsSize,";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width-__ref._arrowssize /*int*/ ),(int) (0),__ref._arrowssize /*int*/ ,(int) (_height));
RDebugUtils.currentLine=58523652;
 //BA.debugLineNum = 58523652;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }else 
{RDebugUtils.currentLine=58523653;
 //BA.debugLineNum = 58523653;BA.debugLine="Else if Formation = \"Vertical\" Then";
if ((__ref._formation /*String*/ ).equals("Vertical")) { 
RDebugUtils.currentLine=58523654;
 //BA.debugLineNum = 58523654;BA.debugLine="pnlPlus.SetLayoutAnimated(0, 0, 0, Width, Arrows";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),__ref._arrowssize /*int*/ );
RDebugUtils.currentLine=58523655;
 //BA.debugLineNum = 58523655;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, Height - Arrows";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (_height-__ref._arrowssize /*int*/ ),(int) (_width),__ref._arrowssize /*int*/ );
RDebugUtils.currentLine=58523656;
 //BA.debugLineNum = 58523656;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }else {
RDebugUtils.currentLine=58523658;
 //BA.debugLineNum = 58523658;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, Height - Arrows";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (_height-__ref._arrowssize /*int*/ ),(int) (_width/(double)2),__ref._arrowssize /*int*/ );
RDebugUtils.currentLine=58523659;
 //BA.debugLineNum = 58523659;BA.debugLine="pnlPlus.SetLayoutAnimated(0, Width / 2, pnlMinus";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width/(double)2),__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=58523660;
 //BA.debugLineNum = 58523660;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height-__ref._arrowssize /*int*/ +__c.DipToCurrent((int) (5))));
 }}
;
RDebugUtils.currentLine=58523662;
 //BA.debugLineNum = 58523662;BA.debugLine="lblMinus.SetLayoutAnimated(0, 0, 0, pnlMinus.Widt";
__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=58523663;
 //BA.debugLineNum = 58523663;BA.debugLine="lblPlus.SetLayoutAnimated(0, 0, 0, pnlPlus.Width,";
__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=58523664;
 //BA.debugLineNum = 58523664;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xplusminus __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
RDebugUtils.currentLine=58327040;
 //BA.debugLineNum = 58327040;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=58327041;
 //BA.debugLineNum = 58327041;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=58327042;
 //BA.debugLineNum = 58327042;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=58327043;
 //BA.debugLineNum = 58327043;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=58327044;
 //BA.debugLineNum = 58327044;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=58327045;
 //BA.debugLineNum = 58327045;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=58327046;
 //BA.debugLineNum = 58327046;BA.debugLine="Public pnlPlus, pnlMinus As B4XView";
_pnlplus = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlminus = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=58327047;
 //BA.debugLineNum = 58327047;BA.debugLine="Public lblPlus, lblMinus As B4XView";
_lblplus = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lblminus = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=58327048;
 //BA.debugLineNum = 58327048;BA.debugLine="Public Formation As String";
_formation = "";
RDebugUtils.currentLine=58327049;
 //BA.debugLineNum = 58327049;BA.debugLine="Public mCyclic As Boolean";
_mcyclic = false;
RDebugUtils.currentLine=58327050;
 //BA.debugLineNum = 58327050;BA.debugLine="Public mRapid As Boolean";
_mrapid = false;
RDebugUtils.currentLine=58327051;
 //BA.debugLineNum = 58327051;BA.debugLine="Public MainLabel As B4XView";
_mainlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=58327052;
 //BA.debugLineNum = 58327052;BA.debugLine="Public ArrowsSize As Int = 30dip";
_arrowssize = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=58327053;
 //BA.debugLineNum = 58327053;BA.debugLine="Private mStringItems As List";
_mstringitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58327054;
 //BA.debugLineNum = 58327054;BA.debugLine="Private mStartRange, mInterval, mEndRange As Doub";
_mstartrange = 0;
_minterval = 0;
_mendrange = 0;
RDebugUtils.currentLine=58327055;
 //BA.debugLineNum = 58327055;BA.debugLine="Private mSelectedIndex As Int = -1";
_mselectedindex = (int) (-1);
RDebugUtils.currentLine=58327056;
 //BA.debugLineNum = 58327056;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
RDebugUtils.currentLine=58327057;
 //BA.debugLineNum = 58327057;BA.debugLine="Public RapidPeriod1 As Int = 1000";
_rapidperiod1 = (int) (1000);
RDebugUtils.currentLine=58327058;
 //BA.debugLineNum = 58327058;BA.debugLine="Public RapidPeriod2 As Int = 30";
_rapidperiod2 = (int) (30);
RDebugUtils.currentLine=58327059;
 //BA.debugLineNum = 58327059;BA.debugLine="Public Formatter As B4XFormatter";
_formatter = new b4a.example.ef.b4xformatter();
RDebugUtils.currentLine=58327060;
 //BA.debugLineNum = 58327060;BA.debugLine="Private StringMode As Boolean";
_stringmode = false;
RDebugUtils.currentLine=58327061;
 //BA.debugLineNum = 58327061;BA.debugLine="Private Size As Int";
_size = 0;
RDebugUtils.currentLine=58327062;
 //BA.debugLineNum = 58327062;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=58327063;
 //BA.debugLineNum = 58327063;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.ef.b4xplusminus __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_text}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=59310080;
 //BA.debugLineNum = 59310080;BA.debugLine="Private Sub CreateLabel (text As String) As B4XVie";
RDebugUtils.currentLine=59310081;
 //BA.debugLineNum = 59310081;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=59310082;
 //BA.debugLineNum = 59310082;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=59310083;
 //BA.debugLineNum = 59310083;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=59310084;
 //BA.debugLineNum = 59310084;BA.debugLine="xlbl.Font = xui.CreateMaterialIcons(30)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (30)));
RDebugUtils.currentLine=59310085;
 //BA.debugLineNum = 59310085;BA.debugLine="xlbl.Text = text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=59310086;
 //BA.debugLineNum = 59310086;BA.debugLine="xlbl.TextColor = MainLabel.TextColor";
_xlbl.setTextColor(__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=59310087;
 //BA.debugLineNum = 59310087;BA.debugLine="Return xlbl";
if (true) return _xlbl;
RDebugUtils.currentLine=59310088;
 //BA.debugLineNum = 59310088;BA.debugLine="End Sub";
return null;
}
public String  _decrement(b4a.example.ef.b4xplusminus __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "decrement", true))
	 {return ((String) Debug.delegate(ba, "decrement", null));}
RDebugUtils.currentLine=59047936;
 //BA.debugLineNum = 59047936;BA.debugLine="Public Sub Decrement";
RDebugUtils.currentLine=59047937;
 //BA.debugLineNum = 59047937;BA.debugLine="If mSelectedIndex <= 0 Then";
if (__ref._mselectedindex /*int*/ <=0) { 
RDebugUtils.currentLine=59047938;
 //BA.debugLineNum = 59047938;BA.debugLine="If mCyclic Then";
if (__ref._mcyclic /*boolean*/ ) { 
RDebugUtils.currentLine=59047939;
 //BA.debugLineNum = 59047939;BA.debugLine="mSelectedIndex = Size";
__ref._mselectedindex /*int*/  = __ref._size /*int*/ ;
 }else {
RDebugUtils.currentLine=59047941;
 //BA.debugLineNum = 59047941;BA.debugLine="mSelectedIndex = 0";
__ref._mselectedindex /*int*/  = (int) (0);
RDebugUtils.currentLine=59047942;
 //BA.debugLineNum = 59047942;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=59047943;
 //BA.debugLineNum = 59047943;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=59047946;
 //BA.debugLineNum = 59047946;BA.debugLine="SetIndex(mSelectedIndex - 1, True)";
__ref._setindex /*String*/ (null,(int) (__ref._mselectedindex /*int*/ -1),__c.True);
RDebugUtils.currentLine=59047947;
 //BA.debugLineNum = 59047947;BA.debugLine="End Sub";
return "";
}
public String  _setindex(b4a.example.ef.b4xplusminus __ref,int _i,boolean _raiseevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "setindex", true))
	 {return ((String) Debug.delegate(ba, "setindex", new Object[] {_i,_raiseevent}));}
Object _value = null;
RDebugUtils.currentLine=58916864;
 //BA.debugLineNum = 58916864;BA.debugLine="Private Sub SetIndex(i As Int, RaiseEvent As Boole";
RDebugUtils.currentLine=58916865;
 //BA.debugLineNum = 58916865;BA.debugLine="If i >= Size Then i = -1";
if (_i>=__ref._size /*int*/ ) { 
_i = (int) (-1);};
RDebugUtils.currentLine=58916866;
 //BA.debugLineNum = 58916866;BA.debugLine="mSelectedIndex = i";
__ref._mselectedindex /*int*/  = _i;
RDebugUtils.currentLine=58916867;
 //BA.debugLineNum = 58916867;BA.debugLine="If mSelectedIndex = -1 Then";
if (__ref._mselectedindex /*int*/ ==-1) { 
RDebugUtils.currentLine=58916868;
 //BA.debugLineNum = 58916868;BA.debugLine="MainLabel.Text = \"\"";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else {
RDebugUtils.currentLine=58916870;
 //BA.debugLineNum = 58916870;BA.debugLine="Dim value As Object = GetValueImpl (mSelectedInd";
_value = __ref._getvalueimpl /*Object*/ (null,__ref._mselectedindex /*int*/ );
RDebugUtils.currentLine=58916871;
 //BA.debugLineNum = 58916871;BA.debugLine="If StringMode Then";
if (__ref._stringmode /*boolean*/ ) { 
RDebugUtils.currentLine=58916872;
 //BA.debugLineNum = 58916872;BA.debugLine="InternalSetTextOrCSBuilderToLabel(MainLabel, va";
__ref._internalsettextorcsbuildertolabel /*String*/ (null,__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_value);
 }else {
RDebugUtils.currentLine=58916874;
 //BA.debugLineNum = 58916874;BA.debugLine="MainLabel.Text = Formatter.Format(value)";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._formatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,(double)(BA.ObjectToNumber(_value)))));
 };
RDebugUtils.currentLine=58916876;
 //BA.debugLineNum = 58916876;BA.debugLine="If RaiseEvent And xui.SubExists(mCallBack, mEven";
if (_raiseevent && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_valuechanged",(int) (1))) { 
RDebugUtils.currentLine=58916877;
 //BA.debugLineNum = 58916877;BA.debugLine="CallSub2(mCallBack, mEventName & \"_valuechanged";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_valuechanged",_value);
 };
 };
RDebugUtils.currentLine=58916880;
 //BA.debugLineNum = 58916880;BA.debugLine="lblPlus.Enabled = Size > 0 And (mCyclic Or mSelec";
__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._size /*int*/ >0 && (__ref._mcyclic /*boolean*/  || __ref._mselectedindex /*int*/ <__ref._size /*int*/ -1));
RDebugUtils.currentLine=58916881;
 //BA.debugLineNum = 58916881;BA.debugLine="lblMinus.Enabled = Size > 0 And (mCyclic Or mSele";
__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._size /*int*/ >0 && (__ref._mcyclic /*boolean*/  || __ref._mselectedindex /*int*/ >0));
RDebugUtils.currentLine=58916882;
 //BA.debugLineNum = 58916882;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.b4xplusminus __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=58458112;
 //BA.debugLineNum = 58458112;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=58458113;
 //BA.debugLineNum = 58458113;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=58458115;
 //BA.debugLineNum = 58458115;BA.debugLine="MainLabel = lbl";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=58458116;
 //BA.debugLineNum = 58458116;BA.debugLine="MainLabel.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=58458117;
 //BA.debugLineNum = 58458117;BA.debugLine="Dim pnl As B4XView = Props.Get(\"page\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_props.Get((Object)("page"))));
RDebugUtils.currentLine=58458127;
 //BA.debugLineNum = 58458127;BA.debugLine="pnlPlus = xui.CreatePanel(\"pnlArrow\")";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlArrow");
RDebugUtils.currentLine=58458128;
 //BA.debugLineNum = 58458128;BA.debugLine="pnlMinus = xui.CreatePanel(\"pnlArrow\")";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlArrow");
RDebugUtils.currentLine=58458130;
 //BA.debugLineNum = 58458130;BA.debugLine="pnlPlus.Tag = True";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(__c.True));
RDebugUtils.currentLine=58458131;
 //BA.debugLineNum = 58458131;BA.debugLine="pnlMinus.Tag = False";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(__c.False));
RDebugUtils.currentLine=58458132;
 //BA.debugLineNum = 58458132;BA.debugLine="Formation = Props.Get(\"Orientation\")";
__ref._formation /*String*/  = BA.ObjectToString(_props.Get((Object)("Orientation")));
RDebugUtils.currentLine=58458133;
 //BA.debugLineNum = 58458133;BA.debugLine="mCyclic = Props.Get(\"Cyclic\")";
__ref._mcyclic /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Cyclic")));
RDebugUtils.currentLine=58458134;
 //BA.debugLineNum = 58458134;BA.debugLine="mRapid = Props.Get(\"Rapid\")";
__ref._mrapid /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Rapid")));
RDebugUtils.currentLine=58458135;
 //BA.debugLineNum = 58458135;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=58458136;
 //BA.debugLineNum = 58458136;BA.debugLine="Formatter.GetDefaultFormat.FormatFont = MainLabel";
__ref._formatter /*b4a.example.ef.b4xformatter*/ ._getdefaultformat /*b4a.example.ef.b4xformatter._b4xformatdata*/ (null).FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=58458137;
 //BA.debugLineNum = 58458137;BA.debugLine="Formatter.GetDefaultFormat.TextColor = MainLabel.";
__ref._formatter /*b4a.example.ef.b4xformatter*/ ._getdefaultformat /*b4a.example.ef.b4xformatter._b4xformatdata*/ (null).TextColor /*int*/  = __ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor();
RDebugUtils.currentLine=58458138;
 //BA.debugLineNum = 58458138;BA.debugLine="If Formation = \"Horizontal\" Then";
if ((__ref._formation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=58458139;
 //BA.debugLineNum = 58458139;BA.debugLine="lblPlus = CreateLabel(Chr(0xE315))";
__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe315))));
RDebugUtils.currentLine=58458140;
 //BA.debugLineNum = 58458140;BA.debugLine="lblMinus = CreateLabel(Chr(0xE314))";
__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe314))));
 }else {
RDebugUtils.currentLine=58458142;
 //BA.debugLineNum = 58458142;BA.debugLine="lblPlus = CreateLabel(Chr(0xE316))";
__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe316))));
RDebugUtils.currentLine=58458143;
 //BA.debugLineNum = 58458143;BA.debugLine="lblMinus = CreateLabel(Chr(0xE313))";
__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe313))));
 };
RDebugUtils.currentLine=58458145;
 //BA.debugLineNum = 58458145;BA.debugLine="lblMinus.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=58458146;
 //BA.debugLineNum = 58458146;BA.debugLine="lblPlus.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=58458147;
 //BA.debugLineNum = 58458147;BA.debugLine="MainLabel.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=58458148;
 //BA.debugLineNum = 58458148;BA.debugLine="mBase.AddView(MainLabel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=58458149;
 //BA.debugLineNum = 58458149;BA.debugLine="mBase.AddView(pnlPlus, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=58458150;
 //BA.debugLineNum = 58458150;BA.debugLine="mBase.AddView(pnlMinus, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=58458151;
 //BA.debugLineNum = 58458151;BA.debugLine="pnlPlus.AddView(lblPlus, 0, 0, 0, 0)";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=58458152;
 //BA.debugLineNum = 58458152;BA.debugLine="pnlMinus.AddView(lblMinus, 0, 0, 0, 0)";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=58458153;
 //BA.debugLineNum = 58458153;BA.debugLine="SetIndex(-1, False)";
__ref._setindex /*String*/ (null,(int) (-1),__c.False);
RDebugUtils.currentLine=58458154;
 //BA.debugLineNum = 58458154;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=58458155;
 //BA.debugLineNum = 58458155;BA.debugLine="End Sub";
return "";
}
public Object  _getselectedvalue(b4a.example.ef.b4xplusminus __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "getselectedvalue", true))
	 {return ((Object) Debug.delegate(ba, "getselectedvalue", null));}
RDebugUtils.currentLine=58720256;
 //BA.debugLineNum = 58720256;BA.debugLine="Public Sub getSelectedValue As Object";
RDebugUtils.currentLine=58720257;
 //BA.debugLineNum = 58720257;BA.debugLine="Return GetValueImpl (mSelectedIndex)";
if (true) return __ref._getvalueimpl /*Object*/ (null,__ref._mselectedindex /*int*/ );
RDebugUtils.currentLine=58720258;
 //BA.debugLineNum = 58720258;BA.debugLine="End Sub";
return null;
}
public Object  _getvalueimpl(b4a.example.ef.b4xplusminus __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "getvalueimpl", true))
	 {return ((Object) Debug.delegate(ba, "getvalueimpl", new Object[] {_index}));}
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Private Sub GetValueImpl (Index As Int) As Object";
RDebugUtils.currentLine=58851329;
 //BA.debugLineNum = 58851329;BA.debugLine="If StringMode Then";
if (__ref._stringmode /*boolean*/ ) { 
RDebugUtils.currentLine=58851330;
 //BA.debugLineNum = 58851330;BA.debugLine="Return mStringItems.Get(Index)";
if (true) return __ref._mstringitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index);
 }else {
RDebugUtils.currentLine=58851332;
 //BA.debugLineNum = 58851332;BA.debugLine="If Index = Size - 1 Then";
if (_index==__ref._size /*int*/ -1) { 
RDebugUtils.currentLine=58851333;
 //BA.debugLineNum = 58851333;BA.debugLine="Return mEndRange";
if (true) return (Object)(__ref._mendrange /*double*/ );
 }else {
RDebugUtils.currentLine=58851335;
 //BA.debugLineNum = 58851335;BA.debugLine="Return mStartRange + Index * mInterval";
if (true) return (Object)(__ref._mstartrange /*double*/ +_index*__ref._minterval /*double*/ );
 };
 };
RDebugUtils.currentLine=58851338;
 //BA.debugLineNum = 58851338;BA.debugLine="End Sub";
return null;
}
public String  _increment(b4a.example.ef.b4xplusminus __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "increment", true))
	 {return ((String) Debug.delegate(ba, "increment", null));}
double _v1 = 0;
double _v2 = 0;
RDebugUtils.currentLine=58982400;
 //BA.debugLineNum = 58982400;BA.debugLine="Public Sub Increment";
RDebugUtils.currentLine=58982401;
 //BA.debugLineNum = 58982401;BA.debugLine="If mSelectedIndex = Size - 3 And StringMode = Fal";
if (__ref._mselectedindex /*int*/ ==__ref._size /*int*/ -3 && __ref._stringmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=58982402;
 //BA.debugLineNum = 58982402;BA.debugLine="Dim v1 As Double = GetValueImpl(mSelectedIndex +";
_v1 = (double)(BA.ObjectToNumber(__ref._getvalueimpl /*Object*/ (null,(int) (__ref._mselectedindex /*int*/ +1))));
RDebugUtils.currentLine=58982403;
 //BA.debugLineNum = 58982403;BA.debugLine="Dim v2 As Double = GetValueImpl(mSelectedIndex +";
_v2 = (double)(BA.ObjectToNumber(__ref._getvalueimpl /*Object*/ (null,(int) (__ref._mselectedindex /*int*/ +2))));
RDebugUtils.currentLine=58982404;
 //BA.debugLineNum = 58982404;BA.debugLine="If Formatter.Format(v1) = Formatter.Format(v2) T";
if ((__ref._formatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,_v1)).equals(__ref._formatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,_v2))) { 
RDebugUtils.currentLine=58982405;
 //BA.debugLineNum = 58982405;BA.debugLine="mSelectedIndex = mSelectedIndex + 1";
__ref._mselectedindex /*int*/  = (int) (__ref._mselectedindex /*int*/ +1);
 };
 };
RDebugUtils.currentLine=58982408;
 //BA.debugLineNum = 58982408;BA.debugLine="If mSelectedIndex >= Size - 1 Then";
if (__ref._mselectedindex /*int*/ >=__ref._size /*int*/ -1) { 
RDebugUtils.currentLine=58982409;
 //BA.debugLineNum = 58982409;BA.debugLine="If mCyclic Then";
if (__ref._mcyclic /*boolean*/ ) { 
RDebugUtils.currentLine=58982410;
 //BA.debugLineNum = 58982410;BA.debugLine="mSelectedIndex = -1";
__ref._mselectedindex /*int*/  = (int) (-1);
 }else {
RDebugUtils.currentLine=58982412;
 //BA.debugLineNum = 58982412;BA.debugLine="mSelectedIndex = Size - 1";
__ref._mselectedindex /*int*/  = (int) (__ref._size /*int*/ -1);
RDebugUtils.currentLine=58982413;
 //BA.debugLineNum = 58982413;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=58982414;
 //BA.debugLineNum = 58982414;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=58982417;
 //BA.debugLineNum = 58982417;BA.debugLine="SetIndex(mSelectedIndex + 1, True)";
__ref._setindex /*String*/ (null,(int) (__ref._mselectedindex /*int*/ +1),__c.True);
RDebugUtils.currentLine=58982418;
 //BA.debugLineNum = 58982418;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xplusminus __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=58392576;
 //BA.debugLineNum = 58392576;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=58392577;
 //BA.debugLineNum = 58392577;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=58392578;
 //BA.debugLineNum = 58392578;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=58392579;
 //BA.debugLineNum = 58392579;BA.debugLine="Formatter.Initialize";
__ref._formatter /*b4a.example.ef.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=58392580;
 //BA.debugLineNum = 58392580;BA.debugLine="End Sub";
return "";
}
public String  _internalsettextorcsbuildertolabel(b4a.example.ef.b4xplusminus __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "internalsettextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "internalsettextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=59375616;
 //BA.debugLineNum = 59375616;BA.debugLine="Private Sub InternalSetTextOrCSBuilderToLabel(xlbl";
RDebugUtils.currentLine=59375618;
 //BA.debugLineNum = 59375618;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=59375628;
 //BA.debugLineNum = 59375628;BA.debugLine="End Sub";
return "";
}
public String  _pnlarrow_touch(b4a.example.ef.b4xplusminus __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "pnlarrow_touch", true))
	 {return ((String) Debug.delegate(ba, "pnlarrow_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=59113472;
 //BA.debugLineNum = 59113472;BA.debugLine="Private Sub pnlArrow_Touch (Action As Int, X As Fl";
RDebugUtils.currentLine=59113473;
 //BA.debugLineNum = 59113473;BA.debugLine="Touch(Action = lblPlus.TOUCH_ACTION_DOWN, Action";
__ref._touch /*String*/ (null,_action==__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,_action!=__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=59113474;
 //BA.debugLineNum = 59113474;BA.debugLine="End Sub";
return "";
}
public String  _touch(b4a.example.ef.b4xplusminus __ref,boolean _start,boolean _stop,anywheresoftware.b4a.objects.B4XViewWrapper _pnl) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "touch", true))
	 {return ((String) Debug.delegate(ba, "touch", new Object[] {_start,_stop,_pnl}));}
RDebugUtils.currentLine=59179008;
 //BA.debugLineNum = 59179008;BA.debugLine="Private Sub Touch (Start As Boolean, Stop As Boole";
RDebugUtils.currentLine=59179009;
 //BA.debugLineNum = 59179009;BA.debugLine="If pnl.GetView(0).Enabled = False Then Return";
if (_pnl.GetView((int) (0)).getEnabled()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=59179010;
 //BA.debugLineNum = 59179010;BA.debugLine="If Start Then";
if (_start) { 
RDebugUtils.currentLine=59179011;
 //BA.debugLineNum = 59179011;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,_pnl);};
RDebugUtils.currentLine=59179012;
 //BA.debugLineNum = 59179012;BA.debugLine="If pnl.Tag = True Then";
if ((_pnl.getTag()).equals((Object)(__c.True))) { 
RDebugUtils.currentLine=59179013;
 //BA.debugLineNum = 59179013;BA.debugLine="Increment";
__ref._increment /*String*/ (null);
RDebugUtils.currentLine=59179014;
 //BA.debugLineNum = 59179014;BA.debugLine="StartDownLoop(True)";
__ref._startdownloop /*void*/ (null,__c.True);
 }else {
RDebugUtils.currentLine=59179016;
 //BA.debugLineNum = 59179016;BA.debugLine="Decrement";
__ref._decrement /*String*/ (null);
RDebugUtils.currentLine=59179017;
 //BA.debugLineNum = 59179017;BA.debugLine="StartDownLoop(False)";
__ref._startdownloop /*void*/ (null,__c.False);
 };
 }else 
{RDebugUtils.currentLine=59179019;
 //BA.debugLineNum = 59179019;BA.debugLine="Else If Stop Then";
if (_stop) { 
RDebugUtils.currentLine=59179020;
 //BA.debugLineNum = 59179020;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
 }}
;
RDebugUtils.currentLine=59179022;
 //BA.debugLineNum = 59179022;BA.debugLine="End Sub";
return "";
}
public String  _setnumericrange(b4a.example.ef.b4xplusminus __ref,double _startrange,double _endrange,double _interval) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "setnumericrange", true))
	 {return ((String) Debug.delegate(ba, "setnumericrange", new Object[] {_startrange,_endrange,_interval}));}
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Public Sub SetNumericRange (StartRange As Double,";
RDebugUtils.currentLine=58654721;
 //BA.debugLineNum = 58654721;BA.debugLine="Size = Ceil((EndRange - StartRange) / Interval) +";
__ref._size /*int*/  = (int) (__c.Ceil((_endrange-_startrange)/(double)_interval)+1);
RDebugUtils.currentLine=58654722;
 //BA.debugLineNum = 58654722;BA.debugLine="mStartRange = StartRange";
__ref._mstartrange /*double*/  = _startrange;
RDebugUtils.currentLine=58654723;
 //BA.debugLineNum = 58654723;BA.debugLine="mEndRange = EndRange";
__ref._mendrange /*double*/  = _endrange;
RDebugUtils.currentLine=58654724;
 //BA.debugLineNum = 58654724;BA.debugLine="mInterval = Interval";
__ref._minterval /*double*/  = _interval;
RDebugUtils.currentLine=58654725;
 //BA.debugLineNum = 58654725;BA.debugLine="StringMode = False";
__ref._stringmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=58654726;
 //BA.debugLineNum = 58654726;BA.debugLine="SetIndex(0, False)";
__ref._setindex /*String*/ (null,(int) (0),__c.False);
RDebugUtils.currentLine=58654727;
 //BA.debugLineNum = 58654727;BA.debugLine="End Sub";
return "";
}
public String  _setselectedvalue(b4a.example.ef.b4xplusminus __ref,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "setselectedvalue", true))
	 {return ((String) Debug.delegate(ba, "setselectedvalue", new Object[] {_v}));}
double _n = 0;
RDebugUtils.currentLine=58785792;
 //BA.debugLineNum = 58785792;BA.debugLine="Public Sub setSelectedValue (v As Object)";
RDebugUtils.currentLine=58785793;
 //BA.debugLineNum = 58785793;BA.debugLine="If StringMode Then";
if (__ref._stringmode /*boolean*/ ) { 
RDebugUtils.currentLine=58785794;
 //BA.debugLineNum = 58785794;BA.debugLine="SetIndex(mStringItems.IndexOf(v), False)";
__ref._setindex /*String*/ (null,__ref._mstringitems /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_v),__c.False);
 }else {
RDebugUtils.currentLine=58785796;
 //BA.debugLineNum = 58785796;BA.debugLine="Dim n As Double = v";
_n = (double)(BA.ObjectToNumber(_v));
RDebugUtils.currentLine=58785797;
 //BA.debugLineNum = 58785797;BA.debugLine="SetIndex(Min(Size - 1, Max(0, Round((n - mStartR";
__ref._setindex /*String*/ (null,(int) (__c.Min(__ref._size /*int*/ -1,__c.Max(0,__c.Round((_n-__ref._mstartrange /*double*/ )/(double)__ref._minterval /*double*/ )))),__c.False);
 };
RDebugUtils.currentLine=58785799;
 //BA.debugLineNum = 58785799;BA.debugLine="End Sub";
return "";
}
public String  _setstringitems(b4a.example.ef.b4xplusminus __ref,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "setstringitems", true))
	 {return ((String) Debug.delegate(ba, "setstringitems", new Object[] {_list}));}
RDebugUtils.currentLine=58589184;
 //BA.debugLineNum = 58589184;BA.debugLine="Public Sub SetStringItems (list As List)";
RDebugUtils.currentLine=58589185;
 //BA.debugLineNum = 58589185;BA.debugLine="mStringItems = list";
__ref._mstringitems /*anywheresoftware.b4a.objects.collections.List*/  = _list;
RDebugUtils.currentLine=58589186;
 //BA.debugLineNum = 58589186;BA.debugLine="StringMode = True";
__ref._stringmode /*boolean*/  = __c.True;
RDebugUtils.currentLine=58589187;
 //BA.debugLineNum = 58589187;BA.debugLine="Size = mStringItems.Size";
__ref._size /*int*/  = __ref._mstringitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=58589188;
 //BA.debugLineNum = 58589188;BA.debugLine="SetIndex(-1, False)";
__ref._setindex /*String*/ (null,(int) (-1),__c.False);
RDebugUtils.currentLine=58589189;
 //BA.debugLineNum = 58589189;BA.debugLine="End Sub";
return "";
}
public void  _startdownloop(b4a.example.ef.b4xplusminus __ref,boolean _up) throws Exception{
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "startdownloop", true))
	 {Debug.delegate(ba, "startdownloop", new Object[] {_up}); return;}
ResumableSub_StartDownLoop rsub = new ResumableSub_StartDownLoop(this,__ref,_up);
rsub.resume(ba, null);
}
public static class ResumableSub_StartDownLoop extends BA.ResumableSub {
public ResumableSub_StartDownLoop(b4a.example.ef.b4xplusminus parent,b4a.example.ef.b4xplusminus __ref,boolean _up) {
this.parent = parent;
this.__ref = __ref;
this._up = _up;
this.__ref = parent;
}
b4a.example.ef.b4xplusminus __ref;
b4a.example.ef.b4xplusminus parent;
boolean _up;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xplusminus";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59244545;
 //BA.debugLineNum = 59244545;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=59244546;
 //BA.debugLineNum = 59244546;BA.debugLine="If mRapid = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._mrapid /*boolean*/ ==parent.__c.False) { 
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
RDebugUtils.currentLine=59244547;
 //BA.debugLineNum = 59244547;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref._loopindex /*int*/ ;
RDebugUtils.currentLine=59244548;
 //BA.debugLineNum = 59244548;BA.debugLine="Sleep(RapidPeriod1)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xplusminus", "startdownloop"),__ref._rapidperiod1 /*int*/ );
this.state = 19;
return;
case 19:
//C
this.state = 7;
;
RDebugUtils.currentLine=59244549;
 //BA.debugLineNum = 59244549;BA.debugLine="Do While MyIndex = LoopIndex";
if (true) break;

case 7:
//do while
this.state = 18;
while (_myindex==__ref._loopindex /*int*/ ) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=59244550;
 //BA.debugLineNum = 59244550;BA.debugLine="If Up Then Increment Else Decrement";
if (true) break;

case 10:
//if
this.state = 17;
if (_up) { 
this.state = 12;
;}
else {
this.state = 14;
;}if (true) break;

case 12:
//C
this.state = 17;
__ref._increment /*String*/ (null);
if (true) break;

case 14:
//C
this.state = 17;
__ref._decrement /*String*/ (null);
if (true) break;

case 17:
//C
this.state = 7;
;
RDebugUtils.currentLine=59244551;
 //BA.debugLineNum = 59244551;BA.debugLine="Sleep(RapidPeriod2)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xplusminus", "startdownloop"),__ref._rapidperiod2 /*int*/ );
this.state = 20;
return;
case 20:
//C
this.state = 7;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=59244553;
 //BA.debugLineNum = 59244553;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}