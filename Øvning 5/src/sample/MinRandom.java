package sample;
import java.util.Random;

public class MinRandom{
    Random randomGen = new Random();

    public int nesteHeltall(int nedre, int ovre) { //intervallet [nedre, ovre]
        return randomGen.nextInt(ovre - nedre + 1) + nedre;
    }
    public double nesteDesimaltall(double nedre, double ovre) { //intervallet <nedre, ovre>
        return randomGen.nextDouble() * (ovre-nedre) + nedre;
    }
}
