package lesson_29;


import lesson_28.animals.*;

/*
В Java объекты могут принадлежать классу Х и при этом могут быть приведены к другому типу,
если между классами есть связь наследования.
Это называется кастингом (Casting)

Кастинг бывает двух видов:
1. Восходящее преобразование (Upcasting) - преобразование объекта дочернего класса в тип родительского класса.
2. Нисходящее преобразование (Downcasting) - преобразование объекта родительского класса обратно в тип дочернего класса.


 */
public class CastingExample2 {

    public static void main(String[] args) {

        // Восходящее и нисходящее преобразование

        // Восходящее происходит автоматически

        Animal animal = new Cat(); // тип Cat автоматически преобразуется к типу Animal. Неявное восходящее

        /*
        animal - ссылка на Animal
        new Cat - объект

        !!! Важно!

        Тип ссылочной переменной определяет:
        1) Ссылки на объекты, каких типов могут храниться в этой переменной
        2) Список методов, которые можно вызвать, обращаясь к этой переменной
         */

        // Ссылочная переменная может хранить объект своего класса или любого потомка

        // Какая реализация будет вызвана определяется типом объекта, на который хранится по этой ссылке
        animal.voice();

        Animal animal2 = new Hamster(); // Неявное автоматическое преоразование
        // Сейчас объект Hamster
        animal2.voice();

        System.out.println("\n======================");
        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal2;
        animals[2] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();

        }

        Object obj = new Cat(); //
        System.out.println(obj.toString());

        // Todo Нисходящее преобразование

        int intx = 10;
        double doublex = intx; // неявное автоматическое
        System.out.println(doublex);

        intx = (int) doublex; // явное преобразование с потерей данных
        Animal animalD = new Dog(); // Upcasting - восходящее неявное
        Dog dog = (Dog) animalD; // Downcasting - явное нисходящее преобразование

        // animalD.bark(); // не доступен
        dog.bark();
        Animal animalCat = new Cat();
        //        Dog dog1 = (Dog) animalCat; // нельзя привести объект к неверному типу, будет ошибка компиляции
        // - приведет к ошибке ClassCastException

        System.out.println("\n=========================");
        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.voice();
            // Можно проверит тип объекта для избежания ошибок перед downcasting

            if (currentAnimal instanceof Cat) {
                System.out.println("В ячейке " + i + " is a Cat type");
                Cat catLink = (Cat) currentAnimal;
                catLink.eat(); // Специфический метод кота
            }

            if (currentAnimal instanceof Dog) {
                Dog dogLink = (Dog) currentAnimal;
                dogLink.bark(); // Метод класса Dog
            }
            System.out.println("\n============================");
        }



        /*

         */

        // test(new Cat());


    }

//    public static void test(Animal animal) {
//        animal.voice();
//    }
}
