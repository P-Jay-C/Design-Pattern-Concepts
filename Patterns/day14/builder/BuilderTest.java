package day14.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Email email1 = new Email.EmailBuilder()
                .setRecipient("user@example.com")
                .setSubject("Meeting")
                .setBody("Let's meet at 2 PM.")
                .addAttachment("agenda.pdf")
                .build();
        email1.send();

        Email email2 = new Email.EmailBuilder()
                .setRecipient("team@example.com")
                .setSubject("Update")
                .setBody("Project status update.")
                .build();
        email2.send();
    }
}