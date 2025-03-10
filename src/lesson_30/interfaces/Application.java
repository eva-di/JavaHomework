package lesson_30.interfaces;

public class Application {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "Булгаков");

        book.print();
        book.defaultMethod();
        System.out.println("=================\n");
        Journal journal = new Journal("Cosmopolitan", 154);

        journal.print();
        journal.defaultMethod();

        System.out.println("==============\n");

        //  Тип ссылки типа интерфейс
        // Набор методов доступный по ссылке - методы, прописааные в интерфейсе
        // Объект класса, который реализовал данный интерфейс
        Printable printable = journal; // Неявное автоматическое приведение типа ссылки (casting)
        Printable printable2 = new Book("Философия Java", "Б.Эккель");
        printable2.print();

        System.out.println("===============\n");

        Printable.testStaticMethod("Hello!");
        System.out.printf("====================\n");

        ColourPrintable presentation = new Presentation(
                "Inheritance",
                "Noname",
                " Inheritance in OOP");

        presentation.print();
        presentation.defaultMethod();
        presentation.colourPrint();




    }
}
