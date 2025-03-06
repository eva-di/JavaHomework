package homework_27;

/*
Компьютер и компоненты
Создайте базовый класс Component с полями brand (бренд) и model (модель).
Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу существовать без компьютера.
 */

public class Component {

    private final String brand;
    private final String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString () {
        return "Component: " + brand + "model: " + model;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }



}
