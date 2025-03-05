package homework_24;

/*
Task 2 * (Опционально)
Написать класс Собака (Dog).
Каждая Собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.
За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака,
не может быть больше, чем двукратная высота первоначального прыжка.
Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).

Если да -> идем тренироваться -> берет барьер


Task 5 *(Опционально)
- Создать 5 объектов класса Dog (из предыдущего ДЗ) со случайным прыжком от 30 до 80
- Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.
- Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.
- Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке
 */

import java.util.Random;

public class Dog {
    private String name;
    private int initialJumpHeight;
    private int currentJumpHeight;


    public Dog(String name, int initialJumpHeight) {
        this.name = name;
        this.initialJumpHeight = initialJumpHeight;
        this.currentJumpHeight = initialJumpHeight;

    }

    public String info() {
        if (name == null || initialJumpHeight < 0) {
            return String.format("Введите имя собаки и высоту прыжка!");
        } else {
            return String.format("Имя собаки: %s, высота прыжка: %d см", name, initialJumpHeight);
        }

    }

    public void jump() {
        if (name == null || initialJumpHeight < 0) {
            System.out.println("Введите имя собаки и высоту прыжка!");
        } else {
            System.out.println(name + "прыгает!");
        }
    }

    public void train() {
        if (name == null || initialJumpHeight < 0) {
            System.out.println("К сожалению,тренировка невозможна.. Введите имя собаки и высоту прыжка!");
            return;
        }
        Random random = new Random();
        int jumpIncrease = random.nextInt(10) + 1;
        currentJumpHeight = currentJumpHeight + jumpIncrease;

        if (currentJumpHeight > initialJumpHeight * 2) {
            currentJumpHeight = initialJumpHeight * 2;
            System.out.println("Высота прыжка достигла максимальной высоты!");
        } else {
            System.out.printf(name + " тренируется! Высота прыжка увеличилась на: %d см \n", jumpIncrease);
            System.out.printf("Высота прыжка сегодня: %d см\n", currentJumpHeight);
            System.out.println();
        }
    }

    public boolean jumpBarrier(int barrierHeight) {
        if (barrierHeight < 0) {
            System.out.println("К сожалению барьер сломан. Высота барьера меньше 0...");
        }
        if (currentJumpHeight >= barrierHeight) {
            jump();
            System.out.println("Поздравляем! " + name + " преодолела барьер!\n");
        } else {
            System.out.println("К сожалению, ничего не получилось. Высота барьера слишком велика.");
        }
        if (currentJumpHeight < barrierHeight) {
            train();

        }

        return false;
    }

    public String getName() {
        if (name == null) {
            return String.format("Как зовут вашу собаку?");
        } else {
            System.out.print("Имя собаки: ");
            return name;
        }
    }

    public int getInitialJumpHeight() {
        System.out.print("Первоначальная высота прыжка: ");
        return initialJumpHeight;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Имя собаки: " + name);
    }

    public void setInitialJumpHeight(int initialJumpHeight) {
        this.initialJumpHeight = initialJumpHeight;
        System.out.println("Первоначальная высота прыжка: " + initialJumpHeight + " см");
    }
}
