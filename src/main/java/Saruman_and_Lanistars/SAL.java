package Saruman_and_Lanistars;

public class SAL {
    public static void main(String[] args) {
        final int NUM_L_P = 2500;   // количество пехотинцев
        final int NUM_S_O = 4000;   // колчисетво орков
        final int ARMY = NUM_L_P + NUM_S_O;

        System.out.println("Количество пехотинцев у Ланистеров = " + NUM_L_P);
        System.out.println("Количество орков Сарумана = " + NUM_S_O);
        System.out.println("Объединенная армия Ланистера и Сарумана = " + ARMY);
    }
}