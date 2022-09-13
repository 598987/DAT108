import javax.swing.*;

public class Melding implements Runnable{

    private Traad traad;

    public Melding(Traad traad){
        this.traad = traad;
    }


    @Override
    public void run() {

        String input = traad.getMelding();

        while(!input.equals("quit")){

            input = JOptionPane.showInputDialog("Skriv inn din melding, quit få å slutte");
            traad.setMelding(input);
        }
    }
}