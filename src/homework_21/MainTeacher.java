package homework_21;

public class MainTeacher {
    public static void main(String[] args) {
    Teacher teacher = new Teacher("Мария Ивановна", "Математика", "№15");

    teacher.info();
    teacher.teachSubject();
    teacher.giveMarks();
    }
}

