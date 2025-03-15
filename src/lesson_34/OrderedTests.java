package lesson_34;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


// Порядок запуска тестовых методов будет определяться аннотацией @Order
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(10)
    void firstTest() {
        System.out.println("First test");
    }
    @Test
    @Order(20)
    void secondTest() {
        System.out.println("Second test");

    }

    @Test
    @Order(15)
    void thirdTest() {
        System.out.println("Third test");
    }

    @Test
    void randomTest() {
        System.out.println("Random test");
    }
}
