package homework_23;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee = new Employee("Роберт", 45, 5000.00);

        employee.info();

        System.out.println(employee.getName());

        Employee peter = new Employee("Peter", 45, 1000.00);

        System.out.println(peter.getSalary());
        peter.setSalary(1000);
        peter.info();

    }
}
