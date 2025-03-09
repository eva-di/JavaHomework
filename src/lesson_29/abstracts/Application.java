package lesson_29.abstracts;

public class Application {
    public static void main(String[] args) {
        // cannot be instantiated нельзя создать объект абстрактного класса
        // они предназначены, чтобы кто-то от них наследовался
        // Animal animal = new Animal();

        Cat cat = new Cat();

        cat.eat();
        cat.sayHello();

    }
}
