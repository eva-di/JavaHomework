package lesson_47;

import java.util.Objects;

public class Cat {
    private String name;
    private int weight;
    private String colour;

    public Cat(String name, int weight, String colour) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name = '" + name + '\'' +
                ", weight = " + weight +
                ", colour = '" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && Objects.equals(name, cat.name) && Objects.equals(colour, cat.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, colour);
    }

    public String getName() {
        System.out.println("call getName: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
