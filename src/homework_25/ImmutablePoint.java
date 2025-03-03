package homework_25;

/*
Task 3
Неизменяемый объект
Создайте класс ImmutablePoint:

•	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */

public class ImmutablePoint {

    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void setX(int x) {
       //this.x = x;
    }

    public static void setY(int y) {
       //this.y = y;
    }

    public static void main(String[] args) {

        ImmutablePoint immutablePoint = new ImmutablePoint(6, 10);
        System.out.println("Поля x и y объявлены как final, поэтому, " +
                "их значения задаются один раз в конструкторе и больше не могут изменяться.");

        //ImmutablePoint.setY(2);





        }


    }
