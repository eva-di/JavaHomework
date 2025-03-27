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

    }
}
