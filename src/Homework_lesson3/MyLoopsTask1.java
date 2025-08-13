package Homework_lesson3;

//1 При помощи цикла for вывести на экран нечетные числа от 1 до 99
//При решении используйте операцию инкремента (++).

public class MyLoopsTask1 {
    public static void main(String[] args) {
        for (int number = 1; number < 100; number++) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
    }
}
