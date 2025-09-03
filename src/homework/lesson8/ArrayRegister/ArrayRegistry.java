package homework.lesson8.ArrayRegister;

import homework.lesson8.Document.Document;
import homework.lesson8.Registry;

public class ArrayRegistry implements Registry {

    private int currentIndex;

    private Document[] documents;

    public ArrayRegistry(int capacity) {
        this.documents = new Document[capacity];
        this.currentIndex = 0;
    }

    @Override
    public boolean saveDocument(Document document) {
        if (currentIndex >= documents.length) {
            System.out.println("Register is full");
            return false;
        }
        documents[currentIndex] = document;
        currentIndex++;
        return true;
    }

    @Override
    public void documentInfo(int documentNumber) {
        for (Document doc : documents) {
            if (doc != null && doc.getDocumentNumber() == documentNumber) {
                doc.printInfo();
                return;
            }

        }
        System.out.println("Document not found!");
    }

}
