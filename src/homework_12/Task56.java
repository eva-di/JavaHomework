package homework_12;

public class Task56 {
    public static void main(String[] args) {
        // Task 5:

        double myDouble = 5.99;
        int myInt = (int) myDouble;

        System.out.println("Task 5: Значение myInt: " + myInt);


        // Task 6:

        long bigNumber = 15_000_000_000L;
        int smallNumber = (int) bigNumber;

        System.out.println("Task 6: Значение smallNumber: " + smallNumber);
        System.out.println("Число типа long 15_000_000_000 превышает максимальное значение int (2_147_483_647).\n" +
                "При явном преобразовании типа данных происходит потеря данных");



    }
}
