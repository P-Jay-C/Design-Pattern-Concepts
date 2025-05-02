package day9.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String crust;
    private List<String> toppings;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.crust = pizzaBuilder.crust;
        this.toppings = pizzaBuilder.toppings;
    }

    public void display() {
        System.out.println("Pizza: Size=" + size + ", Crust=" + crust + ", Toppings=" + toppings);
    }

    public static class PizzaBuilder{
        private String size;
        private String crust;
        private List<String> toppings = new ArrayList<>();

        public PizzaBuilder setSize(String size){
            this.size = size;
            return this;
        }

        public PizzaBuilder setCrust(String crust){
            this.crust = crust;
            return this;
        }

        public PizzaBuilder addTopping(String topping){
            this.toppings.add(topping);
            return this;
        }

        Pizza build(){
            return new Pizza(this);
        }
    }
}
