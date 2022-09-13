public class Main {

    public static void main(String[] args) {

        final String[] kokker = {"Anne", "Erik", "Knut"};
        final String[] servitorer = {"Mia", "Per"};
        final int KAPASITET = 4;

        skrivUtHeader(kokker, servitorer, KAPASITET);

        HamburgerBrett hamburgerbrett = new HamburgerBrett(KAPASITET);

        for (String navn : kokker) {
            new Kokk(hamburgerbrett, navn).start();
        }

        for (String navn : servitorer) {
            new Servitor(hamburgerbrett, navn).start();
        }
    }

    public static void skrivUtHeader(String[] kokker, String[] servitorer, int KAPASITET){

        System.out.println("I denne simuleringen har vi");

        System.out.print("3 kokker [");
        for (String k : kokker) {
            System.out.print(k + ", ");
        }
        System.out.println("]");

        System.out.print("2 servitorer [");
        for (String s : servitorer) {
            System.out.print(s + ", ");
        }
        System.out.println("]");

        System.out.println("Kapasiteten til hamburgerbrettet er " + KAPASITET + " hamburgere.");

        System.out.println("Vi starter..." + "\n");
    }
}