package homework_29.Task1;

public class CircleSingleTon extends Shape {

    private static CircleSingleTon instance;

    private double radius;

// класс без публичного конструктора, нет прямого доступа к конструктору
    private CircleSingleTon(double radius) {
        this.radius = radius;
    }


    public static CircleSingleTon getCircle(double radius) {
        if (radius < 0) return null; // чтобы не создавался пустой объект
        return new CircleSingleTon(radius);
    }
    // Классический SingleTone - сработает 1 раз
//    public static CircleSingleTon getInstance(double radius) {
//        if (instance == null) { // могу вызвать нестатический конструктор в статическом методе
//            instance = new CircleSingleTon(radius); // позволяет создать объект в 1 экземпляре
//        }
//        return instance;
//    }

//    public CircleSingleTon(double radius) {
//        if (radius < 0) return;
//        this.radius = radius;
//    }

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
