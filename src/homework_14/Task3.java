package homework_14;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        boolean bol1 = num % 2 == 0;
        boolean bol2 = num % 3 == 0;
        boolean bol3 = num % 2 == 0 && num % 3 == 0;

        System.out.println("Число: " + num + " четное: " + bol1 +
                "; Число: " + num + " кратно 3: " + bol2 +
                "; Число: " + num + " четное и кратно 3: " + bol3);

    }
}
