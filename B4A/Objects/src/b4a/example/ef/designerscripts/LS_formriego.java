package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_formriego{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label7").vw.setLeft((int)((2d / 100 * width)));
views.get("label7").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("panel5").vw.setLeft((int)((2d / 100 * width)));
views.get("panel5").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("swiftbuttonriego").vw.setLeft((int)((1d / 100 * width)));
views.get("swiftbuttonriego").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
views.get("label13").vw.setLeft((int)((2d / 100 * width)));
views.get("label13").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("label2").vw.setLeft((int)((2d / 100 * width)));
views.get("label2").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("panel10").vw.setLeft((int)((2d / 100 * width)));
views.get("panel10").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("panel1").vw.setLeft((int)((2d / 100 * width)));
views.get("panel1").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("panel2").vw.setLeft((int)((2d / 100 * width)));
views.get("panel2").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("edittextprocedencia").vw.setLeft((int)((1d / 100 * width)));
views.get("edittextprocedencia").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
views.get("edittextcaudalaplicado").vw.setLeft((int)((1d / 100 * width)));
views.get("edittextcaudalaplicado").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
views.get("edittextcantidadagua").vw.setLeft((int)((1d / 100 * width)));
views.get("edittextcantidadagua").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));

}
}