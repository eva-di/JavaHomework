package homework_26;
/*
width и height типа double, которые хранят размеры прямоугольника.
Создайте метод setDimensions(double width, double height),
который устанавливает значения полей width и height.
Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.
 */
public class Rectangle extends Shapes {

    private double width;
    private double height;

    public Rectangle(String name, String colour, double width, double height) {
        super(name, colour);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }










}
