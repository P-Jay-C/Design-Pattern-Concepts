package day12.factory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.sendNotification("Welcome to our service!");

        NotificationFactory pushFactory = new PushNotificationFactory();
        pushFactory.sendNotification("New update available!");
    }
}