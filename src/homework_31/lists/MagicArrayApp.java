package homework_31.lists;

public class MagicArrayApp {
    public static void main(String[] args) {


        MyArrayList list = new MyArrayList<>();
        list.add(10);
        list.add("Hello");
        list.add(0.5);
        System.out.println(list);
        list.remove("Hello");
        System.out.println(list);
        list.addAll("bye", 0.3, 8, "Alex");
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Index[2] : " + list.get(2));
        list.set(2, -1);
        System.out.println("set index[2]: " + list);
        System.out.println("Массив пусто1? " + list.isEmpty());
        System.out.println("Содержит -1: " + list.contains(-1));








    }
}
