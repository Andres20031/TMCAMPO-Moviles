
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xbitset {
    public static RemoteObject myClass;
	public b4xbitset() {
	}
    public static PCBA staticBA = new PCBA(null, b4xbitset.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _data = null;
public static RemoteObject _msize = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"data",_ref.getField(false, "_data"),"DateUtils",_ref.getField(false, "_dateutils"),"mSize",_ref.getField(false, "_msize")};
}
}