package day2.strategy;

// Concrete PayPal strategy
public class PayPal implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal");
    }
}
