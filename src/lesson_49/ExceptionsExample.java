package lesson_49;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.SortedSet;

public class ExceptionsExample {
    public static void main(String[] args) {

        // Ошибки компиляции
//        int a = "Java";
//        int x = 10

        // Ошибки Runtime (времени исполнения)

        // Exception (исключение) - представляет собой событие, который могут возникнуть во время выполнения программа
        // и нарушить ее нормальное выполнение

        // Исключение в Java является объектом определенного класса, который наследуется от класса Throwable()

        // Обработка ошибок - предусмотреть возможность появление Exception (объекта определенного класса)
        // И написать какой-то код, который будет выполнен в этом случае

        /*
        try-catch

        try {
            // код, который может вызвать исключение.
        } catch (ExceptionType name) {
            // код для обработки исключения
            // код, который будет выполнен при возникновении объекта определенного класса
        { catch (AnotherExceptionType ex2) {
            // код обработки другого типа ошибки
        } finally {
            // код, который будет выполнен в любом случае перед выходом из конструкции try-catch
         */


        int[] array = {1, 23, 4};
        // array[10] = 100; // java.lang.ArrayIndexOutOfBoundsException
        // int x = 10 / 0; // java.lang.ArithmeticException

        try {
            array[2] = 10;
            System.out.println("Try continue");
            array[10] = 100;
            System.out.println("Try continue #2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayException: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Какая-то ошибка");
            ex.printStackTrace(); // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
            // at lesson_49.ExceptionsExample.main(ExceptionsExample.java:41)
        } finally {
            System.out.println("finally");
        }

//        catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Что-то не так с индексом: " + exception.getMessage());
//        }

        System.out.println("Продолжение работы программы");

        System.out.println("Печатаю в потоке ошибок");

        // Проверяемые исключения (checked exception) и непроверяемые

        // ППРОВЕРЯЕМЫЕ (checked exception) - это тип исключения, наличие которых вы ОБЯЗАНЫ проверить и обработать
        // НЕПРВЕРЯЕМЫН (unchecked exception) -  это искл, возможность которых я не обязан проверять

        String result = getUrlString();
        System.out.println("result: " + result);

        System.out.println("==============\n");

        String result2;

        try {
            result2 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException: " + e.getMessage());
        }
            result2 = "http;//google.com";


    }
    private static String getUrlString() {
        URL myUrl = null;

        // бросает проверяемое исключение
        try {
            myUrl = new URL("htt://example.com");
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат URL: " + e.getMessage());
            return "https://google.com";
        }
        return  myUrl.toString();


    }
    // Ключевое слово throws используется в сигнатуре метода для указания, что метод может выбросить исключения
    private static String getUrlString2() throws MalformedURLException {
        URL myUrl = new URL("htt://example.com");
        return myUrl.toString();
    }
}
