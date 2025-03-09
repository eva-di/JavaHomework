package homework_29.Task2;

public class Application {
    public static void main(String[] args) {

    Archer archer = new Archer(25, "Лучник", 10);
    Mage mage = new Mage(56, "Маг", 20);
    Warrior warrior = new Warrior(70, "Воин");

    GameCharacter[] characters = new GameCharacter[3];
    characters[0] = archer;
    characters[1] = mage;
    characters[2] = warrior;

        for (int i = 0; i < characters.length; i++) {
            characters[i].attack();

        }

    }







}
