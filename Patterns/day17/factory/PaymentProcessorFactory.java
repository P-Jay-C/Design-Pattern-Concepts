package day17.factory;

public abstract class PaymentProcessorFactory {
    public abstract PaymentProcessor createProcessor();

    public void process(double amount){
        PaymentProcessor processor = createProcessor();
        processor.processPayment(amount);
    }
}
