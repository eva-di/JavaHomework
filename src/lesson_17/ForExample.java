package lesson_17;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {
        /*
        for (<Блок инициализации> ; ; ) {
            // Тело цикла
        }
         */

        int j = 0;

        while (j < 10) {
            System.out.println(j + ", ");
            j++;
        }
        System.out.println();
        System.out.println("Состояние j после цикла: " + j);


        for (int i = 0; i < 10; i++) {
            System.out.println(i + ", ");

        }
        System.out.println();
        System.out.println("После цикла for");

        /*// Запустится бесконечный цикл. ДЛя цикла for ни один из блоков не является обязательным.
        for ( ; ;) {
            System.out.println("Hello World!");
        } */

        int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 = i1 + 100000) {
            System.out.println(i1 + ", ");
        }
        System.out.println();
        System.out.println("Состояние переменной i1:  " + i1);
        // В блоке инициализации может быть переменная любого типа
        for (String str = "HEllo"; str.length() < 10; str += "$") {
            System.out.println(str);
        }

        System.out.println("\n==========================\n");

        //Мы можем инииализировать и изменять любое количество переменных в блоках инициализации и/ или изменений

        int k = 14;
        for (int a =0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f);
        }

        // Создать массив целых цикл случайной длины от 5 до 15
        // Заполнить массив случайными значениями от - 50 до 50 включительно // 0 - 50 -> -50

        Random random = new Random();
        //int length = random.nextInt(11) + 5; // случайная длина
        int[] ints = new int[random.nextInt(11) + 5];

        System.out.print("[");
        // [0 ... len-2] -> ", ", ; len - 1 -> "]"\n

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // [-50 ... 50]
            System.out.print(ints[i] + (i < ints.length -1 ? ", " : "]\n"));

        }
        // System.out.println("]");

        // Найти минимальное значение в массиве

        int min = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min)   min = ints[i];

            }
        System.out.print("Минимальное: " + min);

        System.out.println("\n================\n");

        // continue, break

        for(int i=0; i < 7; i++) {
            if (i == 3) continue; // прерывает текущую итерацию цикла И перейти в блок изменений (i++)
            // Мы перейдем в блок изменений переменных (i++) и потом в блок проверки условия
            // В текущей итерации все команды после continue будут пропущены

            System.out.print(i + ", ");
        }
        System.out.println();


        for(int i = 0; i < 7; i++) {
            if (i == 3) break; // break - прекращает текущую итерацию и работу всего цикла
            // Все последующие итерации не будут выполнены( независимо от условия в блоке проверок)

            System.out.print(i + ", ");
        }
        System.out.println();







    }
}
