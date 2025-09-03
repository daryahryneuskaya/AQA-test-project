package homework.lesson8;

import homework.lesson8.Document.Document;

public interface Registry {
    boolean saveDocument(Document document);

    void documentInfo(int documentNumber);

}
