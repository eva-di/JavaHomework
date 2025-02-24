package homework_16;

public class Task2 {
    public static void main(String[] args) {
        /*
        ask 2
Используйте цикл while для решения задачи:

Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
         */

        String task = "Task";
        int i = 1;
        while (i <= 10) {
            if (i < 10) {
                System.out.print(task + i + ", ");
            } else {
                System.out.println(task + i);
            }
            i++;
        }
    }
}
