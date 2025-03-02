package homework_24;
/*
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:

Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
 */
public class Calculator {
    private int a;
    private int b;


    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int integersSum (int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int integerMinus (int a, int b) {
        int difference = a - b;
        return difference;
    }
    public static int integersMulti (int a, int b) {
        int multi = a * b;
        return multi;
    }
    public static double integersDivision (int a, int b) {
        if (b == 0) {
            System.out.println("Ошибка! Деление на 0!");
            return 0.0;
        }
        double division = (double) a / b;
        return division;
    }


}
