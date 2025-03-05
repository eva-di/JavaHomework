package lesson_26;

/*
1. extends - наследование. Bus наследуется от Vehicle
Smartphone is=a Vehicle -> НЕ верно, применять наследование нельзя
Bus is-a Vehicle - верно, можно применить наследование
 */
public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers;

    // Конструктор по умолчанию для класса-потомка
//    public Bus() {
//        //Ключевое слово super - это обращение к родительскому классу
//        // super() - вызов конструктора родит. класса
//        super();
//    }


    public Bus(String model, int year, int capacity) {
        // Нужно сначала создать объект родителя
        // Если в конструкторе потомке нет явного (super) вызова конструктора родителя,
        // то будет вызван автоматически пустой конструктор родителя
        super(model, year); // вызов родит. конструктора, принимающего модель и год
        // Вызов конструктора родителя должен быть первой строчкой исполняемого кода
        this.capacity = capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean takePassenger() {
        // Проверить, есть ли свободное место
        // Если есть - посадить - увеличить количество пассажиров
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус: " + model);
            // имею доступ в наследнике к полю родителя с модификатором protected
            // System.out.println("Пассажир зашел в автобус: " + getModel());
            return true;

        }
            // в эту строчку я попаду, если условие выдаст false
        System.out.printf("В астобусе %s больше мест нет. Сейчас %d пассажиров\n", model, countPassengers);
        return false;
    }

    // Todo HW: Метод высадки пассажиров из автобуса
    public boolean dropPassengers() {
        if (countPassengers > 0) {
            countPassengers--; //Главная задача - не уйти в минус
            System.out.println("Пассажир вышел из автобуса " + model);
            return true;
        }
            System.out.printf("В автобусе %s нет пассажиров\n", model);
            return false;

    }
}
