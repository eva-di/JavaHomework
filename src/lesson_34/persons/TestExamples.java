package lesson_34.persons;

import lesson_27.Bus;
import lesson_27.BusDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExamples {

    // @BeforeEach Будет выполняться перед каждым тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Метод, помеченный @BeforeEach");
    }

    /*
    @BeforeAll - выполнится од ин раз перед выполнением первого тестового метода. Должен быть static
    @AfterEach - выполняется после каждого тестового метода
    @AfterAll - выполняется один раз после выполнения всех тестовых методов. Должен быть static
    @Disabled - тест отключен и выполняться не будет
     */

    // @Test указывает, что метод является тестовым
    // я сам не управляю, когда нужно запускать тест
    // Таким образом JUnit знает, что этот метод нужно запустить во время выполнения тестов

    @Test
    public void testAddition() {
        System.out.println("Test Addition");
        int result = 2 + 3;

        // Реальное фактическое значение в переменной result
        // Ожидаемое значение 54

        // Метода проверки утверждений
        // assertEquals(expected, result)
        Assertions.assertEquals(5, result); // проверяет равны ли 2 значения. Тест будет пройден, если 2 значения равны.
        Assertions.assertNotEquals(0, result ); // Тест будет прйдет , если фактический результат не совпадет с "неожидаемым результатом"
        Assertions.assertTrue(result >= 4);
        // Assertions.assertTrue(result >= 10); // проверяет, что условие верно (условие возвращает true) -> тест упал
        assertEquals(10, 5 + 5); // статический импорт позволяет использовать методы без обращения к классу
        assertFalse(result > 10); // Проверяет, что условие ложно (условие возвращает false)
        assertNull(null); // Проверяет, что объект null. Тест будет пройден, если объект = null
        assertNotNull("String"); // проверяет, что объект не равен null

    }

    @Disabled
    @Test
    public void emptyTest () {
        System.out.println("Test empty");
        // Если в методе нет ложного утверждения, он считается пройденным
        // В том числе пустой (вообще без утверждений считается пройденным)
    }

    // Параметризированные тесты позволяют выполнить один и тот же метод с различными значениями

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "kiwi", "cherry"})
    public void testFruits (String fruit) {
        System.out.println("current value " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 4);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void testStatic(int value) {
        System.out.println("static value run: " + value);
        Bus bus = new Bus(new BusDriver("Test", "11111"), 10);
        System.out.println(bus);
    }

    // источник данных в формате CSV - табличный (comma separated value)
    // источник дынных - файл в формате CSV
    // Источник данных - метод

    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSource(String fruit) {
        System.out.println("curent value: " + fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "kiwi", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourceInt(int value) {
        System.out.println("current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -10, 0, 15);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceArguments(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        assertEquals(expected, result);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)

        );
    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void
    testMethodSourcePerson (Person34 person, String newEmail) {
        System.out.println("current valur: " + person);
        System.out.println("New email: " + newEmail);
    }

    static Stream<Arguments> testPersonData() {
        Person34 person34 = new Person34("test@mail.com", "passfffwW1!");
        return Stream.of(
                Arguments.of(person34, "new123#mail.com"),
                Arguments.of(new Person34("invalid.mail.com", "password"), "pass.com")
        );
    }

}