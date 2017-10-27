package sample;

public class Test {
    public static void main(String[] args){
        Person Christian = new Person("Christian", "Axell", 1998);
        ArbTaker ChrisAxell = new ArbTaker(Christian, 898989, 2012, 82520, 20);

        System.out.println(ChrisAxell.getPersonalia());
        System.out.println(ChrisAxell.getArbtakernr());
        System.out.println(ChrisAxell.getAnsettelsesaar());
        System.out.println(ChrisAxell.getMaanedslonn());
        System.out.println(ChrisAxell.getSkatteprosent());

        System.out.println(ChrisAxell.skatteTrekk());
        System.out.println(ChrisAxell.bruttoLonn());
        System.out.println(ChrisAxell.skatteTrekk());
        System.out.println(ChrisAxell.navnPaaFormen());
        System.out.println(ChrisAxell.alder());
        System.out.println(ChrisAxell.antallAarBedr());
        System.out.println(ChrisAxell.antallAarMerellerMindre(2));
    }
}
