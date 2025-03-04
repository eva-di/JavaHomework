package lesson_26;

import java.util.Arrays;
import java.util.SplittableRandom;

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java" + " " + "is" + " " + "the" + " " + "best!";

        // StringBuilder - это класс, который используется для создания и манипулирования с изменяемыми строками
        // это альтернатива конкатенации

        // Перегруженный конструктор. Может быть пусты, может принимать String
        StringBuilder sb = new StringBuilder(); // Пустой конструктор
        sb = new StringBuilder("Hello");

        // Метод для добавления в конец строки (приклеивание справа - полный аналог конкатенации)
        sb.append(" "); // "Hello" + " "

        // Получить строковое представление
        String string = sb.toString();
        System.out.println(string);

        // Вставить метод в указанную позицию

        sb = new StringBuilder("Hello, world!"); // Hello, beautiful world!
        sb.insert(6, " beautiful");
        System.out.println(sb.toString());
//        String start = "Hello, world!";
//        String result = start.substring(0, 6);
//        result += " beautiful";
//        result += start.substring(6);
//        System.out.println(result);

        //ЗАменить подстроку (опрделяется индексами) на указанное значение
        sb = new StringBuilder("Hello, World!"); // "Hello, Java!"
        sb.replace(6, 12, "Java"); // замени мне все, что было с 6 по 12 индекс на "значение".
        // Верхняя граница не вкл.
        System.out.println(sb.toString());

        // Удалить подстроку в диапазоне от start (вкл) до end (не вкл)
        sb.delete(5, 10);
        System.out.println(sb.toString());

        // Нам надо знать, есть ли в sb какая-то подстрока. Положительный индекс, если нашел. И минус 1 , если подстрока не найдена
        sb = new StringBuilder("Hello World!");
        int index = sb.indexOf("W");
        System.out.println(index);
        index = sb.lastIndexOf("Java");
        System.out.println(index);

        // Реверс - разворачивает последовательность символов
        sb = new StringBuilder("Hello, world!");
        sb.reverse();
        System.out.println(sb.toString());

        // Получить символ по индексу

        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(3);
        System.out.println(ch);

        // количество символов в sb (длина)
        System.out.println("length: " + sb.length());

        // Я могу установить новую длину (обрезать или расширить)
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // Если увеличить строку, оно будет заполнено char с кодом 0
        System.out.println(sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8) code: " + (int) ch1);

        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb.toString());

        /*
        Написать метод, который запрашивает у пользователя строку, состоящий из нескольких слов
        и возвращающий аббревиатуру этой фразы (первые юуквы слова, записанные в верхнем регистре)
                 */

        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] words = example.split(" "); // Метод класса String. Результат - массив строк
        System.out.println(Arrays.toString(words));

        String str1 = "sdcfg sddfgfg";
        // получить массив символов, из которых состоит строка
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));




    }

}
