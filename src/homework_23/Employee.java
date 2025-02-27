package homework_23;

public class Employee {

    private String name;
    private int age;
    private int salary;


    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String info() {

        String result = String.format("Имя сотрудника: %s, возраст: %d, зарплата: %d", name, age, salary);
        return result;
    }
}
