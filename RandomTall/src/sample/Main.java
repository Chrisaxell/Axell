package sample;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomGen = new Random();
        Random randomGen2 = new Random();

        randomGen.setSeed(12345);
        randomGen2.setSeed(12345);

        System.out.println(randomGen.nextInt(20));
        System.out.println(randomGen2.nextInt(20));

        System.out.println(randomGen.nextInt(247582349));
        System.out.println(randomGen2.nextInt(247582349));

    }
}
