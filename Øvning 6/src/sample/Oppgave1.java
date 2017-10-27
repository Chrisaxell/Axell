package sample;
import java.util.Random;


public class Oppgave1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] antall = new int[10];
        for (int i = 0; i != 10000; i++) {
            int tall = random.nextInt(10);
            antall[tall]++;
        }
        for (int i = 0; i != 10; i++) {
            System.out.println("Det er " + antall[i] + " forekomster av " + (i+1) + ".");
        }
    }
}