package homework_35;

import lesson_32.lists.MyArrayList;
import lesson_32.lists.MyList;

import java.util.Objects;

/*
Task 1: Создание класса “Rectangle”
Создайте класс Rectangle, который представляет прямоугольник со следующими полями:

length (длина) — тип double
width (ширина) — тип double
Требования:
Конструкторы:
Создайте конструктор, который инициализирует оба поля класса.
Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0.
Методы:
Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.
Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle в формате:
"Прямоугольник [длина=..., ширина=...]".
Метод main():
В методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод toString().

Task 2: Сравнение объектов класса “Rectangle”
Используя класс Rectangle из первого задания, необходимо реализовать сравнение объектов на равенство по их содержимому.

Требования:
Переопределение метода equals():
Переопределите метод equals() в классе Rectangle, чтобы два объекта считались равными, если у них совпадают значения полей length и width.
Метод main():
Создайте несколько объектов Rectangle, некоторые из которых имеют одинаковые длину и ширину.
Сравните объекты между собой, используя метод equals(), и выведите результаты сравнения на экран.
Пример:
public class RectangleTest {
public static void main(String[] args) {
Rectangle rect1 = new Rectangle(5.0, 3.0);
Rectangle rect2 = new Rectangle(5.0, 3.0);
Rectangle rect3 = new Rectangle(4.0, 2.0);

        System.out.println(rect1.equals(rect2)); // Должно быть true
        System.out.println(rect1.equals(rect3)); // Должно быть false
    }
}
 */
public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    @Override
    public String toString() {
        return "Прямоугольник [" +
                "длина=" + length +
                ", ширина=" + width +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(length, rectangle.length) &&
                Objects.equals(width, rectangle.width);
    }


    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
