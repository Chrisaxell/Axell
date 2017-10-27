package sample;

public class Test1 {
    public static void main(String[] args) {
        Student Christian = new Student("Christian Axell", 0);
        System.out.println(Christian.getAntOppg());
        System.out.println(Christian.getNavn());
        Christian.okAntOppg(2);
        System.out.println(Christian.getAntOppg());
        System.out.println(Christian.toString());
    }
}
