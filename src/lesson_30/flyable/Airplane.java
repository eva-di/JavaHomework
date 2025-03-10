package lesson_30.flyable;

public class Airplane extends Transport implements Flyable {

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    boolean takePassenger() {
        if (amountPassengers < capacity) {
            amountPassengers++;
            return true;
        }
        return false;
    }

    // Если не смогла реализовать обязательный метод, то длжен объявить метод абстрактным
    @Override
    public void fly() {
        System.out.println("Airplane fly");
    }
}
