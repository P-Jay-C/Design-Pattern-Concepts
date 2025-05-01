package day8.abstractfactory;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering a Mac button");
    }
}
