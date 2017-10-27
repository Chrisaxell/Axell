package sample;

public class Oppgave3 {
    public static void main(String[] arg) {
        MinRandom nigg = new MinRandom();
        System.out.println(nigg.nesteDesimaltall(2,3.3));
        for(int i=0; i<20; i++) {
            System.out.println(nigg.nesteHeltall(5, 10));
        }
    }
}
