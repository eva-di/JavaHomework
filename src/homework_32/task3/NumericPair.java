package homework_32.task3;
/*
Task 3: Обобщенный класс с ограничениями типов
Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.
Метод double sum() возвращает сумму этих чисел.
Пример использования:
NumericPair<Integer> intPair = new NumericPair<>(10, 20);
System.out.println(intPair.sum()); // Вывод: 30.0

NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
System.out.println(doublePair.sum()); // Вывод: 10.0
 */

public class NumericPair <T extends Number, E extends Number > {
    private T number;
    private T number2;

    public NumericPair(T number, T number2) {
        this.number = number;
        this.number2 = number2;
    }

    public double sum() {
        double sum = number.doubleValue() + number2.doubleValue();
        return sum;
        }

    public T getNumber2() {
        return number2;
    }

    public void setNumber2(T number2) {
        this.number2 = number2;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
