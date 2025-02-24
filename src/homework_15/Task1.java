package homework_15;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task 1
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
         */

        Random rand = new Random();

        int a = rand.nextInt(101);
        int b = rand.nextInt(101);
        int c = rand.nextInt(101);
        int d = rand.nextInt(101);

        System.out.println(a + " | " + b + " | " + c + " | " + d);

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        System.out.println("Максимальное число: " + max);

    }
}
