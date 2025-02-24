package lesson_15;

public class SwitchExample {
    public static void main(String[] args) {

        /*
        Switch - используется для упрощения кода, когда нужно выполнить разные действияв зависимости от значения одной
        переменой или выражения. Это альтернатива множественным опереторам if-else-if, когда проверяется равенство одной
        переменной с разными значениями

        Особенно хорош, когда мы выбираем из известного и конечного количества вариантов.
         */

        int x = 5;
        if (x == 5) {
            System.out.println("if: x равен 5");
        } else if (x == 7) {
            System.out.println("if-else: x равен 7");
        } else {
            System.out.println("else: что-то другое");
        }

    /*
        switch (выражение) {
            case значение 1:
                // Блок кода для значения 2
            case значение 2:
                // Блок кода для значения 2
            // ...
            default:
                // Блок кода по умолчанию (если ни одно из значений не совпало)
         }
    */
        System.out.println("\n=======================\n");
        switch (x) {
            case 5:
                System.out.println("Switch: x равен 5");
                break;
            case 7:
                System.out.println("Switch: x равен 7");
                break;
            default:
                System.out.println("switch: что-то другое");
        }
        System.out.println("Строка за пределами switch");
    }
}
