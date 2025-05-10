package day15.prototype;

public class Clothing implements Product {
    private String name;
    private double price;

    public Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Product clone() {
        return new Clothing(name, price);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Clothing: " + name + ", Price: $" + price);
    }
}