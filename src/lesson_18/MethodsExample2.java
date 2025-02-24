package lesson_18;

public class MethodsExample2 {
    public static void main(String[] args) {

        int temp = 55;
        changeMe(temp);

        System.out.println(temp); // 55

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(numbers);
        changeMe(numbers);
        printArray(numbers);

        int[] link2 = numbers;
        link2[2] = -100;
        System.out.print("numbers: ");
        printArray(numbers);
        System.out.print("link2: ");
        printArray(link2);

        // null - ничто - специальное значение, указывающее, что ссылка не ссылается на объект.
        // Отсутствие значения в переменной.
        numbers = null;

        // numbers[0] = 10; // ошибка возникает во врмя работы программы -
        // Нельзя взять нулевой элемент у ничего - error NPE
        // System.out.println(numbers.length); // NPE error - нельзя узнать длину null

        // printArray(null); // Error - NullPointerExemption (NPE)

        link2[9] = 0;
        printArray(link2);

        numbers = link2;
        printArray(numbers);

        numbers = new int[]{10, 20, 30};
        System.out.print("numbers: ");
        printArray(numbers);





    } // Methods area

 // методы писать СЮДА

    public static void changeMe(int[] array) {
        array[0] = 1000;
    }

    public static void changeMe(int x) {
        x = 100;
    }
    // Метод красиво выводящий все элементы массива ЦЕЛЫХ ЧИСЕЛ
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { // Перебираю все индексы
            System.out.print(array[i] + (i != array.length -1 ? ". " : "]\n"));

            }
        }


    } // End class
