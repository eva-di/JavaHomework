package lesson_13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // Строка подготавливает программу для чтения данных из стандартного потока ввода
        // от пользователя через клавиатуру

        Scanner scanner = new Scanner(System.in);

        // Прочитать строку
        System.out.println("Введите ваше имя: ");
        // Читает всю строку, введенную пользователем и возвращает ее в виде String
        String name = scanner.nextLine();
        System.out.println("Привет: " + name);

        // Прочитать число
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt(); // Считает одно число типа int, читает всю строку
        scanner.nextLine(); // вызываем nextLine - для тогоЮ чтобы он дочитал до нужного места
        // Всегда после вызова методов nexLInt, nextDouble, next() И т. д.
        // следует вызвать метод nextLine(), чтобы "скушать" остаток строки
        System.out.println("Age: " + age);

        System.out.println("Введите город: ");
        String city = scanner.nextLine();
        System.out.println("City: " + city);

        // Todo Чтение токенами чисел
        // Разделитель - пробельный символ
        /*
        - \s+ - пробельный символ
        - ' ' - пробел (в любом количестве подряд)
        - \t - знак табуляции
        - \n - перевод каретки
        - \r - возврат каретки

         */


        System.out.println("Введите число Pi: ");
        double pi = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pi: " + pi);


        scanner.close(); // но scanner сам себя закроет, он авто closeable. Это писать не обязательно.





    }
}
