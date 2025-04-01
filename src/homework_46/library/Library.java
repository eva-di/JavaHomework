package homework_46.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
Task 2
Поиск книги в библиотеке
Создайте класс Library, в котором хранится список книг. У каждой книги есть название (title) и автор (author).

Реализуйте метод:
Optional<Book> findBookByTitle(String title)

Он должен возвращать Optional — книгу, если она найдена, или Optional.empty(), если такой книги нет.

Что нужно сделать:
Создайте класс Book с полями title и author, и сделайте для них геттеры.
Создайте класс Library, в котором будет список книг.
Реализуйте метод findBookByTitle, который ищет книгу по названию.
В main() методе попробуйте:
Найти книгу, которая точно есть.
Найти книгу, которой нет.
Вывести информацию о книге, если она найдена.
Вывести "Книга не найдена", если её нет.
 */
public class Library {

    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("Маленький принц", "Мопассан"));
        books.add(new Book("Гарри Поттер", "Роулинг"));
        books.add(new Book("Три товарища", "Ремарк"));
        books.add(new Book("Мастер и Маргарита", "Булгаков"));
    }

    public static void main(String[] args) {

        printBookInfo(findBookByTitle("три"));
        printBookInfo(findBookByTitle("война"));

    }

    private static void printBookInfo(Optional<Book> bookOptional) {
        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            System.out.println("Книга найдена: " + book.getTitle() + " - " + book.getAuthor());
        } else {
            System.out.println("Книга не найдена.");
        }
    }


    private static Optional<Book> findBookByTitle(String title) {

        for (Book book : books) {
            if(book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }


}
