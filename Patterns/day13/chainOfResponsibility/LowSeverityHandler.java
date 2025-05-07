package day13.chainOfResponsibility;

public class LowSeverityHandler extends AbstractHandler {
    @Override
    public void handle(SupportRequest request) {
        if ("Low".equals(request.getSeverity())) {
            System.out.println("LowSeverityHandler: Handling " + request.getSeverity() + " request");
        } else {
            super.handle(request);
        }
    }
}

