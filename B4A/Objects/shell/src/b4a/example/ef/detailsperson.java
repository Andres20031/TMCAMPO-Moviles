
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class detailsperson {
    public static RemoteObject myClass;
	public detailsperson() {
	}
    public static PCBA staticBA = new PCBA(null, detailsperson.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _utilclass = RemoteObject.declareNull("b4a.example.ef.util");
public static RemoteObject _nameperson = RemoteObject.createImmutable("");
public static RemoteObject _idpersona = RemoteObject.createImmutable("");
public static RemoteObject _clv_persons = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _label20desc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _button1check = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button2del = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _rdclink = RemoteObject.createImmutable("");
public static RemoteObject _sf = RemoteObject.declareNull("ADR.stringdemo.stringfunctions");
public static RemoteObject _sf2 = RemoteObject.declareNull("ADR.stringdemo.stringfunctions");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Button1Check",_ref.getField(false, "_button1check"),"Button2Del",_ref.getField(false, "_button2del"),"CLV_Persons",_ref.getField(false, "_clv_persons"),"DateUtils",_ref.getField(false, "_dateutils"),"idPersona",_ref.getField(false, "_idpersona"),"Label20Desc",_ref.getField(false, "_label20desc"),"Label3",_ref.getField(false, "_label3"),"namePerson",_ref.getField(false, "_nameperson"),"rdcLink",_ref.getField(false, "_rdclink"),"Root",_ref.getField(false, "_root"),"sf",_ref.getField(false, "_sf"),"sf2",_ref.getField(false, "_sf2"),"utilClass",_ref.getField(false, "_utilclass"),"xui",_ref.getField(false, "_xui")};
}
}