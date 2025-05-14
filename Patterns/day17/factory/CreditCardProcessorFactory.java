package day17.factory;

public class CreditCardProcessorFactory extends PaymentProcessorFactory{
    @Override
    public PaymentProcessor createProcessor() {
        return new CreditCardProcessor();
    }
}
