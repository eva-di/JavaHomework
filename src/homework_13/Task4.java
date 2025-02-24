package homework_13;

public class Task4 {
    public static void main(String[] args) {
        /*
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.

Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.

Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций),
и выведите результат.

Пример программы:
         */

        String name = "eva";
        System.out.println("Имя: " + name);

        String nameUpper = name.toUpperCase();
        System.out.println("Имя в верхнем регистре: " + nameUpper);
        char letter1 = 'e';
        char letter2 = 'v';
        char letter3 = 'a';

        char letterUpper1 = (char) (letter1 - 32);
        char letterUpper2 = (char) (letter2 - 32);
        char letterUpper3 = (char) (letter3 - 32);

        System.out.println("Имя в верхнем регистре 2: " + letterUpper1 + letterUpper2 + letterUpper3);







    }
}
