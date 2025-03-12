package homework_32.task2;

import lesson_32.lists.MyArrayList;

import static homework_32.task2.PrintTwoLists.printTwoLists;

public class TwoListsApp {
    public static void main(String[] args) {

        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printTwoLists(names, scores);
    }
}
