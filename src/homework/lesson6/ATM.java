package homework.lesson6;

public class ATM {
    int billsNumber20;
    int billsNumber50;
    int billsNumber100;


    public ATM(int billsNumber20, int billsNumber50, int billsNumber100) {
        this.billsNumber20 = billsNumber20;
        this.billsNumber50 = billsNumber50;
        this.billsNumber100 = billsNumber100;
    }

    public void addMoney(int add20, int add50, int add100) {
        billsNumber20 += add20;
        billsNumber50 += add50;
        billsNumber100 += add100;
        System.out.println("Added: 20 - " + add20 + ", 50 - " + add50 + ", 100 - " + add100);
    }

    public boolean withdrawMoney(int amount) {
        int requestedAmount = amount;
        int sum = billsNumber20 * 20 + billsNumber50 * 50 + billsNumber100 * 100;
        if(amount > sum) {
            System.out.println("You cannot withdraw your money!");
            return false;
        }
        int num100 = amount / 100;
        if(num100 > billsNumber100) {
            num100 = billsNumber100;
        }
        amount -= num100 * 100;
        int num50 = amount / 50;
        if(num50 > billsNumber50) {
            num50 = billsNumber50;
        }
        amount -= num50 * 50;
        int num20 = amount /20;
        if(num20 > billsNumber20) {
            num20 = billsNumber20;
        }
        amount -= num20 * 20;
        if(amount > 0){
            System.out.println("Cannot withdraw!");
            return false;
        }
        billsNumber100 -= num100;
        billsNumber50 -= num50;
        billsNumber20 -= num20;
        System.out.println("Withdrawal : 100x" + num100 + ", 50x" + num50 + ", 20x" + num20 +
                " Amount: " + requestedAmount);
        return true;
    }
}
