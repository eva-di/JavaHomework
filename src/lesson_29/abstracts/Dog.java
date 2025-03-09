package lesson_29.abstracts;

public abstract class Dog extends Animal {
    // Если потомок реализовал не все методы родителя, то такой класс должен быть помечен как абстрактный


    @Override
    void move() {
        System.out.println("Dog moves");
    }
}
