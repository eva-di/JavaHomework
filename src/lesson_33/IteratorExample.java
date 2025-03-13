package lesson_33;

import lesson_32.lists.MyArrayList;
import lesson_32.lists.MyList;

import java.util.Arrays;
import java.util.Iterator;

/*
Есть 2 интерфейса:

1. Iterable

Iterable - означает, что объекты этого класса можно последовательно перебирать (итерироваться по ним)
Один абстрактный метод: Iterator<T> iterator() - метод возвращает итератор для этого набора элементов (коллекции)


2. Iterator

Iterator<T> - собственно итератор, который позволяет обходить коллекцию
   - boolean hasnext() - есть ли там следующий элемент
   - T nex() - возвращает следующий элемент
   - void remove() - удаляет последний возвращенный элемент (не обязательный для переопределения)


 */
public class IteratorExample {

    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        list.addAll("Hello", "World", "Java", "Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
            // iterator.remove(); // без переопределения метода выдает ошибку
        }

        // Цикл for-each
        /*
        При переборе коллекции for-each не рекомендуется изменять коллекцию (добавлять ли удалять элементы)
        for (ТипПеременной имяПеременной : коллекция) {
        // действие с переменной

        }
         */

        System.out.println("\n================");

        for(String strCurrent : list) {
            System.out.println(strCurrent);
        }

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 4, 5);

        // Вывести в консоль числа, которое есть в списке умноженные на 2

        for(Integer value : integers) {
            System.out.println(value * 2);
        }
//      ==
//        for (int i = 0; i < integers.size(); i++) {
//            Integer value = integers.get(i);
//
//        }

        System.out.println("\n======================");
        // Вывести все элементы массива
        int[] array = {10, 20, 30, 40, 50};

        for(int element : array) {
            System.out.println(element);
        }




    }

}
