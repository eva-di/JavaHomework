package homework_43;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Task 2 (* Опционально)
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.

Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.

Пример метода, который измеряет время выполнения некоторого кода и возвращает его в миллисекундах:
 */
public class Timer {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            newList.add(random.nextInt(1001));
        }

        List<Integer> arrayList = new ArrayList<>(newList);
        List<Integer> linkedList = new LinkedList<>(newList);

        // System.out.println(arrayList);
        // System.out.println(linkedList);

        // System.out.println("Списки заполнены одинаковыми значениями? " + arrayList.equals(linkedList));

        // System.out.println("Все значения по индексу: " + elementIndex(arrayList));
        // System.out.println("Все значения по индексу: " + elementIndex(linkedList));

        // Измеряем и выводим время выполнения метода someMethod
        long duration = elementIndex(arrayList);
        System.out.println("Время выполнения метода: " + duration + " миллисекунд");
        long duration2 = elementIndex(linkedList);
        System.out.println("Время выполнения метода: " + duration2 + " миллисекунд");
    }

// В первом методе - получение всех значений элементов списка по его индексу

    public static long elementIndex (List<Integer> list) {
        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i));
        }
        long endTime = System.currentTimeMillis();

        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }

    // Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
    // toBeContinued...
}
