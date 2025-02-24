package homework_15;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

- Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
- Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        String number = scanner.nextLine();

        if (number.length() != 4) {
            System.out.println("Ошибка! Вы ввели НЕ четырехзначное число!");
            return;
        } else {
            System.out.println("Вы ввели: " + number);
        }

        int digit1 = number.charAt(0) - 48;
        int digit2 = number.charAt(1) - 48;
        int digit3 = number.charAt(2) - 48;
        int digit4 = number.charAt(3) - 48;

        int sum1 = digit1 + digit2;
        int sum2 = digit3 + digit4;

        if (sum1 == sum2) {
            System.out.printf("Номер вашего билета: %s -> (%d + %d) = %d; (%d + %d) = %d. Поздравляю! У вас счастливый билет!", number, digit1, digit2, sum1, digit3, digit4, sum2);
        } else {
            System.out.println("К сожалению, Ваш билет НЕ являются счастливым");
        }
    }
}
