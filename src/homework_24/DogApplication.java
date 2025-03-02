package homework_24;

public class DogApplication {
    public static void main(String[] args) {

        Dog dog = new Dog("Bobby", 100);

        System.out.println(dog.info());

        dog.train();
        dog.train();
        dog.train();
        dog.train();
        dog.train();
        dog.train();
        dog.train();
        dog.train();

        dog.jumpBarrier(200);

        dog.setName("Dolly");
        System.out.println(dog.info());

        System.out.println(dog.getInitialJumpHeight());
        dog.setInitialJumpHeight(200);

        Dog dog2 = new Dog(null, 150);

        dog2.train();
        dog2.jump();
        System.out.println(dog2.info());

        Dog dog3 = new Dog("Ren", -10);
        dog3.jump();
        dog3.jumpBarrier(-1);
        System.out.println(dog2.getName());
        System.out.println(dog.getName());










    }
}
