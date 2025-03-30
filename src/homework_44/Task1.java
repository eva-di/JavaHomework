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

    public static List<String> getUniqueSortedWords(String testString) {

        String newString = testString.replaceAll("[^a-zA-Zа-яА-я0-9 ]", "");
       // System.out.println("newString: " + newString);
        String[] words = newString.split("\\s+");

        List<String> list = Arrays.asList(words);
        // System.out.println(list);

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        List<String> sortedWords = new ArrayList<>(uniqueWords);
        sortedWords.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

       // System.out.println(sortedWords);

        return sortedWords;





    }

}
