package day1.adapter;

public class AdapterTest {
    public static void main(String[] args){

        OldPaymentSystem oldSystem = new OldPaymentSystem();
        PaymentProcessor processor = new PaymentAdapter(oldSystem);

        processor.processPayment(100.50, "USD");
        processor.processPayment(200.75, "EUR");
    }
}
