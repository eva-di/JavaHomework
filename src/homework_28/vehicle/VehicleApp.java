package homework_28.vehicle;

public class VehicleApp {
    public static void main(String[] args) {


        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Motorcycle();
        vehicles[2] = new Bicycle();

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
        }

    }
}
