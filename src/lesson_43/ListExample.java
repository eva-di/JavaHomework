package lesson_43;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    }
}
