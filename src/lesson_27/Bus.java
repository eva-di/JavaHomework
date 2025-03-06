package lesson_27;

/*
Ассоциация - это связь, при которой один объект связан с другим объектом. Это наиболее общая форма связи.
Агрегация - это форма ассоциация, представляющая собой отношение ЧАСТЬ -ЦЕЛОЕ , где часть может существовать независимо от целого.

Композиция - это более жесткая форма агрегации (также отношение ЧАСТЬ-ЦЕЛОЕ), но где часть не может существовать без целого (хвост без соаки не может существовать)

	• Обычно часть создается вместе с целым,
и если целое уничтожается, часть
также уничтожается
(жизненные циклы объектов).

	• Ассоциации (в том числе и
агрегация и композиция)
Реализуются через создание ссылок
в классе на другие объекты. Это значит,
что класс содержит поля, которые ссылаются на
объекты других классов.

	• Ассоциация - это отношения между двумя классами, где один класс использует другой класс в качестве одного их своих полей.



Автобус содержит водителя. HAS-A. Агрегация. Водитель может существовать отдельно от автобуса.
Автобус содержит автопилот. HAS-A. Композиция. Автопилот является неотъемлемой частью автобуса.
Жесткая / неразрывная связь. Часть создается вместе с целым.

Важн

 */

import java.util.Arrays;
import java.util.SortedMap;

public class Bus {

    private static int counter = 1; // количество автобусов

    private final int id; // уникальный идентификатор объекта, по которому можно узнать объект.
    // Он может быть числовым или строковым.

    private BusDriver driver; // Агрегация - мягкая связь
    private Autopilot autopilot; // Композицияя - жесткая связь (используется редко)

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;


    public Bus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v001"); // создается объект композиции
        this.passengers = new Passenger[capacity];
    }

//Todo переписать toString() в StringBuilder


    public String toString() {
    StringBuilder sb = new StringBuilder("Bus: { i: ");

        sb.append(id).append(", ").append(driver.toString())
                .append(", ").append(autopilot.toString()).append(", capacity: ")
                .append(capacity).append("}");
        return sb.toString();
    }



    public void showListPassengers() {
        if(countPassengers==0) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : "]");

        }
        System.out.println(sb.toString());
    }


    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;
        /*
        1. Надо проверить свободное место
        2. Находится ли пассажир в автобусе
        3. Если есть место и пассажир еще не в автобусе - садим на борт:
        3.1. Добавляем его в список пассажиров
        3.2. Увеличиваем кол-во пассажиров
        3.3. Возвращаем true
        4. Иначе(3.3.) что-то пошло не так -выдаем сообщение об ошибке и возвращаем false

         */
        if (countPassengers < capacity) {
            // место есть
            // надо проверить пункт 2
            if (isPassengerInBus(passenger) >= 0) {
                // метод вернул 0 или больше (т е валидный индекс в массиве), значит пассажир в автобусе
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }

            // Садим на борт пассажира
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d уже завершил посадку в атобус с id %d\n",
                    passenger.getId(), this.id);
            return true;
        }
        // свободного места нет
        System.out.printf("В автобусе с id %d свободного места нет", this.id);
        return false;

    }

    public boolean dropPassenger(Passenger passenger) {
        /*
        1. Убедиться, что пассажир а автобусе, если нет - вернуть false
        2. Удалить из массива
        2.1 Сдвинуть всех пассажиров "справа" от него
        2.2 Не забыть изменить кол-во пассажиров
        2.3 Вернуть true

         */
        if (passenger == null || countPassengers == 0) return false;
        int index = isPassengerInBus(passenger);
        if (index == -1) {
            //Такого пассажира в автобусе нет
            System.out.printf("Пассажир с id %d в автобусе не найден.\n", passenger.getId(), this.id);
            return false;
        }
        // Удаление пассажира из списка
        for (int i = index; i < countPassengers -1; i++) {
            passengers[i] = passengers[i +1];
        }
        // Не обязательная процедура:
        passengers[countPassengers -1] = null;
        // Обязательная строка
        countPassengers--;
        System.out.printf("Пассажир (%d) вышел из автобуса \n", passenger.getId(), this.id);
        return true;
    }

//        if (passenger == null) return false;
//        if (countPassengers > 0) {
//
//        if (!isPassengerInBus(passenger)) {
//
//            System.out.printf("Пассажира с id %d нет в автобусе с id %d\n", passenger.getId(), this.id);
//            return false;
//        }
//            for (int i = 0; i < countPassengers; i++) {
//        passengers[passenger.getId()] = passenger;
//        countPassengers--;
//
//            }
//        }
//        System.out.printf("Пассажир с id %d вышел из автобуса %d\n", passenger.getId(), this.id);
//        return true;
   // }





    private int isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if(passengers[i].getId() == passenger.getId()) {
                // id совпали - значит это один и тот же объект
                return i;
            }

            // Пассажира с таким id нет в массиве пассажиров
        }
        return -1; // пассажира в автобусе нет
    }
    public BusDriver getDriver() {
        return driver;
    }
    public int getId() {
        return id;
    }


    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }
}
