package homework_22;

import java.util.Arrays;

public class ArrayEncapsTest {
    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5};

        MagicArrayEncaps magic = new MagicArrayEncaps(test);
        // magic.add(10); // после добавления элемента,
        // происходит расширение массива и проблема ссылки решается

        magic.test();
        magic.add(10);
        magic.test();

        System.out.println(magic.toString());

        test[3] = 1000;
        magic.add(20, 40, 330);

        System.out.println(magic.toString());

        int[] fromMagic = magic.toArray();
        System.out.println(fromMagic.length);
        System.out.println("Массив: " + Arrays.toString(fromMagic));


        System.out.println("\n===================");
        System.out.println(magic.removeByValue(330));
        System.out.println(magic.removeByValue(10000));
        System.out.println(magic.removeByValue(-2_147_483_647));
        System.out.println(magic.toString());
    }
}
