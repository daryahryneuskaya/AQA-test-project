package Homework_lesson3;

// 2 За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
// А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.


import java.util.Scanner;

public class AdditionalTask2 {
    public static void main(String[] args) {
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
}
