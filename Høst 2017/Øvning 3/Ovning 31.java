
import static javax.swing.JOptionPane.*;

class Gangetabell {
  public static void main(String[] args) {

    String forsteTallLest = showInputDialog("Forste tall i gangetabell? ");
    String andreTallLest = showInputDialog("Siste tall i gangetabellen? (skriv samme for et tabel) ");
    int forsteTall = Integer.parseInt(forsteTallLest);
    int andreTall = Integer.parseInt (andreTallLest);
    String gangeTallLest = showInputDialog("Skriv gange tallet: ");
    int gangeTall = Integer.parseInt (gangeTallLest);

    if (forsteTall>andreTall) {
      String utskrift0 = "Venligst skriv det minste tallet først";
      showMessageDialog(null, utskrift0);
    }

    else {

        for (forsteTall <= andreTall) {
          System.out.println("");
          System.out.println(forsteTall + " gangen.");
          int ganger = 1;
          for (ganger <= gangeTall){
            System.out.println(forsteTall + " x " + ganger + " = " + forsteTall*ganger);
            ganger = ganger + 1;
          }
          forsteTall = forsteTall + 1;
        }
    }




  }
}
