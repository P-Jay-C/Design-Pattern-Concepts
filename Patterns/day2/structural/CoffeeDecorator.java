package day2.structural;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    @Override
    public double cost() {
        return this.decoratedCoffee.cost();
    }

    @Override
    public String description() {
        return this.decoratedCoffee.description();
    }

}
