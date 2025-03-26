package homework_42.comparator;

import java.util.Arrays;
import java.util.Comparator;

/*
Task 2 * ОПЦИОНАЛЬНО
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Output

 */
public class MyComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer int1, Integer int2) {
        if (int1 % 2 == 0 && int2 % 2 != 0) {
            return -1;
        }
        if (int1 % 2 != 0 && int2 % 2 == 0) {
            return 1;
        }
        return Integer.compare(int1, int2);

    }


    public static void main(String[] args) {

        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        printIntegers(integers);


        Arrays.sort(integers, new MyComparator());

        printIntegers(integers);


    }
    public static void printIntegers(Integer[] integers) {
        System.out.println("=================================");
        System.out.println(Arrays.toString(integers));
        System.out.println("=================================");
    }
}
