package sample;

/* Spør om (parameter til metoden) og hvordan gjøre det uten return og bare at det ligger i this.*/

public class Oppgave2 {
    public static void main(String[] args)
    {
        Brok a = new Brok(1,2);
        Brok b = new Brok (1,4);
        System.out.println(a.toString());
        System.out.println(b.toString());

        Brok c = a.add(b);
        System.out.println(c.toString());

        c = a.sub(b);
        System.out.println(c.toString());

        c = a.div(b);
        System.out.println(c.toString());

        c = a.mult(b);
        System.out.println(c.toString());
    }
}
