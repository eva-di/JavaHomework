package homework_28.runners;

public class Humain {

    private int speed;
    private int timeToRest;

    protected String typeRunner = "Человек";

    public Humain() {
        this(10, 15);
//        this.speed = 10;
//        this.timeToRest = 15;
    }

    public Humain(int speed, int timeToRest) {
        this.speed = speed;
        this.timeToRest = timeToRest;
    }

    public void run() {
        System.out.printf("%s бежит со скоростью %d км/ч.\n", typeRunner, speed);
        rest();
    }

    public void rest() {
        System.out.printf("%s нужно %d минут для отдыха.\n",typeRunner, timeToRest);
    }

    @Override
    public String toString() {
        return "Humain{" +
                "speed=" + speed +
                ", timeToRest=" + timeToRest +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTimeToRest() {
        return timeToRest;
    }

    public void setTimeToRest(int timeToRest) {
        this.timeToRest = timeToRest;
    }
}
