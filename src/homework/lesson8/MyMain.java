package homework.lesson8;

import homework.lesson8.ArrayRegister.ArrayRegistry;
import homework.lesson8.EmployeeContact.EmployeeContract;
import homework.lesson8.FinancialInvoice.FinancialInvoice;
import homework.lesson8.SupplyContract.SupplyContract;

import java.util.Date;

public class MyMain {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new Triangle(3, 4, 5),
                new Rectangle(2, 7),
                new Circle(1.7),
                new Rectangle(1, 5),
                new Circle(2)
        };

        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.calculatePerimeter();
        }
        System.out.println("Total perimeter of all 5 figures: " + totalPerimeter);
        System.out.println();

        //TASK 2

        PrintJobTitle[] jobs = new PrintJobTitle[]{
                new Accountant(),
                new Director(),
                new Employee()
        };
        for (PrintJobTitle job : jobs) {
            job.printInfo();
        }
    }
}
