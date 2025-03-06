package homework_27;

public class Storage extends Component {

    private int volume;


    public Storage(String brand, String model, int volume) {
        super(brand, model);
        this.volume = volume;


    }

//    public String toString() {
//        return String.format("Накопитель: " + super.toString() + ", объем: " + volume + " GB");
//
//    }



}
