package Homework_lesson3;

//4 Для введенного числа t (температура на улице) вывести
//Если t>–5, то вывести «Тепло».
//Если –5>= t > –20, то вывести «Нормально».
//Если –20>= t, то вывести «Холодно».


public class MyOperatorsTask4 {
    public static void main(String[] args) {
        double t = -20;
        if(t > -5){
            System.out.println("Warm");
        } else if (t<= -5 && t > -20){
            System.out.println("Normal");
        } else if (t <= -20){
            System.out.println("Сold");
        }
    }
}
