package day13.chainOfResponsibility;

public class MediumSeverityHandler extends AbstractHandler {
    @Override
    public void handle(SupportRequest request) {
        if ("Medium".equals(request.getSeverity())) {
            System.out.println("MediumSeverityHandler: Handling " + request.getSeverity() + " request");
        } else {
            super.handle(request);
        }
    }
}
