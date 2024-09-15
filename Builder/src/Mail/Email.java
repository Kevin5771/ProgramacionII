package Mail;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

public class Email{
    private final List<String> destinatarios;
    private final String sujeto;
    private final String cuerpo;
    private final List<Attachment> attachments;
    private final List<String> cc;
    private final List<String> bcc;
    private final Optional<String> replyTo;


    public Email(List<String> destinatarios, String sujeto, String cuerpo, List<Attachment> attachments, List<String> cc, List<String> bcc, Optional<String> replyTo) {
        this.destinatarios = destinatarios;
        this.sujeto = sujeto;
        this.cuerpo = cuerpo;
        this.attachments = attachments;
        this.cc = cc;
        this.bcc = bcc;
        this.replyTo = replyTo;
    }

    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public String getSujeto() {
        return sujeto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public List<String> getCc() {
        return cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public Optional<String> getReplyTo() {
        return replyTo;
    }
}
