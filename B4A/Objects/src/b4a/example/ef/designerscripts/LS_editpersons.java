package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_editpersons{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("labeltitulo").vw.setLeft((int)((57d / 100 * width) - (views.get("labeltitulo").vw.getWidth() / 2)));
views.get("panel12").vw.setLeft((int)((1d / 100 * width)));
views.get("panel12").vw.setWidth((int)((99d / 100 * width) - ((1d / 100 * width))));
views.get("as_datepicker1").vw.setLeft((int)((1d / 100 * width)));
views.get("as_datepicker1").vw.setWidth((int)((97d / 100 * width) - ((1d / 100 * width))));

}
}