package homework_16;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        /*
        Task 5
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

- Минимальное значение в массиве
- Максимальное значение в массиве
- Среднее арифметическое всех значений в массиве
         */
    Random random = new Random();

    int length = random.nextInt(11) + 5;
    int[] array = new int[random.nextInt(11) + 5];
    int i = 0;

    System.out.print("Массив: [");

    while (i < array.length) {
        array[i] = random.nextInt(101) - 50;
        System.out.print(array[i] + (i < array.length -1 ? ", " : "]\n"));
        i++;
    }
    System.out.println();


    int min = array[0];
    int max = array[0];
    int sum = array[0];

    i = 1;

    while (i < array.length) {
        sum += array[i];

        if (array[i] < min) {
            min = array[i];
        }

        if (array[i] > max) {
            max = array[i];
        }
        i++;

    }

    double average = (double) sum / array.length;

    System.out.println("Минимальное значение из списка: " + min);
    System.out.println("Максимальное значение из списка: " + max);
    System.out.println("Среднее арифметическое: " + average);

    }
}
