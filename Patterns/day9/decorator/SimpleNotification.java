package day9.decorator;

public class SimpleNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Base notification: " + message);
    }
}
