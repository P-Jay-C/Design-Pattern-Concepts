package day8.abstractfactory;

public class WindowsTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering Windows text field.");
    }
}
