package sample;

import java.util.Arrays;

public class Oppgave2 {
    public static void main(String[] args) {
        Temperaturer Oktober = new Temperaturer("oktober");
        int[] b = Oktober.MiddelTempDag();
        int[] c = Oktober.MiddelTempTime(8);
        int d = Oktober.MiddelTempManed();
        int[] a = Oktober.AntalDognMiddelTemp();
        int[][] e = Oktober.getArray();
        System.out.println("-5, mellom -5 og 0, mellom 0 og 5, mellom 5 og 10 og over 10 er folgende" + Arrays.toString(a));
        System.out.println("Middel tempratur for dager = " + Arrays.toString(b));
        System.out.println("Middel temperatur for timer i dagene, kl 8 er = " + Arrays.toString(c));
        System.out.println("Middel Temperaturen for hele måneden er = " + d);
        for(int i=0; i!=31; i++) {
            System.out.println(Arrays.toString(e[i]));
        }
    }
}
