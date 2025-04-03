package lesson_48.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TasksAll {
    public static void main(String[] args) {
        String test = "Hello";
        System.out.println(test.substring(0, 1)); // substring возвращает строку

        // проверяет, заканчивается ли строка
        System.out.println(test.endsWith("llo"));
        System.out.println(test.endsWith("ll"));
        // проверяет, начинается ли строка
        System.out.println(test.startsWith("H"));
        // Проверяет, содержит ли другую строку
        System.out.println(test.contains("llo"));

        System.out.println("======================\n");

        List<String> strings = List.of("test", "Abba", "Arrow", "Java", "a", "A", "annotation");
        System.out.println(filterString(strings));

        List<Person> people = new ArrayList<>(
                List.of(
                        new Person("Person", 21, "Munich"),
                        new Person("Person2", 28, "Berlin"),
                        new Person("Person3", 27, "Munich"),
                        new Person("Person4", 25, "berlin"),
                        new Person("Person5", 19, "Berlin"),
                        new Person("Person6", 45, null)

                )
        );
        people.add(null);
        System.out.println(filterPerson(people, 25, "Berlin"));

    }

    public static List<Integer> filterIntegers(List<Integer> integers) {
        return  integers.stream()
                .filter(i -> i > 10 && i < 100)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

    }

    public static List<String> filterString(List<String> strings) {

        String findMe = "А";

        return strings.stream()
        //        .filter(s -> s.charAt(0) == 'а')
                //.filter(s -> s.substring(0, 1).equalsIgnoreCase("A"))
                // проверяет, заканчивается ли строка на другую строку
                // .filter(s -> s.toUpperCase().startsWith("A"))
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Person> filterPerson(List<Person> people, int age, String city) {
        return people.stream()
                .filter(Objects::nonNull)
                .filter(person -> person.getAge() > 25)
                .filter(p -> Objects.nonNull(p.getCity()))
                .filter(person -> person.getCity().equalsIgnoreCase(city))

                .collect(Collectors.toList());
    }
}
