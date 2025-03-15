package lesson_34;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
Тесты будут выполняться в алфавитном порядке названий тестовых методов
 */
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderedTestByName {

    @Test
    void testB() {
        System.out.println("testB");
    }
    @Test
    void testA() {
        System.out.println("testA");
    }
    @Test
    void testZ() {
        System.out.println("testZ");
    }

    @Test
    void testL() {
        System.out.println("testL");
    }


}
