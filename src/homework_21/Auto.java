package homework_21;

public class Auto {
    String make;
    String colour;
    double petrolAmount;
    int ride;

    public Auto(String make, String colour, double petrolAmount) {
        this.make = make;
        this.colour = colour;
        this.petrolAmount = petrolAmount;
        this.ride = ride;
    }
    public void info() {
        System.out.println("Марка машины: " + make + ", цвет: " + colour + ", объем бензобака: " + petrolAmount);

    }
    public void ride() {
        while (petrolAmount <= 0) {
            System.out.println("Нужно заправить авто!");
            stop();
            fillUpTank();
        }
        System.out.println("Еду!");
        petrolAmount -=10;
        ride++;
        service();
        System.out.println("Осталось бензина в баке: " + petrolAmount);

    }

    public void stop (){
        System.out.println("Останавливаюсь!");
    }

    public void fillUpTank() {
        System.out.println("Заправляюсь!");
        this.petrolAmount += 30;
        System.out.println("Количество бензина после заправки: " + petrolAmount);
    }

    public void service() {
        if (ride >= 5) {
            System.out.println("После 5 поездок еду на техосмотр!");
        }
    }
}
