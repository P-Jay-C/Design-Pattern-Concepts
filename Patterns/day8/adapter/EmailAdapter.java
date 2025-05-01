package day8.adapter;

public class EmailAdapter implements EmailService{
    private final LegacyEmailSender legacyEmailSender;

    public EmailAdapter(LegacyEmailSender legacyEmailSender) {
        this.legacyEmailSender = legacyEmailSender;
    }

    @Override
    public void sendEmail(String recipient, String subject, String body) {
        // Convert the new email format to the legacy format
        String message = "Subject: " + subject + "\n" + "Body: " + body;
        legacyEmailSender.send(recipient,message );
    }

}
