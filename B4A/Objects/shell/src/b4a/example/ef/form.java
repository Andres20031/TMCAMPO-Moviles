
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class form {
    public static RemoteObject myClass;
	public form() {
	}
    public static PCBA staticBA = new PCBA(null, form.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _nitupdate = RemoteObject.createImmutable("");
public static RemoteObject _haciendaupdate = RemoteObject.createImmutable("");
public static RemoteObject _idmaquina = RemoteObject.createImmutable(0);
public static RemoteObject _tipo = RemoteObject.createImmutable("");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _datepicker = RemoteObject.declareNull("lib.intellvold.datepicker.DatePicker");
public static RemoteObject _mycalendar = RemoteObject.declareNull("lib.intellvold.datepicker.clander");
public static RemoteObject _timepicker = RemoteObject.declareNull("lib.intellvold.datepicker.TimePicker");
public static RemoteObject _datepicker2 = RemoteObject.declareNull("lib.intellvold.datepicker.DatePicker");
public static RemoteObject _mycalendar2 = RemoteObject.declareNull("lib.intellvold.datepicker.clander");
public static RemoteObject _utilclass = RemoteObject.declareNull("b4a.example.ef.util");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panel3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _spinnernit = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _edittext2area = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittext1cmb = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _label13time = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edittext2horafim = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittext1horainicio = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _nit = RemoteObject.createImmutable("");
public static RemoteObject _hacienda = RemoteObject.createImmutable("");
public static RemoteObject _lote = RemoteObject.createImmutable("");
public static RemoteObject _rdclink = RemoteObject.createImmutable("");
public static RemoteObject _customlistview1geral = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _panel1geral = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label14add = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _button1addisumo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _label1removeinsumo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label1empty = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label2insumoname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edittext2qntinsumo = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _spinner1nameinsumo = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _intcontadorinsumos = RemoteObject.createImmutable(0);
public static RemoteObject _sd_xcomboboxnit = RemoteObject.declareNull("b4a.example.ef.sd_xcombobox");
public static RemoteObject _sd_xcomboboxhda = RemoteObject.declareNull("b4a.example.ef.sd_xcombobox");
public static RemoteObject _sd_xcomboboxlote = RemoteObject.declareNull("b4a.example.ef.sd_xcombobox");
public static RemoteObject _sd_xcomboboxlabor = RemoteObject.declareNull("b4a.example.ef.sd_xcombobox");
public static RemoteObject _sd_xcomboboxelegasto = RemoteObject.declareNull("b4a.example.ef.sd_xcombobox");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Button1AddIsumo",_ref.getField(false, "_button1addisumo"),"CustomListView1Geral",_ref.getField(false, "_customlistview1geral"),"Datepicker",_ref.getField(false, "_datepicker"),"Datepicker2",_ref.getField(false, "_datepicker2"),"DateUtils",_ref.getField(false, "_dateutils"),"EditText1cmb",_ref.getField(false, "_edittext1cmb"),"EditText1HoraInicio",_ref.getField(false, "_edittext1horainicio"),"EditText2area",_ref.getField(false, "_edittext2area"),"EditText2HoraFim",_ref.getField(false, "_edittext2horafim"),"EditText2QntInsumo",_ref.getField(false, "_edittext2qntinsumo"),"hacienda",_ref.getField(false, "_hacienda"),"haciendaUpdate",_ref.getField(false, "_haciendaupdate"),"idMaquina",_ref.getField(false, "_idmaquina"),"intContadorInsumos",_ref.getField(false, "_intcontadorinsumos"),"Label10",_ref.getField(false, "_label10"),"Label13Time",_ref.getField(false, "_label13time"),"Label14Add",_ref.getField(false, "_label14add"),"Label1Empty",_ref.getField(false, "_label1empty"),"Label1RemoveInsumo",_ref.getField(false, "_label1removeinsumo"),"Label2InsumoName",_ref.getField(false, "_label2insumoname"),"lote",_ref.getField(false, "_lote"),"Mycalendar",_ref.getField(false, "_mycalendar"),"Mycalendar2",_ref.getField(false, "_mycalendar2"),"nit",_ref.getField(false, "_nit"),"nitUpdate",_ref.getField(false, "_nitupdate"),"Panel1",_ref.getField(false, "_panel1"),"Panel1geral",_ref.getField(false, "_panel1geral"),"Panel3",_ref.getField(false, "_panel3"),"rdcLink",_ref.getField(false, "_rdclink"),"Root",_ref.getField(false, "_root"),"ScrollView1",_ref.getField(false, "_scrollview1"),"SD_xComboBoxEleGasto",_ref.getField(false, "_sd_xcomboboxelegasto"),"SD_xComboBoxHda",_ref.getField(false, "_sd_xcomboboxhda"),"SD_xComboBoxLabor",_ref.getField(false, "_sd_xcomboboxlabor"),"SD_xComboBoxLote",_ref.getField(false, "_sd_xcomboboxlote"),"SD_xComboBoxNit",_ref.getField(false, "_sd_xcomboboxnit"),"Spinner1NameInsumo",_ref.getField(false, "_spinner1nameinsumo"),"SpinnerNit",_ref.getField(false, "_spinnernit"),"Timepicker",_ref.getField(false, "_timepicker"),"tipo",_ref.getField(false, "_tipo"),"utilClass",_ref.getField(false, "_utilclass"),"xui",_ref.getField(false, "_xui")};
}
}