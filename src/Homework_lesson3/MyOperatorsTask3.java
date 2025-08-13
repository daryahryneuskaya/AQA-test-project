package Homework_lesson3;

//3 Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
//Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2').

public class MyOperatorsTask3 {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(number % 2 == 0 ? "Even" : "Odd");
    }
}
