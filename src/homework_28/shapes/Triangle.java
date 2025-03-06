package homework_28.shapes;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        if (base <= 0 || height <= 0) return 0.0;
        System.out.printf("Площадь треугольника с основанием %.2f и высотой %.2f = ", base, height);
        return (base * height) / 2;

    }


}
