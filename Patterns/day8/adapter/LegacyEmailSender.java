package day8.adapter;

public class LegacyEmailSender {
    public void send(String to, String msg){
        System.out.println("LegacyEmailSender: Sending email to " + to + ": " + msg);
    }
}
