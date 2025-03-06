package homework_27;

public class Processor extends Component {

    private double frequency;

    public Processor(String brand, String model, int frequency) {
        super(brand, model);
        this.frequency = frequency;

    }

//    public String toString() {
//        return String.format("Процессор: " + super.toString() + ", частота процессора: " + frequency + " GHz");
//    }
}
