package homework_30.Interfaces;

import lesson_30.interfaces.Book;

public class BooksApp {
    public static void main(String[] args) {

        Book book = new Book("title", "Author");

        book.defaultMethod();
    }

}
