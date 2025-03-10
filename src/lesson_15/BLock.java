package lesson_15;

public class BLock {
    public static void main(String[] args) {
        // Блок или составной оператор - {} - произвольное количество (от 0 и больше) простых операторов java
        // заключенных в фигурные скобки. Блоки могут быть вложены один в другой.

        // Scope - область видимости переменной - это часть программы, в которой переменная доступна для использования.
        // Область видимости определяется фигурными скобками.

        int x = 10;
        // Анонимный блок
        {
           int y = 5;
           x = x + y;
           System.out.println("x; " + x);
           System.out.println("y: " + y);
        }

        // x = x + y; // Переменная у не видна (не доступна) вне своей области видимости (все своего блока кода)
        // Новая переменная с именем у -
        int y = 124;
    }
}
