package lesson_30.flyable;

public class Duck implements Flyable, Swimmable {

    // Class B extends A, A extends C; != class B extends A, C


    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("DUck is swimming");

    }
}
