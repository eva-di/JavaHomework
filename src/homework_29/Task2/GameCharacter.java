package homework_29.Task2;
/*
Task 2
Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
Определите абстрактный метод attack(), который будет различаться для разных типов персонажей
(например, воин атакует мечом, а маг использует магические заклинания).
Создайте несколько конкретных подклассов, представляющих разные типы персонажей, такие как Warrior, Mage, Archer, и т. д.
Переопределите метод attack() для каждого класса.
Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.
 */

public abstract class GameCharacter {

    protected String name;
    private int healthPoints;

    public GameCharacter(int healthPoints, String name) {
        this.healthPoints = healthPoints;
        this.name = name;
    }

    public abstract void attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
