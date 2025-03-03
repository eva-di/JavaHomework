package lesson_25;

    // В java  константа переменная, изменить которую не может НИ ОДИН объект класса
    // Такая переменная инициализируется один раз для всех экземпляров класса
    // В java константой считается НЕ та переменная, которую нельзя изменить в рамках одного объекта
/*
static - делает переменную единственной для всех экземпляров класса (единое значение)
final - делает ее неизменяемой


 */
public class ConstantDemo {

    public static final double PI = 3.141519;
    // константа пишется большими буквами
        public static final int[] ints = new int[5];
        // ints не является константой так как состояние объекта
        // (значения в массиве) можно изменить
        public static final String MY_COUNTRY = "Germany"; // константа, т к невозможно изменить значение строки
        // (состояние объекта)
        public static final String[] COLOURS = {"blue", "red", "green"}; // не константа, так как значение
        // в массиве можно изменить

        public ConstantDemo() {
            COLOURS[0] = "purple";
            // COUNTRY = "USA"; //  изменить строку не могу
            String newString = MY_COUNTRY.toUpperCase();  // будет создан новый объект
        }



    public static double doublePiSqrt() {
        double result = 2 * PI * PI;
        return result;
    }
}
