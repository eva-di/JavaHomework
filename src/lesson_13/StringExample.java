package lesson_13;

import java.lang.invoke.StringConcatException;

public class StringExample {
    public static void main(String[] args) {

        String greeting = "Hello, World!"; // Объявление и инициализация в одной строке переменной типа String
        System.out.println(greeting);

        String string1 = new String(("Hello!")); // Тоже создание новой строки (не рекомендуемый)
        System.out.println(string1);

        // МЕТОД length - получить количество символов в строке
        int length = greeting.length(); //  Вызов МЕТОДА length() - подсчитать количество символов в этой строке и вернет нам результат
        System.out.println("length(): " + length); // Выводит 13 с пробелом

        System.out.println("Hello".length());

        // toUpperCase() - Метод позволяет перевести все символы в строке в верхний регистр (сделать большими/ капсом)
        System.out.println(greeting.toUpperCase());
        System.out.println("greeting: " + greeting);

        // String иммутабельна (неизменна)
        // если я хочу сохранить результат работы метода, я должен сохранить его в какую-то переменную
        // (в новую переменную или переписать значение, хранящееся в "старой" переменной)

        // переводит все символы строки в ниЖний регистр
        String stringCase = greeting.toLowerCase();
        System.out.println("stringCase:" + stringCase);
        System.out.println("greeting: " + greeting);
        greeting = greeting.toUpperCase(); // x = x + 5;
        System.out.println("greeting: " + greeting);

        System.out.println("\n==========================\n");

        // Различные варианты конкатенации (склеивания / объединения) строк

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // + конкатенация
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        System.out.println(1 + 3);

        // + (Конкатенация vs Операции сложения)
        System.out.println(1 + 3 + " : " + 2 + 3);

        // тип данных X + String -> X приводится к строке и выполняется конкатенация

        // 1 + 3 -> сложение -> 4
        // 4 + " : " -> "4" + " : " -> "4 : "
        // "4 : " + 2 -> "4 : " + "2" -> "4 : 2"
        // "4 : 2" + 3 -> "4 : 2" + "3" -> "4 : 23"

        // Изменили приоритет мат. операции
        System.out.println(1 + 3 + " : " + (2 + 3)); // Скобки чтобы точно посчиталась сумма иначе вывод: 23

        // Конкатенация 2
        String concatStr2 = str1.concat(str2); // str1 + str2
        concatStr2 = concatStr2.concat(str3); // concatStr2 + str3
        System.out.println("concatStr2: " + concatStr2);

        // цепочка вызова метода
        String concatStr3 = str1.concat(str2).concat(str3).concat("!!!"); // (str1 + str2) + str3) + "!!!"
        System.out.println("concatStr3: " + concatStr3);

        // Конкатенация 3
        // Склеить несколько строк, вставляя между ними разделитель

        // похоже на print в Python (print("str", "str2") -> "str1 str2
        String concatStr5 = String.join(" ", "Hello", "World", "Test");
        // "Hello World Test"
        System.out.println("concatStr5: " + concatStr5);

        // Приведение типов. Когда ест строка и есть + - это знак конкатенации. Второй тип данных будет приведен к String (неявно)
        // Все остальные типы преобразуются в строки

        int a = 1;
        int b = 2;
        String str = "Сумма a + b = " + a + b; // Сумма a + b = 12
        System.out.println("str: " + str);

        // Меняем порядок операций
        str = "Сумма a + b = " + (a + b);
        System.out.println("str: " + str);

        System.out.println("\n=================\n");

        String digits = "0123456789";
        System.out.println("digits.length(): " + digits.length());

        // charAt(index) - Взять символ из строки по его индексу (номеру)
        char symbol = digits.charAt(4); // Взять символ под индексом (номером) 4
        System.out.println("symbol: " + symbol);
        // Первый символ всегда имеет индекс 0, последний (самый правый) индекс ВСЕГДА равен длина -1

        char first = digits.charAt(0);
        char last = digits.charAt(digits.length() -1);
        System.out.println("first: " + first);
        System.out.println("last: " + last);

        System.out.println("\n=======================\n");

        // Выделение подстроки
        String subString = digits.substring(2); // Выделить подстроку, начиная с индекса 2 (вкл) и до конца строки
        System.out.println("subSting: " + subString);
        System.out.println("digits: " + digits); // Начальная строка остается без изменений

        String subString2 = digits.substring(2, 7); // Выделить подстроку с индекса 2 (вкл) до индекса 7 (не вкл)
        System.out.println("subString2: " + subString2);

        System.out.println("\n=======================\n");

        // Замена части строки
        // replace(), replaceFirst(), replaceAll()

        // replace() - заменяет все совпадения заданной строки на другую строку
        // (Работает только со строками, не поддерживает регулярные выражения)

        String string = "One World One";
        String replStr = string.replace("One", "WWW");
        System.out.println("replStr: " + replStr); // WWW World WWW

        // replaceFirst() - заменяет только первое найденное совпадение (поддерживает регулярные выражения)
        replStr = string.replaceFirst("One", "WWW");
        System.out.println("replStr: " + replStr); // WWW World One

        // replaceAll() - заменяет все найденные совпадения на другую строку
        // и поддерживает регулярные выражения

        replStr = string.replaceAll("One", "WWW");
        System.out.println("replStr: " + replStr); // WWW World WWW

        String stringReg = "One World One Onix O";
        replStr = stringReg.replaceAll("\\bO\\w*", "Replaced");
        System.out.println("replStr: " + replStr);























    }
}
