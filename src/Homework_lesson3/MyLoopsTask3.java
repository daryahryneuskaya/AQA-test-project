package Homework_lesson3;

//3 Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до
//введенного пользователем числа.
//Для ввода числа воспользуйтесь классом Scanner.

import java.util.Scanner;

public class MyLoopsTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your positive number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i; //sum = sum + i
        }
        System.out.println("Sum: " + sum);
    }
}
