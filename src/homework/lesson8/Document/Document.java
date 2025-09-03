package homework.lesson8.Document;

import java.util.Date;

public abstract class Document {
    private int documentNumber;
    private Date documentDate;

    public Document(int documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public abstract void printInfo();
}
