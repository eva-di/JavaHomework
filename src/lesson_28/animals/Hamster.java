package lesson_28.animals;

public class Hamster extends Animal{
    // Ничего не переопределяем - получаем реализацию всех род методов по наследству

// Переопределение родителя Animal
    @Override
    public String toString() {
        return "Hamster";
    }
}
