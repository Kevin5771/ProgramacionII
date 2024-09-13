import Mail.Attachment;
import Mail.Email;
import Mail.EmailBuilder;


public class Main {
    public static void main(String[] args) {
        Email email = new EmailBuilder()
                .addRecipient("juan@gmail.com")
                .addRecipient("recipient2@example.com")
                .setSubject("Reunión Importante")
                .setBody("Estimados, los invito a la reunión de mañana a las 10 AM.")
                .addAttachment(new Attachment("agenda.pdf", "application/pdf"))
                .setReplyTo("no-reply@example.com")
                .build();

        // Imprimir detalles del email
        System.out.println("Destinatarios: " + email.getDestinatarios());
        System.out.println("Asunto: " + email.getSujeto());
        System.out.println("Cuerpo: " + email.getCuerpo());

        System.out.println("Adjuntos: ");
        email.getAttachments().forEach(att ->
                System.out.println("  Archivo: " + att.getFileName() + " (Tipo: " + att.getFileType() + ")"));
        email.getReplyTo().ifPresent(reply ->
                System.out.println("Reply-To: " + reply));

        Email email1 = new EmailBuilder()
                .addRecipient("juan@gmail.com")
                .addRecipient("kevin@example.com")
                .setSubject("Reunión Importante Iglesia")
                .setBody("Estimados, los invito a la reunión de mañana a las 12 PM.")
                .addAttachment(new Attachment("agenda.pdf", "application/pdf"))
                .setReplyTo("no-reply@gmail.com")
                .build();

        System.out.println("--------------------------------------------");

        System.out.println("Destinatarios: " + email1.getDestinatarios());
        System.out.println("Asunto: " + email1.getSujeto());
        System.out.println("Cuerpo: " + email1.getCuerpo());

        System.out.println("Adjuntos: ");
        email1.getAttachments().forEach(att ->
                System.out.println("  Archivo: " + att.getFileName() + " (Tipo: " + att.getFileType() + ")"));
        email1.getReplyTo().ifPresent(reply ->
                System.out.println("Reply-To: " + reply));
        }
    }
