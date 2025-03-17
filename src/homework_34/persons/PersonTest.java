package homework_34.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwertyui1QS!";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);

    }
    /*
    1. Беру валидный email
    2. Устанавливаем его сеттером для person
    3. Мы ожидаем: что у person в поле email будет значение, которое мы установили в шаге 2
     */
    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "tes111@test.com.de"})
    void testValidEmailSet(String validEmail) {

        person.setEmail(validEmail);

        Assertions.assertEquals(validEmail, person.getEmail());


    }


    /*
    Task1
Написать тестовый метод для проверки работы с "не валидными" email в классе Person.
Тестовые данные должны содержать максимально полный набор не валидных email-ов
С двумя собаками
без точки после собаки
и так далее

    1. Берем невалидный email
    2. Устанавливаем его сеттером
    3. Ожидаемый результат: emaIl установлен не будет
        3.1. поле email у person не будет равно "не валидный email"
        3.2. значение поля email у Person должно осталось прежнее

     */

    @ParameterizedTest
    @MethodSource ("testInvalidEmail")
    void testInvalidEmailDoesNotSet (String invalidEmail) {
        person.setEmail(invalidEmail);
        System.out.println("Ввожу неверный email: " + invalidEmail);
        System.out.println("Текущий email после setEmail: " + person.getEmail());
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> testInvalidEmail() {
        return Stream.of(
                "mail.mail.com",
                "mail@gmail@net",
                "mail@mail",
                "mail@mail.d",
                "email@domain#.com",
                "mail!gmail.com",
                "ma il@mail.com",
                "@mail.com",
                null);
    }

    /*
    Task2
Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.
     */


    @ParameterizedTest
    @ValueSource(strings = {"Qwerty1!", "!№%?*()[],.-Qq1"})
    void testValidPasswordSet(String validPassword) {
        person.setPassword(validPassword);
        Assertions.assertEquals(validPassword, person.getPassword());

    }


    @ParameterizedTest
    @MethodSource ("testInvalidPassword")
    void testInvalidPasswordDoesNotSet (String invalidPassword) {
        person.setPassword(invalidPassword);
        System.out.println("Ввожу неверный password: " + invalidPassword);
        System.out.println("Текущий password после setPassword: " + person.getPassword());
        Assertions.assertNotEquals(invalidPassword, person.getPassword());
    }

    static Stream<String> testInvalidPassword() {
        return Stream.of("qwertyui",
                "QWERTYUI",
                "QWERTYUI1!",
                "QWERTYUI!",
                "QWERTYUI1",
                "Qwertyui!",
                "Qwertyui1",
                "qwertyuii!1",
                "123456789",
                "1234567890!",
                "1234567890Q!",
                "1234567890Qq",
                "1234567890q!",
                "!@#$%^&*()_+",
                null);
    }



}
