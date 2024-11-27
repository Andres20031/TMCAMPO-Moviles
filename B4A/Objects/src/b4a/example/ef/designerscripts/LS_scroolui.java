package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_scroolui{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel9").vw.setLeft((int)((4d / 100 * width)));
views.get("panel9").vw.setWidth((int)((53d / 100 * width) - ((4d / 100 * width))));
views.get("panel2time").vw.setLeft((int)((views.get("panel9").vw.getLeft() + views.get("panel9").vw.getWidth())+(4d / 100 * width)));
views.get("panel2time").vw.setWidth((int)((96d / 100 * width) - ((views.get("panel9").vw.getLeft() + views.get("panel9").vw.getWidth())+(4d / 100 * width))));
views.get("label14").vw.setLeft((int)((views.get("panel9").vw.getLeft() + views.get("panel9").vw.getWidth())+(4d / 100 * width)));
views.get("label14").vw.setWidth((int)((96d / 100 * width) - ((views.get("panel9").vw.getLeft() + views.get("panel9").vw.getWidth())+(4d / 100 * width))));
views.get("panel4").vw.setLeft((int)((4d / 100 * width)));
views.get("panel4").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("panel5").vw.setLeft((int)((4d / 100 * width)));
views.get("panel5").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("panel6").vw.setLeft((int)((4d / 100 * width)));
views.get("panel6").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("panel3").vw.setLeft((int)((4d / 100 * width)));
views.get("panel3").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("panel10horainicio").vw.setLeft((int)((4d / 100 * width)));
views.get("panel10horainicio").vw.setWidth((int)((48d / 100 * width) - ((4d / 100 * width))));
views.get("label1").vw.setLeft((int)((4d / 100 * width)));
views.get("label1").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("label3").vw.setLeft((int)((4d / 100 * width)));
views.get("label3").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("label4").vw.setLeft((int)((4d / 100 * width)));
views.get("label4").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("label7").vw.setLeft((int)((4d / 100 * width)));
views.get("label7").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("label9").vw.setLeft((int)((4d / 100 * width)));
views.get("label9").vw.setWidth((int)((48d / 100 * width) - ((4d / 100 * width))));
views.get("label8").vw.setLeft((int)((52d / 100 * width)));
views.get("label8").vw.setWidth((int)((96d / 100 * width) - ((52d / 100 * width))));
views.get("panel11horafim").vw.setLeft((int)((52d / 100 * width)));
views.get("panel11horafim").vw.setWidth((int)((96d / 100 * width) - ((52d / 100 * width))));

}
}