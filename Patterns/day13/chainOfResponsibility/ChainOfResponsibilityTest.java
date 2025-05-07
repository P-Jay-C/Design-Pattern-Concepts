package day13.chainOfResponsibility;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Handler lowHandler = new LowSeverityHandler();
        Handler mediumHandler = new MediumSeverityHandler();
        Handler highHandler = new HighSeverityHandler();

        lowHandler.setNext(mediumHandler);
        mediumHandler.setNext(highHandler);

        SupportRequest lowRequest = new SupportRequest("Low");
        SupportRequest mediumRequest = new SupportRequest("Medium");
        SupportRequest highRequest = new SupportRequest("High");
        SupportRequest invalidRequest = new SupportRequest("Critical");

        lowHandler.handle(lowRequest);
        lowHandler.handle(mediumRequest);
        lowHandler.handle(highRequest);
        lowHandler.handle(invalidRequest);
    }
}
