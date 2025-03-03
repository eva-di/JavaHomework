package homework_25;

/*
Task4 * (Опционально)
Final параметр метода
•	Напишите метод printMessage(final String message), который выводит сообщение на экран.
•	Попробуйте изменить значение параметра message внутри метода.
•	Объясните результат и поведение компилятора.
 */
public class PrintMessage {

    public static void printMessage(final String message) {
        System.out.println(message);
        // message = "Ciao!";
        System.out.println("message = \"Ciao!\"; -> Внутри метода невозможно изменить значение переменной");
        System.out.println(message);
    }


    public static void main(String[] args) {
        PrintMessage.printMessage("Hallo!");
    }
}
