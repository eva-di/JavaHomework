package homework_26.shapes;
/*
Task 1
Иерархия классов “Фигуры”
Создайте программу, которая демонстрирует наследование с использованием классов геометрических фигур.

При создании классов не забудьте о конструкторах
Базовый класс Shape
Создайте класс Shape.
Добавьте поле name типа String, которое хранит название фигуры.
Создайте метод displayInfo(), который выводит на экран значение поля name.

Класс Rectangle (Прямоугольник)
Создайте класс Rectangle, который наследуется от Shape.
Добавьте поля width и height типа double, которые хранят размеры прямоугольника.
Создайте метод setDimensions(double width, double height), который устанавливает значения полей width и height.
Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.

Класс Circle (Круг)
Создайте класс Circle, который наследуется от Shape.
Добавьте поле radius типа double, которое хранит радиус круга.
Создайте метод setRadius(double radius), который устанавливает значение поля radius.
Создайте метод calculateArea(), который вычисляет и выводит площадь круга.
Класс Main
В методе main создайте объекты классов Rectangle и Circle.
Установите значения для их полей с помощью соответствующих методов.
Установите имя фигуры, используя поле name, унаследованное от класса Shape.
Вызовите метод displayInfo() и методы вычисления площади для каждого объекта,
чтобы вывести информацию о фигуре и её площади.
Дополнительное задание (по желанию):
Добавьте в класс Shape поле color типа String и метод setColor(String color).
Установите цвет для каждой фигуры и выведите эту информацию в методе displayInfo().
Пример реализации (без кода):
Создаете базовый класс Shape с полем name и методом displayInfo().
Создаете класс Rectangle, который наследуется от Shape, с дополнительными полями и методами.
Аналогично создаете класс Circle.
В методе main работаете с объектами Rectangle и Circle, используя унаследованные и собственные методы этих классов.

 */


public class Shapes {
    protected String name;
    private String colour;

    public Shapes(String name) {
        String colour = "black";
    }

    public Shapes(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void displayInfo() {
        System.out.println("shape: " + name + ", colour: " + colour);;

    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public String displayInfo() {
//        return colour + " " + name;
//
//    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
