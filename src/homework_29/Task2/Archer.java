package homework_29.Task2;

public class Archer extends GameCharacter {

    private int numberOfArrows;

    public Archer(int healthPoints, String name, int numberOfArrows) {
        super(healthPoints, name);
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public void attack() {
        if (numberOfArrows > 0) {
            System.out.println(name + " стреляет!");
            numberOfArrows--;
        } else {
        System.out.println("Атаки не будет. Стрелы закончились!");
        }
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }


}
