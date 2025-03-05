package homework_24.consult;



import java.util.Arrays;
import java.util.Random;

public class DogsApp5 {

    public static void main(String[] args) {
        Random rand = new Random();

        Dog2[] dogs = new Dog2[5];

        for (int i = 0; i < 5; i++) {
            int jump = rand.nextInt(51) + 30;
            dogs[i] = new Dog2("Dog " + (i + 1), jump);

        }

        System.out.println(Arrays.toString(dogs));

        int[] barriers = new int[7];
        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = rand.nextInt(101) +70;

        }
        System.out.println("барьер: " + Arrays.toString(barriers));

        int[] result = new int[dogs.length];

        for (int i = 0; i < dogs.length; i++) {
            Dog2 currentDog = dogs[i];

            System.out.println(currentDog.toString()+ " стартует");

            int count = 0;
            for (int j = 0; j < barriers.length; j++) {
                int currentBarrier = barriers[j];
                if (currentDog.jumpBarrier(currentBarrier)) {
                    count++;
                }

            }
            result[i] = count;
            System.out.println("Собака: " + currentDog.getName() + "преодолела барьеров: "+ count);



        }
        System.out.println("Результаты: " + Arrays.toString(result));

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].toString() + " -> ");
            System.out.println("Ее результат: " + result[i]);

        }

    }
}
