package day9.decorator;

public class EmailNotificationDecorator extends NotificationDecorator{
    protected EmailNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending via Email: " + message);
    }
}
