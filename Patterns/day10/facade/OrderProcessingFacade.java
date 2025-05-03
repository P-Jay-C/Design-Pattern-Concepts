package day10.facade;

public class OrderProcessingFacade {
    private InventorySystem inventory;
    private PaymentSystem payment;
    private ShippingSystem shipping;

    public OrderProcessingFacade(){
        this.inventory = new InventorySystem();
        this.payment = new PaymentSystem();
        this.shipping = new ShippingSystem();
    }

    public boolean placeOrder(String item, int quantity, String paymentMethod, double amount, String address) {
        if (!inventory.checkStock(item, quantity)) {
            System.out.println("Order failed: Insufficient stock");
            return false;
        }
        inventory.reserveStock(item, quantity);
        if (!payment.processPayment(paymentMethod, amount)) {
            System.out.println("Order failed: Payment declined");
            return false;
        }
        shipping.scheduleDelivery(item, address);
        System.out.println("Order placed successfully");
        return true;
    }

}
