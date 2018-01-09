package sample;

class Brok {
    private int teller;
    private int nevner;
    private Brok svar;
    private int tell;
    private int nevn;

    public Brok(int teller, int nevner) {
        this.teller = teller;
        this.nevner = nevner;
    }

    public Brok(int nevner) {
        this.teller = 1;
        this.nevner = nevner;
    }

    private int getTeller()
    {
        return teller;
    }
    private int getNevner()
    {
        return nevner;
    }

    //Addisjon
    Brok add(Brok x) {
        tell = x.getNevner() * teller + x.getTeller() * nevner;
        nevn = nevner * x.getNevner();
        svar = new Brok(tell, nevn);
        return svar;
    }

    //Subtraksjon
    Brok sub(Brok x) {
        tell = x.getNevner() * teller - x.getTeller() * nevner;
        nevn = nevner * x.getNevner();
        svar = new Brok(tell, nevn);
        return svar;
    }

    //Multiplikasjon
    Brok mult(Brok x) {
        nevn = x.getNevner()*nevner;
        tell = x.getTeller()*teller;
        svar = new Brok(tell, nevn);
        return svar;
    }

    //Dividasjon
    Brok div(Brok x) {
        nevn = nevner * x.getTeller();
        tell = teller * x.getNevner();
        svar = new Brok(tell, nevn);
        return svar;
    }

    //ToString
    public String toString() {
        return (Integer.toString(teller) + "/" +
                Integer.toString(nevner));
    }
}