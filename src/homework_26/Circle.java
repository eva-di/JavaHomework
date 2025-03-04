package homework_26;

public class Circle extends Shapes {

    public static final double PI = Math.PI;
    private double radius;

    public Circle(String name, String colour, double radius) {
        super(name, colour);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}
