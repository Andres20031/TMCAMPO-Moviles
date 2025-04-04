package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_cardinputeditperson{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("paneledit").vw.setLeft((int)((50d / 100 * width) - (views.get("paneledit").vw.getWidth() / 2)));
views.get("paneledit").vw.setLeft((int)((0d / 100 * width)));
views.get("paneledit").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("label7").vw.setLeft((int)((2d / 100 * width)));
views.get("label7").vw.setWidth((int)((99d / 100 * width) - ((2d / 100 * width))));
views.get("panel10horainicio").vw.setLeft((int)((2d / 100 * width)));
views.get("panel10horainicio").vw.setWidth((int)((60d / 100 * width) - ((2d / 100 * width))));
views.get("label12fecha").vw.setLeft((int)((2d / 100 * width)));
views.get("label12fecha").vw.setWidth((int)((57d / 100 * width) - ((2d / 100 * width))));
views.get("buttonbuscar").vw.setLeft((int)((63d / 100 * width)));
views.get("buttonbuscar").vw.setWidth((int)((98d / 100 * width) - ((63d / 100 * width))));

}
}