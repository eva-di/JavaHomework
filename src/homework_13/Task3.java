package homework_13;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку четной длины: ");
        String evenString = scanner.nextLine();

        int middle = evenString.length() / 2 - 1;
        char firstMiddle = evenString.charAt(middle);
        char secondMiddle = evenString.charAt(middle + 1);
        System.out.println("Средние два символа вашей строки: " + firstMiddle + secondMiddle);






    }
}
