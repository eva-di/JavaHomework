package lesson_48;

import lesson_47.Cat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Stream API - мощный инструмент, позволяющий обрабатывать наборы данных в декларативном стиле

Основная идея - преобразование последовательности элементов через набор операций.

Stream (поток) - поток данных представляет последовательность элементов.
Дает возможность поочередно получать элементы для обработки из этого набора (альтернатива циклам, условиям).
Стримы могут быть созданы из различных источников (коллекции, массивы, файлы, консоль и т.п.)

Pipeline - последовательность операций, которые и будут выполняться на потоке

Промежуточные операции/ методы (intermediate operations) - это операции, которые преобразуют поток в другой поток (возвращают поток)
Их может быть много (больше 1).

Терминальные операции/ методы - Это операции, которые запускают обработку потока и закрывают его.
После выполнения терминальной операции поток перестает быть доступным для дальнейшей обработки.
Может быть только ОДНА терминальная операция.

Ленивые вычисления
Стримы не выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод



 */
public class StreamExamplePart2 {

    private static Stream<String> catStream;

    /*
        Промежуточные методы (ВСЕ ВОЗВРАЩАЮТ ПОТОК):

        Stream<T> filter(Predicate<T> predicate)
        - принимает объект класса, который должен реализовать интерфейс предикат
        Оставляет в потоке только те элементы, для которых предикат вернет true.
        т.е. оставляет элементы, удовлетворяющие условию. (Отбрасывает элементы, не удовлетворяющие условию - фильтрует).

        sorted()
        - сортирует поток в естественном порядке
        sorted(Comparator<T> comparator)
        - сортирует элементы потока с использованием Comparator

        Stream<R> map(Function<T, R> action)
        - преобразует элементы потока с использование м заданной функции, в том числе в другой тип данных

        Stream<T> peek(Consumer<T> action)
        - выполняет действие для каждого элемента потока.
         Действие, как правило, не изменяющую элемент.

         distinct() - удаляет дубликаты из потока. Сравнение (определение равенствоа) через equals

         limit(long maxSize) - ограничивает количество элементов потока. В потоке может быть не больше maxSize элементов

        skip(long n) - отбрасывает(пропускает) первые n элементов потока

        Stream<T> mapToObj(Function() mapper) - преобразование примитивного типа данных в ссылочный
        при помощи заданной функции
        boxed() - преобразует поток примитивов (IntStream...) в поток соответствующих оберток (Stream<Integer>)
        mapToInt() - преобразует поток Stream<TInteger> в поток примитивов IntSream

        -----

        Терминальные методы:

        R collect(Collector<T, A, R> collector)
        - преобразует элементы потока в разные виды коллекций или другие структуры данных

        void foreach(Consumer<T> action) - выполняет заданное действие для каждого элемента

        Optional<T> max(Comparator<T> comparator) - возвращает элемент с максимальным значением (самое правое) по мнению компараьтора
        Optional<T> min(Comparator<T> comparator) - возвращает элемент с минимальным значением (самое левое) по мнению компараьтора

        long count() - посчитать количество элементов в потоке

        Optional<T> findFirst - получить первый элемент потока
        Optional<T> findAny- получить случайный элемент потока
         */
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task12();
//        task13();
//        task14();
//        task15();
        task16();

    }

    private static void task16() {
        int[] ints = {1, 2, 3, 4, 5, 6 ,7 , 8, 9};
        // преобразовать массив примитивов в список (коллекцию), используя Stream API
        // Stream<int> - не бывает. IntStream, DoubleStream, LongStream... - бывают потоки примитивов

        List<Integer> integers = Arrays.stream(ints)
               // .mapToObj(i -> Integer.valueOf(i))
               // .mapToObj(Integer:: valueOf)
                // Работает автоупаковка
               // .mapToObj(i -> i)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("integers: " + integers);

        // получить из коллекции Integer массив примитивов
        int[] intArray = integers.stream()
                // хочет поток примитивов, который он запакует в массив
                //автораспаковка
                .mapToInt(i -> i)
                .toArray();
        System.out.println("массив:  " + Arrays.toString(intArray));
    }


    private static void task15() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, -25);

        // получить первый самый левый элемент потока

        // Альтернативный способ нахождения минимума
        Optional<Integer> first = integers.stream()
                .sorted()
                //.findFirst(); // получить первый элемент потока
        .findAny(); // получить случайный (по сути первый) элемент потока
        int min = first.get();
        System.out.println("min: " + min);


    }

    private static void task14() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, -25);
        // Получить список из 3 самых маленьких чисел списка

        // {-1, -3}
        // {-25, -10, -5 , 0, ... 56}
        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("smallest: " + smallest);

        // получить список чисел, отбросив 2 самых маленьких
        // {-5, 0...56}
        List<Integer> list = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("list: " + list);
    }

    private static void task13() {

        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, -25);

        // Посчитать количество четных чисел, используя Stream API
        long count = integers.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("count: " + count);
    }

    private static void task12() {
        List<Cat> cats = getListCats();

        // Найти самое длинное имя кота из списков котов
        /*
        Stream Cat -> Stream имен
        Найти самое длинное имя (сравнивать имена по их длине)
                */
        Optional<String> longNameOpt = cats.stream()
                .filter(Objects::nonNull) // проверка объектов типа Cat на null
                .map(cat -> cat.getName())
                // .map(Cat::getName)
                .filter(Objects::nonNull) // проверка имен на null
                .max(Comparator.comparing(String::length));
                //.max((name1, name2) -> name1. length() - name2.length());
               // .max((name1, name2) -> Integer.compare(name1.length(), name2.length()))

        if (longNameOpt.isPresent()) {
            System.out.println(longNameOpt.get());
        } else {
            System.out.println("Ктов с именами не найдено");
        }

        String longestName = cats.stream()
                .map(Cat::getName)
                .max(Comparator.comparing(String::length))
                .orElse(null);
               // .orElse("");

        System.out.println("longestName: " + longestName);
    }

    private static void task11() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, -25);

        // найти макс число из списка
        Optional<Integer> max = integers.stream()
                .max(Comparator.naturalOrder());

        System.out.println("max: " + max);
        System.out.println("max: " + max.orElse(null));

        // Найти самое  маленькое число в потоке, которое больше 100
        Optional<Integer> minValue = integers.stream()
                .filter(n -> n > 100)
                .min(Integer::compareTo);
        System.out.println("minVal: " + minValue);
        System.out.println("minValue: " + minValue.orElse(null));

    }

    private static void task10() {

        // Удалить дубликаты (повторяющиеся значения из списка)
        List<Integer> integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);
        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);

        System.out.println("===============\n");
        lesson_47.Cat cat = new lesson_47.Cat("Bear", 5, "braun");
        lesson_47.Cat cat1 = new lesson_47.Cat("Python", 7, "green");
        lesson_47.Cat cat2 = new lesson_47.Cat("Tiger", 3, "yellow");
        lesson_47.Cat cat3 =  new lesson_47.Cat("Panda", 4, "black");
        lesson_47.Cat cat4 =  new lesson_47.Cat("Panda", 4, "black");

        List<lesson_47.Cat> cats = Arrays.asList(cat, cat1, cat2, cat3, cat4, cat);

        cats.forEach(System.out::println);
        System.out.println("====================filter=================\n");

        cats.stream()
                .distinct()
                .forEach(System.out::println);

    }

    private static void task9() {
        // создание стрима из Мфр
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);
        // создание стрима из элементов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("map: " + map);
    }

    private static void task8() {
        lesson_47.Cat cat = new lesson_47.Cat("Bear", 5, "braun");
        lesson_47.Cat cat1 = new lesson_47.Cat("Python", 7, "green");
        lesson_47.Cat cat2 = new lesson_47.Cat("Tiger", 3, "yellow");
        lesson_47.Cat cat3 =  new lesson_47.Cat("Panda", 4, "black");

        lesson_47.Cat[] cats = {cat, cat1, null, cat2, cat3, new lesson_47.Cat(null, 10, "red")};

        // получить список кошек, имя которых длиннее 4 символов

        // Arrays.stream(cats) - создает поток из элементов массива

        List<lesson_47.Cat> longCats = Arrays.stream(cats)
               // .filter(c -> c != null)// оставить в потоке только не null
               // .filter(c -> Objects.nonNull(c))
                .filter(Objects::nonNull) // оставить в потоке не null
                .filter(c -> Objects.nonNull(c.getName())) // проверка какого-то поля на null
                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());
        /*
        Objects.nonNull(null) вернет true, если параметр не null
        Objects.isNull(null) вернет true, если параметр null
         */

        System.out.println(longCats);
    }

    private static void task7() {
        List<lesson_47.Cat> cats = getListCats();
        // Вывести на экран имена котов, чей вес меньше 5
        // Вывести на экран котов, оставшихся в потоке после фильтрации

        Stream<String> catStream = cats.stream()
                .peek(System.out::println)
                .filter(c -> c.getWeight() < 5)
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(c -> c.getName());

        /*
        peek - промежуточный метод. Используется для отладки. Не закрывает поток
        foreach - терминальный методаа. Для выполнения действий с каждым элементом потока
         */
        catStream.forEach(name -> System.out.println("Terminal: " + name));




    }

    private static void task6() {
        List<lesson_47.Cat> cats = getListCats();
        //Получить список имен кошек, у которых имена короче 5 символов
        /*
        Классический подход - методы фильтрации должны выполняться в потоке как можно раньше
        Эффективность
         */
        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(lesson_47.Cat::getName)
                .collect(Collectors.toList());
        System.out.println(names1);
        /*
        Читаемость, понимание кода
         */
        System.out.println("==================");
        List<String> names2 = cats.stream()
                .map(lesson_47.Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println(names2);
    }

    private static void task5() {

        List<lesson_47.Cat> cats = getListCats();
        /*
        получить список имен кошек, чей вес больше 4
        Создать поток кошек
        Оставить кошек, чй вес больше 4
        Изменить тип потока - Cat -> String (name)
        Собрать в список
         */
        List<String> catList = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(lesson_47.Cat::getName)
                // = .map -> cat.getNamme()
                .collect(Collectors.toList());
        System.out.println("catList: " + catList);
    }

    private static void task4() {

        List<lesson_47.Cat> cats = getListCats();

        // Список имен всех кошек
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(lesson_47.Cat::getName)
                .collect(Collectors.toList());

        System.out.println("catNames: " + catNames);

        // изначальная коллекция (источник данных для потока не изменяется)
        System.out.println(cats);

//        List<String> listName = new ArrayList<>();
//        for (Cat cat : cats) {
//            listName.add(cat.getName());
//        }

    }

    private static void task3() {
        List<lesson_47.Cat> cats = getListCats();
        // Оставить котов с именем, длиннее 4 символов
        Stream<lesson_47.Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);
        // пока не запущен терминальный метод, промежуточные операции не выполняются
        List<lesson_47.Cat> longNames = stream.collect(Collectors.toList());
        System.out.println("longNames: " + longNames);
    }

    private static List<lesson_47.Cat> getListCats() {
        return List.of(
                new lesson_47.Cat("Bear", 5, "braun"),
                new lesson_47.Cat("Python", 7, "green"),
                new lesson_47.Cat("Tiger", 3, "yellow"),
                new lesson_47.Cat("Panda", 4, "black")
        );
    }

    private static void task2() {
        List<lesson_47.Cat> cats = getListCats();

        //Список кошек с весом больше 4
        Stream<lesson_47.Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // теминальный метод
        List<lesson_47.Cat> fatCats = catStream.collect(Collectors.toList());
        //List<Cat> fatCats = catStream.toList(); // Java 17+ collect(Collectors.toList()); замененн на toList();

        System.out.println("fatCats: " + fatCats);

        // Повторно использовать закрытый поток нельзя (на котором уже был вызван терминальный метод)
        List<Cat> catList2 = catStream.sorted().collect(Collectors.toList()); // будет ошибка (исключение)
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 99);
        // Получить список, содержащий все положительные числа из исходного списка.
        // Список должен быть отсортирован в порядке возрастания.

        List<Integer> result = new ArrayList<>();
        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }
        result.sort(Comparator.naturalOrder());
        System.out.println("result: " + result);

        // У всех коллекций есть метод .stream() создающий поток (стрим) из элементов коллекции

        List<Integer> integerList = integers.stream() // создание потока из элементов коллекции List
                .filter(e -> e > 0) // фильтрация элементов потока
                .sorted() // сортировка элементов в естественном порядке
                .collect(Collectors.toList()); // собиает элементы потока в коллекцию List

        System.out.println("list: " + integerList);

    }


}
