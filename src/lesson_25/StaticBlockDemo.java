package lesson_25;

public class StaticBlockDemo {
    static int counter = 5;
    static String[] colors = new String[3];

    private String title;
    private int capacity = 10; // Инициализация значения

    // Статический блок инициализации
    // в нем могут быть проинициализированы статические поля класса (присвоены значения)
    // Вызывается ровно 1 раз в момент загрузки класса в JVM до вызова конструктора

    static {
        System.out.println("Static Block run!");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }
    // Нестатические блоки инициализации
    // Выполняются при каждом создании объекта
    // Вызывается до создания конструктора

    { // нужен, когда есть несколько конструкторов и повторяющийся код, который нужно писать в каждом конструкторе
        System.out.println("Non-static block run!");
        //this.title = "default";
        if (counter == 0) {
            this.capacity = 50;
        }
        title = "Default";
    }

// Конструктор по умолчанию
    public StaticBlockDemo() {
        System.out.println("Constructor Run!");
    }
    // конструктор 2
    public StaticBlockDemo(String title) {
        System.out.println("Constructor Run!");
    }

    public String toString() {
        return String.format("title:  %s, capacity: %d, static-counter: %d",
                title, capacity, counter);
    }
}
