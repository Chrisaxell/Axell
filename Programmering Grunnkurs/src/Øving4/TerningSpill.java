package Øving4;

class Spiller {
    private final String spillerNavn;
    private int sumPoeng;
    private java.util.Random randomGen = new java.util.Random();
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
        Spiller a = new Spiller("A", 0);
        Spiller b = new Spiller("B", 0);

        while(a.getSumPoeng() <= 100 && b.getSumPoeng() <= 100) {
            a.kastTerningen();
            a.erFerdig();
            if(true) {
                b.kastTerningen();
                b.erFerdig();
            }
        }
    }
}