package Cup;

public class HalfCup {
    public static void main(String[] args) {
        final int volume = 500;
        final double waterInCup = 0.25;
        final double volumeOfWaterInCup = volume * waterInCup;

        System.out.println("Объем стакана = " + volume + "(мл)");
        System.out.println("На сколько заполнен стакан = " + waterInCup * 100 + "%"); // умножил на 100 для красоты вывода
        System.out.println("Количество воды в стакане = " + volumeOfWaterInCup + "(мл)");
    }
}
