
package b4a.example.ef;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.ef.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _actionbarhomeclicked = RemoteObject.createImmutable(false);
public static RemoteObject _rdclink = RemoteObject.createImmutable("");
public static RemoteObject _puser = RemoteObject.createImmutable("");
public static RemoteObject _ppassword = RemoteObject.createImmutable("");
public static RemoteObject _pdbname = RemoteObject.createImmutable("");
public static RemoteObject _pempresa = RemoteObject.createImmutable("");
public static RemoteObject _pdbnameseguridad = RemoteObject.createImmutable("");
public static RemoteObject _pnit = RemoteObject.createImmutable("");
public static RemoteObject _puseractivo = RemoteObject.createImmutable("");
public static RemoteObject _puseropcionlabores = RemoteObject.createImmutable("");
public static RemoteObject _puseropcionagenda = RemoteObject.createImmutable("");
public static RemoteObject _puseropcionmaquinaria = RemoteObject.createImmutable("");
public static RemoteObject _puseropcionpluviometros = RemoteObject.createImmutable("");
public static RemoteObject _puseropcionmonotoreo = RemoteObject.createImmutable("");
public static RemoteObject _gifscache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _consecutivolaboresglobal = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"ActionBarHomeClicked",main._actionbarhomeclicked,"Activity",main.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.example.ef.b4xcollections.class),"B4XPages",Debug.moduleToString(b4a.example.ef.b4xpages.class),"consecutivoLaboresGlobal",main._consecutivolaboresglobal,"DateUtils",main.mostCurrent._dateutils,"GifsCache",main._gifscache,"HttpUtils2Service",Debug.moduleToString(b4a.example.ef.httputils2service.class),"pDBName",main._pdbname,"pDBNameSeguridad",main._pdbnameseguridad,"pEmpresa",main._pempresa,"pNit",main._pnit,"pPassword",main._ppassword,"pUser",main._puser,"puserActivo",main._puseractivo,"pUserOpcionAgenda",main._puseropcionagenda,"pUserOpcionLabores",main._puseropcionlabores,"pUserOpcionMaquinaria",main._puseropcionmaquinaria,"pUserOpcionMonotoreo",main._puseropcionmonotoreo,"pUserOpcionPluviometros",main._puseropcionpluviometros,"rdcLink",main._rdclink,"Starter",Debug.moduleToString(b4a.example.ef.starter.class),"XUIViewsUtils",Debug.moduleToString(b4a.example.ef.xuiviewsutils.class)};
}
}