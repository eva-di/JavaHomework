package homework_26;

public class Pencil extends Stationary {

    private String hardness;
    private double diameter;

    public Pencil(String name, String hardness, String colour, double diameter) {
        super(name, colour);
        this.hardness = hardness;
        this.diameter = diameter;
    }

    public void draw() {
        System.out.println("Карандаш чертит.");
    }


}
