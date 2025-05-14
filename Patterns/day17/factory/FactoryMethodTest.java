package day17.factory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PaymentProcessorFactory creditCardFactory = new CreditCardProcessorFactory();
        creditCardFactory.process(100.50);

        PaymentProcessorFactory payPalFactory = new PayPalProcessorFactory();
        payPalFactory.process(75.25);
    }
}