package lesson_31.generics;

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

        // .valueOf() - преобразует явным образом примитив или строку в объект типа обертки

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf("127");
        System.out.println(e + " | " + f);

        Double dbl = Double.valueOf(154.5);
        System.out.println("dbl: " + dbl);

        Boolean bool = Boolean.valueOf("true");
        System.out.println("bool: " + bool);

        // parseXXX() - преобразует строку в соответствующий примитив

        double dblP = Double.parseDouble("456"); // возвращает примитив
        Double dblD = Double.valueOf("456"); // возвращает ссылочный тип
        System.out.println(dblP + " | " + dblD);

        System.out.println(Integer.parseInt("123"));

        // toString - переопределен метод, который возвращает строковое представление числа
        // equals - сравнивает два объекта по значению

        Integer i1 = 127;
        Integer i2 = 256;

        System.out.println(i1 > i2);

        // compareTo - сравнивает текущий объект с другим объектом
        // Возвращаемое значение int
        System.out.println("127.compareTo(256): " + i1.compareTo(i2));
        System.out.println("256.compareTo(128): " + i2.compareTo(i1));
        System.out.println("256.compareTo(256): " + i2.compareTo(i2));
        /*
         i1 > i2 -> положительное 1
         i1 < i2 -> отрицательное -1
         i1 = i2 -> 0
         */

        System.out.println("\n========================");
        // xxxValue() -  возвращает значение объекта как примитивный тип

        Double d2 = 125.67; // Автоупаковка
        d2 = Double.valueOf(125.67); // Явная / принудительная упаковка
        double dPrimitive = d2; // Автораспаковка
        dPrimitive = d2.doubleValue(); // Явная / принудительная распаковка


        System.out.println("\n=====================");

        /*
                                                      *
                                                -----***-----
                                                      *
        Абстрактный класс Number. Все числовые обертки наследуются от абстрактного класса Number
        Byte, Short, Integer, Long, Float, Double

        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        //
        Integer integer = 31844;
        double dVal = integer.doubleValue();
        System.out.println(dVal);

        System.out.println(integer.floatValue());
        System.out.println(integer.longValue());

        Double dWrapper = 245.78;
        int iVal = dWrapper.intValue();
        System.out.println(iVal);

        System.out.println(dWrapper.byteValue()); // Переполненеи типов




    }
}
