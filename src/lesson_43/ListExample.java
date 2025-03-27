package lesson_43;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        // Конструкторы
        // Конструктор ArrayList

        List<Integer> list = new ArrayList<>(); // Создает пустой список (с начальной емкостью 10 элементов)
        list = new ArrayList<>(50); // Пустой список, но с указанной емкостью
        // Создает список содержащий все элементы указанной коллекции
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100)); // Принимает коллекцию

        // Конструкторы LinkedList
        list = new LinkedList<>(); // Создает пустой список (внутренняя реализация - двусвязный список)
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100)); //  Создает список, содержащий все элементы указанной коллекции

        // Методы интерфейса List

        // bolean add (E e) - добавляет элемент в конец списка
        list.add(1000);
        list.add(-100);
        System.out.println("list: " + list);

        // void add(int index, E element) - добавляет элемент на указанную позицию перед index (не переписывает)
        list.add(3, 500);

        System.out.println("list: " + list);

        // E get(int index) - возвращает элемент по индексу
        int value = list.get(5);
        System.out.println("list.get(5): " + value);

        // E remove(int index) - удаляет элемент по указанному индексу и возвращает старое значение
        System.out.println(list.remove(5));
        System.out.println(list);

        // boolean remove(Object obj) - метод удаления по значению (метод из интерфейса Collection) - принимает ссылочный тип данных
        System.out.println(list.remove(Integer.valueOf(0)));
        System.out.println(list);

        // Поиск элемента по значению и возвращает index
        // int indexOf(Object obj) - первое вхождение
        // int lastIndexOf(Object obj) - последнее вхождение

        System.out.println("list.indexOf(значение, которого нет) " + list.indexOf(4000)); // -1 - Значение не найдено
        System.out.println("list.indexOf(значение, которого нет) " + list.indexOf(-100));
        System.out.println("list.lastIndexOf(-100): " + list.lastIndexOf(-100));

        // void sort(Comparator<? super E> comparator) - сортирует список с использование указанного компаратора

        list.sort((i1, i2) -> Integer.compare(i2, i1));
        // == list.sort((Comparator.reverseOrder()));

        System.out.println(list);

        list.sort(Integer::compareTo);
        // == list.sort(Comparator.naturalOrder());
        System.out.println(list);

        // List<E> subList(int idxFrom, int idxTo) - возвращает список из элементов, находящихся на позициях от индекс ... до индекс ...
        List<Integer> subList = list.subList(1, 5);
        System.out.println("list.subList(1, 5): " + subList);

        System.out.println("=======================");

        Deque<Integer> deque = new LinkedList<>();











    }
}
