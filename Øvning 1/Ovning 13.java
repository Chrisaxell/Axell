import static javax.swing.JOptionPane.*;

class SekunderTilKlokke{
public static void main(String[] args) {

String sekunderLest = showInputDialog("Antall sekunder de vil konvertere (sek)");
int sekunder = Integer.parseInt(sekunderLest);


System.out.print(sekunder);
System.out.print("sekunder er: ");
System.out.print((sekunder/3600));
System.out.print("timer ");
System.out.print(((sekunder%3600)/60));
System.out.print("Minuter ");
System.out.print(((sekunder%3600)%60));
System.out.print("Sekunder.");
System.out.print(" Shinzou wo sasageyo ");



}
}
