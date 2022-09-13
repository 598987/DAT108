import java.util.Random;

public class Kokk extends Thread{

    private String navn;
    private HamburgerBrett hamburgerbrett;
    private Random random = new Random();

    public Kokk(HamburgerBrett hamburgerbrett, String navn){

        this.navn = navn;
        this.hamburgerbrett = hamburgerbrett;
    }

    public void run() {

        Thread.currentThread().setName(navn);
        while(true){

            try {

                Thread.sleep(random.nextInt(4000) + 2000);
                hamburgerbrett.leggTil(new Hamburger());

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return navn + " (kokk) ";
    }
}