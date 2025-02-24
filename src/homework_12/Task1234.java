package homework_12;

public class Task1234 {

    public static void main(String[] args) {

        // Task 1:

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;

        int average = (a + b + c + d) / 4;
        System.out.println("Task 1. Среднее арифметическое 1,5 программа округлила до: " + average);

        // Task 2:

        int tempMon = 3;
        int tempTue = 2;
        int tempWed = 4;
        int tempThu = 1;
        int tempFri = -1;
        int tempSat = 2;
        int tempSun = 5;

        float averageTemp = (tempMon + tempTue + tempWed + tempThu + tempFri + tempSat + tempSun) / 7;

        System.out.printf("Task 2: Средняя температура за прошлую неделю в городе N: +%.1f\n", averageTemp);

        // Task 3:

        int fullAge = 36;
        double milkPrice = 1.35;
        String myName = "Ева";

        System.out.printf("Task 3: Привет! Меня зовут %s, мне %d лет. Я покупаю молоко по %.2f за литр.\n", myName, fullAge, milkPrice);

        // Task 4:

        int myVar = 10;
        double myDouble = myVar;

        System.out.println("Task 4: Значение myDouble: " + myDouble);






    }
}
