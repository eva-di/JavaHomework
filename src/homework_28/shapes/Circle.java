package homework_28.shapes;

public class Circle extends Shape {

static final double PI = Math.PI;
private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        if (radius <= 0) return 0.0;
        System.out.printf("Площадь круга с радиусом %.2f = ", radius);
        return PI * radius * radius;
    }



}
