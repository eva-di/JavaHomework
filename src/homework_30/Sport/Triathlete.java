package homework_30.Sport;

public class Triathlete implements Swimmer, Runner {

    private String name;
    private int runningSpeed;
    private int swimmingSpeed;


    public Triathlete(String name, int runningSpeed, int swimmingSpeed) {
        if (runningSpeed <= 0 || swimmingSpeed <= 0) return;
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public void run() {
        System.out.printf("Триатлонист %s бежит со скоростью %d км/ч.\n", name, runningSpeed);
    }

    @Override
    public void swim() {
        System.out.printf("Триатлонист %s плывет со скоростью %d км/ч.", name, swimmingSpeed);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}
