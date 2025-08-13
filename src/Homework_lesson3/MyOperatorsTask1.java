package Homework_lesson3;

//1 Написать программу для вывода названия поры года по номеру месяца.
//При решении используйте оператор switch-case.

public class MyOperatorsTask1 {
    public static void main(String [] args) {
        int month = 1;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Your season is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Your season is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Your season is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Your season is autumn");
                break;
            default:
                System.out.println("Your month number is invalid");
        }
    }
}
