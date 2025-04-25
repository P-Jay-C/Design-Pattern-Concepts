package day2.decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost(){
        return decoratedCoffee.cost() + 0.2;
    }

    @Override
    public String description(){
        return decoratedCoffee.description() + ", Sugar";
    }
}
