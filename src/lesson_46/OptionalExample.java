package lesson_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(10, "Peter", 25));
        users.add(new User(5, " Max", 18));
    }

    public static void main(String[] args) {


        // Optional<T> - Это класс-обертка, который может содержать значение типа Т, а может не содержать (быть пустым)

        // Основная задача - уменьшает кол-во ошибок, возникающий при обращении к null

        Optional<User> optUser = getById(10);

        // isPresent) = Мы можем проверить, есть ли в обертке значение
        if (optUser.isPresent()) {
            // Метод get() позволяет получить значение завернутое в Optional
            // если вызвать его на пустом (содержащем Null) получим ошибку NPE
            User user = optUser.get();
            System.out.println("user: " + user);
            System.out.println("Имя: " + user.getName());
        } else {
            System.out.println("Пользователь не найден");
        }

        // boolean isEmpty - вернет true, если Optional пустой
        // orElse(T defaultValue) - распакует из Optional, если есть
        // или вернет значениепо умолчанию

        User current = getById(10).orElse(null);
        System.out.println("getById(1).orElse(null): " + current);


//        // NPE
//        System.out.println(optUser.getName());

    }
    /*
    Как создать Optional:
    1. Optional.of(value) - создает Optional, в котором содержится значение (не пустой и не null)
    Если пережать Null - будет ошибка
    2. Optional.empty() -  создает пустой Optional

    3. Optional.ofNullable(value) - создает Optional, который содержит значение или пустой

     */

    // Обертка указывает на необходимость проверки на null
    public static Optional<User> getById(int id) {
        // список пользователей
        // Перебираем пользователей, сравниваем id

        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }

    public static Optional<User> getById2(int id) {
        // список пользователей
        // Перебираем пользователей, сравниваем id
        User result = null;

        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }

        return Optional.ofNullable(result);
    }
}
