package day5;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle() {
        this.width = 20;
        this.height = 10;
    }

    @Override
    public Shape clone() {
        Rectangle cloned = new Rectangle();
        cloned.width = this.width;
        cloned.height = this.height;
        return cloned;
    }

    @Override
    public void setAttribute(String attribute) {
        this.width = Integer.parseInt(attribute);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width: " + width + ", height: " + height);
    }

}
