package homework_28.shapes;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        if (side <= 0) return 0.0;
        System.out.printf("Площадь квадрата со стороной %.2f = ", side);
        return side * side;
    }


}

