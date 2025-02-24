package homework_17;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[50];
        System.out.print("Массив: [");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
            System.out.print(array[i] + (i < array.length - 1 ? ", " : "]\n"));
        }
        int count = 0;
        System.out.print("Простые числа: ");

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num > 1) {
                int divisor = 0;
                for (int x = 2; x <= num / 2; x++){
                    if (num % x == 0) {
                        divisor++;
                        break;
                    }
                }
                if (divisor == 0) {
                    System.out.print(num + " ");
                    count++;
                }
            }
        }

        System.out.print("\nКоличество простых чисел: " + count);
        }
    }
    /*
    Task 4 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. Программа должна найти,
и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.

Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
     */



