import static javax.swing.JOptionPane.*;

class Billigkjott{
public static void main(String[] args){

  String kraLest = showInputDialog("Hvor mange kr er merke a? ");
    double kra = Double.parseDouble(kraLest);

  String gramaLest = showInputDialog("Hvor mange gram er merke a? ");
    double grama = Double.parseDouble(gramaLest);

  String krbLest = showInputDialog("Hvor mange kr er merke b? ");
    double krb = Double.parseDouble(krbLest);

  String grambLest = showInputDialog("Hvor mange gram er merkeb? ");
    double gramb = Double.parseDouble(grambLest);


if(kra/grama==krb/gramb){
System.out.print("De koster like mye!");
}
else{
if(kra/grama<krb/gramb){
System.out.print("Merke a er billigst!");

}
else{
System.out.print("Merke b er billigst!");
}
}

}
}
