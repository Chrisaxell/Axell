package sample;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Oppgaveoversikt mons = new Oppgaveoversikt();
        mons.regNyStud("Christian Axell",0);
        mons.regNyStud("Arne Norheim", 100);
       mons.regNyStud("Nisse von Nisseheim", 2);

        System.out.println(mons.getAntStud());
       //System.out.println(mons.antOppLost("Nisse von Nisseheim"));
        mons.okAntOppg("Christian Axell", 2);
        //System.out.println(mons.antOppLost("Christian axell"));
        mons.okAntOppg("Arne Norheim", 3);
        mons.okAntOppg("Christian Axell", 1);
        System.out.println(mons.toStringElev("Christian Axell"));
        System.out.println(mons.toStringArray().toString());

    }
}
