package day5.prototype;

public class PrototypeTest {
    public static void main(String[] args){
        ShapeRegistry registry = new ShapeRegistry();
        registry.registerShape("circle", new Circle());
        registry.registerShape("rectangle", new Rectangle());


        Shape circle = registry.getShape("circle");
        circle.setAttribute("15");
        circle.draw();

        Shape anotherCircle = registry.getShape("circle");
        anotherCircle.draw();


        Shape rectangle = registry.getShape("rectangle");
        rectangle.setAttribute("30");
        rectangle.draw();

        Shape anotherRectangle = registry.getShape("rectangle");
        anotherRectangle.draw();

    }
}