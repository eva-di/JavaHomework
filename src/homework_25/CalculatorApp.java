package homework_25;

public class CalculatorApp {
    public static void main(String[] args) {

        double circumference = Calculator.lengthCircumference(-3);
        System.out.println("Длина окружности: " + circumference);

        double circumference2 = Calculator.lengthCircumference(0);
        System.out.println("Длина окружности: " + circumference2);

        double areaCircle = Calculator.areaCircle(13);
        System.out.println("Площадь круга: " + areaCircle);


        int sum = Calculator.integersSum(1, 2);
        System.out.println("Сумма чисел: " + sum);

        int difference = Calculator.integerMinus(4, 10);
        System.out.println("Результат вычитания: " + difference);

        int multi = Calculator.integersMulti(3, 2);
        System.out.println("Результат умножения: " + multi);

        double division = Calculator.integersDivision(7, 0);
        System.out.println("Результат деления: " + division);

        double division2 = Calculator.integersDivision(25, 5);
        System.out.println("Результат деления: " + division2);

        System.out.println(Calculator.integersDivision(-20, 4));




        double d = 10.0;
        double result = d / 0;

        System.out.println("10.0 // 00: " + result);

        // Infinity - Бесконечность
        // NaN -  значение не определено (не является числом)

        double inf1 = 1.0 / 0;
        double inf2 = 1000.0 / 0;

        System.out.println(inf1 == inf2);
        System.out.println(inf1 > inf2);



        System.out.println(10.0 / 10.0);

        double res2 = inf1 / inf2;
        System.out.println("inf1 / inf2 = " + res2);

        System.out.println("inf1 - inf2: " + (inf1 - inf2));
        System.out.println("inf1 + 10: " + (inf1 + 10));
        System.out.println("inf1 * (-1): " + (inf1 * -1));

        int x = 10;

        double resDouble = Calculator.integersDivision(x, 0);

// Сравнение на равенство значения с бесконечностью
        System.out.println(inf1 == Double.POSITIVE_INFINITY);

        int res = Calculator.integersSum(10, 5);
        double res1 = Calculator.integersSum(1.00, 5);
        System.out.println("int: " + res);
        System.out.println("double: " + res1);



    }
}
