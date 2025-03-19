package lesson_37.emums;

public class AppTraffic {
    public static void main(String[] args) {


        Colours colour = Colours.RED;
        System.out.println("colour: " + colour);

        Colours[] colours = Colours.values(); // получаю массив всех значений enum

        for (Colours current : Colours.values()) {
            System.out.println(current);
        }
        // Возвращает константу enum по указанному имени (строке)
        Colours red = Colours.valueOf("RED");

        // Enum безопасно стравнивать оператором == (не обязательно использовать метод equals())
        System.out.println("colour == Colours.RED " + (colour == Colours.RED));

        // У каждой констранты есть порядковыввй номер (начиная с 0)
        System.out.println("colour.ordinal() " + colour.ordinal());

        TrafficLight trafficLight = new TrafficLight("SSN-001", "Berlin", Colours.YELLOW);

        System.out.println(trafficLight);
       }
}
