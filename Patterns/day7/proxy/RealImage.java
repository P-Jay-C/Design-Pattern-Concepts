package day7.proxy;

public class RealImage implements Image{
    private String filename;
    public RealImage(String filename ){
        this.filename = filename;
        loadingImage();
    }
    private void loadingImage() {
        System.out.println("Loading image: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
