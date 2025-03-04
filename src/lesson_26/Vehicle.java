package lesson_26;

public class Vehicle {
    protected String model; // наследники будут иметь доступ
    private int year; // наследники прямого доступа не имеют

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

//    public Vehicle() {
//    }

    public String toString() {
        return model + ", year of manufacture : " + year;
    }

    public void start() {
        System.out.println(model + " начинает движение");
    }

    public void stop() {
        System.out.println(model + " останавливается");
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
