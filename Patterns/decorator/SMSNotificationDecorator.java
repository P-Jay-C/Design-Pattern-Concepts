package decorator;

public class SMSNotificationDecorator extends EmailNotificationDecorator{
    protected SMSNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending via SMS: " + message);
    }
}
