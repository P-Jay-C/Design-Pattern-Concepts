package day16.decorator;

public class LoggingNotification extends NotificationDecorator {
    protected LoggingNotification(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void send(String message) {
        System.out.println("Logging: " + message);
        decoratedNotification.send(message);
    }
}
