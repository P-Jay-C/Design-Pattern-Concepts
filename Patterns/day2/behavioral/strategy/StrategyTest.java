package day2.behavioral.strategy;

// Test class
public class StrategyTest {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(new CreditCard());
        processor.processPayment(100.0);

        processor.setStrategy(new PayPal());
        processor.processPayment(200.0);
    }
}
