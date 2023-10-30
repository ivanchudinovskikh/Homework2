package Sale;

public class TShirt {
    public static void main(String[] args) {
        final int T_SHIRT_PRICE = 1000;
        final int T_SHIRT_SELECTED = 10;
        final int T_SHIRT_NUM_FOR_SALE = 2;
        final int T_SHIRT_FOR_ADD = T_SHIRT_NUM_FOR_SALE - T_SHIRT_SELECTED;
        final int T_SHIRT_SELECTED_PRICE = T_SHIRT_PRICE * T_SHIRT_SELECTED;
        final int T_SHIRT_TO_ADD_PRICE = T_SHIRT_FOR_ADD * T_SHIRT_PRICE;
        final double T_SHIRT_SALE = 0.25;
        final double T_SHIRT_ALL_PRICE_SALE = T_SHIRT_SELECTED_PRICE - (T_SHIRT_SELECTED_PRICE * T_SHIRT_SALE);
        final double ONE_T_SHIRT_SALE_PRICE = T_SHIRT_PRICE - (T_SHIRT_PRICE * T_SHIRT_SALE);
        final double SAVED_MONEY;
        if (T_SHIRT_SELECTED >= T_SHIRT_NUM_FOR_SALE) {
            SAVED_MONEY = T_SHIRT_SELECTED_PRICE * T_SHIRT_SALE;
        } else SAVED_MONEY = 0;
        final double FREE_T_SHIRTS = SAVED_MONEY / T_SHIRT_PRICE;

        System.out.println("Цена одной рубашки без скидки = " + T_SHIRT_PRICE);
        System.out.println("Количество выбранных рубашек = " + T_SHIRT_SELECTED);
        System.out.println("Количество рубашек которые нужно купить для получения скидки = " + T_SHIRT_NUM_FOR_SALE);
        if (T_SHIRT_FOR_ADD < 0) {
            System.out.println("Осталось купить рубашек для получения скидки = 0");
        } else {
            System.out.println("Осталось купить рубашек для получения скидки = " + T_SHIRT_FOR_ADD);
        }
        System.out.println("Сумма выбраных рубашек = " + T_SHIRT_SELECTED_PRICE);
        if (T_SHIRT_TO_ADD_PRICE < 0) {
            System.out.println("Осталось потратить до получения скидки = 0");
        } else
            System.out.println("Осталось потратить до получения скидки = " + T_SHIRT_TO_ADD_PRICE);
        System.out.println("Процент скидки = " + T_SHIRT_SALE * 100 + "%");
        System.out.println("Сумма со скидкой = " + T_SHIRT_ALL_PRICE_SALE);
        System.out.println("Цена одной рубашки с применением скидки = " + ONE_T_SHIRT_SALE_PRICE);
        System.out.println("Сэкономленно денег благодоря скидке = " + SAVED_MONEY);
        System.out.println("Считай что куплено бесплатно рубашек = " + FREE_T_SHIRTS);
    }
}
