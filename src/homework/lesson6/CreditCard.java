package homework.lesson6;

public class CreditCard {
    String bankAccountNumber;
    double balance;


    public CreditCard(String bankAccountNum, double initialBalance) {
        bankAccountNumber = bankAccountNum;
        balance = initialBalance;
    }

    public void addMoney(double amount) {
        balance += amount;
        System.out.println(amount + "$ were added to your balance. Your current balance: " + balance + "$");
    }

    public void withdrawMoney(double amount) {
        if(amount > balance){
            System.out.println("You do not have enough money to withdraw!");
            return;
        }
        balance -= amount;
        System.out.println(amount + "$ withdrawn from your balance. Your current balance: " + balance +
                "$");
    }

    public void getInfo(){
            System.out.println("Account number: " + bankAccountNumber + ". Balance: " + balance + "$");
    }
}
