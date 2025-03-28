package homework_43;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */
public class ListCollection {
    public static void main(String[] args) {

    List<Integer> list1 = new ArrayList<>(List.of(2,15, 230, 20, 30, 70, 15, 150, -20, 2));
    List<Integer> list2 = new LinkedList<>(List.of(5, 2, 20, -20, 150, 40, 75, 230));

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        List<Integer> commonElements = commonElements(list1, list2);

        System.out.println("List of common elements: " + commonElements);
        System.out.println(commonElements(list2, list1));

    }
    public static <T> List<T> commonElements(List<T> list1, List<T> list2) {

        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;

    }





}
