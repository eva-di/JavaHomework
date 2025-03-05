package homework_26.stationary;

/*
Task 2
Придумать и написать как минимум одну иерархию классов в которой будет один родительский клас и два наследника,
расширяющих его функционал

У родительского класса должен быть метод создающий строку с информацией об объекте (метод String toString())
 */

public class Stationary {

    private String name;
    private String colour;

    public Stationary(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String toString() {
        return colour + " " + name;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
