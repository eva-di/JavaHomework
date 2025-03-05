package homework_26.stationary;

public class StationaryApp {
    public static void main(String[] args) {

        Pen pen = new Pen("Parker", "blue", "ink", 1);
        Pencil pencil = new Pencil("Koh-i-Noor", "HB", "grey", 9);

        System.out.println(pen.toString());
        System.out.println(pencil.toString());


    }
}
