package Sale;

public class TShirt {
    public static void main(String[] args) {
        final int price = 1000; //Цена одной рубашки без скидки
        final int selected = 10; //Количество выбранных рубашек
        final int untilDiscount = 2; //Количество рубашек которые нужно купить для получения скидки
        final int toAdd = untilDiscount - selected; //Осталось купить рубашек для получения скидки
        final int selectedPrice = price * selected; //Сумма выбраных рубашек
        final int toAddPrice = toAdd * price; //Осталось потратить до получения скидки

        final double discount = 0.25; //Процент скидки
        final double allPriceWithDiscount = selectedPrice - (selectedPrice * discount); //Сумма со скидкой
        final double priceWithDiscount = price - (price * discount); //Цена одной рубашки с применением скидки
        final double savedMoney = selectedPrice * discount; //Сэкономленно денег благодоря скидке
        final double freeTShirts = savedMoney / price; //Считай что куплено бесплатно рубашек

        System.out.println("Цена одной рубашки без скидки = " + price);
        System.out.println("Количество выбранных рубашек = " + selected);
        System.out.println("Количество рубашек которые нужно купить для получения скидки = " + untilDiscount);
        System.out.println("Осталось купить рубашек для получения скидки = " + toAdd);
        System.out.println("Сумма выбраных рубашек = " + selectedPrice);
        System.out.println("Осталось потратить до получения скидки = " + toAddPrice);
        System.out.println("Процент скидки = " + discount * 100 + "%");
        System.out.println("Сумма со скидкой = " + allPriceWithDiscount);
        System.out.println("Цена одной рубашки с применением скидки = " + priceWithDiscount);
        System.out.println("Сэкономленно денег благодоря скидке = " + savedMoney);
        System.out.println("Считай что куплено бесплатно рубашек = " + freeTShirts);
    }
}
