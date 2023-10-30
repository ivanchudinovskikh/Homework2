package Cup;

public class HalfCup {
    public static void main(String[] args) {
        final int VOLUME = 500;
        final double WATER_IN_CUP = 0.25;
        final double VOLUME_OF_WATER_IN_CUP = VOLUME * WATER_IN_CUP;

        System.out.println("Объем стакана = " + VOLUME + "(мл)");
        System.out.println("На сколько заполнен стакан = " + WATER_IN_CUP * 100 + "%"); // умножил на 100 для красоты вывода
        System.out.println("Количество воды в стакане = " + VOLUME_OF_WATER_IN_CUP + "(мл)");
    }
}
