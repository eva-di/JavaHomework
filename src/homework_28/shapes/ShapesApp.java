package homework_28.shapes;


import homework_26.shapes.Shapes;

public class ShapesApp {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Square(5);
        shapes[1] = new Circle(0);
        shapes[2] = new Triangle(8, 6);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calculateArea());

        }

    }
}
