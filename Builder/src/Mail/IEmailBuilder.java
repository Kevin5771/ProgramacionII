package Mail;

public interface IEmailBuilder {
    EmailBuilderBuilder addRecipient(String destinatario);
    EmailBuilderBuilder setSubject(String sujeto);
    EmailBuilderBuilder setBody(String cuerpo);
    EmailBuilderBuilder addAttachment(Attachment attachment);
    EmailBuilderBuilder setReplyTo(String replyTo);
    Email build();
}
