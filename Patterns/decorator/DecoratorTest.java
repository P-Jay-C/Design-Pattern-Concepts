package decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Notification simple = new SimpleNotification();
        Notification email = new EmailNotificationDecorator(simple);
        Notification emailAndSMS = new SMSNotificationDecorator(email);

        System.out.println("Simple Notification:");
        simple.send("Hello!");
        System.out.println("\nEmail Notification:");
        email.send("Hello!");
        System.out.println("\nEmail + SMS Notification:");
        emailAndSMS.send("Hello!");
    }
}