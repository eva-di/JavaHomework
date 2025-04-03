package consultaion_20;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class ReduceExample {
    /*
    Аккумулирующие методы (накопительные)

    - эти методы используются для вычисления одного значения на основании данных потока (и некого начального значения)

    Optional<T> reduce(BinaryOperator<T> accumulator) - выполняет свертку (аккумулирование) элементов потока

   T reduce(T identity, BinaryOperator<T> accumulator) - выполняет свертку (аккумулирование) элементов потока

    BinaryOperator<T> - функциональный интерфейс который является спец формой интерфейса BiFunction<T, A, R> (возвращает объекты 3 типа)
    Используется, когда 2 объекта одного типа объединяются и возвращается объект того же типа
     */

    public static void main(String[] args) {

//        task();
//        task1();
        task3();

        // Тернарный оператор - альтернатива оператору if с двумя ветками

       /*
        if (условие) {

          // true
        } else {
            // else
        }

        */

        Random rand = new Random();

        String result; // положительное / отрицательное
        int x = rand.nextInt();
        System.out.println("x: " + x);

//        if (x >= 0) {
//            result = "положительное";
//        } else {
//            result = "отрицательное";
//        }
        // Тернарный оператор
        result = x >= 0 ? "положительное" : "отрицательное";

        System.out.println("result: " + result);

        System.out.println(ternary(x));

    }
    public static String ternary(int x) {

        return x >= 0 ? "+" : "-";
//        if (x >= 0) {
//            return "положительное";
//        } else {
//           return  "отрицательное";
//        }
    }

    private static void task3() {
// Можно использовать для нахождения максимума. Происходит не накопление, а замена значения переменной
        List<String> strings = List.of("Java", "Kotlin", "Python", "longestString");

        Optional<String> longest = strings.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);

        System.out.println(longest);
    }

    private static void task1() {
        List<String> strings = List.of("Java", "Kotlin", "Python");
        Optional<String> concat = strings.stream()
                .reduce((s1, s2) -> s1 + " " + s2);
        System.out.println(concat);

        String conat2 = strings.stream()
                .reduce("", (s1, s2) -> s1 + " " + s2);
        System.out.println(conat2);
    }

    private static void task() {

        List<Integer> integers = List.of(1, 2, 3 ,4 , 5, 6, 7, 8, 9);
        // посчитать сумму всех элементов, которые кратные трем
        // 3, 6, 9, 12, 15
        // res - 45

        Optional<Integer> sum = integers.stream()
                .filter(i -> i % 3 == 0)
                .peek(System.out::println)
                .reduce((i1, i2) -> i1 + i2);
        System.out.println(sum);


        // ==
        // res = 0 -> 18
        // 3, 6, 9
        Integer sum2 = integers.stream()
                .filter(i -> i % 3 == 0)
                .reduce(0, (i1, i2) -> i1 + i2);

        System.out.println("sum2: " + sum2);
    }
}
