package homework.lesson6;

import static homework.lesson6.CreditCard.*;

public class MyMain {
    public static void main(String[] args) {

        CreditCard firstCard = new CreditCard("124",124214);
        CreditCard secondCard = new CreditCard("324234erewr",3223423);
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
    }
}
