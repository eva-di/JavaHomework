package homework_48.grouping;

public class Student {
    private String name;
    private int age;
    private String major; // специальность
    private int year;     // курс
    private double grade;

    public Student(String name, int age, String major, int year, double grade) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.year = year;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("\n{Имя: %s | возраст: %d | специальность: %s | год: %d | оценка: %.2f }",
                name, age, major, year, grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
