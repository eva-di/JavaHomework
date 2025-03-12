package lesson_32;

public class Wrappers {
    public static void main(String[] args) {


    // Классы-обертки используются для представления  примитивных типов данных как объектов (как ссылочных)

    /*
    ССЫЛОЧНЫЕ ТИПЫ ДАННЫХ

    Byte - обертка byte
    Short - обертка short
    Integer - обертка int
    Long - обертка long
    Float - обертка float
    Double - обертка double
    Character - обертка char
    Boolean - обертка boolean

     */

    Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);

        // Поддержка null
        // int x = null; примитив null не поддерживает
        maxValue = null;


        // Приведение типов. АВТОУПАКОВКА И АВТОРАСПАКОВКА.

        Integer wrapperInt = 5; // Автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Автораспаковка из типа Integer в автоматически преобразована в примитив типа int
        System.out.println(primitiveInt);

        System.out.println("\n============================");

        // Сравнение объектов по значению (не по ссылке) - следует использовать метод equals
        // -128...127 - кэширование
        Integer a = 127; // создан объект с адресом в памяти @2ааа2
        Integer b = 127; // объект с таким значение уже есть. Новый не создается - выдается ссылка на уже существующий -> @2ааа2
        // сравниваем значения, записанные в переменных (т.е. ссылки, т.е. адреса объектов в памяти)
        System.out.println("127 == 127: " + (a == b)); // true
        System.out.println("127.equals(127): " + a.equals(b)); // true

        Integer c = 128; // Создан объект с адресом в памяти @3bbb3
        Integer d = 128; // ооздан объект с адресом в памяти @4ccc4. Не проверяется на наличие объекта с таким значением
        System.out.println("128 == 128: " + (c == d)); // false!!!
        System.out.println("128.equals(128): " + c.equals(d)); // true

        System.out.println("\n===================");

        // Общие (или схожие) методы, которыми обладают классы-обертки:


    }
}
