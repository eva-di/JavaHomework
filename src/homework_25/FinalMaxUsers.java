package homework_25;
/*
Task 2
Неизменяемая переменная
•	Объявите переменную final int MAX_USERS = 100;.
•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
•	Объясните, что произошло при попытке изменения значения.
 */

public class FinalMaxUsers {
    public static void main(String[] args) {

        final int MAX_USERS = 100;
        // MAX_USERS = 101;
        System.out.println("ERROR: cannot assign a value to final variable MAX_USERS");
    }




}
