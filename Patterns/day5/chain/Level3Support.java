package day5.chain;

public class Level3Support extends SupportHandler {
    @Override
    public void handleRequest(int severity) {
        if (severity == 3) {
            System.out.println("Level 3 Support: Handling critical request");
        } else {
            super.handleRequest(severity);
        }
    }
}
