package homework_21;

import java.security.PublicKey;

public class Student {
    String name;
    int year;
    String faculty;

    public Student(String name, int year, String faculty) {
        this.name = name;
        this.year = year;
        this.faculty = faculty;

    }

    public void info() {
        System.out.println("Меня зовут " + name + ". Я учусь на " + year + " курсе на факультете: " + faculty);

    }

    public void study() {
        System.out.println("Я учусь в университете.");

    }

    public void passExams() {
        System.out.println("У меня сейчас сессия. Я сдаю экзамены.");
    }

    public void doHomework() {
        System.out.println("Нам много задают. Мне надо сделать ДЗ.");
    }

}
