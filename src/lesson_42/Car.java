package lesson_42;

public class Car implements Comparable<Car> {

    private String model;
    private int year;
    private int maxSpeed;

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // сравнивает текущий объект (this) с другим объектом этого же класса (Car)
    // вместо a будет this
    @Override
    public int compareTo(Car car) {
        return this.year - car.year;
    }

    /*
    a vs b - кто больше?
    a < b -> Отрицательное значение
    a > b -> положительное значение
    a == b -> вернет 0
     */

     /*
    this - Car =

    this vs Car - кто больше?
    this < Car -> Отрицательное значение
    this > Car -> положительное значение
    this == Car -> вернет 0

     */
}
