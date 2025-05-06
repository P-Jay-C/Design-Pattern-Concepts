package day12.bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void renderShape(String shapeType, String details) {
        System.out.println("Rendering " + shapeType + " with Raster: " + details);
    }
}