
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class formprogramacampo {
    public static RemoteObject myClass;
	public formprogramacampo() {
	}
    public static PCBA staticBA = new PCBA(null, formprogramacampo.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _label8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _rdclink = RemoteObject.createImmutable("");
public static RemoteObject _panel7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _miconsecutivo = RemoteObject.createImmutable("");
public static RemoteObject _fechainicio = RemoteObject.createImmutable("");
public static RemoteObject _fechafin = RemoteObject.createImmutable("");
public static RemoteObject _area = RemoteObject.createImmutable("");
public static RemoteObject _observacion = RemoteObject.createImmutable("");
public static RemoteObject _panel8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label11 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _sf = RemoteObject.declareNull("ADR.stringdemo.stringfunctions");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"area",_ref.getField(false, "_area"),"DateUtils",_ref.getField(false, "_dateutils"),"fechaFin",_ref.getField(false, "_fechafin"),"fechaInicio",_ref.getField(false, "_fechainicio"),"Label11",_ref.getField(false, "_label11"),"Label8",_ref.getField(false, "_label8"),"Label9",_ref.getField(false, "_label9"),"MiConsecutivo",_ref.getField(false, "_miconsecutivo"),"Observacion",_ref.getField(false, "_observacion"),"Panel7",_ref.getField(false, "_panel7"),"Panel8",_ref.getField(false, "_panel8"),"rdcLink",_ref.getField(false, "_rdclink"),"Root",_ref.getField(false, "_root"),"sf",_ref.getField(false, "_sf"),"xui",_ref.getField(false, "_xui")};
}
}