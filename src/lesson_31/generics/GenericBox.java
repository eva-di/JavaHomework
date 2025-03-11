package lesson_31.generics;

// Дженерики работают только с объектами, т.е. только со сслыочными типами дыных
// НЕ работают с приметивами
// Мы создаем универсальный класс и не указываем конкретный тип данных с которым он работает
// Мы хотим определить тип данных при создании каждого объекта

public class GenericBox <T> { // Символ заполнитель - T -type, E- Element, K,V - key, value
    // Используется большая буква латинского алфавита
    // <T> - означает, что вместо Т при создании объекта будет подставлен конкретный тип данных
    // T - пустое место, шаблон
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox {" +
                "value = " + value +
                '}';
    }
}
