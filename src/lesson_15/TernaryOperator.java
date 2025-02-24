package lesson_15;

import java.util.SortedMap;

public class TernaryOperator {
    public static void main(String[] args) {


        // Тернарный оператор - краткая форма записи оператора if-else, которая позволяет присваивать какое-то значение
        // переменной в зависимости от условия

        int age = 20;

        String status;
        if (age >= 18) {
            status = "Совершеннолетний";
        } else {
            status = "Несовершеннолетний";
        }
        System.out.println(status);


        // Переменная = (условие) ? значение_если_true : значение_если_false

        String result = (age >= 18) ? "Совершеннолетний" : "Несовершеннолетний";
        System.out.println("ternary result: " + result);

        int x = -10;

        System.out.println("Значение в переменной х " + ((x >=0) ? "положительное" : "отрицательное"));

    }
}
