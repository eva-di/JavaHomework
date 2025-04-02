package homework_47;
/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class IntegersFilter {


    public static void main(String[] args) {

    filter();

    }

    private static void filter() {
    List<Integer> integers = Arrays.asList(-100, 0, 5, 99, null, 22, 100, 34, 71, 200, 18);

    List<Integer> filteredInts = integers.stream()
            .filter(Objects:: nonNull)
            .filter(i -> i > 10 && i < 100 && i % 2 == 0)
            .collect(Collectors.toList());

        System.out.println(filteredInts);
    }

}
