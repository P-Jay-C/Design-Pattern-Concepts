package day5.chain;

public class Level2Support extends SupportHandler {
    @Override
    public void handleRequest(int severity) {
        if (severity == 2) {
            System.out.println("Level 2 Support: Handling intermediate request");
        } else {
            super.handleRequest(severity);
        }
    }
}

