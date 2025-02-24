package homework_13;

public class Task2 {
    public static void main(String[] args) {
        /*
        Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
         */

        String word1 = "Java";
        String word2 = "is";
        String word3 = "a";
        String word4 = "powerful";
        String word5 = "language";

        String concatWords = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5;
        System.out.println("Предложение: " + concatWords);
        System.out.println("Длина предложения: " + (int) concatWords.length());

        String concatWords2 = String.join(" ", word1, word2, word3, word4, word5);
        System.out.println("Предложение 2: " + concatWords2);
        System.out.println("Длина предложения 2: " + (int) concatWords2.length());

        /*
        Замените в результирующей строке слово "powerful" на "super".
Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
         */

        String replWord = concatWords2.replace("powerful", "super");
        System.out.println(replWord);

        boolean containsAge = replWord.contains("age");
        System.out.println("В этом предложении есть подстрока 'age':  " + containsAge);






    }
}
