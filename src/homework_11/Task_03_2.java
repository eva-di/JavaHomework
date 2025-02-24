package homework_11;

public class Task_03_2 {
    public static void main(String[] args) {
        /*
Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.

Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
         */
        int priceItemA = 1000;
        int priceItemB = 500;

        int totalAB = priceItemA + priceItemB;
        float discount = totalAB * 10 / 100;
        float totalWIthDiscount = totalAB - discount;

        System.out.println("Стоимость товаров A+B со скидкой: " + totalWIthDiscount + " евро.");
        System.out.println("Сумма скидки для этой покупки: " + discount + " евро.");
    }
}
