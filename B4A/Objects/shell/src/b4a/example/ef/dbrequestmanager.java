
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class dbrequestmanager {
    public static RemoteObject myClass;
	public dbrequestmanager() {
	}
    public static PCBA staticBA = new PCBA(null, dbrequestmanager.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mtarget = RemoteObject.declareNull("Object");
public static RemoteObject _link = RemoteObject.createImmutable("");
public static RemoteObject _version = RemoteObject.createImmutable(0f);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"link",_ref.getField(false, "_link"),"mTarget",_ref.getField(false, "_mtarget"),"VERSION",_ref.getField(false, "_version")};
}
}