
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xtimedtemplate {
    public static RemoteObject myClass;
	public b4xtimedtemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xtimedtemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _anotherprogressbar1 = RemoteObject.declareNull("b4a.example.ef.anotherprogressbar");
public static RemoteObject _mtemplate = RemoteObject.declareNull("Object");
public static RemoteObject _timeoutmilliseconds = RemoteObject.createImmutable(0);
public static RemoteObject _index = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AnotherProgressBar1",_ref.getField(false, "_anotherprogressbar1"),"DateUtils",_ref.getField(false, "_dateutils"),"Index",_ref.getField(false, "_index"),"mBase",_ref.getField(false, "_mbase"),"mTemplate",_ref.getField(false, "_mtemplate"),"TimeoutMilliseconds",_ref.getField(false, "_timeoutmilliseconds"),"xui",_ref.getField(false, "_xui")};
}
}