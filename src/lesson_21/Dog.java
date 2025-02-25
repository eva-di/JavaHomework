package lesson_21;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public void info() {
        System.out.println("Я собака " + name + ", мой вес : " + weight);
    }

    public void eat() {
        System.out.println("Я кушаю, ням-ням!");
        this.weight++; // Увеличиваем вес на 1
    }

    public void run() {
        /*
        1. Достаточен ли вес собачки для пробежки
        2. Если вес слишком мал, собака должна поесть перед тренировкой
         */
        while (weight < 3) {
            System.out.println("Сорян, я слишком худая и голодная! Бежать на могу. Надо поесть!");
            System.out.println("Мой вес сейчас: " + weight);
            eat();
        }

        System.out.println("Я бегу!");
        weight -= 2; //  уменьшаем вес на 2
        System.out.println("Вес после пробежки:" + weight);
        System.out.println("=======================\n");

    }
}
