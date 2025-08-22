package homework.lesson4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        arraysTask0(input);
        System.out.println();

        arraysTask1(input);
        System.out.println();

        arraysTask2(input);
        System.out.println();

        arraysTask3();
        System.out.println();

        arraysTask4(input);
        System.out.println();

        arraysTask5();
        System.out.println();

        arraysTask6();
        System.out.println();

        arraysTask7();

        input.close();
    }

    public static void arraysTask0(Scanner input) {
        System.out.println("TASK 0: Создайте массив целых чисел. Напишете программу, которая выводит " +
                "сообщение о том, входит ли заданное число в массив или нет.\n" +
                "Пусть число для поиска задается с консоли (класс Scanner).\n");
        int[] numbers = new int[] {1, 2, 5, 6, 9, 100, 189};
        System.out.println("Your array is " + Arrays.toString(numbers));
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        boolean found = false;
        for (int num : numbers) {
            if (num == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Your number is in the array");
        } else {
            System.out.println("Your number is not in the array");
        }
    }

    public static void arraysTask1(Scanner input){
        System.out.println("1 Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.\n" +
                "Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом. " +
                "В результате должен быть новый массив без указанного числа.\n");
        int[] numbers = {1, 7, 18, 100, 283, 6, 0};
        System.out.println("Your array is " + Arrays.toString(numbers));
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        int count = 0;
        for (int num : numbers) {
            if (num == number) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Your number is not in the array");
        } else {
            int[] result = new int[numbers.length - count];
            int i = 0;
            for (int num : numbers) {
                if (num != number) {
                    result[i++] = num; // записываем только нужные
                }
            }
            System.out.println("New array without " + number + ": " + java.util.Arrays.toString(result));
        }
    }

    public static void arraysTask2(Scanner input){
        System.out.println("2 Создайте и заполните массив случайным числами и выведете максимальное, минимальное и " +
                "среднее значение.\n" +
                "Для генерации случайного числа используйте метод Math.random().\n" +
                "Пусть будет возможность создавать массив произвольного размера.\n" +
                "Пусть размер массива вводится с консоли.\n");
        System.out.print("Enter your array size: ");
        int number = input.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Your array is: " + java.util.Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }
        double avg = (double) sum / number;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
    }

    public static void arraysTask3(){
        System.out.println("3 Создайте 2 массива из 5 чисел.\n" +
                "Выведите массивы на консоль в двух отдельных строках.\n" +
                "Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это " +
                "значение оказалось больше (либо сообщите, что их средние арифметические равны).\n");

        int[] array1 = new int[]{1, 3, 4, 100, 2};
        int[] array2 = new int[]{1, 6, 4, 100, 2};
        System.out.println(java.util.Arrays.toString(array1));
        System.out.println(java.util.Arrays.toString(array2));
        double sum1 = 0;
        double sum2 = 0;
        for (int j : array1) {
            sum1 += j;
        }
        double avg1 = sum1 / 5;
        for (int j : array2) {
            sum2 += j;
        }
        double avg2 = sum2 / 5;
        if (avg1 > avg2) {
            System.out.println("Arithmetic average of the first array is greater!");
        } else if (avg2 > avg1) {
            System.out.println("Arithmetic average of the second array is greater!");
        } else {
            System.out.println(("Arithmetic average of the first array is equal to the arithmetic average " +
                    "of the second array!"));
        }
    }

    public static void arraysTask4(Scanner input){
        System.out.println("4 Создайте массив из n случайных целых чисел и выведите его на экран.\n" +
                "Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10" +
                " Если n не удовлетворяет условию - выведите сообщение об этом.\n" +
                "Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод." +
                " Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его" +
                " на экран.\n");
        System.out.print("Enter array size: ");
        int n = input.nextInt();
        if (n <= 5 || n > 10) {
            System.out.println("Your size is incorrect!");
            return;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Your array is: " + java.util.Arrays.toString(array));
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No even numbers in the array.");
        } else {
            int[] evenArray = new int[count];
            int index = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    evenArray[index++] = num;
                }
            }
            System.out.println("Even numbers array: " + java.util.Arrays.toString(evenArray));
        }
    }

    public static void arraysTask5(){
        System.out.println("5 Создайте массив и заполните массив.\n" +
                "Выведите массив на экран в строку.\n" +
                "Замените каждый элемент с нечётным индексом на ноль.\n" +
                "Снова выведете массив на экран на отдельной строке.\n");
        int[] array = {1, 4, 6, 7, 10};
        System.out.println("Original array: " + java.util.Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Modified array: " + java.util.Arrays.toString(array));
    }

    public static void arraysTask6(){
        System.out.println("6 Создайте массив строк. Заполните его произвольными именами людей.\n" +
                "Отсортируйте массив.\n" +
                "Результат выведите на консоль.\n");
        String[] array = new String[] {"Dasha", "Masha", "Roman", "Tolya"};
        java.util.Arrays.sort(array); //сортировка по алфавиту
        System.out.println(java.util.Arrays.toString(array));
        java.util.Arrays.sort(array, Collections.reverseOrder());
        System.out.println(java.util.Arrays.toString(array)); //сортировка в обратном порядке
    }

    public static void arraysTask7(){
        System.out.println("7.Реализуйте алгоритм сортировки пузырьком.\n");
        int[] numbers = new int[] {5, 3, 8, 4, 2};
        System.out.println("Your array is " + Arrays.toString(numbers));
        for(int i = 0; i < numbers.length -1; i++){
            for(int j = 0; j < numbers.length - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    int temp = numbers[j]; // сохраняем текущее значение
                    numbers[j] = numbers[j + 1]; // на место текущего кладём следующий
                    numbers[j + 1] = temp; //а на место следующего кладём сохранённое
                }
            }
        }
        System.out.println("Sorted array: " + java.util.Arrays.toString(numbers));
    }
}
