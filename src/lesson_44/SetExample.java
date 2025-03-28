package lesson_44;

import org.xml.sax.helpers.AttributeListImpl;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        String str = "abc";
        System.out.println(str.hashCode());

        String str2 = "abc";
        System.out.println(str2.equals(str2));
        System.out.println(str2.hashCode());

        System.out.println("=====================================\n");

        /*
        Для корректной работы хеш-Коллекций есть важное правило -
        контракт между методами hashCode() и equals()

        1. Если 2 объекта равны по методу equals(), То их хеш-коды тоже должны быть равны
        2. Если хеш-коды дву объектов различны, то объекты точно не должны быть равны по equals()
        (обратное не всегда верно. Коллизия - разные объекты могу иметь одинаковые хеш-коды.
        3. Вызов метода hashCode должен возвращать одинаковые значения при многократных вызовах на неизмененном объекте.


         */

        // Конструкторы
        Set<Integer> set = new HashSet<>(); // Создает пустой hashSet. Емкость 1 и коэффициент 0.75
        set = new HashSet<>(20); // Создается пустой hashSet с указанной емкостью
        // Принимает коллекцию - создает новый сет (множество), содержащий уникальные элементы из указанной коллекции

        set = new HashSet<>(List.of(1, 2, 3, 5, -10, 6, 5, 6, 3, -25, -4, 6, 0));

        Integer value = 100;
        System.out.println(value.hashCode());

        System.out.println(set); // неупорядоченная коллекция

        List<Integer> startValue = List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32);

        // HashSet - не поддерживает порядок добавления элементов

        Set<Integer> integers = new HashSet<>(startValue);
        System.out.println("hashSet: " + integers);

        // LinkedHashSet - сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValue);
        System.out.println("linkedSet: " + linkedSet);

        // Методы интерфейса Set

        // boolean add(E e) - Добавление элемента
        System.out.println("integers.add(100): " + integers.add(100));
        System.out.println(integers);

        System.out.println("integers.add(100) #2: " + integers.add(100)); // false - элемент не добавлен, так как такое значение уже есть в Set
        System.out.println(integers);

        System.out.println("===========================\n");

        // boolean remove(Object o) - удаляет элемент по значению
        System.out.println("integers.remove(100): " + integers.remove(100));
        System.out.println(integers);


        // boolean contains(Object o) - проверяет присутствие элемента в множестве
        System.out.println("integers.contains(100): " + integers.contains(100));
        System.out.println("integers.contains(32): " + integers.contains(32));

        /*
        int size() - кол-во элементов в set
        boolean isEmpty() - возвращает true, если set не содержит элементов
        clear() - удаляет все элементы
         */

        System.out.println("=======================\n");
        // iterator() - возвращает iterator Для элемента сета
        // наличие итератора позволяет последовательно перебирать все элементы циклом for-each

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            System.out.print(val + ", ");
        }
        System.out.println();
        // ==
        for (Integer valu : integers) {
            System.out.print(valu + ", " );
        }
        System.out.println();

        // Убрать дубликат
        // Написать метод, который принимает список и возвращает список, состоящий только из уникальных элементов начального списка

        System.out.println("startValue" + startValue);
        List<Integer> result = getUniqueList(startValue);

        System.out.println("getUniqueList: " + result);
        result.add(15);
        result.add(15);
        System.out.println(result);


        // SortedSet - расширяет интерфейс Set
        // Элементы упорядочены в соответствии с их естественным порядком (если элементы реализуют Comparable) или копаратором, переданным при создании
        // Реализован в виде бинарного дерева

        // SortedSet Конструкторы
        // Пустой - естественный порядок сортировки
        SortedSet<Integer> sortedSet = new TreeSet<>(); // Пустое упорядоченное множество. Сортировка в соответствии с Comparable

        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);

        System.out.println("sortedSet" + sortedSet);

        // Принимает коллекцию. Создает set из элементов коллекции. Сортировка в естественном порядке.
        sortedSet = new TreeSet<>(startValue);
        System.out.println("sortedSet" + sortedSet);

        // Конструктор с компаратором, определяющим порядок хранения элементов

        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // Будет поддерживаться обратный порядок естественному порядку сортировки
        treeSet.addAll(startValue);
        treeSet.add(10);
        System.out.println("treeSet: " + treeSet);

        treeSet = new TreeSet<>((i1, i2) -> Integer.compare(i2, i1));
        treeSet.addAll(startValue);

        treeSet = new TreeSet<>(startValue);
        System.out.println("treeeSet: " + treeSet);

        // first() - возвращает самый первый (левый) (наименьший с точки зрения компаратора) элемент

        System.out.println("treeSet.first(): " + treeSet.first());

        // last() - возвращает последний (правый/ максимальный с т.зр. компаратора) элемент
        System.out.println("treeSet.last(): " + treeSet.last());

        // SortedSet<E> headSet(E element) - возвращает часть множества, элементы которого строго меньше, чем element
        SortedSet<Integer> headSet = treeSet.headSet(6);
        System.out.println("treeSet.headSet(6): " + headSet);

        // SortedSet<E> tailSet(E element) - элементы, которые больше или равны element
        SortedSet<Integer> tailSet = treeSet.tailSet(6);
        System.out.println("treeSet.tailSet(6): " + tailSet);

        // SortedSet<E> subSet(E from, E to) - возвращает часть множества, элементы которого, находятся в диапазоне from (вкл) to (не вкл)
        SortedSet<Integer> subSet = treeSet.subSet(6, 16);
        System.out.println("treeSet.subSet(6, 16): " + subSet);

        // comparator() - возвращает компаратор, используемый для упорядочивания элементов в этом множестве
        // если используется естественный порядок, то вернется null

        homework("Тестовая 777     строка, со словами!");






    }

    private static void homework(String testStr) {
        // Заменить все НЕбуквы на пустоту
        // Заменить символ, который не являеьтся буквой, цифрой или пробелом на "" (пустоту)
     //   String newString = testStr.replaceAll("[a-zA-Zа-яА-я0-9 ]", "");
        String newString = testStr.replaceAll("[^a-zA-Zа-яА-я0-9 ]", "");
        System.out.println("newString: " + newString);

        // Преобразование строки в массив слов
//        String str = String.join(" ", "Hello", "Java", "Test");
//        System.out.println(str);

        // s+ - "пробельный символ" в количестве 1 или больше
        String[] words = newString.split("\\s+");
        System.out.println(Arrays.toString(words));

        // Arrays.asList(T[] array) - преобразует массив в список (List)
        List<String> list = Arrays.asList(words);
        System.out.println(list);

    }


    private static <T> List<T> getUniqueList(List<T> list) {

        // Получить коллекцию, состоящую из уникальных элементов (убрать дубликаты)
        // PS Позаботиться о сохранении порядка элементов изначального списка
        Set<T> set = new LinkedHashSet<>(list);

        // Преобразовать кол-ию уникальных элементов в список
        return new ArrayList<>(set);
        //return new ArrayList<>(new LinkedHashSet<>(list));


    }
}
