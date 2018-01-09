import static javax.swing.JOptionPane.*;

class Primtall{
  public static void main(String[] args) {
    while(true){

      String tallLest = showInputDialog("Hvilket tall tror du er et primtall? ");
      int tall = Integer.parseInt(tallLest);

      if(tall<0) {
        System.out.println("Skriv inn et posetivt tall!");
      }
      else{
        if (tall==0) {
          System.out.println("0 kan ikke deles på seg selv, og er bare representert i seg selv. Av den grunn er ikke null et primtall.");
        }
        else {
          if (tall==1) {
            System.out.println("Av logiske grunner regnes ikke 1 som et primtall, siden det primtall må alltid ha 2 faktorer. Den ene seg selv og den andre 1, men i tilfelle med 1 så har den bare 1 faktor.");
          }
          else{
            int deler = 2;
            while (tall%deler!=0) {
              deler++;
            }
            if (tall==deler) {
              System.out.println("Ja! " + tall +" er et primtall!");

            }
            else {
              System.out.println("Nei, " + tall + " er ikke et primtall.");
            }
          }
        }
      }



    }
  }
}
