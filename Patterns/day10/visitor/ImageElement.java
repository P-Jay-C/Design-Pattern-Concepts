package day10.visitor;

public class ImageElement implements DocumentElement {
    private String imagePath;

    public ImageElement(String imagePath){
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
