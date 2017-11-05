
import java.io.*;
import javax.swing.JOptionPane;

public class MinHata {
    public static void main(String[] args) throws IOException {
        String filnavnI = "MinDataI.txt";
        String filnavnO = "MinDataO.txt";

        int sum = 0;
        FileReader leseforbTilFil = new FileReader(filnavnI);
        BufferedReader leser = new BufferedReader(leseforbTilFil);

        FileWriter skriveforbTilFil = new FileWriter(filnavnO, true);
        BufferedWriter autist = new BufferedWriter(skriveforbTilFil);
        PrintWriter skriver = new PrintWriter(autist);

        String etNavn = leser.readLine();

        while(etNavn != null){
            etNavn.toUpperCase();
            sum++;
            skriver.println(etNavn);
            etNavn = leser.readLine();

        }
        leser.close();
        skriver.close();
        System.out.print(sum + " linjer konvertert.");

    }
}

