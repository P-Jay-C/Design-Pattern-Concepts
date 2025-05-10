package day15.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        ProductRegistry.registerPrototype("laptop", new Electronics("Generic Laptop", 999.99));
        ProductRegistry.registerPrototype("shirt", new Clothing("Generic Shirt", 29.99));

        Product laptop1 = ProductRegistry.getPrototype("laptop");
        laptop1.setName("Gaming Laptop");
        laptop1.setPrice(1499.99);
        laptop1.display();

        Product laptop2 = ProductRegistry.getPrototype("laptop");
        laptop2.display();

        Product shirt = ProductRegistry.getPrototype("shirt");
        shirt.setName("Designer Shirt");
        shirt.setPrice(59.99);
        shirt.display();
    }
}