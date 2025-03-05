package homework_24.consult;

public class Dog2 {

    private String name;
    private int jumpHeight;

    private static final int INCREASE_PER_TRAINING = 10;
    private final int maxJumpHeight;

    public Dog2(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        maxJumpHeight = jumpHeight * 2;
    }

    public void jump() {
        System.out.println(name + " прыгнула");

    }
    public void train() {
        jumpHeight += INCREASE_PER_TRAINING;

        if (jumpHeight > maxJumpHeight) {
            jumpHeight = maxJumpHeight;
        }

    }

    public boolean jumpBarrier(int barrier) {
        // Текущий прыжок больше или равкен барьеру
        if (jumpHeight >= barrier) {
            // Может прыгнуть без тренировок
            jump();
            return true;
        }

        // Надо проверить, помогуть ли тренировки
        if (maxJumpHeight >= barrier) {
            // Надо тренироваться и потом прыгать
            while (jumpHeight < barrier) {
                train();

            }
            jump();
            System.out.printf("Собака %s  перепрыгивает баоьер %d\n", name, jumpHeight, barrier);
            return true;

        }
        // Если барьер больше чем макс
        System.out.printf("Барьер высотой %d собака %s взять не может! \n", barrier, name);
        return false;
    }

    public String toString() {
        return String.format("Dog %s: current jump: %d. MAx jump: %d\n", name, jumpHeight, maxJumpHeight);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
