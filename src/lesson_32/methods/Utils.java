package lesson_32.methods;

import lesson_32.lists.MyList;

public class Utils {
    // Поменять местами 2 элемента массива с любым ссылочным типом данных

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    // Метод, который возвращает первый элемент в списке
     public static <T> T getFirstElement(MyList<T> list) {
        if (list.isEmpty()) return null;
        return list.get(0);
    }
    // Ограничение сверху Upper Bound
    // Ограничить диапазон принимаемых значений типов данных
    // T extends someClass значит, что Т должен быть либо классом someClass Или его потомком
    public static <T extends Number> int sumElements(T... elements) {
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i].intValue();
        }
        return sum;
    }
    // ? - Wildcard  - "неизвестный или любой тип"
    // ? extends Number - любой тип ,явзляющийся наследником NUmber
    public static double listSum (MyList<? extends Number> listNumbers) {
        double sum = 0;
        for (int i = 0; i < listNumbers.size(); i++) {
            sum += listNumbers.get(i).doubleValue();
        }
        return sum;
    }

    // Ограничение снизу Lower Bound
    // ? super Integer - мы работаем с неизвестным типм, который является классом Integer или его родителем
    public static void addNumbers(MyList<? super Integer> list) {
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

}
