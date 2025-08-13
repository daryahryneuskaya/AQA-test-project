package Homework_lesson3;

//1 Выведите на экран первые 11 членов последовательности Фибоначчи.

//Определение:
//Последовательность чисел Фибоначчи строится по следующему принципу: первое и второе число равны 0 и 1 (или 1 и 1),
//а каждое последующее число является суммой двух предыдущих.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, … .

public class AdditionalTask1 {
        public static void main(String[] args) {
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
    }
