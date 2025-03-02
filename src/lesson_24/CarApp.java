package lesson_24;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("static field: " + Car.totalCars);

        Car bmw = new Car("BMW", 200);
        System.out.println("static totalCars" + Car.totalCars);
        System.out.println("После создания одной машины " + bmw.toString());

        Car vw = new Car("VW", 300);
        System.out.println(vw.toString());
        System.out.println("После создания 2 машин: " + bmw.toString());

        System.out.println("Static variable: " + Car.totalCars);


        // Я могу обратиться к статике от имени конкретного объекта
        // но это плохая практика и так делать не рекомендуется

        // System.out.println("vw.totalCars: " + vw.toString());
        // Нам следует обращаться к статике от имени класса

        // Модификатор  стати применим только к полям или методам класса
        // static int x;



    }
}
