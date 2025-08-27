package homework.lesson6;

import static homework.lesson6.CreditCard.*;

public class MyMain {
    public static void main(String[] args) {

        CreditCard firstCard = new CreditCard("124", 124214);
        CreditCard secondCard = new CreditCard("324234erewr", 3223423);
       CreditCard thirdCard = new CreditCard("234234234", 234324);

        firstCard.addMoney(100);
        System.out.println();
        secondCard.addMoney(1000);
        System.out.println();
        thirdCard.withdrawMoney(20);
        System.out.println();
        firstCard.getInfo();
        secondCard.getInfo();
        thirdCard.getInfo();

        System.out.println(".".repeat(50));

        //TASK 2

        Computer first = new Computer(1200, "EW81IT62");
        System.out.println("First computer info:");
        first.returnInfo();

        RAM ram2 = new RAM("Test2", 16);
        HDD hdd2 = new HDD("Test2", 16, "internal");
        Computer second = new Computer(1500, "UVDI81639", ram2, hdd2);
        System.out.println();
        System.out.println("Second computer info:");
        second.returnInfo();

        //TASK 3

        ATM atm1 = new ATM(2,1,1);
        System.out.println();
        atm1.addMoney(0, 1,0 );
        atm1.withdrawMoney(100);
        atm1.withdrawMoney(100);
        atm1.withdrawMoney(50);
    }
}


