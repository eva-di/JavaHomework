package homework_32.task1;

public class PairApp {

    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirstVal()); // Вывод: Hello
        System.out.println(pair.getSecond()); // Вывод: World

        pair.swap();
        System.out.println(pair.getFirstVal()); // Вывод: World
        System.out.println(pair.getSecond()); // Вывод: Hello
    }
}
