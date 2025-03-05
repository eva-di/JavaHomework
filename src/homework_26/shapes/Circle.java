package homework_26.shapes;

public class Circle extends Shapes {

    public static final double PI = Math.PI;
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(String name, String colour, double radius) {
        super(name, colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area: " + area);
        return area;
    }
}
