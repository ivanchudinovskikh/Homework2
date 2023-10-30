package Credit;

public class Ipoteka {
    public static void main(String[] args) {
        final int KVARTIRA_PRICE = 2300000;
        final double FIRST_CHECK = 0.15;
        final double SUM_OF_FIRST_CHECK = KVARTIRA_PRICE * FIRST_CHECK;

        System.out.println("Стоимость квартиры = " + KVARTIRA_PRICE);
        System.out.println("Первоначальный взнос = " + FIRST_CHECK * 100 + "%");
        System.out.println("Сумма первоначального взноса составляет = " + SUM_OF_FIRST_CHECK);
    }
}
