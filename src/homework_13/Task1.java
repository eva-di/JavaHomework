package homework_13;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        /*
        Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        int length = name.length();
        System.out.println("Количество символов в имени: " + length);

        char first = name.charAt(0);
        char last = name.charAt(name.length() -1);

        System.out.println("Первый символ: " + (int) first);
        System.out.println("Последний символ: " + (int) last);



    }
}
