package homework_28.runners;

public class RunnersApp {
    public static void main(String[] args) {

        Humain humain = new Humain();
        Amateur amateur = new Amateur();
        ProfiRunner prof = new ProfiRunner();

        humain.run();

        amateur.run();
        prof.run();

        Humain[] humains = new Humain[3];

        humains[0] = humain;
        humains[1] = amateur;
        humains[2] = prof;

        System.out.println("===============================");
        for (int i = 0; i < humains.length; i++) {
            humains[i].run();

        }
    }
}
