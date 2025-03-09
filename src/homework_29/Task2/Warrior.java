package homework_29.Task2;

public class Warrior extends GameCharacter {

    public Warrior(int healthPoints, String name) {
        super(healthPoints, name);
    }

    @Override
    public void attack() {
        System.out.println(name + " атакует! Кийя!");
    }


}
