package homework.lesson3;

import java.util.Scanner;

public class OperatorsAndLoops {
    public static void main(String[] args) {

        operatorsTask1(7);
        System.out.println("-".repeat(25));

        operatorsTask2(8);
        System.out.println("-".repeat(25));

        operatorsTask3(9);
        System.out.println("-".repeat(25));

        operatorsTask4(12.4);
        System.out.println("-".repeat(5));

        operatorsTask5(2);
        System.out.println("-".repeat(25));

        loopsTask1();
        System.out.println();

        loopsTask2();
        System.out.println();

        loopsTask3();
        System.out.println("-".repeat(20));

        loopsTask4();

        loopsTask5();
        System.out.println();

        loopsTask6();
        System.out.println();

        additionalTask1();
        System.out.println();

        additionalTask2();
        System.out.println();

        additionalTask3();
    }

    public static void operatorsTask1(int month){
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

    public static void operatorsTask2(int month) {
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

    public static void operatorsTask3(int number){
        System.out.println(number % 2 == 0 ? "You number - Even" : "You number - Odd");
    }

    public static void operatorsTask4(double t){
        if(t > -5){
            System.out.println("Warm");
        } else if (t<= -5 && t > -20){
            System.out.println("Normal");
        } else if (t <= -20){
            System.out.println("Сold");
        }
    }

    public static void operatorsTask5(int number){
        switch(number){
            case 1 -> System.out.println("Your colour - Red");
            case 2 -> System.out.println("Your colour - Orange");
            case 3 -> System.out.println("Your colour - Yellow");
            case 4 -> System.out.println("Your colour - Green");
            case 5 -> System.out.println("Your colour - Blue");
            case 6 -> System.out.println("Your colour - Indigo");
            case 7 -> System.out.println("Your colour - Violet");
            default -> System.out.println("Your number is incorrect");
        }
    }

    public static void loopsTask1(){
        for (int number = 1; number < 100; number++) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
    }

    public static void loopsTask2(){
        for (int number = 5; number >= 1; number--) {
            System.out.print(number + " ");
        }
    }

    public static void loopsTask3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your positive number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i; //sum = sum + i
        }
        System.out.println("Sum: " + sum);
    }

    public static void loopsTask4(){
        int number = 7;
        while (number <= 98) {
            System.out.print(number + " ");
            number += 7;
        }
    }

    public static void loopsTask5(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i * -5 + " ");
        }
    }

    public static void loopsTask6(){
        for (int i = 10; i <= 20; i++){
            System.out.print((i * i) + " ");
        }
    }

    public static void additionalTask1() {
        int firstnumber = 0;
        int secondnumber = 1;
        System.out.print(firstnumber + " " + secondnumber);
        for (int i = 3; i <= 11; i++) {
            int thirdnumber = firstnumber + secondnumber; // следующее число — сумма двух предыдущих
            System.out.print(" " + thirdnumber);
            firstnumber = secondnumber; // сдвигаем первое число
            secondnumber = thirdnumber; // сдвигаем второе число
        }
    }

    public static void additionalTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sum: ");
        float number = scanner.nextFloat();
        System.out.print("Enter month number: ");
        int month = scanner.nextInt();
        float commissionPerMonth = (number * 7) / 100;
        float sum = 0;
        for(int i = 1; i < 12; i++) {
            sum = month * commissionPerMonth;
        }
        System.out.println("Your sum is" + " " + sum);
    }

    public static void additionalTask3() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "х" + j + "=" + (i * j));
            }
        }
    }
}


