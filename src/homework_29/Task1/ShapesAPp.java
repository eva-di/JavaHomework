package homework_29.Task1;

public class ShapesAPp {
    public static void main(String[] args) {

        Circle circle = new Circle(-10);
        System.out.println(circle);

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new Triangle(5, 6, 18);

        double sumArea = 0;
        double sumPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].area();
            double perimeter = shapes[i].perimeter();
            System.out.printf("%s площадь: %.2f; периметр: %.2f\n",
                    shapes[i].getClass().getSimpleName(), area, perimeter);
            sumArea += shapes[i].area();
            sumPerimeter += shapes[i].perimeter();
            System.out.println("===========================\n");


        }
        System.out.printf("Сумма площадей : %.2f\n", sumArea);
        System.out.printf("Сумма периметров: %.2f\n", sumPerimeter);

        System.out.println("========================\n");

        // Невозможно создать объект - нет публичных конструкторов
        // CircleSingleTon singleTon = new CircleSingleTon();

        // Не будет создан объект Circle - вернется null

        CircleSingleTon single = CircleSingleTon.getCircle(-5);
        System.out.println(single);

        CircleSingleTon circleSingle = CircleSingleTon.getCircle(5);
        System.out.println(circleSingle);


    }


}
