package lesson_13;

public class CharExample {
    public static void main(String[] args) {

        char a = 'A'; // Переменная будет хранить букву А латинского алфавита. Только в ''
        char a1 = 65; // Переменная будет хранить букву А латинского алфавита. Символ соответствующий коду 65в десятичной системе счисления.
        char a2 = 0x41; // Присваиваю число в 16-формате без ведущих нулей. Ноль икс 41
//        a2 = 0x0041;
        char a3 = '\u0041'; // Еще один способ хранить код в 16-ном формате
        char x = '\u1507';
        char y = '\u15EE';

//      [] 0 ... 9 ABCDEF
        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println("\n===========================\n");

        char letter = 'A';
        letter++; // Увеличиваю код символа, который хранится в переменной на 1 -> 'B'

        System.out.println("letter: " + letter);

        char digit = 48; // Коду 48 соответствует символ 0 (ноль)
        System.out.println("digit:" + digit);

        digit += 5; // digit = digit + 5;
        System.out.println("digit: " + digit);

        /*
        0 ... 9 -> соответствуют кодам 48...57
        a ... z -> соответствуют кодам 97...122
        A...Z -> соответствуют кодам 65...90
         */

        digit = (char) (digit + 3);
        byte b1 = 120;
        b1 = (byte) (b1 + 1);

        // Чтобы получить код символа в 10ой системе, нужно привести тип char к типу int
        System.out.println("int из char даст 10-ой код символа: " + (int) digit);
        System.out.println(0 + digit);

        char x1 = 12853;
        System.out.println("x1: " + x1);








    }
}
