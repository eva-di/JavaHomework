package lesson_28.animals;

public class Cat extends Animal {

    // Уникальный функционал кота
    public void eat() {
        System.out.println("Cat eats.");

    }

    // Переопределение родительского метода voice()
    @Override // Аннотация - доп инфо, не влияет для выполнения программы,
    // но может использоваться библиотеками, фреймворками, компилятором.
    // Предназначена для компилятора.
    // Указывает, что метод переопределяет родительский метод
    public void voice() {
        System.out.println("Cat says meow!");
    }
}
