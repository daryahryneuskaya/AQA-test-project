package homework.lesson4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        arraysTask0();
        System.out.println();

        arraysTask1();
        System.out.println();

        arraysTask2(2);
        System.out.println();

        arraysTask3();
        System.out.println();

        arraysTask4(1);
        System.out.println();

        arraysTask5();
        System.out.println();

        arraysTask6();
        System.out.println();

        arraysTask7();
    }

    public static void arraysTask0() {
        int[] numbers = new int[] {1, 2, 5, 6, 9, 100, 189};
        System.out.println("Your array is " + Arrays.toString(numbers));
        Scanner input = new Scanner(System.in);
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

    public static void arraysTask1(){
        int[] numbers = {1, 7, 18, 100, 283, 6, 0};
        System.out.println("Your array is " + Arrays.toString(numbers));
        Scanner input = new Scanner(System.in);
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

    public static void arraysTask2(int input){
        System.out.println("Enter array size: ");
        int[] array = new int[input];
        for (int i = 0; i < input; i++) {
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
        double avg = (double) sum / input;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
    }

    public static void arraysTask3(){

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

    public static void arraysTask4(int input){
        if (input <= 5 || input > 10) {
            System.out.println("Your size is incorrect!");
            return;
        }
        int[] array = new int[input];
        for (int i = 0; i < input; i++) {
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
        String[] array = new String[] {"Dasha", "Masha", "Roman", "Tolya"};
        java.util.Arrays.sort(array); //сортировка по алфавиту
        System.out.println(java.util.Arrays.toString(array));
        java.util.Arrays.sort(array, Collections.reverseOrder());
        System.out.println(java.util.Arrays.toString(array)); //сортировка в обратном порядке
    }

    public static void arraysTask7(){
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
