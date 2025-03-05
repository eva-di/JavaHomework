package homework_26.shapes;

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

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    public void setDimentions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        double area = width * height;
        System.out.println("Area: " + area);
        return width * height;
    }










}
