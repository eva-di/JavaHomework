package lesson_30.flyable;

public interface Flyable {

    void fly();

    default void test() {
        System.out.println("Test");
    }


}
