package lesson_48.groupingBy;

import java.util.Objects;

public class Employee {

    private String name;
    private double salary;
    private int age;
    private String position;
    private String department;

    public Employee(String name, double salary, int age, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.position = position;
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("{%s : %.2f : %s : %s}", name, salary, position, department);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        Employee employeee = (Employee) o;
        return Double.compare(salary, employeee.salary) == 0 && age == employeee.age && Objects.equals(name, employeee.name) && Objects.equals(position, employeee.position) && Objects.equals(department, employeee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, age, position, department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
