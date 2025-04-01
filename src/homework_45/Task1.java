package homework_45;

import java.util.HashMap;
import java.util.Map;

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */
public class Task1 {
    public static void main(String[] args) {

        String text = "Перемен, требуют наши сердца, перемен требуют наши глаза...";
        Map<String, Integer> wordCount = getWordFrequency(text);

        System.out.println(wordCount);
    }

    public static Map<String, Integer> getWordFrequency(String text) {

        String[] words = text.toLowerCase().replaceAll("[^а-яa-z ]", "").split("\\s+");

        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordMap;
    }
}