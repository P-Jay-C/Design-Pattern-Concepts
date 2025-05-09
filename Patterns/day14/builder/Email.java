package day14.builder;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private String recipient;
    private String subject;
    private String body;
    private List<String> attachments;

    private Email(EmailBuilder builder) {
        this.recipient = builder.recipient;
        this.subject = builder.subject;
        this.body = builder.body;
        this.attachments = builder.attachments;
    }

    public void send(){
        System.out.println("Sending email to: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        if (attachments != null && !attachments.isEmpty()) {
            System.out.println("Attachments: " + String.join(", ", attachments));
        }
    }

    public static class EmailBuilder {
        private String recipient;
        private String subject;
        private String body;
        private List<String> attachments;

        public EmailBuilder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder body(String body) {
            this.body = body;
            return this;
        }

        public EmailBuilder addAttachment(String attachment) {
            if (this.attachments == null) {
                this.attachments = new ArrayList<>();
            }
            this.attachments.add(attachment);
            return this;
        }

        public Email build() {
            return new Email(this);
        }

        public EmailBuilder setBody(String s) {
            this.body = s;
            return this;
        }
    }
}
