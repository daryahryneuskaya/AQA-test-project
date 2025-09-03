package homework.lesson8.FinancialInvoice;

import homework.lesson8.Document.Document;

import java.util.Date;

public class FinancialInvoice extends Document {
    private Double sumForMonth;
    private String departmentCode;

    public FinancialInvoice(Double sumForMonth, Date documentDate, int documentNumber, String departmentCode) {
        super(documentNumber, documentDate);
        this.sumForMonth = sumForMonth;
        this.departmentCode = departmentCode;
    }

    public Double getSumForMonth() {
        return sumForMonth;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    @Override
    public void printInfo() {
        System.out.println("Financial Invoice: " + "\n" + "\t" + "Sum for month: " + sumForMonth + "\n" + "\t" +
                "Department Code: " + departmentCode + "\n" + "\t" + "Document Date: " + getDocumentDate()
                + "\n" + "\t" + "Document Number: " + getDocumentNumber());
    }
}
