
import java.io.*;
import java.util.*;

class InchesToCms{
  public static void main (String[] args)throws Exception{
  //1 tommel = 2.54 centimeter;
  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Hvor mange tommel vil du konvertere? ");
  float inches = Float.parseFloat(bf.readLine());
  float cm = inches * 2.54f;
  System.out.println(inches + " tommel er " + cm + " centimeter.");
  }
}
