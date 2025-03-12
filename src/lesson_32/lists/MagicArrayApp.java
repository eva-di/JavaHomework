package lesson_32.lists;

public class MagicArrayApp {
    public static void main(String[] args) {


        MyArrayList<Integer> list = new MyArrayList<>();

        Integer[] arr = list.toArray(); // вернется null
        System.out.println(list);
        list.add(10);
        list.addAll(20, 30, 40, 50);
        // list.add("456"); // обеспечивается безопасность типов на этапе компиляции
        System.out.println(list);

        Integer[] array = list.toArray();

        // Стирание типов при работе с дженериками
        // Type Erasure
        /*
        Во время компилляцию:
        1. Происходит проверка типов
        2. Стирание типов - удаление информации о параметрах типов
        3. Добавление приведения типов, где это необходимо

         */










    }
}
