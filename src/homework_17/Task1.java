package homework_17;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

    getNumberOfSymbols(str);
    }

    public static void getNumberOfSymbols (String str) {
        System.out.println("Количество символов в строке: " + str.length());

        }

    }

