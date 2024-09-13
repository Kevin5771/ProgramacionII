package Mail;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

public class EmailBuilder implements IntEmail{
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");


    private List<String> destinatarios = new ArrayList<>();
    private String Sujeto;
    private String cuerpo;
    private List<Attachment> attachments = new ArrayList<>();
    private List<String> cc = new ArrayList<>();
    private List<String> bcc = new ArrayList<>();
    private String replyTo;
    private boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
    @Override
    public EmailBuilder addRecipient(String destinatario) {
        if (!isValidEmail(destinatario)) {
            throw new IllegalArgumentException("Email inválido: " + destinatario);
        }
        this.destinatarios.add(destinatario);
        return this;

    }

    @Override
    public EmailBuilder setSubject(String sujeto) {
        if (sujeto== null || sujeto.isEmpty()) {
            throw new IllegalStateException("El asunto no puede estar vacío");
        }
        this.Sujeto = sujeto;
        return this;
    }


    @Override
    public EmailBuilder setBody(String cuerpo) {
        if (cuerpo== null || cuerpo.isEmpty()) {
            throw new IllegalStateException("El cuerpo no puede estar vacio");
        }
        this.cuerpo = cuerpo;
        return this;
    }

    @Override
    public EmailBuilder addAttachment(Attachment attachment) {
        this.attachments.add(attachment);
        return this;
    }


    @Override
    public EmailBuilder setReplyTo(String replyTo) {
        if (!isValidEmail(replyTo)) {
            throw new IllegalArgumentException("Email inválido para Reply-To: " + replyTo);
        }
        this.replyTo = replyTo;
        return this;
    }

    @Override
    public Email build() {
        if (destinatarios.isEmpty()) {
            throw new IllegalStateException("Debe haber al menos un destinatario");
        }
        if (Sujeto == null || Sujeto.isEmpty()) {
            throw new IllegalStateException("El asunto no puede estar vacío");
        }
        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new IllegalStateException("El cuerpo no puede estar vacío");
        }
        return new Email(destinatarios, Sujeto, cuerpo, attachments, cc, bcc, Optional.ofNullable(replyTo));
    }
}
