package lesson_19;

import java.util.Arrays;

/*
ask 2
Написать метод, принимающий на вход массив строк.

Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

public class Task2 {
    public static void main(String[] args) {
        String[] strings = {"One", "Java", "Python", "JS", "Hello"};
        String[] result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n============ testArray = null / length = 0 ==========");
        strings = null;
        strings = new String[0];
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n============ null in array ==========");
        strings = new String[]{"One", "Java", "Python", null, "JS", "Hello"};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n============ null in array is First ==========");
        strings = new String[]{null, "One", "Java", "Python", null, "JS", "Hello"};
//        strings = new String[]{null,  null, null};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));
    }
    public static String[] getArrayWithSmallestStrings(String[] strings) {

        if (strings == null || strings.length == 0) {
            return new String[0]; // []
        }

        String notNullValue = findFirstNotNullValueInArray(strings);
        System.out.println("notNullValue: " + notNullValue);

        if (notNullValue == null) {
            // Весь массив забит налами
            System.out.println("Not-Null not found in array");
            return new String[0]; // []
        }
//        String smallest = strings[0];
//        String biggest = strings[0];

        String smallest = notNullValue;
        String biggest = notNullValue;

        for (int i = 0; i < strings.length; i++) {

            System.out.println("Текущий:" + strings[i] + ", ");

            // null != null  false && ?
            if (strings[i] != null && strings[i].length() < smallest.length()) {
                smallest = strings[i];
            }

            if (strings[i] != null && strings[i].length() > biggest.length()) {
                biggest = strings[i];
            }
        }

        return new String[]{smallest, biggest};
    }

    public static String findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) return strings[i];
        }
        // Если мы перебрали массив и не нашли ни одного не-null значения. Тогда возвращаем null из метода
        return null;
    }

}
