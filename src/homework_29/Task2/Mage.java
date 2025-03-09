package homework_29.Task2;

public class Mage extends GameCharacter {

    private int amountOfMana;

    public Mage(int healthPoints, String name, int amountOfMana) {
        super(healthPoints, name);
        this.amountOfMana = amountOfMana;
    }

    @Override
    public void attack() {
        if (amountOfMana > 0) {
            System.out.println(name + " наводит порчу!");
            amountOfMana -= 10;
        } else {
        System.out.println("Мана закончилась. Найди колодец!");
        }
    }

    public int getAmountOfMana() {
        return amountOfMana;
    }

    public void setAmountOfMana(int amountOfMana) {
        this.amountOfMana = amountOfMana;
    }


}
