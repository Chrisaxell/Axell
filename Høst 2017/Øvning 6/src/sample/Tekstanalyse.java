package sample;

public class Tekstanalyse {
    public String tekst;
    public int[] antallTegn = new int[30];

   public Tekstanalyse(String tekst){ // GREI
        this.tekst = tekst;
        this.antallTegn = analyse(tekst);
   }

   public int[] analyse(String nisse) { //GREI
       for (int i = 0; i < nisse.length(); i++) {
           int uni = (int) nisse.charAt(i);
           if (uni >= 65 && uni <= 90) {
               antallTegn[uni - 65]++;
           }
           else if (uni >= 97 && uni <= 122) {
               antallTegn[uni - 97]++;
           }
           else if (uni == 229 || uni == 197) {
               antallTegn[28]++;
           }
           else if (uni == 248 || uni == 216) {
               antallTegn[27]++;
           }
           else if (uni == 230 || uni == 198) {
               antallTegn[26]++;
           }
           else {
               antallTegn[29]++;
           }
       }
       return antallTegn;
   }


    public int finnForskjelligeBokstaver(){
       int antallForskjelligeBokstaver = 0;
       for(int i=0; i!=29; i++) {
          if(antallTegn[i]!=0) {
              antallForskjelligeBokstaver++;
          }
       }
       return antallForskjelligeBokstaver;
    }

    public int finnAntallForekomsterAvTotaltAntallBokstaver() { //GREI
        int dude = tekst.length() - antallTegn[29];
        return dude;
    }

    public int prosentAntallAvBokstaverSomikkeErBokstaver() { //GREI
        return antallTegn[29]*100/tekst.length();
    }

    public int finnAntallForekomsterAvEtBestemtBokstav(char knut) { //GREI
        int uni = (int) knut;
        if(uni>65&&uni<90) {
            return antallTegn[uni-65];
        }
        if (uni>97 && uni<122) {
           return antallTegn[uni - 97];
        }
        if(uni==229 || uni==197){
           return antallTegn[28];
        }
        if(uni==248 || uni==216){
           return antallTegn[27];
        }
        if(uni==230 || uni==198){
           return antallTegn[26];
        }
        else {
           return antallTegn[29];
        }

    }

    public void skaffeDenStorsteVerdieniTeksten(){
        int storVerdi = antallTegn[0];
        for(int i=1;i < 29;i++){
            if(antallTegn[i] > storVerdi){
                storVerdi = antallTegn[i];
            }
        }
        for(int i=0;i<26;i++) {
            char uni = (char)(i+65);
            if (storVerdi == antallTegn[i]){
                System.out.print(uni + " ");
            }
        }
        if (storVerdi == antallTegn[26]){
            System.out.print("Æ ");
        }
        if (storVerdi == antallTegn[27]){
            System.out.print("Ø ");
        }
        if (storVerdi == antallTegn[28]){
            System.out.print("Å ");
        }
        System.out.println("Har blitt brukt mest.");

    }
}
