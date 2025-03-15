package lesson_34.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PersonTest {

    Person34 person34;
    String startEmail = "john@test.com";
    String startPassword = "qwertyui1QS!";

    @BeforeEach
    void setUp() {
        person34 = new Person34(startEmail, startPassword);

    }
    /*
    1. Беру валидный email
    2. Устанавливаем его сеттером для person
    3. Мы ожидаем: что у person в поле email будет значение, которое мы установили в шаге 2
     */
    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "tes111@test.com.de"})
    void testValidEmailSet(String validEmail) {

        person34.setEmail((validEmail));

        Assertions.assertEquals(validEmail, person34.getEmail());


    }

    /*
    1. Берем невалидный email
    2. Устанавливаем его сеттером
    3. Ожидаемый результат: emaIl установлен не будет
        3.1. поле email у person не будет равно "не валидный email"
        3.2. значение поля email у Person должно осталось прежнее

     */



}
