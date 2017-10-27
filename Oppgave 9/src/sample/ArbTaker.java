package sample;

import java.util.Calendar;

public class ArbTaker {
    private Person personalia;
    private int arbtakernr;
    private int ansettelsesaar;
    private double maanedslonn;
    private double skatteprosent;

    public ArbTaker (Person personalia, int arbtakernr, int ansettelsesaar, double maanedslonn, double skatteprosent){
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansettelsesaar = ansettelsesaar;
        this.maanedslonn = maanedslonn;
        this.skatteprosent = skatteprosent;
    }

    public int getArbtakernr() { return arbtakernr; }

    public int getAnsettelsesaar() { return ansettelsesaar; }

    public double getMaanedslonn() { return maanedslonn; }

    public double getSkatteprosent() { return skatteprosent; }

    public String getPersonalia() { return personalia.fornavn + " " + personalia.etternavn + ", " + personalia.fodselsaar; }

    public void setSkatteprosent(double skatt) { skatteprosent = skatt; }

    public void setMaanedslonn(double lonn) { maanedslonn = lonn; }

    public double skatteTrekk() { return getMaanedslonn()*getSkatteprosent()/100; }

    public double bruttoLonn() { return getMaanedslonn()*12; }

    public double skatteTrekkAar() { return skatteTrekk()*10.5; }

    public String navnPaaFormen() { return personalia.getEtternavn() + " " + personalia.getFornavn(); }

    public int alder() {
        return new java.util.GregorianCalendar().get(Calendar.YEAR) - personalia.getFodselsaar();
    }

    public int antallAarBedr() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        return kalender.get(Calendar.YEAR) - ansettelsesaar;
    }

    public String antallAarMerellerMindre(int aar) {
        if (antallAarBedr()==aar) {
            return "Han har vert ansatt i eksakt " + aar + "aar!";
        }else if(antallAarBedr()<aar){
            return "Han har vert ansatt i mindre en " + aar + "arr!";
        } else{
            return "Han har vert ansatt i mer en " + aar + "aar!";
        }
    }
}