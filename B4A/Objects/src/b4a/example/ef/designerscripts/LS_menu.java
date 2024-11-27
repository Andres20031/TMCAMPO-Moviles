package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_menu{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label3").vw.setLeft((int)((50d / 100 * width) - (views.get("label3").vw.getWidth() / 2)));
views.get("pnlpersonal").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlpersonal").vw.getWidth() / 2)));
views.get("pnlmaquinaria").vw.setLeft((int)((views.get("pnlpersonal").vw.getLeft())-(4d / 100 * width) - (views.get("pnlmaquinaria").vw.getWidth())));
views.get("pnltaller").vw.setLeft((int)((views.get("pnlpersonal").vw.getLeft() + views.get("pnlpersonal").vw.getWidth())+(4d / 100 * width)));
views.get("pnlprograma_de_labores").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlprograma_de_labores").vw.getWidth() / 2)));
views.get("pnlprecipitacion").vw.setLeft((int)((views.get("pnlpersonal").vw.getLeft())-(4d / 100 * width) - (views.get("pnlprecipitacion").vw.getWidth())));
views.get("pnlcosecha").vw.setLeft((int)((views.get("pnlprograma_de_labores").vw.getLeft())));
views.get("panel1precipitacion2").vw.setLeft((int)((views.get("pnlpersonal").vw.getLeft())-(4d / 100 * width) - (views.get("panel1precipitacion2").vw.getWidth())));
views.get("label2separator").vw.setLeft((int)((views.get("pnlprecipitacion").vw.getLeft())));
views.get("label2separator").vw.setWidth((int)((views.get("pnltaller").vw.getLeft() + views.get("pnltaller").vw.getWidth()) - ((views.get("pnlprecipitacion").vw.getLeft()))));

}
}