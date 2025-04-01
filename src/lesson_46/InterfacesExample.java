package lesson_46;

// Stream.API - Функциональный интерфейс Function, Predicate, Consumer - являются частью Java Lambda Expression, введенные в Java 8
    // Имплементации этих интерфейсов применяются, когда метод принимает интерфейс в качестве параметров
    // Функциональный интерфейс - в нем ровно 1 абстрактный метод, можно написать на лету в лямбде

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfacesExample {

    public static void main(String[] args) {

        // Consumer<T> - выполняет операцию над объектом типа Т, не возвращая никакого результата
        // void accept(T t)

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string + "!!!");

            }
        };

        example = string -> System.out.println(string + "!!!");

        example.accept("Hello World!");
        example.accept("Java");


        // Cоставной интерфейс
        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");

        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");

        System.out.println("===========================\n");
        // Predicate<T> - проверка объекта на соответствие условию (тестирование)
        // boolean test(T T) - основной (абстрактный) метод
        /*
        and() - Логическое И
        or() - логическое ИЛИ
        negate() - логическое отрицание
         */

        Predicate<String> examoplePredicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        };
        Predicate<String> isShort = str -> str.length() < 3;
        boolean result = isShort.test("Java");
        System.out.println("isShort.test(\"Java\"): " + result);
        System.out.println("isShort.test(\"JS\"): " + isShort.test("JS"));

        List<Integer>  list = new ArrayList<>(List.of(-1, 3, -4, 0, 34, -45, 11, 45, 10, -50, 12, 36, 4));

        // список всех отрицательных чисел
        List<Integer> res = filterListByPredicate(list, i -> i < 0);
        System.out.println("filterListByPredicate(list, i -> i < 0): " + res);

        // Список всех нечетных чисел
        res = filterListByPredicate(list, val -> val % 2 != 0);
        System.out.println("filterListByPredicate(list, val -> val % 2 != 0): " + res);


        // список всех четных чисел больше 5
        res = filterListByPredicate(list, val -> val % 2 == 0 && val > 5);
        System.out.println(res);

        System.out.println("===============\n");

        Predicate<String> isLongString = string -> string.length() > 4;
        Predicate<String> isContainsJava = str -> str.contains("Java");

        Predicate<String> combinePredicate = isLongString.and(isContainsJava);

        String  word = "Java!";

        System.out.println("combinePredicate.test(word): " + combinePredicate.test(word));

        Predicate<String> combine2 = isContainsJava.negate();
        System.out.println("combine2 = isContainsJava.negate(): " + combine2.test(word));

        System.out.println("\n=========Function==========");

        // Function<T, R> - производит операцию над объектом типа Т, возвращает результат типа R
        // R apply(T t)

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return 0;
            }
        };

        integerFunction = string -> string.length();
        int len = integerFunction.apply("Hello World!");
        System.out.println("integerFunction.apply(\"Hello World!\"): " + len);

        Function<String, String> toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.apply("Hello World!"));
        // Function<String,String> toUpper = String::toUpperCase();






    } // EndClass

    // Метод должен возвращать список объектов, удовлетворяющих условиям/ требованиям (прошедших проверку предикатов)

    public static List<Integer> filterListByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer value : integers) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }
        return result;
    }


}
