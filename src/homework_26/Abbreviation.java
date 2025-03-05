package homework_26;

import java.util.Arrays;
import java.util.Scanner;

/*
Task 3 * Опционально
Написать метод, который запрашивает у пользователя строку,
состоящую из несколько слов и возвращающий аббревиатуру этой фразы (первые буквы каждого слова,
записанные в верхнем регистре)

Например:

научно исследовательский институт -> НИИ
 */
public class Abbreviation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        StringBuilder abbreviation = new StringBuilder();
        int i;
        for (i = 0; i < words.length; i++) {
            abbreviation.append(words[i].substring(0, 1).toUpperCase());
        }

        System.out.println(abbreviation.toString());

    }

}
