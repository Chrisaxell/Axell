package sample;

public class Student {
    private String navn;
    private int AntOppg;

    public Student (String navn, int AntOppg) {
        this.navn = navn;
        this.AntOppg = AntOppg;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return AntOppg;
    }

    public void okAntOppg(int okning) {
        AntOppg = okning + AntOppg;
    }

    public String toString(){
        return "Navn: " + getNavn() + ", Antall oppgaver: " + getAntOppg() + ".";
    }
}
