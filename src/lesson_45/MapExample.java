package lesson_45;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class MapExample {
    public static void main(String[] args) {

        // Map<K, V>

        // КОЛЛИЗИЯ - иногда разные ключи могут привести к одному номеру ячейки (одинаковый хэшкод и/или номер ячейки)

        Map<Integer, String> oldTable = new Hashtable<>(); // устаревшая, медленная, не рекомендуется к использованию

        Map<String, String> phoneBook = new HashMap<>();

        // Добавить пару ключ-значение
        // V put(K key, V value) ->  возвращает старое значение, соответствующее ранее этому ключу
        // Если такого ключа еще не было, вернет null

        System.out.println(phoneBook.put("Hanna", "+491111"));
        phoneBook.put("Max", "+492222");
        phoneBook.put("John", "+493333");
        System.out.println("phonebook: " + phoneBook);

        String oldValue = phoneBook.put("John", "+494444");
        System.out.println("oldValue: " + oldValue);
        System.out.println("phonebook: " + phoneBook);

        Map<String, String> book2 = new HashMap<>();
        book2.put("Sebastian", "+495555");
        book2.put("Michael", "+496666");

        // putAll - принимает (Map) и копирует все пары ключ-значение из этой карты
        phoneBook.putAll(book2);
        System.out.println("phonebook: " + phoneBook);

        // boolean containsKey(Object key) - вернет true, если карта содержит такой ключ
        // boolean containsValue(Object value) - вернет true, если карта содержит хотя бы одно такое значение

        phoneBook.containsKey("Michael");

        System.out.println("phoneBook.containsKey(\"Michael\")" + phoneBook.containsKey("Michael"));
        System.out.println("phoneBook.containsKey(\"123\")" + phoneBook.containsKey("123"));
        System.out.println("phoneBook.containsValue(\"+494444\")" + phoneBook.containsValue("+494444"));



        System.out.println("=========GET============");

        // Взятие значения по ключу
        // V get (K key) - возвращает по ключу. Если ключа нет - вернет null

        String value = phoneBook.get("Hanna");
        System.out.println("phonebook.get(\"Hanna\")" + value);

        System.out.println("phoneBook.get(\"KEY\")" + phoneBook.get("KEY")); // null

        //getOrDefault(Object key, V defaultValue)
        // Возвращает значение по ключу. Если ключа нет - вернет значение по умолчанию
        String val2 = phoneBook.getOrDefault("Hanna", "DEFAULT");
        System.out.println("phonebook.getOrDefault(\"Hanna\") " + val2);
        val2 = phoneBook.getOrDefault("KEY", "DEFAULT");
        System.out.println("phonebook.getOrDefault(\"KEY\")" + val2);

        System.out.println("Objects.hashCode(null) " + Objects.hashCode(null));

        System.out.println("========================\b");

        // Конструкторы
        // 16 корзин, Коэффициент заполнения 0,75
        Map<Integer, String> construct = new HashMap<>(); // Создается пустой список пар ключ-значение
        construct = new HashMap<>(30); // Создается пустой словарь на 32 корзины. Коэффициент заполнения 0, 75 по умолчанию
        construct = new HashMap<>(32, 0.90f); // Создается пустой словарь. 32 корзины, коэф заполнения 0.90
        Map<Integer, String > otherMap = new HashMap<>();
        otherMap.put(1, "a");

        construct = new HashMap<>(otherMap); // скопирует все пары ключ-значение
        System.out.println(construct);

        // V remove(Object key) - удаляет пару ключ-значение , возвращает старое значение

        System.out.println("phoneBook" + phoneBook);
        System.out.println("phoneBook.remove(\"Sebastian\")" + phoneBook.remove("Sebastian"));
        System.out.println("phoneBook" + phoneBook);
        System.out.println("phoneBook.remove(\"Sebastian\")" + phoneBook.remove("Sebastian")); // Ключа нет - вернет null

        // boolean remove(Object key, Object value) - Удаляет пару к-з, только если они совпадают

        System.out.println("phoneBook.remove(\"John\", \"0000\")" + phoneBook.remove("John", "0000"));
        System.out.println("phoneBook.remove(\"John\", \"+494444\")" + phoneBook.remove("John", "+494444"));


        // void clear() - Очищает карту
        // int size() - возвращает количество элементов (пар ключ-значение)
        System.out.println("phoneBook.size()" + phoneBook.size());

        // boolean isEmpty() - вернут true, если словарь пустой







    }
}
