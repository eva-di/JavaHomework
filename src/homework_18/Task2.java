package homework_18;

public class Task2 {
    public static void main(String[] args) {
                /*
        Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
         */

        String[] array = new String[]{"How", "wonderful", "life", "is", "!"};
        String[] newArray = minMaxStrings(array);
        printArray(newArray); //check results
    }

    public static String[] minMaxStrings(String[] array) {
        String min = array[0];
        String max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < min.length()) {
                min = array[i];
            }
            if (array[i].length() > max.length()) {
                max = array[i];
            }
        }
        String[] array2 = new String[] {min, max};
        return array2;
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i == array.length - 1 ? "]\n" : ", "));
        }
    }
}
