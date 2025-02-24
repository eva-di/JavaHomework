package homework_14;

public class Task1 {
    public static void main(String[] args) {

        /*
        Task 1
Дан текст Programming is fun.

Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.
         */

        String text = "Programming is fun.";

        boolean containsFun = text.contains("fun");
        System.out.println("Эта строка содержит слово (\"fun\"): " + containsFun);





    }
}
