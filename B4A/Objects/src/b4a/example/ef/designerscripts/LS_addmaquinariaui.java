package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_addmaquinariaui{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 1;BA.debugLine="AutoScaleAll"[addMaquinariaUI/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 2;BA.debugLine="Label1.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 3;BA.debugLine="Panel3.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("panel3").vw.setLeft((int)((2d / 100 * width)));
views.get("panel3").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 4;BA.debugLine="SD_xComboBoxMaquina.SetLeftAndRight(1%x,91%x)"[addMaquinariaUI/General script]
views.get("sd_xcomboboxmaquina").vw.setLeft((int)((1d / 100 * width)));
views.get("sd_xcomboboxmaquina").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 6;BA.debugLine="Label4.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("label4").vw.setLeft((int)((2d / 100 * width)));
views.get("label4").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 7;BA.debugLine="Panel4.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("panel4").vw.setLeft((int)((2d / 100 * width)));
views.get("panel4").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="SD_xComboBoxLabor.SetLeftAndRight(1%x,91%x)"[addMaquinariaUI/General script]
views.get("sd_xcomboboxlabor").vw.setLeft((int)((1d / 100 * width)));
views.get("sd_xcomboboxlabor").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="Label7.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("label7").vw.setLeft((int)((2d / 100 * width)));
views.get("label7").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 11;BA.debugLine="Panel5.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("panel5").vw.setLeft((int)((2d / 100 * width)));
views.get("panel5").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 12;BA.debugLine="SD_xComboBoxNit.SetLeftAndRight(1%x,91%x)"[addMaquinariaUI/General script]
views.get("sd_xcomboboxnit").vw.setLeft((int)((1d / 100 * width)));
views.get("sd_xcomboboxnit").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 14;BA.debugLine="Label3.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("label3").vw.setLeft((int)((2d / 100 * width)));
views.get("label3").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 15;BA.debugLine="Panel6.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("panel6").vw.setLeft((int)((2d / 100 * width)));
views.get("panel6").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 16;BA.debugLine="SD_xComboBoxHacienda.SetLeftAndRight(1%x,91%x)"[addMaquinariaUI/General script]
views.get("sd_xcomboboxhacienda").vw.setLeft((int)((1d / 100 * width)));
views.get("sd_xcomboboxhacienda").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 18;BA.debugLine="Label5.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("label5").vw.setLeft((int)((2d / 100 * width)));
views.get("label5").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 19;BA.debugLine="Panel1.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("panel1").vw.setLeft((int)((2d / 100 * width)));
views.get("panel1").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 20;BA.debugLine="SD_xComboBoxLote.SetLeftAndRight(1%x,91%x)"[addMaquinariaUI/General script]
views.get("sd_xcomboboxlote").vw.setLeft((int)((1d / 100 * width)));
views.get("sd_xcomboboxlote").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 22;BA.debugLine="Label6.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("label6").vw.setLeft((int)((2d / 100 * width)));
views.get("label6").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 23;BA.debugLine="Panel2.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("panel2").vw.setLeft((int)((2d / 100 * width)));
views.get("panel2").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 24;BA.debugLine="SD_xComboBoxImplemento.SetLeftAndRight(1%x,91%x)"[addMaquinariaUI/General script]
views.get("sd_xcomboboximplemento").vw.setLeft((int)((1d / 100 * width)));
views.get("sd_xcomboboximplemento").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 26;BA.debugLine="Label12.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("label12").vw.setLeft((int)((2d / 100 * width)));
views.get("label12").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 27;BA.debugLine="Panel9.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("panel9").vw.setLeft((int)((2d / 100 * width)));
views.get("panel9").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 28;BA.debugLine="SD_xComboBoxImplemento2.SetLeftAndRight(1%x,91%x)"[addMaquinariaUI/General script]
views.get("sd_xcomboboximplemento2").vw.setLeft((int)((1d / 100 * width)));
views.get("sd_xcomboboximplemento2").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 30;BA.debugLine="Label12.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("label12").vw.setLeft((int)((2d / 100 * width)));
views.get("label12").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 31;BA.debugLine="Panel9.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("panel9").vw.setLeft((int)((2d / 100 * width)));
views.get("panel9").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 32;BA.debugLine="SD_xComboBoxImplemento2.SetLeftAndRight(1%x,91%x)"[addMaquinariaUI/General script]
views.get("sd_xcomboboximplemento2").vw.setLeft((int)((1d / 100 * width)));
views.get("sd_xcomboboximplemento2").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 34;BA.debugLine="Label10.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("label10").vw.setLeft((int)((2d / 100 * width)));
views.get("label10").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 35;BA.debugLine="Panel7.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("panel7").vw.setLeft((int)((2d / 100 * width)));
views.get("panel7").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 36;BA.debugLine="SD_xComboBoxOperario.SetLeftAndRight(1%x,91%x)"[addMaquinariaUI/General script]
views.get("sd_xcomboboxoperario").vw.setLeft((int)((1d / 100 * width)));
views.get("sd_xcomboboxoperario").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 38;BA.debugLine="Label11.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("label11").vw.setLeft((int)((2d / 100 * width)));
views.get("label11").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 39;BA.debugLine="Panel8.SetLeftAndRight(2%x,94%x)"[addMaquinariaUI/General script]
views.get("panel8").vw.setLeft((int)((2d / 100 * width)));
views.get("panel8").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 40;BA.debugLine="SD_xComboBoxObservaciones.SetLeftAndRight(1%x,91%x)"[addMaquinariaUI/General script]
views.get("sd_xcomboboxobservaciones").vw.setLeft((int)((1d / 100 * width)));
views.get("sd_xcomboboxobservaciones").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 43;BA.debugLine="Label2.SetLeftAndRight(4%x,48%x)"[addMaquinariaUI/General script]
views.get("label2").vw.setLeft((int)((4d / 100 * width)));
views.get("label2").vw.setWidth((int)((48d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 44;BA.debugLine="Panel2Time.SetLeftAndRight(4%x,48%x)"[addMaquinariaUI/General script]
views.get("panel2time").vw.setLeft((int)((4d / 100 * width)));
views.get("panel2time").vw.setWidth((int)((48d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 46;BA.debugLine="Label9.SetLeftAndRight(4%x,48%x)"[addMaquinariaUI/General script]
views.get("label9").vw.setLeft((int)((4d / 100 * width)));
views.get("label9").vw.setWidth((int)((48d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 47;BA.debugLine="Label8.SetLeftAndRight(52%x,96%x)"[addMaquinariaUI/General script]
views.get("label8").vw.setLeft((int)((52d / 100 * width)));
views.get("label8").vw.setWidth((int)((96d / 100 * width) - ((52d / 100 * width))));
//BA.debugLineNum = 48;BA.debugLine="Label13.SetLeftAndRight(4%x,48%x)"[addMaquinariaUI/General script]
views.get("label13").vw.setLeft((int)((4d / 100 * width)));
views.get("label13").vw.setWidth((int)((48d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 49;BA.debugLine="Label14.SetLeftAndRight(52%x,96%x)"[addMaquinariaUI/General script]
views.get("label14").vw.setLeft((int)((52d / 100 * width)));
views.get("label14").vw.setWidth((int)((96d / 100 * width) - ((52d / 100 * width))));
//BA.debugLineNum = 50;BA.debugLine="Panel11horaFim.SetLeftAndRight(52%x,96%x)"[addMaquinariaUI/General script]
views.get("panel11horafim").vw.setLeft((int)((52d / 100 * width)));
views.get("panel11horafim").vw.setWidth((int)((96d / 100 * width) - ((52d / 100 * width))));
//BA.debugLineNum = 51;BA.debugLine="Panel10Horainicio.SetLeftAndRight(4%x,48%x)"[addMaquinariaUI/General script]
views.get("panel10horainicio").vw.setLeft((int)((4d / 100 * width)));
views.get("panel10horainicio").vw.setWidth((int)((48d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 52;BA.debugLine="Panel10.SetLeftAndRight(4%x,48%x)"[addMaquinariaUI/General script]
views.get("panel10").vw.setLeft((int)((4d / 100 * width)));
views.get("panel10").vw.setWidth((int)((48d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 53;BA.debugLine="Panel11.SetLeftAndRight(52%x,96%x)"[addMaquinariaUI/General script]
views.get("panel11").vw.setLeft((int)((52d / 100 * width)));
views.get("panel11").vw.setWidth((int)((96d / 100 * width) - ((52d / 100 * width))));

}
}