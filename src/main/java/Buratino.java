public class Buratino {
    public static void main(String[] args) {
        final int ALL_APPLS = 200;
        final int STOLEN = 130;        // украдено яблок
        final int REMIND = ALL_APPLS - STOLEN;   // остаток яблок

        System.out.println("Яблок у Буратино = " + ALL_APPLS);
        System.out.println("Яблок украл Карабас Барабас = " + STOLEN);
        System.out.println("Яблок осталось у Буратино = " + REMIND);
    }
}