package homework_28.sport;

public class PersonApp {

    public static void main(String[] args) {

        Person person = new Person();
        person.run();

        SportsmanAmateur amateur = new SportsmanAmateur();
        amateur.run();

        SportsmanProfi profi = new SportsmanProfi();
        profi.run();
    }
}
