package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_cardlabores{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("labellabores").vw.setLeft((int)((1d / 100 * width)));
views.get("labellabores").vw.setWidth((int)((99d / 100 * width) - ((1d / 100 * width))));
views.get("buttongrabar").vw.setLeft((int)((10d / 100 * width)));
views.get("buttongrabar").vw.setWidth((int)((30d / 100 * width) - ((10d / 100 * width))));
views.get("buttoncancelar").vw.setLeft((int)((40d / 100 * width)));
views.get("buttoncancelar").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
views.get("buttonaplazar").vw.setLeft((int)((70d / 100 * width)));
views.get("buttonaplazar").vw.setWidth((int)((90d / 100 * width) - ((70d / 100 * width))));

}
}