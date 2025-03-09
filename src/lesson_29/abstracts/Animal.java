package lesson_29.abstracts;

/*
Абстрактные классы:
 */

public abstract class Animal {

    private String name;

    public Animal() {
        this.name = "Animal";
    }

    abstract void move(); // у потомка появится обязанность написать свою реализацию метода
    abstract void eat();

    // в абстрактном классе могу присутствовать обычные методы с реализацией
    public void sayHello() {
        System.out.println("Hello from animal!");
    }


}
