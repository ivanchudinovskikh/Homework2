package Galaxy;

public class Age {
    public static void main(String[] args) {
        final double GALAXY_AGE = 13000000000D;
        final int HOMOSAPIENS_AGE = 100000;
        final double GALAXY_OLDER_THAN_HOMO = GALAXY_AGE / HOMOSAPIENS_AGE;

        System.out.println("Возраст вселенной = " + GALAXY_AGE + "лет");
        System.out.println("Возраст человека как вида = " + HOMOSAPIENS_AGE + "лет");
        System.out.println("Во сколько раз Вселенная старше Человека = " + GALAXY_OLDER_THAN_HOMO + "лет");
    }
}
