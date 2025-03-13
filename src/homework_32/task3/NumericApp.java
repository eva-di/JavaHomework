package homework_32.task3;

public class NumericApp {
    public static void main(String[] args) {

        NumericPair<Integer, Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum()); // Вывод: 30.0

        NumericPair<Double, Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0


        NumericPair<Double, Double> doublePair2 = new NumericPair<>(Double.valueOf(5), 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0

        Byte btVal = 10;
        NumericPair<Number, Byte> bytePair = new NumericPair<>(btVal, btVal);



    }
}
