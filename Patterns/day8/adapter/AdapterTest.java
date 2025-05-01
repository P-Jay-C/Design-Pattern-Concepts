package day8.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        LegacyEmailSender legacyEmailSender = new LegacyEmailSender();
        EmailService emailService = new EmailAdapter(legacyEmailSender);

        emailService.sendEmail("user@example.com", "Meeting", "Let's meet at 2 PM.");
        emailService.sendEmail("team@example.com", "Update", "Project is on track.");
    }
}
