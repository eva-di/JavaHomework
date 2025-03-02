package lesson_24;

public class Car {

 // Статическое поле класса. Существует в единственном экземпляре. Доступно всем объектам класса.
    static int totalCars;

    private String model;
    private int power;

// Конструктор
    public Car(String model, int power) {
        this.model = model;
        this.power = power;

        totalCars++; // При создании нового объекта увеличиваем
        // общее количество созданных автомобилей
    }

    public String toString(){
        return String.format("Auto: model %s, power: %d. Всего машин: %d",
                model, power, totalCars);
    }
    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
