package day13.chainOfResponsibility;

public class HighSeverityHandler extends AbstractHandler {
    @Override
    public void handle(SupportRequest request) {
        if ("High".equals(request.getSeverity())) {
            System.out.println("HighSeverityHandler: Handling " + request.getSeverity() + " request");
        } else {
            super.handle(request);
        }
    }
}
