package Workers;

public class ProjectWorkers {
    public static void main(String[] args) {
        final int numberOfProgrammers = 5;
        final int numberOfTesters = 3;
        final int numberOfSupports = 10;
        final int numberOfAllTesters = numberOfProgrammers * numberOfTesters;
        final int numberOfAllSupports = numberOfProgrammers * numberOfSupports;
        final int numberOfAllSpecialists = numberOfProgrammers + numberOfAllSupports + numberOfAllTesters;

        System.out.println("Количество программистов на проекте = " + numberOfProgrammers);
        System.out.println("Количество тестировщиков на одного программиста = " + numberOfTesters);
        System.out.println("Количество специалистов поддержки на одного программиста = " + numberOfSupports);
        System.out.println("Количество тестировщиков на проекте = " + numberOfAllTesters);
        System.out.println("Количество специалистов поддержки на проекте = " + numberOfAllSupports);
        System.out.println("Количество технических специалистов на проекте = " + numberOfAllSpecialists);
    }
}
