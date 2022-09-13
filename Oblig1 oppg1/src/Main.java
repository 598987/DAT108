public class Main{

    public static void main(String[] args) throws InterruptedException {

        Traad traad = new Traad();
        Melding melding = new Melding(traad);

        new Thread(melding).start();
        new Thread(traad).start();
    }
}