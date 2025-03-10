package lesson_30.interfaces;

public class Presentation implements ColourPrintable {

    String title;
    String author;
    String theme;


    public Presentation(String title, String author, String theme) {
        this.title = title;
        this.author = author;
        this.theme = theme;
    }

    @Override
    public void colourPrint() {
        System.out.printf("Печатаю презентацию в цвете: автор %s, название: %s, тема: %s\n", author, title, theme);
    }

    @Override
    public void print() {
        System.out.printf("Печать чб презентации %s автора %s\n", title, author);

    }
}
