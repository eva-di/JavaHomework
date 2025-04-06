package homework_49.validator;

public class PersonApp {

    public static void main(String[] args) {

        Person person = new Person("email@email.com", "Qwertyui1!");
        System.out.println(person);

        System.out.println("==================\n");
        Person person1 = new Person("email.email.com", "qwertyui1!");
        System.out.println(person1);


    }
}
