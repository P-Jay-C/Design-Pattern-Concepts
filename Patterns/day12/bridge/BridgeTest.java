package day12.bridge;

public class BridgeTest {
    public static void main(String[] args) {

        Shape circle = new Circle(new VectorRenderer(), 5.0);
        Shape square = new Square(new RasterRenderer(), 4.0);

        circle.draw();
        square.draw();

        Shape circleRaster = new Circle(new RasterRenderer(), 3.0);
        circleRaster.draw();
    }
}