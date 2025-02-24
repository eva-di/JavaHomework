package homework_17;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        toPowerNumber(number);

    }
    public static void toPowerNumber (int exponent) {
        int number = 2;
        double result;
        result = 1;

        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= number;
            }
        } else if (exponent < 0) {
            for (int i = 0; i > exponent; i--) {
                result /= number;
            }
        }
        System.out.println("2 в степени " + exponent + " = " + result);



    }

}
