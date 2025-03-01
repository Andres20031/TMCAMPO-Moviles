package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_addlaboresui{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 1;BA.debugLine="AutoScaleAll"[addLaboresUI/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 2;BA.debugLine="Label1.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 4;BA.debugLine="Label4.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("label4").vw.setLeft((int)((2d / 100 * width)));
views.get("label4").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 5;BA.debugLine="Panel4.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("panel4").vw.setLeft((int)((2d / 100 * width)));
views.get("panel4").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 6;BA.debugLine="SwiftButtonLabor.SetLeftAndRight(1%x,91%x)"[addLaboresUI/General script]
views.get("swiftbuttonlabor").vw.setLeft((int)((1d / 100 * width)));
views.get("swiftbuttonlabor").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="Label7.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("label7").vw.setLeft((int)((2d / 100 * width)));
views.get("label7").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 9;BA.debugLine="Panel5.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("panel5").vw.setLeft((int)((2d / 100 * width)));
views.get("panel5").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="SwiftButtonNit.SetLeftAndRight(1%x,91.5%x)"[addLaboresUI/General script]
views.get("swiftbuttonnit").vw.setLeft((int)((1d / 100 * width)));
views.get("swiftbuttonnit").vw.setWidth((int)((91.5d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 12;BA.debugLine="Label3.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("label3").vw.setLeft((int)((2d / 100 * width)));
views.get("label3").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 13;BA.debugLine="Panel6.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("panel6").vw.setLeft((int)((2d / 100 * width)));
views.get("panel6").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 14;BA.debugLine="SwiftButtonHacienda.SetLeftAndRight(1%x,91%x)"[addLaboresUI/General script]
views.get("swiftbuttonhacienda").vw.setLeft((int)((1d / 100 * width)));
views.get("swiftbuttonhacienda").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 16;BA.debugLine="Label5.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("label5").vw.setLeft((int)((2d / 100 * width)));
views.get("label5").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 17;BA.debugLine="Panel1.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("panel1").vw.setLeft((int)((2d / 100 * width)));
views.get("panel1").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 18;BA.debugLine="SwiftButtonLote.SetLeftAndRight(1%x,91%x)"[addLaboresUI/General script]
views.get("swiftbuttonlote").vw.setLeft((int)((1d / 100 * width)));
views.get("swiftbuttonlote").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 20;BA.debugLine="Label1.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 21;BA.debugLine="Panel2.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("panel2").vw.setLeft((int)((2d / 100 * width)));
views.get("panel2").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 22;BA.debugLine="SwiftButtonElemento.SetLeftAndRight(1%x,91%x)"[addLaboresUI/General script]
views.get("swiftbuttonelemento").vw.setLeft((int)((1d / 100 * width)));
views.get("swiftbuttonelemento").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 24;BA.debugLine="Label8.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("label8").vw.setLeft((int)((2d / 100 * width)));
views.get("label8").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 25;BA.debugLine="Panel7.SetLeftAndRight(2%x,94%x)"[addLaboresUI/General script]
views.get("panel7").vw.setLeft((int)((2d / 100 * width)));
views.get("panel7").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 26;BA.debugLine="SwiftButtonTypeForm.SetLeftAndRight(1%x,91%x)"[addLaboresUI/General script]
views.get("swiftbuttontypeform").vw.setLeft((int)((1d / 100 * width)));
views.get("swiftbuttontypeform").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 30;BA.debugLine="Label2.SetLeftAndRight(2%x,48%x)"[addLaboresUI/General script]
views.get("label2").vw.setLeft((int)((2d / 100 * width)));
views.get("label2").vw.setWidth((int)((48d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 31;BA.debugLine="Panel2Time.SetLeftAndRight(2%x,48%x)"[addLaboresUI/General script]
views.get("panel2time").vw.setLeft((int)((2d / 100 * width)));
views.get("panel2time").vw.setWidth((int)((48d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 33;BA.debugLine="Label6.SetLeftAndRight(50%x, 96%x)"[addLaboresUI/General script]
views.get("label6").vw.setLeft((int)((50d / 100 * width)));
views.get("label6").vw.setWidth((int)((96d / 100 * width) - ((50d / 100 * width))));
//BA.debugLineNum = 34;BA.debugLine="Panel3Time.SetLeftAndRight(50%x, 96%x)"[addLaboresUI/General script]
views.get("panel3time").vw.setLeft((int)((50d / 100 * width)));
views.get("panel3time").vw.setWidth((int)((96d / 100 * width) - ((50d / 100 * width))));
//BA.debugLineNum = 37;BA.debugLine="Label13.SetLeftAndRight(2%x,48%x)"[addLaboresUI/General script]
views.get("label13").vw.setLeft((int)((2d / 100 * width)));
views.get("label13").vw.setWidth((int)((48d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 38;BA.debugLine="Label14.SetLeftAndRight(50%x,94%x)"[addLaboresUI/General script]
views.get("label14").vw.setLeft((int)((50d / 100 * width)));
views.get("label14").vw.setWidth((int)((94d / 100 * width) - ((50d / 100 * width))));
//BA.debugLineNum = 39;BA.debugLine="Panel10.SetLeftAndRight(2%x,48%x)"[addLaboresUI/General script]
views.get("panel10").vw.setLeft((int)((2d / 100 * width)));
views.get("panel10").vw.setWidth((int)((48d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 40;BA.debugLine="Panel11.SetLeftAndRight(50%x,94%x)"[addLaboresUI/General script]
views.get("panel11").vw.setLeft((int)((50d / 100 * width)));
views.get("panel11").vw.setWidth((int)((94d / 100 * width) - ((50d / 100 * width))));
//BA.debugLineNum = 41;BA.debugLine="EditTextAreaLabor.SetLeftAndRight(1%x,45%x)"[addLaboresUI/General script]
views.get("edittextarealabor").vw.setLeft((int)((1d / 100 * width)));
views.get("edittextarealabor").vw.setWidth((int)((45d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 42;BA.debugLine="EditTextAreaLote.SetLeftAndRight(1%x,43%x)"[addLaboresUI/General script]
views.get("edittextarealote").vw.setLeft((int)((1d / 100 * width)));
views.get("edittextarealote").vw.setWidth((int)((43d / 100 * width) - ((1d / 100 * width))));

}
}