package b4a.example.ef.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_forminsumo{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label7").vw.setLeft((int)((2d / 100 * width)));
views.get("label7").vw.setWidth((int)((96d / 100 * width) - ((2d / 100 * width))));
views.get("panel5").vw.setLeft((int)((2d / 100 * width)));
views.get("panel5").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("swiftbuttoninsumo").vw.setLeft((int)((1d / 100 * width)));
views.get("swiftbuttoninsumo").vw.setWidth((int)((95d / 100 * width) - ((1d / 100 * width))));
views.get("label13").vw.setLeft((int)((2d / 100 * width)));
views.get("label13").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("panel10").vw.setLeft((int)((2d / 100 * width)));
views.get("panel10").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("edittextcantidadinsumo").vw.setLeft((int)((1d / 100 * width)));
views.get("edittextcantidadinsumo").vw.setWidth((int)((95d / 100 * width) - ((1d / 100 * width))));
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("label1").vw.setLeft((int)((1d / 100 * width)));
views.get("label1").vw.setWidth((int)((30d / 100 * width) - ((1d / 100 * width))));
views.get("labelcantidadinsumos").vw.setLeft((int)((27d / 100 * width)));
views.get("labelcantidadinsumos").vw.setWidth((int)((50d / 100 * width) - ((27d / 100 * width))));
views.get("buttonaddinsumo").vw.setLeft((int)((2d / 100 * width)));
views.get("buttonaddinsumo").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("buttondeleteinsumo").vw.setLeft((int)((1d / 100 * width)));
views.get("buttondeleteinsumo").vw.setWidth((int)((93d / 100 * width) - ((1d / 100 * width))));
views.get("b4xtable1").vw.setLeft((int)((0d / 100 * width)));
views.get("b4xtable1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("paneltittleinsumo").vw.setLeft((int)((0d / 100 * width)));
views.get("paneltittleinsumo").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("label3").vw.setLeft((int)((0d / 100 * width)));
views.get("label3").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelinsumoselect").vw.setLeft((int)((0d / 100 * width)));
views.get("panelinsumoselect").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("labelinsumoselect").vw.setLeft((int)((0d / 100 * width)));
views.get("labelinsumoselect").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));

}
}