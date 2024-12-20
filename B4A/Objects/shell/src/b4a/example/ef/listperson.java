
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class listperson {
    public static RemoteObject myClass;
	public listperson() {
	}
    public static PCBA staticBA = new PCBA(null, listperson.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _utilclass = RemoteObject.declareNull("b4a.example.ef.util");
public static RemoteObject _clv_persons = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _label20name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _anotherprogressbar1dias_reportados = RemoteObject.declareNull("b4a.example.ef.b4xprogressbar");
public static RemoteObject _anotherprogressbar2horas_extras = RemoteObject.declareNull("b4a.example.ef.b4xprogressbar");
public static RemoteObject _rdclink = RemoteObject.createImmutable("");
public static RemoteObject _sf = RemoteObject.declareNull("ADR.stringdemo.stringfunctions");
public static RemoteObject _gifviewerloading = RemoteObject.declareNull("b4a.example.ef.gifviewer");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AnotherProgressBar1Dias_reportados",_ref.getField(false, "_anotherprogressbar1dias_reportados"),"AnotherProgressBar2Horas_Extras",_ref.getField(false, "_anotherprogressbar2horas_extras"),"CLV_Persons",_ref.getField(false, "_clv_persons"),"DateUtils",_ref.getField(false, "_dateutils"),"GifViewerLoading",_ref.getField(false, "_gifviewerloading"),"Label20Name",_ref.getField(false, "_label20name"),"rdcLink",_ref.getField(false, "_rdclink"),"Root",_ref.getField(false, "_root"),"sf",_ref.getField(false, "_sf"),"utilClass",_ref.getField(false, "_utilclass"),"xui",_ref.getField(false, "_xui")};
}
}