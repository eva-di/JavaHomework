package homework_32.task1;


/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.

Требования:

Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
Пример использования:
Pair<String> pair = new Pair<>("Hello", "World");
System.out.println(pair.getFirst()); // Вывод: Hello
System.out.println(pair.getSecond()); // Вывод: World

pair.swap();
System.out.println(pair.getFirst()); // Вывод: World
System.out.println(pair.getSecond()); // Вывод: Hello
 */
public class Pair <T> {

    private T firstVal;
    private T secondVal;

    public Pair(T firstVal, T secondVal) {
        this.firstVal = firstVal;
        this.secondVal = secondVal;
    }

    T getFirstVal() {
        return firstVal;
    }

    T getSecond() {
        return secondVal;
    }
    void setFirstVal(T value) {
        this.firstVal = value;

    }
    void setSecond(T value) {
        this.secondVal = value;

    }
    void swap() {
        T temp = firstVal;
        firstVal = secondVal;
        secondVal = temp;

    }


}
