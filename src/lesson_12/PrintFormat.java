package lesson_12;

public class PrintFormat {

    public static void main(String[] args) {

        double result = 20.0 / 7;
        int age = 25;
        String name = "Alice";

        System.out.println("Name: " + name + ", Age: " + age + ", Score: " + result); // потом делается авто enter
        // "Шаблон {varName} строки" Python

        // printf() - форматированный вывод

        System.out.printf("Name: %s, Age: %d, Score: %.2f\n\n\n", name, 18, result); // курсор остается на этой строке
        System.out.println("World");
        System.out.println("Second line");

        /*
        Место, куда я хочу вставить значение переменной всегда помечается значком %
        После % я должен указать тип данных
        %d - целое число (digit)
        %f - число с плавающей точкой (float) - по умолчанию выдает 6 знаков после запятой
        %.3f - указать количество знаков после запятой
        %s - текст (string) - строка
        \n - Работает в любой строке - добавляет перевод каретки на новую строку
        %n - символ новой строки (работает только в printf)
         */

        // sout - println
        // souf - printf


    }
}
