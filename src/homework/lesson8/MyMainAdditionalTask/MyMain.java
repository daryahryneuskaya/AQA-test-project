package homework.lesson8.MyMainAdditionalTask;

import homework.lesson8.ArrayRegister.ArrayRegistry;
import homework.lesson8.EmployeeContact.EmployeeContract;
import homework.lesson8.FinancialInvoice.FinancialInvoice;
import homework.lesson8.Registry;
import homework.lesson8.SupplyContract.SupplyContract;

import java.util.Date;

public class MyMain {
    public static void main(String[] args) {
        Registry registry = new ArrayRegistry(10);
        registry.saveDocument(new SupplyContract(1, "food", 1000, new Date()));
        registry.saveDocument(new EmployeeContract(12, new Date(), new Date(), "Daria"));
        registry.saveDocument(new FinancialInvoice(1000d, new Date(), 11, "5"));
        System.out.println();

        registry.documentInfo(11);
        registry.documentInfo(12);
        registry.documentInfo(1);
        registry.documentInfo(88);
    }
}
