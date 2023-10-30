package Travel;

public class TimeInTravel {
    public static void main(String[] args) {
        final int DISTANCE_FROM_HOME_TO_OFFICE = 12;
        final double TAX_SPEED = 60;
        final double TIME_FROM_HOME = DISTANCE_FROM_HOME_TO_OFFICE / TAX_SPEED;
        final double BAD_TRAFFIC = 5;
        final double AVERAGE_TIME_TO_HOME = TIME_FROM_HOME * BAD_TRAFFIC;

        System.out.println("Расстояние от дома до офиса = " + DISTANCE_FROM_HOME_TO_OFFICE + "(км)");
        System.out.println("Средняя скорость такси = " + TAX_SPEED + "(км/ч)");
        System.out.println("Время за которое тестировщик добирается от дома до офиса = " + TIME_FROM_HOME + "(ч)");
        System.out.println("Коэфициент замедления траснпорта вечером = " + BAD_TRAFFIC);
        System.out.println("Время за которое тестировщик добирается от офиса до дома вечером = " + AVERAGE_TIME_TO_HOME + "(ч)");
    }
}
