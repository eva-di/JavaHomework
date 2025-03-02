package lesson_24;

/*
Статические члены класса имеют доступ (видят) только статический контент

 */

public class StaticExample {

    // non static поле класса
    int x;

    // static поле класса
    static int staticY;

    // Статический метод
    public static void staticMethod() {
        // Статические методы видят только статические члены класса (9)поля и методы класса)
        // x++; нет доступа к НЕстатическому полю
        staticY++; // доступ к статическому полю есть

        // вызывать можно только стат методы

        // nonStaticMethod();
        // Ключевое столово this не доступно
        System.out.println("Вызван статический метод: " + staticY);

    }

    // нестатический метод
    public void nonStaticMethod() {
        // У НЕстатического метода есть доступ ко всем членам класа
        x++; // НЕ статика доступна
        staticY++; // статика тоже доступна
        // модем вызывать статические и нестатические методы
        staticMethod();
    }


    // метод main статический
    public static void main(String[] args) {
        // x = 10; // ошибка компиляции. У статик метода нет доступа к НЕ-стати переменной

        staticY = 10;
        System.out.println(staticY);

        // nonStaticMethod(); // я не могу вызвать нестатический метод без создания объекта

        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod(); // я могу вызвать нестатик метод только используя ссылку на объект

        // я могу вызвать статический метод БЕЗ создания объекта
        StaticExample.staticMethod();

        int sum = MathUtil.sumIntegers(1, 2, 5, 6, 7, 8);
        System.out.println("Сумма чисел: " + sum);






    }
}
