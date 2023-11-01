package Credit;

public class Mortgage {
    public static void main(String[] args) {
        final int apartmentPrice = 2300000;
        final double firstCheck = 0.15;
        final double sumOfFirstCheck = apartmentPrice * firstCheck;

        System.out.println("Стоимость квартиры = " + apartmentPrice);
        System.out.println("Первоначальный взнос = " + firstCheck * 100 + "%");
        System.out.println("Сумма первоначального взноса составляет = " + sumOfFirstCheck);
    }
}
