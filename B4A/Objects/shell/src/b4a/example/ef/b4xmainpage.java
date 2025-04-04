
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _utilclass = RemoteObject.declareNull("b4a.example.ef.util");
public static RemoteObject _edittext2pass = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittext1mail = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _menu_c = RemoteObject.declareNull("b4a.example.ef.menu");
public static RemoteObject _listperson_c = RemoteObject.declareNull("b4a.example.ef.listperson");
public static RemoteObject _detailsperson_c = RemoteObject.declareNull("b4a.example.ef.detailsperson");
public static RemoteObject _formperson_c = RemoteObject.declareNull("b4a.example.ef.formperson");
public static RemoteObject _form_c = RemoteObject.declareNull("b4a.example.ef.form");
public static RemoteObject _listdados_c = RemoteObject.declareNull("b4a.example.ef.listdados");
public static RemoteObject _formmaquinaria_c = RemoteObject.declareNull("b4a.example.ef.formmaquinaria");
public static RemoteObject _formprecipitacion_c = RemoteObject.declareNull("b4a.example.ef.formprecipitacion");
public static RemoteObject _formlabores_c = RemoteObject.declareNull("b4a.example.ef.formlabores");
public static RemoteObject _listlabores_c = RemoteObject.declareNull("b4a.example.ef.listlabores");
public static RemoteObject _formprogramacampo_c = RemoteObject.declareNull("b4a.example.ef.formprogramacampo");
public static RemoteObject _formprogramacampocancelar_c = RemoteObject.declareNull("b4a.example.ef.formprogramacampocancelar");
public static RemoteObject _formprogramacampoaplazar_c = RemoteObject.declareNull("b4a.example.ef.formprogramacampoaplazar");
public static RemoteObject _editperson_c = RemoteObject.declareNull("b4a.example.ef.editperson");
public static RemoteObject _rdclink = RemoteObject.createImmutable("");
public static RemoteObject _parametrosusuario = RemoteObject.createImmutable("");
public static RemoteObject _sf = RemoteObject.declareNull("ADR.stringdemo.stringfunctions");
public static RemoteObject _panel1precipitacion2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlprograma_de_labores = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlprecipitacion = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlcosecha = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnltaller = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlpersonal = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlmaquinaria = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"DetailsPerson_C",_ref.getField(false, "_detailsperson_c"),"EditPerson_C",_ref.getField(false, "_editperson_c"),"EditText1Mail",_ref.getField(false, "_edittext1mail"),"EditText2Pass",_ref.getField(false, "_edittext2pass"),"Form_C",_ref.getField(false, "_form_c"),"FormLabores_C",_ref.getField(false, "_formlabores_c"),"FormMaquinaria_C",_ref.getField(false, "_formmaquinaria_c"),"FormPerson_C",_ref.getField(false, "_formperson_c"),"FormPrecipitacion_C",_ref.getField(false, "_formprecipitacion_c"),"FormProgramaCampo_C",_ref.getField(false, "_formprogramacampo_c"),"FormProgramaCampoAplazar_C",_ref.getField(false, "_formprogramacampoaplazar_c"),"FormProgramaCampoCancelar_C",_ref.getField(false, "_formprogramacampocancelar_c"),"listDados_C",_ref.getField(false, "_listdados_c"),"ListLabores_C",_ref.getField(false, "_listlabores_c"),"ListPerson_C",_ref.getField(false, "_listperson_c"),"menu_C",_ref.getField(false, "_menu_c"),"Panel1Precipitacion2",_ref.getField(false, "_panel1precipitacion2"),"parametrosUsuario",_ref.getField(false, "_parametrosusuario"),"pnlCosecha",_ref.getField(false, "_pnlcosecha"),"PnlMaquinaria",_ref.getField(false, "_pnlmaquinaria"),"pnlPersonal",_ref.getField(false, "_pnlpersonal"),"pnlPrecipitacion",_ref.getField(false, "_pnlprecipitacion"),"pnlPrograma_de_labores",_ref.getField(false, "_pnlprograma_de_labores"),"pnlTaller",_ref.getField(false, "_pnltaller"),"rdcLink",_ref.getField(false, "_rdclink"),"Root",_ref.getField(false, "_root"),"sf",_ref.getField(false, "_sf"),"utilClass",_ref.getField(false, "_utilclass"),"xui",_ref.getField(false, "_xui")};
}
}