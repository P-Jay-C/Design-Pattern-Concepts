package day1.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Message from logger1");
        logger2.log("Message from logger2");

        // Verify both are the same instance
        System.out.println("Same instance? " + (logger1 == logger2)); // true

    }
}