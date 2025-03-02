package homework_23;

public class Employee {

    private String name;
    private int age;
    private double salary;

// Генерация кода alt+ insert (Или правая кнопка generate) Constructor - выделить поля

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void info() {
        System.out.printf("Employee name; %s, age: %d, salary: %.2f ", name, age, salary);
    }
   /* public String info() {

        String result = String.format("Имя сотрудника: %s, возраст: %d, зарплата: %d", name, age, salary);
        return result;
    }*/
}
