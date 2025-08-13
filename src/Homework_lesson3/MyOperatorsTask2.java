package Homework_lesson3;

//2 Написать программу для вывода названия поры года по номеру месяца.
//При решении используйте оператор if-else-if.

public class MyOperatorsTask2 {
    public static void main(String[] args) {
        int month = 8;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Your season is winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Your season is spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Your season is summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Your season is autumn");
        } else {
            System.out.println("Your month number is invalid");
        }
    }
}
