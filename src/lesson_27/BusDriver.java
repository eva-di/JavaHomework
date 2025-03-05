package lesson_27;

public class BusDriver {

    private final int id;
    private static int idCounter = 101; // static одна на всех


    private String name;
    private String license;

    public BusDriver(String name, String license) {
        this.id = idCounter++;
        this.name = name;
        this.license = license;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusDriver: {");
        // Цепочка вызовов = Method chaining
        sb.append("id: ").append(id); // Через точку можно прилепить сколько угодно вызовов
        sb.append(", name: ").append(name);
        sb.append("}");

        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
