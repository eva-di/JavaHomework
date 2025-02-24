package lesson_14;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        System.out.println(bol1);

        int x = 10;
        int y = 5;

        // Сравнение на равенство ==
        boolean b1 = x == y;// X равен y -> 10 равно 5 -> false
        System.out.printf("%s == %s -> %s\n", x, y, b1); // %b

        // Неравенство !=
        // X не равен Y
        b1 = x != y; // x не равен y -> 10 не равно 5 -> true
        System.out.printf("%s != %s -> %s\n", x, y, b1);

        // Больше >
        b1 = x > y; // Х больше  чем У -> 10 > 5 -> true
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        y = 10;
        b1 = x > y; // Х больше  чем У -> 10 > 5 -> true
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        // Больше или равно
        b1 = x >= y; // Х больше  или равен У -> 10 >= 10 -> true
        System.out.printf("%s >= %s -> %s\n", x, y, b1);

        // Меньше >
        x = 7;
        b1 = x < y; // Х меньше  чем У -> 7 < 10 -> true
        System.out.printf("%s < %s -> %s\n", x, y, b1);

        // Меньше или равно
        b1 = x <= y; // Х меньше или равно У -> 10 <= 5 -> true
        System.out.printf("%s <= %s -> %s\n", x, y, b1);

        String str = "Java is the best";
        // Поиск вхождения подстроки
        // conttains  - возвращает true если строка содержит указанную последовательность символов (подстроку)
        boolean contains = str.contains("Java"); // строка str содержит последователность символов "Java"
        System.out.println("str.contains(\"Java\"): " + contains);
        System.out.println("str.contains(\"java\"): " + str.contains("java"));
        System.out.println("str.contains(\"is t\"): " + str.contains("is t")); // не поддерживает регулярные выражения

        // startWith(), endWith() - начинается/ заканчивается строка на указанную подстроку
        boolean startsWith = str.startsWith("Ja");
        System.out.println("str.startWith(\"Ja\"): " + startsWith);
        System.out.println("str.startWith(\"ava\"): " + str.startsWith("ava"));

        boolean endsWith = str.endsWith("st");
        System.out.println("str.endsWith(\"st\"): " + endsWith);
        System.out.println("str.endsWith(\"ava\"): " + str.endsWith("ava"));


        System.out.println("\n==========Логические операции============");

        // Логическое НЕ (отрицание) работает с одним значением) "!"
        // Меняет значение типа boolean  на противоположное (инверсирует)
        boolean b2 = !false;
        System.out.println("!false: " + b2);

        b2 = !(4 == 5); // !false -> true
        System.out.println("!(4 == 5): " + b2);

        // Составные сравнения - два условия

        System.out.println("\n=========И===========\n");

        /*
        Логическое И "&"
        Используется когда нужно, чтобы оба условия были истинными
        Возвращает true, если оба условия true
        Если хотя бы в одной части будет false ->  в результате получится false

         */

        b2 = true & true;
        System.out.println("true & true: " + b2);

        // Проверка, что число входит в нудный диапазон
        // Введите число от 0 до 100

        int input = 50;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 100: " + b2);
        input = 150;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 100: " + b2);

        System.out.println("\n=========ИЛИ===========\n");

        // Логическое ИЛИ "|" - вертикальная палочка
        // Когда достаточно, чтобы хотя бы одно условие истинно

        b2 = true | false;
        System.out.println("true | false: " + b2);
        System.out.println("false | true: " + (false | true));
        System.out.println("false | false: " + (false | false));
        System.out.println("true | true: " + (true | true));

        System.out.println("\n====================\n");

        // Логическое исключающее ИЛИ (XOR)  "^" (использует редко)
        // Возвращает true, если две части выражения разные
        // Проверка взаимоисключающих условий
        // Например: или доставка на дом или самовывоз. или в кино или в театр, за рулем или я или муж. или онлайн или лично. Или один или с мужем.


        b2 = true ^ false;
        System.out.println("true ^ false: " + b2);
        System.out.println("false ^ true: " + (false ^ true));
        System.out.println("false ^ false: " + (false ^ false));
        System.out.println("true ^ true: " + (true ^ true));

        System.out.println("\n========= И && ===========\n");

        // Логическое сокращенное И "&&"
        // Возвращает true, если обе части выражения возвращают true

        b2 = true && true; // true
        System.out.println("true && true: " + b2);
        System.out.println("false && true: " + (false && true));

        int a = 10;
        int b = 0;

        // b = 0; 0 != 0 -> false
        // false && ? -> false - если false, то правая часть не влияет на общий результат
        // b = 100; -> 100 != 0 -> true -> true && ? -> НАДО СЧИТАТЬ ПРАВУЮ ЧАСТЬ

        boolean bol = (b != 0) && (a / b > 2);
        System.out.println("bol: " + bol); // -> false
        // Даже если правая часть никак не влияет на конечный результат при использовании & она будет вычислина
        // boolean bolFull= (b != 0) & (a / b > 2); - полная форма
        // System.out.println("bol: " + bolFull); // -> false

        b = 1;
        bol = (b != 0) && a / b > 2;
        System.out.println("bol: " + bol); // -> true


        System.out.println("\n========= сокращенное ИЛИ \"||\" ===========\n");

        // Логическое сокращенное "||"
        // Выдает true, если хотя бы одна часть выражения равна true

        // true || ? -> true (независимо от значения правой части)
        // сокращенное ИЛИ НЕ будет считать правую часть, а полное ИЛИ будет

        b = 0;
        bol = true || (a / b > 2);
        System.out.println("bol: " + bol);

        // bol = true | (a / b > 2); - выдаст ошибку
        // System.out.println("bol: " + bol);

        System.out.println("\n=========Приоритет логических операций ===========\n");

        /*
        1. НЕ !
        2. И &
        3. ИЛИ ^
        4. ИЛИ |
        5. И &&
        6. ИЛИ ||
         */

        System.out.println(true ^ true & false); // true
        System.out.println(true ^ false); // true
        System.out.println(true ); // true

        System.out.println(); // true
        System.out.println(true ^ true && false); // true
        System.out.println(false && false); // true
        System.out.println(false); // true






















    }
}
