package homework_16;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task 1
Найдите произведение всех чисел от 1 до 15 включительно.
Результат выведите на экран
         */

        int i = 1;
        long multi = 1;

        while (i <= 15) {
            multi *= i;
            i++;
        }
        System.out.println("Произведение чисел от 1 до 15 = " + multi);
    }

}
