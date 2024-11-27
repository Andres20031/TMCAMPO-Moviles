package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_errorlayout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("button1addisumo").vw.setLeft((int)((4d / 100 * width)));
views.get("button1addisumo").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("label1empty").vw.setLeft((int)((4d / 100 * width)));
views.get("label1empty").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("panel1geral").vw.setTop((int)((50d / 100 * height) - (views.get("panel1geral").vw.getHeight() / 2)));
views.get("imageview1").vw.setLeft((int)((50d / 100 * width) - (views.get("imageview1").vw.getWidth() / 2)));

}
}