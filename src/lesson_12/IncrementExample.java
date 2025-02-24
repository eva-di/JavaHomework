package lesson_12;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 5;
        x = x + 10;

        x += 5; // x = x + 5;
        System.out.println("x: " + x);

        x -= 2; // x = x - 2;
        x *= 2; // x = x * 2;
        x /= 5; // x = x / 4;
        System.out.println("x: " + x);

        // Инкремент, декремент
        x++; // x = x + 1; x += 1; // Инкремент - увеличить текущее значение в переменной x на 1

        System.out.println("x: " + x);

        x--; // x + x -1; // x -= 1; // Декремент - уменьшить текущее значение переменной х на 1
        System.out.println("x: " + x);

        System.out.println("\n=====================\n");

        /*
            Инкремент и декремент можно записать по-разному:
            после ферменной x++, x-- (постфикс)
            перед ферменной ++х, --х (префикс)

            Если запись постфикс (х++), то сначала используется текущее значение переменной, а потом оно будет увеличено.
         */

        int var = 100;
        System.out.println("var: " + var++);
        System.out.println("var: " + var);

        int y = 100;
        System.out.println("y: " + ++y);

    }
}
