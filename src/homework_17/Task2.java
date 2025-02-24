package homework_17;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 4, 3, 6, 7};

        printArray(array);
        printArrayBackwards(array);
        printArray(array, 2);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }

    }
    public static void printArrayBackwards(int[] array) {
        System.out.print("[");
        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i] + (i != 0 ? ", " : "]\n"));
        }
    }
    public static void printArray (int[] array, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + ". ");
        }
        for (int i = array.length - 1; i >= index ; i--) {
            System.out.print(array[i] + (i != index ? ", " : "]\n"));

        }
    }

}

