package day8.abstractfactory;

public class WndowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }
}
