import java.util.Scanner;
class main {
  public static void main(String []args){
  Scanner in = new Scanner (System.in);
  double c = in.nextDouble();
  Double f = c*9.0/5+32;
  System.out.println(""+f+"   Fahrenheit");
  double ca = in.nextDouble();
  double fa = ca*9.0/5+32;
  System.out.println(""+fa+" Fahrenheit");
  }
}
