
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class listlabores {
    public static RemoteObject myClass;
	public listlabores() {
	}
    public static PCBA staticBA = new PCBA(null, listlabores.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _utilclass = RemoteObject.declareNull("b4a.example.ef.util");
public static RemoteObject _gifviewerloading = RemoteObject.declareNull("b4a.example.ef.gifviewer");
public static RemoteObject _clv_labores = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _rdclink = RemoteObject.createImmutable("");
public static RemoteObject _labellabores = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buttongrabar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttoncancelar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonaplazar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _sf = RemoteObject.declareNull("ADR.stringdemo.stringfunctions");
public static RemoteObject _consecutivoseleccionado = RemoteObject.createImmutable("");
public static RemoteObject _consecutivoseleccionadocancelar = RemoteObject.createImmutable("");
public static RemoteObject _conse = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ButtonAplazar",_ref.getField(false, "_buttonaplazar"),"ButtonCancelar",_ref.getField(false, "_buttoncancelar"),"ButtonGrabar",_ref.getField(false, "_buttongrabar"),"CLV_Labores",_ref.getField(false, "_clv_labores"),"Conse",_ref.getField(false, "_conse"),"ConsecutivoSeleccionado",_ref.getField(false, "_consecutivoseleccionado"),"ConsecutivoSeleccionadoCancelar",_ref.getField(false, "_consecutivoseleccionadocancelar"),"DateUtils",_ref.getField(false, "_dateutils"),"GifViewerLoading",_ref.getField(false, "_gifviewerloading"),"LabelLabores",_ref.getField(false, "_labellabores"),"rdcLink",_ref.getField(false, "_rdclink"),"Root",_ref.getField(false, "_root"),"sf",_ref.getField(false, "_sf"),"utilClass",_ref.getField(false, "_utilclass"),"xui",_ref.getField(false, "_xui")};
}
}