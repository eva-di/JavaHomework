package homework_26;

public class ShapesApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("rectangle", "red", 10, 15);
        Circle circle = new Circle("circle", "green", 10);

        System.out.println("Название фигуры: " + circle.name);
        System.out.println("Название фигуры: " + rectangle.name);
        System.out.println("Информация о фигуре: " + rectangle.displayInfo());
        System.out.println("Информация о фигуре: " + circle.displayInfo());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Площадь круга: " + circle.calculateArea());

        circle.setColour("blue");
        rectangle.setColour("black");

        System.out.println("Информация о фигуре: " + rectangle.displayInfo());
        System.out.println("Информация о фигуре: " + circle.displayInfo());



    }
}
