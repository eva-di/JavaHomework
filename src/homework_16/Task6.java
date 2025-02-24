package homework_16;

public class Task6 {
    public static void main(String[] args) {
        /*
        Task 6
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
         */

    int[] array = new int[]{5, 6, -25, 0, 31, -15};

    int minIndex = 0;
    int maxIndex = 0;
    int i = 0;

    System.out.print("Исходный массив: [" );

    while (i < array.length) {
        System.out.print(array[i] + (i < array.length -1 ? ", " : "]\n"));
        if (array[i] < array[minIndex]) {
            minIndex = i;
        }
        if (array[i] > array[maxIndex]) {
            maxIndex = i;
        }
        i++;

    }
    int temp = array[minIndex];
    array[minIndex] = array[maxIndex];
    array[maxIndex] = temp;
    System.out.print("Измененный массив: [");
    i = 0;
    while (i < array.length) {
        System.out.print(array[i] + (i < array.length -1 ? ", " : "]\n"));
        i++;
    }
    System.out.println();

    }
}
