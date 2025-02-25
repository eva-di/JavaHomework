package homework_21;

public class Teacher {
    String name;
    String subject;
    String schoolName;

    public Teacher(String name, String subject, String schoolName) {
        this.name = name;
        this.subject = subject;
        this.schoolName = schoolName;
    }

    public void info() {
        System.out.println("Я учитель. Мнея зовут " + name + ", Мой предмет: " + subject + " и я работаю в школе: " + schoolName + ".");
    }

    public void teachSubject() {
        System.out.println("Я веду урок.");
    }

    public void giveMarks() {
        System.out.println("Я заполняю журнал.");
    }
}



