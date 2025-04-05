
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class editperson {
    public static RemoteObject myClass;
	public editperson() {
	}
    public static PCBA staticBA = new PCBA(null, editperson.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _utilclass = RemoteObject.declareNull("b4a.example.ef.util");
public static RemoteObject _rdclink = RemoteObject.createImmutable("");
public static RemoteObject _clv_editar = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _fecha = RemoteObject.createImmutable("");
public static RemoteObject _label12fecha = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buttonbuscar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panel12 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _as_datepicker1 = RemoteObject.declareNull("b4a.example.ef.as_datepicker");
public static RemoteObject _paneledit = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _customlistview1geral = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _labellabores = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buttongrabar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttoncancelar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AS_DatePicker1",_ref.getField(false, "_as_datepicker1"),"ButtonBuscar",_ref.getField(false, "_buttonbuscar"),"ButtonCancelar",_ref.getField(false, "_buttoncancelar"),"ButtonGrabar",_ref.getField(false, "_buttongrabar"),"CLV_Editar",_ref.getField(false, "_clv_editar"),"CustomListView1Geral",_ref.getField(false, "_customlistview1geral"),"DateUtils",_ref.getField(false, "_dateutils"),"Fecha",_ref.getField(false, "_fecha"),"Label12Fecha",_ref.getField(false, "_label12fecha"),"LabelLabores",_ref.getField(false, "_labellabores"),"Panel12",_ref.getField(false, "_panel12"),"PanelEdit",_ref.getField(false, "_paneledit"),"rdcLink",_ref.getField(false, "_rdclink"),"Root",_ref.getField(false, "_root"),"utilClass",_ref.getField(false, "_utilclass"),"xui",_ref.getField(false, "_xui")};
}
}