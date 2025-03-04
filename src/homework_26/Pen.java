package homework_26;

public class Pen extends Stationary {

    private String type;
    private double lineThickness;


    public Pen(String name, String colour, String type, double lineThickness) {
        super(name, colour);
        this.type = type;
        this.lineThickness = lineThickness;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
    }
}
