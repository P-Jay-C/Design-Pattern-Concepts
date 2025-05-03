package day10.facade;

public class PaymentSystem {
    public boolean processPayment(String paymentMethod, double amount) {
        System.out.println("Processing payment of $" + amount + " via " + paymentMethod);
        return true;
    }
}
