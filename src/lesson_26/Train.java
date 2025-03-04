package lesson_26;

// Train is-a Bus - НЕ верно - > наследоваться не имею право
// public class Train extends Bus {
public class Train extends Vehicle {

    private int capacity;
    private int countPassengers;

    private int countWagons;
    private final int wagonCapacity;

    public Train(String model, int year, int wagonCapacity, int countWagons) {
        super(model, year);
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;

        // Определить вместимость - рассчитать capacity
        calculateCapacity();

    }
    private void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity();
    }
}
