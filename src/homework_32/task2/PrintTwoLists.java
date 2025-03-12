package homework_32.task2;

import lesson_32.lists.MyArrayList;

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyArrayList и MyArrayList<U>, и выводит элементы обоих списков.

Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
Пример использования:

MyArrayList<String> names = new MyArrayList<>();
names.add("Alice");
names.add("Bob");

MyArrayList<Integer> scores = new MyArrayList<>();
scores.add(85);
scores.add(92);

printTwoLists(names, scores);
 */
public class PrintTwoLists <U>{

    public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2) {
        System.out.println(list1);
        System.out.println(list2);


    }

}
