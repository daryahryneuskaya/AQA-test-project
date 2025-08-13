package Homework_lesson3;

//5 По введенному номеру определить цвет радуги (1 –красный, 4 – зеленый и т. д.).
//1 - Красный
//2 - Оранжевый
//3 - Желтый
//4 - Зеленый
//5 - Голубой
//6 - Синий
//7 - Фиолетовый

public class MyOperatorsTask5 {
    public static void main(String[] args) {
        int number = 4;
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
}
