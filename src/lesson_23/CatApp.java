package lesson_23;

public class CatApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Catty", 8, 5);
        cat.sayMeow();

        System.out.println(cat.toString());

        // System.out.println("Age: " + cat.age);
        // Не доступны, так как помечены как private
        // cat.age = -1000;
        // cat.weight = 1500;
        // cat.name = null;

        System.out.println(cat.toString());

        // cat.testMethod(); // метод не доступен, так как помечен private

        Cat cat2 = new Cat(null, 150, -20);
        System.out.println("Cat2: " + cat2.toString());

        System.out.println("\n=========================");

        int catAge = cat.getAge();
        System.out.println("В следующем году коту будет: " + (catAge + 1));
        System.out.println("Вес: " + cat.getWeight());
        System.out.println("Имя кота: " + cat.getName());

        cat.setAge(15);
        cat.setAge(-10);
        cat.setWeight(15);
        cat.setWeight(-5);
        cat.setWeight(100);
        // cat.setName("MAx"); сеттера в классе нет, имя поменять нельзя.
        // недоступно
        System.out.println(cat.toString());

        cat.isProtected = true;
        System.out.println("isProtected: " + cat.isProtected);
        cat.isDefault = false;
        System.out.println("isDefault: " + cat.isDefault);

    }
}
