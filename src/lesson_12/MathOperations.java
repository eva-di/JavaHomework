package lesson_12;

public class MathOperations {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        // СЛОЖЕНИЕ +
        result = 15 + 6;
        System.out.println("result: " + result);

        // 1. Сначала происходит вычисление результата справа орт знака присвоения.
        // 2. Результат вычислений присваивается в переменную слева от знака равно.

        result = var1 + var2;
        System.out.println("var1 + var2: " + result);

        // ВЫЧИТАНИЕ -
        result = var1 -var2;
        System.out.println("var1 - var2 = " + result);

        // УМНОЖЕНИЕ *
        result = var1 * var2;
        System.out.println("var1 * var2: " + result);

        // ЦЕЛОЧИСЛЕННОЕ ДЕЛЕНИЕ / между двумя целыми числами, остаток будет отброшен
        // 20 / 7 -> 2 целые и 6 в остатке (2.85)
        result = var1 / var2;
        System.out.println("var1 / var2 " + result);

        // ВЗЯТИЕ ОСТАТКА ОТ ДЕЛЕНИЯ %
        result = var1 % var2;
        System.out.println("var1 % var2: " + result);

        System.out.println("5 / 10 = " + (5 / 10));
        System.out.println("5 % 10 = " + (5 % 10));

        System.out.println("\n==================\n");

        double doubleVar = 20.0; // Все числа, записанные в коде с точкой, воспринимаются компилятором
        // как число в формате double
        double doubleVar2 = 7.0d; //  d - явно указано, что число в формате double

        // Знак / между двумя вещественными (дробными) числами - операция "обычного" деления (результат с дробной частью)
        double doubleRes = doubleVar / doubleVar2;
        System.out.println("doubleRes = " + doubleRes);

        }

    }

