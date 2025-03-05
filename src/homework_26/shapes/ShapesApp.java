package homework_26.shapes;

public class ShapesApp {

    public static void main(String[] args) {

        Circle circle = new Circle("circle", "green", 10);
        circle.setRadius(11);
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Название фигуры: " + circle.name);
        circle.displayInfo();

        Rectangle rectangle = new Rectangle("rectangle", "red", 10, 15);
        System.out.println("Название фигуры: " + rectangle.name);
        rectangle.setDimentions(5.0, 6.0);
        rectangle.displayInfo();
        rectangle.setColour("red"); // унаследован от shapes
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

        circle.setColour("blue");
        rectangle.setColour("black");

        rectangle.displayInfo(); // тоже унаследован
        circle.displayInfo(); // тоже унаследован



    }
}
