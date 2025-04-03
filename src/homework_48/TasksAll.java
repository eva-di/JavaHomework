package homework_48;

import java.util.*;
import java.util.stream.Collectors;

public class TasksAll {
    /*
    Task 1
Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения по значению последней цифры
в числе и выведите результат на экране

Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.

Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2,
и собрать результат в новый список
     */
    public static void main(String[] args) {

        sortedIntegers();
        minLengthString();
        evenNumbers();
    }

    private static void evenNumbers() {

        List<Integer> integers = List.of(0, 3, -25, -7, 22, 8, 10, 45, 100, 69, 11);

        List<Integer> even = integers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(even);

    }

    private static void minLengthString() {
        List<String> strings = Arrays.asList("Hello", "Java", "dog", "I", "JS", null, "Python");

        Optional<String> shortestString = strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));
        System.out.println(shortestString);
    }

    private static void sortedIntegers() {
        List<Integer> integers = List.of(0, 3, -25, -7, 22, 8, 10, 45, 100, 69, 11);

        List<Integer> sortedList = integers.stream()
                .filter(num -> num > 10)
                .sorted(Comparator.comparing(num -> num % 10))
                .collect(Collectors.toList());

        System.out.println("sortedList: " + sortedList);

    }
}
