package homework_21;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("Вася", 1, "экономика");

        student.info();
        student.study();
        student.doHomework();
        student.passExams();
    }
}
