package homework_28.sport;

public class SportsmanAmateur extends Person {


    public SportsmanAmateur() {
        this.speed = 15;
        this.timeToRest = 10;
    }

    @Override
    public void run() {
        System.out.printf("Спортсмен-любитель бежит со скоростью %d км/ч.\n", speed);
        rest();
    }

    @Override
    public void rest() {
        System.out.printf("Спортсмену-любителю нужно %d минут для отдыха.\n", timeToRest);
    }
}
