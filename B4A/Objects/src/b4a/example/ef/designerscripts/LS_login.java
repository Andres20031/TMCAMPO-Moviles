package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label1welcome").vw.setLeft((int)((4d / 100 * width)));
views.get("label1welcome").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("panel3mail").vw.setLeft((int)((4d / 100 * width)));
views.get("panel3mail").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("panel4pass").vw.setLeft((int)((4d / 100 * width)));
views.get("panel4pass").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("button1login").vw.setLeft((int)((4d / 100 * width)));
views.get("button1login").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("label1fp").vw.setLeft((int)((4d / 100 * width)));
views.get("label1fp").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("edittext1mail").vw.setLeft((int)((3d / 100 * width)));
views.get("edittext1mail").vw.setWidth((int)((views.get("panel3mail").vw.getWidth())-(3d / 100 * width) - ((3d / 100 * width))));
views.get("edittext2pass").vw.setLeft((int)((3d / 100 * width)));
views.get("edittext2pass").vw.setWidth((int)((views.get("panel3mail").vw.getWidth())-(3d / 100 * width) - ((3d / 100 * width))));

}
}