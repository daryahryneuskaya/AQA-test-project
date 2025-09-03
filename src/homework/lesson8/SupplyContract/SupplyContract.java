package homework.lesson8.SupplyContract;

import homework.lesson8.Document.Document;

import java.util.Date;

public class SupplyContract extends Document {
    private String productType;
    private int quantity;

    public SupplyContract(int documentNumber, String productType, int quantity, Date documentDate) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.quantity = quantity;

    }

    public String getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }


    @Override
    public void printInfo() {
        System.out.println("Supply contract: " + "\n" + "\t" + "Product type: " + productType + "\n" + "\t" +
                "Quantity:" + " " + quantity + "\n" + "\t" + "Document Date: " + getDocumentDate() + "\n" + "\t" +
                "Document number: " + getDocumentNumber());
    }
}
