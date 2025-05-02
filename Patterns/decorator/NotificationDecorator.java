package decorator;

public abstract class NotificationDecorator implements Notification {
    protected Notification decoratedNotification;

    protected NotificationDecorator(Notification decoratedNotification){
        this.decoratedNotification = decoratedNotification;
    }

    @Override
    public void send(String message){
        decoratedNotification.send(message);
    }

}
