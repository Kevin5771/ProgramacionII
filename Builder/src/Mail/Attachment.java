package Mail;

public class Attachment {
    private final String fileName;
    private final String fileType;

    public Attachment(String fileName, String fileType) {
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;}
}
