package lesson_42;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        int[] ints = new int[]{9, 5, 1, 2, 4, 3, 0};

        // Лексикографический порядок чувствительный к регистру
        // apple < banana
        // Zebra < apple
        // Apple < apple


        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2025, 300);
        cars[5] = new Car("Ferrari", 2021, 250);


        printCars(cars);
        Arrays.sort(cars);

        // Интерфейс Comparable<T> (сравнимый)
        // Интерфейс Comparator<T>

        printCars(cars);



    CarSpeedComparator speedComparator = new CarSpeedComparator();

    Arrays.sort(cars, speedComparator);
    printCars(cars);

    System.out.println("=========================\n");

    Arrays.sort(cars, new CarModelComparator());

    printCars(cars);

    System.out.println("==========================\n");

    // Анонимные классы - это класс для создания объекта на лету юез явного объявления нового класса
    // Используются когда необходим одноразовый объект - используется только 1 раз
    // способ создания объекта на лету (вместо public class CarModelComparator implements Comparator<Car>)

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        printCars(cars);

        // Отсортировать машины по году выпуска в обратном порядке

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            // 4, 1, 10
            // -> 1, 4, 10
            // -> 10, 4, 1

            // a vs b -> a - b ->
            // 4 vs 10 -> 4, 10
            // -> 10, 4
            public int compare(Car car1, Car car2) {
           //     return car1.getYear() -car2.getYear() * (-1);
                return car2.getYear() - car1.getYear();
            }
        });
        printCars(cars);

        // Сравнить машины по году выпуска в порядке возрастания.
        // А если год совпадает - то тогда такие машины сравнить по модели в порядке убывания

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                int yearCompare = car1.getYear() - car2.getYear();
                if (yearCompare != 0) {
                    return yearCompare;
                }
                // годы машин равны (yearCompare = 0)
                // Обратный порядок по модели
                return car2.getModel().compareTo(car1.getModel());
            }
        });

        printCars(cars);

        // Функциональный интерфейс = это интерфейс, который имеет ровно один абстрактный метод
        // (метод, который нужно реализовать)
        // могут быть доп статические методы или дефолтные
        // с JAva 8 Comparator имеет ровно 1 абстрактный метод CompareTo(int)

        // Интерфейс Comparator - функциональный интерфейс

        /*
       Лямбда выражение - это краткий способ реализации анонимных функций (методов в JAva)
       Компактный синтаксис для реализации функциональных интерфейсов

       (параметры) -> тело функции
       (parameters) -> expression
       или
       (parameters) -> {statements;}

       Лямбда выражения во многих случаях могут заменить анонимные классы и реализовывать на лету
       функциональные интерфейсы
         */

        // По году в обратном порядке с использованием лямбда выражения

        Arrays.sort(cars, (car1, car2) -> {
            return car2.getYear() - car1.getYear();
        });

        printCars(cars);

        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());

        // Отсортировать машины по максимальной скорости в порядке убывание.
        // Если скорость совпадает - отсортировать по году - естественный порядок

        Comparator<Car> carComparator = (car1, car2) -> {
//            System.out.println(car1.getMaxSpeed() + " | " + car2.getMaxSpeed());
         //   int speedCompare = car1.getMaxSpeed() - car2.getMaxSpeed();
            int speedCompare = Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed());
       //     System.out.println("car1 - car2: " + speedCompare);

            // -2147483648 vs 100 |  -2147483648 - 100 ? 2147483548 - Переполнение типов

            if (speedCompare == 0) {
                return Integer.compare(car1.getYear(), car2.getYear());
            }
            return speedCompare;

        };

        Arrays.sort(cars, carComparator);
        printCars(cars);

        // Comparator имеет набор статических и дефолтных методов, облегчающих написание сложных или составных компараторов

        // comparing - позволяет сортировать объекты по ключу
        // функция-ключ - это способ вытащить из объекта то значение по которому мы хотим сравнивать 2 объекта
        /*
        car -> car.getYear()
        car::getModel
         */
        // Отсортировать машины по модели в естественном порядке
        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel());
        Arrays.sort(cars,byModel);
        printCars(cars);

        // ссылка на метод - это сокращенная запись лямбда

        Arrays.sort(cars, Comparator.comparing(Car::getModel));
        printCars(cars);

        // Специальные версии метода для сравнения примитивов. Избежать автоупаковки и автораспаковки
        // comparingInt, comparingLong, comparingDouble
        Arrays.sort(cars, Comparator.comparing(Car::getYear));

        /*
        Второй параметр метода comparing
        Comparator.naturalOrder() - определяет естественный порядок сортировки
        Comparator.reverseOrder - определяет обратный порядок сортировки
        Comparator.nullFirst - Значения null будут признаны наименьшими, то есть идти в начале слева
        Comparator.comparing (класс:: метод).thenComparing
         */
        // Отсортировать по году выпуска в порядке убывания
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);

        cars[5] = new Car("VW", 2021, 250);

        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)));
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(Comparator.reverseOrder())));

        printCars(cars);

        System.out.println("====================\n");
        // Отсортировать по модели, если они равны, то отсортировать по убыванию года выпуска
        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));

        printCars(cars);

        // Отсортировать машины по году выпуска, если год равен - отсортировать по модели в обратном порядке

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.reverseOrder()).reversed());
        printCars(cars);

        // Отсортировать машины по году в обратном порядке, если равны, то по макс скорости в естественном
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()).thenComparing(car -> car.getMaxSpeed()). reversed());
        printCars(cars);


















    }


        public static void printCars(Car[] cars) {

            System.out.println("=======================");
            for (Car car : cars)
                System.out.println(car);
            System.out.println("========================\n");
        }




}




