package homework_29.Task1;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) return;
        this.radius = radius;
    }

    @Override
    public double area() {
        // Pi * r * r
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        // Длина окружности
        // 2 *Pi * к (Pi * d)
        return 2 * Math.PI * radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius %.2f", radius);
    }

}
