package Galaxy;

public class Age {
    public static void main(String[] args) {
        final long galaxyAge = 13000000000L;
        final int homosapiensAge = 100000;
        final long galaxyOlderThanHomo = galaxyAge / homosapiensAge;

        System.out.println("Возраст вселенной = " + galaxyAge + "лет");
        System.out.println("Возраст человека как вида = " + homosapiensAge + "лет");
        System.out.println("Во сколько раз Вселенная старше Человека = " + galaxyOlderThanHomo + "лет");
    }
}
