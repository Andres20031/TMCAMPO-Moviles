
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xloadingindicator {
    public static RemoteObject myClass;
	public b4xloadingindicator() {
	}
    public static PCBA staticBA = new PCBA(null, b4xloadingindicator.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _clr = RemoteObject.createImmutable(0);
public static RemoteObject _index = RemoteObject.createImmutable(0);
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _duration = RemoteObject.createImmutable(0);
public static RemoteObject _drawingsubname = RemoteObject.createImmutable("");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"clr",_ref.getField(false, "_clr"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"DrawingSubName",_ref.getField(false, "_drawingsubname"),"duration",_ref.getField(false, "_duration"),"index",_ref.getField(false, "_index"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}