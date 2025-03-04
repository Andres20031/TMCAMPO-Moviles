package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_addprecipitacionui{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("panel3").vw.setLeft((int)((2d / 100 * width)));
views.get("panel3").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("swiftbuttonpluvimetro").vw.setLeft((int)((1d / 100 * width)));
views.get("swiftbuttonpluvimetro").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
views.get("label4").vw.setLeft((int)((2d / 100 * width)));
views.get("label4").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("panel4").vw.setLeft((int)((2d / 100 * width)));
views.get("panel4").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("edittexthorafin").vw.setLeft((int)((1d / 100 * width)));
views.get("edittexthorafin").vw.setWidth((int)((91d / 100 * width) - ((1d / 100 * width))));
views.get("label2").vw.setLeft((int)((2d / 100 * width)));
views.get("label2").vw.setWidth((int)((48d / 100 * width) - ((2d / 100 * width))));
views.get("panel2time").vw.setLeft((int)((2d / 100 * width)));
views.get("panel2time").vw.setWidth((int)((48d / 100 * width) - ((2d / 100 * width))));

}
}