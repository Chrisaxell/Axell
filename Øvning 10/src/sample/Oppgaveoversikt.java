package sample;

public class Oppgaveoversikt {
    private int antStud = 0;
    private Student[] studenter = new Student[256];

    public Oppgaveoversikt() {}

    public int getAntStud() { return antStud; }

    private int finnNavn(String navn) {
        int i = 0;
        while(studenter[i].getNavn()!=navn) {
            i++;
        } return i;
    }

    public int antOppLost(String navn) { return studenter[finnNavn(navn)].getAntOppg(); }


    public void regNyStud(String navn, int antOppg) {
        Student arne = new Student(navn, antOppg);
        studenter[antStud]=arne;
        antStud++;
    }

    public void okAntOppg(String navn, int ant) { studenter[finnNavn(navn)].okAntOppg(ant); }

    public String[] toStringArray() {
        int i=0;
        String[] hei=new String[antStud];
        while(i!=antStud) {
            hei[i] = studenter[i].toString();
            i++;
        }
        return hei;
    }

    public String toStringElev(String student) { return studenter[finnNavn(student)].toString() + " hei"; }
}
