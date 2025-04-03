package homework_48.grouping;

import java.util.*;
import java.util.stream.Collectors;

/*
Задания:
Группировка по специальности
Сгруппируй студентов по специальности (поле major) в Map<String, List>.

Группировка по курсу с использованием Set
Сгруппируй студентов по курсу (year), при этом сохрани их в виде Set.

Подсчёт количества студентов по специальности
Построй Map<String, Long>, где ключ — специальность, а значение — количество студентов на этой специальности.

Средний балл по специальности
Построй Map<String, Double>, где ключ — специальность, а значение — средняя оценка студентов на этой специальности.

Список оценок по специальности
Построй Map<String, List>, где хранятся только оценки по каждой специальности.

Суммарная статистика по возрасту
Используй IntSummaryStatistics, чтобы получить:

минимальный возраст,
максимальный возраст,
средний возраст,
общее количество студентов,
сумму всех возрастов.
Требования:
Вся логика должна быть оформлена в main().
Не забудь добавить toString() в класс Student для красивого вывода.
Постарайся использовать Stream API и Collectors как на уроке.
🔄 Дополнительно (по желанию):

Сгруппируй студентов по курсу, и внутри каждого курса сгруппируй по специальности: → Map<Integer, Map<String, List>>

 */
public class StudentGrouping {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("John", 18, "IT", 1, 2.0),
                        new Student("Christina", 20, "IT", 3, 1.6),
                        new Student("Sam", 18, "IT", 1, 2.5),
                        new Student("Dan", 21, "Management", 5, 3.0),
                        new Student("Helen", 21, "Management", 5, 2.0),
                        new Student("Carl", 20, "Management", 4, 2.3),
                        new Student("Steve", 18, "Physics", 1, 1.0),
                        new Student("Maria", 19, "Physics", 3, 3.0),
                        new Student("Ian", 25, "Agriculture", 5, 2.0),
                        new Student(null, 18, "Agriculture", 4, 2.1)

                )
        );

        Map<String, List<Student>> majorSort = students.stream()
                .filter(Objects::nonNull)
                .map(s -> s.getName() == null ? new Student("Unknown", s.getAge(), s.getMajor(), s.getYear(), s.getGrade()) : s)
                .collect(Collectors.groupingBy(Student::getMajor));
        printMap(majorSort);


        Map<Integer, Set<Student>> groupByYear = students.stream()
                .filter(Objects::nonNull)
                .map(s -> s.getName() == null ? new Student("Unknown", s.getAge(), s.getMajor(), s.getYear(), s.getGrade()) : s)
                .collect(Collectors.groupingBy(Student::getYear, Collectors.toSet()));
        printMap(groupByYear);


        Map<String, Long> studentCount = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));
        printMap(studentCount);


        Map<String, Double> averageGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.averagingDouble(Student::getGrade)));
        printMap(averageGrade);


        Map<String, List<Double>> gradesList = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.mapping(Student::getGrade, Collectors.toList())));
        printMap(gradesList);

        IntSummaryStatistics statistics = students.stream()
                .collect(Collectors.summarizingInt(Student::getAge));

        System.out.println("минимальный возраст: " + statistics.getMin());
        System.out.println("максимальный возраст: " + statistics.getMax());
        System.out.println("средний возраст: " + statistics.getAverage());
        System.out.println("общее количество студентов: " + statistics.getCount());
        System.out.println("сумму всех возрастов.: " + statistics.getSum());

        Map<Integer, Map<String, List<Student>>> yearMajorGroup = students.stream()
                .collect(Collectors.groupingBy(Student::getYear,
                        Collectors.groupingBy(Student::getMajor)));
                printMap(yearMajorGroup);


    }



    private static <K, V> void printMap(Map<K, V> map) {
        map.forEach((k, v) -> System.out.println(k +":" + v));
        System.out.println("=====================\n");
}
    }

