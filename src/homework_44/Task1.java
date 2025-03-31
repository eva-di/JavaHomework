package homework_44;

import java.util.*;

/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */
public class Task1 {

public static void main(String[] args) {

    System.out.println(getUniqueSortedWords("Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!"));

}

    public static List<String> getUniqueSortedWords(String string) {

    /*
    1. Избавиться от знаком препинания
    2. Разбить строку на слова (массив/ список слов)
    3. Поместить в коллекцию, которая обеспечит уникальность и сортировку (SortedSet)
    4. Преобразовать результат в список
     */

        String[] words = string.replaceAll("[^a-zA-Zа-яА-я0-9 ]", "").split("\\s+");
//        String newString = string.replaceAll("[^a-zA-Zа-яА-я0-9 ]", "");
//        System.out.println("newString: " + newString);
//        String[] words = newString.split("\\s+");

        List<String> list = Arrays.asList(words);
        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        uniqueWords.addAll(Arrays.asList(words));
        return new ArrayList<>(uniqueWords);

        // System.out.println(list);

//        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

//        List<String> sortedWords = new ArrayList<>(uniqueWords);
//        sortedWords.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

       // System.out.println(sortedWords);

//        return sortedWords;





    }

}
