package day9;

public class BuilderTest {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.PizzaBuilder()
                .setSize("Large")
                .setCrust("Thin")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .build();
        pizza1.display();

        Pizza pizza2 = new Pizza.PizzaBuilder()
                .setSize("Medium")
                .setCrust("Stuffed")
                .addTopping("Cheese")
                .build();

        pizza2.display();
    }
}
