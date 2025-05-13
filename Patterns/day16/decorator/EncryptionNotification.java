package day16.decorator;

public class EncryptionNotification extends NotificationDecorator{
    protected EncryptionNotification(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void send(String message) {
        String encrypted = encrypt(message);
        decoratedNotification.send(encrypted);
    }

    private static String encrypt(String message){
        return "ENCRYPTED("+message+")";
    }
}
