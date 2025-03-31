package lesson_45;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.fields.ColumnMapping;

import java.util.*;

public class MapExample2 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(4, "green");
        map.put(15, "yellow");
        map.put(16, "blue");
        map.put(0, "white");
        map.put(100, "black");
        map.put(17, "orange");
        map.put(7, "red");

        System.out.println(map);

        // Collection<V> values() - возврвщает коллекцию всех значений карты

        Collection<String> values = map.values();
        System.out.println("map.values(): " + values);

        // Set<K> keySet() - возвращает Set, состоящий из всех ключей карты
        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet: " + keys);

        // могу перебрать ключи в цикле и получать все значения
        for (Integer key : keys) {
            System.out.print(map.get(key) + "; ");
        }
        System.out.println();



        /*
        ФОКУС. Живая связь
        Метод keySet и  values возвравщают представление / проекция (view) соответствующих ключей и значений карты
        // Эта проекция поддерживается самой картой, что означает, что они напрямую связаны с внутренними данными Map-ы
        // Поэтому любые изменение , внесенные в эти представления, отражвется на исходной карте
        // причем эта связь двусторонняя

        // удаляю ключ из сета ключей
         */
        keys.remove(17);

        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);
        System.out.println("===============\n");
        values.remove("green");
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("=========map.remove=========\n");
        map.remove(16);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("==============\n");
        values.removeAll(List.of("red"));
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("==============\n");

        Set<Integer> keyCopy = new HashSet<>(map.keySet());

        keyCopy.remove(0);
        System.out.println("keyCopy: " + keyCopy);
        System.out.println("mao: " + map);

        System.out.println("==============Map.Entry==============\n");

        // Set<Map.Entry<Integer,String> entrySet() - возвращает set вхождения пар к-з

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print("entry: " + entry + " -> ");
            System.out.print("entry.getKey() " + entry.getKey() + " | ");
            System.out.println("entry.getValue() " + entry.getValue());

        }

        // Тоже живая связь
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(100)) {
                entry.setValue("JAVA!");
            }
        }
        System.out.println("map" + map);

        // for-each - перебора всех пар к-з с возможностью применить к ним какую-то функцию






    }
}
