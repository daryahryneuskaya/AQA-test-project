package homework.lesson3;

import java.util.Scanner;

public class OperatorsAndLoops {
    public static void main(String[] args) {
        // call the method you want to validate
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
        System.out.println(number % 2 == 0 ? "Even" : "Odd");
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
            case 1 -> System.out.println("Red");
            case 2 -> System.out.println("Orange");
            case 3 -> System.out.println("Yellow");
            case 4 -> System.out.println("Green");
            case 5 -> System.out.println("Blue");
            case 6 -> System.out.println("Indigo");
            case 7 -> System.out.println("Violet");
            default -> System.out.println("Your number is incorrect");
        }
    }

    public static void loopsTask1(){
        for (int number = 1; number < 100; number++) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
    }

    public static void loopsTask2(){
        for (int number = 5; number >= 1; number--) {
            System.out.println(number);
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
            System.out.println(number);
            number += 7;
        }
    }

    public static void loopsTask5(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i * -5);
        }
    }

    public static void loopsTask6(){
        for (int i = 10; i <= 20; i++){
            System.out.println(i * i);
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
        float commissionpermonth = (number * 7) / 100;
        float sum = 0;
        for(int i = 1; i < 12; i++) {
            sum = month * commissionpermonth;
        }
        System.out.println(sum);
    }

    public static void additionalTask3() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "х" + j + "=" + (i * j));
            }
        }
    }
}


