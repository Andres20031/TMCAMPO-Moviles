
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class menu {
    public static RemoteObject myClass;
	public menu() {
	}
    public static PCBA staticBA = new PCBA(null, menu.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _panel1precipitacion2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlprograma_de_labores = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlprecipitacion = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlcosecha = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnltaller = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlpersonal = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlmaquinaria = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _utilclass = RemoteObject.declareNull("b4a.example.ef.util");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"Panel1Precipitacion2",_ref.getField(false, "_panel1precipitacion2"),"pnlCosecha",_ref.getField(false, "_pnlcosecha"),"PnlMaquinaria",_ref.getField(false, "_pnlmaquinaria"),"pnlPersonal",_ref.getField(false, "_pnlpersonal"),"pnlPrecipitacion",_ref.getField(false, "_pnlprecipitacion"),"pnlPrograma_de_labores",_ref.getField(false, "_pnlprograma_de_labores"),"pnlTaller",_ref.getField(false, "_pnltaller"),"Root",_ref.getField(false, "_root"),"utilClass",_ref.getField(false, "_utilclass"),"xui",_ref.getField(false, "_xui")};
}
}