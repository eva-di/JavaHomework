package lesson_28.animals;
/*
В Java полиморфизм проявл. в двух формах:
Статический (компиляционный) полиморфизм - реализуется с помощью перегрузки методов (Method Overloading)
Одно название методов, При условии что у ни х разный набор параметров

Динамический (исполнительный) полиморфизм - реализуется через переопределение методов (Method Overriding)

 */

public class Animal { // (неявно наследуеся от класса extends Object)

    public void voice() {
        System.out.println("Animal says something.");
    }
// Переопределение метода родителя Object
    @Override
    public String toString() {
        return  "Animal toString!";
    }
}
