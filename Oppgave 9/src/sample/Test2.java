package sample;
import static javax.swing.JOptionPane.*;

class ArbeiderBGS {
    private final String[] ALTERNATIVER = {"Informasjon om arbeider", "endre Manedslonn", "endre skattefradrag", "har denne personen jobbet her lengre enn ... ", "Avslutt"};
    private final int INFO = 0;
    private final int ENDR_MND_LNN = 1;
    private final int ENDR_SKT = 2;
    private final int ANT_AAR_BEDR = 3;
    private final int AVSLUTT_OPPG = 4;


    private ArbTaker arbeider1;
    public ArbeiderBGS(ArbTaker arbeider1){
        this.arbeider1 = arbeider1;
    }

    public int lesValg(){
        int valg = showOptionDialog(null,"Gjor et valg", "Ansatt1", DEFAULT_OPTION, PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
        if(valg == AVSLUTT_OPPG){
            valg= -1;
        }
        return valg;
    }


    public void utforValgtOppgave(int valg){
        switch(valg){
            case INFO:
                informasjonen();
                break;
            case ENDR_MND_LNN:
                endremaanedslonn();
                break;
            case ENDR_SKT:
                endreskatt();
                break;
            case ANT_AAR_BEDR:
                antallAarIBedriften();
                break;
            case AVSLUTT_OPPG:
                break;
            default:
                break;
        }
    }


    public void informasjonen(){
        showMessageDialog(null, "Navn:\t   " + arbeider1.navnPaaFormen() + "\nAlder:  \t" + arbeider1.alder() + "\nArbeidsnummer\t   " + arbeider1.getArbtakernr() + "\nAnsettelses ar\t   " + arbeider1.getAnsettelsesaar()
                + "\nBruttolonn:\t   " + arbeider1.bruttoLonn() + "\nskattetrekk Maned:\t   " + arbeider1.skatteTrekk() + "\nSkattetrekk Ar:" + arbeider1.skatteTrekkAar()  + "\nSkatt:\t   " + arbeider1.getSkatteprosent());
    }

    public void endremaanedslonn(){
        String maanedslonnLest = showInputDialog("Skriv inn den nye manedlonnen");
        double maanedslonns = Double.parseDouble(maanedslonnLest);
        arbeider1.setMaanedslonn(maanedslonns);
        showInputDialog(arbeider1.getMaanedslonn());
    }

    public void endreskatt(){
        String skattLest = showInputDialog("skriv hvilken du vil endre til: ");
        double nyskatt = Double.parseDouble(skattLest);
        arbeider1.setSkatteprosent(nyskatt);
        showInputDialog(arbeider1.getSkatteprosent());

    }
    public void antallAarIBedriften(){
        String antallAARLest = showInputDialog("Skriv inn antall ar: ");
        int aarlest = Integer.parseInt(antallAARLest);
        showMessageDialog(null, arbeider1.antallAarMerellerMindre(aarlest));
    }
}


public class Test2 {
    public static void main(String[] args) {
        Person Christian = new Person("Christian", "Axell", 1998);
        ArbTaker ChrisAxell = new ArbTaker(Christian, 898989, 2012, 82520, 20);

        ArbeiderBGS bgs = new ArbeiderBGS(ChrisAxell);

        int valg = bgs.lesValg();
        while (valg >= 0) {
            bgs.utforValgtOppgave(valg);
            valg = bgs.lesValg();
        }
    }
}
