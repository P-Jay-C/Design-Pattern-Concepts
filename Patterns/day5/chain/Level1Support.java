package day5.chain;

public class Level1Support extends SupportHandler{
    @Override
    public void handleRequest(int severity) {
        if (severity <= 1) {
            System.out.println("Level 1 support handling request with severity: " + severity);
        } else if (next != null) {
            next.handleRequest(severity);
        }
    }
}
