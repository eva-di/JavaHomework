package lesson_37.emums;

public class TrafficLight {

    private String serialNumber;
    private String Location;

    // Red, yellow, green
    private Colours light;

    public TrafficLight(String serialNumber, String location, Colours light) {
        this.serialNumber = serialNumber;
        Location = location;
        this.light = light;
    }

    @Override
    public String toString() {
        return "TrafficLight {" +
                "serialNumber = '" + serialNumber + '\'' +
                ", Location = '" + Location + '\'' +
                ", light = '" + light + '\'' +
                '}';
    }
}
