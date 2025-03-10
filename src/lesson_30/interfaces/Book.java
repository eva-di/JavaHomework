package lesson_30.interfaces;

// Если класс реализует (имплементирует) интерфейс, класс обязан реализовать ВСЕ абстрактные методы интерфейса

public class Book implements Printable {
    // должный писать private в полях и давать getter setter
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("Book %s (%s)\n", title, author);
    }
}
