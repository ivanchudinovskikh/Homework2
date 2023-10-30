package Workers;

public class ProjectWorkers {
    public static void main(String[] args) {
        final int NUM_OF_PROGRAMMERS = 5;
        final int NUM_OF_TESTERS = 3;
        final int NUM_OF_SUPPORTS = 10;
        final int NUM_OF_ALL_TESTERS = NUM_OF_PROGRAMMERS * NUM_OF_TESTERS;
        final int NUM_OF_ALL_SUPPORTS = NUM_OF_PROGRAMMERS * NUM_OF_SUPPORTS;
        final int NUM_OF_ALL_SPEC = NUM_OF_PROGRAMMERS + NUM_OF_ALL_SUPPORTS + NUM_OF_ALL_TESTERS;

        System.out.println("Количество программистов на проекте = " + NUM_OF_PROGRAMMERS);
        System.out.println("Количество тестировщиков на одного программиста = " + NUM_OF_TESTERS);
        System.out.println("Количество специалистов поддержки на одного программиста = " + NUM_OF_SUPPORTS);
        System.out.println("Количество тестировщиков на проекте = " + NUM_OF_ALL_TESTERS);
        System.out.println("Количество специалистов поддержки на проекте = " + NUM_OF_ALL_SUPPORTS);
        System.out.println("Количество технических специалистов на проекте = " + NUM_OF_ALL_SPEC);
    }
}
