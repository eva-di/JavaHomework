package homework_25;

/*
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:

Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.

- Вычисление длины окружности и площади круга по ее радиусу
Класс должен содержать:
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)
 */

//@ геттеры сеттеры для всех полей,
// сгенерируй пустой конструктор

public class Calculator {
/*
ПОСЛЕДОВАТЕЛЬНОСТЬ ОФОРМЛЕНИЯ КОДА:

1. Поля класса, в том числе константы
2. Блоки инициализации, если есть
3. Конструктор/ы , если есть
4. Методы (статические и нестатические обычно не разделяются)

 */
    public static final double PI = Math.PI;

    public static double lengthCircumference(double radius) {
        if (radius <= 0) {
            System.out.print("Ошибка! Неверный радиус! ");
            return 0.0; // Integer.MAX_VALUE;
        }
        return 2 * PI * radius;

    }
    public static double areaCircle(double radius) {
        if (radius <= 0) {
            System.out.print("Ошибка! Неверный радиус! ");
            return 0.0; // Integer.MAX_VALUE;
        }
        return PI * radius * radius; // Pi * r ^ 2 (возведение в степень)

    }

    public static int integersSum (int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static double integersSum(double a, double b){
        return a + b;
    }
    public static int integerMinus (int a, int b) {
        int difference = a - b;
        return difference;
    }
    public static int integersMulti (int a, int b) {
        int multi = a * b;
        return multi;
    }
    public static double integersDivision (double a, double b) {
        // if (b == 0) {
           // System.out.println("Ошибка! Деление на 0!");
            //return 0.0;
            return a / b;
       // }
        //double division = (double) a / b;
       // return division;
    }


}
