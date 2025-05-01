package day8.abstractfactory;

public class MacOSTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering a MacOS text field");
    }
}
