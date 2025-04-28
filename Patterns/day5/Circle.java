package day5;

public class Circle implements Shape {

    private int radius;

    public Circle() {
        this.radius = 10;
    }

    @Override
    public Shape clone() {
        Circle cloned = new Circle();
        cloned.radius = this.radius;
        return cloned;
    }

    @Override
    public void setAttribute(String attribute) {
        this.radius = Integer.parseInt(attribute);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius);
    }
}
