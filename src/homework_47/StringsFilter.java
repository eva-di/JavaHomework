package homework_47;
/*
Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
 */

import java.util.*;
import java.util.stream.Collectors;

public class StringsFilter {
    public static void main(String[] args) {

    filter();
    }

    private static void filter() {

        List<String> strings = Arrays.asList("ананас", "апельсин", null, "яблоко", "абрикос", "банан", "артишок", "вишня", "груша");

        List<String> filteredStrings = strings.stream()
                .filter(Objects::nonNull)
                .filter(str -> str.toCharArray()[0] == 'а')
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredStrings);
    }
}
