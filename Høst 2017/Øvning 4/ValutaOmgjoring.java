import static javax.swing.JOptionPane.*;

class Valuta {
  private final double verdi;


  public Valuta(double verdi){
    this.verdi = verdi;
  }


  public double getVerdi(){
    return verdi;
  }

  public double omgjorNok(double belop) {
      return belop/verdi;
  }

  public double omgjorValuta(double belop) {
        return verdi*belop;
    }
}



class ValutaOmgjoring {
    public static void main(String[] args){
        Valuta dollar = new Valuta(7.82631834);
        Valuta euro = new Valuta(9.34830247);
        Valuta svenske_Kroner = new Valuta(0.98512);
        double belopFinal = 0;
        int nigg = 0;
        double belop = 0;
        String belopLest = "hester";

        while(nigg == 0) {
            String operatorLest = showInputDialog("Hva vil du omgjore fra?\n1: Dollar\n2: Euro\n3: Svenske Kroner\n4: Avslutt");
            int operator2 = Integer.parseInt(operatorLest);

            if (operator2 >= 1 && operator2 <= 3  ) {
                belopLest = showInputDialog("Hva er belopet du vil omgjore?");
            }
            char operator = operatorLest.charAt(0);
            double belopR = Double.parseDouble(belopLest);

            switch (operator) {
                case '1':
                    belop = dollar.omgjorValuta(belopR);
                    System.out.println(belopLest + " Dollar er " + belop + "Kroner.");
                    break;
                case '2':
                    belop = euro.omgjorValuta(belopR);
                    System.out.println(belopLest + " Euro er " + belop + "Kroner.");
                    break;
                case '3':
                    belop = svenske_Kroner.omgjorValuta(belopR);
                    System.out.println(belopLest + " Svenske kroner er " + belop + "Kroner.");
                    break;
                case '4':
                    nigg = nigg + 1;
                    System.out.println("Finale belopet ditt er " + belopFinal + "nok.");
                    break;
                default:
                    System.out.println("Skriv inn noe gylding (1-4).");
                    break;
            }
            belopFinal = belopFinal + belop;
        }


    }
}
