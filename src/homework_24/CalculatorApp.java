package homework_24;

public class CalculatorApp {
    public static void main(String[] args) {

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


    }
}
