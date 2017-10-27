import static javax.swing.JOptionPane.*;

class Skuddaar{
public static void main(String[] args) {

  String aarstalLest = showInputDialog("Hvilket år vill du vite om er skuddår eller ikke? ");
  int aarstal = Integer.parseInt(aarstalLest);

  if ((aarstal%4==0) && (aarstal%100!=0)) {
    System.out.print("Ja," + aarstal + "er et skuddår");

  }
 else{
   if (aarstal%400==0) {
     System.out.print("Ja,");
     System.out.print(aarstal);
     System.out.print("er et skuddår!");

   }
  else{
    System.out.print("Nei,");
    System.out.print(aarstal);
    System.out.print("er ikke et skuddår!");
 }
}
}
}
