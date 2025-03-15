package lesson_24.persons;

/*
Массив объектов или массив ссылочных типов данных. Массив, элементы которого являются ссылками на объект
 */


public class PersonApp {
    public static void main(String[] args) {
        Person garry = new Person("Garry", 31, "Photo");
        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Reading, music");
        System.out.println(john.toString());

        Person[] people = new Person[5]; // Создаю массив для 5 ссылок на объекты типа Person34

        // Значения по умолчанию для типа данных - null

        people[0] = garry; // обычная ссылка
        people[3] = john;
        people[1] = new Person("Tom", 5, "crying");

        System.out.println("\n=======================");

        System.out.println("people[0]: " + people[0].toString());
        System.out.println(people[0].getName());
        people[0].setName("Peter");
        System.out.println(people[0].toString());
        System.out.println(garry.toString());

        System.out.println("\n================ For==========");

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println(people[i].toString());
                System.out.println(people[i].getName());
            } else {
                System.out.println("NULL!!");
            }

        }

        System.out.println("\n================================");

        Person test = new Person("Test", 50, "coding");
        people[2] = test;

        people[2].setName("Test1");
        test.setAge(52);
        System.out.println(test.toString());

        test = null; // ссылка, в ней может хранить null, объект сохранится,
        // а ссылка не будет ссылаться ни на какой объект
        System.out.println(people[2].getHobby());

        test = people[1];

        Person deleteME = new Person("DeleteMe", 0, "crashing");

        deleteME = null; // удаление ссылки, объект (без ссылки) рано или поздно удалится
        // garbage collector удаляет объекты, на который нет ссылок, из памяти

    }



}
