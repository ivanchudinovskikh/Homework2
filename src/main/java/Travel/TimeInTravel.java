package Travel;

public class TimeInTravel {
    public static void main(String[] args) {
        final int distanceFromHomeToOffice = 12;
        final double taxiSpeed = 60;
        final double timeFromHome = distanceFromHomeToOffice / taxiSpeed;
        final double badTraffic = 5;
        final double avarageTimeToHome = timeFromHome * badTraffic;

        System.out.println("Расстояние от дома до офиса = " + distanceFromHomeToOffice + "(км)");
        System.out.println("Средняя скорость такси = " + taxiSpeed + "(км/ч)");
        System.out.println("Время за которое тестировщик добирается от дома до офиса = " + timeFromHome + "(ч)");
        System.out.println("Коэфициент замедления траснпорта вечером = " + badTraffic);
        System.out.println("Время за которое тестировщик добирается от офиса до дома вечером = " + avarageTimeToHome + "(ч)");
    }
}
