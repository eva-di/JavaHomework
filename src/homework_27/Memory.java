package homework_27;

public class Memory extends Component {

    private final int volume;

    public Memory(String brand, String model, int volume) {
        super(brand, model);
        this.volume = volume;
    }

//    public String toString() {
//        return String.format("Память: " + super.toString() + ", объем: " + volume);
//
//    }

    public int getVolume() {
        return volume;
    }
}
