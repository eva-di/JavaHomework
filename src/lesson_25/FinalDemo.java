package lesson_25;

public class FinalDemo {

    //  Ключевое слово final. Оно может применяться ко всему: к классам, членам класса, полям, методам, переменным
    //  (в т ч к аргументам методов)


    // Для примитивных типов данных, помеченных, как final,
    // После инициализации (присвоения первого значения) изменить значение в переменной нельзя.

    private final int capacity;
    // Для ссылочных типов данных. Нельзя изменить значение переменной (привязать новый объект)
    // Состояние объекта, который привязан, я могу изменять

    private final int[] ints = new int[5];

    private int notFinal;

    public FinalDemo(int capacity) {
        this.capacity = capacity;
        // нельзя поменять значения final переменной
        // this .capacity++;

        // нельзя присвоить ссылку на другой объект или null
//         this.ints = new int[2];

        // Но можно изменить состояние объекта
        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;
    }
    // Параметры метода тоже можно пометить final
    // Внутри метода невозможно изменить значение переменной
    public void finalArguments(int x, int[] array) {
        // нельзя изменить х
        // x++;

        // не могу пррсвоить ссылку на новый объект
        // array = new int[10];

        // могу изменять состояние объекта
        array[0] = x;
        array[1] = 100;

    }

    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }
    // сеттеры для финал полей не генерируются

}
