package day16.decorator;

public class DecoratorTest {
    public static void main(String[] args) {

        Notification basic = new BasicNotification();
        Notification logged = new LoggingNotification(basic);
        Notification encrypted = new EncryptionNotification(logged);
        Notification both =  new LoggingNotification(new EncryptionNotification(basic));

        System.out.println("Basic Notification:");
        basic.send("Hello!");

        System.out.println("\nLogged Notification:");
        logged.send("Hello!");

        System.out.println("\nEncrypted Notification:");
        encrypted.send("Hello!");

        System.out.println("\nLogged and Encrypted Notification:");
        both.send("Hello!");
    }
}