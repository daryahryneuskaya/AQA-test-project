package homework.lesson8.EmployeeContact;


import homework.lesson8.Document.Document;

import java.util.Date;

public class EmployeeContract extends Document {
    private Date finishDate;
    private String employeeName;

    public EmployeeContract(int documentNumber, Date documentDate, Date finishDate, String employeeName) {
        super(documentNumber, documentDate);
        this.finishDate = finishDate;
        this.employeeName = employeeName;
    }


    public Date getFinishDate() {
        return finishDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public void printInfo() {
        System.out.println("Employee Contract: " + "\n" + "\t" + "Finish Date: " + finishDate + "\n" + "\t" +
                "Employee name: " + employeeName + "\n" + "\t" + "Document Date: " + getDocumentDate() + "\n" + "\t"
                + "Document Number: " + getDocumentNumber());
    }
}

