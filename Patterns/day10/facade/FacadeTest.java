package day10.facade;

public class FacadeTest {
    public static void main(String[] args) {
        OrderProcessingFacade facade = new OrderProcessingFacade();

        facade.placeOrder("Laptop", 2, "Credit Card", 2000.0, "123 Main St");
        facade.placeOrder("Phone", 1, "PayPal", 800.0, "456 Oak Ave");
    }
}
