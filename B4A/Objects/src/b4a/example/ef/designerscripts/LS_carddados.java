package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_carddados{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel4dep").vw.setLeft((int)((50d / 100 * width) - (views.get("panel4dep").vw.getWidth() / 2)));
views.get("button1check").vw.setLeft((int)((views.get("panel4dep").vw.getLeft())+(1d / 100 * width)));
views.get("button2del").vw.setLeft((int)((views.get("panel4dep").vw.getLeft() + views.get("panel4dep").vw.getWidth())-(6d / 100 * width) - (views.get("button2del").vw.getWidth())));
views.get("button1agendar").vw.setLeft((int)((views.get("panel4dep").vw.getWidth())/2d - (views.get("button1agendar").vw.getWidth() / 2)));

}
}