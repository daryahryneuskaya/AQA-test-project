package homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Arrays1Task0();
        System.out.println(".".repeat(25));
        Arrays1Task1();

    }

    public static void Arrays1Task0() {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = n.nextInt();
        int[][][] cube = new int[][][]{
                {
                        {1, 8, 9},
                        {10, 1}
                },
                {
                        {90, 2}
                },
                {
                        {-2, 0, 2}
                },
                {
                        {11, 3, 4}
                },
                {
                        {1}
                }
        };
        for (int[][] outer : cube) {
            for (int[] inner : outer) {
                for (int element : inner) {
                    System.out.println(element + number);
                }
            }
        }
    }

    public static void Arrays1Task1() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W" + " ");
                } else {
                    System.out.print("B" + " ");
                }
            }
            System.out.println();
        }
    }
}
