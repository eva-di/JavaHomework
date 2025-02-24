package lesson_18;

public class MethodWithReturn {
    public static void main(String[] args) {

        // возвращаемые значения - жто результат, который метод отправляю обратно вызывающему его (метод) коду
        // после завершения  как результат своей работы
        // Это способ передать результат вычислений метода в другие части программы.

        // int sum = 10 + 5;
        calculateSum(10, 5);
        int sum = calculateSum(10, 5); // ->  int sum = 15;
        sum = calculateSum(10, 5) + calculateSum(20, 30); // sum = 15 + 50 -> sum = 45;

        System.out.println("\n======================\n");

        int pow = powTwo(3);
        System.out.println("powTwo(3): " + pow);

        System.out.println(powTwo(0));
        // test(15);


    } // methods area

    // Написать метод, возвращающий 2 в степени х. х метод получает в качестве параметра
    public static int powTwo(int x) {
        // 2 ^ x
        // 2 ^ 3 = 2 * 2 * 2 = 8

        int result = 1;
        // x = 2;
        for (int i = 1; i <= x; i++) {
            result = result * 2;

        }
        return result;
    }

    /* public static int test(int i) {
        return -1;
    }
    public static double test(double d) {
        return -1;
    }
*/
    public static int calculateSum (int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result; // return - оператор, заканчивающий работу метода и возвращавший значение

    }
}
