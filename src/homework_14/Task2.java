package homework_14;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        /*
        Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.

Проверьте:

равны ли переменные,
не равны ли они,
больше ли a, чем b,
и меньше ли b, чем a.
Выведите результат на экран.
         */

        Random random = new Random();

        int a = random.nextInt(51);
        int b = random.nextInt(101);

        System.out.println("Число 1: " + a);
        System.out.println("Число 2: " + b);

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("b < a: " + (b < a));

        System.out.println("\n===================\n");

        b = random.nextInt(71) - 20;
        System.out.println("b в диапазоне от -20 до 50: " + b);

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("b < a: " + (b < a));




    }
}
