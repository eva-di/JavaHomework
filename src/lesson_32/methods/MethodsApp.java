package lesson_32.methods;


import lesson_32.lists.MyArrayList;
import lesson_32.lists.MyList;

import java.util.Arrays;

public class MethodsApp {

    public static void main(String[] args) {

        Integer[] integers = {0, 1, 2, 3, 4, 5, 6};

        Utils.swap(integers, 2, 5);
        System.out.println(Arrays.toString(integers));

        String[] strings = {"Hello", " Java", "World", "JS"};
        Utils.swap(strings,1,2);
        System.out.println(Arrays.toString(strings));

        int[] intArray = {1, 2, 3, 4 ,5 ,6};
        // Utils.swap(intArray, 1, 2); // Массив примитивов не примет


        MyList<Double> doubleList = new MyArrayList<>(new Double[]{1.5, 2.5, 3.5});

        Double firstValue = Utils.getFirstElement(doubleList);
        System.out.println("firstValue: " + firstValue);

        MyList<String> stringList = new MyArrayList<>(strings);
        System.out.println(Utils.getFirstElement(stringList));

        System.out.println("\n ===============");

        // int sum = Utils.sumElements("Hello", "world"); // типобезопасность
        int sum = Utils.sumElements(1, 3.5, 10, 11.5, 1.1);
        System.out.println("sum: " + sum);

        // double sum2 = Utils.listSum(stringList);
        double sum2 = Utils.listSum(doubleList);
        System.out.println("sum2 = " + sum2);

        System.out.println("\n=================");

        MyList<Integer> integerList = new MyArrayList<>();
        Utils.addNumbers(integerList);



    }
}
