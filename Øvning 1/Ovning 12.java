import static javax.swing.JOptionPane.*;

class KLokkeTilSekund{
public static void main(String[] args) {

  String sekunderLest = showInputDialog("Skriv in sekunder: ");
  double sekunder = Double.parseDouble(sekunderLest);
  String minuterLest = showInputDialog("Skriv in minuter: ");
  double minuter = Double.parseDouble(minuterLest);
  String timerLest = showInputDialog("Skriv in timer: ");
  double timer = Double.parseDouble(timerLest);

   String tekst = "det blir " + (sekunder + minuter*60 + timer*3600) + " sekunder.";
   showMessageDialog(null,tekst);
}
}
