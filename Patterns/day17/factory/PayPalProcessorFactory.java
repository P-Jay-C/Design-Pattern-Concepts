package day17.factory;

public class PayPalProcessorFactory extends PaymentProcessorFactory{
    @Override
    public PaymentProcessor createProcessor() {
        return new PayPalProcessor();
    }
}
