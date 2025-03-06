package lesson_28.animals;

public class ZooApp {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.voice(); // Унаследован от Animal
        System.out.println(cat.toString());

        cat.eat();// Метод класса Cat

        System.out.println("\n================================");

        Dog dog = new Dog();

        dog.voice(); // Если в потомке не переопределен метод,
        // то в потомке будет вызвана реализация метода родителя
        System.out.println(dog.toString());

        System.out.println("\n======================");

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());
        Object object = new Object(); // Корень иерархии наследования
    }
}
