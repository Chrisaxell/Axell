package sample;

public class ArbTaker {
    final String personalia;
    final int arbtakernr;
    final int ansettelsesaar;
    final double maanedslonn;
    final double skatteprosent;

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getAnsettelsesaar() {
        return ansettelsesaar;
    }

    public double getMaanedslonn() {
        return maanedslonn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    public String getPersonalia;

    public void setSkatteprosent(double skatt) {
        skatteprosent = skatt;
    }

    public void setMaanedslonn(double lonn) {
        maanedslonn = lonn;

    }

    public double skatteTrekk() {
        return getMaanedslonn()*getSkatteprosent();
    }

    public double bruttoLonn() {
        return getMaanedslonn()-skatteTrekk()*12;
    }

    public double skatteTrekkAar() {
        return skatteTrekk()*10.5;
    }

    public String navnPaaFormen() {
        return getEtternavn()+getFornavnn();
        getEtternavn()
    }

}
