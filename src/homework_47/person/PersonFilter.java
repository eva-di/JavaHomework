package homework_47.person;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */
public class PersonFilter {

    public static void main(String[] args) {

        filterPerson();

    }

    private static void filterPerson() {
        Person person = new Person("Jack", 35, "Berlin");
        Person person1 = new Person("Maria", 15, "Dublin");
        Person person2 = new Person("Fabian", 26, "Berlin");
        Person person3 = new Person("John", 18, "Berlin");

        Person[] people = {person, person1, person2, person3, null, person};

        List<Person> filtered = Arrays.stream(people)
                .filter(Objects::nonNull)
                .filter(per -> per.getAge() > 25 && per.getCity() == "Berlin")
                .distinct()
                .collect(Collectors.toList());

        System.out.println(filtered);

    }
}
