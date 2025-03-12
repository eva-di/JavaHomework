package lesson_32.lists;

public class MyListTest {
    public static void main(String[] args) {

        MyArrayList<Integer> integerList = new MyArrayList<>();
        integerList.add(10);
        System.out.println(integerList);
        integerList.addAll(120, 250, 1000, -100, -200, 0);

        Integer value = integerList.get(0);
        System.out.println(value);

        System.out.println("integeerList.size(): " + integerList.size());
        int index = integerList.indexOf(120);
        System.out.println(index);
        index = integerList.indexOf(250);
        System.out.println(index);

        // хочу удалить элемент со значением 0
        System.out.println(integerList);
        System.out.println(integerList.remove(Integer.valueOf(0))); //!!!!
        System.out.println(integerList);

        integerList.add(null);
        System.out.println(integerList);
        //NPE из-за добавления Null в качестве значения
        // System.out.println(integerList.lastIndexOf(1000));


    }
}
