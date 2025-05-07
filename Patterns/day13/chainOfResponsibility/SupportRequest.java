package day13.chainOfResponsibility;

public class SupportRequest {
    private String severity;

    public SupportRequest(String severity) {
        this.severity = severity;
    }

    public String getSeverity() {
        return severity;
    }
}