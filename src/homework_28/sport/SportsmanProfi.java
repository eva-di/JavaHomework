package homework_28.sport;

public class SportsmanProfi extends SportsmanAmateur {


    public SportsmanProfi() {
        this.speed = 25;
        this.timeToRest = 5;
    }

    @Override
    public void run() {
        System.out.printf("Профессионал бежит со скоростью %d км/ч.\n", speed);
        rest();
    }

    @Override
    public void rest() {
        System.out.printf("Профессионалу нужно %d минут для отдыха.\n", timeToRest);
    }
}
