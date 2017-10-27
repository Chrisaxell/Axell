import javax.swing.JOptionPane.*;
import java.util.Random;

class Spiller {
    private final String spillerNavn;
    private int sumPoeng;
    java.util.Random randomGen = new java.util.Random();
    private int runde=0;

    public Spiller(String spillerNavn, int sumPoeng) {
        this.sumPoeng = sumPoeng;
        this.spillerNavn = spillerNavn;
    }

    public int getSumPoeng(){
        return sumPoeng;
    }

    public void kastTerningen() {
        runde++;
        System.out.println("runde " + runde);
        int terning = randomGen.nextInt(6);
        terning = terning + 1;
        System.out.println(spillerNavn + " kasta " + terning);
        if (terning == 1) {
            sumPoeng = 0;
        }

        else {
            sumPoeng = sumPoeng + terning;
        }
    }

    public void erFerdig() {
        if (sumPoeng >= 100) {
            System.out.println("Spiller " + spillerNavn + " vant!!!");
        }
        else {
            System.out.println("Spiller " + spillerNavn + " har " + sumPoeng + " sumPoeng!");
            System.out.println("Neste spiller.");
        }
    }
}

class TerningSpill {
    public static void main(String[] args) {
        System.out.println("startttTTT!!!");
        sumPoeng a = new sumPoeng("A", 0);
        sumPoeng b = new sumPoeng("B", 0);

        while(a.getSumPoeng() <= 100 && b.getSumPoeng() <= 100) {
            a.kastTerningen();
            a.erFerdig();
            if() {
                b.kastTerningen();
                b.erFerdig();
            }
        }
    }
}