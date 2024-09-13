package Mail;

public interface IntEmail {
    EmailBuilder addRecipient(String destinatario);
    EmailBuilder setSubject(String sujeto);
    EmailBuilder setBody(String cuerpo);
    EmailBuilder addAttachment(Attachment attachment);
    EmailBuilder setReplyTo(String replyTo);
    Email build();
}
