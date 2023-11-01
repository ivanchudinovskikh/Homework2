public class Buratino {
    public static void main(String[] args) {
        final int allAppls = 200;
        final int stolen = 130;        // украдено яблок
        final int remind = allAppls - stolen;   // остаток яблок

        System.out.println("Яблок у Буратино = " + allAppls);
        System.out.println("Яблок украл Карабас Барабас = " + stolen);
        System.out.println("Яблок осталось у Буратино = " + remind);
    }
}