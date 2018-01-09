package sample;
import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave3 {
    public static void main(String[] args){
        while(true){
            String dude = showInputDialog("Lim inn tekst du vil analysere");
            Tekstanalyse nisse = new Tekstanalyse(dude);
            System.out.println(nisse.finnForskjelligeBokstaver());
            System.out.println(nisse.finnAntallForekomsterAvTotaltAntallBokstaver());
            System.out.println(nisse.prosentAntallAvBokstaverSomikkeErBokstaver()+"%");
            System.out.println(nisse.finnAntallForekomsterAvEtBestemtBokstav('t'));
            nisse.skaffeDenStorsteVerdieniTeksten();


        }
    }
}
