package homework_18;

public class Task1 {
    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6};
        int length = 3;
        copyOfArray(array, length);

        int[] array2 = new int[]{0, 1, 2};
        int length2 = 5;
        copyOfArray(array2, length2);
        /*
        Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива.
Метод должен создать и распечатать массив заданной в параметрах длинны.
В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}

Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
         */
    }

    public static void copyOfArray(int[] array, int length) {
        int[] newArray = new int[(length)];
        System.out.print("{");
        for (int i = 0; i < newArray.length; i++) {
            if (i >= array.length) {
                newArray[i] = 0;
            } else {
                newArray[i] = array[i];
            }

            System.out.print(newArray[i] + (i != newArray.length - 1 ? ". " : "}\n"));

        }
    }
}
