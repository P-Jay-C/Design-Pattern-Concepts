package day1.adapter;

public class PaymentAdapter implements PaymentProcessor {
    private OldPaymentSystem oldPaymentSystem;

    public PaymentAdapter(OldPaymentSystem oldPaymentSystem){
        this.oldPaymentSystem = oldPaymentSystem;
    }

    @Override
    public void processPayment(double amount, String currency) {
       oldPaymentSystem.makePayment(amount);
        System.out.println("Adapted to process " +  amount + " in " + currency);
    }

}
